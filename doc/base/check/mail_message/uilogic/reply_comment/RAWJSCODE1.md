<p class="panel-title"><b>执行代码</b></p>

```javascript
const _app = ibiz.hub.getApp(context.srfappid);
_app.codeList.get('SysOperator', context, params).then(items => {
	const create_uid = uiLogic.default.create_uid;
	const findItem = items.find(item => item.value == create_uid);
	const name = findItem ? findItem.text : create_uid;
	const content = uiLogic.default.body;
	uiLogic.comment.setReply({name, content});
	uiLogic.comment.toggleCollapse(true);
})
```
