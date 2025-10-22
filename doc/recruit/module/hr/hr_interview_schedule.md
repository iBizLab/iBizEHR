# 面试安排(hr_interview_schedule)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|面试地点|ADDRESS_ID|文本，可指定长度|100|是||
|候选人申请|APPLICANT_ID|外键值|100|是||
|附件|ATTACHMENT|文本，可指定长度|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|邮件内容|EMAIL_CONTENT|文本，可指定长度|500|是||
|邮件模版|EMAIL_TEMPLATE_ID|[单项选择(文本值)](index/dictionary_index#interview_email_template "邮件模版（临时）")|60|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|面试类型分类|INTERVIEW_CATEGORY|[单项选择(文本值)](index/dictionary_index#interview_category "面试类型分类")|100|是||
|面试类型|INTERVIEW_TYPE|[单项选择(文本值)](index/dictionary_index#interview_type "面试类型")|60|是||
|是否发送邮件通知|IS_SEND_EMAIL|[多项选择(文本值)](index/dictionary_index#interview_send_email "邮件通知候选人")|100|是||
|是否发送短信|IS_SEND_SMS|[多项选择(文本值)](index/dictionary_index#interview_send_sms "短信通知候选人")|100|是||
|名称|NAME|文本，可指定长度|200|是||
|简历类型|RESUME_TYPE|[单项选择(文本值)](index/dictionary_index#interview_resume_type "简历类型")|60|是||
|短信内容|SMS_CONTENT|文本，可指定长度|500|是||
|短信模版|SMS_TEMPLATE_ID|[单项选择(文本值)](index/dictionary_index#interview_sms_template "短信模版（临时）")|60|是||
|面试日期|START_DATE|日期型||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_INTERVIEW_HR_INTERVIEW_SCHEDULE_SCHEDULE_ID](der/DER1N_HR_INTERVIEW_HR_INTERVIEW_SCHEDULE_SCHEDULE_ID)|[面试(HR_INTERVIEW)](module/hr/hr_interview)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_INTERVIEW_SCHEDULE_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_INTERVIEW_SCHEDULE_HR_APPLICANT_APPLICANT_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持|[附加操作](index/action_logic_index#hr_interview_schedule_GetDraft)|||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[初始化面试默认值](module/hr/hr_interview_schedule/logic/fill_interview)|fill_interview|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_interview_schedule/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_interview_schedule/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_interview_schedule/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### 全部数据（读写） :id=hr_interview_schedule-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `READ`
* `CREATE`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_APPLICANT_ID_EQ|候选人申请|EQ||
|N_EMAIL_TEMPLATE_ID_EQ|邮件模版|EQ||
|N_ID_EQ|标识|EQ||
|N_INTERVIEW_TYPE_EQ|面试类型|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_RESUME_TYPE_EQ|简历类型|EQ||
|N_SMS_TEMPLATE_ID_EQ|短信模版|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_interview_schedule?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_schedule?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_schedule?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_schedule?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_schedule?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_schedule?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_schedule?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_interview_schedule?id=搜索模式`">
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