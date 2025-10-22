<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def calendarFilter = logic.param('calendarFilter').getReal()
def _default = logic.param('Default').getReal()

_default.copyTo(calendarFilter)

```
