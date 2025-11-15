
## 存在直接SQL调用的处理逻辑节点<sup class="footnote-symbol"> <font color=orange>[65]</font></sup>

#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[保存候选人申请信息(save_applicantinfo)](module/hr/hr_applicant/logic/save_applicantinfo)

节点：获取阶段实体初筛阶段数据
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select * from hr_recruitment_stage hrs where hrs.NAME  = '初筛'
```


重置参数`stage(阶段)`，并将执行sql结果赋值给参数`stage(阶段)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人基本信息导航栏计数(get_baseinfo_page_count)](module/hr/hr_applicant/logic/get_baseinfo_page_count)

节点：面试
<p class="panel-title"><b>执行sql语句</b></p>

```sql
null
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(标识)`

重置参数`Default(传入变量)`，并将执行sql结果赋值给参数`Default(传入变量)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人基本信息导航栏计数(get_baseinfo_page_count)](module/hr/hr_applicant/logic/get_baseinfo_page_count)

节点：测评
<p class="panel-title"><b>执行sql语句</b></p>

```sql
null
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(标识)`

重置参数`Default(传入变量)`，并将执行sql结果赋值给参数`Default(传入变量)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人基本信息导航栏计数(get_baseinfo_page_count)](module/hr/hr_applicant/logic/get_baseinfo_page_count)

节点：筛选
<p class="panel-title"><b>执行sql语句</b></p>

```sql
null
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(标识)`

重置参数`Default(传入变量)`，并将执行sql结果赋值给参数`Default(传入变量)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人基本信息导航栏计数(get_baseinfo_page_count)](module/hr/hr_applicant/logic/get_baseinfo_page_count)

节点：备注
<p class="panel-title"><b>执行sql语句</b></p>

```sql
null
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(标识)`

重置参数`Default(传入变量)`，并将执行sql结果赋值给参数`Default(传入变量)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人基本信息导航栏计数(get_baseinfo_page_count)](module/hr/hr_applicant/logic/get_baseinfo_page_count)

节点：offer
<p class="panel-title"><b>执行sql语句</b></p>

```sql
null
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `Default(传入变量).ID(标识)`

重置参数`Default(传入变量)`，并将执行sql结果赋值给参数`Default(传入变量)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人状态筛选(get_applicant_state)](module/hr/hr_applicant/logic/get_applicant_state)

节点：初筛
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)  as status_20 
from hr_applicant ha 
left join hr_recruitment_stage hrs on ha.STAGE_ID  = hrs.id
where hrs.`SEQUENCE`  = 20 and ha.status = 1
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人状态筛选(get_applicant_state)](module/hr/hr_applicant/logic/get_applicant_state)

节点：人才推荐
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)  as status_10 
from hr_applicant ha 
left join hr_recruitment_stage hrs on ha.STAGE_ID  = hrs.id
where hrs.`SEQUENCE`  = 10 and ha.status = 1
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人状态筛选(get_applicant_state)](module/hr/hr_applicant/logic/get_applicant_state)

节点：用人部门筛选
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)  as status_30 
from hr_applicant ha 
left join hr_recruitment_stage hrs on ha.STAGE_ID  = hrs.id
where hrs.`SEQUENCE`  = 30 and ha.status = 1
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人状态筛选(get_applicant_state)](module/hr/hr_applicant/logic/get_applicant_state)

节点：初试
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)  as status_40 
from hr_applicant ha 
left join hr_recruitment_stage hrs on ha.STAGE_ID  = hrs.id
where hrs.`SEQUENCE`  = 40 and ha.status = 1
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人状态筛选(get_applicant_state)](module/hr/hr_applicant/logic/get_applicant_state)

节点：沟通offer
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)  as status_70 
from hr_applicant ha 
left join hr_recruitment_stage hrs on ha.STAGE_ID  = hrs.id
where hrs.`SEQUENCE`  = 70 and ha.status = 1
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人状态筛选(get_applicant_state)](module/hr/hr_applicant/logic/get_applicant_state)

节点：大五性格测评
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)  as status_50 
from hr_applicant ha 
left join hr_recruitment_stage hrs on ha.STAGE_ID  = hrs.id
where hrs.`SEQUENCE`  = 50 and ha.status = 1
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人状态筛选(get_applicant_state)](module/hr/hr_applicant/logic/get_applicant_state)

节点：完成
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)  as status_90 
from hr_applicant ha 
left join hr_recruitment_stage hrs on ha.STAGE_ID  = hrs.id
where hrs.`SEQUENCE`  = 90 and ha.status = 1
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人状态筛选(get_applicant_state)](module/hr/hr_applicant/logic/get_applicant_state)

节点：复试
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)  as status_60 
from hr_applicant ha 
left join hr_recruitment_stage hrs on ha.STAGE_ID  = hrs.id
where hrs.`SEQUENCE`  = 60 and ha.status = 1
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[候选人状态筛选(get_applicant_state)](module/hr/hr_applicant/logic/get_applicant_state)

节点：待入职
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)  as status_80 
from hr_applicant ha 
left join hr_recruitment_stage hrs on ha.STAGE_ID  = hrs.id
where hrs.`SEQUENCE`  = 80 and ha.status = 1
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[淘汰(out)](module/hr/hr_applicant/logic/out)

节点：获取公共人才库实体数据
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select * from hr_talent_pool ht where name = '公共人才库'
```


重置参数`talentpool(人才库)`，并将执行sql结果赋值给参数`talentpool(人才库)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[获取工作台数据(get_workspace_count)](module/hr/hr_applicant/logic/get_workspace_count)

节点：今日初筛人数
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) today_to_filter_apply from hr_applicant ha where ha.STAGE_ID  = 10 and status = 1 and DATE(CREATE_DATE) = CURRENT_DATE;
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[获取工作台数据(get_workspace_count)](module/hr/hr_applicant/logic/get_workspace_count)

节点：今日面试人数
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) today_interview from hr_interview hi 
left join hr_interview_schedule his on hi.SCHEDULE_ID = his.id
where  DATE(his.START_DATE) = CURRENT_DATE;
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[获取工作台数据(get_workspace_count)](module/hr/hr_applicant/logic/get_workspace_count)

节点：待筛选简历
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) filter_apply from hr_applicant ha where ha.STAGE_ID  = 10
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[获取工作台数据(get_workspace_count)](module/hr/hr_applicant/logic/get_workspace_count)

节点：待发送offer人数
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) to_send_offer from hr_applicant ha where (ha.STAGE_ID  = 40)
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[获取工作台数据(get_workspace_count)](module/hr/hr_applicant/logic/get_workspace_count)

节点：复试待反馈
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1)  AS second_feedback_pending 
FROM hr_interview_feedback hif 
left join hr_interview hi on hif.INTERVIEW_ID  = hi.id
where 
	hi.STAGE_ID  = 2
  and hif.RESULT_TYPE IS NOT NULL 
  AND hif.RESULT_TYPE != '';
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[获取工作台数据(get_workspace_count)](module/hr/hr_applicant/logic/get_workspace_count)

节点：待入职人数
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) to_onboard from hr_applicant ha where (ha.STAGE_ID  = 50)
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[获取工作台数据(get_workspace_count)](module/hr/hr_applicant/logic/get_workspace_count)

节点：复试待面试
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) second_interview_pending from hr_interview hi where hi.status != 1 and hi.STAGE_ID  = 2
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[获取工作台数据(get_workspace_count)](module/hr/hr_applicant/logic/get_workspace_count)

节点：初试待面试
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) first_interview_pending from hr_interview hi where hi.status != 1 and hi.STAGE_ID  = 1
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[获取工作台数据(get_workspace_count)](module/hr/hr_applicant/logic/get_workspace_count)

节点：初试待反馈
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1)  AS first_feedback_pending 
FROM hr_interview_feedback hif 
left join hr_interview hi on hif.INTERVIEW_ID  = hi.id
where 
	hi.STAGE_ID  = 1
  and hif.RESULT_TYPE IS NOT NULL 
  AND hif.RESULT_TYPE != '';
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[人才库候选人数量(get_talent_pool_count)](module/hr/hr_candidate/logic/get_talent_pool_count)

节点：直接SQL调用
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT count(1) talent_pool_count from hr_candidate  where LAST_TP_TALENT_POOL is not null
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[今日归档人数(get_archived_today_count)](module/hr/hr_candidate/logic/get_archived_today_count)

节点：今日归档人数
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) archived_today_count  from hr_candidate hc where  DATE(hc.LAST_TP_ARCHIVED_AT) = CURRENT_DATE;
```


重置参数`archived_today_count(当日归档数)`，并将执行sql结果赋值给参数`archived_today_count(当日归档数)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate/logic/get_my_todolist_count)

节点：今日面试人数
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)as today_interview from hr_interview hi 
left join hr_interview_schedule his on hi.SCHEDULE_ID = his.id
where  DATE(his.START_DATE) = CURRENT_DATE;
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate/logic/get_my_todolist_count)

节点：待筛选简历
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)as filter_apply from hr_applicant t inner join hr_recruitment_stage t2 on t.STAGE_ID  = t2.id where  t2.`SEQUENCE` = '20' and t.status = '1'
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate/logic/get_my_todolist_count)

节点：待发送offer
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)as to_send_offer from hr_applicant t inner join hr_recruitment_stage t2 on t.STAGE_ID  = t2.id where  t2.`SEQUENCE` = '70' and t.status = '1'
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate/logic/get_my_todolist_count)

节点：待入职
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1)as to_onboard from hr_applicant t inner join hr_recruitment_stage t2 on t.STAGE_ID  = t2.id where  t2.`SEQUENCE` = '80' and t.status = '1'
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate/logic/get_my_todolist_count)

节点：初试-待面试
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as first_interview_pending
from
	hr_applicant t
inner join hr_recruitment_stage t2 on
	t.STAGE_ID = t2.id
where
	t2.`SEQUENCE` = '40'
	and t.status = '1'
	and exists(
		select * from hr_interview t3 inner join hr_applicant_interview t4 on t3.id = t4.interview_id
			where  t3.STAGE_ID = '1' and t3.STATUS  = '1' and t4.APPLICANT_ID  = t.ID 
	)
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate/logic/get_my_todolist_count)

节点：初试-待反馈
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as first_feedback_pending
from
	hr_applicant t
inner join hr_recruitment_stage t2 on
	t.STAGE_ID = t2.id
where
	t2.`SEQUENCE` = '40'
	and t.status = '1'
	and 
	exists(
		select * from hr_interview t3 
		inner join hr_applicant_interview t4 on t3.id = t4.interview_id 
		inner join hr_interview_feedback t5  on t3.id = t5.INTERVIEW_ID 
		where 
		t3.STAGE_ID = '1' and t3.STATUS  = '2'
		and t.id = t5.APPLICANT_ID  and t5.RESULT_TYPE  is null
	)
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate/logic/get_my_todolist_count)

节点：初试-待处理
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as first_process_pending
from
	hr_applicant t
inner join hr_recruitment_stage t2 on
	t.STAGE_ID = t2.id
where
	t2.`SEQUENCE` = '40'
	and t.status = '1'
	and exists(
	    select * from(
			    select 
			       t5.APPLICANT_ID,
		           count(1) as cnt 
		           from hr_interview t3 
				inner join hr_applicant_interview t4 on t3.id = t4.interview_id 
				inner join hr_interview_feedback t5 on t3.id = t5.INTERVIEW_ID 
				where 
				t3.STAGE_ID = '1' and t3.STATUS = '2'
				and t5.RESULT_TYPE is null
		    	group by t5.APPLICANT_ID 
	    	) as sub 
	        where sub.APPLICANT_ID = t.id  
	          and sub.cnt = 0  
    )
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate/logic/get_my_todolist_count)

节点：复试-待处理
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as second_process_pending
from
	hr_applicant t
inner join hr_recruitment_stage t2 on
	t.STAGE_ID = t2.id
where
	t2.`SEQUENCE` = '60'
	and t.status = '1'
	and exists(
	    select * from(
			    select 
			       t5.APPLICANT_ID,
		           count(1) as cnt 
		           from hr_interview t3 
				inner join hr_applicant_interview t4 on t3.id = t4.interview_id 
				inner join hr_interview_feedback t5 on t3.id = t5.INTERVIEW_ID 
				where 
				t3.STAGE_ID = '2' and t3.STATUS = '2'
				and t5.RESULT_TYPE is null
		    	group by t5.APPLICANT_ID 
	    	) as sub 
	        where sub.APPLICANT_ID = t.id  
	          and sub.cnt = 0  
    )
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate/logic/get_my_todolist_count)

节点：复试-待反馈
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as second_feedback_pending
from
	hr_applicant t
inner join hr_recruitment_stage t2 on
	t.STAGE_ID = t2.id
where
	t2.`SEQUENCE` = '60'
	and t.status = '1'
	and 
	exists(
		select * from hr_interview t3 
		inner join hr_applicant_interview t4 on t3.id = t4.interview_id 
		inner join hr_interview_feedback t5  on t3.id = t5.INTERVIEW_ID 
		where 
		t3.STAGE_ID = '2' and t3.STATUS  = '2'
		and t.id = t5.APPLICANT_ID  and t5.RESULT_TYPE  is null
	)
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate/logic/get_my_todolist_count)

节点：复试-待面试
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as second_interview_pending
from
	hr_applicant t
inner join hr_recruitment_stage t2 on
	t.STAGE_ID = t2.id
where
	t2.`SEQUENCE` = '60'
	and t.status = '1'
	and exists(
		select * from hr_interview t3 inner join hr_applicant_interview t4 on t3.id = t4.interview_id
			where  t3.STAGE_ID = '2' and t3.STATUS  = '1' and t4.APPLICANT_ID  = t.ID 
	)
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[获取工作台我的事项数(get_my_summary_count)](module/hr/hr_candidate/logic/get_my_summary_count)

节点：简历筛选数量
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
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[获取工作台我的事项数(get_my_summary_count)](module/hr/hr_candidate/logic/get_my_summary_count)

节点：面试反馈数
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
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[获取工作台我的事项数(get_my_summary_count)](module/hr/hr_candidate/logic/get_my_summary_count)

节点：考试/测评返回数
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
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[获取工作台我的关注数(get_my_attention_count)](module/hr/hr_candidate/logic/get_my_attention_count)

节点：我关注的
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
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[获取工作台我的关注数(get_my_attention_count)](module/hr/hr_candidate/logic/get_my_attention_count)

节点：我通过的
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
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[获取工作台面试数(get_my_interview_count)](module/hr/hr_candidate/logic/get_my_interview_count)

节点：直接SQL调用
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as current
from
	hr_interview_feedback t1
left join hr_interview t2 on
	t1.interview_id = t2.id
left join hr_interview_schedule t3 on
	t2.schedule_id = t3.id
where
	t3.start_date = current_date and t1.INTERVIEWER_ID  = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(计数器返回结果)`，并将执行sql结果赋值给参数`result(计数器返回结果)`
#### [候选人(HR_CANDIDATE)](module/hr/hr_candidate)的处理逻辑[获取工作台面试数(get_my_interview_count)](module/hr/hr_candidate/logic/get_my_interview_count)

节点：直接SQL调用
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as after
from
	hr_interview_feedback t1
left join hr_interview t2 on
	t1.interview_id = t2.id
left join hr_interview_schedule t3 on
	t2.schedule_id = t3.id
where
	t3.start_date > current_date
	and t1.INTERVIEWER_ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(计数器返回结果)`，并将执行sql结果赋值给参数`result(计数器返回结果)`
#### [筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)的处理逻辑[用人经理-简历筛选-搜索栏计数器(my_filter_count)](module/hr/hr_candidate_filter_detail/logic/my_filter_count)

节点：待筛选的候选人
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) as todo
FROM hr_candidate_filter_detail hcfd where hcfd.status = 1 and hcfd.USER_ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)的处理逻辑[用人经理-简历筛选-搜索栏计数器(my_filter_count)](module/hr/hr_candidate_filter_detail/logic/my_filter_count)

节点：可面试的候选人
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) as doing
FROM hr_candidate_filter_detail hcfd where hcfd.status = 4 and hcfd.USER_ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)的处理逻辑[用人经理-简历筛选-搜索栏计数器(my_filter_count)](module/hr/hr_candidate_filter_detail/logic/my_filter_count)

节点：已推荐的候选人
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) as recommend
FROM hr_candidate_filter_detail hcfd where hcfd.status = 4  and hcfd.USER_ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)的处理逻辑[用人经理-简历筛选-搜索栏计数器(my_filter_count)](module/hr/hr_candidate_filter_detail/logic/my_filter_count)

节点：筛选记录
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) as done
FROM hr_candidate_filter_detail hcfd where hcfd.status <> 1 and  hcfd.STATUS  is not null  and hcfd.USER_ID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [考试/测评(HR_EXAM)](module/hr/hr_exam)的处理逻辑[my_interview_count](module/hr/hr_exam/logic/my_interview_count)

节点：未完成
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	COUNT(1) as status_0
from
	hr_exam he
where
	he.STATUS = 10
	and he.CREATE_UID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [考试/测评(HR_EXAM)](module/hr/hr_exam)的处理逻辑[my_interview_count](module/hr/hr_exam/logic/my_interview_count)

节点：已完成
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) as status_1
FROM hr_exam he 
WHERE he.STATUS = 20 and he.CREATE_UID = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [招聘需求(HR_IDEA)](module/hr/hr_idea)的处理逻辑[招聘需求搜索栏计数(idea_status_count)](module/hr/hr_idea/logic/idea_status_count)

节点：草稿阶段
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) as draft from hr_idea thi where status = 'draft'
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [招聘需求(HR_IDEA)](module/hr/hr_idea)的处理逻辑[招聘需求搜索栏计数(idea_status_count)](module/hr/hr_idea/logic/idea_status_count)

节点：未进行阶段
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) as unstart from hr_idea thi where status = 'unstart'
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [招聘需求(HR_IDEA)](module/hr/hr_idea)的处理逻辑[招聘需求搜索栏计数(idea_status_count)](module/hr/hr_idea/logic/idea_status_count)

节点：进行中阶段
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select  count(1) as ongoing from hr_idea thi where status = 'ongoing'
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [招聘需求(HR_IDEA)](module/hr/hr_idea)的处理逻辑[招聘需求搜索栏计数(idea_status_count)](module/hr/hr_idea/logic/idea_status_count)

节点：已完成阶段
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select  count(1) as complete from hr_idea thi where status = 'complete'
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [招聘需求(HR_IDEA)](module/hr/hr_idea)的处理逻辑[招聘需求搜索栏计数(idea_status_count)](module/hr/hr_idea/logic/idea_status_count)

节点：已暂停阶段
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select  count(1) as suspend from hr_idea thi where status = 'suspend'
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [招聘需求(HR_IDEA)](module/hr/hr_idea)的处理逻辑[招聘需求搜索栏计数(idea_status_count)](module/hr/hr_idea/logic/idea_status_count)

节点：已取消阶段
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select  count(1) as canceled from hr_idea thi where status = 'canceled'
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [招聘需求(HR_IDEA)](module/hr/hr_idea)的处理逻辑[招聘需求搜索栏计数(idea_status_count)](module/hr/hr_idea/logic/idea_status_count)

节点：已超期阶段
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select  count(1) as timeout from hr_idea thi where status = 'timeout'
```


重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)的处理逻辑[用人经理-我的面试-搜索栏计数器(my_interview_count)](module/hr/hr_interview_feedback/logic/my_interview_count)

节点：今后的面试
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) todo_count
FROM hr_interview_feedback hif
left join hr_interview hi on hif.INTERVIEW_ID  = hi.id
left join hr_interview_schedule his  on hi.SCHEDULE_ID  = his.id
where his.START_DATE >= CURRENT_DATE and hif.INTERVIEWER_ID  = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)的处理逻辑[用人经理-我的面试-搜索栏计数器(my_interview_count)](module/hr/hr_interview_feedback/logic/my_interview_count)

节点：待反馈的面试
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) as undo_count
FROM hr_interview_feedback hif 
left join hr_interview hi on hif.INTERVIEW_ID  = hi.id
WHERE (hif.RESULT_TYPE IS NULL OR hif.RESULT_TYPE = '') and hif.INTERVIEWER_ID  = ? and hi.STATUS  = 2;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)的处理逻辑[用人经理-我的面试-搜索栏计数器(my_interview_count)](module/hr/hr_interview_feedback/logic/my_interview_count)

节点：已反馈的面试
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) as done_count
FROM hr_interview_feedback hif 
WHERE hif.RESULT_TYPE IS NOT NULL 
  AND TRIM(hif.RESULT_TYPE) != '' and hif.INTERVIEWER_ID  = ?;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)的处理逻辑[用人经理-我的面试-搜索栏计数器(my_interview_count)](module/hr/hr_interview_feedback/logic/my_interview_count)

节点：已失效的面试
<p class="panel-title"><b>执行sql语句</b></p>

```sql
SELECT COUNT(1) AS expire_count
FROM hr_interview_feedback hif 
left join hr_interview hi on hif.INTERVIEW_ID  = hi.id
left join hr_interview_schedule his  on hi.SCHEDULE_ID  = his.id
WHERE his.START_DATE < CURRENT_DATE 
  AND (hif.RESULT_TYPE IS NULL OR TRIM(hif.RESULT_TYPE) = '') and hif.INTERVIEWER_ID  = ?;
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [招聘职位(HR_JOB)](module/hr/hr_job)的处理逻辑[职位状态计数器(job_status_count)](module/hr/hr_job/logic/job_status_count)

节点：招聘中职位
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) as open from hr_job where status = 'open'
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [招聘职位(HR_JOB)](module/hr/hr_job)的处理逻辑[职位状态计数器(job_status_count)](module/hr/hr_job/logic/job_status_count)

节点：已结束职位
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select count(1) as closed from hr_job where status = 'closed'
```


重置参数`result(result)`，并将执行sql结果赋值给参数`result(result)`
#### [offer审核(HR_OFFER_APPROVAL)](module/hr/hr_offer_approval)的处理逻辑[用人经理-我的offer-搜索栏计数器(my_offer_count)](module/hr/hr_offer_approval/logic/my_offer_count)

节点：待审批
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as pending
from
	hr_offer_approval hoa
where
	hoa.STATUS = 'pending' and hoa.CREATE_UID  = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`
#### [offer审核(HR_OFFER_APPROVAL)](module/hr/hr_offer_approval)的处理逻辑[用人经理-我的offer-搜索栏计数器(my_offer_count)](module/hr/hr_offer_approval/logic/my_offer_count)

节点：已审批
<p class="panel-title"><b>执行sql语句</b></p>

```sql
select
	count(1) as past
from
	hr_offer_approval hoa
where
	hoa.STATUS = 'past' and hoa.CREATE_UID  = ?
```

<p class="panel-title"><b>执行sql参数</b></p>

1. `用户全局对象.srfuserid`

重置参数`result(结果)`，并将执行sql结果赋值给参数`result(结果)`




