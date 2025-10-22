package cn.ibizlab.central.plugin.groovy.dataentity.action

import cn.ibizlab.central.plugin.groovy.dataentity.dto.GroovyDTO
import net.ibizsys.central.dataentity.action.DEActionPluginRuntimeBase
import net.ibizsys.central.util.IEntity
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.model.dataentity.action.IPSDEAction
import net.ibizsys.runtime.dataentity.IDataEntityRuntimeContext

class GroovyActionPlugin extends DEActionPluginRuntimeBase{



    @Override
    Object execute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
        if (args != null && args.length == 1) {
            Object arg = args[0]
            if (arg instanceof GroovyDTO || (arg instanceof Collection && (arg.isEmpty() || arg[0] instanceof GroovyDTO)))
                return this.onExecute(arg)
            else if (arg instanceof IEntity || (arg instanceof Collection && arg.size()>0 && arg[0] instanceof IEntity))
                return onExecute(iDataEntityRuntimeContext, iPSDEAction, args, actionData)
            else
                return this.onExecute(arg)
        }

        return onExecute(iDataEntityRuntimeContext, iPSDEAction, args, actionData)
    }

    @Override
    protected Object onExecute(IDataEntityRuntimeContext iDataEntityRuntimeContext, IPSDEAction iPSDEAction, Object[] args, Object actionData) throws Throwable {
        return iDataEntityRuntimeContext.executeActionReal(iPSDEAction, args, actionData)
    }

    @Override
    protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
        return onExecute((Object) iEntityDTO)
    }


}