# 面试安排(hr_interview_schedule) :id=hr_interview_schedule
## 创建面试安排

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_schedules" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">resume_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历类型|
|<el-row justify="space-between"><el-col :span="20">attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件|
|<el-row justify="space-between"><el-col :span="20">interview_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型分类|
|<el-row justify="space-between"><el-col :span="20">is_send_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否发送邮件通知|
|<el-row justify="space-between"><el-col :span="20">is_send_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否发送短信|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信内容|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件内容|
|<el-row justify="space-between"><el-col :span="20">email_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">sms_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模版|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">interviews</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "start_date" : null,
  "interview_type" : null,
  "resume_type" : null,
  "attachment" : null,
  "interview_category" : null,
  "is_send_email" : null,
  "is_send_sms" : null,
  "sms_content" : null,
  "email_content" : null,
  "email_template_id" : null,
  "address_id" : null,
  "sms_template_id" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interviews" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "start_date" : null,
  "interview_type" : null,
  "resume_type" : null,
  "attachment" : null,
  "interview_category" : null,
  "is_send_email" : null,
  "is_send_sms" : null,
  "sms_content" : null,
  "email_content" : null,
  "email_template_id" : null,
  "address_id" : null,
  "sms_template_id" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interviews" : null,
}

```

## 获取面试安排

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_schedules/{key}" type="info" :closable="false" ></el-alert>
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
  "start_date" : null,
  "interview_type" : null,
  "resume_type" : null,
  "attachment" : null,
  "interview_category" : null,
  "is_send_email" : null,
  "is_send_sms" : null,
  "sms_content" : null,
  "email_content" : null,
  "email_template_id" : null,
  "address_id" : null,
  "sms_template_id" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interviews" : null,
}

```

## 删除面试安排

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_schedules/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新面试安排

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_schedules/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">resume_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历类型|
|<el-row justify="space-between"><el-col :span="20">attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件|
|<el-row justify="space-between"><el-col :span="20">interview_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型分类|
|<el-row justify="space-between"><el-col :span="20">is_send_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否发送邮件通知|
|<el-row justify="space-between"><el-col :span="20">is_send_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否发送短信|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信内容|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件内容|
|<el-row justify="space-between"><el-col :span="20">email_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">sms_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模版|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">interviews</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "start_date" : null,
  "interview_type" : null,
  "resume_type" : null,
  "attachment" : null,
  "interview_category" : null,
  "is_send_email" : null,
  "is_send_sms" : null,
  "sms_content" : null,
  "email_content" : null,
  "email_template_id" : null,
  "address_id" : null,
  "sms_template_id" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interviews" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "start_date" : null,
  "interview_type" : null,
  "resume_type" : null,
  "attachment" : null,
  "interview_category" : null,
  "is_send_email" : null,
  "is_send_sms" : null,
  "sms_content" : null,
  "email_content" : null,
  "email_template_id" : null,
  "address_id" : null,
  "sms_template_id" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interviews" : null,
}

```

## 检查面试安排主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_schedules/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">resume_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历类型|
|<el-row justify="space-between"><el-col :span="20">attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件|
|<el-row justify="space-between"><el-col :span="20">interview_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型分类|
|<el-row justify="space-between"><el-col :span="20">is_send_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否发送邮件通知|
|<el-row justify="space-between"><el-col :span="20">is_send_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否发送短信|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信内容|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件内容|
|<el-row justify="space-between"><el-col :span="20">email_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">sms_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模版|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">interviews</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "start_date" : null,
  "interview_type" : null,
  "resume_type" : null,
  "attachment" : null,
  "interview_category" : null,
  "is_send_email" : null,
  "is_send_sms" : null,
  "sms_content" : null,
  "email_content" : null,
  "email_template_id" : null,
  "address_id" : null,
  "sms_template_id" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interviews" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取面试安排草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_schedules/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">resume_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历类型|
|<el-row justify="space-between"><el-col :span="20">attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件|
|<el-row justify="space-between"><el-col :span="20">interview_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型分类|
|<el-row justify="space-between"><el-col :span="20">is_send_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否发送邮件通知|
|<el-row justify="space-between"><el-col :span="20">is_send_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否发送短信|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信内容|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件内容|
|<el-row justify="space-between"><el-col :span="20">email_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">sms_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模版|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">interviews</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "start_date" : null,
  "interview_type" : null,
  "resume_type" : null,
  "attachment" : null,
  "interview_category" : null,
  "is_send_email" : null,
  "is_send_sms" : null,
  "sms_content" : null,
  "email_content" : null,
  "email_template_id" : null,
  "address_id" : null,
  "sms_template_id" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interviews" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "start_date" : null,
  "interview_type" : null,
  "resume_type" : null,
  "attachment" : null,
  "interview_category" : null,
  "is_send_email" : null,
  "is_send_sms" : null,
  "sms_content" : null,
  "email_content" : null,
  "email_template_id" : null,
  "address_id" : null,
  "sms_template_id" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interviews" : null,
}

```

## 保存面试安排

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_schedules/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">resume_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历类型|
|<el-row justify="space-between"><el-col :span="20">attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件|
|<el-row justify="space-between"><el-col :span="20">interview_category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型分类|
|<el-row justify="space-between"><el-col :span="20">is_send_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否发送邮件通知|
|<el-row justify="space-between"><el-col :span="20">is_send_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否发送短信|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信内容|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件内容|
|<el-row justify="space-between"><el-col :span="20">email_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">sms_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模版|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">interviews</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "start_date" : null,
  "interview_type" : null,
  "resume_type" : null,
  "attachment" : null,
  "interview_category" : null,
  "is_send_email" : null,
  "is_send_sms" : null,
  "sms_content" : null,
  "email_content" : null,
  "email_template_id" : null,
  "address_id" : null,
  "sms_template_id" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interviews" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "start_date" : null,
  "interview_type" : null,
  "resume_type" : null,
  "attachment" : null,
  "interview_category" : null,
  "is_send_email" : null,
  "is_send_sms" : null,
  "sms_content" : null,
  "email_content" : null,
  "email_template_id" : null,
  "address_id" : null,
  "sms_template_id" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interviews" : null,
}

```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_schedules/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_email_template_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_resume_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历类型|
|<el-row justify="space-between"><el-col :span="20">n_sms_template_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模版|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_applicant_id_eq" : null,
  "n_email_template_id_eq" : null,
  "n_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_name_like" : null,
  "n_resume_type_eq" : null,
  "n_sms_template_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "start_date" : null,
    "interview_type" : null,
    "resume_type" : null,
    "attachment" : null,
    "interview_category" : null,
    "is_send_email" : null,
    "is_send_sms" : null,
    "sms_content" : null,
    "email_content" : null,
    "email_template_id" : null,
    "address_id" : null,
    "sms_template_id" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "name" : null,
    "write_date" : null,
    "write_uid" : null,
    "interviews" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_schedules/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_schedules/exportdata/{param},/hr_interview_schedules/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_schedules/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_schedules/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_schedules/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_schedules/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_schedules/report" type="info" :closable="false" ></el-alert>
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