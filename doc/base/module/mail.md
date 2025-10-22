# 邮件(mail) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[活动(MAIL_ACTIVITY)](module/mail/mail_activity)|mail_activity|主实体|SQL|mail_activity|否|否|自控制|否||
|[活动Mixin(MAIL_ACTIVITY_MIXIN)](module/mail/mail_activity_mixin)|mail_activity_mixin|抽象实体|无存储||否|否|自控制|否||
|[活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan)|mail_activity_plan|主实体|SQL|mail_activity_plan|否|否|自控制|否||
|[活动计划模板(MAIL_ACTIVITY_PLAN_TEMPLATE)](module/mail/mail_activity_plan_template)|mail_activity_plan_template|主实体|SQL|mail_activity_plan_template|否|否|自控制|否||
|[活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule)|mail_activity_schedule|主实体|SQL|mail_activity_schedule|否|否|自控制|否||
|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|mail_activity_type|主实体|SQL|mail_activity_type|否|否|自控制|否||
|[EMail别名(MAIL_ALIAS)](module/mail/mail_alias)|mail_alias|主实体|SQL|mail_alias|否|否|自控制|否||
|[电子邮件域名(MAIL_ALIAS_DOMAIN)](module/mail/mail_alias_domain)|mail_alias_domain|主实体|SQL|mail_alias_domain|否|否|自控制|否||
|[单据关注者(MAIL_FOLLOWERS)](module/mail/mail_followers)|mail_followers|主实体|SQL|mail_followers|否|否|自控制|否||
|[访客(MAIL_GUEST)](module/mail/mail_guest)|mail_guest|主实体|SQL|mail_guest|否|否|自控制|否||
|[消息(MAIL_MESSAGE)](module/mail/mail_message)|mail_message|主实体|SQL|mail_message|否|否|自控制|否||
|[消息收件人(MAIL_MESSAGE_RECIPIENT)](module/mail/mail_message_recipient)|mail_message_recipient|关系实体|SQL|MAIL_MESSAGE_RECIPIENT|否|否|附属主实体控制|否|NN中间表|
|[消息子类型(MAIL_MESSAGE_SUBTYPE)](module/mail/mail_message_subtype)|mail_message_subtype|主实体|SQL|mail_message_subtype|否|否|自控制|否||
|[EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)|mail_template|主实体|SQL|mail_template|否|否|自控制|否||
|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|mail_thread|抽象实体|无存储||否|否|自控制|否||

