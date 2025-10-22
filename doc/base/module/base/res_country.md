# 国家/地区(res_country)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|报表中的布局|ADDRESS_FORMAT|长文本，没有长度限制|1048576|是||
|国家/地区代码|CODE|文本，可指定长度|500|否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|币别|CURRENCY_ID|外键值|100|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|旗帜|IMAGE_URL|文本，可指定长度|500|是||
|是支持Stripe支付的国家/地区|IS_STRIPE_SUPPORTED_COUNTRY|是否逻辑||是||
|名称|NAME|文本，可指定长度|200|是||
|客户姓名 职位|NAME_POSITION|[单项选择(文本值)](index/dictionary_index#res_country_name_position "客户姓名 职位")|60|是||
|国家/地区长途区号|PHONE_CODE|整型||是||
|省/州必填|STATE_REQUIRED|是否逻辑||是||
|大桶标签|VAT_LABEL|文本，可指定长度|500|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||
|需要邮编|ZIP_REQUIRED|是否逻辑||是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_CONTRACT_TYPE_RES_COUNTRY_COUNTRY_ID](der/DER1N_HR_CONTRACT_TYPE_RES_COUNTRY_COUNTRY_ID)|[合同类型(HR_CONTRACT_TYPE)](module/hr/hr_contract_type)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_COUNTRY_COUNTRY_ID](der/DER1N_HR_EMPLOYEE_RES_COUNTRY_COUNTRY_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_COUNTRY_PRIVATE_COUNTRY_ID](der/DER1N_HR_EMPLOYEE_RES_COUNTRY_PRIVATE_COUNTRY_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_MAIL_GUEST_RES_COUNTRY_COUNTRY_ID](der/DER1N_MAIL_GUEST_RES_COUNTRY_COUNTRY_ID)|[访客(MAIL_GUEST)](module/mail/mail_guest)|1:N关系||
|[DER1N_RES_COMPANY_RES_COUNTRY_ACCOUNT_FISCAL_COUNTRY_ID](der/DER1N_RES_COMPANY_RES_COUNTRY_ACCOUNT_FISCAL_COUNTRY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_COUNTRY_STATE_RES_COUNTRY_COUNTRY_ID](der/DER1N_RES_COUNTRY_STATE_RES_COUNTRY_COUNTRY_ID)|[国家省/州(RES_COUNTRY_STATE)](module/base/res_country_state)|1:N关系||
|[DER1N_RES_PARTNER_RES_COUNTRY_COUNTRY_ID](der/DER1N_RES_PARTNER_RES_COUNTRY_COUNTRY_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RES_COUNTRY_RES_CURRENCY_CURRENCY_ID](der/DER1N_RES_COUNTRY_RES_CURRENCY_CURRENCY_ID)|[币别(RES_CURRENCY)](module/base/res_currency)|1:N关系||

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
|[DEFAULT](module/base/res_country/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/res_country/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/res_country/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CURRENCY_ID_EQ|币别|EQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_NAME_POSITION_EQ|客户姓名 职位|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_country?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_country?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_country?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_country?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_country?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_country?id=搜索模式`">
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