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
    case 'res_companypickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-company-pickup-grid-view/res-company-pickup-grid-view.vue'
          ),
      );
    case 'res_usersedit_view':
      return defineAsyncComponent(
        () => import('./res-users/res-usersedit-view/res-usersedit-view.vue'),
      );
    case 'rule_group_relnested_rule_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './rule-group-rel/rule-group-relnested-rule-grid-view/rule-group-relnested-rule-grid-view.vue'
          ),
      );
    case 'appindexview':
      return defineAsyncComponent(
        () => import('./app-index-view/app-index-view.vue'),
      );
    case 'hr_jobmain_view':
      return defineAsyncComponent(
        () => import('./hr-job/hr-jobmain-view/hr-jobmain-view.vue'),
      );
    case 'res_usersinfo_view':
      return defineAsyncComponent(
        () => import('./res-users/res-usersinfo-view/res-usersinfo-view.vue'),
      );
    case 'rule_group_releditview':
      return defineAsyncComponent(
        () =>
          import(
            './rule-group-rel/rule-group-rel-edit-view/rule-group-rel-edit-view.vue'
          ),
      );
    case 'unires_group_relnested_group_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './unires-group-rel/unires-group-relnested-group-grid-view/unires-group-relnested-group-grid-view.vue'
          ),
      );
    case 'ir_module_categoryeditview':
      return defineAsyncComponent(
        () =>
          import(
            './ir-module-category/ir-module-category-edit-view/ir-module-category-edit-view.vue'
          ),
      );
    case 'res_companyedit_view':
      return defineAsyncComponent(
        () =>
          import('./res-company/res-companyedit-view/res-companyedit-view.vue'),
      );
    case 'hr_work_locationpickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './hr-work-location/hr-work-location-pickup-grid-view/hr-work-location-pickup-grid-view.vue'
          ),
      );
    case 'mail_activity_plan_templatequick_create_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-plan-template/mail-activity-plan-templatequick-create-view/mail-activity-plan-templatequick-create-view.vue'
          ),
      );
    case 'res_countrypickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './res-country/res-country-pickup-grid-view/res-country-pickup-grid-view.vue'
          ),
      );
    case 'res_groups_users_releditview':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups-users-rel/res-groups-users-rel-edit-view/res-groups-users-rel-edit-view.vue'
          ),
      );
    case 'res_countrypickupview':
      return defineAsyncComponent(
        () =>
          import(
            './res-country/res-country-pickup-view/res-country-pickup-view.vue'
          ),
      );
    case 'res_currencypickupview':
      return defineAsyncComponent(
        () =>
          import(
            './res-currency/res-currency-pickup-view/res-currency-pickup-view.vue'
          ),
      );
    case 'pscoreprdfuncinstalledgridview':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-installed-grid-view/ps-core-prd-func-installed-grid-view.vue'
          ),
      );
    case 'hr_departmentpickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-department-pickup-grid-view/hr-department-pickup-grid-view.vue'
          ),
      );
    case 'pscoreprdfunctreeexpview':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-tree-exp-view/ps-core-prd-func-tree-exp-view.vue'
          ),
      );
    case 'hr_departmentpickupview':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-department-pickup-view/hr-department-pickup-view.vue'
          ),
      );
    case 'pscoreprdfuncinfoview':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-info-view/ps-core-prd-func-info-view.vue'
          ),
      );
    case 'hr_employeeorg_chart_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee/hr-employeeorg-chart-view/hr-employeeorg-chart-view.vue'
          ),
      );
    case 'pscoreprdfuncmarketapplicationview':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd-func/ps-core-prd-func-market-application-view/ps-core-prd-func-market-application-view.vue'
          ),
      );
    case 'hr_employeemain_view':
      return defineAsyncComponent(
        () =>
          import('./hr-employee/hr-employeemain-view/hr-employeemain-view.vue'),
      );
    case 'res_companymain_view':
      return defineAsyncComponent(
        () =>
          import('./res-company/res-companymain-view/res-companymain-view.vue'),
      );
    case 'res_groupsmulti_data_view_user':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups/res-groupsmulti-data-view-user/res-groupsmulti-data-view-user.vue'
          ),
      );
    case 'res_groups_users_reluser_group_mgr_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups-users-rel/res-groups-users-reluser-group-mgr-view/res-groups-users-reluser-group-mgr-view.vue'
          ),
      );
    case 'res_partnerpickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './res-partner/res-partner-pickup-grid-view/res-partner-pickup-grid-view.vue'
          ),
      );
    case 'ir_module_categorypickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './ir-module-category/ir-module-category-pickup-grid-view/ir-module-category-pickup-grid-view.vue'
          ),
      );
    case 'resource_calendar_attendanceeditview':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar-attendance/resource-calendar-attendance-edit-view/resource-calendar-attendance-edit-view.vue'
          ),
      );
    case 'mail_activity_plan_templategridview':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-plan-template/mail-activity-plan-template-grid-view/mail-activity-plan-template-grid-view.vue'
          ),
      );
    case 'ir_rulepickupview':
      return defineAsyncComponent(
        () => import('./ir-rule/ir-rule-pickup-view/ir-rule-pickup-view.vue'),
      );
    case 'ir_rulepickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './ir-rule/ir-rule-pickup-grid-view/ir-rule-pickup-grid-view.vue'
          ),
      );
    case 'res_partnermain_view':
      return defineAsyncComponent(
        () =>
          import('./res-partner/res-partnermain-view/res-partnermain-view.vue'),
      );
    case 'hr_departmentdepartment_hierarchy_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-departmentdepartment-hierarchy-view/hr-departmentdepartment-hierarchy-view.vue'
          ),
      );
    case 'pscoreprdinfoview':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd/ps-core-prd-info-view/ps-core-prd-info-view.vue'
          ),
      );
    case 'hr_employeemulti_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee/hr-employeemulti-data-view/hr-employeemulti-data-view.vue'
          ),
      );
    case 'hr_jobpickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './hr-job/hr-job-pickup-grid-view/hr-job-pickup-grid-view.vue'
          ),
      );
    case 'ir_model_accessmulti_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './ir-model-access/ir-model-accessmulti-data-view/ir-model-accessmulti-data-view.vue'
          ),
      );
    case 'mail_activity_planmain_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-plan/mail-activity-planmain-view/mail-activity-planmain-view.vue'
          ),
      );
    case 'res_groups_users_relgridview':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups-users-rel/res-groups-users-rel-grid-view/res-groups-users-rel-grid-view.vue'
          ),
      );
    case 'ir_module_categorypickupview':
      return defineAsyncComponent(
        () =>
          import(
            './ir-module-category/ir-module-category-pickup-view/ir-module-category-pickup-view.vue'
          ),
      );
    case 'ir_rulemain_view':
      return defineAsyncComponent(
        () => import('./ir-rule/ir-rulemain-view/ir-rulemain-view.vue'),
      );
    case 'res_groups_implied_releditview':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups-implied-rel/res-groups-implied-rel-edit-view/res-groups-implied-rel-edit-view.vue'
          ),
      );
    case 'resource_resourcemain_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-resource/resource-resourcemain-view/resource-resourcemain-view.vue'
          ),
      );
    case 'res_groups_implied_relgridview':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups-implied-rel/res-groups-implied-rel-grid-view/res-groups-implied-rel-grid-view.vue'
          ),
      );
    case 'hr_jobpickupview':
      return defineAsyncComponent(
        () => import('./hr-job/hr-job-pickup-view/hr-job-pickup-view.vue'),
      );
    case 'mail_thread_component_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-thread/mail-thread-component-view/mail-thread-component-view.vue'
          ),
      );
    case 'res_userspickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './res-users/res-users-pickup-grid-view/res-users-pickup-grid-view.vue'
          ),
      );
    case 'res_groupspickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups/res-groups-pickup-grid-view/res-groups-pickup-grid-view.vue'
          ),
      );
    case 'unires_group_releditview':
      return defineAsyncComponent(
        () =>
          import(
            './unires-group-rel/unires-group-rel-edit-view/unires-group-rel-edit-view.vue'
          ),
      );
    case 'res_usersmulti_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-users/res-usersmulti-data-view/res-usersmulti-data-view.vue'
          ),
      );
    case 'mail_activity_planmulti_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-activity-plan/mail-activity-planmulti-data-view/mail-activity-planmulti-data-view.vue'
          ),
      );
    case 'ir_model_accessgridview':
      return defineAsyncComponent(
        () =>
          import(
            './ir-model-access/ir-model-access-grid-view/ir-model-access-grid-view.vue'
          ),
      );
    case 'res_currencypickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './res-currency/res-currency-pickup-grid-view/res-currency-pickup-grid-view.vue'
          ),
      );
    case 'resource_resourcemulti_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-resource/resource-resourcemulti-data-view/resource-resourcemulti-data-view.vue'
          ),
      );
    case 'res_partnerpickupview':
      return defineAsyncComponent(
        () =>
          import(
            './res-partner/res-partner-pickup-view/res-partner-pickup-view.vue'
          ),
      );
    case 'ir_model_accesseditview':
      return defineAsyncComponent(
        () =>
          import(
            './ir-model-access/ir-model-access-edit-view/ir-model-access-edit-view.vue'
          ),
      );
    case 'hr_work_locationpickupview':
      return defineAsyncComponent(
        () =>
          import(
            './hr-work-location/hr-work-location-pickup-view/hr-work-location-pickup-view.vue'
          ),
      );
    case 'resource_calendarpickupgridview':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar/resource-calendar-pickup-grid-view/resource-calendar-pickup-grid-view.vue'
          ),
      );
    case 'hr_departmentmulti_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-departmentmulti-data-view/hr-departmentmulti-data-view.vue'
          ),
      );
    case 'res_companymulti_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-companymulti-data-view/res-companymulti-data-view.vue'
          ),
      );
    case 'res_groupsmulti_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups/res-groupsmulti-data-view/res-groupsmulti-data-view.vue'
          ),
      );
    case 'hr_work_locationmain_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-work-location/hr-work-locationmain-view/hr-work-locationmain-view.vue'
          ),
      );
    case 'rule_group_relnested_group_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './rule-group-rel/rule-group-relnested-group-grid-view/rule-group-relnested-group-grid-view.vue'
          ),
      );
    case 'resource_calendarpickupview':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar/resource-calendar-pickup-view/resource-calendar-pickup-view.vue'
          ),
      );
    case 'hr_departmentmain_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-department/hr-departmentmain-view/hr-departmentmain-view.vue'
          ),
      );
    case 'ir_rulemulti_data_view':
      return defineAsyncComponent(
        () =>
          import('./ir-rule/ir-rulemulti-data-view/ir-rulemulti-data-view.vue'),
      );
    case 'resource_calendarmain_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar/resource-calendarmain-view/resource-calendarmain-view.vue'
          ),
      );
    case 'resource_calendar_attendancegrid_view_nested':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar-attendance/resource-calendar-attendancegrid-view-nested/resource-calendar-attendancegrid-view-nested.vue'
          ),
      );
    case 'res_groupspickupview':
      return defineAsyncComponent(
        () =>
          import(
            './res-groups/res-groups-pickup-view/res-groups-pickup-view.vue'
          ),
      );
    case 'res_companypickupview':
      return defineAsyncComponent(
        () =>
          import(
            './res-company/res-company-pickup-view/res-company-pickup-view.vue'
          ),
      );
    case 'res_userspickupview':
      return defineAsyncComponent(
        () =>
          import('./res-users/res-users-pickup-view/res-users-pickup-view.vue'),
      );
    case 'pscoreprdmarketapplicationview':
      return defineAsyncComponent(
        () =>
          import(
            './ps-core-prd/ps-core-prd-market-application-view/ps-core-prd-market-application-view.vue'
          ),
      );
    case 'res_usersmain_view':
      return defineAsyncComponent(
        () => import('./res-users/res-usersmain-view/res-usersmain-view.vue'),
      );
    case 'res_groupsmain_view':
      return defineAsyncComponent(
        () =>
          import('./res-groups/res-groupsmain-view/res-groupsmain-view.vue'),
      );
    default:
      throw new Error(`无法找到视图模型：${name}`);
  }
}
