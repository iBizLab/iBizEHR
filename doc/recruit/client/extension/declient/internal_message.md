# null(internal_message) :id=internal_message
## CheckKey

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/internal_messages" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|id|String|id|
|name|String|name|
|create_man|String|create_man|
|create_time|Timestamp|create_time|
|update_man|String|update_man|
|update_time|Timestamp|update_time|
|content|String|content|
|receiver|String|receiver|
|status|String|status|
|owner_type|String|owner_type|
|content_type|String|content_type|
|url|String|url|
|mobile_url|String|mobile_url|
|system_tag|String|system_tag|
|title|String|title|
|message_type|String|message_type|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_man" : null,
  "create_time" : null,
  "update_man" : null,
  "update_time" : null,
  "content" : null,
  "receiver" : null,
  "status" : null,
  "owner_type" : null,
  "content_type" : null,
  "url" : null,
  "mobile_url" : null,
  "system_tag" : null,
  "title" : null,
  "message_type" : null,
}
```


## Create

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/internal_messages" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|id|String|id|
|name|String|name|
|create_man|String|create_man|
|create_time|Timestamp|create_time|
|update_man|String|update_man|
|update_time|Timestamp|update_time|
|content|String|content|
|receiver|String|receiver|
|status|String|status|
|owner_type|String|owner_type|
|content_type|String|content_type|
|url|String|url|
|mobile_url|String|mobile_url|
|system_tag|String|system_tag|
|title|String|title|
|message_type|String|message_type|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_man" : null,
  "create_time" : null,
  "update_man" : null,
  "update_time" : null,
  "content" : null,
  "receiver" : null,
  "status" : null,
  "owner_type" : null,
  "content_type" : null,
  "url" : null,
  "mobile_url" : null,
  "system_tag" : null,
  "title" : null,
  "message_type" : null,
}
```


## Get

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/internal_messages/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|




## GetDraft

<el-row>
<div style="width: 80px">
<el-alert center title="GET" type="success" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/internal_messages" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|id|String|id|
|name|String|name|
|create_man|String|create_man|
|create_time|Timestamp|create_time|
|update_man|String|update_man|
|update_time|Timestamp|update_time|
|content|String|content|
|receiver|String|receiver|
|status|String|status|
|owner_type|String|owner_type|
|content_type|String|content_type|
|url|String|url|
|mobile_url|String|mobile_url|
|system_tag|String|system_tag|
|title|String|title|
|message_type|String|message_type|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_man" : null,
  "create_time" : null,
  "update_man" : null,
  "update_time" : null,
  "content" : null,
  "receiver" : null,
  "status" : null,
  "owner_type" : null,
  "content_type" : null,
  "url" : null,
  "mobile_url" : null,
  "system_tag" : null,
  "title" : null,
  "message_type" : null,
}
```


## Remove

<el-row>
<div style="width: 80px">
<el-alert center title="DELETE" type="error" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/internal_messages/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|




## Save

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/internal_messages" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|id|String|id|
|name|String|name|
|create_man|String|create_man|
|create_time|Timestamp|create_time|
|update_man|String|update_man|
|update_time|Timestamp|update_time|
|content|String|content|
|receiver|String|receiver|
|status|String|status|
|owner_type|String|owner_type|
|content_type|String|content_type|
|url|String|url|
|mobile_url|String|mobile_url|
|system_tag|String|system_tag|
|title|String|title|
|message_type|String|message_type|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_man" : null,
  "create_time" : null,
  "update_man" : null,
  "update_time" : null,
  "content" : null,
  "receiver" : null,
  "status" : null,
  "owner_type" : null,
  "content_type" : null,
  "url" : null,
  "mobile_url" : null,
  "system_tag" : null,
  "title" : null,
  "message_type" : null,
}
```


## Update

<el-row>
<div style="width: 80px">
<el-alert center title="PUT" type="warning" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/internal_messages/{key}" type="info" :closable="false" ></el-alert>
</div>
</el-row>

##### 路径参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|key|String|主键|



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|id|String|id|
|name|String|name|
|create_man|String|create_man|
|create_time|Timestamp|create_time|
|update_man|String|update_man|
|update_time|Timestamp|update_time|
|content|String|content|
|receiver|String|receiver|
|status|String|status|
|owner_type|String|owner_type|
|content_type|String|content_type|
|url|String|url|
|mobile_url|String|mobile_url|
|system_tag|String|system_tag|
|title|String|title|
|message_type|String|message_type|



##### 请求示例： {docsify-ignore}
```json
{
  "id" : null,
  "name" : null,
  "create_man" : null,
  "create_time" : null,
  "update_man" : null,
  "update_time" : null,
  "content" : null,
  "receiver" : null,
  "status" : null,
  "owner_type" : null,
  "content_type" : null,
  "url" : null,
  "mobile_url" : null,
  "system_tag" : null,
  "title" : null,
  "message_type" : null,
}
```


## cur_receiver

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/internal_messages" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|n_id_eq|String|n_id_eq|
|n_name_like|String|n_name_like|
|n_owner_type_eq|String|n_owner_type_eq|
|n_title_eq|String|n_title_eq|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_owner_type_eq" : null,
  "n_title_eq" : null,
}
```


## cur_system_all

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/internal_messages" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|n_id_eq|String|n_id_eq|
|n_name_like|String|n_name_like|
|n_owner_type_eq|String|n_owner_type_eq|
|n_title_eq|String|n_title_eq|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_owner_type_eq" : null,
  "n_title_eq" : null,
}
```


## DEFAULT

<el-row>
<div style="width: 80px">
<el-alert center title="POST" style="background-color: rgba(52, 143, 228, 0.1);color: #348fe4;" :closable="false" ></el-alert>
</div>
<div style="margin-left:5px;width: calc(100% - 85px)">
<el-alert title="/internal_messages" type="info" :closable="false" ></el-alert>
</div>
</el-row>



##### 请求参数 {docsify-ignore}
|字段col300|类型col150|备注col400|
|---|---|----|
|n_id_eq|String|n_id_eq|
|n_name_like|String|n_name_like|
|n_owner_type_eq|String|n_owner_type_eq|
|n_title_eq|String|n_title_eq|



##### 请求示例： {docsify-ignore}
```json
{
  "page" : 0,
  "size" : 20,
  "sort" : null,
  "n_id_eq" : null,
  "n_name_like" : null,
  "n_owner_type_eq" : null,
  "n_title_eq" : null,
}
```





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