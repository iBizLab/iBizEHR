package cn.ibizlab.mail.mailactivity.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[MAIL_ACTIVITY]处理逻辑[完成活动]运行时对象
 * 此代码用户功能扩展代码
 *
 * 1.根据活动类型的keep_done判断活动是归档还是删除;
2.生成活动完成消息到message；
3.活动关联的附件换绑：
由绑定活动改绑成绑定消息
4.当活动类型的链接类型=trigger,生成下一个活动
5.最后返回下一个活动的id,因为"完成并下一个界面行为"需要id来判断是否重新打开新建活动页面


 */
class ActionDone extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(ActionDone.class)

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
            case "DEBUGPARAM_03":
                //执行逻辑节点[查看默认]
                executeDebugparam03(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_02":
                //执行逻辑节点[准备活动类型参数]
                executePrepareparam02(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_04":
                //执行逻辑节点[获取触发活动类型数据]
                executeDeaction04(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_01":
                //执行逻辑节点[获取活动类型对象]
                executeDeaction01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_03":
                //执行逻辑节点[准备下一个活动参数]
                executePrepareparam03(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_04":
                //执行逻辑节点[准备触发活动类型参数]
                executePrepareparam04(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_01":
                //执行逻辑节点[准备附件参数]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_03":
                //执行逻辑节点[生成message]
                executeRawsfcode03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[填充message数据]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_010":
                //执行逻辑节点[获取到期日期]
                executeDeaction010(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_01":
                //执行逻辑节点[获取当前活动的所有附件]
                executeDedataset01(iDELogicSession, iPSDELogicNode)
                break
            case "LOOPSUBCALL_01":
                //执行逻辑节点[循环子调用]
                executeLoopsubcall01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_09":
                //执行逻辑节点[到期日期参数]
                executePrepareparam09(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[准备归档参数]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_03":
                //执行逻辑节点[删除活动数据]
                executeDeaction03(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_02":
                //执行逻辑节点[归档]
                executeDeaction02(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_01":
                //执行逻辑节点[查看下一个活动]
                executeDebugparam01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_07":
                //执行逻辑节点[准备下一个活动参数]
                executePrepareparam07(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_05":
                //执行逻辑节点[准备附件换绑参数]
                executePrepareparam05(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_08":
                //执行逻辑节点[生成下一个活动]
                executeDeaction08(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION_05":
                //执行逻辑节点[换绑到消息]
                executeDeaction05(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_02":
                //执行逻辑节点[最后返回的活动]
                executeDebugparam02(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_06":
                //执行逻辑节点[准备参数]
                executePrepareparam06(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_010":
                //执行逻辑节点[准备参数]
                executePrepareparam010(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[查看默认]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备活动类型参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取触发活动类型数据]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取活动类型对象]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备下一个活动参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备触发活动类型参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备附件参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[生成message]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            //Groovy
			def defaultObj = logic.param('default').getReal();
			println("defaultObj数据"+defaultObj);
			def mailMessageObj  = logic.param('mail_message').getReal();
			// 从参数对象获取model属性值
			def modelName = defaultObj.get("srfmodelname")?: defaultObj.get("res_model");
			// 通过系统运行时获取实体运行时对象
			def deRuntime = sys.dataentity(modelName)
			if(deRuntime == null){
			    throw new Exception(String.format("消息实体异常"));
			}
			
			def messagePostMethod = "message_post_with_source"
			Object[] args = [mailMessageObj];
			deRuntime.executeAction(messagePostMethod,null,args)
			
			
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
     * 执行逻辑节点[填充message数据]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def defaultObj = logic.param('default').getReal();
			def mailMessageObj  = logic.param('mail_message').getReal();
			
			def activityTypeName=defaultObj.get('activity_type_name');
			def activityTypeId=defaultObj.get('activity_type_id');
			def userName=defaultObj.get('user_name');
			def userId=defaultObj.get('user_id');
			def srfuserid=defaultObj.get('srfuserid');
			def summary=defaultObj.get('summary');
			def note=defaultObj.get('note');
			
			//反馈内容
			def feedBack=defaultObj.get('feedback');
			//当前登录用户id
			def srfPartnerId=defaultObj.get('srfpartnerid');
			
			// def mailActivityMxin=defaultObj.get('mail_activity_mixin');
			// def srfModelName=defaultObj.get('srfmodelname');
			def mailActivityMxin=defaultObj.get('mail_activity_mixin')?: defaultObj.get("res_id");
			def srfModelName=defaultObj.get('srfmodelname')?: defaultObj.get("res_model");
			
			
			def displayAssignee = (userId != srfuserid);
			
			def body = activityTypeName + '\t 完成' + 
			    (displayAssignee ? '（最初分配给 ' + userName + '）' : '') +
			    (summary ? ':' + summary : '');
			
			def notePart = note ? '\t\n原始备注:\n' + note: '';
			notePart = notePart?.replaceAll(/<\/?p>/, '') ?: ''
			def feedbackPart = feedBack ? '\t\n反馈:\n' + feedBack : '';
			
			body += notePart + feedbackPart;    
			
			mailMessageObj.set('body',body);
			mailMessageObj.set('author_id',srfPartnerId);
			mailMessageObj.set('mail_activity_type_id',activityTypeId);
			mailMessageObj.set('res_id',mailActivityMxin);
			mailMessageObj.set('model',srfModelName);
			
			  
			 println("mailMessageObj"+mailMessageObj);
			
			
			
			
			
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
     * 执行逻辑节点[获取到期日期]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction010(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取当前活动的所有附件]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[到期日期参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam09(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备归档参数]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def defaultObj = logic.param('default').getReal();
			def sqlTimestamp = new java.sql.Timestamp(System.currentTimeMillis());
			
			defaultObj.set('date_done',sqlTimestamp);
			defaultObj.set('active',0);
			
			 println("归档defaultObj"+defaultObj);
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
     * 执行逻辑节点[删除活动数据]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[归档]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[查看下一个活动]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备下一个活动参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam07(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备附件换绑参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[生成下一个活动]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction08(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[换绑到消息]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDeaction05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[最后返回的活动]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam010(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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

