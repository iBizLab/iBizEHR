## compute_deadline_day <!-- {docsify-ignore-all} -->

   

### 逻辑处理脚本

```
//Groovy
def curTime = net.ibizsys.runtime.util.DateUtils.getCurTime();
if(entity.get("date_deadline"))
{
    def deadlineTime = new java.sql.Timestamp(net.ibizsys.runtime.util.DateUtils.getTime(entity.get("date_deadline")));
    java.time.LocalDate curdate = curTime.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    java.time.LocalDate deadlinedate = deadlineTime.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    long daysBetween =  java.time.temporal.ChronoUnit.DAYS.between(curdate, deadlinedate);
    return daysBetween;
}
```
