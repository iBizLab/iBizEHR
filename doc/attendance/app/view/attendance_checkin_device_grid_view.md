# 设备打卡(attendance_checkin_device_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)


### 关联界面行为
  * [考勤设备关联(ATTENDANCE_CHECKIN_DEVICE)](module/attendance/attendance_checkin_device) : [表格界面_新建操作](module/attendance/attendance_checkin_device#界面行为)
  * [考勤设备关联(ATTENDANCE_CHECKIN_DEVICE)](module/attendance/attendance_checkin_device) : [表格界面_删除操作](module/attendance/attendance_checkin_device#界面行为)

### 关联视图
  * [考勤设备关联(attendance_checkin_device_edit_view)](app/view/attendance_checkin_device_edit_view)
  * [设备信息(attendance_device_m_pickup_view)](app/view/attendance_device_m_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>