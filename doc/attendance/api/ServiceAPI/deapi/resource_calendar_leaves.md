# 休假详细信息(resource_calendar_leaves) :id=resource_calendar_leaves
## 创建休假详细信息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_leaves" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">holiday_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日类型|
|<el-row justify="space-between"><el-col :span="20">calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">calendar_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间名称|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">holiday_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">holnameay_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">time_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时间类型|
|<el-row justify="space-between"><el-col :span="20">type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取休假详细信息

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_leaves/{key}" type="info" :closable="false" ></el-alert>
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
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除休假详细信息

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_leaves/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|





## 更新休假详细信息

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_leaves/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">holiday_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日类型|
|<el-row justify="space-between"><el-col :span="20">calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">calendar_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间名称|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">holiday_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">holnameay_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">time_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时间类型|
|<el-row justify="space-between"><el-col :span="20">type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取节假日

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_leaves/a_sync_holidays" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">holiday_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日类型|
|<el-row justify="space-between"><el-col :span="20">calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">calendar_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间名称|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">holiday_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">holnameay_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">time_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时间类型|
|<el-row justify="space-between"><el-col :span="20">type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查休假详细信息主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_leaves/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">holiday_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日类型|
|<el-row justify="space-between"><el-col :span="20">calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">calendar_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间名称|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">holiday_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">holnameay_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">time_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时间类型|
|<el-row justify="space-between"><el-col :span="20">type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取休假详细信息草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_leaves/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">holiday_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日类型|
|<el-row justify="space-between"><el-col :span="20">calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">calendar_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间名称|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">holiday_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">holnameay_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">time_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时间类型|
|<el-row justify="space-between"><el-col :span="20">type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存休假详细信息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_leaves/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">holiday_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日类型|
|<el-row justify="space-between"><el-col :span="20">calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">calendar_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间名称|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">holiday_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">holnameay_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">time_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时间类型|
|<el-row justify="space-between"><el-col :span="20">type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "holiday_type" : null,
  "calendar_id" : null,
  "calendar_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "display_name" : null,
  "holiday_id" : null,
  "holnameay_name" : null,
  "id" : null,
  "name" : null,
  "time_type" : null,
  "type_id" : null,
  "type_name" : null,
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
<el-alert title="/resource_calendar_leaves/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_calendar_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">n_calendar_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间名称|
|<el-row justify="space-between"><el-col :span="20">n_calendar_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间名称|
|<el-row justify="space-between"><el-col :span="20">n_date_from_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">n_date_from_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">n_date_to_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">n_date_to_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">n_holiday_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">n_holnameay_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">n_holnameay_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_time_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时间类型|
|<el-row justify="space-between"><el-col :span="20">n_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_type_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_type_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_calendar_id_eq" : null,
  "n_calendar_name_eq" : null,
  "n_calendar_name_like" : null,
  "n_date_from_gtandeq" : null,
  "n_date_from_ltandeq" : null,
  "n_date_to_gtandeq" : null,
  "n_date_to_ltandeq" : null,
  "n_holiday_id_eq" : null,
  "n_holnameay_name_eq" : null,
  "n_holnameay_name_like" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_time_type_eq" : null,
  "n_type_id_eq" : null,
  "n_type_name_eq" : null,
  "n_type_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "holiday_type" : null,
    "calendar_id" : null,
    "calendar_name" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "display_name" : null,
    "holiday_id" : null,
    "holnameay_name" : null,
    "id" : null,
    "name" : null,
    "time_type" : null,
    "type_id" : null,
    "type_name" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 公共节假日

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/resource_calendar_leaves/fetch_public" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_calendar_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">n_calendar_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间名称|
|<el-row justify="space-between"><el-col :span="20">n_calendar_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间名称|
|<el-row justify="space-between"><el-col :span="20">n_date_from_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">n_date_from_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始日期|
|<el-row justify="space-between"><el-col :span="20">n_date_to_gtandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">n_date_to_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束日期|
|<el-row justify="space-between"><el-col :span="20">n_holiday_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">n_holnameay_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">n_holnameay_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|休假要求|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_time_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时间类型|
|<el-row justify="space-between"><el-col :span="20">n_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_type_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_type_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_calendar_id_eq" : null,
  "n_calendar_name_eq" : null,
  "n_calendar_name_like" : null,
  "n_date_from_gtandeq" : null,
  "n_date_from_ltandeq" : null,
  "n_date_to_gtandeq" : null,
  "n_date_to_ltandeq" : null,
  "n_holiday_id_eq" : null,
  "n_holnameay_name_eq" : null,
  "n_holnameay_name_like" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_time_type_eq" : null,
  "n_type_id_eq" : null,
  "n_type_name_eq" : null,
  "n_type_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "holiday_type" : null,
    "calendar_id" : null,
    "calendar_name" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "display_name" : null,
    "holiday_id" : null,
    "holnameay_name" : null,
    "id" : null,
    "name" : null,
    "time_type" : null,
    "type_id" : null,
    "type_name" : null,
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
<el-alert title="/resource_calendar_leaves/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_leaves/exportdata/{param},/resource_calendar_leaves/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_leaves/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_leaves/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_leaves/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_leaves/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/resource_calendar_leaves/report" type="info" :closable="false" ></el-alert>
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