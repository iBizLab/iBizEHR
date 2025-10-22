## 同步删除Odoo相关 <!-- {docsify-ignore-all} -->

   

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
state "开始" as Begin <<start>> [[$./removeOdooData#begin {"开始"}]]
state "实体行为" as DEACTION_01  [[$./removeOdooData#deaction_01 {"实体行为"}]]
state "结束" as END_01 <<end>> [[$./removeOdooData#end_01 {"结束"}]]


Begin --> DEACTION_01
DEACTION_01 -[#red]-> END_01


@enduml
```


### 处理步骤说明

#### 实体行为 :id=DEACTION_01<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar.md) 行为 [Remove](module/resource/resource_calendar#行为) ，行为参数为`Default(传入变量)`

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 结束 :id=END_01<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



*- N/A*



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule.md)||
