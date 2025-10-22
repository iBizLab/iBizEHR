<p class="panel-title"><b>执行代码</b></p>

```javascript
var druipart8 = view.layoutPanel.panelItems.form.control.formDruipart.find(item => item.model.codeName ==="druipart8")

// 刷新druipart8关系界面
if (druipart8) {
    druipart8?.embedView?.callUIAction('Refresh')
}
```
