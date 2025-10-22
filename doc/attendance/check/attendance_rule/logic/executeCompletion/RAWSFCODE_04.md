<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def attendance_group_shifts = logic.param('attendance_group_shifts').getReal()
def members = logic.param('members').getReal()
def depts = logic.param('depts').getReal()

def uniqueMemberIdMap = new HashMap()
def uniqueDeptIdMap = new HashMap()

def _default = logic.param('Default').getReal()
if(attendance_group_shifts!=null){
  attendance_group_shifts.each{ attendance_group_shift ->
    if (attendance_group_shift.members != null) {
      attendance_group_shift.members.each { member ->
      if(member.type == "person"){
        uniqueMemberIdMap.put(member.user_id, member) 
      }
      if(member.type == "dept"){
        uniqueDeptIdMap.put(member.user_id, member) 
      }
      }
    }
  }
}

members.addAll(uniqueMemberIdMap.values())
depts.addAll(uniqueDeptIdMap.values())


// def memberIds = uniqueMemberIdMap.keySet().collect { "'$it'" }.join(',')
// def deptIds = uniqueDeptIdMap.keySet().collect { "'$it'" }.join(',')

// _default.set("memberIds",memberIds)




```
