## 获取工作台我的关注数 <!-- {docsify-ignore-all} -->

   

### 处理过程

```plantuml
@startuml
hide empty description
<style>
root {
  HyperlinkColor #42b983
}
</style>

hide empty description
state "开始" as Begin <<start>> [[$./get_my_attention_count#begin {"开始"}]]
state "我关注的" as RAWSQLCALL1  [[$./get_my_attention_count#rawsqlcall1 {"我关注的"}]]
state "我通过的" as RAWSQLCALL2  [[$./get_my_attention_count#rawsqlcall2 {"我通过的"}]]
state "结束" as END1 <<end>> [[$./get_my_attention_count#end1 {"结束"}]]


Begin --> RAWSQLCALL1
RAWSQLCALL1 --> RAWSQLCALL2
RAWSQLCALL2 --> END1


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 我关注的 :id=RAWSQLCALL1<sup class="footnote-symbol"> <font color=gray size=1>[直接SQL调用]</font></sup>



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

#### 我通过的 :id=RAWSQLCALL2<sup class="footnote-symbol"> <font color=gray size=1>[直接SQL调用]</font></sup>



<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as my_pass
from
	hr_interview_feedback t
where
	t.result_type = '1' and t.INTERVIEWER_ID  = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`

#### 结束 :id=END1<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



返回 `result`



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[候选人(HR_CANDIDATE)](module/hr/hr_candidate.md)||
|result|result|数据对象|||
