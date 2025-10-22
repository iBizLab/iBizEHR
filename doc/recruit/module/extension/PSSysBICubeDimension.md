# 智能报表立方体维度(PSSysBICubeDimension)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|维度类型|BIDIMENSIONTYPE|[单项选择(文本值)](index/dictionary_index#BIDimensionType "多维分析维度类别")|30|是||
|代码名称|CODENAME|文本，可指定长度|60|是||
|维度公式|DIMENSIONFORMULA|长文本，长度1000|4000|是||
|扩展模型|DYNAMODELFLAG|是否逻辑||是||
|备注|MEMO|长文本，长度1000|2000|是||
|代码表|PSCODELISTID|文本，可指定长度|100|是||
|代码表|PSCODELISTNAME|文本，可指定长度|100|是||
|立方体维度标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|PSSYSBICUBEDIMENSIONID|全局唯一标识，文本类型，用户不可见|100|否||
|立方体维度名称|PSSYSBICUBEDIMENSIONNAME|文本，可指定长度|200|否||
|智能报表立方体|PSSYSBICUBEID|文本，可指定长度|100|否||
|智能报表立方体|PSSYSBICUBENAME|文本，可指定长度|100|是||
|PSSYSBISCHEMEID|PSSYSBISCHEMEID|文本，可指定长度|100|是||
|启用|VALIDFLAG|是否逻辑||否||


## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|应用|apply|用户自定义|默认|不支持||||
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
|[DEFAULT](module/extension/PSSysBICubeDimension/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/extension/PSSysBICubeDimension/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/extension/PSSysBICubeDimension/dataset/Default)|DEFAULT|数据查询|是|||

## 数据权限

##### 全部数据（读写） :id=PSSysBICubeDimension-ALL_RW

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `UPDATE`
* `READ`
* `CREATE`
* `DELETE`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_BIDIMENSIONTYPE_EQ|维度类型|EQ||
|N_PSSYSBICUBEDIMENSIONID_EQ|立方体维度标识|EQ||
|N_PSSYSBICUBEDIMENSIONNAME_LIKE|立方体维度名称|LIKE||
|N_PSSYSBICUBEID_EQ|智能报表立方体|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/extension/PSSysBICubeDimension?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/extension/PSSysBICubeDimension?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/extension/PSSysBICubeDimension?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/extension/PSSysBICubeDimension?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/extension/PSSysBICubeDimension?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/extension/PSSysBICubeDimension?id=搜索模式`">
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