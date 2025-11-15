# WIFI打卡(attendance_wifi_location_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [WiFi定位配置(ATTENDANCE_WIFI_LOCATION)](module/attendance/attendance_wifi_location) : [表格界面_编辑操作](module/attendance/attendance_wifi_location#界面行为)
  * [WiFi定位配置(ATTENDANCE_WIFI_LOCATION)](module/attendance/attendance_wifi_location) : [表格界面_新建操作](module/attendance/attendance_wifi_location#界面行为)
  * [WiFi定位配置(ATTENDANCE_WIFI_LOCATION)](module/attendance/attendance_wifi_location) : [表格界面_删除操作](module/attendance/attendance_wifi_location#界面行为)

### 关联视图
  * [WiFi定位配置(attendance_wifi_location_quick_create_view)](app/view/attendance_wifi_location_quick_create_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>