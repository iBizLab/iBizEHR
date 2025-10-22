# 分析报表(report)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|类别|CATEGORIES|多项选择(文本值)|2000|是||
|类别|CATEGORIES_NAME|长文本，没有长度限制|2000|是||
|图表类型|CHART_TYPE|[单项选择(文本值)](index/dictionary_index#bi_chart_type2 "BI图表类型")|60|是||
|创建人|CREATE_MAN|文本，可指定长度|100|否||
|创建时间|CREATE_TIME|日期时间型||否||
|报表部件标识|CTRL_ID|文本，可指定长度|100|是||
|描述|DESC|长文本，没有长度限制|1048576|是||
|逻辑有效标识|ENABLE|是否逻辑||是||
|组别|GROUP|单项选择(文本值)|60|是||
|分组数据|GROUP_DATA|一对一动态对象|1048576|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是否系统类型|IS_SYSTEM|是否逻辑||是||
|名称|NAME|文本，可指定长度|200|是||
|模板模型|TEMPLATE_MODEL|长文本，没有长度限制|1048576|是||
|更新人|UPDATE_MAN|文本，可指定长度|100|否||
|更新时间|UPDATE_TIME|日期时间型||否||


## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#report_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持|[附加操作](index/action_logic_index#report_Remove)|||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|同步模板模型|sync_model|[实体处理逻辑](module/base/report/logic/sync_model "同步模板模型")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[同步模板模型](module/base/report/logic/sync_model)|sync_model|无||同步模板模型|
|[建立报表扩展模型](module/base/report/logic/create_bi_report)|create_bi_report|无||建立报表扩展模型|
|[移除报表扩展模型](module/base/report/logic/remove_bi_report)|remove_bi_report|无||移除报表扩展模型|

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/report/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/report/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/report/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### 全部数据（读） :id=report-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 全部数据（读写） :id=report-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `UPDATE`
* `CREATE`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CHART_TYPE_EQ|图表类型|EQ||
|N_GROUP_EQ|组别|EQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 打开报表设计界面 | open_report_design_view | 设计 |单项数据（主键）|用户自定义||
| 删除 | delete_report | 删除 |单项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)||
| 编辑 | edit_report | 编辑 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[基础信息变更](app/view/report_baseinfo_edit_view)</details>||
| 导出PNG | export_pdf | 导出PNG |单项数据|用户自定义||
| 新建报表 | create_report | 新建报表 |无数据|<details><summary>打开视图或向导（模态）</summary>[新建报表](app/view/report_quick_create_view)</details>||
| 导出表格 | export_table | 导出表格 |单项数据|<details><summary></summary></details>||
| 打开BI报表设计图面板视图 | open_bi_report_panel_view | 编辑 |无数据|<details><summary>打开视图或向导（模态）</summary>[BI报表设计态面板视图](app/view/report_bi_report_panel_view)</details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[导出为pdf](module/base/report/uilogic/export_pdf)|export_pdf||
|[导出表格](module/base/report/uilogic/export_excel)|export_excel||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/report?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/report?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/report?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/base/report?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/report?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/report?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/base/report?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/base/report?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/report?id=界面逻辑`">
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