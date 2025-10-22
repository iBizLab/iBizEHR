# 行为附加 <!-- {docsify-ignore-all} -->

## [候选人申请(HR_APPLICANT)](module/hr/hr_applicant.md)  :id=hr_applicant

#### [Create](module/hr/hr_applicant#行为) :id=hr_applicant_Create




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [保存候选人申请信息(save_applicantinfo)](module/hr/hr_applicant/logic/save_applicantinfo.md)



## [面试(HR_INTERVIEW)](module/hr/hr_interview.md)  :id=hr_interview

#### [Create](module/hr/hr_interview#行为) :id=hr_interview_Create



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [预设面试信息（临时）(set_interview_info)](module/hr/hr_interview/logic/set_interview_info.md)



<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [创建面试详情(参与者、待反馈）(create_interview_info)](module/hr/hr_interview/logic/create_interview_info.md)



## [面试安排(HR_INTERVIEW_SCHEDULE)](module/hr/hr_interview_schedule.md)  :id=hr_interview_schedule

#### [GetDraft](module/hr/hr_interview_schedule#行为) :id=hr_interview_schedule_GetDraft




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [初始化面试默认值(fill_interview)](module/hr/hr_interview_schedule/logic/fill_interview.md)



## [OFFER录用(HR_OFFER)](module/hr/hr_offer.md)  :id=hr_offer

#### [Create](module/hr/hr_offer#行为) :id=hr_offer_Create



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [填充offer主键(fillId)](module/hr/hr_offer/logic/fillId.md)



<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [更新申请关联offer(updateRelOffer)](module/hr/hr_offer/logic/updateRelOffer.md)



## [实体处理逻辑(PSDELOGIC)](module/extension/PSDELogic.md)  :id=PSDELogic

#### [Get](module/extension/PSDELogic#行为) :id=PSDELogic_Get




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [获取最后运行状态(get_last_run_info)](module/extension/PSDELogic/logic/get_last_run_info.md)



## [智能报表(PSSYSBIREPORT)](module/extension/PSSysBIReport.md)  :id=PSSysBIReport

#### [Update](module/extension/PSSysBIReport#行为) :id=PSSysBIReport_Update




<p class="panel-title"><b>操作之后</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [更新报表(update_report)](module/extension/PSSysBIReport/logic/update_report.md)



## [分析报表(REPORT)](module/base/report.md)  :id=report

#### [Create](module/base/report#行为) :id=report_Create



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [建立报表扩展模型(create_bi_report)](module/base/report/logic/create_bi_report.md)




#### [Remove](module/base/report#行为) :id=report_Remove



<p class="panel-title"><b>操作之前</b></p>
<br>

> [!NOTE|label:内部逻辑]
> 执行处理逻辑 [移除报表扩展模型(remove_bi_report)](module/base/report/logic/remove_bi_report.md)











