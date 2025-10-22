<p class="panel-title"><b>执行代码</b></p>

```javascript
var workdays = uiLogic.default.workdays;
for (var i = 0; i < workdays.length; i++) {
    ibiz.hub.getApp(context.srfappid).deService.exec(
        'checkinweb.workday',
        'CreateTemp',
        context,
        uiLogic.default.workdays[i],
    );
}
```
