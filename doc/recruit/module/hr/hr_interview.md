# 面试(hr_interview)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|面试地点|ADDRESS_ID|外键值附加数据|100|是||
|候选人申请|APPLICANT_IDS|文本，可指定长度|1000|是||
|候选人|CANDIDATE_DISPLAY_NAME|文本，可指定长度|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|面试时长|DURATION|[单项选择(文本值)](index/dictionary_index#interview_duration "面试时长")|60|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|面试官|INTERVIEWERS|文本，可指定长度|1000|是||
|面试结果|INTERVIEW_RESULT|文本，可指定长度|100|是||
|面试类型|INTERVIEW_TYPE|[外键值附加数据](index/dictionary_index#interview_type "面试类型")|60|是||
|应聘职位|JOB_NAME|文本，可指定长度|100|是||
|会议号|MEETING_ID|文本，可指定长度|100|是||
|联系方式|MOBILE_PHONE|文本，可指定长度|100|是||
|名称|NAME|文本，可指定长度|200|是||
|面试负责人|OWNER_ID|外键值|60|是||
|面试负责人|OWNER_NAME|外键值文本|100|是||
|面试安排|SCHEDULE_ID|外键值|100|是||
|面试阶段|STAGE_ID|[单项选择(文本值)](index/dictionary_index#interview_stage "面试阶段")|60|是||
|面试日期|START_DATE|外键值附加数据||是||
|面试时间|START_TIME|[单项选择(文本值)](index/dictionary_index#interview_start_time "面试开始时间")|200|是||
|面试状态|STATUS|[单项选择(文本值)](index/dictionary_index#interview_status "面试状态")|60|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_INTERVIEW_HR_INTERVIEW_INTERVIEW_ID](der/DER1N_HR_APPLICANT_INTERVIEW_HR_INTERVIEW_INTERVIEW_ID)|[候选人申请与面试关系(HR_APPLICANT_INTERVIEW)](module/hr/hr_applicant_interview)|1:N关系||
|[DER1N_HR_INTERVIEW_FEEDBACK_HR_INTERVIEW_INTERVIEW_ID](der/DER1N_HR_INTERVIEW_FEEDBACK_HR_INTERVIEW_INTERVIEW_ID)|[面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)|1:N关系||
|[DER1N_HR_INTERVIEW_USER_HR_INTERVIEW_INTERVIEW_ID](der/DER1N_HR_INTERVIEW_USER_HR_INTERVIEW_INTERVIEW_ID)|[面试参与者(HR_INTERVIEW_USER)](module/hr/hr_interview_user)|1:N关系||
|[HR_INTERVIEW_HR_INTERVIEW_USER](der/HR_INTERVIEW_HR_INTERVIEW_USER)|[面试参与者(HR_INTERVIEW_USER)](module/hr/hr_interview_user)|自定义关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_INTERVIEW_HR_EMPLOYEE_OWNER_ID](der/DER1N_HR_INTERVIEW_HR_EMPLOYEE_OWNER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_INTERVIEW_HR_INTERVIEW_SCHEDULE_SCHEDULE_ID](der/DER1N_HR_INTERVIEW_HR_INTERVIEW_SCHEDULE_SCHEDULE_ID)|[面试安排(HR_INTERVIEW_SCHEDULE)](module/hr/hr_interview_schedule)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#hr_interview_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|行为|nothing|用户自定义|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[创建面试详情(参与者、待反馈）](module/hr/hr_interview/logic/create_interview_info)|create_interview_info|无|||
|[预设面试信息（临时）](module/hr/hr_interview/logic/set_interview_info)|set_interview_info|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_interview/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_interview/query/View)|VIEW|否|否 |否 ||
|[今后之后的面试(AFTER_INTERVIEW)](module/hr/hr_interview/query/after_interview)|AFTER_INTERVIEW|否|否 |否 ||
|[今天之前的面试(BEFORE_INTERVIEW)](module/hr/hr_interview/query/before_interview)|BEFORE_INTERVIEW|否|否 |否 ||
|[bi_search](module/hr/hr_interview/query/bi_search)|bi_search|否|否 |否 ||
|[今天的面试(CURRENT_INTERVIEW)](module/hr/hr_interview/query/current_interview)|CURRENT_INTERVIEW|否|否 |否 ||
|[查询我的面试(MY_INTERVIEW)](module/hr/hr_interview/query/my_interview)|MY_INTERVIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_interview/dataset/Default)|DEFAULT|数据查询|是|||
|[今后之后的面试(AFTER_INTERVIEW)](module/hr/hr_interview/dataset/after_interview)|AFTER_INTERVIEW|数据查询|否|||
|[今天之前的面试(BEFORE_INTERVIEW)](module/hr/hr_interview/dataset/before_interview)|BEFORE_INTERVIEW|数据查询|否|||
|[bi_search](module/hr/hr_interview/dataset/bi_search)|bi_search|数据查询|否|||
|[今天的面试(CURRENT_INTERVIEW)](module/hr/hr_interview/dataset/current_interview)|CURRENT_INTERVIEW|数据查询|否|||
|[我的面试(MY_INTERVIEW)](module/hr/hr_interview/dataset/my_interview)|MY_INTERVIEW|数据查询|否|||

## 数据权限

##### 全部数据（读写） :id=hr_interview-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `CREATE`
* `READ`
* `UPDATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ADDRESS_ID_EQ|面试地点|EQ||
|N_DURATION_EQ|面试时长|EQ||
|N_ID_EQ|标识|EQ||
|N_INTERVIEW_TYPE_EQ|面试类型|EQ||
|N_JOB_NAME_EQ|应聘职位|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_OWNER_ID_EQ|面试负责人|EQ||
|N_OWNER_NAME_EQ|面试负责人|EQ||
|N_OWNER_NAME_LIKE|面试负责人|LIKE||
|N_SCHEDULE_ID_EQ|面试安排|EQ||
|N_STAGE_ID_EQ|面试阶段|EQ||
|N_START_TIME_EQ|面试时间|EQ||
|N_STATUS_EQ|面试状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 填写反馈 | add_feedback | 填写反馈 |无数据|<details><summary>打开视图或向导（模态）</summary>[面试结果](app/view/hr_interview_feedback_interview_result_option_view)</details>||
| 预约面试 | appointment_interview | 预约面试 |无数据|用户自定义||
| 查看面试 | open_interview | 查看面试 |单项数据|<details><summary>打开视图或向导（模态）</summary></details>||
| 进入面试 | start_interview | 进入面试 |单项数据|<details><summary>后台调用</summary>[nothing](#行为)||
| 添加面试 | add_interview | 添加面试 |无数据|<details><summary>打开视图或向导（模态）</summary>[新建面试安排](app/view/hr_interview_schedule_create_option_view)</details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[查看面试](module/hr/hr_interview/uilogic/open_interview)|open_interview||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_interview?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview?id=界面逻辑`">
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