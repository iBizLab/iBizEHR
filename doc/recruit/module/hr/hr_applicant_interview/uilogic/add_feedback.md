## 填写反馈 <!-- {docsify-ignore-all} -->

   

### 处理过程

```plantuml
@startuml
hide footbox
<style>
root {
  HyperlinkColor #42b983
}
</style>

hide empty description
state "开始" as Begin <<start>> [[$./add_feedback#begin {开始}]]
state "查询当前面试官评价记录" as DEDATASET1  [[$./add_feedback#dedataset1 {查询当前面试官评价记录}]]
state "打开当前面试官评价页面" as DEUIACTION1  [[$./add_feedback#deuiaction1 {打开当前面试官评价页面}]]
state "绑定参数" as BINDPARAM1  [[$./add_feedback#bindparam1 {绑定参数}]]
state "准备参数" as PREPAREJSPARAM1  [[$./add_feedback#preparejsparam1 {准备参数}]]


Begin --> PREPAREJSPARAM1
PREPAREJSPARAM1 --> DEDATASET1
DEDATASET1 --> BINDPARAM1
BINDPARAM1 --> DEUIACTION1


@enduml
```


### 处理步骤说明

#### 开始 :id=Begin<sup class="footnote-symbol"> <font color=gray size=1>[开始]</font></sup>




#### 准备参数 :id=PREPAREJSPARAM1<sup class="footnote-symbol"> <font color=gray size=1>[准备参数]</font></sup>



1. 将`Default(传入变量).applicant_id` 设置给  `feedback_filter.n_applicant_id_eq`
2. 将`Default(传入变量).interview_id` 设置给  `feedback_filter.n_interview_id_eq`

#### 查询当前面试官评价记录 :id=DEDATASET1<sup class="footnote-symbol"> <font color=gray size=1>[实体数据集]</font></sup>




#### 绑定参数 :id=BINDPARAM1<sup class="footnote-symbol"> <font color=gray size=1>[绑定参数]</font></sup>



绑定参数`page_feedback` 到 `feedback`
#### 打开当前面试官评价页面 :id=DEUIACTION1<sup class="footnote-symbol"> <font color=gray size=1>[实体界面行为调用]</font></sup>



调用实体 [面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback.md) 界面行为 [填写面试反馈（用人经理端）](module/hr/hr_interview_feedback#界面行为) ，行为参数为`feedback`



### 实体逻辑参数

|    中文名   |    代码名    |  数据类型      |备注 |
| --------| --------| --------  | --------   |
|传入变量(<i class="fa fa-check"/></i>)|Default|数据对象||
|feedback|feedback|数据对象||
|page_feedback|page_feedback|分页查询||
|feedback_filter|feedback_filter|过滤器||
