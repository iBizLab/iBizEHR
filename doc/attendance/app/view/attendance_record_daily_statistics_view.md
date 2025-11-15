# 每日统计(attendance_record_daily_statistics_view)  <!-- {docsify-ignore-all} -->



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
const cols = ['member_name', 'member_num', 'dept_name', 'title', 'checkin_date', 'rule_name', 'shift_message'];
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
const value = data[0].check_in_info || '';
const values = value.split(',').filter(item => item !== "");
const cols = ['checkin_time', 'checkin_result'];
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
const value = data[0].duration_statistics || '';
const values = value.split(',').filter(item => item !== "");
const cols = ['should_attendance_hours', 'billable_hours', 'working_hours', 'late_minutes', 'leave_early_minutes', 'overtime_hours'];
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
const value = data[0].abnormal_statistics || '';
const values = value.split(',').filter(item => item !== "");
const cols = ['leave_duration', 'leave_type', 'on_business_days', 'out_hours'];
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
const columnStates = grid.state.columnStates
const value = data[0].index_num;
columnStates.forEach( item => {
    const suffix = parseInt(item.key.replace(/\D/g, ''));
    console.log(item.key, suffix);
    if (suffix && suffix <= value) {
        item.hidden = false;
    } else if (suffix && suffix > value) {
        item.hidden = true;
    }
});
```
* `onLoadDraftSuccess`
```
console.log('每日统计搜索表单加载');
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
// const start = `${year}-${tempMonth}-01`;

// 默认值为最新一个月时间,默认为31天，暂不考虑其他情况
// const prevTime = curDate.getTime() - 1000 * 60 * 60 * 24 * 31;
// const prevDate = new Date(prevTime);
// let prevYear = prevDate.getFullYear();
// let prevMonth = prevDate.getMonth() +1;
// const prevDay = prevDate.getDate();
// const start = `${prevYear}-${prevMonth}-${prevDay}`;

// 默认值为今天
const start = end;

Object.assign(ctrl.data, {
    date_range: `${start},${end}`,
    n_checkin_date_gtandeq: start,
    n_checkin_date_ltandeq: end
})
```

## 视图界面逻辑
* `onBeforeLoadDraft`
```javascript
const time = new Date(); // 当前时间
const startOfDay = new Date(time.getFullYear(), time.getMonth(), time.getDate()); // 今天的00:00:00

// 格式化日期函数，保证两位数
function formatDate(date) {
  const y = date.getFullYear();
  const m = date.getMonth() + 1;
  const d = date.getDate();
  return y + '-' + (m < 10 ? '0' + m : m) + '-' + (d < 10 ? '0' + d : d);
}

const n_checkin_date_gtandeq = formatDate(startOfDay); // 今天
const n_checkin_date_ltandeq = formatDate(time);       // 当前时间
const date_range = n_checkin_date_gtandeq + ',' + n_checkin_date_ltandeq;

Object.assign(viewParam, { n_checkin_date_gtandeq, n_checkin_date_ltandeq, date_range });

```
* `actionClick`
```javascript
consloe.log('actionClickform')
```
* `onMounted`
```javascript
//基本信息
const panelItems = view.layoutPanel.panelItems;
const grid = view.getController('grid');
const columns = ['member_name', 'member_num', 'dept_name',  'checkin_date', 'rule_name', 'shift_message', 'checkin_time', 'checkin_result', 'should_attendance_hours', 'billable_hours', 'working_hours',  'start_1', 'end_1'];
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
  * [考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record) : [考勤记录反查校验](module/attendance/attendance_record#界面行为)
  * [考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record) : [考勤记录反查](module/attendance/attendance_record#界面行为)

### 关联视图
  * [考勤记录(attendance_record_check_info_edit_view)](app/view/attendance_record_check_info_edit_view)
  * [考勤记录(attendance_record_edit_view)](app/view/attendance_record_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>