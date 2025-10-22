# ebsx系统管理(ebsx) <!-- {docsify-ignore-all} -->

ebsx部门及人员业务实体的映射。

### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[系统角色(SYS_ROLE)](module/ebsx/Role)|Role|主实体|ServiceAPI||否|否|自控制|否|角色映射实体|
|[部门(SYS_DEPT)](module/ebsx/SysDepartment)|SysDepartment|主实体|ServiceAPI||否|否|自控制|否|部门映射实体|
|[人员(SYS_EMP)](module/ebsx/SysEmployee)|SysEmployee|主实体|ServiceAPI||否|否|自控制|否|人员映射实体|
|[组织(SYS_ORG)](module/ebsx/SysOrganization)|SysOrganization|主实体|ServiceAPI||否|否|自控制|否|组织映射实体|

