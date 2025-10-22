
## 使用脚本的处理逻辑节点<sup class="footnote-symbol"> <font color=orange>[13]</font></sup>

#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[取消星标(remove_favorite)](module/hr/hr_applicant/logic/remove_favorite)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
// 获取favorite数据实体
def favorite = sys.dataentity('FAVORITE');
// 获取默认参数
def defaultParam = logic.param('default').getReal();

// 从default参数中获取所需属性值
def id = defaultParam.get("id")
def srfuserId = defaultParam.get("srfuserid")
def hrApplicant = defaultParam.get("hr_applicant")

// 创建查询参数对象
def queryParam = new net.ibizsys.util.QueryParam();

// 添加多条件组合查询（同时满足三个条件）
queryParam.addFilter("OWNER_ID", "=", id);          // 匹配OWNER_ID
queryParam.addFilter("CREATE_MAN", "=", srfuserId); // 匹配创建人
queryParam.addFilter("OWNER_TYPE", "=", hrApplicant); // 匹配类型

// 执行查询获取符合条件的记录
def favoriteList = favorite.query(queryParam);

// 如果查询到记录，则删除
if(favoriteList != null && !favoriteList.isEmpty()) {
    // 获取第一条记录的ID（如果有多个符合条件的记录，可根据实际需求处理）
    def deleteId = favoriteList.get(0).get("id");
    // 执行删除操作
    favorite.delete(deleteId);
}

```
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[推荐给用人部门(recommend_department)](module/hr/hr_applicant/logic/recommend_department)

节点：执行脚本代码
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
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[放入人才库(add_to_hr_talentpool)](module/hr/hr_candidate/logic/add_to_hr_talentpool)

节点：维护候选人和人才库的关系
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def candidate_talentpool = sys.dataentity('HR_CANDIDATE_TALENT_POOL');
def defaultParam = logic.param('default').getReal();

def candidateId = defaultParam.get("candidate_id")
def talentpoolJson = defaultParam.get("talentpool")
def talentpoolArray = new groovy.json.JsonSlurper().parseText(talentpoolJson)

talentpoolArray.each { talentpoolItem ->
    
    def newTalentpool = new net.ibizsys.central.util.EntityDTO(); 
    
    
    def talentpoolId = talentpoolItem.get("id")
    def talentpoolName = talentpoolItem.get("name")
    newTalentpool.set("talentpool_id", talentpoolId)
    newTalentpool.set("candidate_id", candidateId)
    newTalentpool.set("name", talentpoolName)
    

    candidate_talentpool.create(newTalentpool); 
}

```
#### [筛选候选人(HR_CANDIDATE_FILTER)](module/hr/hr_candidate_filter)的处理逻辑[推荐给用人部门(recommend_department)](module/hr/hr_candidate_filter/logic/recommend_department)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
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
```
#### [筛选候选人(HR_CANDIDATE_FILTER)](module/hr/hr_candidate_filter)的处理逻辑[获取信息(get_info)](module/hr/hr_candidate_filter/logic/get_info)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
println " _default ${_default}"


def hr_candidate_filter = logic.param('filter').getReal()

String applicant_id = _default.get('id')

def hrCandidateFilterRuntime = sys.dataentity('hr_candidate_filter')


def filter = hrCandidateFilterRuntime.filter()
filter.eq('applicant_id', applicant_id)
hr_candidate_filter = hrCandidateFilterRuntime.selectOne(filter) as IEntityDTO

println "${hr_candidate_filter}"

```
#### [筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)的处理逻辑[筛选人数(filter_count)](module/hr/hr_candidate_filter_detail/logic/filter_count)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()

_default.set("wait_count", 0)
_default.set("review_count", 0)
_default.set("recommend_count", 0)
_default.set("filter_count", 0)
```
#### [需求与职位关系(HR_IDEA_JOB)](module/hr/hr_idea_job)的处理逻辑[关联职位(join_idea_job)](module/hr/hr_idea_job/logic/join_idea_job)

节点：需求关联职位
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
#### [面试安排(HR_INTERVIEW_SCHEDULE)](module/hr/hr_interview_schedule)的处理逻辑[初始化面试默认值(fill_interview)](module/hr/hr_interview_schedule/logic/fill_interview)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param("default").getReal();
def _list = new ArrayList();
def _map = new HashMap();

_map.put("stage_id","1");
_map.put("start_time","2");
_map.put("duration","2");

_list.add(_map);
_default.set("interviews",_list);
_default.set("email_content","<p><strong>尊敬的</strong> 张三 <strong>先生/女士:</strong></p><p> &nbsp; &nbsp; &nbsp;您好! &nbsp;我司诚邀您参加 HRBP 的面试。烦请您在面试前，完成线上应聘信息表及大五性格测评，我司将做好信息保密工作。具体面试安排如下：</p><p> &nbsp; &nbsp; &nbsp;面试时间：2025年8月15日星期五 16:00</p><p> &nbsp; &nbsp; &nbsp;面试地点: 面试安排成功后会显示具体信息</p><p> &nbsp; &nbsp; &nbsp;联系人: &nbsp;梁进</p><p> &nbsp; &nbsp; &nbsp;联系电话： 0521-3769521</p>");
_default.set("sms_content","尊敬的 张三 先生/女士:\n      您好!  我司诚邀您参加 HRBP 的面试。烦请您在面试前，完成线上应聘信息表及大五性格测评，我司将做好信息保密工作。具体面试安排如下：\n      面试时间：2025年8月15日星期五 16:00\n      面试地点: 面试安排成功后会显示具体信息\n      联系人:  梁进\n      联系电话： 0521-3769521");

```
#### [招聘职位(HR_JOB)](module/hr/hr_job)的处理逻辑[关联职位(join_idea_job)](module/hr/hr_job/logic/join_idea_job)

节点：需求关联职位
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
#### [实体处理逻辑(PSDELOGIC)](module/extension/PSDELogic)的处理逻辑[获取最后运行状态(get_last_run_info)](module/extension/PSDELogic/logic/get_last_run_info)

节点：计算值
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var staticfics = logic.getParam("log_statistics");
var defvar = logic.getParam("default");
var success_per = 0;
var success_count = 0;
var failure_count = 0;
for (var i = 0; i < staticfics.size(); i++) {
    var staticfic = staticfics.get(i); 
    if (staticfic.get("state") == "SUCCESS"){
        success_count = staticfic.get("count");
    }
    if (staticfic.get("state") == "FAILURE"){
        failure_count = staticfic.get("count");
    }
}
var total = success_count + failure_count;
success_per = (success_count / total) *100 ;
defvar.set("success_count",success_count);
defvar.set("failure_count",failure_count);
defvar.set("success_per",success_per);
defvar.set("total",total);
```
#### [智能报表(PSSYSBIREPORT)](module/extension/PSSysBIReport)的处理逻辑[更新报表(update_report)](module/extension/PSSysBIReport/logic/update_report)

节点：回写图表类型
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var _default = logic.getParam("Default");
var report = logic.getParam("report");
var str_uimodel = _default.get("bireportuimodel");
var uimodel = JSON.parse(str_uimodel);
var chart_type = uimodel.selectChartType;
report.set("chart_type",chart_type);
report.set("template_model",_default.dump());
```
#### [分析报表(REPORT)](module/base/report)的处理逻辑[同步模板模型(sync_model)](module/base/report/logic/sync_model)

节点：dump模型
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var bireport = logic.getParam("bireport");
var _default = logic.getParam("default");
_default.set("template_model",bireport.dump());
```
#### [分析报表(REPORT)](module/base/report)的处理逻辑[建立报表扩展模型(create_bi_report)](module/base/report/logic/create_bi_report)

节点：从模板初始化模型
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var _default = logic.getParam("default");
var bireport = logic.getParam("bireport");
var templateModel = _default.get("template_model");
if(templateModel != null){
    bireport.from(templateModel);
    bireport.reset("pssysbireportid");
    bireport.reset("codename");
}
```




