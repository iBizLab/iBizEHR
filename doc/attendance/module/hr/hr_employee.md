# 员工(hr_employee)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|其它说明|ADDITIONAL_NOTE|长文本，没有长度限制|1048576|是||
|分配总数量|ALLOCATIONS_COUNT|整型||是||
|分配的总天数。|ALLOCATION_COUNT|浮点||是||
|分配显示|ALLOCATION_DISPLAY|文本，可指定长度|500|是||
|剩余的分配显示|ALLOCATION_REMAINING_DISPLAY|文本，可指定长度|500|是||
|出勤状态|ATTENDANCE_STATE|单项选择(文本值)|200|是||
|徽标 ID|BARCODE|文本，可指定长度|500|是||
|出生日期|BIRTHDAY|日期型||是||
|证书等级|CERTIFICATE|[单项选择(文本值)](index/dictionary_index#hr_employee_certificate "证书等级")|60|是||
|受抚养的子女数|CHILDREN|整型||是||
|间接下属统计|CHILD_ALL_COUNT|整型||是||
|直接下属人数|CHILD_COUNT|整型||是||
|颜色指标|COLOR|整型||是||
|合同统计|CONTRACTS_COUNT|整型||是||
|合同警告|CONTRACT_WARNING|是否逻辑||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|部门|DEPARTMENT_ID|外键值|100|是||
|部门名称|DEPARTMENT_NAME|外键值文本|200|是||
|离职日期|DEPARTURE_DATE|日期型||是||
|其它信息|DEPARTURE_DESCRIPTION|HTML文本，没有长度限制|1048576|是||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|通勤距离|DISTANCE_HOME_WORK|整型||是||
|通勤距离（单位）|DISTANCE_HOME_WORK_UNIT|[单项选择(文本值)](index/dictionary_index#hr_employee_distance_home_work_unit "通勤距离（单位）")|60|否||
|联系人姓名|EMERGENCY_CONTACT|文本，可指定长度|100|是||
|电话|EMERGENCY_PHONE|文本，可指定长度|50|是||
|车辆|EMPLOYEE_CARS_COUNT|整型||是||
|员工类型|EMPLOYEE_TYPE|[单项选择(文本值)](index/dictionary_index#hr_employee_employee_type "员工类型")|60|否||
|设备数量|EQUIPMENT_COUNT|整型||是||
|费用筛选|FILTER_FOR_EXPENSE|是否逻辑||是||
|首次合同日期|FIRST_CONTRACT_DATE|日期型||是||
|性别|GENDER|[单项选择(文本值)](index/dictionary_index#hr_employee_gender "性别")|60|是||
|有徽章|HAS_BADGES|是否逻辑||是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|小时上月|HOURS_LAST_MONTH|浮点||是||
|小时上月显示|HOURS_LAST_MONTH_DISPLAY|文本，可指定长度|500|是||
|今天之前的小时数|HOURS_PREVIOUSLY_TODAY|浮点||是||
|小时今天|HOURS_TODAY|浮点||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|身份证号|IDENTIFICATION_ID|文本，可指定长度|500|是||
|今日缺勤|IS_ABSENT|是否逻辑||是||
|灵活可变|IS_FLEXIBLE|是否逻辑||是||
|完全灵活|IS_FULLY_FLEXIBLE|是否逻辑||是||
|是下属|IS_SUBORDINATE|是否逻辑||是||
|工作头衔|JOB_TITLE|文本，可指定长度|500|是||
|通勤距离（公里）|KM_HOME_WORK|整型||是||
|上个活动|LAST_ACTIVITY|日期型||是||
|上个活动时间|LAST_ACTIVITY_TIME|文本，可指定长度|500|是||
|最后一次出勤 工作时数|LAST_ATTENDANCE_WORKED_HOURS|浮点||是||
|休假次数|LEAVES_COUNT|浮点||是||
|起始日期|LEAVE_DATE_FROM|日期型||是||
|至日期|LEAVE_DATE_TO|日期型||是||
|法定名称|LEGAL_NAME|文本，可指定长度|500|是||
|车辆牌照|LICENSE_PLATE|文本，可指定长度|50|是||
|部门数量|MEMBER_OF_DEPARTMENT|是否逻辑||是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息发送错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数量|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|所需操作|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数量|MESSAGE_NEEDACTION_COUNTER|整型||是||
|办公手机|MOBILE_PHONE|文本，可指定长度|50|是||
|调动卡|MOBILITY_CARD|文本，可指定长度|500|是||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|名称|NAME|文本，可指定长度|200|否||
|最近聘用的|NEWLY_HIRED|是否逻辑||是||
|备注|NOTES|长文本，没有长度限制|1048576|是||
|护照号|PASSPORT_ID|文本，可指定长度|500|是||
|工作证编号|PERMIT_NO|文本，可指定长度|500|是||
|PIN|PIN|文本，可指定长度|500|是||
|出生地|PLACE_OF_BIRTH|文本，可指定长度|500|是||
|私人车辆车牌|PRIVATE_CAR_PLATE|文本，可指定长度|500|是||
|城市|PRIVATE_CITY|文本，可指定长度|500|是||
|私人电子邮箱|PRIVATE_EMAIL|文本，可指定长度|250|是||
|私人电话|PRIVATE_PHONE|文本，可指定长度|50|是||
|街道|PRIVATE_STREET|文本，可指定长度|500|是||
|街道2|PRIVATE_STREET2|文本，可指定长度|500|是||
|邮编|PRIVATE_ZIP|文本，可指定长度|50|是||
|相关合作伙伴数量|RELATED_PARTNERS_COUNT|整型||是||
|可用休假天数|REMAINING_LEAVES|浮点||是||
|工作时间|RESOURCE_CALENDAR_ID|外键值|100|是||
|工作时间|RESOURCE_CALENDAR_NAME|外键值文本|200|是||
|资源|RESOURCE_ID|外键值|100|否||
|显示HR图标|SHOW_HR_ICON_DISPLAY|是否逻辑||是||
|能够查看到剩余休假|SHOW_LEAVES|是否逻辑||是||
|社会保险号SIN|SINID|文本，可指定长度|50|是||
|配偶生日|SPOUSE_BIRTHDATE|日期型||是||
|配偶全名|SPOUSE_COMPLETE_NAME|文本，可指定长度|500|是||
|社会保障号SSN|SSNID|文本，可指定长度|500|是||
|研究领域|STUDY_FIELD|文本，可指定长度|500|是||
|毕业院校|STUDY_SCHOOL|文本，可指定长度|500|是||
|加班费总额|TOTAL_OVERTIME|浮点||是||
|公司汽车|VEHICLE|文本，可指定长度|50|是||
|签证有效期|VISA_EXPIRE|日期型||是||
|签证号|VISA_NO|文本，可指定长度|500|是||
|工作电子邮件|WORK_EMAIL|文本，可指定长度|500|否||
|工作许可证到期日期|WORK_PERMIT_EXPIRATION_DATE|日期型||是||
|工作许可名称|WORK_PERMIT_NAME|文本，可指定长度|500|是||
|工作许可的预定活动|WORK_PERMIT_SCHEDULED_ACTIVITY|是否逻辑||是||
|办公电话|WORK_PHONE|文本，可指定长度|50|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_ATTENDANCE_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_ATTENDANCE_HR_EMPLOYEE_EMPLOYEE_ID)|[出勤(HR_ATTENDANCE)](module/hr/hr_attendance)|1:N关系||
|[DER1N_HR_ATTENDANCE_OVERTIME_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_ATTENDANCE_OVERTIME_HR_EMPLOYEE_EMPLOYEE_ID)|[出勤 加班(HR_ATTENDANCE_OVERTIME)](module/hr/hr_attendance_overtime)|1:N关系||
|[DER1N_HR_DEPARTMENT_HR_EMPLOYEE_MANAGER_ID](der/DER1N_HR_DEPARTMENT_HR_EMPLOYEE_MANAGER_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_LEAVE_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_LEAVE_HR_EMPLOYEE_EMPLOYEE_ID)|[休假(HR_LEAVE)](module/hr/hr_leave)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_EMPLOYEE_HR_DEPARTMENT_DEPARTMENT_ID](der/DER1N_HR_EMPLOYEE_HR_DEPARTMENT_DEPARTMENT_ID)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|1:N关系||
|[DER1N_HR_EMPLOYEE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID](der/DER1N_HR_EMPLOYEE_RESOURCE_CALENDAR_RESOURCE_CALENDAR_ID)|[资源工作时间(RESOURCE_CALENDAR)](module/resource/resource_calendar)|1:N关系||
|[DER1N_HR_EMPLOYEE_RESOURCE_RESOURCE_RESOURCE_ID](der/DER1N_HR_EMPLOYEE_RESOURCE_RESOURCE_RESOURCE_ID)|[资源(RESOURCE_RESOURCE)](module/resource/resource_resource)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/hr/hr_employee/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_employee/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_employee/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CERTIFICATE_EQ|证书等级|EQ||
|N_DEPARTMENT_ID_CHILDOF|部门|CHILDOF||
|N_DEPARTMENT_ID_EQ|部门|EQ||
|N_DISTANCE_HOME_WORK_UNIT_EQ|通勤距离（单位）|EQ||
|N_EMPLOYEE_TYPE_EQ|员工类型|EQ||
|N_GENDER_EQ|性别|EQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_RESOURCE_CALENDAR_ID_EQ|工作时间|EQ||
|N_RESOURCE_ID_EQ|资源|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_employee?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_employee?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>