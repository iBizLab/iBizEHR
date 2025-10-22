<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def employees = logic.param('employees').getReal()
def persons = logic.param('persons').getReal()
def uniqueMemberIdMap = new HashMap()
// 先将原始 persons 放入Map
persons.each { emp ->
    uniqueMemberIdMap.put(emp.id, emp)
}
employees.each { emp ->
    uniqueMemberIdMap.put(emp.id, emp)
}
persons.clear()
persons.addAll(uniqueMemberIdMap.values())
```
