<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)as my_attention  from (
	select id, 
    (select count(1) from favorite where create_man=? and owner_id=t1.id ) as is_favorite
	from hr_applicant t1 
)t  where is_favorite = 1

```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfpersonid`

重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
