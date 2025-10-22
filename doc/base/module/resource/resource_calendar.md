# 资源工作时间(resource_calendar)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|做假计数|ASSOCIATED_LEAVES_COUNT|整型||是||
|属性|ATTENDANCES|一对多关系数据集合|1048576|是||
|公司|COMPANY_ID|外键值|100|是||
|名称|COMPANY_NAME|外键值文本|200|是||
|# 使用它的合同|CONTRACTS_COUNT|整型||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|灵活时间|FLEXIBLE_HOURS|是否逻辑||是||
|公司全职|FULL_TIME_REQUIRED_HOURS|浮点||是||
|每天平均小时数|HOURS_PER_DAY|浮点||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|双周模式下的日历|TWO_WEEKS_CALENDAR|是否逻辑||是||
|解释|TWO_WEEKS_EXPLANATION|文本，可指定长度|500|是||
|时区偏移|TZ_OFFSET|文本，可指定长度|500|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_EMPLOYEE_BASE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_HR_EMPLOYEE_BASE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|1:N关系||
|[DER1N_HR_EMPLOYEE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_HR_EMPLOYEE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DER1N_RESOURCE_CALENDAR_ATTENDANCE_RESOURCE_CALENDAR_CALENDAR_ID](der/DER1N_RESOURCE_CALENDAR_ATTENDANCE_RESOURCE_CALENDAR_CALENDAR_ID)|[工作细节(RESOURCE_CALENDAR_ATTENDANCE)](module/resource/resource_calendar_attendance)|1:N关系||
|[DER1N_RESOURCE_MIXIN_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_RESOURCE_MIXIN_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[资源装饰(RESOURCE_MIXIN)](module/resource/resource_mixin)|1:N关系||
|[DER1N_RESOURCE_RESOURCE_RESOURCE_CALENDAR_CALENDAR_ID](der/DER1N_RESOURCE_RESOURCE_RESOURCE_CALENDAR_CALENDAR_ID)|[资源(RESOURCE_RESOURCE)](module/resource/resource_resource)|1:N关系||
|[DER1N_RES_COMPANY_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_RES_COMPANY_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RESOURCE_CALENDAR_RES_COMPANY_COMPANY_ID](der/DER1N_RESOURCE_CALENDAR_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||

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
|填充资源工作时间数据|fill_data|[实体处理逻辑](module/resource/resource_calendar/logic/fill_data "填充资源工作时间数据")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[填充资源工作时间数据](module/resource/resource_calendar/logic/fill_data)|fill_data|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/resource/resource_calendar/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/resource/resource_calendar/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/resource/resource_calendar/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_COMPANY_ID_EQ|公司|EQ||
|N_COMPANY_NAME_EQ|名称|EQ||
|N_COMPANY_NAME_LIKE|名称|LIKE||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/resource/resource_calendar?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_calendar?id=搜索模式`">
  搜索模式
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