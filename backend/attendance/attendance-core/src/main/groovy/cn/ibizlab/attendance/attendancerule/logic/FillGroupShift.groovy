package cn.ibizlab.attendance.attendancerule.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENDANCE_RULE]处理逻辑[填充组排班]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class FillGroupShift extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(FillGroupShift.class)

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
            case "PREPAREPARAM_02":
                //执行逻辑节点[准备参数]
                executePrepareparam02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_04":
                //执行逻辑节点[N班倒-休息日相同]
                executeRawsfcode04(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_01":
                //执行逻辑节点[准备组排班数据]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_03":
                //执行逻辑节点[上A休B/N班倒-休息日不同]
                executeRawsfcode03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[生成标识]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
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
    private void executePrepareparam02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[N班倒-休息日相同]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			
			def groupShifts = _default.get("group_shifts")
			
			def group_num = _default.group_num ?: 2
			
			def inversion_cycle = _default.get("inversion_cycle")
			def workdays = _default.get("workdays")
			
			def week1 = _default.get("week1")?:""
			def week2 = _default.get("week2")?:""
			def week3 = _default.get("week3")?:""
			def week4 = _default.get("week4")?:""
			
			// 将week字符串转换为数字集合
			def getWeekSet = { weekStr ->
			    weekStr?.tokenize(',')*.toInteger() as Set
			}
			
			def weekSet1 = getWeekSet(week1)
			def weekSet2 = getWeekSet(week2)
			def weekSet3 = getWeekSet(week3)
			def weekSet4 = getWeekSet(week4)
			
			// 根据 inversion_cycle 计算阈值并筛选工作日
			def filteredWorkdays = []
			Set<Integer> selectionSet = []
			switch (inversion_cycle) {
			    case 1:
			        selectionSet.addAll(weekSet1)
			        filteredWorkdays = workdays.findAll { it.day_number < 8 }
			        break
			    case 2:
			        selectionSet.addAll(weekSet1 + weekSet2)
			        filteredWorkdays = workdays.findAll { it.day_number < 15 }
			        break
			    case 3:
			        selectionSet.addAll(weekSet1 + weekSet2 + weekSet3)
			        filteredWorkdays = workdays.findAll { it.day_number < 22 }
			
			        break
			    case 4:
			        selectionSet.addAll(weekSet1 + weekSet2 + weekSet3 + weekSet4)
			        filteredWorkdays = workdays 
			        break
			}
			filteredWorkdays = filteredWorkdays.sort { a, b -> a.day_number <=> b.day_number }
			
			final WEEK_DAYS = ['周一', '周二', '周三', '周四', '周五', '周六', '周日']
			
			filteredWorkdays.each { day ->
			    def offset = (day.day_number - 8 + 7) % 7
			    day.set("name", WEEK_DAYS[offset])
			    day.set("is_work", selectionSet.contains(day.day_number) ? 1 : 0)
			}
			
			(1..group_num).each { i ->
			    def new_group = sys.entity('attendance_group_shift')
			    if (new_group) {
			        new_group.schedule_type = _default.get("schedule_type")
			        new_group.rule_id = _default.get("id")
			        new_group.workdays = filteredWorkdays
			        new_group.all_company = false
			        new_group.order_num = i
			        groupShifts.add(new_group)
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
     * 执行逻辑节点[准备组排班数据]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[上A休B/N班倒-休息日不同]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			
			def groupShifts = _default.get("group_shifts")
			
			def group_num = _default.group_num ?: 2
			def workdays = _default.get("workdays")
			
			(1..group_num).each { i ->
			    def new_group = sys.entity('attendance_group_shift')
			    if (new_group) {
			        new_group.schedule_type = _default.get("schedule_type")
			        new_group.rule_id = _default.get("id")
			        new_group.workdays = workdays
			        new_group.all_company = false
			        new_group.order_num = i
			        groupShifts.add(new_group)
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
     * 执行逻辑节点[生成标识]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def groupShifts = logic.param('groupShifts').getReal()
			
			groupShifts.each { group ->
			    if (group == null) return
			    logic.param('groupShifts').getDataEntityRuntime().fillEntityKeyValue(group)
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
}

