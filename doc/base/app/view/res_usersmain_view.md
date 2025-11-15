# 用户(res_usersmain_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 数据关系栏(drbar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)


### 关联界面行为
  * [用户(RES_USERS)](module/base/res_users) : [编辑界面_保存并新建操作](module/base/res_users#界面行为)
  * [用户(RES_USERS)](module/base/res_users) : [编辑界面_保存操作](module/base/res_users#界面行为)
  * [用户(RES_USERS)](module/base/res_users) : [取消变更](module/base/res_users#界面行为)

### 关联视图
  * [员工(hr_employeemain_view)](app/view/hr_employeemain_view)
  * [模型访问(ir_model_accessmulti_data_view)](app/view/ir_model_accessmulti_data_view)
  * [规则(ir_rulemulti_data_view)](app/view/ir_rulemulti_data_view)
  * [权限组成员(res_groups_users_reluser_group_mgr_view)](app/view/res_groups_users_reluser_group_mgr_view)
  * [用户所属群组(res_groupsmulti_data_view_user)](app/view/res_groupsmulti_data_view_user)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>