# 联系人(res_partner)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|有效语言数量|ACTIVE_LANG_COUNT|整型||是||
|活动集合|ACTIVITIES|继承属性|1048576|是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#res_partner_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#res_partner_activity_state "活动状态")|200|是||
|附加信息|ADDITIONAL_INFO|文本，可指定长度|500|是||
|附件集合|ATTACHMENTS|继承属性|1048576|是||
|Auto-post bills|AUTOPOST_BILLS|[单项选择(文本值)](index/dictionary_index#res_partner_autopost_bills "Auto-post bills")|60|否||
|头像|AVATAR|继承属性|500|是||
|头像1024|AVATAR_1024|继承属性|500|是||
|头像128|AVATAR_128|继承属性|500|是||
|头像256|AVATAR_256|继承属性|500|是||
|头像512|AVATAR_512|继承属性|500|是||
|银行|BANK_ACCOUNT_COUNT|整型||是||
|条形码|BARCODE|文本，可指定长度|500|是||
|采购员|BUYER_ID|外键值|100|是||
|从基本日历中标记为已读的最后一条通知|CALENDAR_LAST_NOTIF_ACK|日期时间型||是||
|公司认证数|CERTIFICATIONS_COMPANY_COUNT|整型||是||
|认证计算|CERTIFICATIONS_COUNT|整型||是||
|城市|CITY|文本，可指定长度|500|是||
|颜色索引|COLOR|整型||是||
|备注|COMMENT|HTML文本，没有长度限制|1048576|是||
|公司名称实体|COMMERCIAL_COMPANY_NAME|文本，可指定长度|500|是||
|商业实体|COMMERCIAL_PARTNER_ID|外键值|100|是||
|公司|COMPANY_ID|外键值|100|是||
|公司名称|COMPANY_NAME|文本，可指定长度|500|是||
|公司注册号|COMPANY_REGISTRY|文本，可指定长度|500|是||
|公司 ID 标签|COMPANY_REGISTRY_LABEL|文本，可指定长度|500|是||
|公司类型|COMPANY_TYPE|[单项选择(文本值)](index/dictionary_index#res_partner_company_type "公司类型")|200|是||
|全名|COMPLETE_NAME|文本，可指定长度|500|是||
|完整地址|CONTACT_ADDRESS|文本，可指定长度|500|是||
|内嵌完整地址|CONTACT_ADDRESS_INLINE|文本，可指定长度|500|是||
|国家/地区|COUNTRY_ID|外键值|100|是||
|国家/地区|COUNTRY_NAME|外键值文本|200|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|应收账款总计|CREDIT|数值||是||
|信贷额度|CREDIT_LIMIT|浮点||是||
|贷记入发票|CREDIT_TO_INVOICE|数值||是||
|客户等级|CUSTOMER_RANK|整型||是||
|销售变现天数（DSO）|DAYS_SALES_OUTSTANDING|浮点||是||
|应付账款总计|DEBIT|数值||是||
|应付账款限额|DEBIT_LIMIT|数值||是||
|显示发票 Edi 格式|DISPLAY_INVOICE_EDI_FORMAT|是否逻辑||是||
|Display Invoice Template Pdf Report|DISPLAY_INVOICE_TEMPLATE_PDF_REPORT_ID|是否逻辑||是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|Duplicated Bank Account Partners Count|DUPLICATED_BANK_ACCOUNT_PARTNERS_COUNT|整型||是||
|邮箱|EMAIL|文本，可指定长度|500|是||
|格式化邮件|EMAIL_FORMATTED|文本，可指定长度|500|是||
|规范化邮件|EMAIL_NORMALIZED|文本，可指定长度|500|是||
|员工|EMPLOYEE|是否逻辑||是||
|员工数量|EMPLOYEES_COUNT|整型||是||
|会计所在国家/地区代码|FISCAL_COUNTRY_CODES|文本，可指定长度|500|是||
|关注者|FOLLOWERS|继承属性|1048576|是||
|工作职位|FUNCTION|文本，可指定长度|500|是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|Ignore Abnormal Invoice Amount|IGNORE_ABNORMAL_INVOICE_AMOUNT|是否逻辑||是||
|Ignore Abnormal Invoice Date|IGNORE_ABNORMAL_INVOICE_DATE|是否逻辑||是||
|头像|IMAGE|继承属性|500|是||
|图片1024|IMAGE_1024|继承属性|500|是||
|图片128|IMAGE_128|继承属性|500|是||
|图片256|IMAGE_256|继承属性|500|是||
|图片512|IMAGE_512|继承属性|500|是||
|IM的状态|IM_STATUS|文本，可指定长度|500|是||
|行业|INDUSTRY_ID|外键值|100|是||
|电子发票格式|INVOICE_EDI_FORMAT|[单项选择(文本值)](index/dictionary_index#res_partner_invoice_edi_format "电子发票格式")|200|是||
|发票 EDI 格式商店|INVOICE_EDI_FORMAT_STORE|文本，可指定长度|500|是||
|传送发票|INVOICE_SENDING_METHOD|[单项选择(文本值)](index/dictionary_index#res_partner_invoice_sending_method "传送发票")|60|是||
|发票|INVOICE_WARN|[单项选择(文本值)](index/dictionary_index#res_partner_invoice_warn "发票")|60|是||
|发票消息|INVOICE_WARN_MSG|长文本，没有长度限制|1048576|是||
|黑名单|IS_BLACKLISTED|是否逻辑||是||
|Is Coa Installed|IS_COA_INSTALLED|是否逻辑||是||
|是公司|IS_COMPANY|是否逻辑||是||
|是 Peppol Edi 格式|IS_PEPPOL_EDI_FORMAT|是否逻辑||是||
|是公共|IS_PUBLIC|是否逻辑||是||
|是 Ubl 格式|IS_UBL_FORMAT|是否逻辑||是||
|日记账项目|JOURNAL_ITEM_COUNT|整型||是||
|# 会议|MEETING_COUNT|整型||是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|退回|MESSAGE_BOUNCE|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|待处理|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|手机|MOBILE|文本，可指定长度|500|是||
|列入黑名单的手机是移动的|MOBILE_BLACKLISTED|是否逻辑||是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|名称|NAME|文本，可指定长度|200|是||
|准时交货率|ON_TIME_RATE|浮点||是||
|商机数量|OPPORTUNITY_COUNT|整型||是||
|相关公司|PARENT_ID|外键值|100|是||
|相关公司|PARENT_NAME|外键值文本|200|是||
|合作伙伴公司注册处占位符|PARTNER_COMPANY_REGISTRY_PLACEHOLDER|文本，可指定长度|500|是||
|公司数据库ID|PARTNER_GID|整型||是||
|地理纬度|PARTNER_LATITUDE|浮点||是||
|地理经度|PARTNER_LONGITUDE|浮点||是||
|共享合作伙伴|PARTNER_SHARE|是否逻辑||是||
|Partner Vat Placeholder|PARTNER_VAT_PLACEHOLDER|文本，可指定长度|500|是||
|支付令牌计数|PAYMENT_TOKEN_COUNT|整型||是||
|Peppol电子地址（EAS）|PEPPOL_EAS|[单项选择(文本值)](index/dictionary_index#res_partner_peppol_eas "Peppol电子地址（EAS）")|60|是||
|Peppol Endpoint|PEPPOL_ENDPOINT|文本，可指定长度|500|是||
|电话|PHONE|文本，可指定长度|500|是||
|列入黑名单的电话是电话|PHONE_BLACKLISTED|是否逻辑||是||
|电话/手机|PHONE_MOBILE_SEARCH|文本，可指定长度|500|是||
|净化数量|PHONE_SANITIZED|文本，可指定长度|500|是||
|电话加黑|PHONE_SANITIZED_BLACKLISTED|是否逻辑||是||
|库存拣货|PICKING_WARN|[单项选择(文本值)](index/dictionary_index#res_partner_picking_warn "库存拣货")|60|是||
|库存拣货单消息|PICKING_WARN_MSG|长文本，没有长度限制|1048576|是||
|计划更换自行车|PLAN_TO_CHANGE_BIKE|是否逻辑||是||
|更换车辆计划|PLAN_TO_CHANGE_CAR|是否逻辑||是||
|供应商币别|PROPERTY_PURCHASE_CURRENCY_ID|外键值|100|是||
|采购订单数|PURCHASE_ORDER_COUNT|整型||是||
|采购订单预警|PURCHASE_WARN|[单项选择(文本值)](index/dictionary_index#res_partner_purchase_warn "采购订单预警")|60|是||
|采购订单消息|PURCHASE_WARN_MSG|长文本，没有长度限制|1048576|是||
|收货提醒|RECEIPT_REMINDER_EMAIL|是否逻辑||是||
|参考|REF|文本，可指定长度|500|是||
|收货前几天|REMINDER_DATE_BEFORE_RECEIPT|整型||是||
|销售订单计数|SALE_ORDER_COUNT|整型||是||
|销售警告信息|SALE_WARN|[单项选择(文本值)](index/dictionary_index#res_partner_sale_warn "销售警告信息")|60|是||
|销售订单消息|SALE_WARN_MSG|长文本，没有长度限制|1048576|是||
|显示信用额度|SHOW_CREDIT_LIMIT|是否逻辑||是||
|注册令牌（Token）类型|SIGNUP_TYPE|文本，可指定长度|500|是||
|省/州|STATE_ID|外键值|100|是||
|省/州|STATE_NAME|外键值文本|200|是||
|街道|STREET|文本，可指定长度|500|是||
|详细地址|STREET2|文本，可指定长度|500|是||
|＃供应商账单|SUPPLIER_INVOICE_COUNT|整型||是||
|供应商排名|SUPPLIER_RANK|整型||是||
|null|TASK_COUNT|整型||是||
|已开票总计|TOTAL_INVOICED|数值||是||
|Degree of trust you have in this debtor|TRUST|[单项选择(文本值)](index/dictionary_index#res_partner_trust "Degree of trust you have in this debtor")|60|是||
|地址类型|TYPE|[单项选择(文本值)](index/dictionary_index#res_partner_type "地址类型")|60|是||
|时区|TZ|[单项选择(文本值)](index/dictionary_index#res_partner_tz "时区")|60|是||
|时区偏移|TZ_OFFSET|文本，可指定长度|500|是||
|业务员|USER_ID|外键值|100|是||
|业务员|USER_NAME|外键值文本|200|是||
|合作伙伴限制|USE_PARTNER_CREDIT_LIMIT|是否逻辑||是||
|税号ID|VAT|文本，可指定长度|500|是||
|税务 ID 标签|VAT_LABEL|文本，可指定长度|500|是||
|网站链接|WEBSITE|文本，可指定长度|500|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||
|邮编|ZIP|文本，可指定长度|500|是||


###### 属性组

<el-row>
<el-tabs v-model="show_field_group">

<el-tab-pane label="默认属性组" name="field_group_Simple">

|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|城市|CITY|文本，可指定长度|500|是||
|公司名称|COMPANY_NAME|文本，可指定长度|500|是||
|全名|COMPLETE_NAME|文本，可指定长度|500|是||
|国家/地区|COUNTRY_ID|外键值|100|是||
|国家/地区|COUNTRY_NAME|外键值文本|200|是||
|邮箱|EMAIL|文本，可指定长度|500|是||
|手机|MOBILE|文本，可指定长度|500|是||
|电话|PHONE|文本，可指定长度|500|是||
|街道|STREET|文本，可指定长度|500|是||
|业务员|USER_ID|外键值|100|是||
|业务员|USER_NAME|外键值文本|200|是||

</el-tab-pane>

</el-tabs>
</el-row>

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_DISCUSS_CHANNEL_MEMBER_RES_PARTNER_PARTNER_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_RES_PARTNER_PARTNER_ID)|[频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RES_PARTNER_ADDRESS_ID](der/DER1N_HR_EMPLOYEE_BASE_RES_PARTNER_ADDRESS_ID)|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|1:N关系||
|[DER1N_HR_EMPLOYEE_BASE_RES_PARTNER_WORK_CONTACT_ID](der/DER1N_HR_EMPLOYEE_BASE_RES_PARTNER_WORK_CONTACT_ID)|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_PARTNER_ADDRESS_ID](der/DER1N_HR_EMPLOYEE_RES_PARTNER_ADDRESS_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_PARTNER_WORK_CONTACT_ID](der/DER1N_HR_EMPLOYEE_RES_PARTNER_WORK_CONTACT_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_JOB_RES_PARTNER_ADDRESS_ID](der/DER1N_HR_JOB_RES_PARTNER_ADDRESS_ID)|[工作岗位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_HR_WORK_LOCATION_RES_PARTNER_ADDRESS_ID](der/DER1N_HR_WORK_LOCATION_RES_PARTNER_ADDRESS_ID)|[工作地点(HR_WORK_LOCATION)](module/hr/hr_work_location)|1:N关系||
|[DER1N_MAIL_ACTIVITY_RES_PARTNER_REQUEST_PARTNER_ID](der/DER1N_MAIL_ACTIVITY_RES_PARTNER_REQUEST_PARTNER_ID)|[活动(MAIL_ACTIVITY)](module/mail/mail_activity)|1:N关系||
|[DER1N_MAIL_FOLLOWERS_RES_PARTNER_PARTNER_ID](der/DER1N_MAIL_FOLLOWERS_RES_PARTNER_PARTNER_ID)|[单据关注者(MAIL_FOLLOWERS)](module/mail/mail_followers)|1:N关系||
|[DER1N_MAIL_MESSAGE_RECIPIENT_RES_PARTNER_PARTNER_ID](der/DER1N_MAIL_MESSAGE_RECIPIENT_RES_PARTNER_PARTNER_ID)|[消息收件人(MAIL_MESSAGE_RECIPIENT)](module/mail/mail_message_recipient)|1:N关系||
|[DER1N_MAIL_MESSAGE_RES_PARTNER_AUTHOR_ID](der/DER1N_MAIL_MESSAGE_RES_PARTNER_AUTHOR_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||
|[DER1N_RES_COMPANY_RES_PARTNER_PARTNER_ID](der/DER1N_RES_COMPANY_RES_PARTNER_PARTNER_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_PARTNER_BANK_RES_PARTNER_PARTNER_ID](der/DER1N_RES_PARTNER_BANK_RES_PARTNER_PARTNER_ID)|[银行账号(RES_PARTNER_BANK)](module/base/res_partner_bank)|1:N关系||
|[DER1N_RES_PARTNER_RES_PARTNER_COMMERCIAL_PARTNER_ID](der/DER1N_RES_PARTNER_RES_PARTNER_COMMERCIAL_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_RES_PARTNER_RES_PARTNER_PARENT_ID](der/DER1N_RES_PARTNER_RES_PARTNER_PARENT_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_RES_USERS_RES_PARTNER_PARTNER_ID](der/DER1N_RES_USERS_RES_PARTNER_PARTNER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||
|[DERCUSTOM_FAV_FAVORITE_RES_PARTNER](der/DERCUSTOM_FAV_FAVORITE_RES_PARTNER)|[收藏(FAV_FAVORITE)](module/fav/fav_favorite)|自定义关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RES_PARTNER_RES_COMPANY_COMPANY_ID](der/DER1N_RES_PARTNER_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_PARTNER_RES_COUNTRY_COUNTRY_ID](der/DER1N_RES_PARTNER_RES_COUNTRY_COUNTRY_ID)|[国家/地区(RES_COUNTRY)](module/base/res_country)|1:N关系||
|[DER1N_RES_PARTNER_RES_COUNTRY_STATE_STATE_ID](der/DER1N_RES_PARTNER_RES_COUNTRY_STATE_STATE_ID)|[国家省/州(RES_COUNTRY_STATE)](module/base/res_country_state)|1:N关系||
|[DER1N_RES_PARTNER_RES_CURRENCY_PROPERTY_PURCHASE_CURRENCY_ID](der/DER1N_RES_PARTNER_RES_CURRENCY_PROPERTY_PURCHASE_CURRENCY_ID)|[币别(RES_CURRENCY)](module/base/res_currency)|1:N关系||
|[DER1N_RES_PARTNER_RES_PARTNER_COMMERCIAL_PARTNER_ID](der/DER1N_RES_PARTNER_RES_PARTNER_COMMERCIAL_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_RES_PARTNER_RES_PARTNER_INDUSTRY_INDUSTRY_ID](der/DER1N_RES_PARTNER_RES_PARTNER_INDUSTRY_INDUSTRY_ID)|[行业(RES_PARTNER_INDUSTRY)](module/base/res_partner_industry)|1:N关系||
|[DER1N_RES_PARTNER_RES_PARTNER_PARENT_ID](der/DER1N_RES_PARTNER_RES_PARTNER_PARENT_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_RES_PARTNER_RES_USERS_BUYER_ID](der/DER1N_RES_PARTNER_RES_USERS_BUYER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||
|[DER1N_RES_PARTNER_RES_USERS_USER_ID](der/DER1N_RES_PARTNER_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||
|[DERMULINH_RES_PARTNER_AVATAR_MIXIN](der/DERMULINH_RES_PARTNER_AVATAR_MIXIN)|[头像混合(AVATAR_MIXIN)](module/base/avatar_mixin)|多继承关系（虚拟实体）||
|[DERMULINH_RES_PARTNER_MAIL_ACTIVITY_MIXIN](der/DERMULINH_RES_PARTNER_MAIL_ACTIVITY_MIXIN)|[活动Mixin(MAIL_ACTIVITY_MIXIN)](module/mail/mail_activity_mixin)|多继承关系（虚拟实体）||
|[DERMULINH_RES_PARTNER_MAIL_THREAD](der/DERMULINH_RES_PARTNER_MAIL_THREAD)|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|多继承关系（虚拟实体）||

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

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[获取全名](module/base/res_partner/logic/get_complete_name)|get_complete_name|无|||
|[计算全名](module/base/res_partner/logic/compute_complete_name)|compute_complete_name|属性逻辑|||
|[计算公司类型](module/base/res_partner/logic/compute_company_type)|compute_company_type|属性逻辑|||
|[计算显示名称](module/base/res_partner/logic/compute_display_name)|compute_display_name|属性逻辑|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/res_partner/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/res_partner/query/View)|VIEW|否|否 |否 ||
|[公司联系人(is_company)](module/base/res_partner/query/is_company)|is_company|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/res_partner/dataset/Default)|DEFAULT|数据查询|是|||
|[频道可邀请的联系人(channel_invite)](module/base/res_partner/dataset/channel_invite)|channel_invite|数据查询|否|||
|[公司联系人(is_company)](module/base/res_partner/dataset/is_company)|is_company|数据查询|否|||

## 数据权限

##### res_partner_group_user :id=res_partner-res_partner_group_user

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_EXCEPTION_DECORATION_EQ|活动异常标示|EQ||
|N_ACTIVITY_STATE_EQ|活动状态|EQ||
|N_AUTOPOST_BILLS_EQ|Auto-post bills|EQ||
|N_BUYER_ID_EQ|采购员|EQ||
|N_COMMERCIAL_PARTNER_ID_EQ|商业实体|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_COMPANY_TYPE_EQ|公司类型|EQ||
|N_COUNTRY_ID_EQ|国家/地区|EQ||
|N_COUNTRY_NAME_EQ|国家/地区|EQ||
|N_COUNTRY_NAME_LIKE|国家/地区|LIKE||
|N_ID_EQ|标识|EQ||
|N_INDUSTRY_ID_EQ|行业|EQ||
|N_INVOICE_EDI_FORMAT_EQ|电子发票格式|EQ||
|N_INVOICE_SENDING_METHOD_EQ|传送发票|EQ||
|N_INVOICE_WARN_EQ|发票|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARENT_ID_EQ|相关公司|EQ||
|N_PARENT_NAME_EQ|相关公司|EQ||
|N_PARENT_NAME_LIKE|相关公司|LIKE||
|N_PEPPOL_EAS_EQ|Peppol电子地址（EAS）|EQ||
|N_PICKING_WARN_EQ|库存拣货|EQ||
|N_PROPERTY_PURCHASE_CURRENCY_ID_EQ|供应商币别|EQ||
|N_PURCHASE_WARN_EQ|采购订单预警|EQ||
|N_SALE_WARN_EQ|销售警告信息|EQ||
|N_STATE_ID_EQ|省/州|EQ||
|N_STATE_NAME_EQ|省/州|EQ||
|N_STATE_NAME_LIKE|省/州|LIKE||
|N_TRUST_EQ|Degree of trust you have in this debtor|EQ||
|N_TYPE_EQ|地址类型|EQ||
|N_TZ_EQ|时区|EQ||
|N_USER_ID_EQ|业务员|EQ||
|N_USER_NAME_EQ|业务员|EQ||
|N_USER_NAME_LIKE|业务员|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_partner?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner?id=搜索模式`">
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
show_field_group:'field_group_Simple',

      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>