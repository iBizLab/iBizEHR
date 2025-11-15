# 排班(attendance_schedule_edit_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule) : [编辑界面_保存并退出操作](module/attendance/attendance_schedule#界面行为)
  * [排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule) : [编辑界面_退出操作](module/attendance/attendance_schedule#界面行为)

### 关联视图
  * [激活规则(attendance_activate_rule_pickup_view)](app/view/attendance_activate_rule_pickup_view)
  * [员工信息(employee_pickup_view)](app/view/employee_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>