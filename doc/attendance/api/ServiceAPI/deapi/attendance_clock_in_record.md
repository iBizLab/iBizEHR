# 打卡记录(attendance_clock_in_record) :id=attendance_clock_in_record
## 创建打卡记录

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工名称|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">checkin_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡图片|
|<el-row justify="space-between"><el-col :span="20">checkin_remark</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡备注|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|打卡时间|
|<el-row justify="space-between"><el-col :span="20">checkin_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">clock_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">cmd</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作指令|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">device_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班时长|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">should_checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|应打卡时间|
|<el-row justify="space-between"><el-col :span="20">source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|数据来源|
|<el-row justify="space-between"><el-col :span="20">terminal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
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
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
}

```

## 获取打卡记录

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|记录ID|




##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
}

```

## 删除打卡记录

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|记录ID|





## 更新打卡记录

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|记录ID|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工名称|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">checkin_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡图片|
|<el-row justify="space-between"><el-col :span="20">checkin_remark</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡备注|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|打卡时间|
|<el-row justify="space-between"><el-col :span="20">checkin_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">clock_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">cmd</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作指令|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">device_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班时长|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">should_checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|应打卡时间|
|<el-row justify="space-between"><el-col :span="20">source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|数据来源|
|<el-row justify="space-between"><el-col :span="20">terminal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
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
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
}

```

## 考勤计算

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/attendance_calculate" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工名称|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">checkin_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡图片|
|<el-row justify="space-between"><el-col :span="20">checkin_remark</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡备注|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|打卡时间|
|<el-row justify="space-between"><el-col :span="20">checkin_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">clock_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">cmd</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作指令|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">device_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班时长|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">should_checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|应打卡时间|
|<el-row justify="space-between"><el-col :span="20">source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|数据来源|
|<el-row justify="space-between"><el-col :span="20">terminal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
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
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
}

```

## 批量补卡

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/batch_reissue" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工名称|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">checkin_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡图片|
|<el-row justify="space-between"><el-col :span="20">checkin_remark</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡备注|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|打卡时间|
|<el-row justify="space-between"><el-col :span="20">checkin_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">clock_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">cmd</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作指令|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">device_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班时长|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">should_checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|应打卡时间|
|<el-row justify="space-between"><el-col :span="20">source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|数据来源|
|<el-row justify="space-between"><el-col :span="20">terminal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
}
```



## 检查打卡记录主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工名称|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">checkin_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡图片|
|<el-row justify="space-between"><el-col :span="20">checkin_remark</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡备注|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|打卡时间|
|<el-row justify="space-between"><el-col :span="20">checkin_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">clock_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">cmd</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作指令|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">device_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班时长|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">should_checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|应打卡时间|
|<el-row justify="space-between"><el-col :span="20">source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|数据来源|
|<el-row justify="space-between"><el-col :span="20">terminal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取打卡记录草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工名称|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">checkin_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡图片|
|<el-row justify="space-between"><el-col :span="20">checkin_remark</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡备注|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|打卡时间|
|<el-row justify="space-between"><el-col :span="20">checkin_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">clock_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">cmd</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作指令|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">device_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班时长|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">should_checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|应打卡时间|
|<el-row justify="space-between"><el-col :span="20">source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|数据来源|
|<el-row justify="space-between"><el-col :span="20">terminal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
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
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
}

```

## 无操作

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/nothing" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工名称|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">checkin_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡图片|
|<el-row justify="space-between"><el-col :span="20">checkin_remark</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡备注|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|打卡时间|
|<el-row justify="space-between"><el-col :span="20">checkin_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">clock_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">cmd</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作指令|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">device_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班时长|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">should_checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|应打卡时间|
|<el-row justify="space-between"><el-col :span="20">source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|数据来源|
|<el-row justify="space-between"><el-col :span="20">terminal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
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
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
}

```

## 保存打卡记录

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">member_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工名称|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门ID|
|<el-row justify="space-between"><el-col :span="20">dept_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">member_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">checkin_image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡图片|
|<el-row justify="space-between"><el-col :span="20">checkin_remark</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡备注|
|<el-row justify="space-between"><el-col :span="20">checkin_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|打卡时间|
|<el-row justify="space-between"><el-col :span="20">checkin_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">clock_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">cmd</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作指令|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|考勤日期|
|<el-row justify="space-between"><el-col :span="20">device_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|上班时长|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">member_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">should_checkin_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|应打卡时间|
|<el-row justify="space-between"><el-col :span="20">source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|数据来源|
|<el-row justify="space-between"><el-col :span="20">terminal_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
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
  "member_name" : null,
  "dept_id" : null,
  "dept_name" : null,
  "member_num" : null,
  "checkin_image" : null,
  "checkin_remark" : null,
  "checkin_result" : null,
  "checkin_time" : null,
  "checkin_type" : null,
  "clock_type" : null,
  "cmd" : null,
  "date" : null,
  "device_name" : null,
  "duration_hours" : null,
  "id" : null,
  "member_id" : null,
  "should_checkin_time" : null,
  "source" : null,
  "terminal_id" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">n_checkin_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">n_clock_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">n_device_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">n_device_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">n_member_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_terminal_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_checkin_result_eq" : null,
  "n_checkin_type_eq" : null,
  "n_clock_type_eq" : null,
  "n_device_name_eq" : null,
  "n_device_name_like" : null,
  "n_id_eq" : null,
  "n_member_id_eq" : null,
  "n_name_like" : null,
  "n_terminal_id_eq" : null,
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
    "member_name" : null,
    "dept_id" : null,
    "dept_name" : null,
    "member_num" : null,
    "checkin_image" : null,
    "checkin_remark" : null,
    "checkin_result" : null,
    "checkin_time" : null,
    "checkin_type" : null,
    "clock_type" : null,
    "cmd" : null,
    "date" : null,
    "device_name" : null,
    "duration_hours" : null,
    "id" : null,
    "member_id" : null,
    "should_checkin_time" : null,
    "source" : null,
    "terminal_id" : null,
  }
]
```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/fetch_my_clock_in_record" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">n_checkin_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">n_clock_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">n_device_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">n_device_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">n_member_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_terminal_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_checkin_result_eq" : null,
  "n_checkin_type_eq" : null,
  "n_clock_type_eq" : null,
  "n_device_name_eq" : null,
  "n_device_name_like" : null,
  "n_id_eq" : null,
  "n_member_id_eq" : null,
  "n_name_like" : null,
  "n_terminal_id_eq" : null,
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
    "member_name" : null,
    "dept_id" : null,
    "dept_name" : null,
    "member_num" : null,
    "checkin_image" : null,
    "checkin_remark" : null,
    "checkin_result" : null,
    "checkin_time" : null,
    "checkin_type" : null,
    "clock_type" : null,
    "cmd" : null,
    "date" : null,
    "device_name" : null,
    "duration_hours" : null,
    "id" : null,
    "member_id" : null,
    "should_checkin_time" : null,
    "source" : null,
    "terminal_id" : null,
  }
]
```

## 打卡记录

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/fetch_record" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">n_checkin_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">n_clock_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">n_device_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">n_device_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">n_member_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_terminal_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_checkin_result_eq" : null,
  "n_checkin_type_eq" : null,
  "n_clock_type_eq" : null,
  "n_device_name_eq" : null,
  "n_device_name_like" : null,
  "n_id_eq" : null,
  "n_member_id_eq" : null,
  "n_name_like" : null,
  "n_terminal_id_eq" : null,
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
    "member_name" : null,
    "dept_id" : null,
    "dept_name" : null,
    "member_num" : null,
    "checkin_image" : null,
    "checkin_remark" : null,
    "checkin_result" : null,
    "checkin_time" : null,
    "checkin_type" : null,
    "clock_type" : null,
    "cmd" : null,
    "date" : null,
    "device_name" : null,
    "duration_hours" : null,
    "id" : null,
    "member_id" : null,
    "should_checkin_time" : null,
    "source" : null,
    "terminal_id" : null,
  }
]
```

## 列表视图

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/fetch_record_list" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_checkin_result_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡结果|
|<el-row justify="space-between"><el-col :span="20">n_checkin_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡方式|
|<el-row justify="space-between"><el-col :span="20">n_clock_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|打卡类型|
|<el-row justify="space-between"><el-col :span="20">n_device_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">n_device_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设备名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|记录ID|
|<el-row justify="space-between"><el-col :span="20">n_member_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工ID|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_terminal_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|终端设备ID|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_checkin_result_eq" : null,
  "n_checkin_type_eq" : null,
  "n_clock_type_eq" : null,
  "n_device_name_eq" : null,
  "n_device_name_like" : null,
  "n_id_eq" : null,
  "n_member_id_eq" : null,
  "n_name_like" : null,
  "n_terminal_id_eq" : null,
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
    "member_name" : null,
    "dept_id" : null,
    "dept_name" : null,
    "member_num" : null,
    "checkin_image" : null,
    "checkin_remark" : null,
    "checkin_result" : null,
    "checkin_time" : null,
    "checkin_type" : null,
    "clock_type" : null,
    "cmd" : null,
    "date" : null,
    "device_name" : null,
    "duration_hours" : null,
    "id" : null,
    "member_id" : null,
    "should_checkin_time" : null,
    "source" : null,
    "terminal_id" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_clock_in_records/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_clock_in_records/exportdata/{param},/attendance_clock_in_records/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_clock_in_records/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_clock_in_records/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_clock_in_records/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_clock_in_records/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_clock_in_records/report" type="info" :closable="false" ></el-alert>
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