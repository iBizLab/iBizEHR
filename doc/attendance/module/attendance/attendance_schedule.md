# 排班(attendance_schedule)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|考勤日期|CHECKIN_DATE|日期型||否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|部门ID|DEPT_ID|外键值附加数据|60|是||
|部门名称|DEPT_NAME|外键值附加数据|255|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|否||
|是否手动|MANUAL|是否逻辑||是||
|手动排班类型|MANUAL_TYPE|[单项选择(数值)](index/dictionary_index#manualType "手动排班类型")|4|是||
|员工ID|MEMBER_ID|外键值|100|是||
|姓名|MEMBER_NAME|外键值文本|100|是||
|工号|MEMBER_NUM|外键值附加数据|20|是||
|名称|NAME|文本，可指定长度|200|是||
|当前规则信息|RULE_DATA|一对一动态对象|1048576|是||
|主键|RULE_ID|外键值|60|是||
|规则名称|RULE_NAME|外键值文本|255|是||
|班次类型|SCHEDULE_TYPE|[外键值附加数据](index/dictionary_index#schedule_type "班次类型")|100|是||
|班次信息|SHIFTS|外键值附加数据|1048576|是||
|当前班次信息|SHIFT_DATA|一对一动态对象|1048576|是||
|职位|TITLE|外键值附加数据|50|是||
|是否工作日|WORKDAY|是否逻辑||是||
|工作时段|WORK_TIME|一对多动态对象|1048576|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


###### 属性组

<el-row>
<el-tabs v-model="show_field_group">

<el-tab-pane label="全部属性" name="field_group_all">

|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|当前规则信息|RULE_DATA|一对一动态对象|1048576|是||
|班次信息|SHIFTS|外键值附加数据|1048576|是||
|员工ID|MEMBER_ID|外键值|100|是||
|姓名|MEMBER_NAME|外键值文本|100|是||
|考勤日期|CHECKIN_DATE|日期型||否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|否||
|是否工作日|WORKDAY|是否逻辑||是||
|工作时段|WORK_TIME|一对多动态对象|1048576|是||
|建立时间|CREATE_DATE|日期时间型||否||
|更新时间|WRITE_DATE|日期时间型||否||
|是否手动|MANUAL|是否逻辑||是||
|更新人|WRITE_UID|文本，可指定长度|100|否||
|名称|NAME|文本，可指定长度|200|是||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|当前班次信息|SHIFT_DATA|一对一动态对象|1048576|是||
|班次类型|SCHEDULE_TYPE|[外键值附加数据](index/dictionary_index#schedule_type "班次类型")|100|是||
|手动排班类型|MANUAL_TYPE|[单项选择(数值)](index/dictionary_index#manualType "手动排班类型")|4|是||

</el-tab-pane>

</el-tabs>
</el-row>

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERCUSTOM_ATTENDANCE_ACTIVATE_SHIT_ATTENDANCE_SCHEDULE_RULE_ID](der/DERCUSTOM_ATTENDANCE_ACTIVATE_SHIT_ATTENDANCE_SCHEDULE_RULE_ID)|[激活班次(ATTENDANCE_ACTIVATE_SHIFT)](module/attendance/attendance_activate_shift)|自定义关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_ATTENDANCE_SCHEDULE_ATTENDANCE_ACTIVATE_RULE_RULE_ID](der/DER1N_ATTENDANCE_SCHEDULE_ATTENDANCE_ACTIVATE_RULE_RULE_ID)|[激活规则(ATTENDANCE_ACTIVATE_RULE)](module/attendance/attendance_activate_rule)|1:N关系||
|[DER1N_ATTENDANCE_SCHEDULE_EMPLOYEE_MEMBER_ID](der/DER1N_ATTENDANCE_SCHEDULE_EMPLOYEE_MEMBER_ID)|[员工信息(EMPLOYEE)](module/employee_management/employee)|1:N关系||

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
|清除手动排班|clearManualSchedule|[实体处理逻辑](module/attendance/attendance_schedule/logic/clearManualSchedule "清除手动排班")|默认|不支持||||
|填充班次|fillShifts|[实体处理逻辑](module/attendance/attendance_schedule/logic/fillShifts "fillShifts")|默认|不支持||||
|手动排班|manual|[实体处理逻辑](module/attendance/attendance_schedule/logic/manual "手动排班")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[fillShifts](module/attendance/attendance_schedule/logic/fillShifts)|fillShifts|无|||
|[手动排班](module/attendance/attendance_schedule/logic/manual)|manual|无|||
|[排班视图查询](module/attendance/attendance_schedule/logic/attendance_schedules)|attendance_schedules|无|||
|[搜索月份](module/attendance/attendance_schedule/logic/search_month)|search_month|无|||
|[清除手动排班](module/attendance/attendance_schedule/logic/clearManualSchedule)|clearManualSchedule|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/attendance/attendance_schedule/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/attendance/attendance_schedule/query/View)|VIEW|否|否 |否 ||
|[全部(all)](module/attendance/attendance_schedule/query/all)|all|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/attendance/attendance_schedule/dataset/Default)|DEFAULT|数据查询|是|||
|[全部(all)](module/attendance/attendance_schedule/dataset/all)|all|数据查询|否|||
|[全部(group_by_member)](module/attendance/attendance_schedule/dataset/group_by_member)|group_by_member|数据查询|否|||
|[人员排班(member)](module/attendance/attendance_schedule/dataset/member)|member|数据查询|否|[ScheduleDEDataSetRuntime](index/plugin_index#ScheduleDEDataSetRuntime)||
|[搜索月份(search_month)](module/attendance/attendance_schedule/dataset/search_month)|search_month|[实体逻辑](module/attendance/attendance_schedule/logic/search_month)|否|||

## 数据权限

##### 我创建的（读写） :id=attendance_schedule-CURDRAFTMAN_RW

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('CREATE_UID','=',#{srf.sessioncontext.srfpersonid})]`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `DELETE`
* `UPDATE`
* `READ`



##### 我部门的（读写） :id=attendance_schedule-MYDEPT_RW

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门 <i class="fa fa-check-square"/></i> 下级部门

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `READ`
* `UPDATE`
* `CREATE`



##### 我的班组（读写） :id=attendance_schedule-MYGROUP_RW

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `READ`
* `DELETE`
* `UPDATE`



##### 我的厂商（读） :id=attendance_schedule-MYGYS_R

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('GYS_INFOID','=',#{srf.sessioncontext.srforgsectorid})]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CHECKIN_DATE_EQ|考勤日期|EQ||
|N_CHECKIN_DATE_GTANDEQ|考勤日期|GTANDEQ||
|N_ID_EQ|标识|EQ||
|N_MEMBER_ID_EQ|员工ID|EQ||
|N_MEMBER_ID_IN|员工ID|IN||
|N_NAME_LIKE|名称|LIKE||
|N_RULE_ID_EQ|主键|EQ||
|N_RULE_NAME_EQ|规则名称|EQ||
|N_RULE_NAME_LIKE|规则名称|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 清除手动排班 | clear_manual_attendance_schedule | 清除手动排班 |无数据|<details><summary>后台调用</summary>[clearManualSchedule](#行为)||
| 导出排班视图 | export_report | 导出报表 |无数据|用户自定义||

## 导出模式

* **数据导出**


<el-descriptions direction="vertical" :column="5" :size="size" border>
<el-descriptions-item label="姓名">-</el-descriptions-item>
<el-descriptions-item label="工号">-</el-descriptions-item>
<el-descriptions-item label="部门">-</el-descriptions-item>
<el-descriptions-item label="职位">-</el-descriptions-item>
<el-descriptions-item label="规则名称">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/attendance/attendance_schedule?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_schedule?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_schedule?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_schedule?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_schedule?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_schedule?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_schedule?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_schedule?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_schedule?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_schedule?id=导出模式`">
  导出模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',
show_field_group:'field_group_all',

      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>