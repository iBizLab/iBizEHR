# 附件(ir_attachment)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|访问令牌|ACCESS_TOKEN|文本，可指定长度|500|是||
|校验码/SHA1|CHECKSUM|文本，可指定长度|500|是||
|公司|COMPANY_ID|外键值|60|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|描述|DESCRIPTION|长文本，没有长度限制|1048576|是||
|oss文件标识|FILE_ID|文件|500|是||
|文件大小|FILE_SIZE|整型||是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|索引内容|INDEX_CONTENT|长文本，没有长度限制|1048576|是||
|Mime类型|MIMETYPE|文本，可指定长度|500|是||
|名称|NAME|文本，可指定长度|200|是||
|原始（未优化，未调整大小）附件|ORIGINAL_ID|外键值|100|是||
|是公开文件|PUBLIC|是否逻辑||是||
|资源字段|RES_FIELD|文本，可指定长度|500|是||
|资源标识|RES_ID|文本，可指定长度|100|是||
|资源模型|RES_MODEL|文本，可指定长度|500|是||
|存储的文件名|STORE_FNAME|文本，可指定长度|500|是||
|类型|TYPE|单项选择(文本值)|60|否||
|网址|URL|文本，可指定长度|500|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_HR_APPLICANT_REFUSE_REASON_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID](der/DER1N_HR_APPLICANT_REFUSE_REASON_IR_ATTACHMENT_MESSAGE_MAIN_ATTACHMENT_ID)|[ 拒绝原因申请人(HR_APPLICANT_REFUSE_REASON)](module/hr/hr_applicant_refuse_reason)|1:N关系||
|[DER1N_IR_ATTACHMENT_IR_ATTACHMENT_ORIGINAL_ID](der/DER1N_IR_ATTACHMENT_IR_ATTACHMENT_ORIGINAL_ID)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_IR_ATTACHMENT_IR_ATTACHMENT_ORIGINAL_ID](der/DER1N_IR_ATTACHMENT_IR_ATTACHMENT_ORIGINAL_ID)|[附件(IR_ATTACHMENT)](module/base/ir_attachment)|1:N关系||
|[DER1N_IR_ATTACHMENT_RES_COMPANY_COMPANY_ID](der/DER1N_IR_ATTACHMENT_RES_COMPANY_COMPANY_ID)|[组织(RES_COMPANY)](module/base/res_company)|1:N关系||

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
|[数据查询(DEFAULT)](module/base/ir_attachment/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/ir_attachment/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[数据集(DEFAULT)](module/base/ir_attachment/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_COMPANY_ID_EQ|公司|EQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_ORIGINAL_ID_EQ|原始（未优化，未调整大小）附件|EQ||
|N_TYPE_EQ|类型|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/ir_attachment?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_attachment?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_attachment?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_attachment?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_attachment?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_attachment?id=搜索模式`">
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