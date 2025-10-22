# 考勤记录(attendance_record) :id=attendance_record
## 创建考勤记录

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|考勤明细|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请假类型|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">is_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加班|
|<el-row justify="space-between"><el-col :span="20">billable_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长（小时）|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计薪时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">checkin_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡状态信息|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤记录ID|
|<el-row justify="space-between"><el-col :span="20">is_business_trip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否出差|
|<el-row justify="space-between"><el-col :span="20">is_go_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外出|
|<el-row justify="space-between"><el-col :span="20">is_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否请假|
|<el-row justify="space-between"><el-col :span="20">is_out_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外勤|
|<el-row justify="space-between"><el-col :span="20">is_pay_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计加班费|
|<el-row justify="space-between"><el-col :span="20">is_rest_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计调休假|
|<el-row justify="space-between"><el-col :span="20">late_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到分钟数|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到时间|
|<el-row justify="space-between"><el-col :span="20">leave_early_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退分钟数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退时间|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调休使用时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出小时数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出时间|
|<el-row justify="space-between"><el-col :span="20">out_work_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤小时数|
|<el-row justify="space-between"><el-col :span="20">out_work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤时间|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班小时数|
|<el-row justify="space-between"><el-col :span="20">overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">rule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤规则ID|
|<el-row justify="space-between"><el-col :span="20">rule_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">shift_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次信息|
|<el-row justify="space-between"><el-col :span="20">should_attendance_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤时长（分钟）|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}

```

## 获取考勤记录

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|考勤记录ID|




##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}

```

## 删除考勤记录

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|考勤记录ID|





## 更新考勤记录

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|考勤记录ID|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|考勤明细|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请假类型|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">is_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加班|
|<el-row justify="space-between"><el-col :span="20">billable_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长（小时）|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计薪时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">checkin_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡状态信息|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤记录ID|
|<el-row justify="space-between"><el-col :span="20">is_business_trip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否出差|
|<el-row justify="space-between"><el-col :span="20">is_go_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外出|
|<el-row justify="space-between"><el-col :span="20">is_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否请假|
|<el-row justify="space-between"><el-col :span="20">is_out_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外勤|
|<el-row justify="space-between"><el-col :span="20">is_pay_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计加班费|
|<el-row justify="space-between"><el-col :span="20">is_rest_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计调休假|
|<el-row justify="space-between"><el-col :span="20">late_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到分钟数|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到时间|
|<el-row justify="space-between"><el-col :span="20">leave_early_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退分钟数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退时间|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调休使用时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出小时数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出时间|
|<el-row justify="space-between"><el-col :span="20">out_work_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤小时数|
|<el-row justify="space-between"><el-col :span="20">out_work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤时间|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班小时数|
|<el-row justify="space-between"><el-col :span="20">overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">rule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤规则ID|
|<el-row justify="space-between"><el-col :span="20">rule_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">shift_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次信息|
|<el-row justify="space-between"><el-col :span="20">should_attendance_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤时长（分钟）|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}

```

## 考勤记录反查

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/check_info" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|考勤明细|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请假类型|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">is_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加班|
|<el-row justify="space-between"><el-col :span="20">billable_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长（小时）|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计薪时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">checkin_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡状态信息|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤记录ID|
|<el-row justify="space-between"><el-col :span="20">is_business_trip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否出差|
|<el-row justify="space-between"><el-col :span="20">is_go_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外出|
|<el-row justify="space-between"><el-col :span="20">is_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否请假|
|<el-row justify="space-between"><el-col :span="20">is_out_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外勤|
|<el-row justify="space-between"><el-col :span="20">is_pay_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计加班费|
|<el-row justify="space-between"><el-col :span="20">is_rest_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计调休假|
|<el-row justify="space-between"><el-col :span="20">late_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到分钟数|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到时间|
|<el-row justify="space-between"><el-col :span="20">leave_early_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退分钟数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退时间|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调休使用时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出小时数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出时间|
|<el-row justify="space-between"><el-col :span="20">out_work_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤小时数|
|<el-row justify="space-between"><el-col :span="20">out_work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤时间|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班小时数|
|<el-row justify="space-between"><el-col :span="20">overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">rule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤规则ID|
|<el-row justify="space-between"><el-col :span="20">rule_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">shift_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次信息|
|<el-row justify="space-between"><el-col :span="20">should_attendance_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤时长（分钟）|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}

```

## 检查考勤记录主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|考勤明细|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请假类型|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">is_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加班|
|<el-row justify="space-between"><el-col :span="20">billable_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长（小时）|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计薪时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">checkin_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡状态信息|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤记录ID|
|<el-row justify="space-between"><el-col :span="20">is_business_trip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否出差|
|<el-row justify="space-between"><el-col :span="20">is_go_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外出|
|<el-row justify="space-between"><el-col :span="20">is_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否请假|
|<el-row justify="space-between"><el-col :span="20">is_out_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外勤|
|<el-row justify="space-between"><el-col :span="20">is_pay_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计加班费|
|<el-row justify="space-between"><el-col :span="20">is_rest_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计调休假|
|<el-row justify="space-between"><el-col :span="20">late_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到分钟数|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到时间|
|<el-row justify="space-between"><el-col :span="20">leave_early_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退分钟数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退时间|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调休使用时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出小时数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出时间|
|<el-row justify="space-between"><el-col :span="20">out_work_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤小时数|
|<el-row justify="space-between"><el-col :span="20">out_work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤时间|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班小时数|
|<el-row justify="space-between"><el-col :span="20">overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">rule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤规则ID|
|<el-row justify="space-between"><el-col :span="20">rule_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">shift_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次信息|
|<el-row justify="space-between"><el-col :span="20">should_attendance_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤时长（分钟）|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取考勤记录草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|考勤明细|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请假类型|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">is_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加班|
|<el-row justify="space-between"><el-col :span="20">billable_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长（小时）|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计薪时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">checkin_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡状态信息|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤记录ID|
|<el-row justify="space-between"><el-col :span="20">is_business_trip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否出差|
|<el-row justify="space-between"><el-col :span="20">is_go_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外出|
|<el-row justify="space-between"><el-col :span="20">is_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否请假|
|<el-row justify="space-between"><el-col :span="20">is_out_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外勤|
|<el-row justify="space-between"><el-col :span="20">is_pay_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计加班费|
|<el-row justify="space-between"><el-col :span="20">is_rest_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计调休假|
|<el-row justify="space-between"><el-col :span="20">late_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到分钟数|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到时间|
|<el-row justify="space-between"><el-col :span="20">leave_early_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退分钟数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退时间|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调休使用时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出小时数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出时间|
|<el-row justify="space-between"><el-col :span="20">out_work_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤小时数|
|<el-row justify="space-between"><el-col :span="20">out_work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤时间|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班小时数|
|<el-row justify="space-between"><el-col :span="20">overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">rule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤规则ID|
|<el-row justify="space-between"><el-col :span="20">rule_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">shift_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次信息|
|<el-row justify="space-between"><el-col :span="20">should_attendance_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤时长（分钟）|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}

```

## 月底汇总_我的出勤统计

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/my_attendance_summary" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|考勤明细|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请假类型|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">is_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加班|
|<el-row justify="space-between"><el-col :span="20">billable_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长（小时）|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计薪时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">checkin_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡状态信息|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤记录ID|
|<el-row justify="space-between"><el-col :span="20">is_business_trip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否出差|
|<el-row justify="space-between"><el-col :span="20">is_go_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外出|
|<el-row justify="space-between"><el-col :span="20">is_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否请假|
|<el-row justify="space-between"><el-col :span="20">is_out_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外勤|
|<el-row justify="space-between"><el-col :span="20">is_pay_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计加班费|
|<el-row justify="space-between"><el-col :span="20">is_rest_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计调休假|
|<el-row justify="space-between"><el-col :span="20">late_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到分钟数|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到时间|
|<el-row justify="space-between"><el-col :span="20">leave_early_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退分钟数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退时间|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调休使用时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出小时数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出时间|
|<el-row justify="space-between"><el-col :span="20">out_work_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤小时数|
|<el-row justify="space-between"><el-col :span="20">out_work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤时间|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班小时数|
|<el-row justify="space-between"><el-col :span="20">overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">rule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤规则ID|
|<el-row justify="space-between"><el-col :span="20">rule_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">shift_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次信息|
|<el-row justify="space-between"><el-col :span="20">should_attendance_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤时长（分钟）|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}

```

## 保存考勤记录

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|考勤明细|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请假类型|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">is_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加班|
|<el-row justify="space-between"><el-col :span="20">billable_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长（小时）|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计薪时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">checkin_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡状态信息|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤记录ID|
|<el-row justify="space-between"><el-col :span="20">is_business_trip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否出差|
|<el-row justify="space-between"><el-col :span="20">is_go_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外出|
|<el-row justify="space-between"><el-col :span="20">is_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否请假|
|<el-row justify="space-between"><el-col :span="20">is_out_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否外勤|
|<el-row justify="space-between"><el-col :span="20">is_pay_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计加班费|
|<el-row justify="space-between"><el-col :span="20">is_rest_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否计调休假|
|<el-row justify="space-between"><el-col :span="20">late_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到分钟数|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到时间|
|<el-row justify="space-between"><el-col :span="20">leave_early_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退分钟数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退时间|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|调休使用时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出小时数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出时间|
|<el-row justify="space-between"><el-col :span="20">out_work_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤小时数|
|<el-row justify="space-between"><el-col :span="20">out_work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤时间|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班小时数|
|<el-row justify="space-between"><el-col :span="20">overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">rule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤规则ID|
|<el-row justify="space-between"><el-col :span="20">rule_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">shift_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次信息|
|<el-row justify="space-between"><el-col :span="20">should_attendance_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤时长（分钟）|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长（小时）|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤时长（分钟）|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "details" : null,
  "member_num" : null,
  "dept_id" : null,
  "leave_duration" : null,
  "leave_type" : null,
  "checkin_missing_times" : null,
  "leave_early_times" : null,
  "late_times" : null,
  "dept_name" : null,
  "title" : null,
  "actual_attendance_days" : null,
  "should_attendance_days" : null,
  "is_overtime" : null,
  "billable_hours" : null,
  "billable_time" : null,
  "checkin_date" : null,
  "checkin_message" : null,
  "checkin_result" : null,
  "id" : null,
  "is_business_trip" : null,
  "is_go_out" : null,
  "is_leave" : null,
  "is_out_work" : null,
  "is_pay_overtime" : null,
  "is_rest_overtime" : null,
  "late_minutes" : null,
  "late_time" : null,
  "leave_early_minutes" : null,
  "leave_early_time" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_hours" : null,
  "out_time" : null,
  "out_work_hours" : null,
  "out_work_time" : null,
  "overtime_hours" : null,
  "overtime_time" : null,
  "rule_id" : null,
  "rule_name" : null,
  "schedule_type" : null,
  "shift_message" : null,
  "should_attendance_hours" : null,
  "should_attendance_time" : null,
  "working_hours" : null,
  "working_time" : null,
}

```

## 异常考勤

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/fetch_abnormal_attendance" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">n_dept_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">n_details_isnotnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤明细|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤记录ID|
|<el-row justify="space-between"><el-col :span="20">n_member_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">n_member_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">n_member_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_rule_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤规则ID|
|<el-row justify="space-between"><el-col :span="20">n_rule_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">n_rule_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_checkin_date_gtandeq" : null,
  "n_checkin_date_ltandeq" : null,
  "n_checkin_result_eq" : null,
  "n_checkin_result_in" : null,
  "n_dept_id_eq" : null,
  "n_details_isnotnull" : null,
  "n_id_eq" : null,
  "n_member_id_eq" : null,
  "n_member_name_eq" : null,
  "n_member_name_like" : null,
  "n_name_like" : null,
  "n_rule_id_eq" : null,
  "n_rule_name_eq" : null,
  "n_rule_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "name" : null,
    "create_uid" : null,
    "create_date" : null,
    "write_uid" : null,
    "write_date" : null,
    "details" : null,
    "member_num" : null,
    "dept_id" : null,
    "leave_duration" : null,
    "leave_type" : null,
    "checkin_missing_times" : null,
    "leave_early_times" : null,
    "late_times" : null,
    "dept_name" : null,
    "title" : null,
    "actual_attendance_days" : null,
    "should_attendance_days" : null,
    "is_overtime" : null,
    "billable_hours" : null,
    "billable_time" : null,
    "checkin_date" : null,
    "checkin_message" : null,
    "checkin_result" : null,
    "id" : null,
    "is_business_trip" : null,
    "is_go_out" : null,
    "is_leave" : null,
    "is_out_work" : null,
    "is_pay_overtime" : null,
    "is_rest_overtime" : null,
    "late_minutes" : null,
    "late_time" : null,
    "leave_early_minutes" : null,
    "leave_early_time" : null,
    "member_id" : null,
    "member_name" : null,
    "off_hours" : null,
    "on_business_days" : null,
    "out_hours" : null,
    "out_time" : null,
    "out_work_hours" : null,
    "out_work_time" : null,
    "overtime_hours" : null,
    "overtime_time" : null,
    "rule_id" : null,
    "rule_name" : null,
    "schedule_type" : null,
    "shift_message" : null,
    "should_attendance_hours" : null,
    "should_attendance_time" : null,
    "working_hours" : null,
    "working_time" : null,
  }
]
```

## clock

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/fetch_clock" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">n_dept_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">n_details_isnotnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤明细|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤记录ID|
|<el-row justify="space-between"><el-col :span="20">n_member_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">n_member_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">n_member_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_rule_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤规则ID|
|<el-row justify="space-between"><el-col :span="20">n_rule_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">n_rule_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_checkin_date_gtandeq" : null,
  "n_checkin_date_ltandeq" : null,
  "n_checkin_result_eq" : null,
  "n_checkin_result_in" : null,
  "n_dept_id_eq" : null,
  "n_details_isnotnull" : null,
  "n_id_eq" : null,
  "n_member_id_eq" : null,
  "n_member_name_eq" : null,
  "n_member_name_like" : null,
  "n_name_like" : null,
  "n_rule_id_eq" : null,
  "n_rule_name_eq" : null,
  "n_rule_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "name" : null,
    "create_uid" : null,
    "create_date" : null,
    "write_uid" : null,
    "write_date" : null,
    "details" : null,
    "member_num" : null,
    "dept_id" : null,
    "leave_duration" : null,
    "leave_type" : null,
    "checkin_missing_times" : null,
    "leave_early_times" : null,
    "late_times" : null,
    "dept_name" : null,
    "title" : null,
    "actual_attendance_days" : null,
    "should_attendance_days" : null,
    "is_overtime" : null,
    "billable_hours" : null,
    "billable_time" : null,
    "checkin_date" : null,
    "checkin_message" : null,
    "checkin_result" : null,
    "id" : null,
    "is_business_trip" : null,
    "is_go_out" : null,
    "is_leave" : null,
    "is_out_work" : null,
    "is_pay_overtime" : null,
    "is_rest_overtime" : null,
    "late_minutes" : null,
    "late_time" : null,
    "leave_early_minutes" : null,
    "leave_early_time" : null,
    "member_id" : null,
    "member_name" : null,
    "off_hours" : null,
    "on_business_days" : null,
    "out_hours" : null,
    "out_time" : null,
    "out_work_hours" : null,
    "out_work_time" : null,
    "overtime_hours" : null,
    "overtime_time" : null,
    "rule_id" : null,
    "rule_name" : null,
    "schedule_type" : null,
    "shift_message" : null,
    "should_attendance_hours" : null,
    "should_attendance_time" : null,
    "working_hours" : null,
    "working_time" : null,
  }
]
```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">n_dept_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">n_details_isnotnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤明细|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤记录ID|
|<el-row justify="space-between"><el-col :span="20">n_member_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">n_member_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">n_member_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_rule_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤规则ID|
|<el-row justify="space-between"><el-col :span="20">n_rule_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">n_rule_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_checkin_date_gtandeq" : null,
  "n_checkin_date_ltandeq" : null,
  "n_checkin_result_eq" : null,
  "n_checkin_result_in" : null,
  "n_dept_id_eq" : null,
  "n_details_isnotnull" : null,
  "n_id_eq" : null,
  "n_member_id_eq" : null,
  "n_member_name_eq" : null,
  "n_member_name_like" : null,
  "n_name_like" : null,
  "n_rule_id_eq" : null,
  "n_rule_name_eq" : null,
  "n_rule_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "name" : null,
    "create_uid" : null,
    "create_date" : null,
    "write_uid" : null,
    "write_date" : null,
    "details" : null,
    "member_num" : null,
    "dept_id" : null,
    "leave_duration" : null,
    "leave_type" : null,
    "checkin_missing_times" : null,
    "leave_early_times" : null,
    "late_times" : null,
    "dept_name" : null,
    "title" : null,
    "actual_attendance_days" : null,
    "should_attendance_days" : null,
    "is_overtime" : null,
    "billable_hours" : null,
    "billable_time" : null,
    "checkin_date" : null,
    "checkin_message" : null,
    "checkin_result" : null,
    "id" : null,
    "is_business_trip" : null,
    "is_go_out" : null,
    "is_leave" : null,
    "is_out_work" : null,
    "is_pay_overtime" : null,
    "is_rest_overtime" : null,
    "late_minutes" : null,
    "late_time" : null,
    "leave_early_minutes" : null,
    "leave_early_time" : null,
    "member_id" : null,
    "member_name" : null,
    "off_hours" : null,
    "on_business_days" : null,
    "out_hours" : null,
    "out_time" : null,
    "out_work_hours" : null,
    "out_work_time" : null,
    "overtime_hours" : null,
    "overtime_time" : null,
    "rule_id" : null,
    "rule_name" : null,
    "schedule_type" : null,
    "shift_message" : null,
    "should_attendance_hours" : null,
    "should_attendance_time" : null,
    "working_hours" : null,
    "working_time" : null,
  }
]
```

## 考勤记录(特定搜索条件)

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/fetch_record" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤结果|
|<el-row justify="space-between"><el-col :span="20">n_dept_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">n_details_isnotnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤明细|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤记录ID|
|<el-row justify="space-between"><el-col :span="20">n_member_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">n_member_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">n_member_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工姓名|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_rule_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤规则ID|
|<el-row justify="space-between"><el-col :span="20">n_rule_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">n_rule_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_checkin_date_gtandeq" : null,
  "n_checkin_date_ltandeq" : null,
  "n_checkin_result_eq" : null,
  "n_checkin_result_in" : null,
  "n_dept_id_eq" : null,
  "n_details_isnotnull" : null,
  "n_id_eq" : null,
  "n_member_id_eq" : null,
  "n_member_name_eq" : null,
  "n_member_name_like" : null,
  "n_name_like" : null,
  "n_rule_id_eq" : null,
  "n_rule_name_eq" : null,
  "n_rule_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "name" : null,
    "create_uid" : null,
    "create_date" : null,
    "write_uid" : null,
    "write_date" : null,
    "details" : null,
    "member_num" : null,
    "dept_id" : null,
    "leave_duration" : null,
    "leave_type" : null,
    "checkin_missing_times" : null,
    "leave_early_times" : null,
    "late_times" : null,
    "dept_name" : null,
    "title" : null,
    "actual_attendance_days" : null,
    "should_attendance_days" : null,
    "is_overtime" : null,
    "billable_hours" : null,
    "billable_time" : null,
    "checkin_date" : null,
    "checkin_message" : null,
    "checkin_result" : null,
    "id" : null,
    "is_business_trip" : null,
    "is_go_out" : null,
    "is_leave" : null,
    "is_out_work" : null,
    "is_pay_overtime" : null,
    "is_rest_overtime" : null,
    "late_minutes" : null,
    "late_time" : null,
    "leave_early_minutes" : null,
    "leave_early_time" : null,
    "member_id" : null,
    "member_name" : null,
    "off_hours" : null,
    "on_business_days" : null,
    "out_hours" : null,
    "out_time" : null,
    "out_work_hours" : null,
    "out_work_time" : null,
    "overtime_hours" : null,
    "overtime_time" : null,
    "rule_id" : null,
    "rule_name" : null,
    "schedule_type" : null,
    "shift_message" : null,
    "should_attendance_hours" : null,
    "should_attendance_time" : null,
    "working_hours" : null,
    "working_time" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/importtemplate" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |



## 数据导出

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/exportdata/{param},/attendance_records/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|param|String|导出集合方法名称|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|srfexporttag|String|导出模板标识|

##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|page|Integer|page|
|size|Integer|分页大小|
|n_xxx_eq|String|过滤参数|


## 数据导入

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/importdata" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 数据导入（返回错误excel）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/importdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 自定义表头导入（异步）
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/asyncimportdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |
| srfossfileid | String | 导入文件 |
| srfimportschemaid | String | 表头定义 |


## 数据打印
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/printdata/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfprinttag | String | 打印标识 |
| srfcontenttype | String | 打印类型 |



## 报表打印

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_records/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfreporttag | String | 报表标识 |
| srfcontenttype | String | 报表类型 |




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