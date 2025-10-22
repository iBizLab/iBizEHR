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
    case 'attendance_clock_in_record_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-clock-in-record/attendance-clock-in-record-grid-view/attendance-clock-in-record-grid-view.vue'
          ),
      );
    case 'resource_calendar_leaves_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar-leaves/resource-calendar-leaves-grid-view/resource-calendar-leaves-grid-view.vue'
          ),
      );
    case 'attendance_checkin_device_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-checkin-device/attendance-checkin-device-edit-view/attendance-checkin-device-edit-view.vue'
          ),
      );
    case 'employee_data_view_exp_view':
      return defineAsyncComponent(
        () =>
          import(
            './employee/employee-data-view-exp-view/employee-data-view-exp-view.vue'
          ),
      );
    case 'attendance_record_abnormal_attendance':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-record/attendance-record-abnormal-attendance/attendance-record-abnormal-attendance.vue'
          ),
      );
    case 'attendance_shift_default_shift_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-shift/attendance-shift-default-shift-view/attendance-shift-default-shift-view.vue'
          ),
      );
    case 'hr_attendance_kiosk_checkin_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-attendance/hr-attendance-kiosk-checkin-view/hr-attendance-kiosk-checkin-view.vue'
          ),
      );
    case 'attendance_record_check_info_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-record/attendance-record-check-info-edit-view/attendance-record-check-info-edit-view.vue'
          ),
      );
    case 'attendance_department_statistics_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-department-statistics/attendance-department-statistics-grid-view/attendance-department-statistics-grid-view.vue'
          ),
      );
    case 'attendance_rule_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-rule/attendance-rule-grid-view/attendance-rule-grid-view.vue'
          ),
      );
    case 'attendance_statistics_monthly_statistics':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-statistics/attendance-statistics-monthly-statistics/attendance-statistics-monthly-statistics.vue'
          ),
      );
    case 'hr_attendance_manage_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-attendance/hr-attendance-manage-multi-data-view/hr-attendance-manage-multi-data-view.vue'
          ),
      );
    case 'attendance_statistics_monthly_statistics_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-statistics/attendance-statistics-monthly-statistics-tab-search-view/attendance-statistics-monthly-statistics-tab-search-view.vue'
          ),
      );
    case 'hr_employee_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee/hr-employee-main-view/hr-employee-main-view.vue'
          ),
      );
    case 'public_leave_type_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './public-leave-type/public-leave-type-grid-view/public-leave-type-grid-view.vue'
          ),
      );
    case 'attendance_gps_location_quick_create_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-gps-location/attendance-gps-location-quick-create-view/attendance-gps-location-quick-create-view.vue'
          ),
      );
    case 'attendance_activate_rule_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-activate-rule/attendance-activate-rule-pickup-view/attendance-activate-rule-pickup-view.vue'
          ),
      );
    case 'user_object_dept_pickup_tree_view':
      return defineAsyncComponent(
        () =>
          import(
            './user-object/user-object-dept-pickup-tree-view/user-object-dept-pickup-tree-view.vue'
          ),
      );
    case 'attendance_schedule_overview_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-schedule/attendance-schedule-overview-grid-view/attendance-schedule-overview-grid-view.vue'
          ),
      );
    case 'employee_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './employee/employee-pickup-grid-view/employee-pickup-grid-view.vue'
          ),
      );
    case 'attendance_workday_inversion_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-workday/attendance-workday-inversion-grid-view/attendance-workday-inversion-grid-view.vue'
          ),
      );
    case 'hr_attendance_report_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-attendance/hr-attendance-report-multi-data-view/hr-attendance-report-multi-data-view.vue'
          ),
      );
    case 'attendance_schedule_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-schedule/attendance-schedule-redirect-view/attendance-schedule-redirect-view.vue'
          ),
      );
    case 'attendance_checkin_device_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-checkin-device/attendance-checkin-device-grid-view/attendance-checkin-device-grid-view.vue'
          ),
      );
    case 'attendance_clock_in_record_monthly_clock_in_record':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-clock-in-record/attendance-clock-in-record-monthly-clock-in-record/attendance-clock-in-record-monthly-clock-in-record.vue'
          ),
      );
    case 'attendance_clock_in_record_reissue_option_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-clock-in-record/attendance-clock-in-record-reissue-option-view/attendance-clock-in-record-reissue-option-view.vue'
          ),
      );
    case 'res_config_settings_custom_view_exten_carrier':
      return defineAsyncComponent(
        () =>
          import(
            './res-config-settings/res-config-settings-custom-view-exten-carrier/res-config-settings-custom-view-exten-carrier.vue'
          ),
      );
    case 'attendance_clock_in_record_tab_search_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-clock-in-record/attendance-clock-in-record-tab-search-view/attendance-clock-in-record-tab-search-view.vue'
          ),
      );
    case 'hr_employee_checkin_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-employee/hr-employee-checkin-multi-data-view/hr-employee-checkin-multi-data-view.vue'
          ),
      );
    case 'attendance_rule_no_required_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-rule/attendance-rule-no-required-edit-view/attendance-rule-no-required-edit-view.vue'
          ),
      );
    case 'attendance_rule_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-rule/attendance-rule-edit-view/attendance-rule-edit-view.vue'
          ),
      );
    case 'attendance_workday_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-workday/attendance-workday-grid-view/attendance-workday-grid-view.vue'
          ),
      );
    case 'user_object_preson_limit_m_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './user-object/user-object-preson-limit-m-pickup-view/user-object-preson-limit-m-pickup-view.vue'
          ),
      );
    case 'attendance_gps_location_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-gps-location/attendance-gps-location-grid-view/attendance-gps-location-grid-view.vue'
          ),
      );
    case 'attendance_device_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-device/attendance-device-pickup-view/attendance-device-pickup-view.vue'
          ),
      );
    case 'resource_calendar_leaves_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './resource-calendar-leaves/resource-calendar-leaves-edit-view/resource-calendar-leaves-edit-view.vue'
          ),
      );
    case 'public_leave_type_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './public-leave-type/public-leave-type-pickup-grid-view/public-leave-type-pickup-grid-view.vue'
          ),
      );
    case 'attendance_shift_inversion_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-shift/attendance-shift-inversion-grid-view/attendance-shift-inversion-grid-view.vue'
          ),
      );
    case 'user_object_dept_limit_m_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './user-object/user-object-dept-limit-m-pickup-view/user-object-dept-limit-m-pickup-view.vue'
          ),
      );
    case 'employee_pickup_view':
      return defineAsyncComponent(
        () =>
          import('./employee/employee-pickup-view/employee-pickup-view.vue'),
      );
    case 'attendance_record_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-record/attendance-record-redirect-view/attendance-record-redirect-view.vue'
          ),
      );
    case 'attendance_clock_in_record_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-clock-in-record/attendance-clock-in-record-edit-view/attendance-clock-in-record-edit-view.vue'
          ),
      );
    case 'attendance_shift_quick_create_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-shift/attendance-shift-quick-create-view/attendance-shift-quick-create-view.vue'
          ),
      );
    case 'attendance_activate_rule_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-activate-rule/attendance-activate-rule-pickup-grid-view/attendance-activate-rule-pickup-grid-view.vue'
          ),
      );
    case 'hr_attendance_index_view':
      return defineAsyncComponent(
        () => import('./hr-attendance-index-view/hr-attendance-index-view.vue'),
      );
    case 'attendance_workday_work_rest_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-workday/attendance-workday-work-rest-grid-view/attendance-workday-work-rest-grid-view.vue'
          ),
      );
    case 'blank_index_view':
      return defineAsyncComponent(
        () => import('./blank-index-view/blank-index-view.vue'),
      );
    case 'hr_attendance_multi_data_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-attendance/hr-attendance-multi-data-view/hr-attendance-multi-data-view.vue'
          ),
      );
    case 'attendance_workday_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-workday/attendance-workday-edit-view/attendance-workday-edit-view.vue'
          ),
      );
    case 'res_config_settings_attandence_setting_view':
      return defineAsyncComponent(
        () =>
          import(
            './res-config-settings/res-config-settings-attandence-setting-view/res-config-settings-attandence-setting-view.vue'
          ),
      );
    case 'attendance_record_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-record/attendance-record-edit-view/attendance-record-edit-view.vue'
          ),
      );
    case 'attendance_workday_inversion_week2_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-workday/attendance-workday-inversion-week-2-grid-view/attendance-workday-inversion-week-2-grid-view.vue'
          ),
      );
    case 'attendance_workday_inversion_week4_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-workday/attendance-workday-inversion-week-4-grid-view/attendance-workday-inversion-week-4-grid-view.vue'
          ),
      );
    case 'attendance_workday_inversion_week3_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-workday/attendance-workday-inversion-week-3-grid-view/attendance-workday-inversion-week-3-grid-view.vue'
          ),
      );
    case 'user_object_pickup_tree_view':
      return defineAsyncComponent(
        () =>
          import(
            './user-object/user-object-pickup-tree-view/user-object-pickup-tree-view.vue'
          ),
      );
    case 'mail_thread_component_view':
      return defineAsyncComponent(
        () =>
          import(
            './mail-thread/mail-thread-component-view/mail-thread-component-view.vue'
          ),
      );
    case 'public_leave_type_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './public-leave-type/public-leave-type-edit-view/public-leave-type-edit-view.vue'
          ),
      );
    case 'attendance_clock_in_record_recalculate_option_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-clock-in-record/attendance-clock-in-record-recalculate-option-view/attendance-clock-in-record-recalculate-option-view.vue'
          ),
      );
    case 'attendance_schedule_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-schedule/attendance-schedule-edit-view/attendance-schedule-edit-view.vue'
          ),
      );
    case 'hr_attendance_main_view':
      return defineAsyncComponent(
        () =>
          import(
            './hr-attendance/hr-attendance-main-view/hr-attendance-main-view.vue'
          ),
      );
    case 'attendance_workday_different_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-workday/attendance-workday-different-grid-view/attendance-workday-different-grid-view.vue'
          ),
      );
    case 'attendance_department_statistics_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-department-statistics/attendance-department-statistics-edit-view/attendance-department-statistics-edit-view.vue'
          ),
      );
    case 'attendance_rule_active_option_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-rule/attendance-rule-active-option-view/attendance-rule-active-option-view.vue'
          ),
      );
    case 'attendance_device_pickup_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-device/attendance-device-pickup-grid-view/attendance-device-pickup-grid-view.vue'
          ),
      );
    case 'attendance_record_daily_statistics_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-record/attendance-record-daily-statistics-view/attendance-record-daily-statistics-view.vue'
          ),
      );
    case 'attendance_workday_big_week_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-workday/attendance-workday-big-week-grid-view/attendance-workday-big-week-grid-view.vue'
          ),
      );
    case 'attendance_wifi_location_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-wifi-location/attendance-wifi-location-grid-view/attendance-wifi-location-grid-view.vue'
          ),
      );
    case 'attendance_workday_small_week_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-workday/attendance-workday-small-week-grid-view/attendance-workday-small-week-grid-view.vue'
          ),
      );
    case 'attendance_wifi_location_quick_create_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-wifi-location/attendance-wifi-location-quick-create-view/attendance-wifi-location-quick-create-view.vue'
          ),
      );
    case 'public_leave_type_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './public-leave-type/public-leave-type-pickup-view/public-leave-type-pickup-view.vue'
          ),
      );
    case 'attendance_statistics_edit_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-statistics/attendance-statistics-edit-view/attendance-statistics-edit-view.vue'
          ),
      );
    case 'attendance_shift_grid_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-shift/attendance-shift-grid-view/attendance-shift-grid-view.vue'
          ),
      );
    case 'attendance_statistics_redirect_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-statistics/attendance-statistics-redirect-view/attendance-statistics-redirect-view.vue'
          ),
      );
    case 'attendance_device_m_pickup_view':
      return defineAsyncComponent(
        () =>
          import(
            './attendance-device/attendance-device-m-pickup-view/attendance-device-m-pickup-view.vue'
          ),
      );
    default:
      throw new Error(`无法找到视图模型：${name}`);
  }
}
