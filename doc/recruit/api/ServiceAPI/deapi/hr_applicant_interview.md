# 候选人申请与面试关系(hr_applicant_interview) :id=hr_applicant_interview
## 创建候选人申请与面试关系

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicant_interviews" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试时间|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">interview_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试信息|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">interview_feedbacks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "stage_id" : null,
  "start_time" : null,
  "duration" : null,
  "candidate_display_name" : null,
  "job_name" : null,
  "email_from" : null,
  "job_platform_id" : null,
  "experience" : null,
  "address" : null,
  "education" : null,
  "mobile_phone" : null,
  "job_platform_name" : null,
  "interview_type" : null,
  "start_date" : null,
  "owner_id" : null,
  "owner_name" : null,
  "last_edu_academic_degree" : null,
  "job_id" : null,
  "interview_info" : null,
  "description" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interview_feedbacks" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "stage_id" : null,
  "start_time" : null,
  "duration" : null,
  "candidate_display_name" : null,
  "job_name" : null,
  "email_from" : null,
  "job_platform_id" : null,
  "experience" : null,
  "address" : null,
  "education" : null,
  "mobile_phone" : null,
  "job_platform_name" : null,
  "interview_type" : null,
  "start_date" : null,
  "owner_id" : null,
  "owner_name" : null,
  "last_edu_academic_degree" : null,
  "job_id" : null,
  "interview_info" : null,
  "description" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interview_feedbacks" : null,
}

```

## 获取候选人申请与面试关系

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicant_interviews/{key}" type="info" :closable="false" ></el-alert>
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
  "stage_id" : null,
  "start_time" : null,
  "duration" : null,
  "candidate_display_name" : null,
  "job_name" : null,
  "email_from" : null,
  "job_platform_id" : null,
  "experience" : null,
  "address" : null,
  "education" : null,
  "mobile_phone" : null,
  "job_platform_name" : null,
  "interview_type" : null,
  "start_date" : null,
  "owner_id" : null,
  "owner_name" : null,
  "last_edu_academic_degree" : null,
  "job_id" : null,
  "interview_info" : null,
  "description" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interview_feedbacks" : null,
}

```

## 删除候选人申请与面试关系

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicant_interviews/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新候选人申请与面试关系

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicant_interviews/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试时间|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">interview_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试信息|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">interview_feedbacks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "stage_id" : null,
  "start_time" : null,
  "duration" : null,
  "candidate_display_name" : null,
  "job_name" : null,
  "email_from" : null,
  "job_platform_id" : null,
  "experience" : null,
  "address" : null,
  "education" : null,
  "mobile_phone" : null,
  "job_platform_name" : null,
  "interview_type" : null,
  "start_date" : null,
  "owner_id" : null,
  "owner_name" : null,
  "last_edu_academic_degree" : null,
  "job_id" : null,
  "interview_info" : null,
  "description" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interview_feedbacks" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "stage_id" : null,
  "start_time" : null,
  "duration" : null,
  "candidate_display_name" : null,
  "job_name" : null,
  "email_from" : null,
  "job_platform_id" : null,
  "experience" : null,
  "address" : null,
  "education" : null,
  "mobile_phone" : null,
  "job_platform_name" : null,
  "interview_type" : null,
  "start_date" : null,
  "owner_id" : null,
  "owner_name" : null,
  "last_edu_academic_degree" : null,
  "job_id" : null,
  "interview_info" : null,
  "description" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interview_feedbacks" : null,
}

```

## 检查候选人申请与面试关系主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicant_interviews/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试时间|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">interview_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试信息|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">interview_feedbacks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "stage_id" : null,
  "start_time" : null,
  "duration" : null,
  "candidate_display_name" : null,
  "job_name" : null,
  "email_from" : null,
  "job_platform_id" : null,
  "experience" : null,
  "address" : null,
  "education" : null,
  "mobile_phone" : null,
  "job_platform_name" : null,
  "interview_type" : null,
  "start_date" : null,
  "owner_id" : null,
  "owner_name" : null,
  "last_edu_academic_degree" : null,
  "job_id" : null,
  "interview_info" : null,
  "description" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interview_feedbacks" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取候选人申请与面试关系草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicant_interviews/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试时间|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">interview_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试信息|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">interview_feedbacks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "stage_id" : null,
  "start_time" : null,
  "duration" : null,
  "candidate_display_name" : null,
  "job_name" : null,
  "email_from" : null,
  "job_platform_id" : null,
  "experience" : null,
  "address" : null,
  "education" : null,
  "mobile_phone" : null,
  "job_platform_name" : null,
  "interview_type" : null,
  "start_date" : null,
  "owner_id" : null,
  "owner_name" : null,
  "last_edu_academic_degree" : null,
  "job_id" : null,
  "interview_info" : null,
  "description" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interview_feedbacks" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "stage_id" : null,
  "start_time" : null,
  "duration" : null,
  "candidate_display_name" : null,
  "job_name" : null,
  "email_from" : null,
  "job_platform_id" : null,
  "experience" : null,
  "address" : null,
  "education" : null,
  "mobile_phone" : null,
  "job_platform_name" : null,
  "interview_type" : null,
  "start_date" : null,
  "owner_id" : null,
  "owner_name" : null,
  "last_edu_academic_degree" : null,
  "job_id" : null,
  "interview_info" : null,
  "description" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interview_feedbacks" : null,
}

```

## 保存候选人申请与面试关系

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicant_interviews/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试时间|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">interview_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试信息|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">interview_feedbacks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "stage_id" : null,
  "start_time" : null,
  "duration" : null,
  "candidate_display_name" : null,
  "job_name" : null,
  "email_from" : null,
  "job_platform_id" : null,
  "experience" : null,
  "address" : null,
  "education" : null,
  "mobile_phone" : null,
  "job_platform_name" : null,
  "interview_type" : null,
  "start_date" : null,
  "owner_id" : null,
  "owner_name" : null,
  "last_edu_academic_degree" : null,
  "job_id" : null,
  "interview_info" : null,
  "description" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interview_feedbacks" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "stage_id" : null,
  "start_time" : null,
  "duration" : null,
  "candidate_display_name" : null,
  "job_name" : null,
  "email_from" : null,
  "job_platform_id" : null,
  "experience" : null,
  "address" : null,
  "education" : null,
  "mobile_phone" : null,
  "job_platform_name" : null,
  "interview_type" : null,
  "start_date" : null,
  "owner_id" : null,
  "owner_name" : null,
  "last_edu_academic_degree" : null,
  "job_id" : null,
  "interview_info" : null,
  "description" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
  "interview_feedbacks" : null,
}

```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicant_interviews/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_candidate_display_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_start_date_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试时间|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_eq" : null,
  "n_applicant_id_eq" : null,
  "n_candidate_display_name_like" : null,
  "n_id_eq" : null,
  "n_interview_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_job_id_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_start_date_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "stage_id" : null,
    "start_time" : null,
    "duration" : null,
    "candidate_display_name" : null,
    "job_name" : null,
    "email_from" : null,
    "job_platform_id" : null,
    "experience" : null,
    "address" : null,
    "education" : null,
    "mobile_phone" : null,
    "job_platform_name" : null,
    "interview_type" : null,
    "start_date" : null,
    "owner_id" : null,
    "owner_name" : null,
    "last_edu_academic_degree" : null,
    "job_id" : null,
    "interview_info" : null,
    "description" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "interview_id" : null,
    "name" : null,
    "write_date" : null,
    "write_uid" : null,
    "interview_feedbacks" : null,
  }
]
```

## 面试安排

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicant_interviews/fetch_interview_list" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_candidate_display_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_start_date_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试时间|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_eq" : null,
  "n_applicant_id_eq" : null,
  "n_candidate_display_name_like" : null,
  "n_id_eq" : null,
  "n_interview_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_job_id_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_start_date_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "stage_id" : null,
    "start_time" : null,
    "duration" : null,
    "candidate_display_name" : null,
    "job_name" : null,
    "email_from" : null,
    "job_platform_id" : null,
    "experience" : null,
    "address" : null,
    "education" : null,
    "mobile_phone" : null,
    "job_platform_name" : null,
    "interview_type" : null,
    "start_date" : null,
    "owner_id" : null,
    "owner_name" : null,
    "last_edu_academic_degree" : null,
    "job_id" : null,
    "interview_info" : null,
    "description" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "interview_id" : null,
    "name" : null,
    "write_date" : null,
    "write_uid" : null,
    "interview_feedbacks" : null,
  }
]
```

## 我的面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicant_interviews/fetch_my_interview" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_candidate_display_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_start_date_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试时间|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_eq" : null,
  "n_applicant_id_eq" : null,
  "n_candidate_display_name_like" : null,
  "n_id_eq" : null,
  "n_interview_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_job_id_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_start_date_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "stage_id" : null,
    "start_time" : null,
    "duration" : null,
    "candidate_display_name" : null,
    "job_name" : null,
    "email_from" : null,
    "job_platform_id" : null,
    "experience" : null,
    "address" : null,
    "education" : null,
    "mobile_phone" : null,
    "job_platform_name" : null,
    "interview_type" : null,
    "start_date" : null,
    "owner_id" : null,
    "owner_name" : null,
    "last_edu_academic_degree" : null,
    "job_id" : null,
    "interview_info" : null,
    "description" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "interview_id" : null,
    "name" : null,
    "write_date" : null,
    "write_uid" : null,
    "interview_feedbacks" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicant_interviews/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicant_interviews/exportdata/{param},/hr_applicant_interviews/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicant_interviews/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicant_interviews/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicant_interviews/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicant_interviews/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicant_interviews/report" type="info" :closable="false" ></el-alert>
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