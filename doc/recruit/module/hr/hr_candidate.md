# 候选人(hr_candidate)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|户籍地址|ADDRESS_ID|文本，可指定长度|100|是||
|出生日期|BIRTHDAY|文本，可指定长度|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|教育程度|EDUCATION|[单项选择(文本值)](index/dictionary_index#idea_education "学历要求")|100|是||
|邮箱|EMAIL_FROM|文本，可指定长度|500|是||
|工作经验|EXPERIENCE|[单项选择(文本值)](index/dictionary_index#job_experience "工作经验")|100|是||
|性别|GENDER|[单项选择(文本值)](index/dictionary_index#candidate_gender "候选人性别")|60|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|最高学位|LAST_EDU_ACADEMIC_DEGREE|[单项选择(文本值)](index/dictionary_index#job_education "教育程度")|100|是||
|毕业时间|LAST_EDU_DATE|文本，可指定长度|100|是||
|毕业院校|LAST_EDU_SCHOOL|文本，可指定长度|100|是||
|所学专业|LAST_EDU_SPECIALITY|文本，可指定长度|100|是||
|最近工作公司|LAST_EXP_COMPANY|文本，可指定长度|100|是||
|最近工作时间|LAST_EXP_DATE|文本，可指定长度|100|是||
|最近工作岗位|LAST_EXP_JOB|文本，可指定长度|100|是||
|最新标签|LAST_TAGS|文本，可指定长度|1000|是||
|申请日期|LAST_TP_APPLIED_AT|日期型||是||
|归档日期|LAST_TP_ARCHIVED_AT|日期型||是||
|归档原因|LAST_TP_ARCHIVE_REASON|文本，可指定长度|1000|是||
|归档详细原因|LAST_TP_ARCHIVE_REASON_DETAIL|文本，可指定长度|1000|是||
|申请职位|LAST_TP_JOB_NAME|文本，可指定长度|100|是||
|归档前阶段|LAST_TP_STAGE_NAME|文本，可指定长度|100|是||
|归档人才库|LAST_TP_TALENT_POOL|文本，可指定长度|1000|是||
|手机号|MOBILE_PHONE|文本，可指定长度|100|是||
|候选人姓名|NAME|文本，可指定长度|200|是||
|人才库候选人数量|TALENT_POOL_COUNT|整型||是||
|人员|USER_ID|外键值|60|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_HR_CANDIDATE_CANDIDATE_ID](der/DER1N_HR_APPLICANT_HR_CANDIDATE_CANDIDATE_ID)|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|1:N关系||
|[DER1N_HR_CANDIDATE_TALENT_POOL_HR_CANDIDATE_CANDIDATE_ID](der/DER1N_HR_CANDIDATE_TALENT_POOL_HR_CANDIDATE_CANDIDATE_ID)|[候选者与人才库关系(HR_CANDIDATE_TALENT_POOL)](module/hr/hr_candidate_talent_pool)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_CANDIDATE_HR_EMPLOYEE_USER_ID](der/DER1N_HR_CANDIDATE_HR_EMPLOYEE_USER_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||

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
|放入人才库|add_to_hr_talentpool|[实体处理逻辑](module/hr/hr_candidate/logic/add_to_hr_talentpool "放入人才库")|默认|不支持||||
|获取当日归档人数|get_archived_today_count|[实体处理逻辑](module/hr/hr_candidate/logic/get_archived_today_count "今日归档人数")|默认|不支持||||
|获取工作台我的关注数|get_my_attention_count|[实体处理逻辑](module/hr/hr_candidate/logic/get_my_attention_count "获取工作台我的关注数")|默认|不支持||||
|获取用人经理工作台我的面试数|get_my_interview_count|[实体处理逻辑](module/hr/hr_candidate/logic/get_my_interview_count "获取工作台面试数")|默认|不支持||||
|获取工作台我的事项数|get_my_summary_count|[实体处理逻辑](module/hr/hr_candidate/logic/get_my_summary_count "获取工作台我的事项数")|默认|不支持||||
|我的待办事项清单计数器|get_my_todolist_count|[实体处理逻辑](module/hr/hr_candidate/logic/get_my_todolist_count "我的待办事项清单计数器")|默认|不支持||||
|获取人才库候选人总数|get_talent_pool_count|[实体处理逻辑](module/hr/hr_candidate/logic/get_talent_pool_count "人才库候选人数量")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[人才库候选人数量](module/hr/hr_candidate/logic/get_talent_pool_count)|get_talent_pool_count|无|||
|[今日归档人数](module/hr/hr_candidate/logic/get_archived_today_count)|get_archived_today_count|无|||
|[我的待办事项清单计数器](module/hr/hr_candidate/logic/get_my_todolist_count)|get_my_todolist_count|无|||
|[放入人才库](module/hr/hr_candidate/logic/add_to_hr_talentpool)|add_to_hr_talentpool|无|||
|[获取工作台我的事项数](module/hr/hr_candidate/logic/get_my_summary_count)|get_my_summary_count|无|||
|[获取工作台我的关注数](module/hr/hr_candidate/logic/get_my_attention_count)|get_my_attention_count|无|||
|[获取工作台面试数](module/hr/hr_candidate/logic/get_my_interview_count)|get_my_interview_count|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[数据查询(DEFAULT)](module/hr/hr_candidate/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_candidate/query/View)|VIEW|否|否 |否 ||
|[公共人才库查询(PUBLIC_TALENT_POOL)](module/hr/hr_candidate/query/public_talent_pool)|PUBLIC_TALENT_POOL|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/hr/hr_candidate/dataset/Default)|DEFAULT|数据查询|是|||
|[公共人才库查询(PUBLIC_TALENT_POOL)](module/hr/hr_candidate/dataset/public_talent_pool)|PUBLIC_TALENT_POOL|数据查询|否|||

## 数据权限

##### 全部数据（读写） :id=hr_candidate-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `DELETE`
* `CREATE`
* `UPDATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_EDUCATION_EQ|教育程度|EQ||
|N_GENDER_EQ|性别|EQ||
|N_ID_EQ|标识|EQ||
|N_LAST_TP_TALENT_POOL_LIKE|归档人才库|LIKE||
|N_NAME_LIKE|候选人姓名|LIKE||
|N_USER_ID_EQ|人员|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 推荐给用人部门 | recommend_department | 推荐给用人部门 |单项数据|<details><summary>打开视图或向导（模态）</summary>[筛选候选人](app/view/hr_candidate_filter_recommend_department_option_view)</details>||
| 放入人才库 | add_to_hr_talentpool | 放入人才库 |单项数据|<details><summary>后台调用</summary>[add_to_hr_talentpool](#行为)||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_candidate?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_candidate?id=界面行为`">
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