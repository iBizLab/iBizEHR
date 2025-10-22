# 活动日程计划向导(mail_activity_schedule)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|活动类型|ACTIVITY_TYPE_ID|外键值|100|是||
|活动类型名称|ACTIVITY_TYPE_NAME|外键值文本|200|是||
|分派给|ACTIVITY_USER_ID|外键值|100|是||
|分派给名称|ACTIVITY_USER_NAME|外键值文本|200|是||
|链接类型|CHAINING_TYPE|[外键值附加数据](index/dictionary_index#mail_activity_type_chaining_type "链接类型")|60|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|到期日期|DATE_DEADLINE|日期型||是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|错误|ERROR|HTML文本，没有长度限制|1048576|是||
|有错误|HAS_ERROR|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|批量使用|IS_BATCH_MODE|是否逻辑||是||
|备注|NOTE|HTML文本，没有长度限制|1048576|是||
|计划日期|PLAN_DATE|日期型||是||
|计划部门可筛选|PLAN_DEPARTMENT_FILTERABLE|是否逻辑||是||
|计划|PLAN_ID|外键值|100|是||
|分派给|PLAN_ON_DEMAND_USER_ID|外键值|100|是||
|计划概要|PLAN_SUMMARY|HTML文本，没有长度限制|1048576|是||
|文档 ID|RES_IDS|长文本，没有长度限制|1048576|是||
|模型|RES_MODEL|文本，可指定长度|500|否||
|摘要|SUMMARY|文本，可指定长度|500|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_ACTIVITY_SCHEDULE_MAIL_ACTIVITY_PLAN_PLAN_ID](der/DER1N_MAIL_ACTIVITY_SCHEDULE_MAIL_ACTIVITY_PLAN_PLAN_ID)|[活动计划(MAIL_ACTIVITY_PLAN)](module/mail/mail_activity_plan)|1:N关系||
|[DER1N_MAIL_ACTIVITY_SCHEDULE_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID](der/DER1N_MAIL_ACTIVITY_SCHEDULE_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_MAIL_ACTIVITY_SCHEDULE_RES_USERS_ACTIVITY_USER_ID](der/DER1N_MAIL_ACTIVITY_SCHEDULE_RES_USERS_ACTIVITY_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||
|[DER1N_MAIL_ACTIVITY_SCHEDULE_RES_USERS_PLAN_ON_DEMAND_USER_ID](der/DER1N_MAIL_ACTIVITY_SCHEDULE_RES_USERS_PLAN_ON_DEMAND_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|安排|action_schedule_activities|[实体处理逻辑](module/mail/mail_activity_schedule/logic/action_schedule_activities "安排")|默认|不支持||||
|nothing|nothing|[实体处理逻辑](module/mail/mail_activity_schedule/logic/nothing "nothing")|默认|不支持||||
|安排并标记完成|schedule_activities_done|[实体处理逻辑](module/mail/mail_activity_schedule/logic/schedule_activities_done "安排并标记完成")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[nothing](module/mail/mail_activity_schedule/logic/nothing)|nothing|无|||
|[安排](module/mail/mail_activity_schedule/logic/action_schedule_activities)|action_schedule_activities|无|||
|[安排并标记完成](module/mail/mail_activity_schedule/logic/schedule_activities_done)|schedule_activities_done|无||1.新建活动；<br>2.活动标记完成，并且根据活动类型生成下一个活动；<br>3.返回下一个活动的id；|

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/mail_activity_schedule/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_activity_schedule/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_activity_schedule/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### mail_activity_schedule_user :id=mail_activity_schedule-mail_activity_schedule_user

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `CREATE`
* `UPDATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_TYPE_ID_EQ|活动类型|EQ||
|N_ACTIVITY_TYPE_NAME_EQ|活动类型名称|EQ||
|N_ACTIVITY_TYPE_NAME_LIKE|活动类型名称|LIKE||
|N_ACTIVITY_USER_ID_EQ|分派给|EQ||
|N_ACTIVITY_USER_NAME_EQ|分派给名称|EQ||
|N_ACTIVITY_USER_NAME_LIKE|分派给名称|LIKE||
|N_ID_EQ|标识|EQ||
|N_PLAN_ID_EQ|计划|EQ||
|N_PLAN_ON_DEMAND_USER_ID_EQ|分派给|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 安排并标记完成 | schedule_activities_done | 安排并标记完成 |单项数据|<details><summary>后台调用</summary>[schedule_activities_done](#行为)||
| 打开安排活动视图 | open_schedule_activities_view | 安排活动 |无数据|<details><summary>打开视图或向导（模态）</summary>[安排活动](app/view/mail_activity_schedulequick_create_view)</details>||
| 安排 | schedule_activities | 安排 |单项数据|<details><summary>后台调用</summary>[action_schedule_activities](#行为)||
| 完成并安排下一个 | done_and_schedule | 完成并安排下一个 |单项数据|<details><summary>打开视图或向导（模态）</summary></details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[刷新活动和消息列表](module/mail/mail_activity_schedule/uilogic/refresh_activity_message)|refresh_activity_message|刷新|
|[完成并安排下一个](module/mail/mail_activity_schedule/uilogic/done_next)|done_next|如果执行活动安排标记完成实体行为返回下一个活动的id，则关闭弹窗,反之刷新当前表单|

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_activity_schedule?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_schedule?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_schedule?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_schedule?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_schedule?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_schedule?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_schedule?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_schedule?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_schedule?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_schedule?id=界面逻辑`">
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


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>