#  拒绝原因申请人(hr_applicant_refuse_reason)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|应聘人|CANDIDATE_ID|外键值|100|否||
|公司|COMPANY_ID|外键值|60|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|工作岗位|JOB_ID|外键值|100|是||
|最终阶段|LAST_STAGE_ID|外键值|100|是||
|主要附件|MESSAGE_MAIN_ATTACHMENT_ID|外键值|100|是||
|名称|NAME|文本，可指定长度|200|是||
|拒绝理由|REFUSE_REASON_ID|外键值|100|是||
|序列|SEQUENCE|整型||是||
|阶段|STAGE_ID|外键值|100|是||
|招聘人员|USER_ID|外键值|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_REFUSE_REASON_HR_APPLICANT_REFUSE_REASON_REFUSE_REASON_ID](der/DER1N_HR_APPLICANT_REFUSE_REASON_HR_APPLICANT_REFUSE_REASON_REFUSE_REASON_ID)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_APPLICANT_REFUSE_REASON_HR_CANDIDATE_CANDIDATE_ID_C6F4AA](der/DER1N_HR_APPLICANT_REFUSE_REASON_HR_CANDIDATE_CANDIDATE_ID_C6F4AA)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_APPLICANT_REFUSE_REASON_HR_JOB_JOB_ID_C6F4AA](der/DER1N_HR_APPLICANT_REFUSE_REASON_HR_JOB_JOB_ID_C6F4AA)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_APPLICANT_REFUSE_REASON_HR_RECRUITMENT_STAGE_LAST_STAGE_ID_C6F4AA](der/DER1N_HR_APPLICANT_REFUSE_REASON_HR_RECRUITMENT_STAGE_LAST_STAGE_ID_C6F4AA)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_APPLICANT_REFUSE_REASON_HR_RECRUITMENT_STAGE_STAGE_ID_C6F4AA](der/DER1N_HR_APPLICANT_REFUSE_REASON_HR_RECRUITMENT_STAGE_STAGE_ID_C6F4AA)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_APPLICANT_REFUSE_REASON_HR_APPLICANT_REFUSE_REASON_REFUSE_REASON_ID](der/DER1N_HR_APPLICANT_REFUSE_REASON_HR_APPLICANT_REFUSE_REASON_REFUSE_REASON_ID)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_APPLICANT_REFUSE_REASON_HR_CANDIDATE_CANDIDATE_ID_C6F4AA](der/DER1N_HR_APPLICANT_REFUSE_REASON_HR_CANDIDATE_CANDIDATE_ID_C6F4AA)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_APPLICANT_REFUSE_REASON_HR_JOB_JOB_ID_C6F4AA](der/DER1N_HR_APPLICANT_REFUSE_REASON_HR_JOB_JOB_ID_C6F4AA)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_APPLICANT_REFUSE_REASON_HR_RECRUITMENT_STAGE_LAST_STAGE_ID_C6F4AA](der/DER1N_HR_APPLICANT_REFUSE_REASON_HR_RECRUITMENT_STAGE_LAST_STAGE_ID_C6F4AA)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_APPLICANT_REFUSE_REASON_HR_RECRUITMENT_STAGE_STAGE_ID_C6F4AA](der/DER1N_HR_APPLICANT_REFUSE_REASON_HR_RECRUITMENT_STAGE_STAGE_ID_C6F4AA)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_HR_APPLICANT_REFUSE_REASON_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID](der/DER1N_HR_APPLICANT_REFUSE_REASON_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|1:N关系||
|[DER1N_HR_APPLICANT_REFUSE_REASON_RES_COMPANY_COMPANY_ID](der/DER1N_HR_APPLICANT_REFUSE_REASON_RES_COMPANY_COMPANY_ID)|[组织(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_APPLICANT_REFUSE_REASON_RES_USERS_USER_ID](der/DER1N_HR_APPLICANT_REFUSE_REASON_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|[数据查询(DEFAULT)](module/hr/hr_applicant_refuse_reason/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_applicant_refuse_reason/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_applicant_refuse_reason/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### 全部数据（读写） :id=hr_applicant_refuse_reason-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `DELETE`
* `UPDATE`
* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CANDIDATE_ID_EQ|应聘人|EQ||
|N_COMPANY_ID_EQ|公司|EQ||
|N_ID_EQ|标识|EQ||
|N_JOB_ID_EQ|工作岗位|EQ||
|N_LAST_STAGE_ID_EQ|最终阶段|EQ||
|N_MESSAGE_MAIN_ATTACHMENT_ID_EQ|主要附件|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_REFUSE_REASON_ID_EQ|拒绝理由|EQ||
|N_STAGE_ID_EQ|阶段|EQ||
|N_USER_ID_EQ|招聘人员|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_applicant_refuse_reason?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant_refuse_reason?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant_refuse_reason?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant_refuse_reason?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant_refuse_reason?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant_refuse_reason?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_applicant_refuse_reason?id=搜索模式`">
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