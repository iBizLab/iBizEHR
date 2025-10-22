<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _shift = logic.param('shift').getReal()

logic.param('shift').getDataEntityRuntime().fillEntityKeyValue(_shift)

def _scope = logic.param('scope').getReal()

logic.param('scope').getDataEntityRuntime().fillEntityKeyValue(_scope)
_scope.shift_id = _shift.id

```
