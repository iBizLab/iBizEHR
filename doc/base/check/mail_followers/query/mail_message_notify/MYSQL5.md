```sql
SELECT
t1.`ID`,
t1.`PARTNER_ID`
FROM `mail_followers` t1 

WHERE ( exists(select 1 from `mail_message` t2 where t1.	
res_model = t2.model and t2.id=#{ctx.webcontext.id})  AND  t1.`TYPE` = '40'  AND  t1.`PARTNER_ID` <> #{ctx.sessioncontext.srfpartnerid} )
```