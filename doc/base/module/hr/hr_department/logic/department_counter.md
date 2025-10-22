## 部门计数器 <!-- {docsify-ignore-all} -->

   

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
state "开始" as Begin <<start>> [[$./department_counter#begin {"开始"}]]
state "获取部门信息" as DEACTION_01  [[$./department_counter#deaction_01 {"获取部门信息"}]]
state "初始化数量" as PREPAREPARAM_02  [[$./department_counter#prepareparam_02 {"初始化数量"}]]
state "结束" as END_01 <<end>> [[$./department_counter#end_01 {"结束"}]]


Begin --> PREPAREPARAM_02
PREPAREPARAM_02 --> DEACTION_01 : [[$./department_counter#prepareparam_02-deaction_01{连接名称} 连接名称]]
DEACTION_01 --> END_01
PREPAREPARAM_02 --> END_01 : [[$./department_counter#prepareparam_02-end_01{连接名称} 连接名称]]


@enduml
```


### 处理步骤说明

#### 获取部门信息 :id=DEACTION_01<sup class="footnote-symbol"> <font color=gray size=1>[实体行为]</font></sup>



调用实体 [部门(HR_DEPARTMENT)](module/hr/hr_department.md) 行为 [Get](module/hr/hr_department#行为) ，行为参数为`Default(传入变量)`

将执行结果返回给参数`Default(传入变量)`

#### 初始化数量 :id=PREPAREPARAM_02<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`0` 设置给  `Default(传入变量).TOTAL_EMPLOYEE(Total Employee)`
2. 将`0` 设置给  `Default(传入变量).PLANS_COUNT(计划数量)`

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 结束 :id=END_01<sup class="footnote-symbol"> <font color=gray size=1>[结束]</font></sup>



返回 `Default(传入变量)`


### 连接条件说明
#### 连接名称 :id=PREPAREPARAM_02-DEACTION_01

`Default(传入变量).ID(标识)` ISNOTNULL AND `Default(传入变量).ID(标识)` NOTEQ `undefined`
#### 连接名称 :id=PREPAREPARAM_02-END_01

`Default(传入变量).ID(标识)` EQ `undefined`


### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[部门(HR_DEPARTMENT)](module/hr/hr_department.md)||
|员工|emps|数据对象列表|[员工(HR_EMPLOYEE)](module/hr/hr_employee.md)||
|活动计划|plans|数据对象列表|[活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan.md)||
