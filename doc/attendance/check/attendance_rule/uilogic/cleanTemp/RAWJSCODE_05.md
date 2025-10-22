<p class="panel-title"><b>执行代码</b></p>

```javascript
var druipart6 = view.layoutPanel.panelItems.form.control.formDruipart.find(item => item.model.codeName ==="druipart6")

// 刷新druipart6关系界面
if (druipart6) {
    druipart6?.embedView?.callUIAction('Refresh')
}
```
