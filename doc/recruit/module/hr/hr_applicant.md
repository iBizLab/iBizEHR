# 候选人申请(hr_applicant)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|候选人所在地|ADDRESS|文本，可指定长度|200|是||
|申请人备注|APPLICANT_NOTES|HTML文本，没有长度限制|1048576|是||
|出生日期|BIRTHDAY|文本，可指定长度|100|是||
|候选人姓名|CANDIDATE_DISPLAY_NAME|文本，可指定长度|100|是||
|候选人|CANDIDATE_ID|外键值|100|是||
|候选人名称|CANDIDATE_NAME|外键值文本|200|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|描述|DESCRIPTION|长文本，没有长度限制|1048576|是||
|教育程度|EDUCATION|[单项选择(文本值)](index/dictionary_index#job_education "教育程度")|100|是||
|候选人邮箱|EMAIL_FROM|文本，可指定长度|100|是||
|工作经验|EXPERIENCE|[单项选择(文本值)](index/dictionary_index#job_experience "工作经验")|100|是||
|招聘流程类型|FLOW_TYPE|文本，可指定长度|200|是||
|性别|GENDER|[单项选择(文本值)](index/dictionary_index#candidate_gender "候选人性别")|60|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|候选人照片|IMAGE|文本，可指定长度|200|是||
|是否星标|IS_FAVORITE|文本，可指定长度|200|是||
|已发送offer|IS_OFFER|是否逻辑|200|是||
|已推荐|IS_RECOMMENDED|是否逻辑|200|是||
|求职岗位|JOB_ID|外键值|100|是||
|求职岗位名称|JOB_NAME|外键值文本|200|是||
|招聘平台|JOB_PLATFORM_ID|外键值|100|是||
|招聘平台名称|JOB_PLATFORM_NAME|外键值文本|200|是||
|最高学位|LAST_EDU_ACADEMIC_DEGREE|[单项选择(文本值)](index/dictionary_index#job_education "教育程度")|100|是||
|毕业时间|LAST_EDU_DATE|文本，可指定长度|100|是||
|毕业院校|LAST_EDU_SCHOOL|文本，可指定长度|100|是||
|所学专业|LAST_EDU_SPECIALITY|文本，可指定长度|100|是||
|最近工作公司|LAST_EXP_COMPANY|文本，可指定长度|100|是||
|最近工作时间|LAST_EXP_DATE|文本，可指定长度|100|是||
|最近工作岗位|LAST_EXP_JOB|文本，可指定长度|100|是||
|用人经理|MANAGER_UID|外键值附加数据|100|是||
|候选人手机号|MOBILE_PHONE|文本，可指定长度|100|是||
|招聘负责人|OWNER_ID|外键值|60|是||
|招聘负责人名称|OWNER_NAME|外键值文本|100|是||
|职位优先级|PRIORITY_ID|[外键值附加数据](index/dictionary_index#job_priority "职位优先级")|100|是||
|招聘流程|PROGRESS_ID|外键值附加数据|100|是||
|简历来源|RESUME_SOURCE|[单项选择(文本值)](index/dictionary_index#UsrCodeList0813106864 "简历来源")|60|是||
|期望薪资|SALARY_EXPECTED|浮点||是||
|建议薪资|SALARY_PROPOSED|浮点||是||
|上传至人才库|SAVE_TO_TALENT_POOL|[单项选择(文本值)](index/dictionary_index#hr_candidate_save_to_telent_pool "上传至人才库")|200|是||
|招聘阶段|STAGE_ID|外键值|100|是||
|阶段名|STAGE_NAME|外键值附加数据|200|是||
|招聘阶段序号|STAGE_SEQUENCE|外键值附加数据||是||
|申请状态|STATUS|[单项选择(文本值)](index/dictionary_index#hr_applicant_status "候选人申请状态")|60|是||
|候选人标签|TAGS|长文本，长度1000|1000|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_INTERVIEW_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_APPLICANT_INTERVIEW_HR_APPLICANT_APPLICANT_ID)|[候选人申请与面试关系(HR_APPLICANT_INTERVIEW)](module/hr/hr_applicant_interview)|1:N关系||
|[DER1N_HR_CANDIDATE_EDUCATION_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_CANDIDATE_EDUCATION_HR_APPLICANT_APPLICANT_ID)|[候选人教育经历(HR_CANDIDATE_EDUCATION)](module/hr/hr_candidate_education)|1:N关系||
|[DER1N_HR_CANDIDATE_EXPERIENCE_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_CANDIDATE_EXPERIENCE_HR_APPLICANT_APPLICANT_ID)|[候选人工作经历(HR_CANDIDATE_EXPERIENCE)](module/hr/hr_candidate_experience)|1:N关系||
|[DER1N_HR_CANDIDATE_FILTER_DETAIL_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_CANDIDATE_FILTER_DETAIL_HR_APPLICANT_APPLICANT_ID)|[筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)|1:N关系||
|[DER1N_HR_CANDIDATE_FILTER_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_CANDIDATE_FILTER_HR_APPLICANT_APPLICANT_ID)|[筛选候选人(HR_CANDIDATE_FILTER)](module/hr/hr_candidate_filter)|1:N关系||
|[DER1N_HR_EXAM_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_EXAM_HR_APPLICANT_APPLICANT_ID)|[考试/测评(HR_EXAM)](module/hr/hr_exam)|1:N关系||
|[DER1N_HR_INTERVIEW_FEEDBACK_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_INTERVIEW_FEEDBACK_HR_APPLICANT_APPLICANT_ID)|[面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)|1:N关系||
|[DER1N_HR_INTERVIEW_SCHEDULE_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_INTERVIEW_SCHEDULE_HR_APPLICANT_APPLICANT_ID)|[面试安排(HR_INTERVIEW_SCHEDULE)](module/hr/hr_interview_schedule)|1:N关系||
|[DER1N_HR_INTERVIEW_USER_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_INTERVIEW_USER_HR_APPLICANT_APPLICANT_ID)|[面试参与者(HR_INTERVIEW_USER)](module/hr/hr_interview_user)|1:N关系||
|[DER1N_HR_OFFER_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_OFFER_HR_APPLICANT_APPLICANT_ID)|[OFFER录用(HR_OFFER)](module/hr/hr_offer)|1:N关系||
|[DERCUSTOM_COMMENT_HR_APPLICANT_PRINCIPAL_ID](der/DERCUSTOM_COMMENT_HR_APPLICANT_PRINCIPAL_ID)|[评论(COMMENT)](module/base/comment)|自定义关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_APPLICANT_HR_CANDIDATE_CANDIDATE_ID](der/DER1N_HR_APPLICANT_HR_CANDIDATE_CANDIDATE_ID)|[候选人(HR_CANDIDATE)](module/hr/hr_candidate)|1:N关系||
|[DER1N_HR_APPLICANT_HR_EMPLOYEE_OWNER_ID](der/DER1N_HR_APPLICANT_HR_EMPLOYEE_OWNER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_APPLICANT_HR_JOB_JOB_ID](der/DER1N_HR_APPLICANT_HR_JOB_JOB_ID)|[招聘职位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_HR_APPLICANT_HR_JOB_PLATFORM_JOB_PLATFORM_ID](der/DER1N_HR_APPLICANT_HR_JOB_PLATFORM_JOB_PLATFORM_ID)|[招聘平台(HR_JOB_PLATFORM)](module/hr/hr_job_platform)|1:N关系||
|[DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_STAGE_ID](der/DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_STAGE_ID)|[ 招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#hr_applicant_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|候选人申请_已读|applicant_read|[实体处理逻辑](module/hr/hr_applicant/logic/applicant_read "候选人申请_已读")|默认|不支持||||
|添加关注|favorite|[实体处理逻辑](module/hr/hr_applicant/logic/favorite "设置星标")|默认|不支持||||
|候选人状态筛选|get_applicant_state|[实体处理逻辑](module/hr/hr_applicant/logic/get_applicant_state "候选人状态筛选")|默认|不支持||||
|候选人基本信息导航栏计数|get_baseinfo_page_count|[实体处理逻辑](module/hr/hr_applicant/logic/get_baseinfo_page_count "候选人基本信息导航栏计数")|默认|不支持||||
|获取工作台数据|get_workspace_count|[实体处理逻辑](module/hr/hr_applicant/logic/get_workspace_count "获取工作台数据")|默认|不支持||||
|nothing|nothing|用户自定义|默认|不支持||||
|淘汰|out|[实体处理逻辑](module/hr/hr_applicant/logic/out "淘汰")|默认|不支持||||
|推荐给用人部门|recommend_department|[实体处理逻辑](module/hr/hr_applicant/logic/recommend_department "推荐给用人部门")|默认|不支持||||
|取消星标|remove_favorite|[实体处理逻辑](module/hr/hr_applicant/logic/remove_favorite "取消星标")|默认|支持||||
|保存候选人申请信息|save_applicant|[实体处理逻辑](module/hr/hr_applicant/logic/save_applicantinfo "保存候选人申请信息")|默认|不支持||||
|修改申请阶段|update_stage|[实体处理逻辑](module/hr/hr_applicant/logic/update_stage "修改申请阶段")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
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

## 主状态控制

<p class="panel-title"><b>控制属性</b></p>

* `招聘流程类型(FLOW_TYPE)` 
* `招聘阶段序号(STAGE_SEQUENCE)` 



> 控制属性未配置代码表，或者代码表未配置代码项

## 主状态迁移
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[常规流程](module/hr/hr_applicant/mslogic/base)|base||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_applicant/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_applicant/query/View)|VIEW|否|否 |否 ||
|[流程中的申请(active_applicant)](module/hr/hr_applicant/query/active_applicant)|active_applicant|否|否 |否 ||
|[bi_search](module/hr/hr_applicant/query/bi_search)|bi_search|否|否 |否 ||
|[查询星标(favorite)](module/hr/hr_applicant/query/favorite)|favorite|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_applicant/dataset/Default)|DEFAULT|数据查询|是|||
|[流程中的申请(active_applicant)](module/hr/hr_applicant/dataset/active_applicant)|active_applicant|数据查询|否|||
|[bi_search](module/hr/hr_applicant/dataset/bi_search)|bi_search|数据查询|否|||
|[查询星标(favorite)](module/hr/hr_applicant/dataset/favorite)|favorite|数据查询|否|||

## 数据权限

##### 全部数据（读写） :id=hr_applicant-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `UPDATE`
* `CREATE`
* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CANDIDATE_ID_EQ|候选人|EQ||
|N_CANDIDATE_NAME_EQ|候选人名称|EQ||
|N_CANDIDATE_NAME_LIKE|候选人名称|LIKE||
|N_FLOW_TYPE_EQ|招聘流程类型|EQ||
|N_GENDER_EQ|性别|EQ||
|N_ID_EQ|标识|EQ||
|N_JOB_ID_EQ|求职岗位|EQ||
|N_JOB_NAME_EQ|求职岗位名称|EQ||
|N_JOB_NAME_LIKE|求职岗位名称|LIKE||
|N_JOB_PLATFORM_ID_EQ|招聘平台|EQ||
|N_JOB_PLATFORM_NAME_EQ|招聘平台名称|EQ||
|N_JOB_PLATFORM_NAME_LIKE|招聘平台名称|LIKE||
|N_OWNER_ID_EQ|招聘负责人|EQ||
|N_OWNER_NAME_EQ|招聘负责人名称|EQ||
|N_OWNER_NAME_LIKE|招聘负责人名称|LIKE||
|N_RESUME_SOURCE_EQ|简历来源|EQ||
|N_SAVE_TO_TALENT_POOL_EQ|上传至人才库|EQ||
|N_STAGE_ID_EQ|招聘阶段|EQ||
|N_STAGE_SEQUENCE_EQ|招聘阶段序号|EQ||
|N_STATUS_EQ|申请状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 取消关注 | remove_favorite | remove_favorite |单项数据（主键）|<details><summary>后台调用</summary>[remove_favorite](#行为)||
| nothing | nothing | nothing |单项数据|<details><summary>后台调用</summary>[nothing](#行为)||
| 已推荐并继续推荐 | recommended_and_continue | 已推荐并继续推荐 |单项数据|<details><summary>打开视图或向导（模态）</summary>[筛选候选人](app/view/hr_candidate_filter_recommend_department_option_view)</details>||
| 转发候选人信息 | forward_candidate_info | 转发候选人信息 |单项数据|<details><summary>后台调用</summary>[Get](#行为)||
| 打开放入人才库 | open_add_to_hr_talentpool | 打开放入人才库 |单项数据|<details><summary>打开视图或向导（模态）</summary>[放入人才库](app/view/hr_candidate_add_talentpool_view)</details>||
| 进入复试 | update_to_second_interview | 进入复试 |单项数据（主键）|<details><summary>后台调用</summary>[update_stage](#行为)||
| 加入黑名单 | add_to_blacklist | 加入黑名单 |单项数据|<details><summary>后台调用</summary>[Get](#行为)||
| 通知候选人 | notify_candidate | 通知候选人 |单项数据|<details><summary>后台调用</summary>[Get](#行为)||
| 淘汰 | out | 淘汰 |单项数据|<details><summary>后台调用</summary>[out](#行为)||
| 推荐给用人部门 | recommend_department | 推荐给用人部门 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[筛选候选人](app/view/hr_candidate_filter_recommend_department_option_view)</details>||
| 已入职 | update_to_onboarded | 已入职 |单项数据（主键）|<details><summary>后台调用</summary>[update_stage](#行为)||
| 邀请候选人更新信息 | invite_update_info | 邀请候选人更新信息 |单项数据|<details><summary>后台调用</summary>[Get](#行为)||
| 跟进提醒 | follow_alert | 跟进提醒 |单项数据（主键）|<details><summary>后台调用</summary>[Get](#行为)||
| 进入大五性格测评 | update_to_exam | 进入大五性格测评 |单项数据（主键）|<details><summary>后台调用</summary>[update_stage](#行为)||
| 进入待入职 | update_to_pending_onboarding | 进入待入职 |单项数据（主键）|<details><summary>后台调用</summary>[update_stage](#行为)||
| 进入初试 | update_to_first_interview | 进入初试 |单项数据（主键）|<details><summary>后台调用</summary>[update_stage](#行为)||
| 备注 | comment | 备注 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[候选人申请](app/view/hr_applicant_interview_view)</details>||
| 打开候选人申请基本信息 | Open_BaseInfo | 打开候选人基本信息 |无数据|<details><summary>打开视图或向导（模态）</summary>[候选人申请](app/view/hr_applicant_create_view)</details>||
| 查看候选人信息 | open_edit | 查看候选人 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[候选人申请](app/view/hr_applicant_edit_view)</details>||
| 进入用人部门筛选 | update_to_candidate_filter | 进入用人部门筛选 |单项数据|<details><summary>后台调用</summary>[update_stage](#行为)||
| 进入沟通offer | update_to_offer | 进入沟通offer |单项数据（主键）|<details><summary>后台调用</summary>[update_stage](#行为)||
| 添加关注 | favorite | 添加关注 |单项数据（主键）|<details><summary>后台调用</summary>[favorite](#行为)||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[获取filter数据](module/hr/hr_applicant/uilogic/filter_info)|filter_info||
|[设置激活tab](module/hr/hr_applicant/uilogic/active_tab)|active_tab||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_applicant?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=主状态控制`">
  主状态控制
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=主状态迁移`">
  主状态迁移
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>