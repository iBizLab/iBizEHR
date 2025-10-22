
## 使用脚本的处理逻辑节点<sup class="footnote-symbol"> <font color=orange>[12]</font></sup>

#### [讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel)的处理逻辑[添加邀请成员(add_members)](module/discuss/discuss_channel/logic/add_members)

节点：提取标识构造对象列表
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
    // 获取默认参数中的members字段值
    def src = logic.param("Default").getReal()
    def membersStr = src.get("members")
    
    // 解析ID列表
    def ids = membersStr?.split(',') ?: []
    
    // 构造实体对象列表
    def res_partners = ids.collect { id ->
        // 获取RES_PARTNER实体运行时对象
        def dePartner = sys.dataentity("res_partner")
        // 创建新实体对象
        def partner = dePartner.entity()
        // 设置ID属性（假设RES_PARTNER主键为id）
        partner.set("id", id.trim())
        partner
    }
    
    // 绑定到目标参数
    logic.param("res_partners").getReal().addAll(res_partners)
```
#### [员工(HR_EMPLOYEE)](module/hr/hr_employee)的处理逻辑[生成徽标 ID(generate_random_barcode)](module/hr/hr_employee/logic/generate_random_barcode)

节点：生成徽标ID
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def defaultEntity = logic.param('default').getReal();
def  random = new Random();
def  randomDigits = String.format("%09d", random.nextInt(1_000_000_000));
def  barCodeString = "041" + randomDigits;
defaultEntity.set("barcode",barCodeString);

```
#### [活动(MAIL_ACTIVITY)](module/mail/mail_activity)的处理逻辑[完成活动(action_done)](module/mail/mail_activity/logic/action_done)

节点：生成message
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//Groovy
def defaultObj = logic.param('default').getReal();
println("defaultObj数据"+defaultObj);
def mailMessageObj  = logic.param('mail_message').getReal();
// 从参数对象获取model属性值
def modelName = defaultObj.get("srfmodelname")?: defaultObj.get("res_model");
// 通过系统运行时获取实体运行时对象
def deRuntime = sys.dataentity(modelName)
if(deRuntime == null){
    throw new Exception(String.format("消息实体异常"));
}

def messagePostMethod = "message_post_with_source"
Object[] args = [mailMessageObj];
deRuntime.executeAction(messagePostMethod,null,args)


```
#### [活动(MAIL_ACTIVITY)](module/mail/mail_activity)的处理逻辑[完成活动(action_done)](module/mail/mail_activity/logic/action_done)

节点：填充message数据
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def defaultObj = logic.param('default').getReal();
def mailMessageObj  = logic.param('mail_message').getReal();

def activityTypeName=defaultObj.get('activity_type_name');
def activityTypeId=defaultObj.get('activity_type_id');
def userName=defaultObj.get('user_name');
def userId=defaultObj.get('user_id');
def srfuserid=defaultObj.get('srfuserid');
def summary=defaultObj.get('summary');
def note=defaultObj.get('note');

//反馈内容
def feedBack=defaultObj.get('feedback');
//当前登录用户id
def srfPartnerId=defaultObj.get('srfpartnerid');

// def mailActivityMxin=defaultObj.get('mail_activity_mixin');
// def srfModelName=defaultObj.get('srfmodelname');
def mailActivityMxin=defaultObj.get('mail_activity_mixin')?: defaultObj.get("res_id");
def srfModelName=defaultObj.get('srfmodelname')?: defaultObj.get("res_model");


def displayAssignee = (userId != srfuserid);

def body = activityTypeName + '\t 完成' + 
    (displayAssignee ? '（最初分配给 ' + userName + '）' : '') +
    (summary ? ':' + summary : '');

def notePart = note ? '\t\n原始备注:\n' + note: '';
notePart = notePart?.replaceAll(/<\/?p>/, '') ?: ''
def feedbackPart = feedBack ? '\t\n反馈:\n' + feedBack : '';

body += notePart + feedbackPart;    

mailMessageObj.set('body',body);
mailMessageObj.set('author_id',srfPartnerId);
mailMessageObj.set('mail_activity_type_id',activityTypeId);
mailMessageObj.set('res_id',mailActivityMxin);
mailMessageObj.set('model',srfModelName);

  
 println("mailMessageObj"+mailMessageObj);





```
#### [活动(MAIL_ACTIVITY)](module/mail/mail_activity)的处理逻辑[完成活动(action_done)](module/mail/mail_activity/logic/action_done)

节点：准备归档参数
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def defaultObj = logic.param('default').getReal();
def sqlTimestamp = new java.sql.Timestamp(System.currentTimeMillis());

defaultObj.set('date_done',sqlTimestamp);
defaultObj.set('active',0);

 println("归档defaultObj"+defaultObj);
```
#### [活动(MAIL_ACTIVITY)](module/mail/mail_activity)的处理逻辑[延迟活动(action_snooze)](module/mail/mail_activity/logic/action_snooze)

节点：准备延迟活动参数
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def defaultObj = logic.param('default').getReal();
if(defaultObj.get('active') == 1){
      def currentDeadline=defaultObj.get('date_deadline');
      def curTime = net.ibizsys.runtime.util.DateUtils.getCurTime();
      java.time.LocalDate today = curTime.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
      def deadLineTime = new java.sql.Timestamp(net.ibizsys.runtime.util.DateUtils.getTime(currentDeadline));
      java.time.LocalDate deadLineDate = deadLineTime.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
      def maxDay= [deadLineDate, today].max();
      def actualDeadline = maxDay.plus(7, java.time.temporal.ChronoUnit.DAYS);
      defaultObj.set('date_deadline',  actualDeadline);
}
```
#### [活动Mixin(MAIL_ACTIVITY_MIXIN)](module/mail/mail_activity_mixin)的处理逻辑[处理活动状态(process_activities)](module/mail/mail_activity_mixin/logic/process_activities)

节点：执行脚本代码
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
#### [活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule)的处理逻辑[安排(action_schedule_activities)](module/mail/mail_activity_schedule/logic/action_schedule_activities)

节点：获取活动re_name
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def mailActivity = logic.param('mail_activity').getReal();
def entityModelName=mailActivity.get("res_model");
def entityId=mailActivity.get("res_id");
def entityRuntime = sys.dataentity(entityModelName);
def entityObj = entityRuntime.get(entityId);
mailActivity.set('res_name',entityObj.get('name'));

```
#### [活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule)的处理逻辑[安排并标记完成(schedule_activities_done)](module/mail/mail_activity_schedule/logic/schedule_activities_done)

节点：获取活动re_name
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def mailActivity = logic.param('mail_activity').getReal();
def entityModelName=mailActivity.get("res_model");
def entityId=mailActivity.get("res_id");
def entityRuntime = sys.dataentity(entityModelName);
def entityObj = entityRuntime.get(entityId);
mailActivity.set('res_name',entityObj.get('name'));

```
#### [活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)的处理逻辑[获取到期日期(get_date_deadline)](module/mail/mail_activity_type/logic/get_date_deadline)

节点：生成到期日期
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def defaultObj = logic.param('default').getReal();
def originalDefault = logic.param('original_default').getReal();
def delayFrom=defaultObj.get('delay_from');
def activityPreviousDeadline=originalDefault.get('activity_previous_deadline');
def delayUnit=defaultObj.get('delay_unit');
def delayCount=defaultObj.get('delay_count');
def chronoUnit;
def actualDeadline;

if(delayUnit == 'days' ) {
    chronoUnit = java.time.temporal.ChronoUnit.DAYS
} 
else if(delayUnit == 'weeks' ) {
    chronoUnit = java.time.temporal.ChronoUnit.WEEKS
}
else if(delayUnit == 'months' ) {
    chronoUnit = java.time.temporal.ChronoUnit.MONTHS
}
else if(delayUnit == 'years' ) {
    chronoUnit = java.time.temporal.ChronoUnit.YEARS
}

if(delayFrom == 'previous_activity' && activityPreviousDeadline){
    def deadLineTime = new java.sql.Timestamp(net.ibizsys.runtime.util.DateUtils.getTime(activityPreviousDeadline));
    java.time.LocalDate deadLineDate = deadLineTime.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    actualDeadline = deadLineDate.plus(delayCount, chronoUnit);
}else{
    def curTime = net.ibizsys.runtime.util.DateUtils.getCurTime();
    java.time.LocalDate localDate = curTime.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    actualDeadline = localDate.plus(delayCount, chronoUnit);
}

defaultObj.set('actual_deadline',actualDeadline);
println("actual_deadline值："+actualDeadline);


```
#### [EMail模板(MAIL_TEMPLATE)](module/mail/mail_template)的处理逻辑[刷新消息模板缓存(refresh_cache)](module/mail/mail_template/logic/refresh_cache)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def defaultParam = logic.param("Default")
def templId = defaultParam.getReal()?.template_fs

// 通过系统运行时获取消息模板运行时对象
def templRuntime = sys.getSysMsgTemplRuntime(templId,true)

// 非空判断并执行重置操作
if(templRuntime != null) {
    templRuntime.reset()
}
```
#### [资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)的处理逻辑[填充资源工作时间数据(fill_data)](module/resource/resource_calendar/logic/fill_data)

节点：执行脚本代码
<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
// 获取参数运行时对象
def  defaultParam = logic.param("Default")
// 获取参数实际值并打印
println("Default参数值：" + defaultParam.getReal())

```




