# 序列(ir_sequence)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|序列类型|CODE|文本，可指定长度|500|是||
|公司|COMPANY_ID|外键值|100|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|实施策略|IMPLEMENTATION|[单项选择(文本值)](index/dictionary_index#ir_sequence_implementation "实施策略")|60|否||
|名称|NAME|文本，可指定长度|200|是||
|步长|NUMBER_INCREMENT|整型||否||
|下一个编号|NUMBER_NEXT|整型||否||
|序列填充长度|PADDING|整型||否||
|前缀|PREFIX|文本，可指定长度|500|是||
|后缀|SUFFIX|文本，可指定长度|500|是||
|按日期重编序列号|USE_DATE_RANGE|是否逻辑||是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_RES_COMPANY_IR_SEQUENCE_BATCH_PAYMENT_SEQUENCE_ID](der/DER1N_RES_COMPANY_IR_SEQUENCE_BATCH_PAYMENT_SEQUENCE_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_IR_SEQUENCE_RES_COMPANY_COMPANY_ID](der/DER1N_IR_SEQUENCE_RES_COMPANY_COMPANY_ID)|[公司(RES_COMPANY)](module/base/res_company)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_COMPANY_ID_EQ|公司|EQ||
|N_ID_EQ|标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/ir_sequence?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_sequence?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_sequence?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/ir_sequence?id=搜索模式`">
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