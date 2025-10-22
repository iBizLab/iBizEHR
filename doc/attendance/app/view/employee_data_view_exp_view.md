# 个人月度汇总(employee_data_view_exp_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 卡片视图导航栏(dataviewexpbar)
#### 搜索栏(searchbar)
#### 工具栏(tabtoolbar1)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics) : [导出个人统计报表](module/attendance/attendance_statistics#界面行为)

### 关联视图
  * [考勤统计(attendance_statistics_edit_view)](app/view/attendance_statistics_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>