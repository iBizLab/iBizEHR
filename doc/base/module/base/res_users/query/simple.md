## 简单查询(simple) <!-- {docsify-ignore-all} -->



<p class="panel-title"><b>查看SQL语句</b></p>
<br>

<el-row>
&nbsp;<el-tag @click="MYSQL5 = true">MYSQL5</el-tag>
</el-row>

<br>
<p class="panel-title"><b>是否默认查询</b></p>

* `否`

<p class="panel-title"><b>是否权限使用</b></p>

* `否`

<p class="panel-title"><b>是否自定义SQL</b></p>

* `否`

<p class="panel-title"><b>查询列级别</b></p>

* `默认（全部查询列）`






<el-dialog v-model="MYSQL5" title="MYSQL5">

```sql
SELECT
t1.`ACTIVE`,
t11.`ADDITIONAL_INFO`,
t11.`AUTOPOST_BILLS`,
t11.`BARCODE`,
t11.`BUYER_ID`,
t11.`CALENDAR_LAST_NOTIF_ACK`,
t11.`CITY`,
t11.`COLOR`,
t11.`COMMERCIAL_COMPANY_NAME`,
t11.`COMMERCIAL_PARTNER_ID`,
t1.`COMPANY_ID`,
t21.`NAME` AS `COMPANY_NAME`,
t11.`COMPANY_REGISTRY`,
t11.`COMPLETE_NAME`,
t11.`COUNTRY_ID`,
t1.`CREATE_DATE`,
t1.`CREATE_UID`,
t11.`CREDIT_LIMIT`,
t11.`CUSTOMER_RANK`,
t11.`DEBIT_LIMIT`,
t1.`DISPLAY_NAME`,
t11.`EMAIL`,
t11.`EMAIL_NORMALIZED`,
t11.`EMPLOYEE`,
t11.`FUNCTION`,
(SELECT count(1) FROM `res_groups_users_rel` t where  t.USER_ID=t1.`ID`) AS `GROUPS_COUNT`,
t1.`ID`,
t11.`IGNORE_ABNORMAL_INVOICE_AMOUNT`,
t11.`IGNORE_ABNORMAL_INVOICE_DATE`,
t11.`INDUSTRY_ID`,
t11.`INVOICE_EDI_FORMAT_STORE`,
t11.`INVOICE_SENDING_METHOD`,
t11.`INVOICE_WARN`,
t11.`IS_COMPANY`,
t1.`KARMA`,
t1.`LOGIN`,
t11.`MESSAGE_BOUNCE`,
t11.`MOBILE`,
t11.`NAME`,
t1.`NOTIFICATION_TYPE`,
t1.`ODOOBOT_FAILED`,
t1.`ODOOBOT_STATE`,
t11.`PARENT_ID`,
t11.`PARTNER_GID`,
t1.`PARTNER_ID`,
t11.`PARTNER_LATITUDE`,
t11.`PARTNER_LONGITUDE`,
t11.`NAME` AS `PARTNER_NAME`,
t11.`PARTNER_SHARE`,
t1.`PASSWORD`,
t11.`PEPPOL_EAS`,
t11.`PEPPOL_ENDPOINT`,
t11.`PHONE`,
t11.`PHONE_SANITIZED`,
t11.`PICKING_WARN`,
t11.`PLAN_TO_CHANGE_BIKE`,
t11.`PLAN_TO_CHANGE_CAR`,
t11.`PROPERTY_PURCHASE_CURRENCY_ID`,
t11.`PURCHASE_WARN`,
t11.`RECEIPT_REMINDER_EMAIL`,
t11.`REF`,
t11.`REMINDER_DATE_BEFORE_RECEIPT`,
t1.`SALE_TEAM_ID`,
t11.`SALE_WARN`,
t1.`SHARE`,
t11.`SIGNUP_TYPE`,
t11.`STATE_ID`,
t11.`STREET`,
t11.`STREET2`,
t11.`SUPPLIER_RANK`,
t1.`TARGET_SALES_DONE`,
t1.`TARGET_SALES_INVOICED`,
t1.`TARGET_SALES_WON`,
t1.`TOUR_ENABLED`,
t11.`TRUST`,
t11.`TYPE`,
t11.`TZ`,
t11.`USER_ID`,
t11.`VAT`,
t11.`WEBSITE`,
t1.`WRITE_DATE`,
t1.`WRITE_UID`,
t11.`ZIP`
FROM `res_users` t1 
LEFT JOIN `res_partner` t11 ON t1.`PARTNER_ID` = t11.`ID` 
LEFT JOIN `res_company` t21 ON t1.`COMPANY_ID` = t21.`ID` 


```

</el-dialog>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
                MYSQL5 : false
        
      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>