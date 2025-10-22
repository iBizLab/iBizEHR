# 国家/地区(res_country) :id=res_country
## 创建国家/地区

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_countries" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">address_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报表中的布局|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">image_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旗帜|
|<el-row justify="space-between"><el-col :span="20">is_stripe_supported_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是支持Stripe支付的国家/地区|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">name_position</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户姓名 职位|
|<el-row justify="space-between"><el-col :span="20">phone_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国家/地区长途区号|
|<el-row justify="space-between"><el-col :span="20">state_required</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|省/州必填|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|大桶标签|
|<el-row justify="space-between"><el-col :span="20">zip_required</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "address_format" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "image_url" : null,
  "is_stripe_supported_country" : null,
  "name" : null,
  "name_position" : null,
  "phone_code" : null,
  "state_required" : null,
  "vat_label" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip_required" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "address_format" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "image_url" : null,
  "is_stripe_supported_country" : null,
  "name" : null,
  "name_position" : null,
  "phone_code" : null,
  "state_required" : null,
  "vat_label" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip_required" : null,
}

```

## 获取国家/地区

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_countries/{key}" type="info" :closable="false" ></el-alert>
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
  "address_format" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "image_url" : null,
  "is_stripe_supported_country" : null,
  "name" : null,
  "name_position" : null,
  "phone_code" : null,
  "state_required" : null,
  "vat_label" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip_required" : null,
}

```

## 删除国家/地区

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_countries/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新国家/地区

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_countries/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">address_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报表中的布局|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">image_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旗帜|
|<el-row justify="space-between"><el-col :span="20">is_stripe_supported_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是支持Stripe支付的国家/地区|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">name_position</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户姓名 职位|
|<el-row justify="space-between"><el-col :span="20">phone_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国家/地区长途区号|
|<el-row justify="space-between"><el-col :span="20">state_required</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|省/州必填|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|大桶标签|
|<el-row justify="space-between"><el-col :span="20">zip_required</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "address_format" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "image_url" : null,
  "is_stripe_supported_country" : null,
  "name" : null,
  "name_position" : null,
  "phone_code" : null,
  "state_required" : null,
  "vat_label" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip_required" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "address_format" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "image_url" : null,
  "is_stripe_supported_country" : null,
  "name" : null,
  "name_position" : null,
  "phone_code" : null,
  "state_required" : null,
  "vat_label" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip_required" : null,
}

```

## 检查国家/地区主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_countries/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">address_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报表中的布局|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">image_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旗帜|
|<el-row justify="space-between"><el-col :span="20">is_stripe_supported_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是支持Stripe支付的国家/地区|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">name_position</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户姓名 职位|
|<el-row justify="space-between"><el-col :span="20">phone_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国家/地区长途区号|
|<el-row justify="space-between"><el-col :span="20">state_required</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|省/州必填|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|大桶标签|
|<el-row justify="space-between"><el-col :span="20">zip_required</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "address_format" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "image_url" : null,
  "is_stripe_supported_country" : null,
  "name" : null,
  "name_position" : null,
  "phone_code" : null,
  "state_required" : null,
  "vat_label" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip_required" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取国家/地区草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_countries/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">address_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报表中的布局|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">image_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旗帜|
|<el-row justify="space-between"><el-col :span="20">is_stripe_supported_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是支持Stripe支付的国家/地区|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">name_position</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户姓名 职位|
|<el-row justify="space-between"><el-col :span="20">phone_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国家/地区长途区号|
|<el-row justify="space-between"><el-col :span="20">state_required</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|省/州必填|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|大桶标签|
|<el-row justify="space-between"><el-col :span="20">zip_required</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "address_format" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "image_url" : null,
  "is_stripe_supported_country" : null,
  "name" : null,
  "name_position" : null,
  "phone_code" : null,
  "state_required" : null,
  "vat_label" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip_required" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "address_format" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "image_url" : null,
  "is_stripe_supported_country" : null,
  "name" : null,
  "name_position" : null,
  "phone_code" : null,
  "state_required" : null,
  "vat_label" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip_required" : null,
}

```

## 保存国家/地区

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_countries/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">address_format</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|报表中的布局|
|<el-row justify="space-between"><el-col :span="20">code</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">currency_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">image_url</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|旗帜|
|<el-row justify="space-between"><el-col :span="20">is_stripe_supported_country</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是支持Stripe支付的国家/地区|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">name_position</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户姓名 职位|
|<el-row justify="space-between"><el-col :span="20">phone_code</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|国家/地区长途区号|
|<el-row justify="space-between"><el-col :span="20">state_required</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|省/州必填|
|<el-row justify="space-between"><el-col :span="20">vat_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|大桶标签|
|<el-row justify="space-between"><el-col :span="20">zip_required</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|需要邮编|



##### 请求示例： {docsify-ignore}
```json
{
  "address_format" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "image_url" : null,
  "is_stripe_supported_country" : null,
  "name" : null,
  "name_position" : null,
  "phone_code" : null,
  "state_required" : null,
  "vat_label" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip_required" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "address_format" : null,
  "code" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_id" : null,
  "display_name" : null,
  "id" : null,
  "image_url" : null,
  "is_stripe_supported_country" : null,
  "name" : null,
  "name_position" : null,
  "phone_code" : null,
  "state_required" : null,
  "vat_label" : null,
  "write_date" : null,
  "write_uid" : null,
  "zip_required" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_countries/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_currency_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_name_position_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|客户姓名 职位|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_currency_id_eq" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_name_position_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "address_format" : null,
    "code" : null,
    "create_date" : null,
    "create_uid" : null,
    "currency_id" : null,
    "display_name" : null,
    "id" : null,
    "image_url" : null,
    "is_stripe_supported_country" : null,
    "name" : null,
    "name_position" : null,
    "phone_code" : null,
    "state_required" : null,
    "vat_label" : null,
    "write_date" : null,
    "write_uid" : null,
    "zip_required" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_countries/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_countries/exportdata/{param},/res_countries/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_countries/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_countries/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_countries/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_countries/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_countries/report" type="info" :closable="false" ></el-alert>
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