# 考勤申请记录(attendance_checkin_application)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|申请人|APPLICANT_ID|外键值|60|否||
|申请人姓名|APPLICANT_NAME|外键值文本|255|是||
|申请类型|APPLY_TYPE|[单项选择(文本值)](index/dictionary_index#attendance_type "考勤申请类型")|60|否||
|审批人ID|APPROVER_ID|文本，可指定长度|100|是||
|审批人|APPROVER_NAME|文本，可指定长度|100|是||
|抄送人|COPY_GIVE|文本，可指定长度|100|是||
|抄送人名称|COPY_GIVE_NAMES|文本，可指定长度|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|天数|DAYS|浮点||是||
|出发城市|DEPARTURE_CITY|文本，可指定长度|100|是||
|部门ID|DEPT_ID|外键值附加数据|60|是||
|部门|DEPT_NAME|外键值附加数据|255|是||
|目的城市|DESTINATION_CITY|文本，可指定长度|100|是||
|工号|EMPLOYEE_NUM|外键值附加数据|20|是||
|结束时间|END_TIME|日期时间型||是||
|外出地|GO_OUT_PLACE|文本，可指定长度|100|是||
|小时数|HOURS|浮点||是||
|主键<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|否||
|假期类型|LEAVE_TYPE|[单项选择(文本值)](index/dictionary_index#holidayType "假期类型")|60|是||
|分钟数|MINUTES|浮点||是||
|名称|NAME|文本，可指定长度|200|是||
|加班类型|OVERTIME_TYPE|[文本，可指定长度](index/dictionary_index#overtime_kind "加班种类")|100|是||
|申请说明|REASON|长文本，长度1000|2000|是||
|补卡日期|REISSUE_DATE|日期型||是||
|补卡时间|REISSUE_TIME|时间型||是||
|开始时间|START_TIME|日期时间型||是||
|状态|STATUS|[单项选择(文本值)](index/dictionary_index#application_status "申请状态")|60|否||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_ATTENDANCE_CHECKIN_APPLICATION_EMPLOYEE_APPLICANT_ID](der/DER1N_ATTENDANCE_CHECKIN_APPLICATION_EMPLOYEE_APPLICANT_ID)|[员工信息(EMPLOYEE)](module/employee_management/employee)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

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
|申请作废|cancellation|[实体处理逻辑](module/attendance/attendance_checkin_application/logic/cancellation "申请作废")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[申请作废](module/attendance/attendance_checkin_application/logic/cancellation)|cancellation|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/attendance/attendance_checkin_application/query/Default)|DEFAULT|是|否 |否 ||
|[正常(normal)](module/attendance/attendance_checkin_application/query/normal)|normal|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/attendance/attendance_checkin_application/dataset/Default)|DEFAULT|数据查询|是|||
|[正常(normal)](module/attendance/attendance_checkin_application/dataset/normal)|normal|数据查询|否|||

## 数据权限

##### 我创建的（读写） :id=attendance_checkin_application-CURDRAFTMAN_RW

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('CREATE_UID','=',#{srf.sessioncontext.srfpersonid})]`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `UPDATE`
* `DELETE`
* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_APPLICANT_ID_EQ|申请人|EQ||
|N_APPLICANT_NAME_EQ|申请人姓名|EQ||
|N_APPLICANT_NAME_LIKE|申请人姓名|LIKE||
|N_APPLY_TYPE_EQ|申请类型|EQ||
|N_APPLY_TYPE_LIKE|申请类型|LIKE||
|N_ID_EQ|主键|EQ||
|N_LEAVE_TYPE_EQ|假期类型|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_STATUS_EQ|状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 申请作废 | cancellation | 作废 |单项数据|<details><summary>后台调用</summary>[cancellation](#行为)||

## 导入模式

* **数据导入**


<el-descriptions direction="vertical" :column="7" :size="size" border>
<el-descriptions-item label="姓名">-</el-descriptions-item>
<el-descriptions-item label="工号">-</el-descriptions-item>
<el-descriptions-item label="部门">-</el-descriptions-item>
<el-descriptions-item label="审批类型">-</el-descriptions-item>
<el-descriptions-item label="申请说明">-</el-descriptions-item>
<el-descriptions-item label="审批人">-</el-descriptions-item>
<el-descriptions-item label="抄送人">-</el-descriptions-item>
</el-descriptions>

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/attendance/attendance_checkin_application?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_checkin_application?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_checkin_application?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_checkin_application?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_checkin_application?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_checkin_application?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_checkin_application?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_checkin_application?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_checkin_application?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_checkin_application?id=导入模式`">
  导入模式
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