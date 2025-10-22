package cn.ibizlab.attendance.attendancestatistics.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENDANCE_STATISTICS]处理逻辑[信息反查]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class CheckInfo extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(CheckInfo.class)

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
            case "PREPAREPARAM1":
                //执行逻辑节点[准备参数]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION1":
                //执行逻辑节点[获取员工]
                executeDEACTION1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[获取数据明细]
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
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取员工]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取数据明细]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def emp = logic.param('emp').getReal()
			
			def sdf = new java.text.SimpleDateFormat("HH:mm:ss")
			def checkin_date = _default.get("checkin_date")
			
			//获取排班
			def attendance_schedule_runtime = sys.dataentity('attendance_schedule')
			def attendance_schedule_filter = attendance_schedule_runtime.filter()
			attendance_schedule_filter.all()
			attendance_schedule_filter.eq('member_id', emp.get("id"))
			attendance_schedule_filter.custom(" DATE_FORMAT(t1.CHECKIN_DATE, '%Y-%m-%d') = '"+ checkin_date +"'")
			def attendance_schedule_list = attendance_schedule_filter.select('')
			
			//规则名称
			def rule_name = "";
			//班次名称
			def shift_name = "";
			//获取班次
			if (attendance_schedule_list != null) {
			    attendance_schedule_list.each { item ->
			        def work_times = item.get("work_time")
			        if (work_times != null) {
			            work_times.each { it ->
			                shift_name += it.get("shift_name") + " " + it.get("start_base_time") + "-" + it.get("end_base_time")
			            }
			        }
			        rule_name = item.get("rule_name")
			    }
			}
			
			emp.set("rule_name", rule_name)
			emp.set("shift_name", shift_name)
			
			//获取打卡记录
			def clock_runtime = sys.dataentity('attendance_clock_in_record')
			def clock_filter = clock_runtime.filter()
			clock_filter.all()
			clock_filter.eq('member_id', emp.get("id"))
			clock_filter.custom(" DATE_FORMAT(t1.CHECKIN_TIME, '%Y-%m-%d') = '"+ checkin_date +"'")
			def clock_list = clock_filter.select('')
			if (clock_list != null) {
			    clock_list.each { item ->
			        if (item.get('checkin_time') != null) {
			            item.set('clock_checkin_time', sdf.format(item.get('checkin_time')))
			        }
			    }
			    emp.set("clock_list", clock_list)
			}
			
			//获取考勤记录
			def record_runtime = sys.dataentity('attendance_record')
			def details = []
			def record_filter = record_runtime.filter()
			record_filter.all()
			record_filter.eq('member_id', emp.get("id"))
			record_filter.custom(" DATE_FORMAT(t1.CHECKIN_DATE, '%Y-%m-%d') = '"+ checkin_date +"'")
			record_filter.setPageable(0,1000,0)
			def record_list = record_filter.fetch()
			if (record_list != null) {
			    record_list.each { item ->
			        details = item.get('details')
			    }
			}
			
			if (details != null) {
			    details.each { item ->
			        if (item.get('detail_index') != null) {
			            if (item.get('detail_index').startsWith("end")) {
			                if (item.get('should_checkin_time') != null) {
			                    item.set('end_base_time', sdf.format(item.get('should_checkin_time')))
			                }
			            } else {
			                if (item.get('should_checkin_time') != null) {
			                    item.set('start_base_time', sdf.format(item.get('should_checkin_time')))
			                }
			            }
			        }
			        if (item.get('checkin_time') != null) {
			            item.set('detail_checkin_time', sdf.format(item.get('checkin_time')))
			        }
			    }
			    details.sort { a, b ->
			        def timeA = java.time.LocalTime.parse(sdf.format(a.get('should_checkin_time')))
			        def timeB = java.time.LocalTime.parse(sdf.format(b.get('should_checkin_time')))
			        timeA <=> timeB
			    }
			}
			
			emp.set("record_list", details)
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

