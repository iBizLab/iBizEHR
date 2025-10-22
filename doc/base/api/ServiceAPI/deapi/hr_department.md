# 部门(hr_department) :id=hr_department
## 创建部门

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">absence_of_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|今日缺勤|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">allocation_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的分配|
|<el-row justify="space-between"><el-col :span="20">child_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接下属部门数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色指标|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整名称|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">expected_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预期的员工|
|<el-row justify="space-between"><el-col :span="20">expense_sheets_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的费用报表|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">has_read_access</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Read Access|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">leave_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的休假|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">manager_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">master_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_applicant_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新申请|
|<el-row justify="space-between"><el-col :span="20">new_hired_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新雇用的员工|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父级路径|
|<el-row justify="space-between"><el-col :span="20">plans_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划数量|
|<el-row justify="space-between"><el-col :span="20">total_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Total Employee|



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_of_today" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "allocation_to_approve_count" : null,
  "child_count" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "complete_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "expected_employee" : null,
  "expense_sheets_to_approve_count" : null,
  "has_message" : null,
  "has_read_access" : null,
  "id" : null,
  "leave_to_approve_count" : null,
  "manager_id" : null,
  "manager_name" : null,
  "master_department_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_applicant_count" : null,
  "new_hired_employee" : null,
  "note" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "plans_count" : null,
  "total_employee" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_of_today" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "allocation_to_approve_count" : null,
  "child_count" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "complete_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "expected_employee" : null,
  "expense_sheets_to_approve_count" : null,
  "has_message" : null,
  "has_read_access" : null,
  "id" : null,
  "leave_to_approve_count" : null,
  "manager_id" : null,
  "manager_name" : null,
  "master_department_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_applicant_count" : null,
  "new_hired_employee" : null,
  "note" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "plans_count" : null,
  "total_employee" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取部门

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/{key}" type="info" :closable="false" ></el-alert>
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
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_of_today" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "allocation_to_approve_count" : null,
  "child_count" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "complete_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "expected_employee" : null,
  "expense_sheets_to_approve_count" : null,
  "has_message" : null,
  "has_read_access" : null,
  "id" : null,
  "leave_to_approve_count" : null,
  "manager_id" : null,
  "manager_name" : null,
  "master_department_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_applicant_count" : null,
  "new_hired_employee" : null,
  "note" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "plans_count" : null,
  "total_employee" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除部门

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新部门

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">absence_of_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|今日缺勤|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">allocation_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的分配|
|<el-row justify="space-between"><el-col :span="20">child_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接下属部门数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色指标|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整名称|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">expected_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预期的员工|
|<el-row justify="space-between"><el-col :span="20">expense_sheets_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的费用报表|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">has_read_access</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Read Access|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">leave_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的休假|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">manager_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">master_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_applicant_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新申请|
|<el-row justify="space-between"><el-col :span="20">new_hired_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新雇用的员工|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父级路径|
|<el-row justify="space-between"><el-col :span="20">plans_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划数量|
|<el-row justify="space-between"><el-col :span="20">total_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Total Employee|



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_of_today" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "allocation_to_approve_count" : null,
  "child_count" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "complete_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "expected_employee" : null,
  "expense_sheets_to_approve_count" : null,
  "has_message" : null,
  "has_read_access" : null,
  "id" : null,
  "leave_to_approve_count" : null,
  "manager_id" : null,
  "manager_name" : null,
  "master_department_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_applicant_count" : null,
  "new_hired_employee" : null,
  "note" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "plans_count" : null,
  "total_employee" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_of_today" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "allocation_to_approve_count" : null,
  "child_count" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "complete_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "expected_employee" : null,
  "expense_sheets_to_approve_count" : null,
  "has_message" : null,
  "has_read_access" : null,
  "id" : null,
  "leave_to_approve_count" : null,
  "manager_id" : null,
  "manager_name" : null,
  "master_department_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_applicant_count" : null,
  "new_hired_employee" : null,
  "note" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "plans_count" : null,
  "total_employee" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查部门主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">absence_of_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|今日缺勤|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">allocation_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的分配|
|<el-row justify="space-between"><el-col :span="20">child_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接下属部门数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色指标|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整名称|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">expected_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预期的员工|
|<el-row justify="space-between"><el-col :span="20">expense_sheets_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的费用报表|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">has_read_access</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Read Access|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">leave_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的休假|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">manager_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">master_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_applicant_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新申请|
|<el-row justify="space-between"><el-col :span="20">new_hired_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新雇用的员工|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父级路径|
|<el-row justify="space-between"><el-col :span="20">plans_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划数量|
|<el-row justify="space-between"><el-col :span="20">total_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Total Employee|



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_of_today" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "allocation_to_approve_count" : null,
  "child_count" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "complete_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "expected_employee" : null,
  "expense_sheets_to_approve_count" : null,
  "has_message" : null,
  "has_read_access" : null,
  "id" : null,
  "leave_to_approve_count" : null,
  "manager_id" : null,
  "manager_name" : null,
  "master_department_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_applicant_count" : null,
  "new_hired_employee" : null,
  "note" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "plans_count" : null,
  "total_employee" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 部门计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/{key}/department_counter" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">absence_of_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|今日缺勤|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">allocation_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的分配|
|<el-row justify="space-between"><el-col :span="20">child_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接下属部门数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色指标|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整名称|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">expected_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预期的员工|
|<el-row justify="space-between"><el-col :span="20">expense_sheets_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的费用报表|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">has_read_access</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Read Access|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">leave_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的休假|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">manager_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">master_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_applicant_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新申请|
|<el-row justify="space-between"><el-col :span="20">new_hired_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新雇用的员工|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父级路径|
|<el-row justify="space-between"><el-col :span="20">plans_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划数量|
|<el-row justify="space-between"><el-col :span="20">total_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Total Employee|



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_of_today" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "allocation_to_approve_count" : null,
  "child_count" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "complete_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "expected_employee" : null,
  "expense_sheets_to_approve_count" : null,
  "has_message" : null,
  "has_read_access" : null,
  "id" : null,
  "leave_to_approve_count" : null,
  "manager_id" : null,
  "manager_name" : null,
  "master_department_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_applicant_count" : null,
  "new_hired_employee" : null,
  "note" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "plans_count" : null,
  "total_employee" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "plans_count" : null,
  "total_employee" : null,
}

```

## 获取部门草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">absence_of_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|今日缺勤|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">allocation_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的分配|
|<el-row justify="space-between"><el-col :span="20">child_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接下属部门数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色指标|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整名称|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">expected_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预期的员工|
|<el-row justify="space-between"><el-col :span="20">expense_sheets_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的费用报表|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">has_read_access</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Read Access|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">leave_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的休假|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">manager_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">master_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_applicant_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新申请|
|<el-row justify="space-between"><el-col :span="20">new_hired_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新雇用的员工|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父级路径|
|<el-row justify="space-between"><el-col :span="20">plans_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划数量|
|<el-row justify="space-between"><el-col :span="20">total_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Total Employee|



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_of_today" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "allocation_to_approve_count" : null,
  "child_count" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "complete_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "expected_employee" : null,
  "expense_sheets_to_approve_count" : null,
  "has_message" : null,
  "has_read_access" : null,
  "id" : null,
  "leave_to_approve_count" : null,
  "manager_id" : null,
  "manager_name" : null,
  "master_department_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_applicant_count" : null,
  "new_hired_employee" : null,
  "note" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "plans_count" : null,
  "total_employee" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_of_today" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "allocation_to_approve_count" : null,
  "child_count" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "complete_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "expected_employee" : null,
  "expense_sheets_to_approve_count" : null,
  "has_message" : null,
  "has_read_access" : null,
  "id" : null,
  "leave_to_approve_count" : null,
  "manager_id" : null,
  "manager_name" : null,
  "master_department_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_applicant_count" : null,
  "new_hired_employee" : null,
  "note" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "plans_count" : null,
  "total_employee" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存部门

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">absence_of_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|今日缺勤|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">allocation_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的分配|
|<el-row justify="space-between"><el-col :span="20">child_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接下属部门数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色指标|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整名称|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">expected_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|预期的员工|
|<el-row justify="space-between"><el-col :span="20">expense_sheets_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的费用报表|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">has_read_access</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Has Read Access|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">leave_to_approve_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待批准的休假|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">manager_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">master_department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_applicant_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新申请|
|<el-row justify="space-between"><el-col :span="20">new_hired_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新雇用的员工|
|<el-row justify="space-between"><el-col :span="20">note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|父级路径|
|<el-row justify="space-between"><el-col :span="20">plans_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划数量|
|<el-row justify="space-between"><el-col :span="20">total_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Total Employee|



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_of_today" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "allocation_to_approve_count" : null,
  "child_count" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "complete_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "expected_employee" : null,
  "expense_sheets_to_approve_count" : null,
  "has_message" : null,
  "has_read_access" : null,
  "id" : null,
  "leave_to_approve_count" : null,
  "manager_id" : null,
  "manager_name" : null,
  "master_department_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_applicant_count" : null,
  "new_hired_employee" : null,
  "note" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "plans_count" : null,
  "total_employee" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_of_today" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "allocation_to_approve_count" : null,
  "child_count" : null,
  "color" : null,
  "company_id" : null,
  "company_name" : null,
  "complete_name" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "expected_employee" : null,
  "expense_sheets_to_approve_count" : null,
  "has_message" : null,
  "has_read_access" : null,
  "id" : null,
  "leave_to_approve_count" : null,
  "manager_id" : null,
  "manager_name" : null,
  "master_department_id" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_applicant_count" : null,
  "new_hired_employee" : null,
  "note" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "plans_count" : null,
  "total_employee" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_manager_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_master_department_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_company_id_eq" : null,
  "n_company_name_eq" : null,
  "n_company_name_like" : null,
  "n_id_eq" : null,
  "n_manager_id_eq" : null,
  "n_manager_name_eq" : null,
  "n_manager_name_like" : null,
  "n_master_department_id_eq" : null,
  "n_name_like" : null,
  "n_parent_id_eq" : null,
  "n_parent_name_eq" : null,
  "n_parent_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "activities" : null,
    "attachments" : null,
    "followers" : null,
    "absence_of_today" : null,
    "active" : null,
    "activity_date_deadline" : null,
    "activity_exception_decoration" : null,
    "activity_exception_icon" : null,
    "activity_state" : null,
    "allocation_to_approve_count" : null,
    "child_count" : null,
    "color" : null,
    "company_id" : null,
    "company_name" : null,
    "complete_name" : null,
    "create_date" : null,
    "create_uid" : null,
    "display_name" : null,
    "expected_employee" : null,
    "expense_sheets_to_approve_count" : null,
    "has_message" : null,
    "has_read_access" : null,
    "id" : null,
    "leave_to_approve_count" : null,
    "manager_id" : null,
    "manager_name" : null,
    "master_department_id" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "my_activity_date_deadline" : null,
    "name" : null,
    "new_applicant_count" : null,
    "new_hired_employee" : null,
    "note" : null,
    "parent_id" : null,
    "parent_name" : null,
    "parent_path" : null,
    "plans_count" : null,
    "total_employee" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 部门架构

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/fetch_department_chart" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_manager_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_master_department_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_company_id_eq" : null,
  "n_company_name_eq" : null,
  "n_company_name_like" : null,
  "n_id_eq" : null,
  "n_manager_id_eq" : null,
  "n_manager_name_eq" : null,
  "n_manager_name_like" : null,
  "n_master_department_id_eq" : null,
  "n_name_like" : null,
  "n_parent_id_eq" : null,
  "n_parent_name_eq" : null,
  "n_parent_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "activities" : null,
    "attachments" : null,
    "followers" : null,
    "absence_of_today" : null,
    "active" : null,
    "activity_date_deadline" : null,
    "activity_exception_decoration" : null,
    "activity_exception_icon" : null,
    "activity_state" : null,
    "allocation_to_approve_count" : null,
    "child_count" : null,
    "color" : null,
    "company_id" : null,
    "company_name" : null,
    "complete_name" : null,
    "create_date" : null,
    "create_uid" : null,
    "display_name" : null,
    "expected_employee" : null,
    "expense_sheets_to_approve_count" : null,
    "has_message" : null,
    "has_read_access" : null,
    "id" : null,
    "leave_to_approve_count" : null,
    "manager_id" : null,
    "manager_name" : null,
    "master_department_id" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "my_activity_date_deadline" : null,
    "name" : null,
    "new_applicant_count" : null,
    "new_hired_employee" : null,
    "note" : null,
    "parent_id" : null,
    "parent_name" : null,
    "parent_path" : null,
    "plans_count" : null,
    "total_employee" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 部门层级

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/fetch_department_hierarchy" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_manager_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_master_department_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_company_id_eq" : null,
  "n_company_name_eq" : null,
  "n_company_name_like" : null,
  "n_id_eq" : null,
  "n_manager_id_eq" : null,
  "n_manager_name_eq" : null,
  "n_manager_name_like" : null,
  "n_master_department_id_eq" : null,
  "n_name_like" : null,
  "n_parent_id_eq" : null,
  "n_parent_name_eq" : null,
  "n_parent_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "activities" : null,
    "attachments" : null,
    "followers" : null,
    "absence_of_today" : null,
    "active" : null,
    "activity_date_deadline" : null,
    "activity_exception_decoration" : null,
    "activity_exception_icon" : null,
    "activity_state" : null,
    "allocation_to_approve_count" : null,
    "child_count" : null,
    "color" : null,
    "company_id" : null,
    "company_name" : null,
    "complete_name" : null,
    "create_date" : null,
    "create_uid" : null,
    "display_name" : null,
    "expected_employee" : null,
    "expense_sheets_to_approve_count" : null,
    "has_message" : null,
    "has_read_access" : null,
    "id" : null,
    "leave_to_approve_count" : null,
    "manager_id" : null,
    "manager_name" : null,
    "master_department_id" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "my_activity_date_deadline" : null,
    "name" : null,
    "new_applicant_count" : null,
    "new_hired_employee" : null,
    "note" : null,
    "parent_id" : null,
    "parent_name" : null,
    "parent_path" : null,
    "plans_count" : null,
    "total_employee" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 根部门

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/fetch_root" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`
注意附加当前权限公司范围



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_manager_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_master_department_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_company_id_eq" : null,
  "n_company_name_eq" : null,
  "n_company_name_like" : null,
  "n_id_eq" : null,
  "n_manager_id_eq" : null,
  "n_manager_name_eq" : null,
  "n_manager_name_like" : null,
  "n_master_department_id_eq" : null,
  "n_name_like" : null,
  "n_parent_id_eq" : null,
  "n_parent_name_eq" : null,
  "n_parent_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "activities" : null,
    "attachments" : null,
    "followers" : null,
    "absence_of_today" : null,
    "active" : null,
    "activity_date_deadline" : null,
    "activity_exception_decoration" : null,
    "activity_exception_icon" : null,
    "activity_state" : null,
    "allocation_to_approve_count" : null,
    "child_count" : null,
    "color" : null,
    "company_id" : null,
    "company_name" : null,
    "complete_name" : null,
    "create_date" : null,
    "create_uid" : null,
    "display_name" : null,
    "expected_employee" : null,
    "expense_sheets_to_approve_count" : null,
    "has_message" : null,
    "has_read_access" : null,
    "id" : null,
    "leave_to_approve_count" : null,
    "manager_id" : null,
    "manager_name" : null,
    "master_department_id" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "my_activity_date_deadline" : null,
    "name" : null,
    "new_applicant_count" : null,
    "new_hired_employee" : null,
    "note" : null,
    "parent_id" : null,
    "parent_name" : null,
    "parent_path" : null,
    "plans_count" : null,
    "total_employee" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 简单查询

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/fetch_simple" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_manager_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|管理员|
|<el-row justify="space-between"><el-col :span="20">n_master_department_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主部门|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级部门|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_company_id_eq" : null,
  "n_company_name_eq" : null,
  "n_company_name_like" : null,
  "n_id_eq" : null,
  "n_manager_id_eq" : null,
  "n_manager_name_eq" : null,
  "n_manager_name_like" : null,
  "n_master_department_id_eq" : null,
  "n_name_like" : null,
  "n_parent_id_eq" : null,
  "n_parent_name_eq" : null,
  "n_parent_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "color" : null,
    "company_id" : null,
    "company_name" : null,
    "manager_id" : null,
    "manager_name" : null,
    "name" : null,
    "parent_id" : null,
    "parent_name" : null,
    "total_employee" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_departments/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_departments/exportdata/{param},/hr_departments/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_departments/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_departments/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_departments/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_departments/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_departments/report" type="info" :closable="false" ></el-alert>
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