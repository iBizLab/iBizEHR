# 部门外协管理员 <!-- {docsify-ignore-all} -->



### 统一资源

|统一资源|标识|
|---|---|
|清除手动排班|CLEAR_MANUAL_ATTENDANCE_SCHEDULE|
|员工管理|EMPLOYEE|
|异常考勤|ABNORMALATTENDANCE|
|考勤规则|ATTENDANCE_RULE|
|部门统计|ATTENDANCE_DEPARTMENT_STATISTICS|
|申请记录|ATTENDANCE_CHECKIN_APPLICATION|
|考勤计算|ATTENDANCE_CALCULATION|
|部门管理|DEPARTMENT|
|同步数据|SYNC_CLOCK_IN_DATA|
|每日统计|DAILYSTATISTICS|
|月度汇总|MONTHLYSTATISTICS|
|年度日历|NDRL|
|排班视图|ATTENDANCE_SCHEDULE|
|假期类型|LEAVE_TYPE|
|打卡记录|ATTENDANCE_CLOCK_IN_RECORD|



### 数据能力

|实体|数据能力|
|---|---|
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)|<a href ="#/module/attendance/attendance_clock_in_record#attendance_clock_in_record-mydept_r">我部门的（读）</a>|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)|<a href ="#/module/attendance/attendance_rule#attendance_rule-all_r">全部数据（读）</a>|
|[部门统计(ATTENDANCE_DEPARTMENT_STATISTICS)](module/attendance/attendance_department_statistics)|<a href ="#/module/attendance/attendance_department_statistics#attendance_department_statistics-mydept_r">我部门的（读）</a>|
|[考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics)|<a href ="#/module/attendance/attendance_statistics#attendance_statistics-mydept_r">我部门的（读）</a>|
|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)|<a href ="#/module/attendance/attendance_record#attendance_record-mydept_r">我部门的（读）</a>|
|[排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)|<a href ="#/module/attendance/attendance_schedule#attendance_schedule-mydept_rw">我部门的（读写）</a>|
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)|<a href ="#/module/attendance/attendance_rule#attendance_rule-curdraftman_rw">我创建的（读写）</a>|
|[假期类型(ATTENDANCE_LEAVE_TYPE)](module/attendance/attendance_leave_type)|<a href ="#/module/attendance/attendance_leave_type#attendance_leave_type-all_rw">全部数据（读写）</a>|
|[考勤申请记录(ATTENDANCE_CHECKIN_APPLICATION)](module/attendance/attendance_checkin_application)|<a href ="#/module/attendance/attendance_checkin_application#attendance_checkin_application-curdraftman_rw">我创建的（读写）</a>|
|[用户对象映射(USER_OBJECT)](module/employee_management/user_object)|<a href ="#/module/employee_management/user_object#user_object-mydept_r">我部门的（读）</a>|
|[部门信息(DEPARTMENT)](module/employee_management/department)|<a href ="#/module/employee_management/department#department-mydept_r">我部门的（读）</a>|
|[员工信息(EMPLOYEE)](module/employee_management/employee)|<a href ="#/module/employee_management/employee#employee-mydept_r">我部门的（读）</a>|



