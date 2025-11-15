# 考勤规则成员(attendance_group_shift_member_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)


### 关联界面行为
  * [考勤规则成员(ATTENDANCE_GROUP_SHIFT_MEMBER)](module/attendance/attendance_group_shift_member) : [表格界面_新建操作](module/attendance/attendance_group_shift_member#界面行为)
  * [考勤规则成员(ATTENDANCE_GROUP_SHIFT_MEMBER)](module/attendance/attendance_group_shift_member) : [表格界面_删除操作](module/attendance/attendance_group_shift_member#界面行为)

### 关联视图
  * [考勤规则成员(attendance_group_shift_member_edit_view)](app/view/attendance_group_shift_member_edit_view)
  * [选择部门与人员(user_object_m_pickup_view)](app/view/user_object_m_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>