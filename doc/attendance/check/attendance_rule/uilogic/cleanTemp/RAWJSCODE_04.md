<p class="panel-title"><b>执行代码</b></p>

```javascript
var druiPart5 = view.layoutPanel.panelItems.form.control.formDruipart.find(item => item.model.codeName ==="druipart5")

// 刷新druipart5关系界面
if (druiPart5) {
    druiPart5?.embedView?.callUIAction('Refresh')
}
```
