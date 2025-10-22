# 员工(hr_employee)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|其它说明|ADDITIONAL_NOTE|长文本，没有长度限制|1048576|是||
|徽标 ID|BARCODE|文本，可指定长度|500|是||
|出生日期|BIRTHDAY|日期型||是||
|证书等级|CERTIFICATE|单项选择(文本值)|60|是||
|受抚养的子女数|CHILDREN|整型||是||
|颜色指标|COLOR|整型||是||
|部门|COMPANY_ID|外键值|60|否||
|部门|COMPANY_NAME|外键值文本|100|否||
|合同警告|CONTRACT_WARNING|是否逻辑||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|部门|DEPARTMENT_ID|外键值|100|是||
|部门|DEPARTMENT_NAME|外键值文本|200|是||
|离职日期|DEPARTURE_DATE|日期型||是||
|其它信息|DEPARTURE_DESCRIPTION|HTML文本，没有长度限制|1048576|是||
|通勤距离|DISTANCE_HOME_WORK|整型||是||
|通勤距离（单位）|DISTANCE_HOME_WORK_UNIT|单项选择(文本值)|60|是||
|最高学历|EDUCATION_LEVEL|单项选择(文本值)|60|是||
|联系人姓名|EMERGENCY_CONTACT|文本，可指定长度|100|是||
|电话|EMERGENCY_PHONE|文本，可指定长度|50|是||
|雇佣关系|EMPLOYEE_TYPE|单项选择(文本值)|60|是||
|首次合同日期|FIRST_CONTRACT_DATE|日期型||是||
|性别|GENDER|单项选择(文本值)|60|是||
|职位|HR_JOB_ID|外键值|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|证件号码|IDENTIFICATION_ID|文本，可指定长度|500|是||
|证件类型|IDENTIFICATION_TYPE|单项选择(文本值)|60|是||
|灵活可变|IS_FLEXIBLE|是否逻辑||是||
|完全灵活|IS_FULLY_FLEXIBLE|是否逻辑||是||
|工作头衔|JOB_TITLE|文本，可指定长度|500|是||
|入职日期|JOIN_WORKDATE|日期型||是||
|通勤距离（公里）|KM_HOME_WORK|整型||是||
|法定名称|LEGAL_NAME|文本，可指定长度|500|是||
|专业|MAJOR|文本，可指定长度|100|是||
|婚姻状况|MARITAL_STATUS|单项选择(文本值)|60|是||
|手机号码|MOBILE_PHONE|文本，可指定长度|50|是||
|调动卡|MOBILITY_CARD|文本，可指定长度|500|是||
|姓名|NAME|文本，可指定长度|100|是||
|民族|NATION|单项选择(文本值)|60|是||
|备注|NOTES|长文本，没有长度限制|1048576|是||
|管理链|PARENT_PATH|长文本，没有长度限制|1048576|是||
|护照号|PASSPORT_ID|文本，可指定长度|500|是||
|工号|PERMIT_NO|文本，可指定长度|500|是||
|PIN|PIN|文本，可指定长度|500|是||
|出生地|PLACE_OF_BIRTH|文本，可指定长度|500|是||
|私人车辆车牌|PRIVATE_CAR_PLATE|文本，可指定长度|500|是||
|户籍所在地|PRIVATE_CITY|文本，可指定长度|500|是||
|私人电子邮箱|PRIVATE_EMAIL|文本，可指定长度|250|是||
|私人电话|PRIVATE_PHONE|文本，可指定长度|50|是||
|户籍地址|PRIVATE_STREET|文本，可指定长度|500|是||
|户籍详细地址|PRIVATE_STREET2|文本，可指定长度|500|是||
|邮编|PRIVATE_ZIP|文本，可指定长度|50|是||
|社会保险号SIN|SINID|文本，可指定长度|50|是||
|配偶生日|SPOUSE_BIRTHDATE|日期型||是||
|配偶全名|SPOUSE_COMPLETE_NAME|文本，可指定长度|500|是||
|社会保障号SSN|SSNID|文本，可指定长度|500|是||
|参加工作日期|START_WORKDATE|日期型||是||
|研究领域|STUDY_FIELD|文本，可指定长度|500|是||
|毕业学校|STUDY_SCHOOL|文本，可指定长度|500|是||
|用户|USER_ID|外键值|100|是||
|用户|USER_NAME|外键值文本|200|是||
|公司汽车|VEHICLE|文本，可指定长度|50|是||
|签证有效期|VISA_EXPIRE|日期型||是||
|签证号|VISA_NO|文本，可指定长度|500|是||
|工作电子邮件|WORK_EMAIL|文本，可指定长度|500|否||
|工作许可证到期日期|WORK_PERMIT_EXPIRATION_DATE|日期型||是||
|工作许可的预定活动|WORK_PERMIT_SCHEDULED_ACTIVITY|是否逻辑||是||
|办公电话|WORK_PHONE|文本，可指定长度|50|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_HR_EMPLOYEE_OWNER_ID](der/DER1N_HR_APPLICANT_HR_EMPLOYEE_OWNER_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||
|[DER1N_HR_CANDIDATE_FILTER_DETAIL_HR_EMPLOYEE_USER_ID](der/DER1N_HR_CANDIDATE_FILTER_DETAIL_HR_EMPLOYEE_USER_ID)|[筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)|1:N关系||
|[DER1N_HR_CANDIDATE_HR_EMPLOYEE_USER_ID](der/DER1N_HR_CANDIDATE_HR_EMPLOYEE_USER_ID)|[候选人(HR_CANDIDATE)](module/hr/hr_candidate)|1:N关系||
|[DER1N_HR_EMPLOYEE_SKILL_LOG_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_EMPLOYEE_SKILL_LOG_HR_EMPLOYEE_EMPLOYEE_ID)|[ 技能历史(HR_EMPLOYEE_SKILL_LOG)](module/hr/hr_employee_skill_log)|1:N关系||
|[DER1N_HR_INTERVIEW_FEEDBACK_HR_EMPLOYEE_INTERVIEWER_ID](der/DER1N_HR_INTERVIEW_FEEDBACK_HR_EMPLOYEE_INTERVIEWER_ID)|[面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)|1:N关系||
|[DER1N_HR_INTERVIEW_HR_EMPLOYEE_OWNER_ID](der/DER1N_HR_INTERVIEW_HR_EMPLOYEE_OWNER_ID)|[面试(HR_INTERVIEW)](module/hr/hr_interview)|1:N关系||
|[DER1N_RES_COMPANY_HR_EMPLOYEE_HRBP_ID](der/DER1N_RES_COMPANY_HR_EMPLOYEE_HRBP_ID)|[组织(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_RES_COMPANY_HR_EMPLOYEE_MANAGER_ID](der/DER1N_RES_COMPANY_HR_EMPLOYEE_MANAGER_ID)|[组织(RES_COMPANY)](module/base/res_company)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_EMPLOYEE_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EMPLOYEE_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_EMPLOYEE_HR_JOB_HR_JOB_ID](der/DER1N_HR_EMPLOYEE_HR_JOB_HR_JOB_ID)|[招聘职位(HR_JOB)](module/hr/hr_job)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_COMPANY_COMPANY_ID](der/DER1N_HR_EMPLOYEE_RES_COMPANY_COMPANY_ID)|[组织(RES_COMPANY)](module/base/res_company)|1:N关系||
|[DER1N_HR_EMPLOYEE_RES_USERS_USER_ID](der/DER1N_HR_EMPLOYEE_RES_USERS_USER_ID)|[用户(RES_USERS)](module/base/res_users)|1:N关系||

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
|[数据查询(DEFAULT)](module/hr/hr_employee/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_employee/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_employee/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### 全部数据（只读） :id=hr_employee-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 全部数据(RW) :id=hr_employee-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `CREATE`
* `UPDATE`
* `DELETE`
* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CERTIFICATE_EQ|证书等级|EQ||
|N_COMPANY_ID_EQ|部门|EQ||
|N_COMPANY_NAME_EQ|部门|EQ||
|N_COMPANY_NAME_LIKE|部门|LIKE||
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_DEPARTMENT_NAME_EQ|部门|EQ||
|N_DEPARTMENT_NAME_LIKE|部门|LIKE||
|N_DISTANCE_HOME_WORK_UNIT_EQ|通勤距离（单位）|EQ||
|N_EDUCATION_LEVEL_EQ|最高学历|EQ||
|N_EMPLOYEE_TYPE_EQ|雇佣关系|EQ||
|N_GENDER_EQ|性别|EQ||
|N_HR_JOB_ID_EQ|职位|EQ||
|N_ID_EQ|标识|EQ||
|N_IDENTIFICATION_TYPE_EQ|证件类型|EQ||
|N_MARITAL_STATUS_EQ|婚姻状况|EQ||
|N_NAME_LIKE|姓名|LIKE||
|N_NATION_EQ|民族|EQ||
|N_USER_ID_EQ|用户|EQ||
|N_USER_NAME_EQ|用户|EQ||
|N_USER_NAME_LIKE|用户|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_employee?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=搜索模式`">
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