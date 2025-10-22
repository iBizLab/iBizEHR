# 后台服务 <!-- {docsify-ignore-all} -->

### 考勤计算任务 :id=attendance_calculation
每天12:00 12:30 22:00 22:30

<br>
<p class="panel-title"><b>启动模式</b></p>

* `自动`

<p class="panel-title"><b>服务调用</b></p>

* 调用实体 [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record.md) 行为 [考勤计算(attendance_calculate)](module/attendance/attendance_clock_in_record#行为)

<p class="panel-title"><b>定时触发</b></p>

* 定时触发策略 `0,30 12,22 * * *`

### 每月激活规则排班补全 :id=Monthly


<br>
<p class="panel-title"><b>启动模式</b></p>

* `自动`

<p class="panel-title"><b>服务调用</b></p>

* 调用实体 [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule.md) 行为 [定时执行补全排班(executeCompletion)](module/attendance/attendance_rule#行为)

<p class="panel-title"><b>定时触发</b></p>

* 定时触发策略 `0 0 0 1 * ?`

### 每日考勤规则激活任务 :id=Daily


<br>
<p class="panel-title"><b>启动模式</b></p>

* `自动`

<p class="panel-title"><b>服务调用</b></p>

* 调用实体 [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule.md) 行为 [定时执行激活规则(executionActivate)](module/attendance/attendance_rule#行为)

<p class="panel-title"><b>定时触发</b></p>

* 定时触发策略 `0 0 0 * * ?`







