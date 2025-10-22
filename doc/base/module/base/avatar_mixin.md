# 头像混合(avatar_mixin)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|头像|AVATAR|文本，可指定长度|500|是||
|头像1024|AVATAR_1024|文本，可指定长度|500|是||
|头像128|AVATAR_128|文本，可指定长度|500|是||
|头像256|AVATAR_256|文本，可指定长度|500|是||
|头像512|AVATAR_512|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|头像|IMAGE|继承属性|500|是||
|图片1024|IMAGE_1024|继承属性|500|是||
|图片128|IMAGE_128|继承属性|500|是||
|图片256|IMAGE_256|继承属性|500|是||
|图片512|IMAGE_512|继承属性|500|是||
|名称|NAME|文本，可指定长度|200|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERMULINH_HR_EMPLOYEE_AVATAR_MIXIN](der/DERMULINH_HR_EMPLOYEE_AVATAR_MIXIN)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|多继承关系（虚拟实体）||
|[DERMULINH_RES_PARTNER_AVATAR_MIXIN](der/DERMULINH_RES_PARTNER_AVATAR_MIXIN)|[联系人(RES_PARTNER)](module/base/res_partner)|多继承关系（虚拟实体）||
|[DERMULINH_RES_USERS_AVATAR_MIXIN](der/DERMULINH_RES_USERS_AVATAR_MIXIN)|[用户(RES_USERS)](module/base/res_users)|多继承关系（虚拟实体）||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DERMULINH_AVATAR_MIXIN_IMAGE_MIXIN](der/DERMULINH_AVATAR_MIXIN_IMAGE_MIXIN)|[图片混合(IMAGE_MIXIN)](module/base/image_mixin)|多继承关系（虚拟实体）||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#avatar_mixin_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#avatar_mixin_Update)|||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[存储头像](module/base/avatar_mixin/logic/save_avater)|save_avater|无|||
|[计算头像](module/base/avatar_mixin/logic/compute_avatar)|compute_avatar|属性逻辑|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/avatar_mixin/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/avatar_mixin/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/avatar_mixin/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/avatar_mixin?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/avatar_mixin?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/avatar_mixin?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/avatar_mixin?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/base/avatar_mixin?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/avatar_mixin?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/avatar_mixin?id=搜索模式`">
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