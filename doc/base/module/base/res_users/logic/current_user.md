## 当前登录人的user <!-- {docsify-ignore-all} -->

   根据srfpartnerid获取user信息

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
state "开始" as Begin <<start>> [[$./current_user#begin {"开始"}]]
state "准备参数" as PREPAREPARAM_01  [[$./current_user#prepareparam_01 {"准备参数"}]]
state "实体数据查询" as DEDATAQUERY_01  [[$./current_user#dedataquery_01 {"实体数据查询"}]]
state "结束" as END_02 <<end>> [[$./current_user#end_02 {"结束"}]]
state "结束" as END_01 <<end>> [[$./current_user#end_01 {"结束"}]]
state "循环子调用" as LOOPSUBCALL_01  [[$./current_user#loopsubcall_01 {"循环子调用"}]] #green {
state "绑定参数" as BINDPARAM_01  [[$./current_user#bindparam_01 {"绑定参数"}]]
}


Begin --> PREPAREPARAM_01 : [[$./current_user#begin-prepareparam_01{连接名称} 连接名称]]
PREPAREPARAM_01 --> DEDATAQUERY_01
DEDATAQUERY_01 --> LOOPSUBCALL_01 : [[$./current_user#dedataquery_01-loopsubcall_01{连接名称} 连接名称]]
LOOPSUBCALL_01 --> BINDPARAM_01
BINDPARAM_01 --> END_01
LOOPSUBCALL_01 --> END_02


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 准备参数 :id=PREPAREPARAM_01<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`Default(传入变量).srfpartnerid` 设置给  `filter_user.n_partner_id_eq`

#### 实体数据查询 :id=DEDATAQUERY_01<sup class="footnote-symbol"> <font color=gray size=1>[实体数据查询]</font></sup>



调用实体 [用户(RES_USERS)](module/base/res_users.md) 数据查询 [DEFAULT](module/base/res_users#数据查询) ，查询参数为`filter_user`

将执行结果返回给参数`user_page`

#### 循环子调用 :id=LOOPSUBCALL_01<sup class="footnote-symbol"> <font color=gray size=1>[循环子调用]</font></sup>



循环参数`user_page`，子循环参数使用`user`
#### 绑定参数 :id=BINDPARAM_01<sup class="footnote-symbol"> <font color=gray size=1>[绑定参数]</font></sup>



绑定参数`user` 到 `Default(传入变量)`
#### 结束 :id=END_02<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



返回 `Default(传入变量)`

#### 结束 :id=END_01<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



返回 `跳出循环（BREAK）`


### 连接条件说明
#### 连接名称 :id=Begin-PREPAREPARAM_01

`Default(传入变量).srfpartnerid` ISNOTNULL
#### 连接名称 :id=DEDATAQUERY_01-LOOPSUBCALL_01

`user_page(user_page).size` GT `0`


### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[用户(RES_USERS)](module/base/res_users.md)||
|filter_user|filter_user|过滤器|||
|user|user|数据对象|[用户(RES_USERS)](module/base/res_users.md)||
|user_page|user_page|分页查询|||
