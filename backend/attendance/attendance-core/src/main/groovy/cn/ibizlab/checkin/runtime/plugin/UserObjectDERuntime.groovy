package cn.ibizlab.checkin.runtime.plugin

import net.ibizsys.central.cloud.core.dataentity.DataEntityRuntime
import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.annotation.DEAction

class UserObjectDERuntime extends DataEntityRuntime {

    @DEAction("Get")
    protected Object doGet(String  strDEId) throws Throwable {
        IDataEntityRuntime employeeRuntime = this.getSystemRuntime().getDataEntityRuntime("employee");
        try {
            IEntityDTO employee = employeeRuntime.get(strDEId);
            return employee;
        } catch (Exception e) {
            IDataEntityRuntime deptRuntime = this.getSystemRuntime().getDataEntityRuntime("department");
            IEntityDTO dept = deptRuntime.get(strDEId);
            return dept;
        }

        return null;
    }
}