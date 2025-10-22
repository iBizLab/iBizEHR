# 休假详细信息(resource_calendar_leaves)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|工作时间|CALENDAR_ID|外键值|100|是||
|工作时间名称|CALENDAR_NAME|外键值文本|200|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|开始日期|DATE_FROM|日期时间型||否||
|结束日期|DATE_TO|日期时间型||否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|休假要求|HOLIDAY_ID|外键值|100|是||
|节假日类型|HOLIDAY_TYPE|[外键值附加数据](index/dictionary_index#holiday "节假日")|100|是||
|休假要求|HOLNAMEAY_NAME|外键值文本|200|是||
|主键<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|名称|NAME|文本，可指定长度|200|是||
|时间类型|TIME_TYPE|[单项选择(文本值)](index/dictionary_index#resource_calendar_leaves_time_type "时间类型")|60|是||
|主键|TYPE_ID|外键值|60|是||
|名称|TYPE_NAME|外键值文本|200|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RESOURCE_CALENDAR_LEAVES_HR_LEAVE_HOLIDAY_ID](der/DER1N_RESOURCE_CALENDAR_LEAVES_HR_LEAVE_HOLIDAY_ID)|[休假(HR_LEAVE)](module/hr/hr_leave)|1:N关系||
|[DER1N_RESOURCE_CALENDAR_LEAVES_PUBLIC_LEAVE_TYPE_TYPE_ID](der/DER1N_RESOURCE_CALENDAR_LEAVES_PUBLIC_LEAVE_TYPE_TYPE_ID)|[公共假期类型(PUBLIC_LEAVE_TYPE)](module/resource/public_leave_type)|1:N关系||
|[DER1N_RESOURCE_CALENDAR_LEAVES_RESOURCE_CALENDAR_CALENDAR_ID](der/DER1N_RESOURCE_CALENDAR_LEAVES_RESOURCE_CALENDAR_CALENDAR_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||

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
|获取节假日|aSyncHolidays|用户自定义|默认|不支持||[SyncHolidaysDEActionRuntime](index/plugin_index#SyncHolidaysDEActionRuntime)||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[获取公共节假日](module/resource/resource_calendar_leaves/logic/calcHoliday)|calcHoliday|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/resource/resource_calendar_leaves/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/resource/resource_calendar_leaves/query/View)|VIEW|否|否 |否 ||
|[公共节假日(PUBLIC)](module/resource/resource_calendar_leaves/query/public)|PUBLIC|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/resource/resource_calendar_leaves/dataset/Default)|DEFAULT|数据查询|是|||
|[公共节假日(PUBLIC)](module/resource/resource_calendar_leaves/dataset/public)|PUBLIC|数据查询|否|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CALENDAR_ID_EQ|工作时间|EQ||
|N_CALENDAR_NAME_EQ|工作时间名称|EQ||
|N_CALENDAR_NAME_LIKE|工作时间名称|LIKE||
|N_DATE_FROM_GTANDEQ|开始日期|GTANDEQ||
|N_DATE_FROM_LTANDEQ|开始日期|LTANDEQ||
|N_DATE_TO_GTANDEQ|结束日期|GTANDEQ||
|N_DATE_TO_LTANDEQ|结束日期|LTANDEQ||
|N_HOLIDAY_ID_EQ|休假要求|EQ||
|N_HOLNAMEAY_NAME_EQ|休假要求|EQ||
|N_HOLNAMEAY_NAME_LIKE|休假要求|LIKE||
|N_ID_EQ|主键|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_TIME_TYPE_EQ|时间类型|EQ||
|N_TYPE_ID_EQ|主键|EQ||
|N_TYPE_NAME_EQ|名称|EQ||
|N_TYPE_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/resource/resource_calendar_leaves?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar_leaves?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar_leaves?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar_leaves?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar_leaves?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar_leaves?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar_leaves?id=搜索模式`">
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