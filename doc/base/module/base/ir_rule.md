# 规则(ir_rule)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|域名|DOMAIN_FORCE|长文本，没有长度限制|1048576|是||
|全局|GLOBAL|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|模型|MODEL_ID|文本，可指定长度|200|是||
|名称|NAME|文本，可指定长度|200|是||
|创建|PERM_CREATE|是否逻辑||是||
|读取|PERM_READ|是否逻辑||是||
|删除|PERM_UNLINK|是否逻辑||是||
|写入|PERM_WRITE|是否逻辑||是||
|权限组关联规则|RULE_GROUP_RELS|一对多关系数据集合|1048576|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_RULE_GROUP_REL_IR_RULE_RULE_ID](der/DER1N_RULE_GROUP_REL_IR_RULE_RULE_ID)|[权限组关联规则(RULE_GROUP_REL)](module/base/rule_group_rel)|1:N关系||


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

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[计算全局](module/base/ir_rule/logic/compute_global)|compute_global|属性逻辑|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/ir_rule/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/ir_rule/query/View)|VIEW|否|否 |否 ||
|[全局(global)](module/base/ir_rule/query/global)|global|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/ir_rule/dataset/Default)|DEFAULT|数据查询|是|||
|[全局(global)](module/base/ir_rule/dataset/global)|global|数据查询|否|||
|[模型同步数据集(psmodel_sync)](module/base/ir_rule/dataset/psmodel_sync)|psmodel_sync|数据查询|否|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/ir_rule?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_rule?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_rule?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_rule?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_rule?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_rule?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_rule?id=搜索模式`">
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