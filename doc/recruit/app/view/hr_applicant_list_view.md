# 候选人管理(hr_applicant_list_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 列表(list)
#### 搜索栏(searchbar)
#### 搜索栏(searchbar1)
#### 搜索表单(searchform)
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
	viewParam.n_job_id_eq = node._value;
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


### 关联界面行为
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [进入用人部门筛选](module/hr/hr_applicant#界面行为)
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [进入沟通offer](module/hr/hr_applicant#界面行为)
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [进入大五性格测评](module/hr/hr_applicant#界面行为)
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [推荐给用人部门](module/hr/hr_applicant#界面行为)
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [备注](module/hr/hr_applicant#界面行为)
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [淘汰](module/hr/hr_applicant#界面行为)
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [进入待入职](module/hr/hr_applicant#界面行为)
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [进入初试](module/hr/hr_applicant#界面行为)
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [进入复试](module/hr/hr_applicant#界面行为)
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [打开候选人申请基本信息](module/hr/hr_applicant#界面行为)

### 关联界面逻辑
  * [工作台(WORKSPACE)](module/base/workspace) : [提示](module/base/workspace/uilogic/message)

### 关联视图
  * [候选人申请(hr_applicant_create_view)](app/view/hr_applicant_create_view)
  * [候选人申请(hr_applicant_edit_view)](app/view/hr_applicant_edit_view)
  * [候选人申请(hr_applicant_interview_view)](app/view/hr_applicant_interview_view)
  * [筛选候选人(hr_candidate_filter_recommend_department_option_view)](app/view/hr_candidate_filter_recommend_department_option_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>