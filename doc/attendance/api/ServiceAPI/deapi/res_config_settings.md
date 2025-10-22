# 配置设定(res_config_settings) :id=res_config_settings
## 创建配置设定

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_use_pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工pin|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端网址|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_delay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自助考勤终端延迟|
|<el-row justify="space-between"><el-col :span="20">attendance_barcode_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">attendance_from_systray</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|来自 Systray 的出席情况|
|<el-row justify="space-between"><el-col :span="20">attendance_overtime_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "attendance_kiosk_use_pin" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_delay" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_overtime_validation" : null,
  "id" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attendance_kiosk_use_pin" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_delay" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_overtime_validation" : null,
  "id" : null,
}

```

## 获取配置设定

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|




##### 响应示例： {docsify-ignore}
```json

{
  "attendance_kiosk_use_pin" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_delay" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_overtime_validation" : null,
  "id" : null,
}

```

## 删除配置设定

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新配置设定

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_use_pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工pin|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端网址|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_delay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自助考勤终端延迟|
|<el-row justify="space-between"><el-col :span="20">attendance_barcode_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">attendance_from_systray</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|来自 Systray 的出席情况|
|<el-row justify="space-between"><el-col :span="20">attendance_overtime_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "attendance_kiosk_use_pin" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_delay" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_overtime_validation" : null,
  "id" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attendance_kiosk_use_pin" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_delay" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_overtime_validation" : null,
  "id" : null,
}

```

## 检查配置设定主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_use_pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工pin|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端网址|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_delay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自助考勤终端延迟|
|<el-row justify="space-between"><el-col :span="20">attendance_barcode_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">attendance_from_systray</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|来自 Systray 的出席情况|
|<el-row justify="space-between"><el-col :span="20">attendance_overtime_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "attendance_kiosk_use_pin" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_delay" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_overtime_validation" : null,
  "id" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取配置设定草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_use_pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工pin|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端网址|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_delay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自助考勤终端延迟|
|<el-row justify="space-between"><el-col :span="20">attendance_barcode_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">attendance_from_systray</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|来自 Systray 的出席情况|
|<el-row justify="space-between"><el-col :span="20">attendance_overtime_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "attendance_kiosk_use_pin" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_delay" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_overtime_validation" : null,
  "id" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attendance_kiosk_use_pin" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_delay" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_overtime_validation" : null,
  "id" : null,
}

```

## 保存配置设定

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_use_pin</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|员工pin|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|自助考勤终端网址|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_mode</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">attendance_kiosk_delay</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|自助考勤终端延迟|
|<el-row justify="space-between"><el-col :span="20">attendance_barcode_source</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">attendance_from_systray</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|来自 Systray 的出席情况|
|<el-row justify="space-between"><el-col :span="20">attendance_overtime_validation</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "attendance_kiosk_use_pin" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_delay" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_overtime_validation" : null,
  "id" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "attendance_kiosk_use_pin" : null,
  "attendance_kiosk_url" : null,
  "attendance_kiosk_mode" : null,
  "attendance_kiosk_delay" : null,
  "attendance_barcode_source" : null,
  "attendance_from_systray" : null,
  "attendance_overtime_validation" : null,
  "id" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_attendance_barcode_source_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|条码来源|
|<el-row justify="space-between"><el-col :span="20">n_attendance_kiosk_mode_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|考勤模式|
|<el-row justify="space-between"><el-col :span="20">n_attendance_overtime_validation_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|额外工时验证|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_attendance_barcode_source_eq" : null,
  "n_attendance_kiosk_mode_eq" : null,
  "n_attendance_overtime_validation_eq" : null,
  "n_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "attendance_kiosk_use_pin" : null,
    "attendance_kiosk_url" : null,
    "attendance_kiosk_mode" : null,
    "attendance_kiosk_delay" : null,
    "attendance_barcode_source" : null,
    "attendance_from_systray" : null,
    "attendance_overtime_validation" : null,
    "id" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_config_settings/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/exportdata/{param},/res_config_settings/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_config_settings/report" type="info" :closable="false" ></el-alert>
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