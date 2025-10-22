### **安装说明**
####  前提条件

- CPU >= 4 核
- RAM >= 16 GB
- Disk >= 50 GB
- Docker >= 24.0.0 & Docker Compose >= v2.26.1
> 如果你并没有在本机安装 Docker（Windows、Mac，或者 Linux）, 可以参考文档 [Install Docker Engine](https://docs.docker.com/engine/install/) 自行安装。



#### 启动EHR服务
1. 克隆仓库：

```bash
$ git clone https://gitee.com/ibizlab/iBizEHR.git
```

2. 进入 **compose** 文件夹，利用提前编译好的 Docker 镜像启动服务器：

```bash
$ cd iBizEHR/deploy/compose
$ docker compose -f docker-compose.yml --env-file .env up -d

# ARM64架构启动:
# docker-compose -f docker-compose-arm64.yml --env-file .env up -d

```

> [!TIP]
> 如果你想修改MySQL、ZooKeeper、Redis、Nacos、EMQX、ebsx服务为本地已有服务，可以在 **deploy/compose/.env** 文件内根据变量注释提示调整对应参数；调整MySQL服务为本地服务需要预先导入deploy/compose/init.sql。

> [!CAUTION]
> 如果你已经安装过iBizLab的其他开源产品，比如iBizPLM，这种情况下MySQL、zk、Nacos、ebsx等环境已具备，可以使用 .share 启动，执行前请自行在mysql中创建ehr数据库。
> ```
> create database ehr default character set utf8 collate utf8_general_ci;
> create user 'ehr'@'%' identified by 'ehr@2024';
> grant ALL PRIVILEGES on ehr.* to 'ehr'@'%' ;
> ```
> ```bash
> $ cd iBizEHR/deploy/compose
> $ docker compose -f docker-compose.yml --env-file .share up -d
> # ARM64架构启动:
> # docker-compose -f docker-compose-arm64.yml --env-file .share up -d
> ```

3. 服务器启动成功后再次确认服务器状态：

```bash
$ docker logs -f ehrservice
```

   _出现以下界面提示说明服务器启动成功：_

```bash
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : 系统[ibizehr]已经注册
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Heap Memory Usage:
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Init: 786432000
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Used: 1489565680
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Committed: 4904714240
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Max: 11169955840
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Non-Heap Memory Usage:
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Init: 2555904
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Used: 222739928
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Committed: 231342080
[DEBUG] n.i.central.cloud.core.ServiceHubBase    : Max: -1
```

等待启动完成访问

> 如果启动遇到问题，没有看到类似上述日志，可以尝试执行 

```bash
$ docker compose restart ehrservice
```

假定本机使用localhost访问，如果跨机器访问请将localhost更换为服务器ip地址或域名：


**iBizEHR 系统桌面端**：http://localhost:30450/ehrapp/   

默认用户名密码： `demo_admin/123456`

**UAA系统管理**：http://localhost:32666

4. 安装假勤和招聘子系统

登陆系统后在菜单“系统设置”-“应用市场” 中点击安装，等待提示安装成功。

![img](../../doc/images/ehrmix.gif)

首次安装需要重启ehrservice服务,等待重启成功。

```bash
$ docker compose restart ehrservice
```

刷新系统页面，看到主菜单假勤管理和招聘管理亮起即可。

#### 数据卷
> [!CAUTION]
> 请注意，本次更新替换文件映射为Docker数据卷，升级前请做好数据备份。

- mysql_data：MySQL数据库的数据卷

- allinone_data：ibiz-ebsx-allinone服务存放文件的数据卷，例如：图片，附件等

- task_data：task服务存放文件的数据卷：发布文件、模型文件


### 常见错误
##### 问题1、资源不足

本系统部署模式走微服务和前后分离，启动需要有多个独立服务，流畅运行建议16G或以上，如果启动后看到有容器未能启动成功或者启动成功又自行退出，许多人反映是mysql和nacos服务，这种情况下基本都是资源不足。

另外虽然主机资源充足，但是Windows或MacOS上使用了DockerDesktop，docker虚拟机的资源阈值分配不够，也烦请提高分配额。
 

##### 问题2、首次部署初始化数据时中断

这种情况下，就是持久化数据文件不完整了，很难救活了，需要重置部署下，进入安装目录先停止所有服务，删除持久化目录，最后重新启动，请按照以下命令重置。
> [!CAUTION]
> 此操作会清空所有之前的持久化数据

```shell
$ cd iBizEHR/deploy/compose 
$ docker-compose down -v  #清空默认安装环境 删除持久化卷
$ docker-compose up -d    #重新启动，重新初始持久化数据
```
