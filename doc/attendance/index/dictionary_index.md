# 数据字典  <!-- {docsify-ignore-all} -->

##### N班倒 :id=inversion_count



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|2|两班倒|item_2||
|3|三班倒|item_3||
|4|四班倒|item_4||

##### 上下班次数 :id=workingNumber



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|1次上下班|item_1||
|2|2次上下班|item_2||
|3|3次上下班|item_3||

##### 假期状态 :id=leave_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|启用|item_1||
|0|未启用|item_0||

##### 假期类型 :id=holidayType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|annual_leave|年假|annual_leave||
|compassionate_leave|事假|compassionate_leave||
|vacation_leave|调休假|vacation_leave||
|sick_leave|病假|sick_leave||
|parental_leave|育儿假|parental_leave||
|paternity_leave|陪产假|paternity_leave||
|marriage_holiday|婚假|marriage_holiday||
|funeral_leave|丧假|funeral_leave||
|maternity_leave|产假|maternity_leave||

##### 假期计算方式 :id=leave_calc_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|workday|工作日|workday||
|natural_day|自然日|natural_day||

##### 假期适用范围 :id=leaveScopeType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|全公司|item_1||
|0|指定的部门|item_0||

##### 出勤统计 :id=attendance_statistics



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|should_attendance_days|应出勤天数|should_attendance_days||
|actual_attendance_days|实际出勤天数|actual_attendance_days||
|should_attendance_time|应出勤时长|should_attendance_time||
|working_hours|实际出勤时长|working_hours||
|billable_time|计薪工作时长|billable_time||
|pay_overtime_time|加班时长(计加班费)|pay_overtime_time||
|rest_overtime_time|加班时长(计调休假)|rest_overtime_time||

##### 加班时长校验 :id=overtime_validation



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|no_validation|自动批准|no_validation||
|by_manager|经理批准|by_manager|Approved by Manager|

##### 加班状态 :id=hr_attendance_overtime_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|to_approve|待批准|to_approve||
|approved|批准|approved||
|refused|已拒绝|refused||

##### 加班种类 :id=overtime_kind



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|0|加班费|item_0||
|1|调休假|item_1||
|2|其他-不计为调休、加班费|item_2||

##### 加班类型 :id=overtime_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|平时加班|item_1||
|2|周末加班|item_2||
|3|法定节假日加班|item_3||

##### 员工类型 :id=hr_employee_employee_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|employee|员工|employee||
|worker|员工|worker||
|student|学生|student||
|trainee|见习|trainee||
|contractor|承包人|contractor||
|freelance|自由职业者|freelance||

##### 周数 :id=resource_calendar_attendance_week_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|秒|item_1||
|0|第一个|item_0||

##### 周期1 :id=Week1



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|周一|item_1||
|2|周二|item_2||
|3|周三|item_3||
|4|周四|item_4||
|5|周五|item_5||
|6|周六|item_6||
|7|周日|item_7||

##### 周期2 :id=Week2



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|8|周一|item_8||
|9|周二|item_9||
|10|周三|item_10||
|11|周四|item_11||
|12|周五|item_12||
|13|周六|item_13||
|14|周日|item_14||

##### 周期3 :id=Week3



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|15|周一|item_15||
|16|周二|item_16||
|17|周三|item_17||
|18|周四|item_18||
|19|周五|item_19||
|20|周六|item_20||
|21|周日|item_21||

##### 周期4 :id=Week4



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|22|周一|item_22||
|23|周二|item_23||
|24|周三|item_24||
|25|周四|item_25||
|26|周五|item_26||
|27|周六|item_27||
|28|周日|item_28||

##### 基本信息(显隐) :id=base_info



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|member_name|姓名|member_name||
|employee_num|工号|employee_num||
|dept_name|部门|dept_name||
|title|职位|title||

##### 审批状态 :id=approval_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|APPROVED|通过|approved||
|REJECTED|驳回|rejected||
|PENDING|待审批|pending||

##### 工作日-四周 :id=workday



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|周一|item_1||
|2|周二|item_2||
|3|周三|item_3||
|4|周四|item_4||
|5|周五|item_5||
|6|周六|item_6||
|7|周日|item_7||
|8|周一|item_8||
|9|周二|item_9||
|10|周三|item_10||
|11|周四|item_11||
|12|周五|item_12||
|13|周六|item_13||
|14|周日|item_14||
|15|周一|item_15||
|16|周二|item_16||
|17|周三|item_17||
|18|周四|item_18||
|19|周五|item_19||
|20|周六|item_20||
|21|周日|item_21||
|22|周一|item_22||
|23|周二|item_23||
|24|周三|item_24||
|25|周四|item_25||
|26|周五|item_26||
|27|周六|item_27||
|28|周日|item_28||

##### 工作日类型 :id=workday_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|workday|工作日|workday||
|holiday|节假日|holiday||

##### 带薪状态 :id=with_salary



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|0|不带薪|item_0||
|1|带薪|item_1||

##### 异常统计 :id=abnormal_statistics



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|late_times|迟到次数|late_times||
|late_duration|迟到时长|late_duration||
|leave_early|早退次数|leave_early||
|leave_early_duration|早退时长|leave_early_duration||
|on_missing|上班卡缺卡|on_missing||
|off_missing|下班卡缺卡|off_missing||
|absent_days|旷工天数|absent_days||
|on_business_days|出差天数|on_business_days||
|out_time|外出时长|out_time||
|make_card_times|补卡次数|make_card_times||
|out_work_times|外勤次数|out_work_times||

##### 弹性打卡 :id=elastic_minutes



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|15|15|item_15||
|30|30|item_30||
|60|60|item_60||
|90|90|item_90||
|120|120|item_120||

##### 循环周数 :id=CycleWeeks



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|一周|item_1||
|2|两周|item_2||
|3|三周|item_3||
|4|四周|item_4||

##### 循环周期 :id=cycle



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|big_small|第一周为大周，第二周为小周|big_small||
|small_big|第一周为小周，第二周为大周|small_big||

##### 性别 :id=hr_employee_gender



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|male|男性|male||
|female|女性|female||
|other|其他|other||

##### 成员类型 :id=member_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|dept|部门|dept||
|person|人员|person||

##### 手动排班类型 :id=manualType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|0|常规|item_0||
|2|手动|item_2||

##### 打卡方式 :id=checkin_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|face|人脸识别|face||
|fingerprint|指纹识别|fingerprint||
|card|工卡识别|card||

##### 打卡次数 :id=checkin_frequency



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|1次|item_1||
|2|2次及以上|item_2||

##### 打卡类型 :id=clock_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|IN|上班打卡|in||
|OUT|下班打卡|out||
|REMOTE|外勤打卡|remote||

##### 打卡要求 :id=attendance_policy



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|only_checkin|只打上班卡|only_checkin||
|only_checkout|只打下班卡|only_checkout||
|only_once|上下班时间内打卡一次|only_once||

##### 日期 :id=resource_calendar_attendance_day_period



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|morning|上午|morning||
|lunch|断点|lunch||
|afternoon|下午|afternoon||

##### 日期开始 :id=hr_leave_request_date_from_period



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|am|上午|am||
|pm|下午|pm||

##### 时间类型 :id=resource_calendar_leaves_time_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|leave|休假|leave||
|other|其他|other||

##### 星期 :id=resource_calendar_attendance_dayofweek



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|0|周一|item_0||
|1|周二|item_1||
|2|周三|item_2||
|3|周四|item_3||
|4|周五|item_4||
|5|周六|item_5||
|6|周日|item_6||

##### 是否休息日相同 :id=same_restday



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|休息日相同|item_1||
|0|休息日不同|item_0||

##### 显示类型 :id=resource_calendar_attendance_display_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|line_section|小节|line_section||

##### 最小单位 :id=unit_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|HOUR|小时|hour||
|MINUTE|分钟|minute||

##### 月 :id=months



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|2025-05|2025-05|item_1||
|2025-06|2025-06|item_2||
|2025-07|2025-07|item_3||

##### 条码来源 :id=barcode_source



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|scanner|扫描|scanner||
|front|前置摄像头|front||
|back|后置摄像头|back||

##### 模式 :id=hr_attendance_in_mode



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|kiosk|自助考勤终端|kiosk||
|systray|系统托盘|systray||
|manual|手动|manual||
|technical|技术|technical||

##### 每日统计(显隐) :id=daily_statistics



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|daily|考勤结果|daily||

##### 每日统计-基本信息 :id=DailystatisticsBase



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|member_name|姓名|member_name||
|member_num|工号|member_num||
|dept_name|部门|dept_name||
|title|职位|title||
|checkin_date|日期|checkin_date||
|rule_name|考勤规则|rule_name||
|shift_message|班次|shift_message||

##### 每日统计-异常统计 :id=AbnormalStatistics



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|leave_duration|请假时长|leave_duration||
|leave_type|请假类型|leave_type||
|on_business_days|出差天数|on_business_days||
|out_hours|外出时长|out_hours||

##### 每日统计-打卡信息 :id=checkin_info



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|checkin_time|打卡时间|checkin_time||
|checkin_result|考勤结果|checkin_result||

##### 每日统计-时长统计 :id=DurationStatistics



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|should_attendance_hours|应出勤时长|should_attendance_hours||
|billable_hours|计薪时长|billable_hours||
|working_hours|实际出勤时长|working_hours||
|late_minutes|迟到时长|late_minutes||
|leave_early_minutes|早退时长|leave_early_minutes||
|overtime_hours|加班时长|overtime_hours||

##### 活动异常标示 :id=hr_leave_activity_exception_decoration



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|warning|null|warning||
|danger|null|danger||

##### 活动状态 :id=hr_leave_activity_state



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|overdue|null|overdue||
|today|null|today||
|planned|null|planned||

##### 状态 :id=hr_leave_report_calendar_state



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|cancel|已取消|cancel||
|confirm|待批准|confirm||
|refuse|已拒绝|refuse||
|validate1|第二次审批|validate1||
|validate|已批准|validate||

##### 状态 :id=hr_leave_state



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|confirm|待批准|confirm||
|refuse|已拒绝|refuse||
|validate1|第二次审批|validate1||
|validate|已批准|validate||
|cancel|已取消|cancel||

##### 班次数量 :id=ShiftNum



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|1|item_1||
|2|2|item_2||
|3|3|item_3||
|4|4|item_4||
|5|5|item_5||
|6|6|item_6||
|7|7|item_7||
|8|8|item_8||
|9|9|item_9||
|10|10|item_10||
|11|11|item_11||
|12|12|item_12||
|13|13|item_13||
|14|14|item_14||
|15|15|item_15||
|16|16|item_16||
|17|17|item_17||
|18|18|item_18||
|19|19|item_19||
|20|20|item_20||

##### 班次状态 :id=shift_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|WORK|工作|work||
|REST|休息|rest||

##### 班次类型 :id=schedule_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|fixed|固定排班|fixed||
|class_inversion|N班倒|class_inversion||
|work_rest|上A休B|work_rest||
|flexible|灵活打卡|flexible||
|alternate_week|大小周|alternate_week||
|manual|手动排班|manual||
|free|自由班|free||

##### 班次类型（免考勤） :id=all_schedule_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|fixed|固定排班|fixed||
|class_inversion|N班倒|class_inversion||
|work_rest|上A休B|work_rest||
|flexible|灵活打卡|flexible||
|alternate_week|大小周|alternate_week||
|manual|手动排班|manual||
|free|自由班|free||
|no_required|免考勤|no_required||

##### 生效类型 :id=effectConfig



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|立即生效|item_1||
|2|明日生效|item_2||
|3|指定日期生效|item_3||

##### 申请单位类型 :id=leave_ask_unit



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|half_hour|0.5小时|half_hour||
|hour|1小时|hour||
|half_day|0.5天|half_day||
|day|1天|day||

##### 申请状态 :id=application_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|APPROVED|审核通过|approved||
|PENDING|待审核|pending||
|CANCELLATION|作废|cancellation||

##### 申请限制周期 :id=periodFrom



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|year|每年|year||
|month|每月|month||

##### 类型 :id=resource_resource_resource_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|user|人员|user||
|material|物料|material||

##### 考勤人员类型 :id=employeeType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|true|全公司|true||
|false|指定的部门或人员|false||

##### 考勤方式类型 :id=checkin_method_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|device|设备打卡|device||
|gps|GPS打卡|gps||
|wifi|WiFi打卡|wifi||

##### 考勤模式 :id=kiosk_mode



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|barcode|条形码/RFID|barcode||
|barcode_manual|条形码和手动选择|barcode_manual||
|manual|手动选择|manual||

##### 考勤状态 :id=attendance_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|normal|正常|normal||
|late|迟到|late||
|early|早退|early||
|absent|缺勤|absent||

##### 考勤申请类型 :id=attendance_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|REISSUE|补卡|reissue||
|OVERTIME|加班|overtime||
|LEAVE|请假|leave||
|GO_OUT|外出|go_out||
|BUSINESS_TRIP|出差|business_trip||

##### 考勤结果 :id=attendance_result



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|NORMAL|正常|normal||
|ABNORMAL|异常|abnormal||
|LATE|迟到|late||
|LEAVE_EARLY|早退|leave_early||
|ABSENT|缺勤|absent||
|MISSING|缺卡|missing||
|LATE_AND_LEAVE_EARLY|迟到/早退|late_and_leave_early||

##### 考勤结果(打卡详情) :id=details_result



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|NORMAL|正常|normal||
|ABNORMAL|异常|abnormal||
|LATE|迟到|late||
|LEAVE_EARLY|早退|leave_early||
|ABSENT|缺勤|absent||
|MISSING|缺卡|missing||
|ON_MISSING|缺卡|on_missing||
|OFF_MISSING|缺卡|off_missing||
|LEAVE|请假|leave||

##### 节假日 :id=holiday



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|new_years_day|元旦节|new_years_day||
|spring_festival|春节|spring_festival||
|tomb_sweeping_festival|清明节|tomb_sweeping_festival||
|labor_day|劳动节|labor_day||
|dragon_boat_festival|端午节|dragon_boat_festival||
|national_day|国庆节|national_day||
|mid_autumn_festival|中秋节|mid_autumn_festival||

##### 设备类型 :id=device_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|checkin_machine|考勤机|checkin_machine||
|mobile_device|移动设备|mobile_device||

##### 证书等级 :id=hr_employee_certificate



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|graduate|毕业生|graduate||
|bachelor|本科|bachelor||
|master|主版本|master||
|doctor|博士|doctor||
|other|其他|other||

##### 请假类型 :id=off_time_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|MARRIAGE_HOLIDAY|婚假|marriage_holiday||
|FUNERAL_LEAVE|葬假|funeral_leave||
|PATERNITY_LEAVE|陪产假|paternity_leave||
|VACATION_LEAVE|调休假|vacation_leave||
|PARENTAL_LEAVE|育儿假|parental_leave||
|SICK_LEAVE|病假|sick_leave||
|COMPASSIONATE_LEAVE|事假|compassionate_leave||
|ANNUAL_LEAVE|年假|annual_leave||
|MATERNITY_LEAVE|产假|maternity_leave||

##### 请假统计 :id=leave_application_statistics



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|leave_duration|请假时长|leave_duration||
|annual_leave|年假|annual_leave||
|vacation_leave|调休假|vacation_leave||
|sick_leave|病假|sick_leave||
|parental_leave|育儿假|parental_leave||
|paternity_leave|陪产假|paternity_leave||
|marriage_holiday|婚假|marriage_holiday||
|funeral_leave|丧假|funeral_leave||
|maternity_leave|产假|maternity_leave||
|compassionate_leave|事假|compassionate_leave||

##### 输出模式 :id=hr_attendance_out_mode



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|kiosk|自助考勤终端|kiosk||
|systray|系统托盘|systray||
|manual|手动|manual||
|technical|技术|technical||
|auto_check_out|自动签退|auto_check_out||

##### 通勤距离（单位） :id=hr_employee_distance_home_work_unit



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|kilometers|千米|kilometers||
|miles|英里|miles||

