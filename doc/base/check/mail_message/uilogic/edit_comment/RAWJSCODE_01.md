<p class="panel-title"><b>执行代码</b></p>

```javascript
// 获取目标面板项
const panelItem = view.layoutPanel.findPanelItemByName("message_panel");
if (panelItem) {
  // 切换可见状态
  panelItem.state.visible =true;
}
```
