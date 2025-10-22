# iBizEHR人力资源管理系统

基础系统配置地址：http://ehr.ibizlab.cn/modeling/index.html
招聘子系统配置地址：http://ehr.ibizlab.cn/modeling/recruit.html    
假勤子系统配置地址：http://ehr.ibizlab.cn/modeling/attendance.html


#### 系统模块

|    模块名称col200   | 代码名col200      |  模型组col200   |   备注col400  |
| --------  |------------| -----    |-------- |
|[基础模块](module/base)|base|||
|[基础(扩展)](module/base_extend)|base_extend|||
|[资源](module/resource)|resource|||
|[人力资源](module/hr)|hr|||
|[邮件](module/mail)|mail|||
|[讨论](module/discuss)|discuss|||
|[CRM](module/crm)|crm|||
|[收藏](module/fav)|fav|||
|[cloud服务代理](module/cloud_proxy)|cloud_proxy|||
|[ebsx系统管理](module/ebsx)|ebsx|ebsx模型组[^ebsx]|ebsx部门及人员业务实体的映射。|
|[模型扩展](module/extension)|extension||主要包含模型扩展类实体。|


#### 服务接口

|  中文名col200      |   代码名col200 |   备注col600  |
|  --------   |------------  |  -----   |
|[ServiceAPI](api/ServiceAPI/ServiceAPI)|ServiceAPI||

#### 对接外部接口

|  中文名col200      |   代码名col200  |    备注col600  |
|  --------   |------------|    -----   |
|[ebsx系统管理](client/iBizRTClient/iBizRTClient)|iBizRTClient||
|[模型扩展](client/extension/extension)|extension||

#### 系统应用

|  中文名col200      |   代码名col200  |   备注col600  |
|  --------   |------------ |  -----   |
|[<i class="fa-solid fa-desktop"></i>iBizEHR 人力资源](app/ehrapp)|ehrapp||


#### 国际化支持

|  中文名col200      |   代码名col200  |   资源项col100    |   备注col500  |
|  --------   |------------ |  ----- |  :-----:   |
|[简体中文](i18n/ZH_CN)|ZH_CN|5||

#### 数据库支持

|  中文名col200      |   代码名col200  |   备注col600  |
|  --------   |------------|  -----   |
|[MYSQL5](db/MYSQL5)|MYSQL5||
[^ebsx]: allinone模型组
