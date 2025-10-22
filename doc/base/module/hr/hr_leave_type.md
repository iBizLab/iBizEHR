# 休假类型(hr_leave_type)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|应计数量|ACCRUAL_COUNT|浮点||是||
|有效|ACTIVE|是否逻辑||是||
|分配|ALLOCATION_COUNT|整型||是||
|分配通知子类型|ALLOCATION_NOTIF_SUBTYPE_ID|外键值|100|是||
|审批|ALLOCATION_VALIDATION_TYPE|[单项选择(文本值)](index/dictionary_index#hr_leave_type_allocation_validation_type "审批")|60|是||
|允许负上限|ALLOWS_NEGATIVE|是否逻辑||是||
|颜色|COLOR|整型||是||
|公司|COMPANY_ID|外键值|100|是||
|在日历中显示休假|CREATE_CALENDAR_MEETING|是否逻辑||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|员工要求|EMPLOYEE_REQUESTS|[单项选择(文本值)](index/dictionary_index#hr_leave_type_employee_requests "员工要求")|60|否||
|休假分组|GROUP_DAYS_LEAVE|浮点||是||
|拥有有效的分配|HAS_VALID_ALLOCATION|是否逻辑||是||
|封面图片|ICON_ID|外键值|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|包括公众假期|INCLUDE_PUBLIC_HOLIDAYS_IN_DURATION|是否逻辑||是||
|已休假|LEAVES_TAKEN|浮点||是||
|休假通知子类型|LEAVE_NOTIF_SUBTYPE_ID|外键值|100|是||
|休假验证|LEAVE_VALIDATION_TYPE|[单项选择(文本值)](index/dictionary_index#hr_leave_type_leave_validation_type "休假验证")|60|是||
|最大超量|MAX_ALLOWED_NEGATIVE|整型||是||
|最大允许|MAX_LEAVES|浮点||是||
|名称|NAME|文本，可指定长度|200|是||
|调休申请|OVERTIME_DEDUCTIBLE|是否逻辑||是||
|休假最小单位|REQUEST_UNIT|[单项选择(文本值)](index/dictionary_index#hr_leave_type_request_unit "休假最小单位")|60|否||
|需要分配|REQUIRES_ALLOCATION|[单项选择(文本值)](index/dictionary_index#hr_leave_type_requires_allocation "需要分配")|60|否||
|序列|SEQUENCE|整型||是||
|在仪表板显示|SHOW_ON_DASHBOARD|是否逻辑||是||
|支持性文件|SUPPORT_DOCUMENT|是否逻辑||是||
|休假种类|TIME_TYPE|[单项选择(文本值)](index/dictionary_index#hr_leave_type_time_type "休假种类")|60|是||
|没付款|UNPAID|是否逻辑||是||
|有效的剩余休假|VIRTUAL_REMAINING_LEAVES|浮点||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_LEAVE_TYPE_IR_ATTACHMENT_ICON_ID](der/DER1N_HR_LEAVE_TYPE_IR_ATTACHMENT_ICON_ID)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|1:N关系||
|[DER1N_HR_LEAVE_TYPE_MAIL_MESSAGE_SUBTYPE_ALLOCATION_NOTIF_SUBTYPE_ID](der/DER1N_HR_LEAVE_TYPE_MAIL_MESSAGE_SUBTYPE_ALLOCATION_NOTIF_SUBTYPE_ID)|[消息子类型(MAIL_MESSAGE_SUBTYPE)](module/mail/mail_message_subtype)|1:N关系||
|[DER1N_HR_LEAVE_TYPE_MAIL_MESSAGE_SUBTYPE_LEAVE_NOTIF_SUBTYPE_ID](der/DER1N_HR_LEAVE_TYPE_MAIL_MESSAGE_SUBTYPE_LEAVE_NOTIF_SUBTYPE_ID)|[消息子类型(MAIL_MESSAGE_SUBTYPE)](module/mail/mail_message_subtype)|1:N关系||
|[DER1N_HR_LEAVE_TYPE_RES_COMPANY_COMPANY_ID](der/DER1N_HR_LEAVE_TYPE_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||

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
|[DEFAULT](module/hr/hr_leave_type/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_leave_type/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_leave_type/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ALLOCATION_NOTIF_SUBTYPE_ID_EQ|分配通知子类型|EQ||
|N_ALLOCATION_VALIDATION_TYPE_EQ|审批|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_EMPLOYEE_REQUESTS_EQ|员工要求|EQ||
|N_ICON_ID_EQ|封面图片|EQ||
|N_ID_EQ|标识|EQ||
|N_LEAVE_NOTIF_SUBTYPE_ID_EQ|休假通知子类型|EQ||
|N_LEAVE_VALIDATION_TYPE_EQ|休假验证|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_REQUEST_UNIT_EQ|休假最小单位|EQ||
|N_REQUIRES_ALLOCATION_EQ|需要分配|EQ||
|N_TIME_TYPE_EQ|休假种类|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_leave_type?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_type?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_type?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_type?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_type?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_leave_type?id=搜索模式`">
  搜索模式
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