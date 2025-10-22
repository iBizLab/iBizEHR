# 出勤(hr_attendance)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|附件集合|ATTACHMENTS|继承属性|1048576|是||
|签到|CHECK_IN|日期时间型||否||
|签离|CHECK_OUT|日期时间型||是||
|颜色|COLOR|整型||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|员工|EMPLOYEE_ID|外键值|100|否||
|员工|EMPLOYEE_NAME|外键值文本|200|否||
|预期工时|EXPECTED_HOURS|浮点||是||
|关注者|FOLLOWERS|继承属性|1048576|是||
|有消息|HAS_MESSAGE|是否逻辑||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|浏览器|IN_BROWSER|文本，可指定长度|500|是||
|城市|IN_CITY|文本，可指定长度|500|是||
|国家|IN_COUNTRY_NAME|文本，可指定长度|500|是||
|IP地址|IN_IP_ADDRESS|文本，可指定长度|500|是||
|纬度|IN_LATITUDE|浮点||是||
|经度|IN_LONGITUDE|浮点||是||
|模式|IN_MODE|[单项选择(文本值)](index/dictionary_index#hr_attendance_in_mode "模式")|60|是||
|附件数量|MESSAGE_ATTACHMENT_COUNT|整型||是||
|消息传递错误|MESSAGE_HAS_ERROR|是否逻辑||是||
|错误数|MESSAGE_HAS_ERROR_COUNTER|整型||是||
|短信发送错误|MESSAGE_HAS_SMS_ERROR|是否逻辑||是||
|是关注者|MESSAGE_IS_FOLLOWER|是否逻辑||是||
|待处理|MESSAGE_NEEDACTION|是否逻辑||是||
|操作数|MESSAGE_NEEDACTION_COUNTER|整型||是||
|变更标记|MODIFIED|整型||是||
|名称|NAME|继承属性|200|是||
|无有效加班时间|NO_VALIDATED_OVERTIME_HOURS|是否逻辑||是||
|退出浏览器|OUT_BROWSER|文本，可指定长度|500|是||
|出城|OUT_CITY|文本，可指定长度|500|是||
|国家名称|OUT_COUNTRY_NAME|文本，可指定长度|500|是||
|出口IP 地址|OUT_IP_ADDRESS|文本，可指定长度|500|是||
|纬度|OUT_LATITUDE|浮点||是||
|出经度|OUT_LONGITUDE|浮点||是||
|输出模式|OUT_MODE|[单项选择(文本值)](index/dictionary_index#hr_attendance_out_mode "输出模式")|60|是||
|随着时间的推移|OVERTIME_HOURS|浮点||是||
|加班状态|OVERTIME_STATUS|[单项选择(文本值)](index/dictionary_index#hr_attendance_overtime_status "加班状态")|60|是||
|加班时间|VALIDATED_OVERTIME_HOURS|浮点||是||
|工作时数|WORKED_HOURS|浮点||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_HR_ATTENDANCE_HR_EMPLOYEE_EMPLOYEE_ID](der/DER1N_HR_ATTENDANCE_HR_EMPLOYEE_EMPLOYEE_ID)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|1:N关系||
|[DERMULINH_HR_ATTENDANCE_MAIL_THREAD](der/DERMULINH_HR_ATTENDANCE_MAIL_THREAD)|[邮件会话(MAIL_THREAD)](module/mail/mail_thread)|多继承关系（虚拟实体）||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|计算工作时间、加班时间|ComputeWorkHour|用户自定义|默认|不支持||[ComputeWorkHourDEActionRuntime](index/plugin_index#ComputeWorkHourDEActionRuntime)|计算工作时间、加班时间|
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#hr_attendance_Create)|||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#hr_attendance_Update)|||
|批量审批|batchApproval|[实体处理逻辑](module/hr/hr_attendance/logic/batchApproval "批量审批")|默认|不支持||||
|自助终端考勤|kiosk_checkin|[实体处理逻辑](module/hr/hr_attendance/logic/kiosk_checkin "自助终端考勤")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[保存校验](module/hr/hr_attendance/logic/check_validity)|check_validity|无|||
|[其他工时计算](module/hr/hr_attendance/logic/calcOther)|calcOther|无|||
|[批量审批](module/hr/hr_attendance/logic/batchApproval)|batchApproval|无|||
|[更新/创建加班记录](module/hr/hr_attendance/logic/changeOverTime)|changeOverTime|无|||
|[考勤统计计算](module/hr/hr_attendance/logic/AttendanceCalculate)|AttendanceCalculate|无|||
|[自助终端考勤](module/hr/hr_attendance/logic/kiosk_checkin)|kiosk_checkin|无|||
|[计算工作、加班时间](module/hr/hr_attendance/logic/ComputeWorkHour)|ComputeWorkHour|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/hr/hr_attendance/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/hr/hr_attendance/query/View)|VIEW|否|否 |否 ||
|[manage](module/hr/hr_attendance/query/manage)|manage|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/hr/hr_attendance/dataset/Default)|DEFAULT|数据查询|是|||
|[manage](module/hr/hr_attendance/dataset/manage)|manage|数据查询|否|||

## 数据权限

##### 出勤记录管理员 :id=hr_attendance-attendance_admin

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[(1=1)]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `DELETE`
* `CREATE`
* `UPDATE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_EMPLOYEE_ID_EQ|员工|EQ||
|N_EMPLOYEE_NAME_EQ|员工|EQ||
|N_EMPLOYEE_NAME_LIKE|员工|LIKE||
|N_ID_EQ|标识|EQ||
|N_IN_MODE_EQ|模式|EQ||
|N_OUT_MODE_EQ|输出模式|EQ||
|N_OVERTIME_STATUS_EQ|加班状态|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 加班审批-拒绝 | refusedOverTime | 拒绝 |单项数据|用户自定义|编辑页|
| 出勤审批-批量拒绝 | batchRefuse | 拒绝 |多项数据（主键）|<details><summary>后台调用</summary>[batchApproval](#行为)||
| 出勤审批-批量批准 | batchApprove | 批准 |多项数据（主键）|<details><summary>后台调用</summary>[batchApproval](#行为)||
| 加班审批-批准 | approveOverTime | 批准 |单项数据|用户自定义|编辑页|

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/hr/hr_attendance?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_attendance?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_attendance?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_attendance?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_attendance?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_attendance?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_attendance?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_attendance?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/hr/hr_attendance?id=界面行为`">
  界面行为
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'minor',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>