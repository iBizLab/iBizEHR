```sql
SELECT
t41.`CATEGORY_ID`,
t51.`NAME` AS `CATEGORY_NAME`,
t21.`NAME` AS `COMPANY_NAME`,
t1.`GID`,
t41.`NAME` AS `GROUP_NAME`,
t1.`ID`,
t11.`LOGIN`,
t1.`NAME`,
t1.`USER_ID`,
t31.`NAME` AS `USER_NAME`
FROM `res_groups_users_rel` t1 
LEFT JOIN `res_users` t11 ON t1.`USER_ID` = t11.`ID` 
LEFT JOIN `res_company` t21 ON t11.`COMPANY_ID` = t21.`ID` 
LEFT JOIN `res_partner` t31 ON t11.`PARTNER_ID` = t31.`ID` 
LEFT JOIN `res_groups` t41 ON t1.`GID` = t41.`ID` 
LEFT JOIN `ir_module_category` t51 ON t41.`CATEGORY_ID` = t51.`ID` 


```