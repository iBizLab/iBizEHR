# 消息(mail_message) :id=mail_message
## 创建消息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取消息

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/{key}" type="info" :closable="false" ></el-alert>
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
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除消息

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新消息

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 添加收藏

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/{key}/add_favorite" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 检查消息主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 删除评论

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/{key}/delete" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`
删除内容不删除数据

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 获取消息草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 置顶

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/{key}/pin" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 移除所有收藏

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/remove_all_favorites" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 移除收藏

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/{key}/remove_favorite" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 保存消息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 取消置顶

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/{key}/unpin" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "favorite_count" : null,
  "is_favorite" : null,
  "res_id" : null,
  "parent_body" : null,
  "parent_author_id" : null,
  "account_audit_log_activated" : null,
  "account_audit_log_preview" : null,
  "author_guest_id" : null,
  "author_id" : null,
  "body" : null,
  "create_date" : null,
  "create_uid" : null,
  "date" : null,
  "display_name" : null,
  "email_add_signature" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "has_error" : null,
  "has_sms_error" : null,
  "id" : null,
  "is_current_user_or_guest_author" : null,
  "is_internal" : null,
  "mail_activity_type_id" : null,
  "message_id" : null,
  "message_type" : null,
  "model" : null,
  "needaction" : null,
  "parent_id" : null,
  "pinned_at" : null,
  "preview" : null,
  "rating_value" : null,
  "record_alias_domain_id" : null,
  "record_company_id" : null,
  "record_name" : null,
  "reply_to" : null,
  "reply_to_force_new" : null,
  "snailmail_error" : null,
  "starred" : null,
  "subject" : null,
  "subtype_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 常规

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/fetch_common" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`
筛选email|comment|auto_comment



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_author_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_author_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">n_body_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_favorite_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">n_mail_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">n_message_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_needaction_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">n_record_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">n_record_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_subtype_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_author_guest_id_eq" : null,
  "n_author_id_eq" : null,
  "n_body_like" : null,
  "n_id_eq" : null,
  "n_is_favorite_eq" : null,
  "n_mail_activity_type_id_eq" : null,
  "n_message_type_eq" : null,
  "n_needaction_eq" : null,
  "n_parent_id_eq" : null,
  "n_record_alias_domain_id_eq" : null,
  "n_record_company_id_eq" : null,
  "n_res_id_eq" : null,
  "n_subtype_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "favorite_count" : null,
    "is_favorite" : null,
    "res_id" : null,
    "parent_body" : null,
    "parent_author_id" : null,
    "account_audit_log_activated" : null,
    "account_audit_log_preview" : null,
    "author_guest_id" : null,
    "author_id" : null,
    "body" : null,
    "create_date" : null,
    "create_uid" : null,
    "date" : null,
    "display_name" : null,
    "email_add_signature" : null,
    "email_from" : null,
    "email_layout_xmlid" : null,
    "has_error" : null,
    "has_sms_error" : null,
    "id" : null,
    "is_current_user_or_guest_author" : null,
    "is_internal" : null,
    "mail_activity_type_id" : null,
    "message_id" : null,
    "message_type" : null,
    "model" : null,
    "needaction" : null,
    "parent_id" : null,
    "pinned_at" : null,
    "preview" : null,
    "rating_value" : null,
    "record_alias_domain_id" : null,
    "record_company_id" : null,
    "record_name" : null,
    "reply_to" : null,
    "reply_to_force_new" : null,
    "snailmail_error" : null,
    "starred" : null,
    "subject" : null,
    "subtype_id" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 常规(全部)

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/fetch_common_all" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`
筛选email|comment|auto_comment



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_author_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_author_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">n_body_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_favorite_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">n_mail_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">n_message_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_needaction_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">n_record_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">n_record_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_subtype_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_author_guest_id_eq" : null,
  "n_author_id_eq" : null,
  "n_body_like" : null,
  "n_id_eq" : null,
  "n_is_favorite_eq" : null,
  "n_mail_activity_type_id_eq" : null,
  "n_message_type_eq" : null,
  "n_needaction_eq" : null,
  "n_parent_id_eq" : null,
  "n_record_alias_domain_id_eq" : null,
  "n_record_company_id_eq" : null,
  "n_res_id_eq" : null,
  "n_subtype_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "favorite_count" : null,
    "is_favorite" : null,
    "res_id" : null,
    "parent_body" : null,
    "parent_author_id" : null,
    "account_audit_log_activated" : null,
    "account_audit_log_preview" : null,
    "author_guest_id" : null,
    "author_id" : null,
    "body" : null,
    "create_date" : null,
    "create_uid" : null,
    "date" : null,
    "display_name" : null,
    "email_add_signature" : null,
    "email_from" : null,
    "email_layout_xmlid" : null,
    "has_error" : null,
    "has_sms_error" : null,
    "id" : null,
    "is_current_user_or_guest_author" : null,
    "is_internal" : null,
    "mail_activity_type_id" : null,
    "message_id" : null,
    "message_type" : null,
    "model" : null,
    "needaction" : null,
    "parent_id" : null,
    "pinned_at" : null,
    "preview" : null,
    "rating_value" : null,
    "record_alias_domain_id" : null,
    "record_company_id" : null,
    "record_name" : null,
    "reply_to" : null,
    "reply_to_force_new" : null,
    "snailmail_error" : null,
    "starred" : null,
    "subject" : null,
    "subtype_id" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 当前用户消息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/fetch_cur_user" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_author_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_author_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">n_body_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_favorite_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">n_mail_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">n_message_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_needaction_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">n_record_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">n_record_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_subtype_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_author_guest_id_eq" : null,
  "n_author_id_eq" : null,
  "n_body_like" : null,
  "n_id_eq" : null,
  "n_is_favorite_eq" : null,
  "n_mail_activity_type_id_eq" : null,
  "n_message_type_eq" : null,
  "n_needaction_eq" : null,
  "n_parent_id_eq" : null,
  "n_record_alias_domain_id_eq" : null,
  "n_record_company_id_eq" : null,
  "n_res_id_eq" : null,
  "n_subtype_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "favorite_count" : null,
    "is_favorite" : null,
    "res_id" : null,
    "parent_body" : null,
    "parent_author_id" : null,
    "account_audit_log_activated" : null,
    "account_audit_log_preview" : null,
    "author_guest_id" : null,
    "author_id" : null,
    "body" : null,
    "create_date" : null,
    "create_uid" : null,
    "date" : null,
    "display_name" : null,
    "email_add_signature" : null,
    "email_from" : null,
    "email_layout_xmlid" : null,
    "has_error" : null,
    "has_sms_error" : null,
    "id" : null,
    "is_current_user_or_guest_author" : null,
    "is_internal" : null,
    "mail_activity_type_id" : null,
    "message_id" : null,
    "message_type" : null,
    "model" : null,
    "needaction" : null,
    "parent_id" : null,
    "pinned_at" : null,
    "preview" : null,
    "rating_value" : null,
    "record_alias_domain_id" : null,
    "record_company_id" : null,
    "record_name" : null,
    "reply_to" : null,
    "reply_to_force_new" : null,
    "snailmail_error" : null,
    "starred" : null,
    "subject" : null,
    "subtype_id" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_author_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_author_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">n_body_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_favorite_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">n_mail_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">n_message_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_needaction_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">n_record_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">n_record_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_subtype_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_author_guest_id_eq" : null,
  "n_author_id_eq" : null,
  "n_body_like" : null,
  "n_id_eq" : null,
  "n_is_favorite_eq" : null,
  "n_mail_activity_type_id_eq" : null,
  "n_message_type_eq" : null,
  "n_needaction_eq" : null,
  "n_parent_id_eq" : null,
  "n_record_alias_domain_id_eq" : null,
  "n_record_company_id_eq" : null,
  "n_res_id_eq" : null,
  "n_subtype_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "favorite_count" : null,
    "is_favorite" : null,
    "res_id" : null,
    "parent_body" : null,
    "parent_author_id" : null,
    "account_audit_log_activated" : null,
    "account_audit_log_preview" : null,
    "author_guest_id" : null,
    "author_id" : null,
    "body" : null,
    "create_date" : null,
    "create_uid" : null,
    "date" : null,
    "display_name" : null,
    "email_add_signature" : null,
    "email_from" : null,
    "email_layout_xmlid" : null,
    "has_error" : null,
    "has_sms_error" : null,
    "id" : null,
    "is_current_user_or_guest_author" : null,
    "is_internal" : null,
    "mail_activity_type_id" : null,
    "message_id" : null,
    "message_type" : null,
    "model" : null,
    "needaction" : null,
    "parent_id" : null,
    "pinned_at" : null,
    "preview" : null,
    "rating_value" : null,
    "record_alias_domain_id" : null,
    "record_company_id" : null,
    "record_name" : null,
    "reply_to" : null,
    "reply_to_force_new" : null,
    "snailmail_error" : null,
    "starred" : null,
    "subject" : null,
    "subtype_id" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 置顶消息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_messages/fetch_pinned" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_author_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_author_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">n_body_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_favorite_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">n_mail_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">n_message_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_needaction_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">n_record_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">n_record_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_subtype_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_author_guest_id_eq" : null,
  "n_author_id_eq" : null,
  "n_body_like" : null,
  "n_id_eq" : null,
  "n_is_favorite_eq" : null,
  "n_mail_activity_type_id_eq" : null,
  "n_message_type_eq" : null,
  "n_needaction_eq" : null,
  "n_parent_id_eq" : null,
  "n_record_alias_domain_id_eq" : null,
  "n_record_company_id_eq" : null,
  "n_res_id_eq" : null,
  "n_subtype_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "favorite_count" : null,
    "is_favorite" : null,
    "res_id" : null,
    "parent_body" : null,
    "parent_author_id" : null,
    "account_audit_log_activated" : null,
    "account_audit_log_preview" : null,
    "author_guest_id" : null,
    "author_id" : null,
    "body" : null,
    "create_date" : null,
    "create_uid" : null,
    "date" : null,
    "display_name" : null,
    "email_add_signature" : null,
    "email_from" : null,
    "email_layout_xmlid" : null,
    "has_error" : null,
    "has_sms_error" : null,
    "id" : null,
    "is_current_user_or_guest_author" : null,
    "is_internal" : null,
    "mail_activity_type_id" : null,
    "message_id" : null,
    "message_type" : null,
    "model" : null,
    "needaction" : null,
    "parent_id" : null,
    "pinned_at" : null,
    "preview" : null,
    "rating_value" : null,
    "record_alias_domain_id" : null,
    "record_company_id" : null,
    "record_name" : null,
    "reply_to" : null,
    "reply_to_force_new" : null,
    "snailmail_error" : null,
    "starred" : null,
    "subject" : null,
    "subtype_id" : null,
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
<el-alert title="/mail_messages/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_messages/exportdata/{param},/mail_messages/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_messages/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_messages/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_messages/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_messages/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_messages/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfreporttag | String | 报表标识 |
| srfcontenttype | String | 报表类型 |




## 根据邮件会话创建消息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话获取消息

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|
|key|String|标识|




## 根据邮件会话删除消息

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|
|key|String|标识|




## 根据邮件会话更新消息

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话添加收藏

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/{key}/add_favorite" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话检查消息主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话删除评论

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/{key}/delete" type="info" :closable="false" ></el-alert>
</div>
</el-row>
删除内容不删除数据

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话获取消息草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话置顶

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/{key}/pin" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话移除所有收藏

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/remove_all_favorites" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话移除收藏

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/{key}/remove_favorite" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话保存消息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话取消置顶

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/{key}/unpin" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">favorite_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏计数|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">res_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">parent_body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息内容|
|<el-row justify="space-between"><el-col :span="20">parent_author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息作者|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_activated</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计日志已启动|
|<el-row justify="space-between"><el-col :span="20">account_audit_log_preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">author_guest_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">author_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">body</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_add_signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电子邮件添加签字|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局|
|<el-row justify="space-between"><el-col :span="20">has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有错误|
|<el-row justify="space-between"><el-col :span="20">has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有短信息错误|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_current_user_or_guest_author</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前用户还是访客作者|
|<el-row justify="space-between"><el-col :span="20">is_internal</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|仅限员工|
|<el-row justify="space-between"><el-col :span="20">mail_activity_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">message_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息ID|
|<el-row justify="space-between"><el-col :span="20">message_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关单据模型|
|<el-row justify="space-between"><el-col :span="20">needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">pinned_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|已置顶|
|<el-row justify="space-between"><el-col :span="20">preview</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预览|
|<el-row justify="space-between"><el-col :span="20">rating_value</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|评级值|
|<el-row justify="space-between"><el-col :span="20">record_alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">record_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">record_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|消息记录名称|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复 至|
|<el-row justify="space-between"><el-col :span="20">reply_to_force_new</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|无响应|
|<el-row justify="space-between"><el-col :span="20">snailmail_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|蜗牛邮件错误消息|
|<el-row justify="space-between"><el-col :span="20">starred</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|星标消息|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">subtype_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话常规

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/fetch_common" type="info" :closable="false" ></el-alert>
</div>
</el-row>
筛选email|comment|auto_comment

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_author_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_author_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">n_body_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_favorite_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">n_mail_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">n_message_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_needaction_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">n_record_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">n_record_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_subtype_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话常规(全部)

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/fetch_common_all" type="info" :closable="false" ></el-alert>
</div>
</el-row>
筛选email|comment|auto_comment

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_author_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_author_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">n_body_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_favorite_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">n_mail_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">n_message_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_needaction_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">n_record_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">n_record_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_subtype_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话当前用户消息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/fetch_cur_user" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_author_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_author_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">n_body_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_favorite_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">n_mail_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">n_message_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_needaction_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">n_record_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">n_record_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_subtype_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_author_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_author_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">n_body_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_favorite_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">n_mail_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">n_message_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_needaction_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">n_record_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">n_record_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_subtype_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|



## 根据邮件会话置顶消息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/fetch_pinned" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|邮件会话主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_author_guest_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|访客|
|<el-row justify="space-between"><el-col :span="20">n_author_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|作者|
|<el-row justify="space-between"><el-col :span="20">n_body_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_favorite_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收藏|
|<el-row justify="space-between"><el-col :span="20">n_mail_activity_type_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件活动类型|
|<el-row justify="space-between"><el-col :span="20">n_message_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_needaction_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要行动|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级消息|
|<el-row justify="space-between"><el-col :span="20">n_record_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|别名域|
|<el-row justify="space-between"><el-col :span="20">n_record_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_res_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源标识|
|<el-row justify="space-between"><el-col :span="20">n_subtype_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|子类型|




## 根据邮件会话下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/importtemplate" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |



## 根据邮件会话数据导出

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/exportdata/{param},/mail_threads/{pkey}/mail_messages/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|
|param|String|导出集合方法名称|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|
|srfexporttag|String|导出模板标识|

##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|page|Integer|page|
|size|Integer|分页大小|
|n_xxx_eq|String|过滤参数|


## 根据邮件会话数据导入

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/importdata" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 根据邮件会话数据导入（返回错误excel）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/importdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 根据邮件会话自定义表头导入（异步）
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/asyncimportdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |
| srfossfileid | String | 导入文件 |
| srfimportschemaid | String | 表头定义 |


## 根据邮件会话数据打印
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/printdata/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfprinttag | String | 打印标识 |
| srfcontenttype | String | 打印类型 |



## 根据邮件会话报表打印

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_threads/{pkey}/mail_messages/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

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