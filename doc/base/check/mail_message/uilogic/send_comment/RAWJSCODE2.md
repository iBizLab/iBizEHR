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
