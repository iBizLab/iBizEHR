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
