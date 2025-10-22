# 出勤(hr_attendance) :id=hr_attendance
## 创建出勤

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">modified</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变更标记|
|<el-row justify="space-between"><el-col :span="20">check_in</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|签到|
|<el-row justify="space-between"><el-col :span="20">check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签离|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">employee_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">expected_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预期工时|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">in_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|浏览器|
|<el-row justify="space-between"><el-col :span="20">in_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">in_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家|
|<el-row justify="space-between"><el-col :span="20">in_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IP地址|
|<el-row justify="space-between"><el-col :span="20">in_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">in_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|经度|
|<el-row justify="space-between"><el-col :span="20">in_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模式|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息传递错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无有效加班时间|
|<el-row justify="space-between"><el-col :span="20">out_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退出浏览器|
|<el-row justify="space-between"><el-col :span="20">out_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出城|
|<el-row justify="space-between"><el-col :span="20">out_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家名称|
|<el-row justify="space-between"><el-col :span="20">out_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出口IP 地址|
|<el-row justify="space-between"><el-col :span="20">out_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">out_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出经度|
|<el-row justify="space-between"><el-col :span="20">out_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|输出模式|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|随着时间的推移|
|<el-row justify="space-between"><el-col :span="20">overtime_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班状态|
|<el-row justify="space-between"><el-col :span="20">validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时数|



##### 请求示例： {docsify-ignore}
```json
{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取出勤

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/{key}" type="info" :closable="false" ></el-alert>
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
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除出勤

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新出勤

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">modified</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变更标记|
|<el-row justify="space-between"><el-col :span="20">check_in</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|签到|
|<el-row justify="space-between"><el-col :span="20">check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签离|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">employee_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">expected_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预期工时|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">in_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|浏览器|
|<el-row justify="space-between"><el-col :span="20">in_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">in_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家|
|<el-row justify="space-between"><el-col :span="20">in_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IP地址|
|<el-row justify="space-between"><el-col :span="20">in_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">in_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|经度|
|<el-row justify="space-between"><el-col :span="20">in_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模式|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息传递错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无有效加班时间|
|<el-row justify="space-between"><el-col :span="20">out_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退出浏览器|
|<el-row justify="space-between"><el-col :span="20">out_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出城|
|<el-row justify="space-between"><el-col :span="20">out_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家名称|
|<el-row justify="space-between"><el-col :span="20">out_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出口IP 地址|
|<el-row justify="space-between"><el-col :span="20">out_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">out_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出经度|
|<el-row justify="space-between"><el-col :span="20">out_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|输出模式|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|随着时间的推移|
|<el-row justify="space-between"><el-col :span="20">overtime_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班状态|
|<el-row justify="space-between"><el-col :span="20">validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时数|



##### 请求示例： {docsify-ignore}
```json
{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 批量审批

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/batch_approval" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">modified</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变更标记|
|<el-row justify="space-between"><el-col :span="20">check_in</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|签到|
|<el-row justify="space-between"><el-col :span="20">check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签离|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">employee_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">expected_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预期工时|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">in_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|浏览器|
|<el-row justify="space-between"><el-col :span="20">in_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">in_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家|
|<el-row justify="space-between"><el-col :span="20">in_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IP地址|
|<el-row justify="space-between"><el-col :span="20">in_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">in_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|经度|
|<el-row justify="space-between"><el-col :span="20">in_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模式|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息传递错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无有效加班时间|
|<el-row justify="space-between"><el-col :span="20">out_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退出浏览器|
|<el-row justify="space-between"><el-col :span="20">out_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出城|
|<el-row justify="space-between"><el-col :span="20">out_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家名称|
|<el-row justify="space-between"><el-col :span="20">out_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出口IP 地址|
|<el-row justify="space-between"><el-col :span="20">out_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">out_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出经度|
|<el-row justify="space-between"><el-col :span="20">out_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|输出模式|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|随着时间的推移|
|<el-row justify="space-between"><el-col :span="20">overtime_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班状态|
|<el-row justify="space-between"><el-col :span="20">validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时数|



##### 请求示例： {docsify-ignore}
```json
{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 检查出勤主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">modified</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变更标记|
|<el-row justify="space-between"><el-col :span="20">check_in</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|签到|
|<el-row justify="space-between"><el-col :span="20">check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签离|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">employee_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">expected_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预期工时|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">in_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|浏览器|
|<el-row justify="space-between"><el-col :span="20">in_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">in_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家|
|<el-row justify="space-between"><el-col :span="20">in_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IP地址|
|<el-row justify="space-between"><el-col :span="20">in_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">in_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|经度|
|<el-row justify="space-between"><el-col :span="20">in_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模式|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息传递错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无有效加班时间|
|<el-row justify="space-between"><el-col :span="20">out_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退出浏览器|
|<el-row justify="space-between"><el-col :span="20">out_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出城|
|<el-row justify="space-between"><el-col :span="20">out_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家名称|
|<el-row justify="space-between"><el-col :span="20">out_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出口IP 地址|
|<el-row justify="space-between"><el-col :span="20">out_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">out_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出经度|
|<el-row justify="space-between"><el-col :span="20">out_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|输出模式|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|随着时间的推移|
|<el-row justify="space-between"><el-col :span="20">overtime_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班状态|
|<el-row justify="space-between"><el-col :span="20">validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时数|



##### 请求示例： {docsify-ignore}
```json
{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 计算工作时间、加班时间

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/compute_work_hour" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`
计算工作时间、加班时间



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">modified</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变更标记|
|<el-row justify="space-between"><el-col :span="20">check_in</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|签到|
|<el-row justify="space-between"><el-col :span="20">check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签离|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">employee_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">expected_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预期工时|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">in_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|浏览器|
|<el-row justify="space-between"><el-col :span="20">in_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">in_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家|
|<el-row justify="space-between"><el-col :span="20">in_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IP地址|
|<el-row justify="space-between"><el-col :span="20">in_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">in_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|经度|
|<el-row justify="space-between"><el-col :span="20">in_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模式|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息传递错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无有效加班时间|
|<el-row justify="space-between"><el-col :span="20">out_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退出浏览器|
|<el-row justify="space-between"><el-col :span="20">out_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出城|
|<el-row justify="space-between"><el-col :span="20">out_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家名称|
|<el-row justify="space-between"><el-col :span="20">out_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出口IP 地址|
|<el-row justify="space-between"><el-col :span="20">out_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">out_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出经度|
|<el-row justify="space-between"><el-col :span="20">out_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|输出模式|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|随着时间的推移|
|<el-row justify="space-between"><el-col :span="20">overtime_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班状态|
|<el-row justify="space-between"><el-col :span="20">validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时数|



##### 请求示例： {docsify-ignore}
```json
{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取出勤草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">modified</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变更标记|
|<el-row justify="space-between"><el-col :span="20">check_in</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|签到|
|<el-row justify="space-between"><el-col :span="20">check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签离|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">employee_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">expected_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预期工时|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">in_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|浏览器|
|<el-row justify="space-between"><el-col :span="20">in_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">in_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家|
|<el-row justify="space-between"><el-col :span="20">in_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IP地址|
|<el-row justify="space-between"><el-col :span="20">in_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">in_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|经度|
|<el-row justify="space-between"><el-col :span="20">in_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模式|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息传递错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无有效加班时间|
|<el-row justify="space-between"><el-col :span="20">out_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退出浏览器|
|<el-row justify="space-between"><el-col :span="20">out_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出城|
|<el-row justify="space-between"><el-col :span="20">out_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家名称|
|<el-row justify="space-between"><el-col :span="20">out_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出口IP 地址|
|<el-row justify="space-between"><el-col :span="20">out_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">out_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出经度|
|<el-row justify="space-between"><el-col :span="20">out_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|输出模式|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|随着时间的推移|
|<el-row justify="space-between"><el-col :span="20">overtime_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班状态|
|<el-row justify="space-between"><el-col :span="20">validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时数|



##### 请求示例： {docsify-ignore}
```json
{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 自助终端考勤

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/kiosk_checkin" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">modified</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变更标记|
|<el-row justify="space-between"><el-col :span="20">check_in</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|签到|
|<el-row justify="space-between"><el-col :span="20">check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签离|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">employee_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">expected_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预期工时|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">in_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|浏览器|
|<el-row justify="space-between"><el-col :span="20">in_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">in_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家|
|<el-row justify="space-between"><el-col :span="20">in_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IP地址|
|<el-row justify="space-between"><el-col :span="20">in_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">in_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|经度|
|<el-row justify="space-between"><el-col :span="20">in_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模式|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息传递错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无有效加班时间|
|<el-row justify="space-between"><el-col :span="20">out_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退出浏览器|
|<el-row justify="space-between"><el-col :span="20">out_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出城|
|<el-row justify="space-between"><el-col :span="20">out_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家名称|
|<el-row justify="space-between"><el-col :span="20">out_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出口IP 地址|
|<el-row justify="space-between"><el-col :span="20">out_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">out_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出经度|
|<el-row justify="space-between"><el-col :span="20">out_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|输出模式|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|随着时间的推移|
|<el-row justify="space-between"><el-col :span="20">overtime_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班状态|
|<el-row justify="space-between"><el-col :span="20">validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时数|



##### 请求示例： {docsify-ignore}
```json
{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 保存出勤

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">modified</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|变更标记|
|<el-row justify="space-between"><el-col :span="20">check_in</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|签到|
|<el-row justify="space-between"><el-col :span="20">check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签离|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">employee_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">employee_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">expected_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预期工时|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">in_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|浏览器|
|<el-row justify="space-between"><el-col :span="20">in_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">in_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家|
|<el-row justify="space-between"><el-col :span="20">in_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IP地址|
|<el-row justify="space-between"><el-col :span="20">in_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">in_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|经度|
|<el-row justify="space-between"><el-col :span="20">in_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模式|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息传递错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">no_validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无有效加班时间|
|<el-row justify="space-between"><el-col :span="20">out_browser</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退出浏览器|
|<el-row justify="space-between"><el-col :span="20">out_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出城|
|<el-row justify="space-between"><el-col :span="20">out_country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家名称|
|<el-row justify="space-between"><el-col :span="20">out_ip_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出口IP 地址|
|<el-row justify="space-between"><el-col :span="20">out_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|纬度|
|<el-row justify="space-between"><el-col :span="20">out_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|出经度|
|<el-row justify="space-between"><el-col :span="20">out_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|输出模式|
|<el-row justify="space-between"><el-col :span="20">overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|随着时间的推移|
|<el-row justify="space-between"><el-col :span="20">overtime_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班状态|
|<el-row justify="space-between"><el-col :span="20">validated_overtime_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班时间|
|<el-row justify="space-between"><el-col :span="20">worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|工作时数|



##### 请求示例： {docsify-ignore}
```json
{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "followers" : null,
  "attachments" : null,
  "modified" : null,
  "check_in" : null,
  "check_out" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "employee_id" : null,
  "employee_name" : null,
  "expected_hours" : null,
  "has_message" : null,
  "id" : null,
  "in_browser" : null,
  "in_city" : null,
  "in_country_name" : null,
  "in_ip_address" : null,
  "in_latitude" : null,
  "in_longitude" : null,
  "in_mode" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "name" : null,
  "no_validated_overtime_hours" : null,
  "out_browser" : null,
  "out_city" : null,
  "out_country_name" : null,
  "out_ip_address" : null,
  "out_latitude" : null,
  "out_longitude" : null,
  "out_mode" : null,
  "overtime_hours" : null,
  "overtime_status" : null,
  "validated_overtime_hours" : null,
  "worked_hours" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_employee_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">n_employee_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">n_employee_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_in_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模式|
|<el-row justify="space-between"><el-col :span="20">n_out_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|输出模式|
|<el-row justify="space-between"><el-col :span="20">n_overtime_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_employee_id_eq" : null,
  "n_employee_name_eq" : null,
  "n_employee_name_like" : null,
  "n_id_eq" : null,
  "n_in_mode_eq" : null,
  "n_out_mode_eq" : null,
  "n_overtime_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "followers" : null,
    "attachments" : null,
    "modified" : null,
    "check_in" : null,
    "check_out" : null,
    "color" : null,
    "create_date" : null,
    "create_uid" : null,
    "display_name" : null,
    "employee_id" : null,
    "employee_name" : null,
    "expected_hours" : null,
    "has_message" : null,
    "id" : null,
    "in_browser" : null,
    "in_city" : null,
    "in_country_name" : null,
    "in_ip_address" : null,
    "in_latitude" : null,
    "in_longitude" : null,
    "in_mode" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "name" : null,
    "no_validated_overtime_hours" : null,
    "out_browser" : null,
    "out_city" : null,
    "out_country_name" : null,
    "out_ip_address" : null,
    "out_latitude" : null,
    "out_longitude" : null,
    "out_mode" : null,
    "overtime_hours" : null,
    "overtime_status" : null,
    "validated_overtime_hours" : null,
    "worked_hours" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## manage

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/fetch_manage" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_employee_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">n_employee_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">n_employee_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_in_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模式|
|<el-row justify="space-between"><el-col :span="20">n_out_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|输出模式|
|<el-row justify="space-between"><el-col :span="20">n_overtime_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|加班状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_employee_id_eq" : null,
  "n_employee_name_eq" : null,
  "n_employee_name_like" : null,
  "n_id_eq" : null,
  "n_in_mode_eq" : null,
  "n_out_mode_eq" : null,
  "n_overtime_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "followers" : null,
    "attachments" : null,
    "modified" : null,
    "check_in" : null,
    "check_out" : null,
    "color" : null,
    "create_date" : null,
    "create_uid" : null,
    "display_name" : null,
    "employee_id" : null,
    "employee_name" : null,
    "expected_hours" : null,
    "has_message" : null,
    "id" : null,
    "in_browser" : null,
    "in_city" : null,
    "in_country_name" : null,
    "in_ip_address" : null,
    "in_latitude" : null,
    "in_longitude" : null,
    "in_mode" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "name" : null,
    "no_validated_overtime_hours" : null,
    "out_browser" : null,
    "out_city" : null,
    "out_country_name" : null,
    "out_ip_address" : null,
    "out_latitude" : null,
    "out_longitude" : null,
    "out_mode" : null,
    "overtime_hours" : null,
    "overtime_status" : null,
    "validated_overtime_hours" : null,
    "worked_hours" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_attendances/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_attendances/exportdata/{param},/hr_attendances/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_attendances/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_attendances/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_attendances/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_attendances/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_attendances/report" type="info" :closable="false" ></el-alert>
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