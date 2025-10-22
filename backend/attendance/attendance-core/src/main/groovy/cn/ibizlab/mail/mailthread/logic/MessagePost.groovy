package cn.ibizlab.mail.mailthread.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[MAIL_THREAD]处理逻辑[message_post]运行时对象
 * 此代码用户功能扩展代码
 *
 * //TODO
待完善消息发送逻辑，目前简单构造消息并新建
注意忽略传入的
res_id、model等，由继承实体提取写入
 */
class MessagePost extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(MessagePost.class)

    @Override
	protected void onInit() throws Exception {
		super.onInit()
	}

    @Override
    protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        switch (iPSDELogicNode.getCodeName()) {
            default:
                super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode)
        }
    }
}

