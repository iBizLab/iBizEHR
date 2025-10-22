<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def activitiesList = logic.param("activities").getReal()
def _default = logic.param("default").getReal()
def states = activitiesList.collect { it.get("state") } as Set

if (states.contains("overdue")) {
    _default.set("activity_state", "overdue")
} else if (states.contains("today")) {
    _default.set("activity_state", "today")
} else if (states.contains("planned")) {
    _default.set("activity_state","planned")
} else {
    _default.reset("activity_state")
}
```
