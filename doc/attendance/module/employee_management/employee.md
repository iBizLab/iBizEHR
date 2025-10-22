# 员工信息(employee)  <!-- {docsify-ignore-all} -->


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|创建时间|CREATE_DATE|日期时间型||是||
|创建人|CREATE_UID|文本，可指定长度|100|是||
|部门ID|DEPT_ID|外键值|60|是||
|部门名称|DEPT_NAME|外键值文本|255|是||
|工号|EMPLOYEE_NUM|文本，可指定长度|20|是||
|主键<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|ID|全局唯一标识，文本类型，用户不可见|60|是||
|成员类型|MEMBER_TYPE|大整型|20|是||
|手机号|MOBILE|文本，可指定长度|100|是||
|员工姓名|NAME|文本，可指定长度|255|否||
|员工状态|STATUS|文本，可指定长度|20|是||
|职位|TITLE|文本，可指定长度|50|是||
|更新人|WRITE_UID|文本，可指定长度|100|是||


## 关系

<el-row>
<el-tabs v-model="show_der">
<el-tab-pane label="主关系" name="major">

| 名称col350     |   从实体col200 | 关系类型col200     |   备注col500  |
| -------- |---------- |------------|----- |
|[DER1N_ATTENDANCE_CHECKIN_APPLICATION_EMPLOYEE_APPLICANT_ID](der/DER1N_ATTENDANCE_CHECKIN_APPLICATION_EMPLOYEE_APPLICANT_ID)|[考勤申请记录(ATTENDANCE_CHECKIN_APPLICATION)](module/attendance/attendance_checkin_application)|1:N关系||
|[DER1N_ATTENDANCE_RECORD_EMPLOYEE_MEMBER_ID](der/DER1N_ATTENDANCE_RECORD_EMPLOYEE_MEMBER_ID)|[考勤记录(ATTENDANCE_RECORD)](module/attendance/attendance_record)|1:N关系||
|[DER1N_ATTENDANCE_SCHEDULE_EMPLOYEE_MEMBER_ID](der/DER1N_ATTENDANCE_SCHEDULE_EMPLOYEE_MEMBER_ID)|[排班(ATTENDANCE_SCHEDULE)](module/attendance/attendance_schedule)|1:N关系||


</el-tab-pane>
<el-tab-pane label="从关系" name="minor">

|  名称col350   | 主实体col200   | 关系类型col200   |    备注col500  |
| -------- |---------- |-----------|----- |
|[DER1N_EMPLOYEE_DEPARTMENT_DEPT_ID](der/DER1N_EMPLOYEE_DEPARTMENT_DEPT_ID)|[部门信息(DEPARTMENT)](module/employee_management/department)|1:N关系||

</el-tab-pane>
</el-tabs>
</el-row>

## 映射
| 名称col150    | 映射实体col200   | 备注col900  |
| -------- |----------  |----- |
|[odoo_mapping](module/employee_management/employee/demap/odoo_mapping)|[员工(HR_EMPLOYEE)](module/hr/hr_employee)||

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
|批量更新|batchUpdate|内置方法|默认|仅支持批操作||||
|无操作|nothing|[实体处理逻辑](module/employee_management/employee/logic/nothing "无操作")|默认|不支持||||

## 处理逻辑
| 中文名col200    | 代码名col150    | 子类型col150    | 插件col200    |  备注col550  |
| -------- |---------- |----------- |------------|----------|
|[无操作](module/employee_management/employee/logic/nothing)|nothing|无||无操作逻辑，用于替换表单的获取数据行为|
|[获取员工信息(特定搜索条件)](module/employee_management/employee/logic/employee)|employee|无|||

## 数据查询
| 中文名col200    | 代码名col150    | 默认查询col100 | 权限使用col100 | 自定义SQLcol100 |  备注col600|
| --------  | --------   | :----:  |:----:  | :----:  |----- |
|[DEFAULT](module/employee_management/employee/query/Default)|DEFAULT|是|否 |否 ||
|[供应商人员(gys_emp)](module/employee_management/employee/query/gys_emp)|gys_emp|否|否 |否 ||
|[数据查询(user)](module/employee_management/employee/query/user)|user|否|否 |否 ||

## 数据集合
| 中文名col200  | 代码名col150  | 类型col100 | 默认集合col100 |   插件col200|   备注col500|
| --------  | --------   | :----:   | :----:   | ----- |----- |
|[DEFAULT](module/employee_management/employee/dataset/Default)|DEFAULT|数据查询|是|||
|[部门人员(deptall)](module/employee_management/employee/dataset/deptall)|deptall|数据查询|否|[EmployeeDEDataSetRuntime](index/plugin_index#EmployeeDEDataSetRuntime)|部门下所有人员|
|[获取员工信息(特定搜索条件)(employee)](module/employee_management/employee/dataset/employee)|employee|[实体逻辑](module/employee_management/employee/logic/employee)|否|||
|[供应商人员(gys_emp)](module/employee_management/employee/dataset/gys_emp)|gys_emp|数据查询|否|||
|[员工(user)](module/employee_management/employee/dataset/user)|user|数据查询|否|||

## 数据权限

##### 我部门的（读） :id=employee-MYDEPT_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门 <i class="fa fa-check-square"/></i> 下级部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的班组（读） :id=employee-MYGROUP_R

<p class="panel-title"><b>数据范围</b></p>

* `部门范围` ： <i class="fa fa-check-square"/></i> 当前部门

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 我的厂商（读） :id=employee-MYGYS_R

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('GYS_INFOID','=',#{srf.sessioncontext.srforgsectorid})]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`



##### 需求人是我（读） :id=employee-XQRSW_R

<p class="panel-title"><b>数据范围</b></p>

* `自定义条件` ：`[('XQSYRID','=',#{srf.sessioncontext.srfuserid})]`

<p class="panel-title"><b>数据能力</b></p>

* `READ`




## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_DEPT_ID_EQ|部门ID|EQ||
|N_DEPT_NAME_EQ|部门名称|EQ||
|N_DEPT_NAME_LIKE|部门名称|LIKE||
|N_ID_EQ|主键|EQ||
|N_MOBILE_IN|手机号|IN||
|N_NAME_LIKE|员工姓名|LIKE||
|N_STATUS_EQ|员工状态|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/employee_management/employee?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/employee?id=关系`">
  关系
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/employee?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/employee?id=处理逻辑`">
  处理逻辑
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/employee?id=数据查询`">
  数据查询
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/employee?id=数据集合`">
  数据集合
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/employee?id=数据权限`">
  数据权限
</el-anchor-link>
<el-anchor-link :href="`#/module/employee_management/employee?id=搜索模式`">
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