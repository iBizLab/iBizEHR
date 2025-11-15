# 排班(attendance_schedule_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)

##### 部件逻辑
* `onBeforeLoadDraft`
```
const today = new Date();
const year = today.getFullYear();
const month = String(today.getMonth() + 1).padStart(2, '0');
const choose_month = `${year}-${month}`;
Object.assign(viewParam, { choose_month });
```
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule) : [表格界面_编辑操作](module/attendance/attendance_schedule#界面行为)
  * [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule) : [表格界面_拷贝操作](module/attendance/attendance_schedule#界面行为)
  * [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule) : [表格界面_删除操作](module/attendance/attendance_schedule#界面行为)
  * [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule) : [表格界面_导出操作（Excel）](module/attendance/attendance_schedule#界面行为)
  * [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule) : [表格界面_新建操作](module/attendance/attendance_schedule#界面行为)

### 关联视图
  * [排班(attendance_schedule_edit_view)](app/view/attendance_schedule_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>