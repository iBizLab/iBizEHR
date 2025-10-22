# 🚀 欢迎来到 iBizEHR

💡 **本地部署 · 数据安全可控 · 高度可定制**

> **提示：** 本次 iBizEHR （人力资源管理）为我们对 2020 年开源版本的全面重制与升级。基于过去的实践与社区反馈，[iBizLab 开源实验室](https://www.ibizlab.cn/) 在 [iBizModeling](https://modeling.ibizlab.cn/)  平台基础上完成了架构重构与功能重做，面向企业级场景重新出发。平台定位于「开源、可扩展、轻应用合辑」，面向企业级 HR 场景提供可本地部署、可二次开发的完整解决方案，共建企业级开源 HR 生态。



## 🌐 在线体验

- **官方网站**: [https://ehr.ibizlab.cn](https://ehr.ibizlab.cn)
- **Demo 地址**：[https://ehr.ibizlab.cn/demo/](https://ehr.ibizlab.cn/demo/)
- **用户名 / 密码**：`demo_admin / 123456`
- **技术资料**: [https://ehr.ibizlab.cn/doc/](https://ehr.ibizlab.cn/doc/)
- **ModelingIDE** [https://ehr.ibizlab.cn/modeling/](https://ehr.ibizlab.cn/modeling/)
- **前端技术框架支持** [https://open.ibizlab.cn/apphub/](https://open.ibizlab.cn/apphub/)

![img](doc/images/ehr.gif)

## 🧭 为什么选择 iBizEHR？

* **重制升级**：基于 2020 年版的经验与社区反馈全面重构，代码与架构现代化。
* **模块化轻应用**：招聘、假勤、组织、人事、薪资、绩效等模块可独立部署与演进。
* **Odoo 规范对齐**：基础实体（hr.employee、hr.department、hr.job）参照 Odoo，便于后续与 iBizOdoo/第三方互通。
* **行业对标实现**：招聘借鉴 Moka、假勤参考 Deli、人事/薪资对标 Beisen，兼顾实用与开源可用性。
* **本地部署 & 数据可控**：支持离线部署，企业数据自主管理，有利于合规与安全。
* **模型驱动**：iBizModeling 支持 DSL→UI 自动映射，降低二次开发成本。
* **社区驱动**：欢迎企业与开发者共同参与路线与模块建设。


### 🗺 路线图（优先级与阶段）

- **阶段 1（已完成 2025/09/06）**：框架搭建、招聘管理首发（核心流程、面试管理、offer）。
- **阶段 2（已完成 2025/09/27）**：假勤管理（参考 Deli）、组织管理（iBizOdoo 对齐）。
- **阶段 3（近期计划）**：人事管理、薪资管理（Beisen 对标）。
- **阶段 4（长期）**：绩效管理、跨系统高级集成、生态插件市场。

> 注：具体上线时间由社区贡献与企业需求驱动，欢迎参与 Roadmap 制定。


## 🏗️ iBizEHR 架构说明 — 基于 iBizEngine 的模块化 EHR 系统

iBizEHR 建立在 [**iBiz Engine**](https://www.ibizlab.cn/bizengine.html) 之上，这是一个受到 Odoo 启发的通用业务引擎，负责提供最底层的系统能力，包括资源、活动、用户、角色、权限、租户、消息、附件等基础支撑功能。 在此之上，iBizEHR 划分为 **核心层 + 业务模块层**：


### 🔑 核心层（EHR 基础模型）
EHR 的核心层以 **组织管理、部门管理、人员管理** 为中心，建立人力资源领域最基本的数据与业务上下文。所有后续的 EHR 模块均依赖于这一核心层运行。

- 组织/部门的层级关系
- 员工基础信息与人员档案
- 用户与权限在 HR 领域的落地
- 与 iBizEngine 的活动、消息、附件等基础能力打通

### 🧩 业务模块层（轻应用插件）
在核心层之上，EHR 的各类业务功能以 **独立轻应用模块** 的形式挂载到系统中。

典型模块包括：
- **招聘管理**：岗位、候选人、流程化招聘
- **假勤管理**：考勤规则、排班管理
- **薪资管理**：薪资项定义、发放周期、报表统计
- **人事管理**：合同、调动、离职、档案变更
- **绩效管理**：绩效考核、目标管理、评估记录

这些模块并不是耦合在一个大系统中，而是独立开发、测试、升级的“轻应用”，最终由 iBizEngine 统一挂载与运行。

### ⚙️ 核心特性与 iBizEngine 理念的结合

- **模块化 + 插件化**  
  每个 EHR 业务模块都是独立插件，解耦运行，避免大系统的臃肿。
- **模型上下文共享**  
  模块可以直接复用核心层的组织、人员等模型上下文，快速构建依赖关系。
- **UI 视图预占位与合成**  
  模块 UI 以“预占位视图”挂接到主界面中，确保不同模块的无缝整合。
- **双模式部署（合并 / 挂载）**
    - **合并模式**：业务模型深度整合进核心层
    - **挂载模式**：模块模型独立运行，通过代理方式交互
- **Mixin 能力注入**  
  招聘岗位、员工档案等实体可声明继承消息、附件、活动等通用能力，避免重复开发。
- **模型生命延续**  
  运行时可对表单、流程、逻辑进行受控修改，验证通过后可将变更回流至设计端模型，保证迭代一致性。


### 🎯 架构优势

| 特性            | 价值 |
|---------------|------|
| 基于 iBizEngine | 通用基础能力复用，降低重复建设 |
| 核心层定义         | 组织/人员上下文稳定，作为一切业务的根基 |
| 模块化轻应用        | 灵活挂载、独立演进、避免大系统僵化 |
| 视图预占位合成       | 模块 UI 无缝拼接，用户体验一致 |
| Mixin 注入      | 公共能力“声明即得”，减少开发成本 |
| 模型生命延续        | 支持运行时业务演进，避免“二次开发陷阱” |


📌 **一句话总结**：  
iBizEHR 是一个 **基于 iBizEngine 的模块化 EHR 平台** —— 以组织与人员为核心，通过合并挂载招聘、假勤、薪资等轻应用模块，既具备灵活扩展性，又能保持系统长期的演进能力。

![img](doc/images/ehrmix.gif)

## 🗂 模块详解

### 1. 招聘管理（已优先上线 2025/09/06）

覆盖社招、校招、内推、猎头管理等场景，让HR获得更高效的招聘体验、更便捷的协作体验，让管理者获得招聘数据洞见。让招聘降本增效的同时，树立企业在候选人心目中的专业形象。

- 职位管理：职位模板、岗位描述、发布渠道管理。
- 招聘流程自动化：灵活自定义流程，自动化推进，视频面试无缝融合，招聘过程“飞”起来
- 灵活的面试管理：多轮面试、面试评分表、自动通知与日程管理。
- 录用与入职：Offer 管理、背景调查、入职任务清单。

**对标来源**：Moka（功能细化与流程精防）。

![img](doc/images/recruit/1.png)

![img](doc/images/recruit/2.png)

![img](doc/images/recruit/3.png)

![img](doc/images/recruit/4.png)

![img](doc/images/recruit/5.png)

![img](doc/images/recruit/6.png)

![img](doc/images/recruit/7.png)

![img](doc/images/recruit/8.png)

![img](doc/images/recruit/9.png)

![img](doc/images/recruit/a.png)

![img](doc/images/recruit/b.png)

![img](doc/images/recruit/c.png)

![img](doc/images/recruit/d.png)


### 2. 假勤管理（已上线 2025/09/27）
- 排班与排班模板：支持复杂班次与轮班规则。
- 打卡与验证：多种打卡方式接入（移动/硬件/扫码）。
- 请假/加班/补卡审批：工作流驱动审批与统计。  
  **对标来源**：Deli。

![img](doc/images/checkin/1.png)

![img](doc/images/checkin/2.png)

![img](doc/images/checkin/3.png)

![img](doc/images/checkin/4.png)

![img](doc/images/checkin/5.png)

![img](doc/images/checkin/6.png)

![img](doc/images/checkin/7.png)

![img](doc/images/checkin/8.png)

![img](doc/images/checkin/9.png)

![img](doc/images/checkin/a.png)

### 3. 组织管理（已上线 2025/09/27）
- 组织/部门的层级关系
- 员工基础信息与人员档案
- 用户与权限在 HR 领域的落地
- 与 iBizEngine 的活动、消息、附件等基础能力打通



![img](doc/images/base/2.png)

![img](doc/images/base/3.png)

![img](doc/images/base/4.png)

![img](doc/images/base/5.png)

![img](doc/images/base/6.png)

![img](doc/images/base/7.png)

![img](doc/images/base/8.png)

### 4. 人事管理（进行中）
- 员工档案：多维属性、合同与证件管理、变动记录。
- 人员生命周期：入职、转正、调岗、离职流程自动化。  
  **对标来源**：Beisen。


### 5. 薪资管理（规划中）
- 工资结构：薪资项与公式管理、个税与社保计算接口。
- 发放与流水：工资表生成、导出与第三方发放对接。  
  **对标来源**：Beisen。

### 6. 绩效管理（社区共建）
- 指标模板：OKR/KPI 模板支持。
- 评估流程：评估阶段、评分、面谈记录与改进计划。
- 社区征集：绩效模块为开放规划，欢迎社区提出需求与 PR。



## 🏗 架构与 Odoo 对齐

- **基础实体**：员工（hr.employee）、部门（hr.department）、岗位（hr.job）等实体设计参考 Odoo，为未来业务互操作打基础。
- **组织模型**：采用组织树 + 岗位映射，支持多组织、多公司场景。
- **扩展机制**：每个模块作为**轻应用（micro-app）**形式，提供标准的插件接口（事件、API、UI 插件点）。




## 🔌 扩展、集成与定制

- **插件体系**：热插拔插件支持运行时加载/卸载，适合定制化业务逻辑和界面扩展。
- **二次开发**：基于 iBizModeling 的 DSL，可通过模型配置快速把业务映射到 UI。
- **第三方集成**：支持 HRIS、考勤机、工资发放平台、单点登录（SSO）等集成。
- **数据迁移**：提供导入模板与脚本，降低从现有系统迁移成本。





## ⚡ 快速上手

### 环境要求
- CPU ≥ 4 核， RAM ≥ 16 GB， Disk ≥ 50 GB，Docker ≥ 24.0.0， Docker-Compose ≥ v2.26.1

### 安装步骤
```bash
# 克隆项目
git clone https://github.com/ibizlab/iBizEHR.git

# 启动服务
cd iBizEHR/deploy/compose
docker-compose up -d
```
[!CAUTION] 更详细安装说明参考 [install](deploy/compose/README.md)


## 🛠 定制开发

如果您需要在 iBizEHR 的基础上进行 二次开发或行业定制，推荐使用 [iBizModeling](https://modeling.ibizlab.cn/) 在线实验室：

![img](doc/images/recruitbuild.gif) 

🔹 在线创建和编辑模型，无需本地安装

🔹 ModelingIDE中可视化建模配置，一键发布新模型

🔹 EHR系统自动加载模型变更，实时解释执行，支持快速验证

👉 [点击这里申请在线实验室](https://open.ibizlab.cn/plmweb/#/-/index/-/workspace_tab_exp_view/srfnav=oss/recent_oss_tree_exp_view/-/route-modal/dev_lab_apply_apply_edit_view/-)  免费使用

当然您也可以直接基于代码进行二次开发，代码由iBizCodeGenerator基于模型发布生成，支持高开修定

🔹 前端代码 👉[frontend](frontend) Vue 全家桶（Vue3、Vite、Element Plus、TSX），基于[iBizAppHub](https://github.com/ibizlab-cloud/ibiz-app-hub)开源技术框架实现

🔹 后台代码 👉[backend](backend) Springboot + Groovy微服务程序，基于[iBizServiceHub](https://github.com/ibizlab-cloud/ibiz-service-hub)开源技术框架实现


## ❤️ 加入我们

iBizEHR 致力于构建一个 **开源、可定制、企业级** 的人力资源管理平台。无论你是 HR 经理、业务工程师、还是开源贡献者，都欢迎加入我们：提出需求 → 贡献代码 → 共同打磨模块，推动国内企业级开源生态成长。


- 🌐 开源实验室官网：https://www.ibizlab.cn

- 💬 开源社区：https://open.ibizlab.cn

- 📱 微信公众号：iBiz开放平台

- 💬 QQ交流群：1056401976

