package cn.ibizlab.attendance.attendanceschedule.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENDANCE_SCHEDULE]处理逻辑[搜索月份]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class SearchMonth extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(SearchMonth.class)

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
            case "RAWSFCODE1":
                //执行逻辑节点[获取最近五个月的月份]
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
     * 执行逻辑节点[获取最近五个月的月份]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def result_list = logic.param('result_list').getReal()
			
			// 获取当前日期
			def currentDate = new Date()
			
			// 设置日期格式
			def dateFormat = new java.text.SimpleDateFormat("yyyy-MM")
			
			// 获取当前年月字符串
			def cur_month = dateFormat.format(currentDate)
			def cur_month_map = new HashMap()
			cur_month_map.put('name', cur_month)
			
			// 获取当前日期的 Calendar 实例
			def calendar = java.util.Calendar.getInstance()
			calendar.setTime(currentDate)
			
			// 获取前3个月
			for (int i = 3; i >= 1; i--) {
			    calendar.setTime(currentDate)
			    calendar.add(Calendar.MONTH, -i)
			    def month_map = new HashMap()
			    month_map.put('name', dateFormat.format(calendar.getTime()))
			    result_list.add(month_map)
			}
			result_list.add(cur_month_map)
			// 获取后1个月
			calendar.setTime(currentDate) // 重置为当前日期
			calendar.add(Calendar.MONTH, 1)
			def next_month = dateFormat.format(calendar.getTime())
			def next_month_map = new HashMap()
			next_month_map.put('name', next_month)
			result_list.add(next_month_map)
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

