import { IViewConfig } from '@ibiz-template/runtime';
import attendance_clock_in_record_grid_view from './attendance-clock-in-record-grid-view';
import resource_calendar_leaves_grid_view from './resource-calendar-leaves-grid-view';
import attendance_checkin_device_edit_view from './attendance-checkin-device-edit-view';
import employee_data_view_exp_view from './employee-data-view-exp-view';
import attendance_record_abnormal_attendance from './attendance-record-abnormal-attendance';
import attendance_shift_default_shift_view from './attendance-shift-default-shift-view';
import hr_attendance_kiosk_checkin_view from './hr-attendance-kiosk-checkin-view';
import attendance_record_check_info_edit_view from './attendance-record-check-info-edit-view';
import attendance_department_statistics_grid_view from './attendance-department-statistics-grid-view';
import attendance_rule_grid_view from './attendance-rule-grid-view';
import attendance_statistics_monthly_statistics from './attendance-statistics-monthly-statistics';
import hr_attendance_manage_multi_data_view from './hr-attendance-manage-multi-data-view';
import attendance_statistics_monthly_statistics_tab_search_view from './attendance-statistics-monthly-statistics-tab-search-view';
import hr_employee_main_view from './hr-employee-main-view';
import public_leave_type_grid_view from './public-leave-type-grid-view';
import attendance_gps_location_quick_create_view from './attendance-gps-location-quick-create-view';
import attendance_activate_rule_pickup_view from './attendance-activate-rule-pickup-view';
import user_object_dept_pickup_tree_view from './user-object-dept-pickup-tree-view';
import attendance_schedule_overview_grid_view from './attendance-schedule-overview-grid-view';
import employee_pickup_grid_view from './employee-pickup-grid-view';
import attendance_workday_inversion_grid_view from './attendance-workday-inversion-grid-view';
import hr_attendance_report_multi_data_view from './hr-attendance-report-multi-data-view';
import attendance_schedule_redirect_view from './attendance-schedule-redirect-view';
import attendance_checkin_device_grid_view from './attendance-checkin-device-grid-view';
import attendance_clock_in_record_monthly_clock_in_record from './attendance-clock-in-record-monthly-clock-in-record';
import attendance_clock_in_record_reissue_option_view from './attendance-clock-in-record-reissue-option-view';
import res_config_settings_custom_view_exten_carrier from './res-config-settings-custom-view-exten-carrier';
import attendance_clock_in_record_tab_search_view from './attendance-clock-in-record-tab-search-view';
import hr_employee_checkin_multi_data_view from './hr-employee-checkin-multi-data-view';
import attendance_rule_no_required_edit_view from './attendance-rule-no-required-edit-view';
import attendance_rule_edit_view from './attendance-rule-edit-view';
import attendance_workday_grid_view from './attendance-workday-grid-view';
import user_object_preson_limit_m_pickup_view from './user-object-preson-limit-m-pickup-view';
import attendance_gps_location_grid_view from './attendance-gps-location-grid-view';
import attendance_device_pickup_view from './attendance-device-pickup-view';
import resource_calendar_leaves_edit_view from './resource-calendar-leaves-edit-view';
import public_leave_type_pickup_grid_view from './public-leave-type-pickup-grid-view';
import attendance_shift_inversion_grid_view from './attendance-shift-inversion-grid-view';
import user_object_dept_limit_m_pickup_view from './user-object-dept-limit-m-pickup-view';
import employee_pickup_view from './employee-pickup-view';
import attendance_record_redirect_view from './attendance-record-redirect-view';
import attendance_clock_in_record_edit_view from './attendance-clock-in-record-edit-view';
import attendance_shift_quick_create_view from './attendance-shift-quick-create-view';
import attendance_activate_rule_pickup_grid_view from './attendance-activate-rule-pickup-grid-view';
import hr_attendance_index_view from './hr-attendance-index-view';
import attendance_workday_work_rest_grid_view from './attendance-workday-work-rest-grid-view';
import blank_index_view from './blank-index-view';
import hr_attendance_multi_data_view from './hr-attendance-multi-data-view';
import attendance_workday_edit_view from './attendance-workday-edit-view';
import res_config_settings_attandence_setting_view from './res-config-settings-attandence-setting-view';
import attendance_record_edit_view from './attendance-record-edit-view';
import attendance_workday_inversion_week2_grid_view from './attendance-workday-inversion-week-2-grid-view';
import attendance_workday_inversion_week4_grid_view from './attendance-workday-inversion-week-4-grid-view';
import attendance_workday_inversion_week3_grid_view from './attendance-workday-inversion-week-3-grid-view';
import user_object_pickup_tree_view from './user-object-pickup-tree-view';
import mail_thread_component_view from './mail-thread-component-view';
import public_leave_type_edit_view from './public-leave-type-edit-view';
import attendance_clock_in_record_recalculate_option_view from './attendance-clock-in-record-recalculate-option-view';
import attendance_schedule_edit_view from './attendance-schedule-edit-view';
import hr_attendance_main_view from './hr-attendance-main-view';
import attendance_workday_different_grid_view from './attendance-workday-different-grid-view';
import attendance_department_statistics_edit_view from './attendance-department-statistics-edit-view';
import attendance_rule_active_option_view from './attendance-rule-active-option-view';
import attendance_device_pickup_grid_view from './attendance-device-pickup-grid-view';
import attendance_record_daily_statistics_view from './attendance-record-daily-statistics-view';
import attendance_workday_big_week_grid_view from './attendance-workday-big-week-grid-view';
import attendance_wifi_location_grid_view from './attendance-wifi-location-grid-view';
import attendance_workday_small_week_grid_view from './attendance-workday-small-week-grid-view';
import attendance_wifi_location_quick_create_view from './attendance-wifi-location-quick-create-view';
import public_leave_type_pickup_view from './public-leave-type-pickup-view';
import attendance_statistics_edit_view from './attendance-statistics-edit-view';
import attendance_shift_grid_view from './attendance-shift-grid-view';
import attendance_statistics_redirect_view from './attendance-statistics-redirect-view';
import attendance_device_m_pickup_view from './attendance-device-m-pickup-view';

export async function initViewConfig(): Promise<void> {
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_clock_in_record_grid_view',
    attendance_clock_in_record_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.resource_calendar_leaves_grid_view',
    resource_calendar_leaves_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_checkin_device_edit_view',
    attendance_checkin_device_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.employee_data_view_exp_view',
    employee_data_view_exp_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_record_abnormal_attendance',
    attendance_record_abnormal_attendance as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_shift_default_shift_view',
    attendance_shift_default_shift_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.hr_attendance_kiosk_checkin_view',
    hr_attendance_kiosk_checkin_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_record_check_info_edit_view',
    attendance_record_check_info_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_department_statistics_grid_view',
    attendance_department_statistics_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_rule_grid_view',
    attendance_rule_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_statistics_monthly_statistics',
    attendance_statistics_monthly_statistics as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.hr_attendance_manage_multi_data_view',
    hr_attendance_manage_multi_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_statistics_monthly_statistics_tab_search_view',
    attendance_statistics_monthly_statistics_tab_search_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.hr_employee_main_view',
    hr_employee_main_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.public_leave_type_grid_view',
    public_leave_type_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_gps_location_quick_create_view',
    attendance_gps_location_quick_create_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_activate_rule_pickup_view',
    attendance_activate_rule_pickup_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.user_object_dept_pickup_tree_view',
    user_object_dept_pickup_tree_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_schedule_overview_grid_view',
    attendance_schedule_overview_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.employee_pickup_grid_view',
    employee_pickup_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_workday_inversion_grid_view',
    attendance_workday_inversion_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.hr_attendance_report_multi_data_view',
    hr_attendance_report_multi_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_schedule_redirect_view',
    attendance_schedule_redirect_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_checkin_device_grid_view',
    attendance_checkin_device_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_clock_in_record_monthly_clock_in_record',
    attendance_clock_in_record_monthly_clock_in_record as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_clock_in_record_reissue_option_view',
    attendance_clock_in_record_reissue_option_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.res_config_settings_custom_view_exten_carrier',
    res_config_settings_custom_view_exten_carrier as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_clock_in_record_tab_search_view',
    attendance_clock_in_record_tab_search_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.hr_employee_checkin_multi_data_view',
    hr_employee_checkin_multi_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_rule_no_required_edit_view',
    attendance_rule_no_required_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_rule_edit_view',
    attendance_rule_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_workday_grid_view',
    attendance_workday_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.user_object_preson_limit_m_pickup_view',
    user_object_preson_limit_m_pickup_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_gps_location_grid_view',
    attendance_gps_location_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_device_pickup_view',
    attendance_device_pickup_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.resource_calendar_leaves_edit_view',
    resource_calendar_leaves_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.public_leave_type_pickup_grid_view',
    public_leave_type_pickup_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_shift_inversion_grid_view',
    attendance_shift_inversion_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.user_object_dept_limit_m_pickup_view',
    user_object_dept_limit_m_pickup_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.employee_pickup_view',
    employee_pickup_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_record_redirect_view',
    attendance_record_redirect_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_clock_in_record_edit_view',
    attendance_clock_in_record_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_shift_quick_create_view',
    attendance_shift_quick_create_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_activate_rule_pickup_grid_view',
    attendance_activate_rule_pickup_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.hr_attendance_index_view',
    hr_attendance_index_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_workday_work_rest_grid_view',
    attendance_workday_work_rest_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.blank_index_view',
    blank_index_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.hr_attendance_multi_data_view',
    hr_attendance_multi_data_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_workday_edit_view',
    attendance_workday_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.res_config_settings_attandence_setting_view',
    res_config_settings_attandence_setting_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_record_edit_view',
    attendance_record_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_workday_inversion_week2_grid_view',
    attendance_workday_inversion_week2_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_workday_inversion_week4_grid_view',
    attendance_workday_inversion_week4_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_workday_inversion_week3_grid_view',
    attendance_workday_inversion_week3_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.user_object_pickup_tree_view',
    user_object_pickup_tree_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.mail_thread_component_view',
    mail_thread_component_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.public_leave_type_edit_view',
    public_leave_type_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_clock_in_record_recalculate_option_view',
    attendance_clock_in_record_recalculate_option_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_schedule_edit_view',
    attendance_schedule_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.hr_attendance_main_view',
    hr_attendance_main_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_workday_different_grid_view',
    attendance_workday_different_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_department_statistics_edit_view',
    attendance_department_statistics_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_rule_active_option_view',
    attendance_rule_active_option_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_device_pickup_grid_view',
    attendance_device_pickup_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_record_daily_statistics_view',
    attendance_record_daily_statistics_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_workday_big_week_grid_view',
    attendance_workday_big_week_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_wifi_location_grid_view',
    attendance_wifi_location_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_workday_small_week_grid_view',
    attendance_workday_small_week_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_wifi_location_quick_create_view',
    attendance_wifi_location_quick_create_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.public_leave_type_pickup_view',
    public_leave_type_pickup_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_statistics_edit_view',
    attendance_statistics_edit_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_shift_grid_view',
    attendance_shift_grid_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_statistics_redirect_view',
    attendance_statistics_redirect_view as IViewConfig,
  );
  ibiz.hub.config.view.set(
    'attendanceapp.attendance_device_m_pickup_view',
    attendance_device_m_pickup_view as IViewConfig,
  );
}
