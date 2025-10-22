# 考勤规则管理(attendance) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[激活规则(ATTENDANCE_ACTIVATE_RULE)](module/attendance/attendance_activate_rule)|attendance_activate_rule|主实体|SQL|ATTENDANCE_ACTIVATE_RULE|否|否|自控制|否||
|[激活班次(ATTENDANCE_ACTIVATE_SHIFT)](module/attendance/attendance_activate_shift)|attendance_activate_shift|主实体|SQL|ATTENDANCE_ACTIVATE_SHIFT|否|否|自控制|否||
|[考勤申请记录(ATTENDANCE_CHECKIN_APPLICATION)](module/attendance/attendance_checkin_application)|attendance_checkin_application|主实体|SQL|ATTENDANCE_CHECKIN_APPLICATION|否|否|自控制|否||
|[考勤设备关联(ATTENDANCE_CHECKIN_DEVICE)](module/attendance/attendance_checkin_device)|attendance_checkin_device|关系实体|SQL|ATTENDANCE_CHECKIN_DEVICE|否|否|附属主实体控制|否||
|[打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)|attendance_clock_in_record|主实体|SQL|ATTENDANCE_CLOCK_IN_RECORD|否|否|自控制|否||
|[部门统计(ATTENDANCE_DEPARTMENT_STATISTICS)](module/attendance/attendance_department_statistics)|attendance_department_statistics|主实体|无存储||否|否|自控制|否||
|[设备信息(ATTENDANCE_DEVICE)](module/attendance/attendance_device)|attendance_device|主实体|SQL|ATTENDANCE_DEVICE|否|否|自控制|否||
|[GPS定位配置(ATTENDANCE_GPS_LOCATION)](module/attendance/attendance_gps_location)|attendance_gps_location|主实体|SQL|ATTENDANCE_GPS_LOCATION|否|否|自控制|否||
|[组排班(ATTENDANCE_GROUP_SHIFT)](module/attendance/attendance_group_shift)|attendance_group_shift|主实体|SQL|ATTENDANCE_GROUP_SHIFT|否|否|自控制|否||
|[考勤规则成员(ATTENDANCE_GROUP_SHIFT_MEMBER)](module/attendance/attendance_group_shift_member)|attendance_group_shift_member|关系实体|SQL|ATTENDANCE_GROUP_SHIFT_MEMBER|否|否|附属主实体控制|否||
|[假期类型(ATTENDANCE_LEAVE_TYPE)](module/attendance/attendance_leave_type)|attendance_leave_type|主实体|SQL|ATTENDANCE_LEAVE_TYPE|否|否|自控制|否||
|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)|attendance_record|主实体|SQL|ATTENDANCE_RECORD|否|否|自控制|否||
|[打卡详情(ATTENDANCE_RECORD_DETAIL)](module/attendance/attendance_record_detail)|attendance_record_detail|主实体|SQL|ATTENDANCE_RECORD_DETAIL|否|否|自控制|否||
|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)|attendance_rule|主实体|SQL|ATTENDANCE_RULE|否|否|自控制|否||
|[排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)|attendance_schedule|主实体|SQL|ATTENDANCE_SCHEDULE|否|否|自控制|否||
|[时间范围(ATTENDANCE_SCOPE)](module/attendance/attendance_scope)|attendance_scope|主实体|SQL|ATTENDANCE_SCOPE|否|否|自控制|否||
|[班次(ATTENDANCE_SHIFT)](module/attendance/attendance_shift)|attendance_shift|主实体|SQL|ATTENDANCE_SHIFT|否|否|自控制|否||
|[考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics)|attendance_statistics|主实体|无存储||否|否|自控制|否||
|[WiFi定位配置(ATTENDANCE_WIFI_LOCATION)](module/attendance/attendance_wifi_location)|attendance_wifi_location|主实体|SQL|ATTENDANCE_WIFI_LOCATION|否|否|自控制|否||
|[工作日(ATTENDANCE_WORKDAY)](module/attendance/attendance_workday)|attendance_workday|关系实体|SQL|ATTENDANCE_WORKDAY|否|否|附属主实体控制|否||

