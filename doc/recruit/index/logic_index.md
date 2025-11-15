# 处理逻辑 <!-- {docsify-ignore-all} -->

## [评论(COMMENT)](module/base/comment.md) :id=comment

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[删除评论](module/base/comment/logic/delete)|delete|无||评论数据的删除，将评论内容重置为：该评论已删除|
|[取消置顶](module/base/comment/logic/no_top)|no_top|无|||
|[评论置顶](module/base/comment/logic/top)|top|无|||





## [候选人申请(HR_APPLICANT)](module/hr/hr_applicant.md) :id=hr_applicant

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[保存候选人申请信息](module/hr/hr_applicant/logic/save_applicantinfo)|save_applicantinfo|无|||
|[修改申请阶段](module/hr/hr_applicant/logic/update_stage)|update_stage|无|||
|[候选人基本信息导航栏计数](module/hr/hr_applicant/logic/get_baseinfo_page_count)|get_baseinfo_page_count|无|||
|[候选人状态筛选](module/hr/hr_applicant/logic/get_applicant_state)|get_applicant_state|无|||
|[候选人申请_已读](module/hr/hr_applicant/logic/applicant_read)|applicant_read|无|||
|[取消星标](module/hr/hr_applicant/logic/remove_favorite)|remove_favorite|无|||
|[推荐给用人部门](module/hr/hr_applicant/logic/recommend_department)|recommend_department|无|||
|[是否输出视图消息](module/hr/hr_applicant/logic/nothing)|nothing|无|||
|[淘汰](module/hr/hr_applicant/logic/out)|out|无|||
|[获取工作台数据](module/hr/hr_applicant/logic/get_workspace_count)|get_workspace_count|无|||
|[设置星标](module/hr/hr_applicant/logic/favorite)|favorite|无||设置为星标项目|
|[附加候选人操作权限（临时）](module/hr/hr_applicant/logic/add_candidate_oppriv)|add_candidate_oppriv|无|||





## [候选人(HR_CANDIDATE)](module/hr/hr_candidate.md) :id=hr_candidate

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[人才库候选人数量](module/hr/hr_candidate/logic/get_talent_pool_count)|get_talent_pool_count|无|||
|[今日归档人数](module/hr/hr_candidate/logic/get_archived_today_count)|get_archived_today_count|无|||
|[我的待办事项清单计数器](module/hr/hr_candidate/logic/get_my_todolist_count)|get_my_todolist_count|无|||
|[放入人才库](module/hr/hr_candidate/logic/add_to_hr_talentpool)|add_to_hr_talentpool|无|||
|[获取工作台我的事项数](module/hr/hr_candidate/logic/get_my_summary_count)|get_my_summary_count|无|||
|[获取工作台我的关注数](module/hr/hr_candidate/logic/get_my_attention_count)|get_my_attention_count|无|||
|[获取工作台面试数](module/hr/hr_candidate/logic/get_my_interview_count)|get_my_interview_count|无|||




## [筛选候选人(HR_CANDIDATE_FILTER)](module/hr/hr_candidate_filter.md) :id=hr_candidate_filter

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[推荐给用人部门](module/hr/hr_candidate_filter/logic/recommend_department)|recommend_department|无|||
|[获取信息](module/hr/hr_candidate_filter/logic/get_info)|get_info|无|||


## [筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail.md) :id=hr_candidate_filter_detail

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[用人经理-简历筛选-搜索栏计数器](module/hr/hr_candidate_filter_detail/logic/my_filter_count)|my_filter_count|无|||
|[筛选人数](module/hr/hr_candidate_filter_detail/logic/filter_count)|filter_count|无|||









## [考试/测评(HR_EXAM)](module/hr/hr_exam.md) :id=hr_exam

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[my_interview_count](module/hr/hr_exam/logic/my_interview_count)|my_interview_count|无|||


## [招聘需求(HR_IDEA)](module/hr/hr_idea.md) :id=hr_idea

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[招聘需求搜索栏计数](module/hr/hr_idea/logic/idea_status_count)|idea_status_count|无|||


## [需求与职位关系(HR_IDEA_JOB)](module/hr/hr_idea_job.md) :id=hr_idea_job

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[关联职位](module/hr/hr_idea_job/logic/join_idea_job)|join_idea_job|无|||
|[获取关联职位](module/hr/hr_idea_job/logic/get_join_idea_job)|get_join_idea_job|无|||


## [面试(HR_INTERVIEW)](module/hr/hr_interview.md) :id=hr_interview

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[创建面试详情(参与者、待反馈）](module/hr/hr_interview/logic/create_interview_info)|create_interview_info|无|||
|[预设面试信息（临时）](module/hr/hr_interview/logic/set_interview_info)|set_interview_info|无|||


## [面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback.md) :id=hr_interview_feedback

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[用人经理-我的面试-搜索栏计数器](module/hr/hr_interview_feedback/logic/my_interview_count)|my_interview_count|无|||


## [面试安排(HR_INTERVIEW_SCHEDULE)](module/hr/hr_interview_schedule.md) :id=hr_interview_schedule

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[初始化面试默认值](module/hr/hr_interview_schedule/logic/fill_interview)|fill_interview|无|||



## [招聘职位(HR_JOB)](module/hr/hr_job.md) :id=hr_job

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[关联职位](module/hr/hr_job/logic/join_idea_job)|join_idea_job|无|||
|[官网招聘职位申请信息保存](module/hr/hr_job/logic/website_apply_save)|website_apply_save|无|||
|[职位状态计数器](module/hr/hr_job/logic/job_status_count)|job_status_count|无|||





## [OFFER录用(HR_OFFER)](module/hr/hr_offer.md) :id=hr_offer

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[填充offer主键](module/hr/hr_offer/logic/fillId)|fillId|无|||
|[更新申请关联offer](module/hr/hr_offer/logic/updateRelOffer)|updateRelOffer|无|||


## [offer审核(HR_OFFER_APPROVAL)](module/hr/hr_offer_approval.md) :id=hr_offer_approval

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[审批](module/hr/hr_offer_approval/logic/approval)|approval|无|||
|[用人经理-我的offer-搜索栏计数器](module/hr/hr_offer_approval/logic/my_offer_count)|my_offer_count|无|||





## [招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress.md) :id=hr_recruitment_progress

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[停用](module/hr/hr_recruitment_progress/logic/disable)|disable|无|||
|[启用](module/hr/hr_recruitment_progress/logic/enable)|enable|无|||



## [ 招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage.md) :id=hr_recruitment_stage

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[停用](module/hr/hr_recruitment_stage/logic/disable)|disable|无|||
|[启用](module/hr/hr_recruitment_stage/logic/enable)|enable|无|||













## [实体处理逻辑(PSDELOGIC)](module/extension/PSDELogic.md) :id=PSDELogic

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[WebHook地址](module/extension/PSDELogic/logic/WebHook)|WebHook|属性逻辑||WebHook地址|
|[从模板建立规则](module/extension/PSDELogic/logic/create_by_template)|create_by_template|无||从模板建立规则|
|[切换启用状态](module/extension/PSDELogic/logic/valid)|valid|属性逻辑||切换启用状态|
|[失败率计算](module/extension/PSDELogic/logic/failure_per)|failure_per|属性逻辑||失败率计算|
|[获取最后运行状态](module/extension/PSDELogic/logic/get_last_run_info)|get_last_run_info|无||获取最后运行状态|








## [智能报表(PSSYSBIREPORT)](module/extension/PSSysBIReport.md) :id=PSSysBIReport

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[更新报表](module/extension/PSSysBIReport/logic/update_report)|update_report|无||更新报表|





## [分析报表(REPORT)](module/base/report.md) :id=report

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[同步模板模型](module/base/report/logic/sync_model)|sync_model|无||同步模板模型|
|[建立报表扩展模型](module/base/report/logic/create_bi_report)|create_bi_report|无||建立报表扩展模型|
|[移除报表扩展模型](module/base/report/logic/remove_bi_report)|remove_bi_report|无||移除报表扩展模型|





## [工作台(WORKSPACE)](module/base/workspace.md) :id=workspace

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[我的待办事项清单计数器](module/base/workspace/logic/get_my_todolist_count)|get_my_todolist_count|无|||
|[用人经理欢迎页计数器](module/base/workspace/logic/manager_welcome_count)|manager_welcome_count|无|||
|[获取工作台我的事项数](module/base/workspace/logic/get_my_summary_count)|get_my_summary_count|无|||
|[获取工作台我的关注数](module/base/workspace/logic/get_my_attention_count)|get_my_attention_count|无|||

