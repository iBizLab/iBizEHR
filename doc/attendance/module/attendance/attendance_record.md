# 考勤记录(attendance_record)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|实际出勤天数|ACTUAL_ATTENDANCE_DAYS|浮点||是||
|计薪时长（小时）|BILLABLE_HOURS|浮点||是||
|计薪时长（分钟）|BILLABLE_TIME|整型||是||
|考勤日期|CHECKIN_DATE|日期型||是||
|打卡状态信息|CHECKIN_MESSAGE|文本，可指定长度|20|是||
|缺卡次数|CHECKIN_MISSING_TIMES|整型||是||
|考勤结果|CHECKIN_RESULT|[单项选择(文本值)](index/dictionary_index#attendance_result "考勤结果")|60|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|部门ID|DEPT_ID|外键值附加数据|60|是||
|部门|DEPT_NAME|外键值附加数据|255|是||
|考勤明细|DETAILS|一对多关系数据集合|1048576|是||
|考勤记录ID<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|是否出差|IS_BUSINESS_TRIP|真假逻辑||是||
|是否外出|IS_GO_OUT|真假逻辑||是||
|是否请假|IS_LEAVE|真假逻辑||是||
|是否外勤|IS_OUT_WORK|真假逻辑||是||
|是否加班|IS_OVERTIME|真假逻辑||是||
|是否计加班费|IS_PAY_OVERTIME|真假逻辑||是||
|是否计调休假|IS_REST_OVERTIME|真假逻辑||是||
|迟到分钟数|LATE_MINUTES|整型||是||
|迟到时间|LATE_TIME|整型||是||
|迟到次数|LATE_TIMES|整型||是||
|请假时长|LEAVE_DURATION|浮点||是||
|早退分钟数|LEAVE_EARLY_MINUTES|整型||是||
|早退时间|LEAVE_EARLY_TIME|整型||是||
|早退次数|LEAVE_EARLY_TIMES|整型||是||
|请假类型|LEAVE_TYPE|[文本，可指定长度](index/dictionary_index#holidayType "假期类型")|100|是||
|员工ID|MEMBER_ID|外键值|60|是||
|员工姓名|MEMBER_NAME|外键值文本|255|是||
|工号|MEMBER_NUM|外键值附加数据|20|是||
|名称|NAME|文本，可指定长度|200|是||
|调休使用时长|OFF_HOURS|整型||是||
|出差天数|ON_BUSINESS_DAYS|整型||是||
|外出小时数|OUT_HOURS|浮点||是||
|外出时间|OUT_TIME|整型||是||
|外勤小时数|OUT_WORK_HOURS|浮点||是||
|外勤时间|OUT_WORK_TIME|浮点||是||
|加班小时数|OVERTIME_HOURS|浮点||是||
|加班时间|OVERTIME_TIME|浮点||是||
|考勤规则ID|RULE_ID|外键值|60|是||
|规则名称|RULE_NAME|外键值文本|255|是||
|排班类型|SCHEDULE_TYPE|文本，可指定长度|20|是||
|班次信息|SHIFT_MESSAGE|文本，可指定长度|500|是||
|应出勤天数|SHOULD_ATTENDANCE_DAYS|浮点||是||
|应出勤时长（小时）|SHOULD_ATTENDANCE_HOURS|数值||是||
|应出勤时长（分钟）|SHOULD_ATTENDANCE_TIME|整型||是||
|职位|TITLE|外键值附加数据|50|是||
|实际出勤时长（小时）|WORKING_HOURS|浮点||是||
|实际出勤时长（分钟）|WORKING_TIME|整型||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_ATTENDANCE_RECORD_DETAIL_ATTENDANCE_RECORD_RECORD_ID](der/DER1N_ATTENDANCE_RECORD_DETAIL_ATTENDANCE_RECORD_RECORD_ID)|[打卡详情(ATTENDANCE_RECORD_DETAIL)](module/attendance/attendance_record_detail)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_ATTENDANCE_RECORD_ATTENDANCE_RULE_RULE_ID](der/DER1N_ATTENDANCE_RECORD_ATTENDANCE_RULE_RULE_ID)|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)|1:N关系||
|[DER1N_ATTENDANCE_RECORD_EMPLOYEE_MEMBER_ID](der/DER1N_ATTENDANCE_RECORD_EMPLOYEE_MEMBER_ID)|[员工信息(EMPLOYEE)](module/employee_management/employee)|1:N关系||

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
|月底汇总_我的出勤统计|MyAttendanceSummary|[实体处理逻辑](module/attendance/attendance_record/logic/MyAttendanceSummary "月底汇总_我的出勤统计")|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|考勤记录反查|check_info|[实体处理逻辑](module/attendance/attendance_record/logic/check_info "考勤记录反查")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[异常记录(特定搜索条件)](module/attendance/attendance_record/logic/abnormal_record)|abnormal_record|无|||
|[月底汇总_我的出勤统计](module/attendance/attendance_record/logic/MyAttendanceSummary)|MyAttendanceSummary|无|||
|[考勤记录(特定搜索条件)](module/attendance/attendance_record/logic/record)|record|无|||
|[考勤记录反查](module/attendance/attendance_record/logic/check_info)|check_info|无|||
|[考勤记录反查(计数)](module/attendance/attendance_record/logic/check)|check|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/attendance/attendance_record/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/attendance/attendance_record/query/View)|VIEW|否|否 |否 ||
|[异常考勤(abnormal_attendance)](module/attendance/attendance_record/query/abnormal_attendance)|abnormal_attendance|否|否 |否 ||
|[clock](module/attendance/attendance_record/query/clock)|clock|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/attendance/attendance_record/dataset/Default)|DEFAULT|数据查询|是|||
|[异常考勤(abnormal_attendance)](module/attendance/attendance_record/dataset/abnormal_attendance)|abnormal_attendance|[实体逻辑](module/attendance/attendance_record/logic/abnormal_record)|否|||
|[clock](module/attendance/attendance_record/dataset/clock)|clock|数据查询|否|||
|[考勤记录(特定搜索条件)(record)](module/attendance/attendance_record/dataset/record)|record|[实体逻辑](module/attendance/attendance_record/logic/record)|否|||

## 数据权限

##### 我部门的（读） :id=attendance_record-MYDEPT_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门 <i class="fa fa-check-square"/></i> 下级部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的班组（读） :id=attendance_record-MYGROUP_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的厂商（读） :id=attendance_record-MYGYS_R

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('GYS_INFOID','=',#{srf.sessioncontext.srforgsectorid})]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 需求人是我（读） :id=attendance_record-XQRSW_R

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('XQSYRID','=',#{srf.sessioncontext.srfuserid})]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CHECKIN_DATE_GTANDEQ|考勤日期|GTANDEQ||
|N_CHECKIN_DATE_LTANDEQ|考勤日期|LTANDEQ||
|N_CHECKIN_RESULT_EQ|考勤结果|EQ||
|N_CHECKIN_RESULT_IN|考勤结果|IN||
|N_DEPT_ID_EQ|部门ID|EQ||
|N_DETAILS_ISNOTNULL|考勤明细|ISNOTNULL||
|N_ID_EQ|考勤记录ID|EQ||
|N_MEMBER_ID_EQ|员工ID|EQ||
|N_MEMBER_NAME_EQ|员工姓名|EQ||
|N_MEMBER_NAME_LIKE|员工姓名|LIKE||
|N_NAME_LIKE|名称|LIKE||
|N_RULE_ID_EQ|考勤规则ID|EQ||
|N_RULE_NAME_EQ|规则名称|EQ||
|N_RULE_NAME_LIKE|规则名称|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 考勤记录反查校验 | check_info_vail | 考勤记录反查校验 |单项数据|用户自定义||
| 考勤记录反查 | check_info | 考勤记录反查 |单项数据|<details><summary>打开视图或向导（模态）</summary>[考勤记录](app/view/attendance_record_check_info_edit_view)</details>||
| 导出每日统计报表 | export_report | 导出报表 |无数据|用户自定义||
| 导出异常考勤报表 | AbnormalAttendance | 导出报表 |无数据|用户自定义||

## 导出模式

* **异常考勤**


<el-descriptions direction="vertical" :column="30" :size="size" border>
<el-descriptions-item label="姓名">-</el-descriptions-item>
<el-descriptions-item label="工号">-</el-descriptions-item>
<el-descriptions-item label="部门">-</el-descriptions-item>
<el-descriptions-item label="职位">-</el-descriptions-item>
<el-descriptions-item label="日期">-</el-descriptions-item>
<el-descriptions-item label="考勤规则">-</el-descriptions-item>
<el-descriptions-item label="班次">-</el-descriptions-item>
<el-descriptions-item label="上班1打开时间">-</el-descriptions-item>
<el-descriptions-item label="下班1打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班2打开时间">-</el-descriptions-item>
<el-descriptions-item label="下班2打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班3打开时间">-</el-descriptions-item>
<el-descriptions-item label="下班3打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班4打开时间">-</el-descriptions-item>
<el-descriptions-item label="下班4打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班5打开时间">-</el-descriptions-item>
<el-descriptions-item label="下班5打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班6打开时间">-</el-descriptions-item>
<el-descriptions-item label="下班6打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班7打开时间">-</el-descriptions-item>
<el-descriptions-item label="下班7打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班8打开时间">-</el-descriptions-item>
<el-descriptions-item label="下班8打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班9打开时间">-</el-descriptions-item>
<el-descriptions-item label="下班9打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班10打开时间">-</el-descriptions-item>
<el-descriptions-item label="下班10打卡时间">-</el-descriptions-item>
<el-descriptions-item label="考勤结果">-</el-descriptions-item>
<el-descriptions-item label="迟到时长（分钟）">-</el-descriptions-item>
<el-descriptions-item label="早退时长（分钟）">-</el-descriptions-item>
</el-descriptions>

* **每日统计**


<el-descriptions direction="vertical" :column="38" :size="size" border>
<el-descriptions-item label="姓名">-</el-descriptions-item>
<el-descriptions-item label="工号">-</el-descriptions-item>
<el-descriptions-item label="部门">-</el-descriptions-item>
<el-descriptions-item label="职位">-</el-descriptions-item>
<el-descriptions-item label="日期">-</el-descriptions-item>
<el-descriptions-item label="考勤规则">-</el-descriptions-item>
<el-descriptions-item label="班次">-</el-descriptions-item>
<el-descriptions-item label="上班1打卡时间">-</el-descriptions-item>
<el-descriptions-item label="下班1打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班2打卡时间">-</el-descriptions-item>
<el-descriptions-item label="下班2打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班3打卡时间">-</el-descriptions-item>
<el-descriptions-item label="下班3打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班4打卡时间">-</el-descriptions-item>
<el-descriptions-item label="下班4打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班5打卡时间">-</el-descriptions-item>
<el-descriptions-item label="下班5打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班6打卡时间">-</el-descriptions-item>
<el-descriptions-item label="下班6打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班7打卡时间">-</el-descriptions-item>
<el-descriptions-item label="下班7打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班8打卡时间">-</el-descriptions-item>
<el-descriptions-item label="下班8打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班9打卡时间">-</el-descriptions-item>
<el-descriptions-item label="下班9打卡时间">-</el-descriptions-item>
<el-descriptions-item label="上班10打卡时间">-</el-descriptions-item>
<el-descriptions-item label="下班10打卡时间">-</el-descriptions-item>
<el-descriptions-item label="考勤结果">-</el-descriptions-item>
<el-descriptions-item label="应出勤时长（小时）">-</el-descriptions-item>
<el-descriptions-item label="计薪时长（小时）">-</el-descriptions-item>
<el-descriptions-item label="实际出勤时长（小时）">-</el-descriptions-item>
<el-descriptions-item label="迟到时长（分钟）">-</el-descriptions-item>
<el-descriptions-item label="早退时长（分钟）">-</el-descriptions-item>
<el-descriptions-item label="加班时长（小时）">-</el-descriptions-item>
<el-descriptions-item label="请假时长(小时)">-</el-descriptions-item>
<el-descriptions-item label="请假类型">-</el-descriptions-item>
<el-descriptions-item label="出差天数">-</el-descriptions-item>
<el-descriptions-item label="外出时长（小时）">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/attendance/attendance_record?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_record?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_record?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_record?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_record?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_record?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_record?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_record?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_record?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_record?id=导出模式`">
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


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>