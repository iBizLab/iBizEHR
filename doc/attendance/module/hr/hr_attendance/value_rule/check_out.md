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
state "[条件组]OR" as 459e0ef706c24c535a3b922e8bf0464f [[$./check_out#a459e0ef706c24c535a3b922e8bf0464f {"[条件组]OR"}]] {
state " " as 459e0ef706c24c535a3b922e8bf0464f_entry  <<entryPoint>>
state "(CHECK_OUT) 值为空(Nil)" as a1fa92f440931d83a9aa96e8886ff0a1 [[$./check_out#aa1fa92f440931d83a9aa96e8886ff0a1 {"[常规条件] 值为空(Nil)"}]]
state "(CHECK_OUT) 大于等于(>=) 数据对象属性 (check_in)" as 1726990a4b9c3bc7f3071c8deffad216 [[$./check_out#a1726990a4b9c3bc7f3071c8deffad216 {"[常规条件] 大于等于(>=) 数据对象属性 (check_in)"}]]
state " " as 459e0ef706c24c535a3b922e8bf0464f_exit  <<exitPoint>>
}


start --> 459e0ef706c24c535a3b922e8bf0464f_entry 
459e0ef706c24c535a3b922e8bf0464f_entry --> a1fa92f440931d83a9aa96e8886ff0a1 
a1fa92f440931d83a9aa96e8886ff0a1 --> 459e0ef706c24c535a3b922e8bf0464f_exit  : yes
a1fa92f440931d83a9aa96e8886ff0a1 -[#red]-> 1726990a4b9c3bc7f3071c8deffad216  : no

1726990a4b9c3bc7f3071c8deffad216 --> 459e0ef706c24c535a3b922e8bf0464f_exit  : yes
1726990a4b9c3bc7f3071c8deffad216 -[#red]-> end  : no
459e0ef706c24c535a3b922e8bf0464f_exit --> end 


@enduml
```

#### 条件说明

##### (CHECK_OUT) 值为空(Nil) :id=aa1fa92f440931d83a9aa96e8886ff0a1



`CHECK_OUT(签离)` ISNULL 

##### (CHECK_OUT) 大于等于(>=) 数据对象属性 (check_in) :id=a1726990a4b9c3bc7f3071c8deffad216



`CHECK_OUT(签离)` GTANDEQ  `check_in`

> [!ATTENTION|label:规则信息|icon:fa fa-warning]
> "签离"时间不能早于"签到"时间。







