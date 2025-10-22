# 班次(attendance_shift)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|出勤比率|ATTENDANCE_RATIO|浮点||是||
|创建时间|CREATE_DATE|日期时间型||是||
|创建人|CREATE_UID|文本，可指定长度|100|是||
|默认标识|DEFAULT_FLAG|是否逻辑||是||
|休息结束时间|END_START|时间型||是||
|主键<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|不计入加班的分钟阈值|INVALID_OVERTIME|整型||是||
|班次名称|NAME|文本，可指定长度|255|是||
|排序值|ORDER_VALUE|整型||是||
|加班有效|OVERTIME_VALID|是否逻辑||是||
|公共|PUBLIC_FLAG|是否逻辑||是||
|休息配置启用|REST_ENABLE|是否逻辑||是||
|休息开始时间|REST_START|时间型||是||
|考勤规则ID|RULE_ID|外键值|60|是||
|考勤规则名称|RULE_NAME|外键值文本|255|是||
|班次类型|SCHEDULE_TYPE|文本，可指定长度|100|是||
|时间范围|SCOPES|一对多关系数据集合|1048576|是||
|计入加班的分钟起|START_OVERTIME|整型||是||
|工作日标识|WORKDAY_ID|文本，可指定长度|100|是||
|上下班次数|WORKING_NUMBER|[单项选择(数值)](index/dictionary_index#workingNumber "上下班次数")||是||
|工时|WORK_LOAD|文本，可指定长度|100|是||
|工作时间|WORK_TIME|文本，可指定长度|100|是||
|更新时间|WRITE_DATE|日期时间型||是||
|更新人|WRITE_UID|文本，可指定长度|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_ATTENDANCE_SCOPE_ATTENDANCE_SHIFT_SHIFT_ID](der/DER1N_ATTENDANCE_SCOPE_ATTENDANCE_SHIFT_SHIFT_ID)|[时间范围(ATTENDANCE_SCOPE)](module/attendance/attendance_scope)|1:N关系||
|[DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_SHIFT_SHIFT_ID](der/DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_SHIFT_SHIFT_ID)|[工作日(ATTENDANCE_WORKDAY)](module/attendance/attendance_workday)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_ATTENDANCE_SHIFT_ATTENDANCE_RULE_RULE_ID](der/DER1N_ATTENDANCE_SHIFT_ATTENDANCE_RULE_RULE_ID)|[考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule)|1:N关系||

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
|获取默认班次|GetDefaultShift|[实体处理逻辑](module/attendance/attendance_shift/logic/GetDefaultTemp "获取默认班次临时数据")|默认|不支持||||
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
|修改班次信息|UpdateByType|[实体处理逻辑](module/attendance/attendance_shift/logic/UpdateByType "修改班次信息")|默认|不支持||||
|UpdateTemp|UpdateTemp|内置方法|默认|不支持||||
|UpdateTempMajor|UpdateTempMajor|内置方法|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[nothing](module/attendance/attendance_shift/logic/nothing)|nothing|无|||
|[修改班次信息](module/attendance/attendance_shift/logic/UpdateByType)|UpdateByType|无|||
|[获取默认班次临时数据](module/attendance/attendance_shift/logic/GetDefaultTemp)|GetDefaultTemp|无|||
|[计算上下班时间](module/attendance/attendance_shift/logic/calcWorkTime)|calcWorkTime|属性逻辑|||
|[计算工时](module/attendance/attendance_shift/logic/calcWorkLoad)|calcWorkLoad|属性逻辑|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/attendance/attendance_shift/query/Default)|DEFAULT|是|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/attendance/attendance_shift/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_DEFAULT_FLAG_EQ|默认标识|EQ||
|N_ID_EQ|主键|EQ||
|N_NAME_LIKE|班次名称|LIKE||
|N_PUBLIC_FLAG_EQ|公共|EQ||
|N_RULE_ID_EQ|考勤规则ID|EQ||
|N_RULE_NAME_EQ|考勤规则名称|EQ||
|N_RULE_NAME_LIKE|考勤规则名称|LIKE||
|N_WORKING_NUMBER_EQ|上下班次数|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 修改班次时间 | editScope | 修改班次时间 |单项数据|<details><summary>打开视图或向导（模态）</summary>[上下班时间](app/view/attendance_shift_default_shift_view)</details>||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/attendance/attendance_shift?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_shift?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_shift?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_shift?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_shift?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_shift?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_shift?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_shift?id=界面行为`">
  界面行为
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>