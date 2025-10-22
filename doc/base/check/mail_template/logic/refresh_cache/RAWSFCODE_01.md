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
