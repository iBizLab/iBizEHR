# 面试反馈(hr_interview_feedback)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|所在地|ADDRESS|外键值附加数据|200|是||
|面试地点|ADDRESS_ID|外键值附加数据|100|是||
|候选人申请|APPLICANT_ID|外键值|100|是||
|申请与面试关系|APPLICANT_INTERVIEW_ID|文本，可指定长度|100|是||
|候选人名称|CANDIDATE_DISPLAY_NAME|外键值附加数据|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|距今|DAYCALC|整型||是||
|备注|DESCRIPTION|外键值附加数据|1048576|是||
|邮箱|EMAIL_FROM|外键值附加数据|100|是||
|工作经验|EXPERIENCE|[外键值附加数据](index/dictionary_index#job_experience "工作经验")|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|面试官|INTERVIEWER_ID|外键值|60|是||
|面试官|INTERVIEWER_NAME|外键值文本|100|是||
|面试|INTERVIEW_ID|外键值|100|是||
|面试类型|INTERVIEW_TYPE|[外键值附加数据](index/dictionary_index#interview_type "面试类型")|60|是||
|面试官|INTERVIEW_USER_ID|外键值|100|是||
|是否可进入下轮面试|IS_NEXT_ROUND|是否逻辑||是||
|应聘职位|JOB_ID|外键值附加数据|100|是||
|应聘职位|JOB_NAME|外键值附加数据|200|是||
|平台名称|JOB_PLATFORM_NAME|外键值附加数据|200|是||
|最高学位|LAST_EDU_ACADEMIC_DEGREE|[外键值附加数据](index/dictionary_index#job_education "教育程度")|100|是||
|联系方式|MOBILE_PHONE|外键值附加数据|100|是||
|名称|NAME|文本，可指定长度|200|是||
|面试负责人|OWNER_ID|外键值附加数据|60|是||
|面试负责人|OWNER_NAME|外键值附加数据|100|是||
|面试结果|RESULT_TYPE|[单项选择(文本值)](index/dictionary_index#interview_result_type "面试结果")|60|是||
|面试阶段|STAGE_ID|[外键值附加数据](index/dictionary_index#interview_stage "面试阶段")|60|是||
|面试日期|START_DATE|外键值附加数据||是||
|面试时间|START_TIME|[外键值附加数据](index/dictionary_index#interview_start_time "面试开始时间")|200|是||
|面试状态|STATUS|[外键值附加数据](index/dictionary_index#interview_status "面试状态")|60|是||
|会议链接|VIDEO_URL|外键值附加数据|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_INTERVIEW_FEEDBACK_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_INTERVIEW_FEEDBACK_HR_APPLICANT_APPLICANT_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||
|[DER1N_HR_INTERVIEW_FEEDBACK_HR_EMPLOYEE_INTERVIEWER_ID](der/DER1N_HR_INTERVIEW_FEEDBACK_HR_EMPLOYEE_INTERVIEWER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_INTERVIEW_FEEDBACK_HR_INTERVIEW_INTERVIEW_ID](der/DER1N_HR_INTERVIEW_FEEDBACK_HR_INTERVIEW_INTERVIEW_ID)|[面试(HR_INTERVIEW)](module/hr/hr_interview)|1:N关系||
|[DER1N_HR_INTERVIEW_FEEDBACK_HR_INTERVIEW_USER_INTERVIEW_USER_ID](der/DER1N_HR_INTERVIEW_FEEDBACK_HR_INTERVIEW_USER_INTERVIEW_USER_ID)|[面试参与者(HR_INTERVIEW_USER)](module/hr/hr_interview_user)|1:N关系||
|[HR_APPLICANT_INTERVIEW_INTERVIEW_FEEDBACK](der/HR_APPLICANT_INTERVIEW_INTERVIEW_FEEDBACK)|[候选人申请与面试关系(HR_APPLICANT_INTERVIEW)](module/hr/hr_applicant_interview)|自定义关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|用人经理-我的面试-搜索栏计数器|my_interview_count|[实体处理逻辑](module/hr/hr_interview_feedback/logic/my_interview_count "用人经理-我的面试-搜索栏计数器")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[用人经理-我的面试-搜索栏计数器](module/hr/hr_interview_feedback/logic/my_interview_count)|my_interview_count|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_interview_feedback/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_interview_feedback/query/View)|VIEW|否|否 |否 ||
|[今后的面试(after_interview)](module/hr/hr_interview_feedback/query/after_interview)|after_interview|否|否 |否 ||
|[之前的面试(before_interview)](module/hr/hr_interview_feedback/query/before_interview)|before_interview|否|否 |否 ||
|[今天的面试(current_interview)](module/hr/hr_interview_feedback/query/current_interview)|current_interview|否|否 |否 ||
|[用人经理_我的面试(interview_myself)](module/hr/hr_interview_feedback/query/interview_myself)|interview_myself|否|否 |否 ||
|[我通过的面试(my_pass_interview)](module/hr/hr_interview_feedback/query/my_pass_interview)|my_pass_interview|否|否 |否 ||
|[未评价(unevaluated)](module/hr/hr_interview_feedback/query/unevaluated)|unevaluated|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_interview_feedback/dataset/Default)|DEFAULT|数据查询|是|||
|[今后的面试(after_interview)](module/hr/hr_interview_feedback/dataset/after_interview)|after_interview|数据查询|否|||
|[之前的面试(before_interview)](module/hr/hr_interview_feedback/dataset/before_interview)|before_interview|数据查询|否|||
|[今天的面试(current_interview)](module/hr/hr_interview_feedback/dataset/current_interview)|current_interview|数据查询|否|||
|[用人经理_我的面试(interview_myself)](module/hr/hr_interview_feedback/dataset/interview_myself)|interview_myself|数据查询|否|||
|[通过的面试(pass_interview)](module/hr/hr_interview_feedback/dataset/pass_interview)|pass_interview|数据查询|否|||
|[待反馈面试(unevaluated)](module/hr/hr_interview_feedback/dataset/unevaluated)|unevaluated|数据查询|否|||

## 数据权限

##### 全部数据（读写） :id=hr_interview_feedback-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `DELETE`
* `READ`
* `UPDATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ADDRESS_ID_EQ|面试地点|EQ||
|N_APPLICANT_ID_EQ|候选人申请|EQ||
|N_APPLICANT_INTERVIEW_ID_EQ|申请与面试关系|EQ||
|N_CANDIDATE_DISPLAY_NAME_LIKE|候选人名称|LIKE||
|N_ID_EQ|标识|EQ||
|N_INTERVIEWER_ID_EQ|面试官|EQ||
|N_INTERVIEWER_NAME_EQ|面试官|EQ||
|N_INTERVIEWER_NAME_LIKE|面试官|LIKE||
|N_INTERVIEW_ID_EQ|面试|EQ||
|N_INTERVIEW_TYPE_EQ|面试类型|EQ||
|N_INTERVIEW_USER_ID_EQ|面试官|EQ||
|N_JOB_ID_EQ|应聘职位|EQ||
|N_JOB_NAME_EQ|应聘职位|EQ||
|N_JOB_NAME_LIKE|应聘职位|LIKE||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_ID_EQ|面试负责人|EQ||
|N_RESULT_TYPE_EQ|面试结果|EQ||
|N_RESULT_TYPE_ISNOTNULL|面试结果|ISNOTNULL||
|N_RESULT_TYPE_ISNULL|面试结果|ISNULL||
|N_START_DATE_EQ|面试日期|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 查看预约面试 | query_interview | 查看预约面试 |单项数据|<details><summary>后台调用</summary>[Get](#行为)||
| 查看更多 | see_more | 查看更多 |无数据|<details><summary>后台调用</summary>[my_interview_count](#行为)||
| 填写面试反馈（用人经理端） | add_feedback_manager | 填写反馈 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[面试结果](app/view/hr_interview_feedback_interview_result_option_view)</details>||
| 我通过的面试 | my_pass_edit | 通过的面试 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[面试反馈](app/view/hr_interview_feedback_my_pass_edit_view)</details>||
| 填写面试反馈（HR端） | add_feedback_hr | 填写反馈 |无数据|<details><summary>打开视图或向导（模态）</summary>[面试结果](app/view/hr_interview_feedback_interview_result_option_view)</details>||
| 查看面试详情 | open_edit | 面试详情 |单项数据|<details><summary>打开视图或向导（模态）</summary>[面试反馈](app/view/hr_interview_feedback_my_interview_detail)</details>||
| 导出面试安排 | export_interview | 导出面试安排 |无数据|用户自定义||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_interview_feedback?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_feedback?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_feedback?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_feedback?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_feedback?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_feedback?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_feedback?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_feedback?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_feedback?id=界面行为`">
  界面行为
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'minor',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>