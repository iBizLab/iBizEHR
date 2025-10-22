<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def groupShifts = logic.param('groupShifts').getReal()

groupShifts.each { group ->
    if (group == null) return
    logic.param('groupShifts').getDataEntityRuntime().fillEntityKeyValue(group)
}

```
