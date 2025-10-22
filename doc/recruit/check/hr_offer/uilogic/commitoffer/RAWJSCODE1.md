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
