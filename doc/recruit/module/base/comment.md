# 评论(comment)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|内容|CONTENT|长文本，没有长度限制|1048576|是||
|建立人|CREATE_MAN|文本，可指定长度|100|否||
|建立时间|CREATE_TIME|日期时间型||否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是否置顶|IS_TOP|是否逻辑||是||
|名称|NAME|文本，可指定长度|200|是||
|所属数据对象|OWNER_TYPE|文本，可指定长度|100|是||
|父内容|PCONTENT|外键值附加数据|1048576|是||
|父建立人|PCREATE_MAN|外键值附加数据|100|是||
|父标识|PID|外键值|100|是||
|评论主体标识|PRINCIPAL_ID|文本，可指定长度|100|是||
|评论主体名称|PRINCIPAL_NAME|文本，可指定长度|100|是||
|评论主体类型|PRINCIPAL_TYPE|文本，可指定长度|100|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_COMMENT_COMMENT_PID](der/DER1N_COMMENT_COMMENT_PID)|[评论(COMMENT)](module/base/comment)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_COMMENT_COMMENT_PID](der/DER1N_COMMENT_COMMENT_PID)|[评论(COMMENT)](module/base/comment)|1:N关系||
|[DERCUSTOM_COMMENT_HR_APPLICANT_PRINCIPAL_ID](der/DERCUSTOM_COMMENT_HR_APPLICANT_PRINCIPAL_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|自定义关系||

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
|删除评论|delete|[实体处理逻辑](module/base/comment/logic/delete "删除评论")|默认|不支持||||
|取消置顶|no_top|[实体处理逻辑](module/base/comment/logic/no_top "取消置顶")|默认|不支持||||
|评论置顶|top|[实体处理逻辑](module/base/comment/logic/top "评论置顶")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[删除评论](module/base/comment/logic/delete)|delete|无||评论数据的删除，将评论内容重置为：该评论已删除|
|[取消置顶](module/base/comment/logic/no_top)|no_top|无|||
|[评论置顶](module/base/comment/logic/top)|top|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/base/comment/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/comment/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/base/comment/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### 全部数据（读写） :id=comment-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `READ`
* `DELETE`
* `UPDATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PID_EQ|父标识|EQ||
|N_PRINCIPAL_ID_EQ|评论主体标识|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 评论置顶 | top | 置顶 |单项数据（主键）|<details><summary>后台调用</summary>[top](#行为)||
| 回复 | panel_usr0819223438_button_calluilogic2_click | 回复 |单项数据|用户自定义||
| 清空评论 | clear_comment | 清空 |无数据|用户自定义||
| 删除评论 | del_comment | 删除评论 |单项数据（主键）|<details><summary>后台调用</summary>[delete](#行为)||
| 编辑 | panel_usr0819223438_button_calluilogic1_click | 编辑 |单项数据|用户自定义||
| 取消置顶 | no_top | 取消置顶 |单项数据（主键）|<details><summary>后台调用</summary>[no_top](#行为)||
| 发送评论 | send_comment | 发送评论 |无数据|用户自定义||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[刷新评论列表](module/base/comment/uilogic/refresh_comment)|refresh_comment|刷新|
|[发送评论](module/base/comment/uilogic/send_comment)|send_comment|发送评论，并关闭评论输入框|
|[回复评论](module/base/comment/uilogic/reply_comment)|reply_comment|获取回复对象评论信息，并展开评论输入框，显示回复组件|
|[控制评论按钮显示](module/base/comment/uilogic/comment_icon_show)|comment_icon_show|显示评论按钮|
|[控制评论按钮隐藏](module/base/comment/uilogic/comment_icon_hidden)|comment_icon_hidden|获取部件状态信息，通过直接赋值，控制指定部件显示隐藏|
|[清空评论](module/base/comment/uilogic/clear_comment)|clear_comment|清空当前输入框内已输入内容|
|[编辑评论](module/base/comment/uilogic/edit_comment)|edit_comment|编辑评论，获取评论数据，展开评论输入框并赋值|

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/comment?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/comment?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/comment?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/comment?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/base/comment?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/comment?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/comment?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/base/comment?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/base/comment?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/comment?id=界面逻辑`">
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