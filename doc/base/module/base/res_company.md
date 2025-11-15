# 公司(res_company)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|缺勤管理|ABSENCE_MANAGEMENT|是否逻辑||是||
|会计所在国家/地区|ACCOUNT_FISCAL_COUNTRY_ID|外键值|100|是||
|期初分录|ACCOUNT_OPENING_DATE|日期型||是||
|Default Sales Price Include|ACCOUNT_PRICE_INCLUDE|[单项选择(文本值)](index/dictionary_index#res_company_account_price_include "Default Sales Price Include")|60|是||
|Storno会计应用程序|ACCOUNT_STORNO|是否逻辑||是||
|销售信用额度|ACCOUNT_USE_CREDIT_LIMIT|是否逻辑||是||
|有效|ACTIVE|是否逻辑||是||
|活动集合|ACTIVITIES|继承属性|1048576|是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|继承属性||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[继承属性](index/dictionary_index#mail_activity_mixin_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|继承属性|500|是||
|活动状态|ACTIVITY_STATE|[继承属性](index/dictionary_index#mail_activity_mixin_activity_state "活动状态")|200|是||
|电子邮件域名|ALIAS_DOMAIN_ID|外键值|100|是||
|使用盎格鲁撒克逊会计|ANGLO_SAXON_ACCOUNTING|是否逻辑||是||
|日期|ANNUAL_INVENTORY_DAY|整型||是||
|年度库存月|ANNUAL_INVENTORY_MONTH|[单项选择(文本值)](index/dictionary_index#res_company_annual_inventory_month "年度库存月")|60|是||
|附件集合|ATTACHMENTS|继承属性|1048576|是||
|条码来源|ATTENDANCE_BARCODE_SOURCE|[单项选择(文本值)](index/dictionary_index#res_company_attendance_barcode_source "条码来源")|60|是||
|来自 Systray 的出席情况|ATTENDANCE_FROM_SYSTRAY|是否逻辑||是||
|自助考勤终端延迟|ATTENDANCE_KIOSK_DELAY|整型||是||
|自助考勤终端密钥|ATTENDANCE_KIOSK_KEY|文本，可指定长度|500|是||
|考勤模式|ATTENDANCE_KIOSK_MODE|[单项选择(文本值)](index/dictionary_index#res_company_attendance_kiosk_mode "考勤模式")|60|是||
|自助考勤终端网址|ATTENDANCE_KIOSK_URL|文本，可指定长度|500|是||
|员工PIN|ATTENDANCE_KIOSK_USE_PIN|是否逻辑||是||
|额外工时验证|ATTENDANCE_OVERTIME_VALIDATION|[单项选择(文本值)](index/dictionary_index#res_company_attendance_overtime_validation "额外工时验证")|60|是||
|自动验证账单|AUTOPOST_BILLS|是否逻辑||是||
|自动签退|AUTO_CHECK_OUT|是否逻辑||是||
|null|AUTO_CHECK_OUT_TOLERANCE|浮点||是||
|Prefix of the bank accounts|BANK_ACCOUNT_CODE_PREFIX|文本，可指定长度|500|是||
|Batch Payment Sequence|BATCH_PAYMENT_SEQUENCE_ID|外键值|100|是||
|退件电子邮件|BOUNCE_EMAIL|文本，可指定长度|500|是||
|退回|BOUNCE_FORMATTED|文本，可指定长度|500|是||
|候选人属性|CANDIDATE_PROPERTIES_DEFINITION|长文本，没有长度限制|1048576|是||
|Prefix of the cash accounts|CASH_ACCOUNT_CODE_PREFIX|文本，可指定长度|500|是||
|预设邮件|CATCHALL_EMAIL|文本，可指定长度|500|是||
|预设|CATCHALL_FORMATTED|文本，可指定长度|500|是||
|审计跟踪|CHECK_ACCOUNT_AUDIT_TRAIL|是否逻辑||是||
|城市|CITY|文本，可指定长度|500|是||
|颜色|COLOR|整型||是||
|公司详情|COMPANY_DETAILS|HTML文本，没有长度限制|1048576|是||
|公司注册处占位符|COMPANY_REGISTRY_PLACEHOLDER|文本，可指定长度|500|是||
|公司增值税占位符|COMPANY_VAT_PLACEHOLDER|文本，可指定长度|500|是||
|合同到期通知期|CONTRACT_EXPIRATION_NOTICE_PERIOD|整型||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|币别|CURRENCY_ID|外键值|100|是||
|币别|CURRENCY_NAME|外键值文本|200|是||
|采购前置天数|DAYS_TO_PURCHASE|浮点||是||
|大写发票总额|DISPLAY_INVOICE_AMOUNT_TOTAL_WORDS|是否逻辑||是||
|税款以公司币别表示|DISPLAY_INVOICE_TAX_COMPANY_CURRENCY|是否逻辑||是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|格式化的邮件|EMAIL_FORMATTED|文本，可指定长度|500|是||
|电子邮件标题颜色|EMAIL_PRIMARY_COLOR|文本，可指定长度|500|是||
|电子邮件按钮颜色|EMAIL_SECONDARY_COLOR|文本，可指定长度|500|是||
|员工属性|EMPLOYEE_PROPERTIES_DEFINITION|长文本，没有长度限制|1048576|是||
|Expects a Chart of Accounts|EXPECTS_CHART_OF_ACCOUNTS|是否逻辑||是||
|会计年度最后一天|FISCALYEAR_LAST_DAY|整型||是||
|会计年度最后一个月|FISCALYEAR_LAST_MONTH|[单项选择(文本值)](index/dictionary_index#res_company_fiscalyear_last_month "会计年度最后一个月")|60|是||
|全球锁定日期|FISCALYEAR_LOCK_DATE|日期型||是||
|关注者|FOLLOWERS|继承属性|1048576|是||
|字体|FONT|[单项选择(文本值)](index/dictionary_index#res_company_font "字体")|60|是||
|硬锁定日期|HARD_LOCK_DATE|日期型||是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|已收到库存警告短信息|HAS_RECEIVED_WARNING_STOCK_SMS|是否逻辑||是||
|显示额外时间|HR_ATTENDANCE_DISPLAY_OVERTIME|是否逻辑||是||
|根据出勤率|HR_PRESENCE_CONTROL_ATTENDANCE|是否逻辑||是||
|根据发送的电子邮件数量|HR_PRESENCE_CONTROL_EMAIL|是否逻辑||是||
|# 要发送的电子邮件|HR_PRESENCE_CONTROL_EMAIL_AMOUNT|整型||是||
|基于IP地址|HR_PRESENCE_CONTROL_IP|是否逻辑||是||
|有效的IP地址|HR_PRESENCE_CONTROL_IP_LIST|文本，可指定长度|500|是||
|基于系统中的用户状态|HR_PRESENCE_CONTROL_LOGIN|是否逻辑||是||
|丰富完成|IAP_ENRICH_AUTO_DONE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|Default Terms and Conditions|INVOICE_TERMS|HTML文本，没有长度限制|1048576|是||
|Default Terms and Conditions as a Web page|INVOICE_TERMS_HTML|HTML文本，没有长度限制|1048576|是||
|公司详细信息是否为空|IS_COMPANY_DETAILS_EMPTY|是否逻辑||是||
|职位属性|JOB_PROPERTIES_DEFINITION|长文本，没有长度限制|1048576|是||
|布局背景|LAYOUT_BACKGROUND|[单项选择(文本值)](index/dictionary_index#res_company_layout_background "布局背景")|60|是||
|制造提前期|MANUFACTURING_LEAD|浮点||是||
|Attachment Count|MESSAGE_ATTACHMENT_COUNT|整型||是||
|Message Delivery error|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|待处理|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|继承属性||是||
|名称|NAME|文本，可指定长度|200|是||
|对公司有利的宽容时间|OVERTIME_COMPANY_THRESHOLD|整型||是||
|对员工有利的宽容时间|OVERTIME_EMPLOYEE_THRESHOLD|整型||是||
|上级公司|PARENT_ID|外键值|100|是||
|上级公司|PARENT_NAME|外键值文本|200|是||
|上级路径|PARENT_PATH|文本，可指定长度|500|是||
|合作伙伴|PARTNER_ID|外键值|100|是||
|合作伙伴|PARTNER_NAME|外键值文本|200|是||
|选择支付方式|PAYMENT_ONBOARDING_PAYMENT_METHOD|[单项选择(文本值)](index/dictionary_index#res_company_payment_onboarding_payment_method "选择支付方式")|60|是||
|线上付款|PORTAL_CONFIRMATION_PAY|是否逻辑||是||
|线上签署|PORTAL_CONFIRMATION_SIGN|是否逻辑||是||
|批准等级|PO_DOUBLE_VALIDATION|[单项选择(文本值)](index/dictionary_index#res_company_po_double_validation "批准等级")|60|是||
|再次验证金额|PO_DOUBLE_VALIDATION_AMOUNT|数值||是||
|采购提前期|PO_LEAD|浮点||是||
|销售订单修改|PO_LOCK|[单项选择(文本值)](index/dictionary_index#res_company_po_lock "销售订单修改")|60|是||
|预付百分比|PREPAYMENT_PERCENT|浮点||是||
|原色|PRIMARY_COLOR|文本，可指定长度|500|是||
|采购锁定日期|PURCHASE_LOCK_DATE|日期型||是||
|Display QR-code on invoices|QR_CODE|是否逻辑||是||
|快速编码|QUICK_EDIT_MODE|[单项选择(文本值)](index/dictionary_index#res_company_quick_edit_mode "快速编码")|60|是||
|默认报价有效期|QUOTATION_VALIDITY_DAYS|整型||是||
|报告页脚|REPORT_FOOTER|HTML文本，没有长度限制|1048576|是||
|公司标语|REPORT_HEADER|HTML文本，没有长度限制|1048576|是||
|默认工作时间|RESOURCE_CALENDAR_ID|外键值|100|是||
|销售锁定日期|SALE_LOCK_DATE|日期型||是||
|销售入门选择的付款方式|SALE_ONBOARDING_PAYMENT_METHOD|[单项选择(文本值)](index/dictionary_index#res_company_sale_onboarding_payment_method "销售入门选择的付款方式")|60|是||
|次要颜色|SECONDARY_COLOR|文本，可指定长度|500|是||
|销售安全天数|SECURITY_LEAD|浮点||是||
|序列|SEQUENCE|整型||是||
|实体邮寄颜色|SNAILMAIL_COLOR|是否逻辑||是||
|添加一个封面页|SNAILMAIL_COVER|是否逻辑||是||
|双面|SNAILMAIL_DUPLEX|是否逻辑||是||
|Facebook 账户|SOCIAL_FACEBOOK|文本，可指定长度|500|是||
|GitHub账户|SOCIAL_GITHUB|文本，可指定长度|500|是||
|Instagram 账号|SOCIAL_INSTAGRAM|文本，可指定长度|500|是||
|领英账号|SOCIAL_LINKEDIN|文本，可指定长度|500|是||
|TikTok / 抖音账号|SOCIAL_TIKTOK|文本，可指定长度|500|是||
|X 账户|SOCIAL_TWITTER|文本，可指定长度|500|是||
|Youtube账号|SOCIAL_YOUTUBE|文本，可指定长度|500|是||
|确认拣货邮件模版|STOCK_MAIL_CONFIRMATION_TEMPLATE_ID|外键值|100|是||
|邮件确认拣货|STOCK_MOVE_EMAIL_VALIDATION|是否逻辑||是||
|短信息确认|STOCK_MOVE_SMS_VALIDATION|是否逻辑||是||
|街道|STREET|文本，可指定长度|500|是||
|详细地址|STREET2|文本，可指定长度|500|是||
|Tax Calculation Rounding Method|TAX_CALCULATION_ROUNDING_METHOD|[单项选择(文本值)](index/dictionary_index#res_company_tax_calculation_rounding_method "Tax Calculation Rounding Method")|60|是||
|采用现金收付|TAX_EXIGIBILITY|是否逻辑||是||
|纳税申报表锁定日期|TAX_LOCK_DATE|日期型||是||
|Terms & Conditions format|TERMS_TYPE|[单项选择(文本值)](index/dictionary_index#res_company_terms_type "Terms & Conditions format")|60|是||
|Prefix of the transfer accounts|TRANSFER_ACCOUNT_CODE_PREFIX|文本，可指定长度|500|是||
|用户财政年度锁定日期|USER_FISCALYEAR_LOCK_DATE|日期型||是||
|用户硬性锁定日期|USER_HARD_LOCK_DATE|日期型||是||
|用户采购锁定日期|USER_PURCHASE_LOCK_DATE|日期型||是||
|用户销售锁定日期|USER_SALE_LOCK_DATE|日期型||是||
|User Tax Lock Date|USER_TAX_LOCK_DATE|日期型||是||
|使用默认徽标|USES_DEFAULT_LOGO|是否逻辑||是||
|工作许可证到期通知期|WORK_PERMIT_EXPIRATION_NOTICE_PERIOD|整型||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||
|邮编|ZIP|文本，可指定长度|500|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_CRM_TEAM_RES_COMPANY_COMPANY_ID](der/DER1N_CRM_TEAM_RES_COMPANY_COMPANY_ID)|[销售团队(CRM_TEAM)](module/crm/crm_team)|1:N关系||
|[DER1N_HR_DEPARTMENT_RES_COMPANY_COMPANY_ID](der/DER1N_HR_DEPARTMENT_RES_COMPANY_COMPANY_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RES_COMPANY_COMPANY_ID](der/DER1N_HR_EMPLOYEE_BASE_RES_COMPANY_COMPANY_ID)|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_COMPANY_COMPANY_ID](der/DER1N_HR_EMPLOYEE_RES_COMPANY_COMPANY_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_JOB_RES_COMPANY_COMPANY_ID](der/DER1N_HR_JOB_RES_COMPANY_COMPANY_ID)|[工作岗位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_HR_LEAVE_TYPE_RES_COMPANY_COMPANY_ID](der/DER1N_HR_LEAVE_TYPE_RES_COMPANY_COMPANY_ID)|[休假类型(HR_LEAVE_TYPE)](module/hr/hr_leave_type)|1:N关系||
|[DER1N_HR_WORK_LOCATION_RES_COMPANY_COMPANY_ID](der/DER1N_HR_WORK_LOCATION_RES_COMPANY_COMPANY_ID)|[工作地点(HR_WORK_LOCATION)](module/hr/hr_work_location)|1:N关系||
|[DER1N_IR_ATTACHMENT_RES_COMPANY_COMPANY_ID](der/DER1N_IR_ATTACHMENT_RES_COMPANY_COMPANY_ID)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|1:N关系||
|[DER1N_IR_DEFAULT_RES_COMPANY_COMPANY_ID](der/DER1N_IR_DEFAULT_RES_COMPANY_COMPANY_ID)|[默认值(IR_DEFAULT)](module/base/ir_default)|1:N关系||
|[DER1N_IR_SEQUENCE_RES_COMPANY_COMPANY_ID](der/DER1N_IR_SEQUENCE_RES_COMPANY_COMPANY_ID)|[序列(IR_SEQUENCE)](module/base/ir_sequence)|1:N关系||
|[DER1N_MAIL_ACTIVITY_PLAN_RES_COMPANY_COMPANY_ID](der/DER1N_MAIL_ACTIVITY_PLAN_RES_COMPANY_COMPANY_ID)|[活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan)|1:N关系||
|[DER1N_MAIL_MESSAGE_RES_COMPANY_RECORD_COMPANY_ID](der/DER1N_MAIL_MESSAGE_RES_COMPANY_RECORD_COMPANY_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||
|[DER1N_RESOURCE_CALENDAR_RES_COMPANY_COMPANY_ID](der/DER1N_RESOURCE_CALENDAR_RES_COMPANY_COMPANY_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||
|[DER1N_RESOURCE_MIXIN_RES_COMPANY_COMPANY_ID](der/DER1N_RESOURCE_MIXIN_RES_COMPANY_COMPANY_ID)|[资源装饰(RESOURCE_MIXIN)](module/resource/resource_mixin)|1:N关系||
|[DER1N_RESOURCE_RESOURCE_RES_COMPANY_COMPANY_ID](der/DER1N_RESOURCE_RESOURCE_RES_COMPANY_COMPANY_ID)|[资源(RESOURCE_RESOURCE)](module/resource/resource_resource)|1:N关系||
|[DER1N_RES_COMPANY_RES_COMPANY_PARENT_ID](der/DER1N_RES_COMPANY_RES_COMPANY_PARENT_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_PARTNER_BANK_RES_COMPANY_COMPANY_ID](der/DER1N_RES_PARTNER_BANK_RES_COMPANY_COMPANY_ID)|[银行账号(RES_PARTNER_BANK)](module/base/res_partner_bank)|1:N关系||
|[DER1N_RES_PARTNER_RES_COMPANY_COMPANY_ID](der/DER1N_RES_PARTNER_RES_COMPANY_COMPANY_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_RES_USERS_RES_COMPANY_COMPANY_ID](der/DER1N_RES_USERS_RES_COMPANY_COMPANY_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RES_COMPANY_IR_SEQUENCE_BATCH_PAYMENT_SEQUENCE_ID](der/DER1N_RES_COMPANY_IR_SEQUENCE_BATCH_PAYMENT_SEQUENCE_ID)|[序列(IR_SEQUENCE)](module/base/ir_sequence)|1:N关系||
|[DER1N_RES_COMPANY_MAIL_ALIAS_DOMAIN_ALIAS_DOMAIN_ID](der/DER1N_RES_COMPANY_MAIL_ALIAS_DOMAIN_ALIAS_DOMAIN_ID)|[电子邮件域名(MAIL_ALIAS_DOMAIN)](module/mail/mail_alias_domain)|1:N关系||
|[DER1N_RES_COMPANY_MAIL_TEMPLATE_STOCK_MAIL_CONFIRMATION_TEMPLATE_ID](der/DER1N_RES_COMPANY_MAIL_TEMPLATE_STOCK_MAIL_CONFIRMATION_TEMPLATE_ID)|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)|1:N关系||
|[DER1N_RES_COMPANY_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_RES_COMPANY_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||
|[DER1N_RES_COMPANY_RES_COMPANY_PARENT_ID](der/DER1N_RES_COMPANY_RES_COMPANY_PARENT_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_COMPANY_RES_COUNTRY_ACCOUNT_FISCAL_COUNTRY_ID](der/DER1N_RES_COMPANY_RES_COUNTRY_ACCOUNT_FISCAL_COUNTRY_ID)|[国家/地区(RES_COUNTRY)](module/base/res_country)|1:N关系||
|[DER1N_RES_COMPANY_RES_CURRENCY_CURRENCY_ID](der/DER1N_RES_COMPANY_RES_CURRENCY_CURRENCY_ID)|[币别(RES_CURRENCY)](module/base/res_currency)|1:N关系||
|[DER1N_RES_COMPANY_RES_PARTNER_PARTNER_ID](der/DER1N_RES_COMPANY_RES_PARTNER_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DERMULINH_RES_COMPANY_MAIL_ACTIVITY_MIXIN](der/DERMULINH_RES_COMPANY_MAIL_ACTIVITY_MIXIN)|[活动Mixin(MAIL_ACTIVITY_MIXIN)](module/mail/mail_activity_mixin)|多继承关系（虚拟实体）||
|[DERMULINH_RES_COMPANY_MAIL_THREAD](der/DERMULINH_RES_COMPANY_MAIL_THREAD)|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|多继承关系（虚拟实体）||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/res_company/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/res_company/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/res_company/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### res_company_group_user :id=res_company-res_company_group_user

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACCOUNT_FISCAL_COUNTRY_ID_EQ|会计所在国家/地区|EQ||
|N_ACCOUNT_PRICE_INCLUDE_EQ|Default Sales Price Include|EQ||
|N_ALIAS_DOMAIN_ID_EQ|电子邮件域名|EQ||
|N_ANNUAL_INVENTORY_MONTH_EQ|年度库存月|EQ||
|N_ATTENDANCE_BARCODE_SOURCE_EQ|条码来源|EQ||
|N_ATTENDANCE_KIOSK_MODE_EQ|考勤模式|EQ||
|N_ATTENDANCE_OVERTIME_VALIDATION_EQ|额外工时验证|EQ||
|N_BATCH_PAYMENT_SEQUENCE_ID_EQ|Batch Payment Sequence|EQ||
|N_CURRENCY_ID_EQ|币别|EQ||
|N_CURRENCY_NAME_EQ|币别|EQ||
|N_CURRENCY_NAME_LIKE|币别|LIKE||
|N_FISCALYEAR_LAST_MONTH_EQ|会计年度最后一个月|EQ||
|N_FONT_EQ|字体|EQ||
|N_ID_EQ|标识|EQ||
|N_LAYOUT_BACKGROUND_EQ|布局背景|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARENT_ID_EQ|上级公司|EQ||
|N_PARENT_NAME_EQ|上级公司|EQ||
|N_PARENT_NAME_LIKE|上级公司|LIKE||
|N_PARTNER_ID_EQ|合作伙伴|EQ||
|N_PARTNER_NAME_EQ|合作伙伴|EQ||
|N_PARTNER_NAME_LIKE|合作伙伴|LIKE||
|N_PAYMENT_ONBOARDING_PAYMENT_METHOD_EQ|选择支付方式|EQ||
|N_PO_DOUBLE_VALIDATION_EQ|批准等级|EQ||
|N_PO_LOCK_EQ|销售订单修改|EQ||
|N_QUICK_EDIT_MODE_EQ|快速编码|EQ||
|N_RESOURCE_CALENDAR_ID_EQ|默认工作时间|EQ||
|N_SALE_ONBOARDING_PAYMENT_METHOD_EQ|销售入门选择的付款方式|EQ||
|N_STOCK_MAIL_CONFIRMATION_TEMPLATE_ID_EQ|确认拣货邮件模版|EQ||
|N_TAX_CALCULATION_ROUNDING_METHOD_EQ|Tax Calculation Rounding Method|EQ||
|N_TERMS_TYPE_EQ|Terms & Conditions format|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_company?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_company?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>