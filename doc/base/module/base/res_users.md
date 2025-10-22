# 用户(res_users)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|# 访问权限|ACCESSES_COUNT|整型||是||
|有效|ACTIVE|是否逻辑||是||
|有效语言数量|ACTIVE_LANG_COUNT|外键值附加数据||是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|外键值附加数据||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[外键值附加数据](index/dictionary_index#res_partner_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|外键值附加数据|500|是||
|活动状态|ACTIVITY_STATE|[外键值附加数据](index/dictionary_index#res_partner_activity_state "活动状态")|200|是||
|附加信息|ADDITIONAL_INFO|外键值附加数据|500|是||
|Auto-post bills|AUTOPOST_BILLS|[外键值附加数据](index/dictionary_index#res_partner_autopost_bills "Auto-post bills")|60|是||
|头像|AVATAR|继承属性|500|是||
|头像1024|AVATAR_1024|继承属性|500|是||
|头像128|AVATAR_128|继承属性|500|是||
|头像256|AVATAR_256|继承属性|500|是||
|头像512|AVATAR_512|继承属性|500|是||
|银行|BANK_ACCOUNT_COUNT|外键值附加数据||是||
|条形码|BARCODE|外键值附加数据|500|是||
|青铜徽标数目|BRONZE_BADGE|整型||是||
|采购员|BUYER_ID|外键值附加数据|100|是||
|日历默认隐私|CALENDAR_DEFAULT_PRIVACY|[单项选择(文本值)](index/dictionary_index#res_users_calendar_default_privacy "日历默认隐私")|200|是||
|从基本日历中标记为已读的最后一条通知|CALENDAR_LAST_NOTIF_ACK|外键值附加数据||是||
|能编辑|CAN_EDIT|是否逻辑||是||
|公司认证数|CERTIFICATIONS_COMPANY_COUNT|外键值附加数据||是||
|认证计算|CERTIFICATIONS_COUNT|外键值附加数据||是||
|城市|CITY|外键值附加数据|500|是||
|颜色索引|COLOR|外键值附加数据||是||
|备注|COMMENT|外键值附加数据|1048576|是||
|公司名称实体|COMMERCIAL_COMPANY_NAME|外键值附加数据|500|是||
|商业实体|COMMERCIAL_PARTNER_ID|外键值附加数据|100|是||
|公司数目|COMPANIES_COUNT|整型||是||
|公司|COMPANY_ID|外键值|100|否||
|公司名称|COMPANY_NAME|外键值文本|500|是||
|公司注册号|COMPANY_REGISTRY|外键值附加数据|500|是||
|公司 ID 标签|COMPANY_REGISTRY_LABEL|外键值附加数据|500|是||
|公司类型|COMPANY_TYPE|[外键值附加数据](index/dictionary_index#res_partner_company_type "公司类型")|200|是||
|全名|COMPLETE_NAME|外键值附加数据|500|是||
|完整地址|CONTACT_ADDRESS|外键值附加数据|500|是||
|内嵌完整地址|CONTACT_ADDRESS_INLINE|外键值附加数据|500|是||
|国家/地区|COUNTRY_ID|外键值附加数据|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|技术领域，是否创建员工|CREATE_EMPLOYEE|是否逻辑||是||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|应收账款总计|CREDIT|外键值附加数据||是||
|信贷额度|CREDIT_LIMIT|外键值附加数据||是||
|贷记入发票|CREDIT_TO_INVOICE|外键值附加数据||是||
|客户等级|CUSTOMER_RANK|外键值附加数据||是||
|销售变现天数（DSO）|DAYS_SALES_OUTSTANDING|外键值附加数据||是||
|应付账款总计|DEBIT|外键值附加数据||是||
|应付账款限额|DEBIT_LIMIT|外键值附加数据||是||
|显示发票 Edi 格式|DISPLAY_INVOICE_EDI_FORMAT|外键值附加数据||是||
|Display Invoice Template Pdf Report|DISPLAY_INVOICE_TEMPLATE_PDF_REPORT_ID|外键值附加数据||是||
|姓名|DISPLAY_NAME|文本，可指定长度|200|是||
|Duplicated Bank Account Partners Count|DUPLICATED_BANK_ACCOUNT_PARTNERS_COUNT|外键值附加数据||是||
|邮箱|EMAIL|外键值附加数据|500|是||
|格式化邮件|EMAIL_FORMATTED|外键值附加数据|500|是||
|规范化邮件|EMAIL_NORMALIZED|外键值附加数据|500|是||
|员工|EMPLOYEE|外键值附加数据||是||
|员工数量|EMPLOYEES_COUNT|外键值附加数据||是||
|员工人数|EMPLOYEE_COUNT|整型||是||
|会计所在国家/地区代码|FISCAL_COUNTRY_CODES|外键值附加数据|500|是||
|工作职位|FUNCTION|外键值附加数据|500|是||
|金质徽标数量|GOLD_BADGE|整型||是||
|# 分组|GROUPS_COUNT|整型||是||
|有消息|HAS_MESSAGE|外键值附加数据||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|Ignore Abnormal Invoice Amount|IGNORE_ABNORMAL_INVOICE_AMOUNT|外键值附加数据||是||
|Ignore Abnormal Invoice Date|IGNORE_ABNORMAL_INVOICE_DATE|外键值附加数据||是||
|头像|IMAGE|继承属性|500|是||
|图片1024|IMAGE_1024|继承属性|500|是||
|图片128|IMAGE_128|继承属性|500|是||
|图片256|IMAGE_256|继承属性|500|是||
|图片512|IMAGE_512|继承属性|500|是||
|IM的状态|IM_STATUS|文本，可指定长度|500|是||
|行业|INDUSTRY_ID|外键值附加数据|100|是||
|电子发票格式|INVOICE_EDI_FORMAT|[外键值附加数据](index/dictionary_index#res_partner_invoice_edi_format "电子发票格式")|200|是||
|发票 EDI 格式商店|INVOICE_EDI_FORMAT_STORE|外键值附加数据|500|是||
|传送发票|INVOICE_SENDING_METHOD|[外键值附加数据](index/dictionary_index#res_partner_invoice_sending_method "传送发票")|60|是||
|发票|INVOICE_WARN|[外键值附加数据](index/dictionary_index#res_partner_invoice_warn "发票")|60|是||
|发票消息|INVOICE_WARN_MSG|外键值附加数据|1048576|是||
|黑名单|IS_BLACKLISTED|外键值附加数据||是||
|Is Coa Installed|IS_COA_INSTALLED|外键值附加数据||是||
|是公司|IS_COMPANY|外键值附加数据||是||
|是 Peppol Edi 格式|IS_PEPPOL_EDI_FORMAT|外键值附加数据||是||
|是公共|IS_PUBLIC|外键值附加数据||是||
|是系统|IS_SYSTEM|是否逻辑||是||
|是 Ubl 格式|IS_UBL_FORMAT|外键值附加数据||是||
|日记账项目|JOURNAL_ITEM_COUNT|外键值附加数据||是||
|贡献值|KARMA|整型||是||
|登录|LOGIN|文本，可指定长度|500|否||
|# 会议|MEETING_COUNT|外键值附加数据||是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|外键值附加数据||是||
|退回|MESSAGE_BOUNCE|外键值附加数据||是||
|消息发送错误|MESSAGE_HAS_ERROR|外键值附加数据||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|外键值附加数据||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|外键值附加数据||是||
|是关注者|MESSAGE_IS_FOLLOWER|外键值附加数据||是||
|待处理|MESSAGE_NEEDACTION|外键值附加数据||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|外键值附加数据||是||
|手机|MOBILE|外键值附加数据|500|是||
|列入黑名单的手机是移动的|MOBILE_BLACKLISTED|外键值附加数据||是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|外键值附加数据||是||
|名称|NAME|外键值附加数据|200|是||
|设置密码|NEW_PASSWORD|文本，可指定长度|500|是||
|通知|NOTIFICATION_TYPE|[单项选择(文本值)](index/dictionary_index#res_users_notification_type "通知")|60|否||
|Odoobot 挂了|ODOOBOT_FAILED|是否逻辑||是||
|小秘书状态|ODOOBOT_STATE|[单项选择(文本值)](index/dictionary_index#res_users_odoobot_state "小秘书状态")|60|是||
|准时交货率|ON_TIME_RATE|外键值附加数据||是||
|商机数量|OPPORTUNITY_COUNT|外键值附加数据||是||
|相关公司|PARENT_ID|外键值附加数据|100|是||
|合作伙伴公司注册处占位符|PARTNER_COMPANY_REGISTRY_PLACEHOLDER|外键值附加数据|500|是||
|公司数据库ID|PARTNER_GID|外键值附加数据||是||
|相关合作伙伴|PARTNER_ID|外键值|100|否||
|地理纬度|PARTNER_LATITUDE|外键值附加数据||是||
|地理经度|PARTNER_LONGITUDE|外键值附加数据||是||
|相关合作伙伴|PARTNER_NAME|外键值文本|200|否||
|共享合作伙伴|PARTNER_SHARE|外键值附加数据||是||
|Partner Vat Placeholder|PARTNER_VAT_PLACEHOLDER|外键值附加数据|500|是||
|密码|PASSWORD|文本，可指定长度|500|是||
|支付令牌计数|PAYMENT_TOKEN_COUNT|外键值附加数据||是||
|Peppol电子地址（EAS）|PEPPOL_EAS|[外键值附加数据](index/dictionary_index#res_partner_peppol_eas "Peppol电子地址（EAS）")|60|是||
|Peppol Endpoint|PEPPOL_ENDPOINT|外键值附加数据|500|是||
|电话|PHONE|外键值附加数据|500|是||
|列入黑名单的电话是电话|PHONE_BLACKLISTED|外键值附加数据||是||
|电话/手机|PHONE_MOBILE_SEARCH|外键值附加数据|500|是||
|净化数量|PHONE_SANITIZED|外键值附加数据|500|是||
|电话加黑|PHONE_SANITIZED_BLACKLISTED|外键值附加数据||是||
|库存拣货|PICKING_WARN|[外键值附加数据](index/dictionary_index#res_partner_picking_warn "库存拣货")|60|是||
|库存拣货单消息|PICKING_WARN_MSG|外键值附加数据|1048576|是||
|计划更换自行车|PLAN_TO_CHANGE_BIKE|外键值附加数据||是||
|更换车辆计划|PLAN_TO_CHANGE_CAR|外键值附加数据||是||
|供应商币别|PROPERTY_PURCHASE_CURRENCY_ID|外键值附加数据|100|是||
|采购订单数|PURCHASE_ORDER_COUNT|外键值附加数据||是||
|采购订单预警|PURCHASE_WARN|[外键值附加数据](index/dictionary_index#res_partner_purchase_warn "采购订单预警")|60|是||
|采购订单消息|PURCHASE_WARN_MSG|外键值附加数据|1048576|是||
|收货提醒|RECEIPT_REMINDER_EMAIL|外键值附加数据||是||
|参考|REF|外键值附加数据|500|是||
|收货前几天|REMINDER_DATE_BEFORE_RECEIPT|外键值附加数据||是||
|要求加班|REQUEST_OVERTIME|是否逻辑||是||
|# 记录规则|RULES_COUNT|整型||是||
|销售订单计数|SALE_ORDER_COUNT|外键值附加数据||是||
|用户销售团队|SALE_TEAM_ID|外键值|100|是||
|销售警告信息|SALE_WARN|[外键值附加数据](index/dictionary_index#res_partner_sale_warn "销售警告信息")|60|是||
|销售订单消息|SALE_WARN_MSG|外键值附加数据|1048576|是||
|共享用户|SHARE|是否逻辑||是||
|显示信用额度|SHOW_CREDIT_LIMIT|外键值附加数据||是||
|电子邮件签名|SIGNATURE|HTML文本，没有长度限制|1048576|是||
|注册令牌（Token）类型|SIGNUP_TYPE|外键值附加数据|500|是||
|银质徽标数量|SILVER_BADGE|整型||是||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#res_users_state "状态")|200|是||
|省/州|STATE_ID|外键值附加数据|100|是||
|街道|STREET|外键值附加数据|500|是||
|详细地址|STREET2|外键值附加数据|500|是||
|＃供应商账单|SUPPLIER_INVOICE_COUNT|外键值附加数据||是||
|供应商排名|SUPPLIER_RANK|外键值附加数据||是||
|活动完成目标|TARGET_SALES_DONE|整型||是||
|销售订单目标结算单|TARGET_SALES_INVOICED|整型||是||
|商机赢得目标|TARGET_SALES_WON|整型||是||
|null|TASK_COUNT|外键值附加数据||是||
|已开票总计|TOTAL_INVOICED|外键值附加数据||是||
|双重身份验证|TOTP_ENABLED|是否逻辑||是||
|Totp密匙|TOTP_SECRET|文本，可指定长度|500|是||
|新手入门|TOUR_ENABLED|是否逻辑||是||
|Degree of trust you have in this debtor|TRUST|[外键值附加数据](index/dictionary_index#res_partner_trust "Degree of trust you have in this debtor")|60|是||
|地址类型|TYPE|[外键值附加数据](index/dictionary_index#res_partner_type "地址类型")|60|是||
|时区|TZ|[外键值附加数据](index/dictionary_index#res_partner_tz "时区")|60|是||
|时区偏移|TZ_OFFSET|文本，可指定长度|500|是||
|用户组警告|USER_GROUP_WARNING|长文本，没有长度限制|1048576|是||
|业务员|USER_ID|外键值附加数据|100|是||
|合作伙伴限制|USE_PARTNER_CREDIT_LIMIT|外键值附加数据||是||
|税号ID|VAT|外键值附加数据|500|是||
|税务 ID 标签|VAT_LABEL|外键值附加数据|500|是||
|网站链接|WEBSITE|外键值附加数据|500|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||
|邮编|ZIP|外键值附加数据|500|是||


###### 属性组

<el-row>
<el-tabs v-model="show_field_group">

<el-tab-pane label="默认属性组" name="field_group_Simple">

|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|登录|LOGIN|文本，可指定长度|500|否||
|名称|NAME|外键值附加数据|200|是||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#res_users_state "状态")|200|是||
|头像|AVATAR|继承属性|500|是||
|头像|IMAGE|继承属性|500|是||

</el-tab-pane>
<el-tab-pane label="计数属性组" name="field_group_counter">

|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|# 访问权限|ACCESSES_COUNT|整型||是||
|# 分组|GROUPS_COUNT|整型||是||
|# 记录规则|RULES_COUNT|整型||是||

</el-tab-pane>

</el-tabs>
</el-row>

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_CRM_TEAM_RES_USERS_USER_ID](der/DER1N_CRM_TEAM_RES_USERS_USER_ID)|[销售团队(CRM_TEAM)](module/crm/crm_team)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RES_USERS_LEAVE_MANAGER_ID](der/DER1N_HR_EMPLOYEE_BASE_RES_USERS_LEAVE_MANAGER_ID)|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RES_USERS_USER_ID](der/DER1N_HR_EMPLOYEE_BASE_RES_USERS_USER_ID)|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_USERS_ATTENDANCE_MANAGER_ID](der/DER1N_HR_EMPLOYEE_RES_USERS_ATTENDANCE_MANAGER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_USERS_EXPENSE_MANAGER_ID](der/DER1N_HR_EMPLOYEE_RES_USERS_EXPENSE_MANAGER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_USERS_LEAVE_MANAGER_ID](der/DER1N_HR_EMPLOYEE_RES_USERS_LEAVE_MANAGER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_USERS_USER_ID](der/DER1N_HR_EMPLOYEE_RES_USERS_USER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_JOB_RES_USERS_USER_ID](der/DER1N_HR_JOB_RES_USERS_USER_ID)|[工作岗位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_IR_DEFAULT_RES_USERS_USER_ID](der/DER1N_IR_DEFAULT_RES_USERS_USER_ID)|[默认值(IR_DEFAULT)](module/base/ir_default)|1:N关系||
|[DER1N_MAIL_ACTIVITY_PLAN_TEMPLATE_RES_USERS_RESPONSIBLE_ID](der/DER1N_MAIL_ACTIVITY_PLAN_TEMPLATE_RES_USERS_RESPONSIBLE_ID)|[活动计划模板(MAIL_ACTIVITY_PLAN_TEMPLATE)](module/mail/mail_activity_plan_template)|1:N关系||
|[DER1N_MAIL_ACTIVITY_RES_USERS_USER_ID](der/DER1N_MAIL_ACTIVITY_RES_USERS_USER_ID)|[活动(MAIL_ACTIVITY)](module/mail/mail_activity)|1:N关系||
|[DER1N_MAIL_ACTIVITY_SCHEDULE_RES_USERS_ACTIVITY_USER_ID](der/DER1N_MAIL_ACTIVITY_SCHEDULE_RES_USERS_ACTIVITY_USER_ID)|[活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule)|1:N关系||
|[DER1N_MAIL_ACTIVITY_SCHEDULE_RES_USERS_PLAN_ON_DEMAND_USER_ID](der/DER1N_MAIL_ACTIVITY_SCHEDULE_RES_USERS_PLAN_ON_DEMAND_USER_ID)|[活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule)|1:N关系||
|[DER1N_MAIL_ACTIVITY_TYPE_RES_USERS_DEFAULT_USER_ID](der/DER1N_MAIL_ACTIVITY_TYPE_RES_USERS_DEFAULT_USER_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_MAIL_TEMPLATE_RES_USERS_USER_ID](der/DER1N_MAIL_TEMPLATE_RES_USERS_USER_ID)|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)|1:N关系||
|[DER1N_RESOURCE_RESOURCE_RES_USERS_USER_ID](der/DER1N_RESOURCE_RESOURCE_RES_USERS_USER_ID)|[资源(RESOURCE_RESOURCE)](module/resource/resource_resource)|1:N关系||
|[DER1N_RES_GROUPS_USERS_REL_RES_USERS_USER_ID](der/DER1N_RES_GROUPS_USERS_REL_RES_USERS_USER_ID)|[权限组成员(RES_GROUPS_USERS_REL)](module/base/res_groups_users_rel)|1:N关系||
|[DER1N_RES_PARTNER_RES_USERS_BUYER_ID](der/DER1N_RES_PARTNER_RES_USERS_BUYER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_RES_PARTNER_RES_USERS_USER_ID](der/DER1N_RES_PARTNER_RES_USERS_USER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RES_USERS_CRM_TEAM_SALE_TEAM_ID](der/DER1N_RES_USERS_CRM_TEAM_SALE_TEAM_ID)|[销售团队(CRM_TEAM)](module/crm/crm_team)|1:N关系||
|[DER1N_RES_USERS_RES_COMPANY_COMPANY_ID](der/DER1N_RES_USERS_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_USERS_RES_PARTNER_PARTNER_ID](der/DER1N_RES_USERS_RES_PARTNER_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DERCUSTOM_RES_USERS_CLOUD_PROXY_USER](der/DERCUSTOM_RES_USERS_CLOUD_PROXY_USER)|[cloud用户代理(CLOUD_PROXY_USER)](module/cloud_proxy/cloud_proxy_user)|自定义关系||
|[DERMULINH_RES_USERS_AVATAR_MIXIN](der/DERMULINH_RES_USERS_AVATAR_MIXIN)|[头像混合(AVATAR_MIXIN)](module/base/avatar_mixin)|多继承关系（虚拟实体）||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#res_users_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持|[附加操作](index/action_logic_index#res_users_Remove)|||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#res_users_Update)|||
|修改密码|change_password|[实体处理逻辑](module/base/res_users/logic/change_password "修改密码")|默认|不支持|[附加操作](index/action_logic_index#res_users_change_password)|||
|当前登录人的user|current_user|[实体处理逻辑](module/base/res_users/logic/current_user "当前登录人的user")|默认|不支持||||
|用户计数器|user_counter|脚本代码|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[cloud用户同步](module/base/res_users/logic/sync_cloud_user)|sync_cloud_user|无|||
|[修改cloud用户密码](module/base/res_users/logic/change_cloud_user_pwd)|change_cloud_user_pwd|无|||
|[修改密码](module/base/res_users/logic/change_password)|change_password|无|||
|[准备建立](module/base/res_users/logic/prepare_create)|prepare_create|无|||
|[当前登录人的user](module/base/res_users/logic/current_user)|current_user|无||根据srfpartnerid获取user信息|
|[禁用cloud用户](module/base/res_users/logic/invalid_cloud_user)|invalid_cloud_user|无|||
|[计算状态](module/base/res_users/logic/compute_state)|compute_state|属性逻辑|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/res_users/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/res_users/query/View)|VIEW|否|否 |否 ||
|[简单查询(simple)](module/base/res_users/query/simple)|simple|否|否 |否 ||
|[未被使用的用户(unuse)](module/base/res_users/query/unuse)|unuse|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/res_users/dataset/Default)|DEFAULT|数据查询|是|||
|[简单查询(simple)](module/base/res_users/dataset/simple)|simple|数据查询|否|||
|[未被使用的用户(unuse)](module/base/res_users/dataset/unuse)|unuse|数据查询|否|||

## 数据权限

##### res_user_current :id=res_users-res_user_current

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('partner_id','=',#{srf.sessioncontext.srfpartnerid})]`

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `READ`



##### res_users_all :id=res_users-res_users_all

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### test :id=res_users-test

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('partner_id','!=',#{srf.sessioncontext.srfpartnerid})]`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CALENDAR_DEFAULT_PRIVACY_EQ|日历默认隐私|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_NOTIFICATION_TYPE_EQ|通知|EQ||
|N_ODOOBOT_STATE_EQ|小秘书状态|EQ||
|N_PARTNER_ID_EQ|相关合作伙伴|EQ||
|N_PARTNER_NAME_EQ|相关合作伙伴|EQ||
|N_PARTNER_NAME_LIKE|相关合作伙伴|LIKE||
|N_SALE_TEAM_ID_EQ|用户销售团队|EQ||
|N_SHARE_EQ|共享用户|EQ||
|N_STATE_EQ|状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 主题设置 | theme_setting | 主题设置 |无数据|用户自定义||
| 修改密码（表单） | chang_pas | 确认 |无数据|用户自定义||
| 打开密码修改视图 | open_chg_pwd_view | 修改密码 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[修改密码](app/view/res_userschg_pwd_view)</details>||
| 打开用户个人信息界面 | open_personal_info | 我的设置 |无数据|<details><summary>打开视图或向导（模态）</summary>[用户](app/view/res_userspersonal_view)</details>||
| 打开用户创建页面 | open_user_create_view | 用户详情 |无数据|<details><summary>打开视图或向导（模态）</summary>[创建用户](app/view/res_userscreate_user_view)</details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[修改密码（表单）](module/base/res_users/uilogic/change_pas)|change_pas|修改密码|

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_users?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_users?id=界面逻辑`">
  界面逻辑
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