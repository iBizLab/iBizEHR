# 出勤(hr_attendance_index_view)  <!-- {docsify-ignore-all} -->



## 控件
#### 应用菜单(appmenu)
#### CAPTIONBAR(captionbar)


### 关联界面行为
  * [考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics) : [导出个人统计报表](module/attendance/attendance_statistics#界面行为)

### 关联视图
  * [打卡记录(attendance_clock_in_record_grid_view)](app/view/attendance_clock_in_record_grid_view)
  * [月度打卡统计(attendance_clock_in_record_monthly_clock_in_record)](app/view/attendance_clock_in_record_monthly_clock_in_record)
  * [打卡记录(attendance_clock_in_record_tab_search_view)](app/view/attendance_clock_in_record_tab_search_view)
  * [部门统计(attendance_department_statistics_grid_view)](app/view/attendance_department_statistics_grid_view)
  * [异常考勤(attendance_record_abnormal_attendance)](app/view/attendance_record_abnormal_attendance)
  * [每日统计(attendance_record_daily_statistics_view)](app/view/attendance_record_daily_statistics_view)
  * [考勤规则(attendance_rule_grid_view)](app/view/attendance_rule_grid_view)
  * [排班(attendance_schedule_overview_grid_view)](app/view/attendance_schedule_overview_grid_view)
  * [考勤统计(attendance_statistics_edit_view)](app/view/attendance_statistics_edit_view)
  * [月度汇总(attendance_statistics_monthly_statistics)](app/view/attendance_statistics_monthly_statistics)
  * [月度汇总(attendance_statistics_monthly_statistics_tab_search_view)](app/view/attendance_statistics_monthly_statistics_tab_search_view)
  * [个人月度汇总(employee_data_view_exp_view)](app/view/employee_data_view_exp_view)
  * [管理(hr_attendance_manage_multi_data_view)](app/view/hr_attendance_manage_multi_data_view)
  * [出勤(hr_attendance_multi_data_view)](app/view/hr_attendance_multi_data_view)
  * [报表(hr_attendance_report_multi_data_view)](app/view/hr_attendance_report_multi_data_view)
  * [公共假期类型(public_leave_type_grid_view)](app/view/public_leave_type_grid_view)
  * [休假详细信息(resource_calendar_leaves_grid_view)](app/view/resource_calendar_leaves_grid_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>