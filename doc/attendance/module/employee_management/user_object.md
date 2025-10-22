# 用户对象映射(user_object)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|建立时间|CREATE_DATE|日期时间型||否||
|建立人|CREATE_UID|文本，可指定长度|100|否||
|部门ID|DEPT_ID|文本，可指定长度|100|是||
|供应商ID|GYS_INFOID|文本，可指定长度|100|是||
|标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|100|否||
|名称|NAME|文本，可指定长度|200|是||
|上级部门ID标识|PARENT_ID|外键值|100|是||
|上级部门ID名称|PARENT_NAME|外键值文本|200|是||
|状态|STATUS|文本，可指定长度|20|是||
|类型|TYPE|文本，可指定长度|100|是||
|更新时间|WRITE_DATE|日期时间型||否||
|更新人|WRITE_UID|文本，可指定长度|100|否||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_ATTENDANCE_GROUP_SHIFT_MEMBER_USER_OBJECT_USER_ID](der/DER1N_ATTENDANCE_GROUP_SHIFT_MEMBER_USER_OBJECT_USER_ID)|[考勤规则成员(ATTENDANCE_GROUP_SHIFT_MEMBER)](module/attendance/attendance_group_shift_member)|1:N关系||
|[DER1N_USER_OBJECT_USER_OBJECT_PARENT_ID](der/DER1N_USER_OBJECT_USER_OBJECT_PARENT_ID)|[用户对象映射(USER_OBJECT)](module/employee_management/user_object)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_USER_OBJECT_USER_OBJECT_PARENT_ID](der/DER1N_USER_OBJECT_USER_OBJECT_PARENT_ID)|[用户对象映射(USER_OBJECT)](module/employee_management/user_object)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 映射
| 名称col150    | 映射实体col200   | 备注col900  |
| -------- |----------  |----- |
|[部门映射](module/employee_management/user_object/demap/dept_mapping)|[部门信息(DEPARTMENT)](module/employee_management/department)||
|[人员映射](module/employee_management/user_object/demap/person_mapping)|[员工信息(EMPLOYEE)](module/employee_management/employee)||

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
|[我的部门](module/employee_management/user_object/logic/my_dept)|my_dept|无|||
|[查询部门/人员](module/employee_management/user_object/logic/queryDeptUser)|queryDeptUser|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/employee_management/user_object/query/Default)|DEFAULT|是|否 |否 ||
|[默认（全部数据）(VIEW)](module/employee_management/user_object/query/View)|VIEW|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/employee_management/user_object/dataset/Default)|DEFAULT|数据查询|是|||
|[部门(dept)](module/employee_management/user_object/dataset/dept)|dept|数据查询|否|||
|[我的部门(my_dept)](module/employee_management/user_object/dataset/my_dept)|my_dept|[实体逻辑](module/employee_management/user_object/logic/my_dept)|否|||
|[根部门(root)](module/employee_management/user_object/dataset/root)|root|数据查询|否|||
|[人员(user)](module/employee_management/user_object/dataset/user)|user|数据查询|否|||

## 数据权限

##### 全部数据（读） :id=user_object-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我部门的（读） :id=user_object-MYDEPT_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门 <i class="fa fa-check-square"/></i> 下级部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的班组（读） :id=user_object-MYGROUP_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的厂商（读） :id=user_object-MYGYS_R

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('GYS_INFOID','=',#{srf.sessioncontext.srforgsectorid})]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|标识|EQ||
|N_NAME_LIKE|名称|LIKE||
|N_PARENT_ID_EQ|上级部门ID标识|EQ||
|N_PARENT_NAME_EQ|上级部门ID名称|EQ||
|N_PARENT_NAME_LIKE|上级部门ID名称|LIKE||
|N_STATUS_EQ|状态|EQ||
|N_TYPE_EQ|类型|EQ||

## 界面行为
|  中文名col200 |  代码名col150 |  标题col100   |     处理目标col100   |    处理类型col200        |  备注col500       |
| --------| --------| -------- |------------|------------|------------|
| 确定 | panel_ad53b0c56ee8e1c9b32_button_okaction_click | 确定 |无数据|自定义代码||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/employee_management/user_object?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/user_object?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/user_object?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/user_object?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/user_object?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/user_object?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/user_object?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/user_object?id=搜索模式`">
  搜索模式
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/user_object?id=界面行为`">
  界面行为
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