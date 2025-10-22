# 招聘需求(hr_idea) :id=hr_idea
## 创建招聘需求

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">need_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">department_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">manager_employee_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">management_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">professional_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">salary_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求描述|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">pay_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪月数|
|<el-row justify="space-between"><el-col :span="20">payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪方式|
|<el-row justify="space-between"><el-col :span="20">connected_jobs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关联职位|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取招聘需求

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/{key}" type="info" :closable="false" ></el-alert>
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
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除招聘需求

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新招聘需求

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">need_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">department_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">manager_employee_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">management_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">professional_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">salary_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求描述|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">pay_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪月数|
|<el-row justify="space-between"><el-col :span="20">payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪方式|
|<el-row justify="space-between"><el-col :span="20">connected_jobs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关联职位|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查招聘需求主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">need_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">department_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">manager_employee_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">management_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">professional_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">salary_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求描述|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">pay_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪月数|
|<el-row justify="space-between"><el-col :span="20">payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪方式|
|<el-row justify="space-between"><el-col :span="20">connected_jobs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关联职位|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取招聘需求草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">need_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">department_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">manager_employee_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">management_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">professional_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">salary_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求描述|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">pay_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪月数|
|<el-row justify="space-between"><el-col :span="20">payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪方式|
|<el-row justify="space-between"><el-col :span="20">connected_jobs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关联职位|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 需求计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/idea_status_count" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">need_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">department_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">manager_employee_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">management_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">professional_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">salary_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求描述|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">pay_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪月数|
|<el-row justify="space-between"><el-col :span="20">payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪方式|
|<el-row justify="space-between"><el-col :span="20">connected_jobs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关联职位|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存招聘需求

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">need_number</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">department_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">manager_employee_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">management_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">professional_rank_ids</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">min_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">max_salary</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">salary_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求描述|
|<el-row justify="space-between"><el-col :span="20">address_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|学历要求|
|<el-row justify="space-between"><el-col :span="20">pay_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪月数|
|<el-row justify="space-between"><el-col :span="20">payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|发薪方式|
|<el-row justify="space-between"><el-col :span="20">connected_jobs</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关联职位|
|<el-row justify="space-between"><el-col :span="20">job_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|
|<el-row justify="space-between"><el-col :span="20">date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘开始时间|
|<el-row justify="space-between"><el-col :span="20">date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|招聘结束时间|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "need_number" : null,
  "job_name" : null,
  "department_code" : null,
  "manager_employee_ids" : null,
  "management_rank_ids" : null,
  "professional_rank_ids" : null,
  "min_salary" : null,
  "max_salary" : null,
  "salary_unit" : null,
  "description" : null,
  "address_id" : null,
  "education" : null,
  "pay_period" : null,
  "payment_method" : null,
  "connected_jobs" : null,
  "job_type" : null,
  "status" : null,
  "create_date" : null,
  "create_uid" : null,
  "date_from" : null,
  "date_to" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 招聘_已取消

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/fetch_canceled" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">n_department_code_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_identifier_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">n_management_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">n_manager_employee_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">n_max_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">n_min_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">n_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_need_number_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">n_professional_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">n_salary_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_create_date_eq" : null,
  "n_department_code_eq" : null,
  "n_id_eq" : null,
  "n_identifier_eq" : null,
  "n_job_name_eq" : null,
  "n_job_type_eq" : null,
  "n_management_rank_ids_eq" : null,
  "n_manager_employee_ids_eq" : null,
  "n_max_salary_eq" : null,
  "n_min_salary_eq" : null,
  "n_name_eq" : null,
  "n_need_number_eq" : null,
  "n_professional_rank_ids_eq" : null,
  "n_salary_unit_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "identifier" : null,
    "need_number" : null,
    "job_name" : null,
    "department_code" : null,
    "manager_employee_ids" : null,
    "management_rank_ids" : null,
    "professional_rank_ids" : null,
    "min_salary" : null,
    "max_salary" : null,
    "salary_unit" : null,
    "description" : null,
    "address_id" : null,
    "education" : null,
    "pay_period" : null,
    "payment_method" : null,
    "connected_jobs" : null,
    "job_type" : null,
    "status" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 招聘_已完成

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/fetch_completed" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">n_department_code_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_identifier_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">n_management_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">n_manager_employee_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">n_max_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">n_min_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">n_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_need_number_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">n_professional_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">n_salary_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_create_date_eq" : null,
  "n_department_code_eq" : null,
  "n_id_eq" : null,
  "n_identifier_eq" : null,
  "n_job_name_eq" : null,
  "n_job_type_eq" : null,
  "n_management_rank_ids_eq" : null,
  "n_manager_employee_ids_eq" : null,
  "n_max_salary_eq" : null,
  "n_min_salary_eq" : null,
  "n_name_eq" : null,
  "n_need_number_eq" : null,
  "n_professional_rank_ids_eq" : null,
  "n_salary_unit_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "identifier" : null,
    "need_number" : null,
    "job_name" : null,
    "department_code" : null,
    "manager_employee_ids" : null,
    "management_rank_ids" : null,
    "professional_rank_ids" : null,
    "min_salary" : null,
    "max_salary" : null,
    "salary_unit" : null,
    "description" : null,
    "address_id" : null,
    "education" : null,
    "pay_period" : null,
    "payment_method" : null,
    "connected_jobs" : null,
    "job_type" : null,
    "status" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 招聘_未进行

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/fetch_data_set2" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">n_department_code_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_identifier_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">n_management_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">n_manager_employee_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">n_max_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">n_min_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">n_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_need_number_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">n_professional_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">n_salary_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_create_date_eq" : null,
  "n_department_code_eq" : null,
  "n_id_eq" : null,
  "n_identifier_eq" : null,
  "n_job_name_eq" : null,
  "n_job_type_eq" : null,
  "n_management_rank_ids_eq" : null,
  "n_manager_employee_ids_eq" : null,
  "n_max_salary_eq" : null,
  "n_min_salary_eq" : null,
  "n_name_eq" : null,
  "n_need_number_eq" : null,
  "n_professional_rank_ids_eq" : null,
  "n_salary_unit_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "identifier" : null,
    "need_number" : null,
    "job_name" : null,
    "department_code" : null,
    "manager_employee_ids" : null,
    "management_rank_ids" : null,
    "professional_rank_ids" : null,
    "min_salary" : null,
    "max_salary" : null,
    "salary_unit" : null,
    "description" : null,
    "address_id" : null,
    "education" : null,
    "pay_period" : null,
    "payment_method" : null,
    "connected_jobs" : null,
    "job_type" : null,
    "status" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 招聘_进行中

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/fetch_data_set3" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">n_department_code_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_identifier_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">n_management_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">n_manager_employee_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">n_max_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">n_min_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">n_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_need_number_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">n_professional_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">n_salary_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_create_date_eq" : null,
  "n_department_code_eq" : null,
  "n_id_eq" : null,
  "n_identifier_eq" : null,
  "n_job_name_eq" : null,
  "n_job_type_eq" : null,
  "n_management_rank_ids_eq" : null,
  "n_manager_employee_ids_eq" : null,
  "n_max_salary_eq" : null,
  "n_min_salary_eq" : null,
  "n_name_eq" : null,
  "n_need_number_eq" : null,
  "n_professional_rank_ids_eq" : null,
  "n_salary_unit_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "identifier" : null,
    "need_number" : null,
    "job_name" : null,
    "department_code" : null,
    "manager_employee_ids" : null,
    "management_rank_ids" : null,
    "professional_rank_ids" : null,
    "min_salary" : null,
    "max_salary" : null,
    "salary_unit" : null,
    "description" : null,
    "address_id" : null,
    "education" : null,
    "pay_period" : null,
    "payment_method" : null,
    "connected_jobs" : null,
    "job_type" : null,
    "status" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 招聘_草稿

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/fetch_data_set4" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">n_department_code_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_identifier_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">n_management_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">n_manager_employee_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">n_max_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">n_min_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">n_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_need_number_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">n_professional_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">n_salary_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_create_date_eq" : null,
  "n_department_code_eq" : null,
  "n_id_eq" : null,
  "n_identifier_eq" : null,
  "n_job_name_eq" : null,
  "n_job_type_eq" : null,
  "n_management_rank_ids_eq" : null,
  "n_manager_employee_ids_eq" : null,
  "n_max_salary_eq" : null,
  "n_min_salary_eq" : null,
  "n_name_eq" : null,
  "n_need_number_eq" : null,
  "n_professional_rank_ids_eq" : null,
  "n_salary_unit_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "identifier" : null,
    "need_number" : null,
    "job_name" : null,
    "department_code" : null,
    "manager_employee_ids" : null,
    "management_rank_ids" : null,
    "professional_rank_ids" : null,
    "min_salary" : null,
    "max_salary" : null,
    "salary_unit" : null,
    "description" : null,
    "address_id" : null,
    "education" : null,
    "pay_period" : null,
    "payment_method" : null,
    "connected_jobs" : null,
    "job_type" : null,
    "status" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 招聘_暂停

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/fetch_data_set5" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">n_department_code_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_identifier_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">n_management_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">n_manager_employee_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">n_max_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">n_min_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">n_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_need_number_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">n_professional_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">n_salary_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_create_date_eq" : null,
  "n_department_code_eq" : null,
  "n_id_eq" : null,
  "n_identifier_eq" : null,
  "n_job_name_eq" : null,
  "n_job_type_eq" : null,
  "n_management_rank_ids_eq" : null,
  "n_manager_employee_ids_eq" : null,
  "n_max_salary_eq" : null,
  "n_min_salary_eq" : null,
  "n_name_eq" : null,
  "n_need_number_eq" : null,
  "n_professional_rank_ids_eq" : null,
  "n_salary_unit_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "identifier" : null,
    "need_number" : null,
    "job_name" : null,
    "department_code" : null,
    "manager_employee_ids" : null,
    "management_rank_ids" : null,
    "professional_rank_ids" : null,
    "min_salary" : null,
    "max_salary" : null,
    "salary_unit" : null,
    "description" : null,
    "address_id" : null,
    "education" : null,
    "pay_period" : null,
    "payment_method" : null,
    "connected_jobs" : null,
    "job_type" : null,
    "status" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 招聘_已超期

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_ideas/fetch_data_set6" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">n_department_code_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_identifier_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">n_management_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">n_manager_employee_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">n_max_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">n_min_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">n_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_need_number_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">n_professional_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">n_salary_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_create_date_eq" : null,
  "n_department_code_eq" : null,
  "n_id_eq" : null,
  "n_identifier_eq" : null,
  "n_job_name_eq" : null,
  "n_job_type_eq" : null,
  "n_management_rank_ids_eq" : null,
  "n_manager_employee_ids_eq" : null,
  "n_max_salary_eq" : null,
  "n_min_salary_eq" : null,
  "n_name_eq" : null,
  "n_need_number_eq" : null,
  "n_professional_rank_ids_eq" : null,
  "n_salary_unit_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "identifier" : null,
    "need_number" : null,
    "job_name" : null,
    "department_code" : null,
    "manager_employee_ids" : null,
    "management_rank_ids" : null,
    "professional_rank_ids" : null,
    "min_salary" : null,
    "max_salary" : null,
    "salary_unit" : null,
    "description" : null,
    "address_id" : null,
    "education" : null,
    "pay_period" : null,
    "payment_method" : null,
    "connected_jobs" : null,
    "job_type" : null,
    "status" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
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
<el-alert title="/hr_ideas/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_address_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地点|
|<el-row justify="space-between"><el-col :span="20">n_department_code_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求部门|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_identifier_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求编号|
|<el-row justify="space-between"><el-col :span="20">n_job_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位名称|
|<el-row justify="space-between"><el-col :span="20">n_job_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位性质|
|<el-row justify="space-between"><el-col :span="20">n_management_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理职级|
|<el-row justify="space-between"><el-col :span="20">n_manager_employee_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人工号|
|<el-row justify="space-between"><el-col :span="20">n_max_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最高薪资|
|<el-row justify="space-between"><el-col :span="20">n_min_salary_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最低薪资|
|<el-row justify="space-between"><el-col :span="20">n_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_need_number_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需求人数|
|<el-row justify="space-between"><el-col :span="20">n_professional_rank_ids_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业职级|
|<el-row justify="space-between"><el-col :span="20">n_salary_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|薪资单位|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|需求状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_address_id_eq" : null,
  "n_create_date_eq" : null,
  "n_department_code_eq" : null,
  "n_id_eq" : null,
  "n_identifier_eq" : null,
  "n_job_name_eq" : null,
  "n_job_type_eq" : null,
  "n_management_rank_ids_eq" : null,
  "n_manager_employee_ids_eq" : null,
  "n_max_salary_eq" : null,
  "n_min_salary_eq" : null,
  "n_name_eq" : null,
  "n_need_number_eq" : null,
  "n_professional_rank_ids_eq" : null,
  "n_salary_unit_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "identifier" : null,
    "need_number" : null,
    "job_name" : null,
    "department_code" : null,
    "manager_employee_ids" : null,
    "management_rank_ids" : null,
    "professional_rank_ids" : null,
    "min_salary" : null,
    "max_salary" : null,
    "salary_unit" : null,
    "description" : null,
    "address_id" : null,
    "education" : null,
    "pay_period" : null,
    "payment_method" : null,
    "connected_jobs" : null,
    "job_type" : null,
    "status" : null,
    "create_date" : null,
    "create_uid" : null,
    "date_from" : null,
    "date_to" : null,
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
<el-alert title="/hr_ideas/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_ideas/exportdata/{param},/hr_ideas/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_ideas/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_ideas/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_ideas/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_ideas/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_ideas/report" type="info" :closable="false" ></el-alert>
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