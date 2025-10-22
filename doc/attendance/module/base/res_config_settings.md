# 配置设定(res_config_settings)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|条码来源|ATTENDANCE_BARCODE_SOURCE|[单项选择(文本值)](index/dictionary_index#barcode_source "条码来源")|60|是||
|来自 Systray 的出席情况|ATTENDANCE_FROM_SYSTRAY|是否逻辑||是||
|自助考勤终端延迟|ATTENDANCE_KIOSK_DELAY|整型||是||
|考勤模式|ATTENDANCE_KIOSK_MODE|[单项选择(文本值)](index/dictionary_index#kiosk_mode "考勤模式")|60|是||
|自助考勤终端网址|ATTENDANCE_KIOSK_URL|长文本，长度1000|2000|是||
|员工pin|ATTENDANCE_KIOSK_USE_PIN|是否逻辑||是||
|额外工时验证|ATTENDANCE_OVERTIME_VALIDATION|[单项选择(文本值)](index/dictionary_index#overtime_validation "加班时长校验")|60|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||


## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |
|CheckKey|CheckKey|内置方法|默认|不支持||||
|Create|Create|内置方法|默认|不支持||||
|CreateTemp|CreateTemp|内置方法|默认|不支持||||
|CreateTempMajor|CreateTempMajor|内置方法|默认|不支持||||
|Get|Get|内置方法|默认|不支持||||
|GetDraft|GetDraft|内置方法|默认|不支持||||
|GetDraftTemp|GetDraftTemp|内置方法|默认|不支持||||
|GetDraftTempMajor|GetDraftTempMajor|内置方法|默认|不支持||||
|GetTemp|GetTemp|内置方法|默认|不支持||||
|GetTempMajor|GetTempMajor|内置方法|默认|不支持||||
|Remove|Remove|内置方法|默认|支持||||
|RemoveTemp|RemoveTemp|内置方法|默认|支持||||
|RemoveTempMajor|RemoveTempMajor|内置方法|默认|支持||||
|Save|Save|内置方法|默认|不支持||||
|Update|Update|内置方法|默认|不支持||||
|UpdateTemp|UpdateTemp|内置方法|默认|不支持||||
|UpdateTempMajor|UpdateTempMajor|内置方法|默认|不支持||||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/base/res_config_settings/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/base/res_config_settings/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/base/res_config_settings/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ATTENDANCE_BARCODE_SOURCE_EQ|条码来源|EQ||
|N_ATTENDANCE_KIOSK_MODE_EQ|考勤模式|EQ||
|N_ATTENDANCE_OVERTIME_VALIDATION_EQ|额外工时验证|EQ||
|N_ID_EQ|标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/base/res_config_settings?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_config_settings?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_config_settings?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_config_settings?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/base/res_config_settings?id=搜索模式`">
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