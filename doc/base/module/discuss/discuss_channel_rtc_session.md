# 邮件 RTC 会话(discuss_channel_rtc_session)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|频道|CHANNEL_ID|外键值|100|是||
|频道成员|CHANNEL_MEMBER_ID|外键值|100|否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|250|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|正在发送用户视频|IS_CAMERA_ON|是否逻辑||是||
|禁用来电声音|IS_DEAF|是否逻辑||是||
|麦克风静音|IS_MUTED|是否逻辑||是||
|正在共享屏幕|IS_SCREEN_SHARING_ON|是否逻辑||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_DISCUSS_CHANNEL_MEMBER_DISCUSS_CHANNEL_RTC_SESSION_RTC_INVITING_SESSION_ID](der/DER1N_DISCUSS_CHANNEL_MEMBER_DISCUSS_CHANNEL_RTC_SESSION_RTC_INVITING_SESSION_ID)|[频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_DISCUSS_CHANNEL_RTC_SESSION_DISCUSS_CHANNEL_CHANNEL_ID](der/DER1N_DISCUSS_CHANNEL_RTC_SESSION_DISCUSS_CHANNEL_CHANNEL_ID)|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel)|1:N关系||
|[DER1N_DISCUSS_CHANNEL_RTC_SESSION_DISCUSS_CHANNEL_MEMBER_CHANNEL_MEMBER_ID](der/DER1N_DISCUSS_CHANNEL_RTC_SESSION_DISCUSS_CHANNEL_MEMBER_CHANNEL_MEMBER_ID)|[频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member)|1:N关系||

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
|[DEFAULT](module/discuss/discuss_channel_rtc_session/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/discuss/discuss_channel_rtc_session/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/discuss/discuss_channel_rtc_session/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CHANNEL_ID_EQ|频道|EQ||
|N_CHANNEL_MEMBER_ID_EQ|频道成员|EQ||
|N_ID_EQ|标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/discuss/discuss_channel_rtc_session?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel_rtc_session?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel_rtc_session?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel_rtc_session?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel_rtc_session?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/discuss/discuss_channel_rtc_session?id=搜索模式`">
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