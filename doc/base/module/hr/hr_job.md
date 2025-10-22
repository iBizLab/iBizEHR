# 工作岗位(hr_job)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|基于活动的状态 
 逾期：已经超过截止日期 
 现今：活动日期是当天 
 计划：未来活动。|ACTIVITIES_OVERDUE|整型||是||
|今天的活动|ACTIVITIES_TODAY|整型||是||
|工作地点|ADDRESS_ID|外键值|100|是||
|电子邮箱别名|ALIAS_EMAIL|文本，可指定长度|500|是||
|所有申请计计数|ALL_APPLICATION_COUNT|整型||是||
|聘用的申请人|APPLICANT_HIRED|整型||是||
|申请人物业|APPLICANT_PROPERTIES_DEFINITION|长文本，没有长度限制|1048576|是||
|应用计数|APPLICATION_COUNT|整型||是||
|颜色指标|COLOR|整型||是||
|公司|COMPANY_ID|外键值|100|是||
|雇佣类型|CONTRACT_TYPE_ID|外键值|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|起始日期|DATE_FROM|日期型||是||
|结束日期|DATE_TO|日期型||是||
|部门|DEPARTMENT_ID|外键值|100|是||
|工作说明|DESCRIPTION|HTML文本，没有长度限制|1048576|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|文档数|DOCUMENTS_COUNT|整型||是||
|预计员工数合计|EXPECTED_EMPLOYEES|整型||是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|行业|INDUSTRY_ID|外键值|100|是||
|是喜好的|IS_FAVORITE|是否逻辑||是||
|部门经理|MANAGER_ID|外键值|100|是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|名称|NAME|文本，可指定长度|200|是||
|新的申请|NEW_APPLICATION_COUNT|整型||是||
|当前员工数量|NO_OF_EMPLOYEE|整型||是||
|被雇佣的|NO_OF_HIRED_EMPLOYEE|整型||是||
|目标|NO_OF_RECRUITMENT|整型||是||
|旧申请|OLD_APPLICATION_COUNT|整型||是||
|要求|REQUIREMENTS|长文本，没有长度限制|1048576|是||
|序列|SEQUENCE|整型||是||
|招聘人员|USER_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_EMPLOYEE_BASE_HR_JOB_JOB_ID](der/DER1N_HR_EMPLOYEE_BASE_HR_JOB_JOB_ID)|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_JOB_JOB_ID](der/DER1N_HR_EMPLOYEE_HR_JOB_JOB_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_JOB_HR_CONTRACT_TYPE_CONTRACT_TYPE_ID](der/DER1N_HR_JOB_HR_CONTRACT_TYPE_CONTRACT_TYPE_ID)|[合同类型(HR_CONTRACT_TYPE)](module/hr/hr_contract_type)|1:N关系||
|[DER1N_HR_JOB_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_JOB_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_JOB_HR_EMPLOYEE_MANAGER_ID](der/DER1N_HR_JOB_HR_EMPLOYEE_MANAGER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_JOB_RES_COMPANY_COMPANY_ID](der/DER1N_HR_JOB_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_JOB_RES_PARTNER_ADDRESS_ID](der/DER1N_HR_JOB_RES_PARTNER_ADDRESS_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_HR_JOB_RES_PARTNER_INDUSTRY_INDUSTRY_ID](der/DER1N_HR_JOB_RES_PARTNER_INDUSTRY_INDUSTRY_ID)|[行业(RES_PARTNER_INDUSTRY)](module/base/res_partner_industry)|1:N关系||
|[DER1N_HR_JOB_RES_USERS_USER_ID](der/DER1N_HR_JOB_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|移动位置|MoveOrder|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/hr/hr_job/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_job/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_job/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ADDRESS_ID_EQ|工作地点|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_CONTRACT_TYPE_ID_EQ|雇佣类型|EQ||
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_ID_EQ|标识|EQ||
|N_INDUSTRY_ID_EQ|行业|EQ||
|N_MANAGER_ID_EQ|部门经理|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_USER_ID_EQ|招聘人员|EQ||

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
<el-anchor-link :href="`#/module/hr/hr_job?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job?id=搜索模式`">
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