# 组排班(attendance_group_shift)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|考勤人员类型|ALL_COMPANY|[单项选择(文本值)](index/dictionary_index#employeeType "考勤人员类型")|60|是||
|创建时间|CREATE_DATE|日期时间型||是||
|创建人|CREATE_UID|文本，可指定长度|100|是||
|主键<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|组成员|MEMBERS|一对多关系数据集合|1048576|是||
|组名称|NAME|文本，可指定长度|255|是||
|组数|ORDER_NUM|整型||是||
|考勤规则ID|RULE_ID|外键值|60|是||
|考勤规则名称|RULE_NAME|外键值文本|255|是||
|规则类型|SCHEDULE_TYPE|[外键值附加数据](index/dictionary_index#schedule_type "班次类型")|60|是||
|工作日|WORKDAYS|一对多动态对象|1048576|是||
|更新时间|WRITE_DATE|日期时间型||是||
|更新人|WRITE_UID|文本，可指定长度|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_ATTENDANCE_GROUP_SHIFT_MEMBER_ATTENDANCE_GROUP_SHIFT_GROUP_ID](der/DER1N_ATTENDANCE_GROUP_SHIFT_MEMBER_ATTENDANCE_GROUP_SHIFT_GROUP_ID)|[考勤规则成员(ATTENDANCE_GROUP_SHIFT_MEMBER)](module/attendance/attendance_group_shift_member)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_ATTENDANCE_GROUP_SHIFT_ATTENDANCE_RULE_RULE_ID](der/DER1N_ATTENDANCE_GROUP_SHIFT_ATTENDANCE_RULE_RULE_ID)|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|CreateTemp|CreateTemp|内置方法|默认|不支持||||
|CreateTempMajor|CreateTempMajor|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|GetDraftTemp|GetDraftTemp|内置方法|默认|不支持||||
|GetDraftTempMajor|GetDraftTempMajor|内置方法|默认|不支持||||
|GetTemp|GetTemp|内置方法|默认|不支持||||
|GetTempMajor|GetTempMajor|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|RemoveTemp|RemoveTemp|内置方法|默认|支持||||
|RemoveTempMajor|RemoveTempMajor|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|UpdateTemp|UpdateTemp|内置方法|默认|不支持||||
|UpdateTempMajor|UpdateTempMajor|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/attendance/attendance_group_shift/query/Default)|DEFAULT|是|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/attendance/attendance_group_shift/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ALL_COMPANY_EQ|考勤人员类型|EQ||
|N_ID_EQ|主键|EQ||
|N_NAME_LIKE|组名称|LIKE||
|N_RULE_ID_EQ|考勤规则ID|EQ||
|N_RULE_NAME_EQ|考勤规则名称|EQ||
|N_RULE_NAME_LIKE|考勤规则名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/attendance/attendance_group_shift?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_group_shift?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_group_shift?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_group_shift?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_group_shift?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_group_shift?id=搜索模式`">
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