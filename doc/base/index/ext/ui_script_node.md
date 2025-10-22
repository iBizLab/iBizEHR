
## 使用脚本的界面逻辑节点<sup class="footnote-symbol"> <font color=orange>[30]</font></sup>

#### [员工(HR_EMPLOYEE)](module/hr/hr_employee)的处理逻辑[打开员工基本信息视图(open_emp_info_view)](module/hr/hr_employee/uilogic/open_emp_info_view)

节点：阻止默认行为
<p class="panel-title"><b>执行代码</b></p>

```javascript
event.stopPropagation();
event.preventDefault();
console.log("ctrl",ctrl);
```
#### [附件(IR_ATTACHMENT)](module/base/ir_attachment)的处理逻辑[添加附件数据(add_attachment)](module/base/ir_attachment/uilogic/add_attachment)

节点：设置附件参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const _viewparam = uiLogic.view.params;
console.log("");
const mimeTypeMap = {
  ".txt": "text/plain",
  ".html": "text/html",
  ".htm": "text/html",
  ".css": "text/css",
  ".js": "application/javascript",
  ".json": "application/json",
  ".xml": "application/xml",
  ".csv": "text/csv",
  ".jpg": "image/jpeg",
  ".jpeg": "image/jpeg",
  ".png": "image/png",
  ".gif": "image/gif",
  ".bmp": "image/bmp",
  ".svg": "image/svg+xml",
  ".webp": "image/webp",
  ".ico": "image/x-icon",
  ".mp4": "video/mp4",
  ".webm": "video/webm",
  ".ogg": "video/ogg",
  ".mp3": "audio/mpeg",
  ".wav": "audio/wav",
  ".flac": "audio/flac",
  ".aac": "audio/aac",
  ".pdf": "application/pdf",
  ".doc": "application/msword",
  ".docx": "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
  ".xls": "application/vnd.ms-excel",
  ".xlsx": "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
  ".ppt": "application/vnd.ms-powerpoint",
  ".pptx": "application/vnd.openxmlformats-officedocument.presentationml.presentation",
  ".zip": "application/zip",
  ".rar": "application/x-rar-compressed",
  ".7z": "application/x-7z-compressed",
  ".tar": "application/x-tar",
  ".gz": "application/gzip",
  ".exe": "application/octet-stream",
  ".woff": "font/woff",
  ".woff2": "font/woff2",
  ".ttf": "font/ttf",
  ".otf": "font/opentype"
};
uiLogic.attach = uiLogic.files.map(item => 
    {
        const defaultMimeType = "application/octet-stream";
        var _mimeType = defaultMimeType;
        const match = item.filename.match(/\.([^.]+)$/);
        if (match){
            const ext = match[0].toLowerCase();
            _mimeType = mimeTypeMap[ext] || defaultMimeType;
        }
    
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            res_id: _viewparam.mail_thread,
            res_model: _viewparam.srfmodelname,
            type: "binary",
            store_fname: item.filename,
            file_size: item.filesize,
            mimeType: _mimeType,
        }
    }
)

```
#### [附件(IR_ATTACHMENT)](module/base/ir_attachment)的处理逻辑[添加附件数据(add_attachment)](module/base/ir_attachment/uilogic/add_attachment)

节点：新建附件
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
#### [附件(IR_ATTACHMENT)](module/base/ir_attachment)的处理逻辑[添加附件数据(add_attachment)](module/base/ir_attachment/uilogic/add_attachment)

节点：刷新附件列表
<p class="panel-title"><b>执行代码</b></p>

```javascript
ibiz.mc.command.create.send({ srfdecodename: 'ir_attachment'});
```
#### [附件(IR_ATTACHMENT)](module/base/ir_attachment)的处理逻辑[删除附件数据(delete_attachment)](module/base/ir_attachment/uilogic/delete_attachment)

节点：删除附件
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 创建新上下文对象并拷贝原始context内容
const newcontext = { ir_attachment: uiLogic.default.id ,...context };
newcontext.srfsessionid="attachment_session";
// 获取ir_attachment实体服务
const _app = ibiz.hub.getApp(context.srfappid);
const appName = context.srfappid.split('__').pop(); // 取最后一段
// 调用实体服务删除行为
if (uiLogic.attach) {
  await _app.deService.exec( appName+'.ir_attachment', 'remove', newcontext, uiLogic.default ); 
};

```
#### [附件(IR_ATTACHMENT)](module/base/ir_attachment)的处理逻辑[删除附件数据(delete_attachment)](module/base/ir_attachment/uilogic/delete_attachment)

节点：刷新附件列表
<p class="panel-title"><b>执行代码</b></p>

```javascript
ibiz.mc.command.remove.send({ srfdecodename: 'ir_attachment',srfkey: uiLogic.default.id});
```
#### [活动(MAIL_ACTIVITY)](module/mail/mail_activity)的处理逻辑[完成并安排下一个(done_next)](module/mail/mail_activity/uilogic/done_next)

节点：填充活动参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.default.srfpartnerid=context.srfpartnerid;
uiLogic.default.srfuserid=context.srfuserid;
uiLogic.default.mail_activity_mixin=params.mail_activity_mixin;
uiLogic.default.srfmodelname=params.srfmodelname;
console.log("uiLogic.default",uiLogic.default);
```
#### [活动(MAIL_ACTIVITY)](module/mail/mail_activity)的处理逻辑[完成并安排下一个(done_next)](module/mail/mail_activity/uilogic/done_next)

节点：通知刷新消息和活动列表
<p class="panel-title"><b>执行代码</b></p>

```javascript
try{
    const activity_state =parentView.layoutPanel.findPanelItemByName("activity").panelItems.activity_state;
    if (activity_state && activity_state.value == null) {
        activity_state.setDataValue("planned");
    }
}catch(err){
    console.log("未处于统一邮件集成界面");
}
ibiz.mc.command.create.send({ srfdecodename: 'mail_message'});
ibiz.mc.command.create.send({ srfdecodename: 'mail_activity'});
```
#### [活动(MAIL_ACTIVITY)](module/mail/mail_activity)的处理逻辑[完成并安排下一个(done_next)](module/mail/mail_activity/uilogic/done_next)

节点：关闭弹窗
<p class="panel-title"><b>执行代码</b></p>

```javascript
var formCtrl = view.getCtrl("FORM", "form");
if(formCtrl){
    formCtrl.state.modified=false;
}
view.closeView({ ok: true});
```
#### [活动(MAIL_ACTIVITY)](module/mail/mail_activity)的处理逻辑[刷新活动和消息列表(refresh_activity_message)](module/mail/mail_activity/uilogic/refresh_activity_message)

节点：注入脚本代码
<p class="panel-title"><b>执行代码</b></p>

```javascript
console.log("更新活动状态");
try{
    const activity_state =parentView.layoutPanel.findPanelItemByName("activity").panelItems.activity_state;
    if (activity_state && activity_state.value == null) {
        activity_state.setDataValue("planned");
    }
}catch(err){
    console.log("未处于统一邮件集成界面");
}

ibiz.mc.command.create.send({ srfdecodename: 'mail_message'});
ibiz.mc.command.create.send({ srfdecodename: 'mail_activity'})

```
#### [活动(MAIL_ACTIVITY)](module/mail/mail_activity)的处理逻辑[刷新活动列表(refresh_activity)](module/mail/mail_activity/uilogic/refresh_activity)

节点：注入脚本代码
<p class="panel-title"><b>执行代码</b></p>

```javascript
ibiz.mc.command.remove.send({ srfdecodename: 'mail_activity',srfkey: uiLogic.ctx.mail_activity})

```
#### [活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule)的处理逻辑[完成并安排下一个(done_next)](module/mail/mail_activity_schedule/uilogic/done_next)

节点：填充活动参数
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.default.srfpartnerid=context.srfpartnerid;
uiLogic.default.srfuserid=context.srfuserid;


```
#### [活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule)的处理逻辑[完成并安排下一个(done_next)](module/mail/mail_activity_schedule/uilogic/done_next)

节点：通知刷新消息和活动列表
<p class="panel-title"><b>执行代码</b></p>

```javascript
try{
    const activity_state =parentView.layoutPanel.findPanelItemByName("activity").panelItems.activity_state;
    if (activity_state && activity_state.value == null) {
        activity_state.setDataValue("planned");
    }
}catch(err){
    console.log("未处于统一邮件集成界面");
}
ibiz.mc.command.create.send({ srfdecodename: 'mail_message'});
ibiz.mc.command.create.send({ srfdecodename: 'mail_activity'});
```
#### [活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule)的处理逻辑[完成并安排下一个(done_next)](module/mail/mail_activity_schedule/uilogic/done_next)

节点：关闭弹窗
<p class="panel-title"><b>执行代码</b></p>

```javascript
var formCtrl = view.getCtrl("FORM", "form");
if(formCtrl){
    formCtrl.state.modified=false;
}
view.closeView({ ok: true, data: [] });
```
#### [活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule)的处理逻辑[刷新活动和消息列表(refresh_activity_message)](module/mail/mail_activity_schedule/uilogic/refresh_activity_message)

节点：注入脚本代码
<p class="panel-title"><b>执行代码</b></p>

```javascript
console.log("更新活动状态");
try{
    const activity_state =parentView.layoutPanel.findPanelItemByName("activity").panelItems.activity_state;
    if (activity_state && activity_state.value == null) {
        activity_state.setDataValue("planned");
    }
}catch(err){
    console.log("未处于统一邮件集成界面");
}

ibiz.mc.command.create.send({ srfdecodename: 'mail_message'});
ibiz.mc.command.create.send({ srfdecodename: 'mail_activity'});

```
#### [单据关注者(MAIL_FOLLOWERS)](module/mail/mail_followers)的处理逻辑[关注人员更新(嵌入)(attention_personnel_update_emb)](module/mail/mail_followers/uilogic/attention_personnel_update_emb)

节点：更新关注人员
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
#### [消息(MAIL_MESSAGE)](module/mail/mail_message)的处理逻辑[清空评论(clear_comment)](module/mail/mail_message/uilogic/clear_comment)

节点：清空评论
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.view.layoutPanel.panelItems.message_inputbox.editor.clear();
uiLogic.view.edit_comment_id = null;
uiLogic.view.reply_comment_id = null;
```
#### [消息(MAIL_MESSAGE)](module/mail/mail_message)的处理逻辑[编辑评论(edit_comment)](module/mail/mail_message/uilogic/edit_comment)

节点：显示消息输入框
<p class="panel-title"><b>执行代码</b></p>

```javascript
// 获取目标面板项
const panelItem = view.layoutPanel.findPanelItemByName("message_panel");
if (panelItem) {
  // 切换可见状态
  panelItem.state.visible =true;
}
```
#### [消息(MAIL_MESSAGE)](module/mail/mail_message)的处理逻辑[编辑评论(edit_comment)](module/mail/mail_message/uilogic/edit_comment)

节点：展开评论输入框并设值
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.comment.toggleCollapse(true);
uiLogic.comment.setValue(uiLogic.default.body);
uiLogic.comment.reply.value = null;


```
#### [消息(MAIL_MESSAGE)](module/mail/mail_message)的处理逻辑[刷新评论列表(refresh_comment)](module/mail/mail_message/uilogic/refresh_comment)

节点：注入脚本代码
<p class="panel-title"><b>执行代码</b></p>

```javascript
ibiz.mc.command.update.send({ srfdecodename: 'mail_message',srfkey: uiLogic.default.id})
```
#### [消息(MAIL_MESSAGE)](module/mail/mail_message)的处理逻辑[回复评论(reply_comment)](module/mail/mail_message/uilogic/reply_comment)

节点：展开评论输入框并设值回复
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
#### [消息(MAIL_MESSAGE)](module/mail/mail_message)的处理逻辑[发送评论(send_comment)](module/mail/mail_message/uilogic/send_comment)

节点：获取评论框内容
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.comment.body = uiLogic.view.layoutPanel.panelItems.message_inputbox.value;
```
#### [消息(MAIL_MESSAGE)](module/mail/mail_message)的处理逻辑[发送评论(send_comment)](module/mail/mail_message/uilogic/send_comment)

节点：清空评论框与评论id,通知刷新
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.view.layoutPanel.panelItems.message_inputbox.value = '';
uiLogic.view.layoutPanel.panelItems.message_inputbox.data.message_inputbox = '';
uiLogic.view.edit_comment_id = null;
uiLogic.view.reply_comment_id = null;
uiLogic.editor.reply.value = null;
uiLogic.editor.toggleCollapse(false)
// 清空本地上传文件
uiLogic.editor.clearFiles();
//通知消息刷新
ibiz.mc.command.create.send({ srfdecodename: 'mail_message'})

```
#### [核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc)的处理逻辑[跳转设置页面(skip_setting)](module/extension/PSCorePrdFunc/uilogic/skip_setting)

节点：跳转
<p class="panel-title"><b>执行代码</b></p>

```javascript
const { settingurl } = uiLogic.default;

window.open(settingurl, '_self');

```
#### [核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc)的处理逻辑[clone此应用(clone_git)](module/extension/PSCorePrdFunc/uilogic/clone_git)

节点：注入脚本代码
<p class="panel-title"><b>执行代码</b></p>

```javascript
var { httpurltorepo } = uiLogic.default;

var aux = document.createElement("textarea");
// aux.setAttribute("value", info); 
aux.value='git clone ' + httpurltorepo;
document.body.appendChild(aux); 
aux.select(); 
document.execCommand("copy"); 
document.body.removeChild(aux); 

util.message.success('复制成功!');
```
#### [核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc)的处理逻辑[初始化插件信息(init_plugin_info)](module/extension/PSCorePrdFunc/uilogic/init_plugin_info)

节点：初始化
<p class="panel-title"><b>执行代码</b></p>

```javascript
var data = uiLogic.form.state.data;
var setting_json = JSON.parse(data.settings, null, 4);
data.rt_object_repo = setting_json.rTObjectRepo || "";
data.plugin_code = setting_json.pluginCode || "";
```
#### [核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc)的处理逻辑[跳转应用详情页面(open_app_info)](module/extension/PSCorePrdFunc/uilogic/open_app_info)

节点：刷新导航占位
<p class="panel-title"><b>执行代码</b></p>

```javascript
setTimeout(() => {
  parentView.layoutPanel.panelItems.nav_pos.openView({
    key: uiLogic.default.pscoreprdfuncid,
    viewId: 'plmweb.ps_core_prd_func_info_view',
    isRoutePushed: true,
  });
}, 0);
```
#### [核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc)的处理逻辑[跳转gitlab(skip_gitlab)](module/extension/PSCorePrdFunc/uilogic/skip_gitlab)

节点：跳转
<p class="panel-title"><b>执行代码</b></p>

```javascript
const { httpurltorepo } = uiLogic.default;
window.open(httpurltorepo, '_blank');
```
#### [核心产品功能(PSCOREPRDFUNC)](module/extension/PSCorePrdFunc)的处理逻辑[更新插件设置(update_plugin_setting)](module/extension/PSCorePrdFunc/uilogic/update_plugin_setting)

节点：更新settings字段
<p class="panel-title"><b>执行代码</b></p>

```javascript
var rt_object_repo = uiLogic.default.rt_object_repo;
var data = uiLogic.form.state.data;
var setting_json = JSON.parse(data.settings);
setting_json.rTObjectRepo = rt_object_repo;
data.settings = JSON.stringify(setting_json, null, 4);
```
#### [用户(RES_USERS)](module/base/res_users)的处理逻辑[修改密码（表单）(change_pas)](module/base/res_users/uilogic/change_pas)

节点：校验表单
<p class="panel-title"><b>执行代码</b></p>

```javascript
(async function() { 
const bol = await uiLogic.form.validate();
console.log("");
if (bol) {
    const {password,new_password,sure_password} = uiLogic.default;
    const result = await ibiz.appUtil.changePwd(password,new_password,{surePwd: sure_password})
    if (result && result.ok) {
      ibiz.message.success('修改密码成功');
    } else {
      ibiz.message.error(`修改密码失败`);
    }
} else {
    ibiz.message.error('请检查表单填写！');
}
} )();
```




