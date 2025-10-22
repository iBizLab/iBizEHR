<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def rules = logic.param('rules').getReal()
def total_members = logic.param('total_members').getReal()

if(rules){
    if (!total_members){
        // 创建rule_id到total_members的映射
        def memberMap = total_members.collectEntries { member ->
            [(member.get("rule_id")): member.get("total_members")]
        }
        // 遍历rules并赋值
        rules.each { rule ->
            if(rule.get("is_activate") == 0){
                rule.set("total_members","未生效")
            }
            if(rule.get("is_activate") == 1){
                def memberCount = memberMap.get(rule.get("id"))
                rule.set("total_members",memberCount?memberCount:0)
            }
        }
    }
    
}
```
