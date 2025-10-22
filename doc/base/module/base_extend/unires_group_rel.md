# 权限组关联统一资源(unires_group_rel)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|标识|GID|外键值|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|资源代码|RES_CODE|外键值附加数据|200|是||
|统一资源标识|UNIRES_ID|外键值|100|是||
|统一资源名称|UNIRES_NAME|外键值文本|200|是||

<p class="panel-title"><b>联合主键</b></p>

  * `标识(GID)`
  * `统一资源标识(UNIRES_ID)`

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_UNIRES_GROUP_REL_IR_UNIRES_UNIRES_ID](der/DER1N_UNIRES_GROUP_REL_IR_UNIRES_UNIRES_ID)|[统一资源(IR_UNIRES)](module/base_extend/ir_unires)|1:N关系||
|[DER1N_UNIRES_GROUP_REL_RES_GROUPS_GID](der/DER1N_UNIRES_GROUP_REL_RES_GROUPS_GID)|[权限组(RES_GROUPS)](module/base/res_groups)|1:N关系||

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
|[DEFAULT](module/base_extend/unires_group_rel/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base_extend/unires_group_rel/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base_extend/unires_group_rel/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_GID_EQ|标识|EQ||
|N_ID_EQ|标识|EQ||
|N_UNIRES_ID_EQ|统一资源标识|EQ||
|N_UNIRES_NAME_EQ|统一资源名称|EQ||
|N_UNIRES_NAME_LIKE|统一资源名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base_extend/unires_group_rel?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base_extend/unires_group_rel?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base_extend/unires_group_rel?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base_extend/unires_group_rel?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base_extend/unires_group_rel?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base_extend/unires_group_rel?id=搜索模式`">
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