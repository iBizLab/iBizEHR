# 部门信息(department)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|创建时间|CREATE_DATE|日期时间型||是||
|创建人|CREATE_UID|文本，可指定长度|100|是||
|主键<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|部门名称|NAME|文本，可指定长度|255|否||
|机构ID|ORGID|文本，可指定长度|100|是||
|上级部门ID|PARENT_ID|外键值|60|是||
|上级部门名称|PARENT_NAME|外键值文本|255|是||
|系统分类ID|SRFDCID|文本，可指定长度|100|是||
|部门状态|STATUS|文本，可指定长度|20|是||
|更新时间|WRITE_DATE|日期时间型||是||
|更新人|WRITE_UID|文本，可指定长度|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_DEPARTMENT_DEPARTMENT_PARENT_ID](der/DER1N_DEPARTMENT_DEPARTMENT_PARENT_ID)|[部门信息(DEPARTMENT)](module/employee_management/department)|1:N关系||
|[DER1N_EMPLOYEE_DEPARTMENT_DEPT_ID](der/DER1N_EMPLOYEE_DEPARTMENT_DEPT_ID)|[员工信息(EMPLOYEE)](module/employee_management/employee)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_DEPARTMENT_DEPARTMENT_PARENT_ID](der/DER1N_DEPARTMENT_DEPARTMENT_PARENT_ID)|[部门信息(DEPARTMENT)](module/employee_management/department)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 映射
| 名称col150    | 映射实体col200   | 备注col900  |
| -------- |----------  |----- |
|[odoo_mapping](module/employee_management/department/demap/odoo_mapping)|[部门(HR_DEPARTMENT)](module/hr/hr_department)||

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
|[DEFAULT](module/employee_management/department/query/Default)|DEFAULT|是|否 |否 ||
|[部门(dept)](module/employee_management/department/query/dept)|dept|否|否 |否 ||
|[我的部门(my_dept)](module/employee_management/department/query/my_dept)|my_dept|否|否 |否 ||
|[根部门(root)](module/employee_management/department/query/root)|root|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/employee_management/department/dataset/Default)|DEFAULT|数据查询|是|||
|[部门(dept)](module/employee_management/department/dataset/dept)|dept|数据查询|否|||
|[我的部门(my_dept)](module/employee_management/department/dataset/my_dept)|my_dept|数据查询|否|||
|[根部门(root)](module/employee_management/department/dataset/root)|root|数据查询|否|||

## 数据权限

##### 全部数据（读） :id=department-ALL_R

<p class="panel-title"><b>数据范围</b></p>

* `全部数据`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我部门的（读） :id=department-MYDEPT_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门 <i class="fa fa-check-square"/></i> 下级部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的班组（读） :id=department-MYGROUP_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_ID_EQ|主键|EQ||
|N_NAME_LIKE|部门名称|LIKE||
|N_PARENT_ID_EQ|上级部门ID|EQ||
|N_PARENT_NAME_EQ|上级部门名称|EQ||
|N_PARENT_NAME_LIKE|上级部门名称|LIKE||
|N_STATUS_ISNULL|部门状态|ISNULL||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/employee_management/department?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/department?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/department?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/department?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/department?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/department?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/department?id=搜索模式`">
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