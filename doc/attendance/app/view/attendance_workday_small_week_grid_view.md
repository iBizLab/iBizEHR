# 工作日(attendance_workday_small_week_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)

## 视图界面逻辑
* `onMounted`
```javascript
const grid = view.getCtrl("GRID", "grid");

// 刷新表格数据
await grid.load();
```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [工作日(ATTENDANCE_WORKDAY)](module/attendance/attendance_workday) : [修改班次时间](module/attendance/attendance_workday#界面行为)

### 关联视图
  * [上下班时间(attendance_shift_default_shift_view)](app/view/attendance_shift_default_shift_view)
  * [工作日(attendance_workday_edit_view)](app/view/attendance_workday_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>