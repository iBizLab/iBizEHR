# 候选人申请(hr_applicant_edit_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)


### 关联界面行为
  * [OFFER录用(HR_OFFER)](module/hr/hr_offer) : [导入组织人事](module/hr/hr_offer#界面行为)
  * [OFFER录用(HR_OFFER)](module/hr/hr_offer) : [重新发送](module/hr/hr_offer#界面行为)
  * [OFFER录用(HR_OFFER)](module/hr/hr_offer) : [提交](module/hr/hr_offer#界面行为)
  * [OFFER录用(HR_OFFER)](module/hr/hr_offer) : [编辑界面_保存操作](module/hr/hr_offer#界面行为)

### 关联视图
  * [评论(comment_list_info_view)](app/view/comment_list_info_view)
  * [候选人申请(hr_applicant_add_info_view)](app/view/hr_applicant_add_info_view)
  * [候选人申请(hr_applicant_baseinfo_view)](app/view/hr_applicant_baseinfo_view)
  * [面试安排日历视图(hr_applicant_interview_main_calendar_view)](app/view/hr_applicant_interview_main_calendar_view)
  * [候选人申请(hr_applicant_log_view)](app/view/hr_applicant_log_view)
  * [筛选候选人明细(hr_candidate_filter_detail_filter_list_view)](app/view/hr_candidate_filter_detail_filter_list_view)
  * [员工(hr_employee_pickup_view)](app/view/hr_employee_pickup_view)
  * [考试/评测(hr_exam_list_view)](app/view/hr_exam_list_view)
  * [招聘需求(hr_idea_pickup_view)](app/view/hr_idea_pickup_view)
  * [招聘职位(hr_job_pickup_view)](app/view/hr_job_pickup_view)
  * [招聘平台(hr_job_platform_pickup_view)](app/view/hr_job_platform_pickup_view)
  * [发送Offer(hr_offer_history_option_view)](app/view/hr_offer_history_option_view)
  * [导入OA(hr_offer_imp_view)](app/view/hr_offer_imp_view)
  * [offer/录用(hr_offer_main_view)](app/view/hr_offer_main_view)
  * [组织(res_company_pickup_view)](app/view/res_company_pickup_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>