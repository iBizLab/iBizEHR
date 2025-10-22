# 讨论频道(discuss_channel)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|允许公开上传|ALLOW_PUBLIC_UPLOAD|是否逻辑||是||
|附件集合|ATTACHMENTS|继承属性|1048576|是||
|头像缓存键|AVATAR_CACHE_KEY|文本，可指定长度|250|是||
|频道成员|CHANNEL_MEMBERS|一对多关系数据集合|1048576|是||
|频道类型|CHANNEL_TYPE|[单项选择(文本值)](index/dictionary_index#discuss_channel_channel_type "频道类型")|60|否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|默认显示模式|DEFAULT_DISPLAY_MODE|[单项选择(文本值)](index/dictionary_index#discuss_channel_default_display_mode "默认显示模式")|60|是||
|描述|DESCRIPTION|长文本，没有长度限制|1048576|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|250|是||
|关注者|FOLLOWERS|继承属性|1048576|是||
|来自消息|FROM_MESSAGE_ID|外键值|100|是||
|授权群组|GROUP_PUBLIC_ID|外键值|100|是||
|授权群组|GROUP_PUBLIC_NAME|外键值文本|200|是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|邀请URL|INVITATION_URL|文本，可指定长度|250|是||
|能编辑|IS_EDITABLE|是否逻辑||是||
|是会员|IS_MEMBER|是否逻辑||是||
|持续的兴趣|LAST_INTEREST_DT|日期时间型||是||
|成员|MEMBERS|文本，可指定长度|100|是||
|成员计数|MEMBER_COUNT|整型||是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|待处理|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|名称|NAME|文本，可指定长度|200|是||
|父频道|PARENT_CHANNEL_ID|外键值|100|是||
|父频道名称|PARENT_CHANNEL_NAME|外键值文本|200|是||
|Sfu 频道 Uuid|SFU_CHANNEL_UUID|文本，可指定长度|250|是||
|Sfu 服务器网址|SFU_SERVER_URL|文本，可指定长度|250|是||
|UUID|UUID|文本，可指定长度|250|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_DISCUSS_CHANNEL_DISCUSS_CHANNEL_PARENT_CHANNEL_ID](der/DER1N_DISCUSS_CHANNEL_DISCUSS_CHANNEL_PARENT_CHANNEL_ID)|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_MEMBER_DISCUSS_CHANNEL_CHANNEL_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_DISCUSS_CHANNEL_CHANNEL_ID)|[频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_RTC_SESSION_DISCUSS_CHANNEL_CHANNEL_ID](der/DER1N_DISCUSS_CHANNEL_RTC_SESSION_DISCUSS_CHANNEL_CHANNEL_ID)|[邮件 RTC 会话(DISCUSS_CHANNEL_RTC_SESSION)](module/discuss/discuss_channel_rtc_session)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_DISCUSS_CHANNEL_DISCUSS_CHANNEL_PARENT_CHANNEL_ID](der/DER1N_DISCUSS_CHANNEL_DISCUSS_CHANNEL_PARENT_CHANNEL_ID)|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_MAIL_MESSAGE_FROM_MESSAGE_ID](der/DER1N_DISCUSS_CHANNEL_MAIL_MESSAGE_FROM_MESSAGE_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_RES_GROUPS_GROUP_PUBLIC_ID](der/DER1N_DISCUSS_CHANNEL_RES_GROUPS_GROUP_PUBLIC_ID)|[权限组(RES_GROUPS)](module/base/res_groups)|1:N关系||
|[DERMULINH_DISCUSS_CHANNEL_MAIL_THREAD](der/DERMULINH_DISCUSS_CHANNEL_MAIL_THREAD)|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|多继承关系（虚拟实体）||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#discuss_channel_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|退出频道|action_unfollow|[实体处理逻辑](module/discuss/discuss_channel/logic/unfollow "离开频道")|默认|不支持||||
|邀请成员|add_members|[实体处理逻辑](module/discuss/discuss_channel/logic/add_members "添加邀请成员")|默认|不支持||||
|加入频道|channel_join|用户自定义|默认|不支持||||
|加入频道|join_channel|[实体处理逻辑](module/discuss/discuss_channel/logic/fill_default_member "新建后加入频道")|默认|不支持||||
|设置置顶消息|set_message_pin|用户自定义|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[新建后加入频道](module/discuss/discuss_channel/logic/fill_default_member)|fill_default_member|无|||
|[添加邀请成员](module/discuss/discuss_channel/logic/add_members)|add_members|无|||
|[离开频道](module/discuss/discuss_channel/logic/unfollow)|unfollow|无||后续还需补充退订等逻辑|
|[计算是否是频道的成员](module/discuss/discuss_channel/logic/compute_is_member)|compute_is_member|属性逻辑|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/discuss/discuss_channel/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/discuss/discuss_channel/query/View)|VIEW|否|否 |否 ||
|[当前用户加入公共频道(cur_user_public)](module/discuss/discuss_channel/query/cur_user_public)|cur_user_public|否|否 |否 ||
|[群聊和私人频道查询(group_private)](module/discuss/discuss_channel/query/group_private)|group_private|否|否 |否 ||
|[公共频道查询(public)](module/discuss/discuss_channel/query/public)|public|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/discuss/discuss_channel/dataset/Default)|DEFAULT|数据查询|是|||
|[当前用户加入公共频道(cur_user_public)](module/discuss/discuss_channel/dataset/cur_user_public)|cur_user_public|数据查询|否|||
|[群聊和私人频道查询(group_private)](module/discuss/discuss_channel/dataset/group_private)|group_private|数据查询|否|||
|[公共频道查询(public)](module/discuss/discuss_channel/dataset/public)|public|数据查询|否|||

## 数据权限

##### discuss_channel_user :id=discuss_channel-discuss_channel_user

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `CREATE`
* `UPDATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CHANNEL_TYPE_EQ|频道类型|EQ||
|N_DEFAULT_DISPLAY_MODE_EQ|默认显示模式|EQ||
|N_FROM_MESSAGE_ID_EQ|来自消息|EQ||
|N_GROUP_PUBLIC_ID_EQ|授权群组|EQ||
|N_GROUP_PUBLIC_NAME_EQ|授权群组|EQ||
|N_GROUP_PUBLIC_NAME_LIKE|授权群组|LIKE||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARENT_CHANNEL_ID_EQ|父频道|EQ||
|N_PARENT_CHANNEL_NAME_EQ|父频道名称|EQ||
|N_PARENT_CHANNEL_NAME_LIKE|父频道名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/discuss/discuss_channel?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel?id=搜索模式`">
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