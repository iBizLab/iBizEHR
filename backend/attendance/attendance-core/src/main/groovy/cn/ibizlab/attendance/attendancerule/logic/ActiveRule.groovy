package cn.ibizlab.attendance.attendancerule.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENDANCE_RULE]处理逻辑[激活规则]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class ActiveRule extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(ActiveRule.class)

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
            case "RAWSQLCALL8":
                //执行逻辑节点[删除当前旧激活班次]
                executeRAWSQLCALL8(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_01":
                //执行逻辑节点[删除当前规则旧排班]
                executeRawsqlcall01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_06":
                //执行逻辑节点[删除当前规则区间旧排班]
                executeRawsqlcall06(iDELogicSession, iPSDELogicNode)
                break
            case "RENEWPARAM_01":
                //执行逻辑节点[重新建立参数]
                executeRenewparam01(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_01":
                //执行逻辑节点[遍历班次]
                executeLoopsubcall01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM9":
                //执行逻辑节点[衔接]
                executePREPAREPARAM9(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_03":
                //执行逻辑节点[激活班次]
                executeDeaction03(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_03":
                //执行逻辑节点[准备参数]
                executePrepareparam03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_013":
                //执行逻辑节点[设置日历参数]
                executeRawsfcode013(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_05":
                //执行逻辑节点[重新建立参数]
                executePrepareparam05(iDELogicSession, iPSDELogicNode)
                break
            case "APPENDPARAM_01":
                //执行逻辑节点[附加到数组参数]
                executeAppendparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_03":
                //执行逻辑节点[计算工时]
                executeRawsfcode03(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_07":
                //执行逻辑节点[准备参数]
                executePrepareparam07(iDELogicSession, iPSDELogicNode)
                break
            case "BINDPARAM_01":
                //执行逻辑节点[绑定参数]
                executeBindparam01(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_03":
                //执行逻辑节点[获取节假日配置]
                executeDedataset03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_018":
                //执行逻辑节点[构造节假日]
                executeRawsfcode018(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_05":
                //执行逻辑节点[调试逻辑参数]
                executeDebugparam05(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_017":
                //执行逻辑节点[生效日期转换]
                executeRawsfcode017(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_011":
                //执行逻辑节点[N班倒构造新排班]
                executeRawsfcode011(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_010":
                //执行逻辑节点[N班倒构造新排班]
                executeRawsfcode010(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_08":
                //执行逻辑节点[大小周构造新排班]
                executeRawsfcode08(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[自由班构造新排班]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_02":
                //执行逻辑节点[循环子调用]
                executeLoopsubcall02(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_04":
                //执行逻辑节点[准备参数]
                executePrepareparam04(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_02":
                //执行逻辑节点[激活规则]
                executeDeaction02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_07":
                //执行逻辑节点[删除人员旧排班]
                executeRawsqlcall07(iDELogicSession, iPSDELogicNode)
                break
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_02":
                //执行逻辑节点[准备参数]
                executePrepareparam02(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_03":
                //执行逻辑节点[循环子调用]
                executeLoopsubcall03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_016":
                //执行逻辑节点[免考勤]
                executeRawsfcode016(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_05":
                //执行逻辑节点[上A休B构造新排班]
                executeRawsfcode05(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[固定排班/灵活打卡构造新排班]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_06":
                //执行逻辑节点[手动排班构造新排班]
                executeRawsfcode06(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_04":
                //执行逻辑节点[计算规则成员]
                executeRawsfcode04(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_014":
                //执行逻辑节点[判断节假日]
                executeRawsfcode014(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_015":
                //执行逻辑节点[判断节假日]
                executeRawsfcode015(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_05":
                //执行逻辑节点[查询当前生效规则成员]
                executeRawsqlcall05(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_01":
                //执行逻辑节点[准备参数]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_01":
                //执行逻辑节点[查询部门下所有人员]
                executeDedataset01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_09":
                //执行逻辑节点[过滤出不在其他生效规则内的人员]
                executeRawsfcode09(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_04":
                //执行逻辑节点[将该部门在其他生效规则内移除]
                executeRawsqlcall04(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_08":
                //执行逻辑节点[准备参数]
                executePrepareparam08(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_01":
                //执行逻辑节点[生成后的新排班]
                executeDebugparam01(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_02":
                //执行逻辑节点[获取所有人员]
                executeDedataset02(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_04":
                //执行逻辑节点[遍历规则人员]
                executeLoopsubcall04(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_07":
                //执行逻辑节点[为规则人员生成新排班]
                executeRawsfcode07(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_04":
                //执行逻辑节点[保存排班]
                executeDeaction04(iDELogicSession, iPSDELogicNode)
                break
            case "RESETPARAM_01":
                //执行逻辑节点[重置参数]
                executeResetparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_012":
                //执行逻辑节点[人员转换]
                executeRawsfcode012(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_06":
                //执行逻辑节点[准备参数]
                executePrepareparam06(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE18":
                //执行逻辑节点[查找需更新的activeRule]
                executeRAWSFCODE18(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL5":
                //执行逻辑节点[遍历需需更新规则]
                executeLOOPSUBCALL5(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_02":
                //执行逻辑节点[删除人员旧排班]
                executeRawsqlcall02(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM7":
                //执行逻辑节点[准备参数]
                executePREPAREPARAM7(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSQLCALL_03":
                //执行逻辑节点[将该人员在其他生效规则内移除]
                executeRawsqlcall03(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION4":
                //执行逻辑节点[实体行为]
                executeDEACTION4(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM8":
                //执行逻辑节点[准备参数]
                executePREPAREPARAM8(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION5":
                //执行逻辑节点[更新rule_data]
                executeDEACTION5(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[删除当前旧激活班次]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSQLCALL8(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[删除当前规则区间旧排班]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall06(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[重新建立参数]，逻辑类型[RENEWPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRenewparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[遍历班次]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLoopsubcall01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[衔接]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM9(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[激活班次]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
            def _default = logic.param('Default').getReal()
			Calendar cal = Calendar.getInstance()
			int currentYear = cal.get(Calendar.YEAR)
			def dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd")
			
			// 设置开始日期为当年第一天
			cal.set(currentYear, Calendar.JANUARY, 1, 0, 0, 0)
			cal.set(Calendar.MILLISECOND, 0)
			Date startOfYear = cal.getTime()
			
			// 设置结束日期为当年最后一天
			cal.set(currentYear, Calendar.DECEMBER, 31, 23, 59, 59)
			cal.set(Calendar.MILLISECOND, 999)
			Date endOfYear = cal.getTime()
			
			// 设置过滤条件（格式化为yyyy-MM-dd）
			
			_default.set("N_DATE_FROM_LTANDEQ", dateFormat.format(endOfYear))
			_default.set("N_DATE_TO_GTANDEQ", dateFormat.format(startOfYear))
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
     * 执行逻辑节点[附加到数组参数]，逻辑类型[APPENDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeAppendparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[计算工时]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def activeShift = logic.param('activeShift').getReal()
			def shift = activeShift.shift_data
			
			// 计算总工时
			int totalWorkLoad = 0
			shift.scopes.each { workPeriod ->
			    // 安全校验时间格式
			    if (workPeriod?.start_base_time && workPeriod?.end_base_time) {
			        def timeToMinutes = { time ->
			        if (time instanceof java.sql.Timestamp) {
			            String timeStr = time.toString().split(' ')[1]
			            def parts = timeStr.split(':')[0..1]
			            return (parts[0].toInteger() * 60) + parts[1].toInteger()
			        }
			        def parts = time.split(':')
			        (parts[0].toInteger() * 60) + parts[1].toInteger()
			    }
			        def start = timeToMinutes(workPeriod.start_base_time)
			        def end = timeToMinutes(workPeriod.end_base_time)
			        if (start >= end) {
			            totalWorkLoad += (24 * 60 - start + end);
			        }else {
			            totalWorkLoad += (end - start);
			        }
			    }
			}
			
			shift.work_load = totalWorkLoad
			// shift.scopes = null
			shift.set("work_times",shift.scopes)
			
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
    private void executePrepareparam07(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[绑定参数]，逻辑类型[BINDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBindparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
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
     * 执行逻辑节点[构造节假日]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode018(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def curRldata = logic.param('curRldata').getReal()
			
			def lastRldata = logic.param('lastRldata').getReal()
			
			if(curRldata){
			    // 添加日期格式化工具
			    def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			
			    // 获取当前年份的第一天和最后一天
			    def currentYear = java.time.Year.now().value
			    def firstDayOfYear = java.time.LocalDate.of(currentYear, 1, 1)
			    def lastDayOfYear = java.time.LocalDate.of(currentYear, 12, 31)
			
			    curRldata.each{ i ->
			        // 解析日期范围
			        def startDate = i.get("date_from")
			        def endDate = i.get("date_to")
			
			        if (startDate && endDate) {
			            // 日期范围截断逻辑
			            if(startDate && !startDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().isAfter(firstDayOfYear)){
			                startDate = java.sql.Timestamp.valueOf(firstDayOfYear.atStartOfDay())
			            }
			            if(endDate && endDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().isAfter(lastDayOfYear)){
			                endDate = java.sql.Timestamp.valueOf(lastDayOfYear.atTime(23,59,59))
			            }
			
			            // 将Timestamp转换为LocalDate
			            java.time.LocalDate start = startDate.toInstant()
			                .atZone(java.time.ZoneId.systemDefault())
			                .toLocalDate()
			
			            java.time.LocalDate end = endDate.toInstant()
			                .atZone(java.time.ZoneId.systemDefault())
			                .toLocalDate()
			
			            // 使用循环逐日增加
			            while (!start.isAfter(end)) {
			                def restday = sys.entity('resource_calendar_leaves')
			                restday.set("date", sdf.format(Date.from(start.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant())))
			                restday.set("name", i.get("name"))
			                lastRldata.add(restday)
			                // 增加一天
			                start = start.plusDays(1)
			            }
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
     * 执行逻辑节点[调试逻辑参数]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[生效日期转换]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode017(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def effect_time = _default.get("effect_time")
			if (effect_time instanceof String) {
			    def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd 00:00:00")
			    _default.set("effect_time", sdf.parse(effect_time))
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
			
			def group_shift = logic.param('group_shift').getReal()
			def workdays = group_shift.get("workdays")
			
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			def endCal = Calendar.getInstance()
			endCal.add(Calendar.MONTH, 1)
			endCal.set(Calendar.DAY_OF_MONTH, endCal.getActualMaximum(Calendar.DAY_OF_MONTH))
			
			 //限制生成区间
			def limitTime = _default.get("limitTime")
			def limitCal = Calendar.getInstance()
			if(limitTime ){
			    if (limitTime instanceof String) {
			        limitCal.setTime(sdf.parse(limitTime))
			    } else {
			        limitCal.setTime(limitTime)
			    }
			}
			
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
			
			    if(limitTime && startCal.before(limitCal)){
			        startCal.add(Calendar.DAY_OF_MONTH, 1)
			        continue 
			    }
			
			    Date checkinDate = startCal.getTime()
			    long offsetMillis = checkinDate.time - baseDate.time
			    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
			    int dayInCycle = (offsetDays % inversion_days) + 1
			
			    def workdayConfig = cycleMap[dayInCycle]
			    if (workdayConfig) {
			        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
			        def shiftData = shift?.shift_data ?: [:]
			        def workTime = shiftData?.get("work_times") ?: []
			
			        def schedule = sys.entity('attendance_schedule')
			        schedule.rule_data = activeRule.rule_data
			        schedule.rule_name = activeRule.name
			        schedule.rule_id = activeRule.id
			        schedule.checkin_date = sdf.format(checkinDate)
			        schedule.shift_data = shiftData
			        schedule.work_time = workTime
			        schedule.workday = shiftData ? 1 : 0
			        newSchedules.add(schedule)
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
			def group_shift = logic.param('group_shift').getReal()
			def workdays = group_shift.get("workdays")
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			 
			  //限制生成区间
			def limitTime = _default.get("limitTime")
			def limitCal = Calendar.getInstance()
			if(limitTime ){
			    if (limitTime instanceof String) {
			        limitCal.setTime(sdf.parse(limitTime))
			    } else {
			        limitCal.setTime(limitTime)
			    }
			}
			
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
			    
			    if(limitTime && startCal.before(limitCal)){
			        startCal.add(Calendar.DAY_OF_MONTH, 1)
			        continue 
			    }
			
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
			        def workTime = shift_data?.get("work_times") ?: null
			
			        def schedule = sys.entity('attendance_schedule')
			        schedule.rule_data = activeRule.get("rule_data")
			        schedule.rule_name = activeRule.get("name")
			        schedule.rule_id = activeRule.get("id")
			        schedule.checkin_date =  sdf.format(checkinDate)
			        schedule.shift_data = shift_data
			        schedule.work_time = workTime
			        schedule.workday = shift_data != null ? 1 : 0 
			        newSchedules.add(schedule)
			
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
			def workdays = _default.get("workdays")
			//大小周
			def biweekly_cycle = _default.get("biweekly_cycle")
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			
			 //限制生成区间
			def limitTime = _default.get("limitTime")
			def limitCal = Calendar.getInstance()
			if(limitTime ){
			    if (limitTime instanceof String) {
			        limitCal.setTime(sdf.parse(limitTime))
			    } else {
			        limitCal.setTime(limitTime)
			    }
			}
			 
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
			    if(limitTime && startCal.before(limitCal)){
			        startCal.add(Calendar.DAY_OF_MONTH, 1)
			        continue 
			    }
			    def checkinDate = startCal.getTime()
			    def shift_data = generateShiftData(checkinDate, workdays, activeShifts)
			    def workTime = shift_data?.get("work_times") ?: null
			
			    def schedule = sys.entity('attendance_schedule')
			    schedule.rule_data = activeRule.get("rule_data")
			    schedule.rule_name = activeRule.get("name")
			    schedule.rule_id = activeRule.get("id")
			    schedule.checkin_date =  sdf.format(checkinDate)
			    if(shift_data){
			        shift_data.name = "白班"
			    }
			    schedule.shift_data = shift_data
			    schedule.work_time = workTime
			    schedule.workday = shift_data != null ? 1 : 0 
			    // schedule.id = UUID.randomUUID().toString() 
			
			    newSchedules.add(schedule)
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
			def effect_time = _default.get("effect_time")
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			
			 //限制生成区间
			def limitTime = _default.get("limitTime")
			def limitCal = Calendar.getInstance()
			if(limitTime ){
			    if (limitTime instanceof String) {
			        limitCal.setTime(sdf.parse(limitTime))
			    } else {
			        limitCal.setTime(limitTime)
			    }
			}
			 
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
			
			// 遍历日期区间
			while (!startCal.after(endCal)) {
			    
			    if(limitTime && startCal.before(limitCal)){
			        startCal.add(Calendar.DAY_OF_MONTH, 1)
			        continue 
			    }
			        
			    def checkinDate = startCal.getTime()
			    def shift_data = activeShifts[0].shift_data
			    def workTime = shift_data?.get("work_times") ?: null
			
			    def schedule = sys.entity('attendance_schedule')
			    schedule.rule_data = activeRule.get("rule_data")
			    schedule.rule_name = activeRule.get("name")
			    schedule.rule_id = activeRule.get("id")
			    schedule.checkin_date =  sdf.format(checkinDate)
			    schedule.shift_data = shift_data
			    schedule.work_time = workTime
			    schedule.workday = shift_data != null ? 1 : 0 
			    // schedule.id = UUID.randomUUID().toString() 
			
			    newSchedules.add(schedule)
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
    private void executePrepareparam04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[激活规则]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[删除人员旧排班]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall07(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
			def effect_time = _default.get("effect_time")
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			
			 //限制生成区间
			def limitTime = _default.get("limitTime")
			def limitCal = Calendar.getInstance()
			if(limitTime ){
			    if (limitTime instanceof String) {
			        limitCal.setTime(sdf.parse(limitTime))
			    } else {
			        limitCal.setTime(limitTime)
			    }
			}
			 
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
			
			// 遍历日期区间
			while (!startCal.after(endCal)) {
			    
			    if(limitTime && startCal.before(limitCal)){
			        startCal.add(Calendar.DAY_OF_MONTH, 1)
			        continue 
			    }
			
			    def checkinDate = startCal.getTime()
			
			    def schedule = sys.entity('attendance_schedule')
			    schedule.rule_name = activeRule.get("name")
			    schedule.rule_id = activeRule.get("id")
			    schedule.checkin_date =  sdf.format(checkinDate)
			    schedule.workday = 0
			
			    newSchedules.add(schedule)
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
			
			def rest = _default.get("rest")
			def work = _default.get("work")
			
			def group_shift = logic.param('group_shift').getReal()
			def workdays = group_shift.get("workdays")
			
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			def endCal = Calendar.getInstance()
			endCal.add(Calendar.MONTH, 1)
			endCal.set(Calendar.DAY_OF_MONTH, endCal.getActualMaximum(Calendar.DAY_OF_MONTH))
			
			 //限制生成区间
			def limitTime = _default.get("limitTime")
			def limitCal = Calendar.getInstance()
			if(limitTime ){
			    if (limitTime instanceof String) {
			        limitCal.setTime(sdf.parse(limitTime))
			    } else {
			        limitCal.setTime(limitTime)
			    }
			}
			
			def startCal = Calendar.getInstance()
			startCal.setTime(effect_time)
			startCal.set(Calendar.HOUR_OF_DAY, 0)
			startCal.set(Calendar.MINUTE, 0)
			startCal.set(Calendar.SECOND, 0)
			startCal.set(Calendar.MILLISECOND, 0)
			
			// 核心逻辑：构建天数循环映射
			def workdayNum = rest+work;
			def cycleMap = [:]
			workdays.eachWithIndex { workday, index ->
			    if (index + 1 <= workdayNum) {
			        cycleMap[(index + 1)] = workday
			    }
			}
			
			// 基准日设置
			Date baseDate = startCal.getTime()
			while (!startCal.after(endCal)) {
			
			    if(limitTime && startCal.before(limitCal)){
			        startCal.add(Calendar.DAY_OF_MONTH, 1)
			        continue 
			    }
			
			    Date checkinDate = startCal.getTime()
			    long offsetMillis = checkinDate.time - baseDate.time
			    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
			    int dayInCycle = (offsetDays % workdayNum) + 1
			
			    def workdayConfig = cycleMap[dayInCycle]
			    if (workdayConfig) {
			        def shift = workdayConfig.get("is_work") == 1 ? activeShifts[0] : null
			        def shiftData = shift?.shift_data ?: [:]
			        def workTime = shiftData?.get("work_times") ?: []
			
			        def schedule = sys.entity('attendance_schedule')
			        schedule.rule_data = activeRule.rule_data
			        schedule.rule_name = activeRule.name
			        schedule.rule_id = activeRule.id
			        schedule.checkin_date = sdf.format(checkinDate)
			        schedule.shift_data = shiftData
			        schedule.work_time = workTime
			        schedule.workday = shiftData ? 1 : 0
			        newSchedules.add(schedule)
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
			
			def effect_time = _default.get("effect_time")
			def workdays = _default.get("workdays")
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			
			 //限制生成区间
			def limitTime = _default.get("limitTime")
			def limitCal = Calendar.getInstance()
			if(limitTime != null && limitTime !=""){
			    println("limitTime"+limitTime)
			    if (limitTime instanceof String) {
			        limitCal.setTime(sdf.parse(limitTime))
			    } else {
			        limitCal.setTime(limitTime)
			    }
			}
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
			startCal.setTime(effect_time)
			
			// 解析结束日期
			def endCal = Calendar.getInstance()
			endCal.setTime(sdf.parse(endDate))
			
			// 遍历日期区间
			while (!startCal.after(endCal)) {
			
			    if(limitTime && startCal.before(limitCal)){
			        startCal.add(Calendar.DAY_OF_MONTH, 1)
			        continue
			    }
			    def checkinDate = startCal.getTime()
			    def shift_data = generateShiftData(checkinDate, workdays, activeShifts)
			    def workTime = shift_data?.get("work_times") ?: null
			
			    def schedule = sys.entity('attendance_schedule')
			    schedule.rule_data = activeRule.get("rule_data")
			    schedule.rule_name = activeRule.get("name")
			    schedule.rule_id = activeRule.get("id")
			    schedule.checkin_date =  sdf.format(checkinDate)
			    schedule.shift_data = shift_data
			    schedule.work_time = workTime
			    schedule.workday = shift_data != null ? 1 : 0
			    // schedule.id = UUID.randomUUID().toString()
			
			    newSchedules.add(schedule)
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
			def effect_time = _default.get("effect_time")
			def workdays = _default.get("workdays")
			
			// 获取当前日期
			def now = new Date()
			def calendar = Calendar.getInstance()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			calendar.setTime(now)
			
			  //限制生成区间
			def limitTime = _default.get("limitTime")
			def limitCal = Calendar.getInstance()
			if(limitTime ){
			    if (limitTime instanceof String) {
			        limitCal.setTime(sdf.parse(limitTime))
			    } else {
			        limitCal.setTime(limitTime)
			    }
			}
			
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
			
			// 遍历日期区间
			while (!startCal.after(endCal)) {
			
			    if(limitTime && startCal.before(limitCal)){
			        startCal.add(Calendar.DAY_OF_MONTH, 1)
			        continue 
			    }    
			    
			    def checkinDate = startCal.getTime()
			
			    def schedule = sys.entity('attendance_schedule')
			    schedule.rule_data = activeRule.get("rule_data")
			    schedule.rule_name = activeRule.get("name")
			    schedule.rule_id = activeRule.get("id")
			    schedule.checkin_date =  sdf.format(checkinDate)
			    // schedule.id = UUID.randomUUID().toString() 
			
			    newSchedules.add(schedule)
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
     * 执行逻辑节点[计算规则成员]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def group_shifts = logic.param('group_shifts').getReal()
			def members = logic.param('members').getReal()
			def depts = logic.param('depts').getReal()
			
			def uniqueMemberIdMap = new HashMap()
			def uniqueDeptIdMap = new HashMap()
			
			def _default = logic.param('Default').getReal()
			if(group_shifts!=null && _default.schedule_type != "class_inversion" && _default.schedule_type != "work_rest" ){
			    group_shifts.each{ group_shift ->
			        if (group_shift.members != null) {
			            group_shift.members.each { member ->
			                if(member.type == "person"){
			                    uniqueMemberIdMap.put(member.user_id, member)
			                }
			                if(member.type == "dept"){
			                    uniqueDeptIdMap.put(member.user_id, member)
			                }
			            }
			        }
			    }
			}else{
			    def group_members = logic.param('group_members').getReal()
			    group_members.each { member ->
			        if(member.type == "person"){
			            uniqueMemberIdMap.put(member.user_id, member)
			        }
			        if(member.type == "dept"){
			            uniqueDeptIdMap.put(member.user_id, member)
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
     * 执行逻辑节点[判断节假日]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode014(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def newSchedules = logic.param('newSchedules').getReal()
			def holidays = logic.param('lastRldata').getReal()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			
			if (newSchedules && newSchedules.size() > 0 && holidays && holidays.size() > 0){
			    newSchedules.each { schedule ->
			        def checkin_date = sdf.format(schedule.checkin_date)
			        def holiday = holidays.find { it.get("date") == checkin_date }
			        if(holiday != null ){
			            schedule.shift_data = null
			            schedule.work_time = null
			            schedule.workday = 0
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
     * 执行逻辑节点[判断节假日]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode015(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def newSchedules = logic.param('newSchedules').getReal()
			def holidays = logic.param('lastRldata').getReal()
			def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
			
			if (newSchedules && newSchedules.size() > 0 && holidays && holidays.size() > 0){
			    newSchedules.each { schedule ->
			        def checkin_date = sdf.format(schedule.checkin_date)
			        def holiday = holidays.find { it.get("date") == checkin_date }
			        if(holiday != null ){
			            schedule.shift_data = null
			            schedule.work_time = null
			            schedule.workday = 0
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
     * 执行逻辑节点[查询部门下所有人员]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
			    def isAlreadyActive = curActiveMember.find { it.get("member_id") == emp.id }
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
     * 执行逻辑节点[将该部门在其他生效规则内移除]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam08(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[生成后的新排班]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
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
     * 执行逻辑节点[遍历规则人员]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLoopsubcall04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
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
			    newSchedules.each { schedule ->
			        def newSchedule = sys.entity('attendance_schedule')
			        schedule.copyTo(newSchedule)
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
    private void executePrepareparam06(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[查找需更新的activeRule]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE18(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def curActiveMember = logic.param('curActiveMember').getReal()
			def members = logic.param('members').getReal()
			def changes = logic.param('changes').getReal()
			
			def ruleIdSet = members.collect { member ->
			    curActiveMember.findResult(null) { it.get("member_id") == member.user_id ? it.get("rule_id") : null }
			}.findAll { it != null }.toSet()
			
			ruleIdSet.each { ruleId ->
			    def newRule = sys.entity('attendance_activate_rule')
			    newRule.set('id', ruleId)
			    changes.add(newRule)
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
     * 执行逻辑节点[遍历需需更新规则]，逻辑类型[LOOPSUBCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeLOOPSUBCALL5(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM7(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[将该人员在其他生效规则内移除]，逻辑类型[RAWSQLCALL]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsqlcall03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[实体行为]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM8(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[更新rule_data]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION5(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

