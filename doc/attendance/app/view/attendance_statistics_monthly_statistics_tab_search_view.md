# 月度汇总(attendance_statistics_monthly_statistics_tab_search_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 搜索表单(searchform)
#### 分页导航面板(tabexppanel)


### 关联界面行为
  * [考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics) : [导出个人统计报表](module/attendance/attendance_statistics#界面行为)

### 关联视图
  * [考勤统计(attendance_statistics_edit_view)](app/view/attendance_statistics_edit_view)
  * [月度汇总(attendance_statistics_monthly_statistics)](app/view/attendance_statistics_monthly_statistics)
  * [个人月度汇总(employee_data_view_exp_view)](app/view/employee_data_view_exp_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>