# 考勤规则(attendance_rule) :id=attendance_rule
## 创建考勤规则

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}

```

## 获取考勤规则

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|




##### 响应示例： {docsify-ignore}
```json

{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}

```

## 删除考勤规则

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|





## 更新考勤规则

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}

```

## 更新组排班

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/change_groups" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```



## 检查考勤规则主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 定时执行补全排班

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/execute_completion" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```



## 定时执行激活规则

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/execution_activate" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```



## 填充默认班次

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/fill_default_shift" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```



## 填充组排班

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/fill_group_shift" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```



## 填充工作日

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/fill_work_days" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```



## 获取考勤规则草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}

```

## 判断人员是否已存在其他规则

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/judging_member" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}

```

## 保存考勤规则

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">requirement</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|每日打卡要求|
|<el-row justify="space-between"><el-col :span="20">auto_match</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|智能匹配|
|<el-row justify="space-between"><el-col :span="20">week1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期1)|
|<el-row justify="space-between"><el-col :span="20">week2</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期2)|
|<el-row justify="space-between"><el-col :span="20">week3</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期3)|
|<el-row justify="space-between"><el-col :span="20">week4</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(周期4)|
|<el-row justify="space-between"><el-col :span="20">workday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作日(常规)|
|<el-row justify="space-between"><el-col :span="20">work_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|上下班时间|
|<el-row justify="space-between"><el-col :span="20">biweekly_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">inversion_cycle</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">inversion_days</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环天数设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">effect_time</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">work</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|工作天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">rest</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|休息天数（上A休B）|
|<el-row justify="space-between"><el-col :span="20">same_restday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否休息日相同|
|<el-row justify="space-between"><el-col :span="20">inversion_count</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|倒班数|
|<el-row justify="space-between"><el-col :span="20">default_shift</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|默认班次标识|
|<el-row justify="space-between"><el-col :span="20">judge_result</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|智能匹配判断结果|
|<el-row justify="space-between"><el-col :span="20">total_members</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|成员总数|
|<el-row justify="space-between"><el-col :span="20">shift_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|班次数量|
|<el-row justify="space-between"><el-col :span="20">is_activate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否激活|
|<el-row justify="space-between"><el-col :span="20">group_num</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|组排班数|
|<el-row justify="space-between"><el-col :span="20">holiday</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|节假日配置|
|<el-row justify="space-between"><el-col :span="20">free_ratio</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际出勤次数|
|<el-row justify="space-between"><el-col :span="20">free_min_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|实际最少出勤时长|
|<el-row justify="space-between"><el-col :span="20">default_flag</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|默认免考勤|
|<el-row justify="space-between"><el-col :span="20">work_times</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|工作时段|
|<el-row justify="space-between"><el-col :span="20">checkin_method</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤方式|
|<el-row justify="space-between"><el-col :span="20">elastic_minutes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|弹性分钟数|
|<el-row justify="space-between"><el-col :span="20">elastic_valid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否启用弹性打卡|
|<el-row justify="space-between"><el-col :span="20">free_end</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|结束时间|
|<el-row justify="space-between"><el-col :span="20">free_start</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|开始时间|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">schedule_type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|班次类型|
|<el-row justify="space-between"><el-col :span="20">write_uid</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|更新人|
|<el-row justify="space-between"><el-col :span="20">devices</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">gps_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">group_shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">shifts</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">wifi_list</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|
|<el-row justify="space-between"><el-col :span="20">workdays</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Object|null|



##### 请求示例： {docsify-ignore}
```json
{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "requirement" : null,
  "auto_match" : null,
  "week1" : null,
  "week2" : null,
  "week3" : null,
  "week4" : null,
  "workday" : null,
  "work_time" : null,
  "biweekly_cycle" : null,
  "inversion_cycle" : null,
  "inversion_days" : null,
  "effect_time" : null,
  "work" : null,
  "rest" : null,
  "same_restday" : null,
  "inversion_count" : null,
  "default_shift" : null,
  "judge_result" : null,
  "total_members" : null,
  "shift_num" : null,
  "is_activate" : null,
  "group_num" : null,
  "holiday" : null,
  "free_ratio" : null,
  "free_min_minutes" : null,
  "default_flag" : null,
  "work_times" : null,
  "checkin_method" : null,
  "create_date" : null,
  "create_uid" : null,
  "elastic_minutes" : null,
  "elastic_valid" : null,
  "free_end" : null,
  "free_start" : null,
  "id" : null,
  "name" : null,
  "schedule_type" : null,
  "write_date" : null,
  "write_uid" : null,
  "devices" : null,
  "gps_list" : null,
  "group_shifts" : null,
  "shifts" : null,
  "wifi_list" : null,
  "workdays" : null,
}

```

## 全部数据

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/fetch_all" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_cycle_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">n_effect_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_inversion_cycle_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">n_schedule_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_cycle_eq" : null,
  "n_effect_time_ltandeq" : null,
  "n_id_eq" : null,
  "n_inversion_cycle_eq" : null,
  "n_name_like" : null,
  "n_schedule_type_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "requirement" : null,
    "auto_match" : null,
    "week1" : null,
    "week2" : null,
    "week3" : null,
    "week4" : null,
    "workday" : null,
    "work_time" : null,
    "biweekly_cycle" : null,
    "inversion_cycle" : null,
    "inversion_days" : null,
    "effect_time" : null,
    "work" : null,
    "rest" : null,
    "same_restday" : null,
    "inversion_count" : null,
    "default_shift" : null,
    "judge_result" : null,
    "total_members" : null,
    "shift_num" : null,
    "is_activate" : null,
    "group_num" : null,
    "holiday" : null,
    "free_ratio" : null,
    "free_min_minutes" : null,
    "default_flag" : null,
    "work_times" : null,
    "checkin_method" : null,
    "create_date" : null,
    "create_uid" : null,
    "elastic_minutes" : null,
    "elastic_valid" : null,
    "free_end" : null,
    "free_start" : null,
    "id" : null,
    "name" : null,
    "schedule_type" : null,
    "write_date" : null,
    "write_uid" : null,
    "devices" : null,
    "gps_list" : null,
    "group_shifts" : null,
    "shifts" : null,
    "wifi_list" : null,
    "workdays" : null,
  }
]
```

## 日历排班

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/fetch_calendar" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_cycle_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">n_effect_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_inversion_cycle_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">n_schedule_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_cycle_eq" : null,
  "n_effect_time_ltandeq" : null,
  "n_id_eq" : null,
  "n_inversion_cycle_eq" : null,
  "n_name_like" : null,
  "n_schedule_type_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "requirement" : null,
    "auto_match" : null,
    "week1" : null,
    "week2" : null,
    "week3" : null,
    "week4" : null,
    "workday" : null,
    "work_time" : null,
    "biweekly_cycle" : null,
    "inversion_cycle" : null,
    "inversion_days" : null,
    "effect_time" : null,
    "work" : null,
    "rest" : null,
    "same_restday" : null,
    "inversion_count" : null,
    "default_shift" : null,
    "judge_result" : null,
    "total_members" : null,
    "shift_num" : null,
    "is_activate" : null,
    "group_num" : null,
    "holiday" : null,
    "free_ratio" : null,
    "free_min_minutes" : null,
    "default_flag" : null,
    "work_times" : null,
    "checkin_method" : null,
    "create_date" : null,
    "create_uid" : null,
    "elastic_minutes" : null,
    "elastic_valid" : null,
    "free_end" : null,
    "free_start" : null,
    "id" : null,
    "name" : null,
    "schedule_type" : null,
    "write_date" : null,
    "write_uid" : null,
    "devices" : null,
    "gps_list" : null,
    "group_shifts" : null,
    "shifts" : null,
    "wifi_list" : null,
    "workdays" : null,
  }
]
```

## 完整数据（含人数）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/fetch_complete" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_cycle_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">n_effect_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_inversion_cycle_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">n_schedule_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_cycle_eq" : null,
  "n_effect_time_ltandeq" : null,
  "n_id_eq" : null,
  "n_inversion_cycle_eq" : null,
  "n_name_like" : null,
  "n_schedule_type_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "requirement" : null,
    "auto_match" : null,
    "week1" : null,
    "week2" : null,
    "week3" : null,
    "week4" : null,
    "workday" : null,
    "work_time" : null,
    "biweekly_cycle" : null,
    "inversion_cycle" : null,
    "inversion_days" : null,
    "effect_time" : null,
    "work" : null,
    "rest" : null,
    "same_restday" : null,
    "inversion_count" : null,
    "default_shift" : null,
    "judge_result" : null,
    "total_members" : null,
    "shift_num" : null,
    "is_activate" : null,
    "group_num" : null,
    "holiday" : null,
    "free_ratio" : null,
    "free_min_minutes" : null,
    "default_flag" : null,
    "work_times" : null,
    "checkin_method" : null,
    "create_date" : null,
    "create_uid" : null,
    "elastic_minutes" : null,
    "elastic_valid" : null,
    "free_end" : null,
    "free_start" : null,
    "id" : null,
    "name" : null,
    "schedule_type" : null,
    "write_date" : null,
    "write_uid" : null,
    "devices" : null,
    "gps_list" : null,
    "group_shifts" : null,
    "shifts" : null,
    "wifi_list" : null,
    "workdays" : null,
  }
]
```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_cycle_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">n_effect_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_inversion_cycle_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">n_schedule_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_cycle_eq" : null,
  "n_effect_time_ltandeq" : null,
  "n_id_eq" : null,
  "n_inversion_cycle_eq" : null,
  "n_name_like" : null,
  "n_schedule_type_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "requirement" : null,
    "auto_match" : null,
    "week1" : null,
    "week2" : null,
    "week3" : null,
    "week4" : null,
    "workday" : null,
    "work_time" : null,
    "biweekly_cycle" : null,
    "inversion_cycle" : null,
    "inversion_days" : null,
    "effect_time" : null,
    "work" : null,
    "rest" : null,
    "same_restday" : null,
    "inversion_count" : null,
    "default_shift" : null,
    "judge_result" : null,
    "total_members" : null,
    "shift_num" : null,
    "is_activate" : null,
    "group_num" : null,
    "holiday" : null,
    "free_ratio" : null,
    "free_min_minutes" : null,
    "default_flag" : null,
    "work_times" : null,
    "checkin_method" : null,
    "create_date" : null,
    "create_uid" : null,
    "elastic_minutes" : null,
    "elastic_valid" : null,
    "free_end" : null,
    "free_start" : null,
    "id" : null,
    "name" : null,
    "schedule_type" : null,
    "write_date" : null,
    "write_uid" : null,
    "devices" : null,
    "gps_list" : null,
    "group_shifts" : null,
    "shifts" : null,
    "wifi_list" : null,
    "workdays" : null,
  }
]
```

## 全部数据

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/fetch_need_activate" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_cycle_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|循环周期设置（大小周）|
|<el-row justify="space-between"><el-col :span="20">n_effect_time_ltandeq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|生效时间|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_inversion_cycle_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环周期设置（N班倒）|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|规则名称|
|<el-row justify="space-between"><el-col :span="20">n_schedule_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|班次类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_cycle_eq" : null,
  "n_effect_time_ltandeq" : null,
  "n_id_eq" : null,
  "n_inversion_cycle_eq" : null,
  "n_name_like" : null,
  "n_schedule_type_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "requirement" : null,
    "auto_match" : null,
    "week1" : null,
    "week2" : null,
    "week3" : null,
    "week4" : null,
    "workday" : null,
    "work_time" : null,
    "biweekly_cycle" : null,
    "inversion_cycle" : null,
    "inversion_days" : null,
    "effect_time" : null,
    "work" : null,
    "rest" : null,
    "same_restday" : null,
    "inversion_count" : null,
    "default_shift" : null,
    "judge_result" : null,
    "total_members" : null,
    "shift_num" : null,
    "is_activate" : null,
    "group_num" : null,
    "holiday" : null,
    "free_ratio" : null,
    "free_min_minutes" : null,
    "default_flag" : null,
    "work_times" : null,
    "checkin_method" : null,
    "create_date" : null,
    "create_uid" : null,
    "elastic_minutes" : null,
    "elastic_valid" : null,
    "free_end" : null,
    "free_start" : null,
    "id" : null,
    "name" : null,
    "schedule_type" : null,
    "write_date" : null,
    "write_uid" : null,
    "devices" : null,
    "gps_list" : null,
    "group_shifts" : null,
    "shifts" : null,
    "wifi_list" : null,
    "workdays" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/importtemplate" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |



## 数据导出

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/exportdata/{param},/attendance_rules/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|param|String|导出集合方法名称|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|srfexporttag|String|导出模板标识|

##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|page|Integer|page|
|size|Integer|分页大小|
|n_xxx_eq|String|过滤参数|


## 数据导入

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/importdata" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 数据导入（返回错误excel）

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/importdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |

##### 请求参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| file | file | 导入数据文具 |

## 自定义表头导入（异步）
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/asyncimportdata2" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfimporttag | String | 导入标识 |
| srfossfileid | String | 导入文件 |
| srfimportschemaid | String | 表头定义 |


## 数据打印
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/printdata/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|数据主键|

##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfprinttag | String | 打印标识 |
| srfcontenttype | String | 打印类型 |



## 报表打印

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_rules/report" type="info" :closable="false" ></el-alert>
</div>
</el-row>


##### 查询参数 {docsify-ignore}

|字段col300|类型col150|备注col400|
|---|---|----|
| srfreporttag | String | 报表标识 |
| srfcontenttype | String | 报表类型 |




<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    },
    methods: {

    }
  }).use(ElementPlus).mount('#app')
</script>