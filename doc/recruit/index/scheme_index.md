# 数据结构 <!-- {docsify-ignore-all} -->

### 默认数据库架构
#### 评论(COMMENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CONTENT|内容|TEXT|是|1048576|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_TOP|是否置顶|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|PID|父标识|VARCHAR|是|100|||
|PRINCIPAL_ID|评论主体标识|VARCHAR|是|100|||
|PRINCIPAL_NAME|评论主体名称|VARCHAR|是|100|||
|PRINCIPAL_TYPE|评论主体类型|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 执行人(EXECUTOR)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER_ID|所属数据标识|VARCHAR|是|100|||
|OWNER_SUBTYPE|所属对象子类型|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|SEQUENCE|序号|DECIMAL|是||||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
|USER_ID|用户标识|VARCHAR|是|100|||
|USER_NAME|用户名称|VARCHAR|是|200|||
#### 扩展日志(EXTEND_LOG)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CATEGORY|类别|VARCHAR|是|100|||
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|DEBUG_INFO|调试日志信息|TEXT|是|1048576|||
|ELAPSED_TIME|持续时间|INT|是|11|||
|END_AT|结束时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INFO|日志信息|TEXT|是|1048576|||
|LEVEL|级别|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER_ID|所属数据标识|VARCHAR|是|200|||
|OWNER_SUBTYPE|所属对象子类型|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|START_AT|起始时间|DATETIME|是||||
|STATE|状态|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 收藏(FAVORITE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_MAN|建立人|VARCHAR|是|100|||
|CREATE_TIME|建立时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER_ID|所属数据标识|VARCHAR|是|100|||
|OWNER_SUBTYPE|所属对象子类型|VARCHAR|是|100|||
|OWNER_TYPE|所属数据对象|VARCHAR|是|100|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 候选人申请(HR_APPLICANT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADDRESS|所在地|VARCHAR|是|200|||
|APPLICANT_NOTES|申请人备注|TEXT|是|1048576|||
|BIRTHDAY|出生日期|VARCHAR|是|100|||
|CANDIDATE_DISPLAY_NAME|候选人姓名|VARCHAR|是|100|||
|CANDIDATE_ID|应聘人|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DESCRIPTION|描述|TEXT|是|1048576|||
|EDUCATION|教育程度|VARCHAR|是|100|||
|EMAIL_FROM|邮箱主送|VARCHAR|是|100|||
|EXPERIENCE|工作经验|VARCHAR|是|100|||
|GENDER|性别|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IMAGE|图片|VARCHAR|是|200|||
|JOB_ID|工作岗位|VARCHAR|是|100|||
|JOB_PLATFORM_ID|招聘平台|VARCHAR|是|100|||
|LAST_EDU_ACADEMIC_DEGREE|学位|VARCHAR|是|100|||
|LAST_EDU_DATE|在校时间段|VARCHAR|是|100|||
|LAST_EDU_SCHOOL|毕业院校|VARCHAR|是|100|||
|LAST_EDU_SPECIALITY|专业|VARCHAR|是|100|||
|LAST_EXP_COMPANY|最近工作公司|VARCHAR|是|100|||
|LAST_EXP_DATE|最近工作时间|VARCHAR|是|100|||
|LAST_EXP_JOB|最近工作岗位|VARCHAR|是|100|||
|MOBILE_PHONE|手机号|VARCHAR|是|100|||
|OWNER_ID|候选人所有者|VARCHAR|是|60|||
|RESUME_SOURCE|简历来源|VARCHAR|是|60|||
|SALARY_EXPECTED|期望薪资|FLOAT|是||||
|SALARY_PROPOSED|建议薪资|FLOAT|是||||
|STAGE_ID|阶段|VARCHAR|是|100|||
|STATUS|申请状态|VARCHAR|是|60|||
|TAGS|标签|VARCHAR|是|1000|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 申请人类别(HR_APPLICANT_CATEGORY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COLOR|颜色指标|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 候选人申请与面试关系(HR_APPLICANT_INTERVIEW)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|APPLICANT_ID|候选人申请|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INTERVIEW_ID|面试|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
####  拒绝原因 申请人(HR_APPLICANT_REFUSE_REASON)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|CANDIDATE_ID|应聘人|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|JOB_ID|工作岗位|VARCHAR|是|100|||
|LAST_STAGE_ID|最终阶段|VARCHAR|是|100|||
|MESSAGE_MAIN_ATTACHMENT_ID|主要附件|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|REFUSE_REASON_ID|拒绝理由|VARCHAR|是|100|||
|SEQUENCE|序列|INT|是||||
|STAGE_ID|阶段|VARCHAR|是|100|||
|USER_ID|招聘人员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 候选人(HR_CANDIDATE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADDRESS_ID|户籍地址|VARCHAR|是|100|||
|BIRTHDAY|出生日期|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|EDUCATION|教育程度|VARCHAR|是|100|||
|EMAIL_FROM|电子邮件|VARCHAR|是|500|||
|EXPERIENCE|工作经验|VARCHAR|是|100|||
|GENDER|性别|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LAST_EDU_ACADEMIC_DEGREE|学位|VARCHAR|是|100|||
|LAST_EDU_DATE|在校时间段|VARCHAR|是|100|||
|LAST_EDU_SCHOOL|毕业院校|VARCHAR|是|100|||
|LAST_EDU_SPECIALITY|专业|VARCHAR|是|100|||
|LAST_EXP_COMPANY|最近工作公司|VARCHAR|是|100|||
|LAST_EXP_DATE|最近工作时间|VARCHAR|是|100|||
|LAST_EXP_JOB|最近工作岗位|VARCHAR|是|100|||
|LAST_TAGS|最新标签|VARCHAR|是|1000|||
|LAST_TP_APPLIED_AT|申请日期|DATETIME|是||||
|LAST_TP_ARCHIVED_AT|归档日期|DATETIME|是||||
|LAST_TP_ARCHIVE_REASON|归档原因|VARCHAR|是|1000|||
|LAST_TP_ARCHIVE_REASON_DETAIL|归档详细原因|VARCHAR|是|1000|||
|LAST_TP_JOB_NAME|申请职位|VARCHAR|是|100|||
|LAST_TP_STAGE_NAME|归档前阶段|VARCHAR|是|100|||
|LAST_TP_TALENT_POOL|归档人才库|VARCHAR|是|1000|||
|MOBILE_PHONE|手机号|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|USER_ID|候选人管理员|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 候选人教育经历(HR_CANDIDATE_EDUCATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACADEMIC_DEGREE|学位|VARCHAR|是|100|||
|APPLICANT_ID|候选人申请|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|END_DATE|结束时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SCHOOL|学校|VARCHAR|是|100|||
|SPECIALITY|专业|VARCHAR|是|100|||
|START_DATE|开始时间|DATETIME|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 候选人工作经历(HR_CANDIDATE_EXPERIENCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|APPLICANT_ID|候选人申请|VARCHAR|是|100|||
|COMPANY|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEPARTMENT|部门|VARCHAR|是|100|||
|END_DATE|结束时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INDUSTRY|行业|VARCHAR|是|100|||
|JOB_NAME|岗位|VARCHAR|是|100|||
|LEADER|领导|VARCHAR|是|100|||
|LOCATION|地点|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|NOW|至今|INT|是||||
|REASON_FOR_LEAVING|离职原因|VARCHAR|是|1000|||
|SALARY|薪资|VARCHAR|是|100|||
|START_DATE|开始时间|DATETIME|是||||
|SUMMARY|概述|VARCHAR|是|1000|||
|UNDERLING_NUMBER|下属人数|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 筛选候选人(HR_CANDIDATE_FILTER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|APPLICANT_ID|候选人申请|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|MEMO|备注|VARCHAR|是|2000|||
|NAME|名称|VARCHAR|是|200|||
|REVIEWER_USER_IDS|审核用户|TEXT|是|1048576|||
|TYPE|类型|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|APPLICANT_ID|申请标识|VARCHAR|是|100|||
|CANDIDATE_FILTER_ID|筛选|VARCHAR|是|100|||
|CONTENT|内容|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|EDUCATION|教育程度|VARCHAR|是|100|||
|EMAIL_FROM|邮箱|VARCHAR|是|100|||
|FEEDBACK_INFORMATION|反馈信息|VARCHAR|是|2000|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|JOB_PLATFORM_NAME|招聘平台|VARCHAR|是|100|||
|MEMO|备注|VARCHAR|是|2000|||
|NAME|名称|VARCHAR|是|200|||
|STATUS|状态|VARCHAR|是|60|||
|TYPE|类型|VARCHAR|是|60|||
|USER_ID|人员|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 候选人标签(HR_CANDIDATE_LABEL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 候选人的技能水平(HR_CANDIDATE_SKILL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CANDIDATE_ID|应聘人|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|SKILL_ID|技能|VARCHAR|是|100|||
|SKILL_LEVEL_ID|技能等级|VARCHAR|是|100|||
|SKILL_TYPE_ID|技能类型|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 候选者与人才库关系(HR_CANDIDATE_TALENTPOOL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CANDIDATE_ID|候选人|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|TALENTPOOL_ID|人才库|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 候选者与人才库关系(HR_CANDIDATE_TALENT_POOL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CANDIDATE_ID|候选人|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|TALENTPOOL_ID|人才库|VARCHAR|是|100|||
|TALENT_POOL_ID|人才库|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 合同类型(HR_CONTRACT_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CODE|代码|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 部门(HR_DEPARTMENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COLOR|颜色指标|VARCHAR|是|100|||
|COMPANY_ID|公司|VARCHAR|是|60|||
|COMPLETE_NAME|完整名称|VARCHAR|是|500|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|NOTE|备注|TEXT|是|1048576|||
|PARENT_ID|上级部门|VARCHAR|是|100|||
|PARENT_PATH|父级路径|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 员工(HR_EMPLOYEE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|ADDITIONAL_NOTE|其它说明|TEXT|是|1048576|||
|BARCODE|徽标 ID|VARCHAR|是|500|||
|BIRTHDAY|出生日期|DATETIME|是||||
|CERTIFICATE|证书等级|VARCHAR|是|60|||
|CHILDREN|受抚养的子女数|INT|是||||
|COLOR|颜色指标|INT|是||||
|COMPANY_ID|部门|VARCHAR|是|60|||
|CONTRACT_WARNING|合同警告|INT|是||||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DEPARTURE_DATE|离职日期|DATETIME|是||||
|DEPARTURE_DESCRIPTION|其它信息|TEXT|是|1048576|||
|DISTANCE_HOME_WORK|通勤距离|INT|是||||
|DISTANCE_HOME_WORK_UNIT|通勤距离（单位）|VARCHAR|是|60|||
|EDUCATION_LEVEL|最高学历|VARCHAR|是|60|||
|EMERGENCY_CONTACT|联系人姓名|VARCHAR|是|100|||
|EMERGENCY_PHONE|电话|VARCHAR|是|50|||
|EMPLOYEE_TYPE|雇佣关系|VARCHAR|是|60|||
|FIRST_CONTRACT_DATE|首次合同日期|DATETIME|是||||
|GENDER|性别|VARCHAR|是|60|||
|HR_JOB_ID|职位|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|60|||
|IDENTIFICATION_ID|证件号码|VARCHAR|是|500|||
|IDENTIFICATION_TYPE|证件类型|VARCHAR|是|60|||
|IS_FLEXIBLE|灵活可变|INT|是||||
|IS_FULLY_FLEXIBLE|完全灵活|INT|是||||
|JOB_ID|任职职位|VARCHAR|是|100|||
|JOB_TITLE|工作头衔|VARCHAR|是|500|||
|JOIN_WORKDATE|入职日期|DATETIME|是||||
|KM_HOME_WORK|通勤距离（公里）|INT|是||||
|LEGAL_NAME|法定名称|VARCHAR|是|500|||
|MAJOR|专业|VARCHAR|是|100|||
|MARITAL_STATUS|婚姻状况|VARCHAR|是|60|||
|MOBILE_PHONE|手机号码|VARCHAR|是|50|||
|MOBILITY_CARD|调动卡|VARCHAR|是|500|||
|NAME|姓名|VARCHAR|是|100|||
|NATION|民族|VARCHAR|是|60|||
|NOTES|备注|TEXT|是|1048576|||
|PARENT_PATH|管理链|TEXT|是|1048576|||
|PASSPORT_ID|护照号|VARCHAR|是|500|||
|PERMIT_NO|工号|VARCHAR|是|500|||
|PIN|PIN|VARCHAR|是|500|||
|PLACE_OF_BIRTH|出生地|VARCHAR|是|500|||
|PRIVATE_CAR_PLATE|私人车辆车牌|VARCHAR|是|500|||
|PRIVATE_CITY|户籍所在地|VARCHAR|是|500|||
|PRIVATE_EMAIL|私人电子邮箱|VARCHAR|是|250|||
|PRIVATE_PHONE|私人电话|VARCHAR|是|50|||
|PRIVATE_STREET|户籍地址|VARCHAR|是|500|||
|PRIVATE_STREET2|户籍详细地址|VARCHAR|是|500|||
|PRIVATE_ZIP|邮编|VARCHAR|是|50|||
|SINID|社会保险号SIN|VARCHAR|是|50|||
|SPOUSE_BIRTHDATE|配偶生日|DATETIME|是||||
|SPOUSE_COMPLETE_NAME|配偶全名|VARCHAR|是|500|||
|SSNID|社会保障号SSN|VARCHAR|是|500|||
|START_WORKDATE|参加工作日期|DATETIME|是||||
|STUDY_FIELD|研究领域|VARCHAR|是|500|||
|STUDY_SCHOOL|毕业学校|VARCHAR|是|500|||
|USER_ID|用户|VARCHAR|是|100|||
|VEHICLE|公司汽车|VARCHAR|是|50|||
|VISA_EXPIRE|签证有效期|DATETIME|是||||
|VISA_NO|签证号|VARCHAR|是|500|||
|WORK_EMAIL|工作电子邮件|VARCHAR|是|500|||
|WORK_PERMIT_EXPIRATION_DATE|工作许可证到期日期|DATETIME|是||||
|WORK_PERMIT_SCHEDULED_ACTIVITY|工作许可的预定活动|INT|是||||
|WORK_PHONE|办公电话|VARCHAR|是|50|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
####  技能历史(HR_EMPLOYEE_SKILL_LOG)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE|日期|DATETIME|是||||
|EMPLOYEE_ID|员工|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|SKILL_ID|技能|VARCHAR|是|100|||
|SKILL_LEVEL_ID|技能等级|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 考试/测评(HR_EXAM)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ANSWERLINK|发给候选人的测评链接|VARCHAR|是|300|||
|APPLICANT_ID|考试|VARCHAR|是|100|||
|ATTACHMENT|报告|VARCHAR|是|1000|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_TIME|发起时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DETAIL_RESULT|详细成绩|VARCHAR|是|2000|||
|FINISH_TIME|结果回传时间|DATETIME|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|RESULT|考试测评结果|VARCHAR|是|100|||
|SOURCE|服务商|VARCHAR|是|100|||
|STATUS|考试状态|VARCHAR|是|60|||
|TYPE|类型|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 招聘需求(HR_IDEA)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADDRESS_ID|工作地点|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|招聘开始时间|DATETIME|是||||
|DATE_TO|招聘结束时间|DATETIME|是||||
|DEPARTMENT_CODE|需求部门|VARCHAR|是|100|||
|DESCRIPTION|需求描述|TEXT|是|1048576|||
|EDUCATION|学历要求|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|60|||
|IDENTIFIER|需求编号|VARCHAR|是|100|||
|JOB_NAME|职位名称|VARCHAR|是|100|||
|JOB_TYPE|职位性质|VARCHAR|是|60|||
|MANAGEMENT_RANK_IDS|管理职级|VARCHAR|是|100|||
|MANAGER_EMPLOYEE_IDS|负责人工号|VARCHAR|是|100|||
|MAX_SALARY|最高薪资|INT|是||||
|MIN_SALARY|最低薪资|INT|是||||
|NAME|名称|VARCHAR|是|100|||
|NEED_NUMBER|需求人数|INT|是||||
|PAYMENTMETHOD|发薪方式|INT|是||||
|PAYPERIOD|发薪月数|INT|是||||
|PROFESSIONAL_RANK_IDS|专业职级|VARCHAR|是|100|||
|SALARY_UNIT|薪资单位|INT|是||||
|STATUS|需求状态|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 需求与职位关系(HR_IDEA_JOB)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATEDATE|建立时间|DATETIME|是|8|||
|CREATEMAN|建立人|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|200|||
|IDEA_ID|需求|VARCHAR|是|60|||
|JOB_ID|岗位|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|100|||
|UPDATEDATE|更新时间|DATETIME|是|8|||
|UPDATEMAN|更新人|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 面试安排(HR_INTERVIEW)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADDRESS_ID|面试地点|VARCHAR|是|100|||
|APPLICANT_ID|候选人申请|VARCHAR|是|100|||
|APPLICANT_IDS|候选人申请|VARCHAR|是|1000|||
|CANDIDATE_URL|候选人链接|VARCHAR|是|100|||
|CATEGORY|面试类型分类|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DURATION|面试时长|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INTERVIEWERS|面试官|VARCHAR|是|1000|||
|INTERVIEWER_NAME|面试官姓名|VARCHAR|是|100|||
|INTERVIEWER_URL|面试官链接|VARCHAR|是|100|||
|JOB_PLATFORM_NAME|平台名称|VARCHAR|是|100|||
|MEETING_ID|会议号|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER_ID|面试负责人|VARCHAR|是|60|||
|SCHEDULE_ID|面试安排|VARCHAR|是|100|||
|STAGE_ID|阶段|VARCHAR|是|100|||
|START_DATE|面试日期|DATETIME|是||||
|START_TIME|面试时间|VARCHAR|是|200|||
|STATUS|面试状态|VARCHAR|是|60|||
|TYPE|面试类型|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 面试反馈(HR_INTERVIEW_FEEDBACK)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|APPLICANT_ID|候选人申请|VARCHAR|是|100|||
|APPLICANT_INTERVIEW_ID|申请与面试关系|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INTERVIEWER_ID|面试官|VARCHAR|是|60|||
|INTERVIEW_ID|面试|VARCHAR|是|100|||
|INTERVIEW_USER_ID|面试官|VARCHAR|是|100|||
|IS_NEXT_ROUND|是否可进入下轮面试|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|RESULT_TYPE|面试结果|VARCHAR|是|60|||
|START_DATE|面试时间|DATETIME|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 面试安排(HR_INTERVIEW_SCHEDULE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADDRESS_ID|面试地点|VARCHAR|是|100|||
|APPLICANT_ID|候选人申请|VARCHAR|是|100|||
|ATTACHMENT|附件|VARCHAR|是|100|||
|CATEGORY|面试类型分类|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|EMAIL_CONTENT|邮件内容|VARCHAR|是|500|||
|EMAIL_TEMPLATE_ID|邮件模版|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INTERVIEW_CATEGORY|面试类型分类|VARCHAR|是|100|||
|INTERVIEW_TYPE|面试类型|VARCHAR|是|60|||
|IS_SEND_EMAIL|是否发送邮件通知|VARCHAR|是|100|||
|IS_SEND_SMS|是否发送短信|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|RESUME_TYPE|简历类型|VARCHAR|是|60|||
|SMS_CONTENT|短信内容|VARCHAR|是|500|||
|SMS_TEMPLATE_ID|短信模版|VARCHAR|是|60|||
|START_DATE|面试日期|DATETIME|是||||
|TYPE|面试类型|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 面试参与者(HR_INTERVIEW_USER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|APPLICANT_ID|候选人申请|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INTERVIEW_ID|面试|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|STATUS|状态|VARCHAR|是|100|||
|URL|面试链接|VARCHAR|是|100|||
|USER_ID|面试参与者|VARCHAR|是|100|||
|USER_NAME|面试参与者|VARCHAR|是|100|||
|USER_STATUS|参与者状态|VARCHAR|是|60|||
|USER_TYPE|面试参与者类型|VARCHAR|是|60|||
|VIDEO_URL|会议链接|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 工作岗位(HR_JOB)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADDRESS_ID|工作地点|VARCHAR|是|100|||
|ASSISTANT_UID|招聘协助人|VARCHAR|是|100|||
|CATEGORY|职位类别|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DATE_FROM|起始日期|DATETIME|是||||
|DATE_TO|招聘结束时间|DATETIME|是||||
|DEPARTMENT_ID|部门|VARCHAR|是|100|||
|DESCRIPTION|职位描述|TEXT|是|1048576|||
|EDUCATION|学历要求|VARCHAR|是|60|||
|EXPECTED_EMPLOYEES|预计员工数合计/招聘人数|INT|是||||
|EXPERIENCE|工作经验|VARCHAR|是|60|||
|FUNCTION_TYPE|职能类型|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INTERVIEWER_UID|面试官|VARCHAR|是|100|||
|IS_PUBLISH_HEADHUNTER|是否发布到猎头|INT|是||||
|IS_PUBLISH_REFERRAL|是否发布内推官网|INT|是||||
|IS_PUBLISH_SOCIAL|是否发布社招官网|INT|是||||
|IS_VIRTUAL|是否为虚拟职位|VARCHAR|是|60|||
|JOB_CATEGORY|职位类别|VARCHAR|是|100|||
|JOB_RANK_IDS|职位级别|VARCHAR|是|100|||
|JOB_TYPE|职位性质|VARCHAR|是|60|||
|MANAGER_ID|部门经理|VARCHAR|是|100|||
|MANAGER_UID|用人经理|VARCHAR|是|100|||
|MAX_SALARY|最高薪资|INT|是||||
|MIN_SALARY|最低薪资|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|OWNER_ID|招聘负责人|VARCHAR|是|100|||
|PRIORITY_ID|优先级|INT|是||||
|PROGRESS_ID|招聘流程|VARCHAR|是|100|||
|SOURCE_TYPE|职位来源|VARCHAR|是|60|||
|STATUS|岗位状态|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 招聘平台(HR_JOB_PLATFORM)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|EMAIL|电子邮件|VARCHAR|是|500|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IMAGE|图片|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|REGEX|Regex|VARCHAR|是|500|||
|TYPE|类型|VARCHAR|是|60|||
|URL|招聘平台地址|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 招聘平台账号(HR_JOB_PLATFORM_ACCOUNT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|JOB_PLATFORM_ID|招聘平台|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|RECEIVE_EMAIL|接收简历邮箱|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 招聘平台发布记录(HR_JOB_PLATFORM_RECORD)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|JOB_ID|岗位|VARCHAR|是|100|||
|JOB_PLATFORM_ID|招聘平台|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|200|||
|OWNER_ID|发布人/账号|VARCHAR|是|100|||
|TYPE|类型|VARCHAR|是|100|||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 岗位发布渠道设置(HR_JOB_WEBSITE_SETTING)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|60|||
|IS_DEFAULT_SETTING|是否为默认设置|VARCHAR|是|200|||
|JOB_ID|岗位|VARCHAR|是|100|||
|NAME|名称|VARCHAR|是|100|||
|TYPE|类型|VARCHAR|是|60|||
|URL|地址|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### offer(HR_OFFER)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ANNUAL_PERFORMANCE_BONUS|年度绩效奖金|DECIMAL|是|8|2||
|APPLICANT_ID|候选人申请|VARCHAR|是|100|||
|APPROVAL_ATTACHMENT|审批附件|VARCHAR|是|1000|||
|ATTACHMENT_PASSWORD|附件密码|VARCHAR|是|100|||
|BANK_CARD_INFO|银行卡信息|VARCHAR|是|100|||
|CHECKINDATE|预计入职日期|DATETIME|是||||
|COMMUNICATION_ALLOWANCE|通讯补贴|DECIMAL|是|8|2||
|CONTRACT_TERM|合同期限（年）|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|CURRENT_EMPLOYER|应聘人员所属公司|VARCHAR|是|100|||
|EMAIL_CONTENT|邮件模版内容|TEXT|是|1048576|||
|EMAIL_TEMPLATE|邮件模板|VARCHAR|是|100|||
|HR_IDEA_ID|招聘需求标识|VARCHAR|是|60|||
|HR_IDEA_NAME|招聘需求|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_ENCRYPTED|是否加密|INT|是||||
|IS_GENERATE_ATTACHMENT|生成offer附件|INT|是||||
|JOB_NAME|应聘岗位|VARCHAR|是|100|||
|JOB_RANK_ID|职位级别|VARCHAR|是|100|||
|JOB_RANK_IDS|职位级别|VARCHAR|是|100|||
|LOCATION_CITY|工作地-市|VARCHAR|是|100|||
|LOCATION_ID|入职地点|VARCHAR|是|100|||
|MA_CURRENCY|餐补单位|VARCHAR|是|100|||
|MEAL_ALLOWANCE|餐补|DECIMAL|是|8|2||
|NAME|名称|VARCHAR|是|200|||
|OFFER_ATTACHMENT_TEMPLATE|附件模版|VARCHAR|是|100|||
|OFFER_TYPE|offer类型|VARCHAR|是|100|||
|RES_COMPANY_ID|入职部门标识|VARCHAR|是|60|||
|SALARY_1|转正基本工资|DECIMAL|是|8|2||
|SALARY_2|实习生绩效工资|DECIMAL|是|8|2||
|SALARY_3|转正绩效工资|DECIMAL|是|8|2||
|SALARY_4|试用期基本工资|DECIMAL|是|8|2||
|SALARY_5|试用期绩效工资|DECIMAL|是|8|2||
|SALARY_6|实习期薪酬|DECIMAL|是|8|2||
|SALARY_METHOD|薪酬分配方式|VARCHAR|是|100|||
|SALARY_TYPE|薪资类型|VARCHAR|是|100|||
|SMS_CONTENT|短信模板内容|TEXT|是|1048576|||
|SMS_TEMPLATE|短信模板|VARCHAR|是|100|||
|TRANSPORTATION_ALLOWANCE|交通补贴|DECIMAL|是|8|2||
|WORKING_HOURS_AM|工作时间（上午）|VARCHAR|是|100|||
|WORKING_HOURS_PM|工作时间（下午）|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### offer审核(HR_OFFER_APPROVAL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|HR_OFFER_ID|offer标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PERIOD|审批状态|VARCHAR|是|60|||
|STATUS|审核结果状态|VARCHAR|是|60|||
|WFMEMO|审核信息|VARCHAR|是|2000|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### Offer发送记录(HR_OFFER_HISTORY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|FEEDBACK_STATUS|反馈状态|VARCHAR|是|60|||
|HR_OFFER_ID|Offer标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEND_TIME|发送时间|DATETIME|是||||
|SEND_TYPE|发送方式|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 导入记录(HR_OFFER_IMP_REC)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|HR_OFFER_ID|offer标识|VARCHAR|是|100|||
|HR_OFFER_IMP_RECID<i class="fa fa-key"></i>|导入记录标识|VARCHAR|否|100|||
|HR_OFFER_IMP_RECNAME|导入记录名称|VARCHAR|是|200|||
|IMP_DATE|导入时间|VARCHAR|是|100|||
|IMP_STAGE|导入阶段|VARCHAR|是|100|||
|IMP_STATUS|导入状态|VARCHAR|是|100|||
|NAME|姓名|VARCHAR|是|100|||
|OPERATOR|操作人|VARCHAR|是|100|||
|SYSTEM|第三方系统|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 申请人学历(HR_RECRUITMENT_DEGREE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 招聘流程(HR_RECRUITMENT_PROGRESS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATEDATE|建立时间|DATETIME|是|8|||
|CREATEMAN|建立人|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|招聘流程名称|VARCHAR|是|200|||
|STATUS|状态|VARCHAR|是|60|||
|UPDATEDATE|更新时间|DATETIME|是|8|||
|UPDATEMAN|更新人|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 申请人来源(HR_RECRUITMENT_SOURCE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|JOB_ID|工作|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
####  招聘阶段(HR_RECRUITMENT_STAGE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|COLOR|颜色|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|FOLD|折叠看板|INT|是||||
|HIRED_STAGE|雇佣阶段|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEGEND_BLOCKED|红色的看板标签|VARCHAR|是|500|||
|LEGEND_DONE|绿色看板标签|VARCHAR|是|500|||
|LEGEND_NORMAL|灰色看板标签|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|REQUIREMENTS|要求|TEXT|是|1048576|||
|SEQUENCE|序列|INT|是||||
|STATUS|状态|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 技能(HR_SKILL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEQUENCE|序列|INT|是||||
|SKILL_TYPE_ID|技能类型|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 技能等级(HR_SKILL_LEVEL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEFAULT_LEVEL|默认等级|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LEVEL_PROGRESS|进度|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|SKILL_TYPE_ID|技能类型|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 技能类型(HR_SKILL_TYPE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COLOR|颜色|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SKILL_TYPE_ID|技能类型|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 人才库(HR_TALENTPOOL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|HR_TALENTPOOL_ID|淘汰自动归档|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 人才库(HR_TALENT_POOL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 工作地点(HR_WORK_LOCATION)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|LOCATION_NUMBER|地点编号|VARCHAR|是|500|||
|LOCATION_TYPE|封面图片|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|200|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 附件(IR_ATTACHMENT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACCESS_TOKEN|访问令牌|VARCHAR|是|500|||
|CHECKSUM|校验码/SHA1|VARCHAR|是|500|||
|COMPANY_ID|公司|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DESCRIPTION|描述|TEXT|是|1048576|||
|FILE_ID|oss文件标识|VARCHAR|是|500|||
|FILE_SIZE|文件大小|INT|是||||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|INDEX_CONTENT|索引内容|TEXT|是|1048576|||
|MIMETYPE|Mime类型|VARCHAR|是|500|||
|NAME|名称|VARCHAR|是|200|||
|ORIGINAL_ID|原始（未优化，未调整大小）附件|VARCHAR|是|100|||
|PUBLIC|是公开文件|INT|是||||
|RES_FIELD|资源字段|VARCHAR|是|500|||
|RES_ID|资源标识|VARCHAR|是|100|||
|RES_MODEL|资源模型|VARCHAR|是|500|||
|STORE_FNAME|存储的文件名|VARCHAR|是|500|||
|TYPE|类型|VARCHAR|是|60|||
|URL|网址|VARCHAR|是|500|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 主数据(MASTER)
#### 分析报表(REPORT)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CATEGORIES|类别|VARCHAR|是|2000|||
|CHART_TYPE|图表类型|VARCHAR|是|60|||
|CREATE_MAN|创建人|VARCHAR|是|100|||
|CREATE_TIME|创建时间|DATETIME|是||||
|DESC|描述|TEXT|是|1048576|||
|ENABLE|逻辑有效标识|INT|是||||
|GROUP|组别|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|IS_SYSTEM|是否系统类型|INT|是||||
|NAME|名称|VARCHAR|是|200|||
|TEMPLATE_MODEL|模板模型|TEXT|是|1048576|||
|UPDATE_MAN|更新人|VARCHAR|是|100|||
|UPDATE_TIME|更新时间|DATETIME|是||||
#### 组织(RES_COMPANY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|BUSINESS_PARENT_ID|业务维度上级|VARCHAR|是|60|||
|BUSINESS_SORT|业务维度序号|INT|是||||
|CATEGORY|大类|VARCHAR|是|60|||
|CODE|文号|VARCHAR|是|100|||
|COMPANY_CREATEDATE|设立日期|DATETIME|是||||
|COMPANY_DETAILS|简介|TEXT|是|1048576|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|HRBP_ID|hrbp|VARCHAR|是|60|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|60|||
|IDENTIFIER|编码|VARCHAR|是|100|||
|IS_VIRTUAL|虚拟组织|INT|是||||
|LEVEL|层级|VARCHAR|是|60|||
|MANAGEMENT_PARENT_ID|行政维度上级|VARCHAR|是|60|||
|MANAGEMENT_SORT|行政维度序号|INT|是||||
|MANAGER_ID|负责人|VARCHAR|是|60|||
|NAME|名称|VARCHAR|是|100|||
|SHORT_NAME|简称|VARCHAR|是|100|||
|TELEPHONE|电话|VARCHAR|是|100|||
|TYPE|类型|VARCHAR|是|60|||
|WEBSITE|网址|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 用户(RES_USERS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ACTIVE|有效|INT|是||||
|COMPANY_ID|公司|VARCHAR|是|100|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DISPLAY_NAME|姓名|VARCHAR|是|200|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|KARMA|贡献值|INT|是||||
|LOGIN|登录|VARCHAR|是|500|||
|ODOOBOT_FAILED|Odoobot 挂了|INT|是||||
|SHARE|共享用户|INT|是||||
|SIGNATURE|电子邮件签名|TEXT|是|1048576|||
|TARGET_SALES_DONE|活动完成目标|INT|是||||
|TARGET_SALES_INVOICED|销售订单目标结算单|INT|是||||
|TARGET_SALES_WON|商机赢得目标|INT|是||||
|TOUR_ENABLED|新手入门|INT|是||||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 候选人标签(T_HR_APPLICANT_TAGS)
#### 招聘需求(T_HR_IDEA)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|ADDRESS_ID|工作地点|VARCHAR|是|100|||
|COMPLETE_DATE|目标完成时间|DATETIME|是||||
|CREATEDATE|建立时间|DATETIME|是|8|||
|CREATEMAN|建立人|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|DEPARTMENT_CODE|需求部门|VARCHAR|是|100|||
|DESCRIPTION|需求描述|TEXT|是|1048576|||
|EDUCATION|学历要求|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|60|||
|IDENTIFIER|需求编号|VARCHAR|是|100|||
|JOB_NAME|职位名称|VARCHAR|是|100|||
|MANAGEMENT_RANK_IDS|管理职级|VARCHAR|是|100|||
|MANAGER_EMPLOYEE_IDS|负责人工号|VARCHAR|是|100|||
|MAX_SALARY|最高薪资|INT|是||||
|MIN_SALARY|最低薪资|INT|是||||
|NAME|名称|VARCHAR|是|100|||
|NEED_NUMBER|需求人数|INT|是||||
|PAYMENTMETHOD|发薪方式|INT|是||||
|PAYPERIOD|发薪月数|INT|是||||
|PROFESSIONAL_RANK_IDS|专业职级|VARCHAR|是|100|||
|SALARY_UNIT|薪资单位|INT|是||||
|START_DATE|需求开始时间|DATETIME|是||||
|STATUS|需求状态|VARCHAR|是|60|||
|TYPE|职位性质|VARCHAR|是|100|||
|UPDATEDATE|更新时间|DATETIME|是|8|||
|UPDATEMAN|更新人|VARCHAR|是|60|||
|USER_ID|招聘负责人|VARCHAR|是|100|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### offer审核(T_HR_OFFER_APPROVAL)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATEDATE|建立时间|DATETIME|是|8|||
|CREATEMAN|建立人|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|HR_OFFER_APPROVALID<i class="fa fa-key"></i>|offer审核标识|VARCHAR|否|100|||
|HR_OFFER_APPROVALNAME|offer审核名称|VARCHAR|是|200|||
|HR_OFFER_ID|offer标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|PERIOD|审批状态|VARCHAR|是|60|||
|STATUS|审核状态|VARCHAR|是|60|||
|UPDATEDATE|更新时间|DATETIME|是|8|||
|UPDATEMAN|更新人|VARCHAR|是|60|||
|WFMEMO|审核信息|VARCHAR|是|2000|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### Offer发送记录(T_HR_OFFER_HISTORY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATEDATE|建立时间|DATETIME|是|8|||
|CREATEMAN|建立人|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|FEEDBACK_STATUS|反馈状态|VARCHAR|是|60|||
|HR_OFFER_HISTORYID<i class="fa fa-key"></i>|Offer发送记录标识|VARCHAR|否|100|||
|HR_OFFER_HISTORYNAME|Offer发送记录名称|VARCHAR|是|200|||
|HR_OFFER_ID|Offer标识|VARCHAR|是|100|||
|ID<i class="fa fa-key"></i>|标识|VARCHAR|否|100|||
|NAME|名称|VARCHAR|是|200|||
|SEND_TIME|发送时间|DATETIME|是||||
|SEND_TYPE|发送方式|VARCHAR|是|100|||
|UPDATEDATE|更新时间|DATETIME|是|8|||
|UPDATEMAN|更新人|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 导入记录(T_HR_OFFER_IMP_REC)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATEDATE|建立时间|DATETIME|是|8|||
|CREATEMAN|建立人|VARCHAR|是|60|||
|CREATE_DATE|建立时间|DATETIME|是||||
|CREATE_UID|建立人|VARCHAR|是|100|||
|HR_OFFER_ID|offer标识|VARCHAR|是|100|||
|HR_OFFER_IMP_RECID<i class="fa fa-key"></i>|导入记录标识|VARCHAR|否|100|||
|HR_OFFER_IMP_RECNAME|导入记录名称|VARCHAR|是|200|||
|IMP_DATE|导入时间|VARCHAR|是|100|||
|IMP_STAGE|导入阶段|VARCHAR|是|100|||
|IMP_STATUS|导入状态|VARCHAR|是|100|||
|NAME|姓名|VARCHAR|是|100|||
|OPERATOR|操作人|VARCHAR|是|100|||
|SYSTEM|第三方系统|VARCHAR|是|100|||
|UPDATEDATE|更新时间|DATETIME|是|8|||
|UPDATEMAN|更新人|VARCHAR|是|60|||
|WRITE_DATE|更新时间|DATETIME|是||||
|WRITE_UID|更新人|VARCHAR|是|100|||
#### 招聘流程(T_HR_RECRUITMENT_PROGRESS)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATEDATE|建立时间|DATETIME|是|8|||
|CREATEMAN|建立人|VARCHAR|是|60|||
|HR_RECRUITMENT_PROGRESSID<i class="fa fa-key"></i>|招聘流程标识|VARCHAR|否|100|||
|HR_RECRUITMENT_PROGRESSNAME|招聘流程名称|VARCHAR|是|200|||
|STATUS|状态|VARCHAR|是|60|||
|UPDATEDATE|更新时间|DATETIME|是|8|||
|UPDATEMAN|更新人|VARCHAR|是|60|||
#### Offer发送记录(T_OFFER_HISTORY)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATEDATE|建立时间|DATETIME|是|8|||
|CREATEMAN|建立人|VARCHAR|是|60|||
|HR_OFFER_ID|Offer标识|VARCHAR|是|100|||
|OFFER_HISTORYID<i class="fa fa-key"></i>|Offer发送记录标识|VARCHAR|否|100|||
|OFFER_HISTORYNAME|Offer发送记录名称|VARCHAR|是|200|||
|UPDATEDATE|更新时间|DATETIME|是|8|||
|UPDATEMAN|更新人|VARCHAR|是|60|||
#### 工作台(T_WORKSPACE)
#### 工作台(WORKSPACE)
|  列名col150 |  中文名col150 | 数据类型col150 |允许为空col100 |长度col100|精度col100 | 备注col500 |
| --------|------------ |   -------- | -------- | -------- | -------- |-------- |
|CREATEDATE|建立时间|DATETIME|是|8|||
|CREATEMAN|建立人|VARCHAR|是|60|||
|UPDATEDATE|更新时间|DATETIME|是|8|||
|UPDATEMAN|更新人|VARCHAR|是|60|||
|WORKSPACEID<i class="fa fa-key"></i>|工作台标识|VARCHAR|否|100|||
|WORKSPACENAME|工作台名称|VARCHAR|是|200|||






