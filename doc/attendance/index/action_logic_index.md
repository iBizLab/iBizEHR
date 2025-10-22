# 行为附加 <!-- {docsify-ignore-all} -->

## [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record.md)  :id=attendance_clock_in_record

#### [Create](module/attendance/attendance_clock_in_record#行为) :id=attendance_clock_in_record_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:目标实体逻辑]



## [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule.md)  :id=attendance_rule

#### [Create](module/attendance/attendance_rule#行为) :id=attendance_rule_Create



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [创建/更新时清理工作日(cleanWorkdays)](module/attendance/attendance_rule/logic/cleanWorkdays.md)


> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [判断生效(judgingEffect)](module/attendance/attendance_rule/logic/judgingEffect.md)



<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [生成Odoo工作时间(generateOther)](module/attendance/attendance_rule/logic/generateOther.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [生成Odoo公共节假日(generateHoliday)](module/attendance/attendance_rule/logic/generateHoliday.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [生成Odoo资源关联(generateResource)](module/attendance/attendance_rule/logic/generateResource.md)


#### [Get](module/attendance/attendance_rule#行为) :id=attendance_rule_Get




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [填充工作日(fillWorkDays)](module/attendance/attendance_rule/logic/fillWorkDays.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [计算其他信息(calcOther)](module/attendance/attendance_rule/logic/calcOther.md)


#### [GetDraft](module/attendance/attendance_rule#行为) :id=attendance_rule_GetDraft




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [填充默认班次(fillShift)](module/attendance/attendance_rule/logic/fillShift.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [填充工作日(fillWorkDays)](module/attendance/attendance_rule/logic/fillWorkDays.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [填充组排班(fillGroupShift)](module/attendance/attendance_rule/logic/fillGroupShift.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [计算其他信息(calcOther)](module/attendance/attendance_rule/logic/calcOther.md)


#### [Remove](module/attendance/attendance_rule#行为) :id=attendance_rule_Remove




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [删除激活信息(deleteOtherInfo)](module/attendance/attendance_rule/logic/deleteOtherInfo.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [同步删除Odoo相关(removeOdooData)](module/attendance/attendance_rule/logic/removeOdooData.md)


#### [Update](module/attendance/attendance_rule#行为) :id=attendance_rule_Update



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [创建/更新时清理工作日(cleanWorkdays)](module/attendance/attendance_rule/logic/cleanWorkdays.md)


> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [判断生效(judgingEffect)](module/attendance/attendance_rule/logic/judgingEffect.md)



<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [生成Odoo工作时间(generateOther)](module/attendance/attendance_rule/logic/generateOther.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [生成Odoo公共节假日(generateHoliday)](module/attendance/attendance_rule/logic/generateHoliday.md)

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [生成Odoo资源关联(generateResource)](module/attendance/attendance_rule/logic/generateResource.md)



## [出勤(HR_ATTENDANCE)](module/hr/hr_attendance.md)  :id=hr_attendance

#### [Create](module/hr/hr_attendance#行为) :id=hr_attendance_Create

<p class="panel-title"><b>检查</b></p>
<br>

> [!NOTE|label:目标实体逻辑]
> 执行处理逻辑 [保存校验(check_validity)](module/hr/hr_attendance/logic/check_validity.md)




<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:目标实体逻辑]


> [!NOTE|label:目标实体逻辑]



<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:目标实体逻辑]

> [!NOTE|label:目标实体逻辑]
> 执行处理逻辑 [考勤统计计算(AttendanceCalculate)](module/hr/hr_attendance/logic/AttendanceCalculate.md)


#### [Update](module/hr/hr_attendance#行为) :id=hr_attendance_Update

<p class="panel-title"><b>检查</b></p>
<br>

> [!NOTE|label:目标实体逻辑]
> 执行处理逻辑 [保存校验(check_validity)](module/hr/hr_attendance/logic/check_validity.md)




<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:目标实体逻辑]


> [!NOTE|label:目标实体逻辑]



<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:目标实体逻辑]

> [!NOTE|label:目标实体逻辑]



## [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar.md)  :id=resource_calendar

#### [GetDraft](module/resource/resource_calendar#行为) :id=resource_calendar_GetDraft




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:目标实体逻辑]
> 执行实体 [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar.md) 的 [补充草稿(fillDraft)](module/resource/resource_calendar#行为) 行为









