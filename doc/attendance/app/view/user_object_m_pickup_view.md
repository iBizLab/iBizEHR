# 选择部门与人员(user_object_m_pickup_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 选择视图面板(pickupviewpanel)
#### 列表(simplelist)


### 关联界面行为
  * [用户对象映射(USER_OBJECT)](module/employee_management/user_object) : [视图_取消](module/employee_management/user_object#界面行为)
  * [用户对象映射(USER_OBJECT)](module/employee_management/user_object) : [移除全部数据（数据选择）](module/employee_management/user_object#界面行为)
  * [用户对象映射(USER_OBJECT)](module/employee_management/user_object) : [添加选中数据（数据选择）](module/employee_management/user_object#界面行为)
  * [用户对象映射(USER_OBJECT)](module/employee_management/user_object) : [移除选中数据（数据选择）](module/employee_management/user_object#界面行为)
  * [用户对象映射(USER_OBJECT)](module/employee_management/user_object) : [添加全部数据（数据选择）](module/employee_management/user_object#界面行为)
  * [用户对象映射(USER_OBJECT)](module/employee_management/user_object) : [确定](module/employee_management/user_object#界面行为)

### 关联视图
  * [人员选择树(user_object_pickup_tree_view)](app/view/user_object_pickup_tree_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>