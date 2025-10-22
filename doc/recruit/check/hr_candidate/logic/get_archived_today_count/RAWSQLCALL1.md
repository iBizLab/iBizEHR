<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) archived_today_count  from hr_candidate hc where  DATE(hc.LAST_TP_ARCHIVED_AT) = CURRENT_DATE;
```


重置参数`archived_today_count(当日归档数)`，并将执行sql结果赋值给参数`archived_today_count(当日归档数)`
