<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
if (effect_time instanceof String) {
    def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd 00:00:00")
    _default.set("effect_time", sdf.parse(effect_time))
}
```
