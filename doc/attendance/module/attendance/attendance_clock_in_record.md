# 打卡记录(attendance_clock_in_record)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|打卡图片|CHECKIN_IMAGE|图片|500|是||
|打卡备注|CHECKIN_REMARK|文本，可指定长度|255|是||
|打卡结果|CHECKIN_RESULT|[单项选择(文本值)](index/dictionary_index#attendance_result "考勤结果")|60|是||
|打卡时间|CHECKIN_TIME|日期时间型|255|是||
|打卡方式|CHECKIN_TYPE|单项选择(文本值)|60|是||
|打卡类型|CLOCK_TYPE|[单项选择(文本值)](index/dictionary_index#clock_type "打卡类型")|60|是||
|操作指令|CMD|文本，可指定长度|50|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|考勤日期|DATE|日期型||是||
|部门ID|DEPT_ID|文本，可指定长度|100|是||
|部门名称|DEPT_NAME|文本，可指定长度|100|是||
|设备名称|DEVICE_NAME|外键值文本|255|是||
|上班时长|DURATION_HOURS|整型||是||
|记录ID<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|员工ID|MEMBER_ID|文本，可指定长度|100|是||
|员工名称|MEMBER_NAME|文本，可指定长度|100|是||
|工号|MEMBER_NUM|文本，可指定长度|100|是||
|名称|NAME|文本，可指定长度|200|是||
|应打卡时间|SHOULD_CHECKIN_TIME|日期时间型||是||
|数据来源|SOURCE|文本，可指定长度|20|是||
|终端设备ID|TERMINAL_ID|外键值|60|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_ATTENDANCE_CLOCK_IN_RECORD_ATTENDANCE_DEVICE_TERMINAL_ID](der/DER1N_ATTENDANCE_CLOCK_IN_RECORD_ATTENDANCE_DEVICE_TERMINAL_ID)|[设备信息(ATTENDANCE_DEVICE)](module/attendance/attendance_device)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#attendance_clock_in_record_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|考勤计算|attendance_calculate|用户自定义|默认|不支持||[考勤计算](index/plugin_index#AttendanceCalculate)||
|批量补卡|batchReissue|[实体处理逻辑](module/attendance/attendance_clock_in_record/logic/batchReissue "批量补卡")|默认|不支持||||
|无操作|nothing|[实体处理逻辑](module/attendance/attendance_clock_in_record/logic/nothing "无操作")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[列表视图](module/attendance/attendance_clock_in_record/logic/record_list)|record_list|无|||
|[同步补卡至Odoo](module/attendance/attendance_clock_in_record/logic/sync_clock)|sync_clock|无|||
|[打卡记录](module/attendance/attendance_clock_in_record/logic/record)|record|无|||
|[批量补卡](module/attendance/attendance_clock_in_record/logic/batchReissue)|batchReissue|无|||
|[无操作](module/attendance/attendance_clock_in_record/logic/nothing)|nothing|无||无操作逻辑，用于替换表单的获取数据行为|

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/attendance/attendance_clock_in_record/query/Default)|DEFAULT|是|否 |否 ||
|[我的打卡记录(MYCLOCKINRECORD)](module/attendance/attendance_clock_in_record/query/MyClockInRecord)|MYCLOCKINRECORD|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/attendance/attendance_clock_in_record/dataset/Default)|DEFAULT|数据查询|是|||
|[数据集(MYCLOCKINRECORD)](module/attendance/attendance_clock_in_record/dataset/MyClockInRecord)|MYCLOCKINRECORD|数据查询|否|||
|[打卡记录(record)](module/attendance/attendance_clock_in_record/dataset/record)|record|[实体逻辑](module/attendance/attendance_clock_in_record/logic/record)|否|||
|[列表视图(record_list)](module/attendance/attendance_clock_in_record/dataset/record_list)|record_list|[实体逻辑](module/attendance/attendance_clock_in_record/logic/record_list)|否|||

## 数据权限

##### 我部门的（读） :id=attendance_clock_in_record-MYDEPT_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门 <i class="fa fa-check-square"/></i> 下级部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的班组（读） :id=attendance_clock_in_record-MYGROUP_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的厂商（读） :id=attendance_clock_in_record-MYGYS_R

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('GYS_INFOID','=',#{srf.sessioncontext.srforgsectorid})]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 需求人是我（读） :id=attendance_clock_in_record-XQRSW_R

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('XQSYRID','=',#{srf.sessioncontext.srfuserid})]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CHECKIN_RESULT_EQ|打卡结果|EQ||
|N_CHECKIN_TYPE_EQ|打卡方式|EQ||
|N_CLOCK_TYPE_EQ|打卡类型|EQ||
|N_DEVICE_NAME_EQ|设备名称|EQ||
|N_DEVICE_NAME_LIKE|设备名称|LIKE||
|N_ID_EQ|记录ID|EQ||
|N_MEMBER_ID_EQ|员工ID|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_TERMINAL_ID_EQ|终端设备ID|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 导出打卡记录 | export_report | 导出报表 |无数据|用户自定义||
| 导出列表视图打卡记录 | export_report_list | 导出报表 |无数据|用户自定义||
| 批量补卡 | batchReissue | 批量补卡 |无数据|<details><summary>打开视图或向导（模态）</summary>[批量补卡](app/view/attendance_clock_in_record_reissue_option_view)</details>||
| 删除 | delete | 删除 |多项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)||

## 导出模式

* **数据导出**


<el-descriptions direction="vertical" :column="8" :size="size" border>
<el-descriptions-item label="姓名">-</el-descriptions-item>
<el-descriptions-item label="工号">-</el-descriptions-item>
<el-descriptions-item label="部门">-</el-descriptions-item>
<el-descriptions-item label="打卡时间">-</el-descriptions-item>
<el-descriptions-item label="打卡方式">-</el-descriptions-item>
<el-descriptions-item label="打卡详情">-</el-descriptions-item>
<el-descriptions-item label="打卡备注">-</el-descriptions-item>
<el-descriptions-item label="打卡图片">-</el-descriptions-item>
</el-descriptions>

* **数据导出2**


<el-descriptions direction="vertical" :column="4" :size="size" border>
<el-descriptions-item label="姓名">-</el-descriptions-item>
<el-descriptions-item label="工号">-</el-descriptions-item>
<el-descriptions-item label="部门">-</el-descriptions-item>
<el-descriptions-item label="模版列">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/attendance/attendance_clock_in_record?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_clock_in_record?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_clock_in_record?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_clock_in_record?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_clock_in_record?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_clock_in_record?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_clock_in_record?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_clock_in_record?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_clock_in_record?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_clock_in_record?id=导出模式`">
  导出模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'minor',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>