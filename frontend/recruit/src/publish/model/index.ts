import { CodeListService } from '@ibiz-template/runtime';
import {
  IAppCodeList,
  IAppDataEntity,
  IApplication,
  IAppView,
} from '@ibiz/model-core';

export async function registerCodeList(
  codeListService: CodeListService,
): Promise<void> {
  const setCodeList = (model: IData) => {
    codeListService.setCodeList(model as IAppCodeList);
  };
  setCodeList(await import('./code-list/sys-operator').then(m => m.default));
  setCodeList(await import('./code-list/yes-no').then(m => m.default));
  setCodeList(
    await import('./code-list/base-archiving-reason').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-bi-chart-type-2').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-functional-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-idea-education').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-idea-payment-method').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-idea-salary-unit').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-idea-status').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-job-education').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-job-experience').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-job-priority').then(m => m.default),
  );
  setCodeList(await import('./code-list/base-job-status').then(m => m.default));
  setCodeList(await import('./code-list/base-job-type').then(m => m.default));
  setCodeList(
    await import('./code-list/extension-de-logic-node-type-3').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/extension-de-logic-node-type-ms').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/extension-ms-logic-design-mode').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-usr-code-list-0813106864').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-candidate-filter-status').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-candidate-filter-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-candidate-gender').then(m => m.default),
  );
  setCodeList(await import('./code-list/hr-exam-status').then(m => m.default));
  setCodeList(await import('./code-list/hr-exam-type').then(m => m.default));
  setCodeList(
    await import('./code-list/hr-he-candidate-learning-ability').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-hr-applicant-offer').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-hr-applicant-recommended').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-hr-applicant-status').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-hr-candidate-save-to-telent-pool').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-hr-job-platform-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-hr-platform-publish-status').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-hr-recruitment-stage').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-interview-candiate-join-date').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-interview-category').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-interview-duration').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-interview-email-template').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-interview-feedback-status').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-interview-result-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-interview-resume-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-interview-send-email').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-interview-send-sms').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-interview-sms-template').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-interview-stage').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-interview-start-time').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-interview-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-job-is-virtual').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-job-source-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-offer-approval-period').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-offer-approval-status').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-offer-history-feedback-status').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-progress-status').then(m => m.default),
  );
  setCodeList(await import('./code-list/hr-send-type').then(m => m.default));
  setCodeList(await import('./code-list/hr-stage-status').then(m => m.default));
}

export async function getAppDataEntityModel(
  name: string,
): Promise<IAppDataEntity> {
  const _name = name.toLowerCase();
  switch (_name) {
    case 'web.msvalueproxy':
    case 'msvalueproxy':
      return import('./entities/ms-value-proxy').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_candidate_filter_detail':
    case 'hr_candidate_filter_detail':
      return import('./entities/hr-candidate-filter-detail').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.pscoreprdfunc':
    case 'pscoreprdfunc':
      return import('./entities/ps-core-prd-func').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.res_company':
    case 'res_company':
      return import('./entities/res-company').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.workspace':
    case 'workspace':
      return import('./entities/workspace').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.pssysbicubedimension':
    case 'pssysbicubedimension':
      return import('./entities/ps-sys-bi-cube-dimension').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_candidate_filter':
    case 'hr_candidate_filter':
      return import('./entities/hr-candidate-filter').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.internal_message':
    case 'internal_message':
      return import('./entities/internal-message').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_job_platform_account':
    case 'hr_job_platform_account':
      return import('./entities/hr-job-platform-account').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.pssysbicube':
    case 'pssysbicube':
      return import('./entities/ps-sys-bi-cube').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.psdelogic':
    case 'psdelogic':
      return import('./entities/psde-logic').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.system_setting':
    case 'system_setting':
      return import('./entities/system-setting').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_idea':
    case 'hr_idea':
      return import('./entities/hr-idea').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_job':
    case 'hr_job':
      return import('./entities/hr-job').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.psdelogiclink':
    case 'psdelogiclink':
      return import('./entities/psde-logic-link').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_work_location':
    case 'hr_work_location':
      return import('./entities/hr-work-location').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.pssysbicubemeasure':
    case 'pssysbicubemeasure':
      return import('./entities/ps-sys-bi-cube-measure').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_candidate_experience':
    case 'hr_candidate_experience':
      return import('./entities/hr-candidate-experience').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_applicant':
    case 'hr_applicant':
      return import('./entities/hr-applicant').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.comment':
    case 'comment':
      return import('./entities/comment').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.psdemslogic':
    case 'psdemslogic':
      return import('./entities/psdems-logic').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_idea_job':
    case 'hr_idea_job':
      return import('./entities/hr-idea-job').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.psdelogicnode':
    case 'psdelogicnode':
      return import('./entities/psde-logic-node').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_talent_pool':
    case 'hr_talent_pool':
      return import('./entities/hr-talent-pool').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.pssysbireport':
    case 'pssysbireport':
      return import('./entities/ps-sys-bi-report').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_job_platform':
    case 'hr_job_platform':
      return import('./entities/hr-job-platform').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_candidate':
    case 'hr_candidate':
      return import('./entities/hr-candidate').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_interview_schedule':
    case 'hr_interview_schedule':
      return import('./entities/hr-interview-schedule').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_recruitment_progress':
    case 'hr_recruitment_progress':
      return import('./entities/hr-recruitment-progress').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_candidate_education':
    case 'hr_candidate_education':
      return import('./entities/hr-candidate-education').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_interview_feedback':
    case 'hr_interview_feedback':
      return import('./entities/hr-interview-feedback').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.executor':
    case 'executor':
      return import('./entities/executor').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_job_platform_record':
    case 'hr_job_platform_record':
      return import('./entities/hr-job-platform-record').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_offer_imp_rec':
    case 'hr_offer_imp_rec':
      return import('./entities/hr-offer-imp-rec').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_recruitment_stage':
    case 'hr_recruitment_stage':
      return import('./entities/hr-recruitment-stage').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.report':
    case 'report':
      return import('./entities/report').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_department':
    case 'hr_department':
      return import('./entities/hr-department').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.pssysbireportitem':
    case 'pssysbireportitem':
      return import('./entities/ps-sys-bi-report-item').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_interview':
    case 'hr_interview':
      return import('./entities/hr-interview').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_offer_history':
    case 'hr_offer_history':
      return import('./entities/hr-offer-history').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_candidate_label':
    case 'hr_candidate_label':
      return import('./entities/hr-candidate-label').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.res_users':
    case 'res_users':
      return import('./entities/res-users').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_employee':
    case 'hr_employee':
      return import('./entities/hr-employee').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_exam':
    case 'hr_exam':
      return import('./entities/hr-exam').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_offer_approval':
    case 'hr_offer_approval':
      return import('./entities/hr-offer-approval').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_interview_user':
    case 'hr_interview_user':
      return import('./entities/hr-interview-user').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_offer':
    case 'hr_offer':
      return import('./entities/hr-offer').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'web.hr_applicant_interview':
    case 'hr_applicant_interview':
      return import('./entities/hr-applicant-interview').then(
        m => m.default as unknown as IAppDataEntity,
      );
    default:
      throw new Error(`无法找到实体模型：${name}`);
  }
}
export async function getAppViewModel(name: string): Promise<IAppView> {
  const _name = name.toLowerCase();
  switch (_name) {
    case 'hr_candidate_talentpool_list_view':
      return import('./views/hr-candidate-talentpool-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_feedback_edit_view':
      return import('./views/hr-interview-feedback-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employee_pickup_grid_view':
      return import('./views/hr-employee-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_candidate_talentpool_management_view':
      return import('./views/hr-candidate-talentpool-management-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'system_setting_tree_exp_view':
      return import('./views/system-setting-tree-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_feedback_my_interview_list':
      return import('./views/hr-interview-feedback-my-interview-list').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_platform_card_data_view':
      return import('./views/hr-job-platform-card-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_applicant_add_info_view':
      return import('./views/hr-applicant-add-info-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ps_core_prd_func_tree_exp_view':
      return import('./views/ps-core-prd-func-tree-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_recruitment_stage_quick_create_view':
      return import('./views/hr-recruitment-stage-quick-create-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_idea_job_idea_job_relation':
      return import('./views/hr-idea-job-idea-job-relation').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_pickup_grid_view':
      return import('./views/hr-job-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_myinterview_detail_calendar_view':
      return import(
        './views/hr-interview-myinterview-detail-calendar-view'
      ).then(m => m.default as unknown as IAppView);
    case 'hr_job_platform_pickup_grid_view':
      return import('./views/hr-job-platform-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'workspace_over_view':
      return import('./views/workspace-over-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'internal_message_edit_view':
      return import('./views/internal-message-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employee_pickup_view':
      return import('./views/hr-employee-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'app_index_view':
      return import('./views/app-index-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_create_wizard_view':
      return import('./views/hr-job-create-wizard-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_platform_edit_view':
      return import('./views/hr-job-platform-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_feedback_my_interview_detail_base':
      return import(
        './views/hr-interview-feedback-my-interview-detail-base'
      ).then(m => m.default as unknown as IAppView);
    case 'hr_idea_requirement_gridview':
      return import('./views/hr-idea-requirement-gridview').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_exam_hm_grid_view':
      return import('./views/hr-exam-hm-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_recruitment_progress_quick_create_view':
      return import('./views/hr-recruitment-progress-quick-create-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'workspace_welcome_custom_view':
      return import('./views/workspace-welcome-custom-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_offer_approval_edit_view':
      return import('./views/hr-offer-approval-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'report_bi_report_panel_view':
      return import('./views/report-bi-report-panel-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_edit_view':
      return import('./views/hr-job-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_interview_list_grid_view':
      return import('./views/hr-interview-interview-list-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_candidate_filter_detail_edit_view':
      return import('./views/hr-candidate-filter-detail-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'internal_message_grid_view':
      return import('./views/internal-message-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ps_core_prd_func_redirect_view':
      return import('./views/ps-core-prd-func-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'odoo_index':
      return import('./views/odoo-index').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_department_pickup_view':
      return import('./views/hr-department-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_platform_account_platform_account_info':
      return import(
        './views/hr-job-platform-account-platform-account-info'
      ).then(m => m.default as unknown as IAppView);
    case 'hr_job_redirect_view':
      return import('./views/hr-job-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_idea_tab_job_requirments':
      return import('./views/hr-idea-tab-job-requirments').then(
        m => m.default as unknown as IAppView,
      );
    case 'ps_core_prd_func_edit_view':
      return import('./views/ps-core-prd-func-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_company_pickup_view':
      return import('./views/res-company-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'report_bi_report_content_panel_view':
      return import('./views/report-bi-report-content-panel-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_exam_edit_view':
      return import('./views/hr-exam-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_company_edit_view':
      return import('./views/res-company-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ps_core_prd_func_installed_grid_view':
      return import('./views/ps-core-prd-func-installed-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_applicant_pickup_view':
      return import('./views/hr-applicant-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_exam_hr_edit_view':
      return import('./views/hr-exam-hr-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_exam_list_view':
      return import('./views/hr-exam-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_candidate_filter_detail_filter_list_view':
      return import('./views/hr-candidate-filter-detail-filter-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_exam_my_exam_list_view':
      return import('./views/hr-exam-my-exam-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_interview_list_calendar_view':
      return import('./views/hr-interview-interview-list-calendar-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_candidate_filter_detail_manager_evaluate_view':
      return import(
        './views/hr-candidate-filter-detail-manager-evaluate-view'
      ).then(m => m.default as unknown as IAppView);
    case 'comment_list_info_view':
      return import('./views/comment-list-info-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_offer_approval_hm_edit_view':
      return import('./views/hr-offer-approval-hm-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_applicant_interview_my_interview_calendar_view':
      return import(
        './views/hr-applicant-interview-my-interview-calendar-view'
      ).then(m => m.default as unknown as IAppView);
    case 'hr_recruitment_stage_grid_view':
      return import('./views/hr-recruitment-stage-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_platform_account_redirect_view':
      return import('./views/hr-job-platform-account-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'report_baseinfo_edit_view':
      return import('./views/report-baseinfo-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_feedback_my_pass_list_view':
      return import('./views/hr-interview-feedback-my-pass-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_candidate_edit_view':
      return import('./views/hr-candidate-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_candidate_filter_detail_manager_filter_grid_view':
      return import(
        './views/hr-candidate-filter-detail-manager-filter-grid-view'
      ).then(m => m.default as unknown as IAppView);
    case 'hr_exam_candidate_base_edit_view':
      return import('./views/hr-exam-candidate-base-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employee_edit_view':
      return import('./views/hr-employee-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_redirect_view':
      return import('./views/hr-interview-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_applicant_my_favorite_list_view':
      return import('./views/hr-applicant-my-favorite-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'report_edit_view':
      return import('./views/report-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_feedback_my_interview_detail':
      return import('./views/hr-interview-feedback-my-interview-detail').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_idea_redirect_view':
      return import('./views/hr-idea-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_offer_main_view':
      return import('./views/hr-offer-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_test_grid_view':
      return import('./views/hr-job-test-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_applicant_create_view':
      return import('./views/hr-applicant-create-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_candidate_filter_detail_filtered_opinion_list':
      return import(
        './views/hr-candidate-filter-detail-filtered-opinion-list'
      ).then(m => m.default as unknown as IAppView);
    case 'res_company_grid_view':
      return import('./views/res-company-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_exam_quick_create_view':
      return import('./views/hr-exam-quick-create-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'workspace_my_summary_tab_exp_view':
      return import('./views/workspace-my-summary-tab-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_idea_create_view':
      return import('./views/hr-idea-create-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_platform_platform_list_view':
      return import('./views/hr-job-platform-platform-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'workspace_my_attention_tab_exp_view':
      return import('./views/workspace-my-attention-tab-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_recruitment_progress_grid_view':
      return import('./views/hr-recruitment-progress-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_feedback_work_bench_my_interview':
      return import(
        './views/hr-interview-feedback-work-bench-my-interview'
      ).then(m => m.default as unknown as IAppView);
    case 'hr_job_platform_pickup_view':
      return import('./views/hr-job-platform-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'psdemslogicmslogicdesign_modal':
      return import('./views/psdemslogicmslogicdesign-modal').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_candidate_filter_detail_redirect_view':
      return import('./views/hr-candidate-filter-detail-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_recruitment_progress_redirect_view':
      return import('./views/hr-recruitment-progress-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_applicant_interview_main_calendar_view':
      return import('./views/hr-applicant-interview-main-calendar-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_feedback_interview_result_option_view':
      return import(
        './views/hr-interview-feedback-interview-result-option-view'
      ).then(m => m.default as unknown as IAppView);
    case 'hr_candidate_filter_detail_my_filter_list_view':
      return import(
        './views/hr-candidate-filter-detail-my-filter-list-view'
      ).then(m => m.default as unknown as IAppView);
    case 'hr_recruitment_progress_edit_view':
      return import('./views/hr-recruitment-progress-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_department_grid_view':
      return import('./views/hr-department-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_idea_pickup_grid_view':
      return import('./views/hr-idea-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ps_core_prd_func_market_application_view':
      return import('./views/ps-core-prd-func-market-application-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_work_location_grid_view':
      return import('./views/hr-work-location-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_applicant_list_view':
      return import('./views/hr-applicant-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hmindex':
      return import('./views/hmindex').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_company_pickup_grid_view':
      return import('./views/res-company-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'workspace_hr_work_bench':
      return import('./views/workspace-hr-work-bench').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_applicant_baseinfo_view':
      return import('./views/hr-applicant-baseinfo-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_interview_list_tab_exp_view':
      return import('./views/hr-interview-interview-list-tab-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_department_edit_view':
      return import('./views/hr-department-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_offer_approval_hm_grid_view':
      return import('./views/hr-offer-approval-hm-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'report_all_report_grid_view':
      return import('./views/report-all-report-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_pickup_view':
      return import('./views/hr-job-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_applicant_pickup_grid_view':
      return import('./views/hr-applicant-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_grid_view':
      return import('./views/hr-job-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_department_pickup_grid_view':
      return import('./views/hr-department-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_idea_edit_view':
      return import('./views/hr-idea-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'workspace_manager_index_view':
      return import('./views/workspace-manager-index-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_job_platform_account_edit_view':
      return import('./views/hr-job-platform-account-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employee_grid_view':
      return import('./views/hr-employee-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_candidate_filter_recommend_department_option_view':
      return import(
        './views/hr-candidate-filter-recommend-department-option-view'
      ).then(m => m.default as unknown as IAppView);
    case 'hr_applicant_log_view':
      return import('./views/hr-applicant-log-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_work_location_edit_view':
      return import('./views/hr-work-location-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_applicant_edit_view':
      return import('./views/hr-applicant-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_feedback_my_feedback_list_view':
      return import('./views/hr-interview-feedback-my-feedback-list-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_interview_edit_view':
      return import('./views/hr-interview-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_idea_pickup_view':
      return import('./views/hr-idea-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    default:
      throw new Error(`无法找到视图模型：${name}`);
  }
}

export async function getAppModel(): Promise<IApplication> {
  ibiz.hub.defaultAppIndexViewName = 'app_index_view';
  return import('./app/app').then(m => {
    const app = m.default as IData;
    // 设置应用原始模型到hub中
    ibiz.hub.setAppSourceModel(app.appId, app);
    app.appUtils?.forEach((util: IData) => {
      util.appId = app.appId;
    });
    // app.appId = undefined;
    return app as IApplication;
  });
}
