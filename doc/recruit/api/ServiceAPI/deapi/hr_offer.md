# OFFER录用(hr_offer) :id=hr_offer
## 创建OFFER录用

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offers" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">job_rank_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">location_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地-市|
|<el-row justify="space-between"><el-col :span="20">location_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职地点|
|<el-row justify="space-between"><el-col :span="20">hr_idea_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">checkindate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预计入职日期|
|<el-row justify="space-between"><el-col :span="20">offer_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer类型|
|<el-row justify="space-between"><el-col :span="20">meal_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|餐补|
|<el-row justify="space-between"><el-col :span="20">ma_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|餐补单位|
|<el-row justify="space-between"><el-col :span="20">salary_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪资类型|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">approval_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批附件|
|<el-row justify="space-between"><el-col :span="20">salary_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪酬分配方式|
|<el-row justify="space-between"><el-col :span="20">salary1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正基本工资|
|<el-row justify="space-between"><el-col :span="20">salary2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习生绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期基本工资|
|<el-row justify="space-between"><el-col :span="20">salary5</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期绩效工资|
|<el-row justify="space-between"><el-col :span="20">annual_performance_bonus</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|年度绩效奖金|
|<el-row justify="space-between"><el-col :span="20">salary6</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习期薪酬|
|<el-row justify="space-between"><el-col :span="20">transportation_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|交通补贴|
|<el-row justify="space-between"><el-col :span="20">communication_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|通讯补贴|
|<el-row justify="space-between"><el-col :span="20">current_employer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘人员所属公司|
|<el-row justify="space-between"><el-col :span="20">contract_term</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合同期限（年）|
|<el-row justify="space-between"><el-col :span="20">working_hours_am</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（上午）|
|<el-row justify="space-between"><el-col :span="20">working_hours_pm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（下午）|
|<el-row justify="space-between"><el-col :span="20">email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模板|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版内容|
|<el-row justify="space-between"><el-col :span="20">sms_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板内容|
|<el-row justify="space-between"><el-col :span="20">bank_card_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|银行卡信息|
|<el-row justify="space-between"><el-col :span="20">offer_attachment_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件模版|
|<el-row justify="space-between"><el-col :span="20">is_generate_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|生成offer附件|
|<el-row justify="space-between"><el-col :span="20">is_encrypted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加密|
|<el-row justify="space-between"><el-col :span="20">attachment_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件密码|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">hr_idea_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">res_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



##### 请求示例： {docsify-ignore}
```json
{
  "job_name" : null,
  "job_rank_id" : null,
  "location_city" : null,
  "location_id" : null,
  "hr_idea_name" : null,
  "checkindate" : null,
  "offer_type" : null,
  "meal_allowance" : null,
  "ma_currency" : null,
  "salary_type" : null,
  "candidate_display_name" : null,
  "approval_attachment" : null,
  "salary_method" : null,
  "salary1" : null,
  "salary2" : null,
  "salary3" : null,
  "salary4" : null,
  "salary5" : null,
  "annual_performance_bonus" : null,
  "salary6" : null,
  "transportation_allowance" : null,
  "communication_allowance" : null,
  "current_employer" : null,
  "contract_term" : null,
  "working_hours_am" : null,
  "working_hours_pm" : null,
  "email_template" : null,
  "email_content" : null,
  "sms_template" : null,
  "sms_content" : null,
  "bank_card_info" : null,
  "offer_attachment_template" : null,
  "is_generate_attachment" : null,
  "is_encrypted" : null,
  "attachment_password" : null,
  "job_platform_name" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "experience" : null,
  "education" : null,
  "address" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_idea_id" : null,
  "id" : null,
  "name" : null,
  "res_company_id" : null,
  "res_company_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "job_name" : null,
  "job_rank_id" : null,
  "location_city" : null,
  "location_id" : null,
  "hr_idea_name" : null,
  "checkindate" : null,
  "offer_type" : null,
  "meal_allowance" : null,
  "ma_currency" : null,
  "salary_type" : null,
  "candidate_display_name" : null,
  "approval_attachment" : null,
  "salary_method" : null,
  "salary1" : null,
  "salary2" : null,
  "salary3" : null,
  "salary4" : null,
  "salary5" : null,
  "annual_performance_bonus" : null,
  "salary6" : null,
  "transportation_allowance" : null,
  "communication_allowance" : null,
  "current_employer" : null,
  "contract_term" : null,
  "working_hours_am" : null,
  "working_hours_pm" : null,
  "email_template" : null,
  "email_content" : null,
  "sms_template" : null,
  "sms_content" : null,
  "bank_card_info" : null,
  "offer_attachment_template" : null,
  "is_generate_attachment" : null,
  "is_encrypted" : null,
  "attachment_password" : null,
  "job_platform_name" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "experience" : null,
  "education" : null,
  "address" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_idea_id" : null,
  "id" : null,
  "name" : null,
  "res_company_id" : null,
  "res_company_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取OFFER录用

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offers/{key}" type="info" :closable="false" ></el-alert>
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
  "job_name" : null,
  "job_rank_id" : null,
  "location_city" : null,
  "location_id" : null,
  "hr_idea_name" : null,
  "checkindate" : null,
  "offer_type" : null,
  "meal_allowance" : null,
  "ma_currency" : null,
  "salary_type" : null,
  "candidate_display_name" : null,
  "approval_attachment" : null,
  "salary_method" : null,
  "salary1" : null,
  "salary2" : null,
  "salary3" : null,
  "salary4" : null,
  "salary5" : null,
  "annual_performance_bonus" : null,
  "salary6" : null,
  "transportation_allowance" : null,
  "communication_allowance" : null,
  "current_employer" : null,
  "contract_term" : null,
  "working_hours_am" : null,
  "working_hours_pm" : null,
  "email_template" : null,
  "email_content" : null,
  "sms_template" : null,
  "sms_content" : null,
  "bank_card_info" : null,
  "offer_attachment_template" : null,
  "is_generate_attachment" : null,
  "is_encrypted" : null,
  "attachment_password" : null,
  "job_platform_name" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "experience" : null,
  "education" : null,
  "address" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_idea_id" : null,
  "id" : null,
  "name" : null,
  "res_company_id" : null,
  "res_company_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除OFFER录用

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offers/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新OFFER录用

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offers/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">job_rank_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">location_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地-市|
|<el-row justify="space-between"><el-col :span="20">location_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职地点|
|<el-row justify="space-between"><el-col :span="20">hr_idea_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">checkindate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预计入职日期|
|<el-row justify="space-between"><el-col :span="20">offer_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer类型|
|<el-row justify="space-between"><el-col :span="20">meal_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|餐补|
|<el-row justify="space-between"><el-col :span="20">ma_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|餐补单位|
|<el-row justify="space-between"><el-col :span="20">salary_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪资类型|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">approval_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批附件|
|<el-row justify="space-between"><el-col :span="20">salary_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪酬分配方式|
|<el-row justify="space-between"><el-col :span="20">salary1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正基本工资|
|<el-row justify="space-between"><el-col :span="20">salary2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习生绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期基本工资|
|<el-row justify="space-between"><el-col :span="20">salary5</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期绩效工资|
|<el-row justify="space-between"><el-col :span="20">annual_performance_bonus</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|年度绩效奖金|
|<el-row justify="space-between"><el-col :span="20">salary6</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习期薪酬|
|<el-row justify="space-between"><el-col :span="20">transportation_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|交通补贴|
|<el-row justify="space-between"><el-col :span="20">communication_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|通讯补贴|
|<el-row justify="space-between"><el-col :span="20">current_employer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘人员所属公司|
|<el-row justify="space-between"><el-col :span="20">contract_term</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合同期限（年）|
|<el-row justify="space-between"><el-col :span="20">working_hours_am</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（上午）|
|<el-row justify="space-between"><el-col :span="20">working_hours_pm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（下午）|
|<el-row justify="space-between"><el-col :span="20">email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模板|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版内容|
|<el-row justify="space-between"><el-col :span="20">sms_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板内容|
|<el-row justify="space-between"><el-col :span="20">bank_card_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|银行卡信息|
|<el-row justify="space-between"><el-col :span="20">offer_attachment_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件模版|
|<el-row justify="space-between"><el-col :span="20">is_generate_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|生成offer附件|
|<el-row justify="space-between"><el-col :span="20">is_encrypted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加密|
|<el-row justify="space-between"><el-col :span="20">attachment_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件密码|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">hr_idea_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">res_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



##### 请求示例： {docsify-ignore}
```json
{
  "job_name" : null,
  "job_rank_id" : null,
  "location_city" : null,
  "location_id" : null,
  "hr_idea_name" : null,
  "checkindate" : null,
  "offer_type" : null,
  "meal_allowance" : null,
  "ma_currency" : null,
  "salary_type" : null,
  "candidate_display_name" : null,
  "approval_attachment" : null,
  "salary_method" : null,
  "salary1" : null,
  "salary2" : null,
  "salary3" : null,
  "salary4" : null,
  "salary5" : null,
  "annual_performance_bonus" : null,
  "salary6" : null,
  "transportation_allowance" : null,
  "communication_allowance" : null,
  "current_employer" : null,
  "contract_term" : null,
  "working_hours_am" : null,
  "working_hours_pm" : null,
  "email_template" : null,
  "email_content" : null,
  "sms_template" : null,
  "sms_content" : null,
  "bank_card_info" : null,
  "offer_attachment_template" : null,
  "is_generate_attachment" : null,
  "is_encrypted" : null,
  "attachment_password" : null,
  "job_platform_name" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "experience" : null,
  "education" : null,
  "address" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_idea_id" : null,
  "id" : null,
  "name" : null,
  "res_company_id" : null,
  "res_company_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "job_name" : null,
  "job_rank_id" : null,
  "location_city" : null,
  "location_id" : null,
  "hr_idea_name" : null,
  "checkindate" : null,
  "offer_type" : null,
  "meal_allowance" : null,
  "ma_currency" : null,
  "salary_type" : null,
  "candidate_display_name" : null,
  "approval_attachment" : null,
  "salary_method" : null,
  "salary1" : null,
  "salary2" : null,
  "salary3" : null,
  "salary4" : null,
  "salary5" : null,
  "annual_performance_bonus" : null,
  "salary6" : null,
  "transportation_allowance" : null,
  "communication_allowance" : null,
  "current_employer" : null,
  "contract_term" : null,
  "working_hours_am" : null,
  "working_hours_pm" : null,
  "email_template" : null,
  "email_content" : null,
  "sms_template" : null,
  "sms_content" : null,
  "bank_card_info" : null,
  "offer_attachment_template" : null,
  "is_generate_attachment" : null,
  "is_encrypted" : null,
  "attachment_password" : null,
  "job_platform_name" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "experience" : null,
  "education" : null,
  "address" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_idea_id" : null,
  "id" : null,
  "name" : null,
  "res_company_id" : null,
  "res_company_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查OFFER录用主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offers/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">job_rank_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">location_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地-市|
|<el-row justify="space-between"><el-col :span="20">location_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职地点|
|<el-row justify="space-between"><el-col :span="20">hr_idea_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">checkindate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预计入职日期|
|<el-row justify="space-between"><el-col :span="20">offer_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer类型|
|<el-row justify="space-between"><el-col :span="20">meal_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|餐补|
|<el-row justify="space-between"><el-col :span="20">ma_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|餐补单位|
|<el-row justify="space-between"><el-col :span="20">salary_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪资类型|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">approval_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批附件|
|<el-row justify="space-between"><el-col :span="20">salary_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪酬分配方式|
|<el-row justify="space-between"><el-col :span="20">salary1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正基本工资|
|<el-row justify="space-between"><el-col :span="20">salary2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习生绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期基本工资|
|<el-row justify="space-between"><el-col :span="20">salary5</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期绩效工资|
|<el-row justify="space-between"><el-col :span="20">annual_performance_bonus</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|年度绩效奖金|
|<el-row justify="space-between"><el-col :span="20">salary6</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习期薪酬|
|<el-row justify="space-between"><el-col :span="20">transportation_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|交通补贴|
|<el-row justify="space-between"><el-col :span="20">communication_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|通讯补贴|
|<el-row justify="space-between"><el-col :span="20">current_employer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘人员所属公司|
|<el-row justify="space-between"><el-col :span="20">contract_term</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合同期限（年）|
|<el-row justify="space-between"><el-col :span="20">working_hours_am</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（上午）|
|<el-row justify="space-between"><el-col :span="20">working_hours_pm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（下午）|
|<el-row justify="space-between"><el-col :span="20">email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模板|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版内容|
|<el-row justify="space-between"><el-col :span="20">sms_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板内容|
|<el-row justify="space-between"><el-col :span="20">bank_card_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|银行卡信息|
|<el-row justify="space-between"><el-col :span="20">offer_attachment_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件模版|
|<el-row justify="space-between"><el-col :span="20">is_generate_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|生成offer附件|
|<el-row justify="space-between"><el-col :span="20">is_encrypted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加密|
|<el-row justify="space-between"><el-col :span="20">attachment_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件密码|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">hr_idea_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">res_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



##### 请求示例： {docsify-ignore}
```json
{
  "job_name" : null,
  "job_rank_id" : null,
  "location_city" : null,
  "location_id" : null,
  "hr_idea_name" : null,
  "checkindate" : null,
  "offer_type" : null,
  "meal_allowance" : null,
  "ma_currency" : null,
  "salary_type" : null,
  "candidate_display_name" : null,
  "approval_attachment" : null,
  "salary_method" : null,
  "salary1" : null,
  "salary2" : null,
  "salary3" : null,
  "salary4" : null,
  "salary5" : null,
  "annual_performance_bonus" : null,
  "salary6" : null,
  "transportation_allowance" : null,
  "communication_allowance" : null,
  "current_employer" : null,
  "contract_term" : null,
  "working_hours_am" : null,
  "working_hours_pm" : null,
  "email_template" : null,
  "email_content" : null,
  "sms_template" : null,
  "sms_content" : null,
  "bank_card_info" : null,
  "offer_attachment_template" : null,
  "is_generate_attachment" : null,
  "is_encrypted" : null,
  "attachment_password" : null,
  "job_platform_name" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "experience" : null,
  "education" : null,
  "address" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_idea_id" : null,
  "id" : null,
  "name" : null,
  "res_company_id" : null,
  "res_company_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取OFFER录用草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offers/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">job_rank_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">location_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地-市|
|<el-row justify="space-between"><el-col :span="20">location_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职地点|
|<el-row justify="space-between"><el-col :span="20">hr_idea_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">checkindate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预计入职日期|
|<el-row justify="space-between"><el-col :span="20">offer_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer类型|
|<el-row justify="space-between"><el-col :span="20">meal_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|餐补|
|<el-row justify="space-between"><el-col :span="20">ma_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|餐补单位|
|<el-row justify="space-between"><el-col :span="20">salary_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪资类型|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">approval_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批附件|
|<el-row justify="space-between"><el-col :span="20">salary_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪酬分配方式|
|<el-row justify="space-between"><el-col :span="20">salary1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正基本工资|
|<el-row justify="space-between"><el-col :span="20">salary2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习生绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期基本工资|
|<el-row justify="space-between"><el-col :span="20">salary5</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期绩效工资|
|<el-row justify="space-between"><el-col :span="20">annual_performance_bonus</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|年度绩效奖金|
|<el-row justify="space-between"><el-col :span="20">salary6</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习期薪酬|
|<el-row justify="space-between"><el-col :span="20">transportation_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|交通补贴|
|<el-row justify="space-between"><el-col :span="20">communication_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|通讯补贴|
|<el-row justify="space-between"><el-col :span="20">current_employer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘人员所属公司|
|<el-row justify="space-between"><el-col :span="20">contract_term</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合同期限（年）|
|<el-row justify="space-between"><el-col :span="20">working_hours_am</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（上午）|
|<el-row justify="space-between"><el-col :span="20">working_hours_pm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（下午）|
|<el-row justify="space-between"><el-col :span="20">email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模板|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版内容|
|<el-row justify="space-between"><el-col :span="20">sms_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板内容|
|<el-row justify="space-between"><el-col :span="20">bank_card_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|银行卡信息|
|<el-row justify="space-between"><el-col :span="20">offer_attachment_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件模版|
|<el-row justify="space-between"><el-col :span="20">is_generate_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|生成offer附件|
|<el-row justify="space-between"><el-col :span="20">is_encrypted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加密|
|<el-row justify="space-between"><el-col :span="20">attachment_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件密码|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">hr_idea_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">res_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



##### 请求示例： {docsify-ignore}
```json
{
  "job_name" : null,
  "job_rank_id" : null,
  "location_city" : null,
  "location_id" : null,
  "hr_idea_name" : null,
  "checkindate" : null,
  "offer_type" : null,
  "meal_allowance" : null,
  "ma_currency" : null,
  "salary_type" : null,
  "candidate_display_name" : null,
  "approval_attachment" : null,
  "salary_method" : null,
  "salary1" : null,
  "salary2" : null,
  "salary3" : null,
  "salary4" : null,
  "salary5" : null,
  "annual_performance_bonus" : null,
  "salary6" : null,
  "transportation_allowance" : null,
  "communication_allowance" : null,
  "current_employer" : null,
  "contract_term" : null,
  "working_hours_am" : null,
  "working_hours_pm" : null,
  "email_template" : null,
  "email_content" : null,
  "sms_template" : null,
  "sms_content" : null,
  "bank_card_info" : null,
  "offer_attachment_template" : null,
  "is_generate_attachment" : null,
  "is_encrypted" : null,
  "attachment_password" : null,
  "job_platform_name" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "experience" : null,
  "education" : null,
  "address" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_idea_id" : null,
  "id" : null,
  "name" : null,
  "res_company_id" : null,
  "res_company_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "job_name" : null,
  "job_rank_id" : null,
  "location_city" : null,
  "location_id" : null,
  "hr_idea_name" : null,
  "checkindate" : null,
  "offer_type" : null,
  "meal_allowance" : null,
  "ma_currency" : null,
  "salary_type" : null,
  "candidate_display_name" : null,
  "approval_attachment" : null,
  "salary_method" : null,
  "salary1" : null,
  "salary2" : null,
  "salary3" : null,
  "salary4" : null,
  "salary5" : null,
  "annual_performance_bonus" : null,
  "salary6" : null,
  "transportation_allowance" : null,
  "communication_allowance" : null,
  "current_employer" : null,
  "contract_term" : null,
  "working_hours_am" : null,
  "working_hours_pm" : null,
  "email_template" : null,
  "email_content" : null,
  "sms_template" : null,
  "sms_content" : null,
  "bank_card_info" : null,
  "offer_attachment_template" : null,
  "is_generate_attachment" : null,
  "is_encrypted" : null,
  "attachment_password" : null,
  "job_platform_name" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "experience" : null,
  "education" : null,
  "address" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_idea_id" : null,
  "id" : null,
  "name" : null,
  "res_company_id" : null,
  "res_company_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存OFFER录用

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offers/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">job_rank_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">location_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地-市|
|<el-row justify="space-between"><el-col :span="20">location_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职地点|
|<el-row justify="space-between"><el-col :span="20">hr_idea_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">checkindate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预计入职日期|
|<el-row justify="space-between"><el-col :span="20">offer_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer类型|
|<el-row justify="space-between"><el-col :span="20">meal_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|餐补|
|<el-row justify="space-between"><el-col :span="20">ma_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|餐补单位|
|<el-row justify="space-between"><el-col :span="20">salary_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪资类型|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">approval_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批附件|
|<el-row justify="space-between"><el-col :span="20">salary_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪酬分配方式|
|<el-row justify="space-between"><el-col :span="20">salary1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正基本工资|
|<el-row justify="space-between"><el-col :span="20">salary2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习生绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期基本工资|
|<el-row justify="space-between"><el-col :span="20">salary5</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期绩效工资|
|<el-row justify="space-between"><el-col :span="20">annual_performance_bonus</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|年度绩效奖金|
|<el-row justify="space-between"><el-col :span="20">salary6</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习期薪酬|
|<el-row justify="space-between"><el-col :span="20">transportation_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|交通补贴|
|<el-row justify="space-between"><el-col :span="20">communication_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|通讯补贴|
|<el-row justify="space-between"><el-col :span="20">current_employer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘人员所属公司|
|<el-row justify="space-between"><el-col :span="20">contract_term</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合同期限（年）|
|<el-row justify="space-between"><el-col :span="20">working_hours_am</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（上午）|
|<el-row justify="space-between"><el-col :span="20">working_hours_pm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（下午）|
|<el-row justify="space-between"><el-col :span="20">email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模板|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版内容|
|<el-row justify="space-between"><el-col :span="20">sms_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板内容|
|<el-row justify="space-between"><el-col :span="20">bank_card_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|银行卡信息|
|<el-row justify="space-between"><el-col :span="20">offer_attachment_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件模版|
|<el-row justify="space-between"><el-col :span="20">is_generate_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|生成offer附件|
|<el-row justify="space-between"><el-col :span="20">is_encrypted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加密|
|<el-row justify="space-between"><el-col :span="20">attachment_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件密码|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">hr_idea_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">res_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



##### 请求示例： {docsify-ignore}
```json
{
  "job_name" : null,
  "job_rank_id" : null,
  "location_city" : null,
  "location_id" : null,
  "hr_idea_name" : null,
  "checkindate" : null,
  "offer_type" : null,
  "meal_allowance" : null,
  "ma_currency" : null,
  "salary_type" : null,
  "candidate_display_name" : null,
  "approval_attachment" : null,
  "salary_method" : null,
  "salary1" : null,
  "salary2" : null,
  "salary3" : null,
  "salary4" : null,
  "salary5" : null,
  "annual_performance_bonus" : null,
  "salary6" : null,
  "transportation_allowance" : null,
  "communication_allowance" : null,
  "current_employer" : null,
  "contract_term" : null,
  "working_hours_am" : null,
  "working_hours_pm" : null,
  "email_template" : null,
  "email_content" : null,
  "sms_template" : null,
  "sms_content" : null,
  "bank_card_info" : null,
  "offer_attachment_template" : null,
  "is_generate_attachment" : null,
  "is_encrypted" : null,
  "attachment_password" : null,
  "job_platform_name" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "experience" : null,
  "education" : null,
  "address" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_idea_id" : null,
  "id" : null,
  "name" : null,
  "res_company_id" : null,
  "res_company_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "job_name" : null,
  "job_rank_id" : null,
  "location_city" : null,
  "location_id" : null,
  "hr_idea_name" : null,
  "checkindate" : null,
  "offer_type" : null,
  "meal_allowance" : null,
  "ma_currency" : null,
  "salary_type" : null,
  "candidate_display_name" : null,
  "approval_attachment" : null,
  "salary_method" : null,
  "salary1" : null,
  "salary2" : null,
  "salary3" : null,
  "salary4" : null,
  "salary5" : null,
  "annual_performance_bonus" : null,
  "salary6" : null,
  "transportation_allowance" : null,
  "communication_allowance" : null,
  "current_employer" : null,
  "contract_term" : null,
  "working_hours_am" : null,
  "working_hours_pm" : null,
  "email_template" : null,
  "email_content" : null,
  "sms_template" : null,
  "sms_content" : null,
  "bank_card_info" : null,
  "offer_attachment_template" : null,
  "is_generate_attachment" : null,
  "is_encrypted" : null,
  "attachment_password" : null,
  "job_platform_name" : null,
  "mobile_phone" : null,
  "email_from" : null,
  "experience" : null,
  "education" : null,
  "address" : null,
  "applicant_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_idea_id" : null,
  "id" : null,
  "name" : null,
  "res_company_id" : null,
  "res_company_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## bi_search

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offers/fetch_bi_search" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_res_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">n_res_company_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|
|<el-row justify="space-between"><el-col :span="20">n_res_company_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_applicant_id_eq" : null,
  "n_hr_idea_id_eq" : null,
  "n_hr_idea_name_eq" : null,
  "n_hr_idea_name_like" : null,
  "n_id_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_res_company_id_eq" : null,
  "n_res_company_name_eq" : null,
  "n_res_company_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "job_name" : null,
    "job_rank_id" : null,
    "location_city" : null,
    "location_id" : null,
    "hr_idea_name" : null,
    "checkindate" : null,
    "offer_type" : null,
    "meal_allowance" : null,
    "ma_currency" : null,
    "salary_type" : null,
    "candidate_display_name" : null,
    "approval_attachment" : null,
    "salary_method" : null,
    "salary1" : null,
    "salary2" : null,
    "salary3" : null,
    "salary4" : null,
    "salary5" : null,
    "annual_performance_bonus" : null,
    "salary6" : null,
    "transportation_allowance" : null,
    "communication_allowance" : null,
    "current_employer" : null,
    "contract_term" : null,
    "working_hours_am" : null,
    "working_hours_pm" : null,
    "email_template" : null,
    "email_content" : null,
    "sms_template" : null,
    "sms_content" : null,
    "bank_card_info" : null,
    "offer_attachment_template" : null,
    "is_generate_attachment" : null,
    "is_encrypted" : null,
    "attachment_password" : null,
    "job_platform_name" : null,
    "mobile_phone" : null,
    "email_from" : null,
    "experience" : null,
    "education" : null,
    "address" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "hr_idea_id" : null,
    "id" : null,
    "name" : null,
    "res_company_id" : null,
    "res_company_name" : null,
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
<el-alert title="/hr_offers/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_res_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">n_res_company_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|
|<el-row justify="space-between"><el-col :span="20">n_res_company_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_applicant_id_eq" : null,
  "n_hr_idea_id_eq" : null,
  "n_hr_idea_name_eq" : null,
  "n_hr_idea_name_like" : null,
  "n_id_eq" : null,
  "n_job_name_like" : null,
  "n_name_like" : null,
  "n_res_company_id_eq" : null,
  "n_res_company_name_eq" : null,
  "n_res_company_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "job_name" : null,
    "job_rank_id" : null,
    "location_city" : null,
    "location_id" : null,
    "hr_idea_name" : null,
    "checkindate" : null,
    "offer_type" : null,
    "meal_allowance" : null,
    "ma_currency" : null,
    "salary_type" : null,
    "candidate_display_name" : null,
    "approval_attachment" : null,
    "salary_method" : null,
    "salary1" : null,
    "salary2" : null,
    "salary3" : null,
    "salary4" : null,
    "salary5" : null,
    "annual_performance_bonus" : null,
    "salary6" : null,
    "transportation_allowance" : null,
    "communication_allowance" : null,
    "current_employer" : null,
    "contract_term" : null,
    "working_hours_am" : null,
    "working_hours_pm" : null,
    "email_template" : null,
    "email_content" : null,
    "sms_template" : null,
    "sms_content" : null,
    "bank_card_info" : null,
    "offer_attachment_template" : null,
    "is_generate_attachment" : null,
    "is_encrypted" : null,
    "attachment_password" : null,
    "job_platform_name" : null,
    "mobile_phone" : null,
    "email_from" : null,
    "experience" : null,
    "education" : null,
    "address" : null,
    "applicant_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "hr_idea_id" : null,
    "id" : null,
    "name" : null,
    "res_company_id" : null,
    "res_company_name" : null,
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
<el-alert title="/hr_offers/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offers/exportdata/{param},/hr_offers/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offers/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offers/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offers/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offers/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offers/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfreporttag | String | 报表标识 |
| srfcontenttype | String | 报表类型 |




## 根据候选人申请创建OFFER录用

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|候选人申请主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">job_rank_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">location_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地-市|
|<el-row justify="space-between"><el-col :span="20">location_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职地点|
|<el-row justify="space-between"><el-col :span="20">hr_idea_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">checkindate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预计入职日期|
|<el-row justify="space-between"><el-col :span="20">offer_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer类型|
|<el-row justify="space-between"><el-col :span="20">meal_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|餐补|
|<el-row justify="space-between"><el-col :span="20">ma_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|餐补单位|
|<el-row justify="space-between"><el-col :span="20">salary_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪资类型|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">approval_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批附件|
|<el-row justify="space-between"><el-col :span="20">salary_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪酬分配方式|
|<el-row justify="space-between"><el-col :span="20">salary1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正基本工资|
|<el-row justify="space-between"><el-col :span="20">salary2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习生绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期基本工资|
|<el-row justify="space-between"><el-col :span="20">salary5</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期绩效工资|
|<el-row justify="space-between"><el-col :span="20">annual_performance_bonus</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|年度绩效奖金|
|<el-row justify="space-between"><el-col :span="20">salary6</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习期薪酬|
|<el-row justify="space-between"><el-col :span="20">transportation_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|交通补贴|
|<el-row justify="space-between"><el-col :span="20">communication_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|通讯补贴|
|<el-row justify="space-between"><el-col :span="20">current_employer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘人员所属公司|
|<el-row justify="space-between"><el-col :span="20">contract_term</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合同期限（年）|
|<el-row justify="space-between"><el-col :span="20">working_hours_am</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（上午）|
|<el-row justify="space-between"><el-col :span="20">working_hours_pm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（下午）|
|<el-row justify="space-between"><el-col :span="20">email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模板|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版内容|
|<el-row justify="space-between"><el-col :span="20">sms_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板内容|
|<el-row justify="space-between"><el-col :span="20">bank_card_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|银行卡信息|
|<el-row justify="space-between"><el-col :span="20">offer_attachment_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件模版|
|<el-row justify="space-between"><el-col :span="20">is_generate_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|生成offer附件|
|<el-row justify="space-between"><el-col :span="20">is_encrypted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加密|
|<el-row justify="space-between"><el-col :span="20">attachment_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件密码|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">hr_idea_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">res_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



## 根据候选人申请获取OFFER录用

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|候选人申请主键|
|key|String|标识|




## 根据候选人申请删除OFFER录用

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|候选人申请主键|
|key|String|标识|




## 根据候选人申请更新OFFER录用

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|候选人申请主键|
|key|String|标识|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">job_rank_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">location_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地-市|
|<el-row justify="space-between"><el-col :span="20">location_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职地点|
|<el-row justify="space-between"><el-col :span="20">hr_idea_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">checkindate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预计入职日期|
|<el-row justify="space-between"><el-col :span="20">offer_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer类型|
|<el-row justify="space-between"><el-col :span="20">meal_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|餐补|
|<el-row justify="space-between"><el-col :span="20">ma_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|餐补单位|
|<el-row justify="space-between"><el-col :span="20">salary_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪资类型|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">approval_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批附件|
|<el-row justify="space-between"><el-col :span="20">salary_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪酬分配方式|
|<el-row justify="space-between"><el-col :span="20">salary1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正基本工资|
|<el-row justify="space-between"><el-col :span="20">salary2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习生绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期基本工资|
|<el-row justify="space-between"><el-col :span="20">salary5</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期绩效工资|
|<el-row justify="space-between"><el-col :span="20">annual_performance_bonus</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|年度绩效奖金|
|<el-row justify="space-between"><el-col :span="20">salary6</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习期薪酬|
|<el-row justify="space-between"><el-col :span="20">transportation_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|交通补贴|
|<el-row justify="space-between"><el-col :span="20">communication_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|通讯补贴|
|<el-row justify="space-between"><el-col :span="20">current_employer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘人员所属公司|
|<el-row justify="space-between"><el-col :span="20">contract_term</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合同期限（年）|
|<el-row justify="space-between"><el-col :span="20">working_hours_am</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（上午）|
|<el-row justify="space-between"><el-col :span="20">working_hours_pm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（下午）|
|<el-row justify="space-between"><el-col :span="20">email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模板|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版内容|
|<el-row justify="space-between"><el-col :span="20">sms_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板内容|
|<el-row justify="space-between"><el-col :span="20">bank_card_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|银行卡信息|
|<el-row justify="space-between"><el-col :span="20">offer_attachment_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件模版|
|<el-row justify="space-between"><el-col :span="20">is_generate_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|生成offer附件|
|<el-row justify="space-between"><el-col :span="20">is_encrypted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加密|
|<el-row justify="space-between"><el-col :span="20">attachment_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件密码|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">hr_idea_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">res_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



## 根据候选人申请检查OFFER录用主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|候选人申请主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">job_rank_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">location_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地-市|
|<el-row justify="space-between"><el-col :span="20">location_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职地点|
|<el-row justify="space-between"><el-col :span="20">hr_idea_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">checkindate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预计入职日期|
|<el-row justify="space-between"><el-col :span="20">offer_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer类型|
|<el-row justify="space-between"><el-col :span="20">meal_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|餐补|
|<el-row justify="space-between"><el-col :span="20">ma_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|餐补单位|
|<el-row justify="space-between"><el-col :span="20">salary_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪资类型|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">approval_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批附件|
|<el-row justify="space-between"><el-col :span="20">salary_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪酬分配方式|
|<el-row justify="space-between"><el-col :span="20">salary1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正基本工资|
|<el-row justify="space-between"><el-col :span="20">salary2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习生绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期基本工资|
|<el-row justify="space-between"><el-col :span="20">salary5</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期绩效工资|
|<el-row justify="space-between"><el-col :span="20">annual_performance_bonus</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|年度绩效奖金|
|<el-row justify="space-between"><el-col :span="20">salary6</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习期薪酬|
|<el-row justify="space-between"><el-col :span="20">transportation_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|交通补贴|
|<el-row justify="space-between"><el-col :span="20">communication_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|通讯补贴|
|<el-row justify="space-between"><el-col :span="20">current_employer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘人员所属公司|
|<el-row justify="space-between"><el-col :span="20">contract_term</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合同期限（年）|
|<el-row justify="space-between"><el-col :span="20">working_hours_am</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（上午）|
|<el-row justify="space-between"><el-col :span="20">working_hours_pm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（下午）|
|<el-row justify="space-between"><el-col :span="20">email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模板|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版内容|
|<el-row justify="space-between"><el-col :span="20">sms_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板内容|
|<el-row justify="space-between"><el-col :span="20">bank_card_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|银行卡信息|
|<el-row justify="space-between"><el-col :span="20">offer_attachment_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件模版|
|<el-row justify="space-between"><el-col :span="20">is_generate_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|生成offer附件|
|<el-row justify="space-between"><el-col :span="20">is_encrypted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加密|
|<el-row justify="space-between"><el-col :span="20">attachment_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件密码|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">hr_idea_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">res_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



## 根据候选人申请获取OFFER录用草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|候选人申请主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">job_rank_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">location_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地-市|
|<el-row justify="space-between"><el-col :span="20">location_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职地点|
|<el-row justify="space-between"><el-col :span="20">hr_idea_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">checkindate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预计入职日期|
|<el-row justify="space-between"><el-col :span="20">offer_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer类型|
|<el-row justify="space-between"><el-col :span="20">meal_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|餐补|
|<el-row justify="space-between"><el-col :span="20">ma_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|餐补单位|
|<el-row justify="space-between"><el-col :span="20">salary_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪资类型|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">approval_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批附件|
|<el-row justify="space-between"><el-col :span="20">salary_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪酬分配方式|
|<el-row justify="space-between"><el-col :span="20">salary1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正基本工资|
|<el-row justify="space-between"><el-col :span="20">salary2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习生绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期基本工资|
|<el-row justify="space-between"><el-col :span="20">salary5</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期绩效工资|
|<el-row justify="space-between"><el-col :span="20">annual_performance_bonus</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|年度绩效奖金|
|<el-row justify="space-between"><el-col :span="20">salary6</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习期薪酬|
|<el-row justify="space-between"><el-col :span="20">transportation_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|交通补贴|
|<el-row justify="space-between"><el-col :span="20">communication_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|通讯补贴|
|<el-row justify="space-between"><el-col :span="20">current_employer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘人员所属公司|
|<el-row justify="space-between"><el-col :span="20">contract_term</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合同期限（年）|
|<el-row justify="space-between"><el-col :span="20">working_hours_am</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（上午）|
|<el-row justify="space-between"><el-col :span="20">working_hours_pm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（下午）|
|<el-row justify="space-between"><el-col :span="20">email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模板|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版内容|
|<el-row justify="space-between"><el-col :span="20">sms_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板内容|
|<el-row justify="space-between"><el-col :span="20">bank_card_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|银行卡信息|
|<el-row justify="space-between"><el-col :span="20">offer_attachment_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件模版|
|<el-row justify="space-between"><el-col :span="20">is_generate_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|生成offer附件|
|<el-row justify="space-between"><el-col :span="20">is_encrypted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加密|
|<el-row justify="space-between"><el-col :span="20">attachment_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件密码|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">hr_idea_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">res_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



## 根据候选人申请保存OFFER录用

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|候选人申请主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">job_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">job_rank_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位级别|
|<el-row justify="space-between"><el-col :span="20">location_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作地-市|
|<el-row justify="space-between"><el-col :span="20">location_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职地点|
|<el-row justify="space-between"><el-col :span="20">hr_idea_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">checkindate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|预计入职日期|
|<el-row justify="space-between"><el-col :span="20">offer_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer类型|
|<el-row justify="space-between"><el-col :span="20">meal_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|餐补|
|<el-row justify="space-between"><el-col :span="20">ma_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|餐补单位|
|<el-row justify="space-between"><el-col :span="20">salary_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪资类型|
|<el-row justify="space-between"><el-col :span="20">candidate_display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人姓名|
|<el-row justify="space-between"><el-col :span="20">approval_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|审批附件|
|<el-row justify="space-between"><el-col :span="20">salary_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|薪酬分配方式|
|<el-row justify="space-between"><el-col :span="20">salary1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正基本工资|
|<el-row justify="space-between"><el-col :span="20">salary2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习生绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|转正绩效工资|
|<el-row justify="space-between"><el-col :span="20">salary4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期基本工资|
|<el-row justify="space-between"><el-col :span="20">salary5</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|试用期绩效工资|
|<el-row justify="space-between"><el-col :span="20">annual_performance_bonus</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|年度绩效奖金|
|<el-row justify="space-between"><el-col :span="20">salary6</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|实习期薪酬|
|<el-row justify="space-between"><el-col :span="20">transportation_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|交通补贴|
|<el-row justify="space-between"><el-col :span="20">communication_allowance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|通讯补贴|
|<el-row justify="space-between"><el-col :span="20">current_employer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘人员所属公司|
|<el-row justify="space-between"><el-col :span="20">contract_term</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合同期限（年）|
|<el-row justify="space-between"><el-col :span="20">working_hours_am</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（上午）|
|<el-row justify="space-between"><el-col :span="20">working_hours_pm</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间（下午）|
|<el-row justify="space-between"><el-col :span="20">email_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模板|
|<el-row justify="space-between"><el-col :span="20">email_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮件模版内容|
|<el-row justify="space-between"><el-col :span="20">sms_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板|
|<el-row justify="space-between"><el-col :span="20">sms_content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|短信模板内容|
|<el-row justify="space-between"><el-col :span="20">bank_card_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|银行卡信息|
|<el-row justify="space-between"><el-col :span="20">offer_attachment_template</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件模版|
|<el-row justify="space-between"><el-col :span="20">is_generate_attachment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|生成offer附件|
|<el-row justify="space-between"><el-col :span="20">is_encrypted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否加密|
|<el-row justify="space-between"><el-col :span="20">attachment_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附件密码|
|<el-row justify="space-between"><el-col :span="20">job_platform_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|平台名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号|
|<el-row justify="space-between"><el-col :span="20">email_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">experience</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作经验|
|<el-row justify="space-between"><el-col :span="20">education</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|教育程度|
|<el-row justify="space-between"><el-col :span="20">address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地|
|<el-row justify="space-between"><el-col :span="20">applicant_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">hr_idea_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">res_company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">res_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



## 根据候选人申请bi_search

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/fetch_bi_search" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|候选人申请主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_res_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">n_res_company_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|
|<el-row justify="space-between"><el-col :span="20">n_res_company_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|



## 根据候选人申请数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|候选人申请主键|




##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_applicant_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人申请|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求标识|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">n_hr_idea_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|招聘需求|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_job_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|应聘岗位|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_res_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门标识|
|<el-row justify="space-between"><el-col :span="20">n_res_company_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|
|<el-row justify="space-between"><el-col :span="20">n_res_company_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|入职部门|




## 根据候选人申请下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/importtemplate" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |



## 根据候选人申请数据导出

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/exportdata/{param},/hr_applicants/{pkey}/hr_offers/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|
|param|String|导出集合方法名称|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|
|srfexporttag|String|导出模板标识|

##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|page|Integer|page|
|size|Integer|分页大小|
|n_xxx_eq|String|过滤参数|


## 根据候选人申请数据导入

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/importdata" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 根据候选人申请数据导入（返回错误excel）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/importdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 根据候选人申请自定义表头导入（异步）
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/asyncimportdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |
| srfossfileid | String | 导入文件 |
| srfimportschemaid | String | 表头定义 |


## 根据候选人申请数据打印
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/printdata/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfprinttag | String | 打印标识 |
| srfcontenttype | String | 打印类型 |



## 根据候选人申请报表打印

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_applicants/{pkey}/hr_offers/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|pkey|String|标识|

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