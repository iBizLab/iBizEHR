# 活动Mixin(mail_activity_mixin)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|活动集合|ACTIVITIES|一对多关系数据集合|1048576|是||
|下一活动截止日期|ACTIVITY_DATE_DEADLINE|日期型||是||
|活动异常标示|ACTIVITY_EXCEPTION_DECORATION|[单项选择(文本值)](index/dictionary_index#mail_activity_mixin_activity_exception_decoration "活动异常标示")|200|是||
|图标|ACTIVITY_EXCEPTION_ICON|文本，可指定长度|500|是||
|活动状态|ACTIVITY_STATE|[单项选择(文本值)](index/dictionary_index#mail_activity_mixin_activity_state "活动状态")|200|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|我的活动截止时间|MY_ACTIVITY_DATE_DEADLINE|日期型||是||
|名称|NAME|文本，可指定长度|200|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DERCUSTOM_MAIL_ACTIVITY_MAIL_ACTIVITY_MIXIN](der/DERCUSTOM_MAIL_ACTIVITY_MAIL_ACTIVITY_MIXIN)|[活动(MAIL_ACTIVITY)](module/mail/mail_activity)|自定义关系||
|[DERMULINH_HR_DEPARTMENT_MAIL_ACTIVITY_MIXIN](der/DERMULINH_HR_DEPARTMENT_MAIL_ACTIVITY_MIXIN)|[部门(HR_DEPARTMENT)](module/hr/hr_department)|多继承关系（虚拟实体）||
|[DERMULINH_HR_EMPLOYEE_MAIL_ACTIVITY_MIXIN](der/DERMULINH_HR_EMPLOYEE_MAIL_ACTIVITY_MIXIN)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|多继承关系（虚拟实体）||
|[DERMULINH_RES_COMPANY_MAIL_ACTIVITY_MIXIN](der/DERMULINH_RES_COMPANY_MAIL_ACTIVITY_MIXIN)|[公司(RES_COMPANY)](module/base/res_company)|多继承关系（虚拟实体）||
|[DERMULINH_RES_PARTNER_MAIL_ACTIVITY_MIXIN](der/DERMULINH_RES_PARTNER_MAIL_ACTIVITY_MIXIN)|[联系人(RES_PARTNER)](module/base/res_partner)|多继承关系（虚拟实体）||


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

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[处理活动状态](module/mail/mail_activity_mixin/logic/process_activities)|process_activities|属性逻辑|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/mail/mail_activity_mixin/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/mail/mail_activity_mixin/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/mail/mail_activity_mixin/dataset/Default)|DEFAULT|数据查询|是|||

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ACTIVITY_EXCEPTION_DECORATION_EQ|活动异常标示|EQ||
|N_ACTIVITY_STATE_EQ|活动状态|EQ||
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/mail/mail_activity_mixin?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_mixin?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_mixin?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_mixin?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_mixin?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_mixin?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/mail/mail_activity_mixin?id=搜索模式`">
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