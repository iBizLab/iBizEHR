# 权限组(res_groups)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|API 密钥最长有效期（天）|API_KEY_DURATION|浮点||是||
|应用|CATEGORY_ID|外键值|100|是||
|应用|CATEGORY_NAME|外键值文本|200|是||
|颜色索引|COLOR|整型||是||
|评论|COMMENT|长文本，没有长度限制|1048576|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|组名称|FULL_NAME|文本，可指定长度|500|是||
|权限组用户|GROUPS_USERS_RELS|一对多关系数据集合|1048576|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|规则权限引用|RULE_GROUP_RELS|一对多关系数据集合|1048576|是||
|共享组|SHARE|是否逻辑||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_DISCUSS_CHANNEL_RES_GROUPS_GROUP_PUBLIC_ID](der/DER1N_DISCUSS_CHANNEL_RES_GROUPS_GROUP_PUBLIC_ID)|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel)|1:N关系||
|[DER1N_IR_MODEL_ACCESS_RES_GROUPS_GROUP_ID](der/DER1N_IR_MODEL_ACCESS_RES_GROUPS_GROUP_ID)|[模型访问(IR_MODEL_ACCESS)](module/base/ir_model_access)|1:N关系||
|[DER1N_RES_GROUPS_IMPLIED_REL_RES_GROUPS_GID](der/DER1N_RES_GROUPS_IMPLIED_REL_RES_GROUPS_GID)|[权限组继承(RES_GROUPS_IMPLIED_REL)](module/base/res_groups_implied_rel)|1:N关系||
|[DER1N_RES_GROUPS_IMPLIED_REL_RES_GROUPS_HID](der/DER1N_RES_GROUPS_IMPLIED_REL_RES_GROUPS_HID)|[权限组继承(RES_GROUPS_IMPLIED_REL)](module/base/res_groups_implied_rel)|1:N关系||
|[DER1N_RES_GROUPS_USERS_REL_RES_GROUPS_GID](der/DER1N_RES_GROUPS_USERS_REL_RES_GROUPS_GID)|[权限组成员(RES_GROUPS_USERS_REL)](module/base/res_groups_users_rel)|1:N关系||
|[DER1N_RULE_GROUP_REL_RES_GROUPS_GID](der/DER1N_RULE_GROUP_REL_RES_GROUPS_GID)|[权限组关联规则(RULE_GROUP_REL)](module/base/rule_group_rel)|1:N关系||
|[DER1N_UNIRES_GROUP_REL_RES_GROUPS_GID](der/DER1N_UNIRES_GROUP_REL_RES_GROUPS_GID)|[权限组关联统一资源(UNIRES_GROUP_REL)](module/base_extend/unires_group_rel)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_RES_GROUPS_IR_MODULE_CATEGORY_CATEGORY_ID](der/DER1N_RES_GROUPS_IR_MODULE_CATEGORY_CATEGORY_ID)|[应用(IR_MODULE_CATEGORY)](module/base/ir_module_category)|1:N关系||

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
|[组名称计算](module/base/res_groups/logic/compute_full_name)|compute_full_name|属性逻辑|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/res_groups/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/res_groups/query/View)|VIEW|否|否 |否 ||
|[当前用户权限组(cur_user_ref)](module/base/res_groups/query/cur_user_ref)|cur_user_ref|否|否 |否 ||
|[用户归属组(user_ref)](module/base/res_groups/query/user_ref)|user_ref|否|否 |否 ||
|[包含嵌套数据(with_nested)](module/base/res_groups/query/with_nested)|with_nested|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/res_groups/dataset/Default)|DEFAULT|数据查询|是|||
|[当前用户权限组(cur_user_ref)](module/base/res_groups/dataset/cur_user_ref)|cur_user_ref|数据查询|否|||
|[模型同步数据集(psmodel_sync)](module/base/res_groups/dataset/psmodel_sync)|psmodel_sync|数据查询|否|||
|[用户归属组(user_ref)](module/base/res_groups/dataset/user_ref)|user_ref|数据查询|否|||
|[包含嵌套数据(with_nested)](module/base/res_groups/dataset/with_nested)|with_nested|数据查询|否|||

## 数据权限

##### res_groups_group_user :id=res_groups-res_groups_group_user

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CATEGORY_ID_EQ|应用|EQ||
|N_CATEGORY_NAME_EQ|应用|EQ||
|N_CATEGORY_NAME_LIKE|应用|LIKE||
|N_GROUPS_USERS_RELS_EXISTS__N_USER_ID_EQ|权限组用户|EXISTS||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_groups?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_groups?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_groups?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_groups?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_groups?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_groups?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_groups?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_groups?id=搜索模式`">
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