<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def groupResult = logic.param('groupResult').getReal()
def _default = logic.param('Default').getReal()

// 提取需要拼接的内容
def namesWithRules = groupResult.collect { item ->
    "${item.name}已在考勤规则${item.get("rule_name")}内"
}
// 拼接最终消息
def msg = "${namesWithRules.join('、')},是否将其移入当前考勤规则？"
_default.set("msg",msg)
```
