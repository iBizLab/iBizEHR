```sql
SELECT
t1.`ID`,
t11.`NAME`,
t1.`PARTNER_ID`,
t1.`RES_ID`,
t1.`RES_MODEL`,
t1.`TYPE`
FROM `mail_followers` t1 
LEFT JOIN `res_partner` t11 ON t1.`PARTNER_ID` = t11.`ID` 

WHERE ( t1.`RES_MODEL` = #{ctx.datacontext.srfmodelname} )
```