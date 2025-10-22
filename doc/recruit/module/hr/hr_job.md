# 招聘职位(hr_job)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|工作地点|ADDRESS_ID|文本，可指定长度|100|是||
|招聘协助人|ASSISTANT_UID|文本，可指定长度|100|是||
|职位类别|CATEGORY|文本，可指定长度|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|招聘开始时间|DATE_FROM|日期型||是||
|招聘结束时间|DATE_TO|日期型||是||
|部门|DEPARTMENT_ID|文本，可指定长度|100|是||
|职位描述|DESCRIPTION|长文本，没有长度限制|1048576|是||
|学历要求|EDUCATION|[单项选择(文本值)](index/dictionary_index#job_education "教育程度")|60|是||
|招聘人数|EXPECTED_EMPLOYEES|整型||是||
|工作经验|EXPERIENCE|[单项选择(文本值)](index/dictionary_index#job_experience "工作经验")|60|是||
|职能类型|FUNCTION_TYPE|[单项选择(文本值)](index/dictionary_index#functional_type "职能类型")|60|是||
|入职人数|HIRED_EMPLOYEES|文本，可指定长度|200|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|面试官|INTERVIEWER_UID|文本，可指定长度|100|是||
|发布到猎头|IS_PUBLISH_HEADHUNTER|是否逻辑||是||
|显示在内推官网|IS_PUBLISH_REFERRAL|是否逻辑||是||
|显示在社招官网|IS_PUBLISH_SOCIAL|是否逻辑||是||
|是否为虚拟职位|IS_VIRTUAL|[单项选择(文本值)](index/dictionary_index#job_is_virtual "职位类型（实体/虚拟）")|60|是||
|招聘渠道|JOB_PLATFORMS|文本，可指定长度|100|是||
|职位级别|JOB_RANK_IDS|文本，可指定长度|100|是||
|职位性质|JOB_TYPE|[单项选择(文本值)](index/dictionary_index#job_type "岗位性质")|60|是||
|部门经理|MANAGER_ID|文本，可指定长度|100|是||
|用人经理|MANAGER_UID|文本，可指定长度|100|是||
|最高薪资|MAX_SALARY|整型||是||
|最低薪资|MIN_SALARY|整型||是||
|职位名称|NAME|文本，可指定长度|200|是||
|招聘负责人|OWNER_ID|文本，可指定长度|100|是||
|优先级|PRIORITY_ID|[文本，可指定长度](index/dictionary_index#job_priority "职位优先级")|100|是||
|招聘流程|PROGRESS_ID|外键值|100|是||
|招聘流程名称|PROGRESS_NAME|外键值文本|200|是||
|职位来源|SOURCE_TYPE|[单项选择(文本值)](index/dictionary_index#job_source_type "职位来源")|60|是||
|岗位状态|STATUS|[单项选择(文本值)](index/dictionary_index#job_status "岗位状态")|60|是||
|候选人总数|TOTAL_EMPLOYEES|文本，可指定长度|200|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_HR_JOB_JOB_ID](der/DER1N_HR_APPLICANT_HR_JOB_JOB_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_JOB_HR_JOB_ID](der/DER1N_HR_EMPLOYEE_HR_JOB_HR_JOB_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_IDEA_JOB_HR_JOB_JOB_ID](der/DER1N_HR_IDEA_JOB_HR_JOB_JOB_ID)|[需求与职位关系(HR_IDEA_JOB)](module/hr/hr_idea_job)|1:N关系||
|[DER1N_HR_JOB_PLATFORM_RECORD_HR_JOB_JOB_ID](der/DER1N_HR_JOB_PLATFORM_RECORD_HR_JOB_JOB_ID)|[招聘平台发布记录(HR_JOB_PLATFORM_RECORD)](module/hr/hr_job_platform_record)|1:N关系||
|[DER1N_HR_RECRUITMENT_SOURCE_HR_JOB_JOB_ID](der/DER1N_HR_RECRUITMENT_SOURCE_HR_JOB_JOB_ID)|[申请人来源(HR_RECRUITMENT_SOURCE)](module/hr/hr_recruitment_source)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_JOB_HR_RECRUITMENT_PROGRESS_PROGRESS_ID](der/DER1N_HR_JOB_HR_RECRUITMENT_PROGRESS_PROGRESS_ID)|[招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|CreateTemp|CreateTemp|内置方法|默认|不支持||||
|CreateTempMajor|CreateTempMajor|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|GetDraftTemp|GetDraftTemp|内置方法|默认|不支持||||
|GetDraftTempMajor|GetDraftTempMajor|内置方法|默认|不支持||||
|GetTemp|GetTemp|内置方法|默认|不支持||||
|GetTempMajor|GetTempMajor|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|RemoveTemp|RemoveTemp|内置方法|默认|支持||||
|RemoveTempMajor|RemoveTempMajor|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|UpdateTemp|UpdateTemp|内置方法|默认|不支持||||
|UpdateTempMajor|UpdateTempMajor|内置方法|默认|不支持||||
|职位状态计数器|job_status_count|[实体处理逻辑](module/hr/hr_job/logic/job_status_count "职位状态计数器")|默认|不支持||||
|关联职位|join_idea_job|[实体处理逻辑](module/hr/hr_job/logic/join_idea_job "关联职位")|默认|不支持||||
|官网招聘职位申请信息保存|website_apply_save|[实体处理逻辑](module/hr/hr_job/logic/website_apply_save "官网招聘职位申请信息保存")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[关联职位](module/hr/hr_job/logic/join_idea_job)|join_idea_job|无|||
|[官网招聘职位申请信息保存](module/hr/hr_job/logic/website_apply_save)|website_apply_save|无|||
|[职位状态计数器](module/hr/hr_job/logic/job_status_count)|job_status_count|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_job/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_job/query/View)|VIEW|否|否 |否 ||
|[全部数据（含渠道信息）(all)](module/hr/hr_job/query/all)|all|否|否 |否 ||
|[招聘中(open)](module/hr/hr_job/query/open)|open|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_job/dataset/Default)|DEFAULT|数据查询|是|||
|[全部数据（含渠道信息）(all)](module/hr/hr_job/dataset/all)|all|数据查询|否|||
|[招聘中(open)](module/hr/hr_job/dataset/open)|open|数据查询|否|||

## 数据权限

##### 全部数据（RW） :id=hr_job-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `DELETE`
* `UPDATE`
* `CREATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_EDUCATION_EQ|学历要求|EQ||
|N_EXPERIENCE_EQ|工作经验|EQ||
|N_FUNCTION_TYPE_EQ|职能类型|EQ||
|N_ID_EQ|标识|EQ||
|N_IS_VIRTUAL_EQ|是否为虚拟职位|EQ||
|N_JOB_PLATFORMS_LIKE|招聘渠道|LIKE||
|N_JOB_TYPE_EQ|职位性质|EQ||
|N_NAME_LIKE|职位名称|LIKE||
|N_OWNER_ID_EQ|招聘负责人|EQ||
|N_PROGRESS_ID_EQ|招聘流程|EQ||
|N_PROGRESS_NAME_EQ|招聘流程名称|EQ||
|N_PROGRESS_NAME_LIKE|招聘流程名称|LIKE||
|N_SOURCE_TYPE_EQ|职位来源|EQ||
|N_STATUS_EQ|岗位状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 开放所有招聘渠道 | open_all_channel | 开放所有招聘渠道 |无数据|<details><summary>后台调用</summary>[Get](#行为)||
| 打开招聘官网职位页面 | open_website | open_website |无数据|<details><summary>打开视图或向导（模态）</summary>[招聘职位](app/view/hr_job_website_job_view)</details>||
| 一键刷新 | refresh | 一键刷新 |无数据|<details><summary>后台调用</summary>[Get](#行为)||
| 官网职位申请信息保存 | website_apply_save | 官网职位申请信息保存 |单项数据|<details><summary>后台调用</summary>[website_apply_save](#行为)||
| 创建职位 | create_job | 创建职位 |无数据|<details><summary>打开视图或向导（模态）</summary>[招聘职位](app/view/hr_job_create_wizard_view)</details>||
| 打开招聘官网职位申请 | open_apply | 打开招聘官网职位申请 |单项数据|<details><summary>打开视图或向导（模态）</summary>[候选人申请](app/view/hr_applicant_website_apply_view)</details>||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_job?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job?id=界面行为`">
  界面行为
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