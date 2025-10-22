# 招聘职位(hr_job) :id=hr_job
## 创建招聘职位

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否为虚拟职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门经理|
|<el-row justify="space-between"><el-col :span="20">source_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位来源|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位类别|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">hired_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职人数|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">job_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">function_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职能类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|岗位状态|
|<el-row justify="space-between"><el-col :span="20">assistant_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘协助人|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">interviewer_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">total_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人总数|
|<el-row justify="space-between"><el-col :span="20">job_platforms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘渠道|
|<el-row justify="space-between"><el-col :span="20">is_publish_social</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在社招官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_referral</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在内推官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_headhunter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发布到猎头|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位描述|
|<el-row justify="space-between"><el-col :span="20">expected_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘人数|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">progress_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">hr_job_platform_records</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}

```

## 获取招聘职位

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/{key}" type="info" :closable="false" ></el-alert>
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
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}

```

## 删除招聘职位

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新招聘职位

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否为虚拟职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门经理|
|<el-row justify="space-between"><el-col :span="20">source_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位来源|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位类别|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">hired_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职人数|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">job_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">function_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职能类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|岗位状态|
|<el-row justify="space-between"><el-col :span="20">assistant_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘协助人|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">interviewer_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">total_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人总数|
|<el-row justify="space-between"><el-col :span="20">job_platforms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘渠道|
|<el-row justify="space-between"><el-col :span="20">is_publish_social</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在社招官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_referral</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在内推官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_headhunter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发布到猎头|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位描述|
|<el-row justify="space-between"><el-col :span="20">expected_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘人数|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">progress_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">hr_job_platform_records</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}

```

## 检查招聘职位主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否为虚拟职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门经理|
|<el-row justify="space-between"><el-col :span="20">source_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位来源|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位类别|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">hired_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职人数|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">job_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">function_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职能类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|岗位状态|
|<el-row justify="space-between"><el-col :span="20">assistant_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘协助人|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">interviewer_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">total_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人总数|
|<el-row justify="space-between"><el-col :span="20">job_platforms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘渠道|
|<el-row justify="space-between"><el-col :span="20">is_publish_social</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在社招官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_referral</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在内推官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_headhunter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发布到猎头|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位描述|
|<el-row justify="space-between"><el-col :span="20">expected_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘人数|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">progress_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">hr_job_platform_records</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取招聘职位草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否为虚拟职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门经理|
|<el-row justify="space-between"><el-col :span="20">source_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位来源|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位类别|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">hired_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职人数|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">job_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">function_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职能类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|岗位状态|
|<el-row justify="space-between"><el-col :span="20">assistant_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘协助人|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">interviewer_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">total_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人总数|
|<el-row justify="space-between"><el-col :span="20">job_platforms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘渠道|
|<el-row justify="space-between"><el-col :span="20">is_publish_social</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在社招官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_referral</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在内推官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_headhunter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发布到猎头|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位描述|
|<el-row justify="space-between"><el-col :span="20">expected_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘人数|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">progress_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">hr_job_platform_records</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}

```

## 职位状态计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/job_status_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否为虚拟职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门经理|
|<el-row justify="space-between"><el-col :span="20">source_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位来源|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位类别|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">hired_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职人数|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">job_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">function_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职能类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|岗位状态|
|<el-row justify="space-between"><el-col :span="20">assistant_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘协助人|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">interviewer_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">total_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人总数|
|<el-row justify="space-between"><el-col :span="20">job_platforms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘渠道|
|<el-row justify="space-between"><el-col :span="20">is_publish_social</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在社招官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_referral</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在内推官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_headhunter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发布到猎头|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位描述|
|<el-row justify="space-between"><el-col :span="20">expected_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘人数|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">progress_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">hr_job_platform_records</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}

```

## 关联职位

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/{key}/join_idea_job" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否为虚拟职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门经理|
|<el-row justify="space-between"><el-col :span="20">source_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位来源|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位类别|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">hired_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职人数|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">job_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">function_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职能类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|岗位状态|
|<el-row justify="space-between"><el-col :span="20">assistant_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘协助人|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">interviewer_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">total_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人总数|
|<el-row justify="space-between"><el-col :span="20">job_platforms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘渠道|
|<el-row justify="space-between"><el-col :span="20">is_publish_social</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在社招官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_referral</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在内推官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_headhunter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发布到猎头|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位描述|
|<el-row justify="space-between"><el-col :span="20">expected_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘人数|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">progress_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">hr_job_platform_records</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}
```



## 保存招聘职位

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否为虚拟职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门经理|
|<el-row justify="space-between"><el-col :span="20">source_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位来源|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位类别|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">hired_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职人数|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">job_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">function_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职能类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|岗位状态|
|<el-row justify="space-between"><el-col :span="20">assistant_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘协助人|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">interviewer_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">total_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人总数|
|<el-row justify="space-between"><el-col :span="20">job_platforms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘渠道|
|<el-row justify="space-between"><el-col :span="20">is_publish_social</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在社招官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_referral</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在内推官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_headhunter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发布到猎头|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位描述|
|<el-row justify="space-between"><el-col :span="20">expected_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘人数|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">progress_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">hr_job_platform_records</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}

```

## 官网招聘职位申请信息保存

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/{key}/website_apply_save" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否为虚拟职位|
|<el-row justify="space-between"><el-col :span="20">owner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门经理|
|<el-row justify="space-between"><el-col :span="20">source_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位来源|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位类别|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">hired_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职人数|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">job_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">function_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职能类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|岗位状态|
|<el-row justify="space-between"><el-col :span="20">assistant_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘协助人|
|<el-row justify="space-between"><el-col :span="20">manager_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用人经理|
|<el-row justify="space-between"><el-col :span="20">interviewer_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|面试官|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|优先级|
|<el-row justify="space-between"><el-col :span="20">total_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人总数|
|<el-row justify="space-between"><el-col :span="20">job_platforms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘渠道|
|<el-row justify="space-between"><el-col :span="20">is_publish_social</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在社招官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_referral</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示在内推官网|
|<el-row justify="space-between"><el-col :span="20">is_publish_headhunter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发布到猎头|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位描述|
|<el-row justify="space-between"><el-col :span="20">expected_employees</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|招聘人数|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">progress_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">progress_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">hr_job_platform_records</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "min_salary" : null,
  "max_salary" : null,
  "address_id" : null,
  "is_virtual" : null,
  "owner_id" : null,
  "manager_id" : null,
  "source_type" : null,
  "category" : null,
  "department_id" : null,
  "job_type" : null,
  "hired_employees" : null,
  "experience" : null,
  "job_rank_ids" : null,
  "education" : null,
  "function_type" : null,
  "status" : null,
  "assistant_uid" : null,
  "manager_uid" : null,
  "interviewer_uid" : null,
  "priority_id" : null,
  "total_employees" : null,
  "job_platforms" : null,
  "is_publish_social" : null,
  "is_publish_referral" : null,
  "is_publish_headhunter" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "description" : null,
  "expected_employees" : null,
  "id" : null,
  "name" : null,
  "progress_id" : null,
  "progress_name" : null,
  "write_date" : null,
  "write_uid" : null,
  "hr_job_platform_records" : null,
}
```



## 全部数据（含渠道信息）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/fetch_all" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_education_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">n_experience_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">n_function_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职能类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_virtual_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否为虚拟职位|
|<el-row justify="space-between"><el-col :span="20">n_job_platforms_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘渠道|
|<el-row justify="space-between"><el-col :span="20">n_job_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">n_progress_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">n_progress_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">n_progress_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">n_source_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位来源|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|岗位状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_education_eq" : null,
  "n_experience_eq" : null,
  "n_function_type_eq" : null,
  "n_id_eq" : null,
  "n_is_virtual_eq" : null,
  "n_job_platforms_like" : null,
  "n_job_type_eq" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_progress_id_eq" : null,
  "n_progress_name_eq" : null,
  "n_progress_name_like" : null,
  "n_source_type_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "min_salary" : null,
    "max_salary" : null,
    "address_id" : null,
    "is_virtual" : null,
    "owner_id" : null,
    "manager_id" : null,
    "source_type" : null,
    "category" : null,
    "department_id" : null,
    "job_type" : null,
    "hired_employees" : null,
    "experience" : null,
    "job_rank_ids" : null,
    "education" : null,
    "function_type" : null,
    "status" : null,
    "assistant_uid" : null,
    "manager_uid" : null,
    "interviewer_uid" : null,
    "priority_id" : null,
    "total_employees" : null,
    "job_platforms" : null,
    "is_publish_social" : null,
    "is_publish_referral" : null,
    "is_publish_headhunter" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "description" : null,
    "expected_employees" : null,
    "id" : null,
    "name" : null,
    "progress_id" : null,
    "progress_name" : null,
    "write_date" : null,
    "write_uid" : null,
    "hr_job_platform_records" : null,
  }
]
```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_education_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">n_experience_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">n_function_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职能类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_virtual_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否为虚拟职位|
|<el-row justify="space-between"><el-col :span="20">n_job_platforms_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘渠道|
|<el-row justify="space-between"><el-col :span="20">n_job_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">n_progress_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">n_progress_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">n_progress_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">n_source_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位来源|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|岗位状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_education_eq" : null,
  "n_experience_eq" : null,
  "n_function_type_eq" : null,
  "n_id_eq" : null,
  "n_is_virtual_eq" : null,
  "n_job_platforms_like" : null,
  "n_job_type_eq" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_progress_id_eq" : null,
  "n_progress_name_eq" : null,
  "n_progress_name_like" : null,
  "n_source_type_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "min_salary" : null,
    "max_salary" : null,
    "address_id" : null,
    "is_virtual" : null,
    "owner_id" : null,
    "manager_id" : null,
    "source_type" : null,
    "category" : null,
    "department_id" : null,
    "job_type" : null,
    "hired_employees" : null,
    "experience" : null,
    "job_rank_ids" : null,
    "education" : null,
    "function_type" : null,
    "status" : null,
    "assistant_uid" : null,
    "manager_uid" : null,
    "interviewer_uid" : null,
    "priority_id" : null,
    "total_employees" : null,
    "job_platforms" : null,
    "is_publish_social" : null,
    "is_publish_referral" : null,
    "is_publish_headhunter" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "description" : null,
    "expected_employees" : null,
    "id" : null,
    "name" : null,
    "progress_id" : null,
    "progress_name" : null,
    "write_date" : null,
    "write_uid" : null,
    "hr_job_platform_records" : null,
  }
]
```

## 招聘中

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/fetch_open" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_education_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">n_experience_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">n_function_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职能类型|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_is_virtual_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|是否为虚拟职位|
|<el-row justify="space-between"><el-col :span="20">n_job_platforms_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘渠道|
|<el-row justify="space-between"><el-col :span="20">n_job_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_owner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘负责人|
|<el-row justify="space-between"><el-col :span="20">n_progress_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程|
|<el-row justify="space-between"><el-col :span="20">n_progress_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">n_progress_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘流程名称|
|<el-row justify="space-between"><el-col :span="20">n_source_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位来源|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|岗位状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_education_eq" : null,
  "n_experience_eq" : null,
  "n_function_type_eq" : null,
  "n_id_eq" : null,
  "n_is_virtual_eq" : null,
  "n_job_platforms_like" : null,
  "n_job_type_eq" : null,
  "n_name_like" : null,
  "n_owner_id_eq" : null,
  "n_progress_id_eq" : null,
  "n_progress_name_eq" : null,
  "n_progress_name_like" : null,
  "n_source_type_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "min_salary" : null,
    "max_salary" : null,
    "address_id" : null,
    "is_virtual" : null,
    "owner_id" : null,
    "manager_id" : null,
    "source_type" : null,
    "category" : null,
    "department_id" : null,
    "job_type" : null,
    "hired_employees" : null,
    "experience" : null,
    "job_rank_ids" : null,
    "education" : null,
    "function_type" : null,
    "status" : null,
    "assistant_uid" : null,
    "manager_uid" : null,
    "interviewer_uid" : null,
    "priority_id" : null,
    "total_employees" : null,
    "job_platforms" : null,
    "is_publish_social" : null,
    "is_publish_referral" : null,
    "is_publish_headhunter" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "description" : null,
    "expected_employees" : null,
    "id" : null,
    "name" : null,
    "progress_id" : null,
    "progress_name" : null,
    "write_date" : null,
    "write_uid" : null,
    "hr_job_platform_records" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_jobs/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_jobs/exportdata/{param},/hr_jobs/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_jobs/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_jobs/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_jobs/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_jobs/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_jobs/report" type="info" :closable="false" ></el-alert>
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