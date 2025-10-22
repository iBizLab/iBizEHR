<p class="panel-title"><b>执行sql语句</b></p>

```sql
select COUNT(1) applicant_interview from comment where comment.PRINCIPAL_ID = ? and comment.PRINCIPAL_TYPE  = 'HR_APPLICANT'
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(标识)`

重置参数`Default(传入变量)`，并将执行sql结果赋值给参数`Default(传入变量)`
