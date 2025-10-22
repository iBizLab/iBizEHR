# 考勤统计(attendance_statistics)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|缺勤天数|ABSENT_DAYS|浮点||是||
|实际出勤天数|ACTUAL_ATTENDANCE_DAYS|浮点||是||
|年假|ANNUAL_LEAVE|浮点||是||
|计薪时长|BILLABLE_TIME|浮点||是||
|缺卡次数|CHECKIN_MISSING_TIMES|整型||是||
|缺退次数|CHECKOUT_MISSING_TIMES|整型||是||
|事假|COMPASSIONATE_LEAVE|浮点||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|部门ID|DEPT_ID|文本，可指定长度|100|是||
|部门名称|DEPT_NAME|文本，可指定长度|100|是||
|员工编号|EMPLOYEE_NUM|文本，可指定长度|100|是||
|丧假|FUNERAL_LEAVE|浮点||是||
|供应商ID|GYS_INFOID|文本，可指定长度|100|是||
|供应商名称|GYS_INFONAME|文本，可指定长度|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|迟到总时长|LATE_TIME|浮点||是||
|迟到次数|LATE_TIMES|整型||是||
|请假时长|LEAVE_DURATION|浮点||是||
|早退总时长|LEAVE_EARLY_TIME|浮点||是||
|早退次数|LEAVE_EARLY_TIMES|整型||是||
|补卡次数|MAKE_CARD_TIMES|整型||是||
|婚假|MARRIAGE_HOLIDAY|浮点||是||
|产假|MATERNITY_LEAVE|浮点||是||
|成员ID|MEMBER_ID|文本，可指定长度|100|是||
|成员姓名|MEMBER_NAME|文本，可指定长度|100|是||
|名称|NAME|文本，可指定长度|200|是||
|调休时长|OFF_HOURS|浮点||是||
|下班卡缺卡|OFF_MISSING|整型||是||
|出差天数|ON_BUSINESS_DAYS|浮点||是||
|上班卡缺卡|ON_MISSING|整型||是||
|外出时长|OUT_TIME|浮点||是||
|外勤次数|OUT_WORK_TIMES|整型||是||
|育儿假|PARENTAL_LEAVE|浮点||是||
|陪产假|PATERNITY_LEAVE|浮点||是||
|加班时长(计加班费)|PAY_OVERTIME_TIME|浮点||是||
|加班时长(计调休假)|REST_OVERTIME_TIME|浮点||是||
|排班类型|SCHEDULE_TYPE|文本，可指定长度|100|是||
|应出勤天数|SHOULD_ATTENDANCE_DAYS|浮点||是||
|应出勤时长|SHOULD_ATTENDANCE_TIME|浮点||是||
|病假|SICK_LEAVE|浮点||是||
|职位|TITLE|文本，可指定长度|100|是||
|调休假|VACATION_LEAVE|浮点||是||
|实际出勤时长|WORKING_HOURS|浮点||是||
|工作时长|WORKING_TIME|浮点||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||
|需求使用人|XQSYR|文本，可指定长度|100|是||
|需求使用人标识|XQSYRID|文本，可指定长度|100|是||


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
|信息反查|check_info|[实体处理逻辑](module/attendance/attendance_statistics/logic/check_info "信息反查")|默认|不支持||||
|个人统计|personal|[实体处理逻辑](module/attendance/attendance_statistics/logic/personal "个人统计")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[个人统计](module/attendance/attendance_statistics/logic/personal)|personal|无|||
|[信息反查](module/attendance/attendance_statistics/logic/check_info)|check_info|无|||
|[月度统计](module/attendance/attendance_statistics/logic/month_report)|month_report|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/attendance/attendance_statistics/query/Default)|DEFAULT|是|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/attendance/attendance_statistics/dataset/Default)|DEFAULT|数据查询|是|||
|[月度统计(month_report)](module/attendance/attendance_statistics/dataset/month_report)|month_report|[实体逻辑](module/attendance/attendance_statistics/logic/month_report)|否|||

## 数据权限

##### 我部门的（读） :id=attendance_statistics-MYDEPT_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门 <i class="fa fa-check-square"/></i> 下级部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的班组（读） :id=attendance_statistics-MYGROUP_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的厂商（读） :id=attendance_statistics-MYGYS_R

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('GYS_INFOID','=',#{srf.sessioncontext.srforgsectorid})]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 需求人是我（读） :id=attendance_statistics-XQRSW_R

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('XQSYRID','=',#{srf.sessioncontext.srfuserid})]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 导出月度汇总统计报表 | export_report | 导出报表 |无数据|用户自定义||
| 导出个人统计报表 | personal | 导出报表 |无数据|用户自定义||

## 导出模式

* **数据导出**


<el-descriptions direction="vertical" :column="33" :size="size" border>
<el-descriptions-item label="姓名">-</el-descriptions-item>
<el-descriptions-item label="工号">-</el-descriptions-item>
<el-descriptions-item label="部门">-</el-descriptions-item>
<el-descriptions-item label="职位">-</el-descriptions-item>
<el-descriptions-item label="应出勤天数">-</el-descriptions-item>
<el-descriptions-item label="实际出勤天数">-</el-descriptions-item>
<el-descriptions-item label="应出勤时长(小时)">-</el-descriptions-item>
<el-descriptions-item label="实际出勤时长(小时)">-</el-descriptions-item>
<el-descriptions-item label="计薪工作时长（小时）">-</el-descriptions-item>
<el-descriptions-item label="加班时长(记加班费)(小时)">-</el-descriptions-item>
<el-descriptions-item label="加班时长(记调休假)(小时)">-</el-descriptions-item>
<el-descriptions-item label="迟到次数">-</el-descriptions-item>
<el-descriptions-item label="迟到时长">-</el-descriptions-item>
<el-descriptions-item label="早退次数">-</el-descriptions-item>
<el-descriptions-item label="早退时长">-</el-descriptions-item>
<el-descriptions-item label="上班卡缺卡">-</el-descriptions-item>
<el-descriptions-item label="下班卡缺卡">-</el-descriptions-item>
<el-descriptions-item label="旷工天数">-</el-descriptions-item>
<el-descriptions-item label="出差天数">-</el-descriptions-item>
<el-descriptions-item label="外出时长(小时)">-</el-descriptions-item>
<el-descriptions-item label="补卡次数">-</el-descriptions-item>
<el-descriptions-item label="外勤次数">-</el-descriptions-item>
<el-descriptions-item label="请假时长(小时)">-</el-descriptions-item>
<el-descriptions-item label="年假(小时)">-</el-descriptions-item>
<el-descriptions-item label="事假(小时)">-</el-descriptions-item>
<el-descriptions-item label="调休假(小时)">-</el-descriptions-item>
<el-descriptions-item label="病假(小时)">-</el-descriptions-item>
<el-descriptions-item label="育儿假(小时)">-</el-descriptions-item>
<el-descriptions-item label="陪产假(小时)">-</el-descriptions-item>
<el-descriptions-item label="婚假(小时)">-</el-descriptions-item>
<el-descriptions-item label="丧假(小时)">-</el-descriptions-item>
<el-descriptions-item label="产假(小时)">-</el-descriptions-item>
<el-descriptions-item label="模板列">-</el-descriptions-item>
</el-descriptions>

* **数据导出2**


<el-descriptions direction="vertical" :column="33" :size="size" border>
<el-descriptions-item label="姓名">-</el-descriptions-item>
<el-descriptions-item label="工号">-</el-descriptions-item>
<el-descriptions-item label="部门">-</el-descriptions-item>
<el-descriptions-item label="职位">-</el-descriptions-item>
<el-descriptions-item label="应出勤天数">-</el-descriptions-item>
<el-descriptions-item label="实际出勤天数">-</el-descriptions-item>
<el-descriptions-item label="应出勤时长(小时)">-</el-descriptions-item>
<el-descriptions-item label="实际出勤时长(小时)">-</el-descriptions-item>
<el-descriptions-item label="计薪工作时长（小时）">-</el-descriptions-item>
<el-descriptions-item label="加班时长(记加班费)(小时)">-</el-descriptions-item>
<el-descriptions-item label="加班时长(记调休假)(小时)">-</el-descriptions-item>
<el-descriptions-item label="迟到次数">-</el-descriptions-item>
<el-descriptions-item label="迟到时长">-</el-descriptions-item>
<el-descriptions-item label="早退次数">-</el-descriptions-item>
<el-descriptions-item label="早退时长">-</el-descriptions-item>
<el-descriptions-item label="上班卡缺卡">-</el-descriptions-item>
<el-descriptions-item label="下班卡缺卡">-</el-descriptions-item>
<el-descriptions-item label="旷工天数">-</el-descriptions-item>
<el-descriptions-item label="出差天数">-</el-descriptions-item>
<el-descriptions-item label="外出时长(小时)">-</el-descriptions-item>
<el-descriptions-item label="补卡次数">-</el-descriptions-item>
<el-descriptions-item label="外勤次数">-</el-descriptions-item>
<el-descriptions-item label="请假时长(小时)">-</el-descriptions-item>
<el-descriptions-item label="年假(小时)">-</el-descriptions-item>
<el-descriptions-item label="事假(小时)">-</el-descriptions-item>
<el-descriptions-item label="调休假(小时)">-</el-descriptions-item>
<el-descriptions-item label="病假(小时)">-</el-descriptions-item>
<el-descriptions-item label="育儿假(小时)">-</el-descriptions-item>
<el-descriptions-item label="陪产假(小时)">-</el-descriptions-item>
<el-descriptions-item label="婚假(小时)">-</el-descriptions-item>
<el-descriptions-item label="丧假(小时)">-</el-descriptions-item>
<el-descriptions-item label="产假(小时)">-</el-descriptions-item>
<el-descriptions-item label="模板列">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/attendance/attendance_statistics?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_statistics?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_statistics?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_statistics?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_statistics?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_statistics?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_statistics?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_statistics?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_statistics?id=导出模式`">
  导出模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {



      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>