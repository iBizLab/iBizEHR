# 候选人(hr_candidate_talentpool_list_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 列表(list)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)
#### 树视图(tree)

##### 部件逻辑
* `onSelectionChange`
```
const list = view.getController('list');
// 构建加载时的视图参数
const viewParam = {
	// 将搜索栏查询参数置空
	searchconds: undefined,
}
// 根据树节点数据构建查询参数
const node = data[0];
if (node._nodeType === 'DE') {
	viewParam.n_last_tp_talent_pool_like = node._value;
}
list.load({ viewParam });
```

## 视图界面逻辑
* `onMounted`
```javascript
// 设置可动态显隐的部件keepAlive
view.layoutPanel.panelItems.container_search.state.keepAlive = true;
view.layoutPanel.panelItems.container_tree.state.keepAlive = true;
// 设置默认不显示元素
view.layoutPanel.panelItems.show_search.state.visible = false;
view.layoutPanel.panelItems.container_tree.state.visible = false;
```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面逻辑
  * [工作台(WORKSPACE)](module/base/workspace) : [提示](module/base/workspace/uilogic/message)

### 关联视图
  * [候选人(hr_candidate_edit_view)](app/view/hr_candidate_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>