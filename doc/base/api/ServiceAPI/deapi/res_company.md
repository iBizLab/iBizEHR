# 公司(res_company) :id=res_company
## 创建公司

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">absence_management</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺勤管理|
|<el-row justify="space-between"><el-col :span="20">account_fiscal_country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区|
|<el-row justify="space-between"><el-col :span="20">account_opening_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|期初分录|
|<el-row justify="space-between"><el-col :span="20">account_price_include</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Sales Price Include|
|<el-row justify="space-between"><el-col :span="20">account_storno</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Storno会计应用程序|
|<el-row justify="space-between"><el-col :span="20">account_use_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售信用额度|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件域名|
|<el-row justify="space-between"><el-col :span="20">anglo_saxon_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用盎格鲁撒克逊会计|
|<el-row justify="space-between"><el-col :span="20">annual_inventory_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日期|
|<el-row justify="space-between"><el-col :span="20">annual_inventory_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年度库存月|
|<el-row justify="space-between"><el-col :span="20">attendance_barcode_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">attendance_from_systray</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|来自 Systray 的出席情况|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_delay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自助考勤终端延迟|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端密钥|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端网址|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_use_pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工PIN|
|<el-row justify="space-between"><el-col :span="20">attendance_overtime_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">auto_check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动签退|
|<el-row justify="space-between"><el-col :span="20">auto_check_out_tolerance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|null|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动验证账单|
|<el-row justify="space-between"><el-col :span="20">bank_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the bank accounts|
|<el-row justify="space-between"><el-col :span="20">batch_payment_sequence_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Batch Payment Sequence|
|<el-row justify="space-between"><el-col :span="20">bounce_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退件电子邮件|
|<el-row justify="space-between"><el-col :span="20">bounce_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退回|
|<el-row justify="space-between"><el-col :span="20">candidate_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人属性|
|<el-row justify="space-between"><el-col :span="20">cash_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the cash accounts|
|<el-row justify="space-between"><el-col :span="20">catchall_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设邮件|
|<el-row justify="space-between"><el-col :span="20">catchall_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设|
|<el-row justify="space-between"><el-col :span="20">check_account_audit_trail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计跟踪|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">company_details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司详情|
|<el-row justify="space-between"><el-col :span="20">company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">company_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司增值税占位符|
|<el-row justify="space-between"><el-col :span="20">contract_expiration_notice_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同到期通知期|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">currency_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">days_to_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|采购前置天数|
|<el-row justify="space-between"><el-col :span="20">display_invoice_amount_total_words</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|大写发票总额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_tax_company_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|税款以公司币别表示|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化的邮件|
|<el-row justify="space-between"><el-col :span="20">email_primary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件标题颜色|
|<el-row justify="space-between"><el-col :span="20">email_secondary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件按钮颜色|
|<el-row justify="space-between"><el-col :span="20">employee_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工属性|
|<el-row justify="space-between"><el-col :span="20">expects_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Expects a Chart of Accounts|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_last_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计年度最后一天|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_last_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计年度最后一个月|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|全球锁定日期|
|<el-row justify="space-between"><el-col :span="20">font</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字体|
|<el-row justify="space-between"><el-col :span="20">hard_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|硬锁定日期|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">has_received_warning_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已收到库存警告短信息|
|<el-row justify="space-between"><el-col :span="20">hr_attendance_display_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示额外时间|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_attendance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据出勤率|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据发送的电子邮件数量|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_email_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 要发送的电子邮件|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_ip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于IP地址|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_ip_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|有效的IP地址|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_login</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于系统中的用户状态|
|<el-row justify="space-between"><el-col :span="20">iap_enrich_auto_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|丰富完成|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Terms and Conditions|
|<el-row justify="space-between"><el-col :span="20">invoice_terms_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Terms and Conditions as a Web page|
|<el-row justify="space-between"><el-col :span="20">is_company_details_empty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司详细信息是否为空|
|<el-row justify="space-between"><el-col :span="20">job_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位属性|
|<el-row justify="space-between"><el-col :span="20">layout_background</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局背景|
|<el-row justify="space-between"><el-col :span="20">manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|制造提前期|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Attachment Count|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Message Delivery error|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级路径|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">payment_onboarding_payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|选择支付方式|
|<el-row justify="space-between"><el-col :span="20">po_double_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|批准等级|
|<el-row justify="space-between"><el-col :span="20">po_double_validation_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|再次验证金额|
|<el-row justify="space-between"><el-col :span="20">po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|采购提前期|
|<el-row justify="space-between"><el-col :span="20">po_lock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单修改|
|<el-row justify="space-between"><el-col :span="20">portal_confirmation_pay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上付款|
|<el-row justify="space-between"><el-col :span="20">portal_confirmation_sign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上签署|
|<el-row justify="space-between"><el-col :span="20">prepayment_percent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预付百分比|
|<el-row justify="space-between"><el-col :span="20">primary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|原色|
|<el-row justify="space-between"><el-col :span="20">purchase_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|采购锁定日期|
|<el-row justify="space-between"><el-col :span="20">qr_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display QR-code on invoices|
|<el-row justify="space-between"><el-col :span="20">quick_edit_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|快速编码|
|<el-row justify="space-between"><el-col :span="20">quotation_validity_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认报价有效期|
|<el-row justify="space-between"><el-col :span="20">report_footer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报告页脚|
|<el-row justify="space-between"><el-col :span="20">report_header</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司标语|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认工作时间|
|<el-row justify="space-between"><el-col :span="20">sale_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售锁定日期|
|<el-row justify="space-between"><el-col :span="20">sale_onboarding_payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售入门选择的付款方式|
|<el-row justify="space-between"><el-col :span="20">secondary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|次要颜色|
|<el-row justify="space-between"><el-col :span="20">security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售安全天数|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">snailmail_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实体邮寄颜色|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|添加一个封面页|
|<el-row justify="space-between"><el-col :span="20">snailmail_duplex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双面|
|<el-row justify="space-between"><el-col :span="20">social_facebook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Facebook 账户|
|<el-row justify="space-between"><el-col :span="20">social_github</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|GitHub账户|
|<el-row justify="space-between"><el-col :span="20">social_instagram</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Instagram 账号|
|<el-row justify="space-between"><el-col :span="20">social_linkedin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|领英账号|
|<el-row justify="space-between"><el-col :span="20">social_tiktok</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|TikTok / 抖音账号|
|<el-row justify="space-between"><el-col :span="20">social_twitter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|X 账户|
|<el-row justify="space-between"><el-col :span="20">social_youtube</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Youtube账号|
|<el-row justify="space-between"><el-col :span="20">stock_mail_confirmation_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|确认拣货邮件模版|
|<el-row justify="space-between"><el-col :span="20">stock_move_email_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件确认拣货|
|<el-row justify="space-between"><el-col :span="20">stock_move_sms_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">tax_calculation_rounding_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tax Calculation Rounding Method|
|<el-row justify="space-between"><el-col :span="20">tax_exigibility</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采用现金收付|
|<el-row justify="space-between"><el-col :span="20">tax_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|纳税申报表锁定日期|
|<el-row justify="space-between"><el-col :span="20">terms_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Terms & Conditions format|
|<el-row justify="space-between"><el-col :span="20">transfer_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the transfer accounts|
|<el-row justify="space-between"><el-col :span="20">user_fiscalyear_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户财政年度锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_hard_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户硬性锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_purchase_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户采购锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_sale_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户销售锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_tax_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|User Tax Lock Date|
|<el-row justify="space-between"><el-col :span="20">uses_default_logo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用默认徽标|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_notice_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可证到期通知期|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_management" : null,
  "account_fiscal_country_id" : null,
  "account_opening_date" : null,
  "account_price_include" : null,
  "account_storno" : null,
  "account_use_credit_limit" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "alias_domain_id" : null,
  "anglo_saxon_accounting" : null,
  "annual_inventory_day" : null,
  "annual_inventory_month" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_kiosk_delay" : null,
  "attendance_kiosk_key" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_use_pin" : null,
  "attendance_overtime_validation" : null,
  "auto_check_out" : null,
  "auto_check_out_tolerance" : null,
  "autopost_bills" : null,
  "bank_account_code_prefix" : null,
  "batch_payment_sequence_id" : null,
  "bounce_email" : null,
  "bounce_formatted" : null,
  "candidate_properties_definition" : null,
  "cash_account_code_prefix" : null,
  "catchall_email" : null,
  "catchall_formatted" : null,
  "check_account_audit_trail" : null,
  "city" : null,
  "color" : null,
  "company_details" : null,
  "company_registry_placeholder" : null,
  "company_vat_placeholder" : null,
  "contract_expiration_notice_period" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "currency_name" : null,
  "days_to_purchase" : null,
  "display_invoice_amount_total_words" : null,
  "display_invoice_tax_company_currency" : null,
  "display_name" : null,
  "email_formatted" : null,
  "email_primary_color" : null,
  "email_secondary_color" : null,
  "employee_properties_definition" : null,
  "expects_chart_of_accounts" : null,
  "fiscalyear_last_day" : null,
  "fiscalyear_last_month" : null,
  "fiscalyear_lock_date" : null,
  "font" : null,
  "hard_lock_date" : null,
  "has_message" : null,
  "has_received_warning_stock_sms" : null,
  "hr_attendance_display_overtime" : null,
  "hr_presence_control_attendance" : null,
  "hr_presence_control_email" : null,
  "hr_presence_control_email_amount" : null,
  "hr_presence_control_ip" : null,
  "hr_presence_control_ip_list" : null,
  "hr_presence_control_login" : null,
  "iap_enrich_auto_done" : null,
  "id" : null,
  "invoice_terms" : null,
  "invoice_terms_html" : null,
  "is_company_details_empty" : null,
  "job_properties_definition" : null,
  "layout_background" : null,
  "manufacturing_lead" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "partner_id" : null,
  "partner_name" : null,
  "payment_onboarding_payment_method" : null,
  "po_double_validation" : null,
  "po_double_validation_amount" : null,
  "po_lead" : null,
  "po_lock" : null,
  "portal_confirmation_pay" : null,
  "portal_confirmation_sign" : null,
  "prepayment_percent" : null,
  "primary_color" : null,
  "purchase_lock_date" : null,
  "qr_code" : null,
  "quick_edit_mode" : null,
  "quotation_validity_days" : null,
  "report_footer" : null,
  "report_header" : null,
  "resource_calendar_id" : null,
  "sale_lock_date" : null,
  "sale_onboarding_payment_method" : null,
  "secondary_color" : null,
  "security_lead" : null,
  "sequence" : null,
  "snailmail_color" : null,
  "snailmail_cover" : null,
  "snailmail_duplex" : null,
  "social_facebook" : null,
  "social_github" : null,
  "social_instagram" : null,
  "social_linkedin" : null,
  "social_tiktok" : null,
  "social_twitter" : null,
  "social_youtube" : null,
  "stock_mail_confirmation_template_id" : null,
  "stock_move_email_validation" : null,
  "stock_move_sms_validation" : null,
  "street" : null,
  "street2" : null,
  "tax_calculation_rounding_method" : null,
  "tax_exigibility" : null,
  "tax_lock_date" : null,
  "terms_type" : null,
  "transfer_account_code_prefix" : null,
  "user_fiscalyear_lock_date" : null,
  "user_hard_lock_date" : null,
  "user_purchase_lock_date" : null,
  "user_sale_lock_date" : null,
  "user_tax_lock_date" : null,
  "uses_default_logo" : null,
  "work_permit_expiration_notice_period" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_management" : null,
  "account_fiscal_country_id" : null,
  "account_opening_date" : null,
  "account_price_include" : null,
  "account_storno" : null,
  "account_use_credit_limit" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "alias_domain_id" : null,
  "anglo_saxon_accounting" : null,
  "annual_inventory_day" : null,
  "annual_inventory_month" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_kiosk_delay" : null,
  "attendance_kiosk_key" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_use_pin" : null,
  "attendance_overtime_validation" : null,
  "auto_check_out" : null,
  "auto_check_out_tolerance" : null,
  "autopost_bills" : null,
  "bank_account_code_prefix" : null,
  "batch_payment_sequence_id" : null,
  "bounce_email" : null,
  "bounce_formatted" : null,
  "candidate_properties_definition" : null,
  "cash_account_code_prefix" : null,
  "catchall_email" : null,
  "catchall_formatted" : null,
  "check_account_audit_trail" : null,
  "city" : null,
  "color" : null,
  "company_details" : null,
  "company_registry_placeholder" : null,
  "company_vat_placeholder" : null,
  "contract_expiration_notice_period" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "currency_name" : null,
  "days_to_purchase" : null,
  "display_invoice_amount_total_words" : null,
  "display_invoice_tax_company_currency" : null,
  "display_name" : null,
  "email_formatted" : null,
  "email_primary_color" : null,
  "email_secondary_color" : null,
  "employee_properties_definition" : null,
  "expects_chart_of_accounts" : null,
  "fiscalyear_last_day" : null,
  "fiscalyear_last_month" : null,
  "fiscalyear_lock_date" : null,
  "font" : null,
  "hard_lock_date" : null,
  "has_message" : null,
  "has_received_warning_stock_sms" : null,
  "hr_attendance_display_overtime" : null,
  "hr_presence_control_attendance" : null,
  "hr_presence_control_email" : null,
  "hr_presence_control_email_amount" : null,
  "hr_presence_control_ip" : null,
  "hr_presence_control_ip_list" : null,
  "hr_presence_control_login" : null,
  "iap_enrich_auto_done" : null,
  "id" : null,
  "invoice_terms" : null,
  "invoice_terms_html" : null,
  "is_company_details_empty" : null,
  "job_properties_definition" : null,
  "layout_background" : null,
  "manufacturing_lead" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "partner_id" : null,
  "partner_name" : null,
  "payment_onboarding_payment_method" : null,
  "po_double_validation" : null,
  "po_double_validation_amount" : null,
  "po_lead" : null,
  "po_lock" : null,
  "portal_confirmation_pay" : null,
  "portal_confirmation_sign" : null,
  "prepayment_percent" : null,
  "primary_color" : null,
  "purchase_lock_date" : null,
  "qr_code" : null,
  "quick_edit_mode" : null,
  "quotation_validity_days" : null,
  "report_footer" : null,
  "report_header" : null,
  "resource_calendar_id" : null,
  "sale_lock_date" : null,
  "sale_onboarding_payment_method" : null,
  "secondary_color" : null,
  "security_lead" : null,
  "sequence" : null,
  "snailmail_color" : null,
  "snailmail_cover" : null,
  "snailmail_duplex" : null,
  "social_facebook" : null,
  "social_github" : null,
  "social_instagram" : null,
  "social_linkedin" : null,
  "social_tiktok" : null,
  "social_twitter" : null,
  "social_youtube" : null,
  "stock_mail_confirmation_template_id" : null,
  "stock_move_email_validation" : null,
  "stock_move_sms_validation" : null,
  "street" : null,
  "street2" : null,
  "tax_calculation_rounding_method" : null,
  "tax_exigibility" : null,
  "tax_lock_date" : null,
  "terms_type" : null,
  "transfer_account_code_prefix" : null,
  "user_fiscalyear_lock_date" : null,
  "user_hard_lock_date" : null,
  "user_purchase_lock_date" : null,
  "user_sale_lock_date" : null,
  "user_tax_lock_date" : null,
  "uses_default_logo" : null,
  "work_permit_expiration_notice_period" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
}

```

## 获取公司

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/{key}" type="info" :closable="false" ></el-alert>
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
  "absence_management" : null,
  "account_fiscal_country_id" : null,
  "account_opening_date" : null,
  "account_price_include" : null,
  "account_storno" : null,
  "account_use_credit_limit" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "alias_domain_id" : null,
  "anglo_saxon_accounting" : null,
  "annual_inventory_day" : null,
  "annual_inventory_month" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_kiosk_delay" : null,
  "attendance_kiosk_key" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_use_pin" : null,
  "attendance_overtime_validation" : null,
  "auto_check_out" : null,
  "auto_check_out_tolerance" : null,
  "autopost_bills" : null,
  "bank_account_code_prefix" : null,
  "batch_payment_sequence_id" : null,
  "bounce_email" : null,
  "bounce_formatted" : null,
  "candidate_properties_definition" : null,
  "cash_account_code_prefix" : null,
  "catchall_email" : null,
  "catchall_formatted" : null,
  "check_account_audit_trail" : null,
  "city" : null,
  "color" : null,
  "company_details" : null,
  "company_registry_placeholder" : null,
  "company_vat_placeholder" : null,
  "contract_expiration_notice_period" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "currency_name" : null,
  "days_to_purchase" : null,
  "display_invoice_amount_total_words" : null,
  "display_invoice_tax_company_currency" : null,
  "display_name" : null,
  "email_formatted" : null,
  "email_primary_color" : null,
  "email_secondary_color" : null,
  "employee_properties_definition" : null,
  "expects_chart_of_accounts" : null,
  "fiscalyear_last_day" : null,
  "fiscalyear_last_month" : null,
  "fiscalyear_lock_date" : null,
  "font" : null,
  "hard_lock_date" : null,
  "has_message" : null,
  "has_received_warning_stock_sms" : null,
  "hr_attendance_display_overtime" : null,
  "hr_presence_control_attendance" : null,
  "hr_presence_control_email" : null,
  "hr_presence_control_email_amount" : null,
  "hr_presence_control_ip" : null,
  "hr_presence_control_ip_list" : null,
  "hr_presence_control_login" : null,
  "iap_enrich_auto_done" : null,
  "id" : null,
  "invoice_terms" : null,
  "invoice_terms_html" : null,
  "is_company_details_empty" : null,
  "job_properties_definition" : null,
  "layout_background" : null,
  "manufacturing_lead" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "partner_id" : null,
  "partner_name" : null,
  "payment_onboarding_payment_method" : null,
  "po_double_validation" : null,
  "po_double_validation_amount" : null,
  "po_lead" : null,
  "po_lock" : null,
  "portal_confirmation_pay" : null,
  "portal_confirmation_sign" : null,
  "prepayment_percent" : null,
  "primary_color" : null,
  "purchase_lock_date" : null,
  "qr_code" : null,
  "quick_edit_mode" : null,
  "quotation_validity_days" : null,
  "report_footer" : null,
  "report_header" : null,
  "resource_calendar_id" : null,
  "sale_lock_date" : null,
  "sale_onboarding_payment_method" : null,
  "secondary_color" : null,
  "security_lead" : null,
  "sequence" : null,
  "snailmail_color" : null,
  "snailmail_cover" : null,
  "snailmail_duplex" : null,
  "social_facebook" : null,
  "social_github" : null,
  "social_instagram" : null,
  "social_linkedin" : null,
  "social_tiktok" : null,
  "social_twitter" : null,
  "social_youtube" : null,
  "stock_mail_confirmation_template_id" : null,
  "stock_move_email_validation" : null,
  "stock_move_sms_validation" : null,
  "street" : null,
  "street2" : null,
  "tax_calculation_rounding_method" : null,
  "tax_exigibility" : null,
  "tax_lock_date" : null,
  "terms_type" : null,
  "transfer_account_code_prefix" : null,
  "user_fiscalyear_lock_date" : null,
  "user_hard_lock_date" : null,
  "user_purchase_lock_date" : null,
  "user_sale_lock_date" : null,
  "user_tax_lock_date" : null,
  "uses_default_logo" : null,
  "work_permit_expiration_notice_period" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
}

```

## 删除公司

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新公司

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">absence_management</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺勤管理|
|<el-row justify="space-between"><el-col :span="20">account_fiscal_country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区|
|<el-row justify="space-between"><el-col :span="20">account_opening_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|期初分录|
|<el-row justify="space-between"><el-col :span="20">account_price_include</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Sales Price Include|
|<el-row justify="space-between"><el-col :span="20">account_storno</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Storno会计应用程序|
|<el-row justify="space-between"><el-col :span="20">account_use_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售信用额度|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件域名|
|<el-row justify="space-between"><el-col :span="20">anglo_saxon_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用盎格鲁撒克逊会计|
|<el-row justify="space-between"><el-col :span="20">annual_inventory_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日期|
|<el-row justify="space-between"><el-col :span="20">annual_inventory_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年度库存月|
|<el-row justify="space-between"><el-col :span="20">attendance_barcode_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">attendance_from_systray</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|来自 Systray 的出席情况|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_delay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自助考勤终端延迟|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端密钥|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端网址|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_use_pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工PIN|
|<el-row justify="space-between"><el-col :span="20">attendance_overtime_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">auto_check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动签退|
|<el-row justify="space-between"><el-col :span="20">auto_check_out_tolerance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|null|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动验证账单|
|<el-row justify="space-between"><el-col :span="20">bank_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the bank accounts|
|<el-row justify="space-between"><el-col :span="20">batch_payment_sequence_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Batch Payment Sequence|
|<el-row justify="space-between"><el-col :span="20">bounce_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退件电子邮件|
|<el-row justify="space-between"><el-col :span="20">bounce_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退回|
|<el-row justify="space-between"><el-col :span="20">candidate_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人属性|
|<el-row justify="space-between"><el-col :span="20">cash_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the cash accounts|
|<el-row justify="space-between"><el-col :span="20">catchall_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设邮件|
|<el-row justify="space-between"><el-col :span="20">catchall_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设|
|<el-row justify="space-between"><el-col :span="20">check_account_audit_trail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计跟踪|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">company_details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司详情|
|<el-row justify="space-between"><el-col :span="20">company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">company_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司增值税占位符|
|<el-row justify="space-between"><el-col :span="20">contract_expiration_notice_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同到期通知期|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">currency_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">days_to_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|采购前置天数|
|<el-row justify="space-between"><el-col :span="20">display_invoice_amount_total_words</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|大写发票总额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_tax_company_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|税款以公司币别表示|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化的邮件|
|<el-row justify="space-between"><el-col :span="20">email_primary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件标题颜色|
|<el-row justify="space-between"><el-col :span="20">email_secondary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件按钮颜色|
|<el-row justify="space-between"><el-col :span="20">employee_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工属性|
|<el-row justify="space-between"><el-col :span="20">expects_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Expects a Chart of Accounts|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_last_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计年度最后一天|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_last_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计年度最后一个月|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|全球锁定日期|
|<el-row justify="space-between"><el-col :span="20">font</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字体|
|<el-row justify="space-between"><el-col :span="20">hard_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|硬锁定日期|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">has_received_warning_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已收到库存警告短信息|
|<el-row justify="space-between"><el-col :span="20">hr_attendance_display_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示额外时间|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_attendance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据出勤率|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据发送的电子邮件数量|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_email_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 要发送的电子邮件|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_ip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于IP地址|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_ip_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|有效的IP地址|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_login</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于系统中的用户状态|
|<el-row justify="space-between"><el-col :span="20">iap_enrich_auto_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|丰富完成|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Terms and Conditions|
|<el-row justify="space-between"><el-col :span="20">invoice_terms_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Terms and Conditions as a Web page|
|<el-row justify="space-between"><el-col :span="20">is_company_details_empty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司详细信息是否为空|
|<el-row justify="space-between"><el-col :span="20">job_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位属性|
|<el-row justify="space-between"><el-col :span="20">layout_background</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局背景|
|<el-row justify="space-between"><el-col :span="20">manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|制造提前期|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Attachment Count|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Message Delivery error|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级路径|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">payment_onboarding_payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|选择支付方式|
|<el-row justify="space-between"><el-col :span="20">po_double_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|批准等级|
|<el-row justify="space-between"><el-col :span="20">po_double_validation_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|再次验证金额|
|<el-row justify="space-between"><el-col :span="20">po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|采购提前期|
|<el-row justify="space-between"><el-col :span="20">po_lock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单修改|
|<el-row justify="space-between"><el-col :span="20">portal_confirmation_pay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上付款|
|<el-row justify="space-between"><el-col :span="20">portal_confirmation_sign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上签署|
|<el-row justify="space-between"><el-col :span="20">prepayment_percent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预付百分比|
|<el-row justify="space-between"><el-col :span="20">primary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|原色|
|<el-row justify="space-between"><el-col :span="20">purchase_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|采购锁定日期|
|<el-row justify="space-between"><el-col :span="20">qr_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display QR-code on invoices|
|<el-row justify="space-between"><el-col :span="20">quick_edit_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|快速编码|
|<el-row justify="space-between"><el-col :span="20">quotation_validity_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认报价有效期|
|<el-row justify="space-between"><el-col :span="20">report_footer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报告页脚|
|<el-row justify="space-between"><el-col :span="20">report_header</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司标语|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认工作时间|
|<el-row justify="space-between"><el-col :span="20">sale_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售锁定日期|
|<el-row justify="space-between"><el-col :span="20">sale_onboarding_payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售入门选择的付款方式|
|<el-row justify="space-between"><el-col :span="20">secondary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|次要颜色|
|<el-row justify="space-between"><el-col :span="20">security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售安全天数|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">snailmail_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实体邮寄颜色|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|添加一个封面页|
|<el-row justify="space-between"><el-col :span="20">snailmail_duplex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双面|
|<el-row justify="space-between"><el-col :span="20">social_facebook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Facebook 账户|
|<el-row justify="space-between"><el-col :span="20">social_github</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|GitHub账户|
|<el-row justify="space-between"><el-col :span="20">social_instagram</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Instagram 账号|
|<el-row justify="space-between"><el-col :span="20">social_linkedin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|领英账号|
|<el-row justify="space-between"><el-col :span="20">social_tiktok</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|TikTok / 抖音账号|
|<el-row justify="space-between"><el-col :span="20">social_twitter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|X 账户|
|<el-row justify="space-between"><el-col :span="20">social_youtube</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Youtube账号|
|<el-row justify="space-between"><el-col :span="20">stock_mail_confirmation_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|确认拣货邮件模版|
|<el-row justify="space-between"><el-col :span="20">stock_move_email_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件确认拣货|
|<el-row justify="space-between"><el-col :span="20">stock_move_sms_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">tax_calculation_rounding_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tax Calculation Rounding Method|
|<el-row justify="space-between"><el-col :span="20">tax_exigibility</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采用现金收付|
|<el-row justify="space-between"><el-col :span="20">tax_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|纳税申报表锁定日期|
|<el-row justify="space-between"><el-col :span="20">terms_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Terms & Conditions format|
|<el-row justify="space-between"><el-col :span="20">transfer_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the transfer accounts|
|<el-row justify="space-between"><el-col :span="20">user_fiscalyear_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户财政年度锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_hard_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户硬性锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_purchase_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户采购锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_sale_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户销售锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_tax_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|User Tax Lock Date|
|<el-row justify="space-between"><el-col :span="20">uses_default_logo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用默认徽标|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_notice_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可证到期通知期|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_management" : null,
  "account_fiscal_country_id" : null,
  "account_opening_date" : null,
  "account_price_include" : null,
  "account_storno" : null,
  "account_use_credit_limit" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "alias_domain_id" : null,
  "anglo_saxon_accounting" : null,
  "annual_inventory_day" : null,
  "annual_inventory_month" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_kiosk_delay" : null,
  "attendance_kiosk_key" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_use_pin" : null,
  "attendance_overtime_validation" : null,
  "auto_check_out" : null,
  "auto_check_out_tolerance" : null,
  "autopost_bills" : null,
  "bank_account_code_prefix" : null,
  "batch_payment_sequence_id" : null,
  "bounce_email" : null,
  "bounce_formatted" : null,
  "candidate_properties_definition" : null,
  "cash_account_code_prefix" : null,
  "catchall_email" : null,
  "catchall_formatted" : null,
  "check_account_audit_trail" : null,
  "city" : null,
  "color" : null,
  "company_details" : null,
  "company_registry_placeholder" : null,
  "company_vat_placeholder" : null,
  "contract_expiration_notice_period" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "currency_name" : null,
  "days_to_purchase" : null,
  "display_invoice_amount_total_words" : null,
  "display_invoice_tax_company_currency" : null,
  "display_name" : null,
  "email_formatted" : null,
  "email_primary_color" : null,
  "email_secondary_color" : null,
  "employee_properties_definition" : null,
  "expects_chart_of_accounts" : null,
  "fiscalyear_last_day" : null,
  "fiscalyear_last_month" : null,
  "fiscalyear_lock_date" : null,
  "font" : null,
  "hard_lock_date" : null,
  "has_message" : null,
  "has_received_warning_stock_sms" : null,
  "hr_attendance_display_overtime" : null,
  "hr_presence_control_attendance" : null,
  "hr_presence_control_email" : null,
  "hr_presence_control_email_amount" : null,
  "hr_presence_control_ip" : null,
  "hr_presence_control_ip_list" : null,
  "hr_presence_control_login" : null,
  "iap_enrich_auto_done" : null,
  "id" : null,
  "invoice_terms" : null,
  "invoice_terms_html" : null,
  "is_company_details_empty" : null,
  "job_properties_definition" : null,
  "layout_background" : null,
  "manufacturing_lead" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "partner_id" : null,
  "partner_name" : null,
  "payment_onboarding_payment_method" : null,
  "po_double_validation" : null,
  "po_double_validation_amount" : null,
  "po_lead" : null,
  "po_lock" : null,
  "portal_confirmation_pay" : null,
  "portal_confirmation_sign" : null,
  "prepayment_percent" : null,
  "primary_color" : null,
  "purchase_lock_date" : null,
  "qr_code" : null,
  "quick_edit_mode" : null,
  "quotation_validity_days" : null,
  "report_footer" : null,
  "report_header" : null,
  "resource_calendar_id" : null,
  "sale_lock_date" : null,
  "sale_onboarding_payment_method" : null,
  "secondary_color" : null,
  "security_lead" : null,
  "sequence" : null,
  "snailmail_color" : null,
  "snailmail_cover" : null,
  "snailmail_duplex" : null,
  "social_facebook" : null,
  "social_github" : null,
  "social_instagram" : null,
  "social_linkedin" : null,
  "social_tiktok" : null,
  "social_twitter" : null,
  "social_youtube" : null,
  "stock_mail_confirmation_template_id" : null,
  "stock_move_email_validation" : null,
  "stock_move_sms_validation" : null,
  "street" : null,
  "street2" : null,
  "tax_calculation_rounding_method" : null,
  "tax_exigibility" : null,
  "tax_lock_date" : null,
  "terms_type" : null,
  "transfer_account_code_prefix" : null,
  "user_fiscalyear_lock_date" : null,
  "user_hard_lock_date" : null,
  "user_purchase_lock_date" : null,
  "user_sale_lock_date" : null,
  "user_tax_lock_date" : null,
  "uses_default_logo" : null,
  "work_permit_expiration_notice_period" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_management" : null,
  "account_fiscal_country_id" : null,
  "account_opening_date" : null,
  "account_price_include" : null,
  "account_storno" : null,
  "account_use_credit_limit" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "alias_domain_id" : null,
  "anglo_saxon_accounting" : null,
  "annual_inventory_day" : null,
  "annual_inventory_month" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_kiosk_delay" : null,
  "attendance_kiosk_key" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_use_pin" : null,
  "attendance_overtime_validation" : null,
  "auto_check_out" : null,
  "auto_check_out_tolerance" : null,
  "autopost_bills" : null,
  "bank_account_code_prefix" : null,
  "batch_payment_sequence_id" : null,
  "bounce_email" : null,
  "bounce_formatted" : null,
  "candidate_properties_definition" : null,
  "cash_account_code_prefix" : null,
  "catchall_email" : null,
  "catchall_formatted" : null,
  "check_account_audit_trail" : null,
  "city" : null,
  "color" : null,
  "company_details" : null,
  "company_registry_placeholder" : null,
  "company_vat_placeholder" : null,
  "contract_expiration_notice_period" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "currency_name" : null,
  "days_to_purchase" : null,
  "display_invoice_amount_total_words" : null,
  "display_invoice_tax_company_currency" : null,
  "display_name" : null,
  "email_formatted" : null,
  "email_primary_color" : null,
  "email_secondary_color" : null,
  "employee_properties_definition" : null,
  "expects_chart_of_accounts" : null,
  "fiscalyear_last_day" : null,
  "fiscalyear_last_month" : null,
  "fiscalyear_lock_date" : null,
  "font" : null,
  "hard_lock_date" : null,
  "has_message" : null,
  "has_received_warning_stock_sms" : null,
  "hr_attendance_display_overtime" : null,
  "hr_presence_control_attendance" : null,
  "hr_presence_control_email" : null,
  "hr_presence_control_email_amount" : null,
  "hr_presence_control_ip" : null,
  "hr_presence_control_ip_list" : null,
  "hr_presence_control_login" : null,
  "iap_enrich_auto_done" : null,
  "id" : null,
  "invoice_terms" : null,
  "invoice_terms_html" : null,
  "is_company_details_empty" : null,
  "job_properties_definition" : null,
  "layout_background" : null,
  "manufacturing_lead" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "partner_id" : null,
  "partner_name" : null,
  "payment_onboarding_payment_method" : null,
  "po_double_validation" : null,
  "po_double_validation_amount" : null,
  "po_lead" : null,
  "po_lock" : null,
  "portal_confirmation_pay" : null,
  "portal_confirmation_sign" : null,
  "prepayment_percent" : null,
  "primary_color" : null,
  "purchase_lock_date" : null,
  "qr_code" : null,
  "quick_edit_mode" : null,
  "quotation_validity_days" : null,
  "report_footer" : null,
  "report_header" : null,
  "resource_calendar_id" : null,
  "sale_lock_date" : null,
  "sale_onboarding_payment_method" : null,
  "secondary_color" : null,
  "security_lead" : null,
  "sequence" : null,
  "snailmail_color" : null,
  "snailmail_cover" : null,
  "snailmail_duplex" : null,
  "social_facebook" : null,
  "social_github" : null,
  "social_instagram" : null,
  "social_linkedin" : null,
  "social_tiktok" : null,
  "social_twitter" : null,
  "social_youtube" : null,
  "stock_mail_confirmation_template_id" : null,
  "stock_move_email_validation" : null,
  "stock_move_sms_validation" : null,
  "street" : null,
  "street2" : null,
  "tax_calculation_rounding_method" : null,
  "tax_exigibility" : null,
  "tax_lock_date" : null,
  "terms_type" : null,
  "transfer_account_code_prefix" : null,
  "user_fiscalyear_lock_date" : null,
  "user_hard_lock_date" : null,
  "user_purchase_lock_date" : null,
  "user_sale_lock_date" : null,
  "user_tax_lock_date" : null,
  "uses_default_logo" : null,
  "work_permit_expiration_notice_period" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
}

```

## 检查公司主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">absence_management</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺勤管理|
|<el-row justify="space-between"><el-col :span="20">account_fiscal_country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区|
|<el-row justify="space-between"><el-col :span="20">account_opening_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|期初分录|
|<el-row justify="space-between"><el-col :span="20">account_price_include</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Sales Price Include|
|<el-row justify="space-between"><el-col :span="20">account_storno</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Storno会计应用程序|
|<el-row justify="space-between"><el-col :span="20">account_use_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售信用额度|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件域名|
|<el-row justify="space-between"><el-col :span="20">anglo_saxon_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用盎格鲁撒克逊会计|
|<el-row justify="space-between"><el-col :span="20">annual_inventory_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日期|
|<el-row justify="space-between"><el-col :span="20">annual_inventory_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年度库存月|
|<el-row justify="space-between"><el-col :span="20">attendance_barcode_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">attendance_from_systray</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|来自 Systray 的出席情况|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_delay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自助考勤终端延迟|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端密钥|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端网址|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_use_pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工PIN|
|<el-row justify="space-between"><el-col :span="20">attendance_overtime_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">auto_check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动签退|
|<el-row justify="space-between"><el-col :span="20">auto_check_out_tolerance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|null|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动验证账单|
|<el-row justify="space-between"><el-col :span="20">bank_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the bank accounts|
|<el-row justify="space-between"><el-col :span="20">batch_payment_sequence_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Batch Payment Sequence|
|<el-row justify="space-between"><el-col :span="20">bounce_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退件电子邮件|
|<el-row justify="space-between"><el-col :span="20">bounce_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退回|
|<el-row justify="space-between"><el-col :span="20">candidate_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人属性|
|<el-row justify="space-between"><el-col :span="20">cash_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the cash accounts|
|<el-row justify="space-between"><el-col :span="20">catchall_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设邮件|
|<el-row justify="space-between"><el-col :span="20">catchall_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设|
|<el-row justify="space-between"><el-col :span="20">check_account_audit_trail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计跟踪|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">company_details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司详情|
|<el-row justify="space-between"><el-col :span="20">company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">company_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司增值税占位符|
|<el-row justify="space-between"><el-col :span="20">contract_expiration_notice_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同到期通知期|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">currency_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">days_to_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|采购前置天数|
|<el-row justify="space-between"><el-col :span="20">display_invoice_amount_total_words</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|大写发票总额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_tax_company_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|税款以公司币别表示|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化的邮件|
|<el-row justify="space-between"><el-col :span="20">email_primary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件标题颜色|
|<el-row justify="space-between"><el-col :span="20">email_secondary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件按钮颜色|
|<el-row justify="space-between"><el-col :span="20">employee_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工属性|
|<el-row justify="space-between"><el-col :span="20">expects_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Expects a Chart of Accounts|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_last_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计年度最后一天|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_last_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计年度最后一个月|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|全球锁定日期|
|<el-row justify="space-between"><el-col :span="20">font</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字体|
|<el-row justify="space-between"><el-col :span="20">hard_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|硬锁定日期|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">has_received_warning_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已收到库存警告短信息|
|<el-row justify="space-between"><el-col :span="20">hr_attendance_display_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示额外时间|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_attendance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据出勤率|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据发送的电子邮件数量|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_email_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 要发送的电子邮件|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_ip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于IP地址|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_ip_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|有效的IP地址|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_login</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于系统中的用户状态|
|<el-row justify="space-between"><el-col :span="20">iap_enrich_auto_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|丰富完成|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Terms and Conditions|
|<el-row justify="space-between"><el-col :span="20">invoice_terms_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Terms and Conditions as a Web page|
|<el-row justify="space-between"><el-col :span="20">is_company_details_empty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司详细信息是否为空|
|<el-row justify="space-between"><el-col :span="20">job_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位属性|
|<el-row justify="space-between"><el-col :span="20">layout_background</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局背景|
|<el-row justify="space-between"><el-col :span="20">manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|制造提前期|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Attachment Count|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Message Delivery error|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级路径|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">payment_onboarding_payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|选择支付方式|
|<el-row justify="space-between"><el-col :span="20">po_double_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|批准等级|
|<el-row justify="space-between"><el-col :span="20">po_double_validation_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|再次验证金额|
|<el-row justify="space-between"><el-col :span="20">po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|采购提前期|
|<el-row justify="space-between"><el-col :span="20">po_lock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单修改|
|<el-row justify="space-between"><el-col :span="20">portal_confirmation_pay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上付款|
|<el-row justify="space-between"><el-col :span="20">portal_confirmation_sign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上签署|
|<el-row justify="space-between"><el-col :span="20">prepayment_percent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预付百分比|
|<el-row justify="space-between"><el-col :span="20">primary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|原色|
|<el-row justify="space-between"><el-col :span="20">purchase_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|采购锁定日期|
|<el-row justify="space-between"><el-col :span="20">qr_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display QR-code on invoices|
|<el-row justify="space-between"><el-col :span="20">quick_edit_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|快速编码|
|<el-row justify="space-between"><el-col :span="20">quotation_validity_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认报价有效期|
|<el-row justify="space-between"><el-col :span="20">report_footer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报告页脚|
|<el-row justify="space-between"><el-col :span="20">report_header</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司标语|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认工作时间|
|<el-row justify="space-between"><el-col :span="20">sale_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售锁定日期|
|<el-row justify="space-between"><el-col :span="20">sale_onboarding_payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售入门选择的付款方式|
|<el-row justify="space-between"><el-col :span="20">secondary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|次要颜色|
|<el-row justify="space-between"><el-col :span="20">security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售安全天数|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">snailmail_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实体邮寄颜色|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|添加一个封面页|
|<el-row justify="space-between"><el-col :span="20">snailmail_duplex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双面|
|<el-row justify="space-between"><el-col :span="20">social_facebook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Facebook 账户|
|<el-row justify="space-between"><el-col :span="20">social_github</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|GitHub账户|
|<el-row justify="space-between"><el-col :span="20">social_instagram</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Instagram 账号|
|<el-row justify="space-between"><el-col :span="20">social_linkedin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|领英账号|
|<el-row justify="space-between"><el-col :span="20">social_tiktok</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|TikTok / 抖音账号|
|<el-row justify="space-between"><el-col :span="20">social_twitter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|X 账户|
|<el-row justify="space-between"><el-col :span="20">social_youtube</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Youtube账号|
|<el-row justify="space-between"><el-col :span="20">stock_mail_confirmation_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|确认拣货邮件模版|
|<el-row justify="space-between"><el-col :span="20">stock_move_email_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件确认拣货|
|<el-row justify="space-between"><el-col :span="20">stock_move_sms_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">tax_calculation_rounding_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tax Calculation Rounding Method|
|<el-row justify="space-between"><el-col :span="20">tax_exigibility</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采用现金收付|
|<el-row justify="space-between"><el-col :span="20">tax_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|纳税申报表锁定日期|
|<el-row justify="space-between"><el-col :span="20">terms_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Terms & Conditions format|
|<el-row justify="space-between"><el-col :span="20">transfer_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the transfer accounts|
|<el-row justify="space-between"><el-col :span="20">user_fiscalyear_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户财政年度锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_hard_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户硬性锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_purchase_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户采购锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_sale_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户销售锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_tax_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|User Tax Lock Date|
|<el-row justify="space-between"><el-col :span="20">uses_default_logo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用默认徽标|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_notice_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可证到期通知期|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_management" : null,
  "account_fiscal_country_id" : null,
  "account_opening_date" : null,
  "account_price_include" : null,
  "account_storno" : null,
  "account_use_credit_limit" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "alias_domain_id" : null,
  "anglo_saxon_accounting" : null,
  "annual_inventory_day" : null,
  "annual_inventory_month" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_kiosk_delay" : null,
  "attendance_kiosk_key" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_use_pin" : null,
  "attendance_overtime_validation" : null,
  "auto_check_out" : null,
  "auto_check_out_tolerance" : null,
  "autopost_bills" : null,
  "bank_account_code_prefix" : null,
  "batch_payment_sequence_id" : null,
  "bounce_email" : null,
  "bounce_formatted" : null,
  "candidate_properties_definition" : null,
  "cash_account_code_prefix" : null,
  "catchall_email" : null,
  "catchall_formatted" : null,
  "check_account_audit_trail" : null,
  "city" : null,
  "color" : null,
  "company_details" : null,
  "company_registry_placeholder" : null,
  "company_vat_placeholder" : null,
  "contract_expiration_notice_period" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "currency_name" : null,
  "days_to_purchase" : null,
  "display_invoice_amount_total_words" : null,
  "display_invoice_tax_company_currency" : null,
  "display_name" : null,
  "email_formatted" : null,
  "email_primary_color" : null,
  "email_secondary_color" : null,
  "employee_properties_definition" : null,
  "expects_chart_of_accounts" : null,
  "fiscalyear_last_day" : null,
  "fiscalyear_last_month" : null,
  "fiscalyear_lock_date" : null,
  "font" : null,
  "hard_lock_date" : null,
  "has_message" : null,
  "has_received_warning_stock_sms" : null,
  "hr_attendance_display_overtime" : null,
  "hr_presence_control_attendance" : null,
  "hr_presence_control_email" : null,
  "hr_presence_control_email_amount" : null,
  "hr_presence_control_ip" : null,
  "hr_presence_control_ip_list" : null,
  "hr_presence_control_login" : null,
  "iap_enrich_auto_done" : null,
  "id" : null,
  "invoice_terms" : null,
  "invoice_terms_html" : null,
  "is_company_details_empty" : null,
  "job_properties_definition" : null,
  "layout_background" : null,
  "manufacturing_lead" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "partner_id" : null,
  "partner_name" : null,
  "payment_onboarding_payment_method" : null,
  "po_double_validation" : null,
  "po_double_validation_amount" : null,
  "po_lead" : null,
  "po_lock" : null,
  "portal_confirmation_pay" : null,
  "portal_confirmation_sign" : null,
  "prepayment_percent" : null,
  "primary_color" : null,
  "purchase_lock_date" : null,
  "qr_code" : null,
  "quick_edit_mode" : null,
  "quotation_validity_days" : null,
  "report_footer" : null,
  "report_header" : null,
  "resource_calendar_id" : null,
  "sale_lock_date" : null,
  "sale_onboarding_payment_method" : null,
  "secondary_color" : null,
  "security_lead" : null,
  "sequence" : null,
  "snailmail_color" : null,
  "snailmail_cover" : null,
  "snailmail_duplex" : null,
  "social_facebook" : null,
  "social_github" : null,
  "social_instagram" : null,
  "social_linkedin" : null,
  "social_tiktok" : null,
  "social_twitter" : null,
  "social_youtube" : null,
  "stock_mail_confirmation_template_id" : null,
  "stock_move_email_validation" : null,
  "stock_move_sms_validation" : null,
  "street" : null,
  "street2" : null,
  "tax_calculation_rounding_method" : null,
  "tax_exigibility" : null,
  "tax_lock_date" : null,
  "terms_type" : null,
  "transfer_account_code_prefix" : null,
  "user_fiscalyear_lock_date" : null,
  "user_hard_lock_date" : null,
  "user_purchase_lock_date" : null,
  "user_sale_lock_date" : null,
  "user_tax_lock_date" : null,
  "uses_default_logo" : null,
  "work_permit_expiration_notice_period" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取公司草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">absence_management</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺勤管理|
|<el-row justify="space-between"><el-col :span="20">account_fiscal_country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区|
|<el-row justify="space-between"><el-col :span="20">account_opening_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|期初分录|
|<el-row justify="space-between"><el-col :span="20">account_price_include</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Sales Price Include|
|<el-row justify="space-between"><el-col :span="20">account_storno</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Storno会计应用程序|
|<el-row justify="space-between"><el-col :span="20">account_use_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售信用额度|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件域名|
|<el-row justify="space-between"><el-col :span="20">anglo_saxon_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用盎格鲁撒克逊会计|
|<el-row justify="space-between"><el-col :span="20">annual_inventory_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日期|
|<el-row justify="space-between"><el-col :span="20">annual_inventory_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年度库存月|
|<el-row justify="space-between"><el-col :span="20">attendance_barcode_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">attendance_from_systray</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|来自 Systray 的出席情况|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_delay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自助考勤终端延迟|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端密钥|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端网址|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_use_pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工PIN|
|<el-row justify="space-between"><el-col :span="20">attendance_overtime_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">auto_check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动签退|
|<el-row justify="space-between"><el-col :span="20">auto_check_out_tolerance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|null|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动验证账单|
|<el-row justify="space-between"><el-col :span="20">bank_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the bank accounts|
|<el-row justify="space-between"><el-col :span="20">batch_payment_sequence_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Batch Payment Sequence|
|<el-row justify="space-between"><el-col :span="20">bounce_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退件电子邮件|
|<el-row justify="space-between"><el-col :span="20">bounce_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退回|
|<el-row justify="space-between"><el-col :span="20">candidate_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人属性|
|<el-row justify="space-between"><el-col :span="20">cash_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the cash accounts|
|<el-row justify="space-between"><el-col :span="20">catchall_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设邮件|
|<el-row justify="space-between"><el-col :span="20">catchall_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设|
|<el-row justify="space-between"><el-col :span="20">check_account_audit_trail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计跟踪|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">company_details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司详情|
|<el-row justify="space-between"><el-col :span="20">company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">company_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司增值税占位符|
|<el-row justify="space-between"><el-col :span="20">contract_expiration_notice_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同到期通知期|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">currency_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">days_to_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|采购前置天数|
|<el-row justify="space-between"><el-col :span="20">display_invoice_amount_total_words</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|大写发票总额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_tax_company_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|税款以公司币别表示|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化的邮件|
|<el-row justify="space-between"><el-col :span="20">email_primary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件标题颜色|
|<el-row justify="space-between"><el-col :span="20">email_secondary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件按钮颜色|
|<el-row justify="space-between"><el-col :span="20">employee_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工属性|
|<el-row justify="space-between"><el-col :span="20">expects_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Expects a Chart of Accounts|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_last_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计年度最后一天|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_last_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计年度最后一个月|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|全球锁定日期|
|<el-row justify="space-between"><el-col :span="20">font</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字体|
|<el-row justify="space-between"><el-col :span="20">hard_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|硬锁定日期|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">has_received_warning_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已收到库存警告短信息|
|<el-row justify="space-between"><el-col :span="20">hr_attendance_display_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示额外时间|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_attendance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据出勤率|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据发送的电子邮件数量|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_email_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 要发送的电子邮件|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_ip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于IP地址|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_ip_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|有效的IP地址|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_login</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于系统中的用户状态|
|<el-row justify="space-between"><el-col :span="20">iap_enrich_auto_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|丰富完成|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Terms and Conditions|
|<el-row justify="space-between"><el-col :span="20">invoice_terms_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Terms and Conditions as a Web page|
|<el-row justify="space-between"><el-col :span="20">is_company_details_empty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司详细信息是否为空|
|<el-row justify="space-between"><el-col :span="20">job_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位属性|
|<el-row justify="space-between"><el-col :span="20">layout_background</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局背景|
|<el-row justify="space-between"><el-col :span="20">manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|制造提前期|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Attachment Count|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Message Delivery error|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级路径|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">payment_onboarding_payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|选择支付方式|
|<el-row justify="space-between"><el-col :span="20">po_double_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|批准等级|
|<el-row justify="space-between"><el-col :span="20">po_double_validation_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|再次验证金额|
|<el-row justify="space-between"><el-col :span="20">po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|采购提前期|
|<el-row justify="space-between"><el-col :span="20">po_lock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单修改|
|<el-row justify="space-between"><el-col :span="20">portal_confirmation_pay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上付款|
|<el-row justify="space-between"><el-col :span="20">portal_confirmation_sign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上签署|
|<el-row justify="space-between"><el-col :span="20">prepayment_percent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预付百分比|
|<el-row justify="space-between"><el-col :span="20">primary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|原色|
|<el-row justify="space-between"><el-col :span="20">purchase_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|采购锁定日期|
|<el-row justify="space-between"><el-col :span="20">qr_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display QR-code on invoices|
|<el-row justify="space-between"><el-col :span="20">quick_edit_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|快速编码|
|<el-row justify="space-between"><el-col :span="20">quotation_validity_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认报价有效期|
|<el-row justify="space-between"><el-col :span="20">report_footer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报告页脚|
|<el-row justify="space-between"><el-col :span="20">report_header</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司标语|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认工作时间|
|<el-row justify="space-between"><el-col :span="20">sale_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售锁定日期|
|<el-row justify="space-between"><el-col :span="20">sale_onboarding_payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售入门选择的付款方式|
|<el-row justify="space-between"><el-col :span="20">secondary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|次要颜色|
|<el-row justify="space-between"><el-col :span="20">security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售安全天数|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">snailmail_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实体邮寄颜色|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|添加一个封面页|
|<el-row justify="space-between"><el-col :span="20">snailmail_duplex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双面|
|<el-row justify="space-between"><el-col :span="20">social_facebook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Facebook 账户|
|<el-row justify="space-between"><el-col :span="20">social_github</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|GitHub账户|
|<el-row justify="space-between"><el-col :span="20">social_instagram</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Instagram 账号|
|<el-row justify="space-between"><el-col :span="20">social_linkedin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|领英账号|
|<el-row justify="space-between"><el-col :span="20">social_tiktok</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|TikTok / 抖音账号|
|<el-row justify="space-between"><el-col :span="20">social_twitter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|X 账户|
|<el-row justify="space-between"><el-col :span="20">social_youtube</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Youtube账号|
|<el-row justify="space-between"><el-col :span="20">stock_mail_confirmation_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|确认拣货邮件模版|
|<el-row justify="space-between"><el-col :span="20">stock_move_email_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件确认拣货|
|<el-row justify="space-between"><el-col :span="20">stock_move_sms_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">tax_calculation_rounding_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tax Calculation Rounding Method|
|<el-row justify="space-between"><el-col :span="20">tax_exigibility</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采用现金收付|
|<el-row justify="space-between"><el-col :span="20">tax_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|纳税申报表锁定日期|
|<el-row justify="space-between"><el-col :span="20">terms_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Terms & Conditions format|
|<el-row justify="space-between"><el-col :span="20">transfer_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the transfer accounts|
|<el-row justify="space-between"><el-col :span="20">user_fiscalyear_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户财政年度锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_hard_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户硬性锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_purchase_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户采购锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_sale_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户销售锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_tax_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|User Tax Lock Date|
|<el-row justify="space-between"><el-col :span="20">uses_default_logo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用默认徽标|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_notice_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可证到期通知期|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_management" : null,
  "account_fiscal_country_id" : null,
  "account_opening_date" : null,
  "account_price_include" : null,
  "account_storno" : null,
  "account_use_credit_limit" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "alias_domain_id" : null,
  "anglo_saxon_accounting" : null,
  "annual_inventory_day" : null,
  "annual_inventory_month" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_kiosk_delay" : null,
  "attendance_kiosk_key" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_use_pin" : null,
  "attendance_overtime_validation" : null,
  "auto_check_out" : null,
  "auto_check_out_tolerance" : null,
  "autopost_bills" : null,
  "bank_account_code_prefix" : null,
  "batch_payment_sequence_id" : null,
  "bounce_email" : null,
  "bounce_formatted" : null,
  "candidate_properties_definition" : null,
  "cash_account_code_prefix" : null,
  "catchall_email" : null,
  "catchall_formatted" : null,
  "check_account_audit_trail" : null,
  "city" : null,
  "color" : null,
  "company_details" : null,
  "company_registry_placeholder" : null,
  "company_vat_placeholder" : null,
  "contract_expiration_notice_period" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "currency_name" : null,
  "days_to_purchase" : null,
  "display_invoice_amount_total_words" : null,
  "display_invoice_tax_company_currency" : null,
  "display_name" : null,
  "email_formatted" : null,
  "email_primary_color" : null,
  "email_secondary_color" : null,
  "employee_properties_definition" : null,
  "expects_chart_of_accounts" : null,
  "fiscalyear_last_day" : null,
  "fiscalyear_last_month" : null,
  "fiscalyear_lock_date" : null,
  "font" : null,
  "hard_lock_date" : null,
  "has_message" : null,
  "has_received_warning_stock_sms" : null,
  "hr_attendance_display_overtime" : null,
  "hr_presence_control_attendance" : null,
  "hr_presence_control_email" : null,
  "hr_presence_control_email_amount" : null,
  "hr_presence_control_ip" : null,
  "hr_presence_control_ip_list" : null,
  "hr_presence_control_login" : null,
  "iap_enrich_auto_done" : null,
  "id" : null,
  "invoice_terms" : null,
  "invoice_terms_html" : null,
  "is_company_details_empty" : null,
  "job_properties_definition" : null,
  "layout_background" : null,
  "manufacturing_lead" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "partner_id" : null,
  "partner_name" : null,
  "payment_onboarding_payment_method" : null,
  "po_double_validation" : null,
  "po_double_validation_amount" : null,
  "po_lead" : null,
  "po_lock" : null,
  "portal_confirmation_pay" : null,
  "portal_confirmation_sign" : null,
  "prepayment_percent" : null,
  "primary_color" : null,
  "purchase_lock_date" : null,
  "qr_code" : null,
  "quick_edit_mode" : null,
  "quotation_validity_days" : null,
  "report_footer" : null,
  "report_header" : null,
  "resource_calendar_id" : null,
  "sale_lock_date" : null,
  "sale_onboarding_payment_method" : null,
  "secondary_color" : null,
  "security_lead" : null,
  "sequence" : null,
  "snailmail_color" : null,
  "snailmail_cover" : null,
  "snailmail_duplex" : null,
  "social_facebook" : null,
  "social_github" : null,
  "social_instagram" : null,
  "social_linkedin" : null,
  "social_tiktok" : null,
  "social_twitter" : null,
  "social_youtube" : null,
  "stock_mail_confirmation_template_id" : null,
  "stock_move_email_validation" : null,
  "stock_move_sms_validation" : null,
  "street" : null,
  "street2" : null,
  "tax_calculation_rounding_method" : null,
  "tax_exigibility" : null,
  "tax_lock_date" : null,
  "terms_type" : null,
  "transfer_account_code_prefix" : null,
  "user_fiscalyear_lock_date" : null,
  "user_hard_lock_date" : null,
  "user_purchase_lock_date" : null,
  "user_sale_lock_date" : null,
  "user_tax_lock_date" : null,
  "uses_default_logo" : null,
  "work_permit_expiration_notice_period" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_management" : null,
  "account_fiscal_country_id" : null,
  "account_opening_date" : null,
  "account_price_include" : null,
  "account_storno" : null,
  "account_use_credit_limit" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "alias_domain_id" : null,
  "anglo_saxon_accounting" : null,
  "annual_inventory_day" : null,
  "annual_inventory_month" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_kiosk_delay" : null,
  "attendance_kiosk_key" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_use_pin" : null,
  "attendance_overtime_validation" : null,
  "auto_check_out" : null,
  "auto_check_out_tolerance" : null,
  "autopost_bills" : null,
  "bank_account_code_prefix" : null,
  "batch_payment_sequence_id" : null,
  "bounce_email" : null,
  "bounce_formatted" : null,
  "candidate_properties_definition" : null,
  "cash_account_code_prefix" : null,
  "catchall_email" : null,
  "catchall_formatted" : null,
  "check_account_audit_trail" : null,
  "city" : null,
  "color" : null,
  "company_details" : null,
  "company_registry_placeholder" : null,
  "company_vat_placeholder" : null,
  "contract_expiration_notice_period" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "currency_name" : null,
  "days_to_purchase" : null,
  "display_invoice_amount_total_words" : null,
  "display_invoice_tax_company_currency" : null,
  "display_name" : null,
  "email_formatted" : null,
  "email_primary_color" : null,
  "email_secondary_color" : null,
  "employee_properties_definition" : null,
  "expects_chart_of_accounts" : null,
  "fiscalyear_last_day" : null,
  "fiscalyear_last_month" : null,
  "fiscalyear_lock_date" : null,
  "font" : null,
  "hard_lock_date" : null,
  "has_message" : null,
  "has_received_warning_stock_sms" : null,
  "hr_attendance_display_overtime" : null,
  "hr_presence_control_attendance" : null,
  "hr_presence_control_email" : null,
  "hr_presence_control_email_amount" : null,
  "hr_presence_control_ip" : null,
  "hr_presence_control_ip_list" : null,
  "hr_presence_control_login" : null,
  "iap_enrich_auto_done" : null,
  "id" : null,
  "invoice_terms" : null,
  "invoice_terms_html" : null,
  "is_company_details_empty" : null,
  "job_properties_definition" : null,
  "layout_background" : null,
  "manufacturing_lead" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "partner_id" : null,
  "partner_name" : null,
  "payment_onboarding_payment_method" : null,
  "po_double_validation" : null,
  "po_double_validation_amount" : null,
  "po_lead" : null,
  "po_lock" : null,
  "portal_confirmation_pay" : null,
  "portal_confirmation_sign" : null,
  "prepayment_percent" : null,
  "primary_color" : null,
  "purchase_lock_date" : null,
  "qr_code" : null,
  "quick_edit_mode" : null,
  "quotation_validity_days" : null,
  "report_footer" : null,
  "report_header" : null,
  "resource_calendar_id" : null,
  "sale_lock_date" : null,
  "sale_onboarding_payment_method" : null,
  "secondary_color" : null,
  "security_lead" : null,
  "sequence" : null,
  "snailmail_color" : null,
  "snailmail_cover" : null,
  "snailmail_duplex" : null,
  "social_facebook" : null,
  "social_github" : null,
  "social_instagram" : null,
  "social_linkedin" : null,
  "social_tiktok" : null,
  "social_twitter" : null,
  "social_youtube" : null,
  "stock_mail_confirmation_template_id" : null,
  "stock_move_email_validation" : null,
  "stock_move_sms_validation" : null,
  "street" : null,
  "street2" : null,
  "tax_calculation_rounding_method" : null,
  "tax_exigibility" : null,
  "tax_lock_date" : null,
  "terms_type" : null,
  "transfer_account_code_prefix" : null,
  "user_fiscalyear_lock_date" : null,
  "user_hard_lock_date" : null,
  "user_purchase_lock_date" : null,
  "user_sale_lock_date" : null,
  "user_tax_lock_date" : null,
  "uses_default_logo" : null,
  "work_permit_expiration_notice_period" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
}

```

## 保存公司

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">absence_management</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|缺勤管理|
|<el-row justify="space-between"><el-col :span="20">account_fiscal_country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区|
|<el-row justify="space-between"><el-col :span="20">account_opening_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|期初分录|
|<el-row justify="space-between"><el-col :span="20">account_price_include</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Sales Price Include|
|<el-row justify="space-between"><el-col :span="20">account_storno</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Storno会计应用程序|
|<el-row justify="space-between"><el-col :span="20">account_use_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售信用额度|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">alias_domain_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件域名|
|<el-row justify="space-between"><el-col :span="20">anglo_saxon_accounting</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用盎格鲁撒克逊会计|
|<el-row justify="space-between"><el-col :span="20">annual_inventory_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日期|
|<el-row justify="space-between"><el-col :span="20">annual_inventory_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年度库存月|
|<el-row justify="space-between"><el-col :span="20">attendance_barcode_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">attendance_from_systray</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|来自 Systray 的出席情况|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_delay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自助考勤终端延迟|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_key</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端密钥|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端网址|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_use_pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工PIN|
|<el-row justify="space-between"><el-col :span="20">attendance_overtime_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">auto_check_out</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动签退|
|<el-row justify="space-between"><el-col :span="20">auto_check_out_tolerance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|null|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自动验证账单|
|<el-row justify="space-between"><el-col :span="20">bank_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the bank accounts|
|<el-row justify="space-between"><el-col :span="20">batch_payment_sequence_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Batch Payment Sequence|
|<el-row justify="space-between"><el-col :span="20">bounce_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退件电子邮件|
|<el-row justify="space-between"><el-col :span="20">bounce_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|退回|
|<el-row justify="space-between"><el-col :span="20">candidate_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|候选人属性|
|<el-row justify="space-between"><el-col :span="20">cash_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the cash accounts|
|<el-row justify="space-between"><el-col :span="20">catchall_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设邮件|
|<el-row justify="space-between"><el-col :span="20">catchall_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|预设|
|<el-row justify="space-between"><el-col :span="20">check_account_audit_trail</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|审计跟踪|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色|
|<el-row justify="space-between"><el-col :span="20">company_details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司详情|
|<el-row justify="space-between"><el-col :span="20">company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">company_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司增值税占位符|
|<el-row justify="space-between"><el-col :span="20">contract_expiration_notice_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合同到期通知期|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">currency_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">days_to_purchase</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|采购前置天数|
|<el-row justify="space-between"><el-col :span="20">display_invoice_amount_total_words</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|大写发票总额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_tax_company_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|税款以公司币别表示|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化的邮件|
|<el-row justify="space-between"><el-col :span="20">email_primary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件标题颜色|
|<el-row justify="space-between"><el-col :span="20">email_secondary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件按钮颜色|
|<el-row justify="space-between"><el-col :span="20">employee_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|员工属性|
|<el-row justify="space-between"><el-col :span="20">expects_chart_of_accounts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Expects a Chart of Accounts|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_last_day</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|会计年度最后一天|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_last_month</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计年度最后一个月|
|<el-row justify="space-between"><el-col :span="20">fiscalyear_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|全球锁定日期|
|<el-row justify="space-between"><el-col :span="20">font</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字体|
|<el-row justify="space-between"><el-col :span="20">hard_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|硬锁定日期|
|<el-row justify="space-between"><el-col :span="20">has_message</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有消息|
|<el-row justify="space-between"><el-col :span="20">has_received_warning_stock_sms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|已收到库存警告短信息|
|<el-row justify="space-between"><el-col :span="20">hr_attendance_display_overtime</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示额外时间|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_attendance</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据出勤率|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|根据发送的电子邮件数量|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_email_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|# 要发送的电子邮件|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_ip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于IP地址|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_ip_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|有效的IP地址|
|<el-row justify="space-between"><el-col :span="20">hr_presence_control_login</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|基于系统中的用户状态|
|<el-row justify="space-between"><el-col :span="20">iap_enrich_auto_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|丰富完成|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">invoice_terms</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Terms and Conditions|
|<el-row justify="space-between"><el-col :span="20">invoice_terms_html</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Terms and Conditions as a Web page|
|<el-row justify="space-between"><el-col :span="20">is_company_details_empty</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司详细信息是否为空|
|<el-row justify="space-between"><el-col :span="20">job_properties_definition</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|职位属性|
|<el-row justify="space-between"><el-col :span="20">layout_background</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局背景|
|<el-row justify="space-between"><el-col :span="20">manufacturing_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|制造提前期|
|<el-row justify="space-between"><el-col :span="20">message_attachment_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Attachment Count|
|<el-row justify="space-between"><el-col :span="20">message_has_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Message Delivery error|
|<el-row justify="space-between"><el-col :span="20">message_has_error_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|错误数量|
|<el-row justify="space-between"><el-col :span="20">message_has_sms_error</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信发送错误|
|<el-row justify="space-between"><el-col :span="20">message_is_follower</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是关注者|
|<el-row justify="space-between"><el-col :span="20">message_needaction</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|待处理|
|<el-row justify="space-between"><el-col :span="20">message_needaction_counter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|操作数量|
|<el-row justify="space-between"><el-col :span="20">my_activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|我的活动截止时间|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">overtime_company_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对公司有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">overtime_employee_threshold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|对员工有利的宽容时间|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">parent_path</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级路径|
|<el-row justify="space-between"><el-col :span="20">partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">payment_onboarding_payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|选择支付方式|
|<el-row justify="space-between"><el-col :span="20">po_double_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|批准等级|
|<el-row justify="space-between"><el-col :span="20">po_double_validation_amount</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|再次验证金额|
|<el-row justify="space-between"><el-col :span="20">po_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|采购提前期|
|<el-row justify="space-between"><el-col :span="20">po_lock</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单修改|
|<el-row justify="space-between"><el-col :span="20">portal_confirmation_pay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上付款|
|<el-row justify="space-between"><el-col :span="20">portal_confirmation_sign</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|线上签署|
|<el-row justify="space-between"><el-col :span="20">prepayment_percent</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|预付百分比|
|<el-row justify="space-between"><el-col :span="20">primary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|原色|
|<el-row justify="space-between"><el-col :span="20">purchase_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|采购锁定日期|
|<el-row justify="space-between"><el-col :span="20">qr_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display QR-code on invoices|
|<el-row justify="space-between"><el-col :span="20">quick_edit_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|快速编码|
|<el-row justify="space-between"><el-col :span="20">quotation_validity_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认报价有效期|
|<el-row justify="space-between"><el-col :span="20">report_footer</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报告页脚|
|<el-row justify="space-between"><el-col :span="20">report_header</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司标语|
|<el-row justify="space-between"><el-col :span="20">resource_calendar_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认工作时间|
|<el-row justify="space-between"><el-col :span="20">sale_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|销售锁定日期|
|<el-row justify="space-between"><el-col :span="20">sale_onboarding_payment_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售入门选择的付款方式|
|<el-row justify="space-between"><el-col :span="20">secondary_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|次要颜色|
|<el-row justify="space-between"><el-col :span="20">security_lead</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售安全天数|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">snailmail_color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实体邮寄颜色|
|<el-row justify="space-between"><el-col :span="20">snailmail_cover</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|添加一个封面页|
|<el-row justify="space-between"><el-col :span="20">snailmail_duplex</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|双面|
|<el-row justify="space-between"><el-col :span="20">social_facebook</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Facebook 账户|
|<el-row justify="space-between"><el-col :span="20">social_github</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|GitHub账户|
|<el-row justify="space-between"><el-col :span="20">social_instagram</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Instagram 账号|
|<el-row justify="space-between"><el-col :span="20">social_linkedin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|领英账号|
|<el-row justify="space-between"><el-col :span="20">social_tiktok</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|TikTok / 抖音账号|
|<el-row justify="space-between"><el-col :span="20">social_twitter</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|X 账户|
|<el-row justify="space-between"><el-col :span="20">social_youtube</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Youtube账号|
|<el-row justify="space-between"><el-col :span="20">stock_mail_confirmation_template_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|确认拣货邮件模版|
|<el-row justify="space-between"><el-col :span="20">stock_move_email_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|邮件确认拣货|
|<el-row justify="space-between"><el-col :span="20">stock_move_sms_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|短信息确认|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">tax_calculation_rounding_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tax Calculation Rounding Method|
|<el-row justify="space-between"><el-col :span="20">tax_exigibility</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|采用现金收付|
|<el-row justify="space-between"><el-col :span="20">tax_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|纳税申报表锁定日期|
|<el-row justify="space-between"><el-col :span="20">terms_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Terms & Conditions format|
|<el-row justify="space-between"><el-col :span="20">transfer_account_code_prefix</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Prefix of the transfer accounts|
|<el-row justify="space-between"><el-col :span="20">user_fiscalyear_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户财政年度锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_hard_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户硬性锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_purchase_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户采购锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_sale_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|用户销售锁定日期|
|<el-row justify="space-between"><el-col :span="20">user_tax_lock_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|User Tax Lock Date|
|<el-row justify="space-between"><el-col :span="20">uses_default_logo</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|使用默认徽标|
|<el-row justify="space-between"><el-col :span="20">work_permit_expiration_notice_period</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作许可证到期通知期|
|<el-row justify="space-between"><el-col :span="20">zip</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_management" : null,
  "account_fiscal_country_id" : null,
  "account_opening_date" : null,
  "account_price_include" : null,
  "account_storno" : null,
  "account_use_credit_limit" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "alias_domain_id" : null,
  "anglo_saxon_accounting" : null,
  "annual_inventory_day" : null,
  "annual_inventory_month" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_kiosk_delay" : null,
  "attendance_kiosk_key" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_use_pin" : null,
  "attendance_overtime_validation" : null,
  "auto_check_out" : null,
  "auto_check_out_tolerance" : null,
  "autopost_bills" : null,
  "bank_account_code_prefix" : null,
  "batch_payment_sequence_id" : null,
  "bounce_email" : null,
  "bounce_formatted" : null,
  "candidate_properties_definition" : null,
  "cash_account_code_prefix" : null,
  "catchall_email" : null,
  "catchall_formatted" : null,
  "check_account_audit_trail" : null,
  "city" : null,
  "color" : null,
  "company_details" : null,
  "company_registry_placeholder" : null,
  "company_vat_placeholder" : null,
  "contract_expiration_notice_period" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "currency_name" : null,
  "days_to_purchase" : null,
  "display_invoice_amount_total_words" : null,
  "display_invoice_tax_company_currency" : null,
  "display_name" : null,
  "email_formatted" : null,
  "email_primary_color" : null,
  "email_secondary_color" : null,
  "employee_properties_definition" : null,
  "expects_chart_of_accounts" : null,
  "fiscalyear_last_day" : null,
  "fiscalyear_last_month" : null,
  "fiscalyear_lock_date" : null,
  "font" : null,
  "hard_lock_date" : null,
  "has_message" : null,
  "has_received_warning_stock_sms" : null,
  "hr_attendance_display_overtime" : null,
  "hr_presence_control_attendance" : null,
  "hr_presence_control_email" : null,
  "hr_presence_control_email_amount" : null,
  "hr_presence_control_ip" : null,
  "hr_presence_control_ip_list" : null,
  "hr_presence_control_login" : null,
  "iap_enrich_auto_done" : null,
  "id" : null,
  "invoice_terms" : null,
  "invoice_terms_html" : null,
  "is_company_details_empty" : null,
  "job_properties_definition" : null,
  "layout_background" : null,
  "manufacturing_lead" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "partner_id" : null,
  "partner_name" : null,
  "payment_onboarding_payment_method" : null,
  "po_double_validation" : null,
  "po_double_validation_amount" : null,
  "po_lead" : null,
  "po_lock" : null,
  "portal_confirmation_pay" : null,
  "portal_confirmation_sign" : null,
  "prepayment_percent" : null,
  "primary_color" : null,
  "purchase_lock_date" : null,
  "qr_code" : null,
  "quick_edit_mode" : null,
  "quotation_validity_days" : null,
  "report_footer" : null,
  "report_header" : null,
  "resource_calendar_id" : null,
  "sale_lock_date" : null,
  "sale_onboarding_payment_method" : null,
  "secondary_color" : null,
  "security_lead" : null,
  "sequence" : null,
  "snailmail_color" : null,
  "snailmail_cover" : null,
  "snailmail_duplex" : null,
  "social_facebook" : null,
  "social_github" : null,
  "social_instagram" : null,
  "social_linkedin" : null,
  "social_tiktok" : null,
  "social_twitter" : null,
  "social_youtube" : null,
  "stock_mail_confirmation_template_id" : null,
  "stock_move_email_validation" : null,
  "stock_move_sms_validation" : null,
  "street" : null,
  "street2" : null,
  "tax_calculation_rounding_method" : null,
  "tax_exigibility" : null,
  "tax_lock_date" : null,
  "terms_type" : null,
  "transfer_account_code_prefix" : null,
  "user_fiscalyear_lock_date" : null,
  "user_hard_lock_date" : null,
  "user_purchase_lock_date" : null,
  "user_sale_lock_date" : null,
  "user_tax_lock_date" : null,
  "uses_default_logo" : null,
  "work_permit_expiration_notice_period" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
  "absence_management" : null,
  "account_fiscal_country_id" : null,
  "account_opening_date" : null,
  "account_price_include" : null,
  "account_storno" : null,
  "account_use_credit_limit" : null,
  "active" : null,
  "activity_date_deadline" : null,
  "activity_exception_decoration" : null,
  "activity_exception_icon" : null,
  "activity_state" : null,
  "alias_domain_id" : null,
  "anglo_saxon_accounting" : null,
  "annual_inventory_day" : null,
  "annual_inventory_month" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_kiosk_delay" : null,
  "attendance_kiosk_key" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_use_pin" : null,
  "attendance_overtime_validation" : null,
  "auto_check_out" : null,
  "auto_check_out_tolerance" : null,
  "autopost_bills" : null,
  "bank_account_code_prefix" : null,
  "batch_payment_sequence_id" : null,
  "bounce_email" : null,
  "bounce_formatted" : null,
  "candidate_properties_definition" : null,
  "cash_account_code_prefix" : null,
  "catchall_email" : null,
  "catchall_formatted" : null,
  "check_account_audit_trail" : null,
  "city" : null,
  "color" : null,
  "company_details" : null,
  "company_registry_placeholder" : null,
  "company_vat_placeholder" : null,
  "contract_expiration_notice_period" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "currency_name" : null,
  "days_to_purchase" : null,
  "display_invoice_amount_total_words" : null,
  "display_invoice_tax_company_currency" : null,
  "display_name" : null,
  "email_formatted" : null,
  "email_primary_color" : null,
  "email_secondary_color" : null,
  "employee_properties_definition" : null,
  "expects_chart_of_accounts" : null,
  "fiscalyear_last_day" : null,
  "fiscalyear_last_month" : null,
  "fiscalyear_lock_date" : null,
  "font" : null,
  "hard_lock_date" : null,
  "has_message" : null,
  "has_received_warning_stock_sms" : null,
  "hr_attendance_display_overtime" : null,
  "hr_presence_control_attendance" : null,
  "hr_presence_control_email" : null,
  "hr_presence_control_email_amount" : null,
  "hr_presence_control_ip" : null,
  "hr_presence_control_ip_list" : null,
  "hr_presence_control_login" : null,
  "iap_enrich_auto_done" : null,
  "id" : null,
  "invoice_terms" : null,
  "invoice_terms_html" : null,
  "is_company_details_empty" : null,
  "job_properties_definition" : null,
  "layout_background" : null,
  "manufacturing_lead" : null,
  "message_attachment_count" : null,
  "message_has_error" : null,
  "message_has_error_counter" : null,
  "message_has_sms_error" : null,
  "message_is_follower" : null,
  "message_needaction" : null,
  "message_needaction_counter" : null,
  "my_activity_date_deadline" : null,
  "name" : null,
  "overtime_company_threshold" : null,
  "overtime_employee_threshold" : null,
  "parent_id" : null,
  "parent_name" : null,
  "parent_path" : null,
  "partner_id" : null,
  "partner_name" : null,
  "payment_onboarding_payment_method" : null,
  "po_double_validation" : null,
  "po_double_validation_amount" : null,
  "po_lead" : null,
  "po_lock" : null,
  "portal_confirmation_pay" : null,
  "portal_confirmation_sign" : null,
  "prepayment_percent" : null,
  "primary_color" : null,
  "purchase_lock_date" : null,
  "qr_code" : null,
  "quick_edit_mode" : null,
  "quotation_validity_days" : null,
  "report_footer" : null,
  "report_header" : null,
  "resource_calendar_id" : null,
  "sale_lock_date" : null,
  "sale_onboarding_payment_method" : null,
  "secondary_color" : null,
  "security_lead" : null,
  "sequence" : null,
  "snailmail_color" : null,
  "snailmail_cover" : null,
  "snailmail_duplex" : null,
  "social_facebook" : null,
  "social_github" : null,
  "social_instagram" : null,
  "social_linkedin" : null,
  "social_tiktok" : null,
  "social_twitter" : null,
  "social_youtube" : null,
  "stock_mail_confirmation_template_id" : null,
  "stock_move_email_validation" : null,
  "stock_move_sms_validation" : null,
  "street" : null,
  "street2" : null,
  "tax_calculation_rounding_method" : null,
  "tax_exigibility" : null,
  "tax_lock_date" : null,
  "terms_type" : null,
  "transfer_account_code_prefix" : null,
  "user_fiscalyear_lock_date" : null,
  "user_hard_lock_date" : null,
  "user_purchase_lock_date" : null,
  "user_sale_lock_date" : null,
  "user_tax_lock_date" : null,
  "uses_default_logo" : null,
  "work_permit_expiration_notice_period" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_account_fiscal_country_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区|
|<el-row justify="space-between"><el-col :span="20">n_account_price_include_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Default Sales Price Include|
|<el-row justify="space-between"><el-col :span="20">n_alias_domain_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件域名|
|<el-row justify="space-between"><el-col :span="20">n_annual_inventory_month_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|年度库存月|
|<el-row justify="space-between"><el-col :span="20">n_attendance_barcode_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">n_attendance_kiosk_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">n_attendance_overtime_validation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">n_batch_payment_sequence_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Batch Payment Sequence|
|<el-row justify="space-between"><el-col :span="20">n_currency_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">n_currency_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">n_currency_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">n_fiscalyear_last_month_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计年度最后一个月|
|<el-row justify="space-between"><el-col :span="20">n_font_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|字体|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_layout_background_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|布局背景|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上级公司|
|<el-row justify="space-between"><el-col :span="20">n_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_partner_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴|
|<el-row justify="space-between"><el-col :span="20">n_payment_onboarding_payment_method_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|选择支付方式|
|<el-row justify="space-between"><el-col :span="20">n_po_double_validation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|批准等级|
|<el-row justify="space-between"><el-col :span="20">n_po_lock_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单修改|
|<el-row justify="space-between"><el-col :span="20">n_quick_edit_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|快速编码|
|<el-row justify="space-between"><el-col :span="20">n_resource_calendar_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认工作时间|
|<el-row justify="space-between"><el-col :span="20">n_sale_onboarding_payment_method_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售入门选择的付款方式|
|<el-row justify="space-between"><el-col :span="20">n_stock_mail_confirmation_template_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|确认拣货邮件模版|
|<el-row justify="space-between"><el-col :span="20">n_tax_calculation_rounding_method_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Tax Calculation Rounding Method|
|<el-row justify="space-between"><el-col :span="20">n_terms_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Terms & Conditions format|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_account_fiscal_country_id_eq" : null,
  "n_account_price_include_eq" : null,
  "n_alias_domain_id_eq" : null,
  "n_annual_inventory_month_eq" : null,
  "n_attendance_barcode_source_eq" : null,
  "n_attendance_kiosk_mode_eq" : null,
  "n_attendance_overtime_validation_eq" : null,
  "n_batch_payment_sequence_id_eq" : null,
  "n_currency_id_eq" : null,
  "n_currency_name_eq" : null,
  "n_currency_name_like" : null,
  "n_fiscalyear_last_month_eq" : null,
  "n_font_eq" : null,
  "n_id_eq" : null,
  "n_layout_background_eq" : null,
  "n_name_like" : null,
  "n_parent_id_eq" : null,
  "n_parent_name_eq" : null,
  "n_parent_name_like" : null,
  "n_partner_id_eq" : null,
  "n_partner_name_eq" : null,
  "n_partner_name_like" : null,
  "n_payment_onboarding_payment_method_eq" : null,
  "n_po_double_validation_eq" : null,
  "n_po_lock_eq" : null,
  "n_quick_edit_mode_eq" : null,
  "n_resource_calendar_id_eq" : null,
  "n_sale_onboarding_payment_method_eq" : null,
  "n_stock_mail_confirmation_template_id_eq" : null,
  "n_tax_calculation_rounding_method_eq" : null,
  "n_terms_type_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "activities" : null,
    "attachments" : null,
    "followers" : null,
    "absence_management" : null,
    "account_fiscal_country_id" : null,
    "account_opening_date" : null,
    "account_price_include" : null,
    "account_storno" : null,
    "account_use_credit_limit" : null,
    "active" : null,
    "activity_date_deadline" : null,
    "activity_exception_decoration" : null,
    "activity_exception_icon" : null,
    "activity_state" : null,
    "alias_domain_id" : null,
    "anglo_saxon_accounting" : null,
    "annual_inventory_day" : null,
    "annual_inventory_month" : null,
    "attendance_barcode_source" : null,
    "attendance_from_systray" : null,
    "attendance_kiosk_delay" : null,
    "attendance_kiosk_key" : null,
    "attendance_kiosk_mode" : null,
    "attendance_kiosk_url" : null,
    "attendance_kiosk_use_pin" : null,
    "attendance_overtime_validation" : null,
    "auto_check_out" : null,
    "auto_check_out_tolerance" : null,
    "autopost_bills" : null,
    "bank_account_code_prefix" : null,
    "batch_payment_sequence_id" : null,
    "bounce_email" : null,
    "bounce_formatted" : null,
    "candidate_properties_definition" : null,
    "cash_account_code_prefix" : null,
    "catchall_email" : null,
    "catchall_formatted" : null,
    "check_account_audit_trail" : null,
    "city" : null,
    "color" : null,
    "company_details" : null,
    "company_registry_placeholder" : null,
    "company_vat_placeholder" : null,
    "contract_expiration_notice_period" : null,
    "create_date" : null,
    "create_uid" : null,
    "currency_id" : null,
    "currency_name" : null,
    "days_to_purchase" : null,
    "display_invoice_amount_total_words" : null,
    "display_invoice_tax_company_currency" : null,
    "display_name" : null,
    "email_formatted" : null,
    "email_primary_color" : null,
    "email_secondary_color" : null,
    "employee_properties_definition" : null,
    "expects_chart_of_accounts" : null,
    "fiscalyear_last_day" : null,
    "fiscalyear_last_month" : null,
    "fiscalyear_lock_date" : null,
    "font" : null,
    "hard_lock_date" : null,
    "has_message" : null,
    "has_received_warning_stock_sms" : null,
    "hr_attendance_display_overtime" : null,
    "hr_presence_control_attendance" : null,
    "hr_presence_control_email" : null,
    "hr_presence_control_email_amount" : null,
    "hr_presence_control_ip" : null,
    "hr_presence_control_ip_list" : null,
    "hr_presence_control_login" : null,
    "iap_enrich_auto_done" : null,
    "id" : null,
    "invoice_terms" : null,
    "invoice_terms_html" : null,
    "is_company_details_empty" : null,
    "job_properties_definition" : null,
    "layout_background" : null,
    "manufacturing_lead" : null,
    "message_attachment_count" : null,
    "message_has_error" : null,
    "message_has_error_counter" : null,
    "message_has_sms_error" : null,
    "message_is_follower" : null,
    "message_needaction" : null,
    "message_needaction_counter" : null,
    "my_activity_date_deadline" : null,
    "name" : null,
    "overtime_company_threshold" : null,
    "overtime_employee_threshold" : null,
    "parent_id" : null,
    "parent_name" : null,
    "parent_path" : null,
    "partner_id" : null,
    "partner_name" : null,
    "payment_onboarding_payment_method" : null,
    "po_double_validation" : null,
    "po_double_validation_amount" : null,
    "po_lead" : null,
    "po_lock" : null,
    "portal_confirmation_pay" : null,
    "portal_confirmation_sign" : null,
    "prepayment_percent" : null,
    "primary_color" : null,
    "purchase_lock_date" : null,
    "qr_code" : null,
    "quick_edit_mode" : null,
    "quotation_validity_days" : null,
    "report_footer" : null,
    "report_header" : null,
    "resource_calendar_id" : null,
    "sale_lock_date" : null,
    "sale_onboarding_payment_method" : null,
    "secondary_color" : null,
    "security_lead" : null,
    "sequence" : null,
    "snailmail_color" : null,
    "snailmail_cover" : null,
    "snailmail_duplex" : null,
    "social_facebook" : null,
    "social_github" : null,
    "social_instagram" : null,
    "social_linkedin" : null,
    "social_tiktok" : null,
    "social_twitter" : null,
    "social_youtube" : null,
    "stock_mail_confirmation_template_id" : null,
    "stock_move_email_validation" : null,
    "stock_move_sms_validation" : null,
    "street" : null,
    "street2" : null,
    "tax_calculation_rounding_method" : null,
    "tax_exigibility" : null,
    "tax_lock_date" : null,
    "terms_type" : null,
    "transfer_account_code_prefix" : null,
    "user_fiscalyear_lock_date" : null,
    "user_hard_lock_date" : null,
    "user_purchase_lock_date" : null,
    "user_sale_lock_date" : null,
    "user_tax_lock_date" : null,
    "uses_default_logo" : null,
    "work_permit_expiration_notice_period" : null,
    "write_date" : null,
    "write_uid" : null,
    "zip" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/exportdata/{param},/res_companies/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/report" type="info" :closable="false" ></el-alert>
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