# 银行(res_bank)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|有效|ACTIVE|是否逻辑||是||
|银行识别码|BIC|文本，可指定长度|500|是||
|城市|CITY|文本，可指定长度|500|是||
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|显示名称|DISPLAY_NAME|文本，可指定长度|500|是||
|邮箱|EMAIL|文本，可指定长度|500|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|电话|PHONE|文本，可指定长度|500|是||
|街道|STREET|文本，可指定长度|500|是||
|详细地址|STREET2|文本，可指定长度|500|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||
|邮编|ZIP|文本，可指定长度|500|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_RES_PARTNER_BANK_RES_BANK_BANK_ID](der/DER1N_RES_PARTNER_BANK_RES_BANK_BANK_ID)|[银行账号(RES_PARTNER_BANK)](module/base/res_partner_bank)|1:N关系||


</el-tab-pane>
</el-tabs>
</el-row>

## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_bank?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_bank?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_bank?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_bank?id=搜索模式`">
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