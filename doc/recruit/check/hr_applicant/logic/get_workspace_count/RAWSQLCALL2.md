<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) today_interview from hr_interview hi 
left join hr_interview_schedule his on hi.SCHEDULE_ID = his.id
where  DATE(his.START_DATE) = CURRENT_DATE;
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
