package cn.ibizlab.checkin.runtime.plugin

import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.dataentity.ds.DEDataSetRuntimeBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContext
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

class EmployeeDEDataSetRuntime extends DEDataSetRuntimeBase {

    @Override
    protected Object onFetch(ISearchContext iSearchContext) throws Throwable {
        ISearchContextDTO context = (ISearchContextDTO) iSearchContext

        // 1. 获取部门及其所有子部门ID
        def rootDeptId = context.get("n_dept_id_eq");
        if (!rootDeptId){
            return new CustomPageImpl<IEntityDTO>([], context.getPageable(), 0, 0)
        }
        List<String> allDeptIds = getAllSubDeptIds(rootDeptId)

        // 2. 构建人员查询条件
        IDataEntityRuntime employeeRuntime = this.getSystemRuntime().getDataEntityRuntime("employee");
        ISearchContextDTO employeeSearchContextDTO = employeeRuntime.createSearchContext();
        employeeSearchContextDTO.eq('status', 1)
        def deptStr = allDeptIds ? allDeptIds.join(",") : ""

        employeeSearchContextDTO.in('dept_id', deptStr)
        employeeSearchContextDTO.setPageable(context.getPageable())
        Object[] args = [employeeSearchContextDTO];

        // 3. 执行查询
        Page<?> rawPage = (Page<?>) employeeRuntime.fetchDataSet("user", null, args);

        // 4. 转换结果
        return employeeRuntime.getEntityDTOPage(
                rawPage,
                employeeRuntime.getDefaultPSDEDataSet(),
                employeeSearchContextDTO.getPageable()
        )
    }

    // 递归获取所有子部门ID（含自身）
    private List<String> getAllSubDeptIds(String rootDeptId) {
        def deptRuntime = getSystemRuntime().getDataEntityRuntime("department")
        ISearchContextDTO searchContextDTO = deptRuntime.createSearchContext();
        searchContextDTO.count(false).limit(10000)
        //获取所有部门
        IPSDEDataSet iPSDEDataSet = deptRuntime.getPSDEDataSet("dept");
        List<IEntityDTO> allDepts = deptRuntime.selectDataSet(iPSDEDataSet, searchContextDTO);

        List<String> result = new ArrayList<>()
        collectSubDeptIds(rootDeptId, allDepts, result)
        return result
    }

    private void collectSubDeptIds(String deptId, List<IEntityDTO> allDepts, List<String> result) {
        // 先添加当前部门
        result.add(deptId)
        // 查找所有子部门
        List<IEntityDTO> children = allDepts.findAll { it.get("parent_id") == deptId }
        // 递归处理子部门
        children.each { child ->
            collectSubDeptIds(child.id, allDepts, result)
        }
    }
    

    @Override
    public boolean isValid(Object[] args) {
        return true;
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