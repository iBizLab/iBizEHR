# 月度汇总(attendance_statistics_monthly_statistics)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)

##### 部件逻辑
* `onMounted`
```
null
```
#### 搜索栏(searchbar)
#### 搜索表单(searchform)

##### 部件逻辑
* `onChange`
```
const grid = view.getController('grid');
const value = data[0].base_info || '';
const values = value.split(',').filter(item => item !== "");
const cols = ['member_name', 'employee_num', 'dept_name', 'title', 'xqsyr', 'gys_infoname'];
cols.forEach(key => {
    const item = grid.state.columnStates.find(x => x.key === key);
    console.log("隐藏表格列"+grid)
    if (values.includes(key)) {
        item.hidden = false;
    } else {
        item.hidden = true;
    }
});
```
* `onChange`
```
const grid = view.getController('grid');
const value = data[0].attendance || '';
const values = value.split(',').filter(item => item !== "");
const cols = ['should_attendance_days', 'actual_attendance_days', 'should_attendance_time', 'working_hours', 'billable_time', 'pay_overtime_time', 'rest_overtime_time'];
cols.forEach(key => {
    const item = grid.state.columnStates.find(x => x.key === key);
    if(item){
        if (values.includes(key)) {
            item.hidden = false;
        } else {
            item.hidden = true;
        }
    }
});
```
* `onChange`
```
const grid = view.getController('grid');
const value = data[0].abnormal || '';
const values = value.split(',').filter(item => item !== "");
const cols = ['late_times', 'late_duration', 'leave_early', 'leave_early_duration', 'on_missing', 'off_missing', 'absent_days', 'on_business_days', 'out_time', 'make_card_times', 'out_work_times'];
cols.forEach(key => {
    const item = grid.state.columnStates.find(x => x.key === key);
    if(item){
        if (values.includes(key)) {
            item.hidden = false;
        } else {
            item.hidden = true;
        }
    }
});
```
* `onChange`
```
const grid = view.getController('grid');
const value = data[0].daily || '';
grid.toggleCustomColumn(value === 'daily');

```
* `onChange`
```
const grid = view.getController('grid');
const value = data[0].leave || '';
const values = value.split(',').filter(item => item !== "");
const cols = ['leave_duration', 'annual_leave', 'vacation_leave', 'sick_leave', 'parental_leave', 'paternity_leave', 'marriage_holiday', 'funeral_leave', 'maternity_leave', 'compassionate_leave'];
cols.forEach(key => {
    const item = grid.state.columnStates.find(x => x.key === key);
    if(item){
        if (values.includes(key)) {
            item.hidden = false;
        } else {
            item.hidden = true;
        }
    }
});
```
#### 工具栏(tabtoolbar)

## 视图界面逻辑
* `onBeforeLoadDraft`
```javascript
console.log("初始化搜索表单")
if (!viewParam.date_range || !viewParam.n_checkin_date_gtandeq || !viewParam.n_checkin_date_ltandeq){
    const time = new Date(); // 当前时间
    const startOfMonth = new Date(time.getFullYear(), time.getMonth(), 1); // 本月第一天，时分秒默认0
    // 格式化日期函数，保证两位数
    function formatDate(date) {
        const y = date.getFullYear();
        const m = date.getMonth() + 1;
        const d = date.getDate();
        return y + '-' + (m < 10 ? '0' + m : m) + '-' + (d < 10 ? '0' + d : d);
    }

    const n_checkin_date_gtandeq = formatDate(startOfMonth); // 本月初
    const n_checkin_date_ltandeq = formatDate(time);         // 当前时间
    const date_range = n_checkin_date_gtandeq + ',' + n_checkin_date_ltandeq;
    Object.assign(viewParam, { n_checkin_date_gtandeq, n_checkin_date_ltandeq, date_range });
    Object.assign(view.params, { n_checkin_date_gtandeq, n_checkin_date_ltandeq, date_range });
}


```
* `onMounted`
```javascript
//基本信息
const panelItems = view.layoutPanel.panelItems;
const grid = view.getController('grid');
const columns = ['member_name','employee_num','dept_name','should_attendance_days','actual_attendance_days','should_attendance','working_hours','billable','late_times','late_duration','leave_early','leave_early_duration','leave_duration'];
grid.state.columnStates.forEach((item) => {
    if (columns.includes(item.key)) {
        item.hidden = false
    }else{
        item.hidden = true
    }
})

```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [考勤统计(ATTENDANCE_STATISTICS)](module/attendance/attendance_statistics) : [导出月度汇总统计报表](module/attendance/attendance_statistics#界面行为)

### 关联视图
  * [考勤统计(attendance_statistics_edit_view)](app/view/attendance_statistics_edit_view)
  * [考勤统计(attendance_statistics_redirect_view)](app/view/attendance_statistics_redirect_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>