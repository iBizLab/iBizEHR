# 基础模块(base) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[头像混合(AVATAR_MIXIN)](module/base/avatar_mixin)|avatar_mixin|主实体|无存储||否|否|自控制|否||
|[图片混合(IMAGE_MIXIN)](module/base/image_mixin)|image_mixin|主实体|无存储||否|否|自控制|否|文件、图片属性应当特殊标记，保存是转为由attachment实体进行保存。当前临时使用逻辑附加进行保存模式确认|
|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|ir_attachment|主实体|SQL|ir_attachment|否|否|自控制|否||
|[默认值(IR_DEFAULT)](module/base/ir_default)|ir_default|主实体|SQL|ir_default|是|否|自控制|否||
|[模型(IR_MODEL)](module/base/ir_model)|ir_model|主实体|SQL|ir_model|否|否|自控制|否||
|[模型访问(IR_MODEL_ACCESS)](module/base/ir_model_access)|ir_model_access|主实体|SQL|ir_model_access|否|否|自控制|否||
|[字段(IR_MODEL_FIELDS)](module/base/ir_model_fields)|ir_model_fields|主实体|SQL|ir_model_fields|否|否|自控制|否||
|[应用(IR_MODULE_CATEGORY)](module/base/ir_module_category)|ir_module_category|主实体|SQL|ir_module_category|否|否|自控制|否||
|[规则(IR_RULE)](module/base/ir_rule)|ir_rule|主实体|SQL|ir_rule|否|否|自控制|否||
|[序列(IR_SEQUENCE)](module/base/ir_sequence)|ir_sequence|主实体|SQL|ir_sequence|否|否|自控制|否||
|[银行(RES_BANK)](module/base/res_bank)|res_bank|主实体|SQL|res_bank|否|否|自控制|否||
|[公司(RES_COMPANY)](module/base/res_company)|res_company|主实体|SQL|res_company|否|否|自控制|否||
|[国家/地区(RES_COUNTRY)](module/base/res_country)|res_country|主实体|SQL|res_country|否|否|自控制|否||
|[国家省/州(RES_COUNTRY_STATE)](module/base/res_country_state)|res_country_state|主实体|SQL|res_country_state|否|否|自控制|否||
|[币别(RES_CURRENCY)](module/base/res_currency)|res_currency|主实体|SQL|res_currency|否|否|自控制|否||
|[权限组(RES_GROUPS)](module/base/res_groups)|res_groups|主实体|SQL|res_groups|否|否|自控制|否||
|[权限组继承(RES_GROUPS_IMPLIED_REL)](module/base/res_groups_implied_rel)|res_groups_implied_rel|关系实体|SQL|res_groups_implied_rel|是|否|附属主实体控制|否||
|[权限组成员(RES_GROUPS_USERS_REL)](module/base/res_groups_users_rel)|res_groups_users_rel|关系实体|SQL|res_groups_users_rel|是|否|附属主实体控制|否|NN中间表|
|[联系人(RES_PARTNER)](module/base/res_partner)|res_partner|主实体|SQL|res_partner|否|否|自控制|否||
|[银行账号(RES_PARTNER_BANK)](module/base/res_partner_bank)|res_partner_bank|主实体|SQL|res_partner_bank|否|否|自控制|否||
|[行业(RES_PARTNER_INDUSTRY)](module/base/res_partner_industry)|res_partner_industry|主实体|SQL|res_partner_industry|否|否|自控制|否||
|[用户(RES_USERS)](module/base/res_users)|res_users|主实体|SQL|res_users|否|否|自控制|否||
|[权限组关联规则(RULE_GROUP_REL)](module/base/rule_group_rel)|rule_group_rel|关系实体|SQL|rule_group_rel|是|否|附属主实体控制|否||

