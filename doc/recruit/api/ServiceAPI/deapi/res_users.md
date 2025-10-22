# 用户(res_users) :id=res_users
## 创建用户

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "active" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "karma" : null,
  "login" : null,
  "odoobot_failed" : null,
  "share" : null,
  "signature" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "tour_enabled" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "display_name" : null,
  "active" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "karma" : null,
  "login" : null,
  "odoobot_failed" : null,
  "share" : null,
  "signature" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "tour_enabled" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取用户

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/{key}" type="info" :closable="false" ></el-alert>
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
  "display_name" : null,
  "active" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "karma" : null,
  "login" : null,
  "odoobot_failed" : null,
  "share" : null,
  "signature" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "tour_enabled" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除用户

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新用户

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "active" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "karma" : null,
  "login" : null,
  "odoobot_failed" : null,
  "share" : null,
  "signature" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "tour_enabled" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "display_name" : null,
  "active" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "karma" : null,
  "login" : null,
  "odoobot_failed" : null,
  "share" : null,
  "signature" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "tour_enabled" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查用户主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "active" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "karma" : null,
  "login" : null,
  "odoobot_failed" : null,
  "share" : null,
  "signature" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "tour_enabled" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取用户草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "active" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "karma" : null,
  "login" : null,
  "odoobot_failed" : null,
  "share" : null,
  "signature" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "tour_enabled" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "display_name" : null,
  "active" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "karma" : null,
  "login" : null,
  "odoobot_failed" : null,
  "share" : null,
  "signature" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "tour_enabled" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存用户

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/res_users/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|姓名|
|<el-row justify="space-between"><el-col :span="20">active</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|有效|
|<el-row justify="space-between"><el-col :span="20">company_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司标识|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">karma</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|贡献值|
|<el-row justify="space-between"><el-col :span="20">login</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|登录|
|<el-row justify="space-between"><el-col :span="20">odoobot_failed</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|Odoobot 挂了|
|<el-row justify="space-between"><el-col :span="20">share</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|共享用户|
|<el-row justify="space-between"><el-col :span="20">signature</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|电子邮件签名|
|<el-row justify="space-between"><el-col :span="20">target_sales_done</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|活动完成目标|
|<el-row justify="space-between"><el-col :span="20">target_sales_invoiced</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|销售订单目标结算单|
|<el-row justify="space-between"><el-col :span="20">target_sales_won</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|商机赢得目标|
|<el-row justify="space-between"><el-col :span="20">tour_enabled</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|新手入门|



##### 请求示例： {docsify-ignore}
```json
{
  "display_name" : null,
  "active" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "karma" : null,
  "login" : null,
  "odoobot_failed" : null,
  "share" : null,
  "signature" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "tour_enabled" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "display_name" : null,
  "active" : null,
  "company_id" : null,
  "create_date" : null,
  "create_uid" : null,
  "id" : null,
  "karma" : null,
  "login" : null,
  "odoobot_failed" : null,
  "share" : null,
  "signature" : null,
  "target_sales_done" : null,
  "target_sales_invoiced" : null,
  "target_sales_won" : null,
  "tour_enabled" : null,
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
<el-alert title="/res_users/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_company_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|公司标识|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_company_id_eq" : null,
  "n_id_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "display_name" : null,
    "active" : null,
    "company_id" : null,
    "create_date" : null,
    "create_uid" : null,
    "id" : null,
    "karma" : null,
    "login" : null,
    "odoobot_failed" : null,
    "share" : null,
    "signature" : null,
    "target_sales_done" : null,
    "target_sales_invoiced" : null,
    "target_sales_won" : null,
    "tour_enabled" : null,
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
<el-alert title="/res_users/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/exportdata/{param},/res_users/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/res_users/report" type="info" :closable="false" ></el-alert>
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