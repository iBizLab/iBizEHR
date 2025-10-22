# 活动计划模板(mail_activity_plan_template)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|活动类型|ACTIVITY_TYPE_ID|外键值|100|否||
|活动类型|ACTIVITY_TYPE_NAME|外键值文本|200|否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|间隔|DELAY_COUNT|整型||是||
|触发方式|DELAY_FROM|[单项选择(文本值)](index/dictionary_index#mail_activity_plan_template_delay_from "触发方式")|60|否||
|延迟单位|DELAY_UNIT|[单项选择(文本值)](index/dictionary_index#mail_activity_plan_template_delay_unit "延迟单位")|60|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|备注|NOTE|HTML文本，没有长度限制|1048576|是||
|计划|PLAN_ID|外键值|100|否||
|计划|PLAN_NAME|外键值文本|200|否||
|分派给|RESPONSIBLE_ID|外键值|100|是||
|分派给|RESPONSIBLE_NAME|外键值文本|200|是||
|指派|RESPONSIBLE_TYPE|[单项选择(文本值)](index/dictionary_index#mail_activity_plan_template_responsible_type "指派")|60|否||
|序列|SEQUENCE|整型||是||
|摘要|SUMMARY|文本，可指定长度|500|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_ACTIVITY_PLAN_TEMPLATE_MAIL_ACTIVITY_PLAN_PLAN_ID](der/DER1N_MAIL_ACTIVITY_PLAN_TEMPLATE_MAIL_ACTIVITY_PLAN_PLAN_ID)|[活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan)|1:N关系||
|[DER1N_MAIL_ACTIVITY_PLAN_TEMPLATE_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID](der/DER1N_MAIL_ACTIVITY_PLAN_TEMPLATE_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_MAIL_ACTIVITY_PLAN_TEMPLATE_RES_USERS_RESPONSIBLE_ID](der/DER1N_MAIL_ACTIVITY_PLAN_TEMPLATE_RES_USERS_RESPONSIBLE_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|移动位置|MoveOrder|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/mail_activity_plan_template/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_activity_plan_template/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_activity_plan_template/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_TYPE_ID_EQ|活动类型|EQ||
|N_ACTIVITY_TYPE_NAME_EQ|活动类型|EQ||
|N_ACTIVITY_TYPE_NAME_LIKE|活动类型|LIKE||
|N_DELAY_FROM_EQ|触发方式|EQ||
|N_DELAY_UNIT_EQ|延迟单位|EQ||
|N_ID_EQ|标识|EQ||
|N_PLAN_ID_EQ|计划|EQ||
|N_PLAN_NAME_EQ|计划|EQ||
|N_PLAN_NAME_LIKE|计划|LIKE||
|N_RESPONSIBLE_ID_EQ|分派给|EQ||
|N_RESPONSIBLE_NAME_EQ|分派给|EQ||
|N_RESPONSIBLE_NAME_LIKE|分派给|LIKE||
|N_RESPONSIBLE_TYPE_EQ|指派|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_activity_plan_template?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_plan_template?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_plan_template?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_plan_template?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_plan_template?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_plan_template?id=搜索模式`">
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