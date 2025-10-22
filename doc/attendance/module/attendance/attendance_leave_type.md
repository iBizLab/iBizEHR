# 假期类型(attendance_leave_type)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|全公司适用|ALL_COMPANY|[单项选择(文本值)](index/dictionary_index#leaveScopeType "假期适用范围")|1|否||
|申请单位|ASK_UNIT|[单项选择(文本值)](index/dictionary_index#leave_ask_unit "申请单位类型")|20|否||
|计算方式|CALCULATE_WAY|[单项选择(文本值)](index/dictionary_index#leave_calc_type "假期计算方式")|60|否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|假期余额换算|DAY_TO_HOUR|浮点||是||
|适用部门ID|DEPT_ID|多项选择(数值)||是||
|主键<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|36|否||
|是否默认|IS_DEFAULT|是否逻辑|1|是||
|是否限制最大申请天数|MAX_APPLY_DAY|是否逻辑|1|否||
|名称|NAME|文本，可指定长度|50|否||
|申请限制周期|PERIOD_FROM|[单项选择(文本值)](index/dictionary_index#periodFrom "申请限制周期")|60|是||
|天数/申请限制周期|PERIOD_TO|整型||是||
|状态|STATUS|[是否逻辑](index/dictionary_index#leave_status "假期状态")|1|否||
|类型标识|TYPE|[单项选择(文本值)](index/dictionary_index#holidayType "假期类型")|30|否||
|单位|UNIT|文本，可指定长度|10|是||
|是否带薪|WITH_SALARY|[是否逻辑](index/dictionary_index#with_salary "带薪状态")|1|否||
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

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/attendance/attendance_leave_type/query/Default)|DEFAULT|是|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/attendance/attendance_leave_type/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### 全部数据（读写） :id=attendance_leave_type-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `READ`
* `CREATE`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ASK_UNIT_EQ|申请单位|EQ||
|N_CALCULATE_WAY_EQ|计算方式|EQ||
|N_ID_EQ|主键|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PERIOD_FROM_EQ|申请限制周期|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/attendance/attendance_leave_type?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_leave_type?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_leave_type?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_leave_type?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_leave_type?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_leave_type?id=搜索模式`">
  搜索模式
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