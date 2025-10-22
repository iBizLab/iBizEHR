## 停用 <!-- {docsify-ignore-all} -->

   

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
state "开始" as Begin <<start>> [[$./disable#begin {"开始"}]]
state "设置状态为停用" as PREPAREPARAM1  [[$./disable#prepareparam1 {"设置状态为停用"}]]
state "更新状态" as DEACTION1  [[$./disable#deaction1 {"更新状态"}]]
state "结束" as END1 <<end>> [[$./disable#end1 {"结束"}]]


Begin --> PREPAREPARAM1
PREPAREPARAM1 --> DEACTION1
DEACTION1 --> END1


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 设置状态为停用 :id=PREPAREPARAM1<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`0` 设置给  `Default(传入变量).STATUS(状态)`

#### 更新状态 :id=DEACTION1<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress.md) 行为 [Update](module/hr/hr_recruitment_progress#行为) ，行为参数为`Default(传入变量)`

将执行结果返回给参数`Default(传入变量)`

#### 结束 :id=END1<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



返回 `Default(传入变量)`



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress.md)||
