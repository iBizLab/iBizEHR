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
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">additional_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它说明|
|<el-row justify="space-between"><el-col :span="20">allocation_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|分配的总天数。|
|<el-row justify="space-between"><el-col :span="20">allocation_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配显示|
|<el-row justify="space-between"><el-col :span="20">allocation_remaining_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|剩余的分配显示|
|<el-row justify="space-between"><el-col :span="20">allocations_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分配总数量|
|<el-row justify="space-between"><el-col :span="20">attendance_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出勤状态|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|徽标 ID|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|出生日期|
|<el-row justify="space-between"><el-col :span="20">certificate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">child_all_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|间接下属统计|
|<el-row justify="space-between"><el-col :span="20">child_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接下属人数|
|<el-row justify="space-between"><el-col :span="20">children</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受抚养的子女数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色指标|
|<el-row justify="space-between"><el-col :span="20">contract_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同警告|
|<el-row justify="space-between"><el-col :span="20">contracts_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同统计|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">department_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">departure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|离职日期|
|<el-row justify="space-between"><el-col :span="20">departure_description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它信息|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">distance_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离|
|<el-row justify="space-between"><el-col :span="20">distance_home_work_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">emergency_contact</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">emergency_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">employee_cars_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|车辆|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工类型|
|<el-row justify="space-between"><el-col :span="20">equipment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|设备数量|
|<el-row justify="space-between"><el-col :span="20">filter_for_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|费用筛选|
|<el-row justify="space-between"><el-col :span="20">first_contract_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次合同日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">has_badges</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有徽章|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">hours_last_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时上月|
|<el-row justify="space-between"><el-col :span="20">hours_last_month_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小时上月显示|
|<el-row justify="space-between"><el-col :span="20">hours_previously_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|今天之前的小时数|
|<el-row justify="space-between"><el-col :span="20">hours_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时今天|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">identification_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|身份证号|
|<el-row justify="space-between"><el-col :span="20">is_absent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|今日缺勤|
|<el-row justify="space-between"><el-col :span="20">is_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|灵活可变|
|<el-row justify="space-between"><el-col :span="20">is_fully_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|完全灵活|
|<el-row justify="space-between"><el-col :span="20">is_subordinate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是下属|
|<el-row justify="space-between"><el-col :span="20">job_title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作头衔|
|<el-row justify="space-between"><el-col :span="20">km_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离（公里）|
|<el-row justify="space-between"><el-col :span="20">last_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上个活动|
|<el-row justify="space-between"><el-col :span="20">last_activity_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上个活动时间|
|<el-row justify="space-between"><el-col :span="20">last_attendance_worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|最后一次出勤 工作时数|
|<el-row justify="space-between"><el-col :span="20">leave_date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|起始日期|
|<el-row justify="space-between"><el-col :span="20">leave_date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|至日期|
|<el-row justify="space-between"><el-col :span="20">leaves_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|休假次数|
|<el-row justify="space-between"><el-col :span="20">legal_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|法定名称|
|<el-row justify="space-between"><el-col :span="20">license_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|车辆牌照|
|<el-row justify="space-between"><el-col :span="20">member_of_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|部门数量|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公手机|
|<el-row justify="space-between"><el-col :span="20">mobility_card</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调动卡|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">newly_hired</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最近聘用的|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">passport_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|护照号|
|<el-row justify="space-between"><el-col :span="20">permit_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作证编号|
|<el-row justify="space-between"><el-col :span="20">pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|PIN|
|<el-row justify="space-between"><el-col :span="20">place_of_birth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生地|
|<el-row justify="space-between"><el-col :span="20">private_car_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人车辆车牌|
|<el-row justify="space-between"><el-col :span="20">private_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">private_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电子邮箱|
|<el-row justify="space-between"><el-col :span="20">private_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电话|
|<el-row justify="space-between"><el-col :span="20">private_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">private_street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道2|
|<el-row justify="space-between"><el-col :span="20">private_zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">related_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|相关合作伙伴数量|
|<el-row justify="space-between"><el-col :span="20">remaining_leaves</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|可用休假天数|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">resource_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|资源|
|<el-row justify="space-between"><el-col :span="20">show_hr_icon_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示HR图标|
|<el-row justify="space-between"><el-col :span="20">show_leaves</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能够查看到剩余休假|
|<el-row justify="space-between"><el-col :span="20">sinid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保险号SIN|
|<el-row justify="space-between"><el-col :span="20">spouse_birthdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|配偶生日|
|<el-row justify="space-between"><el-col :span="20">spouse_complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配偶全名|
|<el-row justify="space-between"><el-col :span="20">ssnid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保障号SSN|
|<el-row justify="space-between"><el-col :span="20">study_field</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|研究领域|
|<el-row justify="space-between"><el-col :span="20">study_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">total_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班费总额|
|<el-row justify="space-between"><el-col :span="20">vehicle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司汽车|
|<el-row justify="space-between"><el-col :span="20">visa_expire</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签证有效期|
|<el-row justify="space-between"><el-col :span="20">visa_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|签证号|
|<el-row justify="space-between"><el-col :span="20">work_email</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|工作电子邮件|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|工作许可证到期日期|
|<el-row justify="space-between"><el-col :span="20">work_permit_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作许可名称|
|<el-row justify="space-between"><el-col :span="20">work_permit_scheduled_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可的预定活动|
|<el-row justify="space-between"><el-col :span="20">work_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公电话|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_icon" : null,
  "additional_note" : null,
  "allocation_count" : null,
  "allocation_display" : null,
  "allocation_remaining_display" : null,
  "allocations_count" : null,
  "attendance_state" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "child_all_count" : null,
  "child_count" : null,
  "children" : null,
  "color" : null,
  "contract_warning" : null,
  "contracts_count" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "display_name" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_cars_count" : null,
  "employee_type" : null,
  "equipment_count" : null,
  "filter_for_expense" : null,
  "first_contract_date" : null,
  "gender" : null,
  "has_badges" : null,
  "has_message" : null,
  "hours_last_month" : null,
  "hours_last_month_display" : null,
  "hours_previously_today" : null,
  "hours_today" : null,
  "id" : null,
  "identification_id" : null,
  "is_absent" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "is_subordinate" : null,
  "job_title" : null,
  "km_home_work" : null,
  "last_activity" : null,
  "last_activity_time" : null,
  "last_attendance_worked_hours" : null,
  "leave_date_from" : null,
  "leave_date_to" : null,
  "leaves_count" : null,
  "legal_name" : null,
  "license_plate" : null,
  "member_of_department" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "newly_hired" : null,
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
  "related_partners_count" : null,
  "remaining_leaves" : null,
  "resource_calendar_id" : null,
  "resource_calendar_name" : null,
  "resource_id" : null,
  "show_hr_icon_display" : null,
  "show_leaves" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "total_overtime" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_name" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_icon" : null,
  "additional_note" : null,
  "allocation_count" : null,
  "allocation_display" : null,
  "allocation_remaining_display" : null,
  "allocations_count" : null,
  "attendance_state" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "child_all_count" : null,
  "child_count" : null,
  "children" : null,
  "color" : null,
  "contract_warning" : null,
  "contracts_count" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "display_name" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_cars_count" : null,
  "employee_type" : null,
  "equipment_count" : null,
  "filter_for_expense" : null,
  "first_contract_date" : null,
  "gender" : null,
  "has_badges" : null,
  "has_message" : null,
  "hours_last_month" : null,
  "hours_last_month_display" : null,
  "hours_previously_today" : null,
  "hours_today" : null,
  "id" : null,
  "identification_id" : null,
  "is_absent" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "is_subordinate" : null,
  "job_title" : null,
  "km_home_work" : null,
  "last_activity" : null,
  "last_activity_time" : null,
  "last_attendance_worked_hours" : null,
  "leave_date_from" : null,
  "leave_date_to" : null,
  "leaves_count" : null,
  "legal_name" : null,
  "license_plate" : null,
  "member_of_department" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "newly_hired" : null,
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
  "related_partners_count" : null,
  "remaining_leaves" : null,
  "resource_calendar_id" : null,
  "resource_calendar_name" : null,
  "resource_id" : null,
  "show_hr_icon_display" : null,
  "show_leaves" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "total_overtime" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_name" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
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
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_icon" : null,
  "additional_note" : null,
  "allocation_count" : null,
  "allocation_display" : null,
  "allocation_remaining_display" : null,
  "allocations_count" : null,
  "attendance_state" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "child_all_count" : null,
  "child_count" : null,
  "children" : null,
  "color" : null,
  "contract_warning" : null,
  "contracts_count" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "display_name" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_cars_count" : null,
  "employee_type" : null,
  "equipment_count" : null,
  "filter_for_expense" : null,
  "first_contract_date" : null,
  "gender" : null,
  "has_badges" : null,
  "has_message" : null,
  "hours_last_month" : null,
  "hours_last_month_display" : null,
  "hours_previously_today" : null,
  "hours_today" : null,
  "id" : null,
  "identification_id" : null,
  "is_absent" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "is_subordinate" : null,
  "job_title" : null,
  "km_home_work" : null,
  "last_activity" : null,
  "last_activity_time" : null,
  "last_attendance_worked_hours" : null,
  "leave_date_from" : null,
  "leave_date_to" : null,
  "leaves_count" : null,
  "legal_name" : null,
  "license_plate" : null,
  "member_of_department" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "newly_hired" : null,
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
  "related_partners_count" : null,
  "remaining_leaves" : null,
  "resource_calendar_id" : null,
  "resource_calendar_name" : null,
  "resource_id" : null,
  "show_hr_icon_display" : null,
  "show_leaves" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "total_overtime" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_name" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
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
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">additional_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它说明|
|<el-row justify="space-between"><el-col :span="20">allocation_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|分配的总天数。|
|<el-row justify="space-between"><el-col :span="20">allocation_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配显示|
|<el-row justify="space-between"><el-col :span="20">allocation_remaining_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|剩余的分配显示|
|<el-row justify="space-between"><el-col :span="20">allocations_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分配总数量|
|<el-row justify="space-between"><el-col :span="20">attendance_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出勤状态|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|徽标 ID|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|出生日期|
|<el-row justify="space-between"><el-col :span="20">certificate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">child_all_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|间接下属统计|
|<el-row justify="space-between"><el-col :span="20">child_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接下属人数|
|<el-row justify="space-between"><el-col :span="20">children</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受抚养的子女数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色指标|
|<el-row justify="space-between"><el-col :span="20">contract_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同警告|
|<el-row justify="space-between"><el-col :span="20">contracts_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同统计|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">department_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">departure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|离职日期|
|<el-row justify="space-between"><el-col :span="20">departure_description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它信息|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">distance_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离|
|<el-row justify="space-between"><el-col :span="20">distance_home_work_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">emergency_contact</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">emergency_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">employee_cars_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|车辆|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工类型|
|<el-row justify="space-between"><el-col :span="20">equipment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|设备数量|
|<el-row justify="space-between"><el-col :span="20">filter_for_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|费用筛选|
|<el-row justify="space-between"><el-col :span="20">first_contract_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次合同日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">has_badges</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有徽章|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">hours_last_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时上月|
|<el-row justify="space-between"><el-col :span="20">hours_last_month_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小时上月显示|
|<el-row justify="space-between"><el-col :span="20">hours_previously_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|今天之前的小时数|
|<el-row justify="space-between"><el-col :span="20">hours_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时今天|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">identification_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|身份证号|
|<el-row justify="space-between"><el-col :span="20">is_absent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|今日缺勤|
|<el-row justify="space-between"><el-col :span="20">is_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|灵活可变|
|<el-row justify="space-between"><el-col :span="20">is_fully_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|完全灵活|
|<el-row justify="space-between"><el-col :span="20">is_subordinate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是下属|
|<el-row justify="space-between"><el-col :span="20">job_title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作头衔|
|<el-row justify="space-between"><el-col :span="20">km_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离（公里）|
|<el-row justify="space-between"><el-col :span="20">last_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上个活动|
|<el-row justify="space-between"><el-col :span="20">last_activity_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上个活动时间|
|<el-row justify="space-between"><el-col :span="20">last_attendance_worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|最后一次出勤 工作时数|
|<el-row justify="space-between"><el-col :span="20">leave_date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|起始日期|
|<el-row justify="space-between"><el-col :span="20">leave_date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|至日期|
|<el-row justify="space-between"><el-col :span="20">leaves_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|休假次数|
|<el-row justify="space-between"><el-col :span="20">legal_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|法定名称|
|<el-row justify="space-between"><el-col :span="20">license_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|车辆牌照|
|<el-row justify="space-between"><el-col :span="20">member_of_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|部门数量|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公手机|
|<el-row justify="space-between"><el-col :span="20">mobility_card</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调动卡|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">newly_hired</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最近聘用的|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">passport_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|护照号|
|<el-row justify="space-between"><el-col :span="20">permit_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作证编号|
|<el-row justify="space-between"><el-col :span="20">pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|PIN|
|<el-row justify="space-between"><el-col :span="20">place_of_birth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生地|
|<el-row justify="space-between"><el-col :span="20">private_car_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人车辆车牌|
|<el-row justify="space-between"><el-col :span="20">private_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">private_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电子邮箱|
|<el-row justify="space-between"><el-col :span="20">private_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电话|
|<el-row justify="space-between"><el-col :span="20">private_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">private_street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道2|
|<el-row justify="space-between"><el-col :span="20">private_zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">related_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|相关合作伙伴数量|
|<el-row justify="space-between"><el-col :span="20">remaining_leaves</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|可用休假天数|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">resource_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|资源|
|<el-row justify="space-between"><el-col :span="20">show_hr_icon_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示HR图标|
|<el-row justify="space-between"><el-col :span="20">show_leaves</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能够查看到剩余休假|
|<el-row justify="space-between"><el-col :span="20">sinid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保险号SIN|
|<el-row justify="space-between"><el-col :span="20">spouse_birthdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|配偶生日|
|<el-row justify="space-between"><el-col :span="20">spouse_complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配偶全名|
|<el-row justify="space-between"><el-col :span="20">ssnid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保障号SSN|
|<el-row justify="space-between"><el-col :span="20">study_field</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|研究领域|
|<el-row justify="space-between"><el-col :span="20">study_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">total_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班费总额|
|<el-row justify="space-between"><el-col :span="20">vehicle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司汽车|
|<el-row justify="space-between"><el-col :span="20">visa_expire</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签证有效期|
|<el-row justify="space-between"><el-col :span="20">visa_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|签证号|
|<el-row justify="space-between"><el-col :span="20">work_email</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|工作电子邮件|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|工作许可证到期日期|
|<el-row justify="space-between"><el-col :span="20">work_permit_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作许可名称|
|<el-row justify="space-between"><el-col :span="20">work_permit_scheduled_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可的预定活动|
|<el-row justify="space-between"><el-col :span="20">work_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公电话|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_icon" : null,
  "additional_note" : null,
  "allocation_count" : null,
  "allocation_display" : null,
  "allocation_remaining_display" : null,
  "allocations_count" : null,
  "attendance_state" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "child_all_count" : null,
  "child_count" : null,
  "children" : null,
  "color" : null,
  "contract_warning" : null,
  "contracts_count" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "display_name" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_cars_count" : null,
  "employee_type" : null,
  "equipment_count" : null,
  "filter_for_expense" : null,
  "first_contract_date" : null,
  "gender" : null,
  "has_badges" : null,
  "has_message" : null,
  "hours_last_month" : null,
  "hours_last_month_display" : null,
  "hours_previously_today" : null,
  "hours_today" : null,
  "id" : null,
  "identification_id" : null,
  "is_absent" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "is_subordinate" : null,
  "job_title" : null,
  "km_home_work" : null,
  "last_activity" : null,
  "last_activity_time" : null,
  "last_attendance_worked_hours" : null,
  "leave_date_from" : null,
  "leave_date_to" : null,
  "leaves_count" : null,
  "legal_name" : null,
  "license_plate" : null,
  "member_of_department" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "newly_hired" : null,
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
  "related_partners_count" : null,
  "remaining_leaves" : null,
  "resource_calendar_id" : null,
  "resource_calendar_name" : null,
  "resource_id" : null,
  "show_hr_icon_display" : null,
  "show_leaves" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "total_overtime" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_name" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_icon" : null,
  "additional_note" : null,
  "allocation_count" : null,
  "allocation_display" : null,
  "allocation_remaining_display" : null,
  "allocations_count" : null,
  "attendance_state" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "child_all_count" : null,
  "child_count" : null,
  "children" : null,
  "color" : null,
  "contract_warning" : null,
  "contracts_count" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "display_name" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_cars_count" : null,
  "employee_type" : null,
  "equipment_count" : null,
  "filter_for_expense" : null,
  "first_contract_date" : null,
  "gender" : null,
  "has_badges" : null,
  "has_message" : null,
  "hours_last_month" : null,
  "hours_last_month_display" : null,
  "hours_previously_today" : null,
  "hours_today" : null,
  "id" : null,
  "identification_id" : null,
  "is_absent" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "is_subordinate" : null,
  "job_title" : null,
  "km_home_work" : null,
  "last_activity" : null,
  "last_activity_time" : null,
  "last_attendance_worked_hours" : null,
  "leave_date_from" : null,
  "leave_date_to" : null,
  "leaves_count" : null,
  "legal_name" : null,
  "license_plate" : null,
  "member_of_department" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "newly_hired" : null,
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
  "related_partners_count" : null,
  "remaining_leaves" : null,
  "resource_calendar_id" : null,
  "resource_calendar_name" : null,
  "resource_id" : null,
  "show_hr_icon_display" : null,
  "show_leaves" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "total_overtime" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_name" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
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
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">additional_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它说明|
|<el-row justify="space-between"><el-col :span="20">allocation_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|分配的总天数。|
|<el-row justify="space-between"><el-col :span="20">allocation_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配显示|
|<el-row justify="space-between"><el-col :span="20">allocation_remaining_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|剩余的分配显示|
|<el-row justify="space-between"><el-col :span="20">allocations_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分配总数量|
|<el-row justify="space-between"><el-col :span="20">attendance_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出勤状态|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|徽标 ID|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|出生日期|
|<el-row justify="space-between"><el-col :span="20">certificate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">child_all_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|间接下属统计|
|<el-row justify="space-between"><el-col :span="20">child_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接下属人数|
|<el-row justify="space-between"><el-col :span="20">children</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受抚养的子女数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色指标|
|<el-row justify="space-between"><el-col :span="20">contract_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同警告|
|<el-row justify="space-between"><el-col :span="20">contracts_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同统计|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">department_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">departure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|离职日期|
|<el-row justify="space-between"><el-col :span="20">departure_description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它信息|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">distance_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离|
|<el-row justify="space-between"><el-col :span="20">distance_home_work_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">emergency_contact</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">emergency_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">employee_cars_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|车辆|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工类型|
|<el-row justify="space-between"><el-col :span="20">equipment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|设备数量|
|<el-row justify="space-between"><el-col :span="20">filter_for_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|费用筛选|
|<el-row justify="space-between"><el-col :span="20">first_contract_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次合同日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">has_badges</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有徽章|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">hours_last_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时上月|
|<el-row justify="space-between"><el-col :span="20">hours_last_month_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小时上月显示|
|<el-row justify="space-between"><el-col :span="20">hours_previously_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|今天之前的小时数|
|<el-row justify="space-between"><el-col :span="20">hours_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时今天|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">identification_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|身份证号|
|<el-row justify="space-between"><el-col :span="20">is_absent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|今日缺勤|
|<el-row justify="space-between"><el-col :span="20">is_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|灵活可变|
|<el-row justify="space-between"><el-col :span="20">is_fully_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|完全灵活|
|<el-row justify="space-between"><el-col :span="20">is_subordinate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是下属|
|<el-row justify="space-between"><el-col :span="20">job_title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作头衔|
|<el-row justify="space-between"><el-col :span="20">km_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离（公里）|
|<el-row justify="space-between"><el-col :span="20">last_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上个活动|
|<el-row justify="space-between"><el-col :span="20">last_activity_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上个活动时间|
|<el-row justify="space-between"><el-col :span="20">last_attendance_worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|最后一次出勤 工作时数|
|<el-row justify="space-between"><el-col :span="20">leave_date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|起始日期|
|<el-row justify="space-between"><el-col :span="20">leave_date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|至日期|
|<el-row justify="space-between"><el-col :span="20">leaves_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|休假次数|
|<el-row justify="space-between"><el-col :span="20">legal_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|法定名称|
|<el-row justify="space-between"><el-col :span="20">license_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|车辆牌照|
|<el-row justify="space-between"><el-col :span="20">member_of_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|部门数量|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公手机|
|<el-row justify="space-between"><el-col :span="20">mobility_card</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调动卡|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">newly_hired</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最近聘用的|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">passport_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|护照号|
|<el-row justify="space-between"><el-col :span="20">permit_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作证编号|
|<el-row justify="space-between"><el-col :span="20">pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|PIN|
|<el-row justify="space-between"><el-col :span="20">place_of_birth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生地|
|<el-row justify="space-between"><el-col :span="20">private_car_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人车辆车牌|
|<el-row justify="space-between"><el-col :span="20">private_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">private_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电子邮箱|
|<el-row justify="space-between"><el-col :span="20">private_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电话|
|<el-row justify="space-between"><el-col :span="20">private_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">private_street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道2|
|<el-row justify="space-between"><el-col :span="20">private_zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">related_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|相关合作伙伴数量|
|<el-row justify="space-between"><el-col :span="20">remaining_leaves</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|可用休假天数|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">resource_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|资源|
|<el-row justify="space-between"><el-col :span="20">show_hr_icon_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示HR图标|
|<el-row justify="space-between"><el-col :span="20">show_leaves</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能够查看到剩余休假|
|<el-row justify="space-between"><el-col :span="20">sinid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保险号SIN|
|<el-row justify="space-between"><el-col :span="20">spouse_birthdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|配偶生日|
|<el-row justify="space-between"><el-col :span="20">spouse_complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配偶全名|
|<el-row justify="space-between"><el-col :span="20">ssnid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保障号SSN|
|<el-row justify="space-between"><el-col :span="20">study_field</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|研究领域|
|<el-row justify="space-between"><el-col :span="20">study_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">total_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班费总额|
|<el-row justify="space-between"><el-col :span="20">vehicle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司汽车|
|<el-row justify="space-between"><el-col :span="20">visa_expire</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签证有效期|
|<el-row justify="space-between"><el-col :span="20">visa_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|签证号|
|<el-row justify="space-between"><el-col :span="20">work_email</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|工作电子邮件|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|工作许可证到期日期|
|<el-row justify="space-between"><el-col :span="20">work_permit_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作许可名称|
|<el-row justify="space-between"><el-col :span="20">work_permit_scheduled_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可的预定活动|
|<el-row justify="space-between"><el-col :span="20">work_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公电话|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_icon" : null,
  "additional_note" : null,
  "allocation_count" : null,
  "allocation_display" : null,
  "allocation_remaining_display" : null,
  "allocations_count" : null,
  "attendance_state" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "child_all_count" : null,
  "child_count" : null,
  "children" : null,
  "color" : null,
  "contract_warning" : null,
  "contracts_count" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "display_name" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_cars_count" : null,
  "employee_type" : null,
  "equipment_count" : null,
  "filter_for_expense" : null,
  "first_contract_date" : null,
  "gender" : null,
  "has_badges" : null,
  "has_message" : null,
  "hours_last_month" : null,
  "hours_last_month_display" : null,
  "hours_previously_today" : null,
  "hours_today" : null,
  "id" : null,
  "identification_id" : null,
  "is_absent" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "is_subordinate" : null,
  "job_title" : null,
  "km_home_work" : null,
  "last_activity" : null,
  "last_activity_time" : null,
  "last_attendance_worked_hours" : null,
  "leave_date_from" : null,
  "leave_date_to" : null,
  "leaves_count" : null,
  "legal_name" : null,
  "license_plate" : null,
  "member_of_department" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "newly_hired" : null,
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
  "related_partners_count" : null,
  "remaining_leaves" : null,
  "resource_calendar_id" : null,
  "resource_calendar_name" : null,
  "resource_id" : null,
  "show_hr_icon_display" : null,
  "show_leaves" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "total_overtime" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_name" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
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
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">additional_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它说明|
|<el-row justify="space-between"><el-col :span="20">allocation_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|分配的总天数。|
|<el-row justify="space-between"><el-col :span="20">allocation_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配显示|
|<el-row justify="space-between"><el-col :span="20">allocation_remaining_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|剩余的分配显示|
|<el-row justify="space-between"><el-col :span="20">allocations_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分配总数量|
|<el-row justify="space-between"><el-col :span="20">attendance_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出勤状态|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|徽标 ID|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|出生日期|
|<el-row justify="space-between"><el-col :span="20">certificate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">child_all_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|间接下属统计|
|<el-row justify="space-between"><el-col :span="20">child_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接下属人数|
|<el-row justify="space-between"><el-col :span="20">children</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受抚养的子女数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色指标|
|<el-row justify="space-between"><el-col :span="20">contract_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同警告|
|<el-row justify="space-between"><el-col :span="20">contracts_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同统计|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">department_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">departure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|离职日期|
|<el-row justify="space-between"><el-col :span="20">departure_description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它信息|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">distance_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离|
|<el-row justify="space-between"><el-col :span="20">distance_home_work_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">emergency_contact</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">emergency_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">employee_cars_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|车辆|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工类型|
|<el-row justify="space-between"><el-col :span="20">equipment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|设备数量|
|<el-row justify="space-between"><el-col :span="20">filter_for_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|费用筛选|
|<el-row justify="space-between"><el-col :span="20">first_contract_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次合同日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">has_badges</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有徽章|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">hours_last_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时上月|
|<el-row justify="space-between"><el-col :span="20">hours_last_month_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小时上月显示|
|<el-row justify="space-between"><el-col :span="20">hours_previously_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|今天之前的小时数|
|<el-row justify="space-between"><el-col :span="20">hours_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时今天|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">identification_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|身份证号|
|<el-row justify="space-between"><el-col :span="20">is_absent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|今日缺勤|
|<el-row justify="space-between"><el-col :span="20">is_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|灵活可变|
|<el-row justify="space-between"><el-col :span="20">is_fully_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|完全灵活|
|<el-row justify="space-between"><el-col :span="20">is_subordinate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是下属|
|<el-row justify="space-between"><el-col :span="20">job_title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作头衔|
|<el-row justify="space-between"><el-col :span="20">km_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离（公里）|
|<el-row justify="space-between"><el-col :span="20">last_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上个活动|
|<el-row justify="space-between"><el-col :span="20">last_activity_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上个活动时间|
|<el-row justify="space-between"><el-col :span="20">last_attendance_worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|最后一次出勤 工作时数|
|<el-row justify="space-between"><el-col :span="20">leave_date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|起始日期|
|<el-row justify="space-between"><el-col :span="20">leave_date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|至日期|
|<el-row justify="space-between"><el-col :span="20">leaves_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|休假次数|
|<el-row justify="space-between"><el-col :span="20">legal_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|法定名称|
|<el-row justify="space-between"><el-col :span="20">license_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|车辆牌照|
|<el-row justify="space-between"><el-col :span="20">member_of_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|部门数量|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公手机|
|<el-row justify="space-between"><el-col :span="20">mobility_card</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调动卡|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">newly_hired</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最近聘用的|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">passport_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|护照号|
|<el-row justify="space-between"><el-col :span="20">permit_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作证编号|
|<el-row justify="space-between"><el-col :span="20">pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|PIN|
|<el-row justify="space-between"><el-col :span="20">place_of_birth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生地|
|<el-row justify="space-between"><el-col :span="20">private_car_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人车辆车牌|
|<el-row justify="space-between"><el-col :span="20">private_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">private_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电子邮箱|
|<el-row justify="space-between"><el-col :span="20">private_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电话|
|<el-row justify="space-between"><el-col :span="20">private_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">private_street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道2|
|<el-row justify="space-between"><el-col :span="20">private_zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">related_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|相关合作伙伴数量|
|<el-row justify="space-between"><el-col :span="20">remaining_leaves</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|可用休假天数|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">resource_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|资源|
|<el-row justify="space-between"><el-col :span="20">show_hr_icon_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示HR图标|
|<el-row justify="space-between"><el-col :span="20">show_leaves</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能够查看到剩余休假|
|<el-row justify="space-between"><el-col :span="20">sinid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保险号SIN|
|<el-row justify="space-between"><el-col :span="20">spouse_birthdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|配偶生日|
|<el-row justify="space-between"><el-col :span="20">spouse_complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配偶全名|
|<el-row justify="space-between"><el-col :span="20">ssnid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保障号SSN|
|<el-row justify="space-between"><el-col :span="20">study_field</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|研究领域|
|<el-row justify="space-between"><el-col :span="20">study_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">total_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班费总额|
|<el-row justify="space-between"><el-col :span="20">vehicle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司汽车|
|<el-row justify="space-between"><el-col :span="20">visa_expire</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签证有效期|
|<el-row justify="space-between"><el-col :span="20">visa_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|签证号|
|<el-row justify="space-between"><el-col :span="20">work_email</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|工作电子邮件|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|工作许可证到期日期|
|<el-row justify="space-between"><el-col :span="20">work_permit_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作许可名称|
|<el-row justify="space-between"><el-col :span="20">work_permit_scheduled_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可的预定活动|
|<el-row justify="space-between"><el-col :span="20">work_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公电话|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_icon" : null,
  "additional_note" : null,
  "allocation_count" : null,
  "allocation_display" : null,
  "allocation_remaining_display" : null,
  "allocations_count" : null,
  "attendance_state" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "child_all_count" : null,
  "child_count" : null,
  "children" : null,
  "color" : null,
  "contract_warning" : null,
  "contracts_count" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "display_name" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_cars_count" : null,
  "employee_type" : null,
  "equipment_count" : null,
  "filter_for_expense" : null,
  "first_contract_date" : null,
  "gender" : null,
  "has_badges" : null,
  "has_message" : null,
  "hours_last_month" : null,
  "hours_last_month_display" : null,
  "hours_previously_today" : null,
  "hours_today" : null,
  "id" : null,
  "identification_id" : null,
  "is_absent" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "is_subordinate" : null,
  "job_title" : null,
  "km_home_work" : null,
  "last_activity" : null,
  "last_activity_time" : null,
  "last_attendance_worked_hours" : null,
  "leave_date_from" : null,
  "leave_date_to" : null,
  "leaves_count" : null,
  "legal_name" : null,
  "license_plate" : null,
  "member_of_department" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "newly_hired" : null,
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
  "related_partners_count" : null,
  "remaining_leaves" : null,
  "resource_calendar_id" : null,
  "resource_calendar_name" : null,
  "resource_id" : null,
  "show_hr_icon_display" : null,
  "show_leaves" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "total_overtime" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_name" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_icon" : null,
  "additional_note" : null,
  "allocation_count" : null,
  "allocation_display" : null,
  "allocation_remaining_display" : null,
  "allocations_count" : null,
  "attendance_state" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "child_all_count" : null,
  "child_count" : null,
  "children" : null,
  "color" : null,
  "contract_warning" : null,
  "contracts_count" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "display_name" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_cars_count" : null,
  "employee_type" : null,
  "equipment_count" : null,
  "filter_for_expense" : null,
  "first_contract_date" : null,
  "gender" : null,
  "has_badges" : null,
  "has_message" : null,
  "hours_last_month" : null,
  "hours_last_month_display" : null,
  "hours_previously_today" : null,
  "hours_today" : null,
  "id" : null,
  "identification_id" : null,
  "is_absent" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "is_subordinate" : null,
  "job_title" : null,
  "km_home_work" : null,
  "last_activity" : null,
  "last_activity_time" : null,
  "last_attendance_worked_hours" : null,
  "leave_date_from" : null,
  "leave_date_to" : null,
  "leaves_count" : null,
  "legal_name" : null,
  "license_plate" : null,
  "member_of_department" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "newly_hired" : null,
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
  "related_partners_count" : null,
  "remaining_leaves" : null,
  "resource_calendar_id" : null,
  "resource_calendar_name" : null,
  "resource_id" : null,
  "show_hr_icon_display" : null,
  "show_leaves" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "total_overtime" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_name" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
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
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">additional_note</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它说明|
|<el-row justify="space-between"><el-col :span="20">allocation_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|分配的总天数。|
|<el-row justify="space-between"><el-col :span="20">allocation_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|分配显示|
|<el-row justify="space-between"><el-col :span="20">allocation_remaining_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|剩余的分配显示|
|<el-row justify="space-between"><el-col :span="20">allocations_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|分配总数量|
|<el-row justify="space-between"><el-col :span="20">attendance_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出勤状态|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|徽标 ID|
|<el-row justify="space-between"><el-col :span="20">birthday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|出生日期|
|<el-row justify="space-between"><el-col :span="20">certificate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">child_all_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|间接下属统计|
|<el-row justify="space-between"><el-col :span="20">child_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|直接下属人数|
|<el-row justify="space-between"><el-col :span="20">children</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|受抚养的子女数|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色指标|
|<el-row justify="space-between"><el-col :span="20">contract_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同警告|
|<el-row justify="space-between"><el-col :span="20">contracts_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同统计|
|<el-row justify="space-between"><el-col :span="20">department_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">department_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门名称|
|<el-row justify="space-between"><el-col :span="20">departure_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|离职日期|
|<el-row justify="space-between"><el-col :span="20">departure_description</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|其它信息|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">distance_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离|
|<el-row justify="space-between"><el-col :span="20">distance_home_work_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">emergency_contact</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|联系人姓名|
|<el-row justify="space-between"><el-col :span="20">emergency_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">employee_cars_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|车辆|
|<el-row justify="space-between"><el-col :span="20">employee_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|员工类型|
|<el-row justify="space-between"><el-col :span="20">equipment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|设备数量|
|<el-row justify="space-between"><el-col :span="20">filter_for_expense</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|费用筛选|
|<el-row justify="space-between"><el-col :span="20">first_contract_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|首次合同日期|
|<el-row justify="space-between"><el-col :span="20">gender</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">has_badges</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有徽章|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">hours_last_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时上月|
|<el-row justify="space-between"><el-col :span="20">hours_last_month_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小时上月显示|
|<el-row justify="space-between"><el-col :span="20">hours_previously_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|今天之前的小时数|
|<el-row justify="space-between"><el-col :span="20">hours_today</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|小时今天|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">identification_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|身份证号|
|<el-row justify="space-between"><el-col :span="20">is_absent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|今日缺勤|
|<el-row justify="space-between"><el-col :span="20">is_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|灵活可变|
|<el-row justify="space-between"><el-col :span="20">is_fully_flexible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|完全灵活|
|<el-row justify="space-between"><el-col :span="20">is_subordinate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是下属|
|<el-row justify="space-between"><el-col :span="20">job_title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作头衔|
|<el-row justify="space-between"><el-col :span="20">km_home_work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|通勤距离（公里）|
|<el-row justify="space-between"><el-col :span="20">last_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|上个活动|
|<el-row justify="space-between"><el-col :span="20">last_activity_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上个活动时间|
|<el-row justify="space-between"><el-col :span="20">last_attendance_worked_hours</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|最后一次出勤 工作时数|
|<el-row justify="space-between"><el-col :span="20">leave_date_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|起始日期|
|<el-row justify="space-between"><el-col :span="20">leave_date_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|至日期|
|<el-row justify="space-between"><el-col :span="20">leaves_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|休假次数|
|<el-row justify="space-between"><el-col :span="20">legal_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|法定名称|
|<el-row justify="space-between"><el-col :span="20">license_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|车辆牌照|
|<el-row justify="space-between"><el-col :span="20">member_of_department</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|部门数量|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|所需操作|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公手机|
|<el-row justify="space-between"><el-col :span="20">mobility_card</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|调动卡|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">newly_hired</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|最近聘用的|
|<el-row justify="space-between"><el-col :span="20">notes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">passport_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|护照号|
|<el-row justify="space-between"><el-col :span="20">permit_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作证编号|
|<el-row justify="space-between"><el-col :span="20">pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|PIN|
|<el-row justify="space-between"><el-col :span="20">place_of_birth</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|出生地|
|<el-row justify="space-between"><el-col :span="20">private_car_plate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人车辆车牌|
|<el-row justify="space-between"><el-col :span="20">private_city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">private_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电子邮箱|
|<el-row justify="space-between"><el-col :span="20">private_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|私人电话|
|<el-row justify="space-between"><el-col :span="20">private_street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">private_street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道2|
|<el-row justify="space-between"><el-col :span="20">private_zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">related_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|相关合作伙伴数量|
|<el-row justify="space-between"><el-col :span="20">remaining_leaves</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|可用休假天数|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">resource_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|资源|
|<el-row justify="space-between"><el-col :span="20">show_hr_icon_display</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示HR图标|
|<el-row justify="space-between"><el-col :span="20">show_leaves</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能够查看到剩余休假|
|<el-row justify="space-between"><el-col :span="20">sinid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保险号SIN|
|<el-row justify="space-between"><el-col :span="20">spouse_birthdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|配偶生日|
|<el-row justify="space-between"><el-col :span="20">spouse_complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|配偶全名|
|<el-row justify="space-between"><el-col :span="20">ssnid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|社会保障号SSN|
|<el-row justify="space-between"><el-col :span="20">study_field</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|研究领域|
|<el-row justify="space-between"><el-col :span="20">study_school</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|毕业院校|
|<el-row justify="space-between"><el-col :span="20">total_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|加班费总额|
|<el-row justify="space-between"><el-col :span="20">vehicle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司汽车|
|<el-row justify="space-between"><el-col :span="20">visa_expire</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|签证有效期|
|<el-row justify="space-between"><el-col :span="20">visa_no</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|签证号|
|<el-row justify="space-between"><el-col :span="20">work_email</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|工作电子邮件|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|工作许可证到期日期|
|<el-row justify="space-between"><el-col :span="20">work_permit_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作许可名称|
|<el-row justify="space-between"><el-col :span="20">work_permit_scheduled_activity</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可的预定活动|
|<el-row justify="space-between"><el-col :span="20">work_phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|办公电话|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_icon" : null,
  "additional_note" : null,
  "allocation_count" : null,
  "allocation_display" : null,
  "allocation_remaining_display" : null,
  "allocations_count" : null,
  "attendance_state" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "child_all_count" : null,
  "child_count" : null,
  "children" : null,
  "color" : null,
  "contract_warning" : null,
  "contracts_count" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "display_name" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_cars_count" : null,
  "employee_type" : null,
  "equipment_count" : null,
  "filter_for_expense" : null,
  "first_contract_date" : null,
  "gender" : null,
  "has_badges" : null,
  "has_message" : null,
  "hours_last_month" : null,
  "hours_last_month_display" : null,
  "hours_previously_today" : null,
  "hours_today" : null,
  "id" : null,
  "identification_id" : null,
  "is_absent" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "is_subordinate" : null,
  "job_title" : null,
  "km_home_work" : null,
  "last_activity" : null,
  "last_activity_time" : null,
  "last_attendance_worked_hours" : null,
  "leave_date_from" : null,
  "leave_date_to" : null,
  "leaves_count" : null,
  "legal_name" : null,
  "license_plate" : null,
  "member_of_department" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "newly_hired" : null,
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
  "related_partners_count" : null,
  "remaining_leaves" : null,
  "resource_calendar_id" : null,
  "resource_calendar_name" : null,
  "resource_id" : null,
  "show_hr_icon_display" : null,
  "show_leaves" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "total_overtime" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_name" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_icon" : null,
  "additional_note" : null,
  "allocation_count" : null,
  "allocation_display" : null,
  "allocation_remaining_display" : null,
  "allocations_count" : null,
  "attendance_state" : null,
  "barcode" : null,
  "birthday" : null,
  "certificate" : null,
  "child_all_count" : null,
  "child_count" : null,
  "children" : null,
  "color" : null,
  "contract_warning" : null,
  "contracts_count" : null,
  "create_date" : null,
  "create_uid" : null,
  "department_id" : null,
  "department_name" : null,
  "departure_date" : null,
  "departure_description" : null,
  "display_name" : null,
  "distance_home_work" : null,
  "distance_home_work_unit" : null,
  "emergency_contact" : null,
  "emergency_phone" : null,
  "employee_cars_count" : null,
  "employee_type" : null,
  "equipment_count" : null,
  "filter_for_expense" : null,
  "first_contract_date" : null,
  "gender" : null,
  "has_badges" : null,
  "has_message" : null,
  "hours_last_month" : null,
  "hours_last_month_display" : null,
  "hours_previously_today" : null,
  "hours_today" : null,
  "id" : null,
  "identification_id" : null,
  "is_absent" : null,
  "is_flexible" : null,
  "is_fully_flexible" : null,
  "is_subordinate" : null,
  "job_title" : null,
  "km_home_work" : null,
  "last_activity" : null,
  "last_activity_time" : null,
  "last_attendance_worked_hours" : null,
  "leave_date_from" : null,
  "leave_date_to" : null,
  "leaves_count" : null,
  "legal_name" : null,
  "license_plate" : null,
  "member_of_department" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile_phone" : null,
  "mobility_card" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "newly_hired" : null,
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
  "related_partners_count" : null,
  "remaining_leaves" : null,
  "resource_calendar_id" : null,
  "resource_calendar_name" : null,
  "resource_id" : null,
  "show_hr_icon_display" : null,
  "show_leaves" : null,
  "sinid" : null,
  "spouse_birthdate" : null,
  "spouse_complete_name" : null,
  "ssnid" : null,
  "study_field" : null,
  "study_school" : null,
  "total_overtime" : null,
  "vehicle" : null,
  "visa_expire" : null,
  "visa_no" : null,
  "work_email" : null,
  "work_permit_expiration_date" : null,
  "work_permit_name" : null,
  "work_permit_scheduled_activity" : null,
  "work_phone" : null,
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
<el-alert title="/hr_employees/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_certificate_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|证书等级|
|<el-row justify="space-between"><el-col :span="20">n_department_id_childof</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">n_department_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|部门|
|<el-row justify="space-between"><el-col :span="20">n_distance_home_work_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|通勤距离（单位）|
|<el-row justify="space-between"><el-col :span="20">n_employee_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工类型|
|<el-row justify="space-between"><el-col :span="20">n_gender_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|性别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_resource_calendar_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作时间|
|<el-row justify="space-between"><el-col :span="20">n_resource_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|资源|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_certificate_eq" : null,
  "n_department_id_childof" : null,
  "n_department_id_eq" : null,
  "n_distance_home_work_unit_eq" : null,
  "n_employee_type_eq" : null,
  "n_gender_eq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_resource_calendar_id_eq" : null,
  "n_resource_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "active" : null,
    "activity_date_deadline" : null,
    "activity_exception_icon" : null,
    "additional_note" : null,
    "allocation_count" : null,
    "allocation_display" : null,
    "allocation_remaining_display" : null,
    "allocations_count" : null,
    "attendance_state" : null,
    "barcode" : null,
    "birthday" : null,
    "certificate" : null,
    "child_all_count" : null,
    "child_count" : null,
    "children" : null,
    "color" : null,
    "contract_warning" : null,
    "contracts_count" : null,
    "create_date" : null,
    "create_uid" : null,
    "department_id" : null,
    "department_name" : null,
    "departure_date" : null,
    "departure_description" : null,
    "display_name" : null,
    "distance_home_work" : null,
    "distance_home_work_unit" : null,
    "emergency_contact" : null,
    "emergency_phone" : null,
    "employee_cars_count" : null,
    "employee_type" : null,
    "equipment_count" : null,
    "filter_for_expense" : null,
    "first_contract_date" : null,
    "gender" : null,
    "has_badges" : null,
    "has_message" : null,
    "hours_last_month" : null,
    "hours_last_month_display" : null,
    "hours_previously_today" : null,
    "hours_today" : null,
    "id" : null,
    "identification_id" : null,
    "is_absent" : null,
    "is_flexible" : null,
    "is_fully_flexible" : null,
    "is_subordinate" : null,
    "job_title" : null,
    "km_home_work" : null,
    "last_activity" : null,
    "last_activity_time" : null,
    "last_attendance_worked_hours" : null,
    "leave_date_from" : null,
    "leave_date_to" : null,
    "leaves_count" : null,
    "legal_name" : null,
    "license_plate" : null,
    "member_of_department" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "mobile_phone" : null,
    "mobility_card" : null,
    "my_activity_date_deadline" : null,
    "name" : null,
    "newly_hired" : null,
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
    "related_partners_count" : null,
    "remaining_leaves" : null,
    "resource_calendar_id" : null,
    "resource_calendar_name" : null,
    "resource_id" : null,
    "show_hr_icon_display" : null,
    "show_leaves" : null,
    "sinid" : null,
    "spouse_birthdate" : null,
    "spouse_complete_name" : null,
    "ssnid" : null,
    "study_field" : null,
    "study_school" : null,
    "total_overtime" : null,
    "vehicle" : null,
    "visa_expire" : null,
    "visa_no" : null,
    "work_email" : null,
    "work_permit_expiration_date" : null,
    "work_permit_name" : null,
    "work_permit_scheduled_activity" : null,
    "work_phone" : null,
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