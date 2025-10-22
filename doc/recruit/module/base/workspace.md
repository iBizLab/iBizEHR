# 工作台(workspace)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


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
|获取工作台我的关注数|get_my_attention_count|[实体处理逻辑](module/base/workspace/logic/get_my_attention_count "获取工作台我的关注数")|默认|不支持||||
|获取工作台我的事项数|get_my_summary_count|[实体处理逻辑](module/base/workspace/logic/get_my_summary_count "获取工作台我的事项数")|默认|不支持||||
|我的待办事项清单计数器|get_my_todolist_count|[实体处理逻辑](module/base/workspace/logic/get_my_todolist_count "我的待办事项清单计数器")|默认|不支持||||
|用人经理欢迎页计数器|manager_welcome_count|[实体处理逻辑](module/base/workspace/logic/manager_welcome_count "用人经理欢迎页计数器")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[我的待办事项清单计数器](module/base/workspace/logic/get_my_todolist_count)|get_my_todolist_count|无|||
|[用人经理欢迎页计数器](module/base/workspace/logic/manager_welcome_count)|manager_welcome_count|无|||
|[获取工作台我的事项数](module/base/workspace/logic/get_my_summary_count)|get_my_summary_count|无|||
|[获取工作台我的关注数](module/base/workspace/logic/get_my_attention_count)|get_my_attention_count|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/base/workspace/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/workspace/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/base/workspace/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### 全部数据（读写） :id=workspace-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `CREATE`
* `READ`
* `UPDATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 打开候选人申请_待入职 | open_applicant_list_status80 | 打开候选人申请_待入职 |无数据|<details><summary>打开视图或向导（模态）</summary>[候选人管理](app/view/hr_applicant_list_view)</details>||
| 打开候选人申请_复试 | open_applicant_list_status60 | 打开候选人申请_复试 |无数据|<details><summary>打开视图或向导（模态）</summary>[候选人管理](app/view/hr_applicant_list_view)</details>||
| 打开我的面试 | open_myinterview | 打开我的面试 |无数据|<details><summary>打开视图或向导（模态）</summary>[面试安排](app/view/hr_interview_interview_list_tab_exp_view)</details>||
| 打开候选人申请_沟通offer | open_applicant_list_status70 | 打开候选人申请_沟通offer |无数据|<details><summary>打开视图或向导（模态）</summary>[候选人管理](app/view/hr_applicant_list_view)</details>||
| 打开候选人申请_初试 | open_applicant_list_status40 | 打开候选人申请_初试 |无数据|<details><summary>打开视图或向导（模态）</summary>[候选人管理](app/view/hr_applicant_list_view)</details>||
| 打开候选人界面 | open_applicant_view | 打开界面 |无数据|<details><summary>打开视图或向导（模态）</summary>[候选人管理](app/view/hr_applicant_list_view)</details>||
| 打开候选人申请_初筛 | open_applicant_list_status20 | 打开候选人申请_初筛 |无数据|<details><summary>打开视图或向导（模态）</summary>[候选人管理](app/view/hr_applicant_list_view)</details>||
| 您有1份简历待分配， | panel_a10a8d3fae2b835fd5c_button_link_click | 您有1份简历待分配， |单项数据|用户自定义||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[提示](module/base/workspace/uilogic/message)|message||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/workspace?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/workspace?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/workspace?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/base/workspace?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/workspace?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/workspace?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/base/workspace?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/base/workspace?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/workspace?id=界面逻辑`">
  界面逻辑
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {



      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>