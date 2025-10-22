## odoo_mapping(odoo_mapping) <!-- {docsify-ignore-all} -->



<br>

<p class="panel-title"><b>实体</b></p>

* [员工信息(EMPLOYEE)](module/employee_management/EMPLOYEE)

<p class="panel-title"><b>映射实体</b></p>

* [员工(HR_EMPLOYEE)](module/hr/HR_EMPLOYEE)


<p class="panel-title"><b>属性映射</b></p>

* `属性等价`
`DEPT_ID(部门ID)` <i class="fa fa-angle-double-right"/></i> `DEPARTMENT_ID(部门)`
* `属性等价`
`DEPT_NAME(部门名称)` <i class="fa fa-angle-double-right"/></i> `DEPARTMENT_NAME(部门名称)`
* `属性等价`
`NAME(员工姓名)` <i class="fa fa-angle-double-right"/></i> `NAME(名称)`
* `属性等价`
`WRITE_UID(更新人)` <i class="fa fa-angle-double-right"/></i> `WRITE_UID(更新人)`
* `属性等价`
`CREATE_UID(创建人)` <i class="fa fa-angle-double-right"/></i> `CREATE_UID(建立人)`
* `属性等价`
`ID(主键)` <i class="fa fa-angle-double-right"/></i> `ID(标识)`
* `属性等价`
`CREATE_DATE(创建时间)` <i class="fa fa-angle-double-right"/></i> `CREATE_DATE(建立时间)`

<p class="panel-title"><b>行为映射</b></p>

* `默认`
`Create` <i class="fa fa-angle-double-right"/></i> `Create`
* `默认`
`Update` <i class="fa fa-angle-double-right"/></i> `Update`
* `默认`
`Remove` <i class="fa fa-angle-double-right"/></i> `Remove`
* `默认`
`Get` <i class="fa fa-angle-double-right"/></i> `Get`
* `默认`
`GetDraft` <i class="fa fa-angle-double-right"/></i> `GetDraft`
* `默认`
`CheckKey` <i class="fa fa-angle-double-right"/></i> `CheckKey`
* `默认`
`Save` <i class="fa fa-angle-double-right"/></i> `Save`

<p class="panel-title"><b>查询映射</b></p>

* `默认`
`user(数据查询)` <i class="fa fa-angle-double-right"/></i> `DEFAULT(DEFAULT)` 
* `默认`
`DEFAULT(DEFAULT)` <i class="fa fa-angle-double-right"/></i> `DEFAULT(DEFAULT)` 

<p class="panel-title"><b>集合映射</b></p>

* `默认`
`DEFAULT(DEFAULT)` <i class="fa fa-angle-double-right"/></i> `DEFAULT(DEFAULT)` 
* `默认`
`user(员工)` <i class="fa fa-angle-double-right"/></i> `DEFAULT(DEFAULT)` 
