# cloud组织代理(cloud_proxy_organization)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|描述|DESCRIPTION|长文本，长度1000|2000|是||
|逻辑有效标志|ENABLE|是否逻辑|8|否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|机构编号|ORGANIZATION_NUMBER|文本，可指定长度|100|否||
|父标识|PID|外键值|100|是||
|名称|PNAME|外键值文本|200|是||
|简称|SHORT_NAME|文本，可指定长度|100|是||
|排序|SORT|大整型|20|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_CLOUD_PROXY_ORGANIZATION_CLOUD_PROXY_ORGANIZATION_PID](der/DER1N_CLOUD_PROXY_ORGANIZATION_CLOUD_PROXY_ORGANIZATION_PID)|[cloud组织代理(CLOUD_PROXY_ORGANIZATION)](module/cloud_proxy/cloud_proxy_organization)|1:N关系||
|[DER1N_CLOUD_PROXY_USER_CLOUD_PROXY_ORGANIZATION_CLOUD_PROXY_ORGANIZATION_ID](der/DER1N_CLOUD_PROXY_USER_CLOUD_PROXY_ORGANIZATION_CLOUD_PROXY_ORGANIZATION_ID)|[cloud用户代理(CLOUD_PROXY_USER)](module/cloud_proxy/cloud_proxy_user)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_CLOUD_PROXY_ORGANIZATION_CLOUD_PROXY_ORGANIZATION_PID](der/DER1N_CLOUD_PROXY_ORGANIZATION_CLOUD_PROXY_ORGANIZATION_PID)|[cloud组织代理(CLOUD_PROXY_ORGANIZATION)](module/cloud_proxy/cloud_proxy_organization)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/cloud_proxy/cloud_proxy_organization/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/cloud_proxy/cloud_proxy_organization/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/cloud_proxy/cloud_proxy_organization/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PID_EQ|父标识|EQ||
|N_PNAME_EQ|名称|EQ||
|N_PNAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/cloud_proxy/cloud_proxy_organization?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/cloud_proxy/cloud_proxy_organization?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/cloud_proxy/cloud_proxy_organization?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/cloud_proxy/cloud_proxy_organization?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/cloud_proxy/cloud_proxy_organization?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/cloud_proxy/cloud_proxy_organization?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {
show_der:'major',


      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>