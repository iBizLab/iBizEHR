# 消息(mail_message)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|审计日志已启动|ACCOUNT_AUDIT_LOG_ACTIVATED|是否逻辑||是||
|描述|ACCOUNT_AUDIT_LOG_PREVIEW|长文本，没有长度限制|1048576|是||
|访客|AUTHOR_GUEST_ID|外键值|100|是||
|作者|AUTHOR_ID|外键值|100|是||
|内容|BODY|HTML文本，没有长度限制|1048576|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|日期|DATE|日期时间型||是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|电子邮件添加签字|EMAIL_ADD_SIGNATURE|是否逻辑||是||
|来自|EMAIL_FROM|文本，可指定长度|500|是||
|布局|EMAIL_LAYOUT_XMLID|文本，可指定长度|500|是||
|收藏计数|FAVORITE_COUNT|继承属性||是||
|有错误|HAS_ERROR|是否逻辑||是||
|有短信息错误|HAS_SMS_ERROR|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是当前用户还是访客作者|IS_CURRENT_USER_OR_GUEST_AUTHOR|是否逻辑||是||
|收藏|IS_FAVORITE|继承属性||是||
|仅限员工|IS_INTERNAL|是否逻辑||是||
|邮件活动类型|MAIL_ACTIVITY_TYPE_ID|外键值|100|是||
|消息ID|MESSAGE_ID|文本，可指定长度|500|是||
|类型|MESSAGE_TYPE|[单项选择(文本值)](index/dictionary_index#mail_message_message_type "类型")|60|否||
|相关单据模型|MODEL|文本，可指定长度|500|是||
|需要行动|NEEDACTION|是否逻辑||是||
|上级消息作者|PARENT_AUTHOR_ID|外键值附加数据|100|是||
|上级消息内容|PARENT_BODY|外键值附加数据|1048576|是||
|上级消息|PARENT_ID|外键值|100|是||
|已置顶|PINNED_AT|日期时间型||是||
|预览|PREVIEW|文本，可指定长度|500|是||
|评级值|RATING_VALUE|浮点||是||
|别名域|RECORD_ALIAS_DOMAIN_ID|外键值|100|是||
|公司|RECORD_COMPANY_ID|外键值|100|是||
|消息记录名称|RECORD_NAME|文本，可指定长度|500|是||
|回复 至|REPLY_TO|文本，可指定长度|500|是||
|无响应|REPLY_TO_FORCE_NEW|是否逻辑||是||
|资源标识|RES_ID|文本，可指定长度|100|是||
|蜗牛邮件错误消息|SNAILMAIL_ERROR|是否逻辑||是||
|星标消息|STARRED|是否逻辑||是||
|主旨|SUBJECT|文本，可指定长度|500|是||
|子类型|SUBTYPE_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_DISCUSS_CHANNEL_MAIL_MESSAGE_FROM_MESSAGE_ID](der/DER1N_DISCUSS_CHANNEL_MAIL_MESSAGE_FROM_MESSAGE_ID)|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_MEMBER_MAIL_MESSAGE_FETCHED_MESSAGE_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_MAIL_MESSAGE_FETCHED_MESSAGE_ID)|[频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_MEMBER_MAIL_MESSAGE_SEEN_MESSAGE_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_MAIL_MESSAGE_SEEN_MESSAGE_ID)|[频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member)|1:N关系||
|[DER1N_MAIL_MESSAGE_MAIL_MESSAGE_PARENT_ID](der/DER1N_MAIL_MESSAGE_MAIL_MESSAGE_PARENT_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||
|[DER1N_MAIL_MESSAGE_RECIPIENT_MAIL_MESSAGE_MESSAGE_ID](der/DER1N_MAIL_MESSAGE_RECIPIENT_MAIL_MESSAGE_MESSAGE_ID)|[消息收件人(MAIL_MESSAGE_RECIPIENT)](module/mail/mail_message_recipient)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_MESSAGE_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_ID](der/DER1N_MAIL_MESSAGE_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_MAIL_MESSAGE_MAIL_ALIAS_DOMAIN_RECORD_ALIAS_DOMAIN_ID](der/DER1N_MAIL_MESSAGE_MAIL_ALIAS_DOMAIN_RECORD_ALIAS_DOMAIN_ID)|[电子邮件域名(MAIL_ALIAS_DOMAIN)](module/mail/mail_alias_domain)|1:N关系||
|[DER1N_MAIL_MESSAGE_MAIL_GUEST_AUTHOR_GUEST_ID](der/DER1N_MAIL_MESSAGE_MAIL_GUEST_AUTHOR_GUEST_ID)|[访客(MAIL_GUEST)](module/mail/mail_guest)|1:N关系||
|[DER1N_MAIL_MESSAGE_MAIL_MESSAGE_PARENT_ID](der/DER1N_MAIL_MESSAGE_MAIL_MESSAGE_PARENT_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||
|[DER1N_MAIL_MESSAGE_MAIL_MESSAGE_SUBTYPE_SUBTYPE_ID](der/DER1N_MAIL_MESSAGE_MAIL_MESSAGE_SUBTYPE_SUBTYPE_ID)|[消息子类型(MAIL_MESSAGE_SUBTYPE)](module/mail/mail_message_subtype)|1:N关系||
|[DER1N_MAIL_MESSAGE_RES_COMPANY_RECORD_COMPANY_ID](der/DER1N_MAIL_MESSAGE_RES_COMPANY_RECORD_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_MAIL_MESSAGE_RES_PARTNER_AUTHOR_ID](der/DER1N_MAIL_MESSAGE_RES_PARTNER_AUTHOR_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DERCUSTOM_MAIL_MESSAGE_MAIL_THREAD](der/DERCUSTOM_MAIL_MESSAGE_MAIL_THREAD)|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|自定义关系||
|[DERMULINH_MAIL_MESSAGE_FAV_FAVORITE_MIXIN](der/DERMULINH_MAIL_MESSAGE_FAV_FAVORITE_MIXIN)|[收藏混合(FAV_FAVORITE_MIXIN)](module/fav/fav_favorite_mixin)|多继承关系（虚拟实体）||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#mail_message_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|添加收藏|add_favorite|继承行为|默认|不支持||||
|删除评论|delete|[实体处理逻辑](module/mail/mail_message/logic/delete "删除评论")|默认|不支持|||删除内容不删除数据|
|置顶|pin|[实体处理逻辑](module/mail/mail_message/logic/pin "置顶")|默认|不支持||||
|移除所有收藏|remove_all_favorites|继承行为|默认|不支持||||
|移除收藏|remove_favorite|继承行为|默认|不支持||||
|取消置顶|unpin|[实体处理逻辑](module/mail/mail_message/logic/unpin "取消置顶")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[删除评论](module/mail/mail_message/logic/delete)|delete|无||评论数据的删除，将评论内容重置为：该评论已删除|
|[取消置顶](module/mail/mail_message/logic/unpin)|unpin|无|||
|[新建评论后通知](module/mail/mail_message/logic/after_create_notify)|after_create_notify|无||发表评论后，发送通知消息至相应负责人员、关注人员|
|[置顶](module/mail/mail_message/logic/pin)|pin|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/mail_message/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_message/query/View)|VIEW|否|否 |否 ||
|[常规(common)](module/mail/mail_message/query/common)|common|否|否 |否 |筛选email\|comment\|auto_comment|
|[常规(全部)(common_all)](module/mail/mail_message/query/common_all)|common_all|否|否 |否 |筛选email\|comment\|auto_comment|
|[当前用户(cur_user)](module/mail/mail_message/query/cur_user)|cur_user|否|否 |否 ||
|[置顶消息(pinned)](module/mail/mail_message/query/pinned)|pinned|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_message/dataset/Default)|DEFAULT|数据查询|是|||
|[常规(common)](module/mail/mail_message/dataset/common)|common|数据查询|否||筛选email\|comment\|auto_comment|
|[常规(全部)(common_all)](module/mail/mail_message/dataset/common_all)|common_all|数据查询|否||筛选email\|comment\|auto_comment|
|[当前用户消息(cur_user)](module/mail/mail_message/dataset/cur_user)|cur_user|数据查询|否|||
|[置顶消息(pinned)](module/mail/mail_message/dataset/pinned)|pinned|数据查询|否|||
## 消息通知

|    中文名col200   | 代码名col150       |  消息队列col200   |  消息模板col200 |  通知目标col150     |  备注col350  |
|------------| -----   |  -------- | -------- |-------- |-------- |
|[评论通知](module/mail/mail_message/notify/message_notify)|message_notify|[默认消息队列](index/notify_index)|[消息通知模板](index/notify_index#mail_notify_templ)|关注人 ||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_AUTHOR_GUEST_ID_EQ|访客|EQ||
|N_AUTHOR_ID_EQ|作者|EQ||
|N_BODY_LIKE|内容|LIKE||
|N_ID_EQ|标识|EQ||
|N_IS_FAVORITE_EQ|收藏|EQ||
|N_MAIL_ACTIVITY_TYPE_ID_EQ|邮件活动类型|EQ||
|N_MESSAGE_TYPE_EQ|类型|EQ||
|N_NEEDACTION_EQ|需要行动|EQ||
|N_PARENT_ID_EQ|上级消息|EQ||
|N_RECORD_ALIAS_DOMAIN_ID_EQ|别名域|EQ||
|N_RECORD_COMPANY_ID_EQ|公司|EQ||
|N_RES_ID_EQ|资源标识|EQ||
|N_SUBTYPE_ID_EQ|子类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 回复 | panel_message_layout_button_calluilogic2_click | 回复 |单项数据|用户自定义||
| 清空评论 | clear_comment | 清空 |无数据|用户自定义||
| 删除评论 | del_comment | 删除评论 |单项数据（主键）|<details><summary>后台调用</summary>[delete](#行为)||
| 编辑 | panel_message_layout_button_calluilogic1_click | 编辑 |单项数据|用户自定义||
| 发送评论 | send_comment | 发送评论 |无数据|用户自定义||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[刷新评论列表](module/mail/mail_message/uilogic/refresh_comment)|refresh_comment|刷新|
|[发送评论](module/mail/mail_message/uilogic/send_comment)|send_comment|发送评论，并关闭评论输入框|
|[回复评论](module/mail/mail_message/uilogic/reply_comment)|reply_comment|获取回复对象评论信息，并展开评论输入框，显示回复组件|
|[控制评论按钮显示](module/mail/mail_message/uilogic/comment_icon_show)|comment_icon_show|显示评论按钮|
|[控制评论按钮隐藏](module/mail/mail_message/uilogic/comment_icon_hidden)|comment_icon_hidden|获取部件状态信息，通过直接赋值，控制指定部件显示隐藏|
|[清空评论](module/mail/mail_message/uilogic/clear_comment)|clear_comment|清空当前输入框内已输入内容|
|[编辑评论](module/mail/mail_message/uilogic/edit_comment)|edit_comment|编辑评论，获取评论数据，展开评论输入框并赋值|

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_message?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message?id=消息通知`">
  消息通知
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message?id=界面逻辑`">
  界面逻辑
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