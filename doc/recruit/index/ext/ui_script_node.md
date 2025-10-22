
## 使用脚本的界面逻辑节点<sup class="footnote-symbol"> <font color=orange>[11]</font></sup>

#### [评论(COMMENT)](module/base/comment)的处理逻辑[清空评论(clear_comment)](module/base/comment/uilogic/clear_comment)

节点：清空评论
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.view.layoutPanel.panelItems.field_textbox.editor.clear();
uiLogic.view.edit_comment_id = null;
uiLogic.view.reply_comment_id = null;
```
#### [评论(COMMENT)](module/base/comment)的处理逻辑[编辑评论(edit_comment)](module/base/comment/uilogic/edit_comment)

节点：展开评论输入框并设值
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.comment.toggleCollapse(true);
uiLogic.comment.setValue(uiLogic.default.content);
uiLogic.comment.reply.value = null;
```
#### [评论(COMMENT)](module/base/comment)的处理逻辑[刷新评论列表(refresh_comment)](module/base/comment/uilogic/refresh_comment)

节点：注入脚本代码
<p class="panel-title"><b>执行代码</b></p>

```javascript
ibiz.hub.getApp(context.srfappid).deService.exec(
'plmmob.comment',
'Update',
context,
uiLogic.Default,
);
```
#### [评论(COMMENT)](module/base/comment)的处理逻辑[回复评论(reply_comment)](module/base/comment/uilogic/reply_comment)

节点：展开评论输入框并设值回复
<p class="panel-title"><b>执行代码</b></p>

```javascript
const _app = ibiz.hub.getApp(context.srfappid);
_app.codeList.get('SysOperator', context, params).then(items => {
	const create_man = uiLogic.default.create_man;
	const findItem = items.find(item => item.value == create_man);
	const name = findItem ? findItem.text : create_man;
	const content = uiLogic.default.content;
	uiLogic.comment.setReply({name, content});
	uiLogic.comment.toggleCollapse(true);
})
```
#### [评论(COMMENT)](module/base/comment)的处理逻辑[发送评论(send_comment)](module/base/comment/uilogic/send_comment)

节点：获取评论框内容
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.comment.content = uiLogic.view.layoutPanel.panelItems.field_textbox.value;
```
#### [评论(COMMENT)](module/base/comment)的处理逻辑[发送评论(send_comment)](module/base/comment/uilogic/send_comment)

节点：清空评论框与评论id
<p class="panel-title"><b>执行代码</b></p>

```javascript
uiLogic.view.layoutPanel.panelItems.field_textbox.value = '';
uiLogic.view.layoutPanel.panelItems.field_textbox.data.field_textbox = '';
uiLogic.view.edit_comment_id = null;
uiLogic.view.reply_comment_id = null;
uiLogic.editor.reply.value = null;
uiLogic.editor.toggleCollapse(false)

```
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[设置激活tab(active_tab)](module/hr/hr_applicant/uilogic/active_tab)

节点：注入脚本代码
<p class="panel-title"><b>执行代码</b></p>

```javascript
const active_tab = uiLogic.default.srfactivetab;
if(active_tab){
    view.layoutPanel.panelItems.form.control.details.tabpanel1.state.activeTab = 'tabpanel1_'+active_tab;
}

```
#### [候选人申请(HR_APPLICANT)](module/hr/hr_applicant)的处理逻辑[获取filter数据(filter_info)](module/hr/hr_applicant/uilogic/filter_info)

节点：注入脚本代码
<p class="panel-title"><b>执行代码</b></p>

```javascript
console.log(uiLogic.default)
```
#### [OFFER录用(HR_OFFER)](module/hr/hr_offer)的处理逻辑[offer提交(commitoffer)](module/hr/hr_offer/uilogic/commitoffer)

节点：保存offer记录并刷新上下文
<p class="panel-title"><b>执行代码</b></p>

```javascript
const form = view.getController('form');
await form.save();
console.log(view);
view.call('Refresh');
view.context.hr_offer = view.context.hr_applicant;
view.layoutPanel.panelItems.view_content.state.visible = false;
view.layoutPanel.panelItems.view_header.state.visible = false;
view.layoutPanel.panelItems.top_toolbar.state.visible = true;
view.layoutPanel.panelItems.detail_list.state.visible = true;
view.layoutPanel.panelItems.empty_group.state.visible = false;
view.RedrawView();
view.getController('grid').refresh();
view.getController('list').refresh();
```
#### [分析报表(REPORT)](module/base/report)的处理逻辑[导出表格(export_excel)](module/base/report/uilogic/export_excel)

节点：整合表格数据并导出
<p class="panel-title"><b>执行代码</b></p>

```javascript
if (uiLogic.grid) {
    uiLogic.grid.exportData({params: {}});
}
```
#### [分析报表(REPORT)](module/base/report)的处理逻辑[导出为pdf(export_pdf)](module/base/report/uilogic/export_pdf)

节点：导出图片脚本
<p class="panel-title"><b>执行代码</b></p>

```javascript
const viewDom = document.getElementById(view.id);
if (viewDom) {
    const content = viewDom.querySelector('.ibiz-bi-report-panel-content>.el-collapse');
    const fileName = view.model.caption;
    ibiz.util.html2canvas.exportCanvas(content, { fileName });
}
```




