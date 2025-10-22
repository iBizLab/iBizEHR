# 活动类型(mail_activity_type) :id=mail_activity_type
## 创建活动类型

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_types" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">decoration_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排版类型|
|<el-row justify="space-between"><el-col :span="20">default_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认备注|
|<el-row justify="space-between"><el-col :span="20">default_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认用户|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安排|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟类型|
|<el-row justify="space-between"><el-col :span="20">delay_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟标签|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_model_change</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|模型已更改|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认摘要|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取活动类型

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_types/{key}" type="info" :closable="false" ></el-alert>
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
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除活动类型

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_types/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新活动类型

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_types/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">decoration_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排版类型|
|<el-row justify="space-between"><el-col :span="20">default_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认备注|
|<el-row justify="space-between"><el-col :span="20">default_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认用户|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安排|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟类型|
|<el-row justify="space-between"><el-col :span="20">delay_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟标签|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_model_change</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|模型已更改|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认摘要|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查活动类型主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_types/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">decoration_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排版类型|
|<el-row justify="space-between"><el-col :span="20">default_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认备注|
|<el-row justify="space-between"><el-col :span="20">default_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认用户|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安排|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟类型|
|<el-row justify="space-between"><el-col :span="20">delay_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟标签|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_model_change</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|模型已更改|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认摘要|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取到期日期

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_types/{key}/get_date_deadline" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">decoration_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排版类型|
|<el-row justify="space-between"><el-col :span="20">default_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认备注|
|<el-row justify="space-between"><el-col :span="20">default_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认用户|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安排|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟类型|
|<el-row justify="space-between"><el-col :span="20">delay_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟标签|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_model_change</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|模型已更改|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认摘要|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取活动类型草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_types/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">decoration_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排版类型|
|<el-row justify="space-between"><el-col :span="20">default_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认备注|
|<el-row justify="space-between"><el-col :span="20">default_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认用户|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安排|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟类型|
|<el-row justify="space-between"><el-col :span="20">delay_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟标签|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_model_change</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|模型已更改|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认摘要|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 移动位置

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_types/{key}/move_order" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`NONE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">decoration_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排版类型|
|<el-row justify="space-between"><el-col :span="20">default_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认备注|
|<el-row justify="space-between"><el-col :span="20">default_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认用户|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安排|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟类型|
|<el-row justify="space-between"><el-col :span="20">delay_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟标签|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_model_change</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|模型已更改|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认摘要|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存活动类型

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_types/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">decoration_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排版类型|
|<el-row justify="space-between"><el-col :span="20">default_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认备注|
|<el-row justify="space-between"><el-col :span="20">default_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认用户|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|安排|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟类型|
|<el-row justify="space-between"><el-col :span="20">delay_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟标签|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_model_change</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|模型已更改|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认摘要|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">triggered_next_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "category" : null,
  "chaining_type" : null,
  "create_date" : null,
  "create_uid" : null,
  "decoration_type" : null,
  "default_note" : null,
  "default_user_id" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_label" : null,
  "delay_unit" : null,
  "display_name" : null,
  "icon" : null,
  "id" : null,
  "keep_done" : null,
  "name" : null,
  "res_model" : null,
  "res_model_change" : null,
  "sequence" : null,
  "summary" : null,
  "triggered_next_type_id" : null,
  "triggered_next_type_name" : null,
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
<el-alert title="/mail_activity_types/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_category_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作|
|<el-row justify="space-between"><el-col :span="20">n_chaining_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">n_decoration_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排版类型|
|<el-row justify="space-between"><el-col :span="20">n_default_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认用户|
|<el-row justify="space-between"><el-col :span="20">n_delay_from_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟类型|
|<el-row justify="space-between"><el-col :span="20">n_delay_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_triggered_next_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">n_triggered_next_type_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">n_triggered_next_type_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_category_eq" : null,
  "n_chaining_type_eq" : null,
  "n_decoration_type_eq" : null,
  "n_default_user_id_eq" : null,
  "n_delay_from_eq" : null,
  "n_delay_unit_eq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_triggered_next_type_id_eq" : null,
  "n_triggered_next_type_name_eq" : null,
  "n_triggered_next_type_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "active" : null,
    "category" : null,
    "chaining_type" : null,
    "create_date" : null,
    "create_uid" : null,
    "decoration_type" : null,
    "default_note" : null,
    "default_user_id" : null,
    "delay_count" : null,
    "delay_from" : null,
    "delay_label" : null,
    "delay_unit" : null,
    "display_name" : null,
    "icon" : null,
    "id" : null,
    "keep_done" : null,
    "name" : null,
    "res_model" : null,
    "res_model_change" : null,
    "sequence" : null,
    "summary" : null,
    "triggered_next_type_id" : null,
    "triggered_next_type_name" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 资源类型及系统

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_types/fetch_res_and_sys" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_category_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作|
|<el-row justify="space-between"><el-col :span="20">n_chaining_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">n_decoration_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|排版类型|
|<el-row justify="space-between"><el-col :span="20">n_default_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认用户|
|<el-row justify="space-between"><el-col :span="20">n_delay_from_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟类型|
|<el-row justify="space-between"><el-col :span="20">n_delay_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_triggered_next_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">n_triggered_next_type_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">n_triggered_next_type_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_category_eq" : null,
  "n_chaining_type_eq" : null,
  "n_decoration_type_eq" : null,
  "n_default_user_id_eq" : null,
  "n_delay_from_eq" : null,
  "n_delay_unit_eq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_triggered_next_type_id_eq" : null,
  "n_triggered_next_type_name_eq" : null,
  "n_triggered_next_type_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "active" : null,
    "category" : null,
    "chaining_type" : null,
    "create_date" : null,
    "create_uid" : null,
    "decoration_type" : null,
    "default_note" : null,
    "default_user_id" : null,
    "delay_count" : null,
    "delay_from" : null,
    "delay_label" : null,
    "delay_unit" : null,
    "display_name" : null,
    "icon" : null,
    "id" : null,
    "keep_done" : null,
    "name" : null,
    "res_model" : null,
    "res_model_change" : null,
    "sequence" : null,
    "summary" : null,
    "triggered_next_type_id" : null,
    "triggered_next_type_name" : null,
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
<el-alert title="/mail_activity_types/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_types/exportdata/{param},/mail_activity_types/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_types/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_types/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_types/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_types/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_types/report" type="info" :closable="false" ></el-alert>
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