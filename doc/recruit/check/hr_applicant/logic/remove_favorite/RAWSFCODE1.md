<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
// 获取favorite数据实体
def favorite = sys.dataentity('FAVORITE');
// 获取默认参数
def defaultParam = logic.param('default').getReal();

// 从default参数中获取所需属性值
def id = defaultParam.get("id")
def srfuserId = defaultParam.get("srfuserid")
def hrApplicant = defaultParam.get("hr_applicant")

// 创建查询参数对象
def queryParam = new net.ibizsys.util.QueryParam();

// 添加多条件组合查询（同时满足三个条件）
queryParam.addFilter("OWNER_ID", "=", id);          // 匹配OWNER_ID
queryParam.addFilter("CREATE_MAN", "=", srfuserId); // 匹配创建人
queryParam.addFilter("OWNER_TYPE", "=", hrApplicant); // 匹配类型

// 执行查询获取符合条件的记录
def favoriteList = favorite.query(queryParam);

// 如果查询到记录，则删除
if(favoriteList != null && !favoriteList.isEmpty()) {
    // 获取第一条记录的ID（如果有多个符合条件的记录，可根据实际需求处理）
    def deleteId = favoriteList.get(0).get("id");
    // 执行删除操作
    favorite.delete(deleteId);
}

```
