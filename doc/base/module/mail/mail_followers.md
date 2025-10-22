# 单据关注者(mail_followers)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|外键值文本|200|是||
|相关的业务伙伴|PARTNER_ID|外键值|100|否||
|资源标识|RES_ID|文本，可指定长度|100|是||
|相关的单据模型名称|RES_MODEL|文本，可指定长度|500|否||
|关注类型|TYPE|[单项选择(文本值)](index/dictionary_index#attention_type "关注类型")|60|是||


###### 属性组

<el-row>
<el-tabs v-model="show_field_group">

<el-tab-pane label="联系人标识" name="field_group_partner_id">

|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|相关的业务伙伴|PARTNER_ID|外键值|100|否||

</el-tab-pane>

</el-tabs>
</el-row>

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_FOLLOWERS_RES_PARTNER_PARTNER_ID](der/DER1N_MAIL_FOLLOWERS_RES_PARTNER_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DERCUSTOM_MAIL_FOLLOWERS_MAIL_THREAD](der/DERCUSTOM_MAIL_FOLLOWERS_MAIL_THREAD)|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|自定义关系||

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
|[DEFAULT](module/mail/mail_followers/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_followers/query/View)|VIEW|否|否 |否 ||
|[常规(common)](module/mail/mail_followers/query/common)|common|否|否 |否 ||
|[消息提醒(mail_message_notify)](module/mail/mail_followers/query/mail_message_notify)|mail_message_notify|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_followers/dataset/Default)|DEFAULT|数据查询|是|||
|[常规(common)](module/mail/mail_followers/dataset/common)|common|数据查询|否|||
|[评论提醒(mail_message_attention)](module/mail/mail_followers/dataset/mail_message_attention)|mail_message_attention|数据查询|否|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_EQ|名称|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARTNER_ID_EQ|相关的业务伙伴|EQ||
|N_RES_ID_EQ|资源标识|EQ||
|N_TYPE_EQ|关注类型|EQ||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[关注人员更新(嵌入)](module/mail/mail_followers/uilogic/attention_personnel_update_emb)|attention_personnel_update_emb|获取关注人员信息，并根据类别更新|

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_followers?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_followers?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_followers?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_followers?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_followers?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_followers?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_followers?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'minor',
show_field_group:'field_group_partner_id',

      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>