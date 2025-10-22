# 活动计划模板(mail_activity_plan_template) :id=mail_activity_plan_template
## 创建活动计划模板

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_plan_templates" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|间隔|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">responsible_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|指派|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取活动计划模板

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_plan_templates/{key}" type="info" :closable="false" ></el-alert>
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
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除活动计划模板

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_plan_templates/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新活动计划模板

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_plan_templates/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|间隔|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">responsible_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|指派|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查活动计划模板主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_plan_templates/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|间隔|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">responsible_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|指派|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取活动计划模板草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_plan_templates/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|间隔|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">responsible_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|指派|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
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
<el-alert title="/mail_activity_plan_templates/{key}/move_order" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|间隔|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">responsible_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|指派|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存活动计划模板

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_plan_templates/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">delay_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|间隔|
|<el-row justify="space-between"><el-col :span="20">delay_from</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">delay_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">responsible_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">responsible_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|指派|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activity_type_id" : null,
  "activity_type_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "delay_count" : null,
  "delay_from" : null,
  "delay_unit" : null,
  "display_name" : null,
  "id" : null,
  "note" : null,
  "plan_id" : null,
  "plan_name" : null,
  "responsible_id" : null,
  "responsible_name" : null,
  "responsible_type" : null,
  "sequence" : null,
  "summary" : null,
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
<el-alert title="/mail_activity_plan_templates/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">n_delay_from_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|触发方式|
|<el-row justify="space-between"><el-col :span="20">n_delay_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|延迟单位|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_plan_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">n_plan_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">n_responsible_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">n_responsible_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">n_responsible_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">n_responsible_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|指派|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_activity_type_id_eq" : null,
  "n_activity_type_name_eq" : null,
  "n_activity_type_name_like" : null,
  "n_delay_from_eq" : null,
  "n_delay_unit_eq" : null,
  "n_id_eq" : null,
  "n_plan_id_eq" : null,
  "n_plan_name_eq" : null,
  "n_plan_name_like" : null,
  "n_responsible_id_eq" : null,
  "n_responsible_name_eq" : null,
  "n_responsible_name_like" : null,
  "n_responsible_type_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "activity_type_id" : null,
    "activity_type_name" : null,
    "create_date" : null,
    "create_uid" : null,
    "delay_count" : null,
    "delay_from" : null,
    "delay_unit" : null,
    "display_name" : null,
    "id" : null,
    "note" : null,
    "plan_id" : null,
    "plan_name" : null,
    "responsible_id" : null,
    "responsible_name" : null,
    "responsible_type" : null,
    "sequence" : null,
    "summary" : null,
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
<el-alert title="/mail_activity_plan_templates/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_plan_templates/exportdata/{param},/mail_activity_plan_templates/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_plan_templates/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_plan_templates/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_plan_templates/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_plan_templates/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_plan_templates/report" type="info" :closable="false" ></el-alert>
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