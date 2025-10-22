# 自助考勤(hr_employee_checkin_multi_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据视图(dataview)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)
#### 树视图(tree)

## 视图界面逻辑
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
* `onBeforeLoad`
```javascript
const n_company_id_eq = view.session.company?.id || '';
const n_department_id_childof = view.session.dept?.id || '';
Object.assign(ctrl.state.searchParams, {
  n_company_id_eq,
  n_department_id_childof
});
```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联视图
  * [自助考勤(hr_attendance_kiosk_checkin_view)](app/view/hr_attendance_kiosk_checkin_view)
  * [员工(hr_employee_main_view)](app/view/hr_employee_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>