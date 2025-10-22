package cn.ibizlab.attendance.attendanceclockinrecord.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENDANCE_CLOCK_IN_RECORD]处理逻辑[打卡记录]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class Record extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(Record.class)

    @Override
	protected void onInit() throws Exception {
		super.onInit()
	}

    @Override
    protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        switch (iPSDELogicNode.getCodeName()) {
            case "Begin":
                //执行逻辑节点[开始]
                executeBegin(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_01":
                //执行逻辑节点[调试逻辑参数]
                executeDebugparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[执行脚本代码]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE2":
                //执行逻辑节点[解析搜索条件]
                executeRAWSFCODE2(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET1":
                //执行逻辑节点[查询人员]
                executeDEDATASET1(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL1":
                //执行逻辑节点[循环子调用]
                executeLOOPSUBCALL1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[获取打卡记录]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
                break
            case "END1":
                //执行逻辑节点[结束]
                executeEND1(iDELogicSession, iPSDELogicNode)
                break
            default:
                super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode)
        }
    }

    /**
     * 执行逻辑节点[开始]，逻辑类型[BEGIN]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBegin(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[调试逻辑参数]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[执行脚本代码]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			//获取`打卡记录`实体运行对象
			def record_runtime = sys.dataentity('attendance_clock_in_record')
			def record_filter = record_runtime.filter()
			record_filter.all()
			
			def person_range = _default.get("n_member_id_in")
			if ( person_range != null && person_range != "") {
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
			        record_filter.and().or().in('dept_id', deptStr).in('id', personStr)
			    } else if (deptStr != "" && personStr == "") {
			        record_filter.in('dept_id', deptStr)
			    } else {
			        record_filter.in('member_id', personStr)
			    }
			}
			
			def n_checkin_time_gtandeq = _default.get('n_checkin_time_gtandeq')
			def n_checkin_time_ltandeq = _default.get('n_checkin_time_ltandeq')
			if (n_checkin_time_gtandeq != null && n_checkin_time_ltandeq != null) {
			    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') >= '"+ n_checkin_time_gtandeq +"'")
			    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') <= '"+ n_checkin_time_ltandeq +"'")
			}
			
			def dataList = record_filter.select('');
			if (dataList){
			    def newRecords = logic.param('newRecords').getReal()
			    dataList.groupBy { it.get("member_id") }.each { memberId, records ->
			        println("输出memberId: " + memberId)
			        println("输出records: " + records)
			        if (!records) {
			            return
			        }
			
			        def newRecord = sys.entity('attendance_clock_in_record')
			        newRecord.set('id', records[0].get("member_id"))
			        newRecord.set('member_id', records[0].get("member_id"))
			        newRecord.set('dept_id', records[0].get("dept_id"))
			        newRecord.set('dept_name', records[0].get("dept_name"))
			        newRecord.set('member_name', records[0].get("member_name"))
			
			        def map = new HashMap<String, List<String>>()
			        def resultMap = new HashMap()
			
			        // 遍历数据列表，根据日期分组
			        records.each { item ->
			            def dateKey = item.get("checkin_time").toString().substring(0, 10)
			            // 按照年月日分组
			            if (!map.containsKey(dateKey)) {
			                map[dateKey] = []
			            }
			            map[dateKey].add(item)
			        }
			
			        // 处理分组后的数据
			        map.each { entry ->
			            def temp = [details: entry.value]
			            resultMap.put(entry.key, temp)
			        }
			        println("输出map: " + map)
			        println("输出resultMap: " + resultMap)
			        newRecord.set('attendance_data', resultMap)
			        newRecords.add(newRecord)
			    }
			}
        }.call(iDELogicSession.getDELogicRuntime().getSystemRuntime(), iDELogicSession.getDELogicRuntime())
        //设置返回值
        iDELogicSession.setLastReturn(objRet);
        if(iPSDELogicNode.getRetPSDELogicParam() != null) {
            def retDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNode.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
        //super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEnd01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[解析搜索条件]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE2(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def person_range = _default.get("n_member_id_in")
			if ( person_range != null && person_range != "") {
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
			        _default.and().or().in('dept_id', deptStr).in('id', personStr)
			    } else if (deptStr != "" && personStr == "") {
			        _default.in('dept_id', deptStr)
			    } else {
			        _default.in('id', personStr)
			    }
			}
			
			//获取`打卡记录`实体运行对象
			def record_runtime = sys.dataentity('attendance_clock_in_record')
			def record_filter = record_runtime.filter()
			record_filter.all()
			record_filter.eq('member_id', emp_temp.get("id"))
			
			if (n_checkin_time_gtandeq != null && n_checkin_time_ltandeq != null) {
			    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') >= '"+ n_checkin_time_gtandeq +"'")
			    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') <= '"+ n_checkin_time_ltandeq +"'")
			}
        }.call(iDELogicSession.getDELogicRuntime().getSystemRuntime(), iDELogicSession.getDELogicRuntime())
        //设置返回值
        iDELogicSession.setLastReturn(objRet);
        if(iPSDELogicNode.getRetPSDELogicParam() != null) {
            def retDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNode.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
        //super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[查询人员]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEDATASET1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[循环子调用]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLOOPSUBCALL1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取打卡记录]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def emp_temp = logic.param('emp_temp').getReal()
			
			def n_checkin_time_gtandeq = _default.get('n_checkin_time_gtandeq')
			def n_checkin_time_ltandeq = _default.get('n_checkin_time_ltandeq')
			
			//获取`打卡记录`实体运行对象
			def record_runtime = sys.dataentity('attendance_clock_in_record')
			def record_filter = record_runtime.filter()
			record_filter.all()
			record_filter.eq('member_id', emp_temp.get("id"))
			
			if (n_checkin_time_gtandeq != null && n_checkin_time_ltandeq != null) {
			    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') >= '"+ n_checkin_time_gtandeq +"'")
			    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') <= '"+ n_checkin_time_ltandeq +"'")
			}
			def dataList = record_filter.select('');
			
			def map = new HashMap<String, List<String>>()
			def resultMap = new HashMap()
			
			// 遍历数据列表，根据日期分组
			dataList.each { item ->
			    def dateKey = item.get("checkin_time").toString().substring(0, 10)
			    // 按照年月日分组
			    if (!map.containsKey(dateKey)) {
			        map[dateKey] = []
			    }
			    map[dateKey].add(item)
			}
			
			// 处理分组后的数据
			map.each { entry ->
			    // entry.value.each { it ->
			    //     it.set("checkin_time", it.get("checkin_time") ? it.get("checkin_time").toString().substring(11, 19) : '')
			    // }
			    def temp = [details: entry.value]
			    resultMap.put(entry.key, temp)
			}
			
			emp_temp.set('attendance_data', resultMap);
			emp_temp.set('member_name', emp_temp.get("name"));
			emp_temp.set('member_num',emp_temp.get("employee_num"));
        }.call(iDELogicSession.getDELogicRuntime().getSystemRuntime(), iDELogicSession.getDELogicRuntime())
        //设置返回值
        iDELogicSession.setLastReturn(objRet);
        if(iPSDELogicNode.getRetPSDELogicParam() != null) {
            def retDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNode.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
        //super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEND1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

