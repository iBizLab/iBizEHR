# 班次设置(attendance_shift_inversion_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [班次(ATTENDANCE_SHIFT)](module/attendance/attendance_shift) : [修改班次时间](module/attendance/attendance_shift#界面行为)

### 关联视图
  * [上下班时间(attendance_shift_default_shift_view)](app/view/attendance_shift_default_shift_view)
  * [上下班时间(attendance_shift_quick_create_view)](app/view/attendance_shift_quick_create_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>