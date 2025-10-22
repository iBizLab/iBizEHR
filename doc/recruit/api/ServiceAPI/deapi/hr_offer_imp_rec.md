# 导入记录(hr_offer_imp_rec) :id=hr_offer_imp_rec
## 创建导入记录

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offer_imp_recs" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|第三方系统|
|<el-row justify="space-between"><el-col :span="20">imp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入时间|
|<el-row justify="space-between"><el-col :span="20">operator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作人|
|<el-row justify="space-between"><el-col :span="20">imp_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入阶段|
|<el-row justify="space-between"><el-col :span="20">imp_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入状态|
|<el-row justify="space-between"><el-col :span="20">hr_offer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer标识|
|<el-row justify="space-between"><el-col :span="20">hr_offer_imp_rec_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|导入记录标识|
|<el-row justify="space-between"><el-col :span="20">hr_offer_imp_rec_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入记录名称|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "system" : null,
  "imp_date" : null,
  "operator" : null,
  "imp_stage" : null,
  "imp_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_offer_id" : null,
  "hr_offer_imp_rec_id" : null,
  "hr_offer_imp_rec_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "system" : null,
  "imp_date" : null,
  "operator" : null,
  "imp_stage" : null,
  "imp_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_offer_id" : null,
  "hr_offer_imp_rec_id" : null,
  "hr_offer_imp_rec_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取导入记录

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offer_imp_recs/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|导入记录标识|




##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "system" : null,
  "imp_date" : null,
  "operator" : null,
  "imp_stage" : null,
  "imp_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_offer_id" : null,
  "hr_offer_imp_rec_id" : null,
  "hr_offer_imp_rec_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除导入记录

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offer_imp_recs/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|导入记录标识|





## 更新导入记录

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offer_imp_recs/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|导入记录标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|第三方系统|
|<el-row justify="space-between"><el-col :span="20">imp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入时间|
|<el-row justify="space-between"><el-col :span="20">operator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作人|
|<el-row justify="space-between"><el-col :span="20">imp_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入阶段|
|<el-row justify="space-between"><el-col :span="20">imp_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入状态|
|<el-row justify="space-between"><el-col :span="20">hr_offer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer标识|
|<el-row justify="space-between"><el-col :span="20">hr_offer_imp_rec_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|导入记录标识|
|<el-row justify="space-between"><el-col :span="20">hr_offer_imp_rec_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入记录名称|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "system" : null,
  "imp_date" : null,
  "operator" : null,
  "imp_stage" : null,
  "imp_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_offer_id" : null,
  "hr_offer_imp_rec_id" : null,
  "hr_offer_imp_rec_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "system" : null,
  "imp_date" : null,
  "operator" : null,
  "imp_stage" : null,
  "imp_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_offer_id" : null,
  "hr_offer_imp_rec_id" : null,
  "hr_offer_imp_rec_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查导入记录主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offer_imp_recs/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|第三方系统|
|<el-row justify="space-between"><el-col :span="20">imp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入时间|
|<el-row justify="space-between"><el-col :span="20">operator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作人|
|<el-row justify="space-between"><el-col :span="20">imp_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入阶段|
|<el-row justify="space-between"><el-col :span="20">imp_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入状态|
|<el-row justify="space-between"><el-col :span="20">hr_offer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer标识|
|<el-row justify="space-between"><el-col :span="20">hr_offer_imp_rec_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|导入记录标识|
|<el-row justify="space-between"><el-col :span="20">hr_offer_imp_rec_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入记录名称|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "system" : null,
  "imp_date" : null,
  "operator" : null,
  "imp_stage" : null,
  "imp_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_offer_id" : null,
  "hr_offer_imp_rec_id" : null,
  "hr_offer_imp_rec_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取导入记录草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offer_imp_recs/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|第三方系统|
|<el-row justify="space-between"><el-col :span="20">imp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入时间|
|<el-row justify="space-between"><el-col :span="20">operator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作人|
|<el-row justify="space-between"><el-col :span="20">imp_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入阶段|
|<el-row justify="space-between"><el-col :span="20">imp_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入状态|
|<el-row justify="space-between"><el-col :span="20">hr_offer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer标识|
|<el-row justify="space-between"><el-col :span="20">hr_offer_imp_rec_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|导入记录标识|
|<el-row justify="space-between"><el-col :span="20">hr_offer_imp_rec_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入记录名称|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "system" : null,
  "imp_date" : null,
  "operator" : null,
  "imp_stage" : null,
  "imp_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_offer_id" : null,
  "hr_offer_imp_rec_id" : null,
  "hr_offer_imp_rec_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "system" : null,
  "imp_date" : null,
  "operator" : null,
  "imp_stage" : null,
  "imp_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_offer_id" : null,
  "hr_offer_imp_rec_id" : null,
  "hr_offer_imp_rec_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存导入记录

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offer_imp_recs/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">system</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|第三方系统|
|<el-row justify="space-between"><el-col :span="20">imp_date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入时间|
|<el-row justify="space-between"><el-col :span="20">operator</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|操作人|
|<el-row justify="space-between"><el-col :span="20">imp_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入阶段|
|<el-row justify="space-between"><el-col :span="20">imp_status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入状态|
|<el-row justify="space-between"><el-col :span="20">hr_offer_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer标识|
|<el-row justify="space-between"><el-col :span="20">hr_offer_imp_rec_id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|导入记录标识|
|<el-row justify="space-between"><el-col :span="20">hr_offer_imp_rec_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入记录名称|



##### 请求示例： {docsify-ignore}
```json
{
  "name" : null,
  "system" : null,
  "imp_date" : null,
  "operator" : null,
  "imp_stage" : null,
  "imp_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_offer_id" : null,
  "hr_offer_imp_rec_id" : null,
  "hr_offer_imp_rec_name" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "name" : null,
  "system" : null,
  "imp_date" : null,
  "operator" : null,
  "imp_stage" : null,
  "imp_status" : null,
  "create_date" : null,
  "create_uid" : null,
  "hr_offer_id" : null,
  "hr_offer_imp_rec_id" : null,
  "hr_offer_imp_rec_name" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offer_imp_recs/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_hr_offer_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|offer标识|
|<el-row justify="space-between"><el-col :span="20">n_hr_offer_imp_recid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入记录标识|
|<el-row justify="space-between"><el-col :span="20">n_hr_offer_imp_recname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|导入记录名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_hr_offer_id_eq" : null,
  "n_hr_offer_imp_recid_eq" : null,
  "n_hr_offer_imp_recname_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "name" : null,
    "system" : null,
    "imp_date" : null,
    "operator" : null,
    "imp_stage" : null,
    "imp_status" : null,
    "create_date" : null,
    "create_uid" : null,
    "hr_offer_id" : null,
    "hr_offer_imp_rec_id" : null,
    "hr_offer_imp_rec_name" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_offer_imp_recs/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offer_imp_recs/exportdata/{param},/hr_offer_imp_recs/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offer_imp_recs/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offer_imp_recs/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offer_imp_recs/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offer_imp_recs/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_offer_imp_recs/report" type="info" :closable="false" ></el-alert>
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