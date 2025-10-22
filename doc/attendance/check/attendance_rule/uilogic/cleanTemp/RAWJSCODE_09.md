<p class="panel-title"><b>执行代码</b></p>

```javascript
var druipart1 = view.layoutPanel.panelItems.form.control.formDruipart.find(item => item.model.codeName ==="druipart1")

// 刷新druipart1关系界面
if (druipart1) {
    druipart1?.embedView?.callUIAction('Refresh')
}

```
