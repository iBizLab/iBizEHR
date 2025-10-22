
## 使用脚本的界面逻辑节点<sup class="footnote-symbol"> <font color=orange>[10]</font></sup>

#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[自动保存(auto_save)](module/attendance/attendance_rule/uilogic/auto_save)

节点：保存并关闭视图
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
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[清空临时数据(cleanTemp)](module/attendance/attendance_rule/uilogic/cleanTemp)

节点：清空临时数据
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
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[清空临时数据(cleanTemp)](module/attendance/attendance_rule/uilogic/cleanTemp)

节点：添加临时数据shifts
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
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[清空临时数据(cleanTemp)](module/attendance/attendance_rule/uilogic/cleanTemp)

节点：填充自由班上下班时间
<p class="panel-title"><b>执行代码</b></p>

```javascript
    var shifts = uiLogic.default.shifts;
    var scopes = shifts[0].scopes;
    var _default = uiLogic.default;
    _default.free_start = scopes[0].start_base_time;
    _default.free_end = scopes[0].end_base_time;
    var form = view.layoutPanel.panelItems.form;
    form.control.state.data.free_start  = scopes[0].start_base_time;
    form.control.state.data.free_end  = scopes[0].end_base_time;

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[清空临时数据(cleanTemp)](module/attendance/attendance_rule/uilogic/cleanTemp)

节点：刷新班次关系页
<p class="panel-title"><b>执行代码</b></p>

```javascript
var druipart1 = view.layoutPanel.panelItems.form.control.formDruipart.find(item => item.model.codeName ==="druipart1")

// 刷新druipart1关系界面
if (druipart1) {
    druipart1?.embedView?.callUIAction('Refresh')
}

```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[清空临时数据(cleanTemp)](module/attendance/attendance_rule/uilogic/cleanTemp)

节点：注入脚本代码
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
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[清空临时数据(cleanTemp)](module/attendance/attendance_rule/uilogic/cleanTemp)

节点：刷新大小周关系页表格
<p class="panel-title"><b>执行代码</b></p>

```javascript
var druipart6 = view.layoutPanel.panelItems.form.control.formDruipart.find(item => item.model.codeName ==="druipart6")

// 刷新druipart6关系界面
if (druipart6) {
    druipart6?.embedView?.callUIAction('Refresh')
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[清空临时数据(cleanTemp)](module/attendance/attendance_rule/uilogic/cleanTemp)

节点：刷新工作日关系页表格
<p class="panel-title"><b>执行代码</b></p>

```javascript
var druipart9 = view.layoutPanel.panelItems.form.control.formDruipart.find(item => item.model.codeName ==="druipart9")

// 刷新druipart9关系界面
if (druipart9) {
    druipart9?.embedView?.callUIAction('Refresh')
}

var druipart13 = view.layoutPanel.panelItems.form.control.formDruipart.find(item => item.model.codeName ==="druipart13")

// 刷新druipart13关系界面
if (druipart13) {
    druipart13?.embedView?.callUIAction('Refresh')
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[清空临时数据(cleanTemp)](module/attendance/attendance_rule/uilogic/cleanTemp)

节点：刷新工作日关系页表格
<p class="panel-title"><b>执行代码</b></p>

```javascript
var druipart8 = view.layoutPanel.panelItems.form.control.formDruipart.find(item => item.model.codeName ==="druipart8")

// 刷新druipart8关系界面
if (druipart8) {
    druipart8?.embedView?.callUIAction('Refresh')
}
```
#### [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)的处理逻辑[清空临时数据(cleanTemp)](module/attendance/attendance_rule/uilogic/cleanTemp)

节点：刷新工作日关系页表格
<p class="panel-title"><b>执行代码</b></p>

```javascript
var druiPart5 = view.layoutPanel.panelItems.form.control.formDruipart.find(item => item.model.codeName ==="druipart5")

// 刷新druipart5关系界面
if (druiPart5) {
    druiPart5?.embedView?.callUIAction('Refresh')
}
```




