# ehrapp(ehrapp)  <!-- {docsify-ignore-all} -->

## 菜单

<el-row>
  <el-menu :ellipsis="false" class="el-menu-demo" mode="horizontal" @select="handleSelect">
    <el-sub-menu index="menuitem5">
      <template #title>基础管理</template>
    <el-menu-item index="menuitem7" @click="itemClick('#/app/view/res_companymulti_data_view')"><i class="fa fa-university"></i>机构管理</el-menu-item>
    <el-menu-item index="menuitem3" @click="itemClick('#/app/view/hr_departmentmulti_data_view')"><i class="fa fa-trello"></i>部门</el-menu-item>
    <el-menu-item index="menuitem2" @click="itemClick('#/app/view/hr_employeemulti_data_view')"><i class="fa fa-user"></i>员工</el-menu-item>
    </el-sub-menu>
    <el-menu-item index="attandence" disabled>假勤管理</el-menu-item>
    <el-menu-item index="recruit" disabled>招聘管理</el-menu-item>
    <el-menu-item index="menuitem6" disabled>人事管理</el-menu-item>
    <el-menu-item index="menuitem8" disabled><i class="fa fa-money"></i>薪资管理</el-menu-item>
    <el-menu-item index="menuitem9" disabled>绩效管理</el-menu-item>
    <el-sub-menu index="menuitem4">
      <template #title>系统设置</template>
    <el-menu-item index="menuitem10" @click="itemClick('#/app/view/res_usersmulti_data_view')"><i class="fa fa-user"></i>用户</el-menu-item>
    <el-menu-item index="menuitem11" @click="itemClick('#/app/view/res_groupsmulti_data_view')"><i class="fa fa-group"></i>群组</el-menu-item>
    <el-menu-item index="menuitem1" @click="itemClick('#/app/view/PSCorePrdFuncTreeExpView')"><i class="fa fa-th-large"></i>应用市场</el-menu-item>
    </el-sub-menu>
  </el-menu>
</el-row>


## 视图清单

|  中文名     |   代码名  |  视图标题 | 视图类型   |   备注  |
|  --------   |------------| -----------|  -----   |  -----   |
|[iBizEHR 人力资源](app/view/AppIndexView)|AppIndexView|iBizEHR 人力资源|应用首页视图||
|[核心产品功能编辑视图](app/view/PSCorePrdFuncInfoView)|PSCorePrdFuncInfoView|核心产品功能|实体编辑视图|系统自动添加|
|[已安装应用](app/view/PSCorePrdFuncInstalledGridView)|PSCorePrdFuncInstalledGridView|已安装应用|实体表格视图|系统自动添加|
|[应用市场](app/view/PSCorePrdFuncMarketApplicationView)|PSCorePrdFuncMarketApplicationView|应用市场|实体数据视图|系统自动添加|
|[应用管理](app/view/PSCorePrdFuncTreeExpView)|PSCorePrdFuncTreeExpView|应用市场|实体树导航视图||
|[组件扩展设置](app/view/PSCorePrdFuncsetting_edit_view)|PSCorePrdFuncsetting_edit_view|扩展设置|实体编辑视图|系统自动添加|
|[应用](app/view/PSCorePrdInfoView)|PSCorePrdInfoView|应用|实体编辑视图|系统自动添加|
|[应用市场](app/view/PSCorePrdMarketApplicationView)|PSCorePrdMarketApplicationView|核心产品|实体数据视图|系统自动添加|
|[部门选择表格视图](app/view/hr_departmentPickupGridView)|hr_departmentPickupGridView|部门|实体选择表格视图（部件视图）|系统自动添加|
|[部门数据选择视图](app/view/hr_departmentPickupView)|hr_departmentPickupView|部门|实体数据选择视图|系统自动添加|
|[组织架构](app/view/hr_departmentdepartment_hierarchy_view)|hr_departmentdepartment_hierarchy_view|组织架构|实体树视图|系统自动添加|
|[部门](app/view/hr_departmentmain_view)|hr_departmentmain_view|部门|实体编辑视图|系统自动添加|
|[部门](app/view/hr_departmentmulti_data_view)|hr_departmentmulti_data_view|部门|实体多数据自定义视图||
|[员工表格视图](app/view/hr_employeeGridView)|hr_employeeGridView|员工|实体表格视图|系统自动添加|
|[基本信息视图](app/view/hr_employeebase_info_view)|hr_employeebase_info_view|员工|实体编辑视图|系统自动添加|
|[员工编辑视图](app/view/hr_employeemain_view)|hr_employeemain_view|员工|实体编辑视图|系统自动添加|
|[员工](app/view/hr_employeemulti_data_view)|hr_employeemulti_data_view|员工|实体多数据自定义视图||
|[组织图表](app/view/hr_employeeorg_chart_view)|hr_employeeorg_chart_view|组织图表|实体树视图|系统自动添加|
|[工作岗位选择表格视图](app/view/hr_jobPickupGridView)|hr_jobPickupGridView|工作岗位|实体选择表格视图（部件视图）|系统自动添加|
|[工作岗位数据选择视图](app/view/hr_jobPickupView)|hr_jobPickupView|工作岗位|实体数据选择视图|系统自动添加|
|[工作岗位](app/view/hr_jobmain_view)|hr_jobmain_view|工作岗位|实体编辑视图|系统自动添加|
|[工作地点选择表格视图](app/view/hr_work_locationPickupGridView)|hr_work_locationPickupGridView|工作地点|实体选择表格视图（部件视图）|系统自动添加|
|[工作地点数据选择视图](app/view/hr_work_locationPickupView)|hr_work_locationPickupView|工作地点|实体数据选择视图|系统自动添加|
|[工作地点](app/view/hr_work_locationmain_view)|hr_work_locationmain_view|工作地点|实体编辑视图|系统自动添加|
|[模型访问编辑视图](app/view/ir_model_accessEditView)|ir_model_accessEditView|模型访问|实体编辑视图|系统自动添加|
|[模型访问表格视图](app/view/ir_model_accessGridView)|ir_model_accessGridView|模型访问|实体表格视图|系统自动添加|
|[模型访问](app/view/ir_model_accessmulti_data_view)|ir_model_accessmulti_data_view|模型访问|实体多数据自定义视图|系统自动添加|
|[应用编辑视图](app/view/ir_module_categoryEditView)|ir_module_categoryEditView|应用|实体编辑视图|系统自动添加|
|[应用选择表格视图](app/view/ir_module_categoryPickupGridView)|ir_module_categoryPickupGridView|应用|实体选择表格视图（部件视图）|系统自动添加|
|[应用数据选择视图](app/view/ir_module_categoryPickupView)|ir_module_categoryPickupView|应用|实体数据选择视图|系统自动添加|
|[规则选择表格视图](app/view/ir_rulePickupGridView)|ir_rulePickupGridView|规则|实体选择表格视图（部件视图）|系统自动添加|
|[规则数据选择视图](app/view/ir_rulePickupView)|ir_rulePickupView|规则|实体数据选择视图|系统自动添加|
|[规则](app/view/ir_rulemain_view)|ir_rulemain_view|规则|实体编辑视图|系统自动添加|
|[规则](app/view/ir_rulemulti_data_view)|ir_rulemulti_data_view|规则|实体多数据自定义视图|系统自动添加|
|[活动计划模板](app/view/mail_activity_plan_templateGridView)|mail_activity_plan_templateGridView|待创建的活动|实体表格视图|系统自动添加|
|[活动计划模板](app/view/mail_activity_plan_templatequick_create_view)|mail_activity_plan_templatequick_create_view|活动计划模板|实体选项操作视图|系统自动添加|
|[活动计划](app/view/mail_activity_planmain_view)|mail_activity_planmain_view|员工计划|实体编辑视图|系统自动添加|
|[活动计划](app/view/mail_activity_planmulti_data_view)|mail_activity_planmulti_data_view|员工计划|实体多数据自定义视图|系统自动添加|
|[活动日程计划向导](app/view/mail_activity_schedulequick_create_view)|mail_activity_schedulequick_create_view|安排活动|实体编辑视图|系统自动添加|
|[活动类型选择表格视图](app/view/mail_activity_typePickupGridView)|mail_activity_typePickupGridView|活动类型|实体选择表格视图（部件视图）|系统自动添加|
|[活动类型数据选择视图](app/view/mail_activity_typePickupView)|mail_activity_typePickupView|活动类型|实体数据选择视图|系统自动添加|
|[员工安排活动](app/view/mail_activityemp_schedule_act_list_view)|mail_activityemp_schedule_act_list_view|活动|实体列表视图|系统自动添加|
|[标记完成](app/view/mail_activityfeedback_view)|mail_activityfeedback_view|标记完成|实体编辑视图|系统自动添加|
|[安排活动](app/view/mail_activityquick_cfg_view)|mail_activityquick_cfg_view|安排活动|实体编辑视图|系统自动添加|
|[邮件会话](app/view/mail_thread_component_view)|mail_thread_component_view|邮件会话|实体自定义视图|系统自动添加|
|[公司选择表格视图](app/view/res_companyPickupGridView)|res_companyPickupGridView|公司|实体选择表格视图（部件视图）|系统自动添加|
|[公司数据选择视图](app/view/res_companyPickupView)|res_companyPickupView|公司|实体数据选择视图|系统自动添加|
|[公司](app/view/res_companyedit_view)|res_companyedit_view|打开公司|实体选项操作视图|系统自动添加|
|[公司](app/view/res_companymain_view)|res_companymain_view|公司|实体编辑视图|系统自动添加|
|[公司](app/view/res_companymulti_data_view)|res_companymulti_data_view|公司|实体多数据自定义视图||
|[国家/地区选择表格视图](app/view/res_countryPickupGridView)|res_countryPickupGridView|国家/地区|实体选择表格视图（部件视图）|系统自动添加|
|[国家/地区数据选择视图](app/view/res_countryPickupView)|res_countryPickupView|国家/地区|实体数据选择视图|系统自动添加|
|[币别选择表格视图](app/view/res_currencyPickupGridView)|res_currencyPickupGridView|币别|实体选择表格视图（部件视图）|系统自动添加|
|[币别数据选择视图](app/view/res_currencyPickupView)|res_currencyPickupView|币别|实体数据选择视图|系统自动添加|
|[权限组选择表格视图](app/view/res_groupsPickupGridView)|res_groupsPickupGridView|权限组|实体选择表格视图（部件视图）|系统自动添加|
|[权限组数据选择视图](app/view/res_groupsPickupView)|res_groupsPickupView|权限组|实体数据选择视图|系统自动添加|
|[权限组继承编辑视图](app/view/res_groups_implied_relEditView)|res_groups_implied_relEditView|权限组继承|实体编辑视图|系统自动添加|
|[权限组继承表格视图](app/view/res_groups_implied_relGridView)|res_groups_implied_relGridView|权限组继承|实体表格视图|系统自动添加|
|[权限组成员编辑视图](app/view/res_groups_users_relEditView)|res_groups_users_relEditView|权限组成员|实体编辑视图|系统自动添加|
|[权限组成员表格视图](app/view/res_groups_users_relGridView)|res_groups_users_relGridView|权限组成员|实体表格视图|系统自动添加|
|[用户权限组管理](app/view/res_groups_users_reluser_group_mgr_view)|res_groups_users_reluser_group_mgr_view|权限组成员|实体表格视图|系统自动添加|
|[权限组信息](app/view/res_groupsmain_view)|res_groupsmain_view|群组|实体编辑视图|系统自动添加|
|[群组](app/view/res_groupsmulti_data_view)|res_groupsmulti_data_view|群组|实体多数据自定义视图||
|[群组](app/view/res_groupsmulti_data_view_user)|res_groupsmulti_data_view_user|用户所属群组|实体多数据自定义视图|系统自动添加|
|[联系人选择表格视图](app/view/res_partnerPickupGridView)|res_partnerPickupGridView|联系人|实体选择表格视图（部件视图）|系统自动添加|
|[联系人数据选择视图](app/view/res_partnerPickupView)|res_partnerPickupView|联系人|实体数据选择视图|系统自动添加|
|[联系人](app/view/res_partnermain_view)|res_partnermain_view|联系人|实体编辑视图|系统自动添加|
|[用户选择表格视图](app/view/res_usersPickupGridView)|res_usersPickupGridView|用户|实体选择表格视图（部件视图）|系统自动添加|
|[用户数据选择视图](app/view/res_usersPickupView)|res_usersPickupView|用户|实体数据选择视图|系统自动添加|
|[用户信息自定义视图](app/view/res_users_info_custom_view)|res_users_info_custom_view|用户信息自定义视图|实体自定义视图||
|[帐号设置](app/view/res_userschg_pwd_view)|res_userschg_pwd_view|修改密码|实体编辑视图|系统自动添加|
|[创建用户](app/view/res_userscreate_user_view)|res_userscreate_user_view|创建用户|实体选项操作视图|系统自动添加|
|[打开用户](app/view/res_usersedit_view)|res_usersedit_view|打开用户|实体选项操作视图|系统自动添加|
|[基本信息](app/view/res_usersinfo_view)|res_usersinfo_view|基本信息|实体编辑视图|系统自动添加|
|[用户信息](app/view/res_usersmain_view)|res_usersmain_view|用户|实体编辑视图|系统自动添加|
|[用户](app/view/res_usersmulti_data_view)|res_usersmulti_data_view|用户|实体多数据自定义视图||
|[用户信息](app/view/res_userspersonal_view)|res_userspersonal_view|用户|实体编辑视图|系统自动添加|
|[资源工作时间选择表格视图](app/view/resource_calendarPickupGridView)|resource_calendarPickupGridView|资源工作时间|实体选择表格视图（部件视图）|系统自动添加|
|[资源工作时间数据选择视图](app/view/resource_calendarPickupView)|resource_calendarPickupView|资源工作时间|实体数据选择视图|系统自动添加|
|[工作细节编辑视图](app/view/resource_calendar_attendanceEditView)|resource_calendar_attendanceEditView|工作细节|实体编辑视图|系统自动添加|
|[工作细节](app/view/resource_calendar_attendancegrid_view_nested)|resource_calendar_attendancegrid_view_nested|工作细节|实体表格视图|系统自动添加|
|[资源工作时间](app/view/resource_calendarmain_view)|resource_calendarmain_view|工作时间表|实体编辑视图|系统自动添加|
|[资源编辑视图](app/view/resource_resourcemain_view)|resource_resourcemain_view|资源|实体编辑视图|系统自动添加|
|[资源](app/view/resource_resourcemulti_data_view)|resource_resourcemulti_data_view|资源|实体多数据自定义视图|系统自动添加|
|[权限组关联规则编辑视图](app/view/rule_group_relEditView)|rule_group_relEditView|权限组关联规则|实体编辑视图|系统自动添加|
|[权限组关联规则表格视图](app/view/rule_group_relnested_group_grid_view)|rule_group_relnested_group_grid_view|权限组关联规则|实体表格视图|系统自动添加|
|[权限组关联规则表格视图](app/view/rule_group_relnested_rule_grid_view)|rule_group_relnested_rule_grid_view|权限组关联规则|实体表格视图|系统自动添加|
|[权限组关联统一资源编辑视图](app/view/unires_group_relEditView)|unires_group_relEditView|权限组关联统一资源|实体编辑视图|系统自动添加|
|[权限组关联统一资源](app/view/unires_group_relnested_group_grid_view)|unires_group_relnested_group_grid_view|权限组关联统一资源|实体表格视图|系统自动添加|

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