# 筛选候选人明细(hr_candidate_filter_detail)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|所在地|ADDRESS|外键值附加数据|200|是||
|申请日期|APPLICANT_CREATE_DATE|外键值附加数据||是||
|申请标识|APPLICANT_ID|外键值|100|是||
|候选人名称|CANDIDATE_DISPLAY_NAME|外键值附加数据|100|是||
|筛选|CANDIDATE_FILTER_ID|外键值|100|是||
|候选人|CANDIDATE_NAME|外键值文本|200|是||
|内容|CONTENT|长文本，没有长度限制|1048576|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|备注|DESCRIPTION|外键值附加数据|1048576|是||
|教育程度|EDUCATION|[外键值附加数据](index/dictionary_index#job_education "教育程度")|100|是||
|邮箱|EMAIL_FROM|外键值附加数据|100|是||
|工作经验|EXPERIENCE|[外键值附加数据](index/dictionary_index#job_experience "工作经验")|100|是||
|反馈信息|FEEDBACK_INFORMATION|长文本，长度1000|2000|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|职位名称|JOB_NAME|外键值附加数据|200|是||
|招聘平台|JOB_PLATFORM_NAME|外键值附加数据|200|是||
|教育程度|LAST_EDU_ACADEMIC_DEGREE|[外键值附加数据](index/dictionary_index#job_education "教育程度")|100|是||
|毕业院校|LAST_EDU_SCHOOL|外键值附加数据|100|是||
|备注|MEMO|长文本，长度1000|2000|是||
|手机号|MOBILE_PHONE|外键值附加数据|100|是||
|名称|NAME|文本，可指定长度|200|是||
|职位优先级|PRIORITY_ID|[外键值附加数据](index/dictionary_index#job_priority "职位优先级")|100|是||
|阶段名|STAGE_NAME|外键值附加数据|200|是||
|状态|STATUS|[单项选择(文本值)](index/dictionary_index#candidate_filter_status "候选人筛选状态")|60|是||
|类型|TYPE|[单项选择(文本值)](index/dictionary_index#candidate_filter_detail_type "推荐类型")|60|是||
|人员|USER_ID|外键值|60|是||
|用户姓名|USER_NAME|外键值附加数据|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||

<p class="panel-title"><b>联合主键</b></p>

  * `申请标识(APPLICANT_ID)`
  * `人员(USER_ID)`

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_CANDIDATE_FILTER_DETAIL_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_CANDIDATE_FILTER_DETAIL_HR_APPLICANT_APPLICANT_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||
|[DER1N_HR_CANDIDATE_FILTER_DETAIL_HR_CANDIDATE_FILTER_CANDIDATE_FILTER_ID](der/DER1N_HR_CANDIDATE_FILTER_DETAIL_HR_CANDIDATE_FILTER_CANDIDATE_FILTER_ID)|[筛选候选人(HR_CANDIDATE_FILTER)](module/hr/hr_candidate_filter)|1:N关系||
|[DER1N_HR_CANDIDATE_FILTER_DETAIL_HR_EMPLOYEE_USER_ID](der/DER1N_HR_CANDIDATE_FILTER_DETAIL_HR_EMPLOYEE_USER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||

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
|筛选人数|filter_count|[实体处理逻辑](module/hr/hr_candidate_filter_detail/logic/filter_count "筛选人数")|默认|不支持||||
|用人经理-简历筛选-搜索栏计数器|my_filter_count|[实体处理逻辑](module/hr/hr_candidate_filter_detail/logic/my_filter_count "用人经理-简历筛选-搜索栏计数器")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[用人经理-简历筛选-搜索栏计数器](module/hr/hr_candidate_filter_detail/logic/my_filter_count)|my_filter_count|无|||
|[筛选人数](module/hr/hr_candidate_filter_detail/logic/filter_count)|filter_count|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_candidate_filter_detail/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_candidate_filter_detail/query/View)|VIEW|否|否 |否 ||
|[已评价(evaluated)](module/hr/hr_candidate_filter_detail/query/evaluated)|evaluated|否|否 |否 ||
|[筛选_个人(filter_myself)](module/hr/hr_candidate_filter_detail/query/filter_myself)|filter_myself|否|否 |否 ||
|[未评价(unevaluated)](module/hr/hr_candidate_filter_detail/query/unevaluated)|unevaluated|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_candidate_filter_detail/dataset/Default)|DEFAULT|数据查询|是|||
|[已评价(evaluated)](module/hr/hr_candidate_filter_detail/dataset/evaluated)|evaluated|数据查询|否|||
|[筛选_个人(filter_myself)](module/hr/hr_candidate_filter_detail/dataset/filter_myself)|filter_myself|数据查询|否|||
|[未评价(unevaluated)](module/hr/hr_candidate_filter_detail/dataset/unevaluated)|unevaluated|数据查询|否|||

## 数据权限

##### 全部数据（读写） :id=hr_candidate_filter_detail-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `UPDATE`
* `READ`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_APPLICANT_ID_EQ|申请标识|EQ||
|N_CANDIDATE_FILTER_ID_EQ|筛选|EQ||
|N_CANDIDATE_NAME_EQ|候选人|EQ||
|N_CANDIDATE_NAME_LIKE|候选人|LIKE||
|N_ID_EQ|标识|EQ||
|N_JOB_NAME_EQ|职位名称|EQ||
|N_JOB_NAME_LIKE|职位名称|LIKE||
|N_NAME_LIKE|名称|LIKE||
|N_PRIORITY_ID_EQ|职位优先级|EQ||
|N_STATUS_EQ|状态|EQ||
|N_TYPE_EQ|类型|EQ||
|N_USER_ID_EQ|人员|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 打开筛选操作界面 | filter | 筛选 |单项数据|<details><summary>打开视图或向导（模态）</summary>[简历筛选操作](app/view/hr_candidate_filter_detail_filter_edit_view)</details>||
| 查看详情 | open_edit | 查看详情 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[筛选候选人明细](app/view/hr_candidate_filter_detail_edit_view)</details>||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_candidate_filter_detail?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate_filter_detail?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate_filter_detail?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate_filter_detail?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate_filter_detail?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate_filter_detail?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate_filter_detail?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate_filter_detail?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate_filter_detail?id=界面行为`">
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