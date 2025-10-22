package cn.ibizlab.attendance.attendanceschedule.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENDANCE_SCHEDULE]处理逻辑[清除手动排班]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class ClearManualSchedule extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(ClearManualSchedule.class)

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
            case "RAWSQLCALL_01":
                //执行逻辑节点[查询手动排班]
                executeRawsqlcall01(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_01":
                //执行逻辑节点[调试逻辑参数]
                executeDebugparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_02":
                //执行逻辑节点[查询手动排班]
                executeRawsqlcall02(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_01":
                //执行逻辑节点[循环子调用]
                executeLoopsubcall01(iDELogicSession, iPSDELogicNode)
                break
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_02":
                //执行逻辑节点[循环子调用]
                executeLoopsubcall02(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_01":
                //执行逻辑节点[准备参数]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_03":
                //执行逻辑节点[执行脚本代码]
                executeRawsfcode03(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_01":
                //执行逻辑节点[获取当前规则激活班次]
                executeDedataset01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[计算构造新排班]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_04":
                //执行逻辑节点[输出拷贝后的rule]
                executeDebugparam04(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[上A休B构造新排班]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_02":
                //执行逻辑节点[手动排班置空]
                executePrepareparam02(iDELogicSession, iPSDELogicNode)
                break
            case "DELOGIC_01":
                //执行逻辑节点[实体处理逻辑]
                executeDelogic01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM3":
                //执行逻辑节点[准备参数]
                executePREPAREPARAM3(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_01":
                //执行逻辑节点[更新排班]
                executeDeaction01(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[查询手动排班]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[查询手动排班]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[循环子调用]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLoopsubcall01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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

    /**
     * 执行逻辑节点[循环子调用]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLoopsubcall02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[执行脚本代码]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def temp = logic.param('temp').getReal()
			def rule = logic.param('rule').getReal()
			
			def rule_data = temp.get("rule_data").any()
			if (rule_data){
			
			    def rule_runtime = sys.dataentity('attendance_rule')
			    rule_runtime.createEntity(rule_data).copyTo(rule)
			    //限制时间：今日
			    def cal = Calendar.getInstance()
			    cal.time = new Date()
			    cal.set(Calendar.HOUR_OF_DAY, 0)
			    cal.set(Calendar.MINUTE, 0)
			    cal.set(Calendar.SECOND, 0)
			    cal.set(Calendar.MILLISECOND, 0)
			    rule.set("limitTime", cal.getTime())
			
			    //转换scope
			    def shifts = temp.get("rule_data").any().get("shifts")
			    if(shifts){
			        def _shifts = logic.param('shifts').getReal()
			        shifts.forEach { shift ->
			            def newShift = sys.entity('attendance_shift')
			            shift.copyTo(newShift)
			            _shifts.add(newShift)
			        }
			        rule.set("shifts",_shifts)
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
     * 执行逻辑节点[获取当前规则激活班次]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[计算构造新排班]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def temp = logic.param('temp').getReal()
			def checkinDate = temp.get("checkin_date")
			def activeShifts = logic.param('activeShifts').getReal()
			
			def rule_data = temp.get("rule_data")
			print "rule_data配置, ${rule_data}"
			print "activeShifts配置, ${activeShifts}"
			print "checkinDate配置, ${checkinDate}"
			
			if (rule_data != null && checkinDate != null && activeShifts != null) {
			    Map<String, Object> ruleData = rule_data as Map<String, Object>;
			    def workdays = ruleData.get("workdays")
			    print "工作日配置, ${workdays}"
			
			
			    // 计算当天排班班次
			    def calcShiftData = { Date checkinDateParam, List workdaysParam, List activeShiftsParam ->
			        // 1. 确定当前日期是周几（1-7对应周一到周日）
			        def calendarInner = Calendar.getInstance()
			        calendarInner.setTime(checkinDateParam)
			        int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
			        int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1
			
			        // 2. 查找匹配的工作日配置
			        def workdayConfig = workdaysParam.find { it.day_number == dayNumber }
			
			        // 3. 未找到工作日配置时返回空班次
			        if (!workdayConfig || !workdayConfig.shift_id) {
			            print "未找到工作日配置时返回空班次, ${workdayConfig}!"
			            return null
			        }
			
			        // 4. 查找对应的班次信息
			        def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }
			
			        // 5. 未找到班次时返回空班次
			        if (!shift || !shift.shift_data) {
			            print "未找到班次时返回空班次, ${shift}!"
			            return null
			        }
			
			        // 6. 返回班次数据
			        print "返回班次数据, ${shift}!"
			        return shift.shift_data
			    }
			
			    def shift_data = calcShiftData(checkinDate, workdays, activeShifts)
			    def workTime = shift_data?.work_times ?: null
			    temp.set("shift_data",shift_data)
			    temp.set("work_time",workTime)
			    temp.set("workday",shift_data != null ? 1 : 0)
			
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
     * 执行逻辑节点[输出拷贝后的rule]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[上A休B构造新排班]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def temp = logic.param('temp').getReal()
			def checkinDate = temp.get("checkin_date")
			def activeShifts = logic.param('activeShifts').getReal()
			def member_id = temp.get("member_id")
			def rule_data = temp.get("rule_data")
			
			if (rule_data != null && checkinDate != null && activeShifts != null) {
			    Map<String, Object> ruleData = rule_data as Map<String, Object>
			    def attendance_group_shifts = ruleData.get("attendance_group_shifts")
			    def effect_time = ruleData.get("effect_time")
			    def inversion_cycle = ruleData.get("inversion_cycle") as Integer
			
			    // 解析日期工具
			    def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			    def checkinCal = Calendar.getInstance()
			    if (checkinDate instanceof String) {
			        checkinCal.setTime(sdf.parse(checkinDate))
			    } else {
			        checkinCal.setTime(checkinDate)
			    }
			
			    // 计算周期天数
			    int cycleDays = inversion_cycle * 7
			
			    // 预处理工作日数据
			    def validWorkdays = attendance_group_shifts.findAll { it.day_number <= cycleDays }
			    def cycleMap = validWorkdays.collectEntries { [(it.day_number): it] }
			
			    // 计算基准日（effect_time的最近前序周一）
			    Calendar baseCal = Calendar.getInstance()
			    baseCal.setTime(sdf.parse(effect_time))
			    int daysToSubtract = (baseCal.get(Calendar.DAY_OF_WEEK) - 2 + 7) % 7
			    if (daysToSubtract > 0) {
			        baseCal.add(Calendar.DAY_OF_MONTH, -daysToSubtract)
			    }
			    Date baseDate = baseCal.getTime()
			
			    // 计算日期偏移
			    long offsetMillis = checkinCal.getTimeInMillis() - baseDate.getTime()
			    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
			    int dayInCycle = (offsetDays % cycleDays) + 1
			
			    // 查找班次配置
			    def workdayConfig = cycleMap[dayInCycle]
			    if (workdayConfig) {
			        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
			        if (shift) {
			            def shiftData = shift.shift_data
			            def workTime = shiftData?.work_times
			            // 更新临时参数
			            temp.set("shift_data", shiftData)
			            temp.set("work_time", workTime)
			            temp.set("workday", shiftData ? 1 : 0)
			        }
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
     * 执行逻辑节点[手动排班置空]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[实体处理逻辑]，逻辑类型[DELOGIC]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDelogic01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM3(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[更新排班]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

