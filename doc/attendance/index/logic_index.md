# 处理逻辑 <!-- {docsify-ignore-all} -->



## [考勤申请记录(ATTENDANCE_CHECKIN_APPLICATION)](module/attendance/attendance_checkin_application.md) :id=attendance_checkin_application

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[申请作废](module/attendance/attendance_checkin_application/logic/cancellation)|cancellation|无|||



## [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record.md) :id=attendance_clock_in_record

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[列表视图](module/attendance/attendance_clock_in_record/logic/record_list)|record_list|无|||
|[同步补卡至Odoo](module/attendance/attendance_clock_in_record/logic/sync_clock)|sync_clock|无|||
|[打卡记录](module/attendance/attendance_clock_in_record/logic/record)|record|无|||
|[批量补卡](module/attendance/attendance_clock_in_record/logic/batchReissue)|batchReissue|无|||
|[无操作](module/attendance/attendance_clock_in_record/logic/nothing)|nothing|无||无操作逻辑，用于替换表单的获取数据行为|


## [部门统计(ATTENDANCE_DEPARTMENT_STATISTICS)](module/attendance/attendance_department_statistics.md) :id=attendance_department_statistics

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[部门统计](module/attendance/attendance_department_statistics/logic/department_statistics)|department_statistics|无|||







## [考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record.md) :id=attendance_record

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[异常记录(特定搜索条件)](module/attendance/attendance_record/logic/abnormal_record)|abnormal_record|无|||
|[月底汇总_我的出勤统计](module/attendance/attendance_record/logic/MyAttendanceSummary)|MyAttendanceSummary|无|||
|[考勤记录(特定搜索条件)](module/attendance/attendance_record/logic/record)|record|无|||
|[考勤记录反查](module/attendance/attendance_record/logic/check_info)|check_info|无|||
|[考勤记录反查(计数)](module/attendance/attendance_record/logic/check)|check|无|||



## [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule.md) :id=attendance_rule

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[nothing](module/attendance/attendance_rule/logic/nothing)|nothing|无|||
|[创建/更新时清理工作日](module/attendance/attendance_rule/logic/cleanWorkdays)|cleanWorkdays|无|||
|[删除激活信息](module/attendance/attendance_rule/logic/deleteOtherInfo)|deleteOtherInfo|无|||
|[判断人员是否已存在其他规则](module/attendance/attendance_rule/logic/judgingMember)|judgingMember|无|||
|[判断生效](module/attendance/attendance_rule/logic/judgingEffect)|judgingEffect|无|||
|[同步删除Odoo相关](module/attendance/attendance_rule/logic/removeOdooData)|removeOdooData|无|||
|[填充工作日](module/attendance/attendance_rule/logic/fillWorkDays)|fillWorkDays|无|||
|[填充组排班](module/attendance/attendance_rule/logic/fillGroupShift)|fillGroupShift|无|||
|[填充默认班次](module/attendance/attendance_rule/logic/fillShift)|fillShift|无|||
|[完整规则](module/attendance/attendance_rule/logic/all)|all|无|||
|[定时激活规则](module/attendance/attendance_rule/logic/executeActivate)|executeActivate|无||每日0点执行|
|[定时补充排班](module/attendance/attendance_rule/logic/executeCompletion)|executeCompletion|无|||
|[定时补充排班3](module/attendance/attendance_rule/logic/executeCompletion3)|executeCompletion3|无||为已激活规则补全排班，每月1日执行，生成下个月排班|
|[更新组排班工作日](module/attendance/attendance_rule/logic/updateGroups)|updateGroups|无|||
|[激活规则](module/attendance/attendance_rule/logic/activeRule)|activeRule|无|||
|[生成Odoo公共节假日](module/attendance/attendance_rule/logic/generateHoliday)|generateHoliday|无||根据所勾选的节假日进行拷贝|
|[生成Odoo工作时间](module/attendance/attendance_rule/logic/generateOther)|generateOther|无|||
|[生成Odoo资源关联](module/attendance/attendance_rule/logic/generateResource)|generateResource|无|||
|[计算其他信息](module/attendance/attendance_rule/logic/calcOther)|calcOther|无||班次数量、自由班时间范围|
|[计算日历排班](module/attendance/attendance_rule/logic/attendance_scheduleCalendar)|attendance_scheduleCalendar|无|||
|[计算班次数量](module/attendance/attendance_rule/logic/calcShiftNum)|calcShiftNum|属性逻辑|||
|[计算组排班数量](module/attendance/attendance_rule/logic/calcGroupNum)|calcGroupNum|属性逻辑|||


## [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule.md) :id=attendance_schedule

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[fillShifts](module/attendance/attendance_schedule/logic/fillShifts)|fillShifts|无|||
|[手动排班](module/attendance/attendance_schedule/logic/manual)|manual|无|||
|[排班视图查询](module/attendance/attendance_schedule/logic/attendance_schedules)|attendance_schedules|无|||
|[搜索月份](module/attendance/attendance_schedule/logic/search_month)|search_month|无|||
|[清除手动排班](module/attendance/attendance_schedule/logic/clearManualSchedule)|clearManualSchedule|无|||



## [班次(ATTENDANCE_SHIFT)](module/attendance/attendance_shift.md) :id=attendance_shift

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[nothing](module/attendance/attendance_shift/logic/nothing)|nothing|无|||
|[修改班次信息](module/attendance/attendance_shift/logic/UpdateByType)|UpdateByType|无|||
|[获取默认班次临时数据](module/attendance/attendance_shift/logic/GetDefaultTemp)|GetDefaultTemp|无|||
|[计算上下班时间](module/attendance/attendance_shift/logic/calcWorkTime)|calcWorkTime|属性逻辑|||
|[计算工时](module/attendance/attendance_shift/logic/calcWorkLoad)|calcWorkLoad|属性逻辑|||


## [考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics.md) :id=attendance_statistics

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[个人统计](module/attendance/attendance_statistics/logic/personal)|personal|无|||
|[信息反查](module/attendance/attendance_statistics/logic/check_info)|check_info|无|||
|[月度统计](module/attendance/attendance_statistics/logic/month_report)|month_report|无|||



## [工作日(ATTENDANCE_WORKDAY)](module/attendance/attendance_workday.md) :id=attendance_workday

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[计算上下班时间](module/attendance/attendance_workday/logic/calcWorkTime)|calcWorkTime|属性逻辑|||



## [员工信息(EMPLOYEE)](module/employee_management/employee.md) :id=employee

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[无操作](module/employee_management/employee/logic/nothing)|nothing|无||无操作逻辑，用于替换表单的获取数据行为|
|[获取员工信息(特定搜索条件)](module/employee_management/employee/logic/employee)|employee|无|||


## [出勤(HR_ATTENDANCE)](module/hr/hr_attendance.md) :id=hr_attendance

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[保存校验](module/hr/hr_attendance/logic/check_validity)|check_validity|无|||
|[其他工时计算](module/hr/hr_attendance/logic/calcOther)|calcOther|无|||
|[批量审批](module/hr/hr_attendance/logic/batchApproval)|batchApproval|无|||
|[更新/创建加班记录](module/hr/hr_attendance/logic/changeOverTime)|changeOverTime|无|||
|[考勤统计计算](module/hr/hr_attendance/logic/AttendanceCalculate)|AttendanceCalculate|无|||
|[自助终端考勤](module/hr/hr_attendance/logic/kiosk_checkin)|kiosk_checkin|无|||
|[计算工作、加班时间](module/hr/hr_attendance/logic/ComputeWorkHour)|ComputeWorkHour|无|||






## [邮件会话(MAIL_THREAD)](module/mail/mail_thread.md) :id=mail_thread

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[message_post](module/mail/mail_thread/logic/message_post)|message_post|无||//TODO<br>待完善消息发送逻辑，目前简单构造消息并新建<br>注意忽略传入的<br>res_id、model等，由继承实体提取写入|
|[message_post_with_source](module/mail/mail_thread/logic/message_post_with_source)|message_post_with_source|无||//TODO<br>待完善带模板转换消息发送逻辑，目前简单构造消息并新建|
|[计算附件数](module/mail/mail_thread/logic/compute_attach_count)|compute_attach_count|属性逻辑|||



## [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar.md) :id=resource_calendar

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[补充草稿](module/resource/resource_calendar/logic/fillDraft)|fillDraft|无|||



## [休假详细信息(RESOURCE_CALENDAR_LEAVES)](module/resource/resource_calendar_leaves.md) :id=resource_calendar_leaves

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[获取公共节假日](module/resource/resource_calendar_leaves/logic/calcHoliday)|calcHoliday|无|||





## [用户对象映射(USER_OBJECT)](module/employee_management/user_object.md) :id=user_object

| 中文名col200    | 代码名col200    | 子类型col150    | 插件col200    |  备注col500  |
| -------- |---------- |----------- |------------|----------|
|[我的部门](module/employee_management/user_object/logic/my_dept)|my_dept|无|||
|[查询部门/人员](module/employee_management/user_object/logic/queryDeptUser)|queryDeptUser|无|||

