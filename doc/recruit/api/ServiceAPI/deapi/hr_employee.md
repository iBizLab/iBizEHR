# 员工(hr_employee) :id=hr_employee
## 创建员工

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_employees" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">identification_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件类型|
|<el-row justify="space-between"><el-col :span="20">nation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|民族|
|<el-row justify="space-between"><el-col :span="20">marital_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|婚姻状况|
|<el-row justify="space-between"><el-col :span="20">start_workdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|参加工作日期|
|<el-row justify="space-between"><el-col :span="20">education_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学历|
|<el-row justify="space-between"><el-col :span="20">major</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业|
|<el-row justify="space-between"><el-col :span="20">join_workdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|入职日期|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">additional_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它说明|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|徽标 ID|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|出生日期|
|<el-row justify="space-between"><el-col :span="20">certificate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">children</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受抚养的子女数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色指标|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">contract_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同警告|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">department_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">departure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|离职日期|
|<el-row justify="space-between"><el-col :span="20">departure_description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它信息|
|<el-row justify="space-between"><el-col :span="20">distance_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离|
|<el-row justify="space-between"><el-col :span="20">distance_home_work_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">emergency_contact</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">emergency_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|雇佣关系|
|<el-row justify="space-between"><el-col :span="20">first_contract_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次合同日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">hr_job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">identification_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件号码|
|<el-row justify="space-between"><el-col :span="20">is_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|灵活可变|
|<el-row justify="space-between"><el-col :span="20">is_fully_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|完全灵活|
|<el-row justify="space-between"><el-col :span="20">job_title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作头衔|
|<el-row justify="space-between"><el-col :span="20">km_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离（公里）|
|<el-row justify="space-between"><el-col :span="20">legal_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|法定名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号码|
|<el-row justify="space-between"><el-col :span="20">mobility_card</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调动卡|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">passport_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|护照号|
|<el-row justify="space-between"><el-col :span="20">permit_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|PIN|
|<el-row justify="space-between"><el-col :span="20">place_of_birth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生地|
|<el-row justify="space-between"><el-col :span="20">private_car_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人车辆车牌|
|<el-row justify="space-between"><el-col :span="20">private_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍所在地|
|<el-row justify="space-between"><el-col :span="20">private_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电子邮箱|
|<el-row justify="space-between"><el-col :span="20">private_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电话|
|<el-row justify="space-between"><el-col :span="20">private_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">private_street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍详细地址|
|<el-row justify="space-between"><el-col :span="20">private_zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">sinid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保险号SIN|
|<el-row justify="space-between"><el-col :span="20">spouse_birthdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|配偶生日|
|<el-row justify="space-between"><el-col :span="20">spouse_complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配偶全名|
|<el-row justify="space-between"><el-col :span="20">ssnid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保障号SSN|
|<el-row justify="space-between"><el-col :span="20">study_field</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|研究领域|
|<el-row justify="space-between"><el-col :span="20">study_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业学校|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">vehicle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司汽车|
|<el-row justify="space-between"><el-col :span="20">visa_expire</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签证有效期|
|<el-row justify="space-between"><el-col :span="20">visa_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|签证号|
|<el-row justify="space-between"><el-col :span="20">work_email</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|工作电子邮件|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|工作许可证到期日期|
|<el-row justify="space-between"><el-col :span="20">work_permit_scheduled_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可的预定活动|
|<el-row justify="space-between"><el-col :span="20">work_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公电话|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理链|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identification_type" : null,
  "nation" : null,
  "marital_status" : null,
  "start_workdate" : null,
  "education_level" : null,
  "major" : null,
  "join_workdate" : null,
  "active" : null,
  "additional_note" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "children" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "contract_warning" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_type" : null,
  "first_contract_date" : null,
  "gender" : null,
  "hr_job_id" : null,
  "identification_id" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "job_title" : null,
  "km_home_work" : null,
  "legal_name" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "notes" : null,
  "passport_id" : null,
  "permit_no" : null,
  "pin" : null,
  "place_of_birth" : null,
  "private_car_plate" : null,
  "private_city" : null,
  "private_email" : null,
  "private_phone" : null,
  "private_street" : null,
  "private_street2" : null,
  "private_zip" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "user_id" : null,
  "user_name" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
  "parent_path" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identification_type" : null,
  "nation" : null,
  "marital_status" : null,
  "start_workdate" : null,
  "education_level" : null,
  "major" : null,
  "join_workdate" : null,
  "active" : null,
  "additional_note" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "children" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "contract_warning" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_type" : null,
  "first_contract_date" : null,
  "gender" : null,
  "hr_job_id" : null,
  "identification_id" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "job_title" : null,
  "km_home_work" : null,
  "legal_name" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "notes" : null,
  "passport_id" : null,
  "permit_no" : null,
  "pin" : null,
  "place_of_birth" : null,
  "private_car_plate" : null,
  "private_city" : null,
  "private_email" : null,
  "private_phone" : null,
  "private_street" : null,
  "private_street2" : null,
  "private_zip" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "user_id" : null,
  "user_name" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
  "parent_path" : null,
}

```

## 获取员工

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_employees/{key}" type="info" :closable="false" ></el-alert>
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
  "identification_type" : null,
  "nation" : null,
  "marital_status" : null,
  "start_workdate" : null,
  "education_level" : null,
  "major" : null,
  "join_workdate" : null,
  "active" : null,
  "additional_note" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "children" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "contract_warning" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_type" : null,
  "first_contract_date" : null,
  "gender" : null,
  "hr_job_id" : null,
  "identification_id" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "job_title" : null,
  "km_home_work" : null,
  "legal_name" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "notes" : null,
  "passport_id" : null,
  "permit_no" : null,
  "pin" : null,
  "place_of_birth" : null,
  "private_car_plate" : null,
  "private_city" : null,
  "private_email" : null,
  "private_phone" : null,
  "private_street" : null,
  "private_street2" : null,
  "private_zip" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "user_id" : null,
  "user_name" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
  "parent_path" : null,
}

```

## 删除员工

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_employees/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新员工

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_employees/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">identification_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件类型|
|<el-row justify="space-between"><el-col :span="20">nation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|民族|
|<el-row justify="space-between"><el-col :span="20">marital_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|婚姻状况|
|<el-row justify="space-between"><el-col :span="20">start_workdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|参加工作日期|
|<el-row justify="space-between"><el-col :span="20">education_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学历|
|<el-row justify="space-between"><el-col :span="20">major</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业|
|<el-row justify="space-between"><el-col :span="20">join_workdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|入职日期|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">additional_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它说明|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|徽标 ID|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|出生日期|
|<el-row justify="space-between"><el-col :span="20">certificate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">children</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受抚养的子女数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色指标|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">contract_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同警告|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">department_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">departure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|离职日期|
|<el-row justify="space-between"><el-col :span="20">departure_description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它信息|
|<el-row justify="space-between"><el-col :span="20">distance_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离|
|<el-row justify="space-between"><el-col :span="20">distance_home_work_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">emergency_contact</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">emergency_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|雇佣关系|
|<el-row justify="space-between"><el-col :span="20">first_contract_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次合同日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">hr_job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">identification_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件号码|
|<el-row justify="space-between"><el-col :span="20">is_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|灵活可变|
|<el-row justify="space-between"><el-col :span="20">is_fully_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|完全灵活|
|<el-row justify="space-between"><el-col :span="20">job_title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作头衔|
|<el-row justify="space-between"><el-col :span="20">km_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离（公里）|
|<el-row justify="space-between"><el-col :span="20">legal_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|法定名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号码|
|<el-row justify="space-between"><el-col :span="20">mobility_card</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调动卡|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">passport_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|护照号|
|<el-row justify="space-between"><el-col :span="20">permit_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|PIN|
|<el-row justify="space-between"><el-col :span="20">place_of_birth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生地|
|<el-row justify="space-between"><el-col :span="20">private_car_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人车辆车牌|
|<el-row justify="space-between"><el-col :span="20">private_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍所在地|
|<el-row justify="space-between"><el-col :span="20">private_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电子邮箱|
|<el-row justify="space-between"><el-col :span="20">private_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电话|
|<el-row justify="space-between"><el-col :span="20">private_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">private_street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍详细地址|
|<el-row justify="space-between"><el-col :span="20">private_zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">sinid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保险号SIN|
|<el-row justify="space-between"><el-col :span="20">spouse_birthdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|配偶生日|
|<el-row justify="space-between"><el-col :span="20">spouse_complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配偶全名|
|<el-row justify="space-between"><el-col :span="20">ssnid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保障号SSN|
|<el-row justify="space-between"><el-col :span="20">study_field</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|研究领域|
|<el-row justify="space-between"><el-col :span="20">study_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业学校|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">vehicle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司汽车|
|<el-row justify="space-between"><el-col :span="20">visa_expire</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签证有效期|
|<el-row justify="space-between"><el-col :span="20">visa_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|签证号|
|<el-row justify="space-between"><el-col :span="20">work_email</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|工作电子邮件|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|工作许可证到期日期|
|<el-row justify="space-between"><el-col :span="20">work_permit_scheduled_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可的预定活动|
|<el-row justify="space-between"><el-col :span="20">work_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公电话|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理链|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identification_type" : null,
  "nation" : null,
  "marital_status" : null,
  "start_workdate" : null,
  "education_level" : null,
  "major" : null,
  "join_workdate" : null,
  "active" : null,
  "additional_note" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "children" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "contract_warning" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_type" : null,
  "first_contract_date" : null,
  "gender" : null,
  "hr_job_id" : null,
  "identification_id" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "job_title" : null,
  "km_home_work" : null,
  "legal_name" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "notes" : null,
  "passport_id" : null,
  "permit_no" : null,
  "pin" : null,
  "place_of_birth" : null,
  "private_car_plate" : null,
  "private_city" : null,
  "private_email" : null,
  "private_phone" : null,
  "private_street" : null,
  "private_street2" : null,
  "private_zip" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "user_id" : null,
  "user_name" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
  "parent_path" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identification_type" : null,
  "nation" : null,
  "marital_status" : null,
  "start_workdate" : null,
  "education_level" : null,
  "major" : null,
  "join_workdate" : null,
  "active" : null,
  "additional_note" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "children" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "contract_warning" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_type" : null,
  "first_contract_date" : null,
  "gender" : null,
  "hr_job_id" : null,
  "identification_id" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "job_title" : null,
  "km_home_work" : null,
  "legal_name" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "notes" : null,
  "passport_id" : null,
  "permit_no" : null,
  "pin" : null,
  "place_of_birth" : null,
  "private_car_plate" : null,
  "private_city" : null,
  "private_email" : null,
  "private_phone" : null,
  "private_street" : null,
  "private_street2" : null,
  "private_zip" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "user_id" : null,
  "user_name" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
  "parent_path" : null,
}

```

## 检查员工主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_employees/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">identification_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件类型|
|<el-row justify="space-between"><el-col :span="20">nation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|民族|
|<el-row justify="space-between"><el-col :span="20">marital_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|婚姻状况|
|<el-row justify="space-between"><el-col :span="20">start_workdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|参加工作日期|
|<el-row justify="space-between"><el-col :span="20">education_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学历|
|<el-row justify="space-between"><el-col :span="20">major</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业|
|<el-row justify="space-between"><el-col :span="20">join_workdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|入职日期|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">additional_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它说明|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|徽标 ID|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|出生日期|
|<el-row justify="space-between"><el-col :span="20">certificate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">children</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受抚养的子女数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色指标|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">contract_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同警告|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">department_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">departure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|离职日期|
|<el-row justify="space-between"><el-col :span="20">departure_description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它信息|
|<el-row justify="space-between"><el-col :span="20">distance_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离|
|<el-row justify="space-between"><el-col :span="20">distance_home_work_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">emergency_contact</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">emergency_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|雇佣关系|
|<el-row justify="space-between"><el-col :span="20">first_contract_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次合同日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">hr_job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">identification_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件号码|
|<el-row justify="space-between"><el-col :span="20">is_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|灵活可变|
|<el-row justify="space-between"><el-col :span="20">is_fully_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|完全灵活|
|<el-row justify="space-between"><el-col :span="20">job_title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作头衔|
|<el-row justify="space-between"><el-col :span="20">km_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离（公里）|
|<el-row justify="space-between"><el-col :span="20">legal_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|法定名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号码|
|<el-row justify="space-between"><el-col :span="20">mobility_card</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调动卡|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">passport_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|护照号|
|<el-row justify="space-between"><el-col :span="20">permit_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|PIN|
|<el-row justify="space-between"><el-col :span="20">place_of_birth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生地|
|<el-row justify="space-between"><el-col :span="20">private_car_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人车辆车牌|
|<el-row justify="space-between"><el-col :span="20">private_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍所在地|
|<el-row justify="space-between"><el-col :span="20">private_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电子邮箱|
|<el-row justify="space-between"><el-col :span="20">private_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电话|
|<el-row justify="space-between"><el-col :span="20">private_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">private_street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍详细地址|
|<el-row justify="space-between"><el-col :span="20">private_zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">sinid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保险号SIN|
|<el-row justify="space-between"><el-col :span="20">spouse_birthdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|配偶生日|
|<el-row justify="space-between"><el-col :span="20">spouse_complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配偶全名|
|<el-row justify="space-between"><el-col :span="20">ssnid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保障号SSN|
|<el-row justify="space-between"><el-col :span="20">study_field</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|研究领域|
|<el-row justify="space-between"><el-col :span="20">study_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业学校|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">vehicle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司汽车|
|<el-row justify="space-between"><el-col :span="20">visa_expire</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签证有效期|
|<el-row justify="space-between"><el-col :span="20">visa_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|签证号|
|<el-row justify="space-between"><el-col :span="20">work_email</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|工作电子邮件|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|工作许可证到期日期|
|<el-row justify="space-between"><el-col :span="20">work_permit_scheduled_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可的预定活动|
|<el-row justify="space-between"><el-col :span="20">work_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公电话|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理链|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identification_type" : null,
  "nation" : null,
  "marital_status" : null,
  "start_workdate" : null,
  "education_level" : null,
  "major" : null,
  "join_workdate" : null,
  "active" : null,
  "additional_note" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "children" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "contract_warning" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_type" : null,
  "first_contract_date" : null,
  "gender" : null,
  "hr_job_id" : null,
  "identification_id" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "job_title" : null,
  "km_home_work" : null,
  "legal_name" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "notes" : null,
  "passport_id" : null,
  "permit_no" : null,
  "pin" : null,
  "place_of_birth" : null,
  "private_car_plate" : null,
  "private_city" : null,
  "private_email" : null,
  "private_phone" : null,
  "private_street" : null,
  "private_street2" : null,
  "private_zip" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "user_id" : null,
  "user_name" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
  "parent_path" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取员工草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_employees/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">identification_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件类型|
|<el-row justify="space-between"><el-col :span="20">nation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|民族|
|<el-row justify="space-between"><el-col :span="20">marital_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|婚姻状况|
|<el-row justify="space-between"><el-col :span="20">start_workdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|参加工作日期|
|<el-row justify="space-between"><el-col :span="20">education_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学历|
|<el-row justify="space-between"><el-col :span="20">major</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业|
|<el-row justify="space-between"><el-col :span="20">join_workdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|入职日期|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">additional_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它说明|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|徽标 ID|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|出生日期|
|<el-row justify="space-between"><el-col :span="20">certificate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">children</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受抚养的子女数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色指标|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">contract_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同警告|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">department_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">departure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|离职日期|
|<el-row justify="space-between"><el-col :span="20">departure_description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它信息|
|<el-row justify="space-between"><el-col :span="20">distance_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离|
|<el-row justify="space-between"><el-col :span="20">distance_home_work_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">emergency_contact</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">emergency_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|雇佣关系|
|<el-row justify="space-between"><el-col :span="20">first_contract_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次合同日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">hr_job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">identification_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件号码|
|<el-row justify="space-between"><el-col :span="20">is_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|灵活可变|
|<el-row justify="space-between"><el-col :span="20">is_fully_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|完全灵活|
|<el-row justify="space-between"><el-col :span="20">job_title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作头衔|
|<el-row justify="space-between"><el-col :span="20">km_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离（公里）|
|<el-row justify="space-between"><el-col :span="20">legal_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|法定名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号码|
|<el-row justify="space-between"><el-col :span="20">mobility_card</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调动卡|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">passport_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|护照号|
|<el-row justify="space-between"><el-col :span="20">permit_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|PIN|
|<el-row justify="space-between"><el-col :span="20">place_of_birth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生地|
|<el-row justify="space-between"><el-col :span="20">private_car_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人车辆车牌|
|<el-row justify="space-between"><el-col :span="20">private_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍所在地|
|<el-row justify="space-between"><el-col :span="20">private_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电子邮箱|
|<el-row justify="space-between"><el-col :span="20">private_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电话|
|<el-row justify="space-between"><el-col :span="20">private_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">private_street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍详细地址|
|<el-row justify="space-between"><el-col :span="20">private_zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">sinid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保险号SIN|
|<el-row justify="space-between"><el-col :span="20">spouse_birthdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|配偶生日|
|<el-row justify="space-between"><el-col :span="20">spouse_complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配偶全名|
|<el-row justify="space-between"><el-col :span="20">ssnid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保障号SSN|
|<el-row justify="space-between"><el-col :span="20">study_field</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|研究领域|
|<el-row justify="space-between"><el-col :span="20">study_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业学校|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">vehicle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司汽车|
|<el-row justify="space-between"><el-col :span="20">visa_expire</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签证有效期|
|<el-row justify="space-between"><el-col :span="20">visa_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|签证号|
|<el-row justify="space-between"><el-col :span="20">work_email</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|工作电子邮件|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|工作许可证到期日期|
|<el-row justify="space-between"><el-col :span="20">work_permit_scheduled_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可的预定活动|
|<el-row justify="space-between"><el-col :span="20">work_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公电话|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理链|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identification_type" : null,
  "nation" : null,
  "marital_status" : null,
  "start_workdate" : null,
  "education_level" : null,
  "major" : null,
  "join_workdate" : null,
  "active" : null,
  "additional_note" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "children" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "contract_warning" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_type" : null,
  "first_contract_date" : null,
  "gender" : null,
  "hr_job_id" : null,
  "identification_id" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "job_title" : null,
  "km_home_work" : null,
  "legal_name" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "notes" : null,
  "passport_id" : null,
  "permit_no" : null,
  "pin" : null,
  "place_of_birth" : null,
  "private_car_plate" : null,
  "private_city" : null,
  "private_email" : null,
  "private_phone" : null,
  "private_street" : null,
  "private_street2" : null,
  "private_zip" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "user_id" : null,
  "user_name" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
  "parent_path" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identification_type" : null,
  "nation" : null,
  "marital_status" : null,
  "start_workdate" : null,
  "education_level" : null,
  "major" : null,
  "join_workdate" : null,
  "active" : null,
  "additional_note" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "children" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "contract_warning" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_type" : null,
  "first_contract_date" : null,
  "gender" : null,
  "hr_job_id" : null,
  "identification_id" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "job_title" : null,
  "km_home_work" : null,
  "legal_name" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "notes" : null,
  "passport_id" : null,
  "permit_no" : null,
  "pin" : null,
  "place_of_birth" : null,
  "private_car_plate" : null,
  "private_city" : null,
  "private_email" : null,
  "private_phone" : null,
  "private_street" : null,
  "private_street2" : null,
  "private_zip" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "user_id" : null,
  "user_name" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
  "parent_path" : null,
}

```

## 保存员工

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_employees/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">identification_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件类型|
|<el-row justify="space-between"><el-col :span="20">nation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|民族|
|<el-row justify="space-between"><el-col :span="20">marital_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|婚姻状况|
|<el-row justify="space-between"><el-col :span="20">start_workdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|参加工作日期|
|<el-row justify="space-between"><el-col :span="20">education_level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学历|
|<el-row justify="space-between"><el-col :span="20">major</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|专业|
|<el-row justify="space-between"><el-col :span="20">join_workdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|入职日期|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">additional_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它说明|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|徽标 ID|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|出生日期|
|<el-row justify="space-between"><el-col :span="20">certificate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">children</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受抚养的子女数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色指标|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">contract_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同警告|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">department_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">departure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|离职日期|
|<el-row justify="space-between"><el-col :span="20">departure_description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它信息|
|<el-row justify="space-between"><el-col :span="20">distance_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离|
|<el-row justify="space-between"><el-col :span="20">distance_home_work_unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">emergency_contact</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">emergency_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|雇佣关系|
|<el-row justify="space-between"><el-col :span="20">first_contract_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次合同日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">hr_job_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">identification_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件号码|
|<el-row justify="space-between"><el-col :span="20">is_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|灵活可变|
|<el-row justify="space-between"><el-col :span="20">is_fully_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|完全灵活|
|<el-row justify="space-between"><el-col :span="20">job_title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作头衔|
|<el-row justify="space-between"><el-col :span="20">km_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离（公里）|
|<el-row justify="space-between"><el-col :span="20">legal_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|法定名称|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机号码|
|<el-row justify="space-between"><el-col :span="20">mobility_card</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调动卡|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">passport_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|护照号|
|<el-row justify="space-between"><el-col :span="20">permit_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工号|
|<el-row justify="space-between"><el-col :span="20">pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|PIN|
|<el-row justify="space-between"><el-col :span="20">place_of_birth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生地|
|<el-row justify="space-between"><el-col :span="20">private_car_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人车辆车牌|
|<el-row justify="space-between"><el-col :span="20">private_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍所在地|
|<el-row justify="space-between"><el-col :span="20">private_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电子邮箱|
|<el-row justify="space-between"><el-col :span="20">private_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电话|
|<el-row justify="space-between"><el-col :span="20">private_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍地址|
|<el-row justify="space-between"><el-col :span="20">private_street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|户籍详细地址|
|<el-row justify="space-between"><el-col :span="20">private_zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">sinid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保险号SIN|
|<el-row justify="space-between"><el-col :span="20">spouse_birthdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|配偶生日|
|<el-row justify="space-between"><el-col :span="20">spouse_complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配偶全名|
|<el-row justify="space-between"><el-col :span="20">ssnid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保障号SSN|
|<el-row justify="space-between"><el-col :span="20">study_field</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|研究领域|
|<el-row justify="space-between"><el-col :span="20">study_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业学校|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">vehicle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司汽车|
|<el-row justify="space-between"><el-col :span="20">visa_expire</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签证有效期|
|<el-row justify="space-between"><el-col :span="20">visa_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|签证号|
|<el-row justify="space-between"><el-col :span="20">work_email</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|工作电子邮件|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|工作许可证到期日期|
|<el-row justify="space-between"><el-col :span="20">work_permit_scheduled_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可的预定活动|
|<el-row justify="space-between"><el-col :span="20">work_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公电话|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理链|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identification_type" : null,
  "nation" : null,
  "marital_status" : null,
  "start_workdate" : null,
  "education_level" : null,
  "major" : null,
  "join_workdate" : null,
  "active" : null,
  "additional_note" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "children" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "contract_warning" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_type" : null,
  "first_contract_date" : null,
  "gender" : null,
  "hr_job_id" : null,
  "identification_id" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "job_title" : null,
  "km_home_work" : null,
  "legal_name" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "notes" : null,
  "passport_id" : null,
  "permit_no" : null,
  "pin" : null,
  "place_of_birth" : null,
  "private_car_plate" : null,
  "private_city" : null,
  "private_email" : null,
  "private_phone" : null,
  "private_street" : null,
  "private_street2" : null,
  "private_zip" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "user_id" : null,
  "user_name" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
  "parent_path" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identification_type" : null,
  "nation" : null,
  "marital_status" : null,
  "start_workdate" : null,
  "education_level" : null,
  "major" : null,
  "join_workdate" : null,
  "active" : null,
  "additional_note" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "children" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "contract_warning" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_type" : null,
  "first_contract_date" : null,
  "gender" : null,
  "hr_job_id" : null,
  "identification_id" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "job_title" : null,
  "km_home_work" : null,
  "legal_name" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "notes" : null,
  "passport_id" : null,
  "permit_no" : null,
  "pin" : null,
  "place_of_birth" : null,
  "private_car_plate" : null,
  "private_city" : null,
  "private_email" : null,
  "private_phone" : null,
  "private_street" : null,
  "private_street2" : null,
  "private_zip" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "user_id" : null,
  "user_name" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
  "parent_path" : null,
}

```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_employees/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_certificate_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">n_company_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">n_company_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">n_department_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">n_department_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">n_department_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">n_distance_home_work_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">n_education_level_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|最高学历|
|<el-row justify="space-between"><el-col :span="20">n_employee_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|雇佣关系|
|<el-row justify="space-between"><el-col :span="20">n_gender_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">n_hr_job_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_identification_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证件类型|
|<el-row justify="space-between"><el-col :span="20">n_marital_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|婚姻状况|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">n_nation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|民族|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">n_user_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|
|<el-row justify="space-between"><el-col :span="20">n_user_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_certificate_eq" : null,
  "n_company_id_eq" : null,
  "n_company_name_eq" : null,
  "n_company_name_like" : null,
  "n_department_id_eq" : null,
  "n_department_name_eq" : null,
  "n_department_name_like" : null,
  "n_distance_home_work_unit_eq" : null,
  "n_education_level_eq" : null,
  "n_employee_type_eq" : null,
  "n_gender_eq" : null,
  "n_hr_job_id_eq" : null,
  "n_id_eq" : null,
  "n_identification_type_eq" : null,
  "n_marital_status_eq" : null,
  "n_name_like" : null,
  "n_nation_eq" : null,
  "n_user_id_eq" : null,
  "n_user_name_eq" : null,
  "n_user_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "identification_type" : null,
    "nation" : null,
    "marital_status" : null,
    "start_workdate" : null,
    "education_level" : null,
    "major" : null,
    "join_workdate" : null,
    "active" : null,
    "additional_note" : null,
    "barcode" : null,
    "birthday" : null,
    "certificate" : null,
    "children" : null,
    "color" : null,
    "company_id" : null,
    "company_name" : null,
    "contract_warning" : null,
    "create_date" : null,
    "create_uid" : null,
    "department_id" : null,
    "department_name" : null,
    "departure_date" : null,
    "departure_description" : null,
    "distance_home_work" : null,
    "distance_home_work_unit" : null,
    "emergency_contact" : null,
    "emergency_phone" : null,
    "employee_type" : null,
    "first_contract_date" : null,
    "gender" : null,
    "hr_job_id" : null,
    "identification_id" : null,
    "is_flexible" : null,
    "is_fully_flexible" : null,
    "job_title" : null,
    "km_home_work" : null,
    "legal_name" : null,
    "mobile_phone" : null,
    "mobility_card" : null,
    "notes" : null,
    "passport_id" : null,
    "permit_no" : null,
    "pin" : null,
    "place_of_birth" : null,
    "private_car_plate" : null,
    "private_city" : null,
    "private_email" : null,
    "private_phone" : null,
    "private_street" : null,
    "private_street2" : null,
    "private_zip" : null,
    "sinid" : null,
    "spouse_birthdate" : null,
    "spouse_complete_name" : null,
    "ssnid" : null,
    "study_field" : null,
    "study_school" : null,
    "user_id" : null,
    "user_name" : null,
    "vehicle" : null,
    "visa_expire" : null,
    "visa_no" : null,
    "work_email" : null,
    "work_permit_expiration_date" : null,
    "work_permit_scheduled_activity" : null,
    "work_phone" : null,
    "write_date" : null,
    "write_uid" : null,
    "parent_path" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_employees/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_employees/exportdata/{param},/hr_employees/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_employees/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_employees/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_employees/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_employees/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_employees/report" type="info" :closable="false" ></el-alert>
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