# 实体处理逻辑节点(PSDELogicNode) :id=PSDELogicNode
## 创建实体处理逻辑节点

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogicnodes" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">work_item_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作项类型|
|<el-row justify="space-between"><el-col :span="20">work_item_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作项类型|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">ordervalue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|排序属性|
|<el-row justify="space-between"><el-col :span="20">codename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|代码名称|
|<el-row justify="space-between"><el-col :span="20">logicnodetype</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|逻辑节点类型|
|<el-row justify="space-between"><el-col :span="20">psdelogicid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogicname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑节点标识|
|<el-row justify="space-between"><el-col :span="20">psdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|逻辑处理名称|
|<el-row justify="space-between"><el-col :span="20">paralleloutput</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环后续处理|
|<el-row justify="space-between"><el-col :span="20">param1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数1|
|<el-row justify="space-between"><el-col :span="20">param10</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数10|
|<el-row justify="space-between"><el-col :span="20">param11</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数11|
|<el-row justify="space-between"><el-col :span="20">param12</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数12|
|<el-row justify="space-between"><el-col :span="20">param13</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数13|
|<el-row justify="space-between"><el-col :span="20">param7</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数7|
|<el-row justify="space-between"><el-col :span="20">param8</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数8|
|<el-row justify="space-between"><el-col :span="20">param9</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数9|



##### 请求示例： {docsify-ignore}
```json
{
  "work_item_type_id" : null,
  "work_item_type_name" : null,
  "title" : null,
  "content" : null,
  "ordervalue" : null,
  "codename" : null,
  "logicnodetype" : null,
  "psdelogicid" : null,
  "psdelogicname" : null,
  "psdelogicnodeid" : null,
  "psdelogicnodename" : null,
  "paralleloutput" : null,
  "param1" : null,
  "param10" : null,
  "param11" : null,
  "param12" : null,
  "param13" : null,
  "param7" : null,
  "param8" : null,
  "param9" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "work_item_type_id" : null,
  "work_item_type_name" : null,
  "title" : null,
  "content" : null,
  "ordervalue" : null,
  "codename" : null,
  "logicnodetype" : null,
  "psdelogicid" : null,
  "psdelogicname" : null,
  "psdelogicnodeid" : null,
  "psdelogicnodename" : null,
  "paralleloutput" : null,
  "param1" : null,
  "param10" : null,
  "param11" : null,
  "param12" : null,
  "param13" : null,
  "param7" : null,
  "param8" : null,
  "param9" : null,
}

```

## 获取实体处理逻辑节点

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogicnodes/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|实体处理逻辑节点标识|




##### 响应示例： {docsify-ignore}
```json

{
  "work_item_type_id" : null,
  "work_item_type_name" : null,
  "title" : null,
  "content" : null,
  "ordervalue" : null,
  "codename" : null,
  "logicnodetype" : null,
  "psdelogicid" : null,
  "psdelogicname" : null,
  "psdelogicnodeid" : null,
  "psdelogicnodename" : null,
  "paralleloutput" : null,
  "param1" : null,
  "param10" : null,
  "param11" : null,
  "param12" : null,
  "param13" : null,
  "param7" : null,
  "param8" : null,
  "param9" : null,
}

```

## 删除实体处理逻辑节点

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogicnodes/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`DELETE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|实体处理逻辑节点标识|





## 更新实体处理逻辑节点

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogicnodes/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`UPDATE`

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|实体处理逻辑节点标识|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">work_item_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作项类型|
|<el-row justify="space-between"><el-col :span="20">work_item_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作项类型|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">ordervalue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|排序属性|
|<el-row justify="space-between"><el-col :span="20">codename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|代码名称|
|<el-row justify="space-between"><el-col :span="20">logicnodetype</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|逻辑节点类型|
|<el-row justify="space-between"><el-col :span="20">psdelogicid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogicname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑节点标识|
|<el-row justify="space-between"><el-col :span="20">psdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|逻辑处理名称|
|<el-row justify="space-between"><el-col :span="20">paralleloutput</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环后续处理|
|<el-row justify="space-between"><el-col :span="20">param1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数1|
|<el-row justify="space-between"><el-col :span="20">param10</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数10|
|<el-row justify="space-between"><el-col :span="20">param11</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数11|
|<el-row justify="space-between"><el-col :span="20">param12</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数12|
|<el-row justify="space-between"><el-col :span="20">param13</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数13|
|<el-row justify="space-between"><el-col :span="20">param7</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数7|
|<el-row justify="space-between"><el-col :span="20">param8</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数8|
|<el-row justify="space-between"><el-col :span="20">param9</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数9|



##### 请求示例： {docsify-ignore}
```json
{
  "work_item_type_id" : null,
  "work_item_type_name" : null,
  "title" : null,
  "content" : null,
  "ordervalue" : null,
  "codename" : null,
  "logicnodetype" : null,
  "psdelogicid" : null,
  "psdelogicname" : null,
  "psdelogicnodeid" : null,
  "psdelogicnodename" : null,
  "paralleloutput" : null,
  "param1" : null,
  "param10" : null,
  "param11" : null,
  "param12" : null,
  "param13" : null,
  "param7" : null,
  "param8" : null,
  "param9" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "work_item_type_id" : null,
  "work_item_type_name" : null,
  "title" : null,
  "content" : null,
  "ordervalue" : null,
  "codename" : null,
  "logicnodetype" : null,
  "psdelogicid" : null,
  "psdelogicname" : null,
  "psdelogicnodeid" : null,
  "psdelogicnodename" : null,
  "paralleloutput" : null,
  "param1" : null,
  "param10" : null,
  "param11" : null,
  "param12" : null,
  "param13" : null,
  "param7" : null,
  "param8" : null,
  "param9" : null,
}

```

## 检查实体处理逻辑节点主键

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogicnodes/checkkey" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">work_item_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作项类型|
|<el-row justify="space-between"><el-col :span="20">work_item_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作项类型|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">ordervalue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|排序属性|
|<el-row justify="space-between"><el-col :span="20">codename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|代码名称|
|<el-row justify="space-between"><el-col :span="20">logicnodetype</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|逻辑节点类型|
|<el-row justify="space-between"><el-col :span="20">psdelogicid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogicname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑节点标识|
|<el-row justify="space-between"><el-col :span="20">psdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|逻辑处理名称|
|<el-row justify="space-between"><el-col :span="20">paralleloutput</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环后续处理|
|<el-row justify="space-between"><el-col :span="20">param1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数1|
|<el-row justify="space-between"><el-col :span="20">param10</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数10|
|<el-row justify="space-between"><el-col :span="20">param11</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数11|
|<el-row justify="space-between"><el-col :span="20">param12</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数12|
|<el-row justify="space-between"><el-col :span="20">param13</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数13|
|<el-row justify="space-between"><el-col :span="20">param7</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数7|
|<el-row justify="space-between"><el-col :span="20">param8</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数8|
|<el-row justify="space-between"><el-col :span="20">param9</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数9|



##### 请求示例： {docsify-ignore}
```json
{
  "work_item_type_id" : null,
  "work_item_type_name" : null,
  "title" : null,
  "content" : null,
  "ordervalue" : null,
  "codename" : null,
  "logicnodetype" : null,
  "psdelogicid" : null,
  "psdelogicname" : null,
  "psdelogicnodeid" : null,
  "psdelogicnodename" : null,
  "paralleloutput" : null,
  "param1" : null,
  "param10" : null,
  "param11" : null,
  "param12" : null,
  "param13" : null,
  "param7" : null,
  "param8" : null,
  "param9" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
Integer
```

## 获取实体处理逻辑节点草稿

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogicnodes/getdraft" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">work_item_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作项类型|
|<el-row justify="space-between"><el-col :span="20">work_item_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作项类型|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">ordervalue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|排序属性|
|<el-row justify="space-between"><el-col :span="20">codename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|代码名称|
|<el-row justify="space-between"><el-col :span="20">logicnodetype</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|逻辑节点类型|
|<el-row justify="space-between"><el-col :span="20">psdelogicid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogicname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑节点标识|
|<el-row justify="space-between"><el-col :span="20">psdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|逻辑处理名称|
|<el-row justify="space-between"><el-col :span="20">paralleloutput</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环后续处理|
|<el-row justify="space-between"><el-col :span="20">param1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数1|
|<el-row justify="space-between"><el-col :span="20">param10</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数10|
|<el-row justify="space-between"><el-col :span="20">param11</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数11|
|<el-row justify="space-between"><el-col :span="20">param12</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数12|
|<el-row justify="space-between"><el-col :span="20">param13</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数13|
|<el-row justify="space-between"><el-col :span="20">param7</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数7|
|<el-row justify="space-between"><el-col :span="20">param8</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数8|
|<el-row justify="space-between"><el-col :span="20">param9</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数9|



##### 请求示例： {docsify-ignore}
```json
{
  "work_item_type_id" : null,
  "work_item_type_name" : null,
  "title" : null,
  "content" : null,
  "ordervalue" : null,
  "codename" : null,
  "logicnodetype" : null,
  "psdelogicid" : null,
  "psdelogicname" : null,
  "psdelogicnodeid" : null,
  "psdelogicnodename" : null,
  "paralleloutput" : null,
  "param1" : null,
  "param10" : null,
  "param11" : null,
  "param12" : null,
  "param13" : null,
  "param7" : null,
  "param8" : null,
  "param9" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "work_item_type_id" : null,
  "work_item_type_name" : null,
  "title" : null,
  "content" : null,
  "ordervalue" : null,
  "codename" : null,
  "logicnodetype" : null,
  "psdelogicid" : null,
  "psdelogicname" : null,
  "psdelogicnodeid" : null,
  "psdelogicnodename" : null,
  "paralleloutput" : null,
  "param1" : null,
  "param10" : null,
  "param11" : null,
  "param12" : null,
  "param13" : null,
  "param7" : null,
  "param8" : null,
  "param9" : null,
}

```

## 保存实体处理逻辑节点

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogicnodes/save" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`CREATE`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">work_item_type_id</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作项类型|
|<el-row justify="space-between"><el-col :span="20">work_item_type_name</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|工作项类型|
|<el-row justify="space-between"><el-col :span="20">title</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|标题|
|<el-row justify="space-between"><el-col :span="20">content</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|内容|
|<el-row justify="space-between"><el-col :span="20">ordervalue</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|排序属性|
|<el-row justify="space-between"><el-col :span="20">codename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|代码名称|
|<el-row justify="space-between"><el-col :span="20">logicnodetype</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|逻辑节点类型|
|<el-row justify="space-between"><el-col :span="20">psdelogicid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogicname</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">psdelogicnodeid</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|实体处理逻辑节点标识|
|<el-row justify="space-between"><el-col :span="20">psdelogicnodename</el-col><el-col :span="4" style="text-align:right"></el-col> </el-row>|String|逻辑处理名称|
|<el-row justify="space-between"><el-col :span="20">paralleloutput</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|循环后续处理|
|<el-row justify="space-between"><el-col :span="20">param1</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数1|
|<el-row justify="space-between"><el-col :span="20">param10</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数10|
|<el-row justify="space-between"><el-col :span="20">param11</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数11|
|<el-row justify="space-between"><el-col :span="20">param12</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数12|
|<el-row justify="space-between"><el-col :span="20">param13</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|参数13|
|<el-row justify="space-between"><el-col :span="20">param7</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数7|
|<el-row justify="space-between"><el-col :span="20">param8</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数8|
|<el-row justify="space-between"><el-col :span="20">param9</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|Integer|参数9|



##### 请求示例： {docsify-ignore}
```json
{
  "work_item_type_id" : null,
  "work_item_type_name" : null,
  "title" : null,
  "content" : null,
  "ordervalue" : null,
  "codename" : null,
  "logicnodetype" : null,
  "psdelogicid" : null,
  "psdelogicname" : null,
  "psdelogicnodeid" : null,
  "psdelogicnodename" : null,
  "paralleloutput" : null,
  "param1" : null,
  "param10" : null,
  "param11" : null,
  "param12" : null,
  "param13" : null,
  "param7" : null,
  "param8" : null,
  "param9" : null,
}
```


##### 响应示例： {docsify-ignore}
```json

{
  "work_item_type_id" : null,
  "work_item_type_name" : null,
  "title" : null,
  "content" : null,
  "ordervalue" : null,
  "codename" : null,
  "logicnodetype" : null,
  "psdelogicid" : null,
  "psdelogicname" : null,
  "psdelogicnodeid" : null,
  "psdelogicnodename" : null,
  "paralleloutput" : null,
  "param1" : null,
  "param10" : null,
  "param11" : null,
  "param12" : null,
  "param13" : null,
  "param7" : null,
  "param8" : null,
  "param9" : null,
}

```

## 数据集

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogicnodes/fetchdefault" type="info" :closable="false" ></el-alert>
</div>
</el-row>
权限标识：`READ`



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|<el-row justify="space-between"><el-col :span="20">n_logicnodetype_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|逻辑节点类型|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicname_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicname_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicnodeid_eq</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|实体处理逻辑节点标识|
|<el-row justify="space-between"><el-col :span="20">n_psdelogicnodename_like</el-col><el-col :span="4" style="text-align:right"><el-text size="small" type="success">可选</el-text></el-col> </el-row>|String|逻辑处理名称|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_logicnodetype_eq" : null,
  "n_psdelogicid_eq" : null,
  "n_psdelogicname_eq" : null,
  "n_psdelogicname_like" : null,
  "n_psdelogicnodeid_eq" : null,
  "n_psdelogicnodename_like" : null,
}
```


##### 响应示例： {docsify-ignore}
```json
[
  {
    "work_item_type_id" : null,
    "work_item_type_name" : null,
    "title" : null,
    "content" : null,
    "ordervalue" : null,
    "codename" : null,
    "logicnodetype" : null,
    "psdelogicid" : null,
    "psdelogicname" : null,
    "psdelogicnodeid" : null,
    "psdelogicnodename" : null,
    "paralleloutput" : null,
    "param1" : null,
    "param10" : null,
    "param11" : null,
    "param12" : null,
    "param13" : null,
    "param7" : null,
    "param8" : null,
    "param9" : null,
  }
]
```



## 下载导入模板
<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/psdelogicnodes/importtemplate" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogicnodes/exportdata/{param},/psdelogicnodes/exportdata/{param}/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogicnodes/importdata" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogicnodes/importdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogicnodes/asyncimportdata2" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogicnodes/printdata/{key}" type="info" :closable="false" ></el-alert>
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
<el-alert title="/psdelogicnodes/report" type="info" :closable="false" ></el-alert>
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