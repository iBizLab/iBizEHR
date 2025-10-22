import { IViewConfig } from '@ibiz-template/runtime';
import res_companyPickupGridView from './res-company-pickup-grid-view';
import res_usersedit_view from './res-usersedit-view';
import rule_group_relnested_rule_grid_view from './rule-group-relnested-rule-grid-view';
import AppIndexView from './app-index-view';
import hr_jobmain_view from './hr-jobmain-view';
import res_usersinfo_view from './res-usersinfo-view';
import rule_group_relEditView from './rule-group-rel-edit-view';
import unires_group_relnested_group_grid_view from './unires-group-relnested-group-grid-view';
import ir_module_categoryEditView from './ir-module-category-edit-view';
import res_companyedit_view from './res-companyedit-view';
import hr_work_locationPickupGridView from './hr-work-location-pickup-grid-view';
import mail_activity_plan_templatequick_create_view from './mail-activity-plan-templatequick-create-view';
import res_countryPickupGridView from './res-country-pickup-grid-view';
import res_groups_users_relEditView from './res-groups-users-rel-edit-view';
import res_countryPickupView from './res-country-pickup-view';
import res_currencyPickupView from './res-currency-pickup-view';
import PSCorePrdFuncInstalledGridView from './ps-core-prd-func-installed-grid-view';
import hr_departmentPickupGridView from './hr-department-pickup-grid-view';
import PSCorePrdFuncTreeExpView from './ps-core-prd-func-tree-exp-view';
import hr_departmentPickupView from './hr-department-pickup-view';
import PSCorePrdFuncInfoView from './ps-core-prd-func-info-view';
import hr_employeeorg_chart_view from './hr-employeeorg-chart-view';
import PSCorePrdFuncMarketApplicationView from './ps-core-prd-func-market-application-view';
import hr_employeemain_view from './hr-employeemain-view';
import res_companymain_view from './res-companymain-view';
import res_groupsmulti_data_view_user from './res-groupsmulti-data-view-user';
import res_groups_users_reluser_group_mgr_view from './res-groups-users-reluser-group-mgr-view';
import res_partnerPickupGridView from './res-partner-pickup-grid-view';
import ir_module_categoryPickupGridView from './ir-module-category-pickup-grid-view';
import resource_calendar_attendanceEditView from './resource-calendar-attendance-edit-view';
import mail_activity_plan_templateGridView from './mail-activity-plan-template-grid-view';
import ir_rulePickupView from './ir-rule-pickup-view';
import ir_rulePickupGridView from './ir-rule-pickup-grid-view';
import res_partnermain_view from './res-partnermain-view';
import hr_departmentdepartment_hierarchy_view from './hr-departmentdepartment-hierarchy-view';
import PSCorePrdInfoView from './ps-core-prd-info-view';
import hr_employeemulti_data_view from './hr-employeemulti-data-view';
import hr_jobPickupGridView from './hr-job-pickup-grid-view';
import ir_model_accessmulti_data_view from './ir-model-accessmulti-data-view';
import mail_activity_planmain_view from './mail-activity-planmain-view';
import res_groups_users_relGridView from './res-groups-users-rel-grid-view';
import ir_module_categoryPickupView from './ir-module-category-pickup-view';
import ir_rulemain_view from './ir-rulemain-view';
import res_groups_implied_relEditView from './res-groups-implied-rel-edit-view';
import resource_resourcemain_view from './resource-resourcemain-view';
import res_groups_implied_relGridView from './res-groups-implied-rel-grid-view';
import hr_jobPickupView from './hr-job-pickup-view';
import mail_thread_component_view from './mail-thread-component-view';
import res_usersPickupGridView from './res-users-pickup-grid-view';
import res_groupsPickupGridView from './res-groups-pickup-grid-view';
import unires_group_relEditView from './unires-group-rel-edit-view';
import res_usersmulti_data_view from './res-usersmulti-data-view';
import mail_activity_planmulti_data_view from './mail-activity-planmulti-data-view';
import ir_model_accessGridView from './ir-model-access-grid-view';
import res_currencyPickupGridView from './res-currency-pickup-grid-view';
import resource_resourcemulti_data_view from './resource-resourcemulti-data-view';
import res_partnerPickupView from './res-partner-pickup-view';
import ir_model_accessEditView from './ir-model-access-edit-view';
import hr_work_locationPickupView from './hr-work-location-pickup-view';
import resource_calendarPickupGridView from './resource-calendar-pickup-grid-view';
import hr_departmentmulti_data_view from './hr-departmentmulti-data-view';
import res_companymulti_data_view from './res-companymulti-data-view';
import res_groupsmulti_data_view from './res-groupsmulti-data-view';
import hr_work_locationmain_view from './hr-work-locationmain-view';
import rule_group_relnested_group_grid_view from './rule-group-relnested-group-grid-view';
import resource_calendarPickupView from './resource-calendar-pickup-view';
import hr_departmentmain_view from './hr-departmentmain-view';
import ir_rulemulti_data_view from './ir-rulemulti-data-view';
import resource_calendarmain_view from './resource-calendarmain-view';
import resource_calendar_attendancegrid_view_nested from './resource-calendar-attendancegrid-view-nested';
import res_groupsPickupView from './res-groups-pickup-view';
import res_companyPickupView from './res-company-pickup-view';
import res_usersPickupView from './res-users-pickup-view';
import PSCorePrdMarketApplicationView from './ps-core-prd-market-application-view';
import res_usersmain_view from './res-usersmain-view';
import res_groupsmain_view from './res-groupsmain-view';

export async function initViewConfig(): Promise<void> {
  ibiz.hub.config.view.set(
    'ehrapp.res_companypickupgridview',
    res_companyPickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_usersedit_view',
    res_usersedit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.rule_group_relnested_rule_grid_view',
    rule_group_relnested_rule_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set('ehrapp.appindexview', AppIndexView as IViewConfig);
  ibiz.hub.config.view.set(
    'ehrapp.hr_jobmain_view',
    hr_jobmain_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_usersinfo_view',
    res_usersinfo_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.rule_group_releditview',
    rule_group_relEditView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.unires_group_relnested_group_grid_view',
    unires_group_relnested_group_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.ir_module_categoryeditview',
    ir_module_categoryEditView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_companyedit_view',
    res_companyedit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_work_locationpickupgridview',
    hr_work_locationPickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.mail_activity_plan_templatequick_create_view',
    mail_activity_plan_templatequick_create_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_countrypickupgridview',
    res_countryPickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_groups_users_releditview',
    res_groups_users_relEditView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_countrypickupview',
    res_countryPickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_currencypickupview',
    res_currencyPickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.pscoreprdfuncinstalledgridview',
    PSCorePrdFuncInstalledGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_departmentpickupgridview',
    hr_departmentPickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.pscoreprdfunctreeexpview',
    PSCorePrdFuncTreeExpView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_departmentpickupview',
    hr_departmentPickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.pscoreprdfuncinfoview',
    PSCorePrdFuncInfoView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_employeeorg_chart_view',
    hr_employeeorg_chart_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.pscoreprdfuncmarketapplicationview',
    PSCorePrdFuncMarketApplicationView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_employeemain_view',
    hr_employeemain_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_companymain_view',
    res_companymain_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_groupsmulti_data_view_user',
    res_groupsmulti_data_view_user as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_groups_users_reluser_group_mgr_view',
    res_groups_users_reluser_group_mgr_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_partnerpickupgridview',
    res_partnerPickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.ir_module_categorypickupgridview',
    ir_module_categoryPickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.resource_calendar_attendanceeditview',
    resource_calendar_attendanceEditView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.mail_activity_plan_templategridview',
    mail_activity_plan_templateGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.ir_rulepickupview',
    ir_rulePickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.ir_rulepickupgridview',
    ir_rulePickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_partnermain_view',
    res_partnermain_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_departmentdepartment_hierarchy_view',
    hr_departmentdepartment_hierarchy_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.pscoreprdinfoview',
    PSCorePrdInfoView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_employeemulti_data_view',
    hr_employeemulti_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_jobpickupgridview',
    hr_jobPickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.ir_model_accessmulti_data_view',
    ir_model_accessmulti_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.mail_activity_planmain_view',
    mail_activity_planmain_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_groups_users_relgridview',
    res_groups_users_relGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.ir_module_categorypickupview',
    ir_module_categoryPickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.ir_rulemain_view',
    ir_rulemain_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_groups_implied_releditview',
    res_groups_implied_relEditView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.resource_resourcemain_view',
    resource_resourcemain_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_groups_implied_relgridview',
    res_groups_implied_relGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_jobpickupview',
    hr_jobPickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.mail_thread_component_view',
    mail_thread_component_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_userspickupgridview',
    res_usersPickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_groupspickupgridview',
    res_groupsPickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.unires_group_releditview',
    unires_group_relEditView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_usersmulti_data_view',
    res_usersmulti_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.mail_activity_planmulti_data_view',
    mail_activity_planmulti_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.ir_model_accessgridview',
    ir_model_accessGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_currencypickupgridview',
    res_currencyPickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.resource_resourcemulti_data_view',
    resource_resourcemulti_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_partnerpickupview',
    res_partnerPickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.ir_model_accesseditview',
    ir_model_accessEditView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_work_locationpickupview',
    hr_work_locationPickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.resource_calendarpickupgridview',
    resource_calendarPickupGridView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_departmentmulti_data_view',
    hr_departmentmulti_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_companymulti_data_view',
    res_companymulti_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_groupsmulti_data_view',
    res_groupsmulti_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_work_locationmain_view',
    hr_work_locationmain_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.rule_group_relnested_group_grid_view',
    rule_group_relnested_group_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.resource_calendarpickupview',
    resource_calendarPickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.hr_departmentmain_view',
    hr_departmentmain_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.ir_rulemulti_data_view',
    ir_rulemulti_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.resource_calendarmain_view',
    resource_calendarmain_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.resource_calendar_attendancegrid_view_nested',
    resource_calendar_attendancegrid_view_nested as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_groupspickupview',
    res_groupsPickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_companypickupview',
    res_companyPickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_userspickupview',
    res_usersPickupView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.pscoreprdmarketapplicationview',
    PSCorePrdMarketApplicationView as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_usersmain_view',
    res_usersmain_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'ehrapp.res_groupsmain_view',
    res_groupsmain_view as IViewConfig,
  );
}
