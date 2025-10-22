package cn.ibizlab.central.plugin.groovy.dataentity.ds

import cn.ibizlab.central.plugin.groovy.dataentity.dto.GroovyFilter
import net.ibizsys.central.dataentity.ds.DEDataSetPluginRuntimeBase
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext

class GroovyFetchPlugin extends DEDataSetPluginRuntimeBase{

    @Override
    Object fetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
        if (args != null && args.length > 0) {
            Object arg = args[0]
            if (arg instanceof GroovyFilter) {
                return this.onFetch((ISearchContextDTO) arg)
            }
        }

        throw onFetch(iDataEntityRuntimeContext, iPSDEDataSet, args, actionData)
    }

    @Override
    protected Object onFetch(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEDataSet iPSDEDataSet, Object[] args, Object actionData) throws Throwable {
        return iDataEntityRuntimeContext.fetchDataSetReal(iPSDEDataSet, args, actionData)
    }


    @Override
    protected Object onFetch(ISearchContextDTO iSearchContextDTO) throws Throwable {
        throw new Exception("没有实现")
    }

}