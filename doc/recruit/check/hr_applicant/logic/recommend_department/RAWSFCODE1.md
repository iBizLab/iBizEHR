<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
// 获取默认参数
def _default = logic.param('Default').getReal()

// 直接获取srfactionparam为List<Map>，无需转换为IEntityDTO
List<Map> srfactionparam = _default.get('srfactionparam')
Map actionParam = srfactionparam.get(0) // 取第一个元素（Map类型）

// 从Map中直接获取reviewer_user_ids字段
String reviewerUserIds = actionParam.get('reviewer_user_ids')

// 解析JSON并提取id列表
def jsonSlurper = new groovy.json.JsonSlurper()
def list = jsonSlurper.parseText(reviewerUserIds)
def ids = list.collect { it.id } // 提取所有id

// 输出结果
println "提取的id列表："
ids.each { println it }

// 从Map中获取其他字段
String applicant_id = actionParam.get('applicant_id')
String type = actionParam.get('type')
String memo = actionParam.get('memo')

// 创建主表实体
def hrCandidateFilterRuntime = sys.dataentity('hr_candidate_filter')
def hrCandidateFilterEntity = hrCandidateFilterRuntime.createEntity()
hrCandidateFilterEntity.set("applicant_id", applicant_id)
hrCandidateFilterEntity.set("type", type)
hrCandidateFilterRuntime.create(hrCandidateFilterEntity)

// 创建明细表实体
def hrCandidateFilterDetailRuntime = sys.dataentity('hr_candidate_filter_detail')
String candidateFilterId = hrCandidateFilterEntity.get("id")

ids.each { id ->
    def hrCandidateFilterDetailEntity = hrCandidateFilterDetailRuntime.createEntity()
    hrCandidateFilterDetailEntity.set("candidate_filter_id", candidateFilterId)
    hrCandidateFilterDetailEntity.set("memo", memo)
    hrCandidateFilterDetailEntity.set("user_id", id)
    hrCandidateFilterDetailEntity.set("applicant_id", applicant_id)
    hrCandidateFilterDetailRuntime.save(hrCandidateFilterDetailEntity)
}

```
