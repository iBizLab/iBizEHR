# 招聘平台(hr_job_platform)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|电子邮件|EMAIL|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|图片|IMAGE|文本，可指定长度|100|是||
|名称|NAME|文本，可指定长度|200|是||
|授权账号数量|PLATFORM_ACCOUNT_COUNT|整型||是||
|状态|PUBLISH_STATUS|[单项选择(文本值)](index/dictionary_index#hr_platform_publish_status "招聘平台/账号发布状态")|200|是||
|类型|TYPE|[单项选择(文本值)](index/dictionary_index#hr_job_platform_type "岗位发布平台类型")|60|是||
|招聘平台地址|URL|文本，可指定长度|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_HR_JOB_PLATFORM_JOB_PLATFORM_ID](der/DER1N_HR_APPLICANT_HR_JOB_PLATFORM_JOB_PLATFORM_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||
|[DER1N_HR_JOB_PLATFORM_ACCOUNT_HR_JOB_PLATFORM_JOB_PLATFORM_ID](der/DER1N_HR_JOB_PLATFORM_ACCOUNT_HR_JOB_PLATFORM_JOB_PLATFORM_ID)|[招聘平台账号(HR_JOB_PLATFORM_ACCOUNT)](module/hr/hr_job_platform_account)|1:N关系||
|[DER1N_HR_JOB_PLATFORM_RECORD_HR_JOB_PLATFORM_JOB_PLATFORM_ID](der/DER1N_HR_JOB_PLATFORM_RECORD_HR_JOB_PLATFORM_JOB_PLATFORM_ID)|[招聘平台发布记录(HR_JOB_PLATFORM_RECORD)](module/hr/hr_job_platform_record)|1:N关系||


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

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_job_platform/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_job_platform/query/View)|VIEW|否|否 |否 ||
|[职位发布情况(job_platform)](module/hr/hr_job_platform/query/job_platform)|job_platform|否|否 |是 ||
|[外部招聘平台(platform)](module/hr/hr_job_platform/query/platform)|platform|否|否 |否 ||
|[社招官网(social)](module/hr/hr_job_platform/query/social)|social|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_job_platform/dataset/Default)|DEFAULT|数据查询|是|||
|[职位发布情况(job_platform)](module/hr/hr_job_platform/dataset/job_platform)|job_platform|数据查询|否|||
|[外部招聘平台(platform)](module/hr/hr_job_platform/dataset/platform)|platform|数据查询|否|||
|[社招官网(social)](module/hr/hr_job_platform/dataset/social)|social|数据查询|否|||

## 数据权限

##### 全部数据（读写） :id=hr_job_platform-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `DELETE`
* `UPDATE`
* `READ`
* `CREATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PUBLISH_STATUS_EQ|状态|EQ||
|N_TYPE_EQ|类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 打开平台账号列表 | open_accout_list | 打开平台账号列表 |单项数据|<details><summary>打开视图或向导（模态）</summary>[选择账号](app/view/hr_job_platform_account_list_data_view)</details>||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_job_platform?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job_platform?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job_platform?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job_platform?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job_platform?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job_platform?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job_platform?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_job_platform?id=界面行为`">
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