<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def temp = logic.param('temp').getReal()

def n_checkin_date_gtandeq = _default.get('n_checkin_date_gtandeq')
def n_checkin_date_ltandeq = _default.get('n_checkin_date_ltandeq')

if (n_checkin_date_gtandeq != null && n_checkin_date_ltandeq != null) {
    temp.set("n_checkin_date_gtandeq", n_checkin_date_gtandeq)
    temp.set("n_checkin_date_ltandeq", n_checkin_date_ltandeq)
}
```
