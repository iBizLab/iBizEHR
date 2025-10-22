# 数据结构 <!-- {docsify-ignore-all} -->

### 默认数据库架构
#### 激活规则(ATTENDANCE_ACTIVATE_RULE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CYCLE|循环周期设置|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|NAME|规则名称|VARCHAR|是|255|||
|RULE_DATA|当前规则信息|TEXT|是|1048576|||
|SCHEDULE_TYPE|班次类型|VARCHAR|是|100|||
|SHIFTS|班次|TEXT|是|1048576|||
#### 激活班次(ATTENDANCE_ACTIVATE_SHIFT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ATTENDANCE_RATIO|出勤比率|FLOAT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RULE_ID|主键|VARCHAR|是|60|||
|SHIFT_DATA|shift_data|TEXT|是|1048576|||
|WORK_TIMES|工作时段|TEXT|是|1048576|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 考勤申请记录(ATTENDANCE_CHECKIN_APPLICATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|APPLICANT_ID|申请人|VARCHAR|是|60|||
|APPLICANT_NAME|申请人姓名|VARCHAR|是|255|||
|APPLY_TYPE|申请类型|VARCHAR|是|60|||
|APPROVER_ID|审批人|VARCHAR|是|100|||
|APPROVER_NAME|审批人|VARCHAR|是|100|||
|BUSINESS_DATA|业务数据|TEXT|是|1048576|||
|BUSINESS_INFO|业务数据|TEXT|是|1048576|||
|COPY_GIVE|抄送人|VARCHAR|是|100|||
|COPY_GIVE_NAMES|抄送人名称|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DAYS|天数|FLOAT|是||||
|DEPARTURE_CITY|出发城市|VARCHAR|是|100|||
|DEPT_ID|部门ID|VARCHAR|是|60|||
|DEPT_NAME|部门|VARCHAR|是|255|||
|DESTINATION_CITY|目的城市|VARCHAR|是|100|||
|EMPLOYEE_NUM|工号|VARCHAR|是|20|||
|END_TIME|结束时间|DATETIME|是||||
|GO_OUT_PLACE|外出地|VARCHAR|是|100|||
|GYS_INFOID|供应商ID|VARCHAR|是|100|||
|GYS_INFONAME|供应商名称|VARCHAR|是|100|||
|HOURS|小时数|FLOAT|是||||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|LEAVE_TYPE|假期类型|VARCHAR|是|60|||
|MINUTES|分钟数|FLOAT|是||||
|NAME|名称|VARCHAR|是|200|||
|OVERTIME_HOURS|加班小时|DECIMAL|是||||
|OVERTIME_MINUTES|加班分钟|DECIMAL|是||||
|OVERTIME_TYPE|加班类型|VARCHAR|是|100|||
|REASON|申请说明|VARCHAR|是|2000|||
|REISSUE_DATE|补卡日期|DATETIME|是||||
|REISSUE_TIME|补卡时间|DATETIME|是||||
|START_TIME|开始时间|DATETIME|是||||
|STATUS|状态|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|XQSYR|需求使用人|VARCHAR|是|100|||
|XQSYRID|需求使用人标识|VARCHAR|是|100|||
#### 考勤设备关联(ATTENDANCE_CHECKIN_DEVICE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CHECKIN_METHOD|考勤方式|VARCHAR|是|60|||
|CHECKIN_TYPE_ID|主键|VARCHAR|是|60|||
|CREATE_DATE|创建时间|DATETIME|是||||
|CREATE_UID|创建人|VARCHAR|是|100|||
|DEVICE_ID|设备ID|VARCHAR|是|60|||
|DEVICE_NAME|设备名称|VARCHAR|是|255|||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|NAME|名称|VARCHAR|是|200|||
|RULE_ID|考勤规则ID|VARCHAR|是|60|||
|RULE_NAME|考勤规则名称|VARCHAR|是|255|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 打卡记录(ATTENDANCE_CLOCK_IN_RECORD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CHECKIN_IMAGE|打卡图片|VARCHAR|是|500|||
|CHECKIN_REMARK|打卡备注|VARCHAR|是|255|||
|CHECKIN_RESULT|打卡结果|VARCHAR|是|60|||
|CHECKIN_TIME|打卡时间|DATETIME|是||||
|CHECKIN_TYPE|打卡方式|VARCHAR|是|60|||
|CLOCK_TYPE|打卡类型|VARCHAR|是|60|||
|CMD|操作指令|VARCHAR|是|50|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE|考勤日期|DATETIME|是||||
|DEPT_ID|部门ID|VARCHAR|是|60|||
|DEPT_NAME|部门|VARCHAR|是|255|||
|DEVICE_NAME|设备名称|VARCHAR|是|255|||
|DURATION_HOURS|上班时长|INT|是||||
|EMPLOYEE_NUM|工号|VARCHAR|是|20|||
|GYS_INFOID|供应商ID|VARCHAR|是|100|||
|GYS_INFONAME|供应商名称|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|记录ID|VARCHAR|否|60|||
|MEMBER_ID|员工ID|VARCHAR|是|60|||
|MEMBER_NAME|员工姓名|VARCHAR|是|255|||
|MEMBER_NUM|工号|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|SHOULD_CHECKIN_TIME|应打卡时间|DATETIME|是||||
|SOURCE|数据来源|VARCHAR|是|20|||
|TERMINAL_ID|终端设备ID|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|XQSYR|需求使用人|VARCHAR|是|100|||
|XQSYRID|需求使用人标识|VARCHAR|是|100|||
#### 考勤设备(ATTENDANCE_DEVICE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|创建时间|DATETIME|是||||
|CREATE_UID|创建人|VARCHAR|是|100|||
|DEVICE|设备SN|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|NAME|设备名称|VARCHAR|是|255|||
|TYPE|设备类型|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 异常考勤记录(ATTENDANCE_EXCEPTION_RECORD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|APPROVAL_STATUS|审批状态|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DESCRIPTION|描述|TEXT|是|1048576|||
|DURATION_HOURS|时长|INT|是||||
|END_DATE|结束日期|DATETIME|是||||
|EXCEPTION_TYPE|异常类型|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|考勤记录ID|VARCHAR|否|60|||
|LOCATION|地点|TEXT|是|1048576|||
|MEMBER_ID|员工ID|VARCHAR|是|60|||
|MEMBER_NAME|员工姓名|VARCHAR|是|255|||
|NAME|名称|VARCHAR|是|200|||
|START_DATE|开始日期|DATETIME|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### GPS定位配置(ATTENDANCE_GPS_LOCATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADDRESS|考勤地点|VARCHAR|是|100|||
|ADDRESS_DETAIL|详细地址|VARCHAR|是|100|||
|CHECKIN_TYPE_ID|主键|VARCHAR|是|60|||
|CREATE_DATE|创建时间|DATETIME|是||||
|CREATE_UID|创建人|VARCHAR|是|100|||
|DEVICE_ID|设备ID|VARCHAR|是|60|||
|DEVICE_NAME|设备名称|VARCHAR|是|255|||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|LATITUDE|纬度|DECIMAL|是|10|6||
|LOCATION|详细地址|VARCHAR|是|100|||
|LONGITUDE|精度|FLOAT|是||||
|NAME|GPS位置名称|VARCHAR|是|255|||
|RANGE|有效范围|INT|是||||
|RULE_ID|主键|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 组排班(ATTENDANCE_GROUP_SHIFT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALL_COMPANY|考勤人员类型|VARCHAR|是|60|||
|CREATE_DATE|创建时间|DATETIME|是||||
|CREATE_UID|创建人|VARCHAR|是|100|||
|DEPT_ID|部门ID|VARCHAR|是|60|||
|DEPT_NAME|部门名称|VARCHAR|是|255|||
|EMPLOYEE_IDS|员工ID列表|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|MEMBERS|成员|TEXT|是|1048576|||
|NAME|组名称|VARCHAR|是|255|||
|ORDER_NUM|组数|INT|是||||
|RULE_ID|考勤规则ID|VARCHAR|是|60|||
|RULE_NAME|考勤规则名称|VARCHAR|是|255|||
|WORKDAYS|工作日|TEXT|是|1048576|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 考勤规则成员(ATTENDANCE_GROUP_SHIFT_MEMBER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|GROUP_ID|主键|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|NAME|名称|VARCHAR|是|200|||
|RULE_ID|主键|VARCHAR|是|60|||
|TYPE|成员类型|VARCHAR|是|100|||
|USER_ID|标识|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 假期类型(ATTENDANCE_LEAVE_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALL_COMPANY|全公司适用|VARCHAR|是|1|||
|ASK_UNIT|申请单位|VARCHAR|是|20|||
|CALCULATE_WAY|计算方式|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DAY_TO_HOUR|假期余额换算|FLOAT|是||||
|DEPT_ID|适用部门ID|INT|是||||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|36|||
|IS_DEFAULT|是否默认|INT|是|1|||
|MAX_APPLY_DAY|是否限制最大申请天数|INT|是|1|||
|NAME|名称|VARCHAR|是|50|||
|PERIOD_FROM|申请限制周期|VARCHAR|是|60|||
|PERIOD_TO|天数/申请限制周期|INT|是||||
|STATUS|状态|INT|是|1|||
|TYPE|类型标识|VARCHAR|是|30|||
|UNIT|单位|VARCHAR|是|10|||
|WITH_SALARY|是否带薪|INT|是|1|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 考勤记录(ATTENDANCE_RECORD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ABSENT_DAYS|缺勤天数(统计字段)|DECIMAL|是||||
|ACTUAL_ATTENDANCE_DAYS|实际出勤天数(统计字段)|DECIMAL|是||||
|BILLABLE_HOURS|计薪时长（小时）|DECIMAL|是||2||
|BILLABLE_TIME|计薪时长（分钟）|INT|是||||
|CHECKIN_DATE|考勤日期|DATETIME|是||||
|CHECKIN_MESSAGE|打卡状态信息|VARCHAR|是|20|||
|CHECKIN_MISSING_TIMES|缺上班打卡(统计字段)|DECIMAL|是||||
|CHECKIN_RESULT|考勤结果|VARCHAR|是|60|||
|CHECKOUT_MISSING_TIMES|缺下班打卡次数(统计字段)|DECIMAL|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEPT_ID|部门ID|VARCHAR|是|60|||
|DEPT_NAME|部门|VARCHAR|是|255|||
|ID<i class="fa fa-key"></i>|考勤记录ID|VARCHAR|否|60|||
|IS_BUSINESS_TRIP|是否出差|INT|是||||
|IS_GO_OUT|是否外出|INT|是||||
|IS_LEAVE|是否请假|INT|是||||
|IS_OUT_WORK|是否外勤|INT|是||||
|IS_OVERTIME|是否加班|INT|是||||
|IS_PAY_OVERTIME|是否计加班费|INT|是||||
|IS_REST_OVERTIME|是否计调休假|INT|是||||
|LATE_MINUTES|迟到分钟数|INT|是||||
|LATE_TIME|迟到时间|INT|是||||
|LATE_TIMES|迟到次数(统计字段)|DECIMAL|是||||
|LEAVE_DURATION|请假时长|DECIMAL|是||||
|LEAVE_EARLY_MINUTES|早退分钟数|INT|是||||
|LEAVE_EARLY_TIME|早退时间|INT|是||||
|LEAVE_EARLY_TIMES|早退次数(统计字段)|DECIMAL|是||||
|LEAVE_TYPE|请假类型|VARCHAR|是|100|||
|MAKE_CARD_TIMES|补卡次数(统计字段)|DECIMAL|是||||
|MEMBER_COUNT|应出勤人数(统计字段)|INT|是||||
|MEMBER_ID|员工ID|VARCHAR|是|60|||
|MEMBER_NAME|员工姓名|VARCHAR|是|255|||
|MEMBER_NUM|工号|VARCHAR|是|20|||
|NAME|名称|VARCHAR|是|200|||
|NORMAL_ATTENDANCE_TIMES|正常出勤次数(统计字段)|INT|是||||
|OFF_HOURS|调休使用时长|INT|是||||
|OFF_TIMES|请假次数(统计字段)|INT|是||||
|ON_BUSINESS_DAYS|出差天数|INT|是||||
|ON_BUSINESS_TIMES|出差次数(统计字段)|INT|是||||
|OUT_HOURS|外出小时数|INT|是||||
|OUT_TIME|外出时间|INT|是||||
|OUT_TIMES|外出次数(统计字段)|INT|是||||
|OUT_WORK_HOURS|外勤小时数|INT|是||||
|OUT_WORK_TIME|外勤时间|INT|是||||
|OUT_WORK_TIMES|外勤次数(统计字段)|DECIMAL|是||||
|OVERTIME_HOURS|加班小时数|INT|是||||
|OVERTIME_TIME|加班时间|INT|是||||
|PAY_OVERTIME_TIME|计加班费加班时长(统计字段)|DECIMAL|是||||
|REST_OVERTIME_TIME|计调休假加班时长(统计字段)|DECIMAL|是||||
|RULE_ID|考勤规则ID|VARCHAR|是|60|||
|RULE_NAME|规则名称|VARCHAR|是|255|||
|SCHEDULE_TYPE|排班类型|VARCHAR|是|20|||
|SHIFT_MESSAGE|班次信息|VARCHAR|是|500|||
|SHOULD_ATTENDANCE_DAYS|应出勤天数(统计字段)|DECIMAL|是||||
|SHOULD_ATTENDANCE_HOURS|应出勤时长（小时）|DECIMAL|是||2||
|SHOULD_ATTENDANCE_TIME|应出勤时长（分钟）|INT|是||||
|TITLE|职位|VARCHAR|是|50|||
|WORKING_HOURS|实际出勤时长（小时）|DECIMAL|是||2||
|WORKING_TIME|实际出勤时长（分钟）|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 打卡详情(ATTENDANCE_RECORD_DETAIL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CHECKIN_RESULT|考勤结果|VARCHAR|是|100|||
|CHECKIN_TIME|实际考勤时间|DATETIME|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DETAIL_INDEX|详情索引|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_BUSINESS_TRIP|是否出差|INT|是||||
|IS_GO_OUT|是否外出|INT|是||||
|IS_LEAVE|是否请假|INT|是||||
|LEAVE_NAME|休假类型名称|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|RECORD_ID|考勤记录ID|VARCHAR|是|60|||
|SHOULD_CHECKIN_TIME|应考勤时间|DATETIME|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 考勤规则(ATTENDANCE_RULE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|AUTO_MATCH|智能匹配|INT|是||||
|BIWEEKLY_CYCLE|循环周期设置（大小周）|VARCHAR|是|60|||
|CHECKIN_METHOD|考勤方式|VARCHAR|是|60|||
|CREATE_DATE|创建时间|DATETIME|是||||
|CREATE_UID|创建人|VARCHAR|是|100|||
|CYCLE|循环周期设置|VARCHAR|是|60|||
|DEFAULT_FLAG|默认免考勤|INT|是||||
|EFFECT_TIME|生效时间|DATETIME|是||||
|ELASTIC_MINUTES|弹性分钟数|INT|是||||
|ELASTIC_VALID|是否启用弹性打卡|INT|是||||
|FREEDOM_RATIO|实际出勤次数|INT|是||||
|FREE_MIN_MINUTES|实际最少出勤时长|INT|是||||
|FREE_RATIO|实际出勤次数|INT|是||||
|HOLIDAY|节假日配置|VARCHAR|是|2000|||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|INVERSION_COUNT|倒班数|INT|是||||
|INVERSION_CYCLE|循环周期设置（N班倒）|VARCHAR|是|60|||
|INVERSION_DAYS|循环天数设置（N班倒）|INT|是|60|||
|IS_ACTIVATE|是否激活|INT|是||||
|NAME|规则名称|VARCHAR|是|255|||
|REQUIREMENT|每日打卡要求|VARCHAR|是|100|||
|REST|休息天数（上A休B）|INT|是||||
|SAME_RESTDAY|是否休息日相同|INT|是|100|||
|SCHEDULE_TYPE|班次类型|VARCHAR|是|60|||
|SHIFTS|班次|TEXT|是|1048576|||
|SMALL_WEEK|工作日(小周)|VARCHAR|是|100|||
|SMALL_WORKDAY|工作日(小周)|VARCHAR|是|100|||
|WORK|工作天数（上A休B）|INT|是||||
|WORKDAY|工作日|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 排班(ATTENDANCE_SCHEDULE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CHECKIN_DATE|考勤日期|DATETIME|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEPT_ID|部门ID|VARCHAR|是|60|||
|DEPT_NAME|部门名称|VARCHAR|是|255|||
|GYS_INFOID|供应商ID|VARCHAR|是|100|||
|GYS_INFONAME|供应商名称|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MANUAL|是否手动|INT|是||||
|MANUAL_TYPE|手动排班类型|INT|是|4|||
|MEMBER_ID|人员标识|VARCHAR|是|100|||
|MEMBER_NAME|人员名称|VARCHAR|是|100|||
|MEMBER_NUM|工号|VARCHAR|是|20|||
|NAME|名称|VARCHAR|是|200|||
|RULE_DATA|当前规则信息|TEXT|是|1048576|||
|RULE_ID|标识|VARCHAR|是|100|||
|RULE_NAME|规则名称|VARCHAR|是|255|||
|SCHEDULE_TYPE|班次类型|VARCHAR|是|100|||
|SHIFTS|班次信息|TEXT|是|1048576|||
|SHIFT_DATA|当前班次信息|TEXT|是|1048576|||
|TITLE|职位|VARCHAR|是|50|||
|WORKDAY|工作日标识|INT|是||||
|WORK_TIME|工作时段|TEXT|是|1048576|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|XQSYR|需求使用人|VARCHAR|是|100|||
|XQSYRID|需求使用人标识|VARCHAR|是|100|||
#### 时间范围(ATTENDANCE_SCOPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|创建时间|DATETIME|是||||
|CREATE_UID|创建人|VARCHAR|是|100|||
|EARLIEST_CHECKIN|最早打卡时间|INT|是||||
|EARLY_FOR_ABSENTEEISM|缺勤判定阈值|INT|是||||
|EARLY_FOR_EARLY|早退判定阈值|INT|是||||
|END_BASE_TIME|结束基准时间（分钟）|DATETIME|是||||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|LATEST_CHECKOUT|最晚打卡时间|INT|是||||
|LATE_FOR_ABSENTEEISM|缺勤判定阈值|INT|是||||
|LATE_FOR_LATE|迟到判定阈值|INT|是||||
|NAME|范围名称|VARCHAR|是|255|||
|NEXT_TAG|次日标记|VARCHAR|是|100|||
|ORDER_VALUE|排序值|INT|是||||
|SHIFT_ID|班次ID|VARCHAR|是|60|||
|SHIFT_NAME|班次名称|VARCHAR|是|255|||
|START_BASE_TIME|开始基准时间（分钟）|DATETIME|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 班次(ATTENDANCE_SHIFT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ATTENDANCE_RATIO|出勤比率|FLOAT|是||||
|CHECKIN_METHOD|考勤方式|VARCHAR|是|60|||
|CREATE_DATE|创建时间|DATETIME|是||||
|CREATE_UID|创建人|VARCHAR|是|100|||
|DEFAULT_FLAG|默认标识|INT|是||||
|END_START|休息结束时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|INVALID_OVERTIME|不计入加班的分钟阈值|INT|是||||
|NAME|班次名称|VARCHAR|是|255|||
|ORDER_VALUE|排序值|INT|是||||
|OVERTIME_VALID|加班有效|INT|是||||
|PUBLIC_FLAG|公共|INT|是||||
|REST_ENABLE|休息配置启用|INT|是||||
|REST_START|休息开始时间|DATETIME|是||||
|RULE_ID|考勤规则ID|VARCHAR|是|60|||
|RULE_NAME|考勤规则名称|VARCHAR|是|255|||
|START_OVERTIME|计入加班的分钟起|INT|是||||
|START_TIME|开始时间|DATETIME|是||||
|WORKING_NUMBER|上下班次数|INT|是||||
|WORK_LOAD|工时|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### WiFi定位配置(ATTENDANCE_WIFI_LOCATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CHECKIN_TYPE_ID|主键|VARCHAR|是|60|||
|CREATE_DATE|创建时间|DATETIME|是||||
|CREATE_UID|创建人|VARCHAR|是|100|||
|DEVICE_ID|设备ID|VARCHAR|是|60|||
|DEVICE_NAME|设备名称|VARCHAR|是|255|||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|MAC_ADDRESS|Mac地址|VARCHAR|是|50|||
|NAME|WiFi名称|VARCHAR|是|255|||
|RULE_ID|主键|VARCHAR|是|60|||
|SSID|WiFi SSID|VARCHAR|是|50|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 工作日(ATTENDANCE_WORKDAY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DAY_NUMBER|日序号|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|60|||
|NAME|名称|VARCHAR|是|200|||
|RULE_ID|主键|VARCHAR|是|60|||
|SHIFT_ID|主键|VARCHAR|是|60|||
|TIME|日期|DATETIME|是||||
|WORK_TIME|上下班时间|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 部门信息(DEPARTMENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|创建时间|DATETIME|是||||
|CREATE_UID|创建人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|NAME|部门名称|VARCHAR|是|255|||
|PARENT_ID|上级部门ID|VARCHAR|是|60|||
|PARENT_NAME|上级部门名称|VARCHAR|是|255|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 员工信息(EMPLOYEE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|创建时间|DATETIME|是||||
|CREATE_UID|创建人|VARCHAR|是|100|||
|DEPT_ID|部门ID|VARCHAR|是|60|||
|DEPT_NAME|部门名称|VARCHAR|是|255|||
|EMPLOYEE_NUM|工号|VARCHAR|是|20|||
|GROUP_ID|主键|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|主键|VARCHAR|否|60|||
|MEMBER_TYPE|成员类型|BIGINT|是|20|||
|NAME|员工姓名|VARCHAR|是|255|||
|ORG_ID|所属组织|VARCHAR|是|60|||
|ORG_NAME|组织名称|VARCHAR|是|100|||
|TITLE|职位|VARCHAR|是|50|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 出勤(HR_ATTENDANCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CHECK_IN|签到|DATETIME|是||||
|CHECK_OUT|签离|DATETIME|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|EXPECTED_HOURS|预期工时|FLOAT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IN_BROWSER|浏览器|VARCHAR|是|500|||
|IN_CITY|城市|VARCHAR|是|500|||
|IN_COUNTRY_NAME|国家|VARCHAR|是|500|||
|IN_IP_ADDRESS|IP地址|VARCHAR|是|500|||
|IN_LATITUDE|纬度|FLOAT|是||||
|IN_LONGITUDE|经度|FLOAT|是||||
|IN_MODE|模式|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|200|||
|OUT_BROWSER|退出浏览器|VARCHAR|是|500|||
|OUT_CITY|出城|VARCHAR|是|500|||
|OUT_COUNTRY_NAME|国家名称|VARCHAR|是|500|||
|OUT_IP_ADDRESS|出口IP 地址|VARCHAR|是|500|||
|OUT_LATITUDE|纬度|FLOAT|是||||
|OUT_LONGITUDE|出经度|FLOAT|是||||
|OUT_MODE|输出模式|VARCHAR|是|60|||
|OVERTIME_HOURS|随着时间的推移|FLOAT|是||||
|OVERTIME_STATUS|加班状态|VARCHAR|是|60|||
|VALIDATED_OVERTIME_HOURS|加班时间|FLOAT|是||||
|WORKED_HOURS|工作时数|FLOAT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 出勤 加班(HR_ATTENDANCE_OVERTIME)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADJUSTMENT|调整|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE|天|DATETIME|是||||
|DURATION|加班时间|FLOAT|是||||
|DURATION_REAL|加班时间（真实）|FLOAT|是||||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 部门(HR_DEPARTMENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COLOR|颜色指标|VARCHAR|是|100|||
|COMPLETE_NAME|完整名称|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MANAGER_ID|管理员|VARCHAR|是|100|||
|MASTER_DEPARTMENT_ID|主部门|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|NOTE|备注|TEXT|是|1048576|||
|PARENT_ID|上级部门|VARCHAR|是|100|||
|PARENT_PATH|父级路径|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 员工(HR_EMPLOYEE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ADDITIONAL_NOTE|其它说明|TEXT|是|1048576|||
|BARCODE|徽标 ID|VARCHAR|是|500|||
|BIRTHDAY|出生日期|DATETIME|是||||
|CERTIFICATE|证书等级|VARCHAR|是|60|||
|CHILDREN|受抚养的子女数|INT|是||||
|COLOR|颜色指标|INT|是||||
|CONTRACT_WARNING|合同警告|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DEPARTURE_DATE|离职日期|DATETIME|是||||
|DEPARTURE_DESCRIPTION|其它信息|TEXT|是|1048576|||
|DISTANCE_HOME_WORK|通勤距离|INT|是||||
|DISTANCE_HOME_WORK_UNIT|通勤距离（单位）|VARCHAR|是|60|||
|EMERGENCY_CONTACT|联系人姓名|VARCHAR|是|100|||
|EMERGENCY_PHONE|电话|VARCHAR|是|50|||
|EMPLOYEE_TYPE|员工类型|VARCHAR|是|60|||
|FIRST_CONTRACT_DATE|首次合同日期|DATETIME|是||||
|GENDER|性别|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IDENTIFICATION_ID|身份证号|VARCHAR|是|500|||
|IS_FLEXIBLE|灵活可变|INT|是||||
|IS_FULLY_FLEXIBLE|完全灵活|INT|是||||
|JOB_TITLE|工作头衔|VARCHAR|是|500|||
|KM_HOME_WORK|通勤距离（公里）|INT|是||||
|LEGAL_NAME|法定名称|VARCHAR|是|500|||
|MOBILE_PHONE|办公手机|VARCHAR|是|50|||
|MOBILITY_CARD|调动卡|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|NOTES|备注|TEXT|是|1048576|||
|PASSPORT_ID|护照号|VARCHAR|是|500|||
|PERMIT_NO|工作证编号|VARCHAR|是|500|||
|PIN|PIN|VARCHAR|是|500|||
|PLACE_OF_BIRTH|出生地|VARCHAR|是|500|||
|PRIVATE_CAR_PLATE|私人车辆车牌|VARCHAR|是|500|||
|PRIVATE_CITY|城市|VARCHAR|是|500|||
|PRIVATE_EMAIL|私人电子邮箱|VARCHAR|是|250|||
|PRIVATE_PHONE|私人电话|VARCHAR|是|50|||
|PRIVATE_STREET|街道|VARCHAR|是|500|||
|PRIVATE_STREET2|街道2|VARCHAR|是|500|||
|PRIVATE_ZIP|邮编|VARCHAR|是|50|||
|RESOURCE_CALENDAR_ID|工作时间|VARCHAR|是|100|||
|RESOURCE_ID|资源|VARCHAR|是|100|||
|SINID|社会保险号SIN|VARCHAR|是|50|||
|SPOUSE_BIRTHDATE|配偶生日|DATETIME|是||||
|SPOUSE_COMPLETE_NAME|配偶全名|VARCHAR|是|500|||
|SSNID|社会保障号SSN|VARCHAR|是|500|||
|STUDY_FIELD|研究领域|VARCHAR|是|500|||
|STUDY_SCHOOL|毕业院校|VARCHAR|是|500|||
|VEHICLE|公司汽车|VARCHAR|是|50|||
|VISA_EXPIRE|签证有效期|DATETIME|是||||
|VISA_NO|签证号|VARCHAR|是|500|||
|WORK_EMAIL|工作电子邮件|VARCHAR|是|500|||
|WORK_PERMIT_EXPIRATION_DATE|工作许可证到期日期|DATETIME|是||||
|WORK_PERMIT_SCHEDULED_ACTIVITY|工作许可的预定活动|INT|是||||
|WORK_PHONE|办公电话|VARCHAR|是|50|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 休假(HR_LEAVE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|开始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DURATION_DISPLAY|要求的（天/小时）|VARCHAR|是|500|||
|EMPLOYEE_ID|员工|VARCHAR|是|100|||
|HOLIDAY_STATUS_ID|休假类型|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|NOTES|理由|TEXT|是|1048576|||
|NUMBER_OF_DAYS|持续时间（天）|FLOAT|是||||
|NUMBER_OF_HOURS|持续时间(小时)|FLOAT|是||||
|OVERTIME_ID|加班时间|VARCHAR|是|100|||
|PRIVATE_NAME|休假描述|VARCHAR|是|500|||
|REQUEST_DATE_FROM|请假开始日期|DATETIME|是||||
|REQUEST_DATE_FROM_PERIOD|日期开始|VARCHAR|是|60|||
|REQUEST_DATE_TO|请求结束日期|DATETIME|是||||
|REQUEST_HOUR_FROM|时间从|FLOAT|是||||
|REQUEST_HOUR_TO|时间到|FLOAT|是||||
|REQUEST_UNIT_HALF|半天|INT|是||||
|REQUEST_UNIT_HOURS|自定义时间|INT|是||||
|STATE|状态|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 邮件会话(MAIL_THREAD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
#### 公共假期类型(PUBLIC_LEAVE_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CODE|代码名称|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 资源工作时间(RESOURCE_CALENDAR)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|FLEXIBLE_HOURS|灵活时间|INT|是||||
|FULL_TIME_REQUIRED_HOURS|公司全职|FLOAT|是||||
|HOURS_PER_DAY|每天平均小时数|FLOAT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|TWO_WEEKS_CALENDAR|双周模式下的日历|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 工作细节(RESOURCE_CALENDAR_ATTENDANCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CALENDAR_ID|资源的日历|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|起始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DAYOFWEEK|星期|VARCHAR|是|60|||
|DAY_PERIOD|日期|VARCHAR|是|60|||
|DISPLAY_TYPE|显示类型|VARCHAR|是|60|||
|DURATION_DAYS|持续时间 (天)|FLOAT|是||||
|HOUR_FROM|工作起始|FLOAT|是||||
|HOUR_TO|工作截止|FLOAT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|WEEK_TYPE|周数|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 休假详细信息(RESOURCE_CALENDAR_LEAVES)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CALENDAR_ID|工作时间|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|开始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|HOLIDAY_ID|休假要求|VARCHAR|是|100|||
|HOLIDAY_TYPE|节假日类型|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PUBLIC_ID|主键|VARCHAR|是|60|||
|TIME_TYPE|时间类型|VARCHAR|是|60|||
|TYPE_ID|主键|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 资源(RESOURCE_RESOURCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CALENDAR_ID|工时|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RESOURCE_TYPE|类型|VARCHAR|是|60|||
|TIME_EFFICIENCY|效率因子|FLOAT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 公司(RES_COMPANY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
#### 配置设定(RES_CONFIG_SETTINGS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ATTENDANCE_BARCODE_SOURCE|条码来源|VARCHAR|是|60|||
|ATTENDANCE_FROM_SYSTRAY|来自 Systray 的出席情况|INT|是||||
|ATTENDANCE_KIOSK_DELAY|自助考勤终端延迟|INT|是||||
|ATTENDANCE_KIOSK_MODE|考勤模式|VARCHAR|是|60|||
|ATTENDANCE_KIOSK_URL|自助考勤终端网址|VARCHAR|是|2000|||
|ATTENDANCE_KIOSK_USE_PIN|员工pin|INT|是||||
|ATTENDANCE_OVERTIME_VALIDATION|额外工时验证|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||






