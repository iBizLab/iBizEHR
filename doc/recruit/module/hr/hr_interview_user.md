# 面试参与者(hr_interview_user)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|候选人申请|APPLICANT_ID|外键值|100|是||
|候选人|CANDIDATE_DISPLAY_NAME|外键值附加数据|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|面试|INTERVIEW_ID|外键值|100|是||
|应聘职位|JOB_NAME|外键值附加数据|200|是||
|联系方式|MOBILE_PHONE|外键值附加数据|100|是||
|名称|NAME|文本，可指定长度|200|是||
|面试参与者|USER_ID|文本，可指定长度|100|是||
|面试参与者|USER_NAME|文本，可指定长度|100|是||
|参与者状态|USER_STATUS|单项选择(文本值)|60|是||
|面试参与者类型|USER_TYPE|[单项选择(文本值)](index/dictionary_index#interview_user_type "面试参与者类型")|60|是||
|会议链接|VIDEO_URL|文本，可指定长度|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_INTERVIEW_FEEDBACK_HR_INTERVIEW_USER_INTERVIEW_USER_ID](der/DER1N_HR_INTERVIEW_FEEDBACK_HR_INTERVIEW_USER_INTERVIEW_USER_ID)|[面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_INTERVIEW_USER_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_INTERVIEW_USER_HR_APPLICANT_APPLICANT_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||
|[DER1N_HR_INTERVIEW_USER_HR_INTERVIEW_INTERVIEW_ID](der/DER1N_HR_INTERVIEW_USER_HR_INTERVIEW_INTERVIEW_ID)|[面试(HR_INTERVIEW)](module/hr/hr_interview)|1:N关系||
|[HR_INTERVIEW_HR_INTERVIEW_USER](der/HR_INTERVIEW_HR_INTERVIEW_USER)|[面试(HR_INTERVIEW)](module/hr/hr_interview)|自定义关系||

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
|[数据查询(DEFAULT)](module/hr/hr_interview_user/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_interview_user/query/View)|VIEW|否|否 |否 ||
|[候选人(CANDIDATE)](module/hr/hr_interview_user/query/candidate)|CANDIDATE|否|否 |否 ||
|[面试官(INTERVIEWER)](module/hr/hr_interview_user/query/interviewer)|INTERVIEWER|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_interview_user/dataset/Default)|DEFAULT|数据查询|是|||
|[候选人(CANDIDATE)](module/hr/hr_interview_user/dataset/candidate)|CANDIDATE|数据查询|否|||
|[面试官(INTERVIEWER)](module/hr/hr_interview_user/dataset/interviewer)|INTERVIEWER|数据查询|否|||

## 数据权限

##### 全部数据（读写） :id=hr_interview_user-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `CREATE`
* `DELETE`
* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_APPLICANT_ID_EQ|候选人申请|EQ||
|N_ID_EQ|标识|EQ||
|N_INTERVIEW_ID_EQ|面试|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_USER_STATUS_EQ|参与者状态|EQ||
|N_USER_TYPE_EQ|面试参与者类型|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_interview_user?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_user?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_user?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_user?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_user?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_user?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_user?id=搜索模式`">
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