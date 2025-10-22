# 组织(res_company)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|业务维度上级|BUSINESS_PARENT_ID|外键值|60|是||
|业务维度序号|BUSINESS_SORT|整型||是||
|大类|CATEGORY|[单项选择(文本值)](index/dictionary_index#hr_company_type "组织类型")|60|是||
|所在地点|CITY|文本，可指定长度|500|是||
|文号|CODE|文本，可指定长度|100|是||
|设立日期|COMPANY_CREATEDATE|日期型||是||
|简介|COMPANY_DETAILS|长文本，没有长度限制|1048576|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|hrbp|HRBP_ID|外键值|60|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|编码|IDENTIFIER|文本，可指定长度|100|是||
|虚拟组织|IS_VIRTUAL|是否逻辑||是||
|层级|LEVEL|单项选择(文本值)|60|是||
|行政维度上级|MANAGEMENT_PARENT_ID|外键值|60|是||
|行政维度序号|MANAGEMENT_SORT|整型||是||
|负责人|MANAGER_ID|外键值|60|是||
|负责人|MANAGER_NAME|外键值文本|100|是||
|名称|NAME|文本，可指定长度|100|是||
|简称|SHORT_NAME|文本，可指定长度|100|是||
|地址|STREET|文本，可指定长度|500|是||
|电话|TELEPHONE|文本，可指定长度|100|是||
|类型|TYPE|单项选择(文本值)|60|是||
|网址|WEBSITE|文本，可指定长度|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_REFUSE_REASON_RES_COMPANY_COMPANY_ID](der/DER1N_HR_APPLICANT_REFUSE_REASON_RES_COMPANY_COMPANY_ID)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_DEPARTMENT_RES_COMPANY_COMPANY_ID](der/DER1N_HR_DEPARTMENT_RES_COMPANY_COMPANY_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_COMPANY_COMPANY_ID](der/DER1N_HR_EMPLOYEE_RES_COMPANY_COMPANY_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_OFFER_RES_COMPANY_RES_COMPANY_ID](der/DER1N_HR_OFFER_RES_COMPANY_RES_COMPANY_ID)|[OFFER录用(HR_OFFER)](module/hr/hr_offer)|1:N关系||
|[DER1N_HR_WORK_LOCATION_RES_COMPANY_COMPANY_ID](der/DER1N_HR_WORK_LOCATION_RES_COMPANY_COMPANY_ID)|[工作地点(HR_WORK_LOCATION)](module/hr/hr_work_location)|1:N关系||
|[DER1N_IR_ATTACHMENT_RES_COMPANY_COMPANY_ID](der/DER1N_IR_ATTACHMENT_RES_COMPANY_COMPANY_ID)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|1:N关系||
|[DER1N_RES_COMPANY_RES_COMPANY_BUSINESS_PARENT_ID](der/DER1N_RES_COMPANY_RES_COMPANY_BUSINESS_PARENT_ID)|[组织(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_COMPANY_RES_COMPANY_MANAGEMENT_PARENT_ID](der/DER1N_RES_COMPANY_RES_COMPANY_MANAGEMENT_PARENT_ID)|[组织(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_USERS_RES_COMPANY_COMPANY_ID](der/DER1N_RES_USERS_RES_COMPANY_COMPANY_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RES_COMPANY_HR_EMPLOYEE_HRBP_ID](der/DER1N_RES_COMPANY_HR_EMPLOYEE_HRBP_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_RES_COMPANY_HR_EMPLOYEE_MANAGER_ID](der/DER1N_RES_COMPANY_HR_EMPLOYEE_MANAGER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_RES_COMPANY_RES_COMPANY_BUSINESS_PARENT_ID](der/DER1N_RES_COMPANY_RES_COMPANY_BUSINESS_PARENT_ID)|[组织(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_COMPANY_RES_COMPANY_MANAGEMENT_PARENT_ID](der/DER1N_RES_COMPANY_RES_COMPANY_MANAGEMENT_PARENT_ID)|[组织(RES_COMPANY)](module/base/res_company)|1:N关系||

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

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/base/res_company/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/res_company/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/base/res_company/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### 全部数据（读写） :id=res_company-ALL_RW

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
|N_BUSINESS_PARENT_ID_EQ|业务维度上级|EQ||
|N_CATEGORY_EQ|大类|EQ||
|N_HRBP_ID_EQ|hrbp|EQ||
|N_ID_EQ|标识|EQ||
|N_LEVEL_EQ|层级|EQ||
|N_MANAGEMENT_PARENT_ID_EQ|行政维度上级|EQ||
|N_MANAGER_ID_EQ|负责人|EQ||
|N_MANAGER_NAME_EQ|负责人|EQ||
|N_MANAGER_NAME_LIKE|负责人|LIKE||
|N_NAME_LIKE|名称|LIKE||
|N_TYPE_EQ|类型|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_company?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=搜索模式`">
  搜索模式
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