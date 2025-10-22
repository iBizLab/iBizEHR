# 招聘需求(hr_idea)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|工作地点|ADDRESS_ID|文本，可指定长度|100|是||
|关联职位|CONNECTED_JOBS|一对多关系数据集合|1048576|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|招聘开始时间|DATE_FROM|日期型||是||
|招聘结束时间|DATE_TO|日期型||是||
|需求部门|DEPARTMENT_CODE|文本，可指定长度|100|是||
|需求描述|DESCRIPTION|长文本，没有长度限制|1048576|是||
|学历要求|EDUCATION|[文本，可指定长度](index/dictionary_index#idea_education "学历要求")|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|需求编号|IDENTIFIER|文本，可指定长度|100|是||
|职位名称|JOB_NAME|文本，可指定长度|100|是||
|职位性质|JOB_TYPE|[单项选择(文本值)](index/dictionary_index#job_type "岗位性质")|60|是||
|管理职级|MANAGEMENT_RANK_IDS|文本，可指定长度|100|是||
|负责人工号|MANAGER_EMPLOYEE_IDS|文本，可指定长度|100|是||
|最高薪资|MAX_SALARY|整型||是||
|最低薪资|MIN_SALARY|整型||是||
|名称|NAME|文本，可指定长度|100|是||
|需求人数|NEED_NUMBER|整型||是||
|发薪方式|PAYMENTMETHOD|[整型](index/dictionary_index#idea_paymentMethod "发薪方式")||是||
|发薪月数|PAYPERIOD|整型||是||
|专业职级|PROFESSIONAL_RANK_IDS|文本，可指定长度|100|是||
|薪资单位|SALARY_UNIT|[整型](index/dictionary_index#idea_salaryUnit "薪资单位")||是||
|需求状态|STATUS|[单项选择(文本值)](index/dictionary_index#idea_status "需求状态")|60|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_IDEA_JOB_HR_IDEA_IDEA_ID](der/DER1N_HR_IDEA_JOB_HR_IDEA_IDEA_ID)|[需求与职位关系(HR_IDEA_JOB)](module/hr/hr_idea_job)|1:N关系||
|[DER1N_HR_OFFER_HR_IDEA_HR_IDEA_ID](der/DER1N_HR_OFFER_HR_IDEA_HR_IDEA_ID)|[OFFER录用(HR_OFFER)](module/hr/hr_offer)|1:N关系||


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
|需求计数器|idea_status_count|[实体处理逻辑](module/hr/hr_idea/logic/idea_status_count "招聘需求搜索栏计数")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[招聘需求搜索栏计数](module/hr/hr_idea/logic/idea_status_count)|idea_status_count|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[招聘_未进行(notstarted)](module/hr/hr_idea/query/DataQuery2)|notstarted|否|否 |否 ||
|[招聘_进行中(started)](module/hr/hr_idea/query/DataQuery3)|started|否|否 |否 ||
|[招聘_草稿(Draft)](module/hr/hr_idea/query/DataQuery4)|Draft|否|否 |否 ||
|[招聘_暂停(Paused)](module/hr/hr_idea/query/DataQuery5)|Paused|否|否 |否 ||
|[招聘_已完成(Completed)](module/hr/hr_idea/query/DataQuery6)|Completed|否|否 |否 ||
|[招聘_已取消(Canceled)](module/hr/hr_idea/query/DataQuery7)|Canceled|否|否 |否 ||
|[招聘_已超期(Overdue)](module/hr/hr_idea/query/DataQuery8)|Overdue|否|否 |否 ||
|[数据查询(DEFAULT)](module/hr/hr_idea/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_idea/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[招聘_已取消(Canceled)](module/hr/hr_idea/dataset/Canceled)|Canceled|数据查询|否|||
|[招聘_已完成(Completed)](module/hr/hr_idea/dataset/Completed)|Completed|数据查询|否|||
|[招聘_未进行(notstarted)](module/hr/hr_idea/dataset/DataSet2)|notstarted|数据查询|否|||
|[招聘_进行中(started)](module/hr/hr_idea/dataset/DataSet3)|started|数据查询|否|||
|[招聘_草稿(Draft)](module/hr/hr_idea/dataset/DataSet4)|Draft|数据查询|否|||
|[招聘_暂停(Paused)](module/hr/hr_idea/dataset/DataSet5)|Paused|数据查询|否|||
|[招聘_已超期(Overdue)](module/hr/hr_idea/dataset/DataSet6)|Overdue|数据查询|否|||
|[数据集(DEFAULT)](module/hr/hr_idea/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### 全部数据（读写） :id=hr_idea-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `CREATE`
* `DELETE`
* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ADDRESS_ID_EQ|工作地点|EQ||
|N_CREATE_DATE_EQ|建立时间|EQ||
|N_DEPARTMENT_CODE_EQ|需求部门|EQ||
|N_ID_EQ|标识|EQ||
|N_IDENTIFIER_EQ|需求编号|EQ||
|N_JOB_NAME_EQ|职位名称|EQ||
|N_JOB_TYPE_EQ|职位性质|EQ||
|N_MANAGEMENT_RANK_IDS_EQ|管理职级|EQ||
|N_MANAGER_EMPLOYEE_IDS_EQ|负责人工号|EQ||
|N_MAX_SALARY_EQ|最高薪资|EQ||
|N_MIN_SALARY_EQ|最低薪资|EQ||
|N_NAME_EQ|名称|EQ||
|N_NEED_NUMBER_EQ|需求人数|EQ||
|N_PROFESSIONAL_RANK_IDS_EQ|专业职级|EQ||
|N_SALARY_UNIT_EQ|薪资单位|EQ||
|N_STATUS_EQ|需求状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 新建招聘需求 | Create | 新建招聘需求 |无数据|<details><summary>打开视图或向导（模态）</summary>[招聘需求新建](app/view/hr_idea_create_view)</details>||
| 创建职位 | create_job | 创建职位 |无数据|<details><summary>打开视图或向导（模态）</summary>[招聘职位](app/view/hr_job_create_wizard_view)</details>||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_idea?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea?id=界面行为`">
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