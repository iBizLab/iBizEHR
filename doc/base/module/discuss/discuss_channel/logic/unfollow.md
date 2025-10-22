## 离开频道 <!-- {docsify-ignore-all} -->

   后续还需补充退订等逻辑

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
state "开始" as Begin <<start>> [[$./unfollow#begin {"开始"}]]
state "准备过滤器" as PREPAREPARAM_01  [[$./unfollow#prepareparam_01 {"准备过滤器"}]]
state "查询" as DEDATASET_01  [[$./unfollow#dedataset_01 {"查询"}]]
state "结束" as END_01 <<end>> [[$./unfollow#end_01 {"结束"}]]
state "循环子调用" as LOOPSUBCALL_01  [[$./unfollow#loopsubcall_01 {"循环子调用"}]] #green {
state "移除成员" as DEACTION_01  [[$./unfollow#deaction_01 {"移除成员"}]]
}


Begin --> PREPAREPARAM_01
PREPAREPARAM_01 --> DEDATASET_01
DEDATASET_01 --> LOOPSUBCALL_01
LOOPSUBCALL_01 --> DEACTION_01
DEDATASET_01 --> END_01


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 准备过滤器 :id=PREPAREPARAM_01<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`Default(传入变量).ID(标识)` 设置给  `member_filter(成员过滤器).n_channel_id_eq`
2. 将`用户全局对象.srfpartnerid` 设置给  `member_filter(成员过滤器).n_partner_id_eq`
3. 将`1000` 设置给  `member_filter(成员过滤器).size`

#### 查询 :id=DEDATASET_01<sup class="footnote-symbol"> <font color=gray size=1>[实体数据集]</font></sup>



调用实体 [频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member.md) 数据集合 [DEFAULT](module/discuss/discuss_channel_member#数据集合) ，查询参数为`member_filter(成员过滤器)`

将执行结果返回给参数`members(成员集合)`

#### 循环子调用 :id=LOOPSUBCALL_01<sup class="footnote-symbol"> <font color=gray size=1>[循环子调用]</font></sup>



循环参数`members(成员集合)`，子循环参数使用`member_temp(成员)`
#### 移除成员 :id=DEACTION_01<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member.md) 行为 [Remove](module/discuss/discuss_channel_member#行为) ，行为参数为`member_temp(成员)`

#### 结束 :id=END_01<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



*- N/A*



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel.md)||
|成员过滤器|member_filter|过滤器|||
|成员|member_temp|数据对象|[频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member.md)||
|成员集合|members|分页查询|||
