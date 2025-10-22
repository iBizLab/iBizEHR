## 部门映射(dept_mapping) <!-- {docsify-ignore-all} -->



<br>

<p class="panel-title"><b>实体</b></p>

* [用户对象映射(USER_OBJECT)](module/employee_management/USER_OBJECT)

<p class="panel-title"><b>映射实体</b></p>

* [部门信息(DEPARTMENT)](module/employee_management/DEPARTMENT)


<p class="panel-title"><b>属性映射</b></p>

* `属性等价`
`NAME(名称)` <i class="fa fa-angle-double-right"/></i> `NAME(部门名称)`
* `直接值到源属性`
`'dept'` <i class="fa fa-angle-double-right"/></i> `TYPE(类型)`
* `属性等价`
`DEPT_ID(部门ID)` <i class="fa fa-angle-double-right"/></i> `ID(主键)`
* `属性等价`
`STATUS(状态)` <i class="fa fa-angle-double-right"/></i> `STATUS(部门状态)`
* `属性等价`
`ID(标识)` <i class="fa fa-angle-double-right"/></i> `ID(主键)`
* `属性等价`
`PARENT_ID(上级部门ID标识)` <i class="fa fa-angle-double-right"/></i> `PARENT_ID(上级部门ID)`
* `属性等价`
`PARENT_NAME(上级部门ID名称)` <i class="fa fa-angle-double-right"/></i> `PARENT_NAME(上级部门名称)`

<p class="panel-title"><b>集合映射</b></p>

* `默认`
`root(根部门)` <i class="fa fa-angle-double-right"/></i> `root(根部门)` 
* `默认`
`dept(部门)` <i class="fa fa-angle-double-right"/></i> `dept(部门)` 
