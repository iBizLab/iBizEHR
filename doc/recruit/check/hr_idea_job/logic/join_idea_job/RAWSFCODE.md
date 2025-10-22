<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
// 获取默认参数
def _default = logic.param('Default').getReal()

String ideaID = _default.get('hr_idea')
// 直接获取srfactionparam为List<Map>，无需转换为IEntityDTO
List<Map> srfactionparam = _default.get('srfactionparam')
Map actionParam = srfactionparam.get(0) // 取第一个元素（Map类型）

// 从Map中直接获取reviewer_user_ids字段
String reviewerUserIds = actionParam.get('name')

// 解析JSON并提取id列表
def jsonSlurper = new groovy.json.JsonSlurper()
def list = jsonSlurper.parseText(reviewerUserIds)
def ids = list.collect { it.id } // 提取所有id

// 创建主表实体
def hrIdeaJobRuntime = sys.dataentity('HR_IDEA_JOB')

ids.each { id ->
    def hrIdeaJobEntity = hrIdeaJobRuntime.createEntity()
    hrIdeaJobEntity.set("Idea_id", ideaID)
    hrIdeaJobEntity.set("Job_id", id)
    hrIdeaJobRuntime.save(hrIdeaJobEntity)
}
```
