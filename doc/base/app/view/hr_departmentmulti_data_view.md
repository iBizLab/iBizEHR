# 部门(hr_departmentmulti_data_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据视图(dataview)
#### 数据表格(grid)
#### 树视图(hierarchy)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [部门(HR_DEPARTMENT)](module/hr/hr_department) : [打开员工实体管理页面](module/hr/hr_department#界面行为)
  * [部门(HR_DEPARTMENT)](module/hr/hr_department) : [表格界面_新建操作](module/hr/hr_department#界面行为)

### 关联视图
  * [部门(hr_departmentmain_view)](app/view/hr_departmentmain_view)
  * [员工(hr_employeemulti_data_view)](app/view/hr_employeemulti_data_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>