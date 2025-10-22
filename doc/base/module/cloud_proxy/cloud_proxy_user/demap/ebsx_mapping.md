## ebsx映射(ebsx_mapping) <!-- {docsify-ignore-all} -->



<br>

<p class="panel-title"><b>实体</b></p>

* [cloud用户代理(CLOUD_PROXY_USER)](module/cloud_proxy/CLOUD_PROXY_USER)

<p class="panel-title"><b>映射实体</b></p>

* [人员(SYS_EMP)](module/ebsx/SYS_EMP)


<p class="panel-title"><b>属性映射</b></p>

* `属性等价`
`DEPARTMENT_ID(部门标识)` <i class="fa fa-angle-double-right"/></i> `MDEPTID(主部门)`
* `属性等价`
`ORGANIZATION_ID(组织标识)` <i class="fa fa-angle-double-right"/></i> `ORGID(单位)`
* `属性等价`
`ORGANIZATION_NAME(组织名称)` <i class="fa fa-angle-double-right"/></i> `ORGNAME(单位名称)`
* `属性等价`
`AVATAR(头像)` <i class="fa fa-angle-double-right"/></i> `USERICON(照片)`
* `属性等价`
`MOBILE(手机号)` <i class="fa fa-angle-double-right"/></i> `PHONE(手机号)`
* `属性等价`
`LOGIN(登录)` <i class="fa fa-angle-double-right"/></i> `USERCODE(用户工号)`
* `属性等价`
`STATUS(状态)` <i class="fa fa-angle-double-right"/></i> `STATE(人员状态)`
* `属性等价`
`DEPARTMENT_NAME(部门名称)` <i class="fa fa-angle-double-right"/></i> `MDEPTNAME(主部门名称)`
* `属性等价`
`TITLE(职位)` <i class="fa fa-angle-double-right"/></i> `POSTNAME(岗位名称)`
* `属性等价`
`LOGIN(登录)` <i class="fa fa-angle-double-right"/></i> `LOGINNAME(登录名)`
* `属性等价`
`NAME(名称)` <i class="fa fa-angle-double-right"/></i> `PERSONNAME(姓名)`
* `属性等价`
`ID(标识)` <i class="fa fa-angle-double-right"/></i> `USERID(用户标识)`
* `属性等价`
`PASSWORD(密码)` <i class="fa fa-angle-double-right"/></i> `PASSWORD(密码)`
* `属性等价`
`EMAIL(邮箱)` <i class="fa fa-angle-double-right"/></i> `EMAIL(邮件)`

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

<p class="panel-title"><b>集合映射</b></p>

* `内部处理`
`DEFAULT(DEFAULT)` <i class="fa fa-angle-double-right"/></i> `DEFAULT(数据集)` 并且 `启用查询条件`
