<p class="panel-title"><b>执行代码</b></p>

```javascript
// 创建新上下文对象并拷贝原始context内容
const _app = ibiz.hub.getApp(view.parentView.context.srfappid);
const appName = view.parentView.context.srfappid.split('__').pop(); // 取最后一段
const deName = view.params.srfmodelname;
console.log("");
// 调用实体服务更新行为
if (uiLogic.commit_object) {
  uiLogic.commit_object.followers = uiLogic.commit_object.followers.map(follower => {
  return {
    ...follower
  };
});
  await _app.deService.exec( appName+'.'+deName, 'update', context , uiLogic.commit_object); 
};

```
