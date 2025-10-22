## 准备默认用户数据对象 <!-- {docsify-ignore-all} -->

   

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
state "开始" as Begin <<start>> [[$./prepare_default_user#begin {"开始"}]]
state "准备参数" as PREPAREPARAM_01  [[$./prepare_default_user#prepareparam_01 {"准备参数"}]]


Begin --> PREPAREPARAM_01


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>



*- N/A*
#### 准备参数 :id=PREPAREPARAM_01<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`Default(传入变量).WORK_EMAIL(工作电子邮件)` 设置给  `default_user(默认用户).login(登录)`
2. 将`Default(传入变量).NAME(名称)` 设置给  `default_user(默认用户).NAME(名称)`



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型    |  实体   |备注 |
| --------| --------| -------- | -------- | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象|[员工(HR_EMPLOYEE)](module/hr/hr_employee.md)||
|默认用户|default_user|会话变量|||
