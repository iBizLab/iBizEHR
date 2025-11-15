# 群组(res_groupsmain_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [权限组(RES_GROUPS)](module/base/res_groups) : [编辑界面_保存并新建操作](module/base/res_groups#界面行为)
  * [权限组(RES_GROUPS)](module/base/res_groups) : [编辑界面_保存操作](module/base/res_groups#界面行为)
  * [权限组(RES_GROUPS)](module/base/res_groups) : [取消变更](module/base/res_groups#界面行为)

### 关联视图
  * [模型访问(ir_model_accessGridView)](app/view/ir_model_accessGridView)
  * [应用(ir_module_categoryPickupView)](app/view/ir_module_categoryPickupView)
  * [权限组继承(res_groups_implied_relGridView)](app/view/res_groups_implied_relGridView)
  * [权限组成员(res_groups_users_relGridView)](app/view/res_groups_users_relGridView)
  * [权限组关联规则(rule_group_relnested_group_grid_view)](app/view/rule_group_relnested_group_grid_view)
  * [权限组关联统一资源(unires_group_relnested_group_grid_view)](app/view/unires_group_relnested_group_grid_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>