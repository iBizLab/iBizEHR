package cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil

import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.plugin.extension.sysutil.addin.PSDEModelSyncToolBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.model.dataentity.IPSDataEntity
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import net.ibizsys.runtime.security.SysUserRoleDefaultModes
import net.ibizsys.runtime.security.UserContext
import net.ibizsys.runtime.util.ActionSession
import net.ibizsys.runtime.util.ActionSessionManager
import net.ibizsys.runtime.util.IAction
import net.ibizsys.runtime.util.ITransactionalUtil
import net.ibizsys.runtime.util.KeyValueUtils
import org.apache.commons.logging.LogFactory
import org.springframework.util.ObjectUtils

import java.util.*;


public class PSSysUniResSyncTool extends PSDEModelSyncToolBase {

    @Override
    protected void onSync(IPSDataEntity iPSDataEntity, Object param) throws Throwable {
        Map<String, Object> params = null;
        if(param instanceof Map) {
            params = (Map)param;
        }

        List<Map> mapList = new ArrayList<Map>();
        IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());
        //插件中实体是否能安装
        this.getSystemRuntime().getPSSystem().getAllPSSysUniReses().forEach({ iPSSysUniRes ->
            //临时提供，此处考虑从实体运行时获取accessmanager然后获取defaultUserRoles
            Map<String, Object> obj = new LinkedHashMap<String, Object>();
            obj.put("name", iPSSysUniRes.getName());
            obj.put("display_name", iPSSysUniRes.getName());
            obj.put("res_code", iPSSysUniRes.getResCode());
            mapList.add(obj);
        })

        //查询历史数据
        Map<String, IEntityDTO> lastEntityDTOMap = null;

        IPSDEDataSet iPSDEDataSet = iDataEntityRuntime.getPSDEDataSetByTag(PSMODELSYNC_PREDEFINEDDATASET_PSMODELSYNC, true);
        if(iPSDEDataSet != null) {
            lastEntityDTOMap = new HashMap<String, IEntityDTO>();
            ISearchContextDTO iSearchContextDTO = iDataEntityRuntime.createSearchContext();
            iSearchContextDTO.all().count(false);
            List<IEntityDTO> list = iDataEntityRuntime.selectDataSet(iPSDEDataSet, iSearchContextDTO);
            for(IEntityDTO item : list) {
                String unionTag = String.format("%s", item.get("res_code"));
                lastEntityDTOMap.put(unionTag, item);
            }
        }

        //执行批保存
        List<IEntityDTO> updateentityList = new ArrayList<IEntityDTO>();
        List<IEntityDTO> createentityList = new ArrayList<IEntityDTO>();
        for(Map<String, Object> item : mapList) {
            IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity(item);
            String unionTag = String.format("%s", item.get("res_code"));
            if(lastEntityDTOMap != null && lastEntityDTOMap.containsKey(unionTag)) {
                IEntityDTO lastEntity = lastEntityDTOMap.get(unionTag);
                iEntityDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),lastEntity.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),null));
                updateentityList.add(iEntityDTO);
            }else {
                createentityList.add(iEntityDTO);
            }
        }


        for(IEntityDTO iEntityDTO : createentityList) {
            iDataEntityRuntime.fillEntityKeyValue(iEntityDTO);
        }

        if(ObjectUtils.isEmpty(createentityList)&& ObjectUtils.isEmpty(updateentityList)){
            return;
        }
        UserContext.setCurrent(this.getSystemRuntime().createDefaultUserContext());
        try {
            iDataEntityRuntime.execute(new IAction() {
                @Override
                Object execute(Object[] args) throws Throwable {
                    if ( !ObjectUtils.isEmpty ( createentityList ) ) {
                        iDataEntityRuntime.rawCreate(createentityList, true);
                    }
                    if ( !ObjectUtils.isEmpty ( updateentityList ) ) {
                        //iDataEntityRuntime.rawUpdate(updateentityList, true);
                    }
                }
            },null, ITransactionalUtil.PROPAGATION_REQUIRED);
        } catch (Throwable ex) {
            log.error(String.format("同步统一资源发生异常，%s", ex.getMessage()), ex);
        }
    }
}