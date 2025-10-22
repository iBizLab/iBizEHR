## 获取工作台我的事项数 <!-- {docsify-ignore-all} -->

   

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
state "开始" as Begin <<start>> [[$./get_my_summary_count#begin {"开始"}]]
state "简历筛选数量" as RAWSQLCALL1  [[$./get_my_summary_count#rawsqlcall1 {"简历筛选数量"}]]
state "面试反馈数" as RAWSQLCALL2  [[$./get_my_summary_count#rawsqlcall2 {"面试反馈数"}]]
state "考试/测评返回数" as RAWSQLCALL3  [[$./get_my_summary_count#rawsqlcall3 {"考试/测评返回数"}]]
state "结束" as END1 <<end>> [[$./get_my_summary_count#end1 {"结束"}]]


Begin --> RAWSQLCALL1
RAWSQLCALL1 --> RAWSQLCALL2
RAWSQLCALL2 --> RAWSQLCALL3
RAWSQLCALL3 --> END1


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 简历筛选数量 :id=RAWSQLCALL1<sup class="footnote-symbol"> <font color=gray size=1>[直接SQL调用]</font></sup>



<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as candidate_filter
from
	hr_candidate_filter_detail t
where
	status = '1' and t.USER_ID  = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(计数器返回结果)`，并将执行sql结果赋值给参数`result(计数器返回结果)`

#### 面试反馈数 :id=RAWSQLCALL2<sup class="footnote-symbol"> <font color=gray size=1>[直接SQL调用]</font></sup>



<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as interview_feedback
from
	hr_interview_feedback t
where
	t.result_type is null and t.INTERVIEWER_ID  = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(计数器返回结果)`，并将执行sql结果赋值给参数`result(计数器返回结果)`

#### 考试/测评返回数 :id=RAWSQLCALL3<sup class="footnote-symbol"> <font color=gray size=1>[直接SQL调用]</font></sup>



<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as exam_feedback
from
	hr_exam t
where
	status = '10' and t.CREATE_UID  = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(计数器返回结果)`，并将执行sql结果赋值给参数`result(计数器返回结果)`

#### 结束 :id=END1<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



返回 `result(计数器返回结果)`



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[候选人(HR_CANDIDATE)](module/hr/hr_candidate.md)||
|计数器返回结果|result|数据对象|||
