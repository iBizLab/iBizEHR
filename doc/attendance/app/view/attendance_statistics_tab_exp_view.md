# 月度汇总(attendance_statistics_tab_exp_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 搜索表单(searchform)

##### 部件逻辑
* `onLoadDraftSuccess`
```
console.log('加载草稿成功', ctrl);
const curDate = new Date();
// 几种默认值处理方式
const year = curDate.getFullYear();
const month = curDate.getMonth() + 1;
const day = curDate.getDate();
const tempMonth = month < 10 ? `0${month}` : month
const tempDay = day < 10 ? `0${day}` : day;
// 今天
const end = `${year}-${tempMonth}-${tempDay}`;
// 默认值为当前月一号到现在
const start = `${year}-${tempMonth}-01`;

// 默认值为最新一个月时间,默认为31天，暂不考虑其他情况
// const prevTime = curDate.getTime() - 1000 * 60 * 60 * 24 * 31;
// const prevDate = new Date(prevTime);
// let prevYear = prevDate.getFullYear();
// let prevMonth = prevDate.getMonth() +1;
// const prevDay = prevDate.getDate();
// const start = `${prevYear}-${prevMonth}-${prevDay}`;

// 默认值为今天
// const start = end;

Object.assign(ctrl.data, {
    date_range: `${start},${end}`,
    n_checkin_date_gtandeq: start,
    n_checkin_date_ltandeq: end
})
ctrl.view.initSearchData({
    date_range: `${start},${end}`,
    n_checkin_date_gtandeq: start,
    n_checkin_date_ltandeq: end
});
```
#### 数据关系分页部件(tabexppanel)


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