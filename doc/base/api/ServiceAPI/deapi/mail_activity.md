# 活动(mail_activity) :id=mail_activity
## 创建活动

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activities" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">deadline_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期天数|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">automated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动活动|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">date_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|完成日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">has_recommended_activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下一活动可用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">previous_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上一个活动类型|
|<el-row justify="space-between"><el-col :span="20">recommended_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐的活动类型|
|<el-row justify="space-between"><el-col :span="20">request_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求伙伴|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单据名称|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给_名称|



##### 请求示例： {docsify-ignore}
```json
{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取活动

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activities/{key}" type="info" :closable="false" ></el-alert>
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
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除活动

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activities/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新活动

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activities/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">deadline_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期天数|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">automated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动活动|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">date_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|完成日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">has_recommended_activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下一活动可用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">previous_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上一个活动类型|
|<el-row justify="space-between"><el-col :span="20">recommended_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐的活动类型|
|<el-row justify="space-between"><el-col :span="20">request_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求伙伴|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单据名称|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给_名称|



##### 请求示例： {docsify-ignore}
```json
{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 完成活动

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activities/{key}/action_done" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">deadline_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期天数|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">automated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动活动|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">date_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|完成日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">has_recommended_activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下一活动可用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">previous_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上一个活动类型|
|<el-row justify="space-between"><el-col :span="20">recommended_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐的活动类型|
|<el-row justify="space-between"><el-col :span="20">request_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求伙伴|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单据名称|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给_名称|



##### 请求示例： {docsify-ignore}
```json
{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 延迟活动

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activities/{key}/action_snooze" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">deadline_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期天数|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">automated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动活动|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">date_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|完成日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">has_recommended_activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下一活动可用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">previous_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上一个活动类型|
|<el-row justify="space-between"><el-col :span="20">recommended_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐的活动类型|
|<el-row justify="space-between"><el-col :span="20">request_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求伙伴|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单据名称|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给_名称|



##### 请求示例： {docsify-ignore}
```json
{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 检查活动主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activities/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">deadline_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期天数|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">automated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动活动|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">date_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|完成日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">has_recommended_activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下一活动可用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">previous_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上一个活动类型|
|<el-row justify="space-between"><el-col :span="20">recommended_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐的活动类型|
|<el-row justify="space-between"><el-col :span="20">request_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求伙伴|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单据名称|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给_名称|



##### 请求示例： {docsify-ignore}
```json
{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取活动草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activities/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">deadline_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期天数|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">automated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动活动|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">date_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|完成日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">has_recommended_activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下一活动可用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">previous_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上一个活动类型|
|<el-row justify="space-between"><el-col :span="20">recommended_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐的活动类型|
|<el-row justify="space-between"><el-col :span="20">request_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求伙伴|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单据名称|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给_名称|



##### 请求示例： {docsify-ignore}
```json
{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存活动

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activities/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">deadline_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|到期天数|
|<el-row justify="space-between"><el-col :span="20">chaining_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|链接类型|
|<el-row justify="space-between"><el-col :span="20">keep_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|保持完成|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">activity_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">automated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动活动|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">date_deadline</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Timestamp|到期日期|
|<el-row justify="space-between"><el-col :span="20">date_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|完成日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">has_recommended_activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|下一活动可用|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">previous_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上一个活动类型|
|<el-row justify="space-between"><el-col :span="20">recommended_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐的活动类型|
|<el-row justify="space-between"><el-col :span="20">request_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求伙伴|
|<el-row justify="space-between"><el-col :span="20">res_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">res_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单据名称|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">summary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|摘要|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|分派给_名称|



##### 请求示例： {docsify-ignore}
```json
{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "deadline_day" : null,
  "chaining_type" : null,
  "keep_done" : null,
  "res_id" : null,
  "active" : null,
  "activity_type_id" : null,
  "activity_type_name" : null,
  "automated" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_deadline" : null,
  "date_done" : null,
  "display_name" : null,
  "has_recommended_activities" : null,
  "id" : null,
  "note" : null,
  "previous_activity_type_id" : null,
  "recommended_activity_type_id" : null,
  "request_partner_id" : null,
  "res_model" : null,
  "res_name" : null,
  "state" : null,
  "summary" : null,
  "user_id" : null,
  "user_name" : null,
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
<el-alert title="/mail_activities/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_previous_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上一个活动类型|
|<el-row justify="space-between"><el-col :span="20">n_recommended_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐的活动类型|
|<el-row justify="space-between"><el-col :span="20">n_request_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求伙伴|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_res_id_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_res_model_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">n_user_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给_名称|
|<el-row justify="space-between"><el-col :span="20">n_user_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给_名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_activity_type_id_eq" : null,
  "n_activity_type_name_eq" : null,
  "n_activity_type_name_like" : null,
  "n_id_eq" : null,
  "n_previous_activity_type_id_eq" : null,
  "n_recommended_activity_type_id_eq" : null,
  "n_request_partner_id_eq" : null,
  "n_res_id_eq" : null,
  "n_res_id_in" : null,
  "n_res_model_eq" : null,
  "n_state_eq" : null,
  "n_user_id_eq" : null,
  "n_user_name_eq" : null,
  "n_user_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "deadline_day" : null,
    "chaining_type" : null,
    "keep_done" : null,
    "res_id" : null,
    "active" : null,
    "activity_type_id" : null,
    "activity_type_name" : null,
    "automated" : null,
    "can_write" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_deadline" : null,
    "date_done" : null,
    "display_name" : null,
    "has_recommended_activities" : null,
    "id" : null,
    "note" : null,
    "previous_activity_type_id" : null,
    "recommended_activity_type_id" : null,
    "request_partner_id" : null,
    "res_model" : null,
    "res_name" : null,
    "state" : null,
    "summary" : null,
    "user_id" : null,
    "user_name" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 未完成

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_activities/fetch_un_finished" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">n_activity_type_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_previous_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上一个活动类型|
|<el-row justify="space-between"><el-col :span="20">n_recommended_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|推荐的活动类型|
|<el-row justify="space-between"><el-col :span="20">n_request_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|请求伙伴|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_res_id_in</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_res_model_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源模型|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给|
|<el-row justify="space-between"><el-col :span="20">n_user_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给_名称|
|<el-row justify="space-between"><el-col :span="20">n_user_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分派给_名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_activity_type_id_eq" : null,
  "n_activity_type_name_eq" : null,
  "n_activity_type_name_like" : null,
  "n_id_eq" : null,
  "n_previous_activity_type_id_eq" : null,
  "n_recommended_activity_type_id_eq" : null,
  "n_request_partner_id_eq" : null,
  "n_res_id_eq" : null,
  "n_res_id_in" : null,
  "n_res_model_eq" : null,
  "n_state_eq" : null,
  "n_user_id_eq" : null,
  "n_user_name_eq" : null,
  "n_user_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "deadline_day" : null,
    "chaining_type" : null,
    "keep_done" : null,
    "res_id" : null,
    "active" : null,
    "activity_type_id" : null,
    "activity_type_name" : null,
    "automated" : null,
    "can_write" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_deadline" : null,
    "date_done" : null,
    "display_name" : null,
    "has_recommended_activities" : null,
    "id" : null,
    "note" : null,
    "previous_activity_type_id" : null,
    "recommended_activity_type_id" : null,
    "request_partner_id" : null,
    "res_model" : null,
    "res_name" : null,
    "state" : null,
    "summary" : null,
    "user_id" : null,
    "user_name" : null,
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
<el-alert title="/mail_activities/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activities/exportdata/{param},/mail_activities/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activities/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activities/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activities/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activities/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_activities/report" type="info" :closable="false" ></el-alert>
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