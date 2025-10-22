# 考勤规则(attendance_rule)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|智能匹配|AUTO_MATCH|是否逻辑||是||
|循环周期设置（大小周）|BIWEEKLY_CYCLE|[单项选择(文本值)](index/dictionary_index#cycle "循环周期")|60|是||
|考勤方式|CHECKIN_METHOD|[多项选择(文本值)](index/dictionary_index#checkin_method_type "考勤方式类型")|60|是||
|创建时间|CREATE_DATE|日期时间型||是||
|创建人|CREATE_UID|文本，可指定长度|100|是||
|默认免考勤|DEFAULT_FLAG|是否逻辑||是||
|默认班次标识|DEFAULT_SHIFT|文本，可指定长度|100|是||
|生效时间|EFFECT_TIME|日期时间型||是||
|弹性分钟数|ELASTIC_MINUTES|整型||是||
|是否启用弹性打卡|ELASTIC_VALID|真假逻辑||是||
|结束时间|FREE_END|时间型||是||
|实际最少出勤时长|FREE_MIN_MINUTES|整型||是||
|实际出勤次数|FREE_RATIO|[整型](index/dictionary_index#checkin_frequency "打卡次数")||是||
|开始时间|FREE_START|时间型||是||
|组排班数|GROUP_NUM|整型||是||
|节假日配置|HOLIDAY|多项选择(文本值)|2000|是||
|主键<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|倒班数|INVERSION_COUNT|[整型](index/dictionary_index#inversion_count "N班倒")||是||
|循环周期设置（N班倒）|INVERSION_CYCLE|[整型](index/dictionary_index#CycleWeeks "循环周数")|60|是||
|循环天数设置（N班倒）|INVERSION_DAYS|整型|60|是||
|是否激活|IS_ACTIVATE|是否逻辑||是||
|智能匹配判断结果|JUDGE_RESULT|文本，可指定长度|100|是||
|规则名称|NAME|文本，可指定长度|255|否||
|每日打卡要求|REQUIREMENT|[单项选择(文本值)](index/dictionary_index#attendance_policy "打卡要求")|100|是||
|休息天数（上A休B）|REST|整型||是||
|是否休息日相同|SAME_RESTDAY|[整型](index/dictionary_index#same_restday "是否休息日相同")|100|是||
|班次类型|SCHEDULE_TYPE|[单项选择(文本值)](index/dictionary_index#schedule_type "班次类型")|60|否||
|班次数量|SHIFT_NUM|[整型](index/dictionary_index#ShiftNum "班次数量")||是||
|成员总数|TOTAL_MEMBERS|文本，可指定长度|100|是||
|工作日(周期1)|WEEK1|[多项选择(文本值)](index/dictionary_index#Week1 "周期1")|100|是||
|工作日(周期2)|WEEK2|[多项选择(文本值)](index/dictionary_index#Week2 "周期2")|100|是||
|工作日(周期3)|WEEK3|[多项选择(文本值)](index/dictionary_index#Week3 "周期3")|100|是||
|工作日(周期4)|WEEK4|[多项选择(文本值)](index/dictionary_index#Week4 "周期4")|100|是||
|工作天数（上A休B）|WORK|整型||是||
|工作日(常规)|WORKDAY|[多项选择(文本值)](index/dictionary_index#Week1 "周期1")|100|是||
|上下班时间|WORK_TIME|文本，可指定长度|100|是||
|工作时段|WORK_TIMES|一对多动态对象|1048576|是||
|更新时间|WRITE_DATE|日期时间型||是||
|更新人|WRITE_UID|文本，可指定长度|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_ATTENDANCE_CHECKIN_DEVICE_ATTENDANCE_RULE_RULE_ID](der/DER1N_ATTENDANCE_CHECKIN_DEVICE_ATTENDANCE_RULE_RULE_ID)|[考勤设备关联(ATTENDANCE_CHECKIN_DEVICE)](module/attendance/attendance_checkin_device)|1:N关系||
|[DER1N_ATTENDANCE_GPS_LOCATION_ATTENDANCE_RULE_RULE_ID](der/DER1N_ATTENDANCE_GPS_LOCATION_ATTENDANCE_RULE_RULE_ID)|[GPS定位配置(ATTENDANCE_GPS_LOCATION)](module/attendance/attendance_gps_location)|1:N关系||
|[DER1N_ATTENDANCE_GROUP_SHIFT_ATTENDANCE_RULE_RULE_ID](der/DER1N_ATTENDANCE_GROUP_SHIFT_ATTENDANCE_RULE_RULE_ID)|[组排班(ATTENDANCE_GROUP_SHIFT)](module/attendance/attendance_group_shift)|1:N关系||
|[DER1N_ATTENDANCE_RECORD_ATTENDANCE_RULE_RULE_ID](der/DER1N_ATTENDANCE_RECORD_ATTENDANCE_RULE_RULE_ID)|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)|1:N关系||
|[DER1N_ATTENDANCE_SHIFT_ATTENDANCE_RULE_RULE_ID](der/DER1N_ATTENDANCE_SHIFT_ATTENDANCE_RULE_RULE_ID)|[班次(ATTENDANCE_SHIFT)](module/attendance/attendance_shift)|1:N关系||
|[DER1N_ATTENDANCE_WIFI_LOCATION_ATTENDANCE_RULE_RULE_ID](der/DER1N_ATTENDANCE_WIFI_LOCATION_ATTENDANCE_RULE_RULE_ID)|[WiFi定位配置(ATTENDANCE_WIFI_LOCATION)](module/attendance/attendance_wifi_location)|1:N关系||
|[DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID](der/DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID)|[工作日(ATTENDANCE_WORKDAY)](module/attendance/attendance_workday)|1:N关系||


</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持|[附加操作](index/action_logic_index#attendance_rule_Create)|||
|CreateTemp|CreateTemp|内置方法|默认|不支持||||
|CreateTempMajor|CreateTempMajor|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持|[附加操作](index/action_logic_index#attendance_rule_Get)|||
|GetDraft|GetDraft|内置方法|默认|不支持|[附加操作](index/action_logic_index#attendance_rule_GetDraft)|||
|GetDraftTemp|GetDraftTemp|内置方法|默认|不支持||||
|GetDraftTempMajor|GetDraftTempMajor|内置方法|默认|不支持||||
|GetTemp|GetTemp|内置方法|默认|不支持||||
|GetTempMajor|GetTempMajor|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持|[附加操作](index/action_logic_index#attendance_rule_Remove)|||
|RemoveTemp|RemoveTemp|内置方法|默认|支持||||
|RemoveTempMajor|RemoveTempMajor|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持|[附加操作](index/action_logic_index#attendance_rule_Update)|||
|UpdateTemp|UpdateTemp|内置方法|默认|不支持||||
|UpdateTempMajor|UpdateTempMajor|内置方法|默认|不支持||||
|更新组排班|changeGroups|[实体处理逻辑](module/attendance/attendance_rule/logic/updateGroups "更新组排班工作日")|默认|不支持||||
|定时执行补全排班|executeCompletion|[实体处理逻辑](module/attendance/attendance_rule/logic/executeCompletion3 "定时补充排班3")|默认|不支持||||
|定时执行激活规则|executionActivate|[实体处理逻辑](module/attendance/attendance_rule/logic/executeActivate "定时激活规则")|默认|不支持||||
|填充默认班次|fillDefaultShift|[实体处理逻辑](module/attendance/attendance_rule/logic/fillShift "填充默认班次")|默认|不支持||||
|填充组排班|fillGroupShift|[实体处理逻辑](module/attendance/attendance_rule/logic/fillGroupShift "填充组排班")|默认|不支持||||
|填充工作日|fillWorkDays|[实体处理逻辑](module/attendance/attendance_rule/logic/fillWorkDays "填充工作日")|默认|不支持||||
|判断人员是否已存在其他规则|judgingMember|用户自定义|默认|不支持||[JudgingDEActionRuntime](index/plugin_index#JudgingDEActionRuntime)||
|nothing|nothing|[实体处理逻辑](module/attendance/attendance_rule/logic/nothing "nothing")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[nothing](module/attendance/attendance_rule/logic/nothing)|nothing|无|||
|[创建/更新时清理工作日](module/attendance/attendance_rule/logic/cleanWorkdays)|cleanWorkdays|无|||
|[删除激活信息](module/attendance/attendance_rule/logic/deleteOtherInfo)|deleteOtherInfo|无|||
|[判断人员是否已存在其他规则](module/attendance/attendance_rule/logic/judgingMember)|judgingMember|无|||
|[判断生效](module/attendance/attendance_rule/logic/judgingEffect)|judgingEffect|无|||
|[同步删除Odoo相关](module/attendance/attendance_rule/logic/removeOdooData)|removeOdooData|无|||
|[填充工作日](module/attendance/attendance_rule/logic/fillWorkDays)|fillWorkDays|无|||
|[填充组排班](module/attendance/attendance_rule/logic/fillGroupShift)|fillGroupShift|无|||
|[填充默认班次](module/attendance/attendance_rule/logic/fillShift)|fillShift|无|||
|[完整规则](module/attendance/attendance_rule/logic/all)|all|无|||
|[定时激活规则](module/attendance/attendance_rule/logic/executeActivate)|executeActivate|无||每日0点执行|
|[定时补充排班](module/attendance/attendance_rule/logic/executeCompletion)|executeCompletion|无|||
|[定时补充排班3](module/attendance/attendance_rule/logic/executeCompletion3)|executeCompletion3|无||为已激活规则补全排班，每月1日执行，生成下个月排班|
|[更新组排班工作日](module/attendance/attendance_rule/logic/updateGroups)|updateGroups|无|||
|[激活规则](module/attendance/attendance_rule/logic/activeRule)|activeRule|无|||
|[生成Odoo公共节假日](module/attendance/attendance_rule/logic/generateHoliday)|generateHoliday|无||根据所勾选的节假日进行拷贝|
|[生成Odoo工作时间](module/attendance/attendance_rule/logic/generateOther)|generateOther|无|||
|[生成Odoo资源关联](module/attendance/attendance_rule/logic/generateResource)|generateResource|无|||
|[计算其他信息](module/attendance/attendance_rule/logic/calcOther)|calcOther|无||班次数量、自由班时间范围|
|[计算日历排班](module/attendance/attendance_rule/logic/attendance_scheduleCalendar)|attendance_scheduleCalendar|无|||
|[计算班次数量](module/attendance/attendance_rule/logic/calcShiftNum)|calcShiftNum|属性逻辑|||
|[计算组排班数量](module/attendance/attendance_rule/logic/calcGroupNum)|calcGroupNum|属性逻辑|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/attendance/attendance_rule/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/attendance/attendance_rule/query/View)|VIEW|否|否 |否 ||
|[需激活的规则(needActivate)](module/attendance/attendance_rule/query/needActivate)|needActivate|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[全部数据(ALL)](module/attendance/attendance_rule/dataset/ALL)|ALL|数据查询|否|||
|[日历排班(Calendar)](module/attendance/attendance_rule/dataset/Calendar)|Calendar|[实体逻辑](module/attendance/attendance_rule/logic/attendance_scheduleCalendar)|否|||
|[DEFAULT](module/attendance/attendance_rule/dataset/Default)|DEFAULT|数据查询|是|||
|[完整数据（含人数）(complete)](module/attendance/attendance_rule/dataset/complete)|complete|[实体逻辑](module/attendance/attendance_rule/logic/all)|否|||
|[全部数据(needActivate)](module/attendance/attendance_rule/dataset/needActivate)|needActivate|数据查询|否|||

## 数据权限

##### 全部数据（读） :id=attendance_rule-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我创建的（读写） :id=attendance_rule-CURDRAFTMAN_RW

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('CREATE_UID','=',#{srf.sessioncontext.srfpersonid})]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`
* `CREATE`
* `UPDATE`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_CYCLE_EQ|循环周期设置（大小周）|EQ||
|N_EFFECT_TIME_LTANDEQ|生效时间|LTANDEQ||
|N_ID_EQ|主键|EQ||
|N_INVERSION_CYCLE_EQ|循环周期设置（N班倒）|EQ||
|N_NAME_LIKE|规则名称|LIKE||
|N_SCHEDULE_TYPE_EQ|班次类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 添加人员 | addMembers | 添加人员 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[免考勤规则](app/view/attendance_rule_no_required_edit_view)</details>||
| 新建考勤规则 | CreateRule | 新建考勤规则 |无数据|<details><summary>打开视图或向导（模态）</summary>[考勤规则](app/view/attendance_rule_edit_view)</details>||
| 编辑排班 | edit | 编辑排班 |单项数据（主键）|<details><summary>打开视图或向导（模态）</summary>[考勤规则](app/view/attendance_rule_edit_view)</details>||
| 手动排班 | openSchedule | 手动排班 |无数据|<details><summary>打开视图或向导（模态）</summary>[排班](app/view/attendance_schedule_overview_grid_view)</details>||
| 刷新关系页 | refreshRe | refreshRe |无数据|用户自定义||
| 打开默认班次编辑视图 | openDefaultShit | 打开默认班次 |无数据|<details><summary>打开视图或向导（模态）</summary>[上下班时间](app/view/attendance_shift_default_shift_view)</details>||
| 保存规则 | save | 保存规则 |单项数据|<details><summary>打开视图或向导（模态）</summary>[保存考勤规则](app/view/attendance_rule_active_option_view)</details>||
| 删除 | remove | 删除 |单项数据（主键）|<details><summary>后台调用</summary>[Remove](#行为)||

## 界面逻辑
|  中文名col200 | 代码名col150 | 备注col900 |
| --------|--------|--------|
|[清空临时数据](module/attendance/attendance_rule/uilogic/cleanTemp)|cleanTemp||
|[自动保存](module/attendance/attendance_rule/uilogic/auto_save)|auto_save|自动保存页面|

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/attendance/attendance_rule?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_rule?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_rule?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_rule?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_rule?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_rule?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_rule?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_rule?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_rule?id=界面行为`">
  界面行为
</el-anchor-link>
<el-anchor-link :href="`#/module/attendance/attendance_rule?id=界面逻辑`">
  界面逻辑
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