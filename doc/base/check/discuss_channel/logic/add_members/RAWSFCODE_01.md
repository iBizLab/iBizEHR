<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
    // 获取默认参数中的members字段值
    def src = logic.param("Default").getReal()
    def membersStr = src.get("members")
    
    // 解析ID列表
    def ids = membersStr?.split(',') ?: []
    
    // 构造实体对象列表
    def res_partners = ids.collect { id ->
        // 获取RES_PARTNER实体运行时对象
        def dePartner = sys.dataentity("res_partner")
        // 创建新实体对象
        def partner = dePartner.entity()
        // 设置ID属性（假设RES_PARTNER主键为id）
        partner.set("id", id.trim())
        partner
    }
    
    // 绑定到目标参数
    logic.param("res_partners").getReal().addAll(res_partners)
```
