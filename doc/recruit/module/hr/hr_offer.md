# OFFER录用(hr_offer)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|所在地|ADDRESS|外键值附加数据|200|是||
|年度绩效奖金|ANNUAL_PERFORMANCE_BONUS|数值|8|是||
|候选人申请|APPLICANT_ID|外键值|100|是||
|审批附件|APPROVAL_ATTACHMENT|文本，可指定长度|1000|是||
|附件密码|ATTACHMENT_PASSWORD|文本，可指定长度|100|是||
|银行卡信息|BANK_CARD_INFO|文本，可指定长度|100|是||
|候选人姓名|CANDIDATE_DISPLAY_NAME|外键值附加数据|100|是||
|预计入职日期|CHECKINDATE|日期型||是||
|通讯补贴|COMMUNICATION_ALLOWANCE|数值|8|是||
|合同期限（年）|CONTRACT_TERM|文本，可指定长度|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|应聘人员所属公司|CURRENT_EMPLOYER|文本，可指定长度|100|是||
|教育程度|EDUCATION|[外键值附加数据](index/dictionary_index#job_education "教育程度")|100|是||
|邮件模版内容|EMAIL_CONTENT|长文本，没有长度限制|1048576|是||
|邮箱|EMAIL_FROM|外键值附加数据|100|是||
|邮件模板|EMAIL_TEMPLATE|文本，可指定长度|100|是||
|工作经验|EXPERIENCE|[外键值附加数据](index/dictionary_index#job_experience "工作经验")|100|是||
|招聘需求标识|HR_IDEA_ID|外键值|60|是||
|招聘需求|HR_IDEA_NAME|外键值文本|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|是否加密|IS_ENCRYPTED|是否逻辑||是||
|生成offer附件|IS_GENERATE_ATTACHMENT|是否逻辑||是||
|应聘岗位|JOB_NAME|文本，可指定长度|100|是||
|平台名称|JOB_PLATFORM_NAME|外键值附加数据|200|是||
|职位级别|JOB_RANK_ID|文本，可指定长度|100|是||
|工作地-市|LOCATION_CITY|文本，可指定长度|100|是||
|入职地点|LOCATION_ID|文本，可指定长度|100|是||
|餐补单位|MA_CURRENCY|文本，可指定长度|100|是||
|餐补|MEAL_ALLOWANCE|数值|8|是||
|手机号|MOBILE_PHONE|外键值附加数据|100|是||
|名称|NAME|文本，可指定长度|200|是||
|附件模版|OFFER_ATTACHMENT_TEMPLATE|文本，可指定长度|100|是||
|offer类型|OFFER_TYPE|文本，可指定长度|100|是||
|入职部门标识|RES_COMPANY_ID|外键值|60|是||
|入职部门|RES_COMPANY_NAME|外键值文本|100|是||
|转正基本工资|SALARY_1|数值|8|是||
|实习生绩效工资|SALARY_2|数值|8|是||
|转正绩效工资|SALARY_3|数值|8|是||
|试用期基本工资|SALARY_4|数值|8|是||
|试用期绩效工资|SALARY_5|数值|8|是||
|实习期薪酬|SALARY_6|数值|8|是||
|薪酬分配方式|SALARY_METHOD|文本，可指定长度|100|是||
|薪资类型|SALARY_TYPE|文本，可指定长度|100|是||
|短信模板内容|SMS_CONTENT|长文本，没有长度限制|1048576|是||
|短信模板|SMS_TEMPLATE|文本，可指定长度|100|是||
|交通补贴|TRANSPORTATION_ALLOWANCE|数值|8|是||
|工作时间（上午）|WORKING_HOURS_AM|文本，可指定长度|100|是||
|工作时间（下午）|WORKING_HOURS_PM|文本，可指定长度|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_OFFER_APPROVAL_HR_OFFER_HR_OFFER_ID_D7D756](der/DER1N_HR_OFFER_APPROVAL_HR_OFFER_HR_OFFER_ID_D7D756)|[offer审核(HR_OFFER_APPROVAL)](module/hr/hr_offer_approval)|1:N关系||
|[DER1N_HR_OFFER_HISTORY_HR_OFFER_HR_OFFER_ID](der/DER1N_HR_OFFER_HISTORY_HR_OFFER_HR_OFFER_ID)|[Offer发送记录(HR_OFFER_HISTORY)](module/hr/hr_offer_history)|1:N关系||
|[DER1N_HR_OFFER_IMP_REC_HR_OFFER_HR_OFFER_ID](der/DER1N_HR_OFFER_IMP_REC_HR_OFFER_HR_OFFER_ID)|[导入记录(HR_OFFER_IMP_REC)](module/hr/hr_offer_imp_rec)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_OFFER_HR_APPLICANT_APPLICANT_ID](der/DER1N_HR_OFFER_HR_APPLICANT_APPLICANT_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||
|[DER1N_HR_OFFER_HR_IDEA_HR_IDEA_ID](der/DER1N_HR_OFFER_HR_IDEA_HR_IDEA_ID)|[招聘需求(HR_IDEA)](module/hr/hr_idea)|1:N关系||
|[DER1N_HR_OFFER_RES_COMPANY_RES_COMPANY_ID](der/DER1N_HR_OFFER_RES_COMPANY_RES_COMPANY_ID)|[组织(RES_COMPANY)](module/base/res_company)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#hr_offer_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[填充offer主键](module/hr/hr_offer/logic/fillId)|fillId|无|||
|[更新申请关联offer](module/hr/hr_offer/logic/updateRelOffer)|updateRelOffer|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_offer/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_offer/query/View)|VIEW|否|否 |否 ||
|[bi_search](module/hr/hr_offer/query/bi_search)|bi_search|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_offer/dataset/Default)|DEFAULT|数据查询|是|||
|[bi_search](module/hr/hr_offer/dataset/bi_search)|bi_search|数据查询|否|||

## 数据权限

##### 全部数据（读写） :id=hr_offer-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `DELETE`
* `READ`
* `UPDATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_APPLICANT_ID_EQ|候选人申请|EQ||
|N_HR_IDEA_ID_EQ|招聘需求标识|EQ||
|N_HR_IDEA_NAME_EQ|招聘需求|EQ||
|N_HR_IDEA_NAME_LIKE|招聘需求|LIKE||
|N_ID_EQ|标识|EQ||
|N_JOB_NAME_LIKE|应聘岗位|LIKE||
|N_NAME_LIKE|名称|LIKE||
|N_RES_COMPANY_ID_EQ|入职部门标识|EQ||
|N_RES_COMPANY_NAME_EQ|入职部门|EQ||
|N_RES_COMPANY_NAME_LIKE|入职部门|LIKE||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 重新发送 | panel_usr0814685044_button_calluilogic8_click | 发送Offer |单项数据|<details><summary>打开视图或向导（模态）</summary>[发送Offer](app/view/hr_offer_history_option_view)</details>||
| 提交 | panel_usr0813850061_button_calluilogic4_click | 提交 |单项数据|用户自定义||
| 提交 | panel_usr0814685044_button_calluilogic4_click | 提交 |单项数据|用户自定义||
| 导入组织人事 | panel_usr0814685044_button_calluilogic_click | 导入OA |单项数据|<details><summary>打开视图或向导（模态）</summary>[导入OA](app/view/hr_offer_imp_view)</details>||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[offer提交](module/hr/hr_offer/uilogic/commitoffer)|commitoffer||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_offer?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_offer?id=界面逻辑`">
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