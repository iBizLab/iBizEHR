## 常规流程 <!-- {docsify-ignore-all} -->

   

### 主状态迁移

```plantuml
@startuml
hide empty description
<style>
root {
  HyperlinkColor #42b983
}
</style>

hide empty description
state "人才推荐" as MAINSTATE  [[$./base#mainstate {"人才推荐"}]]
state "初筛" as MAINSTATE1  [[$./base#mainstate1 {"初筛"}]]
state "用人部门筛选" as MAINSTATE2  [[$./base#mainstate2 {"用人部门筛选"}]]
state "初试" as MAINSTATE3  [[$./base#mainstate3 {"初试"}]]
state "沟通Offer" as MAINSTATE4  [[$./base#mainstate4 {"沟通Offer"}]]
state "待入职" as MAINSTATE5  [[$./base#mainstate5 {"待入职"}]]
state "大五性格评测" as MAINSTATE7  [[$./base#mainstate7 {"大五性格评测"}]]
state "复试" as MAINSTATE8  [[$./base#mainstate8 {"复试"}]]
state "完成" as MAINSTATE9  [[$./base#mainstate9 {"完成"}]]


MAINSTATE --> MAINSTATE1
MAINSTATE1 --> MAINSTATE2
MAINSTATE2 --> MAINSTATE3
MAINSTATE3 --> MAINSTATE7
MAINSTATE7 --> MAINSTATE8
MAINSTATE8 --> MAINSTATE4
MAINSTATE4 --> MAINSTATE5
MAINSTATE5 --> MAINSTATE9
MAINSTATE3 --> MAINSTATE8


@enduml
```

### 主状态说明

#### 人才推荐 :id=MAINSTATE<sup class="footnote-symbol"> <font color=gray size=1>[10]</font></sup>

###### 拒绝行为


###### 拒绝操作标识

###### 拒绝属性


#### 初筛 :id=MAINSTATE1<sup class="footnote-symbol"> <font color=gray size=1>[20]</font></sup>

###### 拒绝行为


###### 允许操作标识
* `UPDATE`
* `DELETE`
* `CANDIDATE_FILTER`

###### 拒绝属性


#### 大五性格评测 :id=MAINSTATE7<sup class="footnote-symbol"> <font color=gray size=1>[50]</font></sup>

###### 拒绝行为


###### 允许操作标识
* `UPDATE`
* `DELETE`
* `SECOND_INTERVIEW`

###### 允许属性


#### 复试 :id=MAINSTATE8<sup class="footnote-symbol"> <font color=gray size=1>[60]</font></sup>

###### 拒绝行为


###### 允许操作标识
* `UPDATE`
* `DELETE`
* `OFFER`

###### 允许属性


#### 完成 :id=MAINSTATE9<sup class="footnote-symbol"> <font color=gray size=1>[90]</font></sup>

###### 拒绝行为


###### 拒绝操作标识

###### 允许属性


#### 用人部门筛选 :id=MAINSTATE2<sup class="footnote-symbol"> <font color=gray size=1>[30]</font></sup>

###### 拒绝行为


###### 允许操作标识
* `UPDATE`
* `DELETE`
* `FIRST_INTERVIEW`

###### 允许属性


#### 初试 :id=MAINSTATE3<sup class="footnote-symbol"> <font color=gray size=1>[40]</font></sup>

###### 拒绝行为


###### 允许操作标识
* `UPDATE`
* `DELETE`
* `EXAM`

###### 允许属性


#### 沟通Offer :id=MAINSTATE4<sup class="footnote-symbol"> <font color=gray size=1>[70]</font></sup>

###### 拒绝行为


###### 允许操作标识
* `UPDATE`
* `DELETE`
* `PENDING_ONBOARDING`

###### 允许属性


#### 待入职 :id=MAINSTATE5<sup class="footnote-symbol"> <font color=gray size=1>[80]</font></sup>

###### 拒绝行为


###### 允许操作标识
* `UPDATE`
* `DELETE`
* `ONBOARDED`

###### 允许属性

