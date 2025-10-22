package cn.ibizlab.hr.hrattendance.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[HR_ATTENDANCE]处理逻辑[自助终端考勤]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class KioskCheckin extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(KioskCheckin.class)

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
            case "PREPAREPARAM_01":
                //执行逻辑节点[准备参数]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_05":
                //执行逻辑节点[获取人员数据]
                executeDeaction05(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_01":
                //执行逻辑节点[获取最近一次考勤记录]
                executeRawsqlcall01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_02":
                //执行逻辑节点[计算今日时时数]
                executeRawsqlcall02(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_01":
                //执行逻辑节点[调试逻辑参数]
                executeDebugparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[构造出勤]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[构造出勤]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_01":
                //执行逻辑节点[计算工作时间]
                executeDeaction01(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_04":
                //执行逻辑节点[实体行为]
                executeDeaction04(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_02":
                //执行逻辑节点[实体行为]
                executeDeaction02(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_03":
                //执行逻辑节点[计算工作时间]
                executeDeaction03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_04":
                //执行逻辑节点[今日时数]
                executeRawsfcode04(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_03":
                //执行逻辑节点[今日时数]
                executeRawsfcode03(iDELogicSession, iPSDELogicNode)
                break
            case "END_02":
                //执行逻辑节点[结束]
                executeEnd02(iDELogicSession, iPSDELogicNode)
                break
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
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
    private void executePrepareparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取人员数据]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取最近一次考勤记录]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[计算今日时时数]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[构造出勤]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def new_attendance = logic.param('new_attendance').getReal()
			def emp = logic.param('emp').getReal()
			def now = java.time.LocalDateTime.now()
			def formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
			
			new_attendance.set("check_in",now.format(formatter))
			new_attendance.set("in_mode","kiosk")
			new_attendance.set("employee_id",emp.get("id"))
			new_attendance.set("employee_name",emp.get("name"))
			new_attendance.set("overtime_status","to_approve")
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
     * 执行逻辑节点[构造出勤]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def last = logic.param('last').getReal()
			def now = java.time.LocalDateTime.now()
			def formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
			
			last.set("check_out", now.format(formatter))
			last.set("out_mode", "kiosk")
			last.set("overtime_status", "to_approve")
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
     * 执行逻辑节点[计算工作时间]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[实体行为]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[实体行为]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[计算工作时间]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[今日时数]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def new_attendance = logic.param('new_attendance').getReal()
			def res = logic.param('hours_previously_today').getReal()
			def hours_previously_today = res.get("hours_previously_today") as BigDecimal
			
			new_attendance.set("hours_previously_today",hours_previously_today.setScale(2, BigDecimal.ROUND_HALF_UP))
			new_attendance.set("hours_today",hours_previously_today.setScale(2, BigDecimal.ROUND_HALF_UP))
			new_attendance.set("attendance_state","checked_in")
			
			// 签到时间处理
			def check_in = new_attendance.get("check_in")
			def inputFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
			def outputFormat = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒")
			outputFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"))
			
			// 转换并存储结果
			def formattedCheckOut = outputFormat.format(inputFormat.parse(check_in.toString()))
			new_attendance.set("check_in_display", formattedCheckOut)
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
     * 执行逻辑节点[今日时数]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def last = logic.param('last').getReal()
			def res = logic.param('hours_previously_today').getReal()
			def hours_previously_today = res.get("hours_previously_today") as BigDecimal
			
			def worked_hours = last.get("worked_hours") as BigDecimal
			
			// 计算并保留两位小数
			def hours_today = (hours_previously_today + worked_hours).setScale(2, BigDecimal.ROUND_HALF_UP)
			
			last.set("hours_today", hours_today)
			last.set("hours_previously_today", hours_previously_today.setScale(2, BigDecimal.ROUND_HALF_UP))
			last.set("attendance_state", "checked_out")
			
			// 签退时间处理
			def check_out = last.get("check_out")
			def inputFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
			def outputFormat = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒")
			outputFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"))
			
			// 转换并存储结果
			def formattedCheckOut = outputFormat.format(inputFormat.parse(check_out.toString()))
			last.set("check_out_display", formattedCheckOut)
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
    private void executeEnd02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
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
}

