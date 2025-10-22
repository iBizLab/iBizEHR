# 消息子类型(mail_message_subtype)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|默认|DEFAULT|是否逻辑||是||
|描述|DESCRIPTION|长文本，没有长度限制|1048576|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|隐藏|HIDDEN|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|仅内部的|INTERNAL|是否逻辑||是||
|名称|NAME|文本，可指定长度|200|是||
|上级|PARENT_ID|外键值|100|是||
|关联字段|RELATION_FIELD|文本，可指定长度|500|是||
|模型|RES_MODEL|文本，可指定长度|500|是||
|序列|SEQUENCE|整型||是||
|跟踪收件人|TRACK_RECIPIENTS|是否逻辑||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_LEAVE_TYPE_MAIL_MESSAGE_SUBTYPE_ALLOCATION_NOTIF_SUBTYPE_ID](der/DER1N_HR_LEAVE_TYPE_MAIL_MESSAGE_SUBTYPE_ALLOCATION_NOTIF_SUBTYPE_ID)|[休假类型(HR_LEAVE_TYPE)](module/hr/hr_leave_type)|1:N关系||
|[DER1N_HR_LEAVE_TYPE_MAIL_MESSAGE_SUBTYPE_LEAVE_NOTIF_SUBTYPE_ID](der/DER1N_HR_LEAVE_TYPE_MAIL_MESSAGE_SUBTYPE_LEAVE_NOTIF_SUBTYPE_ID)|[休假类型(HR_LEAVE_TYPE)](module/hr/hr_leave_type)|1:N关系||
|[DER1N_MAIL_MESSAGE_MAIL_MESSAGE_SUBTYPE_SUBTYPE_ID](der/DER1N_MAIL_MESSAGE_MAIL_MESSAGE_SUBTYPE_SUBTYPE_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||
|[DER1N_MAIL_MESSAGE_SUBTYPE_MAIL_MESSAGE_SUBTYPE_PARENT_ID](der/DER1N_MAIL_MESSAGE_SUBTYPE_MAIL_MESSAGE_SUBTYPE_PARENT_ID)|[消息子类型(MAIL_MESSAGE_SUBTYPE)](module/mail/mail_message_subtype)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_MESSAGE_SUBTYPE_MAIL_MESSAGE_SUBTYPE_PARENT_ID](der/DER1N_MAIL_MESSAGE_SUBTYPE_MAIL_MESSAGE_SUBTYPE_PARENT_ID)|[消息子类型(MAIL_MESSAGE_SUBTYPE)](module/mail/mail_message_subtype)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_PARENT_ID_EQ|上级|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_message_subtype?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message_subtype?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message_subtype?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_message_subtype?id=搜索模式`">
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