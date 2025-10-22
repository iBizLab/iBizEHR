# 工作细节(resource_calendar_attendancegrid_view_nested)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)

##### 部件逻辑
* `onMounted`
```
var gridCtrl = view.getCtrl("GRID", "grid");
if (gridCtrl) {
  gridCtrl.state.rowEditOpen=true;
}
```
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [工作细节(RESOURCE_CALENDAR_ATTENDANCE)](module/resource/resource_calendar_attendance) : [表格界面_新建行](module/resource/resource_calendar_attendance#界面行为)

### 关联视图
  * [工作细节(resource_calendar_attendanceEditView)](app/view/resource_calendar_attendanceEditView)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>