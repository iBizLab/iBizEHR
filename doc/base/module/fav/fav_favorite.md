# 收藏(fav_favorite)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|描述|DESCRIPTION|长文本，没有长度限制|1048576|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|收藏者|PARTNER_ID|文本，可指定长度|200|是||
|资源标识|RES_ID|文本，可指定长度|100|是||
|资源模型|RES_MODEL|文本，可指定长度|500|是||

<p class="panel-title"><b>联合主键</b></p>

  * `资源模型(RES_MODEL)`
  * `资源标识(RES_ID)`
  * `收藏者(PARTNER_ID)`

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DERCUSTOM_FAV_FAVORITE_FAV_FAVORITEMIXIN](der/DERCUSTOM_FAV_FAVORITE_FAV_FAVORITEMIXIN)|[收藏混合(FAV_FAVORITE_MIXIN)](module/fav/fav_favorite_mixin)|自定义关系||
|[DERCUSTOM_FAV_FAVORITE_RES_PARTNER](der/DERCUSTOM_FAV_FAVORITE_RES_PARTNER)|[联系人(RES_PARTNER)](module/base/res_partner)|自定义关系||

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
|[DEFAULT](module/fav/fav_favorite/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/fav/fav_favorite/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/fav/fav_favorite/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARTNER_ID_EQ|收藏者|EQ||
|N_RES_ID_EQ|资源标识|EQ||
|N_RES_MODEL_EQ|资源模型|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/fav/fav_favorite?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/fav/fav_favorite?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/fav/fav_favorite?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/fav/fav_favorite?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/fav/fav_favorite?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/fav/fav_favorite?id=搜索模式`">
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