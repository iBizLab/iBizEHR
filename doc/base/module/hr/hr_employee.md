# 员工(hr_employee)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|活动集合|ACTIVITIES|继承属性|1048576|是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#hr_employee_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#hr_employee_activity_state "活动状态")|200|是||
|其它说明|ADDITIONAL_NOTE|长文本，没有长度限制|1048576|是||
|工作地址|ADDRESS_ID|外键值|100|是||
|工作地址|ADDRESS_NAME|外键值文本|200|是||
|分配总数量|ALLOCATIONS_COUNT|整型||是||
|分配的总天数。|ALLOCATION_COUNT|浮点||是||
|分配显示|ALLOCATION_DISPLAY|文本，可指定长度|500|是||
|剩余的分配显示|ALLOCATION_REMAINING_DISPLAY|文本，可指定长度|500|是||
|附件集合|ATTACHMENTS|继承属性|1048576|是||
|考勤管理员|ATTENDANCE_MANAGER_ID|外键值|100|是||
|考勤管理员|ATTENDANCE_MANAGER_NAME|外键值文本|200|是||
|出勤状态|ATTENDANCE_STATE|[单项选择(文本值)](index/dictionary_index#hr_employee_attendance_state "出勤状态")|200|是||
|头像|AVATAR|继承属性|500|是||
|头像1024|AVATAR_1024|继承属性|500|是||
|头像128|AVATAR_128|继承属性|500|是||
|头像256|AVATAR_256|继承属性|500|是||
|头像512|AVATAR_512|继承属性|500|是||
|银行账户|BANK_ACCOUNT_ID|外键值|100|是||
|银行账户|BANK_ACCOUNT_NAME|外键值文本|200|是||
|徽标 ID|BARCODE|文本，可指定长度|500|是||
|出生日期|BIRTHDAY|日期型||是||
|证书等级|CERTIFICATE|[单项选择(文本值)](index/dictionary_index#hr_employee_certificate "证书等级")|60|是||
|受抚养的子女数|CHILDREN|整型||是||
|间接下属统计|CHILD_ALL_COUNT|整型||是||
|直接下属人数|CHILD_COUNT|整型||是||
|教练|COACH_ID|外键值|100|是||
|教练|COACH_NAME|外键值文本|200|是||
|颜色指标|COLOR|整型||是||
|公司|COMPANY_ID|外键值|100|否||
|公司名称|COMPANY_NAME|外键值文本|200|否||
|合同统计|CONTRACTS_COUNT|整型||是||
|合同警告|CONTRACT_WARNING|是否逻辑||是||
|国籍(国家)|COUNTRY_ID|外键值|100|是||
|国籍(国家)|COUNTRY_NAME|外键值文本|200|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|当前休假状态|CURRENT_LEAVE_STATE|[单项选择(文本值)](index/dictionary_index#hr_employee_current_leave_state "当前休假状态")|200|是||
|部门|DEPARTMENT_ID|外键值|100|是||
|部门名称|DEPARTMENT_NAME|外键值文本|200|是||
|离职日期|DEPARTURE_DATE|日期型||是||
|其它信息|DEPARTURE_DESCRIPTION|HTML文本，没有长度限制|1048576|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|通勤距离|DISTANCE_HOME_WORK|整型||是||
|通勤距离（单位）|DISTANCE_HOME_WORK_UNIT|[单项选择(文本值)](index/dictionary_index#hr_employee_distance_home_work_unit "通勤距离（单位）")|60|否||
|联系人姓名|EMERGENCY_CONTACT|文本，可指定长度|100|是||
|电话|EMERGENCY_PHONE|文本，可指定长度|50|是||
|车辆|EMPLOYEE_CARS_COUNT|整型||是||
|员工类型|EMPLOYEE_TYPE|[单项选择(文本值)](index/dictionary_index#hr_employee_employee_type "员工类型")|60|否||
|设备数量|EQUIPMENT_COUNT|整型||是||
|费用|EXPENSE_MANAGER_ID|外键值|100|是||
|费用筛选|FILTER_FOR_EXPENSE|是否逻辑||是||
|首次合同日期|FIRST_CONTRACT_DATE|日期型||是||
|关注者|FOLLOWERS|继承属性|1048576|是||
|性别|GENDER|[单项选择(文本值)](index/dictionary_index#hr_employee_gender "性别")|60|是||
|有徽章|HAS_BADGES|是否逻辑||是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|小时上月|HOURS_LAST_MONTH|浮点||是||
|小时上月显示|HOURS_LAST_MONTH_DISPLAY|文本，可指定长度|500|是||
|今天之前的小时数|HOURS_PREVIOUSLY_TODAY|浮点||是||
|小时今天|HOURS_TODAY|浮点||是||
|人力资源显示的图标|HR_ICON_DISPLAY|[单项选择(文本值)](index/dictionary_index#hr_employee_hr_icon_display "人力资源显示的图标")|200|是||
|人力资源出席状态|HR_PRESENCE_STATE|[单项选择(文本值)](index/dictionary_index#hr_employee_hr_presence_state "人力资源出席状态")|200|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|身份证号|IDENTIFICATION_ID|文本，可指定长度|500|是||
|头像|IMAGE|继承属性|500|是||
|图片1024|IMAGE_1024|继承属性|500|是||
|图片128|IMAGE_128|继承属性|500|是||
|图片256|IMAGE_256|继承属性|500|是||
|图片512|IMAGE_512|继承属性|500|是||
|今日缺勤|IS_ABSENT|是否逻辑||是||
|灵活可变|IS_FLEXIBLE|是否逻辑||是||
|完全灵活|IS_FULLY_FLEXIBLE|是否逻辑||是||
|是下属|IS_SUBORDINATE|是否逻辑||是||
|工作岗位|JOB_ID|外键值|100|是||
|工作岗位|JOB_NAME|外键值文本|200|是||
|工作头衔|JOB_TITLE|文本，可指定长度|500|是||
|通勤距离（公里）|KM_HOME_WORK|整型||是||
|上个活动|LAST_ACTIVITY|日期型||是||
|上个活动时间|LAST_ACTIVITY_TIME|文本，可指定长度|500|是||
|最后一次出勤 工作时数|LAST_ATTENDANCE_WORKED_HOURS|浮点||是||
|休假次数|LEAVES_COUNT|浮点||是||
|起始日期|LEAVE_DATE_FROM|日期型||是||
|至日期|LEAVE_DATE_TO|日期型||是||
|休假|LEAVE_MANAGER_ID|外键值|100|是||
|休假|LEAVE_MANAGER_NAME|外键值文本|200|是||
|法定名称|LEGAL_NAME|文本，可指定长度|500|是||
|车辆牌照|LICENSE_PLATE|文本，可指定长度|50|是||
|部门数量|MEMBER_OF_DEPARTMENT|是否逻辑||是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|主要附件|MESSAGE_MAIN_ATTACHMENT_ID|外键值|100|是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|办公手机|MOBILE_PHONE|文本，可指定长度|50|是||
|调动卡|MOBILITY_CARD|文本，可指定长度|500|是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|名称|NAME|文本，可指定长度|200|否||
|最近聘用的|NEWLY_HIRED|继承属性||是||
|备注|NOTES|长文本，没有长度限制|1048576|是||
|管理员标识|PARENT_ID|外键值|100|是||
|管理员|PARENT_NAME|外键值文本|200|是||
|管理链|PARENT_PATH|长文本，没有长度限制|1048576|是||
|护照号|PASSPORT_ID|文本，可指定长度|500|是||
|工作证编号|PERMIT_NO|文本，可指定长度|500|是||
|PIN|PIN|文本，可指定长度|500|是||
|出生地|PLACE_OF_BIRTH|文本，可指定长度|500|是||
|私人车辆车牌|PRIVATE_CAR_PLATE|文本，可指定长度|500|是||
|城市|PRIVATE_CITY|文本，可指定长度|500|是||
|国家|PRIVATE_COUNTRY_ID|外键值|100|是||
|国家|PRIVATE_COUNTRY_NAME|外键值文本|200|是||
|私人电子邮箱|PRIVATE_EMAIL|文本，可指定长度|250|是||
|私人电话|PRIVATE_PHONE|文本，可指定长度|50|是||
|私人省/州|PRIVATE_STATE_ID|外键值|100|是||
|私人省/州|PRIVATE_STATE_NAME|外键值文本|200|是||
|街道|PRIVATE_STREET|文本，可指定长度|500|是||
|街道2|PRIVATE_STREET2|文本，可指定长度|500|是||
|邮编|PRIVATE_ZIP|文本，可指定长度|50|是||
|相关合作伙伴数量|RELATED_PARTNERS_COUNT|整型||是||
|可用休假天数|REMAINING_LEAVES|浮点||是||
|工作时间|RESOURCE_CALENDAR_ID|外键值|100|是||
|工作时间|RESOURCE_CALENDAR_NAME|外键值文本|200|是||
|资源|RESOURCE_ID|外键值|100|否||
|显示HR图标|SHOW_HR_ICON_DISPLAY|是否逻辑||是||
|能够查看到剩余休假|SHOW_LEAVES|是否逻辑||是||
|社会保险号SIN|SINID|文本，可指定长度|50|是||
|配偶生日|SPOUSE_BIRTHDATE|日期型||是||
|配偶全名|SPOUSE_COMPLETE_NAME|文本，可指定长度|500|是||
|社会保障号SSN|SSNID|文本，可指定长度|500|是||
|研究领域|STUDY_FIELD|文本，可指定长度|500|是||
|毕业院校|STUDY_SCHOOL|文本，可指定长度|500|是||
|加班费总额|TOTAL_OVERTIME|浮点||是||
|用户|USER_ID|外键值|100|是||
|用户|USER_NAME|外键值文本|200|是||
|公司汽车|VEHICLE|文本，可指定长度|50|是||
|签证有效期|VISA_EXPIRE|日期型||是||
|签证号|VISA_NO|文本，可指定长度|500|是||
|工作联系人|WORK_CONTACT_ID|外键值|100|是||
|工作电子邮件|WORK_EMAIL|文本，可指定长度|500|否||
|工作地点|WORK_LOCATION_ID|外键值|100|是||
|工作地点|WORK_LOCATION_NAME|外键值文本|200|是||
|工作位置类型|WORK_LOCATION_TYPE|[单项选择(文本值)](index/dictionary_index#hr_employee_work_location_type "工作位置类型")|200|是||
|工作许可证到期日期|WORK_PERMIT_EXPIRATION_DATE|日期型||是||
|工作许可名称|WORK_PERMIT_NAME|文本，可指定长度|500|是||
|工作许可的预定活动|WORK_PERMIT_SCHEDULED_ACTIVITY|是否逻辑||是||
|办公电话|WORK_PHONE|文本，可指定长度|50|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


###### 属性组

<el-row>
<el-tabs v-model="show_field_group">

<el-tab-pane label="默认属性组" name="field_group_Simple">

|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|公司|COMPANY_ID|外键值|100|否||
|公司名称|COMPANY_NAME|外键值文本|200|否||
|部门|DEPARTMENT_ID|外键值|100|是||
|部门名称|DEPARTMENT_NAME|外键值文本|200|是||
|人力资源出席状态|HR_PRESENCE_STATE|[单项选择(文本值)](index/dictionary_index#hr_employee_hr_presence_state "人力资源出席状态")|200|是||
|工作岗位|JOB_ID|外键值|100|是||
|工作岗位|JOB_NAME|外键值文本|200|是||
|名称|NAME|文本，可指定长度|200|否||
|管理员标识|PARENT_ID|外键值|100|是||
|管理员|PARENT_NAME|外键值文本|200|是||
|工作电子邮件|WORK_EMAIL|文本，可指定长度|500|否||
|办公电话|WORK_PHONE|文本，可指定长度|50|是||
|头像|AVATAR|继承属性|500|是||
|头像|IMAGE|继承属性|500|是||

</el-tab-pane>
<el-tab-pane label="计数属性组" name="field_group_counter">

|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|分配的总天数。|ALLOCATION_COUNT|浮点||是||
|分配总数量|ALLOCATIONS_COUNT|整型||是||
|间接下属统计|CHILD_ALL_COUNT|整型||是||
|直接下属人数|CHILD_COUNT|整型||是||
|车辆|EMPLOYEE_CARS_COUNT|整型||是||
|设备数量|EQUIPMENT_COUNT|整型||是||
|休假次数|LEAVES_COUNT|浮点||是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|相关合作伙伴数量|RELATED_PARTNERS_COUNT|整型||是||

</el-tab-pane>

</el-tabs>
</el-row>

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_DEPARTMENT_HR_EMPLOYEE_MANAGER_ID](der/DER1N_HR_DEPARTMENT_HR_EMPLOYEE_MANAGER_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_HR_EMPLOYEE_COACH_ID](der/DER1N_HR_EMPLOYEE_BASE_HR_EMPLOYEE_COACH_ID)|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_HR_EMPLOYEE_PARENT_ID](der/DER1N_HR_EMPLOYEE_BASE_HR_EMPLOYEE_PARENT_ID)|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_EMPLOYEE_COACH_ID](der/DER1N_HR_EMPLOYEE_HR_EMPLOYEE_COACH_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_EMPLOYEE_PARENT_ID](der/DER1N_HR_EMPLOYEE_HR_EMPLOYEE_PARENT_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_JOB_HR_EMPLOYEE_MANAGER_ID](der/DER1N_HR_JOB_HR_EMPLOYEE_MANAGER_ID)|[工作岗位(HR_JOB)](module/hr/hr_job)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_EMPLOYEE_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EMPLOYEE_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_EMPLOYEE_COACH_ID](der/DER1N_HR_EMPLOYEE_HR_EMPLOYEE_COACH_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_EMPLOYEE_PARENT_ID](der/DER1N_HR_EMPLOYEE_HR_EMPLOYEE_PARENT_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_JOB_JOB_ID](der/DER1N_HR_EMPLOYEE_HR_JOB_JOB_ID)|[工作岗位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_WORK_LOCATION_WORK_LOCATION_ID](der/DER1N_HR_EMPLOYEE_HR_WORK_LOCATION_WORK_LOCATION_ID)|[工作地点(HR_WORK_LOCATION)](module/hr/hr_work_location)|1:N关系||
|[DER1N_HR_EMPLOYEE_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID](der/DER1N_HR_EMPLOYEE_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|1:N关系||
|[DER1N_HR_EMPLOYEE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_HR_EMPLOYEE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||
|[DER1N_HR_EMPLOYEE_RESOURCE_RESOURCE_RESOURCE_ID](der/DER1N_HR_EMPLOYEE_RESOURCE_RESOURCE_RESOURCE_ID)|[资源(RESOURCE_RESOURCE)](module/resource/resource_resource)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_COMPANY_COMPANY_ID](der/DER1N_HR_EMPLOYEE_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_COUNTRY_COUNTRY_ID](der/DER1N_HR_EMPLOYEE_RES_COUNTRY_COUNTRY_ID)|[国家/地区(RES_COUNTRY)](module/base/res_country)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_COUNTRY_PRIVATE_COUNTRY_ID](der/DER1N_HR_EMPLOYEE_RES_COUNTRY_PRIVATE_COUNTRY_ID)|[国家/地区(RES_COUNTRY)](module/base/res_country)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_COUNTRY_STATE_PRIVATE_STATE_ID](der/DER1N_HR_EMPLOYEE_RES_COUNTRY_STATE_PRIVATE_STATE_ID)|[国家省/州(RES_COUNTRY_STATE)](module/base/res_country_state)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_PARTNER_ADDRESS_ID](der/DER1N_HR_EMPLOYEE_RES_PARTNER_ADDRESS_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_PARTNER_BANK_BANK_ACCOUNT_ID](der/DER1N_HR_EMPLOYEE_RES_PARTNER_BANK_BANK_ACCOUNT_ID)|[银行账号(RES_PARTNER_BANK)](module/base/res_partner_bank)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_PARTNER_WORK_CONTACT_ID](der/DER1N_HR_EMPLOYEE_RES_PARTNER_WORK_CONTACT_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_USERS_ATTENDANCE_MANAGER_ID](der/DER1N_HR_EMPLOYEE_RES_USERS_ATTENDANCE_MANAGER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_USERS_EXPENSE_MANAGER_ID](der/DER1N_HR_EMPLOYEE_RES_USERS_EXPENSE_MANAGER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_USERS_LEAVE_MANAGER_ID](der/DER1N_HR_EMPLOYEE_RES_USERS_LEAVE_MANAGER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_USERS_USER_ID](der/DER1N_HR_EMPLOYEE_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||
|[DERMULINH_HR_EMPLOYEE_AVATAR_MIXIN](der/DERMULINH_HR_EMPLOYEE_AVATAR_MIXIN)|[头像混合(AVATAR_MIXIN)](module/base/avatar_mixin)|多继承关系（虚拟实体）||
|[DERMULINH_HR_EMPLOYEE_HR_EMPLOYEE_BASE](der/DERMULINH_HR_EMPLOYEE_HR_EMPLOYEE_BASE)|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|多继承关系（虚拟实体）||
|[DERMULINH_HR_EMPLOYEE_MAIL_ACTIVITY_MIXIN](der/DERMULINH_HR_EMPLOYEE_MAIL_ACTIVITY_MIXIN)|[活动Mixin(MAIL_ACTIVITY_MIXIN)](module/mail/mail_activity_mixin)|多继承关系（虚拟实体）||
|[DERMULINH_HR_EMPLOYEE_MAIL_THREAD](der/DERMULINH_HR_EMPLOYEE_MAIL_THREAD)|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|多继承关系（虚拟实体）||
|[DERMULINH_HR_EMPLOYEE_RESOURCE_MIXIN](der/DERMULINH_HR_EMPLOYEE_RESOURCE_MIXIN)|[资源装饰(RESOURCE_MIXIN)](module/resource/resource_mixin)|多继承关系（虚拟实体）||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#hr_employee_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|公司员工计数器|company_staff_counter|[实体处理逻辑](module/hr/hr_employee/logic/company_staff_counter "公司员工计数器")|默认|不支持||||
|员工计数器|emp_counter|脚本代码|默认|不支持||||
|生成徽标 ID|generate_random_barcode|[实体处理逻辑](module/hr/hr_employee/logic/generate_random_barcode "生成徽标 ID")|默认|不支持||||
|用户变更|onchange_user|[实体处理逻辑](module/hr/hr_employee/logic/onchange_user "用户变更")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[公司员工计数器](module/hr/hr_employee/logic/company_staff_counter)|company_staff_counter|无|||
|[准备默认用户数据对象](module/hr/hr_employee/logic/prepare_default_user)|prepare_default_user|无|||
|[员工计数器](module/hr/hr_employee/logic/emp_counter)|emp_counter|无|||
|[建立之前](module/hr/hr_employee/logic/before_create)|before_create|无|||
|[生成徽标 ID](module/hr/hr_employee/logic/generate_random_barcode)|generate_random_barcode|无|||
|[用户变更](module/hr/hr_employee/logic/onchange_user)|onchange_user|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/hr/hr_employee/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_employee/query/View)|VIEW|否|否 |否 ||
|[员工组织图表(emp_org_chart)](module/hr/hr_employee/query/emp_org_chart)|emp_org_chart|否|否 |否 ||
|[员工组织图表2(emp_org_chart2)](module/hr/hr_employee/query/emp_org_chart2)|emp_org_chart2|否|否 |否 ||
|[组织图表(org_chart)](module/hr/hr_employee/query/org_chart)|org_chart|否|否 |否 ||
|[简单查询(simple)](module/hr/hr_employee/query/simple)|simple|否|否 |否 ||
|[带活动查询(with_activities)](module/hr/hr_employee/query/with_activities)|with_activities|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_employee/dataset/Default)|DEFAULT|数据查询|是|||
|[员工组织图表(emp_org_chart)](module/hr/hr_employee/dataset/emp_org_chart)|emp_org_chart|数据查询|否|||
|[员工组织图表2(emp_org_chart2)](module/hr/hr_employee/dataset/emp_org_chart2)|emp_org_chart2|数据查询|否|||
|[组织图表(org_chart)](module/hr/hr_employee/dataset/org_chart)|org_chart|数据查询|否|||
|[简单查询(simple)](module/hr/hr_employee/dataset/simple)|simple|数据查询|否|||
|[带活动查询(with_activities)](module/hr/hr_employee/dataset/with_activities)|with_activities|数据查询|否|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_EXCEPTION_DECORATION_EQ|活动异常标示|EQ||
|N_ACTIVITY_STATE_EQ|活动状态|EQ||
|N_ADDRESS_ID_EQ|工作地址|EQ||
|N_ADDRESS_NAME_EQ|工作地址|EQ||
|N_ADDRESS_NAME_LIKE|工作地址|LIKE||
|N_ATTENDANCE_MANAGER_ID_EQ|考勤管理员|EQ||
|N_ATTENDANCE_MANAGER_NAME_EQ|考勤管理员|EQ||
|N_ATTENDANCE_MANAGER_NAME_LIKE|考勤管理员|LIKE||
|N_ATTENDANCE_STATE_EQ|出勤状态|EQ||
|N_BANK_ACCOUNT_ID_EQ|银行账户|EQ||
|N_BANK_ACCOUNT_NAME_EQ|银行账户|EQ||
|N_BANK_ACCOUNT_NAME_LIKE|银行账户|LIKE||
|N_CERTIFICATE_EQ|证书等级|EQ||
|N_COACH_ID_EQ|教练|EQ||
|N_COACH_NAME_EQ|教练|EQ||
|N_COACH_NAME_LIKE|教练|LIKE||
|N_COMPANY_ID_EQ|公司|EQ||
|N_COMPANY_NAME_EQ|公司名称|EQ||
|N_COMPANY_NAME_LIKE|公司名称|LIKE||
|N_COUNTRY_ID_EQ|国籍(国家)|EQ||
|N_COUNTRY_NAME_EQ|国籍(国家)|EQ||
|N_COUNTRY_NAME_LIKE|国籍(国家)|LIKE||
|N_CURRENT_LEAVE_STATE_EQ|当前休假状态|EQ||
|N_DEPARTMENT_ID_CHILDOF|部门|CHILDOF||
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_DEPARTMENT_NAME_EQ|部门名称|EQ||
|N_DEPARTMENT_NAME_LIKE|部门名称|LIKE||
|N_DISTANCE_HOME_WORK_UNIT_EQ|通勤距离（单位）|EQ||
|N_EMPLOYEE_TYPE_EQ|员工类型|EQ||
|N_EXPENSE_MANAGER_ID_EQ|费用|EQ||
|N_GENDER_EQ|性别|EQ||
|N_HR_ICON_DISPLAY_EQ|人力资源显示的图标|EQ||
|N_HR_PRESENCE_STATE_EQ|人力资源出席状态|EQ||
|N_ID_EQ|标识|EQ||
|N_JOB_ID_EQ|工作岗位|EQ||
|N_JOB_NAME_EQ|工作岗位|EQ||
|N_JOB_NAME_LIKE|工作岗位|LIKE||
|N_LEAVE_MANAGER_ID_EQ|休假|EQ||
|N_LEAVE_MANAGER_NAME_EQ|休假|EQ||
|N_LEAVE_MANAGER_NAME_LIKE|休假|LIKE||
|N_MESSAGE_MAIN_ATTACHMENT_ID_EQ|主要附件|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARENT_ID_EQ|管理员标识|EQ||
|N_PARENT_NAME_EQ|管理员|EQ||
|N_PARENT_NAME_LIKE|管理员|LIKE||
|N_PRIVATE_COUNTRY_ID_EQ|国家|EQ||
|N_PRIVATE_COUNTRY_NAME_EQ|国家|EQ||
|N_PRIVATE_COUNTRY_NAME_LIKE|国家|LIKE||
|N_PRIVATE_STATE_ID_EQ|私人省/州|EQ||
|N_PRIVATE_STATE_NAME_EQ|私人省/州|EQ||
|N_PRIVATE_STATE_NAME_LIKE|私人省/州|LIKE||
|N_RESOURCE_CALENDAR_ID_EQ|工作时间|EQ||
|N_RESOURCE_CALENDAR_NAME_EQ|工作时间|EQ||
|N_RESOURCE_CALENDAR_NAME_LIKE|工作时间|LIKE||
|N_RESOURCE_ID_EQ|资源|EQ||
|N_USER_ID_EQ|用户|EQ||
|N_USER_NAME_EQ|用户|EQ||
|N_USER_NAME_LIKE|用户|LIKE||
|N_WORK_CONTACT_ID_EQ|工作联系人|EQ||
|N_WORK_LOCATION_ID_EQ|工作地点|EQ||
|N_WORK_LOCATION_NAME_EQ|工作地点|EQ||
|N_WORK_LOCATION_NAME_LIKE|工作地点|LIKE||
|N_WORK_LOCATION_TYPE_EQ|工作位置类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 生成徽标 ID | generate_random_barcode | 生成徽标 ID |无数据|<details><summary>后台调用</summary>[generate_random_barcode](#行为)||
| 打开员工编辑视图 | OpenMainView | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[员工](app/view/hr_employeemain_view)</details>||
| 新建 | OpenCreateView | 新建 |无数据|<details><summary>打开视图或向导（模态）</summary>[员工](app/view/hr_employeemain_view)</details>||
| 树节点展开 | tree_node_expanded | 展开 |无数据|用户自定义|员工组织架构图节点绘制面板使用|
| 打开员工基本信息页面 | emp_base_view | 员工 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[员工](app/view/hr_employeebase_info_view)</details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[打开员工基本信息视图](module/hr/hr_employee/uilogic/open_emp_info_view)|open_emp_info_view||

## 导出模式

* **数据导出**


<el-descriptions direction="vertical" :column="11" :size="size" border>
<el-descriptions-item label="员工姓名">-</el-descriptions-item>
<el-descriptions-item label="办公电话">-</el-descriptions-item>
<el-descriptions-item label="工作电子邮件">-</el-descriptions-item>
<el-descriptions-item label="出席">-</el-descriptions-item>
<el-descriptions-item label="下一活动截止日期">-</el-descriptions-item>
<el-descriptions-item label="公司">-</el-descriptions-item>
<el-descriptions-item label="部门">-</el-descriptions-item>
<el-descriptions-item label="工作岗位">-</el-descriptions-item>
<el-descriptions-item label="管理员">-</el-descriptions-item>
<el-descriptions-item label="头像">-</el-descriptions-item>
<el-descriptions-item label="头像">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_employee?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=导出模式`">
  导出模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',
show_field_group:'field_group_Simple',

      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>