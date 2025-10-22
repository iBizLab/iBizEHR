# 工作细节(resource_calendar_attendance) :id=resource_calendar_attendance
## 创建工作细节

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_attendances" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">calendar_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|资源的日历|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|起始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">day_period</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|日期|
|<el-row justify="space-between"><el-col :span="20">dayofweek</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|星期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">display_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示类型|
|<el-row justify="space-between"><el-col :span="20">duration_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间 (天)|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时长 (小时)|
|<el-row justify="space-between"><el-col :span="20">hour_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Double|工作起始|
|<el-row justify="space-between"><el-col :span="20">hour_to</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Double|工作截止|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">resource_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">week_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|周数|



##### 请求示例： {docsify-ignore}
```json
{
  "calendar_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "day_period" : null,
  "dayofweek" : null,
  "display_name" : null,
  "display_type" : null,
  "duration_days" : null,
  "duration_hours" : null,
  "hour_from" : null,
  "hour_to" : null,
  "id" : null,
  "name" : null,
  "resource_id" : null,
  "sequence" : null,
  "week_type" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "calendar_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "day_period" : null,
  "dayofweek" : null,
  "display_name" : null,
  "display_type" : null,
  "duration_days" : null,
  "duration_hours" : null,
  "hour_from" : null,
  "hour_to" : null,
  "id" : null,
  "name" : null,
  "resource_id" : null,
  "sequence" : null,
  "week_type" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取工作细节

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_attendances/{key}" type="info" :closable="false" ></el-alert>
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
  "calendar_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "day_period" : null,
  "dayofweek" : null,
  "display_name" : null,
  "display_type" : null,
  "duration_days" : null,
  "duration_hours" : null,
  "hour_from" : null,
  "hour_to" : null,
  "id" : null,
  "name" : null,
  "resource_id" : null,
  "sequence" : null,
  "week_type" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除工作细节

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_attendances/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新工作细节

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_attendances/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">calendar_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|资源的日历|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|起始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">day_period</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|日期|
|<el-row justify="space-between"><el-col :span="20">dayofweek</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|星期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">display_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示类型|
|<el-row justify="space-between"><el-col :span="20">duration_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间 (天)|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时长 (小时)|
|<el-row justify="space-between"><el-col :span="20">hour_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Double|工作起始|
|<el-row justify="space-between"><el-col :span="20">hour_to</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Double|工作截止|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">resource_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">week_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|周数|



##### 请求示例： {docsify-ignore}
```json
{
  "calendar_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "day_period" : null,
  "dayofweek" : null,
  "display_name" : null,
  "display_type" : null,
  "duration_days" : null,
  "duration_hours" : null,
  "hour_from" : null,
  "hour_to" : null,
  "id" : null,
  "name" : null,
  "resource_id" : null,
  "sequence" : null,
  "week_type" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "calendar_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "day_period" : null,
  "dayofweek" : null,
  "display_name" : null,
  "display_type" : null,
  "duration_days" : null,
  "duration_hours" : null,
  "hour_from" : null,
  "hour_to" : null,
  "id" : null,
  "name" : null,
  "resource_id" : null,
  "sequence" : null,
  "week_type" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查工作细节主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_attendances/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">calendar_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|资源的日历|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|起始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">day_period</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|日期|
|<el-row justify="space-between"><el-col :span="20">dayofweek</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|星期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">display_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示类型|
|<el-row justify="space-between"><el-col :span="20">duration_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间 (天)|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时长 (小时)|
|<el-row justify="space-between"><el-col :span="20">hour_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Double|工作起始|
|<el-row justify="space-between"><el-col :span="20">hour_to</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Double|工作截止|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">resource_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">week_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|周数|



##### 请求示例： {docsify-ignore}
```json
{
  "calendar_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "day_period" : null,
  "dayofweek" : null,
  "display_name" : null,
  "display_type" : null,
  "duration_days" : null,
  "duration_hours" : null,
  "hour_from" : null,
  "hour_to" : null,
  "id" : null,
  "name" : null,
  "resource_id" : null,
  "sequence" : null,
  "week_type" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取工作细节草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_attendances/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">calendar_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|资源的日历|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|起始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">day_period</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|日期|
|<el-row justify="space-between"><el-col :span="20">dayofweek</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|星期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">display_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示类型|
|<el-row justify="space-between"><el-col :span="20">duration_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间 (天)|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时长 (小时)|
|<el-row justify="space-between"><el-col :span="20">hour_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Double|工作起始|
|<el-row justify="space-between"><el-col :span="20">hour_to</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Double|工作截止|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">resource_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">week_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|周数|



##### 请求示例： {docsify-ignore}
```json
{
  "calendar_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "day_period" : null,
  "dayofweek" : null,
  "display_name" : null,
  "display_type" : null,
  "duration_days" : null,
  "duration_hours" : null,
  "hour_from" : null,
  "hour_to" : null,
  "id" : null,
  "name" : null,
  "resource_id" : null,
  "sequence" : null,
  "week_type" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "calendar_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "day_period" : null,
  "dayofweek" : null,
  "display_name" : null,
  "display_type" : null,
  "duration_days" : null,
  "duration_hours" : null,
  "hour_from" : null,
  "hour_to" : null,
  "id" : null,
  "name" : null,
  "resource_id" : null,
  "sequence" : null,
  "week_type" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存工作细节

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_attendances/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">calendar_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|资源的日历|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|起始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">day_period</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|日期|
|<el-row justify="space-between"><el-col :span="20">dayofweek</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|星期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">display_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示类型|
|<el-row justify="space-between"><el-col :span="20">duration_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|持续时间 (天)|
|<el-row justify="space-between"><el-col :span="20">duration_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|时长 (小时)|
|<el-row justify="space-between"><el-col :span="20">hour_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Double|工作起始|
|<el-row justify="space-between"><el-col :span="20">hour_to</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Double|工作截止|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">resource_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">week_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|周数|



##### 请求示例： {docsify-ignore}
```json
{
  "calendar_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "day_period" : null,
  "dayofweek" : null,
  "display_name" : null,
  "display_type" : null,
  "duration_days" : null,
  "duration_hours" : null,
  "hour_from" : null,
  "hour_to" : null,
  "id" : null,
  "name" : null,
  "resource_id" : null,
  "sequence" : null,
  "week_type" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "calendar_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "day_period" : null,
  "dayofweek" : null,
  "display_name" : null,
  "display_type" : null,
  "duration_days" : null,
  "duration_hours" : null,
  "hour_from" : null,
  "hour_to" : null,
  "id" : null,
  "name" : null,
  "resource_id" : null,
  "sequence" : null,
  "week_type" : null,
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
<el-alert title="/resource_calendar_attendances/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_calendar_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源的日历|
|<el-row justify="space-between"><el-col :span="20">n_day_period_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日期|
|<el-row justify="space-between"><el-col :span="20">n_dayofweek_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|星期|
|<el-row justify="space-between"><el-col :span="20">n_display_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_resource_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源|
|<el-row justify="space-between"><el-col :span="20">n_week_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|周数|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_calendar_id_eq" : null,
  "n_day_period_eq" : null,
  "n_dayofweek_eq" : null,
  "n_display_type_eq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_resource_id_eq" : null,
  "n_week_type_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "calendar_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "day_period" : null,
    "dayofweek" : null,
    "display_name" : null,
    "display_type" : null,
    "duration_days" : null,
    "duration_hours" : null,
    "hour_from" : null,
    "hour_to" : null,
    "id" : null,
    "name" : null,
    "resource_id" : null,
    "sequence" : null,
    "week_type" : null,
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
<el-alert title="/resource_calendar_attendances/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_attendances/exportdata/{param},/resource_calendar_attendances/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_attendances/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_attendances/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_attendances/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_attendances/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_attendances/report" type="info" :closable="false" ></el-alert>
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