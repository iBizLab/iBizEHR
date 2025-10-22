<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def depts = logic.param('depts').getReal()
def persons = logic.param('persons').getReal()
def member_name = _default.get("member_name")
if (member_name != null && member_name != "") {
    def jsonParser = new groovy.json.JsonSlurper()
    def person_range = jsonParser.parseText(member_name)
    person_range.each { item ->
        if (item.type == "dept") {
            def dept = sys.entity('user_object')
            dept.set("n_dept_id_eq", item.id)
            depts.add(dept)
        } else {
            def person = sys.entity('employee')
            person.set("id", item.id)
            person.set("name", item.name)
            persons.add(person)
        }
    }
}
```
