```sql
SELECT
t1.`GID`,
t11.`NAME` AS `GNAME`,
t1.`HID`,
t21.`NAME` AS `HNAME`,
t1.`ID`,
t1.`NAME`
FROM `res_groups_implied_rel` t1 
LEFT JOIN `res_groups` t11 ON t1.`GID` = t11.`ID` 
LEFT JOIN `res_groups` t21 ON t1.`HID` = t21.`ID` 


```