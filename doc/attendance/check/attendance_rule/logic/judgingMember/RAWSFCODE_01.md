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
