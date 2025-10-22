# 员工(hr_employeemulti_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### 看板(activity)
#### CAPTIONBAR(captionbar)
#### 数据图表(chart)
#### 数据视图(dataview)
#### 数据表格(grid)
#### 树视图(hierarchy)
#### 数据表格(pivottable)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)
#### 树视图(tree)
#### 树视图(tree1)

## 视图界面逻辑
* `onBeforeLoad`
```javascript
const n_company_id_eq = view.session.company?.id || '';
const n_department_id_childof = view.session.dept?.id || '';
Object.assign(ctrl.state.searchParams, {
  n_company_id_eq,
  n_department_id_childof
});
```
* `onBeforeLoad`
```javascript
const n_company_id_eq = view.session.company?.id || '';
const n_department_id_childof = view.session.dept?.id || '';
Object.assign(ctrl.state.searchParams, {
  n_company_id_eq,
  n_department_id_childof
});
```
* `onSelectionChange`
```javascript
// 获取TREE部件实例
console.log("");
const treeCtrl = view.getCtrl("TREEVIEW", "tree1");
const activectrlname = view.layoutPanel.findPanelItemByName('active_ctrl');
const activectrl = view.getCtrl("", activectrlname.value);
// 获取选中数据（假设存在getSelectedData方法）
const selectedData = data[0];
// 将数据存入视图会话变量
view.session.company = selectedData;
// 可选：持久化会话数据
const company = view.session.company?.id || '';
const dept = view.session.dept?.id || '';
if(company){
activectrl.params.n_company_id_eq = company;
}
if(dept){
activectrl.params.n_department_id_childof = dept;
}
await activectrl.load();

```
* `onSelectionChange`
```javascript
// 获取TREE部件实例
const treeCtrl = view.getCtrl("TREEVIEW", "tree");
const activectrlname = view.layoutPanel.findPanelItemByName('active_ctrl');
const activectrl = view.getCtrl("", activectrlname.value);
// 获取选中数据（假设存在getSelectedData方法）
const selectedData = data[0];
// 将数据存入视图会话变量
view.session.dept = selectedData;
const company = view.session.company?.id || '';
const dept = view.session.dept?.id || '';
if(company){
activectrl.params.n_company_id_eq = company;
}
if(dept){
activectrl.params.n_department_id_childof = dept;
}
await activectrl.refresh();

```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [员工(HR_EMPLOYEE)](module/hr/hr_employee) : [新建](module/hr/hr_employee#界面行为)

### 关联视图
  * [员工(hr_employeemain_view)](app/view/hr_employeemain_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>