# 基本员工(hr_employee_base)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|工作地址|ADDRESS_ID|外键值|100|是||
|分配总数量|ALLOCATIONS_COUNT|整型||是||
|分配的总天数。|ALLOCATION_COUNT|浮点||是||
|分配显示|ALLOCATION_DISPLAY|文本，可指定长度|500|是||
|剩余的分配显示|ALLOCATION_REMAINING_DISPLAY|文本，可指定长度|500|是||
|间接下属统计|CHILD_ALL_COUNT|整型||是||
|直接下属人数|CHILD_COUNT|整型||是||
|教练|COACH_ID|外键值|100|是||
|颜色指标|COLOR|整型||是||
|公司|COMPANY_ID|外键值|100|是||
|当前休假状态|CURRENT_LEAVE_STATE|[单项选择(文本值)](index/dictionary_index#hr_employee_base_current_leave_state "当前休假状态")|200|是||
|部门|DEPARTMENT_ID|外键值|100|是||
|费用筛选|FILTER_FOR_EXPENSE|是否逻辑||是||
|有徽章|HAS_BADGES|是否逻辑||是||
|人力资源显示的图标|HR_ICON_DISPLAY|[单项选择(文本值)](index/dictionary_index#hr_employee_base_hr_icon_display "人力资源显示的图标")|200|是||
|人力资源出席状态|HR_PRESENCE_STATE|[单项选择(文本值)](index/dictionary_index#hr_employee_base_hr_presence_state "人力资源出席状态")|200|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|今日缺勤|IS_ABSENT|是否逻辑||是||
|灵活可变|IS_FLEXIBLE|是否逻辑||是||
|完全灵活|IS_FULLY_FLEXIBLE|是否逻辑||是||
|工作岗位|JOB_ID|外键值|100|是||
|工作头衔|JOB_TITLE|文本，可指定长度|500|是||
|上个活动|LAST_ACTIVITY|日期型||是||
|上个活动时间|LAST_ACTIVITY_TIME|文本，可指定长度|500|是||
|休假次数|LEAVES_COUNT|浮点||是||
|起始日期|LEAVE_DATE_FROM|日期型||是||
|至日期|LEAVE_DATE_TO|日期型||是||
|休假|LEAVE_MANAGER_ID|外键值|100|是||
|部门数量|MEMBER_OF_DEPARTMENT|是否逻辑||是||
|办公手机|MOBILE_PHONE|文本，可指定长度|500|是||
|名称|NAME|文本，可指定长度|200|是||
|最近聘用的|NEWLY_HIRED|是否逻辑||是||
|管理员|PARENT_ID|外键值|100|是||
|可用休假天数|REMAINING_LEAVES|浮点||是||
|资源日历|RESOURCE_CALENDAR_ID|外键值|100|是||
|资源|RESOURCE_ID|外键值|100|是||
|显示HR图标|SHOW_HR_ICON_DISPLAY|是否逻辑||是||
|能够查看到剩余休假|SHOW_LEAVES|是否逻辑||是||
|用户|USER_ID|外键值|100|是||
|工作联系人|WORK_CONTACT_ID|外键值|100|是||
|工作电子邮件|WORK_EMAIL|文本，可指定长度|500|是||
|工作地点|WORK_LOCATION_ID|外键值|100|是||
|工作位置名称|WORK_LOCATION_NAME|文本，可指定长度|500|是||
|工作位置类型|WORK_LOCATION_TYPE|[单项选择(文本值)](index/dictionary_index#hr_employee_base_work_location_type "工作位置类型")|200|是||
|办公电话|WORK_PHONE|文本，可指定长度|500|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERMULINH_HR_EMPLOYEE_HR_EMPLOYEE_BASE](der/DERMULINH_HR_EMPLOYEE_HR_EMPLOYEE_BASE)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|多继承关系（虚拟实体）||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_EMPLOYEE_BASE_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EMPLOYEE_BASE_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_HR_EMPLOYEE_COACH_ID](der/DER1N_HR_EMPLOYEE_BASE_HR_EMPLOYEE_COACH_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_HR_EMPLOYEE_PARENT_ID](der/DER1N_HR_EMPLOYEE_BASE_HR_EMPLOYEE_PARENT_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_HR_JOB_JOB_ID](der/DER1N_HR_EMPLOYEE_BASE_HR_JOB_JOB_ID)|[工作岗位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_HR_WORK_LOCATION_WORK_LOCATION_ID](der/DER1N_HR_EMPLOYEE_BASE_HR_WORK_LOCATION_WORK_LOCATION_ID)|[工作地点(HR_WORK_LOCATION)](module/hr/hr_work_location)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_HR_EMPLOYEE_BASE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RESOURCE_RESOURCE_RESOURCE_ID](der/DER1N_HR_EMPLOYEE_BASE_RESOURCE_RESOURCE_RESOURCE_ID)|[资源(RESOURCE_RESOURCE)](module/resource/resource_resource)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RES_COMPANY_COMPANY_ID](der/DER1N_HR_EMPLOYEE_BASE_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RES_PARTNER_ADDRESS_ID](der/DER1N_HR_EMPLOYEE_BASE_RES_PARTNER_ADDRESS_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RES_PARTNER_WORK_CONTACT_ID](der/DER1N_HR_EMPLOYEE_BASE_RES_PARTNER_WORK_CONTACT_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RES_USERS_LEAVE_MANAGER_ID](der/DER1N_HR_EMPLOYEE_BASE_RES_USERS_LEAVE_MANAGER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RES_USERS_USER_ID](der/DER1N_HR_EMPLOYEE_BASE_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|[DEFAULT](module/hr/hr_employee_base/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_employee_base/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_employee_base/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ADDRESS_ID_EQ|工作地址|EQ||
|N_COACH_ID_EQ|教练|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_CURRENT_LEAVE_STATE_EQ|当前休假状态|EQ||
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_HR_ICON_DISPLAY_EQ|人力资源显示的图标|EQ||
|N_HR_PRESENCE_STATE_EQ|人力资源出席状态|EQ||
|N_ID_EQ|标识|EQ||
|N_JOB_ID_EQ|工作岗位|EQ||
|N_LEAVE_MANAGER_ID_EQ|休假|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARENT_ID_EQ|管理员|EQ||
|N_RESOURCE_CALENDAR_ID_EQ|资源日历|EQ||
|N_RESOURCE_ID_EQ|资源|EQ||
|N_USER_ID_EQ|用户|EQ||
|N_WORK_CONTACT_ID_EQ|工作联系人|EQ||
|N_WORK_LOCATION_ID_EQ|工作地点|EQ||
|N_WORK_LOCATION_TYPE_EQ|工作位置类型|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_employee_base?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee_base?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee_base?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee_base?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee_base?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee_base?id=搜索模式`">
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