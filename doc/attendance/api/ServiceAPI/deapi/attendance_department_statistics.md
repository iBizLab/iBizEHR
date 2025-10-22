# 部门统计(attendance_department_statistics) :id=attendance_department_statistics
## 创建部门统计

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_department_statistics" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">should_attendance_people_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤人数|
|<el-row justify="space-between"><el-col :span="20">normal_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|正常出勤次数|
|<el-row justify="space-between"><el-col :span="20">leave_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|请假次数|
|<el-row justify="space-between"><el-col :span="20">go_out_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出次数|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(小时)|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退次数|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤次数|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "should_attendance_people_num" : null,
  "normal_attendance_days" : null,
  "leave_times" : null,
  "go_out_times" : null,
  "overtime_hours" : null,
  "checkin_date" : null,
  "dept_id" : null,
  "checkin_missing_times" : null,
  "dept_name" : null,
  "late_times" : null,
  "leave_early_times" : null,
  "out_work_times" : null,
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
  "should_attendance_people_num" : null,
  "normal_attendance_days" : null,
  "leave_times" : null,
  "go_out_times" : null,
  "overtime_hours" : null,
  "checkin_date" : null,
  "dept_id" : null,
  "checkin_missing_times" : null,
  "dept_name" : null,
  "late_times" : null,
  "leave_early_times" : null,
  "out_work_times" : null,
}

```

## 获取部门统计

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_department_statistics/{key}" type="info" :closable="false" ></el-alert>
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
  "should_attendance_people_num" : null,
  "normal_attendance_days" : null,
  "leave_times" : null,
  "go_out_times" : null,
  "overtime_hours" : null,
  "checkin_date" : null,
  "dept_id" : null,
  "checkin_missing_times" : null,
  "dept_name" : null,
  "late_times" : null,
  "leave_early_times" : null,
  "out_work_times" : null,
}

```

## 删除部门统计

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_department_statistics/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新部门统计

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_department_statistics/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">should_attendance_people_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤人数|
|<el-row justify="space-between"><el-col :span="20">normal_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|正常出勤次数|
|<el-row justify="space-between"><el-col :span="20">leave_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|请假次数|
|<el-row justify="space-between"><el-col :span="20">go_out_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出次数|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(小时)|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退次数|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤次数|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "should_attendance_people_num" : null,
  "normal_attendance_days" : null,
  "leave_times" : null,
  "go_out_times" : null,
  "overtime_hours" : null,
  "checkin_date" : null,
  "dept_id" : null,
  "checkin_missing_times" : null,
  "dept_name" : null,
  "late_times" : null,
  "leave_early_times" : null,
  "out_work_times" : null,
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
  "should_attendance_people_num" : null,
  "normal_attendance_days" : null,
  "leave_times" : null,
  "go_out_times" : null,
  "overtime_hours" : null,
  "checkin_date" : null,
  "dept_id" : null,
  "checkin_missing_times" : null,
  "dept_name" : null,
  "late_times" : null,
  "leave_early_times" : null,
  "out_work_times" : null,
}

```

## 检查部门统计主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_department_statistics/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">should_attendance_people_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤人数|
|<el-row justify="space-between"><el-col :span="20">normal_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|正常出勤次数|
|<el-row justify="space-between"><el-col :span="20">leave_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|请假次数|
|<el-row justify="space-between"><el-col :span="20">go_out_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出次数|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(小时)|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退次数|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤次数|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "should_attendance_people_num" : null,
  "normal_attendance_days" : null,
  "leave_times" : null,
  "go_out_times" : null,
  "overtime_hours" : null,
  "checkin_date" : null,
  "dept_id" : null,
  "checkin_missing_times" : null,
  "dept_name" : null,
  "late_times" : null,
  "leave_early_times" : null,
  "out_work_times" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取部门统计草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_department_statistics/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">should_attendance_people_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤人数|
|<el-row justify="space-between"><el-col :span="20">normal_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|正常出勤次数|
|<el-row justify="space-between"><el-col :span="20">leave_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|请假次数|
|<el-row justify="space-between"><el-col :span="20">go_out_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出次数|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(小时)|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退次数|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤次数|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "should_attendance_people_num" : null,
  "normal_attendance_days" : null,
  "leave_times" : null,
  "go_out_times" : null,
  "overtime_hours" : null,
  "checkin_date" : null,
  "dept_id" : null,
  "checkin_missing_times" : null,
  "dept_name" : null,
  "late_times" : null,
  "leave_early_times" : null,
  "out_work_times" : null,
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
  "should_attendance_people_num" : null,
  "normal_attendance_days" : null,
  "leave_times" : null,
  "go_out_times" : null,
  "overtime_hours" : null,
  "checkin_date" : null,
  "dept_id" : null,
  "checkin_missing_times" : null,
  "dept_name" : null,
  "late_times" : null,
  "leave_early_times" : null,
  "out_work_times" : null,
}

```

## 保存部门统计

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_department_statistics/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">should_attendance_people_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|应出勤人数|
|<el-row justify="space-between"><el-col :span="20">normal_attendance_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|正常出勤次数|
|<el-row justify="space-between"><el-col :span="20">leave_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|请假次数|
|<el-row justify="space-between"><el-col :span="20">go_out_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|外出次数|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时长(小时)|
|<el-row justify="space-between"><el-col :span="20">checkin_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">checkin_missing_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|缺卡次数|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">late_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|迟到次数|
|<el-row justify="space-between"><el-col :span="20">leave_early_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|早退次数|
|<el-row justify="space-between"><el-col :span="20">out_work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|外勤次数|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "should_attendance_people_num" : null,
  "normal_attendance_days" : null,
  "leave_times" : null,
  "go_out_times" : null,
  "overtime_hours" : null,
  "checkin_date" : null,
  "dept_id" : null,
  "checkin_missing_times" : null,
  "dept_name" : null,
  "late_times" : null,
  "leave_early_times" : null,
  "out_work_times" : null,
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
  "should_attendance_people_num" : null,
  "normal_attendance_days" : null,
  "leave_times" : null,
  "go_out_times" : null,
  "overtime_hours" : null,
  "checkin_date" : null,
  "dept_id" : null,
  "checkin_missing_times" : null,
  "dept_name" : null,
  "late_times" : null,
  "leave_early_times" : null,
  "out_work_times" : null,
}

```

## 部门统计

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_department_statistics/fetch_attendance_department_statistics" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_id_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_checkin_date_gtandeq" : null,
  "n_checkin_date_ltandeq" : null,
  "n_id_eq" : null,
  "n_id_in" : null,
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
    "should_attendance_people_num" : null,
    "normal_attendance_days" : null,
    "leave_times" : null,
    "go_out_times" : null,
    "overtime_hours" : null,
    "checkin_date" : null,
    "dept_id" : null,
    "checkin_missing_times" : null,
    "dept_name" : null,
    "late_times" : null,
    "leave_early_times" : null,
    "out_work_times" : null,
  }
]
```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_department_statistics/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_checkin_date_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_id_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_checkin_date_gtandeq" : null,
  "n_checkin_date_ltandeq" : null,
  "n_id_eq" : null,
  "n_id_in" : null,
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
    "should_attendance_people_num" : null,
    "normal_attendance_days" : null,
    "leave_times" : null,
    "go_out_times" : null,
    "overtime_hours" : null,
    "checkin_date" : null,
    "dept_id" : null,
    "checkin_missing_times" : null,
    "dept_name" : null,
    "late_times" : null,
    "leave_early_times" : null,
    "out_work_times" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_department_statistics/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_department_statistics/exportdata/{param},/attendance_department_statistics/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_department_statistics/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_department_statistics/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_department_statistics/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_department_statistics/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_department_statistics/report" type="info" :closable="false" ></el-alert>
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