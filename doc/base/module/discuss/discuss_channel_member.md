# 频道成员(discuss_channel_member)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|频道|CHANNEL_ID|外键值|100|否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|自定义频道名称|CUSTOM_CHANNEL_NAME|文本，可指定长度|250|是||
|定制通知|CUSTOM_NOTIFICATIONS|[单项选择(文本值)](index/dictionary_index#discuss_channel_member_custom_notifications "定制通知")|60|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|250|是||
|最后一次提取|FETCHED_MESSAGE_ID|外键值|100|是||
|对话收拢状态|FOLD_STATE|[单项选择(文本值)](index/dictionary_index#discuss_channel_member_fold_state "对话收拢状态")|60|是||
|访客|GUEST_ID|外键值|100|是||
|访客|GUEST_NAME|外键值文本|200|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是否置顶|IS_PINNED|是否逻辑||是||
|是自我|IS_SELF|是否逻辑||是||
|持续的兴趣|LAST_INTEREST_DT|日期时间型||是||
|上次查看日期|LAST_SEEN_DT|日期时间型||是||
|未读消息数|MESSAGE_UNREAD_COUNTER|整型||是||
|静音通知，直到|MUTE_UNTIL_DT|日期时间型||是||
|新信息分割符|NEW_MESSAGE_SEPARATOR|整型||否||
|合作伙伴|PARTNER_ID|外键值|100|是||
|合作伙伴|PARTNER_NAME|外键值文本|200|是||
|振铃会话|RTC_INVITING_SESSION_ID|外键值|100|是||
|最近一次查阅|SEEN_MESSAGE_ID|外键值|100|是||
|取消置顶日期|UNPIN_DT|日期时间型||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||

<p class="panel-title"><b>联合主键</b></p>

  * `频道(CHANNEL_ID)`
  * `合作伙伴(PARTNER_ID)`

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_DISCUSS_CHANNEL_RTC_SESSION_DISCUSS_CHANNEL_MEMBER_CHANNEL_MEMBER_ID](der/DER1N_DISCUSS_CHANNEL_RTC_SESSION_DISCUSS_CHANNEL_MEMBER_CHANNEL_MEMBER_ID)|[邮件 RTC 会话(DISCUSS_CHANNEL_RTC_SESSION)](module/discuss/discuss_channel_rtc_session)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_DISCUSS_CHANNEL_MEMBER_DISCUSS_CHANNEL_CHANNEL_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_DISCUSS_CHANNEL_CHANNEL_ID)|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_MEMBER_DISCUSS_CHANNEL_RTC_SESSION_RTC_INVITING_SESSION_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_DISCUSS_CHANNEL_RTC_SESSION_RTC_INVITING_SESSION_ID)|[邮件 RTC 会话(DISCUSS_CHANNEL_RTC_SESSION)](module/discuss/discuss_channel_rtc_session)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_MEMBER_MAIL_GUEST_GUEST_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_MAIL_GUEST_GUEST_ID)|[访客(MAIL_GUEST)](module/mail/mail_guest)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_MEMBER_MAIL_MESSAGE_FETCHED_MESSAGE_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_MAIL_MESSAGE_FETCHED_MESSAGE_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_MEMBER_MAIL_MESSAGE_SEEN_MESSAGE_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_MAIL_MESSAGE_SEEN_MESSAGE_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_MEMBER_RES_PARTNER_PARTNER_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_RES_PARTNER_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||

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
|[DEFAULT](module/discuss/discuss_channel_member/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/discuss/discuss_channel_member/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/discuss/discuss_channel_member/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### discuss_channel_member_user :id=discuss_channel_member-discuss_channel_member_user

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `DELETE`
* `READ`
* `CREATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CHANNEL_ID_EQ|频道|EQ||
|N_CUSTOM_NOTIFICATIONS_EQ|定制通知|EQ||
|N_FETCHED_MESSAGE_ID_EQ|最后一次提取|EQ||
|N_FOLD_STATE_EQ|对话收拢状态|EQ||
|N_GUEST_ID_EQ|访客|EQ||
|N_GUEST_NAME_EQ|访客|EQ||
|N_GUEST_NAME_LIKE|访客|LIKE||
|N_ID_EQ|标识|EQ||
|N_PARTNER_ID_EQ|合作伙伴|EQ||
|N_PARTNER_NAME_EQ|合作伙伴|EQ||
|N_PARTNER_NAME_LIKE|合作伙伴|LIKE||
|N_RTC_INVITING_SESSION_ID_EQ|振铃会话|EQ||
|N_SEEN_MESSAGE_ID_EQ|最近一次查阅|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/discuss/discuss_channel_member?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel_member?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel_member?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel_member?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel_member?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel_member?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel_member?id=搜索模式`">
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