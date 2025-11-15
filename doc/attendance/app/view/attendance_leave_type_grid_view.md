# 假期类型(attendance_leave_type_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [假期类型(ATTENDANCE_LEAVE_TYPE)](module/attendance/attendance_leave_type) : [表格界面_新建操作](module/attendance/attendance_leave_type#界面行为)
  * [假期类型(ATTENDANCE_LEAVE_TYPE)](module/attendance/attendance_leave_type) : [表格界面_删除操作](module/attendance/attendance_leave_type#界面行为)
  * [假期类型(ATTENDANCE_LEAVE_TYPE)](module/attendance/attendance_leave_type) : [表格界面_导出操作（Excel）](module/attendance/attendance_leave_type#界面行为)
  * [假期类型(ATTENDANCE_LEAVE_TYPE)](module/attendance/attendance_leave_type) : [表格界面_拷贝操作](module/attendance/attendance_leave_type#界面行为)
  * [假期类型(ATTENDANCE_LEAVE_TYPE)](module/attendance/attendance_leave_type) : [表格界面_编辑操作](module/attendance/attendance_leave_type#界面行为)

### 关联视图
  * [假期类型(attendance_leave_type_quick_create_view)](app/view/attendance_leave_type_quick_create_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>