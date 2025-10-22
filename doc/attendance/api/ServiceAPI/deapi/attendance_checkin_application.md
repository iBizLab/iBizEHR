# 考勤申请记录(attendance_checkin_application) :id=attendance_checkin_application
## 创建考勤申请记录

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_checkin_applications" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人ID|
|<el-row justify="space-between"><el-col :span="20">approver_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人|
|<el-row justify="space-between"><el-col :span="20">copy_give</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人|
|<el-row justify="space-between"><el-col :span="20">copy_give_names</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人名称|
|<el-row justify="space-between"><el-col :span="20">reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请说明|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">end_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|假期类型|
|<el-row justify="space-between"><el-col :span="20">departure_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出发城市|
|<el-row justify="space-between"><el-col :span="20">destination_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目的城市|
|<el-row justify="space-between"><el-col :span="20">reissue_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡日期|
|<el-row justify="space-between"><el-col :span="20">reissue_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡时间|
|<el-row justify="space-between"><el-col :span="20">go_out_place</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|外出地|
|<el-row justify="space-between"><el-col :span="20">hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时数|
|<el-row justify="space-between"><el-col :span="20">minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|分钟数|
|<el-row justify="space-between"><el-col :span="20">overtime_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班类型|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|天数|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请人|
|<el-row justify="space-between"><el-col :span="20">applicant_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人姓名|
|<el-row justify="space-between"><el-col :span="20">apply_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "approver_id" : null,
  "approver_name" : null,
  "copy_give" : null,
  "copy_give_names" : null,
  "reason" : null,
  "employee_num" : null,
  "dept_name" : null,
  "start_time" : null,
  "end_time" : null,
  "leave_type" : null,
  "departure_city" : null,
  "destination_city" : null,
  "reissue_date" : null,
  "reissue_time" : null,
  "go_out_place" : null,
  "hours" : null,
  "minutes" : null,
  "overtime_type" : null,
  "dept_id" : null,
  "days" : null,
  "applicant_id" : null,
  "applicant_name" : null,
  "apply_type" : null,
  "id" : null,
  "status" : null,
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
  "approver_id" : null,
  "approver_name" : null,
  "copy_give" : null,
  "copy_give_names" : null,
  "reason" : null,
  "employee_num" : null,
  "dept_name" : null,
  "start_time" : null,
  "end_time" : null,
  "leave_type" : null,
  "departure_city" : null,
  "destination_city" : null,
  "reissue_date" : null,
  "reissue_time" : null,
  "go_out_place" : null,
  "hours" : null,
  "minutes" : null,
  "overtime_type" : null,
  "dept_id" : null,
  "days" : null,
  "applicant_id" : null,
  "applicant_name" : null,
  "apply_type" : null,
  "id" : null,
  "status" : null,
}

```

## 获取考勤申请记录

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_checkin_applications/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|




##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "approver_id" : null,
  "approver_name" : null,
  "copy_give" : null,
  "copy_give_names" : null,
  "reason" : null,
  "employee_num" : null,
  "dept_name" : null,
  "start_time" : null,
  "end_time" : null,
  "leave_type" : null,
  "departure_city" : null,
  "destination_city" : null,
  "reissue_date" : null,
  "reissue_time" : null,
  "go_out_place" : null,
  "hours" : null,
  "minutes" : null,
  "overtime_type" : null,
  "dept_id" : null,
  "days" : null,
  "applicant_id" : null,
  "applicant_name" : null,
  "apply_type" : null,
  "id" : null,
  "status" : null,
}

```

## 删除考勤申请记录

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_checkin_applications/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|





## 更新考勤申请记录

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_checkin_applications/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人ID|
|<el-row justify="space-between"><el-col :span="20">approver_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人|
|<el-row justify="space-between"><el-col :span="20">copy_give</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人|
|<el-row justify="space-between"><el-col :span="20">copy_give_names</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人名称|
|<el-row justify="space-between"><el-col :span="20">reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请说明|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">end_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|假期类型|
|<el-row justify="space-between"><el-col :span="20">departure_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出发城市|
|<el-row justify="space-between"><el-col :span="20">destination_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目的城市|
|<el-row justify="space-between"><el-col :span="20">reissue_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡日期|
|<el-row justify="space-between"><el-col :span="20">reissue_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡时间|
|<el-row justify="space-between"><el-col :span="20">go_out_place</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|外出地|
|<el-row justify="space-between"><el-col :span="20">hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时数|
|<el-row justify="space-between"><el-col :span="20">minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|分钟数|
|<el-row justify="space-between"><el-col :span="20">overtime_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班类型|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|天数|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请人|
|<el-row justify="space-between"><el-col :span="20">applicant_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人姓名|
|<el-row justify="space-between"><el-col :span="20">apply_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "approver_id" : null,
  "approver_name" : null,
  "copy_give" : null,
  "copy_give_names" : null,
  "reason" : null,
  "employee_num" : null,
  "dept_name" : null,
  "start_time" : null,
  "end_time" : null,
  "leave_type" : null,
  "departure_city" : null,
  "destination_city" : null,
  "reissue_date" : null,
  "reissue_time" : null,
  "go_out_place" : null,
  "hours" : null,
  "minutes" : null,
  "overtime_type" : null,
  "dept_id" : null,
  "days" : null,
  "applicant_id" : null,
  "applicant_name" : null,
  "apply_type" : null,
  "id" : null,
  "status" : null,
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
  "approver_id" : null,
  "approver_name" : null,
  "copy_give" : null,
  "copy_give_names" : null,
  "reason" : null,
  "employee_num" : null,
  "dept_name" : null,
  "start_time" : null,
  "end_time" : null,
  "leave_type" : null,
  "departure_city" : null,
  "destination_city" : null,
  "reissue_date" : null,
  "reissue_time" : null,
  "go_out_place" : null,
  "hours" : null,
  "minutes" : null,
  "overtime_type" : null,
  "dept_id" : null,
  "days" : null,
  "applicant_id" : null,
  "applicant_name" : null,
  "apply_type" : null,
  "id" : null,
  "status" : null,
}

```

## 申请作废

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_checkin_applications/{key}/cancellation" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人ID|
|<el-row justify="space-between"><el-col :span="20">approver_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人|
|<el-row justify="space-between"><el-col :span="20">copy_give</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人|
|<el-row justify="space-between"><el-col :span="20">copy_give_names</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人名称|
|<el-row justify="space-between"><el-col :span="20">reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请说明|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">end_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|假期类型|
|<el-row justify="space-between"><el-col :span="20">departure_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出发城市|
|<el-row justify="space-between"><el-col :span="20">destination_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目的城市|
|<el-row justify="space-between"><el-col :span="20">reissue_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡日期|
|<el-row justify="space-between"><el-col :span="20">reissue_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡时间|
|<el-row justify="space-between"><el-col :span="20">go_out_place</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|外出地|
|<el-row justify="space-between"><el-col :span="20">hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时数|
|<el-row justify="space-between"><el-col :span="20">minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|分钟数|
|<el-row justify="space-between"><el-col :span="20">overtime_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班类型|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|天数|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请人|
|<el-row justify="space-between"><el-col :span="20">applicant_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人姓名|
|<el-row justify="space-between"><el-col :span="20">apply_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "approver_id" : null,
  "approver_name" : null,
  "copy_give" : null,
  "copy_give_names" : null,
  "reason" : null,
  "employee_num" : null,
  "dept_name" : null,
  "start_time" : null,
  "end_time" : null,
  "leave_type" : null,
  "departure_city" : null,
  "destination_city" : null,
  "reissue_date" : null,
  "reissue_time" : null,
  "go_out_place" : null,
  "hours" : null,
  "minutes" : null,
  "overtime_type" : null,
  "dept_id" : null,
  "days" : null,
  "applicant_id" : null,
  "applicant_name" : null,
  "apply_type" : null,
  "id" : null,
  "status" : null,
}
```



## 检查考勤申请记录主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_checkin_applications/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人ID|
|<el-row justify="space-between"><el-col :span="20">approver_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人|
|<el-row justify="space-between"><el-col :span="20">copy_give</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人|
|<el-row justify="space-between"><el-col :span="20">copy_give_names</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人名称|
|<el-row justify="space-between"><el-col :span="20">reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请说明|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">end_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|假期类型|
|<el-row justify="space-between"><el-col :span="20">departure_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出发城市|
|<el-row justify="space-between"><el-col :span="20">destination_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目的城市|
|<el-row justify="space-between"><el-col :span="20">reissue_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡日期|
|<el-row justify="space-between"><el-col :span="20">reissue_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡时间|
|<el-row justify="space-between"><el-col :span="20">go_out_place</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|外出地|
|<el-row justify="space-between"><el-col :span="20">hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时数|
|<el-row justify="space-between"><el-col :span="20">minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|分钟数|
|<el-row justify="space-between"><el-col :span="20">overtime_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班类型|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|天数|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请人|
|<el-row justify="space-between"><el-col :span="20">applicant_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人姓名|
|<el-row justify="space-between"><el-col :span="20">apply_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "approver_id" : null,
  "approver_name" : null,
  "copy_give" : null,
  "copy_give_names" : null,
  "reason" : null,
  "employee_num" : null,
  "dept_name" : null,
  "start_time" : null,
  "end_time" : null,
  "leave_type" : null,
  "departure_city" : null,
  "destination_city" : null,
  "reissue_date" : null,
  "reissue_time" : null,
  "go_out_place" : null,
  "hours" : null,
  "minutes" : null,
  "overtime_type" : null,
  "dept_id" : null,
  "days" : null,
  "applicant_id" : null,
  "applicant_name" : null,
  "apply_type" : null,
  "id" : null,
  "status" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取考勤申请记录草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_checkin_applications/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人ID|
|<el-row justify="space-between"><el-col :span="20">approver_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人|
|<el-row justify="space-between"><el-col :span="20">copy_give</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人|
|<el-row justify="space-between"><el-col :span="20">copy_give_names</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人名称|
|<el-row justify="space-between"><el-col :span="20">reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请说明|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">end_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|假期类型|
|<el-row justify="space-between"><el-col :span="20">departure_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出发城市|
|<el-row justify="space-between"><el-col :span="20">destination_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目的城市|
|<el-row justify="space-between"><el-col :span="20">reissue_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡日期|
|<el-row justify="space-between"><el-col :span="20">reissue_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡时间|
|<el-row justify="space-between"><el-col :span="20">go_out_place</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|外出地|
|<el-row justify="space-between"><el-col :span="20">hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时数|
|<el-row justify="space-between"><el-col :span="20">minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|分钟数|
|<el-row justify="space-between"><el-col :span="20">overtime_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班类型|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|天数|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请人|
|<el-row justify="space-between"><el-col :span="20">applicant_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人姓名|
|<el-row justify="space-between"><el-col :span="20">apply_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "approver_id" : null,
  "approver_name" : null,
  "copy_give" : null,
  "copy_give_names" : null,
  "reason" : null,
  "employee_num" : null,
  "dept_name" : null,
  "start_time" : null,
  "end_time" : null,
  "leave_type" : null,
  "departure_city" : null,
  "destination_city" : null,
  "reissue_date" : null,
  "reissue_time" : null,
  "go_out_place" : null,
  "hours" : null,
  "minutes" : null,
  "overtime_type" : null,
  "dept_id" : null,
  "days" : null,
  "applicant_id" : null,
  "applicant_name" : null,
  "apply_type" : null,
  "id" : null,
  "status" : null,
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
  "approver_id" : null,
  "approver_name" : null,
  "copy_give" : null,
  "copy_give_names" : null,
  "reason" : null,
  "employee_num" : null,
  "dept_name" : null,
  "start_time" : null,
  "end_time" : null,
  "leave_type" : null,
  "departure_city" : null,
  "destination_city" : null,
  "reissue_date" : null,
  "reissue_time" : null,
  "go_out_place" : null,
  "hours" : null,
  "minutes" : null,
  "overtime_type" : null,
  "dept_id" : null,
  "days" : null,
  "applicant_id" : null,
  "applicant_name" : null,
  "apply_type" : null,
  "id" : null,
  "status" : null,
}

```

## 保存考勤申请记录

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_checkin_applications/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">approver_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人ID|
|<el-row justify="space-between"><el-col :span="20">approver_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批人|
|<el-row justify="space-between"><el-col :span="20">copy_give</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人|
|<el-row justify="space-between"><el-col :span="20">copy_give_names</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送人名称|
|<el-row justify="space-between"><el-col :span="20">reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请说明|
|<el-row justify="space-between"><el-col :span="20">employee_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">end_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">leave_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|假期类型|
|<el-row justify="space-between"><el-col :span="20">departure_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出发城市|
|<el-row justify="space-between"><el-col :span="20">destination_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目的城市|
|<el-row justify="space-between"><el-col :span="20">reissue_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡日期|
|<el-row justify="space-between"><el-col :span="20">reissue_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|补卡时间|
|<el-row justify="space-between"><el-col :span="20">go_out_place</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|外出地|
|<el-row justify="space-between"><el-col :span="20">hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时数|
|<el-row justify="space-between"><el-col :span="20">minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|分钟数|
|<el-row justify="space-between"><el-col :span="20">overtime_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班类型|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|天数|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请人|
|<el-row justify="space-between"><el-col :span="20">applicant_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人姓名|
|<el-row justify="space-between"><el-col :span="20">apply_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请类型|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "approver_id" : null,
  "approver_name" : null,
  "copy_give" : null,
  "copy_give_names" : null,
  "reason" : null,
  "employee_num" : null,
  "dept_name" : null,
  "start_time" : null,
  "end_time" : null,
  "leave_type" : null,
  "departure_city" : null,
  "destination_city" : null,
  "reissue_date" : null,
  "reissue_time" : null,
  "go_out_place" : null,
  "hours" : null,
  "minutes" : null,
  "overtime_type" : null,
  "dept_id" : null,
  "days" : null,
  "applicant_id" : null,
  "applicant_name" : null,
  "apply_type" : null,
  "id" : null,
  "status" : null,
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
  "approver_id" : null,
  "approver_name" : null,
  "copy_give" : null,
  "copy_give_names" : null,
  "reason" : null,
  "employee_num" : null,
  "dept_name" : null,
  "start_time" : null,
  "end_time" : null,
  "leave_type" : null,
  "departure_city" : null,
  "destination_city" : null,
  "reissue_date" : null,
  "reissue_time" : null,
  "go_out_place" : null,
  "hours" : null,
  "minutes" : null,
  "overtime_type" : null,
  "dept_id" : null,
  "days" : null,
  "applicant_id" : null,
  "applicant_name" : null,
  "apply_type" : null,
  "id" : null,
  "status" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_checkin_applications/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人|
|<el-row justify="space-between"><el-col :span="20">n_applicant_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人姓名|
|<el-row justify="space-between"><el-col :span="20">n_applicant_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人姓名|
|<el-row justify="space-between"><el-col :span="20">n_apply_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请类型|
|<el-row justify="space-between"><el-col :span="20">n_apply_type_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_leave_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|假期类型|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_applicant_id_eq" : null,
  "n_applicant_name_eq" : null,
  "n_applicant_name_like" : null,
  "n_apply_type_eq" : null,
  "n_apply_type_like" : null,
  "n_id_eq" : null,
  "n_leave_type_eq" : null,
  "n_name_like" : null,
  "n_status_eq" : null,
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
    "approver_id" : null,
    "approver_name" : null,
    "copy_give" : null,
    "copy_give_names" : null,
    "reason" : null,
    "employee_num" : null,
    "dept_name" : null,
    "start_time" : null,
    "end_time" : null,
    "leave_type" : null,
    "departure_city" : null,
    "destination_city" : null,
    "reissue_date" : null,
    "reissue_time" : null,
    "go_out_place" : null,
    "hours" : null,
    "minutes" : null,
    "overtime_type" : null,
    "dept_id" : null,
    "days" : null,
    "applicant_id" : null,
    "applicant_name" : null,
    "apply_type" : null,
    "id" : null,
    "status" : null,
  }
]
```

## 正常

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_checkin_applications/fetch_normal" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人|
|<el-row justify="space-between"><el-col :span="20">n_applicant_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人姓名|
|<el-row justify="space-between"><el-col :span="20">n_applicant_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人姓名|
|<el-row justify="space-between"><el-col :span="20">n_apply_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请类型|
|<el-row justify="space-between"><el-col :span="20">n_apply_type_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_leave_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|假期类型|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_applicant_id_eq" : null,
  "n_applicant_name_eq" : null,
  "n_applicant_name_like" : null,
  "n_apply_type_eq" : null,
  "n_apply_type_like" : null,
  "n_id_eq" : null,
  "n_leave_type_eq" : null,
  "n_name_like" : null,
  "n_status_eq" : null,
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
    "approver_id" : null,
    "approver_name" : null,
    "copy_give" : null,
    "copy_give_names" : null,
    "reason" : null,
    "employee_num" : null,
    "dept_name" : null,
    "start_time" : null,
    "end_time" : null,
    "leave_type" : null,
    "departure_city" : null,
    "destination_city" : null,
    "reissue_date" : null,
    "reissue_time" : null,
    "go_out_place" : null,
    "hours" : null,
    "minutes" : null,
    "overtime_type" : null,
    "dept_id" : null,
    "days" : null,
    "applicant_id" : null,
    "applicant_name" : null,
    "apply_type" : null,
    "id" : null,
    "status" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_checkin_applications/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_checkin_applications/exportdata/{param},/attendance_checkin_applications/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_checkin_applications/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_checkin_applications/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_checkin_applications/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_checkin_applications/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_checkin_applications/report" type="info" :closable="false" ></el-alert>
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