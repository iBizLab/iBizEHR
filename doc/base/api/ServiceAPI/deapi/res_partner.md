# 联系人(res_partner) :id=res_partner
## 创建联系人

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_partners" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
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
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
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
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
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
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">state_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
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



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
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
  "buyer_id" : null,
  "calendar_last_notif_ack" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "country_name" : null,
  "create_date" : null,
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
  "display_name" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
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
  "is_ubl_format" : null,
  "journal_item_count" : null,
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
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "parent_name" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
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
  "sale_order_count" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "show_credit_limit" : null,
  "signup_type" : null,
  "state_id" : null,
  "state_name" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_id" : null,
  "user_name" : null,
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
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
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
  "buyer_id" : null,
  "calendar_last_notif_ack" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "country_name" : null,
  "create_date" : null,
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
  "display_name" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
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
  "is_ubl_format" : null,
  "journal_item_count" : null,
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
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "parent_name" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
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
  "sale_order_count" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "show_credit_limit" : null,
  "signup_type" : null,
  "state_id" : null,
  "state_name" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_id" : null,
  "user_name" : null,
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
}

```

## 获取联系人

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_partners/{key}" type="info" :closable="false" ></el-alert>
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
  "buyer_id" : null,
  "calendar_last_notif_ack" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "country_name" : null,
  "create_date" : null,
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
  "display_name" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
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
  "is_ubl_format" : null,
  "journal_item_count" : null,
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
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "parent_name" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
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
  "sale_order_count" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "show_credit_limit" : null,
  "signup_type" : null,
  "state_id" : null,
  "state_name" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_id" : null,
  "user_name" : null,
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
}

```

## 删除联系人

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_partners/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新联系人

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_partners/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
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
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
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
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
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
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">state_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
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



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
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
  "buyer_id" : null,
  "calendar_last_notif_ack" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "country_name" : null,
  "create_date" : null,
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
  "display_name" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
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
  "is_ubl_format" : null,
  "journal_item_count" : null,
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
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "parent_name" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
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
  "sale_order_count" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "show_credit_limit" : null,
  "signup_type" : null,
  "state_id" : null,
  "state_name" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_id" : null,
  "user_name" : null,
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
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
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
  "buyer_id" : null,
  "calendar_last_notif_ack" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "country_name" : null,
  "create_date" : null,
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
  "display_name" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
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
  "is_ubl_format" : null,
  "journal_item_count" : null,
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
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "parent_name" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
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
  "sale_order_count" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "show_credit_limit" : null,
  "signup_type" : null,
  "state_id" : null,
  "state_name" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_id" : null,
  "user_name" : null,
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
}

```

## 检查联系人主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_partners/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
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
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
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
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
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
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">state_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
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



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
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
  "buyer_id" : null,
  "calendar_last_notif_ack" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "country_name" : null,
  "create_date" : null,
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
  "display_name" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
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
  "is_ubl_format" : null,
  "journal_item_count" : null,
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
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "parent_name" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
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
  "sale_order_count" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "show_credit_limit" : null,
  "signup_type" : null,
  "state_id" : null,
  "state_name" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_id" : null,
  "user_name" : null,
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
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取联系人草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_partners/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
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
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
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
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
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
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">state_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
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



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
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
  "buyer_id" : null,
  "calendar_last_notif_ack" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "country_name" : null,
  "create_date" : null,
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
  "display_name" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
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
  "is_ubl_format" : null,
  "journal_item_count" : null,
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
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "parent_name" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
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
  "sale_order_count" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "show_credit_limit" : null,
  "signup_type" : null,
  "state_id" : null,
  "state_name" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_id" : null,
  "user_name" : null,
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
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
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
  "buyer_id" : null,
  "calendar_last_notif_ack" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "country_name" : null,
  "create_date" : null,
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
  "display_name" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
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
  "is_ubl_format" : null,
  "journal_item_count" : null,
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
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "parent_name" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
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
  "sale_order_count" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "show_credit_limit" : null,
  "signup_type" : null,
  "state_id" : null,
  "state_name" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_id" : null,
  "user_name" : null,
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
}

```

## 保存联系人

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_partners/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">activities</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|活动集合|
|<el-row justify="space-between"><el-col :span="20">attachments</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|附件集合|
|<el-row justify="space-between"><el-col :span="20">followers</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|关注者|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">active_lang_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效语言数量|
|<el-row justify="space-between"><el-col :span="20">activity_date_deadline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|下一活动截止日期|
|<el-row justify="space-between"><el-col :span="20">activity_exception_decoration</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">activity_exception_icon</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|图标|
|<el-row justify="space-between"><el-col :span="20">activity_state</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">additional_info</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|附加信息|
|<el-row justify="space-between"><el-col :span="20">autopost_bills</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">bank_account_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|银行|
|<el-row justify="space-between"><el-col :span="20">barcode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条形码|
|<el-row justify="space-between"><el-col :span="20">buyer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">calendar_last_notif_ack</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|从基本日历中标记为已读的最后一条通知|
|<el-row justify="space-between"><el-col :span="20">certifications_company_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司认证数|
|<el-row justify="space-between"><el-col :span="20">certifications_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|认证计算|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|城市|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|颜色索引|
|<el-row justify="space-between"><el-col :span="20">comment</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|备注|
|<el-row justify="space-between"><el-col :span="20">commercial_company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称实体|
|<el-row justify="space-between"><el-col :span="20">commercial_partner_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">company_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司名称|
|<el-row justify="space-between"><el-col :span="20">company_registry</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司注册号|
|<el-row justify="space-between"><el-col :span="20">company_registry_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司 ID 标签|
|<el-row justify="space-between"><el-col :span="20">company_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">complete_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|全名|
|<el-row justify="space-between"><el-col :span="20">contact_address</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|完整地址|
|<el-row justify="space-between"><el-col :span="20">contact_address_inline</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内嵌完整地址|
|<el-row justify="space-between"><el-col :span="20">country_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">country_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">credit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应收账款总计|
|<el-row justify="space-between"><el-col :span="20">credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|信贷额度|
|<el-row justify="space-between"><el-col :span="20">credit_to_invoice</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|贷记入发票|
|<el-row justify="space-between"><el-col :span="20">customer_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|客户等级|
|<el-row justify="space-between"><el-col :span="20">days_sales_outstanding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|销售变现天数（DSO）|
|<el-row justify="space-between"><el-col :span="20">debit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款总计|
|<el-row justify="space-between"><el-col :span="20">debit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|应付账款限额|
|<el-row justify="space-between"><el-col :span="20">display_invoice_edi_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示发票 Edi 格式|
|<el-row justify="space-between"><el-col :span="20">display_invoice_template_pdf_report_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Display Invoice Template Pdf Report|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">duplicated_bank_account_partners_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Duplicated Bank Account Partners Count|
|<el-row justify="space-between"><el-col :span="20">email</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|邮箱|
|<el-row justify="space-between"><el-col :span="20">email_formatted</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|格式化邮件|
|<el-row justify="space-between"><el-col :span="20">email_normalized</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规范化邮件|
|<el-row justify="space-between"><el-col :span="20">employee</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工|
|<el-row justify="space-between"><el-col :span="20">employees_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工数量|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">function</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作职位|
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
|<el-row justify="space-between"><el-col :span="20">is_ubl_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是 Ubl 格式|
|<el-row justify="space-between"><el-col :span="20">journal_item_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|日记账项目|
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
|<el-row justify="space-between"><el-col :span="20">on_time_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|准时交货率|
|<el-row justify="space-between"><el-col :span="20">opportunity_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机数量|
|<el-row justify="space-between"><el-col :span="20">parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">parent_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">partner_company_registry_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|合作伙伴公司注册处占位符|
|<el-row justify="space-between"><el-col :span="20">partner_gid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|公司数据库ID|
|<el-row justify="space-between"><el-col :span="20">partner_latitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理纬度|
|<el-row justify="space-between"><el-col :span="20">partner_longitude</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|地理经度|
|<el-row justify="space-between"><el-col :span="20">partner_share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享合作伙伴|
|<el-row justify="space-between"><el-col :span="20">partner_vat_placeholder</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Partner Vat Placeholder|
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
|<el-row justify="space-between"><el-col :span="20">sale_order_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单计数|
|<el-row justify="space-between"><el-col :span="20">sale_warn</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">sale_warn_msg</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售订单消息|
|<el-row justify="space-between"><el-col :span="20">show_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示信用额度|
|<el-row justify="space-between"><el-col :span="20">signup_type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|注册令牌（Token）类型|
|<el-row justify="space-between"><el-col :span="20">state_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">state_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|街道|
|<el-row justify="space-between"><el-col :span="20">street2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|详细地址|
|<el-row justify="space-between"><el-col :span="20">supplier_invoice_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|＃供应商账单|
|<el-row justify="space-between"><el-col :span="20">supplier_rank</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|供应商排名|
|<el-row justify="space-between"><el-col :span="20">task_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|null|
|<el-row justify="space-between"><el-col :span="20">total_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|BigDecimal|已开票总计|
|<el-row justify="space-between"><el-col :span="20">trust</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">tz</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">tz_offset</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区偏移|
|<el-row justify="space-between"><el-col :span="20">use_partner_credit_limit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|合作伙伴限制|
|<el-row justify="space-between"><el-col :span="20">user_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">user_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
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



##### 请求示例： {docsify-ignore}
```json
{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
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
  "buyer_id" : null,
  "calendar_last_notif_ack" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "country_name" : null,
  "create_date" : null,
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
  "display_name" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
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
  "is_ubl_format" : null,
  "journal_item_count" : null,
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
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "parent_name" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
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
  "sale_order_count" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "show_credit_limit" : null,
  "signup_type" : null,
  "state_id" : null,
  "state_name" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_id" : null,
  "user_name" : null,
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
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "activities" : null,
  "attachments" : null,
  "followers" : null,
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
  "buyer_id" : null,
  "calendar_last_notif_ack" : null,
  "certifications_company_count" : null,
  "certifications_count" : null,
  "city" : null,
  "color" : null,
  "comment" : null,
  "commercial_company_name" : null,
  "commercial_partner_id" : null,
  "company_id" : null,
  "company_name" : null,
  "company_registry" : null,
  "company_registry_label" : null,
  "company_type" : null,
  "complete_name" : null,
  "contact_address" : null,
  "contact_address_inline" : null,
  "country_id" : null,
  "country_name" : null,
  "create_date" : null,
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
  "display_name" : null,
  "duplicated_bank_account_partners_count" : null,
  "email" : null,
  "email_formatted" : null,
  "email_normalized" : null,
  "employee" : null,
  "employees_count" : null,
  "fiscal_country_codes" : null,
  "function" : null,
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
  "is_ubl_format" : null,
  "journal_item_count" : null,
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
  "on_time_rate" : null,
  "opportunity_count" : null,
  "parent_id" : null,
  "parent_name" : null,
  "partner_company_registry_placeholder" : null,
  "partner_gid" : null,
  "partner_latitude" : null,
  "partner_longitude" : null,
  "partner_share" : null,
  "partner_vat_placeholder" : null,
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
  "sale_order_count" : null,
  "sale_warn" : null,
  "sale_warn_msg" : null,
  "show_credit_limit" : null,
  "signup_type" : null,
  "state_id" : null,
  "state_name" : null,
  "street" : null,
  "street2" : null,
  "supplier_invoice_count" : null,
  "supplier_rank" : null,
  "task_count" : null,
  "total_invoiced" : null,
  "trust" : null,
  "type" : null,
  "tz" : null,
  "tz_offset" : null,
  "use_partner_credit_limit" : null,
  "user_id" : null,
  "user_name" : null,
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
}

```

## 频道可邀请的联系人

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_partners/fetch_channel_invite" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_activity_exception_decoration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">n_activity_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">n_autopost_bills_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">n_buyer_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">n_commercial_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">n_country_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">n_country_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">n_country_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_industry_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行业|
|<el-row justify="space-between"><el-col :span="20">n_invoice_edi_format_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子发票格式|
|<el-row justify="space-between"><el-col :span="20">n_invoice_sending_method_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|传送发票|
|<el-row justify="space-between"><el-col :span="20">n_invoice_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">n_peppol_eas_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol电子地址（EAS）|
|<el-row justify="space-between"><el-col :span="20">n_picking_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货|
|<el-row justify="space-between"><el-col :span="20">n_property_purchase_currency_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商币别|
|<el-row justify="space-between"><el-col :span="20">n_purchase_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单预警|
|<el-row justify="space-between"><el-col :span="20">n_sale_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">n_state_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">n_state_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">n_state_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">n_trust_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">n_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">n_tz_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">n_user_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">n_user_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_activity_exception_decoration_eq" : null,
  "n_activity_state_eq" : null,
  "n_autopost_bills_eq" : null,
  "n_buyer_id_eq" : null,
  "n_commercial_partner_id_eq" : null,
  "n_company_id_eq" : null,
  "n_company_type_eq" : null,
  "n_country_id_eq" : null,
  "n_country_name_eq" : null,
  "n_country_name_like" : null,
  "n_id_eq" : null,
  "n_industry_id_eq" : null,
  "n_invoice_edi_format_eq" : null,
  "n_invoice_sending_method_eq" : null,
  "n_invoice_warn_eq" : null,
  "n_name_like" : null,
  "n_parent_id_eq" : null,
  "n_parent_name_eq" : null,
  "n_parent_name_like" : null,
  "n_peppol_eas_eq" : null,
  "n_picking_warn_eq" : null,
  "n_property_purchase_currency_id_eq" : null,
  "n_purchase_warn_eq" : null,
  "n_sale_warn_eq" : null,
  "n_state_id_eq" : null,
  "n_state_name_eq" : null,
  "n_state_name_like" : null,
  "n_trust_eq" : null,
  "n_type_eq" : null,
  "n_tz_eq" : null,
  "n_user_id_eq" : null,
  "n_user_name_eq" : null,
  "n_user_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "activities" : null,
    "attachments" : null,
    "followers" : null,
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
    "buyer_id" : null,
    "calendar_last_notif_ack" : null,
    "certifications_company_count" : null,
    "certifications_count" : null,
    "city" : null,
    "color" : null,
    "comment" : null,
    "commercial_company_name" : null,
    "commercial_partner_id" : null,
    "company_id" : null,
    "company_name" : null,
    "company_registry" : null,
    "company_registry_label" : null,
    "company_type" : null,
    "complete_name" : null,
    "contact_address" : null,
    "contact_address_inline" : null,
    "country_id" : null,
    "country_name" : null,
    "create_date" : null,
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
    "display_name" : null,
    "duplicated_bank_account_partners_count" : null,
    "email" : null,
    "email_formatted" : null,
    "email_normalized" : null,
    "employee" : null,
    "employees_count" : null,
    "fiscal_country_codes" : null,
    "function" : null,
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
    "is_ubl_format" : null,
    "journal_item_count" : null,
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
    "on_time_rate" : null,
    "opportunity_count" : null,
    "parent_id" : null,
    "parent_name" : null,
    "partner_company_registry_placeholder" : null,
    "partner_gid" : null,
    "partner_latitude" : null,
    "partner_longitude" : null,
    "partner_share" : null,
    "partner_vat_placeholder" : null,
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
    "sale_order_count" : null,
    "sale_warn" : null,
    "sale_warn_msg" : null,
    "show_credit_limit" : null,
    "signup_type" : null,
    "state_id" : null,
    "state_name" : null,
    "street" : null,
    "street2" : null,
    "supplier_invoice_count" : null,
    "supplier_rank" : null,
    "task_count" : null,
    "total_invoiced" : null,
    "trust" : null,
    "type" : null,
    "tz" : null,
    "tz_offset" : null,
    "use_partner_credit_limit" : null,
    "user_id" : null,
    "user_name" : null,
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
  }
]
```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_partners/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_activity_exception_decoration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">n_activity_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">n_autopost_bills_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">n_buyer_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">n_commercial_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">n_country_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">n_country_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">n_country_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_industry_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行业|
|<el-row justify="space-between"><el-col :span="20">n_invoice_edi_format_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子发票格式|
|<el-row justify="space-between"><el-col :span="20">n_invoice_sending_method_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|传送发票|
|<el-row justify="space-between"><el-col :span="20">n_invoice_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">n_peppol_eas_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol电子地址（EAS）|
|<el-row justify="space-between"><el-col :span="20">n_picking_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货|
|<el-row justify="space-between"><el-col :span="20">n_property_purchase_currency_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商币别|
|<el-row justify="space-between"><el-col :span="20">n_purchase_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单预警|
|<el-row justify="space-between"><el-col :span="20">n_sale_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">n_state_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">n_state_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">n_state_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">n_trust_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">n_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">n_tz_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">n_user_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">n_user_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_activity_exception_decoration_eq" : null,
  "n_activity_state_eq" : null,
  "n_autopost_bills_eq" : null,
  "n_buyer_id_eq" : null,
  "n_commercial_partner_id_eq" : null,
  "n_company_id_eq" : null,
  "n_company_type_eq" : null,
  "n_country_id_eq" : null,
  "n_country_name_eq" : null,
  "n_country_name_like" : null,
  "n_id_eq" : null,
  "n_industry_id_eq" : null,
  "n_invoice_edi_format_eq" : null,
  "n_invoice_sending_method_eq" : null,
  "n_invoice_warn_eq" : null,
  "n_name_like" : null,
  "n_parent_id_eq" : null,
  "n_parent_name_eq" : null,
  "n_parent_name_like" : null,
  "n_peppol_eas_eq" : null,
  "n_picking_warn_eq" : null,
  "n_property_purchase_currency_id_eq" : null,
  "n_purchase_warn_eq" : null,
  "n_sale_warn_eq" : null,
  "n_state_id_eq" : null,
  "n_state_name_eq" : null,
  "n_state_name_like" : null,
  "n_trust_eq" : null,
  "n_type_eq" : null,
  "n_tz_eq" : null,
  "n_user_id_eq" : null,
  "n_user_name_eq" : null,
  "n_user_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "activities" : null,
    "attachments" : null,
    "followers" : null,
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
    "buyer_id" : null,
    "calendar_last_notif_ack" : null,
    "certifications_company_count" : null,
    "certifications_count" : null,
    "city" : null,
    "color" : null,
    "comment" : null,
    "commercial_company_name" : null,
    "commercial_partner_id" : null,
    "company_id" : null,
    "company_name" : null,
    "company_registry" : null,
    "company_registry_label" : null,
    "company_type" : null,
    "complete_name" : null,
    "contact_address" : null,
    "contact_address_inline" : null,
    "country_id" : null,
    "country_name" : null,
    "create_date" : null,
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
    "display_name" : null,
    "duplicated_bank_account_partners_count" : null,
    "email" : null,
    "email_formatted" : null,
    "email_normalized" : null,
    "employee" : null,
    "employees_count" : null,
    "fiscal_country_codes" : null,
    "function" : null,
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
    "is_ubl_format" : null,
    "journal_item_count" : null,
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
    "on_time_rate" : null,
    "opportunity_count" : null,
    "parent_id" : null,
    "parent_name" : null,
    "partner_company_registry_placeholder" : null,
    "partner_gid" : null,
    "partner_latitude" : null,
    "partner_longitude" : null,
    "partner_share" : null,
    "partner_vat_placeholder" : null,
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
    "sale_order_count" : null,
    "sale_warn" : null,
    "sale_warn_msg" : null,
    "show_credit_limit" : null,
    "signup_type" : null,
    "state_id" : null,
    "state_name" : null,
    "street" : null,
    "street2" : null,
    "supplier_invoice_count" : null,
    "supplier_rank" : null,
    "task_count" : null,
    "total_invoiced" : null,
    "trust" : null,
    "type" : null,
    "tz" : null,
    "tz_offset" : null,
    "use_partner_credit_limit" : null,
    "user_id" : null,
    "user_name" : null,
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
  }
]
```

## 公司联系人

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_partners/fetch_is_company" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_activity_exception_decoration_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动异常标示|
|<el-row justify="space-between"><el-col :span="20">n_activity_state_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|活动状态|
|<el-row justify="space-between"><el-col :span="20">n_autopost_bills_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Auto-post bills|
|<el-row justify="space-between"><el-col :span="20">n_buyer_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购员|
|<el-row justify="space-between"><el-col :span="20">n_commercial_partner_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|商业实体|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司|
|<el-row justify="space-between"><el-col :span="20">n_company_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司类型|
|<el-row justify="space-between"><el-col :span="20">n_country_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">n_country_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">n_country_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|国家/地区|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_industry_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行业|
|<el-row justify="space-between"><el-col :span="20">n_invoice_edi_format_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子发票格式|
|<el-row justify="space-between"><el-col :span="20">n_invoice_sending_method_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|传送发票|
|<el-row justify="space-between"><el-col :span="20">n_invoice_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|发票|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">n_parent_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|相关公司|
|<el-row justify="space-between"><el-col :span="20">n_peppol_eas_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Peppol电子地址（EAS）|
|<el-row justify="space-between"><el-col :span="20">n_picking_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|库存拣货|
|<el-row justify="space-between"><el-col :span="20">n_property_purchase_currency_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|供应商币别|
|<el-row justify="space-between"><el-col :span="20">n_purchase_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|采购订单预警|
|<el-row justify="space-between"><el-col :span="20">n_sale_warn_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|销售警告信息|
|<el-row justify="space-between"><el-col :span="20">n_state_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">n_state_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">n_state_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|省/州|
|<el-row justify="space-between"><el-col :span="20">n_trust_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|Degree of trust you have in this debtor|
|<el-row justify="space-between"><el-col :span="20">n_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址类型|
|<el-row justify="space-between"><el-col :span="20">n_tz_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|时区|
|<el-row justify="space-between"><el-col :span="20">n_user_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">n_user_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|
|<el-row justify="space-between"><el-col :span="20">n_user_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务员|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_activity_exception_decoration_eq" : null,
  "n_activity_state_eq" : null,
  "n_autopost_bills_eq" : null,
  "n_buyer_id_eq" : null,
  "n_commercial_partner_id_eq" : null,
  "n_company_id_eq" : null,
  "n_company_type_eq" : null,
  "n_country_id_eq" : null,
  "n_country_name_eq" : null,
  "n_country_name_like" : null,
  "n_id_eq" : null,
  "n_industry_id_eq" : null,
  "n_invoice_edi_format_eq" : null,
  "n_invoice_sending_method_eq" : null,
  "n_invoice_warn_eq" : null,
  "n_name_like" : null,
  "n_parent_id_eq" : null,
  "n_parent_name_eq" : null,
  "n_parent_name_like" : null,
  "n_peppol_eas_eq" : null,
  "n_picking_warn_eq" : null,
  "n_property_purchase_currency_id_eq" : null,
  "n_purchase_warn_eq" : null,
  "n_sale_warn_eq" : null,
  "n_state_id_eq" : null,
  "n_state_name_eq" : null,
  "n_state_name_like" : null,
  "n_trust_eq" : null,
  "n_type_eq" : null,
  "n_tz_eq" : null,
  "n_user_id_eq" : null,
  "n_user_name_eq" : null,
  "n_user_name_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "activities" : null,
    "attachments" : null,
    "followers" : null,
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
    "buyer_id" : null,
    "calendar_last_notif_ack" : null,
    "certifications_company_count" : null,
    "certifications_count" : null,
    "city" : null,
    "color" : null,
    "comment" : null,
    "commercial_company_name" : null,
    "commercial_partner_id" : null,
    "company_id" : null,
    "company_name" : null,
    "company_registry" : null,
    "company_registry_label" : null,
    "company_type" : null,
    "complete_name" : null,
    "contact_address" : null,
    "contact_address_inline" : null,
    "country_id" : null,
    "country_name" : null,
    "create_date" : null,
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
    "display_name" : null,
    "duplicated_bank_account_partners_count" : null,
    "email" : null,
    "email_formatted" : null,
    "email_normalized" : null,
    "employee" : null,
    "employees_count" : null,
    "fiscal_country_codes" : null,
    "function" : null,
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
    "is_ubl_format" : null,
    "journal_item_count" : null,
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
    "on_time_rate" : null,
    "opportunity_count" : null,
    "parent_id" : null,
    "parent_name" : null,
    "partner_company_registry_placeholder" : null,
    "partner_gid" : null,
    "partner_latitude" : null,
    "partner_longitude" : null,
    "partner_share" : null,
    "partner_vat_placeholder" : null,
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
    "sale_order_count" : null,
    "sale_warn" : null,
    "sale_warn_msg" : null,
    "show_credit_limit" : null,
    "signup_type" : null,
    "state_id" : null,
    "state_name" : null,
    "street" : null,
    "street2" : null,
    "supplier_invoice_count" : null,
    "supplier_rank" : null,
    "task_count" : null,
    "total_invoiced" : null,
    "trust" : null,
    "type" : null,
    "tz" : null,
    "tz_offset" : null,
    "use_partner_credit_limit" : null,
    "user_id" : null,
    "user_name" : null,
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
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_partners/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_partners/exportdata/{param},/res_partners/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_partners/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_partners/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_partners/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_partners/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_partners/report" type="info" :closable="false" ></el-alert>
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