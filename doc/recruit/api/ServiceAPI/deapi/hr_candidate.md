# 候选人(hr_candidate) :id=hr_candidate
## 创建候选人

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取候选人

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/{key}" type="info" :closable="false" ></el-alert>
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
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除候选人

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新候选人

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 放入人才库

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/{key}/add_to_hr_talentpool" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 检查候选人主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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

## 获取当日归档人数

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/get_archived_today_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取候选人草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取工作台我的关注数

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/get_my_attention_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取用人经理工作台我的面试数

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/get_my_interview_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取工作台我的事项数

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/get_my_summary_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 我的待办事项清单计数器

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/get_my_todolist_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取人才库候选人总数

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/get_talent_pool_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
  "id" : null,
  "name" : null,
  "user_id" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存候选人

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生日期|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">last_tp_applied_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|申请日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请职位|
|<el-row justify="space-between"><el-col :span="20">last_tp_talent_pool</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">last_tp_archived_at</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|归档日期|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档原因|
|<el-row justify="space-between"><el-col :span="20">last_tp_archive_reason_detail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档详细原因|
|<el-row justify="space-between"><el-col :span="20">last_exp_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作公司|
|<el-row justify="space-between"><el-col :span="20">last_exp_job</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作岗位|
|<el-row justify="space-between"><el-col :span="20">last_exp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最近工作时间|
|<el-row justify="space-between"><el-col :span="20">last_edu_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">last_edu_speciality</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所学专业|
|<el-row justify="space-between"><el-col :span="20">last_edu_academic_degree</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学位|
|<el-row justify="space-between"><el-col :span="20">last_edu_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业时间|
|<el-row justify="space-between"><el-col :span="20">talent_pool_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|人才库候选人数量|
|<el-row justify="space-between"><el-col :span="20">last_tags</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最新标签|
|<el-row justify="space-between"><el-col :span="20">last_tp_stage_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档前阶段|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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
  "experience" : null,
  "address_id" : null,
  "birthday" : null,
  "mobile_phone" : null,
  "education" : null,
  "gender" : null,
  "last_tp_applied_at" : null,
  "last_tp_job_name" : null,
  "last_tp_talent_pool" : null,
  "last_tp_archived_at" : null,
  "last_tp_archive_reason" : null,
  "last_tp_archive_reason_detail" : null,
  "last_exp_company" : null,
  "last_exp_job" : null,
  "last_exp_date" : null,
  "last_edu_school" : null,
  "last_edu_speciality" : null,
  "last_edu_academic_degree" : null,
  "last_edu_date" : null,
  "talent_pool_count" : null,
  "last_tags" : null,
  "last_tp_stage_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "email_from" : null,
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
<el-alert title="/hr_candidates/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_education_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">n_gender_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_last_tp_talent_pool_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_education_eq" : null,
  "n_gender_eq" : null,
  "n_id_eq" : null,
  "n_last_tp_talent_pool_like" : null,
  "n_name_like" : null,
  "n_user_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "experience" : null,
    "address_id" : null,
    "birthday" : null,
    "mobile_phone" : null,
    "education" : null,
    "gender" : null,
    "last_tp_applied_at" : null,
    "last_tp_job_name" : null,
    "last_tp_talent_pool" : null,
    "last_tp_archived_at" : null,
    "last_tp_archive_reason" : null,
    "last_tp_archive_reason_detail" : null,
    "last_exp_company" : null,
    "last_exp_job" : null,
    "last_exp_date" : null,
    "last_edu_school" : null,
    "last_edu_speciality" : null,
    "last_edu_academic_degree" : null,
    "last_edu_date" : null,
    "talent_pool_count" : null,
    "last_tags" : null,
    "last_tp_stage_name" : null,
    "create_date" : null,
    "create_uid" : null,
    "email_from" : null,
    "id" : null,
    "name" : null,
    "user_id" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 公共人才库查询

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_candidates/fetch_public_talent_pool" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_education_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">n_gender_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_last_tp_talent_pool_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|归档人才库|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|人员|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_education_eq" : null,
  "n_gender_eq" : null,
  "n_id_eq" : null,
  "n_last_tp_talent_pool_like" : null,
  "n_name_like" : null,
  "n_user_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "experience" : null,
    "address_id" : null,
    "birthday" : null,
    "mobile_phone" : null,
    "education" : null,
    "gender" : null,
    "last_tp_applied_at" : null,
    "last_tp_job_name" : null,
    "last_tp_talent_pool" : null,
    "last_tp_archived_at" : null,
    "last_tp_archive_reason" : null,
    "last_tp_archive_reason_detail" : null,
    "last_exp_company" : null,
    "last_exp_job" : null,
    "last_exp_date" : null,
    "last_edu_school" : null,
    "last_edu_speciality" : null,
    "last_edu_academic_degree" : null,
    "last_edu_date" : null,
    "talent_pool_count" : null,
    "last_tags" : null,
    "last_tp_stage_name" : null,
    "create_date" : null,
    "create_uid" : null,
    "email_from" : null,
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
<el-alert title="/hr_candidates/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidates/exportdata/{param},/hr_candidates/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidates/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidates/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidates/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidates/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_candidates/report" type="info" :closable="false" ></el-alert>
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