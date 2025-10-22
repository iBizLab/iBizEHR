# 实体处理逻辑链接(PSDELogicLink) :id=PSDELogicLink
## 创建实体处理逻辑链接

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogiclinks" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">dstpsdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">dstpsdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">psdelogicid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogiclinkid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑链接标识|
|<el-row justify="space-between"><el-col :span="20">psdelogiclinkname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|连接名称|
|<el-row justify="space-between"><el-col :span="20">psdelogicname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">srcpsdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|源节点|
|<el-row justify="space-between"><el-col :span="20">srcpsdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|源节点|



##### 请求示例： {docsify-ignore}
```json
{
  "dstpsdelogicnodeid" : null,
  "dstpsdelogicnodename" : null,
  "psdelogicid" : null,
  "psdelogiclinkid" : null,
  "psdelogiclinkname" : null,
  "psdelogicname" : null,
  "srcpsdelogicnodeid" : null,
  "srcpsdelogicnodename" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "dstpsdelogicnodeid" : null,
  "dstpsdelogicnodename" : null,
  "psdelogicid" : null,
  "psdelogiclinkid" : null,
  "psdelogiclinkname" : null,
  "psdelogicname" : null,
  "srcpsdelogicnodeid" : null,
  "srcpsdelogicnodename" : null,
}

```

## 获取实体处理逻辑链接

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogiclinks/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|实体处理逻辑链接标识|




##### 响应示例： {docsify-ignore}
```json

{
  "dstpsdelogicnodeid" : null,
  "dstpsdelogicnodename" : null,
  "psdelogicid" : null,
  "psdelogiclinkid" : null,
  "psdelogiclinkname" : null,
  "psdelogicname" : null,
  "srcpsdelogicnodeid" : null,
  "srcpsdelogicnodename" : null,
}

```

## 删除实体处理逻辑链接

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogiclinks/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|实体处理逻辑链接标识|





## 更新实体处理逻辑链接

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogiclinks/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|实体处理逻辑链接标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">dstpsdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">dstpsdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">psdelogicid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogiclinkid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑链接标识|
|<el-row justify="space-between"><el-col :span="20">psdelogiclinkname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|连接名称|
|<el-row justify="space-between"><el-col :span="20">psdelogicname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">srcpsdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|源节点|
|<el-row justify="space-between"><el-col :span="20">srcpsdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|源节点|



##### 请求示例： {docsify-ignore}
```json
{
  "dstpsdelogicnodeid" : null,
  "dstpsdelogicnodename" : null,
  "psdelogicid" : null,
  "psdelogiclinkid" : null,
  "psdelogiclinkname" : null,
  "psdelogicname" : null,
  "srcpsdelogicnodeid" : null,
  "srcpsdelogicnodename" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "dstpsdelogicnodeid" : null,
  "dstpsdelogicnodename" : null,
  "psdelogicid" : null,
  "psdelogiclinkid" : null,
  "psdelogiclinkname" : null,
  "psdelogicname" : null,
  "srcpsdelogicnodeid" : null,
  "srcpsdelogicnodename" : null,
}

```

## 检查实体处理逻辑链接主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogiclinks/checkkey" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">dstpsdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">dstpsdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">psdelogicid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogiclinkid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑链接标识|
|<el-row justify="space-between"><el-col :span="20">psdelogiclinkname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|连接名称|
|<el-row justify="space-between"><el-col :span="20">psdelogicname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">srcpsdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|源节点|
|<el-row justify="space-between"><el-col :span="20">srcpsdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|源节点|



##### 请求示例： {docsify-ignore}
```json
{
  "dstpsdelogicnodeid" : null,
  "dstpsdelogicnodename" : null,
  "psdelogicid" : null,
  "psdelogiclinkid" : null,
  "psdelogiclinkname" : null,
  "psdelogicname" : null,
  "srcpsdelogicnodeid" : null,
  "srcpsdelogicnodename" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取实体处理逻辑链接草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogiclinks/getdraft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">dstpsdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">dstpsdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">psdelogicid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogiclinkid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑链接标识|
|<el-row justify="space-between"><el-col :span="20">psdelogiclinkname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|连接名称|
|<el-row justify="space-between"><el-col :span="20">psdelogicname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">srcpsdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|源节点|
|<el-row justify="space-between"><el-col :span="20">srcpsdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|源节点|



##### 请求示例： {docsify-ignore}
```json
{
  "dstpsdelogicnodeid" : null,
  "dstpsdelogicnodename" : null,
  "psdelogicid" : null,
  "psdelogiclinkid" : null,
  "psdelogiclinkname" : null,
  "psdelogicname" : null,
  "srcpsdelogicnodeid" : null,
  "srcpsdelogicnodename" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "dstpsdelogicnodeid" : null,
  "dstpsdelogicnodename" : null,
  "psdelogicid" : null,
  "psdelogiclinkid" : null,
  "psdelogiclinkname" : null,
  "psdelogicname" : null,
  "srcpsdelogicnodeid" : null,
  "srcpsdelogicnodename" : null,
}

```

## 保存实体处理逻辑链接

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogiclinks/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">dstpsdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">dstpsdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">psdelogicid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogiclinkid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑链接标识|
|<el-row justify="space-between"><el-col :span="20">psdelogiclinkname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|连接名称|
|<el-row justify="space-between"><el-col :span="20">psdelogicname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">srcpsdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|源节点|
|<el-row justify="space-between"><el-col :span="20">srcpsdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|源节点|



##### 请求示例： {docsify-ignore}
```json
{
  "dstpsdelogicnodeid" : null,
  "dstpsdelogicnodename" : null,
  "psdelogicid" : null,
  "psdelogiclinkid" : null,
  "psdelogiclinkname" : null,
  "psdelogicname" : null,
  "srcpsdelogicnodeid" : null,
  "srcpsdelogicnodename" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "dstpsdelogicnodeid" : null,
  "dstpsdelogicnodename" : null,
  "psdelogicid" : null,
  "psdelogiclinkid" : null,
  "psdelogiclinkname" : null,
  "psdelogicname" : null,
  "srcpsdelogicnodeid" : null,
  "srcpsdelogicnodename" : null,
}

```

## 目标节点相关连线

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogiclinks/fetchcuritembydscnode" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_dstpsdelogicnodeid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">n_dstpsdelogicnodename_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">n_dstpsdelogicnodename_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_psdelogiclinkid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑链接标识|
|<el-row justify="space-between"><el-col :span="20">n_psdelogiclinkname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|连接名称|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_srcpsdelogicnodeid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|源节点|
|<el-row justify="space-between"><el-col :span="20">n_srcpsdelogicnodename_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|源节点|
|<el-row justify="space-between"><el-col :span="20">n_srcpsdelogicnodename_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|源节点|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_dstpsdelogicnodeid_eq" : null,
  "n_dstpsdelogicnodename_eq" : null,
  "n_dstpsdelogicnodename_like" : null,
  "n_psdelogicid_eq" : null,
  "n_psdelogiclinkid_eq" : null,
  "n_psdelogiclinkname_like" : null,
  "n_psdelogicname_eq" : null,
  "n_psdelogicname_like" : null,
  "n_srcpsdelogicnodeid_eq" : null,
  "n_srcpsdelogicnodename_eq" : null,
  "n_srcpsdelogicnodename_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "dstpsdelogicnodeid" : null,
    "dstpsdelogicnodename" : null,
    "psdelogicid" : null,
    "psdelogiclinkid" : null,
    "psdelogiclinkname" : null,
    "psdelogicname" : null,
    "srcpsdelogicnodeid" : null,
    "srcpsdelogicnodename" : null,
  }
]
```

## 源节点相关连线

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogiclinks/fetchcuritembysrcnode" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_dstpsdelogicnodeid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">n_dstpsdelogicnodename_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">n_dstpsdelogicnodename_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_psdelogiclinkid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑链接标识|
|<el-row justify="space-between"><el-col :span="20">n_psdelogiclinkname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|连接名称|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_srcpsdelogicnodeid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|源节点|
|<el-row justify="space-between"><el-col :span="20">n_srcpsdelogicnodename_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|源节点|
|<el-row justify="space-between"><el-col :span="20">n_srcpsdelogicnodename_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|源节点|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_dstpsdelogicnodeid_eq" : null,
  "n_dstpsdelogicnodename_eq" : null,
  "n_dstpsdelogicnodename_like" : null,
  "n_psdelogicid_eq" : null,
  "n_psdelogiclinkid_eq" : null,
  "n_psdelogiclinkname_like" : null,
  "n_psdelogicname_eq" : null,
  "n_psdelogicname_like" : null,
  "n_srcpsdelogicnodeid_eq" : null,
  "n_srcpsdelogicnodename_eq" : null,
  "n_srcpsdelogicnodename_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "dstpsdelogicnodeid" : null,
    "dstpsdelogicnodename" : null,
    "psdelogicid" : null,
    "psdelogiclinkid" : null,
    "psdelogiclinkname" : null,
    "psdelogicname" : null,
    "srcpsdelogicnodeid" : null,
    "srcpsdelogicnodename" : null,
  }
]
```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogiclinks/fetchdefault" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_dstpsdelogicnodeid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">n_dstpsdelogicnodename_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">n_dstpsdelogicnodename_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|目标节点|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_psdelogiclinkid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑链接标识|
|<el-row justify="space-between"><el-col :span="20">n_psdelogiclinkname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|连接名称|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_srcpsdelogicnodeid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|源节点|
|<el-row justify="space-between"><el-col :span="20">n_srcpsdelogicnodename_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|源节点|
|<el-row justify="space-between"><el-col :span="20">n_srcpsdelogicnodename_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|源节点|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_dstpsdelogicnodeid_eq" : null,
  "n_dstpsdelogicnodename_eq" : null,
  "n_dstpsdelogicnodename_like" : null,
  "n_psdelogicid_eq" : null,
  "n_psdelogiclinkid_eq" : null,
  "n_psdelogiclinkname_like" : null,
  "n_psdelogicname_eq" : null,
  "n_psdelogicname_like" : null,
  "n_srcpsdelogicnodeid_eq" : null,
  "n_srcpsdelogicnodename_eq" : null,
  "n_srcpsdelogicnodename_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "dstpsdelogicnodeid" : null,
    "dstpsdelogicnodename" : null,
    "psdelogicid" : null,
    "psdelogiclinkid" : null,
    "psdelogiclinkname" : null,
    "psdelogicname" : null,
    "srcpsdelogicnodeid" : null,
    "srcpsdelogicnodename" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogiclinks/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogiclinks/exportdata/{param},/psdelogiclinks/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogiclinks/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogiclinks/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogiclinks/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogiclinks/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogiclinks/report" type="info" :closable="false" ></el-alert>
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