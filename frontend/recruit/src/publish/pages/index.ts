import { Component, defineAsyncComponent } from 'vue';

function calcAppViewId(tag: string): string {
  let id = '';
  if (tag.indexOf('.') !== -1) {
    const ids = tag.split('.');
    id = ids[ids.length - 1];
  } else {
    id = tag.toLowerCase();
  }
  return id;
}

export async function getAppViewComponent(
  name: string,
  appId: string,
): Promise<Component> {
  const _name = calcAppViewId(name).toLowerCase();
  // 子应用视图
  if (appId !== ibiz.env.appId) {
    return defineAsyncComponent(
      () => import('../../components/sub-app-view/sub-app-view.vue'),
    );
  }
  switch (_name) {
    case 'hr_candidate_talentpool_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-candidate/hr-candidate-talentpool-list-view/hr-candidate-talentpool-list-view.vue'
          ),
      );
    case 'hr_interview_feedback_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview-feedback/hr-interview-feedback-edit-view/hr-interview-feedback-edit-view.vue'
          ),
      );
    case 'hr_employee_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee/hr-employee-pickup-grid-view/hr-employee-pickup-grid-view.vue'
          ),
      );
    case 'hr_candidate_talentpool_management_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-candidate/hr-candidate-talentpool-management-view/hr-candidate-talentpool-management-view.vue'
          ),
      );
    case 'system_setting_tree_exp_view':
      return defineAsyncComponent(
        () =>
          import(
            './system-setting/system-setting-tree-exp-view/system-setting-tree-exp-view.vue'
          ),
      );
    case 'hr_interview_feedback_my_interview_list':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview-feedback/hr-interview-feedback-my-interview-list/hr-interview-feedback-my-interview-list.vue'
          ),
      );
    case 'hr_job_platform_card_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job-platform/hr-job-platform-card-data-view/hr-job-platform-card-data-view.vue'
          ),
      );
    case 'hr_applicant_add_info_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-applicant/hr-applicant-add-info-view/hr-applicant-add-info-view.vue'
          ),
      );
    case 'ps_core_prd_func_tree_exp_view':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-tree-exp-view/ps-core-prd-func-tree-exp-view.vue'
          ),
      );
    case 'hr_recruitment_stage_quick_create_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-recruitment-stage/hr-recruitment-stage-quick-create-view/hr-recruitment-stage-quick-create-view.vue'
          ),
      );
    case 'hr_idea_job_idea_job_relation':
      return defineAsyncComponent(
        () =>
          import(
            './hr-idea-job/hr-idea-job-idea-job-relation/hr-idea-job-idea-job-relation.vue'
          ),
      );
    case 'hr_job_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job/hr-job-pickup-grid-view/hr-job-pickup-grid-view.vue'
          ),
      );
    case 'hr_interview_myinterview_detail_calendar_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview/hr-interview-myinterview-detail-calendar-view/hr-interview-myinterview-detail-calendar-view.vue'
          ),
      );
    case 'hr_job_platform_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job-platform/hr-job-platform-pickup-grid-view/hr-job-platform-pickup-grid-view.vue'
          ),
      );
    case 'workspace_over_view':
      return defineAsyncComponent(
        () => import('./workspace/workspace-over-view/workspace-over-view.vue'),
      );
    case 'internal_message_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './internal-message/internal-message-edit-view/internal-message-edit-view.vue'
          ),
      );
    case 'hr_employee_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee/hr-employee-pickup-view/hr-employee-pickup-view.vue'
          ),
      );
    case 'app_index_view':
      return defineAsyncComponent(
        () => import('./app-index-view/app-index-view.vue'),
      );
    case 'hr_job_create_wizard_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job/hr-job-create-wizard-view/hr-job-create-wizard-view.vue'
          ),
      );
    case 'hr_job_platform_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job-platform/hr-job-platform-edit-view/hr-job-platform-edit-view.vue'
          ),
      );
    case 'hr_interview_feedback_my_interview_detail_base':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview-feedback/hr-interview-feedback-my-interview-detail-base/hr-interview-feedback-my-interview-detail-base.vue'
          ),
      );
    case 'hr_idea_requirement_gridview':
      return defineAsyncComponent(
        () =>
          import(
            './hr-idea/hr-idea-requirement-gridview/hr-idea-requirement-gridview.vue'
          ),
      );
    case 'hr_exam_hm_grid_view':
      return defineAsyncComponent(
        () => import('./hr-exam/hr-exam-hm-grid-view/hr-exam-hm-grid-view.vue'),
      );
    case 'hr_recruitment_progress_quick_create_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-recruitment-progress/hr-recruitment-progress-quick-create-view/hr-recruitment-progress-quick-create-view.vue'
          ),
      );
    case 'workspace_welcome_custom_view':
      return defineAsyncComponent(
        () =>
          import(
            './workspace/workspace-welcome-custom-view/workspace-welcome-custom-view.vue'
          ),
      );
    case 'hr_offer_approval_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-offer-approval/hr-offer-approval-edit-view/hr-offer-approval-edit-view.vue'
          ),
      );
    case 'report_bi_report_panel_view':
      return defineAsyncComponent(
        () =>
          import(
            './report/report-bi-report-panel-view/report-bi-report-panel-view.vue'
          ),
      );
    case 'hr_job_edit_view':
      return defineAsyncComponent(
        () => import('./hr-job/hr-job-edit-view/hr-job-edit-view.vue'),
      );
    case 'hr_interview_interview_list_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview/hr-interview-interview-list-grid-view/hr-interview-interview-list-grid-view.vue'
          ),
      );
    case 'hr_candidate_filter_detail_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-candidate-filter-detail/hr-candidate-filter-detail-edit-view/hr-candidate-filter-detail-edit-view.vue'
          ),
      );
    case 'internal_message_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './internal-message/internal-message-grid-view/internal-message-grid-view.vue'
          ),
      );
    case 'ps_core_prd_func_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-redirect-view/ps-core-prd-func-redirect-view.vue'
          ),
      );
    case 'odoo_index':
      return defineAsyncComponent(() => import('./odoo-index/odoo-index.vue'));
    case 'hr_department_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-department-pickup-view/hr-department-pickup-view.vue'
          ),
      );
    case 'hr_job_platform_account_platform_account_info':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job-platform-account/hr-job-platform-account-platform-account-info/hr-job-platform-account-platform-account-info.vue'
          ),
      );
    case 'hr_job_redirect_view':
      return defineAsyncComponent(
        () => import('./hr-job/hr-job-redirect-view/hr-job-redirect-view.vue'),
      );
    case 'hr_idea_tab_job_requirments':
      return defineAsyncComponent(
        () =>
          import(
            './hr-idea/hr-idea-tab-job-requirments/hr-idea-tab-job-requirments.vue'
          ),
      );
    case 'ps_core_prd_func_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-edit-view/ps-core-prd-func-edit-view.vue'
          ),
      );
    case 'res_company_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-company-pickup-view/res-company-pickup-view.vue'
          ),
      );
    case 'report_bi_report_content_panel_view':
      return defineAsyncComponent(
        () =>
          import(
            './report/report-bi-report-content-panel-view/report-bi-report-content-panel-view.vue'
          ),
      );
    case 'hr_exam_edit_view':
      return defineAsyncComponent(
        () => import('./hr-exam/hr-exam-edit-view/hr-exam-edit-view.vue'),
      );
    case 'res_company_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-company-edit-view/res-company-edit-view.vue'
          ),
      );
    case 'ps_core_prd_func_installed_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-installed-grid-view/ps-core-prd-func-installed-grid-view.vue'
          ),
      );
    case 'hr_applicant_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-applicant/hr-applicant-pickup-view/hr-applicant-pickup-view.vue'
          ),
      );
    case 'hr_exam_hr_edit_view':
      return defineAsyncComponent(
        () => import('./hr-exam/hr-exam-hr-edit-view/hr-exam-hr-edit-view.vue'),
      );
    case 'hr_exam_list_view':
      return defineAsyncComponent(
        () => import('./hr-exam/hr-exam-list-view/hr-exam-list-view.vue'),
      );
    case 'hr_candidate_filter_detail_filter_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-candidate-filter-detail/hr-candidate-filter-detail-filter-list-view/hr-candidate-filter-detail-filter-list-view.vue'
          ),
      );
    case 'hr_exam_my_exam_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-exam/hr-exam-my-exam-list-view/hr-exam-my-exam-list-view.vue'
          ),
      );
    case 'hr_interview_interview_list_calendar_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview/hr-interview-interview-list-calendar-view/hr-interview-interview-list-calendar-view.vue'
          ),
      );
    case 'hr_candidate_filter_detail_manager_evaluate_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-candidate-filter-detail/hr-candidate-filter-detail-manager-evaluate-view/hr-candidate-filter-detail-manager-evaluate-view.vue'
          ),
      );
    case 'comment_list_info_view':
      return defineAsyncComponent(
        () =>
          import('./comment/comment-list-info-view/comment-list-info-view.vue'),
      );
    case 'hr_offer_approval_hm_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-offer-approval/hr-offer-approval-hm-edit-view/hr-offer-approval-hm-edit-view.vue'
          ),
      );
    case 'hr_applicant_interview_my_interview_calendar_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-applicant-interview/hr-applicant-interview-my-interview-calendar-view/hr-applicant-interview-my-interview-calendar-view.vue'
          ),
      );
    case 'hr_recruitment_stage_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-recruitment-stage/hr-recruitment-stage-grid-view/hr-recruitment-stage-grid-view.vue'
          ),
      );
    case 'hr_job_platform_account_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job-platform-account/hr-job-platform-account-redirect-view/hr-job-platform-account-redirect-view.vue'
          ),
      );
    case 'report_baseinfo_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './report/report-baseinfo-edit-view/report-baseinfo-edit-view.vue'
          ),
      );
    case 'hr_interview_feedback_my_pass_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview-feedback/hr-interview-feedback-my-pass-list-view/hr-interview-feedback-my-pass-list-view.vue'
          ),
      );
    case 'hr_candidate_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-candidate/hr-candidate-edit-view/hr-candidate-edit-view.vue'
          ),
      );
    case 'hr_candidate_filter_detail_manager_filter_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-candidate-filter-detail/hr-candidate-filter-detail-manager-filter-grid-view/hr-candidate-filter-detail-manager-filter-grid-view.vue'
          ),
      );
    case 'hr_exam_candidate_base_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-exam/hr-exam-candidate-base-edit-view/hr-exam-candidate-base-edit-view.vue'
          ),
      );
    case 'hr_employee_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee/hr-employee-edit-view/hr-employee-edit-view.vue'
          ),
      );
    case 'hr_interview_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview/hr-interview-redirect-view/hr-interview-redirect-view.vue'
          ),
      );
    case 'hr_applicant_my_favorite_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-applicant/hr-applicant-my-favorite-list-view/hr-applicant-my-favorite-list-view.vue'
          ),
      );
    case 'report_edit_view':
      return defineAsyncComponent(
        () => import('./report/report-edit-view/report-edit-view.vue'),
      );
    case 'hr_interview_feedback_my_interview_detail':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview-feedback/hr-interview-feedback-my-interview-detail/hr-interview-feedback-my-interview-detail.vue'
          ),
      );
    case 'hr_idea_redirect_view':
      return defineAsyncComponent(
        () =>
          import('./hr-idea/hr-idea-redirect-view/hr-idea-redirect-view.vue'),
      );
    case 'hr_offer_main_view':
      return defineAsyncComponent(
        () => import('./hr-offer/hr-offer-main-view/hr-offer-main-view.vue'),
      );
    case 'hr_job_test_grid_view':
      return defineAsyncComponent(
        () =>
          import('./hr-job/hr-job-test-grid-view/hr-job-test-grid-view.vue'),
      );
    case 'hr_applicant_create_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-applicant/hr-applicant-create-view/hr-applicant-create-view.vue'
          ),
      );
    case 'hr_candidate_filter_detail_filtered_opinion_list':
      return defineAsyncComponent(
        () =>
          import(
            './hr-candidate-filter-detail/hr-candidate-filter-detail-filtered-opinion-list/hr-candidate-filter-detail-filtered-opinion-list.vue'
          ),
      );
    case 'res_company_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-company-grid-view/res-company-grid-view.vue'
          ),
      );
    case 'hr_exam_quick_create_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-exam/hr-exam-quick-create-view/hr-exam-quick-create-view.vue'
          ),
      );
    case 'workspace_my_summary_tab_exp_view':
      return defineAsyncComponent(
        () =>
          import(
            './workspace/workspace-my-summary-tab-exp-view/workspace-my-summary-tab-exp-view.vue'
          ),
      );
    case 'hr_idea_create_view':
      return defineAsyncComponent(
        () => import('./hr-idea/hr-idea-create-view/hr-idea-create-view.vue'),
      );
    case 'hr_job_platform_platform_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job-platform/hr-job-platform-platform-list-view/hr-job-platform-platform-list-view.vue'
          ),
      );
    case 'workspace_my_attention_tab_exp_view':
      return defineAsyncComponent(
        () =>
          import(
            './workspace/workspace-my-attention-tab-exp-view/workspace-my-attention-tab-exp-view.vue'
          ),
      );
    case 'hr_recruitment_progress_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-recruitment-progress/hr-recruitment-progress-grid-view/hr-recruitment-progress-grid-view.vue'
          ),
      );
    case 'hr_interview_feedback_work_bench_my_interview':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview-feedback/hr-interview-feedback-work-bench-my-interview/hr-interview-feedback-work-bench-my-interview.vue'
          ),
      );
    case 'hr_job_platform_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job-platform/hr-job-platform-pickup-view/hr-job-platform-pickup-view.vue'
          ),
      );
    case 'psdemslogicmslogicdesign_modal':
      return defineAsyncComponent(
        () =>
          import(
            './psdems-logic/psdemslogicmslogicdesign-modal/psdemslogicmslogicdesign-modal.vue'
          ),
      );
    case 'hr_candidate_filter_detail_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-candidate-filter-detail/hr-candidate-filter-detail-redirect-view/hr-candidate-filter-detail-redirect-view.vue'
          ),
      );
    case 'hr_recruitment_progress_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-recruitment-progress/hr-recruitment-progress-redirect-view/hr-recruitment-progress-redirect-view.vue'
          ),
      );
    case 'hr_applicant_interview_main_calendar_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-applicant-interview/hr-applicant-interview-main-calendar-view/hr-applicant-interview-main-calendar-view.vue'
          ),
      );
    case 'hr_interview_feedback_interview_result_option_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview-feedback/hr-interview-feedback-interview-result-option-view/hr-interview-feedback-interview-result-option-view.vue'
          ),
      );
    case 'hr_candidate_filter_detail_my_filter_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-candidate-filter-detail/hr-candidate-filter-detail-my-filter-list-view/hr-candidate-filter-detail-my-filter-list-view.vue'
          ),
      );
    case 'hr_recruitment_progress_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-recruitment-progress/hr-recruitment-progress-edit-view/hr-recruitment-progress-edit-view.vue'
          ),
      );
    case 'hr_department_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-department-grid-view/hr-department-grid-view.vue'
          ),
      );
    case 'hr_idea_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-idea/hr-idea-pickup-grid-view/hr-idea-pickup-grid-view.vue'
          ),
      );
    case 'ps_core_prd_func_market_application_view':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-market-application-view/ps-core-prd-func-market-application-view.vue'
          ),
      );
    case 'hr_work_location_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-work-location/hr-work-location-grid-view/hr-work-location-grid-view.vue'
          ),
      );
    case 'hr_applicant_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-applicant/hr-applicant-list-view/hr-applicant-list-view.vue'
          ),
      );
    case 'hmindex':
      return defineAsyncComponent(() => import('./hmindex/hmindex.vue'));
    case 'res_company_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-company-pickup-grid-view/res-company-pickup-grid-view.vue'
          ),
      );
    case 'workspace_hr_work_bench':
      return defineAsyncComponent(
        () =>
          import(
            './workspace/workspace-hr-work-bench/workspace-hr-work-bench.vue'
          ),
      );
    case 'hr_applicant_baseinfo_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-applicant/hr-applicant-baseinfo-view/hr-applicant-baseinfo-view.vue'
          ),
      );
    case 'hr_interview_interview_list_tab_exp_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview/hr-interview-interview-list-tab-exp-view/hr-interview-interview-list-tab-exp-view.vue'
          ),
      );
    case 'hr_department_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-department-edit-view/hr-department-edit-view.vue'
          ),
      );
    case 'hr_offer_approval_hm_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-offer-approval/hr-offer-approval-hm-grid-view/hr-offer-approval-hm-grid-view.vue'
          ),
      );
    case 'report_all_report_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './report/report-all-report-grid-view/report-all-report-grid-view.vue'
          ),
      );
    case 'hr_job_pickup_view':
      return defineAsyncComponent(
        () => import('./hr-job/hr-job-pickup-view/hr-job-pickup-view.vue'),
      );
    case 'hr_applicant_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-applicant/hr-applicant-pickup-grid-view/hr-applicant-pickup-grid-view.vue'
          ),
      );
    case 'hr_job_grid_view':
      return defineAsyncComponent(
        () => import('./hr-job/hr-job-grid-view/hr-job-grid-view.vue'),
      );
    case 'hr_department_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-department-pickup-grid-view/hr-department-pickup-grid-view.vue'
          ),
      );
    case 'hr_idea_edit_view':
      return defineAsyncComponent(
        () => import('./hr-idea/hr-idea-edit-view/hr-idea-edit-view.vue'),
      );
    case 'workspace_manager_index_view':
      return defineAsyncComponent(
        () =>
          import(
            './workspace/workspace-manager-index-view/workspace-manager-index-view.vue'
          ),
      );
    case 'hr_job_platform_account_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job-platform-account/hr-job-platform-account-edit-view/hr-job-platform-account-edit-view.vue'
          ),
      );
    case 'hr_employee_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee/hr-employee-grid-view/hr-employee-grid-view.vue'
          ),
      );
    case 'hr_candidate_filter_recommend_department_option_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-candidate-filter/hr-candidate-filter-recommend-department-option-view/hr-candidate-filter-recommend-department-option-view.vue'
          ),
      );
    case 'hr_applicant_log_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-applicant/hr-applicant-log-view/hr-applicant-log-view.vue'
          ),
      );
    case 'hr_work_location_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-work-location/hr-work-location-edit-view/hr-work-location-edit-view.vue'
          ),
      );
    case 'hr_applicant_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-applicant/hr-applicant-edit-view/hr-applicant-edit-view.vue'
          ),
      );
    case 'hr_interview_feedback_my_feedback_list_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview-feedback/hr-interview-feedback-my-feedback-list-view/hr-interview-feedback-my-feedback-list-view.vue'
          ),
      );
    case 'hr_interview_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-interview/hr-interview-edit-view/hr-interview-edit-view.vue'
          ),
      );
    case 'hr_idea_pickup_view':
      return defineAsyncComponent(
        () => import('./hr-idea/hr-idea-pickup-view/hr-idea-pickup-view.vue'),
      );
    default:
      throw new Error(`无法找到视图模型：${name}`);
  }
}
