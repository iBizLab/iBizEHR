package cn.ibizlab.hr.hrcandidatefilter.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[HR_CANDIDATE_FILTER]处理逻辑[推荐给用人部门]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class RecommendDepartment extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(RecommendDepartment.class)

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
                //执行逻辑节点[执行脚本代码]
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
     * 执行逻辑节点[执行脚本代码]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
             // 获取默认参数
			    def _default = logic.param('Default').getReal()
			
			    String reviewerUserIds = _default.get('reviewer_user_ids')
			
			// 解析JSON并提取id列表
			    def jsonSlurper = new groovy.json.JsonSlurper()
			    def list = jsonSlurper.parseText(reviewerUserIds)
			    def ids = list.collect { it.id } // 提取所有id
			
			    String applicant_id = _default.get('applicant_id')
			    String type = _default.get('type')
			    String memo = _default.get('memo')
			
			    def id = _default.get("id")
			// 创建主表实体
			    def hrCandidateFilterRuntime = sys.dataentity('hr_candidate_filter')
			    def hrCandidateFilterEntity = hrCandidateFilterRuntime.createEntity()
			    hrCandidateFilterEntity.set("applicant_id", applicant_id)
			    hrCandidateFilterEntity.set("type", type)
			    hrCandidateFilterEntity.set("reviewer_user_ids", reviewerUserIds)
			    hrCandidateFilterEntity.set("id", id)
			    hrCandidateFilterEntity.set("memo", memo)
			    hrCandidateFilterRuntime.save(hrCandidateFilterEntity)
			
			// 创建明细表实体
			    def hrCandidateFilterDetailRuntime = sys.dataentity('hr_candidate_filter_detail')
			    String candidateFilterId = hrCandidateFilterEntity.get("id")
			
			    ids.each { userid ->
			        def hrDetailFilter = hrCandidateFilterDetailRuntime.filter()
			        hrDetailFilter.eq("candidate_filter_id", candidateFilterId)
			        hrDetailFilter.eq("user_id", userid)
			        hrDetailFilter.eq("applicant_id", applicant_id)
			        def hrCandidateFilterDetailList = hrCandidateFilterDetailRuntime.select(hrDetailFilter)
			        if (hrCandidateFilterDetailList.size() > 0) {
			            return
			        }
			
			        def hrCandidateFilterDetailEntity = hrCandidateFilterDetailRuntime.createEntity()
			        hrCandidateFilterDetailEntity.set("candidate_filter_id", candidateFilterId)
			        hrCandidateFilterDetailEntity.set("memo", memo)
			        hrCandidateFilterDetailEntity.set("user_id", userid)
			        hrCandidateFilterDetailEntity.set("applicant_id", applicant_id)
			        hrCandidateFilterDetailRuntime.save(hrCandidateFilterDetailEntity)
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
    private void executeEND1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

