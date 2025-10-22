<p class="panel-title"><b>执行代码</b></p>

```javascript
return (async function () {
        var _default = uiLogic.default;
        _default.shifts = null;
        _default.workdays = null;
        // _default.workday = "1,2,3,4,5";

        const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
        const service = await serviceUtil.getService(context, 'checkinweb.shift');

        const list = service.local.getList();
        if (list != null) {
            for (const shift of list) {
                //遍历shift临时数据删除
                service.local.delete(context, shift.id);
                const scopeService = await serviceUtil.getService(context, 'checkinweb.scope');
                const scopes = scopeService.local.getList();
                // 遍历scope临时数据删除
                for (const s of scopes) {
                    if (s.shift_id == shift.id) {
                        scopeService.local.delete(context, s.id);
                    }
                }
            }
        }
        //遍历workday临时数据删除
        const workdayService = await serviceUtil.getService(context, 'checkinweb.workday');
        const workdays = workdayService.local.getList();
        if (workdays != null) {
            for (const workday of workdays) {
                workdayService.local.delete(context, workday.id);
            }
        }

    }
)();
```
