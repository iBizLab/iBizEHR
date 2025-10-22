# 字段(ir_model_fields)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|列 1|COLUMN1|文本，可指定长度|250|是||
|列 2|COLUMN2|文本，可指定长度|250|是||
|公司依赖|COMPANY_DEPENDENT|是否逻辑||是||
|全名|COMPLETE_NAME|文本，可指定长度|250|是||
|计算|COMPUTE|长文本，没有长度限制|1048576|是||
|可复制|COPIED|是否逻辑||是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|币别字段|CURRENCY_FIELD|文本，可指定长度|250|是||
|依赖于|DEPENDS|文本，可指定长度|250|是||
|域名|DOMAIN|文本，可指定长度|250|是||
|字段标签|FIELD_DESCRIPTION|文本，可指定长度|250|否||
|扩展组别|GROUP_EXPAND|是否逻辑||是||
|字段帮助|HELP|长文本，没有长度限制|1048576|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|索引|INDEX|是否逻辑||是||
|模型名称|MODEL|文本，可指定长度|250|否||
|名称|NAME|文本，可指定长度|200|是||
|关于删除|ON_DELETE|[单项选择(文本值)](index/dictionary_index#ir_model_fields_on_delete "关于删除")|60|是||
|只读|READONLY|是否逻辑||是||
|关联的字段|RELATED|文本，可指定长度|250|是||
|关联的模型|RELATION|文本，可指定长度|250|是||
|关联字段|RELATION_FIELD|文本，可指定长度|250|是||
|关系表|RELATION_TABLE|文本，可指定长度|250|是||
|必填|REQUIRED|是否逻辑||是||
|净化 HTML|SANITIZE|是否逻辑||是||
|净化 HTML 属性|SANITIZE_ATTRIBUTES|是否逻辑||是||
|净化 HTML 表格|SANITIZE_FORM|是否逻辑||是||
|可重写消毒 HTML|SANITIZE_OVERRIDABLE|是否逻辑||是||
|净化 HTML 样式|SANITIZE_STYLE|是否逻辑||是||
|清除 HTML 标记|SANITIZE_TAGS|是否逻辑||是||
|可选择|SELECTABLE|是否逻辑||是||
|大小|SIZE|整型||是||
|类型|STATE|[单项选择(文本值)](index/dictionary_index#ir_model_fields_state "类型")|60|否||
|存储|STORE|是否逻辑||是||
|剥离类属性|STRIP_CLASSES|是否逻辑||是||
|带状样式属性|STRIP_STYLE|是否逻辑||是||
|启用跟踪|TRACKING|整型||是||
|可翻译|TRANSLATE|是否逻辑||是||
|字段类型|TTYPE|[单项选择(文本值)](index/dictionary_index#ir_model_fields_ttype "字段类型")|60|否||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


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
|[DEFAULT](module/base/ir_model_fields/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/ir_model_fields/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/ir_model_fields/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/ir_model_fields?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_model_fields?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_model_fields?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_model_fields?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_model_fields?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

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