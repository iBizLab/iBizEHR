# 考试/测评(hr_exam)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|所在地|ADDRESS|外键值附加数据|200|是||
|发给候选人的测评链接|ANSWERLINK|文本，可指定长度|300|是||
|考试|APPLICANT_ID|外键值|100|是||
|报告|ATTACHMENT|文本，可指定长度|1000|是||
|候选人名称|CANDIDATE_DISPLAY_NAME|外键值附加数据|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|发起时间|CREATE_TIME|日期时间型||是||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|备注|DESCRIPTION|外键值附加数据|1048576|是||
|详细成绩|DETAIL_RESULT|长文本，长度1000|2000|是||
|教育程度|EDUCATION|[外键值附加数据](index/dictionary_index#job_education "教育程度")|100|是||
|邮箱|EMAIL_FROM|外键值附加数据|100|是||
|工作经验|EXPERIENCE|[外键值附加数据](index/dictionary_index#job_experience "工作经验")|100|是||
|完成时间|FINISH_TIME|日期时间型||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|职位|JOB_NAME|外键值附加数据|200|是||
|平台名称|JOB_PLATFORM_NAME|外键值附加数据|200|是||
|教育程度|LAST_EDU_ACADEMIC_DEGREE|[外键值附加数据](index/dictionary_index#job_education "教育程度")|100|是||
|手机号|MOBILE_PHONE|外键值附加数据|100|是||
|名称|NAME|文本，可指定长度|200|是||
|考试测评结果|RESULT|文本，可指定长度|100|是||
|服务商|SOURCE|文本，可指定长度|100|是||
|考试状态|STATUS|[单项选择(文本值)](index/dictionary_index#exam_status "考试状态")|60|是||
|类型|TYPE|[单项选择(文本值)](index/dictionary_index#exam_type "考试评测类型")|60|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_EXAM_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_EXAM_HR_APPLICANT_APPLICANT_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||

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
|用人经理-我的考试/测评-搜索栏计数器|my_interview_count|[实体处理逻辑](module/hr/hr_exam/logic/my_interview_count "my_interview_count")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[my_interview_count](module/hr/hr_exam/logic/my_interview_count)|my_interview_count|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_exam/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_exam/query/View)|VIEW|否|否 |否 ||
|[用人经理数据集(hm_myself)](module/hr/hr_exam/query/hm_myself)|hm_myself|否|否 |否 ||
|[待反馈(unevaluated)](module/hr/hr_exam/query/unevaluated)|unevaluated|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_exam/dataset/Default)|DEFAULT|数据查询|是|||
|[待反馈(await_feedback)](module/hr/hr_exam/dataset/await_feedback)|await_feedback|数据查询|否|||
|[用人经理数据集(hm_myself)](module/hr/hr_exam/dataset/hm_myself)|hm_myself|数据查询|否|||

## 数据权限

##### 全部数据（读写） :id=hr_exam-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `DELETE`
* `CREATE`
* `UPDATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_APPLICANT_ID_EQ|考试|EQ||
|N_CANDIDATE_DISPLAY_NAME_LIKE|候选人名称|LIKE||
|N_ID_EQ|标识|EQ||
|N_JOB_NAME_EQ|职位|EQ||
|N_JOB_NAME_LIKE|职位|LIKE||
|N_NAME_LIKE|名称|LIKE||
|N_STATUS_EQ|考试状态|EQ||
|N_TYPE_EQ|类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加考试/评测信息 | re_enter | 添加考试/评测信息 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[添加考试/评测](app/view/hr_exam_option_view)</details>||
| 添加考试测评 | panel_usr1013394229_button_calluilogic_click | 添加考试/评测 |单项数据|<details><summary>打开视图或向导（模态）</summary>[添加考试/评测](app/view/hr_exam_quick_create_view)</details>||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_exam?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_exam?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_exam?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_exam?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_exam?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_exam?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_exam?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_exam?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_exam?id=界面行为`">
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