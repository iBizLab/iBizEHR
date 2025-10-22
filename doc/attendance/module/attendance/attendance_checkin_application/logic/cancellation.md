## 申请作废 <!-- {docsify-ignore-all} -->

   

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
state "开始" as Begin <<start>> [[$./cancellation#begin {"开始"}]]
state "准备参数" as PREPAREPARAM1  [[$./cancellation#prepareparam1 {"准备参数"}]]
state "实体行为" as DEACTION1  [[$./cancellation#deaction1 {"实体行为"}]]
state "结束" as END1 <<end>> [[$./cancellation#end1 {"结束"}]]


Begin --> PREPAREPARAM1
PREPAREPARAM1 --> DEACTION1
DEACTION1 --> END1


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 准备参数 :id=PREPAREPARAM1<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`CANCELLATION` 设置给  `Default(传入变量).STATUS(状态)`

#### 实体行为 :id=DEACTION1<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [考勤申请记录(ATTENDANCE_CHECKIN_APPLICATION)](module/attendance/attendance_checkin_application.md) 行为 [Update](module/attendance/attendance_checkin_application#行为) ，行为参数为`Default(传入变量)`

#### 结束 :id=END1<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



*- N/A*



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[考勤申请记录(ATTENDANCE_CHECKIN_APPLICATION)](module/attendance/attendance_checkin_application.md)||
