# 出勤(hr_attendance_multi_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [出勤(HR_ATTENDANCE)](module/hr/hr_attendance) : [表格界面_删除操作](module/hr/hr_attendance#界面行为)
  * [出勤(HR_ATTENDANCE)](module/hr/hr_attendance) : [出勤审批-批量拒绝](module/hr/hr_attendance#界面行为)
  * [出勤(HR_ATTENDANCE)](module/hr/hr_attendance) : [出勤审批-批量批准](module/hr/hr_attendance#界面行为)
  * [出勤(HR_ATTENDANCE)](module/hr/hr_attendance) : [表格界面_新建操作](module/hr/hr_attendance#界面行为)

### 关联视图
  * [出勤(hr_attendance_main_view)](app/view/hr_attendance_main_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>