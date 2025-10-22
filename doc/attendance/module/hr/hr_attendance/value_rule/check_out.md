## 签离(CHECK_OUT) <!-- {docsify-ignore-all} -->

   

### 变更校验 :id=check_validity

```plantuml
@startuml
hide empty description
<style>
root {
  HyperlinkColor #42b983
}
</style>

state "start" as start  <<start>>
state "end" as end <<end>>
state "[条件组]OR" as 95a8666b13c5a68778b3a164b5b2da04 [[$./check_out#a95a8666b13c5a68778b3a164b5b2da04 {"[条件组]OR"}]] {
state " " as 95a8666b13c5a68778b3a164b5b2da04_entry  <<entryPoint>>
state "(CHECK_OUT) 值为空(Nil)" as bdf27f15e78545fe8a053b97f5461b13 [[$./check_out#abdf27f15e78545fe8a053b97f5461b13 {"[常规条件] 值为空(Nil)"}]]
state "(CHECK_OUT) 大于等于(>=) 数据对象属性 (check_in)" as bb448fe46b6ba07f620ae32f71f1c4a6 [[$./check_out#abb448fe46b6ba07f620ae32f71f1c4a6 {"[常规条件] 大于等于(>=) 数据对象属性 (check_in)"}]]
state " " as 95a8666b13c5a68778b3a164b5b2da04_exit  <<exitPoint>>
}


start --> 95a8666b13c5a68778b3a164b5b2da04_entry 
95a8666b13c5a68778b3a164b5b2da04_entry --> bdf27f15e78545fe8a053b97f5461b13 
bdf27f15e78545fe8a053b97f5461b13 --> 95a8666b13c5a68778b3a164b5b2da04_exit  : yes
bdf27f15e78545fe8a053b97f5461b13 -[#red]-> bb448fe46b6ba07f620ae32f71f1c4a6  : no

bb448fe46b6ba07f620ae32f71f1c4a6 --> 95a8666b13c5a68778b3a164b5b2da04_exit  : yes
bb448fe46b6ba07f620ae32f71f1c4a6 -[#red]-> end  : no
95a8666b13c5a68778b3a164b5b2da04_exit --> end 


@enduml
```

#### 条件说明

##### (CHECK_OUT) 值为空(Nil) :id=abdf27f15e78545fe8a053b97f5461b13



`CHECK_OUT(签离)` ISNULL 

##### (CHECK_OUT) 大于等于(>=) 数据对象属性 (check_in) :id=abb448fe46b6ba07f620ae32f71f1c4a6



`CHECK_OUT(签离)` GTANDEQ  `check_in`

> [!ATTENTION|label:规则信息|icon:fa fa-warning]
> "签离"时间不能早于"签到"时间。







