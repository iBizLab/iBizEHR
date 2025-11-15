# 考勤规则(attendance_rule_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)


### 关联界面行为
  * [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule) : [编辑排班](module/attendance/attendance_rule#界面行为)
  * [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule) : [手动排班](module/attendance/attendance_rule#界面行为)
  * [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule) : [添加人员](module/attendance/attendance_rule#界面行为)
  * [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule) : [删除](module/attendance/attendance_rule#界面行为)
  * [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule) : [新建考勤规则](module/attendance/attendance_rule#界面行为)

### 关联视图
  * [考勤规则(attendance_rule_edit_view)](app/view/attendance_rule_edit_view)
  * [免考勤规则(attendance_rule_no_required_edit_view)](app/view/attendance_rule_no_required_edit_view)
  * [排班(attendance_schedule_overview_grid_view)](app/view/attendance_schedule_overview_grid_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>