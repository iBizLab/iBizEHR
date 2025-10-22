<p class="panel-title"><b>执行代码</b></p>

```javascript
// 创建新上下文对象并拷贝原始context内容
const newcontext = { ...context };
newcontext.srfsessionid="attachment_session";
// 获取ir_attachment实体服务
const _app = ibiz.hub.getApp(context.srfappid);
const appName = context.srfappid.split('__').pop(); // 取最后一段
// 调用实体服务新建行为
if (uiLogic.attach) {
  await _app.deService.exec( appName+'.ir_attachment', 'create', newcontext, uiLogic.attach ); 
};

```
