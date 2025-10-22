package cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil;


import net.ibizsys.central.plugin.extension.sysutil.SysPSDEModelUtilRuntime
import net.ibizsys.central.plugin.extension.sysutil.addin.ISysPSDEModelUtilRTAddin;

import net.ibizsys.runtime.plugin.RuntimeObjectFactory;
import cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil.PSDEUserRoleSyncTool;
import cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil.PSSysOPPrivSyncTool;
import cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil.PSSysUniResSyncTool;

public class OdooSysPSDEModelUtilRuntime extends SysPSDEModelUtilRuntime {
    static {
        RuntimeObjectFactory.getInstance().registerObjectIf(ISysPSDEModelUtilRTAddin.class, "*:PSDEMODELSYNCTOOL:PSDEUSERROLE", PSDEUserRoleSyncTool.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(ISysPSDEModelUtilRTAddin.class, "*:PSDEMODELSYNCTOOL:PSSYSOPPRIV", PSSysOPPrivSyncTool.class);
        RuntimeObjectFactory.getInstance().registerObjectIf(ISysPSDEModelUtilRTAddin.class, "*:PSDEMODELSYNCTOOL:PSSYSUNIRES", PSSysUniResSyncTool.class);
    }
}
