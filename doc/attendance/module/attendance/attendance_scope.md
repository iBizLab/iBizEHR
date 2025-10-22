# 时间范围(attendance_scope)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|创建时间|CREATE_DATE|日期时间型||是||
|创建人|CREATE_UID|文本，可指定长度|100|是||
|最早打卡时间|EARLIEST_CHECKIN|整型||是||
|缺勤判定阈值|EARLY_FOR_ABSENTEEISM|整型||是||
|早退判定阈值|EARLY_FOR_EARLY|整型||是||
|结束基准时间（分钟）|END_BASE_TIME|时间型||是||
|主键<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|最晚打卡时间|LATEST_CHECKOUT|整型||是||
|缺勤判定阈值|LATE_FOR_ABSENTEEISM|整型||是||
|迟到判定阈值|LATE_FOR_LATE|整型||是||
|范围名称|NAME|文本，可指定长度|255|是||
|次日标记|NEXT_TAG|文本，可指定长度|100|是||
|排序值|ORDER_VALUE|整型||是||
|班次ID|SHIFT_ID|外键值|60|是||
|班次名称|SHIFT_NAME|外键值文本|255|是||
|开始基准时间（分钟）|START_BASE_TIME|时间型||是||
|更新时间|WRITE_DATE|日期时间型||是||
|更新人|WRITE_UID|文本，可指定长度|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_ATTENDANCE_SCOPE_ATTENDANCE_SHIFT_SHIFT_ID](der/DER1N_ATTENDANCE_SCOPE_ATTENDANCE_SHIFT_SHIFT_ID)|[班次(ATTENDANCE_SHIFT)](module/attendance/attendance_shift)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|CreateTemp|CreateTemp|内置方法|默认|不支持||||
|CreateTempMajor|CreateTempMajor|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|GetDraftTemp|GetDraftTemp|内置方法|默认|不支持||||
|GetDraftTempMajor|GetDraftTempMajor|内置方法|默认|不支持||||
|GetTemp|GetTemp|内置方法|默认|不支持||||
|GetTempMajor|GetTempMajor|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|RemoveTemp|RemoveTemp|内置方法|默认|支持||||
|RemoveTempMajor|RemoveTempMajor|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|UpdateTemp|UpdateTemp|内置方法|默认|不支持||||
|UpdateTempMajor|UpdateTempMajor|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/attendance/attendance_scope/query/Default)|DEFAULT|是|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/attendance/attendance_scope/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|主键|EQ||
|N_NAME_LIKE|范围名称|LIKE||
|N_SHIFT_ID_EQ|班次ID|EQ||
|N_SHIFT_NAME_EQ|班次名称|EQ||
|N_SHIFT_NAME_LIKE|班次名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/attendance/attendance_scope?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_scope?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_scope?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_scope?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_scope?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_scope?id=搜索模式`">
  搜索模式
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