# 用户(res_users) :id=res_users
## 创建用户

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">accesses_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 访问权限|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">bronze_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|青铜徽标数目|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_default_privacy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日历默认隐私|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">can_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">companies_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数目|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">create_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技术领域，是否创建员工|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employee_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工人数|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
|<el-row justify="space-between"><el-col :span="20">gold_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|金质徽标数量|
|<el-row justify="space-between"><el-col :span="20">groups_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 分组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Amount|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Date|
|<el-row justify="space-between"><el-col :span="20">im_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IM的状态|
|<el-row justify="space-between"><el-col :span="20">industry_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行业|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子发票格式|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format_store</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票 EDI 格式商店|
|<el-row justify="space-between"><el-col :span="20">invoice_sending_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|传送发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票消息|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_coa_installed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Is Coa Installed|
|<el-row justify="space-between"><el-col :span="20">is_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公司|
|<el-row justify="space-between"><el-col :span="20">is_peppol_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Peppol Edi 格式|
|<el-row justify="space-between"><el-col :span="20">is_public</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公共|
|<el-row justify="space-between"><el-col :span="20">is_system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是系统|
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">meeting_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 会议|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的手机是移动的|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设置密码|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">odoobot_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小秘书状态|
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">payment_token_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支付令牌计数|
|<el-row justify="space-between"><el-col :span="20">peppol_eas</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol电子地址（EAS）|
|<el-row justify="space-between"><el-col :span="20">peppol_endpoint</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol Endpoint|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话/手机|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|净化数量|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话加黑|
|<el-row justify="space-between"><el-col :span="20">picking_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货|
|<el-row justify="space-between"><el-col :span="20">picking_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货单消息|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_bike</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划更换自行车|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_car</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|更换车辆计划|
|<el-row justify="space-between"><el-col :span="20">property_purchase_currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商币别|
|<el-row justify="space-between"><el-col :span="20">purchase_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购订单数|
|<el-row justify="space-between"><el-col :span="20">purchase_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单预警|
|<el-row justify="space-between"><el-col :span="20">purchase_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单消息|
|<el-row justify="space-between"><el-col :span="20">receipt_reminder_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">ref</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">reminder_date_before_receipt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货前几天|
|<el-row justify="space-between"><el-col :span="20">request_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|要求加班|
|<el-row justify="space-between"><el-col :span="20">rules_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 记录规则|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户销售团队|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">silver_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银质徽标数量|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">totp_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双重身份验证|
|<el-row justify="space-between"><el-col :span="20">totp_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Totp密匙|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_group_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户组警告|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">vat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税号ID|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税务 ID 标签|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站链接|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">avatar128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像128|
|<el-row justify="space-between"><el-col :span="20">image128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片128|
|<el-row justify="space-between"><el-col :span="20">avatar512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像512|
|<el-row justify="space-between"><el-col :span="20">image512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片512|
|<el-row justify="space-between"><el-col :span="20">avatar256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像256|
|<el-row justify="space-between"><el-col :span="20">image256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片256|
|<el-row justify="space-between"><el-col :span="20">avatar1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像1024|
|<el-row justify="space-between"><el-col :span="20">image1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片1024|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">groups_users_rels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}

```

## 获取用户

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/{key}" type="info" :closable="false" ></el-alert>
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
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}

```

## 删除用户

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新用户

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">accesses_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 访问权限|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">bronze_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|青铜徽标数目|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_default_privacy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日历默认隐私|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">can_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">companies_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数目|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">create_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技术领域，是否创建员工|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employee_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工人数|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
|<el-row justify="space-between"><el-col :span="20">gold_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|金质徽标数量|
|<el-row justify="space-between"><el-col :span="20">groups_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 分组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Amount|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Date|
|<el-row justify="space-between"><el-col :span="20">im_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IM的状态|
|<el-row justify="space-between"><el-col :span="20">industry_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行业|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子发票格式|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format_store</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票 EDI 格式商店|
|<el-row justify="space-between"><el-col :span="20">invoice_sending_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|传送发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票消息|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_coa_installed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Is Coa Installed|
|<el-row justify="space-between"><el-col :span="20">is_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公司|
|<el-row justify="space-between"><el-col :span="20">is_peppol_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Peppol Edi 格式|
|<el-row justify="space-between"><el-col :span="20">is_public</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公共|
|<el-row justify="space-between"><el-col :span="20">is_system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是系统|
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">meeting_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 会议|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的手机是移动的|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设置密码|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">odoobot_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小秘书状态|
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">payment_token_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支付令牌计数|
|<el-row justify="space-between"><el-col :span="20">peppol_eas</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol电子地址（EAS）|
|<el-row justify="space-between"><el-col :span="20">peppol_endpoint</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol Endpoint|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话/手机|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|净化数量|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话加黑|
|<el-row justify="space-between"><el-col :span="20">picking_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货|
|<el-row justify="space-between"><el-col :span="20">picking_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货单消息|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_bike</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划更换自行车|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_car</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|更换车辆计划|
|<el-row justify="space-between"><el-col :span="20">property_purchase_currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商币别|
|<el-row justify="space-between"><el-col :span="20">purchase_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购订单数|
|<el-row justify="space-between"><el-col :span="20">purchase_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单预警|
|<el-row justify="space-between"><el-col :span="20">purchase_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单消息|
|<el-row justify="space-between"><el-col :span="20">receipt_reminder_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">ref</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">reminder_date_before_receipt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货前几天|
|<el-row justify="space-between"><el-col :span="20">request_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|要求加班|
|<el-row justify="space-between"><el-col :span="20">rules_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 记录规则|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户销售团队|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">silver_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银质徽标数量|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">totp_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双重身份验证|
|<el-row justify="space-between"><el-col :span="20">totp_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Totp密匙|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_group_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户组警告|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">vat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税号ID|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税务 ID 标签|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站链接|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">avatar128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像128|
|<el-row justify="space-between"><el-col :span="20">image128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片128|
|<el-row justify="space-between"><el-col :span="20">avatar512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像512|
|<el-row justify="space-between"><el-col :span="20">image512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片512|
|<el-row justify="space-between"><el-col :span="20">avatar256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像256|
|<el-row justify="space-between"><el-col :span="20">image256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片256|
|<el-row justify="space-between"><el-col :span="20">avatar1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像1024|
|<el-row justify="space-between"><el-col :span="20">image1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片1024|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">groups_users_rels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}

```

## 修改密码

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/{key}/change_password" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">accesses_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 访问权限|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">bronze_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|青铜徽标数目|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_default_privacy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日历默认隐私|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">can_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">companies_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数目|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">create_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技术领域，是否创建员工|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employee_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工人数|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
|<el-row justify="space-between"><el-col :span="20">gold_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|金质徽标数量|
|<el-row justify="space-between"><el-col :span="20">groups_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 分组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Amount|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Date|
|<el-row justify="space-between"><el-col :span="20">im_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IM的状态|
|<el-row justify="space-between"><el-col :span="20">industry_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行业|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子发票格式|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format_store</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票 EDI 格式商店|
|<el-row justify="space-between"><el-col :span="20">invoice_sending_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|传送发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票消息|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_coa_installed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Is Coa Installed|
|<el-row justify="space-between"><el-col :span="20">is_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公司|
|<el-row justify="space-between"><el-col :span="20">is_peppol_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Peppol Edi 格式|
|<el-row justify="space-between"><el-col :span="20">is_public</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公共|
|<el-row justify="space-between"><el-col :span="20">is_system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是系统|
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">meeting_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 会议|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的手机是移动的|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设置密码|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">odoobot_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小秘书状态|
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">payment_token_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支付令牌计数|
|<el-row justify="space-between"><el-col :span="20">peppol_eas</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol电子地址（EAS）|
|<el-row justify="space-between"><el-col :span="20">peppol_endpoint</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol Endpoint|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话/手机|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|净化数量|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话加黑|
|<el-row justify="space-between"><el-col :span="20">picking_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货|
|<el-row justify="space-between"><el-col :span="20">picking_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货单消息|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_bike</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划更换自行车|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_car</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|更换车辆计划|
|<el-row justify="space-between"><el-col :span="20">property_purchase_currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商币别|
|<el-row justify="space-between"><el-col :span="20">purchase_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购订单数|
|<el-row justify="space-between"><el-col :span="20">purchase_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单预警|
|<el-row justify="space-between"><el-col :span="20">purchase_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单消息|
|<el-row justify="space-between"><el-col :span="20">receipt_reminder_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">ref</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">reminder_date_before_receipt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货前几天|
|<el-row justify="space-between"><el-col :span="20">request_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|要求加班|
|<el-row justify="space-between"><el-col :span="20">rules_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 记录规则|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户销售团队|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">silver_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银质徽标数量|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">totp_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双重身份验证|
|<el-row justify="space-between"><el-col :span="20">totp_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Totp密匙|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_group_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户组警告|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">vat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税号ID|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税务 ID 标签|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站链接|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">avatar128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像128|
|<el-row justify="space-between"><el-col :span="20">image128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片128|
|<el-row justify="space-between"><el-col :span="20">avatar512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像512|
|<el-row justify="space-between"><el-col :span="20">image512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片512|
|<el-row justify="space-between"><el-col :span="20">avatar256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像256|
|<el-row justify="space-between"><el-col :span="20">image256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片256|
|<el-row justify="space-between"><el-col :span="20">avatar1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像1024|
|<el-row justify="space-between"><el-col :span="20">image1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片1024|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">groups_users_rels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}
```



## 检查用户主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">accesses_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 访问权限|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">bronze_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|青铜徽标数目|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_default_privacy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日历默认隐私|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">can_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">companies_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数目|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">create_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技术领域，是否创建员工|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employee_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工人数|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
|<el-row justify="space-between"><el-col :span="20">gold_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|金质徽标数量|
|<el-row justify="space-between"><el-col :span="20">groups_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 分组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Amount|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Date|
|<el-row justify="space-between"><el-col :span="20">im_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IM的状态|
|<el-row justify="space-between"><el-col :span="20">industry_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行业|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子发票格式|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format_store</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票 EDI 格式商店|
|<el-row justify="space-between"><el-col :span="20">invoice_sending_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|传送发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票消息|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_coa_installed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Is Coa Installed|
|<el-row justify="space-between"><el-col :span="20">is_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公司|
|<el-row justify="space-between"><el-col :span="20">is_peppol_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Peppol Edi 格式|
|<el-row justify="space-between"><el-col :span="20">is_public</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公共|
|<el-row justify="space-between"><el-col :span="20">is_system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是系统|
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">meeting_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 会议|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的手机是移动的|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设置密码|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">odoobot_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小秘书状态|
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">payment_token_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支付令牌计数|
|<el-row justify="space-between"><el-col :span="20">peppol_eas</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol电子地址（EAS）|
|<el-row justify="space-between"><el-col :span="20">peppol_endpoint</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol Endpoint|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话/手机|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|净化数量|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话加黑|
|<el-row justify="space-between"><el-col :span="20">picking_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货|
|<el-row justify="space-between"><el-col :span="20">picking_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货单消息|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_bike</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划更换自行车|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_car</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|更换车辆计划|
|<el-row justify="space-between"><el-col :span="20">property_purchase_currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商币别|
|<el-row justify="space-between"><el-col :span="20">purchase_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购订单数|
|<el-row justify="space-between"><el-col :span="20">purchase_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单预警|
|<el-row justify="space-between"><el-col :span="20">purchase_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单消息|
|<el-row justify="space-between"><el-col :span="20">receipt_reminder_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">ref</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">reminder_date_before_receipt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货前几天|
|<el-row justify="space-between"><el-col :span="20">request_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|要求加班|
|<el-row justify="space-between"><el-col :span="20">rules_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 记录规则|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户销售团队|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">silver_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银质徽标数量|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">totp_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双重身份验证|
|<el-row justify="space-between"><el-col :span="20">totp_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Totp密匙|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_group_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户组警告|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">vat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税号ID|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税务 ID 标签|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站链接|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">avatar128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像128|
|<el-row justify="space-between"><el-col :span="20">image128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片128|
|<el-row justify="space-between"><el-col :span="20">avatar512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像512|
|<el-row justify="space-between"><el-col :span="20">image512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片512|
|<el-row justify="space-between"><el-col :span="20">avatar256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像256|
|<el-row justify="space-between"><el-col :span="20">image256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片256|
|<el-row justify="space-between"><el-col :span="20">avatar1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像1024|
|<el-row justify="space-between"><el-col :span="20">image1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片1024|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">groups_users_rels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 当前登录人的user

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/{key}/current_user" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">accesses_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 访问权限|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">bronze_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|青铜徽标数目|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_default_privacy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日历默认隐私|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">can_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">companies_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数目|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">create_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技术领域，是否创建员工|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employee_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工人数|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
|<el-row justify="space-between"><el-col :span="20">gold_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|金质徽标数量|
|<el-row justify="space-between"><el-col :span="20">groups_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 分组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Amount|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Date|
|<el-row justify="space-between"><el-col :span="20">im_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IM的状态|
|<el-row justify="space-between"><el-col :span="20">industry_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行业|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子发票格式|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format_store</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票 EDI 格式商店|
|<el-row justify="space-between"><el-col :span="20">invoice_sending_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|传送发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票消息|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_coa_installed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Is Coa Installed|
|<el-row justify="space-between"><el-col :span="20">is_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公司|
|<el-row justify="space-between"><el-col :span="20">is_peppol_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Peppol Edi 格式|
|<el-row justify="space-between"><el-col :span="20">is_public</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公共|
|<el-row justify="space-between"><el-col :span="20">is_system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是系统|
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">meeting_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 会议|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的手机是移动的|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设置密码|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">odoobot_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小秘书状态|
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">payment_token_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支付令牌计数|
|<el-row justify="space-between"><el-col :span="20">peppol_eas</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol电子地址（EAS）|
|<el-row justify="space-between"><el-col :span="20">peppol_endpoint</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol Endpoint|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话/手机|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|净化数量|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话加黑|
|<el-row justify="space-between"><el-col :span="20">picking_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货|
|<el-row justify="space-between"><el-col :span="20">picking_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货单消息|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_bike</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划更换自行车|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_car</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|更换车辆计划|
|<el-row justify="space-between"><el-col :span="20">property_purchase_currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商币别|
|<el-row justify="space-between"><el-col :span="20">purchase_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购订单数|
|<el-row justify="space-between"><el-col :span="20">purchase_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单预警|
|<el-row justify="space-between"><el-col :span="20">purchase_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单消息|
|<el-row justify="space-between"><el-col :span="20">receipt_reminder_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">ref</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">reminder_date_before_receipt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货前几天|
|<el-row justify="space-between"><el-col :span="20">request_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|要求加班|
|<el-row justify="space-between"><el-col :span="20">rules_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 记录规则|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户销售团队|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">silver_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银质徽标数量|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">totp_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双重身份验证|
|<el-row justify="space-between"><el-col :span="20">totp_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Totp密匙|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_group_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户组警告|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">vat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税号ID|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税务 ID 标签|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站链接|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">avatar128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像128|
|<el-row justify="space-between"><el-col :span="20">image128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片128|
|<el-row justify="space-between"><el-col :span="20">avatar512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像512|
|<el-row justify="space-between"><el-col :span="20">image512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片512|
|<el-row justify="space-between"><el-col :span="20">avatar256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像256|
|<el-row justify="space-between"><el-col :span="20">image256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片256|
|<el-row justify="space-between"><el-col :span="20">avatar1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像1024|
|<el-row justify="space-between"><el-col :span="20">image1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片1024|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">groups_users_rels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}
```



## 获取用户草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">accesses_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 访问权限|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">bronze_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|青铜徽标数目|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_default_privacy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日历默认隐私|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">can_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">companies_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数目|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">create_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技术领域，是否创建员工|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employee_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工人数|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
|<el-row justify="space-between"><el-col :span="20">gold_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|金质徽标数量|
|<el-row justify="space-between"><el-col :span="20">groups_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 分组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Amount|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Date|
|<el-row justify="space-between"><el-col :span="20">im_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IM的状态|
|<el-row justify="space-between"><el-col :span="20">industry_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行业|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子发票格式|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format_store</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票 EDI 格式商店|
|<el-row justify="space-between"><el-col :span="20">invoice_sending_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|传送发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票消息|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_coa_installed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Is Coa Installed|
|<el-row justify="space-between"><el-col :span="20">is_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公司|
|<el-row justify="space-between"><el-col :span="20">is_peppol_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Peppol Edi 格式|
|<el-row justify="space-between"><el-col :span="20">is_public</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公共|
|<el-row justify="space-between"><el-col :span="20">is_system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是系统|
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">meeting_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 会议|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的手机是移动的|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设置密码|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">odoobot_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小秘书状态|
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">payment_token_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支付令牌计数|
|<el-row justify="space-between"><el-col :span="20">peppol_eas</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol电子地址（EAS）|
|<el-row justify="space-between"><el-col :span="20">peppol_endpoint</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol Endpoint|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话/手机|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|净化数量|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话加黑|
|<el-row justify="space-between"><el-col :span="20">picking_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货|
|<el-row justify="space-between"><el-col :span="20">picking_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货单消息|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_bike</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划更换自行车|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_car</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|更换车辆计划|
|<el-row justify="space-between"><el-col :span="20">property_purchase_currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商币别|
|<el-row justify="space-between"><el-col :span="20">purchase_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购订单数|
|<el-row justify="space-between"><el-col :span="20">purchase_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单预警|
|<el-row justify="space-between"><el-col :span="20">purchase_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单消息|
|<el-row justify="space-between"><el-col :span="20">receipt_reminder_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">ref</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">reminder_date_before_receipt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货前几天|
|<el-row justify="space-between"><el-col :span="20">request_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|要求加班|
|<el-row justify="space-between"><el-col :span="20">rules_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 记录规则|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户销售团队|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">silver_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银质徽标数量|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">totp_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双重身份验证|
|<el-row justify="space-between"><el-col :span="20">totp_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Totp密匙|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_group_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户组警告|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">vat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税号ID|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税务 ID 标签|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站链接|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">avatar128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像128|
|<el-row justify="space-between"><el-col :span="20">image128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片128|
|<el-row justify="space-between"><el-col :span="20">avatar512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像512|
|<el-row justify="space-between"><el-col :span="20">image512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片512|
|<el-row justify="space-between"><el-col :span="20">avatar256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像256|
|<el-row justify="space-between"><el-col :span="20">image256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片256|
|<el-row justify="space-between"><el-col :span="20">avatar1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像1024|
|<el-row justify="space-between"><el-col :span="20">image1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片1024|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">groups_users_rels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}

```

## 保存用户

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">accesses_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 访问权限|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">bronze_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|青铜徽标数目|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_default_privacy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日历默认隐私|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">can_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">companies_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数目|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">create_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技术领域，是否创建员工|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employee_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工人数|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
|<el-row justify="space-between"><el-col :span="20">gold_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|金质徽标数量|
|<el-row justify="space-between"><el-col :span="20">groups_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 分组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Amount|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Date|
|<el-row justify="space-between"><el-col :span="20">im_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IM的状态|
|<el-row justify="space-between"><el-col :span="20">industry_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行业|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子发票格式|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format_store</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票 EDI 格式商店|
|<el-row justify="space-between"><el-col :span="20">invoice_sending_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|传送发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票消息|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_coa_installed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Is Coa Installed|
|<el-row justify="space-between"><el-col :span="20">is_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公司|
|<el-row justify="space-between"><el-col :span="20">is_peppol_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Peppol Edi 格式|
|<el-row justify="space-between"><el-col :span="20">is_public</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公共|
|<el-row justify="space-between"><el-col :span="20">is_system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是系统|
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">meeting_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 会议|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的手机是移动的|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设置密码|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">odoobot_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小秘书状态|
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">payment_token_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支付令牌计数|
|<el-row justify="space-between"><el-col :span="20">peppol_eas</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol电子地址（EAS）|
|<el-row justify="space-between"><el-col :span="20">peppol_endpoint</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol Endpoint|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话/手机|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|净化数量|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话加黑|
|<el-row justify="space-between"><el-col :span="20">picking_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货|
|<el-row justify="space-between"><el-col :span="20">picking_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货单消息|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_bike</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划更换自行车|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_car</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|更换车辆计划|
|<el-row justify="space-between"><el-col :span="20">property_purchase_currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商币别|
|<el-row justify="space-between"><el-col :span="20">purchase_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购订单数|
|<el-row justify="space-between"><el-col :span="20">purchase_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单预警|
|<el-row justify="space-between"><el-col :span="20">purchase_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单消息|
|<el-row justify="space-between"><el-col :span="20">receipt_reminder_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">ref</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">reminder_date_before_receipt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货前几天|
|<el-row justify="space-between"><el-col :span="20">request_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|要求加班|
|<el-row justify="space-between"><el-col :span="20">rules_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 记录规则|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户销售团队|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">silver_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银质徽标数量|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">totp_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双重身份验证|
|<el-row justify="space-between"><el-col :span="20">totp_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Totp密匙|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_group_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户组警告|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">vat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税号ID|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税务 ID 标签|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站链接|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">avatar128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像128|
|<el-row justify="space-between"><el-col :span="20">image128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片128|
|<el-row justify="space-between"><el-col :span="20">avatar512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像512|
|<el-row justify="space-between"><el-col :span="20">image512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片512|
|<el-row justify="space-between"><el-col :span="20">avatar256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像256|
|<el-row justify="space-between"><el-col :span="20">image256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片256|
|<el-row justify="space-between"><el-col :span="20">avatar1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像1024|
|<el-row justify="space-between"><el-col :span="20">image1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片1024|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">groups_users_rels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}

```

## 用户计数器

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/{key}/user_counter" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">accesses_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 访问权限|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">bronze_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|青铜徽标数目|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_default_privacy</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日历默认隐私|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">can_edit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|能编辑|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">companies_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数目|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">create_employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|技术领域，是否创建员工|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employee_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工人数|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
|<el-row justify="space-between"><el-col :span="20">gold_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|金质徽标数量|
|<el-row justify="space-between"><el-col :span="20">groups_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 分组|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Amount|
|<el-row justify="space-between"><el-col :span="20">ignore_abnormal_invoice_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Ignore Abnormal Invoice Date|
|<el-row justify="space-between"><el-col :span="20">im_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|IM的状态|
|<el-row justify="space-between"><el-col :span="20">industry_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行业|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子发票格式|
|<el-row justify="space-between"><el-col :span="20">invoice_edi_format_store</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票 EDI 格式商店|
|<el-row justify="space-between"><el-col :span="20">invoice_sending_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|传送发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票|
|<el-row justify="space-between"><el-col :span="20">invoice_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票消息|
|<el-row justify="space-between"><el-col :span="20">is_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|黑名单|
|<el-row justify="space-between"><el-col :span="20">is_coa_installed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Is Coa Installed|
|<el-row justify="space-between"><el-col :span="20">is_company</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公司|
|<el-row justify="space-between"><el-col :span="20">is_peppol_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Peppol Edi 格式|
|<el-row justify="space-between"><el-col :span="20">is_public</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是公共|
|<el-row justify="space-between"><el-col :span="20">is_system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是系统|
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">meeting_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 会议|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|附件数量|
|<el-row justify="space-between"><el-col :span="20">message_bounce</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|退回|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|消息发送错误|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">mobile</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|手机|
|<el-row justify="space-between"><el-col :span="20">mobile_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的手机是移动的|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">new_password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|设置密码|
|<el-row justify="space-between"><el-col :span="20">notification_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|通知|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">odoobot_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小秘书状态|
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
|<el-row justify="space-between"><el-col :span="20">password</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|密码|
|<el-row justify="space-between"><el-col :span="20">payment_token_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|支付令牌计数|
|<el-row justify="space-between"><el-col :span="20">peppol_eas</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol电子地址（EAS）|
|<el-row justify="space-between"><el-col :span="20">peppol_endpoint</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol Endpoint|
|<el-row justify="space-between"><el-col :span="20">phone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">phone_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|列入黑名单的电话是电话|
|<el-row justify="space-between"><el-col :span="20">phone_mobile_search</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话/手机|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|净化数量|
|<el-row justify="space-between"><el-col :span="20">phone_sanitized_blacklisted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|电话加黑|
|<el-row justify="space-between"><el-col :span="20">picking_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货|
|<el-row justify="space-between"><el-col :span="20">picking_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货单消息|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_bike</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|计划更换自行车|
|<el-row justify="space-between"><el-col :span="20">plan_to_change_car</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|更换车辆计划|
|<el-row justify="space-between"><el-col :span="20">property_purchase_currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商币别|
|<el-row justify="space-between"><el-col :span="20">purchase_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采购订单数|
|<el-row justify="space-between"><el-col :span="20">purchase_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单预警|
|<el-row justify="space-between"><el-col :span="20">purchase_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单消息|
|<el-row justify="space-between"><el-col :span="20">receipt_reminder_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货提醒|
|<el-row justify="space-between"><el-col :span="20">ref</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参考|
|<el-row justify="space-between"><el-col :span="20">reminder_date_before_receipt</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|收货前几天|
|<el-row justify="space-between"><el-col :span="20">request_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|要求加班|
|<el-row justify="space-between"><el-col :span="20">rules_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 记录规则|
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_team_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户销售团队|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">silver_badge</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银质徽标数量|
|<el-row justify="space-between"><el-col :span="20">state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">totp_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双重身份验证|
|<el-row justify="space-between"><el-col :span="20">totp_secret</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Totp密匙|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_group_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户组警告|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">vat</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税号ID|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|税务 ID 标签|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网站链接|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|
|<el-row justify="space-between"><el-col :span="20">avatar128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像128|
|<el-row justify="space-between"><el-col :span="20">image128</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片128|
|<el-row justify="space-between"><el-col :span="20">avatar512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像512|
|<el-row justify="space-between"><el-col :span="20">image512</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片512|
|<el-row justify="space-between"><el-col :span="20">avatar256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像256|
|<el-row justify="space-between"><el-col :span="20">image256</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片256|
|<el-row justify="space-between"><el-col :span="20">avatar1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像1024|
|<el-row justify="space-between"><el-col :span="20">image1024</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图片1024|
|<el-row justify="space-between"><el-col :span="20">avatar</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">image</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|头像|
|<el-row justify="space-between"><el-col :span="20">groups_users_rels</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "accesses_count" : null,
  "active" : null,
  "active_lang_count" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "additional_info" : null,
  "autopost_bills" : null,
  "bank_account_count" : null,
  "barcode" : null,
  "bronze_badge" : null,
  "buyer_id" : null,
  "calendar_default_privacy" : null,
  "calendar_last_notif_ack" : null,
  "can_edit" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "companies_count" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "create_date" : null,
  "create_employee" : null,
  "create_uid" : null,
  "credit" : null,
  "credit_limit" : null,
  "credit_to_invoice" : null,
  "customer_rank" : null,
  "days_sales_outstanding" : null,
  "debit" : null,
  "debit_limit" : null,
  "display_invoice_edi_format" : null,
  "display_invoice_template_pdf_report_id" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employee_count" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
  "gold_badge" : null,
  "groups_count" : null,
  "has_message" : null,
  "id" : null,
  "ignore_abnormal_invoice_amount" : null,
  "ignore_abnormal_invoice_date" : null,
  "im_status" : null,
  "industry_id" : null,
  "invoice_edi_format" : null,
  "invoice_edi_format_store" : null,
  "invoice_sending_method" : null,
  "invoice_warn" : null,
  "invoice_warn_msg" : null,
  "is_blacklisted" : null,
  "is_coa_installed" : null,
  "is_company" : null,
  "is_peppol_edi_format" : null,
  "is_public" : null,
  "is_system" : null,
  "is_ubl_format" : null,
  "journal_item_count" : null,
  "karma" : null,
  "login" : null,
  "meeting_count" : null,
  "message_attachment_count" : null,
  "message_bounce" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "mobile" : null,
  "mobile_blacklisted" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "new_password" : null,
  "notification_type" : null,
  "odoobot_failed" : null,
  "odoobot_state" : null,
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_id" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_name" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
  "password" : null,
  "payment_token_count" : null,
  "peppol_eas" : null,
  "peppol_endpoint" : null,
  "phone" : null,
  "phone_blacklisted" : null,
  "phone_mobile_search" : null,
  "phone_sanitized" : null,
  "phone_sanitized_blacklisted" : null,
  "picking_warn" : null,
  "picking_warn_msg" : null,
  "plan_to_change_bike" : null,
  "plan_to_change_car" : null,
  "property_purchase_currency_id" : null,
  "purchase_order_count" : null,
  "purchase_warn" : null,
  "purchase_warn_msg" : null,
  "receipt_reminder_email" : null,
  "ref" : null,
  "reminder_date_before_receipt" : null,
  "request_overtime" : null,
  "rules_count" : null,
  "sale_order_count" : null,
  "sale_team_id" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "share" : null,
  "show_credit_limit" : null,
  "signature" : null,
  "signup_type" : null,
  "silver_badge" : null,
  "state" : null,
  "state_id" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "totp_enabled" : null,
  "totp_secret" : null,
  "tour_enabled" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_group_warning" : null,
  "user_id" : null,
  "vat" : null,
  "vat_label" : null,
  "website" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
  "avatar128" : null,
  "image128" : null,
  "avatar512" : null,
  "image512" : null,
  "avatar256" : null,
  "image256" : null,
  "avatar1024" : null,
  "image1024" : null,
  "avatar" : null,
  "image" : null,
  "groups_users_rels" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "accesses_count" : null,
  "groups_count" : null,
  "rules_count" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_calendar_default_privacy_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日历默认隐私|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_notification_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|通知|
|<el-row justify="space-between"><el-col :span="20">n_odoobot_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小秘书状态|
|<el-row justify="space-between"><el-col :span="20">n_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_sale_team_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户销售团队|
|<el-row justify="space-between"><el-col :span="20">n_share_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_calendar_default_privacy_eq" : null,
  "n_company_id_eq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_notification_type_eq" : null,
  "n_odoobot_state_eq" : null,
  "n_partner_id_eq" : null,
  "n_partner_name_eq" : null,
  "n_partner_name_like" : null,
  "n_sale_team_id_eq" : null,
  "n_share_eq" : null,
  "n_state_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "display_name" : null,
    "accesses_count" : null,
    "active" : null,
    "active_lang_count" : null,
    "activity_date_deadline" : null,
    "activity_exception_decoration" : null,
    "activity_exception_icon" : null,
    "activity_state" : null,
    "additional_info" : null,
    "autopost_bills" : null,
    "bank_account_count" : null,
    "barcode" : null,
    "bronze_badge" : null,
    "buyer_id" : null,
    "calendar_default_privacy" : null,
    "calendar_last_notif_ack" : null,
    "can_edit" : null,
    "certifications_company_count" : null,
    "certifications_count" : null,
    "city" : null,
    "color" : null,
    "comment" : null,
    "commercial_company_name" : null,
    "commercial_partner_id" : null,
    "companies_count" : null,
    "company_id" : null,
    "company_name" : null,
    "company_registry" : null,
    "company_registry_label" : null,
    "company_type" : null,
    "complete_name" : null,
    "contact_address" : null,
    "contact_address_inline" : null,
    "country_id" : null,
    "create_date" : null,
    "create_employee" : null,
    "create_uid" : null,
    "credit" : null,
    "credit_limit" : null,
    "credit_to_invoice" : null,
    "customer_rank" : null,
    "days_sales_outstanding" : null,
    "debit" : null,
    "debit_limit" : null,
    "display_invoice_edi_format" : null,
    "display_invoice_template_pdf_report_id" : null,
    "duplicated_bank_account_partners_count" : null,
    "email" : null,
    "email_formatted" : null,
    "email_normalized" : null,
    "employee" : null,
    "employee_count" : null,
    "employees_count" : null,
    "fiscal_country_codes" : null,
    "function" : null,
    "gold_badge" : null,
    "groups_count" : null,
    "has_message" : null,
    "id" : null,
    "ignore_abnormal_invoice_amount" : null,
    "ignore_abnormal_invoice_date" : null,
    "im_status" : null,
    "industry_id" : null,
    "invoice_edi_format" : null,
    "invoice_edi_format_store" : null,
    "invoice_sending_method" : null,
    "invoice_warn" : null,
    "invoice_warn_msg" : null,
    "is_blacklisted" : null,
    "is_coa_installed" : null,
    "is_company" : null,
    "is_peppol_edi_format" : null,
    "is_public" : null,
    "is_system" : null,
    "is_ubl_format" : null,
    "journal_item_count" : null,
    "karma" : null,
    "login" : null,
    "meeting_count" : null,
    "message_attachment_count" : null,
    "message_bounce" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "mobile" : null,
    "mobile_blacklisted" : null,
    "my_activity_date_deadline" : null,
    "name" : null,
    "new_password" : null,
    "notification_type" : null,
    "odoobot_failed" : null,
    "odoobot_state" : null,
    "on_time_rate" : null,
    "opportunity_count" : null,
    "parent_id" : null,
    "partner_company_registry_placeholder" : null,
    "partner_gid" : null,
    "partner_id" : null,
    "partner_latitude" : null,
    "partner_longitude" : null,
    "partner_name" : null,
    "partner_share" : null,
    "partner_vat_placeholder" : null,
    "password" : null,
    "payment_token_count" : null,
    "peppol_eas" : null,
    "peppol_endpoint" : null,
    "phone" : null,
    "phone_blacklisted" : null,
    "phone_mobile_search" : null,
    "phone_sanitized" : null,
    "phone_sanitized_blacklisted" : null,
    "picking_warn" : null,
    "picking_warn_msg" : null,
    "plan_to_change_bike" : null,
    "plan_to_change_car" : null,
    "property_purchase_currency_id" : null,
    "purchase_order_count" : null,
    "purchase_warn" : null,
    "purchase_warn_msg" : null,
    "receipt_reminder_email" : null,
    "ref" : null,
    "reminder_date_before_receipt" : null,
    "request_overtime" : null,
    "rules_count" : null,
    "sale_order_count" : null,
    "sale_team_id" : null,
    "sale_warn" : null,
    "sale_warn_msg" : null,
    "share" : null,
    "show_credit_limit" : null,
    "signature" : null,
    "signup_type" : null,
    "silver_badge" : null,
    "state" : null,
    "state_id" : null,
    "street" : null,
    "street2" : null,
    "supplier_invoice_count" : null,
    "supplier_rank" : null,
    "target_sales_done" : null,
    "target_sales_invoiced" : null,
    "target_sales_won" : null,
    "task_count" : null,
    "total_invoiced" : null,
    "totp_enabled" : null,
    "totp_secret" : null,
    "tour_enabled" : null,
    "trust" : null,
    "type" : null,
    "tz" : null,
    "tz_offset" : null,
    "use_partner_credit_limit" : null,
    "user_group_warning" : null,
    "user_id" : null,
    "vat" : null,
    "vat_label" : null,
    "website" : null,
    "write_date" : null,
    "write_uid" : null,
    "zip" : null,
    "avatar128" : null,
    "image128" : null,
    "avatar512" : null,
    "image512" : null,
    "avatar256" : null,
    "image256" : null,
    "avatar1024" : null,
    "image1024" : null,
    "avatar" : null,
    "image" : null,
    "groups_users_rels" : null,
  }
]
```

## 简单查询

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/fetch_simple" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_calendar_default_privacy_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日历默认隐私|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_notification_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|通知|
|<el-row justify="space-between"><el-col :span="20">n_odoobot_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小秘书状态|
|<el-row justify="space-between"><el-col :span="20">n_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_sale_team_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户销售团队|
|<el-row justify="space-between"><el-col :span="20">n_share_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_calendar_default_privacy_eq" : null,
  "n_company_id_eq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_notification_type_eq" : null,
  "n_odoobot_state_eq" : null,
  "n_partner_id_eq" : null,
  "n_partner_name_eq" : null,
  "n_partner_name_like" : null,
  "n_sale_team_id_eq" : null,
  "n_share_eq" : null,
  "n_state_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "display_name" : null,
    "accesses_count" : null,
    "active" : null,
    "active_lang_count" : null,
    "activity_date_deadline" : null,
    "activity_exception_decoration" : null,
    "activity_exception_icon" : null,
    "activity_state" : null,
    "additional_info" : null,
    "autopost_bills" : null,
    "bank_account_count" : null,
    "barcode" : null,
    "bronze_badge" : null,
    "buyer_id" : null,
    "calendar_default_privacy" : null,
    "calendar_last_notif_ack" : null,
    "can_edit" : null,
    "certifications_company_count" : null,
    "certifications_count" : null,
    "city" : null,
    "color" : null,
    "comment" : null,
    "commercial_company_name" : null,
    "commercial_partner_id" : null,
    "companies_count" : null,
    "company_id" : null,
    "company_name" : null,
    "company_registry" : null,
    "company_registry_label" : null,
    "company_type" : null,
    "complete_name" : null,
    "contact_address" : null,
    "contact_address_inline" : null,
    "country_id" : null,
    "create_date" : null,
    "create_employee" : null,
    "create_uid" : null,
    "credit" : null,
    "credit_limit" : null,
    "credit_to_invoice" : null,
    "customer_rank" : null,
    "days_sales_outstanding" : null,
    "debit" : null,
    "debit_limit" : null,
    "display_invoice_edi_format" : null,
    "display_invoice_template_pdf_report_id" : null,
    "duplicated_bank_account_partners_count" : null,
    "email" : null,
    "email_formatted" : null,
    "email_normalized" : null,
    "employee" : null,
    "employee_count" : null,
    "employees_count" : null,
    "fiscal_country_codes" : null,
    "function" : null,
    "gold_badge" : null,
    "groups_count" : null,
    "has_message" : null,
    "id" : null,
    "ignore_abnormal_invoice_amount" : null,
    "ignore_abnormal_invoice_date" : null,
    "im_status" : null,
    "industry_id" : null,
    "invoice_edi_format" : null,
    "invoice_edi_format_store" : null,
    "invoice_sending_method" : null,
    "invoice_warn" : null,
    "invoice_warn_msg" : null,
    "is_blacklisted" : null,
    "is_coa_installed" : null,
    "is_company" : null,
    "is_peppol_edi_format" : null,
    "is_public" : null,
    "is_system" : null,
    "is_ubl_format" : null,
    "journal_item_count" : null,
    "karma" : null,
    "login" : null,
    "meeting_count" : null,
    "message_attachment_count" : null,
    "message_bounce" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "mobile" : null,
    "mobile_blacklisted" : null,
    "my_activity_date_deadline" : null,
    "name" : null,
    "new_password" : null,
    "notification_type" : null,
    "odoobot_failed" : null,
    "odoobot_state" : null,
    "on_time_rate" : null,
    "opportunity_count" : null,
    "parent_id" : null,
    "partner_company_registry_placeholder" : null,
    "partner_gid" : null,
    "partner_id" : null,
    "partner_latitude" : null,
    "partner_longitude" : null,
    "partner_name" : null,
    "partner_share" : null,
    "partner_vat_placeholder" : null,
    "password" : null,
    "payment_token_count" : null,
    "peppol_eas" : null,
    "peppol_endpoint" : null,
    "phone" : null,
    "phone_blacklisted" : null,
    "phone_mobile_search" : null,
    "phone_sanitized" : null,
    "phone_sanitized_blacklisted" : null,
    "picking_warn" : null,
    "picking_warn_msg" : null,
    "plan_to_change_bike" : null,
    "plan_to_change_car" : null,
    "property_purchase_currency_id" : null,
    "purchase_order_count" : null,
    "purchase_warn" : null,
    "purchase_warn_msg" : null,
    "receipt_reminder_email" : null,
    "ref" : null,
    "reminder_date_before_receipt" : null,
    "request_overtime" : null,
    "rules_count" : null,
    "sale_order_count" : null,
    "sale_team_id" : null,
    "sale_warn" : null,
    "sale_warn_msg" : null,
    "share" : null,
    "show_credit_limit" : null,
    "signature" : null,
    "signup_type" : null,
    "silver_badge" : null,
    "state" : null,
    "state_id" : null,
    "street" : null,
    "street2" : null,
    "supplier_invoice_count" : null,
    "supplier_rank" : null,
    "target_sales_done" : null,
    "target_sales_invoiced" : null,
    "target_sales_won" : null,
    "task_count" : null,
    "total_invoiced" : null,
    "totp_enabled" : null,
    "totp_secret" : null,
    "tour_enabled" : null,
    "trust" : null,
    "type" : null,
    "tz" : null,
    "tz_offset" : null,
    "use_partner_credit_limit" : null,
    "user_group_warning" : null,
    "user_id" : null,
    "vat" : null,
    "vat_label" : null,
    "website" : null,
    "write_date" : null,
    "write_uid" : null,
    "zip" : null,
    "avatar128" : null,
    "image128" : null,
    "avatar512" : null,
    "image512" : null,
    "avatar256" : null,
    "image256" : null,
    "avatar1024" : null,
    "image1024" : null,
    "avatar" : null,
    "image" : null,
    "groups_users_rels" : null,
  }
]
```

## 未被使用的用户

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/fetch_unuse" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_calendar_default_privacy_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|日历默认隐私|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_notification_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|通知|
|<el-row justify="space-between"><el-col :span="20">n_odoobot_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|小秘书状态|
|<el-row justify="space-between"><el-col :span="20">n_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_sale_team_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|用户销售团队|
|<el-row justify="space-between"><el-col :span="20">n_share_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">n_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_calendar_default_privacy_eq" : null,
  "n_company_id_eq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_notification_type_eq" : null,
  "n_odoobot_state_eq" : null,
  "n_partner_id_eq" : null,
  "n_partner_name_eq" : null,
  "n_partner_name_like" : null,
  "n_sale_team_id_eq" : null,
  "n_share_eq" : null,
  "n_state_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "display_name" : null,
    "accesses_count" : null,
    "active" : null,
    "active_lang_count" : null,
    "activity_date_deadline" : null,
    "activity_exception_decoration" : null,
    "activity_exception_icon" : null,
    "activity_state" : null,
    "additional_info" : null,
    "autopost_bills" : null,
    "bank_account_count" : null,
    "barcode" : null,
    "bronze_badge" : null,
    "buyer_id" : null,
    "calendar_default_privacy" : null,
    "calendar_last_notif_ack" : null,
    "can_edit" : null,
    "certifications_company_count" : null,
    "certifications_count" : null,
    "city" : null,
    "color" : null,
    "comment" : null,
    "commercial_company_name" : null,
    "commercial_partner_id" : null,
    "companies_count" : null,
    "company_id" : null,
    "company_name" : null,
    "company_registry" : null,
    "company_registry_label" : null,
    "company_type" : null,
    "complete_name" : null,
    "contact_address" : null,
    "contact_address_inline" : null,
    "country_id" : null,
    "create_date" : null,
    "create_employee" : null,
    "create_uid" : null,
    "credit" : null,
    "credit_limit" : null,
    "credit_to_invoice" : null,
    "customer_rank" : null,
    "days_sales_outstanding" : null,
    "debit" : null,
    "debit_limit" : null,
    "display_invoice_edi_format" : null,
    "display_invoice_template_pdf_report_id" : null,
    "duplicated_bank_account_partners_count" : null,
    "email" : null,
    "email_formatted" : null,
    "email_normalized" : null,
    "employee" : null,
    "employee_count" : null,
    "employees_count" : null,
    "fiscal_country_codes" : null,
    "function" : null,
    "gold_badge" : null,
    "groups_count" : null,
    "has_message" : null,
    "id" : null,
    "ignore_abnormal_invoice_amount" : null,
    "ignore_abnormal_invoice_date" : null,
    "im_status" : null,
    "industry_id" : null,
    "invoice_edi_format" : null,
    "invoice_edi_format_store" : null,
    "invoice_sending_method" : null,
    "invoice_warn" : null,
    "invoice_warn_msg" : null,
    "is_blacklisted" : null,
    "is_coa_installed" : null,
    "is_company" : null,
    "is_peppol_edi_format" : null,
    "is_public" : null,
    "is_system" : null,
    "is_ubl_format" : null,
    "journal_item_count" : null,
    "karma" : null,
    "login" : null,
    "meeting_count" : null,
    "message_attachment_count" : null,
    "message_bounce" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "mobile" : null,
    "mobile_blacklisted" : null,
    "my_activity_date_deadline" : null,
    "name" : null,
    "new_password" : null,
    "notification_type" : null,
    "odoobot_failed" : null,
    "odoobot_state" : null,
    "on_time_rate" : null,
    "opportunity_count" : null,
    "parent_id" : null,
    "partner_company_registry_placeholder" : null,
    "partner_gid" : null,
    "partner_id" : null,
    "partner_latitude" : null,
    "partner_longitude" : null,
    "partner_name" : null,
    "partner_share" : null,
    "partner_vat_placeholder" : null,
    "password" : null,
    "payment_token_count" : null,
    "peppol_eas" : null,
    "peppol_endpoint" : null,
    "phone" : null,
    "phone_blacklisted" : null,
    "phone_mobile_search" : null,
    "phone_sanitized" : null,
    "phone_sanitized_blacklisted" : null,
    "picking_warn" : null,
    "picking_warn_msg" : null,
    "plan_to_change_bike" : null,
    "plan_to_change_car" : null,
    "property_purchase_currency_id" : null,
    "purchase_order_count" : null,
    "purchase_warn" : null,
    "purchase_warn_msg" : null,
    "receipt_reminder_email" : null,
    "ref" : null,
    "reminder_date_before_receipt" : null,
    "request_overtime" : null,
    "rules_count" : null,
    "sale_order_count" : null,
    "sale_team_id" : null,
    "sale_warn" : null,
    "sale_warn_msg" : null,
    "share" : null,
    "show_credit_limit" : null,
    "signature" : null,
    "signup_type" : null,
    "silver_badge" : null,
    "state" : null,
    "state_id" : null,
    "street" : null,
    "street2" : null,
    "supplier_invoice_count" : null,
    "supplier_rank" : null,
    "target_sales_done" : null,
    "target_sales_invoiced" : null,
    "target_sales_won" : null,
    "task_count" : null,
    "total_invoiced" : null,
    "totp_enabled" : null,
    "totp_secret" : null,
    "tour_enabled" : null,
    "trust" : null,
    "type" : null,
    "tz" : null,
    "tz_offset" : null,
    "use_partner_credit_limit" : null,
    "user_group_warning" : null,
    "user_id" : null,
    "vat" : null,
    "vat_label" : null,
    "website" : null,
    "write_date" : null,
    "write_uid" : null,
    "zip" : null,
    "avatar128" : null,
    "image128" : null,
    "avatar512" : null,
    "image512" : null,
    "avatar256" : null,
    "image256" : null,
    "avatar1024" : null,
    "image1024" : null,
    "avatar" : null,
    "image" : null,
    "groups_users_rels" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/exportdata/{param},/res_users/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/report" type="info" :closable="false" ></el-alert>
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