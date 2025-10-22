## 用人经理-我的offer-搜索栏计数器 <!-- {docsify-ignore-all} -->

   

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
state "开始" as Begin <<start>> [[$./my_offer_count#begin {"开始"}]]
state "待审批" as RAWSQLCALL_01  [[$./my_offer_count#rawsqlcall_01 {"待审批"}]]
state "已审批" as RAWSQLCALL_02  [[$./my_offer_count#rawsqlcall_02 {"已审批"}]]
state "结束" as END_01 <<end>> [[$./my_offer_count#end_01 {"结束"}]]


Begin --> RAWSQLCALL_01
RAWSQLCALL_01 --> RAWSQLCALL_02
RAWSQLCALL_02 --> END_01


@enduml
```


### 处理步骤说明

#### 待审批 :id=RAWSQLCALL_01<sup class="footnote-symbol"> <font color=gray size=1>[直接SQL调用]</font></sup>



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

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 已审批 :id=RAWSQLCALL_02<sup class="footnote-symbol"> <font color=gray size=1>[直接SQL调用]</font></sup>



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

#### 结束 :id=END_01<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



返回 `result(结果)`



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[offer审核(HR_OFFER_APPROVAL)](module/hr/hr_offer_approval.md)||
|结果|result|数据对象|||
