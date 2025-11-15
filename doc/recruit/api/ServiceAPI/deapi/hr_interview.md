# 面试(hr_interview) :id=hr_interview
## 创建面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">meeting_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议号|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">interview_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">interviewers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">applicant_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">schedule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">candidates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_interview_feedbacks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "duration" : null,
  "start_time" : null,
  "status" : null,
  "stage_id" : null,
  "meeting_id" : null,
  "start_date" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "interview_result" : null,
  "interview_type" : null,
  "interviewers" : null,
  "applicant_ids" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "schedule_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "candidates" : null,
  "hr_interview_feedbacks" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "duration" : null,
  "start_time" : null,
  "status" : null,
  "stage_id" : null,
  "meeting_id" : null,
  "start_date" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "interview_result" : null,
  "interview_type" : null,
  "interviewers" : null,
  "applicant_ids" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "schedule_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "candidates" : null,
  "hr_interview_feedbacks" : null,
}

```

## 获取面试

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/{key}" type="info" :closable="false" ></el-alert>
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
  "duration" : null,
  "start_time" : null,
  "status" : null,
  "stage_id" : null,
  "meeting_id" : null,
  "start_date" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "interview_result" : null,
  "interview_type" : null,
  "interviewers" : null,
  "applicant_ids" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "schedule_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "candidates" : null,
  "hr_interview_feedbacks" : null,
}

```

## 删除面试

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新面试

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">meeting_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议号|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">interview_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">interviewers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">applicant_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">schedule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">candidates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_interview_feedbacks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "duration" : null,
  "start_time" : null,
  "status" : null,
  "stage_id" : null,
  "meeting_id" : null,
  "start_date" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "interview_result" : null,
  "interview_type" : null,
  "interviewers" : null,
  "applicant_ids" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "schedule_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "candidates" : null,
  "hr_interview_feedbacks" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "duration" : null,
  "start_time" : null,
  "status" : null,
  "stage_id" : null,
  "meeting_id" : null,
  "start_date" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "interview_result" : null,
  "interview_type" : null,
  "interviewers" : null,
  "applicant_ids" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "schedule_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "candidates" : null,
  "hr_interview_feedbacks" : null,
}

```

## 检查面试主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">meeting_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议号|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">interview_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">interviewers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">applicant_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">schedule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">candidates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_interview_feedbacks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "duration" : null,
  "start_time" : null,
  "status" : null,
  "stage_id" : null,
  "meeting_id" : null,
  "start_date" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "interview_result" : null,
  "interview_type" : null,
  "interviewers" : null,
  "applicant_ids" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "schedule_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "candidates" : null,
  "hr_interview_feedbacks" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取面试草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">meeting_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议号|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">interview_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">interviewers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">applicant_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">schedule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">candidates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_interview_feedbacks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "duration" : null,
  "start_time" : null,
  "status" : null,
  "stage_id" : null,
  "meeting_id" : null,
  "start_date" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "interview_result" : null,
  "interview_type" : null,
  "interviewers" : null,
  "applicant_ids" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "schedule_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "candidates" : null,
  "hr_interview_feedbacks" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "duration" : null,
  "start_time" : null,
  "status" : null,
  "stage_id" : null,
  "meeting_id" : null,
  "start_date" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "interview_result" : null,
  "interview_type" : null,
  "interviewers" : null,
  "applicant_ids" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "schedule_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "candidates" : null,
  "hr_interview_feedbacks" : null,
}

```

## 行为

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/{key}/nothing" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">meeting_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议号|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">interview_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">interviewers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">applicant_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">schedule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">candidates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_interview_feedbacks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "duration" : null,
  "start_time" : null,
  "status" : null,
  "stage_id" : null,
  "meeting_id" : null,
  "start_date" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "interview_result" : null,
  "interview_type" : null,
  "interviewers" : null,
  "applicant_ids" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "schedule_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "candidates" : null,
  "hr_interview_feedbacks" : null,
}
```



## 保存面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">duration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">start_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">meeting_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会议号|
|<el-row justify="space-between"><el-col :span="20">start_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|面试日期|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系方式|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">interview_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试结果|
|<el-row justify="space-between"><el-col :span="20">interview_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">interviewers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">applicant_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">schedule_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">candidates</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_interview_feedbacks</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "duration" : null,
  "start_time" : null,
  "status" : null,
  "stage_id" : null,
  "meeting_id" : null,
  "start_date" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "interview_result" : null,
  "interview_type" : null,
  "interviewers" : null,
  "applicant_ids" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "schedule_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "candidates" : null,
  "hr_interview_feedbacks" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "duration" : null,
  "start_time" : null,
  "status" : null,
  "stage_id" : null,
  "meeting_id" : null,
  "start_date" : null,
  "address_id" : null,
  "candidate_display_name" : null,
  "mobile_phone" : null,
  "job_name" : null,
  "interview_result" : null,
  "interview_type" : null,
  "interviewers" : null,
  "applicant_ids" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "schedule_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "candidates" : null,
  "hr_interview_feedbacks" : null,
}

```

## 今后之后的面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/fetch_after_interview" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_duration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_schedule_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">n_stage_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">n_start_time_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_duration_eq" : null,
  "n_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_job_name_eq" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_owner_name_eq" : null,
  "n_owner_name_like" : null,
  "n_schedule_id_eq" : null,
  "n_stage_id_eq" : null,
  "n_start_time_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "duration" : null,
    "start_time" : null,
    "status" : null,
    "stage_id" : null,
    "meeting_id" : null,
    "start_date" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "interview_result" : null,
    "interview_type" : null,
    "interviewers" : null,
    "applicant_ids" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "name" : null,
    "owner_id" : null,
    "owner_name" : null,
    "schedule_id" : null,
    "write_date" : null,
    "write_uid" : null,
    "candidates" : null,
    "hr_interview_feedbacks" : null,
  }
]
```

## 今天之前的面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/fetch_before_interview" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_duration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_schedule_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">n_stage_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">n_start_time_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_duration_eq" : null,
  "n_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_job_name_eq" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_owner_name_eq" : null,
  "n_owner_name_like" : null,
  "n_schedule_id_eq" : null,
  "n_stage_id_eq" : null,
  "n_start_time_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "duration" : null,
    "start_time" : null,
    "status" : null,
    "stage_id" : null,
    "meeting_id" : null,
    "start_date" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "interview_result" : null,
    "interview_type" : null,
    "interviewers" : null,
    "applicant_ids" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "name" : null,
    "owner_id" : null,
    "owner_name" : null,
    "schedule_id" : null,
    "write_date" : null,
    "write_uid" : null,
    "candidates" : null,
    "hr_interview_feedbacks" : null,
  }
]
```

## bi_search

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/fetch_bi_search" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_duration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_schedule_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">n_stage_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">n_start_time_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_duration_eq" : null,
  "n_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_job_name_eq" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_owner_name_eq" : null,
  "n_owner_name_like" : null,
  "n_schedule_id_eq" : null,
  "n_stage_id_eq" : null,
  "n_start_time_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "duration" : null,
    "start_time" : null,
    "status" : null,
    "stage_id" : null,
    "meeting_id" : null,
    "start_date" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "interview_result" : null,
    "interview_type" : null,
    "interviewers" : null,
    "applicant_ids" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "name" : null,
    "owner_id" : null,
    "owner_name" : null,
    "schedule_id" : null,
    "write_date" : null,
    "write_uid" : null,
    "candidates" : null,
    "hr_interview_feedbacks" : null,
  }
]
```

## 今天的面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/fetch_current_interview" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_duration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_schedule_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">n_stage_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">n_start_time_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_duration_eq" : null,
  "n_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_job_name_eq" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_owner_name_eq" : null,
  "n_owner_name_like" : null,
  "n_schedule_id_eq" : null,
  "n_stage_id_eq" : null,
  "n_start_time_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "duration" : null,
    "start_time" : null,
    "status" : null,
    "stage_id" : null,
    "meeting_id" : null,
    "start_date" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "interview_result" : null,
    "interview_type" : null,
    "interviewers" : null,
    "applicant_ids" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "name" : null,
    "owner_id" : null,
    "owner_name" : null,
    "schedule_id" : null,
    "write_date" : null,
    "write_uid" : null,
    "candidates" : null,
    "hr_interview_feedbacks" : null,
  }
]
```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_duration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_schedule_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">n_stage_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">n_start_time_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_duration_eq" : null,
  "n_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_job_name_eq" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_owner_name_eq" : null,
  "n_owner_name_like" : null,
  "n_schedule_id_eq" : null,
  "n_stage_id_eq" : null,
  "n_start_time_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "duration" : null,
    "start_time" : null,
    "status" : null,
    "stage_id" : null,
    "meeting_id" : null,
    "start_date" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "interview_result" : null,
    "interview_type" : null,
    "interviewers" : null,
    "applicant_ids" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "name" : null,
    "owner_id" : null,
    "owner_name" : null,
    "schedule_id" : null,
    "write_date" : null,
    "write_uid" : null,
    "candidates" : null,
    "hr_interview_feedbacks" : null,
  }
]
```

## 我的面试

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/fetch_my_interview" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试地点|
|<el-row justify="space-between"><el-col :span="20">n_duration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时长|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_interview_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试类型|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘职位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试负责人|
|<el-row justify="space-between"><el-col :span="20">n_schedule_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试安排|
|<el-row justify="space-between"><el-col :span="20">n_stage_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试阶段|
|<el-row justify="space-between"><el-col :span="20">n_start_time_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试时间|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_duration_eq" : null,
  "n_id_eq" : null,
  "n_interview_type_eq" : null,
  "n_job_name_eq" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_owner_name_eq" : null,
  "n_owner_name_like" : null,
  "n_schedule_id_eq" : null,
  "n_stage_id_eq" : null,
  "n_start_time_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "duration" : null,
    "start_time" : null,
    "status" : null,
    "stage_id" : null,
    "meeting_id" : null,
    "start_date" : null,
    "address_id" : null,
    "candidate_display_name" : null,
    "mobile_phone" : null,
    "job_name" : null,
    "interview_result" : null,
    "interview_type" : null,
    "interviewers" : null,
    "applicant_ids" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "name" : null,
    "owner_id" : null,
    "owner_name" : null,
    "schedule_id" : null,
    "write_date" : null,
    "write_uid" : null,
    "candidates" : null,
    "hr_interview_feedbacks" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_interviews/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interviews/exportdata/{param},/hr_interviews/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interviews/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interviews/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interviews/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interviews/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_interviews/report" type="info" :closable="false" ></el-alert>
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