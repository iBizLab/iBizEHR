<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def filter = logic.param('filter').getReal()

filter.all()
def reserver14 = _default.get("reserver14")
def dept = _default.get("srfpdept")

if (reserver14 == 1 || dept == null || dept == "") {
    filter.nvl('parent_id')
} else {
    filter.eq('id', dept)
}
```
