# 销售团队(crm_team)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|电子邮箱别名|ALIAS_EMAIL|文本，可指定长度|500|是||
|别名|ALIAS_ID|外键值|100|否||
|自动指派|ASSIGNMENT_AUTO_ENABLED|是否逻辑||是||
|指派域名|ASSIGNMENT_DOMAIN|文本，可指定长度|500|是||
|线索指派|ASSIGNMENT_ENABLED|是否逻辑||是||
|线索平均能力|ASSIGNMENT_MAX|整型||是||
|跳过自动分配|ASSIGNMENT_OPTOUT|是否逻辑||是||
|颜色指标|COLOR|整型||是||
|公司|COMPANY_ID|外键值|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|仪表板按钮|DASHBOARD_BUTTON_NAME|文本，可指定长度|500|是||
|数据仪表图|DASHBOARD_GRAPH_DATA|长文本，没有长度限制|1048576|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|本月已开具发票|INVOICED|浮点||是||
|开票目标|INVOICED_TARGET|浮点||是||
|显示仪表|IS_FAVORITE|是否逻辑||是||
|允许多个会员资格|IS_MEMBERSHIP_MULTI|是否逻辑||是||
|本月指派的线索/商机|LEAD_ALL_ASSIGNED_MONTH_COUNT|整型||是||
|超出每月线索分配|LEAD_ALL_ASSIGNED_MONTH_EXCEEDED|是否逻辑||是||
|线索属性|LEAD_PROPERTIES_DEFINITION|长文本，没有长度限制|1048576|是||
|未指派的线索|LEAD_UNASSIGNED_COUNT|整型||是||
|会员问题警告|MEMBER_WARNING|长文本，没有长度限制|1048576|是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|名称|NAME|文本，可指定长度|200|是||
|商机收入|OPPORTUNITIES_AMOUNT|数值||是||
|商机|OPPORTUNITIES_COUNT|整型||是||
|逾期商机收入|OPPORTUNITIES_OVERDUE_AMOUNT|数值||是||
|逾期商机|OPPORTUNITIES_OVERDUE_COUNT|整型||是||
|待开票报价单金额|QUOTATIONS_AMOUNT|浮点||是||
|待开票报价单的数量|QUOTATIONS_COUNT|整型||是||
|待开票销售的数量|SALES_TO_INVOICE_COUNT|整型||是||
|销售订单号|SALE_ORDER_COUNT|整型||是||
|序列|SEQUENCE|整型||是||
|团队负责人|USER_ID|外键值|100|是||
|线索|USE_LEADS|是否逻辑||是||
|渠道|USE_OPPORTUNITIES|是否逻辑||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_RES_USERS_CRM_TEAM_SALE_TEAM_ID](der/DER1N_RES_USERS_CRM_TEAM_SALE_TEAM_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_CRM_TEAM_MAIL_ALIAS_ALIAS_ID](der/DER1N_CRM_TEAM_MAIL_ALIAS_ALIAS_ID)|[EMail别名(MAIL_ALIAS)](module/mail/mail_alias)|1:N关系||
|[DER1N_CRM_TEAM_RES_COMPANY_COMPANY_ID](der/DER1N_CRM_TEAM_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_CRM_TEAM_RES_USERS_USER_ID](der/DER1N_CRM_TEAM_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ALIAS_ID_EQ|别名|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_ID_EQ|标识|EQ||
|N_USER_ID_EQ|团队负责人|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/crm/crm_team?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_team?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_team?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/crm/crm_team?id=搜索模式`">
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