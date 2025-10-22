# 活动日程计划向导(mail_activity_schedule) :id=mail_activity_schedule
## 创建活动日程计划向导

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_schedules" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给名称|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|错误|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_batch_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量使用|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划日期|
|<el-row justify="space-between"><el-col :span="20">plan_department_filterable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划部门可筛选|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_on_demand_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">plan_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划概要|
|<el-row justify="space-between"><el-col :span="20">res_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文档 ID|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取活动日程计划向导

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_schedules/{key}" type="info" :closable="false" ></el-alert>
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
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除活动日程计划向导

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_schedules/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新活动日程计划向导

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_schedules/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给名称|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|错误|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_batch_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量使用|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划日期|
|<el-row justify="space-between"><el-col :span="20">plan_department_filterable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划部门可筛选|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_on_demand_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">plan_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划概要|
|<el-row justify="space-between"><el-col :span="20">res_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文档 ID|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 安排

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_schedules/action_schedule_activities" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给名称|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|错误|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_batch_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量使用|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划日期|
|<el-row justify="space-between"><el-col :span="20">plan_department_filterable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划部门可筛选|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_on_demand_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">plan_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划概要|
|<el-row justify="space-between"><el-col :span="20">res_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文档 ID|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查活动日程计划向导主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_schedules/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给名称|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|错误|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_batch_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量使用|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划日期|
|<el-row justify="space-between"><el-col :span="20">plan_department_filterable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划部门可筛选|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_on_demand_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">plan_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划概要|
|<el-row justify="space-between"><el-col :span="20">res_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文档 ID|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取活动日程计划向导草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_schedules/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给名称|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|错误|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_batch_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量使用|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划日期|
|<el-row justify="space-between"><el-col :span="20">plan_department_filterable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划部门可筛选|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_on_demand_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">plan_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划概要|
|<el-row justify="space-between"><el-col :span="20">res_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文档 ID|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存活动日程计划向导

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_schedules/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给名称|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|错误|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_batch_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量使用|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划日期|
|<el-row justify="space-between"><el-col :span="20">plan_department_filterable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划部门可筛选|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_on_demand_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">plan_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划概要|
|<el-row justify="space-between"><el-col :span="20">res_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文档 ID|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 安排并标记完成

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activity_schedules/schedule_activities_done" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">activity_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">activity_user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给名称|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|错误|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_batch_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|批量使用|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">plan_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|计划日期|
|<el-row justify="space-between"><el-col :span="20">plan_department_filterable</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划部门可筛选|
|<el-row justify="space-between"><el-col :span="20">plan_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">plan_on_demand_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">plan_summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划概要|
|<el-row justify="space-between"><el-col :span="20">res_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文档 ID|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|模型|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|



##### 请求示例： {docsify-ignore}
```json
{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
  "summary" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "chaining_type" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "activity_user_id" : null,
  "activity_user_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "display_name" : null,
  "error" : null,
  "has_error" : null,
  "id" : null,
  "is_batch_mode" : null,
  "note" : null,
  "plan_date" : null,
  "plan_department_filterable" : null,
  "plan_id" : null,
  "plan_on_demand_user_id" : null,
  "plan_summary" : null,
  "res_ids" : null,
  "res_model" : null,
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
<el-alert title="/mail_activity_schedules/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型名称|
|<el-row justify="space-between"><el-col :span="20">n_activity_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">n_activity_user_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给名称|
|<el-row justify="space-between"><el-col :span="20">n_activity_user_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_plan_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计划|
|<el-row justify="space-between"><el-col :span="20">n_plan_on_demand_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_activity_type_id_eq" : null,
  "n_activity_type_name_eq" : null,
  "n_activity_type_name_like" : null,
  "n_activity_user_id_eq" : null,
  "n_activity_user_name_eq" : null,
  "n_activity_user_name_like" : null,
  "n_id_eq" : null,
  "n_plan_id_eq" : null,
  "n_plan_on_demand_user_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "chaining_type" : null,
    "activity_type_id" : null,
    "activity_type_name" : null,
    "activity_user_id" : null,
    "activity_user_name" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_deadline" : null,
    "display_name" : null,
    "error" : null,
    "has_error" : null,
    "id" : null,
    "is_batch_mode" : null,
    "note" : null,
    "plan_date" : null,
    "plan_department_filterable" : null,
    "plan_id" : null,
    "plan_on_demand_user_id" : null,
    "plan_summary" : null,
    "res_ids" : null,
    "res_model" : null,
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
<el-alert title="/mail_activity_schedules/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_schedules/exportdata/{param},/mail_activity_schedules/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_schedules/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_schedules/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_schedules/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_schedules/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activity_schedules/report" type="info" :closable="false" ></el-alert>
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