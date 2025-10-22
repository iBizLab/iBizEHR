# 部门统计(attendance_department_statistics_grid_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)

## 视图界面逻辑
* `onBeforeLoadDraft`
```javascript
console.log('部门统计搜索表单加载');
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
const start = end;

const n_checkin_date_gtandeq = start;
const n_checkin_date_ltandeq = end;
const date_range = start + ',' + end;

Object.assign(viewParam, { n_checkin_date_gtandeq, n_checkin_date_ltandeq, date_range });

view.params.n_checkin_date_gtandeq = n_checkin_date_gtandeq
view.params.n_checkin_date_ltandeq = n_checkin_date_ltandeq
```
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联视图
  * [部门统计(attendance_department_statistics_edit_view)](app/view/attendance_department_statistics_edit_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>