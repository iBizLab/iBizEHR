<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def mailActivity = logic.param('mail_activity').getReal();
def entityModelName=mailActivity.get("res_model");
def entityId=mailActivity.get("res_id");
def entityRuntime = sys.dataentity(entityModelName);
def entityObj = entityRuntime.get(entityId);
mailActivity.set('res_name',entityObj.get('name'));

```
