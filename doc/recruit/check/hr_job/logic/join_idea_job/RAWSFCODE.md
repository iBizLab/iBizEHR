<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
// 获取默认参数
def _default = logic.param('Default').getReal()

String ideaID = _default.get('hr_idea')

String reviewerUserIds = _default.get('name')

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
