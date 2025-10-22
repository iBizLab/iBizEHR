#  招聘阶段(hr_recruitment_stage)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|颜色|COLOR|文本，可指定长度|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|折叠看板|FOLD|是否逻辑||是||
|雇佣阶段|HIRED_STAGE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|警告是否清晰可见|IS_WARNING_VISIBLE|是否逻辑||是||
|红色的看板标签|LEGEND_BLOCKED|文本，可指定长度|500|否||
|绿色看板标签|LEGEND_DONE|文本，可指定长度|500|否||
|灰色看板标签|LEGEND_NORMAL|文本，可指定长度|500|否||
|阶段名称|NAME|文本，可指定长度|200|是||
|要求|REQUIREMENTS|长文本，没有长度限制|1048576|是||
|序列|SEQUENCE|整型||是||
|状态|STATUS|[单项选择(文本值)](index/dictionary_index#stage_status "招聘阶段状态")|60|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_STAGE_ID](der/DER1N_HR_APPLICANT_HR_RECRUITMENT_STAGE_STAGE_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||


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
|停用|disable|[实体处理逻辑](module/hr/hr_recruitment_stage/logic/disable "停用")|默认|不支持||||
|启用|enable|[实体处理逻辑](module/hr/hr_recruitment_stage/logic/enable "启用")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[停用](module/hr/hr_recruitment_stage/logic/disable)|disable|无|||
|[启用](module/hr/hr_recruitment_stage/logic/enable)|enable|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_recruitment_stage/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_recruitment_stage/query/View)|VIEW|否|否 |否 ||
|[启用状态(enabled_status)](module/hr/hr_recruitment_stage/query/enabled_status)|enabled_status|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_recruitment_stage/dataset/Default)|DEFAULT|数据查询|是|||
|[启用状态(enabled_status)](module/hr/hr_recruitment_stage/dataset/enabled_status)|enabled_status|数据查询|否|||

## 数据权限

##### 全部数据（只读） :id=hr_recruitment_stage-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 全部数据（读写） :id=hr_recruitment_stage-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `READ`
* `UPDATE`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|阶段名称|LIKE||
|N_SEQUENCE_EQ|序列|EQ||
|N_STATUS_EQ|状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 停用 | disable | 停用 |单项数据（主键）|<details><summary>后台调用</summary>[disable](#行为)||
| 启用 | enable | 启用 |单项数据（主键）|<details><summary>后台调用</summary>[enable](#行为)||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_recruitment_stage?id=界面行为`">
  界面行为
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