# 工作细节(resource_calendar_attendance)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|资源的日历|CALENDAR_ID|外键值|100|否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|起始日期|DATE_FROM|日期型||是||
|结束日期|DATE_TO|日期型||是||
|星期|DAYOFWEEK|[单项选择(文本值)](index/dictionary_index#resource_calendar_attendance_dayofweek "星期")|60|否||
|日期|DAY_PERIOD|[单项选择(文本值)](index/dictionary_index#resource_calendar_attendance_day_period "日期")|60|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|显示类型|DISPLAY_TYPE|[单项选择(文本值)](index/dictionary_index#resource_calendar_attendance_display_type "显示类型")|60|是||
|持续时间 (天)|DURATION_DAYS|浮点||是||
|时长 (小时)|DURATION_HOURS|浮点||是||
|工作起始|HOUR_FROM|浮点||否||
|工作截止|HOUR_TO|浮点||否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|资源|RESOURCE_ID|外键值|100|是||
|序列|SEQUENCE|整型||是||
|周数|WEEK_TYPE|[单项选择(文本值)](index/dictionary_index#resource_calendar_attendance_week_type "周数")|60|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RESOURCE_CALENDAR_ATTENDANCE_RESOURCE_CALENDAR_CALENDAR_ID](der/DER1N_RESOURCE_CALENDAR_ATTENDANCE_RESOURCE_CALENDAR_CALENDAR_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||
|[DER1N_RESOURCE_CALENDAR_ATTENDANCE_RESOURCE_RESOURCE_RESOURCE_ID](der/DER1N_RESOURCE_CALENDAR_ATTENDANCE_RESOURCE_RESOURCE_RESOURCE_ID)|[资源(RESOURCE_RESOURCE)](module/resource/resource_resource)|1:N关系||

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

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/resource/resource_calendar_attendance/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/resource/resource_calendar_attendance/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/resource/resource_calendar_attendance/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CALENDAR_ID_EQ|资源的日历|EQ||
|N_DAYOFWEEK_EQ|星期|EQ||
|N_DAY_PERIOD_EQ|日期|EQ||
|N_DISPLAY_TYPE_EQ|显示类型|EQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_RESOURCE_ID_EQ|资源|EQ||
|N_WEEK_TYPE_EQ|周数|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/resource/resource_calendar_attendance?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar_attendance?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar_attendance?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar_attendance?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar_attendance?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar_attendance?id=搜索模式`">
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