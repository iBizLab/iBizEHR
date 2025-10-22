# 数据字典  <!-- {docsify-ignore-all} -->

##### BI图表类型 :id=bi_chart_type2



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|NUMBER|数字|number||
|MULTI_SERIES_COL|多系列柱状图|multi_series_col||
|STACK_COL|堆叠柱状图|stack_col||
|ZONE_COL|分区柱状图|zone_col||
|MULTI_SERIES_BAR|多系列条形图|multi_series_bar||
|STACK_BAR|堆积条形图|stack_bar||
|MULTI_SERIES_LINE|多系列折线图|multi_series_line||
|ZONE_LINE|分区折线图|zone_line||
|AREA|面积图|area||
|GRID|表格|grid||
|CROSSTABLE|交叉表|crosstable||
|PIE|饼图|pie||
|RADAR|雷达图|radar||
|GAUGE|仪表盘|gauge||
|SCATTER|散点图|scatter||

##### Offer状态 :id=hr_applicant_offer



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|已发送offer|item_1||
|0|未发送offer|item_0||

##### offer发送反馈状态 :id=offer_history_feedback_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|0|拒绝|item_0||
|1|接收|item_1||
|2|未决定|item_2||

##### offer审核状态 :id=offer_approval_period



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|past|已审核|past||
|pending|待审核|pending||

##### offer审核结果状态 :id=offer_approval_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|审批通过|item_1||
|2|审批驳回|item_2||
|3|审批中|item_3||

##### 上传至人才库 :id=hr_candidate_save_to_telent_pool



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|直接上传至人才库|item_1||

##### 主状态逻辑设计呈现模式 :id=MSLogicDesignMode



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|table|表格|table||
|graph|流程|graph||

##### 云实体主状态逻辑处理节点类型(设计) :id=DELogicNodeType_MS



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|base|基础|base||

##### 云实体关系属性影射类型 :id=DERDERMapType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|SUM|合计|sum||
|AVG|平均|avg||
|MAX|最大值|max||
|MIN|最小值|min||
|COUNT|计数|count||
|EXISTS|存在|exists|从实体存在，1表示存在，0表示不存在|
|NOTEXISTS|不存在|notexists|从实体不存在，1表示不存在，0表示存在|
|USER|用户自定义|user||
|USER2|用户自定义2|user2||
|USER3|用户自定义3|user3||
|USER4|用户自定义4|user4||

##### 人才库 :id=UsrCodeList0808214775



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|10|系统公共人才库|item_10||

##### 候选人到岗时间 :id=interview_candiate_join_date



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|已经离职|item_1||
|2|已经提出离职|item_2||
|3|暂未提出离职|item_3||

##### 候选人学习能力 :id=he_candidate_learning_ability



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|优秀|item_1||
|2|具备|item_2||
|3|不具备|item_3||

##### 候选人性别 :id=candidate_gender



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|男|item_1||
|0|女|item_0||

##### 候选人申请状态 :id=hr_applicant_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|0|已结束|item_0||
|1|流程中|item_1||

##### 候选人筛选状态 :id=candidate_filter_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|待处理|item_1||
|2|通过|item_2||
|3|拒绝|item_3||

##### 发薪方式 :id=idea_paymentMethod



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|0|日结|item_0||
|1|周结|item_1||
|2|月结|item_2||
|3|完工结|item_3||

##### 发送方式 :id=send_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|email|邮件|email||
|sms|短信|sms||

##### 可供选择的属性变更 :id=enable_field_change



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|ProjMgmt.work_item.state|变更工作项状态|projmgmt_work_item_state||
|ProjMgmt.work_item.*|变更工作项属性|item_3||

##### 可供选择的触发器 :id=enable_action



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|product|产品|product||
|project|项目|project||
|library|测试库|library||
|wiki|空间|wiki||
|base|基础|base||

##### 多维分析指标类别 :id=BIMeasureType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|COMMON|常规|common||
|CALCULATED|动态计算|calculated||

##### 多维分析维度类别 :id=BIDimensionType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|COMMON|常规|common||
|CALCULATED|动态计算|calculated||

##### 学历要求 :id=idea_education



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|不限|item_1||
|2|高中以下|item_2||
|3|中专|item_3||
|4|中技|item_4||
|5|大专|item_5||
|6|本科|item_6||
|7|硕士|item_7||
|8|博士|item_8||

##### 实体逻辑处理节点类型(设计) :id=DELogicNodeType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|BaseEvent|基础事件|baseevent||
|ParamAction|参数操作|paramaction||
|GeneralProcess|常规处理|generalprocess||
|DBProcess|数据库操作|dbprocess||
|WFProcess|工作流处理|wfprocess||
|Advanced|高级|advanced||

##### 实体逻辑处理节点类型(设计)3 :id=DELogicNodeType3



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|BaseEvent|基础事件|baseevent||
|ParamAction|参数操作|paramaction||
|GeneralProcess|常规处理|generalprocess||
|DBProcess|数据库操作|dbprocess||
|WFProcess|工作流处理|wfprocess||
|Advanced|高级|advanced||

##### 封面图片 :id=hr_work_location_location_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|home|首页|home||
|office|办公室|office||
|other|其他|other||

##### 属性只读模式 :id=DEFReadOnlyMode



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|无建立|NoCreate||
|2|无更新|NoUpdate||

##### 岗位发布平台类型 :id=hr_job_platform_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|外部招聘网站|item_1||
|2|招聘官网|item_2||
|3|内推官网|item_3||
|4|猎头|item_4||

##### 岗位性质 :id=job_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|fulltime|全职|fulltime||
|parttime|兼职|parttime||
|intern|实习|intern||
|other|其它|other||

##### 岗位状态 :id=job_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|open|开启招聘|open||
|closed|关闭招聘|closed||

##### 工作经验 :id=job_experience



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|不限|item_1||
|2|应届毕业生|item_2||
|3|1年以下|item_3||
|4|1-3年|item_4||
|5|3-5年|item_5||
|6|5-10年|item_6||
|7|10年以上|item_7||

##### 应用模型类型 :id=pscoreprdfunc_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|BASE|基础|base||
|EXTENSION|扩展|extension||
|COMPONENT|组件|component||

##### 归档原因 :id=archiving_reason



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|综合素质较差|综合素质较差|item_1||
|形象不符|形象不符|item_2||
|无职业规划|无职业规划|item_3||
|福利待遇不匹配|福利待遇不匹配|item_4||
|专业能力不匹配|专业能力不匹配|item_5||
|对公司/岗位不感兴趣|对公司/岗位不感兴趣|item_6||
|不考虑驻点|不考虑驻点|item_7||
|淘汰|淘汰|item_8||

##### 扩展状态 :id=extension_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|0|未应用|item_0||
|1|已应用|item_1||

##### 招聘平台/账号发布状态 :id=hr_platform_publish_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|未发布|item_1||
|2|已发布|item_2||

##### 招聘流程 :id=job_progress



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|10|常规|item_10||

##### 招聘流程状态 :id=progress_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|启用|item_1||
|0|停用|item_0||

##### 招聘阶段状态 :id=stage_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|启用|item_1||
|0|停用|item_0||

##### 推荐状态 :id=hr_applicant_recommended



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|已推荐|item_1||
|0|未推荐|item_0||

##### 推荐简历类型 :id=candidate_filter_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|原始简历|item_1||
|2|标准简历|item_2||

##### 推荐类型 :id=candidate_filter_detail_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|推荐|item_1||
|2|抄送|item_2||

##### 教育程度 :id=job_education



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|不限|item_1||
|2|高中以下|item_2||
|3|中专|item_3||
|4|大专|item_4||
|5|本科|item_5||
|6|硕士|item_6||
|7|博士|item_7||

##### 日志状态 :id=log_state



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|SUCCESS|成功|success||
|FAILURE|失败|failure||

##### 智能报表报表指标引用类型 :id=BIReportItemMSRefType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|NONE|无|none||
|YEARERLIER|同比|yearerlier||
|PERIODEARLIER|环比|periodearlier||
|RATIO|占比|ratio||

##### 智能报表报表项放置位置 :id=BIReportItemPlacement



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|NONE|无|none||
|ROWHEADER|行头|rowheader||
|COLHEADER|列头|colheader||

##### 智能报表报表项放置类型 :id=BIReportItemPlaceType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|VISIBLE|默认显示|visible||
|INVISIBLE|默认隐藏|invisible||
|FROZEN|固定|frozen||

##### 智能报表报表项类型 :id=BIReportItemType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|MEASURE|指标|measure||
|DIMENSION|维度|dimension||
|USER|用户自定义|user||

##### 核心产品功能状态 :id=product_func_state



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|0|未安装|not_install||
|1|已安装|Installed||
|2|已禁用|disabled||

##### 短信模版（临时） :id=interview_sms_template



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|标准模版|item_1||
|2|其他|item_2||

##### 短信通知候选人 :id=interview_send_sms



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|短信通知候选人|item_1||

##### 筛选规则 :id=assignment_rule



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|10|初筛规则|item_10||
|20|高级人才赛选规则|item_20||

##### 简历来源 :id=UsrCodeList0813106864



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|2|主动投递|item_2||
|1|主动搜索|item_1||
|3|人才推荐|item_3||

##### 简历类型 :id=interview_resume_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|原始简历|item_1||
|2|标准简历|item_2||

##### 组织类型 :id=hr_company_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|机构|item_1||
|2|部门|item_2||
|3|项目组|item_3||

##### 考试状态 :id=exam_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|10|未完成|item_10||
|20|已完成|item_20||

##### 考试评测类型 :id=exam_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|exam|考试|exam||
|evaluation|评测|evaluation||

##### 职位优先级 :id=job_priority



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|10|紧急|item_10||
|20|一般|item_20||

##### 职位属性 :id=job_attribute



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|truejob|实体职位|truejob||
|falsejob|虚拟职位|falsejob||

##### 职位来源 :id=job_source_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|手动添加|item_1||
|2|招聘网站投递|item_2||

##### 职位类型（实体/虚拟） :id=job_is_virtual



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|0|实体职位|item_0||
|1|虚拟职位|item_1||

##### 职能类型 :id=functional_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|10|技术开发类|item_10||
|20|计数服务类|item_20||
|30|技术实施类|item_30||
|40|营销类|item_40||
|50|其他类|item_50||
|60|职能类|item_60||
|70|管理类|item_70||

##### 自动化规则类型 :id=auto_flow_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|EVENTHOOK|事件处理|eventhook||
|FIELDCHANGEHOOK|属性变化处理|fieldchangehook||
|WEBHOOK|收到WebHook|webhook||

##### 薪资单位 :id=idea_salaryUnit



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|0|k/月|item_0||
|1|元/月|item_1||
|2|元/周|item_2||
|3|元/天|item_3||
|4|元/小时|item_4||
|5|元/次|item_5||

##### 评分规则 :id=score_rule



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|10|百分制|item_10||
|20|十分制|item_20||

##### 逻辑子类 :id=DELogicSubType



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|NONE|无|none||
|DEFIELD|属性逻辑|defield|面向属性的处理逻辑子类型，|
|ATTACHTODEACTION|附加到行为|attachtodeaction|附加到指定行为|
|ATTACHTODEDATASET|附加到数据集|attachtodedataset|附加到指定数据集|
|WEBHOOK|WebHook|webhook|WEB钩子|
|EVENTHOOK|事件处理|eventhook||
|TIMERTASK|定时作业|timertask|后台定时作业|
|FIELDCHANGEHOOK|属性变化处理|fieldchangehook||
|USER|用户自定义|user||
|USER2|用户自定义2|user2||
|USER3|用户自定义3|user3||
|USER4|用户自定义4|user4||

##### 邮件模版（临时） :id=interview_email_template



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|标准模版|item_1||
|2|其他|item_2||

##### 邮件通知候选人 :id=interview_send_email



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|邮件通知候选人|item_1||

##### 需求状态 :id=idea_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|draft|草稿|draft||
|unstart|未进行|unstart||
|ongoing|进行中|ongoing||
|complete|已完成|complete||
|suspend|已暂停|suspend||
|canceled|已取消|canceled||
|timeout|已超期|timeout||

##### 面试参与者类型 :id=interview_user_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|面试官|item_1||
|2|候选人|item_2||

##### 面试地址（临时） :id=interview_address



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|北京市|item_1||
|2|上海市|item_2||

##### 面试开始时间 :id=interview_start_time



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|9:00|item_1||
|2|10:00|item_2||
|3|11:00|item_3||
|4|12:00|item_4||
|5|13:00|item_5||
|6|14:00|item_6||
|7|15:00|item_7||
|8|16:00|item_8||
|9|17:00|item_9||
|10|18:00|item_10||

##### 面试时长 :id=interview_duration



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|30分钟|item_1||
|2|60分钟|item_2||
|3|90分钟|item_3||
|4|120分钟|item_4||
|5|150分钟|item_5||

##### 面试状态 :id=interview_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|未开始|item_1||
|2|已结束|item_2||
|3|已取消|item_3||

##### 面试类型 :id=interview_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|现场面试|item_1||
|2|电话面试|item_2||
|3|视频面试|item_3||

##### 面试类型分类 :id=interview_category



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|腾讯会议|item_1||
|2|其他|item_2||

##### 面试结果 :id=interview_result_type



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|通过|item_1||
|2|待定|item_2||
|3|淘汰|item_3||

##### 面试评价状态 :id=interview_feedback_status



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|未评估|item_1||
|2|已评估|item_2||

##### 面试阶段 :id=interview_stage



| 值col150        |    文本col150    |   代码名col150    |  备注col800     |
| --------   |------------|------------|------------|
|1|部门初试|item_1||
|2|部门复试|item_2||
|3|部门终试|item_3||
|4|HR面试|item_4||

