# attendanceapp(attendanceapp)  <!-- {docsify-ignore-all} -->

## 菜单

<el-row>
  <el-menu :ellipsis="false" class="el-menu-demo" mode="horizontal" @select="handleSelect">
    <el-sub-menu index="menuitem17">
      <template #title>出勤</template>
    <el-menu-item index="attentdance_attentdance" @click="itemClick('#/app/view/hr_attendance_multi_data_view')">概览</el-menu-item>
    <el-menu-item index="menuitem9" @click="itemClick('#/app/view/hr_attendance_manage_multi_data_view')">管理</el-menu-item>
    <el-menu-item index="menuitem14" @click="itemClick('#/app/view/hr_attendance_report_multi_data_view')">报表</el-menu-item>
    </el-sub-menu>
    <el-menu-item index="menuitem19">自助考勤模式</el-menu-item>
    <el-sub-menu index="menuitem1">
      <template #title>考勤设置</template>
    <el-menu-item index="menuitem12" @click="itemClick('#/app/view/attendance_rule_grid_view')">考勤规则</el-menu-item>
    <el-menu-item index="menuitem13" @click="itemClick('#/app/view/attendance_schedule_overview_grid_view')">排班视图</el-menu-item>
    </el-sub-menu>
    <el-sub-menu index="menuitem2">
      <template #title>考勤数据</template>
    <el-menu-item index="menuitem5" @click="itemClick('#/app/view/attendance_record_daily_statistics_view')">每日统计</el-menu-item>
    <el-menu-item index="menuitem6" @click="itemClick('#/app/view/attendance_record_abnormal_attendance')">异常考勤</el-menu-item>
    <el-menu-item index="menuitem7" @click="itemClick('#/app/view/attendance_statistics_monthly_statistics_tab_search_view')">月度汇总</el-menu-item>
    <el-menu-item index="menuitem8" @click="itemClick('#/app/view/attendance_department_statistics_grid_view')">部门统计</el-menu-item>
    <el-menu-item index="menuitem4" @click="itemClick('#/app/view/attendance_clock_in_record_tab_search_view')">打卡记录</el-menu-item>
    </el-sub-menu>
    <el-sub-menu index="menuitem10">
      <template #title>假期管理</template>
    <el-menu-item index="menuitem11" @click="itemClick('#/app/view/public_leave_type_grid_view')">公共假期类型</el-menu-item>
    <el-menu-item index="menuitem3" @click="itemClick('#/app/view/resource_calendar_leaves_grid_view')">公共假期</el-menu-item>
    </el-sub-menu>
  </el-menu>
</el-row>


## 视图清单

|  中文名     |   代码名  |  视图标题 | 视图类型   |   备注  |
|  --------   |------------| -----------|  -----   |  -----   |
|[激活规则选择表格视图](app/view/attendance_activate_rule_pickup_grid_view)|attendance_activate_rule_pickup_grid_view|激活规则|实体选择表格视图（部件视图）|系统自动添加|
|[激活规则数据选择视图](app/view/attendance_activate_rule_pickup_view)|attendance_activate_rule_pickup_view|激活规则|实体数据选择视图|系统自动添加|
|[考勤申请记录编辑视图](app/view/attendance_checkin_application_edit_view)|attendance_checkin_application_edit_view|考勤申请记录|实体编辑视图||
|[考勤申请记录表格视图](app/view/attendance_checkin_application_grid_view)|attendance_checkin_application_grid_view|考勤申请记录|实体表格视图||
|[考勤申请](app/view/attendance_checkin_application_quick_create_view)|attendance_checkin_application_quick_create_view|登记审批单|实体选项操作视图||
|[考勤设备关联编辑视图](app/view/attendance_checkin_device_edit_view)|attendance_checkin_device_edit_view|考勤设备关联|实体编辑视图||
|[考勤设备关联表格视图](app/view/attendance_checkin_device_grid_view)|attendance_checkin_device_grid_view|设备打卡|实体表格视图||
|[考勤设备关联数据多项选择视图](app/view/attendance_checkin_device_m_pickup_view)|attendance_checkin_device_m_pickup_view|考勤设备关联|实体数据多项选择视图||
|[考勤设备关联选择表格视图](app/view/attendance_checkin_device_pickup_grid_view)|attendance_checkin_device_pickup_grid_view|考勤设备关联|实体选择表格视图（部件视图）||
|[考勤设备关联数据选择视图](app/view/attendance_checkin_device_pickup_view)|attendance_checkin_device_pickup_view|考勤设备关联|实体数据选择视图||
|[我的考勤日历](app/view/attendance_clock_in_record_calendar_view)|attendance_clock_in_record_calendar_view|每日统计|实体日历视图||
|[打卡记录编辑视图](app/view/attendance_clock_in_record_edit_view)|attendance_clock_in_record_edit_view|打卡记录|实体编辑视图||
|[打卡记录表格视图](app/view/attendance_clock_in_record_grid_view)|attendance_clock_in_record_grid_view|打卡记录|实体表格视图||
|[月度视图](app/view/attendance_clock_in_record_monthly_clock_in_record)|attendance_clock_in_record_monthly_clock_in_record|月度打卡统计|实体表格视图||
|[重新计算](app/view/attendance_clock_in_record_recalculate_option_view)|attendance_clock_in_record_recalculate_option_view|重新计算|实体选项操作视图||
|[批量补卡](app/view/attendance_clock_in_record_reissue_option_view)|attendance_clock_in_record_reissue_option_view|批量补卡|实体选项操作视图||
|[打卡记录](app/view/attendance_clock_in_record_tab_exp_view)|attendance_clock_in_record_tab_exp_view|打卡记录|实体分页导航视图||
|[打卡记录](app/view/attendance_clock_in_record_tab_search_view)|attendance_clock_in_record_tab_search_view|打卡记录|实体分页搜索视图||
|[部门统计编辑视图](app/view/attendance_department_statistics_edit_view)|attendance_department_statistics_edit_view|部门统计|实体编辑视图||
|[部门统计表格视图](app/view/attendance_department_statistics_grid_view)|attendance_department_statistics_grid_view|部门统计|实体表格视图||
|[设备信息编辑视图](app/view/attendance_device_edit_view)|attendance_device_edit_view|设备信息|实体编辑视图||
|[设备信息表格视图](app/view/attendance_device_grid_view)|attendance_device_grid_view|设备信息|实体表格视图||
|[设备信息数据多项选择视图](app/view/attendance_device_m_pickup_view)|attendance_device_m_pickup_view|设备信息|实体数据多项选择视图||
|[设备信息选择表格视图](app/view/attendance_device_pickup_grid_view)|attendance_device_pickup_grid_view|设备信息|实体选择表格视图（部件视图）||
|[设备信息数据选择视图](app/view/attendance_device_pickup_view)|attendance_device_pickup_view|设备信息|实体数据选择视图||
|[GPS定位配置编辑视图](app/view/attendance_gps_location_edit_view)|attendance_gps_location_edit_view|GPS定位配置|实体编辑视图||
|[GPS定位配置表格视图](app/view/attendance_gps_location_grid_view)|attendance_gps_location_grid_view|GPS打卡|实体表格视图||
|[GPS快速配置视图](app/view/attendance_gps_location_quick_create_view)|attendance_gps_location_quick_create_view|GPS定位配置|实体选项操作视图||
|[考勤规则成员编辑视图](app/view/attendance_group_shift_member_edit_view)|attendance_group_shift_member_edit_view|考勤规则成员|实体编辑视图||
|[考勤规则成员表格视图](app/view/attendance_group_shift_member_grid_view)|attendance_group_shift_member_grid_view|考勤规则成员|实体表格视图||
|[假期类型编辑视图](app/view/attendance_leave_type_edit_view)|attendance_leave_type_edit_view|假期类型|实体编辑视图||
|[假期类型表格视图](app/view/attendance_leave_type_grid_view)|attendance_leave_type_grid_view|假期类型|实体表格视图||
|[假期类型](app/view/attendance_leave_type_quick_create_view)|attendance_leave_type_quick_create_view|假期类型|实体选项操作视图||
|[异常考勤](app/view/attendance_record_abnormal_attendance)|attendance_record_abnormal_attendance|异常考勤|实体表格视图||
|[考勤记录反查](app/view/attendance_record_check_info_edit_view)|attendance_record_check_info_edit_view|考勤记录|实体编辑视图||
|[月底汇总_个人](app/view/attendance_record_custom_view)|attendance_record_custom_view|月底汇总_个人|实体自定义视图||
|[每日统计](app/view/attendance_record_daily_statistics_view)|attendance_record_daily_statistics_view|每日统计|实体表格视图||
|[部门统计](app/view/attendance_record_department_statistics)|attendance_record_department_statistics|部门统计|实体表格视图||
|[考勤记录编辑视图](app/view/attendance_record_edit_view)|attendance_record_edit_view|考勤记录|实体编辑视图||
|[迟到次数](app/view/attendance_record_late_check)|attendance_record_late_check|迟到次数|实体表格视图||
|[早退次数](app/view/attendance_record_leave_early_check)|attendance_record_leave_early_check|早退次数|实体表格视图||
|[请假统计](app/view/attendance_record_leave_summary_custom_view)|attendance_record_leave_summary_custom_view|请假统计|实体自定义视图||
|[缺卡次数](app/view/attendance_record_missing_check)|attendance_record_missing_check|缺卡次数|实体表格视图||
|[月底汇总个人](app/view/attendance_record_month_summary_view)|attendance_record_month_summary_view|月底汇总个人|实体自定义视图||
|[考勤记录数据重定向视图](app/view/attendance_record_redirect_view)|attendance_record_redirect_view|考勤记录|实体数据重定向视图||
|[保存考勤规则](app/view/attendance_rule_active_option_view)|attendance_rule_active_option_view|保存考勤规则|实体选项操作视图||
|[考勤规则编辑视图](app/view/attendance_rule_edit_view)|attendance_rule_edit_view|考勤规则|实体编辑视图||
|[考勤规则表格视图](app/view/attendance_rule_grid_view)|attendance_rule_grid_view|考勤规则|实体表格视图||
|[免考勤规则](app/view/attendance_rule_no_required_edit_view)|attendance_rule_no_required_edit_view|免考勤规则|实体编辑视图||
|[考勤规则选择表格视图](app/view/attendance_rule_pickup_grid_view)|attendance_rule_pickup_grid_view|考勤规则|实体选择表格视图（部件视图）||
|[考勤规则数据选择视图](app/view/attendance_rule_pickup_view)|attendance_rule_pickup_view|考勤规则|实体数据选择视图||
|[排班编辑视图](app/view/attendance_schedule_edit_view)|attendance_schedule_edit_view|排班|实体编辑视图||
|[排班表格视图](app/view/attendance_schedule_grid_view)|attendance_schedule_grid_view|排班|实体表格视图||
|[排班](app/view/attendance_schedule_overview_grid_view)|attendance_schedule_overview_grid_view|排班|实体表格视图||
|[排班数据重定向视图](app/view/attendance_schedule_redirect_view)|attendance_schedule_redirect_view|排班|实体数据重定向视图||
|[时间范围编辑视图](app/view/attendance_scope_edit_view)|attendance_scope_edit_view|时间范围|实体编辑视图||
|[默认班次选项操作视图](app/view/attendance_shift_default_shift_view)|attendance_shift_default_shift_view|上下班时间|实体选项操作视图||
|[班次编辑视图](app/view/attendance_shift_edit_view)|attendance_shift_edit_view|班次|实体编辑视图||
|[班次编辑视图](app/view/attendance_shift_free_edit_view)|attendance_shift_free_edit_view|班次|实体编辑视图||
|[班次表格视图](app/view/attendance_shift_grid_view)|attendance_shift_grid_view|班次设置|实体表格视图||
|[班次表格视图](app/view/attendance_shift_inversion_grid_view)|attendance_shift_inversion_grid_view|班次设置|实体表格视图||
|[班次选项操作视图](app/view/attendance_shift_quick_create_view)|attendance_shift_quick_create_view|上下班时间|实体选项操作视图||
|[考勤统计详情](app/view/attendance_statistics_details_edit_view)|attendance_statistics_details_edit_view|考勤统计详情|实体编辑视图||
|[考勤统计编辑视图](app/view/attendance_statistics_edit_view)|attendance_statistics_edit_view|考勤统计|实体编辑视图||
|[月度汇总](app/view/attendance_statistics_monthly_statistics)|attendance_statistics_monthly_statistics|月度汇总|实体表格视图||
|[月度汇总](app/view/attendance_statistics_monthly_statistics_tab_search_view)|attendance_statistics_monthly_statistics_tab_search_view|月度汇总|实体分页搜索视图||
|[考勤统计数据重定向视图](app/view/attendance_statistics_redirect_view)|attendance_statistics_redirect_view|考勤统计|实体数据重定向视图||
|[月度汇总](app/view/attendance_statistics_tab_exp_view)|attendance_statistics_tab_exp_view|月度汇总|实体分页导航视图||
|[WiFi定位配置编辑视图](app/view/attendance_wifi_location_edit_view)|attendance_wifi_location_edit_view|WiFi定位配置|实体编辑视图||
|[WiFi定位配置表格视图](app/view/attendance_wifi_location_grid_view)|attendance_wifi_location_grid_view|WIFI打卡|实体表格视图||
|[WIFI快速配置视图](app/view/attendance_wifi_location_quick_create_view)|attendance_wifi_location_quick_create_view|WiFi定位配置|实体选项操作视图||
|[工作日表格视图](app/view/attendance_workday_big_week_grid_view)|attendance_workday_big_week_grid_view|工作日|实体表格视图||
|[工作日表格视图-N班倒（休息日不同](app/view/attendance_workday_different_grid_view)|attendance_workday_different_grid_view|工作日|实体表格视图||
|[工作日编辑视图](app/view/attendance_workday_edit_view)|attendance_workday_edit_view|工作日|实体编辑视图||
|[工作日表格视图](app/view/attendance_workday_grid_view)|attendance_workday_grid_view|工作日|实体表格视图||
|[工作日表格视图-N班倒](app/view/attendance_workday_inversion_grid_view)|attendance_workday_inversion_grid_view|工作日|实体表格视图||
|[工作日表格视图-N班倒](app/view/attendance_workday_inversion_week2_grid_view)|attendance_workday_inversion_week2_grid_view|工作日|实体表格视图||
|[工作日表格视图-N班倒](app/view/attendance_workday_inversion_week3_grid_view)|attendance_workday_inversion_week3_grid_view|工作日|实体表格视图||
|[工作日表格视图-N班倒](app/view/attendance_workday_inversion_week4_grid_view)|attendance_workday_inversion_week4_grid_view|工作日|实体表格视图||
|[工作日表格视图](app/view/attendance_workday_small_week_grid_view)|attendance_workday_small_week_grid_view|工作日|实体表格视图||
|[工作日表格视图-上A休B](app/view/attendance_workday_work_rest_grid_view)|attendance_workday_work_rest_grid_view|工作日|实体表格视图||
|[应用首页视图](app/view/blank_index_view)|blank_index_view|自助考勤模式|应用首页视图||
|[部门信息](app/view/department_department_info_option_view)|department_department_info_option_view|部门信息|实体选项操作视图|系统自动添加|
|[部门信息选择表格视图](app/view/department_pickup_grid_view)|department_pickup_grid_view|部门信息|实体选择表格视图（部件视图）|系统自动添加|
|[部门信息数据选择视图](app/view/department_pickup_view)|department_pickup_view|部门信息|实体数据选择视图|系统自动添加|
|[月度汇总个人卡片导航视图](app/view/employee_data_view_exp_view)|employee_data_view_exp_view|个人月度汇总|实体卡片视图导航视图||
|[员工信息](app/view/employee_employee_info_option_view)|employee_employee_info_option_view|员工信息|实体选项操作视图|系统自动添加|
|[月度汇总列表导航视图](app/view/employee_monthlysummary_list_exp_view)|employee_monthlysummary_list_exp_view|月度汇总列表导航视图|实体列表导航视图|系统自动添加|
|[员工信息选择表格视图](app/view/employee_pickup_grid_view)|employee_pickup_grid_view|员工信息|实体选择表格视图（部件视图）|系统自动添加|
|[员工信息数据选择视图](app/view/employee_pickup_view)|employee_pickup_view|员工信息|实体数据选择视图|系统自动添加|
|[应用首页视图](app/view/hr_attendance_index_view)|hr_attendance_index_view|出勤|应用首页视图||
|[自助考勤](app/view/hr_attendance_kiosk_checkin_view)|hr_attendance_kiosk_checkin_view|自助考勤|实体编辑视图||
|[出勤编辑视图](app/view/hr_attendance_main_view)|hr_attendance_main_view|出勤|实体编辑视图||
|[管理](app/view/hr_attendance_manage_multi_data_view)|hr_attendance_manage_multi_data_view|管理|实体多数据自定义视图||
|[出勤](app/view/hr_attendance_multi_data_view)|hr_attendance_multi_data_view|出勤|实体多数据自定义视图||
|[报表](app/view/hr_attendance_report_multi_data_view)|hr_attendance_report_multi_data_view|报表|实体多数据自定义视图||
|[自助考勤](app/view/hr_employee_checkin_multi_data_view)|hr_employee_checkin_multi_data_view|自助考勤|实体多数据自定义视图||
|[员工编辑视图](app/view/hr_employee_edit_view)|hr_employee_edit_view|员工|实体编辑视图|系统自动添加|
|[员工编辑视图](app/view/hr_employee_main_view)|hr_employee_main_view|员工|实体子应用引用视图||
|[员工选择表格视图](app/view/hr_employee_pickup_grid_view)|hr_employee_pickup_grid_view|员工|实体选择表格视图（部件视图）|系统自动添加|
|[员工数据选择视图](app/view/hr_employee_pickup_view)|hr_employee_pickup_view|员工|实体数据选择视图|系统自动添加|
|[员工数据重定向视图](app/view/hr_employee_redirect_view)|hr_employee_redirect_view|员工|实体数据重定向视图|系统自动添加|
|[邮件会话](app/view/mail_thread_component_view)|mail_thread_component_view|邮件会话|实体子应用引用视图|系统自动添加|
|[公共假期类型编辑视图](app/view/public_leave_type_edit_view)|public_leave_type_edit_view|公共假期类型|实体编辑视图|系统自动添加|
|[公共假期类型表格视图](app/view/public_leave_type_grid_view)|public_leave_type_grid_view|公共假期类型|实体表格视图||
|[公共假期类型选择表格视图](app/view/public_leave_type_pickup_grid_view)|public_leave_type_pickup_grid_view|公共假期类型|实体选择表格视图（部件视图）|系统自动添加|
|[公共假期类型数据选择视图](app/view/public_leave_type_pickup_view)|public_leave_type_pickup_view|公共假期类型|实体数据选择视图|系统自动添加|
|[出勤配置](app/view/res_config_settings_attandence_setting_view)|res_config_settings_attandence_setting_view|出勤配置|实体编辑视图||
|[扩展携带视图](app/view/res_config_settings_custom_view_exten_carrier)|res_config_settings_custom_view_exten_carrier|扩展携带视图|实体自定义视图||
|[休假详细信息编辑视图](app/view/resource_calendar_leaves_edit_view)|resource_calendar_leaves_edit_view|休假详细信息|实体编辑视图|系统自动添加|
|[休假详细信息表格视图](app/view/resource_calendar_leaves_grid_view)|resource_calendar_leaves_grid_view|休假详细信息|实体表格视图||
|[休假详细信息](app/view/resource_calendar_leaves_option_view)|resource_calendar_leaves_option_view|休假详细信息|实体选项操作视图||
|[人员范围选择](app/view/user_object_dept_limit_m_pickup_view)|user_object_dept_limit_m_pickup_view|选择部门|实体数据多项选择视图||
|[部门管理](app/view/user_object_dept_manage_grid_view)|user_object_dept_manage_grid_view|部门管理|实体表格视图||
|[部门选择树](app/view/user_object_dept_pickup_tree_view)|user_object_dept_pickup_tree_view|部门选择树|实体选择树视图（部件视图）||
|[用户对象映射编辑视图](app/view/user_object_edit_view)|user_object_edit_view|用户对象映射|实体编辑视图||
|[用户对象映射数据多项选择视图](app/view/user_object_m_pickup_view)|user_object_m_pickup_view|选择部门与人员|实体数据多项选择视图||
|[用户对象映射选择表格视图](app/view/user_object_pickup_grid_view)|user_object_pickup_grid_view|用户对象映射|实体选择表格视图（部件视图）||
|[人员选择树](app/view/user_object_pickup_tree_view)|user_object_pickup_tree_view|人员选择树|实体选择树视图（部件视图）||
|[人员范围选择](app/view/user_object_preson_limit_m_pickup_view)|user_object_preson_limit_m_pickup_view|选择部门和人员|实体数据多项选择视图||
|[考勤规则成员](app/view/user_object_tab_exp_view)|user_object_tab_exp_view|考勤规则成员|实体分页导航视图||
|[员工管理](app/view/user_object_user_manage_grid_view)|user_object_user_manage_grid_view|员工管理|实体表格视图||

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    },
    methods: {
      itemClick(url) {
        location.href = url
      }
    }
  }).use(ElementPlus).mount('#app')
</script>