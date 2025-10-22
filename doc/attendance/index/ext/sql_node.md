
## 存在直接SQL调用的处理逻辑节点<sup class="footnote-symbol"> <font color=orange>[30]</font></sup>

#### [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)的处理逻辑[同步补卡至Odoo(sync_clock)](module/attendance/attendance_clock_in_record/logic/sync_clock)

节点：查询当天出勤记录
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	*
from
	hr_attendance ha
where
	EMPLOYEE_ID = ?
	and DATE(CHECK_IN) = DATE(?)
	and CHECK_IN < ?
	and CHECK_OUT is null
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).MEMBER_ID(员工ID)`
2. `Default(传入变量).CHECKIN_TIME(打卡时间)`
3. `Default(传入变量).CHECKIN_TIME(打卡时间)`

将执行sql结果赋值给参数`attendances(出勤记录)`
#### [考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)的处理逻辑[月底汇总_我的出勤统计(MyAttendanceSummary)](module/attendance/attendance_record/logic/MyAttendanceSummary)

节点：出勤统计
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT
  0 AS should_attendance_days,
  COALESCE(sum((select count(1) from attendance_record tt where tt.CHECKIN_RESULT ='NORMAL'  and t.id=tt.id )),0) AS actual_attendance_days, 
  0 AS should_working_hours,
  COALESCE(SUM(t.WORKING_HOURS), 0) AS working_hours,
  COALESCE(SUM(t.BILLABLE_HOURS), 0) AS billable_hours,
  0 AS pay_overtime_time,
  0 AS rest_overtime_time 
FROM
  attendance_record t 
WHERE
  CHECKIN_DATE >= DATE_FORMAT(CURRENT_DATE(), '%Y-%m-01') 
  AND CHECKIN_DATE <= LAST_DAY(CURRENT_DATE()) 
  AND t.MEMBER_ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfpersonid`

重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[判断人员是否已存在其他规则(judgingMember)](module/attendance/attendance_rule/logic/judgingMember)

节点：判断是否在其他生效规则内
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select * FROM attendance_group_shift_member WHERE  rule_id != ? and user_id = ?
 AND EXISTS (
    SELECT 1 
    FROM attendance_rule rule  
    WHERE 
      rule.id = attendance_group_shift_member.rule_id 
      AND rule.IS_ACTIVATE  = 1
  )
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(主键)`
2. `memberTemp.ID(主键)`

将执行sql结果赋值给参数`memberResult(memberResult)`
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[完整规则(all)](module/attendance/attendance_rule/logic/all)

节点：直接SQL调用
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT 
    RULE_ID,
    COUNT(DISTINCT MEMBER_ID) AS total_members
FROM attendance_schedule
WHERE checkin_date >= CURDATE()
GROUP BY RULE_ID
```


将执行sql结果赋值给参数`total_members(total_members)`
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：删除当前规则旧排班
<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM attendance_schedule WHERE rule_id = ? AND checkin_date >= ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `activeRule(激活规则).ID(主键)`
2. `Default(传入变量).EFFECT_TIME(生效时间)`

#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：查询当前生效规则成员
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select * FROM attendance_group_shift_member WHERE  rule_id != ?
 AND EXISTS (
    SELECT 1 
    FROM attendance_rule rule  
    WHERE 
      rule.id = attendance_group_shift_member.rule_id 
      AND rule.IS_ACTIVATE  = 1
  )
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(主键)`

将执行sql结果赋值给参数`curActiveMember(curActiveMember)`
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：删除人员旧排班
<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM attendance_schedule WHERE  checkin_date >= ? AND member_id = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).fill_time`
2. `memberTemp.USER_ID(标识)`

重置参数`members(members)`，并将执行sql结果赋值给参数`members(members)`
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：将该部门在其他生效规则内移除
<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM attendance_group_shift_member WHERE  user_id = ? and  rule_id != ?
 AND EXISTS (
    SELECT 1 
    FROM attendance_rule rule  
    WHERE 
      rule.id = attendance_group_shift_member.rule_id 
      AND rule.IS_ACTIVATE  = 1
  )
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `deptTemp.USER_ID(标识)`
2. `Default(传入变量).ID(主键)`

#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班3(executeCompletion3)](module/attendance/attendance_rule/logic/executeCompletion3)

节点：需补全排班的规则
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT 
   *
FROM 
    attendance_activate_rule r
WHERE 
    EXISTS (
        SELECT 
            1
        FROM 
            attendance_group_shift_member gsm
        WHERE 
            gsm.rule_id = r.id
    )
```


将执行sql结果赋值给参数`rules(rules)`
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：删除当前旧激活班次
<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM attendance_activate_shift WHERE rule_id = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `activeRule(激活规则).ID(主键)`

#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：删除当前规则旧排班
<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM attendance_schedule WHERE rule_id = ? AND checkin_date >= ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(主键)`
2. `Default(传入变量).EFFECT_TIME(生效时间)`

#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：删除当前规则区间旧排班
<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM attendance_schedule WHERE rule_id = ? AND checkin_date >= ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(主键)`
2. `Default(传入变量).limitTime`

#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：查询当前生效规则成员
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select MEMBER_ID,MEMBER_NAME,RULE_ID FROM attendance_schedule s WHERE  rule_id != ? and checkin_date >= CURDATE()
 AND EXISTS (
    SELECT 1 
    FROM attendance_activate_rule rule  
    WHERE 
      rule.id = s.rule_id 
  )
	GROUP BY s.MEMBER_ID
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(主键)`

将执行sql结果赋值给参数`curActiveMember(curActiveMember)`
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：将该部门在其他生效规则内移除
<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM attendance_group_shift_member WHERE  user_id = ? and  rule_id != ?
 AND EXISTS (
    SELECT 1 
    FROM attendance_rule rule  
    WHERE 
      rule.id = attendance_group_shift_member.rule_id 
      AND rule.IS_ACTIVATE  = 1
  )
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `deptTemp.USER_ID(标识)`
2. `Default(传入变量).ID(主键)`

#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：删除人员旧排班
<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM attendance_schedule WHERE  checkin_date >= ? AND member_id = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).limitTime`
2. `memberTemp.USER_ID(标识)`

#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：删除人员旧排班
<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM attendance_schedule WHERE  checkin_date >= ? AND member_id = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).EFFECT_TIME(生效时间)`
2. `memberTemp.USER_ID(标识)`

重置参数`members(members)`，并将执行sql结果赋值给参数`members(members)`
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：将该人员在其他生效规则内移除
<p class="panel-title"><b>执行sql语句</b></p>

```sql
DELETE FROM attendance_group_shift_member WHERE  user_id = ? and  rule_id != ?
 AND EXISTS (
    SELECT 1 
    FROM attendance_rule rule  
    WHERE 
      rule.id = attendance_group_shift_member.rule_id 
      AND rule.IS_ACTIVATE  = 1
  )
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `memberTemp.USER_ID(标识)`
2. `Default(传入变量).ID(主键)`

#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[生成Odoo公共节假日(generateHoliday)](module/attendance/attendance_rule/logic/generateHoliday)

节点：获取今年的公共假期
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT * 
FROM resource_calendar_leaves 
WHERE DATE_FROM >= DATE_FORMAT(CURDATE(), '%Y-01-01') 
  AND DATE_FROM < DATE_ADD(DATE_FORMAT(CURDATE(), '%Y-01-01'), INTERVAL 1 YEAR)
  AND CALENDAR_ID IS NULL
```


将执行sql结果赋值给参数`holidays(holidays)`
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[生成Odoo公共节假日(generateHoliday)](module/attendance/attendance_rule/logic/generateHoliday)

节点：删除规则关联的公共假期
<p class="panel-title"><b>执行sql语句</b></p>

```sql
delete from resource_calendar_leaves where CALENDAR_ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(主键)`

#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[生成Odoo资源关联(generateResource)](module/attendance/attendance_rule/logic/generateResource)

节点：更新人员关联工作时间
<p class="panel-title"><b>执行sql语句</b></p>

```sql
UPDATE hr_employee
SET RESOURCE_CALENDAR_ID = ?
WHERE ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(主键)`
2. `emp.ID(标识)`

#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[生成Odoo资源关联(generateResource)](module/attendance/attendance_rule/logic/generateResource)

节点：更新资源关联工作时间
<p class="panel-title"><b>执行sql语句</b></p>

```sql
UPDATE resource_resource 
SET CALENDAR_ID = ?
WHERE ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(主键)`
2. `emp.RESOURCE_ID(资源)`

#### [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)的处理逻辑[清除手动排班(clearManualSchedule)](module/attendance/attendance_schedule/logic/clearManualSchedule)

节点：查询手动排班
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	t1.`CHECKIN_DATE`,
	t1.`ID`,
	t1.`MANUAL`,
	t1.`MANUAL_TYPE`,
	t1.`MEMBER_ID`,
	t1.`MEMBER_NAME`,
	t1.`NAME`,
	t1.`RULE_DATA`,
	t1.`RULE_ID`,
	t11.`NAME` as `RULE_NAME`,
	t11.`SCHEDULE_TYPE`,
	t1.`SHIFT_DATA`,
	t1.`WORKDAY`,
	t1.`WORK_TIME`
from
	`ATTENDANCE_SCHEDULE` t1
left join `ATTENDANCE_ACTIVATE_RULE` t11 on
	t1.`RULE_ID` = t11.`ID`
where 
	t1.MANUAL = 1
	and t1.CHECKIN_DATE >= CURDATE()
```


将执行sql结果赋值给参数`manualSchedules(manualSchedules)`
#### [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)的处理逻辑[清除手动排班(clearManualSchedule)](module/attendance/attendance_schedule/logic/clearManualSchedule)

节点：查询手动排班
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select

	t1.`RULE_DATA`,
	t1.`RULE_ID`

from
	`ATTENDANCE_SCHEDULE` t1
left join `ATTENDANCE_ACTIVATE_RULE` t11 on
	t1.`RULE_ID` = t11.`ID`
where 
	t1.MANUAL = 1
	and t1.CHECKIN_DATE >= CURDATE()
	GROUP BY t1.RULE_ID
```


将执行sql结果赋值给参数`manualSchedules(manualSchedules)`
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[保存校验(check_validity)](module/hr/hr_attendance/logic/check_validity)

节点：查询check_in之前且最近的考勤记录
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT * 
FROM hr_attendance 
WHERE employee_id = ?
  AND check_in <= ?
  AND id != ?
ORDER BY check_in DESC 
LIMIT 1;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).EMPLOYEE_ID(员工)`
2. `Default(传入变量).CHECK_IN(签到)`
3. `Default(传入变量).ID(标识)`

将执行sql结果赋值给参数`before_check_in(before_check_in)`
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[保存校验(check_validity)](module/hr/hr_attendance/logic/check_validity)

节点：获取其他未签退的记录
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT * 
FROM hr_attendance 
WHERE employee_id = ?
  AND check_out is null
  AND id != ?
ORDER BY check_in DESC 
LIMIT 1;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).EMPLOYEE_ID(员工)`
2. `Default(传入变量).ID(标识)`

重置参数`no_check_out(未签退出勤记录)`，并将执行sql结果赋值给参数`no_check_out(未签退出勤记录)`
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[保存校验(check_validity)](module/hr/hr_attendance/logic/check_validity)

节点：获取签退时间之前的记录
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT * 
FROM hr_attendance 
WHERE employee_id = ?
  AND check_in < ?
  AND id != ?
ORDER BY check_in DESC 
LIMIT 1;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).EMPLOYEE_ID(员工)`
2. `Default(传入变量).CHECK_OUT(签离)`
3. `Default(传入变量).ID(标识)`

将执行sql结果赋值给参数`before_check_out(before_check_out)`
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[更新/创建加班记录(changeOverTime)](module/hr/hr_attendance/logic/changeOverTime)

节点：获取加班记录
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	*
from
	hr_attendance_overtime
where
	`DATE` = DATE(?) 
	and EMPLOYEE_ID = ?
LIMIT 1;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).CHECK_IN(签到)`
2. `Default(传入变量).EMPLOYEE_ID(员工)`

将执行sql结果赋值给参数`over_time(加班记录)`
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[更新/创建加班记录(changeOverTime)](module/hr/hr_attendance/logic/changeOverTime)

节点：累加当天其他加班时长
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COALESCE(SUM(OVERTIME_HOURS), 0)+? AS total_overtime_hours
FROM hr_attendance
WHERE employee_id = ?
  AND DATE(check_in) = DATE(?) 
  AND check_out IS NOT NULL 
  AND id != ?
  AND OVERTIME_STATUS = 'approved'
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).OVERTIME_HOURS(随着时间的推移)`
2. `Default(传入变量).EMPLOYEE_ID(员工)`
3. `Default(传入变量).CHECK_IN(签到)`
4. `Default(传入变量).ID(标识)`

将执行sql结果赋值给参数`sum_over(sum_over)`
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[自助终端考勤(kiosk_checkin)](module/hr/hr_attendance/logic/kiosk_checkin)

节点：获取最近一次考勤记录
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT * 
FROM hr_attendance 
WHERE employee_id = ?
ORDER BY WRITE_DATE  DESC 
LIMIT 1;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `emp.ID(标识)`

将执行sql结果赋值给参数`last(last)`
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[自助终端考勤(kiosk_checkin)](module/hr/hr_attendance/logic/kiosk_checkin)

节点：计算今日时时数
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COALESCE(SUM(WORKED_HOURS), 0) AS hours_previously_today
FROM hr_attendance 
WHERE employee_id = ?
  AND DATE(CHECK_IN) = CURDATE();
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `emp.ID(标识)`

将执行sql结果赋值给参数`hours_previously_today(今日工作时数)`




