# 币别(res_currency) :id=res_currency
## 创建币别

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_currencies" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">currency_subunit_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别小组|
|<el-row justify="space-between"><el-col :span="20">currency_unit_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别单位|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">decimal_places</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|小数位数|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">display_rounding_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示舍入警告信息|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">inverse_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|汇率|
|<el-row justify="space-between"><el-col :span="20">is_current_company_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前的公司币别|
|<el-row justify="space-between"><el-col :span="20">iso_numeric</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|币别的数字代码。|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">position</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|符号位置|
|<el-row justify="space-between"><el-col :span="20">rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|当前汇率|
|<el-row justify="space-between"><el-col :span="20">rate_string</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|费率字符串|
|<el-row justify="space-between"><el-col :span="20">rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|四舍五入系数|
|<el-row justify="space-between"><el-col :span="20">symbol</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|符号|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_subunit_label" : null,
  "currency_unit_label" : null,
  "date" : null,
  "decimal_places" : null,
  "display_name" : null,
  "display_rounding_warning" : null,
  "fiscal_country_codes" : null,
  "full_name" : null,
  "id" : null,
  "inverse_rate" : null,
  "is_current_company_currency" : null,
  "iso_numeric" : null,
  "name" : null,
  "position" : null,
  "rate" : null,
  "rate_string" : null,
  "rounding" : null,
  "symbol" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_subunit_label" : null,
  "currency_unit_label" : null,
  "date" : null,
  "decimal_places" : null,
  "display_name" : null,
  "display_rounding_warning" : null,
  "fiscal_country_codes" : null,
  "full_name" : null,
  "id" : null,
  "inverse_rate" : null,
  "is_current_company_currency" : null,
  "iso_numeric" : null,
  "name" : null,
  "position" : null,
  "rate" : null,
  "rate_string" : null,
  "rounding" : null,
  "symbol" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取币别

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_currencies/{key}" type="info" :closable="false" ></el-alert>
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
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_subunit_label" : null,
  "currency_unit_label" : null,
  "date" : null,
  "decimal_places" : null,
  "display_name" : null,
  "display_rounding_warning" : null,
  "fiscal_country_codes" : null,
  "full_name" : null,
  "id" : null,
  "inverse_rate" : null,
  "is_current_company_currency" : null,
  "iso_numeric" : null,
  "name" : null,
  "position" : null,
  "rate" : null,
  "rate_string" : null,
  "rounding" : null,
  "symbol" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除币别

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_currencies/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新币别

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_currencies/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">currency_subunit_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别小组|
|<el-row justify="space-between"><el-col :span="20">currency_unit_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别单位|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">decimal_places</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|小数位数|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">display_rounding_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示舍入警告信息|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">inverse_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|汇率|
|<el-row justify="space-between"><el-col :span="20">is_current_company_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前的公司币别|
|<el-row justify="space-between"><el-col :span="20">iso_numeric</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|币别的数字代码。|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">position</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|符号位置|
|<el-row justify="space-between"><el-col :span="20">rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|当前汇率|
|<el-row justify="space-between"><el-col :span="20">rate_string</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|费率字符串|
|<el-row justify="space-between"><el-col :span="20">rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|四舍五入系数|
|<el-row justify="space-between"><el-col :span="20">symbol</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|符号|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_subunit_label" : null,
  "currency_unit_label" : null,
  "date" : null,
  "decimal_places" : null,
  "display_name" : null,
  "display_rounding_warning" : null,
  "fiscal_country_codes" : null,
  "full_name" : null,
  "id" : null,
  "inverse_rate" : null,
  "is_current_company_currency" : null,
  "iso_numeric" : null,
  "name" : null,
  "position" : null,
  "rate" : null,
  "rate_string" : null,
  "rounding" : null,
  "symbol" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_subunit_label" : null,
  "currency_unit_label" : null,
  "date" : null,
  "decimal_places" : null,
  "display_name" : null,
  "display_rounding_warning" : null,
  "fiscal_country_codes" : null,
  "full_name" : null,
  "id" : null,
  "inverse_rate" : null,
  "is_current_company_currency" : null,
  "iso_numeric" : null,
  "name" : null,
  "position" : null,
  "rate" : null,
  "rate_string" : null,
  "rounding" : null,
  "symbol" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查币别主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_currencies/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">currency_subunit_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别小组|
|<el-row justify="space-between"><el-col :span="20">currency_unit_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别单位|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">decimal_places</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|小数位数|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">display_rounding_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示舍入警告信息|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">inverse_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|汇率|
|<el-row justify="space-between"><el-col :span="20">is_current_company_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前的公司币别|
|<el-row justify="space-between"><el-col :span="20">iso_numeric</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|币别的数字代码。|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">position</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|符号位置|
|<el-row justify="space-between"><el-col :span="20">rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|当前汇率|
|<el-row justify="space-between"><el-col :span="20">rate_string</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|费率字符串|
|<el-row justify="space-between"><el-col :span="20">rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|四舍五入系数|
|<el-row justify="space-between"><el-col :span="20">symbol</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|符号|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_subunit_label" : null,
  "currency_unit_label" : null,
  "date" : null,
  "decimal_places" : null,
  "display_name" : null,
  "display_rounding_warning" : null,
  "fiscal_country_codes" : null,
  "full_name" : null,
  "id" : null,
  "inverse_rate" : null,
  "is_current_company_currency" : null,
  "iso_numeric" : null,
  "name" : null,
  "position" : null,
  "rate" : null,
  "rate_string" : null,
  "rounding" : null,
  "symbol" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取币别草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_currencies/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">currency_subunit_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别小组|
|<el-row justify="space-between"><el-col :span="20">currency_unit_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别单位|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">decimal_places</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|小数位数|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">display_rounding_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示舍入警告信息|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">inverse_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|汇率|
|<el-row justify="space-between"><el-col :span="20">is_current_company_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前的公司币别|
|<el-row justify="space-between"><el-col :span="20">iso_numeric</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|币别的数字代码。|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">position</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|符号位置|
|<el-row justify="space-between"><el-col :span="20">rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|当前汇率|
|<el-row justify="space-between"><el-col :span="20">rate_string</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|费率字符串|
|<el-row justify="space-between"><el-col :span="20">rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|四舍五入系数|
|<el-row justify="space-between"><el-col :span="20">symbol</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|符号|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_subunit_label" : null,
  "currency_unit_label" : null,
  "date" : null,
  "decimal_places" : null,
  "display_name" : null,
  "display_rounding_warning" : null,
  "fiscal_country_codes" : null,
  "full_name" : null,
  "id" : null,
  "inverse_rate" : null,
  "is_current_company_currency" : null,
  "iso_numeric" : null,
  "name" : null,
  "position" : null,
  "rate" : null,
  "rate_string" : null,
  "rounding" : null,
  "symbol" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_subunit_label" : null,
  "currency_unit_label" : null,
  "date" : null,
  "decimal_places" : null,
  "display_name" : null,
  "display_rounding_warning" : null,
  "fiscal_country_codes" : null,
  "full_name" : null,
  "id" : null,
  "inverse_rate" : null,
  "is_current_company_currency" : null,
  "iso_numeric" : null,
  "name" : null,
  "position" : null,
  "rate" : null,
  "rate_string" : null,
  "rounding" : null,
  "symbol" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存币别

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_currencies/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">currency_subunit_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别小组|
|<el-row justify="space-between"><el-col :span="20">currency_unit_label</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|币别单位|
|<el-row justify="space-between"><el-col :span="20">date</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Timestamp|日期|
|<el-row justify="space-between"><el-col :span="20">decimal_places</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|小数位数|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">display_rounding_warning</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|显示舍入警告信息|
|<el-row justify="space-between"><el-col :span="20">fiscal_country_codes</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|会计所在国家/地区代码|
|<el-row justify="space-between"><el-col :span="20">full_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">inverse_rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|汇率|
|<el-row justify="space-between"><el-col :span="20">is_current_company_currency</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|是当前的公司币别|
|<el-row justify="space-between"><el-col :span="20">iso_numeric</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|币别的数字代码。|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">position</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|符号位置|
|<el-row justify="space-between"><el-col :span="20">rate</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|当前汇率|
|<el-row justify="space-between"><el-col :span="20">rate_string</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|费率字符串|
|<el-row justify="space-between"><el-col :span="20">rounding</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Double|四舍五入系数|
|<el-row justify="space-between"><el-col :span="20">symbol</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|符号|



##### 请求示例： {docsify-ignore}
```json
{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_subunit_label" : null,
  "currency_unit_label" : null,
  "date" : null,
  "decimal_places" : null,
  "display_name" : null,
  "display_rounding_warning" : null,
  "fiscal_country_codes" : null,
  "full_name" : null,
  "id" : null,
  "inverse_rate" : null,
  "is_current_company_currency" : null,
  "iso_numeric" : null,
  "name" : null,
  "position" : null,
  "rate" : null,
  "rate_string" : null,
  "rounding" : null,
  "symbol" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "active" : null,
  "create_date" : null,
  "create_uid" : null,
  "currency_subunit_label" : null,
  "currency_unit_label" : null,
  "date" : null,
  "decimal_places" : null,
  "display_name" : null,
  "display_rounding_warning" : null,
  "fiscal_country_codes" : null,
  "full_name" : null,
  "id" : null,
  "inverse_rate" : null,
  "is_current_company_currency" : null,
  "iso_numeric" : null,
  "name" : null,
  "position" : null,
  "rate" : null,
  "rate_string" : null,
  "rounding" : null,
  "symbol" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_currencies/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|名称|
|<el-row justify="space-between"><el-col :span="20">n_position_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|符号位置|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_position_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "active" : null,
    "create_date" : null,
    "create_uid" : null,
    "currency_subunit_label" : null,
    "currency_unit_label" : null,
    "date" : null,
    "decimal_places" : null,
    "display_name" : null,
    "display_rounding_warning" : null,
    "fiscal_country_codes" : null,
    "full_name" : null,
    "id" : null,
    "inverse_rate" : null,
    "is_current_company_currency" : null,
    "iso_numeric" : null,
    "name" : null,
    "position" : null,
    "rate" : null,
    "rate_string" : null,
    "rounding" : null,
    "symbol" : null,
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
<el-alert title="/res_currencies/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_currencies/exportdata/{param},/res_currencies/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_currencies/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_currencies/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_currencies/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_currencies/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_currencies/report" type="info" :closable="false" ></el-alert>
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