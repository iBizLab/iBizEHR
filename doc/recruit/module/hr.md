# 人力资源(hr) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[候选人申请(HR_APPLICANT)](module/hr/hr_applicant)|hr_applicant|主实体|SQL|hr_applicant|否|是|自控制|否||
|[申请人类别(HR_APPLICANT_CATEGORY)](module/hr/hr_applicant_category)|hr_applicant_category|主实体|SQL|hr_applicant_category|否|否|自控制|否||
|[候选人申请与面试关系(HR_APPLICANT_INTERVIEW)](module/hr/hr_applicant_interview)|hr_applicant_interview|主实体|SQL|hr_applicant_interview|否|否|自控制|否||
|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|hr_applicant_refuse_reason|主实体|SQL|hr_applicant_refuse_reason|否|否|自控制|否||
|[候选人(HR_CANDIDATE)](module/hr/hr_candidate)|hr_candidate|主实体|SQL|hr_candidate|否|否|自控制|否||
|[候选人教育经历(HR_CANDIDATE_EDUCATION)](module/hr/hr_candidate_education)|hr_candidate_education|主实体|SQL|hr_candidate_education|否|否|自控制|否||
|[候选人工作经历(HR_CANDIDATE_EXPERIENCE)](module/hr/hr_candidate_experience)|hr_candidate_experience|主实体|SQL|hr_candidate_experience|否|否|自控制|否||
|[筛选候选人(HR_CANDIDATE_FILTER)](module/hr/hr_candidate_filter)|hr_candidate_filter|主实体|SQL|hr_candidate_filter|否|否|自控制|否||
|[筛选候选人明细(HR_CANDIDATE_FILTER_DETAIL)](module/hr/hr_candidate_filter_detail)|hr_candidate_filter_detail|主实体|SQL|hr_candidate_filter_detail|是|否|自控制|否||
|[候选人标签(HR_CANDIDATE_LABEL)](module/hr/hr_candidate_label)|hr_candidate_label|主实体|SQL|hr_candidate_label|否|否|自控制|否||
|[候选人的技能水平(HR_CANDIDATE_SKILL)](module/hr/hr_candidate_skill)|hr_candidate_skill|主实体|SQL|hr_candidate_skill|否|否|自控制|否||
|[候选者与人才库关系(HR_CANDIDATE_TALENT_POOL)](module/hr/hr_candidate_talent_pool)|hr_candidate_talent_pool|关系实体|SQL|hr_candidate_talent_pool|否|否|附属主实体控制|否||
|[合同类型(HR_CONTRACT_TYPE)](module/hr/hr_contract_type)|hr_contract_type|主实体|SQL|hr_contract_type|否|否|自控制|否||
|[部门(HR_DEPARTMENT)](module/hr/hr_department)|hr_department|主实体|SQL|hr_department|否|否|自控制|否||
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|hr_employee|主实体|SQL|hr_employee|否|否|自控制|否||
|[ 技能历史(HR_EMPLOYEE_SKILL_LOG)](module/hr/hr_employee_skill_log)|hr_employee_skill_log|主实体|SQL|hr_employee_skill_log|否|否|自控制|否||
|[考试/测评(HR_EXAM)](module/hr/hr_exam)|hr_exam|主实体|SQL|hr_exam|否|否|自控制|否||
|[招聘需求(HR_IDEA)](module/hr/hr_idea)|hr_idea|主实体|SQL|hr_idea|否|否|自控制|否||
|[需求与职位关系(HR_IDEA_JOB)](module/hr/hr_idea_job)|hr_idea_job|主实体|SQL|hr_idea_job|是|否|自控制|否||
|[面试(HR_INTERVIEW)](module/hr/hr_interview)|hr_interview|主实体|SQL|hr_interview|否|否|自控制|否||
|[面试反馈(HR_INTERVIEW_FEEDBACK)](module/hr/hr_interview_feedback)|hr_interview_feedback|主实体|SQL|hr_interview_feedback|否|否|自控制|否||
|[面试安排(HR_INTERVIEW_SCHEDULE)](module/hr/hr_interview_schedule)|hr_interview_schedule|主实体|SQL|hr_interview_schedule|否|否|自控制|否||
|[面试参与者(HR_INTERVIEW_USER)](module/hr/hr_interview_user)|hr_interview_user|主实体|SQL|hr_interview_user|否|否|自控制|否||
|[招聘职位(HR_JOB)](module/hr/hr_job)|hr_job|主实体|SQL|hr_job|否|否|自控制|否||
|[招聘平台(HR_JOB_PLATFORM)](module/hr/hr_job_platform)|hr_job_platform|主实体|SQL|hr_job_platform|否|否|自控制|否||
|[招聘平台账号(HR_JOB_PLATFORM_ACCOUNT)](module/hr/hr_job_platform_account)|hr_job_platform_account|主实体|SQL|hr_job_platform_account|否|否|自控制|否||
|[招聘平台发布记录(HR_JOB_PLATFORM_RECORD)](module/hr/hr_job_platform_record)|hr_job_platform_record|关系实体|SQL|hr_job_platform_record|否|否|附属主实体控制|否||
|[OFFER录用(HR_OFFER)](module/hr/hr_offer)|hr_offer|主实体|SQL|hr_offer|否|否|自控制|否||
|[offer审核(HR_OFFER_APPROVAL)](module/hr/hr_offer_approval)|hr_offer_approval|主实体|SQL|hr_offer_approval|否|否|自控制|否||
|[Offer发送记录(HR_OFFER_HISTORY)](module/hr/hr_offer_history)|hr_offer_history|主实体|SQL|hr_offer_history|否|否|自控制|否||
|[导入记录(HR_OFFER_IMP_REC)](module/hr/hr_offer_imp_rec)|hr_offer_imp_rec|主实体|SQL|hr_offer_imp_rec|否|否|自控制|否||
|[申请人学历(HR_RECRUITMENT_DEGREE)](module/hr/hr_recruitment_degree)|hr_recruitment_degree|主实体|SQL|hr_recruitment_degree|否|否|自控制|否||
|[招聘流程(HR_RECRUITMENT_PROGRESS)](module/hr/hr_recruitment_progress)|hr_recruitment_progress|主实体|SQL|hr_recruitment_progress|否|否|自控制|否||
|[申请人来源(HR_RECRUITMENT_SOURCE)](module/hr/hr_recruitment_source)|hr_recruitment_source|主实体|SQL|hr_recruitment_source|否|否|自控制|否||
|[ 招聘阶段(HR_RECRUITMENT_STAGE)](module/hr/hr_recruitment_stage)|hr_recruitment_stage|主实体|SQL|hr_recruitment_stage|否|否|自控制|否||
|[技能(HR_SKILL)](module/hr/hr_skill)|hr_skill|主实体|SQL|hr_skill|否|否|自控制|否||
|[技能等级(HR_SKILL_LEVEL)](module/hr/hr_skill_level)|hr_skill_level|主实体|SQL|hr_skill_level|否|否|自控制|否||
|[技能类型(HR_SKILL_TYPE)](module/hr/hr_skill_type)|hr_skill_type|主实体|SQL|hr_skill_type|否|否|自控制|否||
|[人才库(HR_TALENT_POOL)](module/hr/hr_talent_pool)|hr_talent_pool|主实体|SQL|hr_talent_pool|否|否|自控制|否||
|[工作地点(HR_WORK_LOCATION)](module/hr/hr_work_location)|hr_work_location|主实体|SQL|hr_work_location|否|否|自控制|否||

### ER图

|  中文名col200      |   代码名col150    |  备注col450  |
|  --------   |------------ |  -------- |
|[招聘](er/job)|job||

