package cn.ibizlab.checkin.runtime.plugin


import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.dataentity.ds.DEDataSetRuntimeBase
import net.ibizsys.central.util.ISearchContext
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import net.ibizsys.runtime.util.JsonUtils;
import org.springframework.data.domain.Page;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import org.springframework.data.domain.Pageable;

class ScheduleDEDataSetRuntime extends DEDataSetRuntimeBase {

    @Override
    protected Object onFetch(ISearchContext iSearchContext) throws Throwable {
        ISearchContextDTO iSearchContextDTO = (ISearchContextDTO) iSearchContext;
        // 获取employee实体
        IDataEntityRuntime employeeRuntime = this.getSystemRuntime().getDataEntityRuntime("employee");
        ISearchContextDTO employeeSearchContextDTO = employeeRuntime.createSearchContext();
        employeeSearchContextDTO.eq('status', 1);
        def person_range = iSearchContextDTO.get("n_member_id_in");

        //解析特定条件
        if (person_range != null && person_range != "") {
            def depts = []
            def persons = []
            person_range.each { item ->
                if (item.type == "dept") {
                    depts.add(item.id)
                } else {
                    persons.add(item.id)
                }
            }
            def deptStr = depts ? depts.join(",") : ""
            def personStr = persons ? persons.join(",") : ""
            if (deptStr != "" && personStr != "") {
                employeeSearchContextDTO.and().or().in('dept_id', deptStr).in('id', personStr)
            } else if (deptStr != "" && personStr == "") {
                employeeSearchContextDTO.in('dept_id', deptStr)
            } else {
                employeeSearchContextDTO.in('id', personStr)
            }
        }

        if (this.getDataEntityRuntime().getSystemPersistentAdapter() == null) {
            throw new Exception("实体未提供系统持久化设置器");
        }

        employeeSearchContextDTO.setPageable(iSearchContextDTO.getPageable());
        employeeSearchContextDTO.sort("name,desc");
        Object[] args = [employeeSearchContextDTO];
        Page<?> ret = (Page<?>) employeeRuntime.fetchDataSet("user", null, args);
        Page<IEntityDTO> page = employeeRuntime.getEntityDTOPage(ret, employeeRuntime.getDefaultPSDEDataSet(), employeeSearchContextDTO.getPageable());
        return new CustomPageImpl<IEntityDTO>(fillScheduleData(page.getContent(), iSearchContextDTO), employeeSearchContextDTO.getPageable(), ret.getTotalElements(), page.getTotalPages());
    }


    @Override
    public boolean isValid(Object[] args) {
        return true;
    }

    protected List<IEntityDTO> fillScheduleData(List<IEntityDTO> dtos, ISearchContextDTO iSearchContextDTO) {
        ISearchContextDTO attendance_scheduleSearchContextDTO = this.getDataEntityRuntime().createSearchContext();
        List<IEntityDTO> lastScheduleDTOList = new ArrayList<IEntityDTO>();
        List<String> persons = new ArrayList<String>();
        // 查询排班
        for (IEntityDTO dto : dtos) {
            persons.add(dto.getString("id", ""));
        }
        def personStr = persons ? persons.join(",") : ""

        attendance_scheduleSearchContextDTO.count(false).limit(10000).in("member_id", personStr);

        // 考勤规则过滤
        boolean inputRule = (iSearchContextDTO.get("n_rule_id_eq") != null && iSearchContextDTO.get("n_rule_id_eq") != "")
        if (inputRule) {
            attendance_scheduleSearchContextDTO.eq("rule_id", iSearchContextDTO.get("n_rule_id_eq"));
        }
        if (iSearchContextDTO.get("choose_month") != null && iSearchContextDTO.get("choose_month") != "") {
            attendance_scheduleSearchContextDTO.custom(" DATE_FORMAT(t1.CHECKIN_DATE, '%Y-%m') = '"+ iSearchContextDTO.get("choose_month") +"'")
        }

        IPSDEDataSet iPSDEDataSet = this.getDataEntityRuntime().getPSDEDataSet("Default");
        List<IEntityDTO> attendance_scheduleDTOList = this.getDataEntityRuntime().selectDataSet(iPSDEDataSet, attendance_scheduleSearchContextDTO)?:this.getDataEntityRuntime().createEntityList();
        //固定排班、灵活打卡、大小周需区分
        attendance_scheduleDTOList.forEach { s ->
            if (s.get("schedule_type").equals("fixed") || s.get("schedule_type").equals("flexible") || s.get("schedule_type").equals("alternate_week")){
                def shifts = s.get("shifts")
                def shift_data = JsonUtils.asMap(s.get("shift_data"))
                if (shifts && shift_data){
                    def matchedShift = shifts.find { it.id == shift_data.get("id") }
                    s.set("shifts", [matchedShift])
                }
                //休息
                if(shifts && !shift_data){
                    shifts.each {it ->
                        def shift_data1 = JsonUtils.asMap(it.get("shift_data"))
                        if (shift_data1.get("default_flag") == 1){
                            s.set("shifts", [it])
                        }
                    }

                }
            }
        }
        if (inputRule){
            //以规则为维度
            lastScheduleDTOList.addAll(attendance_scheduleDTOList)
        }else {
            //以人员为维度
            if (attendance_scheduleDTOList.size() > 0) {
                lastScheduleDTOList.addAll(attendance_scheduleDTOList)
                for (IEntityDTO employee : dtos) {
                    boolean userExistsSchedule = false;
                    for (IEntityDTO attendance_schedule : lastScheduleDTOList) {
                        if (employee.getString("id", "") == attendance_schedule.getString("member_id", "")) {
                            userExistsSchedule = true;
                            break;
                        }
                    }
                    if (!userExistsSchedule) {
                        IEntityDTO entityDTO = this.getDataEntityRuntime().createEntity();
                        entityDTO.put("member_id", employee.getString("id", ""));
                        entityDTO.put("member_name", employee.getString("name", ""));
                        lastScheduleDTOList.add(entityDTO);
                    }
                }
            }else {
                for (IEntityDTO employee : dtos) {
                    IEntityDTO entityDTO = this.getDataEntityRuntime().createEntity();
                    entityDTO.put("member_id", employee.getString("id", ""));
                    entityDTO.put("member_name", employee.getString("name", ""));
                    lastScheduleDTOList.add(entityDTO);
                }
            }
        }
        return lastScheduleDTOList;

    }


    class CustomPageImpl<T> extends net.ibizsys.central.util.PageImpl<T> {
        private final long total;

        public CustomPageImpl(List<T> content, Pageable pageable, long total, int totalPages) {
            super(content, pageable, total, totalPages);
            this.total = total;
        }

        @Override
        long getTotalElements() {
            return total;
        }
    }


}