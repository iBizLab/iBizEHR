# 组织(res_company) :id=res_company
## 创建组织

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|编码|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|大类|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|虚拟组织|
|<el-row justify="space-between"><el-col :span="20">level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|层级|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网址|
|<el-row justify="space-between"><el-col :span="20">telephone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">short_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简称|
|<el-row justify="space-between"><el-col :span="20">company_createdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|设立日期|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文号|
|<el-row justify="space-between"><el-col :span="20">management_sort</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|行政维度序号|
|<el-row justify="space-between"><el-col :span="20">business_sort</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|业务维度序号|
|<el-row justify="space-between"><el-col :span="20">business_parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务维度上级|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地点|
|<el-row justify="space-between"><el-col :span="20">company_details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简介|
|<el-row justify="space-between"><el-col :span="20">hrbp_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|hrbp|
|<el-row justify="space-between"><el-col :span="20">management_parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行政维度上级|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">manager_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "category" : null,
  "type" : null,
  "is_virtual" : null,
  "level" : null,
  "website" : null,
  "telephone" : null,
  "short_name" : null,
  "company_createdate" : null,
  "code" : null,
  "management_sort" : null,
  "business_sort" : null,
  "business_parent_id" : null,
  "city" : null,
  "company_details" : null,
  "create_date" : null,
  "create_uid" : null,
  "hrbp_id" : null,
  "management_parent_id" : null,
  "manager_id" : null,
  "manager_name" : null,
  "street" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "category" : null,
  "type" : null,
  "is_virtual" : null,
  "level" : null,
  "website" : null,
  "telephone" : null,
  "short_name" : null,
  "company_createdate" : null,
  "code" : null,
  "management_sort" : null,
  "business_sort" : null,
  "business_parent_id" : null,
  "city" : null,
  "company_details" : null,
  "create_date" : null,
  "create_uid" : null,
  "hrbp_id" : null,
  "management_parent_id" : null,
  "manager_id" : null,
  "manager_name" : null,
  "street" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取组织

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/{key}" type="info" :closable="false" ></el-alert>
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
  "id" : null,
  "name" : null,
  "identifier" : null,
  "category" : null,
  "type" : null,
  "is_virtual" : null,
  "level" : null,
  "website" : null,
  "telephone" : null,
  "short_name" : null,
  "company_createdate" : null,
  "code" : null,
  "management_sort" : null,
  "business_sort" : null,
  "business_parent_id" : null,
  "city" : null,
  "company_details" : null,
  "create_date" : null,
  "create_uid" : null,
  "hrbp_id" : null,
  "management_parent_id" : null,
  "manager_id" : null,
  "manager_name" : null,
  "street" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除组织

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新组织

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|编码|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|大类|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|虚拟组织|
|<el-row justify="space-between"><el-col :span="20">level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|层级|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网址|
|<el-row justify="space-between"><el-col :span="20">telephone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">short_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简称|
|<el-row justify="space-between"><el-col :span="20">company_createdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|设立日期|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文号|
|<el-row justify="space-between"><el-col :span="20">management_sort</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|行政维度序号|
|<el-row justify="space-between"><el-col :span="20">business_sort</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|业务维度序号|
|<el-row justify="space-between"><el-col :span="20">business_parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务维度上级|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地点|
|<el-row justify="space-between"><el-col :span="20">company_details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简介|
|<el-row justify="space-between"><el-col :span="20">hrbp_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|hrbp|
|<el-row justify="space-between"><el-col :span="20">management_parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行政维度上级|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">manager_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "category" : null,
  "type" : null,
  "is_virtual" : null,
  "level" : null,
  "website" : null,
  "telephone" : null,
  "short_name" : null,
  "company_createdate" : null,
  "code" : null,
  "management_sort" : null,
  "business_sort" : null,
  "business_parent_id" : null,
  "city" : null,
  "company_details" : null,
  "create_date" : null,
  "create_uid" : null,
  "hrbp_id" : null,
  "management_parent_id" : null,
  "manager_id" : null,
  "manager_name" : null,
  "street" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "category" : null,
  "type" : null,
  "is_virtual" : null,
  "level" : null,
  "website" : null,
  "telephone" : null,
  "short_name" : null,
  "company_createdate" : null,
  "code" : null,
  "management_sort" : null,
  "business_sort" : null,
  "business_parent_id" : null,
  "city" : null,
  "company_details" : null,
  "create_date" : null,
  "create_uid" : null,
  "hrbp_id" : null,
  "management_parent_id" : null,
  "manager_id" : null,
  "manager_name" : null,
  "street" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查组织主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|编码|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|大类|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|虚拟组织|
|<el-row justify="space-between"><el-col :span="20">level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|层级|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网址|
|<el-row justify="space-between"><el-col :span="20">telephone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">short_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简称|
|<el-row justify="space-between"><el-col :span="20">company_createdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|设立日期|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文号|
|<el-row justify="space-between"><el-col :span="20">management_sort</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|行政维度序号|
|<el-row justify="space-between"><el-col :span="20">business_sort</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|业务维度序号|
|<el-row justify="space-between"><el-col :span="20">business_parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务维度上级|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地点|
|<el-row justify="space-between"><el-col :span="20">company_details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简介|
|<el-row justify="space-between"><el-col :span="20">hrbp_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|hrbp|
|<el-row justify="space-between"><el-col :span="20">management_parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行政维度上级|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">manager_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "category" : null,
  "type" : null,
  "is_virtual" : null,
  "level" : null,
  "website" : null,
  "telephone" : null,
  "short_name" : null,
  "company_createdate" : null,
  "code" : null,
  "management_sort" : null,
  "business_sort" : null,
  "business_parent_id" : null,
  "city" : null,
  "company_details" : null,
  "create_date" : null,
  "create_uid" : null,
  "hrbp_id" : null,
  "management_parent_id" : null,
  "manager_id" : null,
  "manager_name" : null,
  "street" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取组织草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|编码|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|大类|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|虚拟组织|
|<el-row justify="space-between"><el-col :span="20">level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|层级|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网址|
|<el-row justify="space-between"><el-col :span="20">telephone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">short_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简称|
|<el-row justify="space-between"><el-col :span="20">company_createdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|设立日期|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文号|
|<el-row justify="space-between"><el-col :span="20">management_sort</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|行政维度序号|
|<el-row justify="space-between"><el-col :span="20">business_sort</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|业务维度序号|
|<el-row justify="space-between"><el-col :span="20">business_parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务维度上级|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地点|
|<el-row justify="space-between"><el-col :span="20">company_details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简介|
|<el-row justify="space-between"><el-col :span="20">hrbp_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|hrbp|
|<el-row justify="space-between"><el-col :span="20">management_parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行政维度上级|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">manager_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "category" : null,
  "type" : null,
  "is_virtual" : null,
  "level" : null,
  "website" : null,
  "telephone" : null,
  "short_name" : null,
  "company_createdate" : null,
  "code" : null,
  "management_sort" : null,
  "business_sort" : null,
  "business_parent_id" : null,
  "city" : null,
  "company_details" : null,
  "create_date" : null,
  "create_uid" : null,
  "hrbp_id" : null,
  "management_parent_id" : null,
  "manager_id" : null,
  "manager_name" : null,
  "street" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "category" : null,
  "type" : null,
  "is_virtual" : null,
  "level" : null,
  "website" : null,
  "telephone" : null,
  "short_name" : null,
  "company_createdate" : null,
  "code" : null,
  "management_sort" : null,
  "business_sort" : null,
  "business_parent_id" : null,
  "city" : null,
  "company_details" : null,
  "create_date" : null,
  "create_uid" : null,
  "hrbp_id" : null,
  "management_parent_id" : null,
  "manager_id" : null,
  "manager_name" : null,
  "street" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存组织

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_companies/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">identifier</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|编码|
|<el-row justify="space-between"><el-col :span="20">category</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|大类|
|<el-row justify="space-between"><el-col :span="20">type</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|
|<el-row justify="space-between"><el-col :span="20">is_virtual</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|虚拟组织|
|<el-row justify="space-between"><el-col :span="20">level</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|层级|
|<el-row justify="space-between"><el-col :span="20">website</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|网址|
|<el-row justify="space-between"><el-col :span="20">telephone</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电话|
|<el-row justify="space-between"><el-col :span="20">short_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简称|
|<el-row justify="space-between"><el-col :span="20">company_createdate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|设立日期|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|文号|
|<el-row justify="space-between"><el-col :span="20">management_sort</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|行政维度序号|
|<el-row justify="space-between"><el-col :span="20">business_sort</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|业务维度序号|
|<el-row justify="space-between"><el-col :span="20">business_parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务维度上级|
|<el-row justify="space-between"><el-col :span="20">city</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|所在地点|
|<el-row justify="space-between"><el-col :span="20">company_details</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|简介|
|<el-row justify="space-between"><el-col :span="20">hrbp_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|hrbp|
|<el-row justify="space-between"><el-col :span="20">management_parent_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行政维度上级|
|<el-row justify="space-between"><el-col :span="20">manager_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">manager_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">street</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|地址|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "category" : null,
  "type" : null,
  "is_virtual" : null,
  "level" : null,
  "website" : null,
  "telephone" : null,
  "short_name" : null,
  "company_createdate" : null,
  "code" : null,
  "management_sort" : null,
  "business_sort" : null,
  "business_parent_id" : null,
  "city" : null,
  "company_details" : null,
  "create_date" : null,
  "create_uid" : null,
  "hrbp_id" : null,
  "management_parent_id" : null,
  "manager_id" : null,
  "manager_name" : null,
  "street" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "id" : null,
  "name" : null,
  "identifier" : null,
  "category" : null,
  "type" : null,
  "is_virtual" : null,
  "level" : null,
  "website" : null,
  "telephone" : null,
  "short_name" : null,
  "company_createdate" : null,
  "code" : null,
  "management_sort" : null,
  "business_sort" : null,
  "business_parent_id" : null,
  "city" : null,
  "company_details" : null,
  "create_date" : null,
  "create_uid" : null,
  "hrbp_id" : null,
  "management_parent_id" : null,
  "manager_id" : null,
  "manager_name" : null,
  "street" : null,
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
<el-alert title="/res_companies/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_business_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|业务维度上级|
|<el-row justify="space-between"><el-col :span="20">n_category_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|大类|
|<el-row justify="space-between"><el-col :span="20">n_hrbp_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|hrbp|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_level_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|层级|
|<el-row justify="space-between"><el-col :span="20">n_management_parent_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|行政维度上级|
|<el-row justify="space-between"><el-col :span="20">n_manager_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">n_manager_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|负责人|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_type_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|类型|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_business_parent_id_eq" : null,
  "n_category_eq" : null,
  "n_hrbp_id_eq" : null,
  "n_id_eq" : null,
  "n_level_eq" : null,
  "n_management_parent_id_eq" : null,
  "n_manager_id_eq" : null,
  "n_manager_name_eq" : null,
  "n_manager_name_like" : null,
  "n_name_like" : null,
  "n_type_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "id" : null,
    "name" : null,
    "identifier" : null,
    "category" : null,
    "type" : null,
    "is_virtual" : null,
    "level" : null,
    "website" : null,
    "telephone" : null,
    "short_name" : null,
    "company_createdate" : null,
    "code" : null,
    "management_sort" : null,
    "business_sort" : null,
    "business_parent_id" : null,
    "city" : null,
    "company_details" : null,
    "create_date" : null,
    "create_uid" : null,
    "hrbp_id" : null,
    "management_parent_id" : null,
    "manager_id" : null,
    "manager_name" : null,
    "street" : null,
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
<el-alert title="/res_companies/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/exportdata/{param},/res_companies/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_companies/report" type="info" :closable="false" ></el-alert>
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