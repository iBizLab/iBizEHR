<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def defaultObj = logic.param('default').getReal();
def sqlTimestamp = new java.sql.Timestamp(System.currentTimeMillis());

defaultObj.set('date_done',sqlTimestamp);
defaultObj.set('active',0);

 println("归档defaultObj"+defaultObj);
```
