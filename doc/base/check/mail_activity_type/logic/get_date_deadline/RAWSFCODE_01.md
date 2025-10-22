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
