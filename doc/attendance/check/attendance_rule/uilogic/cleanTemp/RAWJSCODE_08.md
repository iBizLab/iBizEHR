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
