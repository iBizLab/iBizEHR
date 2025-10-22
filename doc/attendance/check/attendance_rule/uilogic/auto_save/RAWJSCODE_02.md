<p class="panel-title"><b>执行代码</b></p>

```javascript
console.log(uiLogic.form.data.$origin);
const _data = uiLogic.form.data.$origin;

_data.effect_time = uiLogic.default.effect_time
_data.effect_date = uiLogic.default.effect_date
// const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
// const deService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
// await deService.exec(
//     'Save',
//     context,
//     _data,
//     params,
// );

const formC =  uiLogic.form;
console.log("自动保存"+formC)
if (formC) {
    formC.isDirty = false;
    await formC.save({ silent: true });
    context.allowClose = true;
    // const isChange = formC.state.modified;
    // if (isChange && context.allowClose == null) {
    //     if (formC) {
    //         await formC.save({ silent: true });
    //         context.allowClose = true;
    //     }
    // }
}

view.state.isLoading = false;
view.closeView();
```
