# 需求与职位关系(hr_idea_job)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|工作地点|ADDRESS_ID|外键值附加数据|100|是||
|职位类别|CATEGORY|外键值附加数据|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|200|是||
|需求|IDEA_ID|外键值|60|是||
|岗位|JOB_ID|外键值|100|是||
|岗位名称|JOB_NAME|外键值附加数据|200|是||
|名称|NAME|文本，可指定长度|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||

<p class="panel-title"><b>联合主键</b></p>

  * `需求(IDEA_ID)`
  * `岗位(JOB_ID)`

## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_IDEA_JOB_HR_IDEA_IDEA_ID](der/DER1N_HR_IDEA_JOB_HR_IDEA_IDEA_ID)|[招聘需求(HR_IDEA)](module/hr/hr_idea)|1:N关系||
|[DER1N_HR_IDEA_JOB_HR_JOB_JOB_ID](der/DER1N_HR_IDEA_JOB_HR_JOB_JOB_ID)|[招聘职位(HR_JOB)](module/hr/hr_job)|1:N关系||

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
|获取关联职位|get_join_idea_job|[实体处理逻辑](module/hr/hr_idea_job/logic/get_join_idea_job "获取关联职位")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[关联职位](module/hr/hr_idea_job/logic/join_idea_job)|join_idea_job|无|||
|[获取关联职位](module/hr/hr_idea_job/logic/get_join_idea_job)|get_join_idea_job|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_idea_job/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_idea_job/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_idea_job/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### 全部数据（读写） :id=hr_idea_job-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>





## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_IDEA_ID_EQ|需求|EQ||
|N_JOB_ID_EQ|岗位|EQ||
|N_NAME_LIKE|名称|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 关联职位 | join_idea_job | 关联职位 |无数据|<details><summary>打开视图或向导（模态）</summary>[添加关联职位](app/view/hr_job_relation_option_view)</details>||
| 删除 | remove | 删除 |单项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[刷新列表](module/hr/hr_idea_job/uilogic/refresh_list)|refresh_list||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_idea_job?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea_job?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea_job?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea_job?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea_job?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea_job?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea_job?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea_job?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea_job?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_idea_job?id=界面逻辑`">
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