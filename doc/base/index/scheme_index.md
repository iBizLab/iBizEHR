# 数据结构 <!-- {docsify-ignore-all} -->

### 数据库体系[DEFAULT]
#### 销售团队(CRM_TEAM)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ALIAS_EMAIL|电子邮箱别名|VARCHAR|是|500|||
|ALIAS_ID|别名|VARCHAR|是|100|||
|ASSIGNMENT_AUTO_ENABLED|自动指派|INT|是||||
|ASSIGNMENT_DOMAIN|指派域名|VARCHAR|是|500|||
|ASSIGNMENT_ENABLED|线索指派|INT|是||||
|ASSIGNMENT_MAX|线索平均能力|INT|是||||
|ASSIGNMENT_OPTOUT|跳过自动分配|INT|是||||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DASHBOARD_BUTTON_NAME|仪表板按钮|VARCHAR|是|500|||
|DASHBOARD_GRAPH_DATA|数据仪表图|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INVOICED|本月已开具发票|FLOAT|是||||
|INVOICED_TARGET|开票目标|FLOAT|是||||
|IS_FAVORITE|显示仪表|INT|是||||
|IS_MEMBERSHIP_MULTI|允许多个会员资格|INT|是||||
|LEAD_ALL_ASSIGNED_MONTH_COUNT|本月指派的线索/商机|INT|是||||
|LEAD_ALL_ASSIGNED_MONTH_EXCEEDED|超出每月线索分配|INT|是||||
|LEAD_PROPERTIES_DEFINITION|线索属性|TEXT|是|1048576|||
|LEAD_UNASSIGNED_COUNT|未指派的线索|INT|是||||
|MEMBER_WARNING|会员问题警告|TEXT|是|1048576|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|OPPORTUNITIES_AMOUNT|商机收入|DECIMAL|是||||
|OPPORTUNITIES_COUNT|商机|INT|是||||
|OPPORTUNITIES_OVERDUE_AMOUNT|逾期商机收入|DECIMAL|是||||
|OPPORTUNITIES_OVERDUE_COUNT|逾期商机|INT|是||||
|QUOTATIONS_AMOUNT|待开票报价单金额|FLOAT|是||||
|QUOTATIONS_COUNT|待开票报价单的数量|INT|是||||
|SALES_TO_INVOICE_COUNT|待开票销售的数量|INT|是||||
|SALE_ORDER_COUNT|销售订单号|INT|是||||
|SEQUENCE|序列|INT|是||||
|USER_ID|团队负责人|VARCHAR|是|100|||
|USE_LEADS|线索|INT|是||||
|USE_OPPORTUNITIES|渠道|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 讨论频道(DISCUSS_CHANNEL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ALLOW_PUBLIC_UPLOAD|允许公开上传|INT|是||||
|CHANNEL_TYPE|频道类型|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEFAULT_DISPLAY_MODE|默认显示模式|VARCHAR|是|60|||
|DESCRIPTION|描述|TEXT|是|1048576|||
|FROM_MESSAGE_ID|来自消息|VARCHAR|是|100|||
|GROUP_PUBLIC_ID|授权群组|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LAST_INTEREST_DT|持续的兴趣|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|PARENT_CHANNEL_ID|父频道|VARCHAR|是|100|||
|SFU_CHANNEL_UUID|Sfu 频道 Uuid|VARCHAR|是|250|||
|SFU_SERVER_URL|Sfu 服务器网址|VARCHAR|是|250|||
|UUID|UUID|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 频道成员(DISCUSS_CHANNEL_MEMBER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CHANNEL_ID|频道|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CUSTOM_CHANNEL_NAME|自定义频道名称|VARCHAR|是|250|||
|CUSTOM_NOTIFICATIONS|定制通知|VARCHAR|是|60|||
|FETCHED_MESSAGE_ID|最后一次提取|VARCHAR|是|100|||
|FOLD_STATE|对话收拢状态|VARCHAR|是|60|||
|GUEST_ID|访客|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LAST_INTEREST_DT|持续的兴趣|DATETIME|是||||
|LAST_SEEN_DT|上次查看日期|DATETIME|是||||
|MUTE_UNTIL_DT|静音通知，直到|DATETIME|是||||
|NEW_MESSAGE_SEPARATOR|新信息分割符|INT|是||||
|PARTNER_ID|合作伙伴|VARCHAR|是|100|||
|RTC_INVITING_SESSION_ID|振铃会话|VARCHAR|是|100|||
|SEEN_MESSAGE_ID|最近一次查阅|VARCHAR|是|100|||
|UNPIN_DT|取消置顶日期|DATETIME|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 邮件 RTC 会话(DISCUSS_CHANNEL_RTC_SESSION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CHANNEL_ID|频道|VARCHAR|是|100|||
|CHANNEL_MEMBER_ID|频道成员|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_CAMERA_ON|正在发送用户视频|INT|是||||
|IS_DEAF|禁用来电声音|INT|是||||
|IS_MUTED|麦克风静音|INT|是||||
|IS_SCREEN_SHARING_ON|正在共享屏幕|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 从 Tenor API 保存收藏的 GIF(DISCUSS_GIF_FAVORITE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|TENOR_GIF_ID|来自 Tenor 的 GIF ID|VARCHAR|是|250|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 语音附件的元数据(DISCUSS_VOICE_METADATA)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ATTACHMENT_ID|附件|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 合同类型(HR_CONTRACT_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CODE|代码|VARCHAR|是|500|||
|COUNTRY_ID|国家/地区|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 部门(HR_DEPARTMENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ABSENCE_OF_TODAY|今日缺勤|INT|是||||
|ACTIVE|有效|INT|是||||
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|ALLOCATION_TO_APPROVE_COUNT|待批准的分配|INT|是||||
|AVATAR|头像|TEXT|是|1048576|||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|COMPLETE_NAME|完整名称|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EXPECTED_EMPLOYEE|预期的员工|INT|是||||
|EXPENSE_SHEETS_TO_APPROVE_COUNT|待批准的费用报表|INT|是||||
|HAS_MESSAGE|有消息|INT|是||||
|HAS_READ_ACCESS|null|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IMAGE|头像|TEXT|是|1048576|||
|LEAVE_TO_APPROVE_COUNT|待批准的休假|INT|是||||
|MANAGER_ID|管理员|VARCHAR|是|100|||
|MASTER_DEPARTMENT_ID|主部门|VARCHAR|是|100|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|NEW_APPLICANT_COUNT|新申请|INT|是||||
|NEW_HIRED_EMPLOYEE|新雇用的员工|INT|是||||
|NOTE|备注|TEXT|是|1048576|||
|PARENT_ID|上级部门|VARCHAR|是|100|||
|PARENT_PATH|父级路径|VARCHAR|是|500|||
|PLANS_COUNT|计划数量|INT|是||||
|TOTAL_EMPLOYEE|null|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 员工(HR_EMPLOYEE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ACTIVITY_DATE_DEADLINE|下一活动截止日期|DATETIME|是||||
|ACTIVITY_EXCEPTION_DECORATION|活动异常标示|VARCHAR|是|60|||
|ACTIVITY_EXCEPTION_ICON|图标|VARCHAR|是|500|||
|ACTIVITY_STATE|活动状态|VARCHAR|是|60|||
|ADDITIONAL_NOTE|其它说明|TEXT|是|1048576|||
|ADDRESS_ID|工作地址|VARCHAR|是|100|||
|ALLOCATIONS_COUNT|分配总数量|INT|是||||
|ALLOCATION_COUNT|分配的总天数。|FLOAT|是||||
|ALLOCATION_DISPLAY|分配显示|VARCHAR|是|500|||
|ALLOCATION_REMAINING_DISPLAY|剩余的分配显示|VARCHAR|是|500|||
|ATTENDANCE_MANAGER_ID|考勤管理员|VARCHAR|是|100|||
|ATTENDANCE_STATE|出勤状态|VARCHAR|是|60|||
|BANK_ACCOUNT_ID|银行账户|VARCHAR|是|100|||
|BARCODE|徽标 ID|VARCHAR|是|500|||
|BIRTHDAY|出生日期|DATETIME|是||||
|CERTIFICATE|证书等级|VARCHAR|是|60|||
|CHILDREN|受抚养的子女数|INT|是||||
|CHILD_ALL_COUNT|间接下属统计|INT|是||||
|CHILD_COUNT|直接下属人数|INT|是||||
|COACH_ID|教练|VARCHAR|是|100|||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CONTRACTS_COUNT|合同统计|INT|是||||
|CONTRACT_ID|当前合同|VARCHAR|是|100|||
|CONTRACT_WARNING|合同警告|INT|是||||
|COUNTRY_ID|国籍(国家)|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENT_LEAVE_STATE|当前休假状态|VARCHAR|是|60|||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DEPARTURE_DATE|离职日期|DATETIME|是||||
|DEPARTURE_DESCRIPTION|其它信息|TEXT|是|1048576|||
|DEPARTURE_REASON_ID|离职原因|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DISTANCE_HOME_WORK|通勤距离|INT|是||||
|DISTANCE_HOME_WORK_UNIT|通勤距离（单位）|VARCHAR|是|60|||
|EMERGENCY_CONTACT|联系人姓名|VARCHAR|是|500|||
|EMERGENCY_PHONE|电话|VARCHAR|是|50|||
|EMPLOYEE_CARS_COUNT|车辆|INT|是||||
|EMPLOYEE_TYPE|员工类型|VARCHAR|是|60|||
|EQUIPMENT_COUNT|设备数量|INT|是||||
|EXPENSE_MANAGER_ID|费用|VARCHAR|是|100|||
|FILTER_FOR_EXPENSE|费用筛选|INT|是||||
|FIRST_CONTRACT_DATE|首次合同日期|DATETIME|是||||
|GENDER|性别|VARCHAR|是|60|||
|HAS_BADGES|有徽章|INT|是||||
|HAS_MESSAGE|有消息|INT|是||||
|HOURS_LAST_MONTH|小时上月|FLOAT|是||||
|HOURS_LAST_MONTH_DISPLAY|小时上月显示|VARCHAR|是|500|||
|HOURS_PREVIOUSLY_TODAY|今天之前的小时数|FLOAT|是||||
|HOURS_TODAY|小时今天|FLOAT|是||||
|HR_ICON_DISPLAY|人力资源显示的图标|VARCHAR|是|60|||
|HR_PRESENCE_STATE|人力资源出席状态|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IDENTIFICATION_ID|身份证号|VARCHAR|是|500|||
|IMAGE|头像|VARCHAR|是|500|||
|IS_ABSENT|今日缺勤|INT|是||||
|IS_FLEXIBLE|灵活可变|INT|是||||
|IS_FULLY_FLEXIBLE|完全灵活|INT|是||||
|IS_SUBORDINATE|是下属|INT|是||||
|JOB_ID|工作岗位|VARCHAR|是|100|||
|JOB_TITLE|工作头衔|VARCHAR|是|500|||
|KM_HOME_WORK|通勤距离（公里）|INT|是||||
|LAST_ACTIVITY|上个活动|DATETIME|是||||
|LAST_ACTIVITY_TIME|上个活动时间|VARCHAR|是|500|||
|LAST_ATTENDANCE_ID|上次出勤|VARCHAR|是|100|||
|LAST_ATTENDANCE_WORKED_HOURS|最后一次出勤 工作时数|FLOAT|是||||
|LEAVES_COUNT|休假次数|FLOAT|是||||
|LEAVE_DATE_FROM|起始日期|DATETIME|是||||
|LEAVE_DATE_TO|至日期|DATETIME|是||||
|LEAVE_MANAGER_ID|休假|VARCHAR|是|100|||
|LEGAL_NAME|法定名称|VARCHAR|是|500|||
|LICENSE_PLATE|车辆牌照|VARCHAR|是|50|||
|MEMBER_OF_DEPARTMENT|部门数量|INT|是||||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_MAIN_ATTACHMENT_ID|主要附件|VARCHAR|是|100|||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|MOBILE_PHONE|办公手机|VARCHAR|是|50|||
|MOBILITY_CARD|调动卡|VARCHAR|是|500|||
|MY_ACTIVITY_DATE_DEADLINE|我的活动截止时间|DATETIME|是||||
|NAME|名称|VARCHAR|是|200|||
|NEWLY_HIRED|最近聘用的|INT|是||||
|NOTES|备注|TEXT|是|1048576|||
|PARENT_ID|管理员|VARCHAR|是|100|||
|PARENT_PATH|管理链|TEXT|是|1048576|||
|PASSPORT_ID|护照号|VARCHAR|是|500|||
|PERMIT_NO|工作证编号|VARCHAR|是|500|||
|PIN|PIN|VARCHAR|是|500|||
|PLACE_OF_BIRTH|出生地|VARCHAR|是|500|||
|PRIVATE_CAR_PLATE|私人车辆车牌|VARCHAR|是|500|||
|PRIVATE_CITY|城市|VARCHAR|是|500|||
|PRIVATE_COUNTRY_ID|国家|VARCHAR|是|100|||
|PRIVATE_EMAIL|私人电子邮箱|VARCHAR|是|500|||
|PRIVATE_PHONE|私人电话|VARCHAR|是|50|||
|PRIVATE_STATE_ID|私人省/州|VARCHAR|是|100|||
|PRIVATE_STREET|街道|VARCHAR|是|500|||
|PRIVATE_STREET2|街道2|VARCHAR|是|500|||
|PRIVATE_ZIP|邮编|VARCHAR|是|50|||
|RELATED_PARTNERS_COUNT|相关合作伙伴数量|INT|是||||
|REMAINING_LEAVES|可用休假天数|FLOAT|是||||
|RESOURCE_CALENDAR_ID|工作时间|VARCHAR|是|100|||
|RESOURCE_ID|资源|VARCHAR|是|100|||
|SHOW_HR_ICON_DISPLAY|显示HR图标|INT|是||||
|SHOW_LEAVES|能够查看到剩余休假|INT|是||||
|SINID|社会保险号SIN|VARCHAR|是|50|||
|SPOUSE_BIRTHDATE|配偶生日|DATETIME|是||||
|SPOUSE_COMPLETE_NAME|配偶全名|VARCHAR|是|500|||
|SSNID|社会保障号SSN|VARCHAR|是|500|||
|STUDY_FIELD|研究领域|VARCHAR|是|500|||
|STUDY_SCHOOL|毕业院校|VARCHAR|是|500|||
|TOTAL_OVERTIME|加班费总额|FLOAT|是||||
|USER_ID|用户|VARCHAR|是|100|||
|VEHICLE|公司汽车|VARCHAR|是|50|||
|VISA_EXPIRE|签证有效期|DATETIME|是||||
|VISA_NO|签证号|VARCHAR|是|500|||
|WORK_CONTACT_ID|工作联系人|VARCHAR|是|100|||
|WORK_EMAIL|工作电子邮件|VARCHAR|是|500|||
|WORK_LOCATION_ID|工作地点|VARCHAR|是|100|||
|WORK_LOCATION_NAME|工作位置名称|VARCHAR|是|500|||
|WORK_LOCATION_TYPE|工作位置类型|VARCHAR|是|60|||
|WORK_PERMIT_EXPIRATION_DATE|工作许可证到期日期|DATETIME|是||||
|WORK_PERMIT_NAME|工作许可名称|VARCHAR|是|500|||
|WORK_PERMIT_SCHEDULED_ACTIVITY|工作许可的预定活动|INT|是||||
|WORK_PHONE|办公电话|VARCHAR|是|50|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 基本员工(HR_EMPLOYEE_BASE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ADDRESS_ID|工作地址|VARCHAR|是|100|||
|ALLOCATIONS_COUNT|分配总数量|INT|是||||
|ALLOCATION_COUNT|分配的总天数。|FLOAT|是||||
|ALLOCATION_DISPLAY|分配显示|VARCHAR|是|500|||
|ALLOCATION_REMAINING_DISPLAY|剩余的分配显示|VARCHAR|是|500|||
|CHILD_ALL_COUNT|间接下属统计|INT|是||||
|CHILD_COUNT|直接下属人数|INT|是||||
|COACH_ID|教练|VARCHAR|是|100|||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CURRENT_LEAVE_STATE|当前休假状态|VARCHAR|是|60|||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|FILTER_FOR_EXPENSE|费用筛选|INT|是||||
|HAS_BADGES|有徽章|INT|是||||
|HR_ICON_DISPLAY|人力资源显示的图标|VARCHAR|是|60|||
|HR_PRESENCE_STATE|人力资源出席状态|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_ABSENT|今日缺勤|INT|是||||
|IS_FLEXIBLE|灵活可变|INT|是||||
|IS_FULLY_FLEXIBLE|完全灵活|INT|是||||
|JOB_ID|工作岗位|VARCHAR|是|100|||
|JOB_TITLE|工作头衔|VARCHAR|是|500|||
|LAST_ACTIVITY|上个活动|DATETIME|是||||
|LAST_ACTIVITY_TIME|上个活动时间|VARCHAR|是|500|||
|LEAVES_COUNT|休假次数|FLOAT|是||||
|LEAVE_DATE_FROM|起始日期|DATETIME|是||||
|LEAVE_DATE_TO|至日期|DATETIME|是||||
|LEAVE_MANAGER_ID|休假|VARCHAR|是|100|||
|MEMBER_OF_DEPARTMENT|部门数量|INT|是||||
|MOBILE_PHONE|办公手机|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|NEWLY_HIRED|最近聘用的|INT|是||||
|PARENT_ID|管理员|VARCHAR|是|100|||
|REMAINING_LEAVES|可用休假天数|FLOAT|是||||
|SHOW_HR_ICON_DISPLAY|显示HR图标|INT|是||||
|SHOW_LEAVES|能够查看到剩余休假|INT|是||||
|USER_ID|用户|VARCHAR|是|100|||
|WORK_CONTACT_ID|工作联系人|VARCHAR|是|100|||
|WORK_EMAIL|工作电子邮件|VARCHAR|是|500|||
|WORK_LOCATION_ID|工作地点|VARCHAR|是|100|||
|WORK_LOCATION_NAME|工作位置名称|VARCHAR|是|500|||
|WORK_LOCATION_TYPE|工作位置类型|VARCHAR|是|60|||
|WORK_PHONE|办公电话|VARCHAR|是|500|||
#### 工作岗位(HR_JOB)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ACTIVITIES_OVERDUE|基于活动的状态
逾期：已经超过截止日期
现今：活动日期是当天
 计划：未来活动。|INT|是||||
|ACTIVITIES_TODAY|今天的活动|INT|是||||
|ADDRESS_ID|工作地点|VARCHAR|是|100|||
|ALIAS_EMAIL|电子邮箱别名|VARCHAR|是|500|||
|ALIAS_ID|别名|VARCHAR|是|100|||
|ALL_APPLICATION_COUNT|所有申请计计数|INT|是||||
|APPLICANT_HIRED|聘用的申请人|INT|是||||
|APPLICANT_PROPERTIES_DEFINITION|申请人物业|TEXT|是|1048576|||
|APPLICATION_COUNT|应用计数|INT|是||||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CONTRACT_TYPE_ID|雇佣类型|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|起始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DESCRIPTION|工作说明|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DOCUMENTS_COUNT|文档数|INT|是||||
|EXPECTED_EMPLOYEES|预计员工数合计|INT|是||||
|HAS_MESSAGE|有消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INDUSTRY_ID|行业|VARCHAR|是|100|||
|IS_FAVORITE|是喜好的|INT|是||||
|MANAGER_ID|部门经理|VARCHAR|是|100|||
|MESSAGE_ATTACHMENT_COUNT|附件数量|INT|是||||
|MESSAGE_HAS_ERROR|消息发送错误|INT|是||||
|MESSAGE_HAS_ERROR_COUNTER|错误数量|INT|是||||
|MESSAGE_HAS_SMS_ERROR|短信发送错误|INT|是||||
|MESSAGE_IS_FOLLOWER|是关注者|INT|是||||
|MESSAGE_NEEDACTION|所需操作|INT|是||||
|MESSAGE_NEEDACTION_COUNTER|操作数量|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|NEW_APPLICATION_COUNT|新的申请|INT|是||||
|NO_OF_EMPLOYEE|当前员工数量|INT|是||||
|NO_OF_HIRED_EMPLOYEE|被雇佣的|INT|是||||
|NO_OF_RECRUITMENT|目标|INT|是||||
|OLD_APPLICATION_COUNT|旧申请|INT|是||||
|REQUIREMENTS|要求|TEXT|是|1048576|||
|SEQUENCE|序列|INT|是||||
|USER_ID|招聘人员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 休假类型(HR_LEAVE_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCRUAL_COUNT|应计数量|FLOAT|是||||
|ACTIVE|有效|INT|是||||
|ALLOCATION_COUNT|分配|INT|是||||
|ALLOCATION_NOTIF_SUBTYPE_ID|分配通知子类型|VARCHAR|是|100|||
|ALLOCATION_VALIDATION_TYPE|审批|VARCHAR|是|60|||
|ALLOWS_NEGATIVE|允许负上限|INT|是||||
|COLOR|颜色|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_CALENDAR_MEETING|在日历中显示休假|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMPLOYEE_REQUESTS|员工要求|VARCHAR|是|60|||
|GROUP_DAYS_LEAVE|休假分组|FLOAT|是||||
|HAS_VALID_ALLOCATION|拥有有效的分配|INT|是||||
|ICON_ID|封面图片|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INCLUDE_PUBLIC_HOLIDAYS_IN_DURATION|包括公众假期|INT|是||||
|LEAVES_TAKEN|已休假|FLOAT|是||||
|LEAVE_NOTIF_SUBTYPE_ID|休假通知子类型|VARCHAR|是|100|||
|LEAVE_VALIDATION_TYPE|休假验证|VARCHAR|是|60|||
|MAX_ALLOWED_NEGATIVE|最大超量|INT|是||||
|MAX_LEAVES|最大允许|FLOAT|是||||
|NAME|名称|VARCHAR|是|200|||
|OVERTIME_DEDUCTIBLE|调休申请|INT|是||||
|REQUEST_UNIT|休假最小单位|VARCHAR|是|60|||
|REQUIRES_ALLOCATION|需要分配|VARCHAR|是|60|||
|SEQUENCE|序列|INT|是||||
|SHOW_ON_DASHBOARD|在仪表板显示|INT|是||||
|SUPPORT_DOCUMENT|支持性文件|INT|是||||
|TIME_TYPE|休假种类|VARCHAR|是|60|||
|UNPAID|没付款|INT|是||||
|VIRTUAL_REMAINING_LEAVES|有效的剩余休假|FLOAT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 工作地点(HR_WORK_LOCATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ADDRESS_ID|工作地址|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOCATION_NUMBER|地点编号|VARCHAR|是|500|||
|LOCATION_TYPE|封面图片|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 附件(IR_ATTACHMENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCESS_TOKEN|访问令牌|VARCHAR|是|500|||
|CHECKSUM|校验码/SHA1|VARCHAR|是|500|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DESCRIPTION|描述|TEXT|是|1048576|||
|FILE_ID|oss文件标识|VARCHAR|是|500|||
|FILE_SIZE|文件大小|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INDEX_CONTENT|索引内容|TEXT|是|1048576|||
|MIMETYPE|Mime类型|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|ORIGINAL_ID|原始（未优化，未调整大小）附件|VARCHAR|是|100|||
|PUBLIC|是公开文件|INT|是||||
|RES_FIELD|资源字段|VARCHAR|是|500|||
|RES_ID|资源标识|VARCHAR|是|100|||
|RES_MODEL|资源模型|VARCHAR|是|500|||
|STORE_FNAME|存储的文件名|VARCHAR|是|500|||
|TYPE|类型|VARCHAR|是|60|||
|URL|网址|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 默认值(IR_DEFAULT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COMPANY_ID|公司|VARCHAR|是|100|||
|CONDITION|条件|VARCHAR|是|250|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|FIELD_ID|属性标识|VARCHAR|是|200|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|JSON_VALUE|默认值 (JSON格式)|VARCHAR|是|250|||
|USER_ID|用户|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 模型(IR_MODEL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INFO|信息|TEXT|是|1048576|||
|IS_MAIL_ACTIVITY|有邮件活动|INT|是||||
|IS_MAIL_BLACKLIST|有邮件黑名单|INT|是||||
|IS_MAIL_THREAD|有邮件会话|INT|是||||
|MODEL|模型|VARCHAR|是|250|||
|NAME|名称|VARCHAR|是|200|||
|ORDER|排序|VARCHAR|是|250|||
|STATE|类型|VARCHAR|是|60|||
|TRANSIENT|瞬态模型|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 模型访问(IR_MODEL_ACCESS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|GROUP_ID|授权群组|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MODEL_ID|模型|VARCHAR|是|200|||
|NAME|名称|VARCHAR|是|200|||
|PERM_CREATE|创建|INT|是||||
|PERM_READ|读取|INT|是||||
|PERM_UNLINK|删除|INT|是||||
|PERM_WRITE|写入|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 字段(IR_MODEL_FIELDS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COLUMN1|列 1|VARCHAR|是|250|||
|COLUMN2|列 2|VARCHAR|是|250|||
|COMPANY_DEPENDENT|公司依赖|INT|是||||
|COMPLETE_NAME|全名|VARCHAR|是|250|||
|COMPUTE|计算|TEXT|是|1048576|||
|COPIED|可复制|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_FIELD|币别字段|VARCHAR|是|250|||
|DEPENDS|依赖于|VARCHAR|是|250|||
|DOMAIN|域名|VARCHAR|是|250|||
|FIELD_DESCRIPTION|字段标签|VARCHAR|是|250|||
|GROUP_EXPAND|扩展组别|INT|是||||
|HELP|字段帮助|TEXT|是|1048576|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INDEX|索引|INT|是||||
|MODEL|模型名称|VARCHAR|是|250|||
|NAME|名称|VARCHAR|是|200|||
|ON_DELETE|关于删除|VARCHAR|是|60|||
|READONLY|只读|INT|是||||
|RELATED|关联的字段|VARCHAR|是|250|||
|RELATION|关联的模型|VARCHAR|是|250|||
|RELATION_FIELD|关联字段|VARCHAR|是|250|||
|RELATION_TABLE|关系表|VARCHAR|是|250|||
|REQUIRED|必填|INT|是||||
|SANITIZE|净化 HTML|INT|是||||
|SANITIZE_ATTRIBUTES|净化 HTML 属性|INT|是||||
|SANITIZE_FORM|净化 HTML 表格|INT|是||||
|SANITIZE_OVERRIDABLE|可重写消毒 HTML|INT|是||||
|SANITIZE_STYLE|净化 HTML 样式|INT|是||||
|SANITIZE_TAGS|清除 HTML 标记|INT|是||||
|SELECTABLE|可选择|INT|是||||
|SIZE|大小|INT|是||||
|STATE|类型|VARCHAR|是|60|||
|STORE|存储|INT|是||||
|STRIP_CLASSES|剥离类属性|INT|是||||
|STRIP_STYLE|带状样式属性|INT|是||||
|TRACKING|启用跟踪|INT|是||||
|TRANSLATE|可翻译|INT|是||||
|TTYPE|字段类型|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 应用(IR_MODULE_CATEGORY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DESCRIPTION|描述|TEXT|是|1048576|||
|EXCLUSIVE|专属|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PARENT_ID|家长申请|VARCHAR|是|100|||
|SEQUENCE|序列|INT|是||||
|VISIBLE|显示|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 规则(IR_RULE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|DOMAIN_FORCE|域名|TEXT|是|1048576|||
|GLOBAL|全局|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MODEL_ID|模型|VARCHAR|是|200|||
|NAME|名称|VARCHAR|是|200|||
|PERM_CREATE|创建|INT|是||||
|PERM_READ|读取|INT|是||||
|PERM_UNLINK|删除|INT|是||||
|PERM_WRITE|写入|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 序列(IR_SEQUENCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CODE|序列类型|VARCHAR|是|500|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IMPLEMENTATION|实施策略|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|200|||
|NUMBER_INCREMENT|步长|INT|是||||
|NUMBER_NEXT|下一个编号|INT|是||||
|PADDING|序列填充长度|INT|是||||
|PREFIX|前缀|VARCHAR|是|500|||
|SUFFIX|后缀|VARCHAR|是|500|||
|USE_DATE_RANGE|按日期重编序列号|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 统一资源(IR_UNIRES)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RES_CODE|资源代码|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动(MAIL_ACTIVITY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ACTIVITY_TYPE_ID|活动类型|VARCHAR|是|100|||
|AUTOMATED|自动活动|INT|是||||
|CAN_WRITE|可写|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_DEADLINE|到期日期|DATETIME|是||||
|DATE_DONE|完成日期|DATETIME|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HAS_RECOMMENDED_ACTIVITIES|下一活动可用|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NOTE|备注|TEXT|是|1048576|||
|PREVIOUS_ACTIVITY_TYPE_ID|上一个活动类型|VARCHAR|是|100|||
|RECOMMENDED_ACTIVITY_TYPE_ID|推荐的活动类型|VARCHAR|是|100|||
|REQUEST_PARTNER_ID|请求伙伴|VARCHAR|是|100|||
|RES_ID|资源标识|VARCHAR|是|100|||
|RES_MODEL|资源模型|VARCHAR|是|200|||
|RES_NAME|单据名称|VARCHAR|是|200|||
|STATE|状态|VARCHAR|是|60|||
|SUMMARY|摘要|VARCHAR|是|500|||
|USER_ID|分派给|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动计划(MAIL_ACTIVITY_PLAN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEPARTMENT_ASSIGNABLE|部门可指派|INT|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HAS_USER_ON_DEMAND|按需负责|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|STEPS_COUNT|步数计数|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动计划模板(MAIL_ACTIVITY_PLAN_TEMPLATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVITY_TYPE_ID|活动类型|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DELAY_COUNT|间隔|INT|是||||
|DELAY_FROM|触发方式|VARCHAR|是|60|||
|DELAY_UNIT|延迟单位|VARCHAR|是|60|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NOTE|备注|TEXT|是|1048576|||
|PLAN_ID|计划|VARCHAR|是|100|||
|RESPONSIBLE_ID|分派给|VARCHAR|是|100|||
|RESPONSIBLE_TYPE|指派|VARCHAR|是|60|||
|SEQUENCE|序列|INT|是||||
|SUMMARY|摘要|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVITY_TYPE_ID|活动类型|VARCHAR|是|100|||
|ACTIVITY_USER_ID|分派给|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_DEADLINE|到期日期|DATETIME|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ERROR|错误|TEXT|是|1048576|||
|HAS_ERROR|有错误|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_BATCH_MODE|批量使用|INT|是||||
|NOTE|备注|TEXT|是|1048576|||
|PLAN_DATE|计划日期|DATETIME|是||||
|PLAN_DEPARTMENT_FILTERABLE|计划部门可筛选|INT|是||||
|PLAN_ID|计划|VARCHAR|是|100|||
|PLAN_ON_DEMAND_USER_ID|分派给|VARCHAR|是|100|||
|PLAN_SUMMARY|计划概要|TEXT|是|1048576|||
|RES_IDS|文档 ID|TEXT|是|1048576|||
|RES_MODEL|模型|VARCHAR|是|500|||
|SUMMARY|摘要|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动类型(MAIL_ACTIVITY_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CATEGORY|操作|VARCHAR|是|60|||
|CHAINING_TYPE|链接类型|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DECORATION_TYPE|排版类型|VARCHAR|是|60|||
|DEFAULT_NOTE|默认备注|TEXT|是|1048576|||
|DEFAULT_USER_ID|默认用户|VARCHAR|是|100|||
|DELAY_COUNT|安排|INT|是||||
|DELAY_FROM|延迟类型|VARCHAR|是|60|||
|DELAY_LABEL|延迟标签|VARCHAR|是|500|||
|DELAY_UNIT|延迟单位|VARCHAR|是|60|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ICON|图标|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|KEEP_DONE|保持完成|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|RES_MODEL|资源模型|VARCHAR|是|200|||
|RES_MODEL_CHANGE|模型已更改|INT|是||||
|SEQUENCE|序列|INT|是||||
|SUMMARY|默认摘要|VARCHAR|是|500|||
|TRIGGERED_NEXT_TYPE_ID|触发方式|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 活动类型模板(MAIL_ACTIVITY_TYPE_MAIL_TEMPLATE_REL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MAIL_ACTIVITY_TYPE_ID|标识|VARCHAR|是|100|||
|MAIL_TEMPLATE_ID|标识|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
#### EMail别名(MAIL_ALIAS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ALIAS_BOUNCED_CONTENT|自定义退回消息|TEXT|是|1048576|||
|ALIAS_CONTACT|别名授权于|VARCHAR|是|60|||
|ALIAS_DEFAULTS|默认值|TEXT|是|1048576|||
|ALIAS_DOMAIN_ID|别名域|VARCHAR|是|100|||
|ALIAS_FORCE_THREAD_ID|记录线索ID|INT|是||||
|ALIAS_FULL_NAME|别名电子邮件|VARCHAR|是|500|||
|ALIAS_INCOMING_LOCAL|收件时检测本地的别名域|INT|是||||
|ALIAS_NAME|别名|VARCHAR|是|500|||
|ALIAS_PARENT_THREAD_ID|上级记录ID|INT|是||||
|ALIAS_STATUS|别名状态|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 电子邮件域名(MAIL_ALIAS_DOMAIN)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|BOUNCE_ALIAS|弹跳别名|VARCHAR|是|500|||
|BOUNCE_EMAIL|退件电子邮件|VARCHAR|是|500|||
|CATCHALL_ALIAS|全部别名|VARCHAR|是|500|||
|CATCHALL_EMAIL|预设邮件|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEFAULT_FROM|默认发件人别名|VARCHAR|是|500|||
|DEFAULT_FROM_EMAIL|默认从|VARCHAR|是|500|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 关注(MAIL_FOLLOWERS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|PARTNER_ID|相关的业务伙伴|VARCHAR|是|100|||
|RES_ID|资源标识|VARCHAR|是|100|||
|RES_MODEL|相关的单据模型名称|VARCHAR|是|500|||
|TYPE|关注类型|VARCHAR|是|60|||
|USER_ID|关注人|VARCHAR|是|100|||
#### 访客(MAIL_GUEST)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCESS_TOKEN|访问令牌|VARCHAR|是|500|||
|COUNTRY_ID|国家/地区|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IM_STATUS|IM的状态|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 评论(MAIL_MESSAGE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCOUNT_AUDIT_LOG_ACTIVATED|审计日志已启动|INT|是||||
|ACCOUNT_AUDIT_LOG_PREVIEW|描述|TEXT|是|1048576|||
|AUTHOR_GUEST_ID|访客|VARCHAR|是|100|||
|AUTHOR_ID|作者|VARCHAR|是|100|||
|BODY|内容|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE|日期|DATETIME|是||||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL_ADD_SIGNATURE|电子邮件添加签字|INT|是||||
|EMAIL_FROM|来自|VARCHAR|是|500|||
|EMAIL_LAYOUT_XMLID|布局|VARCHAR|是|500|||
|HAS_ERROR|有错误|INT|是||||
|HAS_SMS_ERROR|有短信息错误|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_CURRENT_USER_OR_GUEST_AUTHOR|是当前用户还是访客作者|INT|是||||
|IS_INTERNAL|仅限员工|INT|是||||
|MAIL_ACTIVITY_TYPE_ID|邮件活动类型|VARCHAR|是|100|||
|MESSAGE_ID|消息ID|VARCHAR|是|500|||
|MESSAGE_TYPE|类型|VARCHAR|是|60|||
|MODEL|相关单据模型|VARCHAR|是|500|||
|NEEDACTION|需要行动|INT|是||||
|PARENT_AUTHOR_ID|上级消息作者|VARCHAR|是|100|||
|PARENT_ID|上级消息|VARCHAR|是|100|||
|PINNED_AT|已置顶|DATETIME|是||||
|PREVIEW|预览|VARCHAR|是|500|||
|PRINCIPAL_TYPE|评论主体类型|VARCHAR|是|100|||
|RATING_VALUE|评级值|FLOAT|是||||
|RECORD_ALIAS_DOMAIN_ID|别名域|VARCHAR|是|100|||
|RECORD_COMPANY_ID|公司|VARCHAR|是|100|||
|RECORD_NAME|消息记录名称|VARCHAR|是|500|||
|REPLY_TO|回复 至|VARCHAR|是|500|||
|REPLY_TO_FORCE_NEW|无响应|INT|是||||
|RES_ID|资源标识|VARCHAR|是|100|||
|SNAILMAIL_ERROR|蜗牛邮件错误消息|INT|是||||
|STARRED|星标消息|INT|是||||
|SUBJECT|主旨|VARCHAR|是|500|||
|SUBTYPE_ID|子类型|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 消息收件人(MAIL_MESSAGE_RECIPIENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MESSAGE_ID|标识|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|PARTNER_ID|标识|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 消息子类型(MAIL_MESSAGE_SUBTYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEFAULT|默认|INT|是||||
|DESCRIPTION|描述|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|HIDDEN|隐藏|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INTERNAL|仅内部的|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|PARENT_ID|上级|VARCHAR|是|100|||
|RELATION_FIELD|关联字段|VARCHAR|是|500|||
|RES_MODEL|模型|VARCHAR|是|500|||
|SEQUENCE|序列|INT|是||||
|TRACK_RECIPIENTS|跟踪收件人|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### EMail模板(MAIL_TEMPLATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|AUTO_DELETE|自动删除|INT|是||||
|BODY_HTML|正文|TEXT|是|1048576|||
|CAN_WRITE|可写|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DESCRIPTION|模板描述|TEXT|是|1048576|||
|DISPLAY_NAME|显示名称|VARCHAR|是|500|||
|EMAIL_CC|抄送|VARCHAR|是|500|||
|EMAIL_FROM|来自|VARCHAR|是|500|||
|EMAIL_LAYOUT_XMLID|电子邮件通知布局|VARCHAR|是|500|||
|EMAIL_TO|至（EMail）|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_TEMPLATE_EDITOR|是模板编辑器|INT|是||||
|LANG|语言|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|PARTNER_TO|至（合作伙伴）|VARCHAR|是|500|||
|RENDER_MODEL|渲染模型|VARCHAR|是|500|||
|REPLY_TO|回复|VARCHAR|是|500|||
|SCHEDULED_DATE|安排的日期|VARCHAR|是|500|||
|SUBJECT|主旨|VARCHAR|是|500|||
|TEMPLATE_CATEGORY|模板类别|VARCHAR|是|60|||
|TEMPLATE_FS|模板文件名|VARCHAR|是|500|||
|USER_ID|用户|VARCHAR|是|100|||
|USE_DEFAULT_TO|默认收件人|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 资源工作时间(RESOURCE_CALENDAR)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|FLEXIBLE_HOURS|灵活时间|INT|是||||
|FULL_TIME_REQUIRED_HOURS|公司全职|FLOAT|是||||
|HOURS_PER_DAY|每天平均小时数|FLOAT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|TWO_WEEKS_CALENDAR|双周模式下的日历|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 工作细节(RESOURCE_CALENDAR_ATTENDANCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CALENDAR_ID|资源的日历|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|起始日期|DATETIME|是||||
|DATE_TO|结束日期|DATETIME|是||||
|DAYOFWEEK|星期|VARCHAR|是|60|||
|DAY_PERIOD|日期|VARCHAR|是|60|||
|DISPLAY_TYPE|显示类型|VARCHAR|是|60|||
|DURATION_DAYS|持续时间 (天)|FLOAT|是||||
|HOUR_FROM|工作起始|FLOAT|是||||
|HOUR_TO|工作截止|FLOAT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RESOURCE_ID|资源|VARCHAR|是|100|||
|SEQUENCE|序列|INT|是||||
|WEEK_TYPE|周数|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 资源(RESOURCE_RESOURCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CALENDAR_ID|工时|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RESOURCE_TYPE|类型|VARCHAR|是|60|||
|TIME_EFFICIENCY|效率因子|FLOAT|是||||
|USER_ID|用户|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 银行(RES_BANK)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|BIC|银行识别码|VARCHAR|是|500|||
|CITY|城市|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|EMAIL|邮箱|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PHONE|电话|VARCHAR|是|500|||
|STREET|街道|VARCHAR|是|500|||
|STREET2|详细地址|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|ZIP|邮编|VARCHAR|是|500|||
#### 公司(RES_COMPANY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ABSENCE_MANAGEMENT|缺勤管理|INT|是||||
|ACCOUNT_FISCAL_COUNTRY_ID|会计所在国家/地区|VARCHAR|是|100|||
|ACCOUNT_OPENING_DATE|期初分录|DATETIME|是||||
|ACCOUNT_PRICE_INCLUDE|Default Sales Price Include|VARCHAR|是|60|||
|ACCOUNT_STORNO|Storno会计应用程序|INT|是||||
|ACCOUNT_USE_CREDIT_LIMIT|销售信用额度|INT|是||||
|ACTIVE|有效|INT|是||||
|ALIAS_DOMAIN_ID|电子邮件域名|VARCHAR|是|100|||
|ANGLO_SAXON_ACCOUNTING|使用盎格鲁撒克逊会计|INT|是||||
|ANNUAL_INVENTORY_DAY|日期|INT|是||||
|ANNUAL_INVENTORY_MONTH|年度库存月|VARCHAR|是|60|||
|ATTENDANCE_BARCODE_SOURCE|条码来源|VARCHAR|是|60|||
|ATTENDANCE_FROM_SYSTRAY|来自 Systray 的出席情况|INT|是||||
|ATTENDANCE_KIOSK_DELAY|自助考勤终端延迟|INT|是||||
|ATTENDANCE_KIOSK_KEY|自助考勤终端密钥|VARCHAR|是|500|||
|ATTENDANCE_KIOSK_MODE|考勤模式|VARCHAR|是|60|||
|ATTENDANCE_KIOSK_USE_PIN|员工PIN|INT|是||||
|ATTENDANCE_OVERTIME_VALIDATION|额外工时验证|VARCHAR|是|60|||
|AUTOPOST_BILLS|自动验证账单|INT|是||||
|AUTO_CHECK_OUT|自动签退|INT|是||||
|AUTO_CHECK_OUT_TOLERANCE|null|FLOAT|是||||
|BANK_ACCOUNT_CODE_PREFIX|Prefix of the bank accounts|VARCHAR|是|500|||
|BATCH_PAYMENT_SEQUENCE_ID|Batch Payment Sequence|VARCHAR|是|100|||
|CANDIDATE_PROPERTIES_DEFINITION|候选人属性|TEXT|是|1048576|||
|CASH_ACCOUNT_CODE_PREFIX|Prefix of the cash accounts|VARCHAR|是|500|||
|CHECK_ACCOUNT_AUDIT_TRAIL|审计跟踪|INT|是||||
|COMPANY_DETAILS|公司详情|TEXT|是|1048576|||
|CONTRACT_EXPIRATION_NOTICE_PERIOD|合同到期通知期|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_ID|币别|VARCHAR|是|100|||
|DAYS_TO_PURCHASE|采购前置天数|FLOAT|是||||
|DISPLAY_INVOICE_AMOUNT_TOTAL_WORDS|大写发票总额|INT|是||||
|DISPLAY_INVOICE_TAX_COMPANY_CURRENCY|税款以公司币别表示|INT|是||||
|EMAIL_PRIMARY_COLOR|电子邮件标题颜色|VARCHAR|是|500|||
|EMAIL_SECONDARY_COLOR|电子邮件按钮颜色|VARCHAR|是|500|||
|EMPLOYEE_PROPERTIES_DEFINITION|员工属性|TEXT|是|1048576|||
|EXPECTS_CHART_OF_ACCOUNTS|Expects a Chart of Accounts|INT|是||||
|FISCALYEAR_LAST_DAY|会计年度最后一天|INT|是||||
|FISCALYEAR_LAST_MONTH|会计年度最后一个月|VARCHAR|是|60|||
|FISCALYEAR_LOCK_DATE|全球锁定日期|DATETIME|是||||
|FONT|字体|VARCHAR|是|60|||
|HARD_LOCK_DATE|硬锁定日期|DATETIME|是||||
|HAS_RECEIVED_WARNING_STOCK_SMS|已收到库存警告短信息|INT|是||||
|HR_ATTENDANCE_DISPLAY_OVERTIME|显示额外时间|INT|是||||
|HR_PRESENCE_CONTROL_ATTENDANCE|根据出勤率|INT|是||||
|HR_PRESENCE_CONTROL_EMAIL|根据发送的电子邮件数量|INT|是||||
|HR_PRESENCE_CONTROL_EMAIL_AMOUNT|# 要发送的电子邮件|INT|是||||
|HR_PRESENCE_CONTROL_IP|基于IP地址|INT|是||||
|HR_PRESENCE_CONTROL_IP_LIST|有效的IP地址|VARCHAR|是|500|||
|HR_PRESENCE_CONTROL_LOGIN|基于系统中的用户状态|INT|是||||
|IAP_ENRICH_AUTO_DONE|丰富完成|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INVOICE_TERMS|Default Terms and Conditions|TEXT|是|1048576|||
|INVOICE_TERMS_HTML|Default Terms and Conditions as a Web page|TEXT|是|1048576|||
|JOB_PROPERTIES_DEFINITION|职位属性|TEXT|是|1048576|||
|LAYOUT_BACKGROUND|布局背景|VARCHAR|是|60|||
|MANUFACTURING_LEAD|制造提前期|FLOAT|是||||
|NAME|名称|VARCHAR|是|200|||
|OVERTIME_COMPANY_THRESHOLD|对公司有利的宽容时间|INT|是||||
|OVERTIME_EMPLOYEE_THRESHOLD|对员工有利的宽容时间|INT|是||||
|PARENT_ID|上级公司|VARCHAR|是|100|||
|PARENT_PATH|上级路径|VARCHAR|是|500|||
|PARTNER_ID|合作伙伴|VARCHAR|是|100|||
|PAYMENT_ONBOARDING_PAYMENT_METHOD|选择支付方式|VARCHAR|是|60|||
|PORTAL_CONFIRMATION_PAY|线上付款|INT|是||||
|PORTAL_CONFIRMATION_SIGN|线上签署|INT|是||||
|PO_DOUBLE_VALIDATION|批准等级|VARCHAR|是|60|||
|PO_DOUBLE_VALIDATION_AMOUNT|再次验证金额|DECIMAL|是||||
|PO_LEAD|采购提前期|FLOAT|是||||
|PO_LOCK|销售订单修改|VARCHAR|是|60|||
|PREPAYMENT_PERCENT|预付百分比|FLOAT|是||||
|PRIMARY_COLOR|原色|VARCHAR|是|500|||
|PURCHASE_LOCK_DATE|采购锁定日期|DATETIME|是||||
|QR_CODE|Display QR-code on invoices|INT|是||||
|QUICK_EDIT_MODE|快速编码|VARCHAR|是|60|||
|QUOTATION_VALIDITY_DAYS|默认报价有效期|INT|是||||
|REPORT_FOOTER|报告页脚|TEXT|是|1048576|||
|REPORT_HEADER|公司标语|TEXT|是|1048576|||
|RESOURCE_CALENDAR_ID|默认工作时间|VARCHAR|是|100|||
|SALE_LOCK_DATE|销售锁定日期|DATETIME|是||||
|SALE_ONBOARDING_PAYMENT_METHOD|销售入门选择的付款方式|VARCHAR|是|60|||
|SECONDARY_COLOR|次要颜色|VARCHAR|是|500|||
|SECURITY_LEAD|销售安全天数|FLOAT|是||||
|SEQUENCE|序列|INT|是||||
|SNAILMAIL_COLOR|实体邮寄颜色|INT|是||||
|SNAILMAIL_COVER|添加一个封面页|INT|是||||
|SNAILMAIL_DUPLEX|双面|INT|是||||
|SOCIAL_FACEBOOK|Facebook 账户|VARCHAR|是|500|||
|SOCIAL_GITHUB|GitHub账户|VARCHAR|是|500|||
|SOCIAL_INSTAGRAM|Instagram 账号|VARCHAR|是|500|||
|SOCIAL_LINKEDIN|领英账号|VARCHAR|是|500|||
|SOCIAL_TIKTOK|TikTok / 抖音账号|VARCHAR|是|500|||
|SOCIAL_TWITTER|X 账户|VARCHAR|是|500|||
|SOCIAL_YOUTUBE|Youtube账号|VARCHAR|是|500|||
|STOCK_MAIL_CONFIRMATION_TEMPLATE_ID|确认拣货邮件模版|VARCHAR|是|100|||
|STOCK_MOVE_EMAIL_VALIDATION|邮件确认拣货|INT|是||||
|STOCK_MOVE_SMS_VALIDATION|短信息确认|INT|是||||
|TAX_CALCULATION_ROUNDING_METHOD|Tax Calculation Rounding Method|VARCHAR|是|60|||
|TAX_EXIGIBILITY|采用现金收付|INT|是||||
|TAX_LOCK_DATE|纳税申报表锁定日期|DATETIME|是||||
|TERMS_TYPE|Terms & Conditions format|VARCHAR|是|60|||
|TRANSFER_ACCOUNT_CODE_PREFIX|Prefix of the transfer accounts|VARCHAR|是|500|||
|USES_DEFAULT_LOGO|使用默认徽标|INT|是||||
|WORK_PERMIT_EXPIRATION_NOTICE_PERIOD|工作许可证到期通知期|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 国家/地区(RES_COUNTRY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADDRESS_FORMAT|报表中的布局|TEXT|是|1048576|||
|CODE|国家/地区代码|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_ID|币别|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|NAME_POSITION|客户姓名 职位|VARCHAR|是|60|||
|PHONE_CODE|国家/地区长途区号|INT|是||||
|STATE_REQUIRED|省/州必填|INT|是||||
|VAT_LABEL|大桶标签|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|ZIP_REQUIRED|需要邮编|INT|是||||
#### 国家省/州(RES_COUNTRY_STATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CODE|省/州代码|VARCHAR|是|500|||
|COUNTRY_ID|国家/地区|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 币别(RES_CURRENCY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_SUBUNIT_LABEL|币别小组|VARCHAR|是|500|||
|CURRENCY_UNIT_LABEL|币别单位|VARCHAR|是|500|||
|DECIMAL_PLACES|小数位数|INT|是||||
|FULL_NAME|名称|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|ISO_NUMERIC|币别的数字代码。|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|POSITION|符号位置|VARCHAR|是|60|||
|ROUNDING|四舍五入系数|FLOAT|是||||
|SYMBOL|符号|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 权限组(RES_GROUPS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|API_KEY_DURATION|API 密钥最长有效期（天）|FLOAT|是||||
|CATEGORY_ID|应用|VARCHAR|是|100|||
|COLOR|颜色索引|INT|是||||
|COMMENT|评论|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RULE_GROUP_RELS|规则权限引用|TEXT|是|1048576|||
|SHARE|共享组|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 权限组继承(RES_GROUPS_IMPLIED_REL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|GID|权限组标识|VARCHAR|是|100|||
|HID|继承权限组标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
#### 权限组成员(RES_GROUPS_USERS_REL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|GID|标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|USER_ID|标识|VARCHAR|是|100|||
#### 联系人(RES_PARTNER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ADDITIONAL_INFO|附加信息|VARCHAR|是|500|||
|AUTOPOST_BILLS|Auto-post bills|VARCHAR|是|60|||
|BARCODE|条形码|VARCHAR|是|500|||
|BUYER_ID|采购员|VARCHAR|是|100|||
|CALENDAR_LAST_NOTIF_ACK|从基本日历中标记为已读的最后一条通知|DATETIME|是||||
|CITY|城市|VARCHAR|是|500|||
|COLOR|颜色索引|INT|是||||
|COMMENT|备注|TEXT|是|1048576|||
|COMMERCIAL_COMPANY_NAME|公司名称实体|VARCHAR|是|500|||
|COMMERCIAL_PARTNER_ID|商业实体|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|COMPANY_NAME|公司名称|VARCHAR|是|500|||
|COMPANY_REGISTRY|公司注册号|VARCHAR|是|500|||
|COMPLETE_NAME|全名|VARCHAR|是|500|||
|COUNTRY_ID|国家/地区|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CREDIT_LIMIT|信贷额度|FLOAT|是||||
|CUSTOMER_RANK|客户等级|INT|是||||
|DEBIT_LIMIT|应付账款限额|DECIMAL|是||||
|EMAIL|邮箱|VARCHAR|是|500|||
|EMAIL_NORMALIZED|规范化邮件|VARCHAR|是|500|||
|EMPLOYEE|员工|INT|是||||
|FUNCTION|工作职位|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IGNORE_ABNORMAL_INVOICE_AMOUNT|Ignore Abnormal Invoice Amount|INT|是||||
|IGNORE_ABNORMAL_INVOICE_DATE|Ignore Abnormal Invoice Date|INT|是||||
|INDUSTRY_ID|行业|VARCHAR|是|100|||
|INVOICE_EDI_FORMAT_STORE|发票 EDI 格式商店|VARCHAR|是|500|||
|INVOICE_SENDING_METHOD|传送发票|VARCHAR|是|60|||
|INVOICE_WARN|发票|VARCHAR|是|60|||
|INVOICE_WARN_MSG|发票消息|TEXT|是|1048576|||
|IS_COMPANY|是公司|INT|是||||
|MESSAGE_BOUNCE|退回|INT|是||||
|MOBILE|手机|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|PARENT_ID|相关公司|VARCHAR|是|100|||
|PARTNER_GID|公司数据库ID|INT|是||||
|PARTNER_LATITUDE|地理纬度|FLOAT|是||||
|PARTNER_LONGITUDE|地理经度|FLOAT|是||||
|PARTNER_SHARE|共享合作伙伴|INT|是||||
|PEPPOL_EAS|Peppol电子地址（EAS）|VARCHAR|是|60|||
|PEPPOL_ENDPOINT|Peppol Endpoint|VARCHAR|是|500|||
|PHONE|电话|VARCHAR|是|500|||
|PHONE_SANITIZED|净化数量|VARCHAR|是|500|||
|PICKING_WARN|库存拣货|VARCHAR|是|60|||
|PICKING_WARN_MSG|库存拣货单消息|TEXT|是|1048576|||
|PLAN_TO_CHANGE_BIKE|计划更换自行车|INT|是||||
|PLAN_TO_CHANGE_CAR|更换车辆计划|INT|是||||
|PROPERTY_PURCHASE_CURRENCY_ID|供应商币别|VARCHAR|是|100|||
|PURCHASE_WARN|采购订单预警|VARCHAR|是|60|||
|PURCHASE_WARN_MSG|采购订单消息|TEXT|是|1048576|||
|RECEIPT_REMINDER_EMAIL|收货提醒|INT|是||||
|REF|参考|VARCHAR|是|500|||
|REMINDER_DATE_BEFORE_RECEIPT|收货前几天|INT|是||||
|SALE_WARN|销售警告信息|VARCHAR|是|60|||
|SALE_WARN_MSG|销售订单消息|TEXT|是|1048576|||
|SIGNUP_TYPE|注册令牌（Token）类型|VARCHAR|是|500|||
|STATE_ID|省/州|VARCHAR|是|100|||
|STREET|街道|VARCHAR|是|500|||
|STREET2|详细地址|VARCHAR|是|500|||
|SUPPLIER_RANK|供应商排名|INT|是||||
|TRUST|Degree of trust you have in this debtor|VARCHAR|是|60|||
|TYPE|地址类型|VARCHAR|是|60|||
|TZ|时区|VARCHAR|是|60|||
|USER_ID|业务员|VARCHAR|是|100|||
|VAT|税号ID|VARCHAR|是|500|||
|WEBSITE|网站链接|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
|ZIP|邮编|VARCHAR|是|500|||
#### 银行账号(RES_PARTNER_BANK)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ABA_ROUTING|null|VARCHAR|是|500|||
|ACC_HOLDER_NAME|账户持有人姓名|VARCHAR|是|500|||
|ACC_NUMBER|账户编号|VARCHAR|是|500|||
|ACTIVE|有效|INT|是||||
|ALLOW_OUT_PAYMENT|转出资金|INT|是||||
|BANK_ID|银行|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENCY_ID|币别|VARCHAR|是|100|||
|HAS_IBAN_WARNING|有Iban警告消息|INT|是||||
|HAS_MONEY_TRANSFER_WARNING|有资金转账警告消息|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PARTNER_ID|账户持有者|VARCHAR|是|100|||
|SANITIZED_ACC_NUMBER|消毒账号|VARCHAR|是|500|||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 行业(RES_PARTNER_INDUSTRY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|FULL_NAME|全名|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 用户(RES_USERS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|姓名|VARCHAR|是|200|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|KARMA|贡献值|INT|是||||
|LOGIN|登录|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|NOTIFICATION_TYPE|通知|VARCHAR|是|60|||
|ODOOBOT_FAILED|Odoobot 挂了|INT|是||||
|ODOOBOT_STATE|小秘书状态|VARCHAR|是|60|||
|PARTNER_ID|相关合作伙伴|VARCHAR|是|100|||
|PASSWORD|密码|VARCHAR|是|500|||
|SALE_TEAM_ID|用户销售团队|VARCHAR|是|100|||
|SHARE|共享用户|INT|是||||
|SIGNATURE|电子邮件签名|TEXT|是|1048576|||
|TARGET_SALES_DONE|活动完成目标|INT|是||||
|TARGET_SALES_INVOICED|销售订单目标结算单|INT|是||||
|TARGET_SALES_WON|商机赢得目标|INT|是||||
|TOUR_ENABLED|新手入门|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 权限组关联规则(RULE_GROUP_REL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|DOMAIN_FORCE|域名|TEXT|是|1048576|||
|GID|标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MODEL_ID|模型|VARCHAR|是|200|||
|NAME|名称|VARCHAR|是|200|||
|PERM_CREATE|创建|INT|是||||
|PERM_READ|读取|INT|是||||
|PERM_UNLINK|删除|INT|是||||
|PERM_WRITE|写入|INT|是||||
|RULE_ID|标识|VARCHAR|是|100|||
#### 权限组关联统一资源(UNIRES_GROUP_REL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|GID|标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|UNIRES_ID|标识|VARCHAR|是|100|||






