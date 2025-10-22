# 部门(hr_department)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|今日缺勤|ABSENCE_OF_TODAY|整型||是||
|有效|ACTIVE|是否逻辑||是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|待批准的分配|ALLOCATION_TO_APPROVE_COUNT|整型||是||
|颜色指标|COLOR|文本，可指定长度|100|是||
|完整名称|COMPLETE_NAME|文本，可指定长度|500|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|预期的员工|EXPECTED_EMPLOYEE|整型||是||
|待批准的费用报表|EXPENSE_SHEETS_TO_APPROVE_COUNT|整型||是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|Has Read Access|HAS_READ_ACCESS|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|待批准的休假|LEAVE_TO_APPROVE_COUNT|整型||是||
|管理员|MANAGER_ID|外键值|100|是||
|管理员|MANAGER_NAME|外键值文本|200|是||
|主部门|MASTER_DEPARTMENT_ID|外键值|100|是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|名称|NAME|文本，可指定长度|200|是||
|新申请|NEW_APPLICANT_COUNT|整型||是||
|新雇用的员工|NEW_HIRED_EMPLOYEE|整型||是||
|备注|NOTE|长文本，没有长度限制|1048576|是||
|上级部门|PARENT_ID|外键值|100|是||
|上级部门|PARENT_NAME|外键值文本|200|是||
|父级路径|PARENT_PATH|文本，可指定长度|500|是||
|计划数量|PLANS_COUNT|整型||是||
|Total Employee|TOTAL_EMPLOYEE|整型||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_DEPARTMENT_HR_DEPARTMENT_MASTER_DEPARTMENT_ID](der/DER1N_HR_DEPARTMENT_HR_DEPARTMENT_MASTER_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_DEPARTMENT_HR_DEPARTMENT_PARENT_ID](der/DER1N_HR_DEPARTMENT_HR_DEPARTMENT_PARENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EMPLOYEE_HR_DEPARTMENT_DEPARTMENT_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_DEPARTMENT_HR_DEPARTMENT_MASTER_DEPARTMENT_ID](der/DER1N_HR_DEPARTMENT_HR_DEPARTMENT_MASTER_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_DEPARTMENT_HR_DEPARTMENT_PARENT_ID](der/DER1N_HR_DEPARTMENT_HR_DEPARTMENT_PARENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_DEPARTMENT_HR_EMPLOYEE_MANAGER_ID](der/DER1N_HR_DEPARTMENT_HR_EMPLOYEE_MANAGER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||

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
|[DEFAULT](module/hr/hr_department/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_department/query/View)|VIEW|否|否 |否 ||
|[根部门(ROOT)](module/hr/hr_department/query/root)|ROOT|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_department/dataset/Default)|DEFAULT|数据查询|是|||
|[根部门(ROOT)](module/hr/hr_department/dataset/root)|ROOT|数据查询|否||注意附加当前权限公司范围|

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_MANAGER_ID_EQ|管理员|EQ||
|N_MANAGER_NAME_EQ|管理员|EQ||
|N_MANAGER_NAME_LIKE|管理员|LIKE||
|N_MASTER_DEPARTMENT_ID_EQ|主部门|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARENT_ID_EQ|上级部门|EQ||
|N_PARENT_NAME_EQ|上级部门|EQ||
|N_PARENT_NAME_LIKE|上级部门|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_department?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_department?id=搜索模式`">
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