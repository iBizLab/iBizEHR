<p class="panel-title"><b>执行代码</b></p>

```javascript
const active_tab = uiLogic.default.srfactivetab;
if(active_tab){
    view.layoutPanel.panelItems.form.control.details.tabpanel1.state.activeTab = 'tabpanel1_'+active_tab;
}

```
