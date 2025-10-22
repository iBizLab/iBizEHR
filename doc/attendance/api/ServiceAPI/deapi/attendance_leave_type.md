# 假期类型(attendance_leave_type) :id=attendance_leave_type
## 创建假期类型

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_leave_types" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">day_to_hour</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|假期余额换算|
|<el-row justify="space-between"><el-col :span="20">period_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请限制周期|
|<el-row justify="space-between"><el-col :span="20">period_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|天数/申请限制周期|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|适用部门ID|
|<el-row justify="space-between"><el-col :span="20">all_company</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|全公司适用|
|<el-row justify="space-between"><el-col :span="20">ask_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请单位|
|<el-row justify="space-between"><el-col :span="20">calculate_way</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计算方式|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">is_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否默认|
|<el-row justify="space-between"><el-col :span="20">max_apply_day</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|是否限制最大申请天数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|状态|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型标识|
|<el-row justify="space-between"><el-col :span="20">unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单位|
|<el-row justify="space-between"><el-col :span="20">with_salary</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|是否带薪|



##### 请求示例： {docsify-ignore}
```json
{
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "day_to_hour" : null,
  "period_from" : null,
  "period_to" : null,
  "dept_id" : null,
  "all_company" : null,
  "ask_unit" : null,
  "calculate_way" : null,
  "id" : null,
  "is_default" : null,
  "max_apply_day" : null,
  "name" : null,
  "status" : null,
  "type" : null,
  "unit" : null,
  "with_salary" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "day_to_hour" : null,
  "period_from" : null,
  "period_to" : null,
  "dept_id" : null,
  "all_company" : null,
  "ask_unit" : null,
  "calculate_way" : null,
  "id" : null,
  "is_default" : null,
  "max_apply_day" : null,
  "name" : null,
  "status" : null,
  "type" : null,
  "unit" : null,
  "with_salary" : null,
}

```

## 获取假期类型

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_leave_types/{key}" type="info" :closable="false" ></el-alert>
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
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "day_to_hour" : null,
  "period_from" : null,
  "period_to" : null,
  "dept_id" : null,
  "all_company" : null,
  "ask_unit" : null,
  "calculate_way" : null,
  "id" : null,
  "is_default" : null,
  "max_apply_day" : null,
  "name" : null,
  "status" : null,
  "type" : null,
  "unit" : null,
  "with_salary" : null,
}

```

## 删除假期类型

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_leave_types/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|





## 更新假期类型

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_leave_types/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">day_to_hour</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|假期余额换算|
|<el-row justify="space-between"><el-col :span="20">period_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请限制周期|
|<el-row justify="space-between"><el-col :span="20">period_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|天数/申请限制周期|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|适用部门ID|
|<el-row justify="space-between"><el-col :span="20">all_company</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|全公司适用|
|<el-row justify="space-between"><el-col :span="20">ask_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请单位|
|<el-row justify="space-between"><el-col :span="20">calculate_way</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计算方式|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">is_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否默认|
|<el-row justify="space-between"><el-col :span="20">max_apply_day</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|是否限制最大申请天数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|状态|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型标识|
|<el-row justify="space-between"><el-col :span="20">unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单位|
|<el-row justify="space-between"><el-col :span="20">with_salary</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|是否带薪|



##### 请求示例： {docsify-ignore}
```json
{
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "day_to_hour" : null,
  "period_from" : null,
  "period_to" : null,
  "dept_id" : null,
  "all_company" : null,
  "ask_unit" : null,
  "calculate_way" : null,
  "id" : null,
  "is_default" : null,
  "max_apply_day" : null,
  "name" : null,
  "status" : null,
  "type" : null,
  "unit" : null,
  "with_salary" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "day_to_hour" : null,
  "period_from" : null,
  "period_to" : null,
  "dept_id" : null,
  "all_company" : null,
  "ask_unit" : null,
  "calculate_way" : null,
  "id" : null,
  "is_default" : null,
  "max_apply_day" : null,
  "name" : null,
  "status" : null,
  "type" : null,
  "unit" : null,
  "with_salary" : null,
}

```

## 检查假期类型主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_leave_types/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">day_to_hour</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|假期余额换算|
|<el-row justify="space-between"><el-col :span="20">period_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请限制周期|
|<el-row justify="space-between"><el-col :span="20">period_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|天数/申请限制周期|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|适用部门ID|
|<el-row justify="space-between"><el-col :span="20">all_company</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|全公司适用|
|<el-row justify="space-between"><el-col :span="20">ask_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请单位|
|<el-row justify="space-between"><el-col :span="20">calculate_way</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计算方式|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">is_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否默认|
|<el-row justify="space-between"><el-col :span="20">max_apply_day</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|是否限制最大申请天数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|状态|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型标识|
|<el-row justify="space-between"><el-col :span="20">unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单位|
|<el-row justify="space-between"><el-col :span="20">with_salary</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|是否带薪|



##### 请求示例： {docsify-ignore}
```json
{
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "day_to_hour" : null,
  "period_from" : null,
  "period_to" : null,
  "dept_id" : null,
  "all_company" : null,
  "ask_unit" : null,
  "calculate_way" : null,
  "id" : null,
  "is_default" : null,
  "max_apply_day" : null,
  "name" : null,
  "status" : null,
  "type" : null,
  "unit" : null,
  "with_salary" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取假期类型草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_leave_types/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">day_to_hour</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|假期余额换算|
|<el-row justify="space-between"><el-col :span="20">period_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请限制周期|
|<el-row justify="space-between"><el-col :span="20">period_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|天数/申请限制周期|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|适用部门ID|
|<el-row justify="space-between"><el-col :span="20">all_company</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|全公司适用|
|<el-row justify="space-between"><el-col :span="20">ask_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请单位|
|<el-row justify="space-between"><el-col :span="20">calculate_way</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计算方式|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">is_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否默认|
|<el-row justify="space-between"><el-col :span="20">max_apply_day</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|是否限制最大申请天数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|状态|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型标识|
|<el-row justify="space-between"><el-col :span="20">unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单位|
|<el-row justify="space-between"><el-col :span="20">with_salary</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|是否带薪|



##### 请求示例： {docsify-ignore}
```json
{
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "day_to_hour" : null,
  "period_from" : null,
  "period_to" : null,
  "dept_id" : null,
  "all_company" : null,
  "ask_unit" : null,
  "calculate_way" : null,
  "id" : null,
  "is_default" : null,
  "max_apply_day" : null,
  "name" : null,
  "status" : null,
  "type" : null,
  "unit" : null,
  "with_salary" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "day_to_hour" : null,
  "period_from" : null,
  "period_to" : null,
  "dept_id" : null,
  "all_company" : null,
  "ask_unit" : null,
  "calculate_way" : null,
  "id" : null,
  "is_default" : null,
  "max_apply_day" : null,
  "name" : null,
  "status" : null,
  "type" : null,
  "unit" : null,
  "with_salary" : null,
}

```

## 保存假期类型

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_leave_types/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">day_to_hour</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|假期余额换算|
|<el-row justify="space-between"><el-col :span="20">period_from</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请限制周期|
|<el-row justify="space-between"><el-col :span="20">period_to</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|天数/申请限制周期|
|<el-row justify="space-between"><el-col :span="20">dept_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|适用部门ID|
|<el-row justify="space-between"><el-col :span="20">all_company</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|全公司适用|
|<el-row justify="space-between"><el-col :span="20">ask_unit</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|申请单位|
|<el-row justify="space-between"><el-col :span="20">calculate_way</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|计算方式|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">is_default</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是否默认|
|<el-row justify="space-between"><el-col :span="20">max_apply_day</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|是否限制最大申请天数|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|状态|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|类型标识|
|<el-row justify="space-between"><el-col :span="20">unit</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|单位|
|<el-row justify="space-between"><el-col :span="20">with_salary</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|Integer|是否带薪|



##### 请求示例： {docsify-ignore}
```json
{
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "day_to_hour" : null,
  "period_from" : null,
  "period_to" : null,
  "dept_id" : null,
  "all_company" : null,
  "ask_unit" : null,
  "calculate_way" : null,
  "id" : null,
  "is_default" : null,
  "max_apply_day" : null,
  "name" : null,
  "status" : null,
  "type" : null,
  "unit" : null,
  "with_salary" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "create_uid" : null,
  "create_date" : null,
  "write_uid" : null,
  "write_date" : null,
  "day_to_hour" : null,
  "period_from" : null,
  "period_to" : null,
  "dept_id" : null,
  "all_company" : null,
  "ask_unit" : null,
  "calculate_way" : null,
  "id" : null,
  "is_default" : null,
  "max_apply_day" : null,
  "name" : null,
  "status" : null,
  "type" : null,
  "unit" : null,
  "with_salary" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_leave_types/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_ask_unit_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请单位|
|<el-row justify="space-between"><el-col :span="20">n_calculate_way_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|计算方式|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|主键|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_period_from_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|申请限制周期|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_ask_unit_eq" : null,
  "n_calculate_way_eq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_period_from_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "create_uid" : null,
    "create_date" : null,
    "write_uid" : null,
    "write_date" : null,
    "day_to_hour" : null,
    "period_from" : null,
    "period_to" : null,
    "dept_id" : null,
    "all_company" : null,
    "ask_unit" : null,
    "calculate_way" : null,
    "id" : null,
    "is_default" : null,
    "max_apply_day" : null,
    "name" : null,
    "status" : null,
    "type" : null,
    "unit" : null,
    "with_salary" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/attendance_leave_types/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_leave_types/exportdata/{param},/attendance_leave_types/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_leave_types/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_leave_types/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_leave_types/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_leave_types/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/attendance_leave_types/report" type="info" :closable="false" ></el-alert>
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