# 考勤统计(attendance_statistics) :id=attendance_statistics
## 创建考勤统计

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_statistics" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">xqsyr</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人|
|<el-row justify="space-between"><el-col :span="20">xqsyrid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人标识|
|<el-row justify="space-between"><el-col :span="20">gys_infoid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商ID|
|<el-row justify="space-between"><el-col :span="20">gys_infoname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">annual_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|年假|
|<el-row justify="space-between"><el-col :span="20">vacation_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休假|
|<el-row justify="space-between"><el-col :span="20">sick_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|病假|
|<el-row justify="space-between"><el-col :span="20">parental_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|育儿假|
|<el-row justify="space-between"><el-col :span="20">paternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|陪产假|
|<el-row justify="space-between"><el-col :span="20">marriage_holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|婚假|
|<el-row justify="space-between"><el-col :span="20">funeral_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|丧假|
|<el-row justify="space-between"><el-col :span="20">maternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|产假|
|<el-row justify="space-between"><el-col :span="20">on_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">off_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">compassionate_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|事假|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">absent_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺勤天数|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">checkout_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺退次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工编号|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到总时长|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退总时长|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">make_card_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|补卡次数|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出时长|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外勤次数|
|<el-row justify="space-between"><el-col :span="20">pay_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计加班费)|
|<el-row justify="space-between"><el-col :span="20">rest_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计调休假)|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤时长|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时长|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}

```

## 获取考勤统计

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_statistics/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|




##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}

```

## 删除考勤统计

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_statistics/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新考勤统计

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_statistics/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">xqsyr</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人|
|<el-row justify="space-between"><el-col :span="20">xqsyrid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人标识|
|<el-row justify="space-between"><el-col :span="20">gys_infoid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商ID|
|<el-row justify="space-between"><el-col :span="20">gys_infoname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">annual_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|年假|
|<el-row justify="space-between"><el-col :span="20">vacation_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休假|
|<el-row justify="space-between"><el-col :span="20">sick_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|病假|
|<el-row justify="space-between"><el-col :span="20">parental_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|育儿假|
|<el-row justify="space-between"><el-col :span="20">paternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|陪产假|
|<el-row justify="space-between"><el-col :span="20">marriage_holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|婚假|
|<el-row justify="space-between"><el-col :span="20">funeral_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|丧假|
|<el-row justify="space-between"><el-col :span="20">maternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|产假|
|<el-row justify="space-between"><el-col :span="20">on_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">off_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">compassionate_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|事假|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">absent_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺勤天数|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">checkout_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺退次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工编号|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到总时长|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退总时长|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">make_card_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|补卡次数|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出时长|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外勤次数|
|<el-row justify="space-between"><el-col :span="20">pay_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计加班费)|
|<el-row justify="space-between"><el-col :span="20">rest_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计调休假)|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤时长|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时长|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}

```

## 信息反查

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_statistics/check_info" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">xqsyr</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人|
|<el-row justify="space-between"><el-col :span="20">xqsyrid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人标识|
|<el-row justify="space-between"><el-col :span="20">gys_infoid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商ID|
|<el-row justify="space-between"><el-col :span="20">gys_infoname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">annual_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|年假|
|<el-row justify="space-between"><el-col :span="20">vacation_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休假|
|<el-row justify="space-between"><el-col :span="20">sick_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|病假|
|<el-row justify="space-between"><el-col :span="20">parental_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|育儿假|
|<el-row justify="space-between"><el-col :span="20">paternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|陪产假|
|<el-row justify="space-between"><el-col :span="20">marriage_holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|婚假|
|<el-row justify="space-between"><el-col :span="20">funeral_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|丧假|
|<el-row justify="space-between"><el-col :span="20">maternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|产假|
|<el-row justify="space-between"><el-col :span="20">on_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">off_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">compassionate_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|事假|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">absent_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺勤天数|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">checkout_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺退次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工编号|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到总时长|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退总时长|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">make_card_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|补卡次数|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出时长|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外勤次数|
|<el-row justify="space-between"><el-col :span="20">pay_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计加班费)|
|<el-row justify="space-between"><el-col :span="20">rest_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计调休假)|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤时长|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时长|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}

```

## 检查考勤统计主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_statistics/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">xqsyr</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人|
|<el-row justify="space-between"><el-col :span="20">xqsyrid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人标识|
|<el-row justify="space-between"><el-col :span="20">gys_infoid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商ID|
|<el-row justify="space-between"><el-col :span="20">gys_infoname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">annual_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|年假|
|<el-row justify="space-between"><el-col :span="20">vacation_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休假|
|<el-row justify="space-between"><el-col :span="20">sick_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|病假|
|<el-row justify="space-between"><el-col :span="20">parental_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|育儿假|
|<el-row justify="space-between"><el-col :span="20">paternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|陪产假|
|<el-row justify="space-between"><el-col :span="20">marriage_holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|婚假|
|<el-row justify="space-between"><el-col :span="20">funeral_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|丧假|
|<el-row justify="space-between"><el-col :span="20">maternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|产假|
|<el-row justify="space-between"><el-col :span="20">on_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">off_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">compassionate_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|事假|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">absent_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺勤天数|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">checkout_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺退次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工编号|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到总时长|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退总时长|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">make_card_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|补卡次数|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出时长|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外勤次数|
|<el-row justify="space-between"><el-col :span="20">pay_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计加班费)|
|<el-row justify="space-between"><el-col :span="20">rest_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计调休假)|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤时长|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时长|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取考勤统计草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_statistics/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">xqsyr</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人|
|<el-row justify="space-between"><el-col :span="20">xqsyrid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人标识|
|<el-row justify="space-between"><el-col :span="20">gys_infoid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商ID|
|<el-row justify="space-between"><el-col :span="20">gys_infoname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">annual_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|年假|
|<el-row justify="space-between"><el-col :span="20">vacation_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休假|
|<el-row justify="space-between"><el-col :span="20">sick_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|病假|
|<el-row justify="space-between"><el-col :span="20">parental_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|育儿假|
|<el-row justify="space-between"><el-col :span="20">paternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|陪产假|
|<el-row justify="space-between"><el-col :span="20">marriage_holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|婚假|
|<el-row justify="space-between"><el-col :span="20">funeral_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|丧假|
|<el-row justify="space-between"><el-col :span="20">maternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|产假|
|<el-row justify="space-between"><el-col :span="20">on_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">off_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">compassionate_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|事假|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">absent_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺勤天数|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">checkout_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺退次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工编号|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到总时长|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退总时长|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">make_card_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|补卡次数|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出时长|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外勤次数|
|<el-row justify="space-between"><el-col :span="20">pay_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计加班费)|
|<el-row justify="space-between"><el-col :span="20">rest_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计调休假)|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤时长|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时长|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}

```

## 个人统计

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_statistics/personal" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">xqsyr</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人|
|<el-row justify="space-between"><el-col :span="20">xqsyrid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人标识|
|<el-row justify="space-between"><el-col :span="20">gys_infoid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商ID|
|<el-row justify="space-between"><el-col :span="20">gys_infoname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">annual_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|年假|
|<el-row justify="space-between"><el-col :span="20">vacation_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休假|
|<el-row justify="space-between"><el-col :span="20">sick_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|病假|
|<el-row justify="space-between"><el-col :span="20">parental_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|育儿假|
|<el-row justify="space-between"><el-col :span="20">paternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|陪产假|
|<el-row justify="space-between"><el-col :span="20">marriage_holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|婚假|
|<el-row justify="space-between"><el-col :span="20">funeral_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|丧假|
|<el-row justify="space-between"><el-col :span="20">maternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|产假|
|<el-row justify="space-between"><el-col :span="20">on_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">off_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">compassionate_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|事假|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">absent_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺勤天数|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">checkout_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺退次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工编号|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到总时长|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退总时长|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">make_card_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|补卡次数|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出时长|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外勤次数|
|<el-row justify="space-between"><el-col :span="20">pay_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计加班费)|
|<el-row justify="space-between"><el-col :span="20">rest_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计调休假)|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤时长|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时长|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}

```

## 保存考勤统计

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_statistics/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">xqsyr</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人|
|<el-row justify="space-between"><el-col :span="20">xqsyrid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求使用人标识|
|<el-row justify="space-between"><el-col :span="20">gys_infoid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商ID|
|<el-row justify="space-between"><el-col :span="20">gys_infoname</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商名称|
|<el-row justify="space-between"><el-col :span="20">annual_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|年假|
|<el-row justify="space-between"><el-col :span="20">vacation_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休假|
|<el-row justify="space-between"><el-col :span="20">sick_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|病假|
|<el-row justify="space-between"><el-col :span="20">parental_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|育儿假|
|<el-row justify="space-between"><el-col :span="20">paternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|陪产假|
|<el-row justify="space-between"><el-col :span="20">marriage_holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|婚假|
|<el-row justify="space-between"><el-col :span="20">funeral_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|丧假|
|<el-row justify="space-between"><el-col :span="20">maternity_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|产假|
|<el-row justify="space-between"><el-col :span="20">on_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">off_missing</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下班卡缺卡|
|<el-row justify="space-between"><el-col :span="20">compassionate_leave</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|事假|
|<el-row justify="space-between"><el-col :span="20">working_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤时长|
|<el-row justify="space-between"><el-col :span="20">leave_duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|请假时长|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">absent_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺勤天数|
|<el-row justify="space-between"><el-col :span="20">actual_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|实际出勤天数|
|<el-row justify="space-between"><el-col :span="20">billable_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|计薪时长|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">checkout_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺退次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工编号|
|<el-row justify="space-between"><el-col :span="20">late_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到总时长|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退总时长|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|早退次数|
|<el-row justify="space-between"><el-col :span="20">make_card_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|补卡次数|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员ID|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员姓名|
|<el-row justify="space-between"><el-col :span="20">off_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|调休时长|
|<el-row justify="space-between"><el-col :span="20">on_business_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出差天数|
|<el-row justify="space-between"><el-col :span="20">out_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外出时长|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外勤次数|
|<el-row justify="space-between"><el-col :span="20">pay_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计加班费)|
|<el-row justify="space-between"><el-col :span="20">rest_overtime_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(计调休假)|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排班类型|
|<el-row justify="space-between"><el-col :span="20">should_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤天数|
|<el-row justify="space-between"><el-col :span="20">should_attendance_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|应出勤时长|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">working_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时长|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "xqsyr" : null,
  "xqsyrid" : null,
  "gys_infoid" : null,
  "gys_infoname" : null,
  "annual_leave" : null,
  "vacation_leave" : null,
  "sick_leave" : null,
  "parental_leave" : null,
  "paternity_leave" : null,
  "marriage_holiday" : null,
  "funeral_leave" : null,
  "maternity_leave" : null,
  "on_missing" : null,
  "off_missing" : null,
  "compassionate_leave" : null,
  "working_hours" : null,
  "leave_duration" : null,
  "dept_id" : null,
  "absent_days" : null,
  "actual_attendance_days" : null,
  "billable_time" : null,
  "checkin_missing_times" : null,
  "checkout_missing_times" : null,
  "dept_name" : null,
  "employee_num" : null,
  "late_time" : null,
  "late_times" : null,
  "leave_early_time" : null,
  "leave_early_times" : null,
  "make_card_times" : null,
  "member_id" : null,
  "member_name" : null,
  "off_hours" : null,
  "on_business_days" : null,
  "out_time" : null,
  "out_work_times" : null,
  "pay_overtime_time" : null,
  "rest_overtime_time" : null,
  "schedule_type" : null,
  "should_attendance_days" : null,
  "should_attendance_time" : null,
  "title" : null,
  "working_time" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_statistics/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "create_uid" : null,
    "create_date" : null,
    "write_uid" : null,
    "write_date" : null,
    "xqsyr" : null,
    "xqsyrid" : null,
    "gys_infoid" : null,
    "gys_infoname" : null,
    "annual_leave" : null,
    "vacation_leave" : null,
    "sick_leave" : null,
    "parental_leave" : null,
    "paternity_leave" : null,
    "marriage_holiday" : null,
    "funeral_leave" : null,
    "maternity_leave" : null,
    "on_missing" : null,
    "off_missing" : null,
    "compassionate_leave" : null,
    "working_hours" : null,
    "leave_duration" : null,
    "dept_id" : null,
    "absent_days" : null,
    "actual_attendance_days" : null,
    "billable_time" : null,
    "checkin_missing_times" : null,
    "checkout_missing_times" : null,
    "dept_name" : null,
    "employee_num" : null,
    "late_time" : null,
    "late_times" : null,
    "leave_early_time" : null,
    "leave_early_times" : null,
    "make_card_times" : null,
    "member_id" : null,
    "member_name" : null,
    "off_hours" : null,
    "on_business_days" : null,
    "out_time" : null,
    "out_work_times" : null,
    "pay_overtime_time" : null,
    "rest_overtime_time" : null,
    "schedule_type" : null,
    "should_attendance_days" : null,
    "should_attendance_time" : null,
    "title" : null,
    "working_time" : null,
  }
]
```

## 月度统计

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_statistics/fetch_month_report" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "create_uid" : null,
    "create_date" : null,
    "write_uid" : null,
    "write_date" : null,
    "xqsyr" : null,
    "xqsyrid" : null,
    "gys_infoid" : null,
    "gys_infoname" : null,
    "annual_leave" : null,
    "vacation_leave" : null,
    "sick_leave" : null,
    "parental_leave" : null,
    "paternity_leave" : null,
    "marriage_holiday" : null,
    "funeral_leave" : null,
    "maternity_leave" : null,
    "on_missing" : null,
    "off_missing" : null,
    "compassionate_leave" : null,
    "working_hours" : null,
    "leave_duration" : null,
    "dept_id" : null,
    "absent_days" : null,
    "actual_attendance_days" : null,
    "billable_time" : null,
    "checkin_missing_times" : null,
    "checkout_missing_times" : null,
    "dept_name" : null,
    "employee_num" : null,
    "late_time" : null,
    "late_times" : null,
    "leave_early_time" : null,
    "leave_early_times" : null,
    "make_card_times" : null,
    "member_id" : null,
    "member_name" : null,
    "off_hours" : null,
    "on_business_days" : null,
    "out_time" : null,
    "out_work_times" : null,
    "pay_overtime_time" : null,
    "rest_overtime_time" : null,
    "schedule_type" : null,
    "should_attendance_days" : null,
    "should_attendance_time" : null,
    "title" : null,
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
<el-alert title="/attendance_statistics/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_statistics/exportdata/{param},/attendance_statistics/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_statistics/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_statistics/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_statistics/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_statistics/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_statistics/report" type="info" :closable="false" ></el-alert>
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