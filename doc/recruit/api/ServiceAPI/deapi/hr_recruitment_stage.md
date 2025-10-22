#  招聘阶段(hr_recruitment_stage) :id=hr_recruitment_stage
## 创建 招聘阶段

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_recruitment_stages" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折叠看板|
|<el-row justify="space-between"><el-col :span="20">hired_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|雇佣阶段|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_warning_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|警告是否清晰可见|
|<el-row justify="space-between"><el-col :span="20">legend_blocked</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|红色的看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_done</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绿色看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_normal</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|灰色看板标签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名称|
|<el-row justify="space-between"><el-col :span="20">requirements</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 获取 招聘阶段

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_recruitment_stages/{key}" type="info" :closable="false" ></el-alert>
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
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 删除 招聘阶段

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_recruitment_stages/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|标识|





## 更新 招聘阶段

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_recruitment_stages/{key}" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折叠看板|
|<el-row justify="space-between"><el-col :span="20">hired_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|雇佣阶段|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_warning_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|警告是否清晰可见|
|<el-row justify="space-between"><el-col :span="20">legend_blocked</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|红色的看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_done</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绿色看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_normal</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|灰色看板标签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名称|
|<el-row justify="space-between"><el-col :span="20">requirements</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 检查 招聘阶段主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_recruitment_stages/check_key" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折叠看板|
|<el-row justify="space-between"><el-col :span="20">hired_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|雇佣阶段|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_warning_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|警告是否清晰可见|
|<el-row justify="space-between"><el-col :span="20">legend_blocked</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|红色的看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_done</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绿色看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_normal</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|灰色看板标签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名称|
|<el-row justify="space-between"><el-col :span="20">requirements</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 停用

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_recruitment_stages/{key}/disable" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折叠看板|
|<el-row justify="space-between"><el-col :span="20">hired_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|雇佣阶段|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_warning_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|警告是否清晰可见|
|<el-row justify="space-between"><el-col :span="20">legend_blocked</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|红色的看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_done</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绿色看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_normal</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|灰色看板标签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名称|
|<el-row justify="space-between"><el-col :span="20">requirements</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 启用

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_recruitment_stages/{key}/enable" type="info" :closable="false" ></el-alert>
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
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折叠看板|
|<el-row justify="space-between"><el-col :span="20">hired_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|雇佣阶段|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_warning_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|警告是否清晰可见|
|<el-row justify="space-between"><el-col :span="20">legend_blocked</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|红色的看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_done</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绿色看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_normal</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|灰色看板标签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名称|
|<el-row justify="space-between"><el-col :span="20">requirements</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```



## 获取 招聘阶段草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_recruitment_stages/get_draft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折叠看板|
|<el-row justify="space-between"><el-col :span="20">hired_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|雇佣阶段|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_warning_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|警告是否清晰可见|
|<el-row justify="space-between"><el-col :span="20">legend_blocked</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|红色的看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_done</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绿色看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_normal</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|灰色看板标签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名称|
|<el-row justify="space-between"><el-col :span="20">requirements</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}

```

## 保存 招聘阶段

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_recruitment_stages/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">status</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|
|<el-row justify="space-between"><el-col :span="20">color</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|颜色|
|<el-row justify="space-between"><el-col :span="20">display_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|显示名称|
|<el-row justify="space-between"><el-col :span="20">fold</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|折叠看板|
|<el-row justify="space-between"><el-col :span="20">hired_stage</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|雇佣阶段|
|<el-row justify="space-between"><el-col :span="20">id</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">is_warning_visible</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|警告是否清晰可见|
|<el-row justify="space-between"><el-col :span="20">legend_blocked</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|红色的看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_done</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|绿色看板标签|
|<el-row justify="space-between"><el-col :span="20">legend_normal</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|灰色看板标签|
|<el-row justify="space-between"><el-col :span="20">name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名称|
|<el-row justify="space-between"><el-col :span="20">requirements</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|要求|
|<el-row justify="space-between"><el-col :span="20">sequence</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|



##### 请求示例： {docsify-ignore}
```json
{
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
  "write_date" : null,
  "write_uid" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "status" : null,
  "color" : null,
  "create_date" : null,
  "create_uid" : null,
  "display_name" : null,
  "fold" : null,
  "hired_stage" : null,
  "id" : null,
  "is_warning_visible" : null,
  "legend_blocked" : null,
  "legend_done" : null,
  "legend_normal" : null,
  "name" : null,
  "requirements" : null,
  "sequence" : null,
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
<el-alert title="/hr_recruitment_stages/fetch_default" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名称|
|<el-row justify="space-between"><el-col :span="20">n_sequence_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_sequence_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "status" : null,
    "color" : null,
    "create_date" : null,
    "create_uid" : null,
    "display_name" : null,
    "fold" : null,
    "hired_stage" : null,
    "id" : null,
    "is_warning_visible" : null,
    "legend_blocked" : null,
    "legend_done" : null,
    "legend_normal" : null,
    "name" : null,
    "requirements" : null,
    "sequence" : null,
    "write_date" : null,
    "write_uid" : null,
  }
]
```

## 启用状态

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/hr_recruitment_stages/fetch_enabled_status" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_id_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标识|
|<el-row justify="space-between"><el-col :span="20">n_name_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|阶段名称|
|<el-row justify="space-between"><el-col :span="20">n_sequence_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|序列|
|<el-row justify="space-between"><el-col :span="20">n_status_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|状态|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_sequence_eq" : null,
  "n_status_eq" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "status" : null,
    "color" : null,
    "create_date" : null,
    "create_uid" : null,
    "display_name" : null,
    "fold" : null,
    "hired_stage" : null,
    "id" : null,
    "is_warning_visible" : null,
    "legend_blocked" : null,
    "legend_done" : null,
    "legend_normal" : null,
    "name" : null,
    "requirements" : null,
    "sequence" : null,
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
<el-alert title="/hr_recruitment_stages/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_recruitment_stages/exportdata/{param},/hr_recruitment_stages/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_recruitment_stages/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_recruitment_stages/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_recruitment_stages/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_recruitment_stages/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/hr_recruitment_stages/report" type="info" :closable="false" ></el-alert>
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