# 人力资源(hr) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[合同类型(HR_CONTRACT_TYPE)](module/hr/hr_contract_type)|hr_contract_type|主实体|SQL|hr_contract_type|否|否|自控制|否||
|[部门(HR_DEPARTMENT)](module/hr/hr_department)|hr_department|主实体|SQL|hr_department|否|否|自控制|否||
|[员工(HR_EMPLOYEE)](module/hr/hr_employee)|hr_employee|主实体|SQL|hr_employee|否|否|自控制|否||
|[基本员工(HR_EMPLOYEE_BASE)](module/hr/hr_employee_base)|hr_employee_base|抽象实体|无存储||否|否|自控制|否||
|[工作岗位(HR_JOB)](module/hr/hr_job)|hr_job|主实体|SQL|hr_job|否|否|自控制|否||
|[休假类型(HR_LEAVE_TYPE)](module/hr/hr_leave_type)|hr_leave_type|主实体|SQL|hr_leave_type|否|否|自控制|否||
|[工作地点(HR_WORK_LOCATION)](module/hr/hr_work_location)|hr_work_location|主实体|SQL|hr_work_location|否|否|自控制|否||

