<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def employees = logic.param('employees').getReal()
def allDeptEmp = logic.param('allDeptEmp').getReal()
def curActiveMember = logic.param('curActiveMember').getReal()
def members = logic.param('members').getReal()

allDeptEmp.addAll(employees)

def uniqueMemberIdMap = new HashMap()
// 先将原始 members 放入Map
members.each { member ->
    uniqueMemberIdMap.put(member.user_id, member)
}

allDeptEmp.each { emp ->
    def isAlreadyActive = curActiveMember.find { it.get("member_id") == emp.id }
    if (isAlreadyActive) {
        return
    }

    def member = sys.entity('Attendance_group_shift_member')
    member.set("user_id",emp.id)
    member.set("name",emp.name)
    uniqueMemberIdMap.put(member.user_id, member)
}

members.clear()
members.addAll(uniqueMemberIdMap.values())

```
