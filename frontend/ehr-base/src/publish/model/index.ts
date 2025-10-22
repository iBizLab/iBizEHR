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
  setCodeList(await import('./code-list/base-ir-model').then(m => m.default));
  setCodeList(
    await import('./code-list/base-module-categroy').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/base-res-partner-company-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-res-partner-tz').then(m => m.default),
  );
  setCodeList(await import('./code-list/base-res-users').then(m => m.default));
  setCodeList(
    await import('./code-list/base-res-users-calendar-default-privacy').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-res-users-notification-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-res-users-odoobot-state').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/base-res-users-state').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/extension-product-func-state').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/extension-pscoreprdfunc-category').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/extension-pscoreprdfunc-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-department-hierarchy').then(m => m.default),
  );
  setCodeList(await import('./code-list/hr-hr-employee').then(m => m.default));
  setCodeList(
    await import('./code-list/hr-hr-employee-certificate').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-hr-employee-distance-home-work-unit').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-hr-employee-employee-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-hr-employee-gender').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-hr-employee-hr-presence-state').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-hr-work-location-location-type').then(
      m => m.default,
    ),
  );
  setCodeList(await import('./code-list/hr-org-chart').then(m => m.default));
  setCodeList(
    await import('./code-list/mail-activity-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/mail-attention-type').then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/mail-mail-activity-plan-template-delay-from'
    ).then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/mail-mail-activity-plan-template-delay-unit'
    ).then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/mail-mail-activity-plan-template-responsible-type'
    ).then(m => m.default),
  );
  setCodeList(
    await import('./code-list/mail-mail-activity-plan-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/mail-mail-activity-state').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/mail-mail-activity-type-delay-from').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import(
      './code-list/resource-resource-calendar-attendance-day-period'
    ).then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/resource-resource-calendar-attendance-dayofweek'
    ).then(m => m.default),
  );
  setCodeList(
    await import(
      './code-list/resource-resource-calendar-attendance-week-type'
    ).then(m => m.default),
  );
  setCodeList(
    await import('./code-list/resource-resource-resource-resource-type').then(
      m => m.default,
    ),
  );
}

export async function getAppDataEntityModel(
  name: string,
): Promise<IAppDataEntity> {
  const _name = name.toLowerCase();
  switch (_name) {
    case 'ehrapp.res_groups_implied_rel':
    case 'res_groups_implied_rel':
      return import('./entities/res-groups-implied-rel').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.hr_employee':
    case 'hr_employee':
      return import('./entities/hr-employee').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.res_country':
    case 'res_country':
      return import('./entities/res-country').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.res_groups':
    case 'res_groups':
      return import('./entities/res-groups').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.mail_activity_type':
    case 'mail_activity_type':
      return import('./entities/mail-activity-type').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.hr_department':
    case 'hr_department':
      return import('./entities/hr-department').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.res_users':
    case 'res_users':
      return import('./entities/res-users').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.mail_activity_plan_template':
    case 'mail_activity_plan_template':
      return import('./entities/mail-activity-plan-template').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.pscoreprd':
    case 'pscoreprd':
      return import('./entities/ps-core-prd').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.hr_work_location':
    case 'hr_work_location':
      return import('./entities/hr-work-location').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.ir_model':
    case 'ir_model':
      return import('./entities/ir-model').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.res_partner':
    case 'res_partner':
      return import('./entities/res-partner').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.mail_activity_plan':
    case 'mail_activity_plan':
      return import('./entities/mail-activity-plan').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.mail_thread':
    case 'mail_thread':
      return import('./entities/mail-thread').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.ir_rule':
    case 'ir_rule':
      return import('./entities/ir-rule').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.mail_template':
    case 'mail_template':
      return import('./entities/mail-template').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.hr_job':
    case 'hr_job':
      return import('./entities/hr-job').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.mail_message':
    case 'mail_message':
      return import('./entities/mail-message').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.rule_group_rel':
    case 'rule_group_rel':
      return import('./entities/rule-group-rel').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.mail_followers':
    case 'mail_followers':
      return import('./entities/mail-followers').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.unires_group_rel':
    case 'unires_group_rel':
      return import('./entities/unires-group-rel').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.ir_module_category':
    case 'ir_module_category':
      return import('./entities/ir-module-category').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.res_currency':
    case 'res_currency':
      return import('./entities/res-currency').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.res_company':
    case 'res_company':
      return import('./entities/res-company').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.resource_resource':
    case 'resource_resource':
      return import('./entities/resource-resource').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.resource_calendar_attendance':
    case 'resource_calendar_attendance':
      return import('./entities/resource-calendar-attendance').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.res_groups_users_rel':
    case 'res_groups_users_rel':
      return import('./entities/res-groups-users-rel').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.resource_calendar':
    case 'resource_calendar':
      return import('./entities/resource-calendar').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.ir_attachment':
    case 'ir_attachment':
      return import('./entities/ir-attachment').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.mail_activity':
    case 'mail_activity':
      return import('./entities/mail-activity').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.mail_activity_schedule':
    case 'mail_activity_schedule':
      return import('./entities/mail-activity-schedule').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.ir_model_access':
    case 'ir_model_access':
      return import('./entities/ir-model-access').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'ehrapp.pscoreprdfunc':
    case 'pscoreprdfunc':
      return import('./entities/ps-core-prd-func').then(
        m => m.default as unknown as IAppDataEntity,
      );
    default:
      throw new Error(`无法找到实体模型：${name}`);
  }
}
export async function getAppViewModel(name: string): Promise<IAppView> {
  const _name = name.toLowerCase();
  switch (_name) {
    case 'res_companypickupgridview':
      return import('./views/res-company-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_usersedit_view':
      return import('./views/res-usersedit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'rule_group_relnested_rule_grid_view':
      return import('./views/rule-group-relnested-rule-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'appindexview':
      return import('./views/app-index-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_jobmain_view':
      return import('./views/hr-jobmain-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_usersinfo_view':
      return import('./views/res-usersinfo-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'rule_group_releditview':
      return import('./views/rule-group-rel-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'unires_group_relnested_group_grid_view':
      return import('./views/unires-group-relnested-group-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_module_categoryeditview':
      return import('./views/ir-module-category-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_companyedit_view':
      return import('./views/res-companyedit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_work_locationpickupgridview':
      return import('./views/hr-work-location-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_plan_templatequick_create_view':
      return import(
        './views/mail-activity-plan-templatequick-create-view'
      ).then(m => m.default as unknown as IAppView);
    case 'res_countrypickupgridview':
      return import('./views/res-country-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_users_releditview':
      return import('./views/res-groups-users-rel-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_countrypickupview':
      return import('./views/res-country-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_currencypickupview':
      return import('./views/res-currency-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'pscoreprdfuncinstalledgridview':
      return import('./views/ps-core-prd-func-installed-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_departmentpickupgridview':
      return import('./views/hr-department-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'pscoreprdfunctreeexpview':
      return import('./views/ps-core-prd-func-tree-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_departmentpickupview':
      return import('./views/hr-department-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'pscoreprdfuncinfoview':
      return import('./views/ps-core-prd-func-info-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employeeorg_chart_view':
      return import('./views/hr-employeeorg-chart-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'pscoreprdfuncmarketapplicationview':
      return import('./views/ps-core-prd-func-market-application-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employeemain_view':
      return import('./views/hr-employeemain-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_companymain_view':
      return import('./views/res-companymain-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groupsmulti_data_view_user':
      return import('./views/res-groupsmulti-data-view-user').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_users_reluser_group_mgr_view':
      return import('./views/res-groups-users-reluser-group-mgr-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_partnerpickupgridview':
      return import('./views/res-partner-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_module_categorypickupgridview':
      return import('./views/ir-module-category-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_attendanceeditview':
      return import('./views/resource-calendar-attendance-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_plan_templategridview':
      return import('./views/mail-activity-plan-template-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_rulepickupview':
      return import('./views/ir-rule-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_rulepickupgridview':
      return import('./views/ir-rule-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_partnermain_view':
      return import('./views/res-partnermain-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_departmentdepartment_hierarchy_view':
      return import('./views/hr-departmentdepartment-hierarchy-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'pscoreprdinfoview':
      return import('./views/ps-core-prd-info-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employeemulti_data_view':
      return import('./views/hr-employeemulti-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_jobpickupgridview':
      return import('./views/hr-job-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_model_accessmulti_data_view':
      return import('./views/ir-model-accessmulti-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_planmain_view':
      return import('./views/mail-activity-planmain-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_users_relgridview':
      return import('./views/res-groups-users-rel-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_module_categorypickupview':
      return import('./views/ir-module-category-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_rulemain_view':
      return import('./views/ir-rulemain-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_implied_releditview':
      return import('./views/res-groups-implied-rel-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_resourcemain_view':
      return import('./views/resource-resourcemain-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groups_implied_relgridview':
      return import('./views/res-groups-implied-rel-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_jobpickupview':
      return import('./views/hr-job-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_thread_component_view':
      return import('./views/mail-thread-component-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_userspickupgridview':
      return import('./views/res-users-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groupspickupgridview':
      return import('./views/res-groups-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'unires_group_releditview':
      return import('./views/unires-group-rel-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_usersmulti_data_view':
      return import('./views/res-usersmulti-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_activity_planmulti_data_view':
      return import('./views/mail-activity-planmulti-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_model_accessgridview':
      return import('./views/ir-model-access-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_currencypickupgridview':
      return import('./views/res-currency-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_resourcemulti_data_view':
      return import('./views/resource-resourcemulti-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_partnerpickupview':
      return import('./views/res-partner-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_model_accesseditview':
      return import('./views/ir-model-access-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_work_locationpickupview':
      return import('./views/hr-work-location-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendarpickupgridview':
      return import('./views/resource-calendar-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_departmentmulti_data_view':
      return import('./views/hr-departmentmulti-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_companymulti_data_view':
      return import('./views/res-companymulti-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groupsmulti_data_view':
      return import('./views/res-groupsmulti-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_work_locationmain_view':
      return import('./views/hr-work-locationmain-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'rule_group_relnested_group_grid_view':
      return import('./views/rule-group-relnested-group-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendarpickupview':
      return import('./views/resource-calendar-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_departmentmain_view':
      return import('./views/hr-departmentmain-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'ir_rulemulti_data_view':
      return import('./views/ir-rulemulti-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendarmain_view':
      return import('./views/resource-calendarmain-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_attendancegrid_view_nested':
      return import(
        './views/resource-calendar-attendancegrid-view-nested'
      ).then(m => m.default as unknown as IAppView);
    case 'res_groupspickupview':
      return import('./views/res-groups-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_companypickupview':
      return import('./views/res-company-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_userspickupview':
      return import('./views/res-users-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'pscoreprdmarketapplicationview':
      return import('./views/ps-core-prd-market-application-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_usersmain_view':
      return import('./views/res-usersmain-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_groupsmain_view':
      return import('./views/res-groupsmain-view').then(
        m => m.default as unknown as IAppView,
      );
    default:
      throw new Error(`无法找到视图模型：${name}`);
  }
}

export async function getAppModel(): Promise<IApplication> {
  ibiz.hub.defaultAppIndexViewName = 'AppIndexView';
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
