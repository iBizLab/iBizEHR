# 活动类型(mail_activity_type)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|操作|CATEGORY|[单项选择(文本值)](index/dictionary_index#mail_activity_type_category "操作")|60|是||
|链接类型|CHAINING_TYPE|[单项选择(文本值)](index/dictionary_index#mail_activity_type_chaining_type "链接类型")|60|否||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|排版类型|DECORATION_TYPE|[单项选择(文本值)](index/dictionary_index#mail_activity_type_decoration_type "排版类型")|60|是||
|默认备注|DEFAULT_NOTE|HTML文本，没有长度限制|1048576|是||
|默认用户|DEFAULT_USER_ID|外键值|100|是||
|安排|DELAY_COUNT|整型||是||
|延迟类型|DELAY_FROM|[单项选择(文本值)](index/dictionary_index#mail_activity_type_delay_from "延迟类型")|60|否||
|延迟标签|DELAY_LABEL|文本，可指定长度|500|是||
|延迟单位|DELAY_UNIT|[单项选择(文本值)](index/dictionary_index#mail_activity_type_delay_unit "延迟单位")|60|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|图标|ICON|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|保持完成|KEEP_DONE|是否逻辑||是||
|名称|NAME|文本，可指定长度|200|是||
|资源模型|RES_MODEL|文本，可指定长度|200|是||
|模型已更改|RES_MODEL_CHANGE|是否逻辑||是||
|序列|SEQUENCE|整型||是||
|默认摘要|SUMMARY|文本，可指定长度|500|是||
|触发方式|TRIGGERED_NEXT_TYPE_ID|外键值|100|是||
|触发方式|TRIGGERED_NEXT_TYPE_NAME|外键值文本|200|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID](der/DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID)|[活动(MAIL_ACTIVITY)](module/mail/mail_activity)|1:N关系||
|[DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_PREVIOUS_ACTIVITY_TYPE_ID](der/DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_PREVIOUS_ACTIVITY_TYPE_ID)|[活动(MAIL_ACTIVITY)](module/mail/mail_activity)|1:N关系||
|[DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_RECOMMENDED_ACTIVITY_TYPE_ID](der/DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_RECOMMENDED_ACTIVITY_TYPE_ID)|[活动(MAIL_ACTIVITY)](module/mail/mail_activity)|1:N关系||
|[DER1N_MAIL_ACTIVITY_PLAN_TEMPLATE_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID](der/DER1N_MAIL_ACTIVITY_PLAN_TEMPLATE_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID)|[活动计划模板(MAIL_ACTIVITY_PLAN_TEMPLATE)](module/mail/mail_activity_plan_template)|1:N关系||
|[DER1N_MAIL_ACTIVITY_SCHEDULE_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID](der/DER1N_MAIL_ACTIVITY_SCHEDULE_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID)|[活动日程计划向导(MAIL_ACTIVITY_SCHEDULE)](module/mail/mail_activity_schedule)|1:N关系||
|[DER1N_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_TRIGGERED_NEXT_TYPE_ID](der/DER1N_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_TRIGGERED_NEXT_TYPE_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_MAIL_MESSAGE_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_ID](der/DER1N_MAIL_MESSAGE_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_ID)|[消息(MAIL_MESSAGE)](module/mail/mail_message)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_TRIGGERED_NEXT_TYPE_ID](der/DER1N_MAIL_ACTIVITY_TYPE_MAIL_ACTIVITY_TYPE_TRIGGERED_NEXT_TYPE_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_MAIL_ACTIVITY_TYPE_RES_USERS_DEFAULT_USER_ID](der/DER1N_MAIL_ACTIVITY_TYPE_RES_USERS_DEFAULT_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|获取到期日期|get_date_deadline|[实体处理逻辑](module/mail/mail_activity_type/logic/get_date_deadline "获取到期日期")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[获取到期日期](module/mail/mail_activity_type/logic/get_date_deadline)|get_date_deadline|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/mail_activity_type/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_activity_type/query/View)|VIEW|否|否 |否 ||
|[资源类型及系统(res_and_sys)](module/mail/mail_activity_type/query/res_and_sys)|res_and_sys|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_activity_type/dataset/Default)|DEFAULT|数据查询|是|||
|[资源类型及系统(res_and_sys)](module/mail/mail_activity_type/dataset/res_and_sys)|res_and_sys|数据查询|否|||

## 数据权限

##### mail_activity_type_user :id=mail_activity_type-mail_activity_type_user

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CATEGORY_EQ|操作|EQ||
|N_CHAINING_TYPE_EQ|链接类型|EQ||
|N_DECORATION_TYPE_EQ|排版类型|EQ||
|N_DEFAULT_USER_ID_EQ|默认用户|EQ||
|N_DELAY_FROM_EQ|延迟类型|EQ||
|N_DELAY_UNIT_EQ|延迟单位|EQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_TRIGGERED_NEXT_TYPE_ID_EQ|触发方式|EQ||
|N_TRIGGERED_NEXT_TYPE_NAME_EQ|触发方式|EQ||
|N_TRIGGERED_NEXT_TYPE_NAME_LIKE|触发方式|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_activity_type?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_type?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_type?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_type?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_type?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_type?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_type?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_type?id=搜索模式`">
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