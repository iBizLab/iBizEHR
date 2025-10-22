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
  setCodeList(await import('./code-list/cycle-days').then(m => m.default));
  setCodeList(await import('./code-list/duration').then(m => m.default));
  setCodeList(await import('./code-list/sys-operator').then(m => m.default));
  setCodeList(await import('./code-list/yes-no').then(m => m.default));
  setCodeList(
    await import('./code-list/attendance-abnormal-statistics').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-cycle-weeks').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-dailystatistics-base').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-duration-statistics').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-shift-num').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-week-1').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-week-2').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-week-3').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-week-4').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-abnormal-statistics').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-all-schedule-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-application-status').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-attendance-policy').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-attendance-result').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-attendance-rules').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-attendance-statistics').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-attendance-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-base-info').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-checkin-frequency').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-checkin-info').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-checkin-method-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-cycle').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-daily-statistics').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-details-result').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-effect-config').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-elastic-minutes').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-holiday').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-holiday-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-inversion-count').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-leave-scope-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-leave-application-statistics').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/attendance-leave-ask-unit').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-leave-calc-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-leave-status').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-manual-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-member-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-overtime-kind').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-period-from').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-same-restday').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-schedule-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-search-month').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-with-salary').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-workday').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/attendance-working-number').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/deli-checkin-type').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/employee-management-copy-give').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/employee-management-employee').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/employee-management-employee-type').then(
      m => m.default,
    ),
  );
  setCodeList(
    await import('./code-list/hr-barcode-source').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-hr-attendance-in-mode').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-hr-attendance-out-mode').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/hr-hr-attendance-overtime-status').then(
      m => m.default,
    ),
  );
  setCodeList(await import('./code-list/hr-kiosk-mode').then(m => m.default));
  setCodeList(
    await import('./code-list/hr-overtime-validation').then(m => m.default),
  );
  setCodeList(
    await import('./code-list/resource-holiday-dyna').then(m => m.default),
  );
}

export async function getAppDataEntityModel(
  name: string,
): Promise<IAppDataEntity> {
  const _name = name.toLowerCase();
  switch (_name) {
    case 'attendanceapp.attendance_checkin_application':
    case 'attendance_checkin_application':
      return import('./entities/attendance-checkin-application').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_record':
    case 'attendance_record':
      return import('./entities/attendance-record').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_checkin_device':
    case 'attendance_checkin_device':
      return import('./entities/attendance-checkin-device').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.employee':
    case 'employee':
      return import('./entities/employee').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_device':
    case 'attendance_device':
      return import('./entities/attendance-device').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_group_shift_member':
    case 'attendance_group_shift_member':
      return import('./entities/attendance-group-shift-member').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_record_detail':
    case 'attendance_record_detail':
      return import('./entities/attendance-record-detail').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_shift':
    case 'attendance_shift':
      return import('./entities/attendance-shift').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_leave_type':
    case 'attendance_leave_type':
      return import('./entities/attendance-leave-type').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_activate_shift':
    case 'attendance_activate_shift':
      return import('./entities/attendance-activate-shift').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_scope':
    case 'attendance_scope':
      return import('./entities/attendance-scope').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.public_leave_type':
    case 'public_leave_type':
      return import('./entities/public-leave-type').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.department':
    case 'department':
      return import('./entities/department').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.resource_calendar_attendance':
    case 'resource_calendar_attendance':
      return import('./entities/resource-calendar-attendance').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_activate_rule':
    case 'attendance_activate_rule':
      return import('./entities/attendance-activate-rule').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.hr_employee':
    case 'hr_employee':
      return import('./entities/hr-employee').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_gps_location':
    case 'attendance_gps_location':
      return import('./entities/attendance-gps-location').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.user_object':
    case 'user_object':
      return import('./entities/user-object').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.hr_department':
    case 'hr_department':
      return import('./entities/hr-department').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.resource_calendar_leaves':
    case 'resource_calendar_leaves':
      return import('./entities/resource-calendar-leaves').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.mail_thread':
    case 'mail_thread':
      return import('./entities/mail-thread').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.res_config_settings':
    case 'res_config_settings':
      return import('./entities/res-config-settings').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_statistics':
    case 'attendance_statistics':
      return import('./entities/attendance-statistics').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.resource_calendar':
    case 'resource_calendar':
      return import('./entities/resource-calendar').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.resource_resource':
    case 'resource_resource':
      return import('./entities/resource-resource').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_department_statistics':
    case 'attendance_department_statistics':
      return import('./entities/attendance-department-statistics').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_wifi_location':
    case 'attendance_wifi_location':
      return import('./entities/attendance-wifi-location').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_group_shift':
    case 'attendance_group_shift':
      return import('./entities/attendance-group-shift').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.hr_attendance':
    case 'hr_attendance':
      return import('./entities/hr-attendance').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_rule':
    case 'attendance_rule':
      return import('./entities/attendance-rule').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_clock_in_record':
    case 'attendance_clock_in_record':
      return import('./entities/attendance-clock-in-record').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_workday':
    case 'attendance_workday':
      return import('./entities/attendance-workday').then(
        m => m.default as unknown as IAppDataEntity,
      );
    case 'attendanceapp.attendance_schedule':
    case 'attendance_schedule':
      return import('./entities/attendance-schedule').then(
        m => m.default as unknown as IAppDataEntity,
      );
    default:
      throw new Error(`无法找到实体模型：${name}`);
  }
}
export async function getAppViewModel(name: string): Promise<IAppView> {
  const _name = name.toLowerCase();
  switch (_name) {
    case 'attendance_clock_in_record_grid_view':
      return import('./views/attendance-clock-in-record-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_leaves_grid_view':
      return import('./views/resource-calendar-leaves-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_checkin_device_edit_view':
      return import('./views/attendance-checkin-device-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'employee_data_view_exp_view':
      return import('./views/employee-data-view-exp-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_record_abnormal_attendance':
      return import('./views/attendance-record-abnormal-attendance').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_shift_default_shift_view':
      return import('./views/attendance-shift-default-shift-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_attendance_kiosk_checkin_view':
      return import('./views/hr-attendance-kiosk-checkin-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_record_check_info_edit_view':
      return import('./views/attendance-record-check-info-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_department_statistics_grid_view':
      return import('./views/attendance-department-statistics-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_rule_grid_view':
      return import('./views/attendance-rule-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_statistics_monthly_statistics':
      return import('./views/attendance-statistics-monthly-statistics').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_attendance_manage_multi_data_view':
      return import('./views/hr-attendance-manage-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_statistics_monthly_statistics_tab_search_view':
      return import(
        './views/attendance-statistics-monthly-statistics-tab-search-view'
      ).then(m => m.default as unknown as IAppView);
    case 'hr_employee_main_view':
      return import('./views/hr-employee-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'public_leave_type_grid_view':
      return import('./views/public-leave-type-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_gps_location_quick_create_view':
      return import('./views/attendance-gps-location-quick-create-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_activate_rule_pickup_view':
      return import('./views/attendance-activate-rule-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_object_dept_pickup_tree_view':
      return import('./views/user-object-dept-pickup-tree-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_schedule_overview_grid_view':
      return import('./views/attendance-schedule-overview-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'employee_pickup_grid_view':
      return import('./views/employee-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_workday_inversion_grid_view':
      return import('./views/attendance-workday-inversion-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_attendance_report_multi_data_view':
      return import('./views/hr-attendance-report-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_schedule_redirect_view':
      return import('./views/attendance-schedule-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_checkin_device_grid_view':
      return import('./views/attendance-checkin-device-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_clock_in_record_monthly_clock_in_record':
      return import(
        './views/attendance-clock-in-record-monthly-clock-in-record'
      ).then(m => m.default as unknown as IAppView);
    case 'attendance_clock_in_record_reissue_option_view':
      return import(
        './views/attendance-clock-in-record-reissue-option-view'
      ).then(m => m.default as unknown as IAppView);
    case 'res_config_settings_custom_view_exten_carrier':
      return import(
        './views/res-config-settings-custom-view-exten-carrier'
      ).then(m => m.default as unknown as IAppView);
    case 'attendance_clock_in_record_tab_search_view':
      return import('./views/attendance-clock-in-record-tab-search-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_employee_checkin_multi_data_view':
      return import('./views/hr-employee-checkin-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_rule_no_required_edit_view':
      return import('./views/attendance-rule-no-required-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_rule_edit_view':
      return import('./views/attendance-rule-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_workday_grid_view':
      return import('./views/attendance-workday-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_object_preson_limit_m_pickup_view':
      return import('./views/user-object-preson-limit-m-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_gps_location_grid_view':
      return import('./views/attendance-gps-location-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_device_pickup_view':
      return import('./views/attendance-device-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'resource_calendar_leaves_edit_view':
      return import('./views/resource-calendar-leaves-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'public_leave_type_pickup_grid_view':
      return import('./views/public-leave-type-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_shift_inversion_grid_view':
      return import('./views/attendance-shift-inversion-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'user_object_dept_limit_m_pickup_view':
      return import('./views/user-object-dept-limit-m-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'employee_pickup_view':
      return import('./views/employee-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_record_redirect_view':
      return import('./views/attendance-record-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_clock_in_record_edit_view':
      return import('./views/attendance-clock-in-record-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_shift_quick_create_view':
      return import('./views/attendance-shift-quick-create-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_activate_rule_pickup_grid_view':
      return import('./views/attendance-activate-rule-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_attendance_index_view':
      return import('./views/hr-attendance-index-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_workday_work_rest_grid_view':
      return import('./views/attendance-workday-work-rest-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'blank_index_view':
      return import('./views/blank-index-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_attendance_multi_data_view':
      return import('./views/hr-attendance-multi-data-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_workday_edit_view':
      return import('./views/attendance-workday-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'res_config_settings_attandence_setting_view':
      return import('./views/res-config-settings-attandence-setting-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_record_edit_view':
      return import('./views/attendance-record-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_workday_inversion_week2_grid_view':
      return import(
        './views/attendance-workday-inversion-week-2-grid-view'
      ).then(m => m.default as unknown as IAppView);
    case 'attendance_workday_inversion_week4_grid_view':
      return import(
        './views/attendance-workday-inversion-week-4-grid-view'
      ).then(m => m.default as unknown as IAppView);
    case 'attendance_workday_inversion_week3_grid_view':
      return import(
        './views/attendance-workday-inversion-week-3-grid-view'
      ).then(m => m.default as unknown as IAppView);
    case 'user_object_pickup_tree_view':
      return import('./views/user-object-pickup-tree-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'mail_thread_component_view':
      return import('./views/mail-thread-component-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'public_leave_type_edit_view':
      return import('./views/public-leave-type-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_clock_in_record_recalculate_option_view':
      return import(
        './views/attendance-clock-in-record-recalculate-option-view'
      ).then(m => m.default as unknown as IAppView);
    case 'attendance_schedule_edit_view':
      return import('./views/attendance-schedule-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'hr_attendance_main_view':
      return import('./views/hr-attendance-main-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_workday_different_grid_view':
      return import('./views/attendance-workday-different-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_department_statistics_edit_view':
      return import('./views/attendance-department-statistics-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_rule_active_option_view':
      return import('./views/attendance-rule-active-option-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_device_pickup_grid_view':
      return import('./views/attendance-device-pickup-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_record_daily_statistics_view':
      return import('./views/attendance-record-daily-statistics-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_workday_big_week_grid_view':
      return import('./views/attendance-workday-big-week-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_wifi_location_grid_view':
      return import('./views/attendance-wifi-location-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_workday_small_week_grid_view':
      return import('./views/attendance-workday-small-week-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_wifi_location_quick_create_view':
      return import('./views/attendance-wifi-location-quick-create-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'public_leave_type_pickup_view':
      return import('./views/public-leave-type-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_statistics_edit_view':
      return import('./views/attendance-statistics-edit-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_shift_grid_view':
      return import('./views/attendance-shift-grid-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_statistics_redirect_view':
      return import('./views/attendance-statistics-redirect-view').then(
        m => m.default as unknown as IAppView,
      );
    case 'attendance_device_m_pickup_view':
      return import('./views/attendance-device-m-pickup-view').then(
        m => m.default as unknown as IAppView,
      );
    default:
      throw new Error(`无法找到视图模型：${name}`);
  }
}

export async function getAppModel(): Promise<IApplication> {
  ibiz.hub.defaultAppIndexViewName = 'hr_attendance_index_view';
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
