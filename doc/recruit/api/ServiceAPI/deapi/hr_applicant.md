# 候选人申请(hr_applicant) :id=hr_applicant
## 创建候选人申请

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}

```

## 获取候选人申请

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}" type="info" :closable="false" ></el-alert>
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
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}

```

## 删除候选人申请

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新候选人申请

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}

```

## 候选人申请_已读

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}/applicant_read" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```



## 检查候选人申请主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 添加关注

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}/favorite" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```



## 候选人状态筛选

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/get_applicant_state" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}

```

## 候选人基本信息导航栏计数

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}/get_baseinfo_page_count" type="info" :closable="false" ></el-alert>
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
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}

```

## 获取候选人申请草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}

```

## 获取工作台数据

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}/get_workspace_count" type="info" :closable="false" ></el-alert>
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
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}

```

## nothing

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}/nothing" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```



## 淘汰

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}/out" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```



## 推荐给用人部门

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}/recommend_department" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```



## 取消星标

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}/remove_favorite" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 保存候选人申请

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}

```

## 保存候选人申请信息

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}/save_applicant" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```



## 修改申请阶段

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{key}/update_stage" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">is_favorite</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否星标|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|描述|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人邮箱|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人所在地|
|<el-row justify="space-between"><el-col :span="20">resume_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人标签|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人照片|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">save_to_telent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">stage_sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">flow_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">is_recommended</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已推荐|
|<el-row justify="space-between"><el-col :span="20">is_offer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|已发送offer|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">applicant_notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请人备注|
|<el-row justify="space-between"><el-col :span="20">candidate_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">job_platform_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">owner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">salary_expected</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|期望薪资|
|<el-row justify="space-between"><el-col :span="20">salary_proposed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|建议薪资|
|<el-row justify="space-between"><el-col :span="20">stage_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_educations</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">hr_candidate_experiences</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "is_favorite" : null,
  "experience" : null,
  "description" : null,
  "email_from" : null,
  "mobile_phone" : null,
  "education" : null,
  "candidate_display_name" : null,
  "address" : null,
  "resume_source" : null,
  "birthday" : null,
  "gender" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "priority_id" : null,
  "tags" : null,
  "progress_id" : null,
  "image" : null,
  "candidate_name" : null,
  "save_to_telent_pool" : null,
  "stage_sequence" : null,
  "status" : null,
  "stage_name" : null,
  "flow_type" : null,
  "is_recommended" : null,
  "is_offer" : null,
  "manager_uid" : null,
  "applicant_notes" : null,
  "candidate_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "job_id" : null,
  "job_name" : null,
  "job_platform_id" : null,
  "job_platform_name" : null,
  "owner_id" : null,
  "owner_name" : null,
  "salary_expected" : null,
  "salary_proposed" : null,
  "stage_id" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_candidate_educations" : null,
  "hr_candidate_experiences" : null,
}

```

## 流程中的申请

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/fetch_active_applicant" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_candidate_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_flow_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">n_gender_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">n_resume_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">n_save_to_talent_pool_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">n_stage_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">n_stage_sequence_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_candidate_id_eq" : null,
  "n_candidate_name_eq" : null,
  "n_candidate_name_like" : null,
  "n_flow_type_eq" : null,
  "n_gender_eq" : null,
  "n_id_eq" : null,
  "n_job_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_job_platform_id_eq" : null,
  "n_job_platform_name_eq" : null,
  "n_job_platform_name_like" : null,
  "n_owner_id_eq" : null,
  "n_owner_name_eq" : null,
  "n_owner_name_like" : null,
  "n_resume_source_eq" : null,
  "n_save_to_talent_pool_eq" : null,
  "n_stage_id_eq" : null,
  "n_stage_sequence_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "is_favorite" : null,
    "experience" : null,
    "description" : null,
    "email_from" : null,
    "mobile_phone" : null,
    "education" : null,
    "candidate_display_name" : null,
    "address" : null,
    "resume_source" : null,
    "birthday" : null,
    "gender" : null,
    "last_exp_company" : null,
    "last_exp_job" : null,
    "last_exp_date" : null,
    "last_edu_school" : null,
    "last_edu_speciality" : null,
    "last_edu_academic_degree" : null,
    "last_edu_date" : null,
    "priority_id" : null,
    "tags" : null,
    "progress_id" : null,
    "image" : null,
    "candidate_name" : null,
    "save_to_telent_pool" : null,
    "stage_sequence" : null,
    "status" : null,
    "stage_name" : null,
    "flow_type" : null,
    "is_recommended" : null,
    "is_offer" : null,
    "manager_uid" : null,
    "applicant_notes" : null,
    "candidate_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "job_id" : null,
    "job_name" : null,
    "job_platform_id" : null,
    "job_platform_name" : null,
    "owner_id" : null,
    "owner_name" : null,
    "salary_expected" : null,
    "salary_proposed" : null,
    "stage_id" : null,
    "write_date" : null,
    "write_uid" : null,
    "hr_candidate_educations" : null,
    "hr_candidate_experiences" : null,
  }
]
```

## bi_search

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/fetch_bi_search" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_candidate_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_flow_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">n_gender_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">n_resume_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">n_save_to_talent_pool_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">n_stage_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">n_stage_sequence_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_candidate_id_eq" : null,
  "n_candidate_name_eq" : null,
  "n_candidate_name_like" : null,
  "n_flow_type_eq" : null,
  "n_gender_eq" : null,
  "n_id_eq" : null,
  "n_job_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_job_platform_id_eq" : null,
  "n_job_platform_name_eq" : null,
  "n_job_platform_name_like" : null,
  "n_owner_id_eq" : null,
  "n_owner_name_eq" : null,
  "n_owner_name_like" : null,
  "n_resume_source_eq" : null,
  "n_save_to_talent_pool_eq" : null,
  "n_stage_id_eq" : null,
  "n_stage_sequence_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "is_favorite" : null,
    "experience" : null,
    "description" : null,
    "email_from" : null,
    "mobile_phone" : null,
    "education" : null,
    "candidate_display_name" : null,
    "address" : null,
    "resume_source" : null,
    "birthday" : null,
    "gender" : null,
    "last_exp_company" : null,
    "last_exp_job" : null,
    "last_exp_date" : null,
    "last_edu_school" : null,
    "last_edu_speciality" : null,
    "last_edu_academic_degree" : null,
    "last_edu_date" : null,
    "priority_id" : null,
    "tags" : null,
    "progress_id" : null,
    "image" : null,
    "candidate_name" : null,
    "save_to_telent_pool" : null,
    "stage_sequence" : null,
    "status" : null,
    "stage_name" : null,
    "flow_type" : null,
    "is_recommended" : null,
    "is_offer" : null,
    "manager_uid" : null,
    "applicant_notes" : null,
    "candidate_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "job_id" : null,
    "job_name" : null,
    "job_platform_id" : null,
    "job_platform_name" : null,
    "owner_id" : null,
    "owner_name" : null,
    "salary_expected" : null,
    "salary_proposed" : null,
    "stage_id" : null,
    "write_date" : null,
    "write_uid" : null,
    "hr_candidate_educations" : null,
    "hr_candidate_experiences" : null,
  }
]
```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_candidate_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_flow_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">n_gender_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">n_resume_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">n_save_to_talent_pool_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">n_stage_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">n_stage_sequence_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_candidate_id_eq" : null,
  "n_candidate_name_eq" : null,
  "n_candidate_name_like" : null,
  "n_flow_type_eq" : null,
  "n_gender_eq" : null,
  "n_id_eq" : null,
  "n_job_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_job_platform_id_eq" : null,
  "n_job_platform_name_eq" : null,
  "n_job_platform_name_like" : null,
  "n_owner_id_eq" : null,
  "n_owner_name_eq" : null,
  "n_owner_name_like" : null,
  "n_resume_source_eq" : null,
  "n_save_to_talent_pool_eq" : null,
  "n_stage_id_eq" : null,
  "n_stage_sequence_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "is_favorite" : null,
    "experience" : null,
    "description" : null,
    "email_from" : null,
    "mobile_phone" : null,
    "education" : null,
    "candidate_display_name" : null,
    "address" : null,
    "resume_source" : null,
    "birthday" : null,
    "gender" : null,
    "last_exp_company" : null,
    "last_exp_job" : null,
    "last_exp_date" : null,
    "last_edu_school" : null,
    "last_edu_speciality" : null,
    "last_edu_academic_degree" : null,
    "last_edu_date" : null,
    "priority_id" : null,
    "tags" : null,
    "progress_id" : null,
    "image" : null,
    "candidate_name" : null,
    "save_to_telent_pool" : null,
    "stage_sequence" : null,
    "status" : null,
    "stage_name" : null,
    "flow_type" : null,
    "is_recommended" : null,
    "is_offer" : null,
    "manager_uid" : null,
    "applicant_notes" : null,
    "candidate_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "job_id" : null,
    "job_name" : null,
    "job_platform_id" : null,
    "job_platform_name" : null,
    "owner_id" : null,
    "owner_name" : null,
    "salary_expected" : null,
    "salary_proposed" : null,
    "stage_id" : null,
    "write_date" : null,
    "write_uid" : null,
    "hr_candidate_educations" : null,
    "hr_candidate_experiences" : null,
  }
]
```

## 查询星标

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/fetch_favorite" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_candidate_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">n_flow_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程类型|
|<el-row justify="space-between"><el-col :span="20">n_gender_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|求职岗位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">n_job_platform_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人名称|
|<el-row justify="space-between"><el-col :span="20">n_resume_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简历来源|
|<el-row justify="space-between"><el-col :span="20">n_save_to_talent_pool_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上传至人才库|
|<el-row justify="space-between"><el-col :span="20">n_stage_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘阶段|
|<el-row justify="space-between"><el-col :span="20">n_stage_sequence_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘阶段序号|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_candidate_id_eq" : null,
  "n_candidate_name_eq" : null,
  "n_candidate_name_like" : null,
  "n_flow_type_eq" : null,
  "n_gender_eq" : null,
  "n_id_eq" : null,
  "n_job_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_job_platform_id_eq" : null,
  "n_job_platform_name_eq" : null,
  "n_job_platform_name_like" : null,
  "n_owner_id_eq" : null,
  "n_owner_name_eq" : null,
  "n_owner_name_like" : null,
  "n_resume_source_eq" : null,
  "n_save_to_talent_pool_eq" : null,
  "n_stage_id_eq" : null,
  "n_stage_sequence_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "is_favorite" : null,
    "experience" : null,
    "description" : null,
    "email_from" : null,
    "mobile_phone" : null,
    "education" : null,
    "candidate_display_name" : null,
    "address" : null,
    "resume_source" : null,
    "birthday" : null,
    "gender" : null,
    "last_exp_company" : null,
    "last_exp_job" : null,
    "last_exp_date" : null,
    "last_edu_school" : null,
    "last_edu_speciality" : null,
    "last_edu_academic_degree" : null,
    "last_edu_date" : null,
    "priority_id" : null,
    "tags" : null,
    "progress_id" : null,
    "image" : null,
    "candidate_name" : null,
    "save_to_telent_pool" : null,
    "stage_sequence" : null,
    "status" : null,
    "stage_name" : null,
    "flow_type" : null,
    "is_recommended" : null,
    "is_offer" : null,
    "manager_uid" : null,
    "applicant_notes" : null,
    "candidate_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "job_id" : null,
    "job_name" : null,
    "job_platform_id" : null,
    "job_platform_name" : null,
    "owner_id" : null,
    "owner_name" : null,
    "salary_expected" : null,
    "salary_proposed" : null,
    "stage_id" : null,
    "write_date" : null,
    "write_uid" : null,
    "hr_candidate_educations" : null,
    "hr_candidate_experiences" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicants/exportdata/{param},/hr_applicants/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicants/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicants/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicants/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicants/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_applicants/report" type="info" :closable="false" ></el-alert>
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