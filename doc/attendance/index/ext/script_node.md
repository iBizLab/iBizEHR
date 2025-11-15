
## 使用脚本的处理逻辑节点<sup class="footnote-symbol"> <font color=orange>[98]</font></sup>

#### [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)的处理逻辑[列表视图(record_list)](module/attendance/attendance_clock_in_record/logic/record_list)

节点：解析搜索条件
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()

def n_checkin_time_gtandeq = _default.get('n_checkin_time_gtandeq')
def n_checkin_time_ltandeq = _default.get('n_checkin_time_ltandeq')

_default.ne("id", "next_id")
if (n_checkin_time_gtandeq != null && n_checkin_time_ltandeq != null) {
    _default.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') >= '"+ n_checkin_time_gtandeq +"'")
    _default.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') <= '"+ n_checkin_time_ltandeq +"'")
}

if (_default.get("n_member_id_in") != null && _default.get("n_member_id_in") != "") {
    def jsonParser = new groovy.json.JsonSlurper()
    def person_range = jsonParser.parseText(_default.get("n_member_id_in"))
    def depts = []
    def persons = []
    person_range.each { item ->
        if (item.type == "dept") {
            depts.add(item.id)
        } else {
            persons.add(item.id)
        }
    }
    def deptStr = depts ? depts.join(",") : ""
    def personStr = persons ? persons.join(",") : ""
    if (deptStr != "" && personStr != "") {
        _default.and().or().in('dept_id', deptStr).in('member_id', personStr)
    } else if (deptStr != "" && personStr == "") {
        _default.in('dept_id', deptStr)
    } else {
        _default.in('member_id', personStr)
    }
}
```
#### [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)的处理逻辑[同步补卡至Odoo(sync_clock)](module/attendance/attendance_clock_in_record/logic/sync_clock)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def attendances = logic.param('attendances').getReal()
def _default = logic.param('Default').getReal()
def hr_attendanceRuntime = sys.dataentity('hr_attendance')
if(!attendances.isEmpty()){
    //取第一项进行更新
    def hr_attendance = attendances[0]
    hr_attendance.set('check_out',_default.get('checkin_time'))
    hr_attendanceRuntime.update(hr_attendance)

}else{
    def hr_attendance = sys.entity('hr_attendance')
    hr_attendance.set("id",net.ibizsys.runtime.util.KeyValueUtils.genUniqueId())
    hr_attendance.set('check_in',_default.get('checkin_time'))
    hr_attendance.set('employee_id',_default.get('member_id'))
    hr_attendanceRuntime.create(hr_attendance)
}
```
#### [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)的处理逻辑[打卡记录(record)](module/attendance/attendance_clock_in_record/logic/record)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
//获取`打卡记录`实体运行对象
def record_runtime = sys.dataentity('attendance_clock_in_record')
def record_filter = record_runtime.filter()
record_filter.all()

def person_range = _default.get("n_member_id_in")
if ( person_range != null && person_range != "") {
    def depts = []
    def persons = []
    person_range.each { item ->
        if (item.type == "dept") {
            depts.add(item.id)
        } else {
            persons.add(item.id)
        }
    }
    def deptStr = depts ? depts.join(",") : ""
    def personStr = persons ? persons.join(",") : ""
    if (deptStr != "" && personStr != "") {
        record_filter.and().or().in('dept_id', deptStr).in('id', personStr)
    } else if (deptStr != "" && personStr == "") {
        record_filter.in('dept_id', deptStr)
    } else {
        record_filter.in('member_id', personStr)
    }
}

def n_checkin_time_gtandeq = _default.get('n_checkin_time_gtandeq')
def n_checkin_time_ltandeq = _default.get('n_checkin_time_ltandeq')
if (n_checkin_time_gtandeq != null && n_checkin_time_ltandeq != null) {
    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') >= '"+ n_checkin_time_gtandeq +"'")
    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') <= '"+ n_checkin_time_ltandeq +"'")
}

def dataList = record_filter.select('');
if (dataList){
    def newRecords = logic.param('newRecords').getReal()
    dataList.groupBy { it.get("member_id") }.each { memberId, records ->
        println("输出memberId: " + memberId)
        println("输出records: " + records)
        if (!records) {
            return
        }

        def newRecord = sys.entity('attendance_clock_in_record')
        newRecord.set('id', records[0].get("member_id"))
        newRecord.set('member_id', records[0].get("member_id"))
        newRecord.set('dept_id', records[0].get("dept_id"))
        newRecord.set('dept_name', records[0].get("dept_name"))
        newRecord.set('member_name', records[0].get("member_name"))

        def map = new HashMap<String, List<String>>()
        def resultMap = new HashMap()

        // 遍历数据列表，根据日期分组
        records.each { item ->
            def dateKey = item.get("checkin_time").toString().substring(0, 10)
            // 按照年月日分组
            if (!map.containsKey(dateKey)) {
                map[dateKey] = []
            }
            map[dateKey].add(item)
        }

        // 处理分组后的数据
        map.each { entry ->
            def temp = [details: entry.value]
            resultMap.put(entry.key, temp)
        }
        println("输出map: " + map)
        println("输出resultMap: " + resultMap)
        newRecord.set('attendance_data', resultMap)
        newRecords.add(newRecord)
    }
}
```
#### [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)的处理逻辑[打卡记录(record)](module/attendance/attendance_clock_in_record/logic/record)

节点：解析搜索条件
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def person_range = _default.get("n_member_id_in")
if ( person_range != null && person_range != "") {
    def depts = []
    def persons = []
    person_range.each { item ->
        if (item.type == "dept") {
            depts.add(item.id)
        } else {
            persons.add(item.id)
        }
    }
    def deptStr = depts ? depts.join(",") : ""
    def personStr = persons ? persons.join(",") : ""
    if (deptStr != "" && personStr != "") {
        _default.and().or().in('dept_id', deptStr).in('id', personStr)
    } else if (deptStr != "" && personStr == "") {
        _default.in('dept_id', deptStr)
    } else {
        _default.in('id', personStr)
    }
}

//获取`打卡记录`实体运行对象
def record_runtime = sys.dataentity('attendance_clock_in_record')
def record_filter = record_runtime.filter()
record_filter.all()
record_filter.eq('member_id', emp_temp.get("id"))

if (n_checkin_time_gtandeq != null && n_checkin_time_ltandeq != null) {
    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') >= '"+ n_checkin_time_gtandeq +"'")
    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') <= '"+ n_checkin_time_ltandeq +"'")
}
```
#### [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)的处理逻辑[打卡记录(record)](module/attendance/attendance_clock_in_record/logic/record)

节点：获取打卡记录
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def emp_temp = logic.param('emp_temp').getReal()

def n_checkin_time_gtandeq = _default.get('n_checkin_time_gtandeq')
def n_checkin_time_ltandeq = _default.get('n_checkin_time_ltandeq')

//获取`打卡记录`实体运行对象
def record_runtime = sys.dataentity('attendance_clock_in_record')
def record_filter = record_runtime.filter()
record_filter.all()
record_filter.eq('member_id', emp_temp.get("id"))

if (n_checkin_time_gtandeq != null && n_checkin_time_ltandeq != null) {
    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') >= '"+ n_checkin_time_gtandeq +"'")
    record_filter.custom(" DATE_FORMAT(t1.checkin_time, '%Y-%m-%d') <= '"+ n_checkin_time_ltandeq +"'")
}
def dataList = record_filter.select('');

def map = new HashMap<String, List<String>>()
def resultMap = new HashMap()

// 遍历数据列表，根据日期分组
dataList.each { item ->
    def dateKey = item.get("checkin_time").toString().substring(0, 10)
    // 按照年月日分组
    if (!map.containsKey(dateKey)) {
        map[dateKey] = []
    }
    map[dateKey].add(item)
}

// 处理分组后的数据
map.each { entry ->
    // entry.value.each { it ->
    //     it.set("checkin_time", it.get("checkin_time") ? it.get("checkin_time").toString().substring(11, 19) : '')
    // }
    def temp = [details: entry.value]
    resultMap.put(entry.key, temp)
}

emp_temp.set('attendance_data', resultMap);
emp_temp.set('member_name', emp_temp.get("name"));
emp_temp.set('member_num',emp_temp.get("employee_num"));
```
#### [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)的处理逻辑[批量补卡(batchReissue)](module/attendance/attendance_clock_in_record/logic/batchReissue)

节点：执行脚本代码
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
#### [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)的处理逻辑[批量补卡(batchReissue)](module/attendance/attendance_clock_in_record/logic/batchReissue)

节点：创建打卡记录
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def persons = logic.param('persons').getReal()
def _default = logic.param('Default').getReal()

persons.each { emp ->
    def record = sys.entity('attendance_clock_in_record')
    record.set("id",net.ibizsys.runtime.util.KeyValueUtils.genUniqueId())
    record.set("member_id",emp.id)
    record.set("member_name",emp.name)
    record.set("dept_name",emp.dept_name)
    record.set("dept_id",emp.dept_id)
    record.set("checkin_type","reissue")
    record.set("checkin_time",_default.get("checkin_time"))
    def recordRuntime = sys.dataentity('attendance_clock_in_record')
    recordRuntime.create(record)
}
```
#### [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record)的处理逻辑[批量补卡(batchReissue)](module/attendance/attendance_clock_in_record/logic/batchReissue)

节点：执行脚本代码
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
#### [部门统计(ATTENDANCE_DEPARTMENT_STATISTICS)](module/attendance/attendance_department_statistics)的处理逻辑[部门统计(department_statistics)](module/attendance/attendance_department_statistics/logic/department_statistics)

节点：解析搜索条件
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
#### [部门统计(ATTENDANCE_DEPARTMENT_STATISTICS)](module/attendance/attendance_department_statistics)的处理逻辑[部门统计(department_statistics)](module/attendance/attendance_department_statistics/logic/department_statistics)

节点：统计考勤
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal();
def dept_temp = logic.param('dept_temp').getReal();

def n_checkin_date_gtandeq = _default.get('n_checkin_date_gtandeq')
def n_checkin_date_ltandeq = _default.get('n_checkin_date_ltandeq')
def dept_id = dept_temp.get("id")

def dbschema = sys.dbschema('Default')
def sql = 'select\n' +
    '\tard.*\n' +
    'from\n' +
    '\tattendance_record_detail ard\n' +
    'where\n' +
    '\texists (\n' +
    '\tselect\n' +
    '\t\t1\n' +
    '\tfrom\n' +
    '\t\tattendance_record ar\n' +
    '\twhere\n' +
    '\t\tard.RECORD_ID = ar.ID\n' +
    '\t\tand ar.CHECKIN_DATE >= ?\n' +
    '\t\tand ar.CHECKIN_DATE <= ?\n' +
    '\t\tand ar.DEPT_ID = ?)'
def sqlParam = []
sqlParam.add(n_checkin_date_gtandeq)
sqlParam.add(n_checkin_date_ltandeq)
sqlParam.add(dept_id)
def record_details = dbschema.executeSelectSQL(sql,sqlParam)


// 正常出勤次数 
def normal_attendance_days = 0;
// 迟到次数 
def late_times = 0;
// 缺卡次数
def checkin_missing_times = 0;
// 早退次数
def leave_early_times = 0;
// 加班时长(小时)
def overtime_hours = 0;

if(record_details != null){
    //循环汇总
    record_details.each { item ->
        if (item.get("CHECKIN_RESULT") == "LATE") {
            late_times ++;
        }
        if (item.get("CHECKIN_RESULT") == "ABSENT" || item.get("CHECKIN_RESULT") == "MISSING" || item.get("CHECKIN_RESULT") == "ON_MISSING" || item.get("CHECKIN_RESULT") == "OFF_MISSING" ) {
            checkin_missing_times ++;
        }
        if (item.get("CHECKIN_RESULT") == "LEAVE_EARLY") {
            leave_early_times ++;
        }
        if (item.get("CHECKIN_RESULT") == "NORMAL") {
            normal_attendance_days ++;
        }
        overtime_hours += item.get("overtime_time")?:0;
    }
}

//获取`排班`实体运行对象
def attendance_schedule_runtime = sys.dataentity('attendance_schedule');
def attendance_schedule_filter = attendance_schedule_runtime.filter();
attendance_schedule_filter.all();
attendance_schedule_filter.gte('checkin_date', n_checkin_date_gtandeq)
attendance_schedule_filter.lte('checkin_date', n_checkin_date_ltandeq)
attendance_schedule_filter.eq('dept_id', dept_id)
def attendance_schedule_list = attendance_schedule_filter.select('').collect { it.member_id }.unique();

//获取`申请`实体运行对象
def attendance_checkin_application_runtime = sys.dataentity('attendance_checkin_application');
def attendance_checkin_application_filter = attendance_checkin_application_runtime.filter();
attendance_checkin_application_filter.all();
attendance_checkin_application_filter.gte('start_time', n_checkin_date_gtandeq)
attendance_checkin_application_filter.lte('start_time', n_checkin_date_ltandeq)
attendance_checkin_application_filter.eq('dept_id', dept_id)
attendance_checkin_application_filter.eq('status', "APPROVED")
def attendance_checkin_application_list = attendance_checkin_application_filter.select('');

// 请假次数
def leave_times = 0;
// 出差次数
def out_work_times = 0;
// 外出次数
def go_out_times = 0;

if(attendance_checkin_application_list != null){
    //循环汇总
    attendance_checkin_application_list.each { item ->
        if (item.get("apply_type") == "LEAVE") {
            leave_times ++;
        }
        if (item.get("apply_type") == "GO_OUT") {
            go_out_times ++;
        }
        if (item.get("apply_type") == "BUSINESS_TRIP") {
            out_work_times ++;
        }
    }
}

dept_temp.set('should_attendance_people_num', attendance_schedule_list.size());
dept_temp.set('leave_times', leave_times);
dept_temp.set('normal_attendance_days', normal_attendance_days);
dept_temp.set('go_out_times', go_out_times);
dept_temp.set('dept_name', dept_temp.get("name"));
dept_temp.set('dept_id', dept_temp.get("id"));
dept_temp.set('late_times', late_times);
dept_temp.set('out_work_times', out_work_times);
dept_temp.set('checkin_missing_times', checkin_missing_times);
dept_temp.set('leave_early_times', leave_early_times);
dept_temp.set('overtime_hours', overtime_hours);
```
#### [考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)的处理逻辑[异常记录(特定搜索条件)(abnormal_record)](module/attendance/attendance_record/logic/abnormal_record)

节点：解析搜索条件
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def person_range = _default.get("n_member_id_in")

if (person_range) {
    def depts = []
    def persons = []
    person_range.each { item ->
        if (item.type == "dept") {
            depts.add(item.id)
        } else {
            persons.add(item.id)
        }
    }
    def deptStr = depts ? depts.join(",") : ""
    def personStr = persons ? persons.join(",") : ""
    if (deptStr != "" && personStr != "") {
        _default.and().or().in('dept_id', deptStr).in('member_id', personStr)
    } else if (deptStr != "" && personStr == "") {
        _default.in('dept_id', deptStr)
    } else {
        _default.in('member_id', personStr)
    }
}
```
#### [考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)的处理逻辑[考勤记录(特定搜索条件)(record)](module/attendance/attendance_record/logic/record)

节点：解析搜索条件
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def person_range = _default.get("n_member_id_in")
if (person_range != null && person_range != "") {
    def depts = []
    def persons = []
    person_range.each { item ->
        if (item.type == "dept") {
            depts.add(item.id)
        } else {
            persons.add(item.id)
        }
    }
    def deptStr = depts ? depts.join(",") : ""
    def personStr = persons ? persons.join(",") : ""
    if (deptStr != "" && personStr != "") {
        _default.and().or().in('dept_id', deptStr).in('member_id', personStr)
    } else if (deptStr != "" && personStr == "") {
        _default.in('dept_id', deptStr)
    } else {
        _default.in('member_id', personStr)
    }
}
```
#### [考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)的处理逻辑[考勤记录反查(check_info)](module/attendance/attendance_record/logic/check_info)

节点：排序
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def details = logic.param('details').getReal()

def sdf = new java.text.SimpleDateFormat("HH:mm:ss")

details.sort { a, b ->
    def timeA = java.time.LocalTime.parse(sdf.format(a.get('should_checkin_time')))
    def timeB = java.time.LocalTime.parse(sdf.format(b.get('should_checkin_time')))
    timeA <=> timeB
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[创建/更新时清理工作日(cleanWorkdays)](module/attendance/attendance_rule/logic/cleanWorkdays)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def schedule_type = _default.schedule_type ;
//N班倒
if(schedule_type == "class_inversion"){
    _default.workday = "";
    def inversion_cycle = _default.inversion_cycle ;

    if(inversion_cycle== 1){
        _default.week2 = "" ;
        _default.week3 = "" ;
        _default.week4 = "" ;
    }
    if(inversion_cycle== 2){
        _default.week3 = "" ;
        _default.week4 = "" ;
    }
    if(inversion_cycle== 3){
        _default.week4 = "" ;
    }
}

//固定排班/灵活打卡
if(schedule_type == "flexible" || schedule_type == "fixed"){
    _default.week1 = "" ;
    _default.week2 = "" ;
    _default.week3 = "" ;
    _default.week4 = "" ;
}

//大小周
if(schedule_type == "alternate_week" ){
    _default.workday = "";
    _default.week3 = "" ;
    _default.week4 = "" ;
}

def workdays = logic.param('workdays').getReal()
def lastDays = logic.param('lastDays').getReal()

def selection = [_default.week1, _default.week2, _default.week3, _default.week4,_default.workday].join(',').split(',')

//遍历workdays
for(workday in workdays){
    if(selection.contains(workday.get("name"))){
        //附加到数组
        lastDays.add(workday)
    }
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[判断人员是否已存在其他规则(judgingMember)](module/attendance/attendance_rule/logic/judgingMember)

节点：附加到判断结果
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def memberResult = logic.param('memberResult').getReal()
def results = logic.param('results').getReal()

if(memberResult){
    memberResult.each{ i ->
        results.add(i)
    }
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[判断人员是否已存在其他规则(judgingMember)](module/attendance/attendance_rule/logic/judgingMember)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def results = logic.param('results').getReal()
def groupResult = logic.param('groupResult').getReal()
def _default = logic.param('Default').getReal()

if (results) {
    // 按rule_id分组并构建新结构
    def grouped = results.groupBy { it.rule_id }
    grouped.each { ruleId, items ->
        def temp = sys.entity('Attendance_group_shift_member')
        def names = items.collect { it.get("name") }.findAll { it != null }
        temp.set("name", names.join('、'))
        temp.set("rule_id",ruleId )
        groupResult.add(temp)
    }
}

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[判断人员是否已存在其他规则(judgingMember)](module/attendance/attendance_rule/logic/judgingMember)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def groupResult = logic.param('groupResult').getReal()
def _default = logic.param('Default').getReal()

// 提取需要拼接的内容
def namesWithRules = groupResult.collect { item ->
    "${item.name}已在考勤规则${item.get("rule_name")}内"
}
// 拼接最终消息
def msg = "${namesWithRules.join('、')},是否将其移入当前考勤规则？"
_default.set("msg",msg)
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[填充工作日(fillWorkDays)](module/attendance/attendance_rule/logic/fillWorkDays)

节点：固定排班/灵活打卡填充工作日
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal();
def shifts = logic.param('shifts').getReal();
def defaultShift = shifts.find { it.default_flag == 1 }
if(defaultShift){
    def workdays = _default.get("workdays") ? _default.get("workdays") : [];
    def selection = _default.get("workday") ?_default.get("workday"):""

  // 获取已存在的 workday
    def existingDays = workdays.collect { it.name as Integer }

    def fillWorkdays = []
    (1..7).each { i ->  
        if (!existingDays.contains(i)) {
            def workday = [
                name  : i.toString(),
                day_number : i,
                shift_id : selection.contains(i.toString())?defaultShift.id:null
        ]
            fillWorkdays << workday
        }
    }

    // 合并后排序
    def combinedWorkdays = (workdays + fillWorkdays).sort { 
        it.day_number
    }    
    
    // // 为每个工作日填充工作时间
    // combinedWorkdays = combinedWorkdays.collect { workday ->
    //     def worktimeParts = []
 
    //     if (workday.shift_id != null && defaultShift?.scopes) {
    //         // 创建时间格式化工具 (HH:mm 格式)
    //         def timeFormat = new java.text.SimpleDateFormat("HH:mm")
    //         defaultShift.scopes.each { scope ->
    //             // 安全处理时间戳
    //             def start = scope.start_base_time ? timeFormat.format(scope.start_base_time) : ""
    //             def end = scope.end_base_time ? timeFormat.format(scope.end_base_time) : ""
    //             if (start && end) worktimeParts << "${start}-${end}"
    //         }
    //     }
 
    //     // 构建工作时间字符串
    //     workday.work_time = worktimeParts.isEmpty() ? "休息日" : worktimeParts.join('/')
    //     return workday
    // }
    
    _default.set("workdays", combinedWorkdays)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[填充工作日(fillWorkDays)](module/attendance/attendance_rule/logic/fillWorkDays)

节点：计算week、workday
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def workday = _default.get("workday")?: ""
def schedule_type = _default.get("schedule_type")
def workdays = _default.get("workdays")

//固定排班、灵活打卡>workday
if (workday == "" && 
    workdays != null&&
    ( schedule_type == "fixed" || schedule_type == "flexible")) 
{
        workday = workdays
                .findAll { it.shift_id != null } 
                .sort { a, b -> a.day_number <=> b.day_number }
                .collect { it.day_number } 
                .join(',')

        _default.set("workday",workday)    
}

//计算工作日week1
def week1 = _default.get("week1")?: ""
if (week1 == ""&& workdays != null) {
    if(schedule_type == "alternate_week" ){
        week1 = workdays
                .findAll { it.shift_id != null && it.day_number < 8} 
                .sort { a, b -> a.day_number <=> b.day_number }
                .collect { it.day_number } 
                .join(',')
    }
    if(schedule_type == "class_inversion") {
         week1 = workdays
                .findAll { it.id != null && it.day_number < 8} 
                .sort { a, b -> a.day_number <=> b.day_number }
                .collect { it.day_number } 
                .join(',')
    }
    _default.set("week1",week1)    
}
//计算工作日week2
def week2 = _default.get("week2")?: ""
if (week2 == ""&& workdays != null) {
    if(schedule_type == "alternate_week" ){
        week2 = workdays
                .findAll { it.shift_id != null && 7<it.day_number && it.day_number < 15} 
                .sort { a, b -> a.day_number <=> b.day_number }
                .collect { it.day_number } 
                .join(',')
    }
    if(schedule_type == "class_inversion") {
         week2 = workdays
                .findAll { it.id != null && 7<it.day_number && it.day_number < 15} 
                .sort { a, b -> a.day_number <=> b.day_number }
                .collect { it.day_number } 
                .join(',')
    }
    _default.set("week2",week2)    

}

//计算工作日week3
def week3 = _default.get("week3")?: ""
if (week3 == "" && schedule_type == "class_inversion" && workdays != null) {
    week3 = workdays
        .findAll { it.id != null && 14<it.day_number && it.day_number < 22} 
        .sort { a, b -> a.day_number <=> b.day_number }
        .collect { it.day_number } 
        .join(',')
    _default.set("week3",week3) 
}
//计算工作日week4
def week4 = _default.get("week4")?: ""
if (week4 == "" && schedule_type == "class_inversion"&& workdays != null) {
    week4 = workdays
        .findAll { it.id != null && 21<it.day_number && it.day_number < 29} 
        .sort { a, b -> a.day_number <=> b.day_number }
        .collect { it.day_number } 
        .join(',')
    _default.set("week4",week4) 

}



```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[填充工作日(fillWorkDays)](module/attendance/attendance_rule/logic/fillWorkDays)

节点：大小周填充工作日
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal();
def shifts = logic.param('shifts').getReal();
def defaultShift = shifts.find { it.default_flag == 1 }
if(defaultShift){
    def workdays = _default.get("workdays") ? _default.get("workdays") : [];
    def big_week = _default.get("week1") ?_default.get("week1"):"";
    def small_week = _default.get("week2") ?_default.get("week2"):"";
    def selection = big_week+","+small_week

  // 获取已存在的 workday
    def existingDays = workdays.collect { it.day_number }

    def fillWorkdays = []
    (1..14).each { i ->  
        if (!existingDays.contains(i)) {
            def workday = [
                name  : i.toString(),
                day_number : i,
                shift_id : selection.contains(i.toString())?defaultShift.id:null
        ]
            fillWorkdays << workday
        }
    }

    // 合并后排序
    def combinedWorkdays = (workdays + fillWorkdays).sort { 
        it.day_number 
    }    
    _default.set("workdays", combinedWorkdays)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[填充工作日(fillWorkDays)](module/attendance/attendance_rule/logic/fillWorkDays)

节点：上A休B填充工作日
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal();
def shifts = logic.param('shifts').getReal();
def defaultShift = shifts.find { it.default_flag == 1 }
if(defaultShift){
    def work = _default.get("work") ?_default.get("work"):5;
    def rest = _default.get("rest") ?_default.get("rest"):2;
    def num = work+rest;

    def fillWorkdays = [];
    (1..num).each { i ->  
        def workday = [
            name  : "第"+i+"天",
            day_number : i,
            title : "工作/休息"
        ]
        fillWorkdays << workday
    }

    _default.set("workdays", fillWorkdays)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[填充工作日(fillWorkDays)](module/attendance/attendance_rule/logic/fillWorkDays)

节点：N班倒填充工作日
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal();
def shifts = logic.param('shifts').getReal();
def same_restday = _default.same_restday;
if(shifts){
    def title = shifts.collect { it.name }.join('/')
    def fillWorkdays = []
    //休息日相同
    if(same_restday ==1){
        def workdays = _default.get("workdays") ?: []
        def week1 = _default.get("week1") ?: ""
        def week2 = _default.get("week2") ?: ""
        def week3 = _default.get("week3") ?: ""
        def week4 = _default.get("week4") ?: ""
        def selection = [week1, week2, week3, week4].join(',').split(',')  

        // 获取已存在的 workday
        def existingDays = workdays.collect { it.day_number }

        (1..28).each { i ->
            if (!existingDays.contains(i)) {
                def workday = [
                    name: i.toString(),
                    day_number: i,
                    title: selection.contains(i.toString()) ? title : "休息"  
                ]
                fillWorkdays << workday
            }else{
                // 为已存在的workday填充title
                def existingWorkday = workdays.find { it.day_number == i }
                if (existingWorkday) {
                    existingWorkday.title = title
                }
        }

        // 合并后排序
        def combinedWorkdays = (workdays + fillWorkdays).sort { 
            it.day_number 
        }    
        _default.set("workdays", combinedWorkdays)
    }
    }
    //休息日不同
    if(same_restday ==0 ){
        title = title+"/休息"  
        if( _default.get("workdays") == null){
            def inversion_days = _default.inversion_days
            if(inversion_days){
                (1..inversion_days).each { i ->
                    def workday = [
                        name  : "第"+i+"天",
                        day_number: i,
                        title: title,
                        rule_id : _default.id
                    ]
                    fillWorkdays << workday
                }
                _default.set("workdays", fillWorkdays)
        }
        }else{
            _default.get("workdays").each{ w ->
                w.title =title
            }           
        }
    }
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[填充组排班(fillGroupShift)](module/attendance/attendance_rule/logic/fillGroupShift)

节点：N班倒-休息日相同
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()

def groupShifts = _default.get("group_shifts")

def group_num = _default.group_num ?: 2

def inversion_cycle = _default.get("inversion_cycle")
def workdays = _default.get("workdays")

def week1 = _default.get("week1")?:""
def week2 = _default.get("week2")?:""
def week3 = _default.get("week3")?:""
def week4 = _default.get("week4")?:""

// 将week字符串转换为数字集合
def getWeekSet = { weekStr ->
    weekStr?.tokenize(',')*.toInteger() as Set
}

def weekSet1 = getWeekSet(week1)
def weekSet2 = getWeekSet(week2)
def weekSet3 = getWeekSet(week3)
def weekSet4 = getWeekSet(week4)

// 根据 inversion_cycle 计算阈值并筛选工作日
def filteredWorkdays = []
Set<Integer> selectionSet = []
switch (inversion_cycle) {
    case 1:
        selectionSet.addAll(weekSet1)
        filteredWorkdays = workdays.findAll { it.day_number < 8 }
        break
    case 2:
        selectionSet.addAll(weekSet1 + weekSet2)
        filteredWorkdays = workdays.findAll { it.day_number < 15 }
        break
    case 3:
        selectionSet.addAll(weekSet1 + weekSet2 + weekSet3)
        filteredWorkdays = workdays.findAll { it.day_number < 22 }

        break
    case 4:
        selectionSet.addAll(weekSet1 + weekSet2 + weekSet3 + weekSet4)
        filteredWorkdays = workdays 
        break
}
filteredWorkdays = filteredWorkdays.sort { a, b -> a.day_number <=> b.day_number }

final WEEK_DAYS = ['周一', '周二', '周三', '周四', '周五', '周六', '周日']

filteredWorkdays.each { day ->
    def offset = (day.day_number - 8 + 7) % 7
    day.set("name", WEEK_DAYS[offset])
    day.set("is_work", selectionSet.contains(day.day_number) ? 1 : 0)
}

(1..group_num).each { i ->
    def new_group = sys.entity('attendance_group_shift')
    if (new_group) {
        new_group.schedule_type = _default.get("schedule_type")
        new_group.rule_id = _default.get("id")
        new_group.workdays = filteredWorkdays
        new_group.all_company = false
        new_group.order_num = i
        groupShifts.add(new_group)
    }
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[填充组排班(fillGroupShift)](module/attendance/attendance_rule/logic/fillGroupShift)

节点：上A休B/N班倒-休息日不同
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()

def groupShifts = _default.get("group_shifts")

def group_num = _default.group_num ?: 2
def workdays = _default.get("workdays")

(1..group_num).each { i ->
    def new_group = sys.entity('attendance_group_shift')
    if (new_group) {
        new_group.schedule_type = _default.get("schedule_type")
        new_group.rule_id = _default.get("id")
        new_group.workdays = workdays
        new_group.all_company = false
        new_group.order_num = i
        groupShifts.add(new_group)
    }
}

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[填充组排班(fillGroupShift)](module/attendance/attendance_rule/logic/fillGroupShift)

节点：生成标识
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def groupShifts = logic.param('groupShifts').getReal()

groupShifts.each { group ->
    if (group == null) return
    logic.param('groupShifts').getDataEntityRuntime().fillEntityKeyValue(group)
}

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[填充默认班次(fillShift)](module/attendance/attendance_rule/logic/fillShift)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _shifts = logic.param('shifts').getReal()

def createShift = { name, startTime, endTime ->
    return [
        attendance_ratio: 1.0,
        working_number: 1,
        schedule_type: "manual",
        order_value:1,
        scopes: [
            [
                early_for_absenteeism: 60,
                early_for_early: 0,
                latest_checkout: 480,
                earliest_checkin: 60,
                end_base_time: endTime,
                late_for_absenteeism: 60,
                late_for_late: 0,
                shift_name: name,
                start_base_time: startTime,
                order_value:1
            ]
        ],
        default_flag: 0,
        public_flag: 0,
        name: name,
        id:  java.util.UUID.randomUUID()
    ]
}

def shift1 = createShift("班次1", "08:00:00", "17:00:00")

_shifts << shift1

def _default = logic.param('Default').getReal();
_default.set("shifts",_shifts);
_default.set("shift_num",1);


```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[填充默认班次(fillShift)](module/attendance/attendance_rule/logic/fillShift)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _shifts = logic.param('shifts').getReal()

// 生成白班和晚班配置
def createShift = { name, startTime, endTime,order_value ->
    return [
        attendance_ratio: 1.0,
        order_value: order_value,
        working_number: 1,
        schedule_type: "class_inversion",
        scopes: [
            [
                early_for_absenteeism: 60,
                early_for_early: 0,
                latest_checkout: 480,
                earliest_checkin: 60,
                end_base_time: endTime,
                late_for_absenteeism: 60,
                late_for_late: 0,
                shift_name: name,
                start_base_time: startTime,
                order_value:1,
                next_tag: name=="晚班"?"0,1":null
            ]
        ],
        default_flag: 0,
        public_flag: 0,
        name: name,
        id:  java.util.UUID.randomUUID()
    ]
}

def dayShift = createShift("白班", "09:00:00", "20:00:00",1)
def nightShift = createShift("晚班", "20:00:00", "08:00:00",2) 

_shifts << dayShift
_shifts << nightShift

def _default = logic.param('Default').getReal();
_default.set("shifts",_shifts);

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[填充默认班次(fillShift)](module/attendance/attendance_rule/logic/fillShift)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _shift = logic.param('shift').getReal()

logic.param('shift').getDataEntityRuntime().fillEntityKeyValue(_shift)

def _scope = logic.param('scope').getReal()

logic.param('scope').getDataEntityRuntime().fillEntityKeyValue(_scope)
_scope.shift_id = _shift.id

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[完整规则(all)](module/attendance/attendance_rule/logic/all)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def rules = logic.param('rules').getReal()
def total_members = logic.param('total_members').getReal()

if(rules){
    if (!total_members){
        // 创建rule_id到total_members的映射
        def memberMap = total_members.collectEntries { member ->
            [(member.get("rule_id")): member.get("total_members")]
        }
        // 遍历rules并赋值
        rules.each { rule ->
            if(rule.get("is_activate") == 0){
                rule.set("total_members","未生效")
            }
            if(rule.get("is_activate") == 1){
                def memberCount = memberMap.get(rule.get("id"))
                rule.set("total_members",memberCount?memberCount:0)
            }
        }
    }
    
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：设置时间
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def now = new Date()

// 获取下个月第一天
def calendar = Calendar.getInstance()
calendar.setTime(now)
calendar.add(Calendar.MONTH, 1)  
calendar.set(Calendar.DAY_OF_MONTH, 1)
calendar.set(Calendar.HOUR_OF_DAY, 0)
calendar.set(Calendar.MINUTE, 0)
calendar.set(Calendar.SECOND, 0)
calendar.set(Calendar.MILLISECOND, 0)

def nextMonthFirstDay = calendar.getTime()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
 _default.set("fill_time",sdf.format(nextMonthFirstDay))

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：获取激活信息
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def activeRule = logic.param('activeRule').getReal()
def rule_data = activeRule.get("rule_data")
def _default = logic.param('Default').getReal()

print "rule_data配置, ${rule_data}"


if (rule_data != null ) {
    Map<String, Object> ruleData = rule_data as Map<String, Object>;
    def workdays = ruleData.get("workdays")
    if (workdays) {
        _default.set("workdays",workdays)
    }
    _workdays = new ArrayList<>(workdays)

    
    def attendance_group_shifts = ruleData.get("attendance_group_shifts")
    if (attendance_group_shifts) {
        _default.set("attendance_group_shifts",attendance_group_shifts)
    }

    def effect_time = ruleData.get("effect_time")
    if(effect_time){
        _default.set("effect_time",effect_time)
    } 
       
    def rest = ruleData.get("rest")
    if(rest){
        _default.set("rest",rest)
    }
    def work = ruleData.get("work")
    if(work){
        _default.set("work",work)
    }  

    def inversion_cycle = ruleData.get("inversion_cycle")
    if(inversion_cycle){
        _default.set("inversion_cycle",inversion_cycle)
    }  
    
    def schedule_type = ruleData.get("schedule_type")
    if(schedule_type){
        _default.set("schedule_type",schedule_type)
    }
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：设置日历参数
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def calendarFilter = logic.param('calendarFilter').getReal()
def _default = logic.param('Default').getReal()

_default.copyTo(calendarFilter)

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：大小周构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeShifts  = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def workdays =  logic.param('workdays').getReal()
//大小周
def biweekly_cycle = _default.get("biweekly_cycle")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)
 
// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())

// 计算当天排班班次
def generateShiftData = { Date checkinDate, List workdaysParam, List activeShiftsParam ->
    // 1. 确定当前日期是周几（1-7对应周一到周日）
    def calendarInner = Calendar.getInstance()
    calendarInner.setTime(checkinDate)
    int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
    int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1

    // 新增大/小周计算逻辑
    // 计算生效日期所在周的第一天（周一）
    def effectCal = Calendar.getInstance()
    effectCal.setTime(effect_time)
    effectCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)

    // 计算检查日期所在周的第一天（周一）
    def checkinCal = Calendar.getInstance()
    checkinCal.setTime(checkinDate)
    checkinCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)

    // 计算周数差（生效日期所在周为第1周）
    long diffMillis = checkinCal.getTimeInMillis() - effectCal.getTimeInMillis()
    int weekNumber = (int)(diffMillis / (7 * 24 * 60 * 60 * 1000)) + 1

    // 判断当前是大周还是小周
    boolean isBigWeek = false
    if (biweekly_cycle == "big_small") {
    isBigWeek = (weekNumber % 2 == 1)  // 奇数周为大周
} else if (biweekly_cycle == "small_big") {
    isBigWeek = (weekNumber % 2 == 0)  // 偶数周为大周
}

// 调整day_number（小周时+7）
int adjustedDayNumber = isBigWeek ? dayNumber : dayNumber + 7

// 2. 查找匹配的工作日配置（直接匹配调整后的day_number）
def workdayConfig = workdaysParam.find {
    it.day_number == adjustedDayNumber
}

// 3. 未找到工作日配置时返回空班次
if (!workdayConfig || !workdayConfig.shift_id) {
    return null
}

// 4. 查找对应的班次信息
def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }

// 5. 未找到班次时返回空班次
if (!shift || !shift.shift_data) {
    return null
}

// 6. 返回班次数据
return shift.shift_data
}

// 排班生成
def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
    
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {
    def checkinDate = startCal.getTime()
    def shift_data = generateShiftData(checkinDate, workdays, activeShifts)
    def workTime = shift_data?.work_times ?: null

    def attendance_schedule = sys.entity('attendance_schedule')
    attendance_schedule.rule_data = activeRule.get("rule_data")
    attendance_schedule.rule_name = activeRule.get("name")
    attendance_schedule.rule_id = activeRule.get("id")
    attendance_schedule.checkin_date =  sdf.format(checkinDate)
    if(shift_data){
        shift_data.name = "白班"
    }
    attendance_schedule.shift_data = shift_data
    attendance_schedule.work_time = workTime
    attendance_schedule.workday = shift_data != null ? 1 : 0 
    // attendance_schedule.id = UUID.randomUUID().toString() 

    newSchedules.add(attendance_schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：固定排班/灵活打卡构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeShifts  = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("fill_time")
def workdays =  logic.param('workdays').getReal()

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)
 
// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())

// 计算当天排班班次
def generateShiftData = { Date checkinDate, List workdaysParam, List activeShiftsParam ->
    // 1. 确定当前日期是周几（1-7对应周一到周日）
    def calendarInner = Calendar.getInstance()
    calendarInner.setTime(checkinDate)
    int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
    int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1

    // 2. 查找匹配的工作日配置
    def workdayConfig = workdaysParam.find { it.day_number == dayNumber }
    
    // 3. 未找到工作日配置时返回空班次
    if (!workdayConfig || !workdayConfig.shift_id) {
        // print "未找到工作日配置时返回空班次, ${workdayConfig}!"
        return null
    }

    // 4. 查找对应的班次信息
    def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }
    
    // 5. 未找到班次时返回空班次
    if (!shift || !shift.shift_data) {
        // print "未找到班次时返回空班次, ${shift}!"
        return null 
    }

    // 6. 返回班次数据
    // print "返回班次数据, ${shift}!"
    return shift.shift_data
}

// 排班生成
def startCal = Calendar.getInstance()
if (effect_time instanceof String) {
    startCal.setTime(sdf.parse(effect_time))
} else {
    startCal.setTime(effect_time)
}       
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {
    def checkinDate = startCal.getTime()
    def shift_data = generateShiftData(checkinDate, workdays, activeShifts)
    def workTime = shift_data?.work_times ?: null

    def attendance_schedule = sys.entity('attendance_schedule')
    attendance_schedule.rule_data = activeRule.get("rule_data")
    attendance_schedule.rule_name = activeRule.get("name")
    attendance_schedule.rule_id = activeRule.get("id")
    attendance_schedule.checkin_date =  sdf.format(checkinDate)
    attendance_schedule.shift_data = shift_data
    attendance_schedule.work_time = workTime
    attendance_schedule.workday = shift_data != null ? 1 : 0 
    // attendance_schedule.id = UUID.randomUUID().toString() 

    newSchedules.add(attendance_schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：手动排班构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("fill_time")
def workdays =  logic.param('workdays').getReal()

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)
 
// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())

// 排班生成
def startCal = Calendar.getInstance()
if (effect_time instanceof String) {
    startCal.setTime(sdf.parse(effect_time))
} else {
    startCal.setTime(effect_time)
}       
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {
    def checkinDate = startCal.getTime()

    def attendance_schedule = sys.entity('attendance_schedule')
    attendance_schedule.rule_data = activeRule.get("rule_data")
    attendance_schedule.rule_name = activeRule.get("name")
    attendance_schedule.rule_id = activeRule.get("id")
    attendance_schedule.checkin_date =  sdf.format(checkinDate)
    // attendance_schedule.id = UUID.randomUUID().toString() 

    newSchedules.add(attendance_schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：自由班构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeShifts  = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("fill_time")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)
 
// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())


// 排班生成
def startCal = Calendar.getInstance()
if (effect_time instanceof String) {
    startCal.setTime(sdf.parse(effect_time))
} else {
    startCal.setTime(effect_time)
}       
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {
    def checkinDate = startCal.getTime()
    def shift_data = activeShifts[0].shift_data
    def workTime = shift_data?.work_times ?: null

    def attendance_schedule = sys.entity('attendance_schedule')
    attendance_schedule.rule_data = activeRule.get("rule_data")
    attendance_schedule.rule_name = activeRule.get("name")
    attendance_schedule.rule_id = activeRule.get("id")
    attendance_schedule.checkin_date =  sdf.format(checkinDate)
    attendance_schedule.shift_data = shift_data
    attendance_schedule.work_time = workTime
    attendance_schedule.workday = shift_data != null ? 1 : 0 
    // attendance_schedule.id = UUID.randomUUID().toString() 

    newSchedules.add(attendance_schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：免考勤
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("fill_time")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)
 
// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())


// 排班生成
def startCal = Calendar.getInstance()
if (effect_time instanceof String) {
    startCal.setTime(sdf.parse(effect_time))
} else {
    startCal.setTime(effect_time)
}   
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {
    def checkinDate = startCal.getTime()

    def attendance_schedule = sys.entity('attendance_schedule')
    attendance_schedule.rule_name = activeRule.get("name")
    attendance_schedule.rule_id = activeRule.get("id")
    attendance_schedule.checkin_date =  sdf.format(checkinDate)
    attendance_schedule.workday = 0

    newSchedules.add(attendance_schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：N班倒构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeShifts  = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def inversion_cycle = _default.get("inversion_cycle")

//获取workdays
def attendance_group_shift = logic.param('attendance_group_shift').getReal()
def workdays = attendance_group_shift.get("workdays")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)
 
// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())


// 排班生成
def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
    
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 计算周期天数（N班倒*7天）
int cycleDays = inversion_cycle * 7

// 预处理工作日数据：建立周期映射表（仅保留1~cycleDays的配置）
def validWorkdays = workdays.findAll { it.day_number <= cycleDays }
def cycleMap = [:]
validWorkdays.each { 
    cycleMap[it.day_number] = it 
}

// 计算生效日期对应的周期基准日（最近的前序周一）
Calendar baseDateCal = Calendar.getInstance()
baseDateCal.setTime(effect_time)
// 计算需要回退的天数（1=周日,2=周一,...,7=周六）
int daysToSubtract = (baseDateCal.get(Calendar.DAY_OF_WEEK) - 2 + 7) % 7
if (daysToSubtract > 0) {
    baseDateCal.add(Calendar.DAY_OF_MONTH, -daysToSubtract)
}
Date baseDate = baseDateCal.getTime()

// 遍历当月每一天
while (!startCal.after(endCal)) {
    Date checkinDate = startCal.getTime()
    
    // 计算相对于基准日的天数偏移
    long offsetMillis = checkinDate.getTime() - baseDate.getTime()
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    
    // 计算周期位置（1-based）
    int dayInCycle = (offsetDays % cycleDays) + 1
    
    // 查找工作配置
    def workdayConfig = cycleMap[dayInCycle]

    if(workdayConfig!=null){
          //查找对应的班次信息
        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
        def shift_data =  shift?.shift_data?:null
        def workTime = shift_data?.work_times ?: null

        def attendance_schedule = sys.entity('attendance_schedule')
        attendance_schedule.rule_data = activeRule.get("rule_data")
        attendance_schedule.rule_name = activeRule.get("name")
        attendance_schedule.rule_id = activeRule.get("id")
        attendance_schedule.checkin_date =  sdf.format(checkinDate)
        attendance_schedule.shift_data = shift_data
        attendance_schedule.work_time = workTime
        attendance_schedule.workday = shift_data != null ? 1 : 0 
        newSchedules.add(attendance_schedule)

    }
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}



```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：N班倒构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def activeShifts = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def inversion_days = _default.get("inversion_days")

def attendance_group_shift = logic.param('attendance_group_shift').getReal()
def workdays = attendance_group_shift.get("workdays")

def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
def endCal = Calendar.getInstance()
endCal.add(Calendar.MONTH, 1)
endCal.set(Calendar.DAY_OF_MONTH, endCal.getActualMaximum(Calendar.DAY_OF_MONTH))

def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
startCal.set(Calendar.HOUR_OF_DAY, 0)
startCal.set(Calendar.MINUTE, 0)
startCal.set(Calendar.SECOND, 0)
startCal.set(Calendar.MILLISECOND, 0)

def cycleMap = [:]
workdays.eachWithIndex { workday, index ->
    if (index + 1 <= inversion_days) {
        cycleMap[(index + 1)] = workday
    }
}

Date baseDate = startCal.getTime()
while (!startCal.after(endCal)) {
    Date checkinDate = startCal.getTime()
    long offsetMillis = checkinDate.time - baseDate.time
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    int dayInCycle = (offsetDays % inversion_days) + 1

    def workdayConfig = cycleMap[dayInCycle]
    if (workdayConfig) {
        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
        def shiftData = shift?.shift_data ?: [:]
        def workTime = shiftData?.work_times ?: []

        def attendance_schedule = sys.entity('attendance_schedule')
        attendance_schedule.rule_data = activeRule.rule_data
        attendance_schedule.rule_name = activeRule.name
        attendance_schedule.rule_id = activeRule.id
        attendance_schedule.checkin_date = sdf.format(checkinDate)
        attendance_schedule.shift_data = shiftData
        attendance_schedule.work_time = workTime
        attendance_schedule.workday = shiftData ? 1 : 0
        newSchedules.add(attendance_schedule)
    }
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：上A休B构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def activeShifts = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def fill_time = _default.get("fill_time")

def rest = _default.get("rest")
def work = _default.get("work")

def attendance_group_shift = logic.param('attendance_group_shift').getReal()
def workdays = attendance_group_shift.get("workdays")

def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
def endCal = Calendar.getInstance()
endCal.add(Calendar.MONTH, 1)
endCal.set(Calendar.DAY_OF_MONTH, endCal.getActualMaximum(Calendar.DAY_OF_MONTH))

// 修改点1：以fill_time作为排班生成起点（零点时间）
def startCal = Calendar.getInstance()
if (fill_time instanceof String) {
    startCal.setTime(sdf.parse(fill_time))
} else {
    startCal.setTime(fill_time)
}
startCal.set(Calendar.HOUR_OF_DAY, 0)
startCal.set(Calendar.MINUTE, 0)
startCal.set(Calendar.SECOND, 0)
startCal.set(Calendar.MILLISECOND, 0)

// 保持effect_time作为周期计算基准

Date baseDate = effect_time
Calendar effectCal = Calendar.getInstance()
if (effect_time instanceof String) {
    effectCal.setTime(sdf.parse(effect_time))
} else {
    effectCal.setTime(effect_time)
}

// 计算fill_time相对于effect_time的初始偏移天数
long effectMillis = effectCal.getTimeInMillis()
long fillMillis = startCal.getTimeInMillis()
int initialOffsetDays = (fillMillis - effectMillis) / (24 * 60 * 60 * 1000)

// 构建天数循环映射（保持原逻辑）
def workdayNum = rest + work
def cycleMap = [:]
workdays.eachWithIndex { workday, index ->
    if (index + 1 <= workdayNum) {
        cycleMap[(index + 1)] = workday
    }
}

// 生成排班数据
while (!startCal.after(endCal)) {
    Date checkinDate = startCal.getTime()
    
    // 计算相对于effect_time的偏移天数（核心修改）
    long offsetMillis = checkinDate.time - effectMillis
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    int dayInCycle = (offsetDays % workdayNum) + 1  // 周期位置计算

    def workdayConfig = cycleMap[dayInCycle]
    if (workdayConfig) {
        def shift = workdayConfig.get("is_work") == 1 ? activeShifts[0] : null
        def shiftData = shift?.shift_data ?: [:]
        def workTime = shiftData?.work_times ?: []

        def attendance_schedule = sys.entity('attendance_schedule')
        attendance_schedule.rule_data = activeRule.rule_data
        attendance_schedule.rule_name = activeRule.name
        attendance_schedule.rule_id = activeRule.id
        attendance_schedule.checkin_date = sdf.format(checkinDate)
        attendance_schedule.shift_data = shiftData
        attendance_schedule.work_time = workTime
        attendance_schedule.workday = shiftData ? 1 : 0
        newSchedules.add(attendance_schedule)
    }
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：判断节假日
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def newSchedules = logic.param('newSchedules').getReal()
def holidays = logic.param('calendarList').getReal()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")

newSchedules.each { attendance_schedule ->
    def checkin_date = sdf.format(attendance_schedule.checkin_date)
    def holiday = holidays.find { sdf.format(it.rq) == checkin_date }
    if(holiday != null ){
        attendance_schedule.shift_data = null
        attendance_schedule.work_time = null
        attendance_schedule.workday = 0
    }
}

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：计算规则成员
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
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：判断节假日
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def newSchedules = logic.param('newSchedules').getReal()
def holidays = logic.param('calendarList').getReal()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")

newSchedules.each { attendance_schedule ->
    def checkin_date = sdf.format(attendance_schedule.checkin_date)
    def holiday = holidays.find { sdf.format(it.rq) == checkin_date }
    println("判断节假日attendance_schedule"+attendance_schedule)
    println("判断节假日"+holiday)
    if(holiday != null ){
        attendance_schedule.shift_data = null
        attendance_schedule.work_time = null
        attendance_schedule.workday = 0
    }
}

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：人员转换
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def employees = logic.param('employees').getReal()
def members = logic.param('members').getReal()


def uniqueMemberIdMap = new HashMap()

employees.each { emp ->
    def member = sys.entity('Attendance_group_shift_member')
    member.set("user_id",emp.id)
    member.set("name",emp.name)
    uniqueMemberIdMap.put(member.user_id, member)
}

members.clear()
members.addAll(uniqueMemberIdMap.values())

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：过滤出不在其他生效规则内的人员
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
    def isAlreadyActive = curActiveMember.find { it.user_id == emp.id }
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
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班(executeCompletion)](module/attendance/attendance_rule/logic/executeCompletion)

节点：为规则人员生成新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def members = logic.param('members').getReal()
def lastSchedules = logic.param('lastSchedules').getReal()
def newSchedules = logic.param('newSchedules').getReal()

members.each { member ->
    if (member == null) return
    newSchedules.each { attendance_schedule ->
        def newSchedule = sys.entity('attendance_schedule')
        attendance_schedule.copyTo(newSchedule)
        newSchedule.member_id = member.user_id
        newSchedule.member_name = member.name
        lastSchedules.add(newSchedule)
    }
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[定时补充排班3(executeCompletion3)](module/attendance/attendance_rule/logic/executeCompletion3)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def temp = logic.param('temp').getReal()
def rule = logic.param('rule').getReal()

def rule_data = temp.get("rule_data").any()
if (rule_data){

    def rule_runtime = sys.dataentity('attendance_rule')
    rule_runtime.createEntity(rule_data).copyTo(rule)
    // 获取下个月第一天
    def calendar = Calendar.getInstance()
    calendar.time = new Date()
    calendar.add(Calendar.MONTH, 1)
    calendar.set(Calendar.DAY_OF_MONTH, 1)
    calendar.set(Calendar.HOUR_OF_DAY, 0)
    calendar.set(Calendar.MINUTE, 0)
    calendar.set(Calendar.SECOND, 0)
    calendar.set(Calendar.MILLISECOND, 0)
    rule.set("limitTime", calendar.getTime())
    //转换scope
    def shifts = temp.get("rule_data").any().get("shifts")
    if(shifts){
        def _shifts = logic.param('shifts').getReal()
        shifts.forEach { shift ->
            def newShift = sys.entity('shift')
            shift.copyTo(newShift)
            _shifts.add(newShift)
        }
        rule.set("shifts",_shifts)
    }
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[更新组排班工作日(updateGroups)](module/attendance/attendance_rule/logic/updateGroups)

节点：N班倒-休息日相同
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()

def groupShifts = _default.get("attendance_group_shifts")

def inversion_cycle = _default.get("inversion_cycle")
def workdays = _default.get("workdays")

def week1 = _default.get("week1")?:""
def week2 = _default.get("week2")?:""
def week3 = _default.get("week3")?:""
def week4 = _default.get("week4")?:""

def selection = week1
// 根据 inversion_cycle 计算阈值并筛选工作日
def filteredWorkdays = []
if (inversion_cycle == 1) {
    filteredWorkdays = workdays.findAll { it.day_number < 8 }
} else if (inversion_cycle == 2) {
    filteredWorkdays = workdays.findAll { it.day_number < 15 }
    selection = selection + week2
} else if (inversion_cycle == 3) {
    filteredWorkdays = workdays.findAll { it.day_number < 22 }
    selection = selection + week2 + week3
} else if (inversion_cycle == 4) {
    selection = selection + week2 + week3 + week4
    filteredWorkdays = workdays 
}

final WEEK_DAYS = ['周一', '周二', '周三', '周四', '周五', '周六', '周日']

filteredWorkdays.each { day ->
        def offset = (day.day_number - 8 + 7) % 7
        day.set("name",WEEK_DAYS[offset])
        day.set("is_work", selection.contains(day.day_number.toString())?1:0)
}

groupShifts.forEach { i ->
    i.workdays = filteredWorkdays
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：生效日期转换
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
if (effect_time instanceof String) {
    def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd 00:00:00")
    _default.set("effect_time", sdf.parse(effect_time))
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：设置日历参数
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
Calendar cal = Calendar.getInstance()
int currentYear = cal.get(Calendar.YEAR)
def dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd")

// 设置开始日期为当年第一天
cal.set(currentYear, Calendar.JANUARY, 1, 0, 0, 0)
cal.set(Calendar.MILLISECOND, 0)
Date startOfYear = cal.getTime()

// 设置结束日期为当年最后一天
cal.set(currentYear, Calendar.DECEMBER, 31, 23, 59, 59)
cal.set(Calendar.MILLISECOND, 999)
Date endOfYear = cal.getTime()

// 设置过滤条件（格式化为yyyy-MM-dd）

_default.set("N_DATE_FROM_LTANDEQ", dateFormat.format(endOfYear))
_default.set("N_DATE_TO_GTANDEQ", dateFormat.format(startOfYear))
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：计算工时
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def activeShift = logic.param('activeShift').getReal()
def shift = activeShift.shift_data

// 计算总工时
int totalWorkLoad = 0
shift.scopes.each { workPeriod ->
    // 安全校验时间格式
    if (workPeriod?.start_base_time && workPeriod?.end_base_time) {
        def timeToMinutes = { time ->
        if (time instanceof java.sql.Timestamp) {
            String timeStr = time.toString().split(' ')[1]
            def parts = timeStr.split(':')[0..1]
            return (parts[0].toInteger() * 60) + parts[1].toInteger()
        }
        def parts = time.split(':')
        (parts[0].toInteger() * 60) + parts[1].toInteger()
    }
        def start = timeToMinutes(workPeriod.start_base_time)
        def end = timeToMinutes(workPeriod.end_base_time)
        if (start >= end) {
            totalWorkLoad += (24 * 60 - start + end);
        }else {
            totalWorkLoad += (end - start);
        }
    }
}

shift.work_load = totalWorkLoad
// shift.scopes = null
shift.set("work_times",shift.scopes)

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：构造节假日
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def curRldata = logic.param('curRldata').getReal()

def lastRldata = logic.param('lastRldata').getReal()

if(curRldata){
    // 添加日期格式化工具
    def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")

    // 获取当前年份的第一天和最后一天
    def currentYear = java.time.Year.now().value
    def firstDayOfYear = java.time.LocalDate.of(currentYear, 1, 1)
    def lastDayOfYear = java.time.LocalDate.of(currentYear, 12, 31)

    curRldata.each{ i ->
        // 解析日期范围
        def startDate = i.get("date_from")
        def endDate = i.get("date_to")

        if (startDate && endDate) {
            // 日期范围截断逻辑
            if(startDate && !startDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().isAfter(firstDayOfYear)){
                startDate = java.sql.Timestamp.valueOf(firstDayOfYear.atStartOfDay())
            }
            if(endDate && endDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate().isAfter(lastDayOfYear)){
                endDate = java.sql.Timestamp.valueOf(lastDayOfYear.atTime(23,59,59))
            }

            // 将Timestamp转换为LocalDate
            java.time.LocalDate start = startDate.toInstant()
                .atZone(java.time.ZoneId.systemDefault())
                .toLocalDate()

            java.time.LocalDate end = endDate.toInstant()
                .atZone(java.time.ZoneId.systemDefault())
                .toLocalDate()

            // 使用循环逐日增加
            while (!start.isAfter(end)) {
                def restday = sys.entity('resource_calendar_leaves')
                restday.set("date", sdf.format(Date.from(start.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant())))
                restday.set("name", i.get("name"))
                lastRldata.add(restday)
                // 增加一天
                start = start.plusDays(1)
            }
        }
    }
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：免考勤
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)

 //限制生成区间
def limitTime = _default.get("limitTime")
def limitCal = Calendar.getInstance()
if(limitTime ){
    if (limitTime instanceof String) {
        limitCal.setTime(sdf.parse(limitTime))
    } else {
        limitCal.setTime(limitTime)
    }
}
 
// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())


// 排班生成
def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
    
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {
    
    if(limitTime && startCal.before(limitCal)){
        startCal.add(Calendar.DAY_OF_MONTH, 1)
        continue 
    }

    def checkinDate = startCal.getTime()

    def schedule = sys.entity('attendance_schedule')
    schedule.rule_name = activeRule.get("name")
    schedule.rule_id = activeRule.get("id")
    schedule.checkin_date =  sdf.format(checkinDate)
    schedule.workday = 0

    newSchedules.add(schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：N班倒构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def activeShifts = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def inversion_days = _default.get("inversion_days")

def group_shift = logic.param('group_shift').getReal()
def workdays = group_shift.get("workdays")

def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
def endCal = Calendar.getInstance()
endCal.add(Calendar.MONTH, 1)
endCal.set(Calendar.DAY_OF_MONTH, endCal.getActualMaximum(Calendar.DAY_OF_MONTH))

 //限制生成区间
def limitTime = _default.get("limitTime")
def limitCal = Calendar.getInstance()
if(limitTime ){
    if (limitTime instanceof String) {
        limitCal.setTime(sdf.parse(limitTime))
    } else {
        limitCal.setTime(limitTime)
    }
}

def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
startCal.set(Calendar.HOUR_OF_DAY, 0)
startCal.set(Calendar.MINUTE, 0)
startCal.set(Calendar.SECOND, 0)
startCal.set(Calendar.MILLISECOND, 0)

def cycleMap = [:]
workdays.eachWithIndex { workday, index ->
    if (index + 1 <= inversion_days) {
        cycleMap[(index + 1)] = workday
    }
}

Date baseDate = startCal.getTime()
while (!startCal.after(endCal)) {

    if(limitTime && startCal.before(limitCal)){
        startCal.add(Calendar.DAY_OF_MONTH, 1)
        continue 
    }

    Date checkinDate = startCal.getTime()
    long offsetMillis = checkinDate.time - baseDate.time
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    int dayInCycle = (offsetDays % inversion_days) + 1

    def workdayConfig = cycleMap[dayInCycle]
    if (workdayConfig) {
        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
        def shiftData = shift?.shift_data ?: [:]
        def workTime = shiftData?.get("work_times") ?: []

        def schedule = sys.entity('attendance_schedule')
        schedule.rule_data = activeRule.rule_data
        schedule.rule_name = activeRule.name
        schedule.rule_id = activeRule.id
        schedule.checkin_date = sdf.format(checkinDate)
        schedule.shift_data = shiftData
        schedule.work_time = workTime
        schedule.workday = shiftData ? 1 : 0
        newSchedules.add(schedule)
    }
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：N班倒构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeShifts  = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def inversion_cycle = _default.get("inversion_cycle")

//获取workdays
def group_shift = logic.param('group_shift').getReal()
def workdays = group_shift.get("workdays")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)
 
  //限制生成区间
def limitTime = _default.get("limitTime")
def limitCal = Calendar.getInstance()
if(limitTime ){
    if (limitTime instanceof String) {
        limitCal.setTime(sdf.parse(limitTime))
    } else {
        limitCal.setTime(limitTime)
    }
}

// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())


// 排班生成
def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
    
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 计算周期天数（N班倒*7天）
int cycleDays = inversion_cycle * 7

// 预处理工作日数据：建立周期映射表（仅保留1~cycleDays的配置）
def validWorkdays = workdays.findAll { it.day_number <= cycleDays }
def cycleMap = [:]
validWorkdays.each { 
    cycleMap[it.day_number] = it 
}

// 计算生效日期对应的周期基准日（最近的前序周一）
Calendar baseDateCal = Calendar.getInstance()
baseDateCal.setTime(effect_time)
// 计算需要回退的天数（1=周日,2=周一,...,7=周六）
int daysToSubtract = (baseDateCal.get(Calendar.DAY_OF_WEEK) - 2 + 7) % 7

if (daysToSubtract > 0) {
    baseDateCal.add(Calendar.DAY_OF_MONTH, -daysToSubtract)
}
Date baseDate = baseDateCal.getTime()

// 遍历当月每一天
while (!startCal.after(endCal)) {
    
    if(limitTime && startCal.before(limitCal)){
        startCal.add(Calendar.DAY_OF_MONTH, 1)
        continue 
    }

    Date checkinDate = startCal.getTime()
    
    // 计算相对于基准日的天数偏移
    long offsetMillis = checkinDate.getTime() - baseDate.getTime()
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    
    // 计算周期位置（1-based）
    int dayInCycle = (offsetDays % cycleDays) + 1
    
    // 查找工作配置
    def workdayConfig = cycleMap[dayInCycle]

    if(workdayConfig!=null){
          //查找对应的班次信息
        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
        def shift_data =  shift?.shift_data?:null
        def workTime = shift_data?.get("work_times") ?: null

        def schedule = sys.entity('attendance_schedule')
        schedule.rule_data = activeRule.get("rule_data")
        schedule.rule_name = activeRule.get("name")
        schedule.rule_id = activeRule.get("id")
        schedule.checkin_date =  sdf.format(checkinDate)
        schedule.shift_data = shift_data
        schedule.work_time = workTime
        schedule.workday = shift_data != null ? 1 : 0 
        newSchedules.add(schedule)

    }
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}



```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：上A休B构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def activeShifts = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")

def rest = _default.get("rest")
def work = _default.get("work")

def group_shift = logic.param('group_shift').getReal()
def workdays = group_shift.get("workdays")

def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
def endCal = Calendar.getInstance()
endCal.add(Calendar.MONTH, 1)
endCal.set(Calendar.DAY_OF_MONTH, endCal.getActualMaximum(Calendar.DAY_OF_MONTH))

 //限制生成区间
def limitTime = _default.get("limitTime")
def limitCal = Calendar.getInstance()
if(limitTime ){
    if (limitTime instanceof String) {
        limitCal.setTime(sdf.parse(limitTime))
    } else {
        limitCal.setTime(limitTime)
    }
}

def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
startCal.set(Calendar.HOUR_OF_DAY, 0)
startCal.set(Calendar.MINUTE, 0)
startCal.set(Calendar.SECOND, 0)
startCal.set(Calendar.MILLISECOND, 0)

// 核心逻辑：构建天数循环映射
def workdayNum = rest+work;
def cycleMap = [:]
workdays.eachWithIndex { workday, index ->
    if (index + 1 <= workdayNum) {
        cycleMap[(index + 1)] = workday
    }
}

// 基准日设置
Date baseDate = startCal.getTime()
while (!startCal.after(endCal)) {

    if(limitTime && startCal.before(limitCal)){
        startCal.add(Calendar.DAY_OF_MONTH, 1)
        continue 
    }

    Date checkinDate = startCal.getTime()
    long offsetMillis = checkinDate.time - baseDate.time
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    int dayInCycle = (offsetDays % workdayNum) + 1

    def workdayConfig = cycleMap[dayInCycle]
    if (workdayConfig) {
        def shift = workdayConfig.get("is_work") == 1 ? activeShifts[0] : null
        def shiftData = shift?.shift_data ?: [:]
        def workTime = shiftData?.get("work_times") ?: []

        def schedule = sys.entity('attendance_schedule')
        schedule.rule_data = activeRule.rule_data
        schedule.rule_name = activeRule.name
        schedule.rule_id = activeRule.id
        schedule.checkin_date = sdf.format(checkinDate)
        schedule.shift_data = shiftData
        schedule.work_time = workTime
        schedule.workday = shiftData ? 1 : 0
        newSchedules.add(schedule)
    }
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：大小周构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeShifts  = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def workdays = _default.get("workdays")
//大小周
def biweekly_cycle = _default.get("biweekly_cycle")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)

 //限制生成区间
def limitTime = _default.get("limitTime")
def limitCal = Calendar.getInstance()
if(limitTime ){
    if (limitTime instanceof String) {
        limitCal.setTime(sdf.parse(limitTime))
    } else {
        limitCal.setTime(limitTime)
    }
}
 
// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())

// 计算当天排班班次
def generateShiftData = { Date checkinDate, List workdaysParam, List activeShiftsParam ->
    // 1. 确定当前日期是周几（1-7对应周一到周日）
    def calendarInner = Calendar.getInstance()
    calendarInner.setTime(checkinDate)
    int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
    int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1

    // 新增大/小周计算逻辑
    // 计算生效日期所在周的第一天（周一）
    def effectCal = Calendar.getInstance()
    effectCal.setTime(effect_time)
    effectCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)

    // 计算检查日期所在周的第一天（周一）
    def checkinCal = Calendar.getInstance()
    checkinCal.setTime(checkinDate)
    checkinCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)

    // 计算周数差（生效日期所在周为第1周）
    long diffMillis = checkinCal.getTimeInMillis() - effectCal.getTimeInMillis()
    int weekNumber = (int)(diffMillis / (7 * 24 * 60 * 60 * 1000)) + 1

    // 判断当前是大周还是小周
    boolean isBigWeek = false
    if (biweekly_cycle == "big_small") {
    isBigWeek = (weekNumber % 2 == 1)  // 奇数周为大周
} else if (biweekly_cycle == "small_big") {
    isBigWeek = (weekNumber % 2 == 0)  // 偶数周为大周
}

// 调整day_number（小周时+7）
int adjustedDayNumber = isBigWeek ? dayNumber : dayNumber + 7

// 2. 查找匹配的工作日配置（直接匹配调整后的day_number）
def workdayConfig = workdaysParam.find {
    it.day_number == adjustedDayNumber
}

// 3. 未找到工作日配置时返回空班次
if (!workdayConfig || !workdayConfig.shift_id) {
    return null
}

// 4. 查找对应的班次信息
def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }

// 5. 未找到班次时返回空班次
if (!shift || !shift.shift_data) {
    return null
}

// 6. 返回班次数据
return shift.shift_data
}

// 排班生成
def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
    
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {
    if(limitTime && startCal.before(limitCal)){
        startCal.add(Calendar.DAY_OF_MONTH, 1)
        continue 
    }
    def checkinDate = startCal.getTime()
    def shift_data = generateShiftData(checkinDate, workdays, activeShifts)
    def workTime = shift_data?.get("work_times") ?: null

    def schedule = sys.entity('attendance_schedule')
    schedule.rule_data = activeRule.get("rule_data")
    schedule.rule_name = activeRule.get("name")
    schedule.rule_id = activeRule.get("id")
    schedule.checkin_date =  sdf.format(checkinDate)
    if(shift_data){
        shift_data.name = "白班"
    }
    schedule.shift_data = shift_data
    schedule.work_time = workTime
    schedule.workday = shift_data != null ? 1 : 0 
    // schedule.id = UUID.randomUUID().toString() 

    newSchedules.add(schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：固定排班/灵活打卡构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班

def activeShifts  = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()

def effect_time = _default.get("effect_time")
def workdays = _default.get("workdays")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()

def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)

 //限制生成区间
def limitTime = _default.get("limitTime")
def limitCal = Calendar.getInstance()
if(limitTime != null && limitTime !=""){
    println("limitTime"+limitTime)
    if (limitTime instanceof String) {
        limitCal.setTime(sdf.parse(limitTime))
    } else {
        limitCal.setTime(limitTime)
    }
}
// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))

// 排班结束日期
def endDate = sdf.format(calendar.getTime())

// 计算当天排班班次
def generateShiftData = { Date checkinDate, List workdaysParam, List activeShiftsParam ->
    // 1. 确定当前日期是周几（1-7对应周一到周日）
    def calendarInner = Calendar.getInstance()
    calendarInner.setTime(checkinDate)
    int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
    int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1

    // 2. 查找匹配的工作日配置
    def workdayConfig = workdaysParam.find { it.day_number == dayNumber }

    // 3. 未找到工作日配置时返回空班次
    if (!workdayConfig || !workdayConfig.shift_id) {
        // print "未找到工作日配置时返回空班次, ${workdayConfig}!"
        return null
    }

    // 4. 查找对应的班次信息
    def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }

    // 5. 未找到班次时返回空班次
    if (!shift || !shift.shift_data) {
        // print "未找到班次时返回空班次, ${shift}!"
        return null
    }

    // 6. 返回班次数据
    // print "返回班次数据, ${shift}!"
    return shift.shift_data
}

// 排班生成
def startCal = Calendar.getInstance()
startCal.setTime(effect_time)

// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {

    if(limitTime && startCal.before(limitCal)){
        startCal.add(Calendar.DAY_OF_MONTH, 1)
        continue
    }
    def checkinDate = startCal.getTime()
    def shift_data = generateShiftData(checkinDate, workdays, activeShifts)
    def workTime = shift_data?.get("work_times") ?: null

    def schedule = sys.entity('attendance_schedule')
    schedule.rule_data = activeRule.get("rule_data")
    schedule.rule_name = activeRule.get("name")
    schedule.rule_id = activeRule.get("id")
    schedule.checkin_date =  sdf.format(checkinDate)
    schedule.shift_data = shift_data
    schedule.work_time = workTime
    schedule.workday = shift_data != null ? 1 : 0
    // schedule.id = UUID.randomUUID().toString()

    newSchedules.add(schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)

}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：手动排班构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def workdays = _default.get("workdays")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)

  //限制生成区间
def limitTime = _default.get("limitTime")
def limitCal = Calendar.getInstance()
if(limitTime ){
    if (limitTime instanceof String) {
        limitCal.setTime(sdf.parse(limitTime))
    } else {
        limitCal.setTime(limitTime)
    }
}

// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())

// 排班生成
def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
    
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {

    if(limitTime && startCal.before(limitCal)){
        startCal.add(Calendar.DAY_OF_MONTH, 1)
        continue 
    }    
    
    def checkinDate = startCal.getTime()

    def schedule = sys.entity('attendance_schedule')
    schedule.rule_data = activeRule.get("rule_data")
    schedule.rule_name = activeRule.get("name")
    schedule.rule_id = activeRule.get("id")
    schedule.checkin_date =  sdf.format(checkinDate)
    // schedule.id = UUID.randomUUID().toString() 

    newSchedules.add(schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：自由班构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeShifts  = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)

 //限制生成区间
def limitTime = _default.get("limitTime")
def limitCal = Calendar.getInstance()
if(limitTime ){
    if (limitTime instanceof String) {
        limitCal.setTime(sdf.parse(limitTime))
    } else {
        limitCal.setTime(limitTime)
    }
}
 
// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())


// 排班生成
def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
    
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 遍历日期区间
while (!startCal.after(endCal)) {
    
    if(limitTime && startCal.before(limitCal)){
        startCal.add(Calendar.DAY_OF_MONTH, 1)
        continue 
    }
        
    def checkinDate = startCal.getTime()
    def shift_data = activeShifts[0].shift_data
    def workTime = shift_data?.get("work_times") ?: null

    def schedule = sys.entity('attendance_schedule')
    schedule.rule_data = activeRule.get("rule_data")
    schedule.rule_name = activeRule.get("name")
    schedule.rule_id = activeRule.get("id")
    schedule.checkin_date =  sdf.format(checkinDate)
    schedule.shift_data = shift_data
    schedule.work_time = workTime
    schedule.workday = shift_data != null ? 1 : 0 
    // schedule.id = UUID.randomUUID().toString() 

    newSchedules.add(schedule)
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：计算规则成员
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
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：判断节假日
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def newSchedules = logic.param('newSchedules').getReal()
def holidays = logic.param('lastRldata').getReal()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")

if (newSchedules && newSchedules.size() > 0 && holidays && holidays.size() > 0){
    newSchedules.each { schedule ->
        def checkin_date = sdf.format(schedule.checkin_date)
        def holiday = holidays.find { it.get("date") == checkin_date }
        if(holiday != null ){
            schedule.shift_data = null
            schedule.work_time = null
            schedule.workday = 0
        }
    }
}

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：判断节假日
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def newSchedules = logic.param('newSchedules').getReal()
def holidays = logic.param('lastRldata').getReal()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")

if (newSchedules && newSchedules.size() > 0 && holidays && holidays.size() > 0){
    newSchedules.each { schedule ->
        def checkin_date = sdf.format(schedule.checkin_date)
        def holiday = holidays.find { it.get("date") == checkin_date }
        if(holiday != null ){
            schedule.shift_data = null
            schedule.work_time = null
            schedule.workday = 0
        }
    }
}

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：过滤出不在其他生效规则内的人员
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
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：为规则人员生成新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def members = logic.param('members').getReal()
def lastSchedules = logic.param('lastSchedules').getReal()
def newSchedules = logic.param('newSchedules').getReal()

members.each { member ->
    if (member == null) return
    newSchedules.each { schedule ->
        def newSchedule = sys.entity('attendance_schedule')
        schedule.copyTo(newSchedule)
        newSchedule.member_id = member.user_id
        newSchedule.member_name = member.name
        lastSchedules.add(newSchedule)
    }
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：人员转换
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def employees = logic.param('employees').getReal()
def members = logic.param('members').getReal()


def uniqueMemberIdMap = new HashMap()

employees.each { emp ->
    def member = sys.entity('Attendance_group_shift_member')
    member.set("user_id",emp.id)
    member.set("name",emp.name)
    uniqueMemberIdMap.put(member.user_id, member)
}

members.clear()
members.addAll(uniqueMemberIdMap.values())

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[激活规则(activeRule)](module/attendance/attendance_rule/logic/activeRule)

节点：查找需更新的activeRule
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def curActiveMember = logic.param('curActiveMember').getReal()
def members = logic.param('members').getReal()
def changes = logic.param('changes').getReal()

def ruleIdSet = members.collect { member ->
    curActiveMember.findResult(null) { it.get("member_id") == member.user_id ? it.get("rule_id") : null }
}.findAll { it != null }.toSet()

ruleIdSet.each { ruleId ->
    def newRule = sys.entity('attendance_activate_rule')
    newRule.set('id', ruleId)
    changes.add(newRule)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[生成Odoo工作时间(generateOther)](module/attendance/attendance_rule/logic/generateOther)

节点：构造工作时间
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def workdays = _default.get("workdays")
def shifts = _default.get("shifts")
def schedule_type = _default.get("schedule_type")

def attendances = logic.param('attendances').getReal()

def resource_calendar = logic.param('resource_calendar').getReal()
// 基础字段默认值
resource_calendar.set("id", _default.get("id"))
resource_calendar.set("name", _default.get("name")+"的工作时间")
// resource_calendar.set("name", _default.get("company")+"的工作时间")
resource_calendar.set("active", 1)
resource_calendar.set("company_id", _default.get("company_id"))
resource_calendar.set("tz", java.util.TimeZone.getDefault().ID)
resource_calendar.set("flexible_hours", 0)
resource_calendar.set("full_time_required_hours", 0.0)
resource_calendar.set("two_weeks_calendar", schedule_type == "alternate_week" ? 1 : 0)

def timeFormatter = java.time.format.DateTimeFormatter.ofPattern("HH:mm")
def noon = java.time.LocalTime.of(12, 0)
final WEEK_DAYS = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']

// 时间转换函数（含四舍五入逻辑）
def convertTimeToHours = { time ->
def hours, minutes
def calendar = Calendar.getInstance()
calendar.setTimeInMillis(time.getTime())
hours = calendar.get(Calendar.HOUR_OF_DAY)
minutes = calendar.get(Calendar.MINUTE)
def totalMinutes = hours * 60 + minutes
def decimalHours = totalMinutes / 60.0
// 四舍五入到一位小数
return (decimalHours * 10).round() / 10.0
}

//固定排班、灵活打卡、大小周
if(workdays && (schedule_type == "fixed" || schedule_type == "flexible" || schedule_type == "alternate_week")){
    workdays.forEach { workday ->
        def offset = (workday.day_number - 1) % 7
        def shift = shifts.find { it.get("id") == workday.get(("shift_id")) }
        if (shift) {
            def scopes = shift.get("scopes");
            if (scopes){
                scopes.forEach { scope ->
                    def attendance = sys.entity('resource_calendar_attendance')

                    def dayName = WEEK_DAYS[offset]
                    def startTimeStr = new java.text.SimpleDateFormat("HH:mm").format(scope.start_base_time)
                    def startTime = java.time.LocalTime.parse(startTimeStr, timeFormatter)

                    // 设置考勤名称
                    def period = (startTime >= noon) ? "Afternoon" : "Morning"
                    attendance.set("name", "${dayName} ${period}")
                    attendance.set("dayofweek", offset)
                    attendance.set("sequence", offset)

                    // 大小周
                    if (schedule_type == "alternate_week") {
                        def biweekly_cycle = _default.get("biweekly_cycle")
                        if(biweekly_cycle == "big_small"){
                            attendance.set("sequence", workday.day_number)
                            attendance.set("week_type", workday.day_number > 7 ? 1 : 0)
                        }
                        else if(biweekly_cycle == "small_big"){
                            attendance.set("sequence", workday.day_number > 7 ? workday.day_number - 7 : workday.day_number + 7)
                            attendance.set("week_type", workday.day_number > 7 ? 0 : 1)
                        }
                    }
                    
                    // 转换时间字段
                    def hourFrom = convertTimeToHours(scope.start_base_time)
                    def hourTo = convertTimeToHours(scope.end_base_time)

                    attendance.set("hour_from", hourFrom)
                    attendance.set("hour_to", hourTo)
                    attendance.set("day_period", hourFrom >= 12 ? "afternoon" : "morning")
                    attendances.add(attendance);
                }
            }

        }
    }
}




resource_calendar.set("attendances", attendances)

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[计算其他信息(calcOther)](module/attendance/attendance_rule/logic/calcOther)

节点：计算上下班时间
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def shifts  = _default.get("shifts")
def schedule_type = _default.get("schedule_type")
if (["alternate_week", "fixed", "flexible", "work_rest", "free"].contains(schedule_type) && shifts) {
    def shift = shifts.find { it.get("default_flag") == 1 }
    def scopes = shift.get("scopes")
    if (scopes) {
        def worktimeParts = []
        def timeFormat = new java.text.SimpleDateFormat("HH:mm")
        scopes.forEach { scope ->
            def next_tag = scope.get("next_tag")
            def start_base_time = scope.get("start_base_time")
            def end_base_time = scope.get("end_base_time")

            def formatTime = { time ->
                timeFormat.format(time instanceof Date ? time : new Date(time.time))
            }
            def start = formatTime(start_base_time)
            if (next_tag && next_tag in ["1,0", "1,1"]) {
                start = "次日" + start
            }

            def end = formatTime(end_base_time)
            if (next_tag && next_tag in ["0,1", "1,1"]) {
                end = "次日" + end
            }
            worktimeParts << "${start}-${end}"

        }

        _default.set("work_time", worktimeParts.join('/'))
    }
}

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[计算其他信息(calcOther)](module/attendance/attendance_rule/logic/calcOther)

节点：填充默认班次标识
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def shifts = _default.get("shifts")
if(shifts){
    def shift = shifts.find { it.default_flag == 1 }
    if(shift){
        _default.set("default_shift",shift.get("id"))
    }
}


```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[计算其他信息(calcOther)](module/attendance/attendance_rule/logic/calcOther)

节点：填充自由班上下班时间
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var _default = logic.getParam('Default');
var shifts = _default.get("shifts");
if(shifts!=null && shifts.size()>0){
    var shift = shifts.get(0);
    var scopes = shift.get("scopes")
    var scope = scopes.get(0);
    _default.set("free_start",scope.get("start_base_time"))
    _default.set("free_end",scope.get("end_base_time"))
}

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[计算其他信息(calcOther)](module/attendance/attendance_rule/logic/calcOther)

节点：计算组排班数
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def schedule_type = _default.get('schedule_type')
def group_num = _default.get('group_num')
def group_shifts = _default.get('group_shifts')
if (group_num == null && (schedule_type == "class_inversion" || schedule_type == "work_rest") && group_shifts != null ) {
    _default.set("group_num",group_shifts.size())
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[计算日历排班(attendance_scheduleCalendar)](module/attendance/attendance_rule/logic/attendance_scheduleCalendar)

节点：获取当月法定节假日
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _filter = logic.param('Filter').getReal()

def dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd")

def _default = logic.param('Default').getReal()
def rqStr = _default.get("rq")

def yearMonthStr = rqStr.substring(0, 7)
_default.set("rq", yearMonthStr)
def rqDateFormat = new java.text.SimpleDateFormat("yyyy-MM")
def rqDate = rqDateFormat.parse(yearMonthStr)

Calendar cal = Calendar.getInstance()
cal.setTime(rqDate)

// 设置当月第一天
cal.set(Calendar.DAY_OF_MONTH, 1)
Date startOfMonth = cal.getTime()

// 设置下个月第一天并回退一天得到当月最后一天
cal.add(Calendar.MONTH, 1)
cal.set(Calendar.DAY_OF_MONTH, 1)
cal.add(Calendar.DAY_OF_MONTH, -1)
Date endOfMonth = cal.getTime()

// 设置过滤条件（格式化为yyyy-MM-dd）
_default.set("N_DATE_FROM_LTANDEQ", dateFormat.format(endOfMonth))
_default.set("N_DATE_TO_GTANDEQ", dateFormat.format(startOfMonth))
_default.set("startOfMonth",startOfMonth)
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[计算日历排班(attendance_scheduleCalendar)](module/attendance/attendance_rule/logic/attendance_scheduleCalendar)

节点：根据holiday配置确定lastRldata
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def curRldata = logic.param('leaves').getReal()
def lastRldata = logic.param('lastRldata').getReal()
def _default = logic.param('Default').getReal()
def holiday = _default.get("holiday")
def startOfMonth = _default.get("startOfMonth")

if(curRldata && holiday && startOfMonth){
    def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
    
    curRldata.each{ i ->
        def holiday_type = i.get("holiday_type")?: ""
        
        if(holiday.contains(holiday_type)){
            def startDate = i.get("date_from")
            def endDate = i.get("date_to")

            if (startDate && endDate) {
                // 日期范围调整逻辑
                if(startOfMonth.after(startDate)){
                    startDate = startOfMonth
                }
                
                // 确保结束日期不小于开始日期
                if(endDate.before(startDate)) return

                // 使用Calendar进行日期遍历
                Calendar cal = Calendar.getInstance()
                cal.setTime(startDate)
                
                while (!cal.getTime().after(endDate)) {  
                    def restday = sys.entity('resource_calendar_leaves')
                    restday.set("date", sdf.format(cal.getTime()))
                    restday.set("iswork", 0)
                    restday.set("name", i.get("name"))
                    lastRldata.add(restday)
                    
                    cal.add(Calendar.DATE, 1) 
                }
            }
        }
    }
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[计算日历排班(attendance_scheduleCalendar)](module/attendance/attendance_rule/logic/attendance_scheduleCalendar)

节点：固定排班/灵活打卡
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//计算排班
def _default = logic.param('Default').getReal()
def schedule_type = _default.get("schedule_type")
def workdays = _default.get("workdays")
def shifts = _default.get("shifts")
def inversion_cycle = _default.get("inversion_cycle")
def inversion_count = _default.get("inversion_count")
def same_restday = _default.get("same_restday")
def inversion_days = _default.get("inversion_days")
def rest = _default.get("rest")
def work = _default.get("reworkst")
def biweekly_cycle = _default.get("biweekly_cycle")
def rq = _default.get("rq")

def lastRldata = logic.param('lastRldata').getReal()

// 解析传入月份并计算起止时间
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
def rqDateFormat = new java.text.SimpleDateFormat("yyyy-MM")
def rqDate = rqDateFormat.parse(rq)

Calendar cal = Calendar.getInstance()
cal.setTime(rqDate)

// 设置当月第一天
cal.set(Calendar.DAY_OF_MONTH, 1)
Date startOfMonth = cal.getTime()

// 设置下个月第一天并回退一天得到当月最后一天
cal.add(Calendar.MONTH, 1)
cal.set(Calendar.DAY_OF_MONTH, 1)
cal.add(Calendar.DAY_OF_MONTH, -1)
Date endOfMonth = cal.getTime()

def startCal = Calendar.getInstance()
startCal.setTime(startOfMonth)

def endCal = Calendar.getInstance()
endCal.setTime(endOfMonth)


// 判断是否工作日
def judgeWork = { Date checkinDate, List workdaysParam, List activeShiftsParam ->
        // 1. 确定当前日期是周几（1-7对应周一到周日）
        def calendarInner = Calendar.getInstance()
    calendarInner.setTime(checkinDate)
    int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
    int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1
    // print "班次数据, ${activeShiftsParam}!"
    // print "工作日数据, ${workdaysParam}!"
    // print "日期数据, ${checkinDate}!"

    // 2. 查找匹配的工作日配置
    def workdayConfig = workdaysParam.find { it.day_number == dayNumber }

// 3. 未找到工作日配置时返回空班次
if (!workdayConfig || !workdayConfig.shift_id) {
    return 0
}

// 4. 查找对应的班次信息
def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }

// 5. 未找到班次时返回空班次
if (!shift) {
    return 0

}

return 1;
}

// 遍历日期区间
while (!startCal.after(endCal)) {
    def checkinDate = startCal.getTime()
    def day = lastRldata.find { it.date_to >= checkinDate && it.date_from <= checkinDate }

    if(day == null){
        def res = judgeWork(checkinDate, workdays, shifts)
        if(res==0){
            def restday = sys.entity('resource_calendar_leaves')
            restday.set("date",sdf.format(checkinDate))
            restday.set("iswork",0)
            lastRldata.add(restday)
        }
    }

    startCal.add(Calendar.DAY_OF_MONTH, 1)
}

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[计算日历排班(attendance_scheduleCalendar)](module/attendance/attendance_rule/logic/attendance_scheduleCalendar)

节点：N班倒-休息日相同
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def schedule_type = _default.get("schedule_type")
def workdays = _default.get("workdays")
def shifts = _default.get("shifts")
def inversion_cycle = _default.get("inversion_cycle")
def inversion_count = _default.get("inversion_count")
def same_restday = _default.get("same_restday")
def inversion_days = _default.get("inversion_days")
def rest = _default.get("rest")
def work = _default.get("reworkst")
def biweekly_cycle = _default.get("biweekly_cycle")
def rq = _default.get("rq")

def lastRldata = logic.param('lastRldata').getReal()

// 解析传入月份并计算起止时间
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
def rqDateFormat = new java.text.SimpleDateFormat("yyyy-MM")
def rqDate = rqDateFormat.parse(rq)

Calendar cal = Calendar.getInstance()
cal.setTime(rqDate)

// 设置当月第一天
cal.set(Calendar.DAY_OF_MONTH, 1)
Date startOfMonth = cal.getTime()

// 设置下个月第一天并回退一天得到当月最后一天
cal.add(Calendar.MONTH, 1)
cal.set(Calendar.DAY_OF_MONTH, 1)
cal.add(Calendar.DAY_OF_MONTH, -1)
Date endOfMonth = cal.getTime()

def startCal = Calendar.getInstance()
startCal.setTime(startOfMonth)

def endCal = Calendar.getInstance()
endCal.setTime(endOfMonth)

// 计算周期天数（N班倒*7天）
int cycleDays = inversion_cycle * 7

// 预处理工作日数据：建立周期映射表（仅保留1~cycleDays的配置）
def validWorkdays = workdays.findAll { it.day_number <= cycleDays }
def cycleMap = [:]
validWorkdays.each { 
    cycleMap[it.day_number] = it 
}

// 计算当月第一天对应的周期基准日（最近的前序周一）
Calendar baseDateCal = Calendar.getInstance()
baseDateCal.setTime(startOfMonth)
// 计算需要回退的天数（1=周日,2=周一,...,7=周六）
int daysToSubtract = (baseDateCal.get(Calendar.DAY_OF_WEEK) - 2 + 7) % 7
if (daysToSubtract > 0) {
    baseDateCal.add(Calendar.DAY_OF_MONTH, -daysToSubtract)
}
Date baseDate = baseDateCal.getTime()

// 遍历当月每一天
while (!startCal.after(endCal)) {
    Date checkinDate = startCal.getTime()
    
    // 计算相对于基准日的天数偏移
    long offsetMillis = checkinDate.getTime() - baseDate.getTime()
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    
    // 计算周期位置（1-based）
    int dayInCycle = (offsetDays % cycleDays) + 1

    // 查找工作配置
    def workdayConfig = cycleMap[dayInCycle]
    
    // 判断是否为休息日
    boolean isRestDay = (workdayConfig == null) || 
                       (workdayConfig.title == "休息")
    
    // 如果是休息日且未记录，则添加到结果集
    if (isRestDay) {
        def day = lastRldata.find { it.date_to >= checkinDate && it.date_from <= checkinDate }
        if (day == null) {
            def restday = sys.entity('resource_calendar_leaves')
            restday.set("date",sdf.format(checkinDate))
            restday.set("iswork",0)
            lastRldata.add(restday)
        }
    }
    
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[计算日历排班(attendance_scheduleCalendar)](module/attendance/attendance_rule/logic/attendance_scheduleCalendar)

节点：大小周
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//计算排班
def _default = logic.param('Default').getReal()
def schedule_type = _default.get("schedule_type")
def workdays = _default.get("workdays")
def shifts = _default.get("shifts")
def inversion_cycle = _default.get("inversion_cycle")
def inversion_count = _default.get("inversion_count")
def same_restday = _default.get("same_restday")
def inversion_days = _default.get("inversion_days")
def rest = _default.get("rest")
def work = _default.get("reworkst")
def biweekly_cycle = _default.get("biweekly_cycle")
def rq = _default.get("rq")

def lastRldata = logic.param('lastRldata').getReal()



// 解析传入月份并计算起止时间
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
def rqDateFormat = new java.text.SimpleDateFormat("yyyy-MM")
def rqDate = rqDateFormat.parse(rq)

Calendar cal = Calendar.getInstance()
cal.setTime(rqDate)

// 设置当月第一天
cal.set(Calendar.DAY_OF_MONTH, 1)
Date startOfMonth = cal.getTime()

// 设置下个月第一天并回退一天得到当月最后一天
cal.add(Calendar.MONTH, 1)
cal.set(Calendar.DAY_OF_MONTH, 1)
cal.add(Calendar.DAY_OF_MONTH, -1)
Date endOfMonth = cal.getTime()

def startCal = Calendar.getInstance()
startCal.setTime(startOfMonth)


def endCal = Calendar.getInstance()
endCal.setTime(endOfMonth)

// 判断是否工作日
def judgeWork = { Date checkinDate, List workdaysParam, List activeShiftsParam ->
        // 1. 确定当前日期是周几（1-7对应周一到周日）
        def calendarInner = Calendar.getInstance()
    calendarInner.setTime(checkinDate)
    int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
    int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1
    // print "所在周的第一天, ${startOfMonth}!"
    // print "日期数据, ${checkinDate}!"
    // 大/小周计算逻辑
    // 计算起始日期所在周的第一天（周一）
    def effectCal = Calendar.getInstance()
    effectCal.setTime(startOfMonth)
    effectCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)

    // 计算检查日期所在周的第一天（周一）
    def checkinCal = Calendar.getInstance()
    checkinCal.setTime(checkinDate)
    checkinCal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY)

    // 计算周数差（生效日期所在周为第1周）
    long diffMillis = checkinCal.getTimeInMillis() - effectCal.getTimeInMillis()
    int weekNumber = (int)(diffMillis / (7 * 24 * 60 * 60 * 1000)) + 1

    // 判断当前是大周还是小周
    boolean isBigWeek = false
    if (biweekly_cycle == "big_small") {
    isBigWeek = (weekNumber % 2 == 1)  // 奇数周为大周
} else if (biweekly_cycle == "small_big") {
    isBigWeek = (weekNumber % 2 == 0)  // 偶数周为大周
}

// 调整day_number（小周时+7）
int adjustedDayNumber = isBigWeek ? dayNumber : dayNumber + 7

// 2. 查找匹配的工作日配置（直接匹配调整后的day_number）
def workdayConfig = workdaysParam.find {
    it.day_number == adjustedDayNumber
}

// 3. 未找到工作日配置时返回空班次
if (!workdayConfig || !workdayConfig.shift_id) {
    // print "未找到工作日配置时返回空班次, ${workdayConfig}!"
    return 0
}

// 4. 查找对应的班次信息
def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }

// 5. 未找到班次时返回空班次
if (!shift) {
    // print "未找到班次时返回空班次, ${shift}!"
    return 0
}

// 6. 返回班次数据
// print "返回班次数据, ${shift}!"
return 1
}


// 遍历日期区间
while (!startCal.after(endCal)) {
    def checkinDate = startCal.getTime()
    def day = lastRldata.find { it.date_to >= checkinDate && it.date_from <= checkinDate }
    if (day == null) {
        def res = judgeWork(checkinDate, workdays, shifts)
        if(res==0){
            def restday = sys.entity('resource_calendar_leaves')
            restday.set("date",sdf.format(checkinDate))
            restday.set("iswork",0)
            lastRldata.add(restday)
        }
    }

    startCal.add(Calendar.DAY_OF_MONTH, 1)
}

```
#### [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)的处理逻辑[fillShifts](module/attendance/attendance_schedule/logic/fillShifts)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
var shifts = logic.getParam('shifts');
var _default = logic.getParam('Default');

var lastShifts = [];

for (var i = 0; i < shifts.getLength(); i++) {
  var shift = shifts.get(i);
  var work_times = [];
  if(shift.get("scopes")!=null){
    var scopes = shift.get("scopes");
    for (var a =0; a<scopes.getLength(); a++) {
      var scope = scopes.get(a);
      var work_time ={
        start : scope.get("start_base_time"),
        end: scope.get("end_base_time")

      }
      work_times.push(work_time);
    }
    var lastshift = {
      id : i+1,
      name : shift.name,
      work_times : work_times,
      rule_id : _default.get("id")
    }
    lastShifts.push(lastshift);
  }

}

_default.set("work_time",lastShifts[0].work_times)

_default.set("shifts",lastShifts)

```
#### [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)的处理逻辑[手动排班(manual)](module/attendance/attendance_schedule/logic/manual)

节点：手动调班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def attendance_schedule_runtime = sys.dataentity('attendance_schedule')

if(_default != null){
    _default.each { it ->
        def attendance_schedule = attendance_schedule_runtime.entity()
        def attendance_schedule_id = it.get("id")
        def workday = it.get("workday")
        if(attendance_schedule_id != null){
            attendance_schedule.set("id", attendance_schedule_id)
            attendance_schedule.set("manual", 1)
            attendance_schedule.set("workday", workday)
            def choose_shift = it.get("choose_shift")
            if(choose_shift != null){
                def shift_data = choose_shift.get("shift_data")
                def work_time = choose_shift.get("work_times")?choose_shift.get("work_times"):shift_data.get("work_times")
                attendance_schedule.set("work_time", work_time)
                attendance_schedule.set("shift_data", shift_data)
            }
            attendance_schedule_runtime.update(attendance_schedule)
        }
    }
}


```
#### [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)的处理逻辑[搜索月份(search_month)](module/attendance/attendance_schedule/logic/search_month)

节点：获取最近五个月的月份
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def result_list = logic.param('result_list').getReal()

// 获取当前日期
def currentDate = new Date()

// 设置日期格式
def dateFormat = new java.text.SimpleDateFormat("yyyy-MM")

// 获取当前年月字符串
def cur_month = dateFormat.format(currentDate)
def cur_month_map = new HashMap()
cur_month_map.put('name', cur_month)

// 获取当前日期的 Calendar 实例
def calendar = java.util.Calendar.getInstance()
calendar.setTime(currentDate)

// 获取前3个月
for (int i = 3; i >= 1; i--) {
    calendar.setTime(currentDate)
    calendar.add(Calendar.MONTH, -i)
    def month_map = new HashMap()
    month_map.put('name', dateFormat.format(calendar.getTime()))
    result_list.add(month_map)
}
result_list.add(cur_month_map)
// 获取后1个月
calendar.setTime(currentDate) // 重置为当前日期
calendar.add(Calendar.MONTH, 1)
def next_month = dateFormat.format(calendar.getTime())
def next_month_map = new HashMap()
next_month_map.put('name', next_month)
result_list.add(next_month_map)
```
#### [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)的处理逻辑[清除手动排班(clearManualSchedule)](module/attendance/attendance_schedule/logic/clearManualSchedule)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def temp = logic.param('temp').getReal()
def rule = logic.param('rule').getReal()

def rule_data = temp.get("rule_data").any()
if (rule_data){

    def rule_runtime = sys.dataentity('attendance_rule')
    rule_runtime.createEntity(rule_data).copyTo(rule)
    //限制时间：今日
    def cal = Calendar.getInstance()
    cal.time = new Date()
    cal.set(Calendar.HOUR_OF_DAY, 0)
    cal.set(Calendar.MINUTE, 0)
    cal.set(Calendar.SECOND, 0)
    cal.set(Calendar.MILLISECOND, 0)
    rule.set("limitTime", cal.getTime())

    //转换scope
    def shifts = temp.get("rule_data").any().get("shifts")
    if(shifts){
        def _shifts = logic.param('shifts').getReal()
        shifts.forEach { shift ->
            def newShift = sys.entity('attendance_shift')
            shift.copyTo(newShift)
            _shifts.add(newShift)
        }
        rule.set("shifts",_shifts)
    }
}



```
#### [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)的处理逻辑[清除手动排班(clearManualSchedule)](module/attendance/attendance_schedule/logic/clearManualSchedule)

节点：计算构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def temp = logic.param('temp').getReal()
def checkinDate = temp.get("checkin_date")
def activeShifts = logic.param('activeShifts').getReal()

def rule_data = temp.get("rule_data")
print "rule_data配置, ${rule_data}"
print "activeShifts配置, ${activeShifts}"
print "checkinDate配置, ${checkinDate}"

if (rule_data != null && checkinDate != null && activeShifts != null) {
    Map<String, Object> ruleData = rule_data as Map<String, Object>;
    def workdays = ruleData.get("workdays")
    print "工作日配置, ${workdays}"


    // 计算当天排班班次
    def calcShiftData = { Date checkinDateParam, List workdaysParam, List activeShiftsParam ->
        // 1. 确定当前日期是周几（1-7对应周一到周日）
        def calendarInner = Calendar.getInstance()
        calendarInner.setTime(checkinDateParam)
        int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
        int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1

        // 2. 查找匹配的工作日配置
        def workdayConfig = workdaysParam.find { it.day_number == dayNumber }

        // 3. 未找到工作日配置时返回空班次
        if (!workdayConfig || !workdayConfig.shift_id) {
            print "未找到工作日配置时返回空班次, ${workdayConfig}!"
            return null
        }

        // 4. 查找对应的班次信息
        def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }

        // 5. 未找到班次时返回空班次
        if (!shift || !shift.shift_data) {
            print "未找到班次时返回空班次, ${shift}!"
            return null
        }

        // 6. 返回班次数据
        print "返回班次数据, ${shift}!"
        return shift.shift_data
    }

    def shift_data = calcShiftData(checkinDate, workdays, activeShifts)
    def workTime = shift_data?.work_times ?: null
    temp.set("shift_data",shift_data)
    temp.set("work_time",workTime)
    temp.set("workday",shift_data != null ? 1 : 0)

}

```
#### [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)的处理逻辑[清除手动排班(clearManualSchedule)](module/attendance/attendance_schedule/logic/clearManualSchedule)

节点：上A休B构造新排班
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def temp = logic.param('temp').getReal()
def checkinDate = temp.get("checkin_date")
def activeShifts = logic.param('activeShifts').getReal()
def member_id = temp.get("member_id")
def rule_data = temp.get("rule_data")

if (rule_data != null && checkinDate != null && activeShifts != null) {
    Map<String, Object> ruleData = rule_data as Map<String, Object>
    def attendance_group_shifts = ruleData.get("attendance_group_shifts")
    def effect_time = ruleData.get("effect_time")
    def inversion_cycle = ruleData.get("inversion_cycle") as Integer

    // 解析日期工具
    def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
    def checkinCal = Calendar.getInstance()
    if (checkinDate instanceof String) {
        checkinCal.setTime(sdf.parse(checkinDate))
    } else {
        checkinCal.setTime(checkinDate)
    }

    // 计算周期天数
    int cycleDays = inversion_cycle * 7

    // 预处理工作日数据
    def validWorkdays = attendance_group_shifts.findAll { it.day_number <= cycleDays }
    def cycleMap = validWorkdays.collectEntries { [(it.day_number): it] }

    // 计算基准日（effect_time的最近前序周一）
    Calendar baseCal = Calendar.getInstance()
    baseCal.setTime(sdf.parse(effect_time))
    int daysToSubtract = (baseCal.get(Calendar.DAY_OF_WEEK) - 2 + 7) % 7
    if (daysToSubtract > 0) {
        baseCal.add(Calendar.DAY_OF_MONTH, -daysToSubtract)
    }
    Date baseDate = baseCal.getTime()

    // 计算日期偏移
    long offsetMillis = checkinCal.getTimeInMillis() - baseDate.getTime()
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    int dayInCycle = (offsetDays % cycleDays) + 1

    // 查找班次配置
    def workdayConfig = cycleMap[dayInCycle]
    if (workdayConfig) {
        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
        if (shift) {
            def shiftData = shift.shift_data
            def workTime = shiftData?.work_times
            // 更新临时参数
            temp.set("shift_data", shiftData)
            temp.set("work_time", workTime)
            temp.set("workday", shiftData ? 1 : 0)
        }
    }
}
```
#### [考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics)的处理逻辑[个人统计(personal)](module/attendance/attendance_statistics/logic/personal)

节点：获取考勤记录
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def emp = logic.param('emp').getReal()

def n_checkin_date_gtandeq = _default.get('n_checkin_date_gtandeq')
def n_checkin_date_ltandeq = _default.get('n_checkin_date_ltandeq')

//获取`考勤记录`实体运行对象
def record_runtime = sys.dataentity('attendance_record')
def record_filter = record_runtime.filter()
record_filter.all()
if (n_checkin_date_gtandeq != null && n_checkin_date_ltandeq != null) {
    record_filter.gte('checkin_date', n_checkin_date_gtandeq)
    record_filter.lte('checkin_date', n_checkin_date_ltandeq)
}
record_filter.eq('member_id', emp.get("id"))
// def record_list = record_filter.select('')


record_filter.setPageable(0,1000,0)
def page = record_filter.fetch()


// 早退分钟数 
def leave_early_minutes = 0
// 迟到时间
def late_time = 0
// 加班时间 
def overtime_time = 0
// 计薪时长
def billable_time = 0
// 实际出勤时长（分钟）
def working_time = 0
// 迟到分钟数
def late_minutes = 0
// 应出勤时长（分钟）
def should_attendance_time = 0
// 加班小时数
def overtime_hours = 0
// 早退时间
def leave_early_time = 0
// 实际出勤时长（小时）
def working_hours = 0
// 应出勤时长（小时）
def should_attendance_hours = 0
// 实际出勤天数
def actual_attendance_days = 0
// 应出勤天数 
def should_attendance_days = 0
// 上班缺卡 
def on_missing = 0
// 下班缺卡 
def off_missing = 0
// 迟到次数 
def late_times = 0
// 早退次数 
def leave_early_times = 0
// 旷工天数 
def absent_days = 0
def map = new HashMap()

if(page != null){
    //循环汇总
    page.each { item ->
        def checkin_date = item.get('checkin_date').toString().substring(0, 10)
        map.put(checkin_date, item)
        leave_early_minutes += item.get("leave_early_minutes")?:0
        late_time += item.get("late_time")?:0
        overtime_time += item.get("overtime_time")?:0
        working_time += item.get("working_time")?:0
        late_minutes += item.get("late_minutes")?:0
        should_attendance_time += item.get("should_attendance_time")?:0
        overtime_hours += item.get("overtime_hours")?:0
        leave_early_time += item.get("leave_early_time")?:0
        working_hours += item.get("working_hours")?:0
        should_attendance_hours += item.get("should_attendance_hours")?:0
        actual_attendance_days += item.get("actual_attendance_days")?:0
        should_attendance_days += item.get("should_attendance_days")?:0
        def details = item.get("details")
        if (details != null) {
            details.each { it ->
                if (it.get("checkin_result") == "ON_MISSING") {
                    on_missing++
                }
                if (it.get("checkin_result") == "OFF_MISSING") {
                    off_missing++
                }
                if (it.get("checkin_result") == "LATE") {
                    late_times++
                }
                if (it.get("checkin_result") == "LEAVE_EARLY") {
                    leave_early_times++
                }
            }
        }
        if (item.get("checkin_result") == "ABSENT") {
            absent_days++
            billable_time += item.get("should_attendance_hours")?:0
        }
    }
    billable_time = should_attendance_time - billable_time
}

emp.set('attendance_data', map)
emp.set('leave_early_minutes', leave_early_minutes)
emp.set('late_time', late_time)
emp.set('overtime_time', overtime_time)
emp.set('billable_time', billable_time)
emp.set('working_time', working_time)
emp.set('late_minutes', late_minutes)
emp.set('should_attendance_time', should_attendance_time)
emp.set('overtime_hours', overtime_hours)
emp.set('leave_early_time', leave_early_time)
emp.set('working_hours', working_hours)
emp.set('should_attendance_hours', should_attendance_hours)
emp.set('actual_attendance_days', actual_attendance_days)
emp.set('should_attendance_days', should_attendance_days)
emp.set('on_missing', on_missing)
emp.set('off_missing', off_missing)
emp.set('late_times', late_times)
emp.set('leave_early_times', leave_early_times)
emp.set('absent_days', absent_days)


//获取`申请`实体运行对象
def applicant_id = emp.get("id");
def attendance_checkin_application_runtime = sys.dataentity('attendance_checkin_application');
def attendance_checkin_application_filter = attendance_checkin_application_runtime.filter();
attendance_checkin_application_filter.all();
if (n_checkin_date_gtandeq != null && n_checkin_date_ltandeq != null) {
    attendance_checkin_application_filter.gte('start_time', n_checkin_date_gtandeq);
    attendance_checkin_application_filter.lte('start_time', n_checkin_date_ltandeq);
}
attendance_checkin_application_filter.eq('applicant_id', applicant_id);
attendance_checkin_application_filter.eq('status', "APPROVED");
def attendance_checkin_application_list = attendance_checkin_application_filter.select('');

// 请假时长
def leave_duration = 0;
// 补卡次数
def reissue = 0;
// 出差天数
def business_trip = 0;
// 外出时长
def go_out_times = 0;
// 年假
def annual_leave = 0;
// 事假
def compassionate_leave = 0;
// 调休假
def vacation_leave = 0;
// 病假
def sick_leave = 0;
// 育儿假
def parental_leave = 0;
// 陪产假
def paternity_leave = 0;
// 婚假
def marriage_holiday = 0;
// 丧假
def funeral_leave = 0;
// 产假
def maternity_leave = 0;
// 申请加班时长(计加班费)
def pay_overtimes = 0
// 申请加班时长(计调休假)
def rest_overtimes = 0

if(attendance_checkin_application_list != null){
    //循环汇总
    attendance_checkin_application_list.each { item ->
        if (item.get("apply_type") == "REISSUE") {
            reissue ++;
        } else if (item.get("apply_type") == "GO_OUT") {
            go_out_times += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "BUSINESS_TRIP") {
            business_trip += item.get("days") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "annual_leave") {
            annual_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "compassionate_leave") {
            compassionate_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "vacation_leave") {
            vacation_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "sick_leave") {
            sick_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "parental_leave") {
            parental_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "paternity_leave") {
            paternity_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "marriage_holiday") {
            marriage_holiday += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "funeral_leave") {
            funeral_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "maternity_leave") {
            maternity_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "OVERTIME" && item.get("overtime_type") == "0") {
            pay_overtimes += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "OVERTIME" && item.get("overtime_type") == "1") {
            rest_overtimes += item.get("hours") ?: 0;
        }
    }
}

emp.set('leave_duration', leave_duration)
emp.set('out_time', go_out_times)
emp.set('make_card_times', reissue)
emp.set('on_business_days', business_trip)
emp.set('annual_leave', annual_leave)
emp.set('compassionate_leave', compassionate_leave)
emp.set('vacation_leave', vacation_leave)
emp.set('sick_leave', sick_leave)
emp.set('parental_leave', parental_leave)
emp.set('paternity_leave', paternity_leave)
emp.set('marriage_holiday', marriage_holiday)
emp.set('funeral_leave', funeral_leave)
emp.set('maternity_leave', maternity_leave)

// 加班时长(计调休假)(小时)
def rest_overtime_time = 0;
// 加班时长(计加班费)(小时)
def pay_overtime_time = 0;

pay_overtime_time = pay_overtimes + overtime_hours
rest_overtime_time = rest_overtimes + overtime_hours

emp.set('rest_overtime_time', rest_overtime_time)
emp.set('pay_overtime_time', pay_overtime_time)
```
#### [考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics)的处理逻辑[信息反查(check_info)](module/attendance/attendance_statistics/logic/check_info)

节点：获取数据明细
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def emp = logic.param('emp').getReal()

def sdf = new java.text.SimpleDateFormat("HH:mm:ss")
def checkin_date = _default.get("checkin_date")

//获取排班
def attendance_schedule_runtime = sys.dataentity('attendance_schedule')
def attendance_schedule_filter = attendance_schedule_runtime.filter()
attendance_schedule_filter.all()
attendance_schedule_filter.eq('member_id', emp.get("id"))
attendance_schedule_filter.custom(" DATE_FORMAT(t1.CHECKIN_DATE, '%Y-%m-%d') = '"+ checkin_date +"'")
def attendance_schedule_list = attendance_schedule_filter.select('')

//规则名称
def rule_name = "";
//班次名称
def shift_name = "";
//获取班次
if (attendance_schedule_list != null) {
    attendance_schedule_list.each { item ->
        def work_times = item.get("work_time")
        if (work_times != null) {
            work_times.each { it ->
                shift_name += it.get("shift_name") + " " + it.get("start_base_time") + "-" + it.get("end_base_time")
            }
        }
        rule_name = item.get("rule_name")
    }
}

emp.set("rule_name", rule_name)
emp.set("shift_name", shift_name)

//获取打卡记录
def clock_runtime = sys.dataentity('attendance_clock_in_record')
def clock_filter = clock_runtime.filter()
clock_filter.all()
clock_filter.eq('member_id', emp.get("id"))
clock_filter.custom(" DATE_FORMAT(t1.CHECKIN_TIME, '%Y-%m-%d') = '"+ checkin_date +"'")
def clock_list = clock_filter.select('')
if (clock_list != null) {
    clock_list.each { item ->
        if (item.get('checkin_time') != null) {
            item.set('clock_checkin_time', sdf.format(item.get('checkin_time')))
        }
    }
    emp.set("clock_list", clock_list)
}

//获取考勤记录
def record_runtime = sys.dataentity('attendance_record')
def details = []
def record_filter = record_runtime.filter()
record_filter.all()
record_filter.eq('member_id', emp.get("id"))
record_filter.custom(" DATE_FORMAT(t1.CHECKIN_DATE, '%Y-%m-%d') = '"+ checkin_date +"'")
record_filter.setPageable(0,1000,0)
def record_list = record_filter.fetch()
if (record_list != null) {
    record_list.each { item ->
        details = item.get('details')
    }
}

if (details != null) {
    details.each { item ->
        if (item.get('detail_index') != null) {
            if (item.get('detail_index').startsWith("end")) {
                if (item.get('should_checkin_time') != null) {
                    item.set('end_base_time', sdf.format(item.get('should_checkin_time')))
                }
            } else {
                if (item.get('should_checkin_time') != null) {
                    item.set('start_base_time', sdf.format(item.get('should_checkin_time')))
                }
            }
        }
        if (item.get('checkin_time') != null) {
            item.set('detail_checkin_time', sdf.format(item.get('checkin_time')))
        }
    }
    details.sort { a, b ->
        def timeA = java.time.LocalTime.parse(sdf.format(a.get('should_checkin_time')))
        def timeB = java.time.LocalTime.parse(sdf.format(b.get('should_checkin_time')))
        timeA <=> timeB
    }
}

emp.set("record_list", details)
```
#### [考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics)的处理逻辑[月度统计(month_report)](module/attendance/attendance_statistics/logic/month_report)

节点：解析搜索条件
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()

if (_default.get("n_member_id_in") != null && _default.get("n_member_id_in") != "") {
    def person_range = _default.get("n_member_id_in")
    def depts = []
    def persons = []
    person_range.each { item ->
        if (item.type == "dept") {
            depts.add(item.id)
        } else {
            persons.add(item.id)
        }
    }
    def deptStr = depts ? depts.join(",") : ""
    def personStr = persons ? persons.join(",") : ""
    if (deptStr != "" && personStr != "") {
        _default.and().or().in('dept_id', deptStr).in('id', personStr)
    } else if (deptStr != "" && personStr == "") {
        _default.in('dept_id', deptStr)
    } else {
        _default.in('id', personStr)
    }
}
```
#### [考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics)的处理逻辑[月度统计(month_report)](module/attendance/attendance_statistics/logic/month_report)

节点：查询考勤记录
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def emp_temp = logic.param('emp_temp').getReal()

def n_checkin_date_gtandeq = _default.get('n_checkin_date_gtandeq')
def n_checkin_date_ltandeq = _default.get('n_checkin_date_ltandeq')

//获取`考勤记录`实体运行对象
def record_runtime = sys.dataentity('attendance_record')
def record_filter = record_runtime.filter()
record_filter.all()
record_filter.eq('member_id', emp_temp.get("id"))
if (n_checkin_date_gtandeq != null && n_checkin_date_ltandeq != null) {
    record_filter.gte('checkin_date', n_checkin_date_gtandeq)
    record_filter.lte('checkin_date', n_checkin_date_ltandeq)
}
// def page = record_filter.select('')

record_filter.setPageable(0,1000,0)
def page = record_filter.fetch()

// 早退分钟数 
def leave_early_minutes = 0
// 迟到时间
def late_time = 0
// 加班时间 
def overtime_time = 0
// 计薪时长
def billable_time = 0
// 工作时长
def working_time = 0
// 迟到分钟数
def late_minutes = 0
// 应出勤时长
def should_attendance_time = 0
// 加班小时数
def overtime_hours = 0
// 早退时间
def leave_early_time = 0
// 实际出勤时长（小时）
def working_hours = 0
// 实际出勤天数
def actual_attendance_days = 0
// 应出勤天数 
def should_attendance_days = 0
// 上班缺卡 
def on_missing = 0
// 下班缺卡 
def off_missing = 0
// 迟到次数 
def late_times = 0
// 早退次数 
def leave_early_times = 0
// 旷工天数 
def absent_days = 0
def map = new HashMap()

if(page != null){
    //循环汇总
    page.each { item ->
        def checkin_date = item.get('checkin_date').toString().substring(0, 10)
        map.put(checkin_date, item)
        leave_early_minutes += item.get("leave_early_minutes")?:0
        late_time += item.get("late_time")?:0
        overtime_time += item.get("overtime_time")?:0
        working_time += item.get("working_time")?:0
        late_minutes += item.get("late_minutes")?:0
        should_attendance_time += item.get("should_attendance_hours")?:0
        overtime_hours += item.get("overtime_hours")?:0
        leave_early_time += item.get("leave_early_time")?:0
        working_hours += item.get("working_hours")?:0
        actual_attendance_days += item.get("actual_attendance_days")?:0
        should_attendance_days += item.get("should_attendance_days")?:0
        def details = item.get("details")
        if (details != null) {
            details.each { it ->
                if (it.get("checkin_result") == "ON_MISSING") {
                    on_missing++
                }
                if (it.get("checkin_result") == "OFF_MISSING") {
                    off_missing++
                }
                if (it.get("checkin_result") == "LATE") {
                    late_times++
                }
                if (it.get("checkin_result") == "LEAVE_EARLY") {
                    leave_early_times++
                }
            }
        }
        if (item.get("checkin_result") == "ABSENT") {
            absent_days++
            billable_time += item.get("should_attendance_hours")?:0
        }
    }
    billable_time = should_attendance_time - billable_time
}

emp_temp.set('dept_name', emp_temp.get("department_name"))
emp_temp.set('attendance_data', map)
emp_temp.set('member_name', emp_temp.get("name"))
emp_temp.set('leave_early_minutes', leave_early_minutes)
emp_temp.set('late_time', late_time)
emp_temp.set('overtime_time', overtime_time)
emp_temp.set('billable_time', billable_time)
emp_temp.set('working_time', working_time)
emp_temp.set('late_minutes', late_minutes)
emp_temp.set('should_attendance_time', should_attendance_time)
emp_temp.set('overtime_hours', overtime_hours)
emp_temp.set('leave_early_time', leave_early_time)
emp_temp.set('working_hours', working_hours)
emp_temp.set('actual_attendance_days', actual_attendance_days)
emp_temp.set('should_attendance_days', should_attendance_days)
emp_temp.set('on_missing', on_missing)
emp_temp.set('off_missing', off_missing)
emp_temp.set('late_times', late_times)
emp_temp.set('leave_early_times', leave_early_times)
emp_temp.set('absent_days', absent_days)

//获取`申请`实体运行对象
def applicant_id = emp_temp.get("id");
def attendance_checkin_application_runtime = sys.dataentity('attendance_checkin_application');
def attendance_checkin_application_filter = attendance_checkin_application_runtime.filter();
attendance_checkin_application_filter.all();
if (n_checkin_date_gtandeq != null && n_checkin_date_ltandeq != null) {
    attendance_checkin_application_filter.gte('start_time', n_checkin_date_gtandeq);
    attendance_checkin_application_filter.lte('start_time', n_checkin_date_ltandeq);
}
attendance_checkin_application_filter.eq('status', "APPROVED");
attendance_checkin_application_filter.eq('applicant_id', applicant_id);
def attendance_checkin_application_list = attendance_checkin_application_filter.select('');

// 请假时长
def leave_duration = 0;
// 补卡次数
def reissue = 0;
// 出差天数
def business_trip = 0;
// 外出时长
def go_out_times = 0;
// 年假
def annual_leave = 0;
// 事假
def compassionate_leave = 0;
// 调休假
def vacation_leave = 0;
// 病假
def sick_leave = 0;
// 育儿假
def parental_leave = 0;
// 陪产假
def paternity_leave = 0;
// 婚假
def marriage_holiday = 0;
// 丧假
def funeral_leave = 0;
// 产假
def maternity_leave = 0;
// 申请加班时长(计加班费)
def pay_overtimes = 0
// 申请加班时长(计调休假)
def rest_overtimes = 0

if(attendance_checkin_application_list != null){
    //循环汇总
    attendance_checkin_application_list.each { item ->
        if (item.get("apply_type") == "REISSUE") {
            reissue ++;
        } else if (item.get("apply_type") == "GO_OUT") {
            go_out_times += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "BUSINESS_TRIP") {
            business_trip += item.get("days") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "annual_leave") {
            annual_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "compassionate_leave") {
            compassionate_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "vacation_leave") {
            vacation_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "sick_leave") {
            sick_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "parental_leave") {
            parental_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "paternity_leave") {
            paternity_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "marriage_holiday") {
            marriage_holiday += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "funeral_leave") {
            funeral_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "maternity_leave") {
            maternity_leave += item.get("hours") ?: 0;
            leave_duration += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "OVERTIME" && item.get("overtime_type") == "0") {
            pay_overtimes += item.get("hours") ?: 0;
        } else if (item.get("apply_type") == "OVERTIME" && item.get("overtime_type") == "1") {
            rest_overtimes += item.get("hours") ?: 0;
        }
    }
}

emp_temp.set('leave_duration', leave_duration)
emp_temp.set('out_time', go_out_times)
emp_temp.set('make_card_times', reissue)
emp_temp.set('on_business_days', business_trip)
emp_temp.set('annual_leave', annual_leave)
emp_temp.set('compassionate_leave', compassionate_leave)
emp_temp.set('vacation_leave', vacation_leave)
emp_temp.set('sick_leave', sick_leave)
emp_temp.set('parental_leave', parental_leave)
emp_temp.set('paternity_leave', paternity_leave)
emp_temp.set('marriage_holiday', marriage_holiday)
emp_temp.set('funeral_leave', funeral_leave)
emp_temp.set('maternity_leave', maternity_leave)

// 加班时长(计调休假)(小时)
def rest_overtime_time = 0;
// 加班时长(计加班费)(小时)
def pay_overtime_time = 0;

pay_overtime_time = pay_overtimes + overtime_hours
rest_overtime_time = rest_overtimes + overtime_hours

emp_temp.set('rest_overtime_time', rest_overtime_time)
emp_temp.set('pay_overtime_time', pay_overtime_time)
```
#### [员工信息(EMPLOYEE)](module/employee_management/employee)的处理逻辑[获取员工信息(特定搜索条件)(employee)](module/employee_management/employee/logic/employee)

节点：解析搜索条件
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def person_range = _default.get("n_member_id_in") 
if (person_range!= null && person_range != "") {
    def depts = []
    def persons = []
    person_range.each { item ->
        if (item.type == "dept") {
            depts.add(item.id)
        } else {
            persons.add(item.id)
        }
    }
    def deptStr = depts ? depts.join(",") : ""
    def personStr = persons ? persons.join(",") : ""
    if (deptStr != "" && personStr != "") {
        _default.and().or().in('dept_id', deptStr).in('id', personStr)
    } else if (deptStr != "" && personStr == "") {
        _default.in('dept_id', deptStr)
    } else {
        _default.in('id', personStr)
    }
}
```
#### [员工信息(EMPLOYEE)](module/employee_management/employee)的处理逻辑[获取员工信息(特定搜索条件)(employee)](module/employee_management/employee/logic/employee)

节点：获取时间范围搜索条件
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def temp = logic.param('temp').getReal()

def n_checkin_date_gtandeq = _default.get('n_checkin_date_gtandeq')
def n_checkin_date_ltandeq = _default.get('n_checkin_date_ltandeq')

if (n_checkin_date_gtandeq != null && n_checkin_date_ltandeq != null) {
    temp.set("n_checkin_date_gtandeq", n_checkin_date_gtandeq)
    temp.set("n_checkin_date_ltandeq", n_checkin_date_ltandeq)
}
```
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[其他工时计算(calcOther)](module/hr/hr_attendance/logic/calcOther)

节点：有效加班时间
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def overtime_status = _default.get("overtime_status")
if(_default.get("check_out")){
    if(overtime_status == "to_approve"){
        _default.set("validated_overtime_hours",_default.get("overtime_hours"))
    }
    if(overtime_status == "refused"){
        _default.set("validated_overtime_hours",0)
    }
    def expected_hours = _default.get("worked_hours")?:0 - _default.get("overtime_hours")?:0
    _default.set("expected_hours",expected_hours)
}else {
    _default.set("validated_overtime_hours",0)
    _default.set("expected_hours",0)
}

```
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[批量审批(batchApproval)](module/hr/hr_attendance/logic/batchApproval)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[JavaScript]</b></p>

```javascript
null
```
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[更新/创建加班记录(changeOverTime)](module/hr/hr_attendance/logic/changeOverTime)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def check_in = _default.get("check_in")
def startOfDayFormat = new java.text.SimpleDateFormat("yyyy-MM-dd 00:00:00")
def startOfDay = startOfDayFormat.format(check_in) 
_default.set("dateOnly", startOfDay)
if(!_default.get("overtime_hours")){
    _default.set("overtime_hours", 0)
}
```
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[自助终端考勤(kiosk_checkin)](module/hr/hr_attendance/logic/kiosk_checkin)

节点：构造出勤
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def new_attendance = logic.param('new_attendance').getReal()
def emp = logic.param('emp').getReal()
def now = java.time.LocalDateTime.now()
def formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

new_attendance.set("check_in",now.format(formatter))
new_attendance.set("in_mode","kiosk")
new_attendance.set("employee_id",emp.get("id"))
new_attendance.set("employee_name",emp.get("name"))
new_attendance.set("overtime_status","to_approve")
```
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[自助终端考勤(kiosk_checkin)](module/hr/hr_attendance/logic/kiosk_checkin)

节点：构造出勤
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def last = logic.param('last').getReal()
def now = java.time.LocalDateTime.now()
def formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

last.set("check_out", now.format(formatter))
last.set("out_mode", "kiosk")
last.set("overtime_status", "to_approve")
```
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[自助终端考勤(kiosk_checkin)](module/hr/hr_attendance/logic/kiosk_checkin)

节点：今日时数
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def new_attendance = logic.param('new_attendance').getReal()
def res = logic.param('hours_previously_today').getReal()
def hours_previously_today = res.get("hours_previously_today") as BigDecimal

new_attendance.set("hours_previously_today",hours_previously_today.setScale(2, BigDecimal.ROUND_HALF_UP))
new_attendance.set("hours_today",hours_previously_today.setScale(2, BigDecimal.ROUND_HALF_UP))
new_attendance.set("attendance_state","checked_in")

// 签到时间处理
def check_in = new_attendance.get("check_in")
def inputFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
def outputFormat = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒")
outputFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"))

// 转换并存储结果
def formattedCheckOut = outputFormat.format(inputFormat.parse(check_in.toString()))
new_attendance.set("check_in_display", formattedCheckOut)
```
#### [出勤(HR_ATTENDANCE)](module/hr/hr_attendance)的处理逻辑[自助终端考勤(kiosk_checkin)](module/hr/hr_attendance/logic/kiosk_checkin)

节点：今日时数
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def last = logic.param('last').getReal()
def res = logic.param('hours_previously_today').getReal()
def hours_previously_today = res.get("hours_previously_today") as BigDecimal

def worked_hours = last.get("worked_hours") as BigDecimal

// 计算并保留两位小数
def hours_today = (hours_previously_today + worked_hours).setScale(2, BigDecimal.ROUND_HALF_UP)

last.set("hours_today", hours_today)
last.set("hours_previously_today", hours_previously_today.setScale(2, BigDecimal.ROUND_HALF_UP))
last.set("attendance_state", "checked_out")

// 签退时间处理
def check_out = last.get("check_out")
def inputFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
def outputFormat = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒")
outputFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"))

// 转换并存储结果
def formattedCheckOut = outputFormat.format(inputFormat.parse(check_out.toString()))
last.set("check_out_display", formattedCheckOut)
```
#### [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)的处理逻辑[补充草稿(fillDraft)](module/resource/resource_calendar/logic/fillDraft)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()

// 基础字段默认值
_default.set("name", "Default Working Hours")
_default.set("active", 1)
// _default.set("company_id", logic.param('Current Company').getReal().id)
_default.set("tz", java.util.TimeZone.getDefault().ID)
_default.set("flexible_hours", 1)
_default.set("full_time_required_hours", 8.0)

// 处理工作时间段
def company = _default.get("company")
if (company && company.resource_calendar_id &&
    !company.resource_calendar_id.two_weeks_calendar) {

    _default.set("attendance_ids", company.resource_calendar_id.attendance_ids.collect { att ->
        Map entry = new LinkedHashMap<String, Object>();
        entry.put("name", att.name)
        entry.put("dayofweek", att.dayofweek)
        entry.put("hour_from", att.hour_from)
        entry.put("hour_to", att.hour_to)
        entry.put("day_period", att.day_period)
        entry.put("date_from", att.date_from)
        entry.put("date_to", att.date_to)
        return entry
    })
} else {
    // 生成默认工作时间（周一到周五 8-17点）
    _default.set("attendance_ids", (0..4).collect { day ->
        [
            ["Mon","Tue","Wed","Thu","Fri"][day] + " Morning",
            ["Mon","Tue","Wed","Thu","Fri"][day] + " Lunch",
            ["Mon","Tue","Wed","Thu","Fri"][day] + " Afternoon"
        ].collect { name ->
            Map entry = new LinkedHashMap<String, Object>();
            entry.put("name", name)
            entry.put("dayofweek", day.toString())
            entry.put("hour_from", name.contains("Morning") ? 8 : name.contains("Lunch") ? 12 : 13)
            entry.put("hour_to", name.contains("Morning") ? 12 : name.contains("Lunch") ? 13 : 17)
            entry.put("day_period", name.contains("Morning") ? "morning" : name.contains("Lunch") ? "lunch" : "afternoon")
            return entry
    }
    }.flatten())
}
// 处理假期字段
_default.set("leave_ids", [])
_default.set("global_leave_ids", [])

// 时区偏移计算
def tz = java.time.ZoneId.of(_default.get("tz"))
_default.set("tz_offset", tz.rules.getOffset(java.time.Instant.now()).toString())
```
#### [用户对象映射(USER_OBJECT)](module/employee_management/user_object)的处理逻辑[我的部门(my_dept)](module/employee_management/user_object/logic/my_dept)

节点：执行脚本代码
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




