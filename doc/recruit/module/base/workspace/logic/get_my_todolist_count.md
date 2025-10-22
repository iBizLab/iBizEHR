## 我的待办事项清单计数器 <!-- {docsify-ignore-all} -->

   

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
state "开始" as Begin <<start>> [[$./get_my_todolist_count#begin {"开始"}]]
state "准备参数" as PREPAREPARAM1  [[$./get_my_todolist_count#prepareparam1 {"准备参数"}]]
state "实体行为" as DEACTION1  [[$./get_my_todolist_count#deaction1 {"实体行为"}]]
state "结束" as END1 <<end>> [[$./get_my_todolist_count#end1 {"结束"}]]


Begin --> PREPAREPARAM1
PREPAREPARAM1 --> DEACTION1
DEACTION1 --> END1


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 准备参数 :id=PREPAREPARAM1<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`#` 设置给  `candidate.ID(标识)`

#### 实体行为 :id=DEACTION1<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [候选人(HR_CANDIDATE)](module/hr/hr_candidate.md) 行为 [我的待办事项清单计数器(get_my_todolist_count)](module/hr/hr_candidate#行为) ，行为参数为`candidate`

将执行结果返回给参数`candidate`

#### 结束 :id=END1<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



返回 `candidate`



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[工作台(WORKSPACE)](module/base/workspace.md)||
|candidate|candidate|数据对象|[候选人(HR_CANDIDATE)](module/hr/hr_candidate.md)||
