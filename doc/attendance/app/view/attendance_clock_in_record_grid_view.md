# 打卡记录(attendance_clock_in_record_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(tabtoolbar1)

## 视图界面逻辑
* `onBeforeLoadDraft`
```javascript
if (!viewParam.date_range || !viewParam.n_checkin_time_gtandeq || !viewParam.n_checkin_time_ltandeq) {
    const curDate = new Date();
    // 几种默认值处理方式
    const year = curDate.getFullYear();
    const month = curDate.getMonth() + 1;
    const day = curDate.getDate();
    const tempMonth = month < 10 ? `0${month}` : month
    const tempDay = day < 10 ? `0${day}` : day;
    // 今天
    const end = `${year}-${tempMonth}-${tempDay}`;
    // 默认值为今天
    const starttime = `${end} 00:00:00`;
    const endtime = `${end} 23:59:59`
    Object.assign(view.params, {
        date_range: `${starttime},${endtime}`,
        n_checkin_time_gtandeq: starttime,
        n_checkin_time_ltandeq: endtime
    })
    Object.assign(viewParam, {
        date_range: `${starttime},${endtime}`,
        n_checkin_time_gtandeq: starttime,
        n_checkin_time_ltandeq: endtime
    })
}
```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record) : [批量补卡](module/attendance/attendance_clock_in_record#界面行为)
  * [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record) : [表格界面_新建操作](module/attendance/attendance_clock_in_record#界面行为)
  * [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record) : [删除](module/attendance/attendance_clock_in_record#界面行为)
  * [打卡记录(ATTENDANCE_CLOCK_IN_RECORD)](module/attendance/attendance_clock_in_record) : [导出列表视图打卡记录](module/attendance/attendance_clock_in_record#界面行为)

### 关联视图
  * [打卡记录(attendance_clock_in_record_edit_view)](app/view/attendance_clock_in_record_edit_view)
  * [重新计算(attendance_clock_in_record_recalculate_option_view)](app/view/attendance_clock_in_record_recalculate_option_view)
  * [批量补卡(attendance_clock_in_record_reissue_option_view)](app/view/attendance_clock_in_record_reissue_option_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>