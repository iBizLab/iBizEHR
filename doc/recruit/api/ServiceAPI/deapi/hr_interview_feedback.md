# 面试反馈(hr_interview_feedback) :id=hr_interview_feedback
## 创建面试反馈

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">result_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">is_next_round</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否可进入下轮面试|
|<el-row justify="space-between"><el-col :span="20">video_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议链接|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">applicant_interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">daycalc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|距今|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">interview_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取面试反馈

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/{key}" type="info" :closable="false" ></el-alert>
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
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除面试反馈

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新面试反馈

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">result_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">is_next_round</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否可进入下轮面试|
|<el-row justify="space-between"><el-col :span="20">video_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议链接|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">applicant_interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">daycalc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|距今|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">interview_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查面试反馈主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">result_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">is_next_round</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否可进入下轮面试|
|<el-row justify="space-between"><el-col :span="20">video_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议链接|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">applicant_interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">daycalc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|距今|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">interview_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取面试反馈草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">result_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">is_next_round</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否可进入下轮面试|
|<el-row justify="space-between"><el-col :span="20">video_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议链接|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">applicant_interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">daycalc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|距今|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">interview_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 用人经理-我的面试-搜索栏计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/my_interview_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">result_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">is_next_round</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否可进入下轮面试|
|<el-row justify="space-between"><el-col :span="20">video_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议链接|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">applicant_interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">daycalc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|距今|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">interview_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存面试反馈

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">result_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">is_next_round</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否可进入下轮面试|
|<el-row justify="space-between"><el-col :span="20">video_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议链接|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">applicant_interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">daycalc</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|距今|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">interview_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">interview_user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">interviewer_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|



##### 请求示例： {docsify-ignore}
```json
{
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "result_type" : null,
  "is_next_round" : null,
  "video_url" : null,
  "job_id" : null,
  "owner_id" : null,
  "interview_type" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "owner_name" : null,
  "start_date" : null,
  "stage_id" : null,
  "applicant_interview_id" : null,
  "start_time" : null,
  "job_platform_name" : null,
  "email_from" : null,
  "experience" : null,
  "last_edu_academic_degree" : null,
  "address" : null,
  "description" : null,
  "status" : null,
  "daycalc" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "interview_id" : null,
  "interview_user_id" : null,
  "interviewer_id" : null,
  "interviewer_name" : null,
  "name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 今后的面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/fetch_after_interview" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_applicant_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">n_candidate_display_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_interview_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_result_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnotnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_start_date_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_applicant_id_eq" : null,
  "n_applicant_interview_id_eq" : null,
  "n_candidate_display_name_like" : null,
  "n_id_eq" : null,
  "n_interview_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_interview_user_id_eq" : null,
  "n_interviewer_id_eq" : null,
  "n_interviewer_name_eq" : null,
  "n_interviewer_name_like" : null,
  "n_job_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_result_type_eq" : null,
  "n_result_type_isnotnull" : null,
  "n_result_type_isnull" : null,
  "n_start_date_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "result_type" : null,
    "is_next_round" : null,
    "video_url" : null,
    "job_id" : null,
    "owner_id" : null,
    "interview_type" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "owner_name" : null,
    "start_date" : null,
    "stage_id" : null,
    "applicant_interview_id" : null,
    "start_time" : null,
    "job_platform_name" : null,
    "email_from" : null,
    "experience" : null,
    "last_edu_academic_degree" : null,
    "address" : null,
    "description" : null,
    "status" : null,
    "daycalc" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "interview_id" : null,
    "interview_user_id" : null,
    "interviewer_id" : null,
    "interviewer_name" : null,
    "name" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 之前的面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/fetch_before_interview" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_applicant_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">n_candidate_display_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_interview_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_result_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnotnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_start_date_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_applicant_id_eq" : null,
  "n_applicant_interview_id_eq" : null,
  "n_candidate_display_name_like" : null,
  "n_id_eq" : null,
  "n_interview_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_interview_user_id_eq" : null,
  "n_interviewer_id_eq" : null,
  "n_interviewer_name_eq" : null,
  "n_interviewer_name_like" : null,
  "n_job_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_result_type_eq" : null,
  "n_result_type_isnotnull" : null,
  "n_result_type_isnull" : null,
  "n_start_date_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "result_type" : null,
    "is_next_round" : null,
    "video_url" : null,
    "job_id" : null,
    "owner_id" : null,
    "interview_type" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "owner_name" : null,
    "start_date" : null,
    "stage_id" : null,
    "applicant_interview_id" : null,
    "start_time" : null,
    "job_platform_name" : null,
    "email_from" : null,
    "experience" : null,
    "last_edu_academic_degree" : null,
    "address" : null,
    "description" : null,
    "status" : null,
    "daycalc" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "interview_id" : null,
    "interview_user_id" : null,
    "interviewer_id" : null,
    "interviewer_name" : null,
    "name" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 今天的面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/fetch_current_interview" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_applicant_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">n_candidate_display_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_interview_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_result_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnotnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_start_date_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_applicant_id_eq" : null,
  "n_applicant_interview_id_eq" : null,
  "n_candidate_display_name_like" : null,
  "n_id_eq" : null,
  "n_interview_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_interview_user_id_eq" : null,
  "n_interviewer_id_eq" : null,
  "n_interviewer_name_eq" : null,
  "n_interviewer_name_like" : null,
  "n_job_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_result_type_eq" : null,
  "n_result_type_isnotnull" : null,
  "n_result_type_isnull" : null,
  "n_start_date_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "result_type" : null,
    "is_next_round" : null,
    "video_url" : null,
    "job_id" : null,
    "owner_id" : null,
    "interview_type" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "owner_name" : null,
    "start_date" : null,
    "stage_id" : null,
    "applicant_interview_id" : null,
    "start_time" : null,
    "job_platform_name" : null,
    "email_from" : null,
    "experience" : null,
    "last_edu_academic_degree" : null,
    "address" : null,
    "description" : null,
    "status" : null,
    "daycalc" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "interview_id" : null,
    "interview_user_id" : null,
    "interviewer_id" : null,
    "interviewer_name" : null,
    "name" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_applicant_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">n_candidate_display_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_interview_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_result_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnotnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_start_date_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_applicant_id_eq" : null,
  "n_applicant_interview_id_eq" : null,
  "n_candidate_display_name_like" : null,
  "n_id_eq" : null,
  "n_interview_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_interview_user_id_eq" : null,
  "n_interviewer_id_eq" : null,
  "n_interviewer_name_eq" : null,
  "n_interviewer_name_like" : null,
  "n_job_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_result_type_eq" : null,
  "n_result_type_isnotnull" : null,
  "n_result_type_isnull" : null,
  "n_start_date_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "result_type" : null,
    "is_next_round" : null,
    "video_url" : null,
    "job_id" : null,
    "owner_id" : null,
    "interview_type" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "owner_name" : null,
    "start_date" : null,
    "stage_id" : null,
    "applicant_interview_id" : null,
    "start_time" : null,
    "job_platform_name" : null,
    "email_from" : null,
    "experience" : null,
    "last_edu_academic_degree" : null,
    "address" : null,
    "description" : null,
    "status" : null,
    "daycalc" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "interview_id" : null,
    "interview_user_id" : null,
    "interviewer_id" : null,
    "interviewer_name" : null,
    "name" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 用人经理_我的面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/fetch_interview_myself" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_applicant_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">n_candidate_display_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_interview_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_result_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnotnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_start_date_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_applicant_id_eq" : null,
  "n_applicant_interview_id_eq" : null,
  "n_candidate_display_name_like" : null,
  "n_id_eq" : null,
  "n_interview_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_interview_user_id_eq" : null,
  "n_interviewer_id_eq" : null,
  "n_interviewer_name_eq" : null,
  "n_interviewer_name_like" : null,
  "n_job_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_result_type_eq" : null,
  "n_result_type_isnotnull" : null,
  "n_result_type_isnull" : null,
  "n_start_date_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "result_type" : null,
    "is_next_round" : null,
    "video_url" : null,
    "job_id" : null,
    "owner_id" : null,
    "interview_type" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "owner_name" : null,
    "start_date" : null,
    "stage_id" : null,
    "applicant_interview_id" : null,
    "start_time" : null,
    "job_platform_name" : null,
    "email_from" : null,
    "experience" : null,
    "last_edu_academic_degree" : null,
    "address" : null,
    "description" : null,
    "status" : null,
    "daycalc" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "interview_id" : null,
    "interview_user_id" : null,
    "interviewer_id" : null,
    "interviewer_name" : null,
    "name" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 通过的面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/fetch_pass_interview" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_applicant_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">n_candidate_display_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_interview_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_result_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnotnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_start_date_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_applicant_id_eq" : null,
  "n_applicant_interview_id_eq" : null,
  "n_candidate_display_name_like" : null,
  "n_id_eq" : null,
  "n_interview_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_interview_user_id_eq" : null,
  "n_interviewer_id_eq" : null,
  "n_interviewer_name_eq" : null,
  "n_interviewer_name_like" : null,
  "n_job_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_result_type_eq" : null,
  "n_result_type_isnotnull" : null,
  "n_result_type_isnull" : null,
  "n_start_date_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "result_type" : null,
    "is_next_round" : null,
    "video_url" : null,
    "job_id" : null,
    "owner_id" : null,
    "interview_type" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "owner_name" : null,
    "start_date" : null,
    "stage_id" : null,
    "applicant_interview_id" : null,
    "start_time" : null,
    "job_platform_name" : null,
    "email_from" : null,
    "experience" : null,
    "last_edu_academic_degree" : null,
    "address" : null,
    "description" : null,
    "status" : null,
    "daycalc" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "interview_id" : null,
    "interview_user_id" : null,
    "interviewer_id" : null,
    "interviewer_name" : null,
    "name" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 待反馈面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interview_feedbacks/fetch_unevaluated" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_applicant_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请与面试关系|
|<el-row justify="space-between"><el-col :span="20">n_candidate_display_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_interview_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_interviewer_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_result_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnotnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_result_type_isnull</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">n_start_date_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_applicant_id_eq" : null,
  "n_applicant_interview_id_eq" : null,
  "n_candidate_display_name_like" : null,
  "n_id_eq" : null,
  "n_interview_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_interview_user_id_eq" : null,
  "n_interviewer_id_eq" : null,
  "n_interviewer_name_eq" : null,
  "n_interviewer_name_like" : null,
  "n_job_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_result_type_eq" : null,
  "n_result_type_isnotnull" : null,
  "n_result_type_isnull" : null,
  "n_start_date_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "result_type" : null,
    "is_next_round" : null,
    "video_url" : null,
    "job_id" : null,
    "owner_id" : null,
    "interview_type" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "owner_name" : null,
    "start_date" : null,
    "stage_id" : null,
    "applicant_interview_id" : null,
    "start_time" : null,
    "job_platform_name" : null,
    "email_from" : null,
    "experience" : null,
    "last_edu_academic_degree" : null,
    "address" : null,
    "description" : null,
    "status" : null,
    "daycalc" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "interview_id" : null,
    "interview_user_id" : null,
    "interviewer_id" : null,
    "interviewer_name" : null,
    "name" : null,
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
<el-alert title="/hr_interview_feedbacks/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_feedbacks/exportdata/{param},/hr_interview_feedbacks/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_feedbacks/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_feedbacks/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_feedbacks/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_feedbacks/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interview_feedbacks/report" type="info" :closable="false" ></el-alert>
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