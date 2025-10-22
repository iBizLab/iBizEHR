# 银行账号(res_partner_bank)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|null|ABA_ROUTING|文本，可指定长度|500|是||
|账户持有人姓名|ACC_HOLDER_NAME|文本，可指定长度|500|是||
|账户编号|ACC_NUMBER|文本，可指定长度|500|否||
|有效|ACTIVE|是否逻辑||是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|Activity Exception Decoration|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#res_partner_bank_activity_exception_decoration "Activity Exception Decoration")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#res_partner_bank_activity_state "活动状态")|200|是||
|转出资金|ALLOW_OUT_PAYMENT|是否逻辑||是||
|银行|BANK_ID|外键值|100|是||
|公司|COMPANY_ID|外键值|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|币别|CURRENCY_ID|外键值|100|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|有Iban警告消息|HAS_IBAN_WARNING|是否逻辑||是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|有资金转账警告消息|HAS_MONEY_TRANSFER_WARNING|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|锁定信任字段|LOCK_TRUST_FIELDS|是否逻辑||是||
|Attachment Count|MESSAGE_ATTACHMENT_COUNT|整型||是||
|Message Delivery error|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|待处理|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|Money Transfer Service|MONEY_TRANSFER_SERVICE|文本，可指定长度|500|是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|名称|NAME|文本，可指定长度|200|否||
|账户持有者|PARTNER_ID|外键值|100|否||
|消毒账号|SANITIZED_ACC_NUMBER|文本，可指定长度|500|是||
|序列|SEQUENCE|整型||是||
|用户有验证银行账户的群组|USER_HAS_GROUP_VALIDATE_BANK_ACCOUNT|是否逻辑||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_EMPLOYEE_RES_PARTNER_BANK_BANK_ACCOUNT_ID](der/DER1N_HR_EMPLOYEE_RES_PARTNER_BANK_BANK_ACCOUNT_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RES_PARTNER_BANK_RES_BANK_BANK_ID](der/DER1N_RES_PARTNER_BANK_RES_BANK_BANK_ID)|[银行(RES_BANK)](module/base/res_bank)|1:N关系||
|[DER1N_RES_PARTNER_BANK_RES_COMPANY_COMPANY_ID](der/DER1N_RES_PARTNER_BANK_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_PARTNER_BANK_RES_CURRENCY_CURRENCY_ID](der/DER1N_RES_PARTNER_BANK_RES_CURRENCY_CURRENCY_ID)|[币别(RES_CURRENCY)](module/base/res_currency)|1:N关系||
|[DER1N_RES_PARTNER_BANK_RES_PARTNER_PARTNER_ID](der/DER1N_RES_PARTNER_BANK_RES_PARTNER_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_BANK_ID_EQ|银行|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_CURRENCY_ID_EQ|币别|EQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARTNER_ID_EQ|账户持有者|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_partner_bank?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner_bank?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner_bank?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_partner_bank?id=搜索模式`">
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