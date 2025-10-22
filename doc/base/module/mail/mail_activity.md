# 活动(mail_activity)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|活动类型|ACTIVITY_TYPE_ID|外键值|100|是||
|活动类型|ACTIVITY_TYPE_NAME|外键值文本|200|是||
|自动活动|AUTOMATED|是否逻辑||是||
|可写|CAN_WRITE|是否逻辑||是||
|链接类型|CHAINING_TYPE|[外键值附加数据](index/dictionary_index#mail_activity_type_chaining_type "链接类型")|60|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|到期日期|DATE_DEADLINE|日期型||否||
|完成日期|DATE_DONE|日期型||是||
|到期天数|DEADLINE_DAY|整型||是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|下一活动可用|HAS_RECOMMENDED_ACTIVITIES|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|保持完成|KEEP_DONE|外键值附加数据||是||
|备注|NOTE|HTML文本，没有长度限制|1048576|是||
|上一个活动类型|PREVIOUS_ACTIVITY_TYPE_ID|外键值|100|是||
|推荐的活动类型|RECOMMENDED_ACTIVITY_TYPE_ID|外键值|100|是||
|请求伙伴|REQUEST_PARTNER_ID|外键值|100|是||
|资源标识|RES_ID|文本，可指定长度|100|是||
|资源模型|RES_MODEL|文本，可指定长度|200|是||
|单据名称|RES_NAME|文本，可指定长度|200|是||
|状态|STATE|[单项选择(文本值)](index/dictionary_index#mail_activity_state "状态")|200|是||
|摘要|SUMMARY|文本，可指定长度|500|是||
|分派给|USER_ID|外键值|100|否||
|分派给_名称|USER_NAME|外键值文本|200|否||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID](der/DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_ACTIVITY_TYPE_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_PREVIOUS_ACTIVITY_TYPE_ID](der/DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_PREVIOUS_ACTIVITY_TYPE_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_RECOMMENDED_ACTIVITY_TYPE_ID](der/DER1N_MAIL_ACTIVITY_MAIL_ACTIVITY_TYPE_RECOMMENDED_ACTIVITY_TYPE_ID)|[活动类型(MAIL_ACTIVITY_TYPE)](module/mail/mail_activity_type)|1:N关系||
|[DER1N_MAIL_ACTIVITY_RES_PARTNER_REQUEST_PARTNER_ID](der/DER1N_MAIL_ACTIVITY_RES_PARTNER_REQUEST_PARTNER_ID)|[联系人(RES_PARTNER)](module/base/res_partner)|1:N关系||
|[DER1N_MAIL_ACTIVITY_RES_USERS_USER_ID](der/DER1N_MAIL_ACTIVITY_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||
|[DERCUSTOM_MAIL_ACTIVITY_MAIL_ACTIVITY_MIXIN](der/DERCUSTOM_MAIL_ACTIVITY_MAIL_ACTIVITY_MIXIN)|[活动Mixin(MAIL_ACTIVITY_MIXIN)](module/mail/mail_activity_mixin)|自定义关系||

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
|完成活动|action_done|[实体处理逻辑](module/mail/mail_activity/logic/action_done "完成活动")|默认|不支持||||
|延迟活动|action_snooze|[实体处理逻辑](module/mail/mail_activity/logic/action_snooze "延迟活动")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[compute_deadline_day](module/mail/mail_activity/logic/compute_deadline_day)|compute_deadline_day|属性逻辑|||
|[compute_state](module/mail/mail_activity/logic/compute_state)|compute_state|属性逻辑|||
|[完成活动](module/mail/mail_activity/logic/action_done)|action_done|无||1.根据活动类型的keep_done判断活动是归档还是删除;<br>2.生成活动完成消息到message；<br>3.活动关联的附件换绑：<br>由绑定活动改绑成绑定消息<br>4.当活动类型的链接类型=trigger,生成下一个活动<br>5.最后返回下一个活动的id,因为"完成并下一个界面行为"需要id来判断是否重新打开新建活动页面<br><br>|
|[延迟活动](module/mail/mail_activity/logic/action_snooze)|action_snooze|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/mail_activity/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_activity/query/View)|VIEW|否|否 |否 ||
|[未完成(un_finished)](module/mail/mail_activity/query/un_finished)|un_finished|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_activity/dataset/Default)|DEFAULT|数据查询|是|||
|[未完成(un_finished)](module/mail/mail_activity/dataset/un_finished)|un_finished|数据查询|否|||

## 数据权限

##### mail_activity_user :id=mail_activity-mail_activity_user

<p class="panel-title"><b>数据范围</b></p>

* `无`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `UPDATE`
* `CREATE`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_TYPE_ID_EQ|活动类型|EQ||
|N_ACTIVITY_TYPE_NAME_EQ|活动类型|EQ||
|N_ACTIVITY_TYPE_NAME_LIKE|活动类型|LIKE||
|N_ID_EQ|标识|EQ||
|N_PREVIOUS_ACTIVITY_TYPE_ID_EQ|上一个活动类型|EQ||
|N_RECOMMENDED_ACTIVITY_TYPE_ID_EQ|推荐的活动类型|EQ||
|N_REQUEST_PARTNER_ID_EQ|请求伙伴|EQ||
|N_RES_ID_EQ|资源标识|EQ||
|N_RES_ID_IN|资源标识|IN||
|N_RES_MODEL_EQ|资源模型|EQ||
|N_STATE_EQ|状态|EQ||
|N_USER_ID_EQ|分派给|EQ||
|N_USER_NAME_EQ|分派给_名称|EQ||
|N_USER_NAME_LIKE|分派给_名称|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 标记为完成 | action_done | 标记为完成 |单项数据|<details><summary>后台调用</summary>[action_done](#行为)|供主视图使用|
| 取消活动 | del_activity | 取消 |单项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)||
| 打开安排员工活动视图 | activity_schedule | 安排员工活动 |无数据|<details><summary>打开视图或向导（模态）</summary>[活动](app/view/mail_activityemp_schedule_act_list_view)</details>||
| 打开完成活动视图 | open_action_done_view | 完成活动 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[标记完成](app/view/mail_activityfeedback_view)</details>||
| 完成并安排下一个 | done_next_schedule | 完成并安排下一个 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary></details>||
| 编辑活动 | edit_activity | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[安排活动](app/view/mail_activityquick_cfg_view)</details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[刷新活动列表](module/mail/mail_activity/uilogic/refresh_activity)|refresh_activity|刷新|
|[刷新活动和消息列表](module/mail/mail_activity/uilogic/refresh_activity_message)|refresh_activity_message|刷新|
|[完成并安排下一个](module/mail/mail_activity/uilogic/done_next)|done_next|如果执行活动安排标记完成实体行为返回下一个活动的id，则关闭弹窗,反之打开安排活动视图|

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_activity?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity?id=界面逻辑`">
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