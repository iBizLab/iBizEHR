<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def depts = []
def deptStr = ""
def  dept_range = _default.get("n_dept_id_in")
if (dept_range != null && dept_range != "") {
    depts.clear()
    dept_range.each { item ->
        depts.add(item.id)
    }
    deptStr = depts ? depts.join(",") : ""
    if (deptStr != "") {
        _default.in('id', deptStr)
    }
}
```
