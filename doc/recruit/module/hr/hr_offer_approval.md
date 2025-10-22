# offer审核(hr_offer_approval)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|所在地|ADDRESS|外键值附加数据|200|是||
|候选人名称|CANDIDATE_DISPLAY_NAME|外键值附加数据|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|教育程度|EDUCATION|[外键值附加数据](index/dictionary_index#job_education "教育程度")|100|是||
|邮箱|EMAIL_FROM|外键值附加数据|100|是||
|工作经验|EXPERIENCE|[外键值附加数据](index/dictionary_index#job_experience "工作经验")|100|是||
|offer标识|HR_OFFER_ID|外键值|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|应聘职位|JOB_NAME|外键值附加数据|100|是||
|平台名称|JOB_PLATFORM_NAME|外键值附加数据|200|是||
|手机号|MOBILE_PHONE|外键值附加数据|100|是||
|名称|NAME|文本，可指定长度|200|是||
|审批状态|PERIOD|[单项选择(文本值)](index/dictionary_index#offer_approval_period "offer审核状态")|60|是||
|入职部门|RES_COMPANY_NAME|外键值附加数据|100|是||
|审核结果状态|STATUS|[单项选择(文本值)](index/dictionary_index#offer_approval_status "offer审核结果状态")|60|是||
|审核信息|WFMEMO|长文本，长度1000|2000|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_OFFER_APPROVAL_HR_OFFER_HR_OFFER_ID_D7D756](der/DER1N_HR_OFFER_APPROVAL_HR_OFFER_HR_OFFER_ID_D7D756)|[OFFER录用(HR_OFFER)](module/hr/hr_offer)|1:N关系||

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
|审批|approval|[实体处理逻辑](module/hr/hr_offer_approval/logic/approval "审批")|默认|不支持||||
|用人经理-我的offer-搜索栏计数器|my_offer_count|[实体处理逻辑](module/hr/hr_offer_approval/logic/my_offer_count "用人经理-我的offer-搜索栏计数器")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[审批](module/hr/hr_offer_approval/logic/approval)|approval|无|||
|[用人经理-我的offer-搜索栏计数器](module/hr/hr_offer_approval/logic/my_offer_count)|my_offer_count|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/hr/hr_offer_approval/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_offer_approval/query/View)|VIEW|否|否 |否 ||
|[用人经理数据集(hm_myself)](module/hr/hr_offer_approval/query/hm_myself)|hm_myself|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_offer_approval/dataset/Default)|DEFAULT|数据查询|是|||
|[用人经理数据集(hm_myself)](module/hr/hr_offer_approval/dataset/hm_myself)|hm_myself|数据查询|否|||

## 数据权限

##### 全部数据（读写） :id=hr_offer_approval-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `UPDATE`
* `DELETE`
* `CREATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CANDIDATE_DISPLAY_NAME_LIKE|候选人名称|LIKE||
|N_HR_OFFER_ID_EQ|offer标识|EQ||
|N_ID_EQ|标识|EQ||
|N_JOB_NAME_EQ|应聘职位|EQ||
|N_JOB_NAME_LIKE|应聘职位|LIKE||
|N_NAME_LIKE|名称|LIKE||
|N_PERIOD_EQ|审批状态|EQ||
|N_STATUS_EQ|审核结果状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 审批 | approval | 审批 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[offer审核操作](app/view/hr_offer_approval_option_view)</details>||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_offer_approval?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer_approval?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer_approval?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer_approval?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer_approval?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer_approval?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer_approval?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer_approval?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer_approval?id=界面行为`">
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