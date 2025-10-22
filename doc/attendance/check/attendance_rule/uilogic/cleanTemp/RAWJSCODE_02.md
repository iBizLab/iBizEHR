<p class="panel-title"><b>执行代码</b></p>

```javascript
var shifts = uiLogic.default.shifts;
for (var i = 0; i < shifts.length; i++) {
        await ibiz.hub.getApp(context.srfappid).deService.exec(
                'checkinweb.shift',
                'CreateTemp',
                context,
                shifts[i]
                );
}
```
