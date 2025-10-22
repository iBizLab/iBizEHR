# 基础模块(base) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[评论(COMMENT)](module/base/comment)|comment|主实体|SQL|COMMENT|否|否|自控制|否||
|[执行人(EXECUTOR)](module/base/executor)|executor|主实体|SQL|EXECUTOR|是|否|自控制|否||
|[扩展日志(EXTEND_LOG)](module/base/extend_log)|extend_log|主实体|SQL|EXTEND_LOG|否|否|自控制|否|记录扩展日志|
|[收藏(FAVORITE)](module/base/favorite)|favorite|主实体|SQL|FAVORITE|是|否|自控制|否|用户自定义的收藏记录，方便快速访问常用的实体或页面。|
|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|ir_attachment|主实体|SQL|ir_attachment|否|否|自控制|否||
|[分析报表(REPORT)](module/base/report)|report|主实体|SQL|REPORT|否|否|自控制|否||
|[组织(RES_COMPANY)](module/base/res_company)|res_company|主实体|SQL|res_company|否|否|自控制|否||
|[用户(RES_USERS)](module/base/res_users)|res_users|主实体|SQL|res_users|否|否|自控制|否||
|[设置(SYSTEM_SETTING)](module/base/system_setting)|system_setting|主实体|无存储||否|否|自控制|否||
|[工作台(WORKSPACE)](module/base/workspace)|workspace|主实体|无存储||否|否|自控制|否||

