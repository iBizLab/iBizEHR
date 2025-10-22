<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def group_shifts = logic.param('group_shifts').getReal()
def members = logic.param('members').getReal()
def depts = logic.param('depts').getReal()

def uniqueMemberIdMap = new HashMap()
def uniqueDeptIdMap = new HashMap()

def _default = logic.param('Default').getReal()
if(group_shifts!=null && _default.schedule_type != "class_inversion" && _default.schedule_type != "work_rest" ){
    group_shifts.each{ group_shift ->
        if (group_shift.members != null) {
            group_shift.members.each { member ->
                if(member.type == "person"){
                    uniqueMemberIdMap.put(member.user_id, member)
                }
                if(member.type == "dept"){
                    uniqueDeptIdMap.put(member.user_id, member)
                }
            }
        }
    }
}else{
    def group_members = logic.param('group_members').getReal()
    group_members.each { member ->
        if(member.type == "person"){
            uniqueMemberIdMap.put(member.user_id, member)
        }
        if(member.type == "dept"){
            uniqueDeptIdMap.put(member.user_id, member)
        }
    }
}

members.addAll(uniqueMemberIdMap.values())
depts.addAll(uniqueDeptIdMap.values())


// def memberIds = uniqueMemberIdMap.keySet().collect { "'$it'" }.join(',')
// def deptIds = uniqueDeptIdMap.keySet().collect { "'$it'" }.join(',')

// _default.set("memberIds",memberIds)




```
