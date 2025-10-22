# 部门统计(attendance_department_statistics)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|考勤日期|CHECKIN_DATE|日期型||是||
|缺卡次数|CHECKIN_MISSING_TIMES|浮点||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|部门ID|DEPT_ID|文本，可指定长度|100|是||
|部门名称|DEPT_NAME|文本，可指定长度|100|是||
|外出次数|GO_OUT_TIMES|整型||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|迟到次数|LATE_TIMES|浮点||是||
|早退次数|LEAVE_EARLY_TIMES|浮点||是||
|请假次数|LEAVE_TIMES|整型||是||
|名称|NAME|文本，可指定长度|200|是||
|正常出勤次数|NORMAL_ATTENDANCE_DAYS|整型||是||
|外勤次数|OUT_WORK_TIMES|浮点||是||
|加班时长(小时)|OVERTIME_HOURS|浮点||是||
|应出勤人数|SHOULD_ATTENDANCE_PEOPLE_NUM|整型||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[部门统计](module/attendance/attendance_department_statistics/logic/department_statistics)|department_statistics|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/attendance/attendance_department_statistics/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/attendance/attendance_department_statistics/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/attendance/attendance_department_statistics/dataset/Default)|DEFAULT|数据查询|是|||
|[部门统计(attendance_department_statistics)](module/attendance/attendance_department_statistics/dataset/attendance_department_statistics)|attendance_department_statistics|[实体逻辑](module/attendance/attendance_department_statistics/logic/department_statistics)|否|||

## 数据权限

##### 我部门的（读） :id=attendance_department_statistics-MYDEPT_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门 <i class="fa fa-check-square"/></i> 下级部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的班组（读） :id=attendance_department_statistics-MYGROUP_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CHECKIN_DATE_GTANDEQ|考勤日期|GTANDEQ||
|N_CHECKIN_DATE_LTANDEQ|考勤日期|LTANDEQ||
|N_ID_IN|标识|IN||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

## 导出模式

* **数据导出**


<el-descriptions direction="vertical" :column="10" :size="size" border>
<el-descriptions-item label="部门名称">-</el-descriptions-item>
<el-descriptions-item label="应出勤人数">-</el-descriptions-item>
<el-descriptions-item label="正常出勤次数">-</el-descriptions-item>
<el-descriptions-item label="迟到次数">-</el-descriptions-item>
<el-descriptions-item label="早退次数">-</el-descriptions-item>
<el-descriptions-item label="缺卡次数">-</el-descriptions-item>
<el-descriptions-item label="请假次数">-</el-descriptions-item>
<el-descriptions-item label="出差次数">-</el-descriptions-item>
<el-descriptions-item label="外出次数">-</el-descriptions-item>
<el-descriptions-item label="加班时长(小时)">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/attendance/attendance_department_statistics?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_department_statistics?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_department_statistics?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_department_statistics?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_department_statistics?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_department_statistics?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_department_statistics?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_department_statistics?id=导出模式`">
  导出模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {



      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>