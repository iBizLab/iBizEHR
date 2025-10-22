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
