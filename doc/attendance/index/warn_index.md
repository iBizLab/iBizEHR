# 模型预警 <!-- {docsify-ignore-all} -->


### 行为使用脚本<sup class="footnote-symbol"> <font color=orange>[1]</font></sup>
| 实体col200   | 行为col300  |
| --------   |------------|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|[消息发送代理(mail_message_post)](module/mail/mail_thread#行为)|

### 处理逻辑中使用脚本<sup class="footnote-symbol"> <font color=orange>[45]</font></sup>
| 实体col200   | 处理逻辑col300  | 脚本模式col100  |
| --------   |------------|----------|
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record#处理逻辑)|[列表视图(record_list)](module/attendance/attendance_clock_in_record/logic/record_list.md)|否|
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record#处理逻辑)|[同步补卡至Odoo(sync_clock)](module/attendance/attendance_clock_in_record/logic/sync_clock.md)|否|
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record#处理逻辑)|[打卡记录(record)](module/attendance/attendance_clock_in_record/logic/record.md)|否|
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record#处理逻辑)|[批量补卡(batchReissue)](module/attendance/attendance_clock_in_record/logic/batchReissue.md)|否|
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record#处理逻辑)|[无操作(nothing)](module/attendance/attendance_clock_in_record/logic/nothing.md)|是|
|[部门统计(ATTENDANCE_DEPARTMENT_STATISTICS)](module/attendance/attendance_department_statistics#处理逻辑)|[部门统计(department_statistics)](module/attendance/attendance_department_statistics/logic/department_statistics.md)|否|
|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record#处理逻辑)|[异常记录(特定搜索条件)(abnormal_record)](module/attendance/attendance_record/logic/abnormal_record.md)|否|
|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record#处理逻辑)|[考勤记录(特定搜索条件)(record)](module/attendance/attendance_record/logic/record.md)|否|
|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record#处理逻辑)|[考勤记录反查(check_info)](module/attendance/attendance_record/logic/check_info.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[nothing](module/attendance/attendance_rule/logic/nothing.md)|是|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[创建/更新时清理工作日(cleanWorkdays)](module/attendance/attendance_rule/logic/cleanWorkdays.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[判断人员是否已存在其他规则(judgingMember)](module/attendance/attendance_rule/logic/judgingMember.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[填充工作日(fillWorkDays)](module/attendance/attendance_rule/logic/fillWorkDays.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[填充组排班(fillGroupShift)](module/attendance/attendance_rule/logic/fillGroupShift.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[填充默认班次(fillShift)](module/attendance/attendance_rule/logic/fillShift.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[完整规则(all)](module/attendance/attendance_rule/logic/all.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[定时补充排班3(executeCompletion3)](module/attendance/attendance_rule/logic/executeCompletion3.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[更新组排班工作日(updateGroups)](module/attendance/attendance_rule/logic/updateGroups.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[生成Odoo工作时间(generateOther)](module/attendance/attendance_rule/logic/generateOther.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[计算其他信息(calcOther)](module/attendance/attendance_rule/logic/calcOther.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[计算日历排班(attendance_scheduleCalendar)](module/attendance/attendance_rule/logic/attendance_scheduleCalendar.md)|否|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[计算班次数量(calcShiftNum)](module/attendance/attendance_rule/logic/calcShiftNum.md)|是|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#处理逻辑)|[计算组排班数量(calcGroupNum)](module/attendance/attendance_rule/logic/calcGroupNum.md)|是|
|[排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule#处理逻辑)|[fillShifts](module/attendance/attendance_schedule/logic/fillShifts.md)|否|
|[排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule#处理逻辑)|[手动排班(manual)](module/attendance/attendance_schedule/logic/manual.md)|否|
|[排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule#处理逻辑)|[搜索月份(search_month)](module/attendance/attendance_schedule/logic/search_month.md)|否|
|[排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule#处理逻辑)|[清除手动排班(clearManualSchedule)](module/attendance/attendance_schedule/logic/clearManualSchedule.md)|否|
|[班次(ATTENDANCE_SHIFT)](module/attendance/attendance_shift#处理逻辑)|[nothing](module/attendance/attendance_shift/logic/nothing.md)|是|
|[班次(ATTENDANCE_SHIFT)](module/attendance/attendance_shift#处理逻辑)|[修改班次信息(UpdateByType)](module/attendance/attendance_shift/logic/UpdateByType.md)|是|
|[班次(ATTENDANCE_SHIFT)](module/attendance/attendance_shift#处理逻辑)|[获取默认班次临时数据(GetDefaultTemp)](module/attendance/attendance_shift/logic/GetDefaultTemp.md)|是|
|[班次(ATTENDANCE_SHIFT)](module/attendance/attendance_shift#处理逻辑)|[计算上下班时间(calcWorkTime)](module/attendance/attendance_shift/logic/calcWorkTime.md)|是|
|[班次(ATTENDANCE_SHIFT)](module/attendance/attendance_shift#处理逻辑)|[计算工时(calcWorkLoad)](module/attendance/attendance_shift/logic/calcWorkLoad.md)|是|
|[考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics#处理逻辑)|[个人统计(personal)](module/attendance/attendance_statistics/logic/personal.md)|否|
|[考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics#处理逻辑)|[信息反查(check_info)](module/attendance/attendance_statistics/logic/check_info.md)|否|
|[考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics#处理逻辑)|[月度统计(month_report)](module/attendance/attendance_statistics/logic/month_report.md)|否|
|[工作日(ATTENDANCE_WORKDAY)](module/attendance/attendance_workday#处理逻辑)|[计算上下班时间(calcWorkTime)](module/attendance/attendance_workday/logic/calcWorkTime.md)|是|
|[员工信息(EMPLOYEE)](module/employee_management/employee#处理逻辑)|[获取员工信息(特定搜索条件)(employee)](module/employee_management/employee/logic/employee.md)|否|
|[出勤(HR_ATTENDANCE)](module/hr/hr_attendance#处理逻辑)|[其他工时计算(calcOther)](module/hr/hr_attendance/logic/calcOther.md)|否|
|[出勤(HR_ATTENDANCE)](module/hr/hr_attendance#处理逻辑)|[批量审批(batchApproval)](module/hr/hr_attendance/logic/batchApproval.md)|否|
|[出勤(HR_ATTENDANCE)](module/hr/hr_attendance#处理逻辑)|[更新/创建加班记录(changeOverTime)](module/hr/hr_attendance/logic/changeOverTime.md)|否|
|[出勤(HR_ATTENDANCE)](module/hr/hr_attendance#处理逻辑)|[自助终端考勤(kiosk_checkin)](module/hr/hr_attendance/logic/kiosk_checkin.md)|否|
|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar#处理逻辑)|[补充草稿(fillDraft)](module/resource/resource_calendar/logic/fillDraft.md)|否|
|[用户对象映射(USER_OBJECT)](module/employee_management/user_object#处理逻辑)|[我的部门(my_dept)](module/employee_management/user_object/logic/my_dept.md)|否|

### 处理逻辑中使用SQL调用<sup class="footnote-symbol"> <font color=orange>[13]</font></sup>
| 实体col200   | 处理逻辑col300  |
| --------   |------------|
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)#处理逻辑](module/attendance/attendance_clock_in_record)|[同步补卡至Odoo(sync_clock)](module/attendance/attendance_clock_in_record/logic/sync_clock.md)|
|[考勤记录(ATTENDANCE_RECORD)#处理逻辑](module/attendance/attendance_record)|[月底汇总_我的出勤统计(MyAttendanceSummary)](module/attendance/attendance_record/logic/MyAttendanceSummary.md)|
|[考勤规则(ATTENDANCE_RULE)#处理逻辑](module/attendance/attendance_rule)|[判断人员是否已存在其他规则(judgingMember)](module/attendance/attendance_rule/logic/judgingMember.md)|
|[考勤规则(ATTENDANCE_RULE)#处理逻辑](module/attendance/attendance_rule)|[完整规则(all)](module/attendance/attendance_rule/logic/all.md)|
|[考勤规则(ATTENDANCE_RULE)#处理逻辑](module/attendance/attendance_rule)|[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion.md)|
|[考勤规则(ATTENDANCE_RULE)#处理逻辑](module/attendance/attendance_rule)|[定时补充排班3(executeCompletion3)](module/attendance/attendance_rule/logic/executeCompletion3.md)|
|[考勤规则(ATTENDANCE_RULE)#处理逻辑](module/attendance/attendance_rule)|[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule.md)|
|[考勤规则(ATTENDANCE_RULE)#处理逻辑](module/attendance/attendance_rule)|[生成Odoo公共节假日(generateHoliday)](module/attendance/attendance_rule/logic/generateHoliday.md)|
|[考勤规则(ATTENDANCE_RULE)#处理逻辑](module/attendance/attendance_rule)|[生成Odoo资源关联(generateResource)](module/attendance/attendance_rule/logic/generateResource.md)|
|[排班(ATTENDANCE_SCHEDULE)#处理逻辑](module/attendance/attendance_schedule)|[清除手动排班(clearManualSchedule)](module/attendance/attendance_schedule/logic/clearManualSchedule.md)|
|[出勤(HR_ATTENDANCE)#处理逻辑](module/hr/hr_attendance)|[保存校验(check_validity)](module/hr/hr_attendance/logic/check_validity.md)|
|[出勤(HR_ATTENDANCE)#处理逻辑](module/hr/hr_attendance)|[更新/创建加班记录(changeOverTime)](module/hr/hr_attendance/logic/changeOverTime.md)|
|[出勤(HR_ATTENDANCE)#处理逻辑](module/hr/hr_attendance)|[自助终端考勤(kiosk_checkin)](module/hr/hr_attendance/logic/kiosk_checkin.md)|

### 界面逻辑中使用脚本<sup class="footnote-symbol"> <font color=orange>[2]</font></sup>
| 实体col200   | 界面逻辑col300  |
| --------   |------------|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#界面逻辑)|[自动保存](module/attendance/attendance_rule/uilogic/auto_save)|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule#界面逻辑)|[清空临时数据](module/attendance/attendance_rule/uilogic/cleanTemp)|


### 未配置查询的数据集合<sup class="footnote-symbol"> <font color=orange>[1]</font></sup>
| 实体col200   | 数据集合col300  |
| --------   |------------|
|[排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)|[人员排班(member)](module/attendance/attendance_schedule/dataset/member)|

### 启用部门权限范围，但未配置部门属性<sup class="footnote-symbol"> <font color=orange>[8]</font></sup>
|    中文名  | 实体名   | 代码名      |  实体类型   |  存储模式 |  表名称  |  逻辑有效   |  联合主键   |  主状态   |  权限控制  |  启用审计    |  备注  |
| --------| --------   |------------| -----   |  --------|  --------|  --------|  -------- |  -------- | -------- | -------- |-------- |
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record.md)|ATTENDANCE_CLOCK_IN_RECORD|attendance_clock_in_record|主实体|SQL|ATTENDANCE_CLOCK_IN_RECORD|否|否|否|自控制|否||
|[部门统计(ATTENDANCE_DEPARTMENT_STATISTICS)](module/attendance/attendance_department_statistics.md)|ATTENDANCE_DEPARTMENT_STATISTICS|attendance_department_statistics|主实体|无存储||否|否|否|自控制|否||
|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record.md)|ATTENDANCE_RECORD|attendance_record|主实体|SQL|ATTENDANCE_RECORD|否|否|否|自控制|否||
|[排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule.md)|ATTENDANCE_SCHEDULE|attendance_schedule|主实体|SQL|ATTENDANCE_SCHEDULE|否|否|否|自控制|否||
|[考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics.md)|ATTENDANCE_STATISTICS|attendance_statistics|主实体|无存储||否|否|否|自控制|否||
|[部门信息(DEPARTMENT)](module/employee_management/department.md)|DEPARTMENT|department|主实体|无存储||否|否|否|自控制|否||
|[员工信息(EMPLOYEE)](module/employee_management/employee.md)|EMPLOYEE|employee|主实体|无存储||否|否|否|自控制|否||
|[用户对象映射(USER_OBJECT)](module/employee_management/user_object.md)|USER_OBJECT|user_object|主实体|无存储||否|否|否|自控制|否||

### 未配置权限请求接口<sup class="footnote-symbol"> <font color=orange>[7]</font></sup>
| 实体col200| 请求路径col500| 请求方式col100   |    行为/集合col300    |
| -------- |-------- | --------|-------- |
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/mail_track|POST|[构造跟踪数据(mail_track)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/message_notify|POST|[通知消息(message_notify)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/message_track|POST|[跟踪消息(message_track)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/process_attachments_for_post|POST|[发送消息将附件归属转换至主对象中(process_attachments_for_post)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/track_discard|POST|[新建时属性跟踪(track_discard)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/track_finalize|POST|[跟踪数据建立(track_finalize)](module/mail/mail_thread#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/{key}/track_prepare|POST|[属性跟踪准备(track_prepare)](module/mail/mail_thread#行为)|

### NONE权限请求接口<sup class="footnote-symbol"> <font color=orange>[12]</font></sup>
| 实体col200| 请求路径col500| 请求方式col100   |    行为/集合col300    |
| -------- |-------- | --------|-------- |
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record.md)|/attendance_clock_in_records/attendance_calculate|POST|[考勤计算(attendance_calculate)](module/attendance/attendance_clock_in_record#行为)|
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record.md)|/attendance_clock_in_records/batch_reissue|POST|[批量补卡(batchReissue)](module/attendance/attendance_clock_in_record#行为)|
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record.md)|/attendance_clock_in_records/nothing|POST|[无操作(nothing)](module/attendance/attendance_clock_in_record#行为)|
|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record.md)|/attendance_records/check_info|POST|[考勤记录反查(check_info)](module/attendance/attendance_record#行为)|
|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record.md)|/attendance_records/my_attendance_summary|POST|[月底汇总_我的出勤统计(MyAttendanceSummary)](module/attendance/attendance_record#行为)|
|[考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics.md)|/attendance_statistics/check_info|POST|[信息反查(check_info)](module/attendance/attendance_statistics#行为)|
|[考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics.md)|/attendance_statistics/personal|POST|[个人统计(personal)](module/attendance/attendance_statistics#行为)|
|[员工信息(EMPLOYEE)](module/employee_management/employee.md)|/employees/nothing|POST|[无操作(nothing)](module/employee_management/employee#行为)|
|[出勤(HR_ATTENDANCE)](module/hr/hr_attendance.md)|/hr_attendances/compute_work_hour|POST|[计算工作时间、加班时间(ComputeWorkHour)](module/hr/hr_attendance#行为)|
|[出勤(HR_ATTENDANCE)](module/hr/hr_attendance.md)|/hr_attendances/kiosk_checkin|POST|[自助终端考勤(kiosk_checkin)](module/hr/hr_attendance#行为)|
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread.md)|/mail_threads/mail_message_post|POST|[消息发送代理(mail_message_post)](module/mail/mail_thread#行为)|
|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar.md)|/resource_calendars/fill_draft|POST|[补充草稿(fillDraft)](module/resource/resource_calendar#行为)|

### 操作标识未配置映射<sup class="footnote-symbol"> <font color=orange>[1]</font></sup>
| 实体col200   | 操作标识col300  |
| --------   |------------|
|[工作日(ATTENDANCE_WORKDAY)](module/attendance/attendance_workday.md)|CREATE<br>READ<br>DELETE<br>UPDATE|

### 除主键、主信息、预置属性外，不包含其他配置的表格<sup class="footnote-symbol"> <font color=orange>[3]</font></sup>
| 实体col200   |   视图col400 | 表格col400  |
| --------   |------------|------------|
|[激活规则(ATTENDANCE_ACTIVATE_RULE)](module/attendance/attendance_activate_rule)|主表格(main)|[激活规则(attendance_activate_rule_pickup_grid_view)](app/view/attendance_activate_rule_pickup_grid_view)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|主表格(main)|[员工(hr_employee_pickup_grid_view)](app/view/hr_employee_pickup_grid_view)|
|[用户对象映射(USER_OBJECT)](module/employee_management/user_object)|员工管理表格视图_表格(user_manage_grid_view_grid)|[用户对象映射(user_object_pickup_grid_view)](app/view/user_object_pickup_grid_view)|

### 无搜索项的搜索表单<sup class="footnote-symbol"> <font color=orange>[16]</font></sup>
| 实体col200   |   视图col400 | 搜索表单col400  |
| --------   |------------|-----------|
|[激活规则(ATTENDANCE_ACTIVATE_RULE)](module/attendance/attendance_activate_rule)|默认搜索表单(default)|[激活规则(attendance_activate_rule_pickup_grid_view)](app/view/attendance_activate_rule_pickup_grid_view)|
|[考勤申请记录(ATTENDANCE_CHECKIN_APPLICATION)](module/attendance/attendance_checkin_application)|默认搜索表单(default)|[考勤申请记录(attendance_checkin_application_grid_view)](app/view/attendance_checkin_application_grid_view)|
|[考勤设备关联(ATTENDANCE_CHECKIN_DEVICE)](module/attendance/attendance_checkin_device)|默认搜索表单(default)|[考勤设备关联(attendance_checkin_device_pickup_grid_view)](app/view/attendance_checkin_device_pickup_grid_view)|
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)|打卡记录搜索表单(search_form)|[打卡记录(attendance_clock_in_record_tab_exp_view)](app/view/attendance_clock_in_record_tab_exp_view)|
|[设备信息(ATTENDANCE_DEVICE)](module/attendance/attendance_device)|默认搜索表单(default)|[设备信息(attendance_device_grid_view)](app/view/attendance_device_grid_view)|
|[考勤规则成员(ATTENDANCE_GROUP_SHIFT_MEMBER)](module/attendance/attendance_group_shift_member)|默认搜索表单(default)|[考勤规则成员(attendance_group_shift_member_grid_view)](app/view/attendance_group_shift_member_grid_view)|
|[假期类型(ATTENDANCE_LEAVE_TYPE)](module/attendance/attendance_leave_type)|默认搜索表单(default)|[假期类型(attendance_leave_type_grid_view)](app/view/attendance_leave_type_grid_view)|
|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)|部门人员缺卡反查表格_搜索表单(missing_check_search_form)|[部门统计(attendance_record_department_statistics)](app/view/attendance_record_department_statistics)|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)|默认搜索表单(default)|[考勤规则(attendance_rule_grid_view)](app/view/attendance_rule_grid_view)|
|[考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics)|月度汇总搜索表单(month_total)|[月度汇总(attendance_statistics_tab_exp_view)](app/view/attendance_statistics_tab_exp_view)|
|[部门信息(DEPARTMENT)](module/employee_management/department)|默认搜索表单(default)|[部门信息(department_pickup_grid_view)](app/view/department_pickup_grid_view)|
|[员工信息(EMPLOYEE)](module/employee_management/employee)|默认搜索表单(default)|[员工信息(employee_pickup_grid_view)](app/view/employee_pickup_grid_view)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|默认搜索表单(default)|[员工(hr_employee_pickup_grid_view)](app/view/hr_employee_pickup_grid_view)|
|[公共假期类型(PUBLIC_LEAVE_TYPE)](module/resource/public_leave_type)|默认搜索表单(default)|[公共假期类型(public_leave_type_grid_view)](app/view/public_leave_type_grid_view)|
|[休假详细信息(RESOURCE_CALENDAR_LEAVES)](module/resource/resource_calendar_leaves)|默认搜索表单(default)|[休假详细信息(resource_calendar_leaves_grid_view)](app/view/resource_calendar_leaves_grid_view)|
|[用户对象映射(USER_OBJECT)](module/employee_management/user_object)|员工管理表格视图_搜索表单(usr06107469_search_form)|[部门管理(user_object_dept_manage_grid_view)](app/view/user_object_dept_manage_grid_view)|

### 除主键、主信息、预置属性外，不包含其他配置的表单<sup class="footnote-symbol"> <font color=orange>[12]</font></sup>
| 实体col200   |   视图col400 |表单col400  |
| --------   |------------|------------|
|[考勤设备关联(ATTENDANCE_CHECKIN_DEVICE)](module/attendance/attendance_checkin_device)|主编辑表单(main)|[考勤设备关联(attendance_checkin_device_edit_view)](app/view/attendance_checkin_device_edit_view)|
|[部门统计(ATTENDANCE_DEPARTMENT_STATISTICS)](module/attendance/attendance_department_statistics)|主编辑表单(main)|[部门统计(attendance_department_statistics_edit_view)](app/view/attendance_department_statistics_edit_view)|
|[设备信息(ATTENDANCE_DEVICE)](module/attendance/attendance_device)|主编辑表单(main)|[设备信息(attendance_device_edit_view)](app/view/attendance_device_edit_view)|
|[GPS定位配置(ATTENDANCE_GPS_LOCATION)](module/attendance/attendance_gps_location)|主编辑表单(main)|[GPS定位配置(attendance_gps_location_edit_view)](app/view/attendance_gps_location_edit_view)|
|[考勤规则成员(ATTENDANCE_GROUP_SHIFT_MEMBER)](module/attendance/attendance_group_shift_member)|主编辑表单(main)|[考勤规则成员(attendance_group_shift_member_edit_view)](app/view/attendance_group_shift_member_edit_view)|
|[假期类型(ATTENDANCE_LEAVE_TYPE)](module/attendance/attendance_leave_type)|主编辑表单(main)|[假期类型(attendance_leave_type_edit_view)](app/view/attendance_leave_type_edit_view)|
|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)|主编辑表单(main)|[考勤记录(attendance_record_check_info_edit_view)](app/view/attendance_record_check_info_edit_view)|
|[班次(ATTENDANCE_SHIFT)](module/attendance/attendance_shift)|自由班班次表单(free)|[班次(attendance_shift_free_edit_view)](app/view/attendance_shift_free_edit_view)|
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|主编辑表单(main)|[员工(hr_employee_edit_view)](app/view/hr_employee_edit_view)|
|[公共假期类型(PUBLIC_LEAVE_TYPE)](module/resource/public_leave_type)|主编辑表单(main)|[公共假期类型(public_leave_type_edit_view)](app/view/public_leave_type_edit_view)|
|[配置设定(RES_CONFIG_SETTINGS)](module/base/res_config_settings)|全局设置(general_setting)|[扩展携带视图(res_config_settings_custom_view_exten_carrier)](app/view/res_config_settings_custom_view_exten_carrier)|
|[用户对象映射(USER_OBJECT)](module/employee_management/user_object)|主编辑表单(main)|[用户对象映射(user_object_edit_view)](app/view/user_object_edit_view)|
