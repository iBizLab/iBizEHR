# 设备信息(attendance_device_grid_view)  <!-- {docsify-ignore-all} -->



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
  * [设备信息(ATTENDANCE_DEVICE)](module/attendance/attendance_device) : [表格界面_编辑操作](module/attendance/attendance_device#界面行为)
  * [设备信息(ATTENDANCE_DEVICE)](module/attendance/attendance_device) : [表格界面_拷贝操作](module/attendance/attendance_device#界面行为)
  * [设备信息(ATTENDANCE_DEVICE)](module/attendance/attendance_device) : [表格界面_导出操作（Excel）](module/attendance/attendance_device#界面行为)
  * [设备信息(ATTENDANCE_DEVICE)](module/attendance/attendance_device) : [表格界面_新建操作](module/attendance/attendance_device#界面行为)
  * [设备信息(ATTENDANCE_DEVICE)](module/attendance/attendance_device) : [表格界面_删除操作](module/attendance/attendance_device#界面行为)

### 关联视图
  * [设备信息(attendance_device_edit_view)](app/view/attendance_device_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>