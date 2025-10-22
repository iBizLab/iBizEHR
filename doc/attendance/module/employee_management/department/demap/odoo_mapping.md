## odoo_mapping(odoo_mapping) <!-- {docsify-ignore-all} -->



<br>

<p class="panel-title"><b>实体</b></p>

* [部门信息(DEPARTMENT)](module/employee_management/DEPARTMENT)

<p class="panel-title"><b>映射实体</b></p>

* [部门(HR_DEPARTMENT)](module/hr/HR_DEPARTMENT)


<p class="panel-title"><b>属性映射</b></p>

* `属性等价`
`PARENT_ID(上级部门ID)` <i class="fa fa-angle-double-right"/></i> `PARENT_ID(上级部门)`
* `属性等价`
`ID(主键)` <i class="fa fa-angle-double-right"/></i> `ID(标识)`
* `属性等价`
`NAME(部门名称)` <i class="fa fa-angle-double-right"/></i> `NAME(名称)`
* `属性等价`
`WRITE_UID(更新人)` <i class="fa fa-angle-double-right"/></i> `WRITE_UID(更新人)`
* `属性等价`
`CREATE_UID(创建人)` <i class="fa fa-angle-double-right"/></i> `CREATE_UID(建立人)`
* `属性等价`
`WRITE_DATE(更新时间)` <i class="fa fa-angle-double-right"/></i> `WRITE_DATE(更新时间)`
* `属性等价`
`CREATE_DATE(创建时间)` <i class="fa fa-angle-double-right"/></i> `CREATE_DATE(建立时间)`
* `属性等价`
`PARENT_NAME(上级部门名称)` <i class="fa fa-angle-double-right"/></i> `PARENT_NAME(上级部门)`

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
`DEFAULT(DEFAULT)` <i class="fa fa-angle-double-right"/></i> `DEFAULT(DEFAULT)` 
* `默认`
`root(根部门)` <i class="fa fa-angle-double-right"/></i> `DEFAULT(DEFAULT)` 并且 `启用查询条件`
* `默认`
`dept(部门)` <i class="fa fa-angle-double-right"/></i> `DEFAULT(DEFAULT)` 并且 `启用查询条件`
* `默认`
`root(根部门)` <i class="fa fa-angle-double-right"/></i> `ROOT(根部门)` 

<p class="panel-title"><b>集合映射</b></p>

* `默认`
`root(根部门)` <i class="fa fa-angle-double-right"/></i> `DEFAULT(DEFAULT)` 并且 `启用查询条件`
* `默认`
`dept(部门)` <i class="fa fa-angle-double-right"/></i> `DEFAULT(DEFAULT)` 并且 `启用查询条件`
* `默认`
`DEFAULT(DEFAULT)` <i class="fa fa-angle-double-right"/></i> `DEFAULT(DEFAULT)` 
* `默认`
`root(根部门)` <i class="fa fa-angle-double-right"/></i> `ROOT(根部门)` 
