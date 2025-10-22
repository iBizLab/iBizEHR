## 人员映射(person_mapping) <!-- {docsify-ignore-all} -->



<br>

<p class="panel-title"><b>实体</b></p>

* [用户对象映射(USER_OBJECT)](module/employee_management/USER_OBJECT)

<p class="panel-title"><b>映射实体</b></p>

* [员工信息(EMPLOYEE)](module/employee_management/EMPLOYEE)


<p class="panel-title"><b>属性映射</b></p>

* `属性等价`
`NAME(名称)` <i class="fa fa-angle-double-right"/></i> `NAME(员工姓名)`
* `属性等价`
`DEPT_ID(部门ID)` <i class="fa fa-angle-double-right"/></i> `DEPT_ID(部门ID)`
* `属性等价`
`STATUS(状态)` <i class="fa fa-angle-double-right"/></i> `STATUS(员工状态)`
* `直接值到源属性`
`'person'` <i class="fa fa-angle-double-right"/></i> `TYPE(类型)`
* `属性等价`
`ID(标识)` <i class="fa fa-angle-double-right"/></i> `ID(主键)`
* `属性等价`
`GYS_INFOID(供应商ID)` <i class="fa fa-angle-double-right"/></i> `GYS_INFOID`
* `属性等价`
`PARENT_ID(上级部门ID标识)` <i class="fa fa-angle-double-right"/></i> `DEPT_ID(部门ID)`

<p class="panel-title"><b>集合映射</b></p>

* `内部处理`
`user(人员)` <i class="fa fa-angle-double-right"/></i> `user(员工)` 并且 `启用查询条件`
