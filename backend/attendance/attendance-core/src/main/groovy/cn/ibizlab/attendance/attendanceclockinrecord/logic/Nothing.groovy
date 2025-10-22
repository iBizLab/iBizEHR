package cn.ibizlab.attendance.attendanceclockinrecord.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENDANCE_CLOCK_IN_RECORD]处理逻辑[无操作]运行时对象
 * 此代码用户功能扩展代码
 *
 * 无操作逻辑，用于替换表单的获取数据行为
 */
class Nothing extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(Nothing.class)

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

