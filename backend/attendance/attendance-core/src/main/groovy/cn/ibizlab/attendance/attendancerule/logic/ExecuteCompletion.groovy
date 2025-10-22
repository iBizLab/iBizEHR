package cn.ibizlab.attendance.attendancerule.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENDANCE_RULE]处理逻辑[定时补充排班]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class ExecuteCompletion extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(ExecuteCompletion.class)

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
            case "DEDATASET_05":
                //执行逻辑节点[获取当前规则激活班次]
                executeDedataset05(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_013":
                //执行逻辑节点[设置日历参数]
                executeRawsfcode013(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_03":
                //执行逻辑节点[获取节假日配置]
                executeDedataset03(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_05":
                //执行逻辑节点[循环子调用]
                executeLoopsubcall05(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_06":
                //执行逻辑节点[准备参数]
                executePrepareparam06(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_01":
                //执行逻辑节点[删除当前规则旧排班]
                executeRawsqlcall01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_08":
                //执行逻辑节点[大小周构造新排班]
                executeRawsfcode08(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[固定排班/灵活打卡构造新排班]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_06":
                //执行逻辑节点[手动排班构造新排班]
                executeRawsfcode06(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[自由班构造新排班]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_04":
                //执行逻辑节点[获取所有激活规则]
                executeDedataset04(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_016":
                //执行逻辑节点[免考勤]
                executeRawsfcode016(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_03":
                //执行逻辑节点[调试逻辑参数]
                executeDebugparam03(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_03":
                //执行逻辑节点[循环子调用]
                executeLoopsubcall03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_010":
                //执行逻辑节点[N班倒构造新排班]
                executeRawsfcode010(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_015":
                //执行逻辑节点[判断节假日]
                executeRawsfcode015(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_01":
                //执行逻辑节点[调试逻辑参数]
                executeDebugparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_05":
                //执行逻辑节点[上A休B构造新排班]
                executeRawsfcode05(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_014":
                //执行逻辑节点[判断节假日]
                executeRawsfcode014(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_02":
                //执行逻辑节点[获取所有人员]
                executeDedataset02(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_02":
                //执行逻辑节点[输出deptids]
                executeDebugparam02(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_01":
                //执行逻辑节点[查询部门下人员]
                executeDedataset01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_012":
                //执行逻辑节点[人员转换]
                executeRawsfcode012(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_02":
                //执行逻辑节点[准备参数]
                executePrepareparam02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_017":
                //执行逻辑节点[获取激活信息]
                executeRawsfcode017(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_05":
                //执行逻辑节点[重新建立参数]
                executePrepareparam05(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_04":
                //执行逻辑节点[准备参数]
                executePrepareparam04(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_04":
                //执行逻辑节点[计算规则成员]
                executeRawsfcode04(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_04":
                //执行逻辑节点[遍历规则人员]
                executeLoopsubcall04(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_02":
                //执行逻辑节点[删除人员旧排班]
                executeRawsqlcall02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_03":
                //执行逻辑节点[设置时间]
                executeRawsfcode03(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_02":
                //执行逻辑节点[循环子调用]
                executeLoopsubcall02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_09":
                //执行逻辑节点[过滤出不在其他生效规则内的人员]
                executeRawsfcode09(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_07":
                //执行逻辑节点[为规则人员生成新排班]
                executeRawsfcode07(iDELogicSession, iPSDELogicNode)
                break
            case "END_02":
                //执行逻辑节点[结束]
                executeEnd02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_011":
                //执行逻辑节点[N班倒构造新排班]
                executeRawsfcode011(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_05":
                //执行逻辑节点[查询当前生效规则成员]
                executeRawsqlcall05(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_01":
                //执行逻辑节点[准备参数]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_04":
                //执行逻辑节点[将该部门在其他生效规则内移除]
                executeRawsqlcall04(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_04":
                //执行逻辑节点[保存排班]
                executeDeaction04(iDELogicSession, iPSDELogicNode)
                break
            case "RESETPARAM_01":
                //执行逻辑节点[重置参数]
                executeResetparam01(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[获取当前规则激活班次]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置日历参数]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode013(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def calendarFilter = logic.param('calendarFilter').getReal()
			def _default = logic.param('Default').getReal()
			
			_default.copyTo(calendarFilter)
			
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
     * 执行逻辑节点[获取节假日配置]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[循环子调用]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLoopsubcall05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam06(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[删除当前规则旧排班]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[大小周构造新排班]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode08(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            //1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
			//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
			def activeShifts  = logic.param('activeShifts').getReal()
			def activeRule = logic.param('activeRule').getReal()
			def newSchedules = logic.param('newSchedules').getReal()
			def _default = logic.param('Default').getReal()
			def effect_time = _default.get("effect_time")
			def workdays =  logic.param('workdays').getReal()
			//大小周
			def biweekly_cycle = _default.get("biweekly_cycle")
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			 
			// 跳转到下个月
			calendar.add(Calendar.MONTH, 1)
			// 设置为下个月最后一天
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
			    
			// 排班结束日期
			def endDate = sdf.format(calendar.getTime())
			
			// 计算当天排班班次
			def generateShiftData = { Date checkinDate, List workdaysParam, List activeShiftsParam ->
			    // 1. 确定当前日期是周几（1-7对应周一到周日）
			    def calendarInner = Calendar.getInstance()
			    calendarInner.setTime(checkinDate)
			    int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
			    int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1
			
			    // 新增大/小周计算逻辑
			    // 计算生效日期所在周的第一天（周一）
			    def effectCal = Calendar.getInstance()
			    effectCal.setTime(effect_time)
			    effectCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)
			
			    // 计算检查日期所在周的第一天（周一）
			    def checkinCal = Calendar.getInstance()
			    checkinCal.setTime(checkinDate)
			    checkinCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)
			
			    // 计算周数差（生效日期所在周为第1周）
			    long diffMillis = checkinCal.getTimeInMillis() - effectCal.getTimeInMillis()
			    int weekNumber = (int)(diffMillis / (7 * 24 * 60 * 60 * 1000)) + 1
			
			    // 判断当前是大周还是小周
			    boolean isBigWeek = false
			    if (biweekly_cycle == "big_small") {
			    isBigWeek = (weekNumber % 2 == 1)  // 奇数周为大周
			} else if (biweekly_cycle == "small_big") {
			    isBigWeek = (weekNumber % 2 == 0)  // 偶数周为大周
			}
			
			// 调整day_number（小周时+7）
			int adjustedDayNumber = isBigWeek ? dayNumber : dayNumber + 7
			
			// 2. 查找匹配的工作日配置（直接匹配调整后的day_number）
			def workdayConfig = workdaysParam.find {
			    it.day_number == adjustedDayNumber
			}
			
			// 3. 未找到工作日配置时返回空班次
			if (!workdayConfig || !workdayConfig.shift_id) {
			    return null
			}
			
			// 4. 查找对应的班次信息
			def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }
			
			// 5. 未找到班次时返回空班次
			if (!shift || !shift.shift_data) {
			    return null
			}
			
			// 6. 返回班次数据
			return shift.shift_data
			}
			
			// 排班生成
			def startCal = Calendar.getInstance()
			startCal.setTime(effect_time)
			    
			// 解析结束日期
			def endCal = Calendar.getInstance()
			endCal.setTime(sdf.parse(endDate))
			
			// 遍历日期区间
			while (!startCal.after(endCal)) {
			    def checkinDate = startCal.getTime()
			    def shift_data = generateShiftData(checkinDate, workdays, activeShifts)
			    def workTime = shift_data?.work_times ?: null
			
			    def attendance_schedule = sys.entity('attendance_schedule')
			    attendance_schedule.rule_data = activeRule.get("rule_data")
			    attendance_schedule.rule_name = activeRule.get("name")
			    attendance_schedule.rule_id = activeRule.get("id")
			    attendance_schedule.checkin_date =  sdf.format(checkinDate)
			    if(shift_data){
			        shift_data.name = "白班"
			    }
			    attendance_schedule.shift_data = shift_data
			    attendance_schedule.work_time = workTime
			    attendance_schedule.workday = shift_data != null ? 1 : 0 
			    // attendance_schedule.id = UUID.randomUUID().toString() 
			
			    newSchedules.add(attendance_schedule)
			    startCal.add(Calendar.DAY_OF_MONTH, 1)
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
     * 执行逻辑节点[固定排班/灵活打卡构造新排班]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            //1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
			//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
			def activeShifts  = logic.param('activeShifts').getReal()
			def activeRule = logic.param('activeRule').getReal()
			def newSchedules = logic.param('newSchedules').getReal()
			def _default = logic.param('Default').getReal()
			def effect_time = _default.get("fill_time")
			def workdays =  logic.param('workdays').getReal()
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			 
			// 跳转到下个月
			calendar.add(Calendar.MONTH, 1)
			// 设置为下个月最后一天
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
			    
			// 排班结束日期
			def endDate = sdf.format(calendar.getTime())
			
			// 计算当天排班班次
			def generateShiftData = { Date checkinDate, List workdaysParam, List activeShiftsParam ->
			    // 1. 确定当前日期是周几（1-7对应周一到周日）
			    def calendarInner = Calendar.getInstance()
			    calendarInner.setTime(checkinDate)
			    int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
			    int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1
			
			    // 2. 查找匹配的工作日配置
			    def workdayConfig = workdaysParam.find { it.day_number == dayNumber }
			    
			    // 3. 未找到工作日配置时返回空班次
			    if (!workdayConfig || !workdayConfig.shift_id) {
			        // print "未找到工作日配置时返回空班次, ${workdayConfig}!"
			        return null
			    }
			
			    // 4. 查找对应的班次信息
			    def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }
			    
			    // 5. 未找到班次时返回空班次
			    if (!shift || !shift.shift_data) {
			        // print "未找到班次时返回空班次, ${shift}!"
			        return null 
			    }
			
			    // 6. 返回班次数据
			    // print "返回班次数据, ${shift}!"
			    return shift.shift_data
			}
			
			// 排班生成
			def startCal = Calendar.getInstance()
			if (effect_time instanceof String) {
			    startCal.setTime(sdf.parse(effect_time))
			} else {
			    startCal.setTime(effect_time)
			}       
			// 解析结束日期
			def endCal = Calendar.getInstance()
			endCal.setTime(sdf.parse(endDate))
			
			// 遍历日期区间
			while (!startCal.after(endCal)) {
			    def checkinDate = startCal.getTime()
			    def shift_data = generateShiftData(checkinDate, workdays, activeShifts)
			    def workTime = shift_data?.work_times ?: null
			
			    def attendance_schedule = sys.entity('attendance_schedule')
			    attendance_schedule.rule_data = activeRule.get("rule_data")
			    attendance_schedule.rule_name = activeRule.get("name")
			    attendance_schedule.rule_id = activeRule.get("id")
			    attendance_schedule.checkin_date =  sdf.format(checkinDate)
			    attendance_schedule.shift_data = shift_data
			    attendance_schedule.work_time = workTime
			    attendance_schedule.workday = shift_data != null ? 1 : 0 
			    // attendance_schedule.id = UUID.randomUUID().toString() 
			
			    newSchedules.add(attendance_schedule)
			    startCal.add(Calendar.DAY_OF_MONTH, 1)
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
     * 执行逻辑节点[手动排班构造新排班]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode06(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            //1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
			//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
			def activeRule = logic.param('activeRule').getReal()
			def newSchedules = logic.param('newSchedules').getReal()
			def _default = logic.param('Default').getReal()
			def effect_time = _default.get("fill_time")
			def workdays =  logic.param('workdays').getReal()
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			 
			// 跳转到下个月
			calendar.add(Calendar.MONTH, 1)
			// 设置为下个月最后一天
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
			    
			// 排班结束日期
			def endDate = sdf.format(calendar.getTime())
			
			// 排班生成
			def startCal = Calendar.getInstance()
			if (effect_time instanceof String) {
			    startCal.setTime(sdf.parse(effect_time))
			} else {
			    startCal.setTime(effect_time)
			}       
			// 解析结束日期
			def endCal = Calendar.getInstance()
			endCal.setTime(sdf.parse(endDate))
			
			// 遍历日期区间
			while (!startCal.after(endCal)) {
			    def checkinDate = startCal.getTime()
			
			    def attendance_schedule = sys.entity('attendance_schedule')
			    attendance_schedule.rule_data = activeRule.get("rule_data")
			    attendance_schedule.rule_name = activeRule.get("name")
			    attendance_schedule.rule_id = activeRule.get("id")
			    attendance_schedule.checkin_date =  sdf.format(checkinDate)
			    // attendance_schedule.id = UUID.randomUUID().toString() 
			
			    newSchedules.add(attendance_schedule)
			    startCal.add(Calendar.DAY_OF_MONTH, 1)
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
     * 执行逻辑节点[自由班构造新排班]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            //1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
			//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
			def activeShifts  = logic.param('activeShifts').getReal()
			def activeRule = logic.param('activeRule').getReal()
			def newSchedules = logic.param('newSchedules').getReal()
			def _default = logic.param('Default').getReal()
			def effect_time = _default.get("fill_time")
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			 
			// 跳转到下个月
			calendar.add(Calendar.MONTH, 1)
			// 设置为下个月最后一天
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
			    
			// 排班结束日期
			def endDate = sdf.format(calendar.getTime())
			
			
			// 排班生成
			def startCal = Calendar.getInstance()
			if (effect_time instanceof String) {
			    startCal.setTime(sdf.parse(effect_time))
			} else {
			    startCal.setTime(effect_time)
			}       
			// 解析结束日期
			def endCal = Calendar.getInstance()
			endCal.setTime(sdf.parse(endDate))
			
			// 遍历日期区间
			while (!startCal.after(endCal)) {
			    def checkinDate = startCal.getTime()
			    def shift_data = activeShifts[0].shift_data
			    def workTime = shift_data?.work_times ?: null
			
			    def attendance_schedule = sys.entity('attendance_schedule')
			    attendance_schedule.rule_data = activeRule.get("rule_data")
			    attendance_schedule.rule_name = activeRule.get("name")
			    attendance_schedule.rule_id = activeRule.get("id")
			    attendance_schedule.checkin_date =  sdf.format(checkinDate)
			    attendance_schedule.shift_data = shift_data
			    attendance_schedule.work_time = workTime
			    attendance_schedule.workday = shift_data != null ? 1 : 0 
			    // attendance_schedule.id = UUID.randomUUID().toString() 
			
			    newSchedules.add(attendance_schedule)
			    startCal.add(Calendar.DAY_OF_MONTH, 1)
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
     * 执行逻辑节点[获取所有激活规则]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[免考勤]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode016(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            //1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
			//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
			def activeRule = logic.param('activeRule').getReal()
			def newSchedules = logic.param('newSchedules').getReal()
			def _default = logic.param('Default').getReal()
			def effect_time = _default.get("fill_time")
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			 
			// 跳转到下个月
			calendar.add(Calendar.MONTH, 1)
			// 设置为下个月最后一天
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
			    
			// 排班结束日期
			def endDate = sdf.format(calendar.getTime())
			
			
			// 排班生成
			def startCal = Calendar.getInstance()
			if (effect_time instanceof String) {
			    startCal.setTime(sdf.parse(effect_time))
			} else {
			    startCal.setTime(effect_time)
			}   
			// 解析结束日期
			def endCal = Calendar.getInstance()
			endCal.setTime(sdf.parse(endDate))
			
			// 遍历日期区间
			while (!startCal.after(endCal)) {
			    def checkinDate = startCal.getTime()
			
			    def attendance_schedule = sys.entity('attendance_schedule')
			    attendance_schedule.rule_name = activeRule.get("name")
			    attendance_schedule.rule_id = activeRule.get("id")
			    attendance_schedule.checkin_date =  sdf.format(checkinDate)
			    attendance_schedule.workday = 0
			
			    newSchedules.add(attendance_schedule)
			    startCal.add(Calendar.DAY_OF_MONTH, 1)
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
     * 执行逻辑节点[调试逻辑参数]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[循环子调用]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLoopsubcall03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[N班倒构造新排班]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode010(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            //1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
			//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
			def activeShifts  = logic.param('activeShifts').getReal()
			def activeRule = logic.param('activeRule').getReal()
			def newSchedules = logic.param('newSchedules').getReal()
			def _default = logic.param('Default').getReal()
			def effect_time = _default.get("effect_time")
			def inversion_cycle = _default.get("inversion_cycle")
			
			//获取workdays
			def attendance_group_shift = logic.param('attendance_group_shift').getReal()
			def workdays = attendance_group_shift.get("workdays")
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			 
			// 跳转到下个月
			calendar.add(Calendar.MONTH, 1)
			// 设置为下个月最后一天
			calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
			    
			// 排班结束日期
			def endDate = sdf.format(calendar.getTime())
			
			
			// 排班生成
			def startCal = Calendar.getInstance()
			startCal.setTime(effect_time)
			    
			// 解析结束日期
			def endCal = Calendar.getInstance()
			endCal.setTime(sdf.parse(endDate))
			
			// 计算周期天数（N班倒*7天）
			int cycleDays = inversion_cycle * 7
			
			// 预处理工作日数据：建立周期映射表（仅保留1~cycleDays的配置）
			def validWorkdays = workdays.findAll { it.day_number <= cycleDays }
			def cycleMap = [:]
			validWorkdays.each { 
			    cycleMap[it.day_number] = it 
			}
			
			// 计算生效日期对应的周期基准日（最近的前序周一）
			Calendar baseDateCal = Calendar.getInstance()
			baseDateCal.setTime(effect_time)
			// 计算需要回退的天数（1=周日,2=周一,...,7=周六）
			int daysToSubtract = (baseDateCal.get(Calendar.DAY_OF_WEEK) - 2 + 7) % 7
			if (daysToSubtract > 0) {
			    baseDateCal.add(Calendar.DAY_OF_MONTH, -daysToSubtract)
			}
			Date baseDate = baseDateCal.getTime()
			
			// 遍历当月每一天
			while (!startCal.after(endCal)) {
			    Date checkinDate = startCal.getTime()
			    
			    // 计算相对于基准日的天数偏移
			    long offsetMillis = checkinDate.getTime() - baseDate.getTime()
			    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
			    
			    // 计算周期位置（1-based）
			    int dayInCycle = (offsetDays % cycleDays) + 1
			    
			    // 查找工作配置
			    def workdayConfig = cycleMap[dayInCycle]
			
			    if(workdayConfig!=null){
			          //查找对应的班次信息
			        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
			        def shift_data =  shift?.shift_data?:null
			        def workTime = shift_data?.work_times ?: null
			
			        def attendance_schedule = sys.entity('attendance_schedule')
			        attendance_schedule.rule_data = activeRule.get("rule_data")
			        attendance_schedule.rule_name = activeRule.get("name")
			        attendance_schedule.rule_id = activeRule.get("id")
			        attendance_schedule.checkin_date =  sdf.format(checkinDate)
			        attendance_schedule.shift_data = shift_data
			        attendance_schedule.work_time = workTime
			        attendance_schedule.workday = shift_data != null ? 1 : 0 
			        newSchedules.add(attendance_schedule)
			
			    }
			    startCal.add(Calendar.DAY_OF_MONTH, 1)
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
     * 执行逻辑节点[判断节假日]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode015(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def newSchedules = logic.param('newSchedules').getReal()
			def holidays = logic.param('calendarList').getReal()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			
			newSchedules.each { attendance_schedule ->
			    def checkin_date = sdf.format(attendance_schedule.checkin_date)
			    def holiday = holidays.find { sdf.format(it.rq) == checkin_date }
			    if(holiday != null ){
			        attendance_schedule.shift_data = null
			        attendance_schedule.work_time = null
			        attendance_schedule.workday = 0
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
     * 执行逻辑节点[调试逻辑参数]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[上A休B构造新排班]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def activeShifts = logic.param('activeShifts').getReal()
			def activeRule = logic.param('activeRule').getReal()
			def newSchedules = logic.param('newSchedules').getReal()
			def _default = logic.param('Default').getReal()
			def effect_time = _default.get("effect_time")
			def fill_time = _default.get("fill_time")
			
			def rest = _default.get("rest")
			def work = _default.get("work")
			
			def attendance_group_shift = logic.param('attendance_group_shift').getReal()
			def workdays = attendance_group_shift.get("workdays")
			
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			def endCal = Calendar.getInstance()
			endCal.add(Calendar.MONTH, 1)
			endCal.set(Calendar.DAY_OF_MONTH, endCal.getActualMaximum(Calendar.DAY_OF_MONTH))
			
			// 修改点1：以fill_time作为排班生成起点（零点时间）
			def startCal = Calendar.getInstance()
			if (fill_time instanceof String) {
			    startCal.setTime(sdf.parse(fill_time))
			} else {
			    startCal.setTime(fill_time)
			}
			startCal.set(Calendar.HOUR_OF_DAY, 0)
			startCal.set(Calendar.MINUTE, 0)
			startCal.set(Calendar.SECOND, 0)
			startCal.set(Calendar.MILLISECOND, 0)
			
			// 保持effect_time作为周期计算基准
			
			Date baseDate = effect_time
			Calendar effectCal = Calendar.getInstance()
			if (effect_time instanceof String) {
			    effectCal.setTime(sdf.parse(effect_time))
			} else {
			    effectCal.setTime(effect_time)
			}
			
			// 计算fill_time相对于effect_time的初始偏移天数
			long effectMillis = effectCal.getTimeInMillis()
			long fillMillis = startCal.getTimeInMillis()
			int initialOffsetDays = (fillMillis - effectMillis) / (24 * 60 * 60 * 1000)
			
			// 构建天数循环映射（保持原逻辑）
			def workdayNum = rest + work
			def cycleMap = [:]
			workdays.eachWithIndex { workday, index ->
			    if (index + 1 <= workdayNum) {
			        cycleMap[(index + 1)] = workday
			    }
			}
			
			// 生成排班数据
			while (!startCal.after(endCal)) {
			    Date checkinDate = startCal.getTime()
			    
			    // 计算相对于effect_time的偏移天数（核心修改）
			    long offsetMillis = checkinDate.time - effectMillis
			    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
			    int dayInCycle = (offsetDays % workdayNum) + 1  // 周期位置计算
			
			    def workdayConfig = cycleMap[dayInCycle]
			    if (workdayConfig) {
			        def shift = workdayConfig.get("is_work") == 1 ? activeShifts[0] : null
			        def shiftData = shift?.shift_data ?: [:]
			        def workTime = shiftData?.work_times ?: []
			
			        def attendance_schedule = sys.entity('attendance_schedule')
			        attendance_schedule.rule_data = activeRule.rule_data
			        attendance_schedule.rule_name = activeRule.name
			        attendance_schedule.rule_id = activeRule.id
			        attendance_schedule.checkin_date = sdf.format(checkinDate)
			        attendance_schedule.shift_data = shiftData
			        attendance_schedule.work_time = workTime
			        attendance_schedule.workday = shiftData ? 1 : 0
			        newSchedules.add(attendance_schedule)
			    }
			    startCal.add(Calendar.DAY_OF_MONTH, 1)
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
     * 执行逻辑节点[判断节假日]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode014(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def newSchedules = logic.param('newSchedules').getReal()
			def holidays = logic.param('calendarList').getReal()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			
			newSchedules.each { attendance_schedule ->
			    def checkin_date = sdf.format(attendance_schedule.checkin_date)
			    def holiday = holidays.find { sdf.format(it.rq) == checkin_date }
			    println("判断节假日attendance_schedule"+attendance_schedule)
			    println("判断节假日"+holiday)
			    if(holiday != null ){
			        attendance_schedule.shift_data = null
			        attendance_schedule.work_time = null
			        attendance_schedule.workday = 0
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
     * 执行逻辑节点[获取所有人员]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[输出deptids]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[查询部门下人员]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[人员转换]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode012(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def employees = logic.param('employees').getReal()
			def members = logic.param('members').getReal()
			
			
			def uniqueMemberIdMap = new HashMap()
			
			employees.each { emp ->
			    def member = sys.entity('Attendance_group_shift_member')
			    member.set("user_id",emp.id)
			    member.set("name",emp.name)
			    uniqueMemberIdMap.put(member.user_id, member)
			}
			
			members.clear()
			members.addAll(uniqueMemberIdMap.values())
			
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
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取激活信息]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode017(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def activeRule = logic.param('activeRule').getReal()
			def rule_data = activeRule.get("rule_data")
			def _default = logic.param('Default').getReal()
			
			print "rule_data配置, ${rule_data}"
			
			
			if (rule_data != null ) {
			    Map<String, Object> ruleData = rule_data as Map<String, Object>;
			    def workdays = ruleData.get("workdays")
			    if (workdays) {
			        _default.set("workdays",workdays)
			    }
			    _workdays = new ArrayList<>(workdays)
			
			    
			    def attendance_group_shifts = ruleData.get("attendance_group_shifts")
			    if (attendance_group_shifts) {
			        _default.set("attendance_group_shifts",attendance_group_shifts)
			    }
			
			    def effect_time = ruleData.get("effect_time")
			    if(effect_time){
			        _default.set("effect_time",effect_time)
			    } 
			       
			    def rest = ruleData.get("rest")
			    if(rest){
			        _default.set("rest",rest)
			    }
			    def work = ruleData.get("work")
			    if(work){
			        _default.set("work",work)
			    }  
			
			    def inversion_cycle = ruleData.get("inversion_cycle")
			    if(inversion_cycle){
			        _default.set("inversion_cycle",inversion_cycle)
			    }  
			    
			    def schedule_type = ruleData.get("schedule_type")
			    if(schedule_type){
			        _default.set("schedule_type",schedule_type)
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
     * 执行逻辑节点[重新建立参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[计算规则成员]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def attendance_group_shifts = logic.param('attendance_group_shifts').getReal()
			def members = logic.param('members').getReal()
			def depts = logic.param('depts').getReal()
			
			def uniqueMemberIdMap = new HashMap()
			def uniqueDeptIdMap = new HashMap()
			
			def _default = logic.param('Default').getReal()
			if(attendance_group_shifts!=null){
			  attendance_group_shifts.each{ attendance_group_shift ->
			    if (attendance_group_shift.members != null) {
			      attendance_group_shift.members.each { member ->
			      if(member.type == "person"){
			        uniqueMemberIdMap.put(member.user_id, member) 
			      }
			      if(member.type == "dept"){
			        uniqueDeptIdMap.put(member.user_id, member) 
			      }
			      }
			    }
			  }
			}
			
			members.addAll(uniqueMemberIdMap.values())
			depts.addAll(uniqueDeptIdMap.values())
			
			
			// def memberIds = uniqueMemberIdMap.keySet().collect { "'$it'" }.join(',')
			// def deptIds = uniqueDeptIdMap.keySet().collect { "'$it'" }.join(',')
			
			// _default.set("memberIds",memberIds)
			
			
			
			
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
     * 执行逻辑节点[遍历规则人员]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLoopsubcall04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[删除人员旧排班]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[设置时间]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def now = new Date()
			
			// 获取下个月第一天
			def calendar = Calendar.getInstance()
			calendar.setTime(now)
			calendar.add(Calendar.MONTH, 1)  
			calendar.set(Calendar.DAY_OF_MONTH, 1)
			calendar.set(Calendar.HOUR_OF_DAY, 0)
			calendar.set(Calendar.MINUTE, 0)
			calendar.set(Calendar.SECOND, 0)
			calendar.set(Calendar.MILLISECOND, 0)
			
			def nextMonthFirstDay = calendar.getTime()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			 _default.set("fill_time",sdf.format(nextMonthFirstDay))
			
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
     * 执行逻辑节点[循环子调用]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLoopsubcall02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[过滤出不在其他生效规则内的人员]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode09(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def employees = logic.param('employees').getReal()
			def allDeptEmp = logic.param('allDeptEmp').getReal()
			def curActiveMember = logic.param('curActiveMember').getReal()
			def members = logic.param('members').getReal()
			
			allDeptEmp.addAll(employees)
			
			def uniqueMemberIdMap = new HashMap()
			// 先将原始 members 放入Map
			members.each { member ->
			    uniqueMemberIdMap.put(member.user_id, member)
			}
			
			allDeptEmp.each { emp ->
			    def isAlreadyActive = curActiveMember.find { it.user_id == emp.id }
			    if (isAlreadyActive) {
			        return
			    }
			
			    def member = sys.entity('Attendance_group_shift_member')
			    member.set("user_id",emp.id)
			    member.set("name",emp.name)
			    uniqueMemberIdMap.put(member.user_id, member)
			}
			
			members.clear()
			members.addAll(uniqueMemberIdMap.values())
			
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
     * 执行逻辑节点[为规则人员生成新排班]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode07(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def members = logic.param('members').getReal()
			def lastSchedules = logic.param('lastSchedules').getReal()
			def newSchedules = logic.param('newSchedules').getReal()
			
			members.each { member ->
			    if (member == null) return
			    newSchedules.each { attendance_schedule ->
			        def newSchedule = sys.entity('attendance_schedule')
			        attendance_schedule.copyTo(newSchedule)
			        newSchedule.member_id = member.user_id
			        newSchedule.member_name = member.name
			        lastSchedules.add(newSchedule)
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
    private void executeEnd02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[N班倒构造新排班]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode011(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def activeShifts = logic.param('activeShifts').getReal()
			def activeRule = logic.param('activeRule').getReal()
			def newSchedules = logic.param('newSchedules').getReal()
			def _default = logic.param('Default').getReal()
			def effect_time = _default.get("effect_time")
			def inversion_days = _default.get("inversion_days")
			
			def attendance_group_shift = logic.param('attendance_group_shift').getReal()
			def workdays = attendance_group_shift.get("workdays")
			
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			def endCal = Calendar.getInstance()
			endCal.add(Calendar.MONTH, 1)
			endCal.set(Calendar.DAY_OF_MONTH, endCal.getActualMaximum(Calendar.DAY_OF_MONTH))
			
			def startCal = Calendar.getInstance()
			startCal.setTime(effect_time)
			startCal.set(Calendar.HOUR_OF_DAY, 0)
			startCal.set(Calendar.MINUTE, 0)
			startCal.set(Calendar.SECOND, 0)
			startCal.set(Calendar.MILLISECOND, 0)
			
			def cycleMap = [:]
			workdays.eachWithIndex { workday, index ->
			    if (index + 1 <= inversion_days) {
			        cycleMap[(index + 1)] = workday
			    }
			}
			
			Date baseDate = startCal.getTime()
			while (!startCal.after(endCal)) {
			    Date checkinDate = startCal.getTime()
			    long offsetMillis = checkinDate.time - baseDate.time
			    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
			    int dayInCycle = (offsetDays % inversion_days) + 1
			
			    def workdayConfig = cycleMap[dayInCycle]
			    if (workdayConfig) {
			        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
			        def shiftData = shift?.shift_data ?: [:]
			        def workTime = shiftData?.work_times ?: []
			
			        def attendance_schedule = sys.entity('attendance_schedule')
			        attendance_schedule.rule_data = activeRule.rule_data
			        attendance_schedule.rule_name = activeRule.name
			        attendance_schedule.rule_id = activeRule.id
			        attendance_schedule.checkin_date = sdf.format(checkinDate)
			        attendance_schedule.shift_data = shiftData
			        attendance_schedule.work_time = workTime
			        attendance_schedule.workday = shiftData ? 1 : 0
			        newSchedules.add(attendance_schedule)
			    }
			    startCal.add(Calendar.DAY_OF_MONTH, 1)
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
     * 执行逻辑节点[查询当前生效规则成员]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[将该部门在其他生效规则内移除]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[保存排班]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[重置参数]，逻辑类型[RESETPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeResetparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

