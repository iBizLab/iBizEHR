package cn.ibizlab.central.plugin.groovy.dataentity.security

import net.ibizsys.central.cloud.core.dataentity.security.DataEntityAccessManager
import net.ibizsys.central.cloud.core.security.IEmployeeContext
import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.model.dataentity.priv.IPSDEUserRole
import net.ibizsys.runtime.security.IUserContext

class GroovyAccessManager extends DataEntityAccessManager {

    /**
     * 实体行为权限判断入口
     *
     * @param objKey
     * @param iEntityDTO
     * @param strAccessAction
     * @return
     * @throws Exception
     */
    @Override
    boolean testDataAccessAction(IUserContext iUserContext, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, Object objKey, IEntityDTO inputEntityDTO, String strAccessAction) throws Exception {
        return super.testDataAccessAction(iUserContext, parentDataEntityRuntime, strParentKey, objKey, inputEntityDTO, strAccessAction)
    }

    /**
     * 实体数据集查询权限入口
     *
     * @param iSearchContextDTO
     * @param strAccessAction
     * @return
     * @throws Exception
     */
    @Override
    public boolean testDataAccessAction(IUserContext iUserContext, IDataEntityRuntime parentDataEntityRuntime, String strParentKey, ISearchContextDTO iSearchContextDTO, String strAccessAction) throws Exception {
        return super.testDataAccessAction(iUserContext, parentDataEntityRuntime, strParentKey, iSearchContextDTO, strAccessAction)
    }

    /**
     * 获取实体操作标识所具备得能力入口
     *
     * @param iEmployeeContext
     * @param strAccessAction
     * @return
     */
    @Override
    protected List<IPSDEUserRole> getPSDEUserRoles(IEmployeeContext iEmployeeContext, String strAccessAction) {
        return super.getPSDEUserRoles(iEmployeeContext, strAccessAction)
    }

    /**
     * 实体操作标识添加查询条件入口
     *
     * @param searchContext
     * @param iEmployeeContext
     * @param action
     */
    @Override
    void addAuthorityConditions(ISearchContextDTO searchContext, IEmployeeContext iEmployeeContext, String action) {
        super.addAuthorityConditions(searchContext, iEmployeeContext, action)
    }

}