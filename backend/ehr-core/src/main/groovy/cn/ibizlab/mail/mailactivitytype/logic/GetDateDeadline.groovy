package cn.ibizlab.mail.mailactivitytype.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[MAIL_ACTIVITY_TYPE]处理逻辑[获取到期日期]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class GetDateDeadline extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(GetDateDeadline.class)

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
            case "COPYPARAM_01":
                //执行逻辑节点[拷贝参数]
                executeCopyparam01(iDELogicSession, iPSDELogicNode)
                break
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[生成到期日期]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_01":
                //执行逻辑节点[获取活动类型]
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
     * 执行逻辑节点[拷贝参数]，逻辑类型[COPYPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeCopyparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[生成到期日期]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def defaultObj = logic.param('default').getReal();
			def originalDefault = logic.param('original_default').getReal();
			def delayFrom=defaultObj.get('delay_from');
			def activityPreviousDeadline=originalDefault.get('activity_previous_deadline');
			def delayUnit=defaultObj.get('delay_unit');
			def delayCount=defaultObj.get('delay_count');
			def chronoUnit;
			def actualDeadline;
			
			if(delayUnit == 'days' ) {
			    chronoUnit = java.time.temporal.ChronoUnit.DAYS
			} 
			else if(delayUnit == 'weeks' ) {
			    chronoUnit = java.time.temporal.ChronoUnit.WEEKS
			}
			else if(delayUnit == 'months' ) {
			    chronoUnit = java.time.temporal.ChronoUnit.MONTHS
			}
			else if(delayUnit == 'years' ) {
			    chronoUnit = java.time.temporal.ChronoUnit.YEARS
			}
			
			if(delayFrom == 'previous_activity' && activityPreviousDeadline){
			    def deadLineTime = new java.sql.Timestamp(net.ibizsys.runtime.util.DateUtils.getTime(activityPreviousDeadline));
			    java.time.LocalDate deadLineDate = deadLineTime.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
			    actualDeadline = deadLineDate.plus(delayCount, chronoUnit);
			}else{
			    def curTime = net.ibizsys.runtime.util.DateUtils.getCurTime();
			    java.time.LocalDate localDate = curTime.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
			    actualDeadline = localDate.plus(delayCount, chronoUnit);
			}
			
			defaultObj.set('actual_deadline',actualDeadline);
			println("actual_deadline值："+actualDeadline);
			
			
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
     * 执行逻辑节点[获取活动类型]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

