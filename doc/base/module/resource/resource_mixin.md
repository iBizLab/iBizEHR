# 资源装饰(resource_mixin)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|公司|COMPANY_ID|外键值|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|工作时间|RESOURCE_CALENDAR_ID|外键值|100|是||
|资源|RESOURCE_ID|外键值|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERMULINH_HR_EMPLOYEE_RESOURCE_MIXIN](der/DERMULINH_HR_EMPLOYEE_RESOURCE_MIXIN)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|多继承关系（虚拟实体）||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RESOURCE_MIXIN_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_RESOURCE_MIXIN_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||
|[DER1N_RESOURCE_MIXIN_RESOURCE_RESOURCE_RESOURCE_ID](der/DER1N_RESOURCE_MIXIN_RESOURCE_RESOURCE_RESOURCE_ID)|[资源(RESOURCE_RESOURCE)](module/resource/resource_resource)|1:N关系||
|[DER1N_RESOURCE_MIXIN_RES_COMPANY_COMPANY_ID](der/DER1N_RESOURCE_MIXIN_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#resource_mixin_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[新建逻辑](module/resource/resource_mixin/logic/prepare_create)|prepare_create|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/resource/resource_mixin/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/resource/resource_mixin/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/resource/resource_mixin/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_COMPANY_ID_EQ|公司|EQ||
|N_ID_EQ|标识|EQ||
|N_RESOURCE_CALENDAR_ID_EQ|工作时间|EQ||
|N_RESOURCE_ID_EQ|资源|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/resource/resource_mixin?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_mixin?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_mixin?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_mixin?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_mixin?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_mixin?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/resource/resource_mixin?id=搜索模式`">
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