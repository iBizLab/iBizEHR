# 筛选候选人明细(hr_candidate_filter_detail) :id=hr_candidate_filter_detail
## 创建筛选候选人明细

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">memo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请标识|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">applicant_create_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">feedback_information</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|反馈信息|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">candidate_filter_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|筛选|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取筛选候选人明细

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/{key}" type="info" :closable="false" ></el-alert>
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
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除筛选候选人明细

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新筛选候选人明细

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">memo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请标识|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">applicant_create_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">feedback_information</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|反馈信息|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">candidate_filter_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|筛选|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查筛选候选人明细主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">memo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请标识|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">applicant_create_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">feedback_information</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|反馈信息|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">candidate_filter_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|筛选|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 筛选人数

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/{key}/filter_count" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">memo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请标识|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">applicant_create_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">feedback_information</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|反馈信息|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">candidate_filter_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|筛选|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 获取筛选候选人明细草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">memo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请标识|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">applicant_create_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">feedback_information</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|反馈信息|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">candidate_filter_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|筛选|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 用人经理-简历筛选-搜索栏计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/my_filter_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">memo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请标识|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">applicant_create_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">feedback_information</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|反馈信息|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">candidate_filter_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|筛选|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存筛选候选人明细

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">memo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请标识|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户姓名|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">priority_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">applicant_create_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">feedback_information</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|反馈信息|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘平台|
|<el-row justify="space-between"><el-col :span="20">candidate_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人名称|
|<el-row justify="space-between"><el-col :span="20">stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名|
|<el-row justify="space-between"><el-col :span="20">candidate_filter_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|筛选|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "type" : null,
  "status" : null,
  "content" : null,
  "memo" : null,
  "applicant_id" : null,
  "user_name" : null,
  "job_name" : null,
  "priority_id" : null,
  "applicant_create_date" : null,
  "feedback_information" : null,
  "address" : null,
  "experience" : null,
  "last_edu_school" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "education" : null,
  "job_platform_name" : null,
  "candidate_name" : null,
  "description" : null,
  "last_edu_academic_degree" : null,
  "candidate_display_name" : null,
  "stage_name" : null,
  "candidate_filter_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请标识|
|<el-row justify="space-between"><el-col :span="20">n_candidate_filter_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|筛选|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_priority_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">n_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_applicant_id_eq" : null,
  "n_candidate_filter_id_eq" : null,
  "n_candidate_name_eq" : null,
  "n_candidate_name_like" : null,
  "n_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_priority_id_eq" : null,
  "n_status_eq" : null,
  "n_type_eq" : null,
  "n_user_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "type" : null,
    "status" : null,
    "content" : null,
    "memo" : null,
    "applicant_id" : null,
    "user_name" : null,
    "job_name" : null,
    "priority_id" : null,
    "applicant_create_date" : null,
    "feedback_information" : null,
    "address" : null,
    "experience" : null,
    "last_edu_school" : null,
    "mobile_phone" : null,
    "email_from" : null,
    "education" : null,
    "job_platform_name" : null,
    "candidate_name" : null,
    "description" : null,
    "last_edu_academic_degree" : null,
    "candidate_display_name" : null,
    "stage_name" : null,
    "candidate_filter_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "name" : null,
    "user_id" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 已评价

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/fetch_evaluated" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请标识|
|<el-row justify="space-between"><el-col :span="20">n_candidate_filter_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|筛选|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_priority_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">n_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_applicant_id_eq" : null,
  "n_candidate_filter_id_eq" : null,
  "n_candidate_name_eq" : null,
  "n_candidate_name_like" : null,
  "n_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_priority_id_eq" : null,
  "n_status_eq" : null,
  "n_type_eq" : null,
  "n_user_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "type" : null,
    "status" : null,
    "content" : null,
    "memo" : null,
    "applicant_id" : null,
    "user_name" : null,
    "job_name" : null,
    "priority_id" : null,
    "applicant_create_date" : null,
    "feedback_information" : null,
    "address" : null,
    "experience" : null,
    "last_edu_school" : null,
    "mobile_phone" : null,
    "email_from" : null,
    "education" : null,
    "job_platform_name" : null,
    "candidate_name" : null,
    "description" : null,
    "last_edu_academic_degree" : null,
    "candidate_display_name" : null,
    "stage_name" : null,
    "candidate_filter_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "name" : null,
    "user_id" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 筛选_个人

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/fetch_filter_myself" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请标识|
|<el-row justify="space-between"><el-col :span="20">n_candidate_filter_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|筛选|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_priority_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">n_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_applicant_id_eq" : null,
  "n_candidate_filter_id_eq" : null,
  "n_candidate_name_eq" : null,
  "n_candidate_name_like" : null,
  "n_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_priority_id_eq" : null,
  "n_status_eq" : null,
  "n_type_eq" : null,
  "n_user_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "type" : null,
    "status" : null,
    "content" : null,
    "memo" : null,
    "applicant_id" : null,
    "user_name" : null,
    "job_name" : null,
    "priority_id" : null,
    "applicant_create_date" : null,
    "feedback_information" : null,
    "address" : null,
    "experience" : null,
    "last_edu_school" : null,
    "mobile_phone" : null,
    "email_from" : null,
    "education" : null,
    "job_platform_name" : null,
    "candidate_name" : null,
    "description" : null,
    "last_edu_academic_degree" : null,
    "candidate_display_name" : null,
    "stage_name" : null,
    "candidate_filter_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "name" : null,
    "user_id" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 未评价

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidate_filter_details/fetch_unevaluated" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请标识|
|<el-row justify="space-between"><el-col :span="20">n_candidate_filter_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|筛选|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_candidate_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_priority_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位优先级|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">n_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_applicant_id_eq" : null,
  "n_candidate_filter_id_eq" : null,
  "n_candidate_name_eq" : null,
  "n_candidate_name_like" : null,
  "n_id_eq" : null,
  "n_job_name_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_priority_id_eq" : null,
  "n_status_eq" : null,
  "n_type_eq" : null,
  "n_user_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "type" : null,
    "status" : null,
    "content" : null,
    "memo" : null,
    "applicant_id" : null,
    "user_name" : null,
    "job_name" : null,
    "priority_id" : null,
    "applicant_create_date" : null,
    "feedback_information" : null,
    "address" : null,
    "experience" : null,
    "last_edu_school" : null,
    "mobile_phone" : null,
    "email_from" : null,
    "education" : null,
    "job_platform_name" : null,
    "candidate_name" : null,
    "description" : null,
    "last_edu_academic_degree" : null,
    "candidate_display_name" : null,
    "stage_name" : null,
    "candidate_filter_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "name" : null,
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
<el-alert title="/hr_candidate_filter_details/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidate_filter_details/exportdata/{param},/hr_candidate_filter_details/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidate_filter_details/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidate_filter_details/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidate_filter_details/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidate_filter_details/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidate_filter_details/report" type="info" :closable="false" ></el-alert>
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