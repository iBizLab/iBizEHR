# EMail模板(mail_template) :id=mail_template
## 创建EMail模板

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_templates" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">auto_delete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动删除|
|<el-row justify="space-between"><el-col :span="20">body_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|正文|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件通知布局|
|<el-row justify="space-between"><el-col :span="20">email_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至（EMail）|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_template_editor</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是模板编辑器|
|<el-row justify="space-between"><el-col :span="20">lang</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">partner_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至（合作伙伴）|
|<el-row justify="space-between"><el-col :span="20">render_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|渲染模型|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复|
|<el-row justify="space-between"><el-col :span="20">scheduled_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|安排的日期|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">template_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板类别|
|<el-row justify="space-between"><el-col :span="20">template_fs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板文件名|
|<el-row justify="space-between"><el-col :span="20">use_default_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认收件人|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "auto_delete" : null,
  "body_html" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "description" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "email_to" : null,
  "id" : null,
  "is_template_editor" : null,
  "lang" : null,
  "name" : null,
  "partner_to" : null,
  "render_model" : null,
  "reply_to" : null,
  "scheduled_date" : null,
  "subject" : null,
  "template_category" : null,
  "template_fs" : null,
  "use_default_to" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "auto_delete" : null,
  "body_html" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "description" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "email_to" : null,
  "id" : null,
  "is_template_editor" : null,
  "lang" : null,
  "name" : null,
  "partner_to" : null,
  "render_model" : null,
  "reply_to" : null,
  "scheduled_date" : null,
  "subject" : null,
  "template_category" : null,
  "template_fs" : null,
  "use_default_to" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取EMail模板

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_templates/{key}" type="info" :closable="false" ></el-alert>
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
  "auto_delete" : null,
  "body_html" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "description" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "email_to" : null,
  "id" : null,
  "is_template_editor" : null,
  "lang" : null,
  "name" : null,
  "partner_to" : null,
  "render_model" : null,
  "reply_to" : null,
  "scheduled_date" : null,
  "subject" : null,
  "template_category" : null,
  "template_fs" : null,
  "use_default_to" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除EMail模板

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_templates/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新EMail模板

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_templates/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">auto_delete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动删除|
|<el-row justify="space-between"><el-col :span="20">body_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|正文|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件通知布局|
|<el-row justify="space-between"><el-col :span="20">email_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至（EMail）|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_template_editor</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是模板编辑器|
|<el-row justify="space-between"><el-col :span="20">lang</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">partner_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至（合作伙伴）|
|<el-row justify="space-between"><el-col :span="20">render_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|渲染模型|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复|
|<el-row justify="space-between"><el-col :span="20">scheduled_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|安排的日期|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">template_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板类别|
|<el-row justify="space-between"><el-col :span="20">template_fs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板文件名|
|<el-row justify="space-between"><el-col :span="20">use_default_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认收件人|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "auto_delete" : null,
  "body_html" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "description" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "email_to" : null,
  "id" : null,
  "is_template_editor" : null,
  "lang" : null,
  "name" : null,
  "partner_to" : null,
  "render_model" : null,
  "reply_to" : null,
  "scheduled_date" : null,
  "subject" : null,
  "template_category" : null,
  "template_fs" : null,
  "use_default_to" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "auto_delete" : null,
  "body_html" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "description" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "email_to" : null,
  "id" : null,
  "is_template_editor" : null,
  "lang" : null,
  "name" : null,
  "partner_to" : null,
  "render_model" : null,
  "reply_to" : null,
  "scheduled_date" : null,
  "subject" : null,
  "template_category" : null,
  "template_fs" : null,
  "use_default_to" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查EMail模板主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_templates/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">auto_delete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动删除|
|<el-row justify="space-between"><el-col :span="20">body_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|正文|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件通知布局|
|<el-row justify="space-between"><el-col :span="20">email_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至（EMail）|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_template_editor</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是模板编辑器|
|<el-row justify="space-between"><el-col :span="20">lang</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">partner_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至（合作伙伴）|
|<el-row justify="space-between"><el-col :span="20">render_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|渲染模型|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复|
|<el-row justify="space-between"><el-col :span="20">scheduled_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|安排的日期|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">template_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板类别|
|<el-row justify="space-between"><el-col :span="20">template_fs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板文件名|
|<el-row justify="space-between"><el-col :span="20">use_default_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认收件人|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "auto_delete" : null,
  "body_html" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "description" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "email_to" : null,
  "id" : null,
  "is_template_editor" : null,
  "lang" : null,
  "name" : null,
  "partner_to" : null,
  "render_model" : null,
  "reply_to" : null,
  "scheduled_date" : null,
  "subject" : null,
  "template_category" : null,
  "template_fs" : null,
  "use_default_to" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取EMail模板草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_templates/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">auto_delete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动删除|
|<el-row justify="space-between"><el-col :span="20">body_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|正文|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件通知布局|
|<el-row justify="space-between"><el-col :span="20">email_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至（EMail）|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_template_editor</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是模板编辑器|
|<el-row justify="space-between"><el-col :span="20">lang</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">partner_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至（合作伙伴）|
|<el-row justify="space-between"><el-col :span="20">render_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|渲染模型|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复|
|<el-row justify="space-between"><el-col :span="20">scheduled_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|安排的日期|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">template_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板类别|
|<el-row justify="space-between"><el-col :span="20">template_fs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板文件名|
|<el-row justify="space-between"><el-col :span="20">use_default_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认收件人|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "auto_delete" : null,
  "body_html" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "description" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "email_to" : null,
  "id" : null,
  "is_template_editor" : null,
  "lang" : null,
  "name" : null,
  "partner_to" : null,
  "render_model" : null,
  "reply_to" : null,
  "scheduled_date" : null,
  "subject" : null,
  "template_category" : null,
  "template_fs" : null,
  "use_default_to" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "auto_delete" : null,
  "body_html" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "description" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "email_to" : null,
  "id" : null,
  "is_template_editor" : null,
  "lang" : null,
  "name" : null,
  "partner_to" : null,
  "render_model" : null,
  "reply_to" : null,
  "scheduled_date" : null,
  "subject" : null,
  "template_category" : null,
  "template_fs" : null,
  "use_default_to" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存EMail模板

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/mail_templates/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">auto_delete</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动删除|
|<el-row justify="space-between"><el-col :span="20">body_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|正文|
|<el-row justify="space-between"><el-col :span="20">can_write</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|可写|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板描述|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_cc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|抄送|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|来自|
|<el-row justify="space-between"><el-col :span="20">email_layout_xmlid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件通知布局|
|<el-row justify="space-between"><el-col :span="20">email_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至（EMail）|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_template_editor</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是模板编辑器|
|<el-row justify="space-between"><el-col :span="20">lang</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|语言|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">partner_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|至（合作伙伴）|
|<el-row justify="space-between"><el-col :span="20">render_model</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|渲染模型|
|<el-row justify="space-between"><el-col :span="20">reply_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|回复|
|<el-row justify="space-between"><el-col :span="20">scheduled_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|安排的日期|
|<el-row justify="space-between"><el-col :span="20">subject</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主旨|
|<el-row justify="space-between"><el-col :span="20">template_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板类别|
|<el-row justify="space-between"><el-col :span="20">template_fs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板文件名|
|<el-row justify="space-between"><el-col :span="20">use_default_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认收件人|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "auto_delete" : null,
  "body_html" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "description" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "email_to" : null,
  "id" : null,
  "is_template_editor" : null,
  "lang" : null,
  "name" : null,
  "partner_to" : null,
  "render_model" : null,
  "reply_to" : null,
  "scheduled_date" : null,
  "subject" : null,
  "template_category" : null,
  "template_fs" : null,
  "use_default_to" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "auto_delete" : null,
  "body_html" : null,
  "can_write" : null,
  "create_date" : null,
  "create_uid" : null,
  "description" : null,
  "display_name" : null,
  "email_cc" : null,
  "email_from" : null,
  "email_layout_xmlid" : null,
  "email_to" : null,
  "id" : null,
  "is_template_editor" : null,
  "lang" : null,
  "name" : null,
  "partner_to" : null,
  "render_model" : null,
  "reply_to" : null,
  "scheduled_date" : null,
  "subject" : null,
  "template_category" : null,
  "template_fs" : null,
  "use_default_to" : null,
  "user_id" : null,
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
<el-alert title="/mail_templates/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_template_category_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|模板类别|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_template_category_eq" : null,
  "n_user_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "active" : null,
    "auto_delete" : null,
    "body_html" : null,
    "can_write" : null,
    "create_date" : null,
    "create_uid" : null,
    "description" : null,
    "display_name" : null,
    "email_cc" : null,
    "email_from" : null,
    "email_layout_xmlid" : null,
    "email_to" : null,
    "id" : null,
    "is_template_editor" : null,
    "lang" : null,
    "name" : null,
    "partner_to" : null,
    "render_model" : null,
    "reply_to" : null,
    "scheduled_date" : null,
    "subject" : null,
    "template_category" : null,
    "template_fs" : null,
    "use_default_to" : null,
    "user_id" : null,
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
<el-alert title="/mail_templates/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_templates/exportdata/{param},/mail_templates/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_templates/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_templates/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_templates/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_templates/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/mail_templates/report" type="info" :closable="false" ></el-alert>
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