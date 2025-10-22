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
