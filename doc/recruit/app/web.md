# recruitapp(web)  <!-- {docsify-ignore-all} -->

## 菜单

<el-row>
  <el-menu :ellipsis="false" class="el-menu-demo" mode="horizontal" @select="handleSelect">
    <el-menu-item index="menuitem9" @click="itemClick('#/app/view/workspace_over_view')"><i class="fa fa-home"></i>工作台</el-menu-item>
    <el-menu-item index="menuitem1" @click="itemClick('#/app/view/hr_applicant_list_view')"><i class="fa fa-user"></i>候选人管理</el-menu-item>
    <el-menu-item index="menuitem3" @click="itemClick('#/app/view/hr_interview_interview_list_tab_exp_view')"><i class="fa fa-archive"></i>面试安排</el-menu-item>
    <el-menu-item index="menuitem2" @click="itemClick('#/app/view/hr_idea_tab_job_requirments')"><i class="fa fa-book"></i>职位管理</el-menu-item>
    <el-menu-item index="menuitem11" @click="itemClick('#/app/view/hr_candidate_talentpool_management_view')"><i class="fa fa-users"></i>人才库</el-menu-item>
    <el-menu-item index="menuitem12" @click="itemClick('#/app/view/report_all_report_grid_view')"><i class="fa fa-tachometer"></i>报表中心</el-menu-item>
    <el-sub-menu index="menuitem5">
      <template #title>用人经理</template>
    <el-menu-item index="menuitem6" @click="itemClick('#/app/view/workspace_manager_index_view')"><i class="fa fa-home"></i>工作台</el-menu-item>
    <el-menu-item index="menuitem7" @click="itemClick('#/app/view/hr_candidate_filter_detail_manager_filter_grid_view')"><i class="fa fa-filter"></i>简历筛选</el-menu-item>
    <el-menu-item index="menuitem8" @click="itemClick('#/app/view/hr_interview_feedback_my_interview_list')"><i class="fa fa-archive"></i>我的面试</el-menu-item>
    <el-menu-item index="menuitem13" @click="itemClick('#/app/view/hr_exam_hm_grid_view')"><i class="fa fa-pencil"></i>考试/评测</el-menu-item>
    <el-menu-item index="menuitem14" @click="itemClick('#/app/view/hr_offer_approval_hm_grid_view')"><i class="fa fa-legal"></i>Offer审批</el-menu-item>
    <el-menu-item index="menuitem15" disabled><i class="fa fa-laptop"></i>招聘进展</el-menu-item>
    </el-sub-menu>
    <el-menu-item index="menuitem10" @click="itemClick('#/app/view/system_setting_tree_exp_view')"><i class="fa fa-cog"></i>系统设置</el-menu-item>
    <el-menu-item index="menuitem4" @click="itemClick('#/app/view/ps_core_prd_func_tree_exp_view')"><i class="fa fa-joomla"></i>应用管理</el-menu-item>
    <el-menu-item index="menuitem16" @click="itemClick('#/app/view/internal_message_grid_view')">消息通知</el-menu-item>
    <el-sub-menu index="menuitem17">
      <template #title>系统设置（临时）</template>
    <el-menu-item index="menuitem20" @click="itemClick('#/app/view/res_company_grid_view')">组织管理</el-menu-item>
    <el-menu-item index="menuitem19" @click="itemClick('#/app/view/hr_department_grid_view')">部门管理</el-menu-item>
    <el-menu-item index="menuitem18" @click="itemClick('#/app/view/hr_employee_grid_view')">人员管理</el-menu-item>
    <el-menu-item index="menuitem21" @click="itemClick('#/app/view/hr_work_location_grid_view')">工作地点</el-menu-item>
    <el-menu-item index="menuitem22" @click="itemClick('#/app/view/hr_job_test_grid_view')">测试岗位</el-menu-item>
    </el-sub-menu>
  </el-menu>
</el-row>


## 视图清单

|  中文名     |   代码名  |  视图标题 | 视图类型   |   备注  |
|  --------   |------------| -----------|  -----   |  -----   |
|[iBizEHR 招聘管理](app/view/app_index_view)|app_index_view|iBizEHR 招聘管理|应用首页视图||
|[评论列表视图](app/view/comment_list_info_view)|comment_list_info_view|评论|实体列表视图|系统自动添加|
|[评论列表视图](app/view/comment_list_view)|comment_list_view|评论|实体列表视图|系统自动添加|
|[用人经理](app/view/hmindex)|hmindex|用人经理|应用首页视图||
|[候选人申请_附加信息](app/view/hr_applicant_add_info_view)|hr_applicant_add_info_view|候选人申请|实体编辑视图||
|[候选人申请_基本信息页](app/view/hr_applicant_baseinfo_view)|hr_applicant_baseinfo_view|候选人申请|实体编辑视图||
|[候选人申请_新建](app/view/hr_applicant_create_view)|hr_applicant_create_view|候选人申请|实体编辑视图||
|[候选人申请编辑视图](app/view/hr_applicant_edit_view)|hr_applicant_edit_view|候选人申请|实体编辑视图||
|[候选人申请表格视图](app/view/hr_applicant_grid_view)|hr_applicant_grid_view|候选人申请|实体表格视图||
|[候选人基本信息](app/view/hr_applicant_interview_candidate_base_edit_view)|hr_applicant_interview_candidate_base_edit_view|候选人申请与面试关系|实体编辑视图||
|[候选人申请与面试关系编辑视图](app/view/hr_applicant_interview_edit_view)|hr_applicant_interview_edit_view|候选人申请与面试关系|实体编辑视图||
|[面试安排日历视图](app/view/hr_applicant_interview_main_calendar_view)|hr_applicant_interview_main_calendar_view|面试安排日历视图|实体日历视图||
|[我的面试详情](app/view/hr_applicant_interview_my_interview_calendar_view)|hr_applicant_interview_my_interview_calendar_view|我的面试详情|实体日历视图||
|[我的面试](app/view/hr_applicant_interview_my_interview_edit_view)|hr_applicant_interview_my_interview_edit_view|我的面试|实体编辑视图||
|[我的面试](app/view/hr_applicant_interview_my_interview_grid_view)|hr_applicant_interview_my_interview_grid_view|我的面试|实体表格视图||
|[候选人申请与面试关系数据重定向视图](app/view/hr_applicant_interview_redirect_view)|hr_applicant_interview_redirect_view|候选人申请与面试关系|实体数据重定向视图|系统自动添加|
|[候选人申请_备注](app/view/hr_applicant_interview_view)|hr_applicant_interview_view|候选人申请|实体编辑视图||
|[候选人申请_列表](app/view/hr_applicant_list_view)|hr_applicant_list_view|候选人管理|实体列表视图||
|[候选人申请_操作记录](app/view/hr_applicant_log_view)|hr_applicant_log_view|候选人申请|实体编辑视图||
|[我关注的](app/view/hr_applicant_my_favorite_list_view)|hr_applicant_my_favorite_list_view|我关注的|实体列表视图||
|[候选人申请选择表格视图](app/view/hr_applicant_pickup_grid_view)|hr_applicant_pickup_grid_view|候选人申请|实体选择表格视图（部件视图）|系统自动添加|
|[候选人申请数据选择视图](app/view/hr_applicant_pickup_view)|hr_applicant_pickup_view|候选人申请|实体数据选择视图|系统自动添加|
|[推荐到其它职位](app/view/hr_applicant_recommend_other_view)|hr_applicant_recommend_other_view|推荐到其他职位|实体选项操作视图||
|[候选人申请数据重定向视图](app/view/hr_applicant_redirect_view)|hr_applicant_redirect_view|候选人申请|实体数据重定向视图|系统自动添加|
|[招聘官网职位申请](app/view/hr_applicant_website_apply_view)|hr_applicant_website_apply_view|候选人申请|实体编辑视图||
|[放入人才库](app/view/hr_candidate_add_talentpool_view)|hr_candidate_add_talentpool_view|放入人才库|实体选项操作视图||
|[候选人_基本信息](app/view/hr_candidate_base_info_view)|hr_candidate_base_info_view|候选人|实体编辑视图||
|[候选人编辑视图](app/view/hr_candidate_edit_view)|hr_candidate_edit_view|候选人|实体编辑视图||
|[筛选候选人明细编辑视图](app/view/hr_candidate_filter_detail_edit_view)|hr_candidate_filter_detail_edit_view|筛选候选人明细|实体编辑视图|系统自动添加|
|[用人经理_筛选明细_操作视图](app/view/hr_candidate_filter_detail_filter_edit_view)|hr_candidate_filter_detail_filter_edit_view|简历筛选操作|实体选项操作视图||
|[筛选列表视图](app/view/hr_candidate_filter_detail_filter_list_view)|hr_candidate_filter_detail_filter_list_view|筛选候选人明细|实体列表视图||
|[筛选_意见_列表](app/view/hr_candidate_filter_detail_filtered_opinion_list)|hr_candidate_filter_detail_filtered_opinion_list|筛选候选人明细|实体列表视图||
|[用人经理评价视图](app/view/hr_candidate_filter_detail_manager_evaluate_view)|hr_candidate_filter_detail_manager_evaluate_view|筛选候选人明细|实体编辑视图||
|[用人经理筛选表格视图](app/view/hr_candidate_filter_detail_manager_filter_grid_view)|hr_candidate_filter_detail_manager_filter_grid_view|筛选候选人明细|实体表格视图||
|[我的筛选](app/view/hr_candidate_filter_detail_my_filter_list_view)|hr_candidate_filter_detail_my_filter_list_view|我的筛选|实体列表视图||
|[筛选候选人明细数据重定向视图](app/view/hr_candidate_filter_detail_redirect_view)|hr_candidate_filter_detail_redirect_view|筛选候选人明细|实体数据重定向视图|系统自动添加|
|[推荐给用人部门](app/view/hr_candidate_filter_recommend_department_option_view)|hr_candidate_filter_recommend_department_option_view|筛选候选人|实体选项操作视图||
|[快速_新建_标签](app/view/hr_candidate_label_quick_create_tag)|hr_candidate_label_quick_create_tag|候选人标签|实体编辑视图|系统自动添加|
|[候选人选择表格视图](app/view/hr_candidate_pickup_grid_view)|hr_candidate_pickup_grid_view|候选人|实体选择表格视图（部件视图）|系统自动添加|
|[候选人数据选择视图](app/view/hr_candidate_pickup_view)|hr_candidate_pickup_view|候选人|实体数据选择视图|系统自动添加|
|[人才库列表](app/view/hr_candidate_talent_pool_list)|hr_candidate_talent_pool_list|候选人|实体列表视图||
|[人才库列表视图](app/view/hr_candidate_talentpool_list_view)|hr_candidate_talentpool_list_view|候选人|实体列表视图||
|[人才库](app/view/hr_candidate_talentpool_management_view)|hr_candidate_talentpool_management_view|人才库|实体分页导航视图||
|[部门编辑视图](app/view/hr_department_edit_view)|hr_department_edit_view|部门|实体编辑视图|系统自动添加|
|[部门表格视图](app/view/hr_department_grid_view)|hr_department_grid_view|部门|实体表格视图||
|[部门选择表格视图](app/view/hr_department_pickup_grid_view)|hr_department_pickup_grid_view|部门|实体选择表格视图（部件视图）|系统自动添加|
|[部门数据选择视图](app/view/hr_department_pickup_view)|hr_department_pickup_view|部门|实体数据选择视图|系统自动添加|
|[员工编辑视图](app/view/hr_employee_edit_view)|hr_employee_edit_view|员工|实体编辑视图|系统自动添加|
|[员工表格视图](app/view/hr_employee_grid_view)|hr_employee_grid_view|员工|实体表格视图||
|[员工选择表格视图](app/view/hr_employee_pickup_grid_view)|hr_employee_pickup_grid_view|员工|实体选择表格视图（部件视图）|系统自动添加|
|[员工数据选择视图](app/view/hr_employee_pickup_view)|hr_employee_pickup_view|员工|实体数据选择视图|系统自动添加|
|[候选人基本信息](app/view/hr_exam_candidate_base_edit_view)|hr_exam_candidate_base_edit_view|考试/测评|实体编辑视图||
|[考试/测评编辑视图](app/view/hr_exam_edit_view)|hr_exam_edit_view|考试/测评|实体编辑视图||
|[考试/评测](app/view/hr_exam_hm_grid_view)|hr_exam_hm_grid_view|考试/评测|实体表格视图||
|[考试/评测详情](app/view/hr_exam_hr_edit_view)|hr_exam_hr_edit_view|考试/评测详情|实体编辑视图||
|[考试/评测](app/view/hr_exam_list_view)|hr_exam_list_view|考试/评测|实体列表视图||
|[我的考试/测评](app/view/hr_exam_my_exam_list_view)|hr_exam_my_exam_list_view|我的考试/测评|实体列表视图||
|[添加考试/评测](app/view/hr_exam_option_view)|hr_exam_option_view|添加考试/评测|实体选项操作视图||
|[添加考试/评测](app/view/hr_exam_quick_create_view)|hr_exam_quick_create_view|添加考试/评测|实体选项操作视图||
|[招聘需求新建视图](app/view/hr_idea_create_view)|hr_idea_create_view|招聘需求新建|实体编辑视图||
|[招聘需求编辑视图](app/view/hr_idea_edit_view)|hr_idea_edit_view|招聘需求|实体编辑视图|系统自动添加|
|[招聘需求](app/view/hr_idea_grid_view)|hr_idea_grid_view|招聘需求|实体表格视图||
|[招聘需求数据](app/view/hr_idea_info_view)|hr_idea_info_view|招聘需求数据|实体分页导航视图||
|[需求与职位关系编辑视图](app/view/hr_idea_job_edit_view)|hr_idea_job_edit_view|需求与职位关系|实体编辑视图||
|[需求与职位关系表格视图](app/view/hr_idea_job_grid_view)|hr_idea_job_grid_view|需求与职位关系|实体表格视图||
|[关联职位](app/view/hr_idea_job_idea_job_relation)|hr_idea_job_idea_job_relation|添加关联职位|实体编辑视图||
|[招聘需求选择表格视图](app/view/hr_idea_pickup_grid_view)|hr_idea_pickup_grid_view|招聘需求|实体选择表格视图（部件视图）|系统自动添加|
|[招聘需求数据选择视图](app/view/hr_idea_pickup_view)|hr_idea_pickup_view|招聘需求|实体数据选择视图|系统自动添加|
|[招聘需求数据重定向视图](app/view/hr_idea_redirect_view)|hr_idea_redirect_view|招聘需求|实体数据重定向视图|系统自动添加|
|[招聘需求表格](app/view/hr_idea_requirement_gridview)|hr_idea_requirement_gridview|招聘需求|实体表格视图||
|[分页_职务_招聘需求](app/view/hr_idea_tab_job_requirments)|hr_idea_tab_job_requirments|职位管理|实体分页导航视图||
|[今天之后的面试](app/view/hr_interview_after_grid_view)|hr_interview_after_grid_view|面试|实体表格视图||
|[今天之前的面试](app/view/hr_interview_before_grid_view)|hr_interview_before_grid_view|面试|实体表格视图||
|[今天的面试](app/view/hr_interview_current_grid_view)|hr_interview_current_grid_view|面试|实体表格视图||
|[面试安排编辑视图](app/view/hr_interview_edit_view)|hr_interview_edit_view|面试|实体编辑视图|系统自动添加|
|[面试反馈编辑视图](app/view/hr_interview_feedback_edit_view)|hr_interview_feedback_edit_view|面试反馈|实体编辑视图|系统自动添加|
|[面试反馈表格视图](app/view/hr_interview_feedback_grid_view)|hr_interview_feedback_grid_view|面试反馈|实体表格视图|系统自动添加|
|[面试安排](app/view/hr_interview_feedback_interview_list_calendar_view)|hr_interview_feedback_interview_list_calendar_view|面试安排|实体日历视图||
|[面试安排](app/view/hr_interview_feedback_interview_list_grid_view)|hr_interview_feedback_interview_list_grid_view|面试安排|实体表格视图||
|[面试安排](app/view/hr_interview_feedback_interview_list_tab_exp_view)|hr_interview_feedback_interview_list_tab_exp_view|面试安排|实体分页导航视图||
|[面试结果](app/view/hr_interview_feedback_interview_result_option_view)|hr_interview_feedback_interview_result_option_view|面试结果|实体选项操作视图||
|[我的面试反馈](app/view/hr_interview_feedback_my_feedback_list_view)|hr_interview_feedback_my_feedback_list_view|我的面试反馈|实体列表视图||
|[我的面试](app/view/hr_interview_feedback_my_interview_detail)|hr_interview_feedback_my_interview_detail|面试反馈|实体编辑视图||
|[候选人基本信息](app/view/hr_interview_feedback_my_interview_detail_base)|hr_interview_feedback_my_interview_detail_base|面试反馈|实体编辑视图||
|[我的面试](app/view/hr_interview_feedback_my_interview_list)|hr_interview_feedback_my_interview_list|我的面试|实体表格视图||
|[我通过的面试](app/view/hr_interview_feedback_my_pass_edit_view)|hr_interview_feedback_my_pass_edit_view|面试反馈|实体编辑视图||
|[我通过的](app/view/hr_interview_feedback_my_pass_list_view)|hr_interview_feedback_my_pass_list_view|我通过的|实体列表视图||
|[面试反馈数据重定向视图](app/view/hr_interview_feedback_redirect_view)|hr_interview_feedback_redirect_view|面试反馈|实体数据重定向视图|系统自动添加|
|[我的面试](app/view/hr_interview_feedback_work_bench_my_interview)|hr_interview_feedback_work_bench_my_interview|我的面试|实体数据视图||
|[面试安排表格视图](app/view/hr_interview_grid_view)|hr_interview_grid_view|面试|实体表格视图||
|[面试安排](app/view/hr_interview_interview_list_calendar_view)|hr_interview_interview_list_calendar_view|面试安排|实体日历视图||
|[面试安排](app/view/hr_interview_interview_list_grid_view)|hr_interview_interview_list_grid_view|面试安排|实体表格视图||
|[面试安排](app/view/hr_interview_interview_list_tab_exp_view)|hr_interview_interview_list_tab_exp_view|面试安排|实体分页导航视图||
|[面试安排](app/view/hr_interview_interview_list_tab_search_view)|hr_interview_interview_list_tab_search_view|面试|实体分页搜索视图||
|[面试安排列表](app/view/hr_interview_main_view)|hr_interview_main_view|面试安排列表|实体日历视图||
|[面试详情](app/view/hr_interview_myinterview_detail_calendar_view)|hr_interview_myinterview_detail_calendar_view|面试详情|实体日历视图||
|[我的面试表格数据](app/view/hr_interview_myinterview_grid)|hr_interview_myinterview_grid|面试|实体表格视图||
|[面试安排数据重定向视图](app/view/hr_interview_redirect_view)|hr_interview_redirect_view|面试|实体数据重定向视图|系统自动添加|
|[新建面试安排](app/view/hr_interview_schedule_create_option_view)|hr_interview_schedule_create_option_view|新建面试安排|实体选项操作视图||
|[面试官日程](app/view/hr_interview_schedule_interviewer_calendar_view)|hr_interview_schedule_interviewer_calendar_view|面试官日程|实体日历视图||
|[职位新建向导视图](app/view/hr_job_create_wizard_view)|hr_job_create_wizard_view|招聘职位|实体向导视图||
|[工作岗位编辑视图](app/view/hr_job_edit_view)|hr_job_edit_view|招聘职位|实体编辑视图|系统自动添加|
|[工作岗位表格视图](app/view/hr_job_grid_view)|hr_job_grid_view|招聘职位|实体表格视图||
|[职位新建向导视图](app/view/hr_job_idea_create_wizard_view)|hr_job_idea_create_wizard_view|招聘职位|实体向导视图|系统自动添加|
|[职位列表视图](app/view/hr_job_list_view)|hr_job_list_view|招聘职位|实体列表视图||
|[工作岗位选择表格视图](app/view/hr_job_pickup_grid_view)|hr_job_pickup_grid_view|招聘职位|实体选择表格视图（部件视图）|系统自动添加|
|[工作岗位数据选择视图](app/view/hr_job_pickup_view)|hr_job_pickup_view|招聘职位|实体数据选择视图|系统自动添加|
|[招聘平台账号编辑视图](app/view/hr_job_platform_account_edit_view)|hr_job_platform_account_edit_view|招聘平台账号|实体编辑视图|系统自动添加|
|[选择账号列表](app/view/hr_job_platform_account_list_data_view)|hr_job_platform_account_list_data_view|选择账号|实体数据视图||
|[招聘平台账号基础表格信息](app/view/hr_job_platform_account_platform_account_info)|hr_job_platform_account_platform_account_info|招聘平台账号基础表格信息|实体表格视图||
|[招聘平台账号数据重定向视图](app/view/hr_job_platform_account_redirect_view)|hr_job_platform_account_redirect_view|招聘平台账号|实体数据重定向视图|系统自动添加|
|[招聘网站管理](app/view/hr_job_platform_card_data_view)|hr_job_platform_card_data_view|招聘平台|实体数据视图||
|[招聘平台编辑视图](app/view/hr_job_platform_edit_view)|hr_job_platform_edit_view|招聘平台|实体编辑视图|系统自动添加|
|[基础信息表格](app/view/hr_job_platform_info_grid_view)|hr_job_platform_info_grid_view|基础信息表格|实体表格视图||
|[招聘平台选择表格视图](app/view/hr_job_platform_pickup_grid_view)|hr_job_platform_pickup_grid_view|招聘平台|实体选择表格视图（部件视图）|系统自动添加|
|[招聘平台数据选择视图](app/view/hr_job_platform_pickup_view)|hr_job_platform_pickup_view|招聘平台|实体数据选择视图|系统自动添加|
|[招聘平台列表视图](app/view/hr_job_platform_platform_list_view)|hr_job_platform_platform_list_view|招聘平台|实体列表视图||
|[招聘平台数据重定向视图](app/view/hr_job_platform_redirect_view)|hr_job_platform_redirect_view|招聘平台|实体数据重定向视图|系统自动添加|
|[工作岗位数据重定向视图](app/view/hr_job_redirect_view)|hr_job_redirect_view|招聘职位|实体数据重定向视图|系统自动添加|
|[内推官网](app/view/hr_job_referral_editview)|hr_job_referral_editview|招聘职位|实体编辑视图||
|[关联职位操作视图](app/view/hr_job_relation_option_view)|hr_job_relation_option_view|添加关联职位|实体选项操作视图||
|[职位查看分页导航视图](app/view/hr_job_tab_exp_view)|hr_job_tab_exp_view|招聘职位|实体分页导航视图||
|[分页_职位](app/view/hr_job_tab_job)|hr_job_tab_job|分页_职位|实体分页导航视图||
|[测试](app/view/hr_job_test_grid_view)|hr_job_test_grid_view|招聘职位|实体表格视图||
|[招聘官网职位申请](app/view/hr_job_website_apply_view)|hr_job_website_apply_view|招聘职位|实体编辑视图||
|[招聘官网职位视图](app/view/hr_job_website_job_view)|hr_job_website_job_view|招聘职位|实体编辑视图||
|[offer审核编辑视图](app/view/hr_offer_approval_edit_view)|hr_offer_approval_edit_view|offer审核|实体编辑视图|系统自动添加|
|[Offer审核详情](app/view/hr_offer_approval_hm_edit_view)|hr_offer_approval_hm_edit_view|Offer审核详情|实体编辑视图||
|[Offer审核](app/view/hr_offer_approval_hm_grid_view)|hr_offer_approval_hm_grid_view|Offer审核|实体表格视图||
|[offer审核操作](app/view/hr_offer_approval_option_view)|hr_offer_approval_option_view|offer审核操作|实体选项操作视图||
|[offer审核数据重定向视图](app/view/hr_offer_approval_redirect_view)|hr_offer_approval_redirect_view|offer审核|实体数据重定向视图|系统自动添加|
|[Offer/录用](app/view/hr_offer_detail_view)|hr_offer_detail_view|Offer/录用|实体编辑视图||
|[发送Offer](app/view/hr_offer_history_option_view)|hr_offer_history_option_view|发送Offer|实体选项操作视图||
|[导入第三方系统](app/view/hr_offer_imp_view)|hr_offer_imp_view|导入OA|实体自定义视图||
|[offer/录用](app/view/hr_offer_main_view)|hr_offer_main_view|offer/录用|实体自定义视图||
|[offer详情](app/view/hr_offer_quick_create_view)|hr_offer_quick_create_view|offer详情|实体编辑视图||
|[招聘流程编辑视图](app/view/hr_recruitment_progress_edit_view)|hr_recruitment_progress_edit_view|招聘流程|实体编辑视图|系统自动添加|
|[招聘流程设置](app/view/hr_recruitment_progress_grid_view)|hr_recruitment_progress_grid_view|招聘流程设置|实体表格视图||
|[建立招聘流程](app/view/hr_recruitment_progress_quick_create_view)|hr_recruitment_progress_quick_create_view|建立招聘流程|实体选项操作视图||
|[招聘流程数据重定向视图](app/view/hr_recruitment_progress_redirect_view)|hr_recruitment_progress_redirect_view|招聘流程|实体数据重定向视图|系统自动添加|
|[ 招聘阶段编辑视图](app/view/hr_recruitment_stage_edit_view)|hr_recruitment_stage_edit_view| 招聘阶段|实体编辑视图|系统自动添加|
|[招聘阶段设置](app/view/hr_recruitment_stage_grid_view)|hr_recruitment_stage_grid_view|招聘阶段设置|实体表格视图||
|[建立招聘阶段](app/view/hr_recruitment_stage_quick_create_view)|hr_recruitment_stage_quick_create_view|建立招聘阶段|实体选项操作视图||
|[ 招聘阶段数据重定向视图](app/view/hr_recruitment_stage_redirect_view)|hr_recruitment_stage_redirect_view| 招聘阶段|实体数据重定向视图|系统自动添加|
|[人才库编辑视图](app/view/hr_talent_pool_edit_view)|hr_talent_pool_edit_view|人才库|实体编辑视图|系统自动添加|
|[人才库表格视图](app/view/hr_talent_pool_grid_view)|hr_talent_pool_grid_view|人才库|实体表格视图||
|[工作地点编辑视图](app/view/hr_work_location_edit_view)|hr_work_location_edit_view|工作地点|实体编辑视图|系统自动添加|
|[工作地点表格视图](app/view/hr_work_location_grid_view)|hr_work_location_grid_view|工作地点|实体表格视图||
|[消息通知编辑视图](app/view/internal_message_edit_view)|internal_message_edit_view|消息通知|实体编辑视图|系统自动添加|
|[消息通知表格视图](app/view/internal_message_grid_view)|internal_message_grid_view|消息通知|实体表格视图||
|[招聘](app/view/odoo_index)|odoo_index|招聘|应用首页视图||
|[核心产品功能编辑视图](app/view/ps_core_prd_func_edit_view)|ps_core_prd_func_edit_view|核心产品功能|实体编辑视图|系统自动添加|
|[已安装应用](app/view/ps_core_prd_func_installed_grid_view)|ps_core_prd_func_installed_grid_view|核心产品功能|实体表格视图|系统自动添加|
|[应用市场](app/view/ps_core_prd_func_market_application_view)|ps_core_prd_func_market_application_view|核心产品功能|实体数据视图|系统自动添加|
|[核心产品功能数据重定向视图](app/view/ps_core_prd_func_redirect_view)|ps_core_prd_func_redirect_view|核心产品功能|实体数据重定向视图|系统自动添加|
|[应用管理](app/view/ps_core_prd_func_tree_exp_view)|ps_core_prd_func_tree_exp_view|核心产品功能|实体树导航视图||
|[主状态处理逻辑节点连接(设计)](app/view/psde_logic_link_design_edit_view_ms)|psde_logic_link_design_edit_view_ms|主状态处理逻辑节点连接(设计)|实体编辑视图|系统自动添加|
|[主状态逻辑节点(设计)](app/view/psde_logic_node_design_view_ms_node2)|psde_logic_node_design_view_ms_node2|主状态逻辑节点(设计)|实体编辑视图|系统自动添加|
|[快速建立主状态节点处理](app/view/psde_logic_node_quick_create_view_ms_node)|psde_logic_node_quick_create_view_ms_node|实体处理逻辑节点|实体选项操作视图|系统自动添加|
|[属性视图](app/view/psdems_logic_design_edit_view_ms)|psdems_logic_design_edit_view_ms|实体主状态迁移逻辑|实体编辑视图|系统自动添加|
|[主状态逻辑设计](app/view/psdemslogicmslogicdesign_custom)|psdemslogicmslogicdesign_custom|主状态逻辑设计|实体自定义视图||
|[设计](app/view/psdemslogicmslogicdesign_modal)|psdemslogicmslogicdesign_modal|设计|实体子应用引用视图||
|[全部报表表格](app/view/report_all_report_grid_view)|report_all_report_grid_view|全部报表|实体表格视图||
|[基础信息变更](app/view/report_baseinfo_edit_view)|report_baseinfo_edit_view|基础信息变更|实体编辑视图|系统自动添加|
|[BI报表呈现态面板视图](app/view/report_bi_report_content_panel_view)|report_bi_report_content_panel_view|BI报表呈现态面板视图|实体面板视图|系统自动添加|
|[BI报表设计态面板视图](app/view/report_bi_report_panel_view)|report_bi_report_panel_view|BI报表设计态面板视图|实体面板视图|系统自动添加|
|[分析报表编辑视图](app/view/report_edit_view)|report_edit_view|分析报表|实体编辑视图|系统自动添加|
|[分析报表](app/view/report_quick_create_view)|report_quick_create_view|新建报表|实体选项操作视图|系统自动添加|
|[组织编辑视图](app/view/res_company_edit_view)|res_company_edit_view|组织|实体编辑视图|系统自动添加|
|[组织表格视图](app/view/res_company_grid_view)|res_company_grid_view|组织|实体表格视图||
|[组织选择表格视图](app/view/res_company_pickup_grid_view)|res_company_pickup_grid_view|组织|实体选择表格视图（部件视图）|系统自动添加|
|[组织数据选择视图](app/view/res_company_pickup_view)|res_company_pickup_view|组织|实体数据选择视图|系统自动添加|
|[用户选择表格视图](app/view/res_users_pickup_grid_view)|res_users_pickup_grid_view|用户|实体选择表格视图（部件视图）|系统自动添加|
|[用户数据选择视图](app/view/res_users_pickup_view)|res_users_pickup_view|用户|实体数据选择视图|系统自动添加|
|[设置](app/view/system_setting_tree_exp_view)|system_setting_tree_exp_view|设置|实体树导航视图||
|[工作台](app/view/workspace_custom_dashboard_view)|workspace_custom_dashboard_view|工作台|实体自定义视图||
|[工作台编辑视图](app/view/workspace_edit_view)|workspace_edit_view|工作台|实体编辑视图||
|[重要事项](app/view/workspace_hr_work_bench)|workspace_hr_work_bench|重要事项|实体编辑视图||
|[工作台](app/view/workspace_manager_index_view)|workspace_manager_index_view|工作台|实体自定义视图||
|[工作台](app/view/workspace_manager_work_bench)|workspace_manager_work_bench|工作台|实体编辑视图||
|[我关注的](app/view/workspace_my_attention_tab_exp_view)|workspace_my_attention_tab_exp_view|我关注的|实体分页导航视图||
|[我的面试](app/view/workspace_my_interview_custom_view)|workspace_my_interview_custom_view|我的面试|实体自定义视图||
|[我的事项](app/view/workspace_my_summary_tab_exp_view)|workspace_my_summary_tab_exp_view|我的事项|实体分页导航视图||
|[总览](app/view/workspace_over_view)|workspace_over_view|总览|实体分页导航视图||
|[欢迎](app/view/workspace_welcome_custom_view)|workspace_welcome_custom_view|欢迎|实体自定义视图||

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