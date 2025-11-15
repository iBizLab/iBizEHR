# 模型预警 <!-- {docsify-ignore-all} -->


### 处理逻辑中使用脚本<sup class="footnote-symbol"> <font color=orange>[15]</font></sup>
| 实体col200   | 处理逻辑col300  | 脚本模式col100  |
| --------   |------------|----------|
|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant#处理逻辑)|[取消星标(remove_favorite)](module/hr/hr_applicant/logic/remove_favorite.md)|否|
|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant#处理逻辑)|[推荐给用人部门(recommend_department)](module/hr/hr_applicant/logic/recommend_department.md)|否|
|[候选人(HR_CANDIDATE)](module/hr/hr_candidate#处理逻辑)|[放入人才库(add_to_hr_talentpool)](module/hr/hr_candidate/logic/add_to_hr_talentpool.md)|否|
|[筛选候选人(HR_CANDIDATE_FILTER)](module/hr/hr_candidate_filter#处理逻辑)|[推荐给用人部门(recommend_department)](module/hr/hr_candidate_filter/logic/recommend_department.md)|否|
|[筛选候选人(HR_CANDIDATE_FILTER)](module/hr/hr_candidate_filter#处理逻辑)|[获取信息(get_info)](module/hr/hr_candidate_filter/logic/get_info.md)|否|
|[筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail#处理逻辑)|[筛选人数(filter_count)](module/hr/hr_candidate_filter_detail/logic/filter_count.md)|否|
|[需求与职位关系(HR_IDEA_JOB)](module/hr/hr_idea_job#处理逻辑)|[关联职位(join_idea_job)](module/hr/hr_idea_job/logic/join_idea_job.md)|否|
|[面试安排(HR_INTERVIEW_SCHEDULE)](module/hr/hr_interview_schedule#处理逻辑)|[初始化面试默认值(fill_interview)](module/hr/hr_interview_schedule/logic/fill_interview.md)|否|
|[招聘职位(HR_JOB)](module/hr/hr_job#处理逻辑)|[关联职位(join_idea_job)](module/hr/hr_job/logic/join_idea_job.md)|否|
|[实体处理逻辑(PSDELOGIC)](module/extension/PSDELogic#处理逻辑)|[WebHook地址(WebHook)](module/extension/PSDELogic/logic/WebHook.md)|是|
|[实体处理逻辑(PSDELOGIC)](module/extension/PSDELogic#处理逻辑)|[失败率计算(failure_per)](module/extension/PSDELogic/logic/failure_per.md)|是|
|[实体处理逻辑(PSDELOGIC)](module/extension/PSDELogic#处理逻辑)|[获取最后运行状态(get_last_run_info)](module/extension/PSDELogic/logic/get_last_run_info.md)|否|
|[智能报表(PSSYSBIREPORT)](module/extension/PSSysBIReport#处理逻辑)|[更新报表(update_report)](module/extension/PSSysBIReport/logic/update_report.md)|否|
|[分析报表(REPORT)](module/base/report#处理逻辑)|[同步模板模型(sync_model)](module/base/report/logic/sync_model.md)|否|
|[分析报表(REPORT)](module/base/report#处理逻辑)|[建立报表扩展模型(create_bi_report)](module/base/report/logic/create_bi_report.md)|否|

### 处理逻辑中使用SQL调用<sup class="footnote-symbol"> <font color=orange>[17]</font></sup>
| 实体col200   | 处理逻辑col300  |
| --------   |------------|
|[候选人申请(HR_APPLICANT)#处理逻辑](module/hr/hr_applicant)|[保存候选人申请信息(save_applicantinfo)](module/hr/hr_applicant/logic/save_applicantinfo.md)|
|[候选人申请(HR_APPLICANT)#处理逻辑](module/hr/hr_applicant)|[候选人基本信息导航栏计数(get_baseinfo_page_count)](module/hr/hr_applicant/logic/get_baseinfo_page_count.md)|
|[候选人申请(HR_APPLICANT)#处理逻辑](module/hr/hr_applicant)|[候选人状态筛选(get_applicant_state)](module/hr/hr_applicant/logic/get_applicant_state.md)|
|[候选人申请(HR_APPLICANT)#处理逻辑](module/hr/hr_applicant)|[淘汰(out)](module/hr/hr_applicant/logic/out.md)|
|[候选人申请(HR_APPLICANT)#处理逻辑](module/hr/hr_applicant)|[获取工作台数据(get_workspace_count)](module/hr/hr_applicant/logic/get_workspace_count.md)|
|[候选人(HR_CANDIDATE)#处理逻辑](module/hr/hr_candidate)|[人才库候选人数量(get_talent_pool_count)](module/hr/hr_candidate/logic/get_talent_pool_count.md)|
|[候选人(HR_CANDIDATE)#处理逻辑](module/hr/hr_candidate)|[今日归档人数(get_archived_today_count)](module/hr/hr_candidate/logic/get_archived_today_count.md)|
|[候选人(HR_CANDIDATE)#处理逻辑](module/hr/hr_candidate)|[我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate/logic/get_my_todolist_count.md)|
|[候选人(HR_CANDIDATE)#处理逻辑](module/hr/hr_candidate)|[获取工作台我的事项数(get_my_summary_count)](module/hr/hr_candidate/logic/get_my_summary_count.md)|
|[候选人(HR_CANDIDATE)#处理逻辑](module/hr/hr_candidate)|[获取工作台我的关注数(get_my_attention_count)](module/hr/hr_candidate/logic/get_my_attention_count.md)|
|[候选人(HR_CANDIDATE)#处理逻辑](module/hr/hr_candidate)|[获取工作台面试数(get_my_interview_count)](module/hr/hr_candidate/logic/get_my_interview_count.md)|
|[筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)#处理逻辑](module/hr/hr_candidate_filter_detail)|[用人经理-简历筛选-搜索栏计数器(my_filter_count)](module/hr/hr_candidate_filter_detail/logic/my_filter_count.md)|
|[考试/测评(HR_EXAM)#处理逻辑](module/hr/hr_exam)|[my_interview_count](module/hr/hr_exam/logic/my_interview_count.md)|
|[招聘需求(HR_IDEA)#处理逻辑](module/hr/hr_idea)|[招聘需求搜索栏计数(idea_status_count)](module/hr/hr_idea/logic/idea_status_count.md)|
|[面试反馈(HR_INTERVIEW_FEEDBACK)#处理逻辑](module/hr/hr_interview_feedback)|[用人经理-我的面试-搜索栏计数器(my_interview_count)](module/hr/hr_interview_feedback/logic/my_interview_count.md)|
|[招聘职位(HR_JOB)#处理逻辑](module/hr/hr_job)|[职位状态计数器(job_status_count)](module/hr/hr_job/logic/job_status_count.md)|
|[offer审核(HR_OFFER_APPROVAL)#处理逻辑](module/hr/hr_offer_approval)|[用人经理-我的offer-搜索栏计数器(my_offer_count)](module/hr/hr_offer_approval/logic/my_offer_count.md)|

### 界面逻辑中使用脚本<sup class="footnote-symbol"> <font color=orange>[10]</font></sup>
| 实体col200   | 界面逻辑col300  |
| --------   |------------|
|[评论(COMMENT)](module/base/comment#界面逻辑)|[清空评论](module/base/comment/uilogic/clear_comment)|
|[评论(COMMENT)](module/base/comment#界面逻辑)|[编辑评论](module/base/comment/uilogic/edit_comment)|
|[评论(COMMENT)](module/base/comment#界面逻辑)|[刷新评论列表](module/base/comment/uilogic/refresh_comment)|
|[评论(COMMENT)](module/base/comment#界面逻辑)|[回复评论](module/base/comment/uilogic/reply_comment)|
|[评论(COMMENT)](module/base/comment#界面逻辑)|[发送评论](module/base/comment/uilogic/send_comment)|
|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant#界面逻辑)|[设置激活tab](module/hr/hr_applicant/uilogic/active_tab)|
|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant#界面逻辑)|[获取filter数据](module/hr/hr_applicant/uilogic/filter_info)|
|[OFFER录用(HR_OFFER)](module/hr/hr_offer#界面逻辑)|[offer提交](module/hr/hr_offer/uilogic/commitoffer)|
|[分析报表(REPORT)](module/base/report#界面逻辑)|[导出表格](module/base/report/uilogic/export_excel)|
|[分析报表(REPORT)](module/base/report#界面逻辑)|[导出为pdf](module/base/report/uilogic/export_pdf)|

### 包含长文本的查询<sup class="footnote-symbol"> <font color=orange>[7]</font></sup>
| 实体col200   | 数据查询col300  |
| --------   |------------|
|[评论(COMMENT)](module/base/comment)|[数据查询(DEFAULT)](module/base/comment/query/Default)|
|[筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)|[数据查询(DEFAULT)](module/hr/hr_candidate_filter_detail/query/Default)|
|[筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)|[已评价(evaluated)](module/hr/hr_candidate_filter_detail/query/evaluated)|
|[筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)|[筛选_个人(filter_myself)](module/hr/hr_candidate_filter_detail/query/filter_myself)|
|[筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)|[未评价(unevaluated)](module/hr/hr_candidate_filter_detail/query/unevaluated)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|[数据查询(DEFAULT)](module/hr/hr_employee/query/Default)|
|[分析报表(REPORT)](module/base/report)|[DEFAULT](module/base/report/query/Default)|

### 使用自定义SQL的查询<sup class="footnote-symbol"> <font color=orange>[2]</font></sup>
| 实体col200   | 数据查询col300  |
| --------   |------------|
|[招聘平台(HR_JOB_PLATFORM)](module/hr/hr_job_platform)|[职位发布情况(job_platform)](module/hr/hr_job_platform/query/job_platform)|
|[招聘平台账号(HR_JOB_PLATFORM_ACCOUNT)](module/hr/hr_job_platform_account)|[账号发布状态(publish_status)](module/hr/hr_job_platform_account/query/publish_status)|


### 未配置权限请求接口<sup class="footnote-symbol"> <font color=orange>[1]</font></sup>
| 实体col200| 请求路径col500| 请求方式col100   |    行为/集合col300    |
| -------- |-------- | --------|-------- |
|[核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc.md)|/pscoreprdfuncs/{key}/reload|POST|[重新加载(RELOAD)](module/extension/PSCorePrdFunc#行为)|

### NONE权限请求接口<sup class="footnote-symbol"> <font color=orange>[1]</font></sup>
| 实体col200| 请求路径col500| 请求方式col100   |    行为/集合col300    |
| -------- |-------- | --------|-------- |
|[智能报表(PSSYSBIREPORT)](module/extension/PSSysBIReport.md)|/pssysbireports/{key}/compileappbireport|POST|[编译报表模型(COMPILEAPPBIREPORT)](module/extension/PSSysBIReport#行为)|

### 操作标识未配置映射<sup class="footnote-symbol"> <font color=orange>[1]</font></sup>
| 实体col200   | 操作标识col300  |
| --------   |------------|
|[招聘平台发布记录(HR_JOB_PLATFORM_RECORD)](module/hr/hr_job_platform_record.md)|CREATE<br>READ<br>DELETE<br>UPDATE|

### 除主键、主信息、预置属性外，不包含其他配置的表格<sup class="footnote-symbol"> <font color=orange>[7]</font></sup>
| 实体col200   |   视图col400 | 表格col400  |
| --------   |------------|------------|
|[候选人(HR_CANDIDATE)](module/hr/hr_candidate)|主表格(main)|[候选人(hr_candidate_pickup_grid_view)](app/view/hr_candidate_pickup_grid_view)|
|[面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)|主表格(main)|[面试反馈(hr_interview_feedback_grid_view)](app/view/hr_interview_feedback_grid_view)|
|[招聘平台(HR_JOB_PLATFORM)](module/hr/hr_job_platform)|主表格(main)|[招聘平台(hr_job_platform_pickup_grid_view)](app/view/hr_job_platform_pickup_grid_view)|
|[人才库(HR_TALENT_POOL)](module/hr/hr_talent_pool)|主表格(main)|[人才库(hr_talent_pool_grid_view)](app/view/hr_talent_pool_grid_view)|
|[核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc)|已安装应用_表格(installed_grid_view_grid)|[核心产品功能(ps_core_prd_func_installed_grid_view)](app/view/ps_core_prd_func_installed_grid_view)|
|[组织(RES_COMPANY)](module/base/res_company)|主表格(main)|[组织(res_company_grid_view)](app/view/res_company_grid_view)|
|[用户(RES_USERS)](module/base/res_users)|主表格(main)|[用户(res_users_pickup_grid_view)](app/view/res_users_pickup_grid_view)|

### 无搜索项的搜索表单<sup class="footnote-symbol"> <font color=orange>[19]</font></sup>
| 实体col200   |   视图col400 | 搜索表单col400  |
| --------   |------------|-----------|
|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|默认搜索表单(default)|[我关注的(hr_applicant_my_favorite_list_view)](app/view/hr_applicant_my_favorite_list_view)|
|[候选人(HR_CANDIDATE)](module/hr/hr_candidate)|默认搜索表单(default)|[候选人(hr_candidate_pickup_grid_view)](app/view/hr_candidate_pickup_grid_view)|
|[筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)|我的简历筛选_搜索表单(my_filter_list_view_search_form)|[我的筛选(hr_candidate_filter_detail_my_filter_list_view)](app/view/hr_candidate_filter_detail_my_filter_list_view)|
|[部门(HR_DEPARTMENT)](module/hr/hr_department)|默认搜索表单(default)|[部门(hr_department_grid_view)](app/view/hr_department_grid_view)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|默认搜索表单(default)|[员工(hr_employee_grid_view)](app/view/hr_employee_grid_view)|
|[考试/测评(HR_EXAM)](module/hr/hr_exam)|我的考试/测评_搜索表单(my_exam_list_view_search_form)|[我的考试/测评(hr_exam_my_exam_list_view)](app/view/hr_exam_my_exam_list_view)|
|[需求与职位关系(HR_IDEA_JOB)](module/hr/hr_idea_job)|默认搜索表单(default)|[需求与职位关系(hr_idea_job_grid_view)](app/view/hr_idea_job_grid_view)|
|[面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)|我通过的_搜索表单(my_pass_list_view_search_form)|[面试反馈(hr_interview_feedback_grid_view)](app/view/hr_interview_feedback_grid_view)|
|[招聘职位(HR_JOB)](module/hr/hr_job)|默认搜索表单(default)|[招聘职位(hr_job_pickup_grid_view)](app/view/hr_job_pickup_grid_view)|
|[招聘平台(HR_JOB_PLATFORM)](module/hr/hr_job_platform)|默认搜索表单(default)|[基础信息表格(hr_job_platform_info_grid_view)](app/view/hr_job_platform_info_grid_view)|
|[招聘平台账号(HR_JOB_PLATFORM_ACCOUNT)](module/hr/hr_job_platform_account)|招聘平台账号基础表格信息_搜索表单(usr08089959_search_form)|[选择账号(hr_job_platform_account_list_data_view)](app/view/hr_job_platform_account_list_data_view)|
|[招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress)|招聘流程设置_搜索表单(grid_view_search_form)|[招聘流程设置(hr_recruitment_progress_grid_view)](app/view/hr_recruitment_progress_grid_view)|
|[ 招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage)|招聘阶段设置_搜索表单(grid_view_search_form)|[招聘阶段设置(hr_recruitment_stage_grid_view)](app/view/hr_recruitment_stage_grid_view)|
|[人才库(HR_TALENT_POOL)](module/hr/hr_talent_pool)|默认搜索表单(default)|[人才库(hr_talent_pool_grid_view)](app/view/hr_talent_pool_grid_view)|
|[工作地点(HR_WORK_LOCATION)](module/hr/hr_work_location)|默认搜索表单(default)|[工作地点(hr_work_location_grid_view)](app/view/hr_work_location_grid_view)|
|[核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc)|应用市场_搜索表单(usr01029796_search_form)|[核心产品功能(ps_core_prd_func_installed_grid_view)](app/view/ps_core_prd_func_installed_grid_view)|
|[分析报表(REPORT)](module/base/report)|默认搜索表单(default)|[全部报表(report_all_report_grid_view)](app/view/report_all_report_grid_view)|
|[组织(RES_COMPANY)](module/base/res_company)|默认搜索表单(default)|[组织(res_company_grid_view)](app/view/res_company_grid_view)|
|[用户(RES_USERS)](module/base/res_users)|默认搜索表单(default)|[用户(res_users_pickup_grid_view)](app/view/res_users_pickup_grid_view)|

### 除主键、主信息、预置属性外，不包含其他配置的表单<sup class="footnote-symbol"> <font color=orange>[19]</font></sup>
| 实体col200   |   视图col400 |表单col400  |
| --------   |------------|------------|
|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|候选人申请_操作记录_表单(applicant_log_form)|[候选人申请(hr_applicant_add_info_view)](app/view/hr_applicant_add_info_view)|
|[候选人申请与面试关系(HR_APPLICANT_INTERVIEW)](module/hr/hr_applicant_interview)|主编辑表单(main)|[候选人申请与面试关系(hr_applicant_interview_edit_view)](app/view/hr_applicant_interview_edit_view)|
|[候选人(HR_CANDIDATE)](module/hr/hr_candidate)|主编辑表单(main)|[候选人(hr_candidate_edit_view)](app/view/hr_candidate_edit_view)|
|[候选人标签(HR_CANDIDATE_LABEL)](module/hr/hr_candidate_label)|快速_新建_标签_表单(quick_create_tag_form)|[候选人标签(hr_candidate_label_quick_create_tag)](app/view/hr_candidate_label_quick_create_tag)|
|[考试/测评(HR_EXAM)](module/hr/hr_exam)|主编辑表单(main)|[考试/测评(hr_exam_edit_view)](app/view/hr_exam_edit_view)|
|[面试(HR_INTERVIEW)](module/hr/hr_interview)|我的面试(myinterview_form)|[面试(hr_interview_edit_view)](app/view/hr_interview_edit_view)|
|[面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)|主编辑表单(main)|[面试反馈(hr_interview_feedback_edit_view)](app/view/hr_interview_feedback_edit_view)|
|[招聘职位(HR_JOB)](module/hr/hr_job)|关联表单(relation_option)|[添加关联职位(hr_job_relation_option_view)](app/view/hr_job_relation_option_view)|
|[OFFER录用(HR_OFFER)](module/hr/hr_offer)|创建offer_表单(quick_create_view_form)|[offer详情(hr_offer_quick_create_view)](app/view/hr_offer_quick_create_view)|
|[offer审核(HR_OFFER_APPROVAL)](module/hr/hr_offer_approval)|主编辑表单(main)|[offer审核(hr_offer_approval_edit_view)](app/view/hr_offer_approval_edit_view)|
|[招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress)|建立招聘流程_表单(quick_create_view_form)|[招聘流程(hr_recruitment_progress_edit_view)](app/view/hr_recruitment_progress_edit_view)|
|[ 招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage)|建立招聘阶段_表单(quick_create_view_form)|[ 招聘阶段(hr_recruitment_stage_edit_view)](app/view/hr_recruitment_stage_edit_view)|
|[人才库(HR_TALENT_POOL)](module/hr/hr_talent_pool)|主编辑表单(main)|[人才库(hr_talent_pool_edit_view)](app/view/hr_talent_pool_edit_view)|
|[消息通知(INTERNAL_MESSAGE)](module/extension/internal_message)|主编辑表单(main)|[消息通知(internal_message_edit_view)](app/view/internal_message_edit_view)|
|[核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc)|主编辑表单(main)|[核心产品功能(ps_core_prd_func_edit_view)](app/view/ps_core_prd_func_edit_view)|
|[实体主状态迁移逻辑(PSDEMSLOGIC)](module/extension/PSDEMSLogic)|接口表单(api)|[主状态逻辑设计(psdemslogicmslogicdesign_custom)](app/view/psdemslogicmslogicdesign_custom)|
|[分析报表(REPORT)](module/base/report)|主编辑表单(main)|[分析报表(report_edit_view)](app/view/report_edit_view)|
|[组织(RES_COMPANY)](module/base/res_company)|主编辑表单(main)|[组织(res_company_edit_view)](app/view/res_company_edit_view)|
|[工作台(WORKSPACE)](module/base/workspace)|工作台（用人经理）_表单(manager_work_bench_form)|[工作台(workspace_edit_view)](app/view/workspace_edit_view)|
