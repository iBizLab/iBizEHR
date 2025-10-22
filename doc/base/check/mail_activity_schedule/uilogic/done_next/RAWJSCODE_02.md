<p class="panel-title"><b>执行代码</b></p>

```javascript
var formCtrl = view.getCtrl("FORM", "form");
if(formCtrl){
    formCtrl.state.modified=false;
}
view.closeView({ ok: true, data: [] });
```
