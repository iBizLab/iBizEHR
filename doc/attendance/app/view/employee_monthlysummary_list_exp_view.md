# 月度汇总列表导航视图(employee_monthlysummary_list_exp_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 列表视图导航栏(listexpbar)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [员工信息(EMPLOYEE)](module/employee_management/employee) : [导出个人统计报表](module/employee_management/employee#界面行为)

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