# 全部报表(report_all_report_grid_view)  <!-- {docsify-ignore-all} -->



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
  * [分析报表(REPORT)](module/base/report) : [打开报表设计界面](module/base/report#界面行为)
  * [分析报表(REPORT)](module/base/report) : [删除](module/base/report#界面行为)
  * [分析报表(REPORT)](module/base/report) : [编辑](module/base/report#界面行为)
  * [分析报表(REPORT)](module/base/report) : [打开BI报表设计图面板视图](module/base/report#界面行为)

### 关联视图
  * [基础信息变更(report_baseinfo_edit_view)](app/view/report_baseinfo_edit_view)
  * [BI报表呈现态面板视图(report_bi_report_content_panel_view)](app/view/report_bi_report_content_panel_view)
  * [BI报表设计态面板视图(report_bi_report_panel_view)](app/view/report_bi_report_panel_view)
  * [分析报表(report_edit_view)](app/view/report_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>