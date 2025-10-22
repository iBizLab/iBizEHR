package cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil;

import net.ibizsys.central.plugin.extension.sysutil.addin.PSDEModelSyncToolBase
import net.ibizsys.runtime.security.UserContext;
import net.ibizsys.runtime.util.ActionSession
import net.ibizsys.runtime.util.ActionSessionManager
import net.ibizsys.runtime.util.IAction
import net.ibizsys.runtime.util.ITransactionalUtil
import org.apache.commons.logging.LogFactory;
import org.springframework.util.ObjectUtils;
import net.ibizsys.central.dataentity.IDataEntityRuntime;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.central.util.ISearchContextDTO;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.ds.IPSDEDataSet;

public class PSDEUserRoleSyncTool extends PSDEModelSyncToolBase {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(PSDEUserRoleSyncTool.class);

    @Override
    protected void onSync(IPSDataEntity iPSDataEntity, Object param) throws Throwable {
       
        Map<String, Object> params = null;
        if(param instanceof Map) {
            params = (Map)param;
        }

        List<Map> mapList = new ArrayList<Map>();
        IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());
        //插件中实体是否能安装
        this.getSystemRuntime().getPSSystem().getAllPSDataEntities().forEach({ iPSDataEntity2 ->
            //临时提供，此处考虑从实体运行时获取accessmanager然后获取defaultUserRoles
            if(iPSDataEntity2.getAllPSDEUserRoles()!=null) {
                iPSDataEntity2.getAllPSDEUserRoles().forEach({ iPSDEUserRole ->
                    if(org.springframework.util.StringUtils.hasLength(iPSDEUserRole.getCustomCond())){
                        Map<String, Object> obj = new LinkedHashMap<String, Object>();
                        obj.put("display_name", iPSDEUserRole.getName());
                        obj.put("name", iPSDEUserRole.getRoleTag());
                        obj.put("model_id", iPSDataEntity2.getName());
                        obj.put("active", 1);
                        //global需要判断条件确认，考虑识别特定标注
                        if ("global".equals(iPSDEUserRole.getUserTag())) {
                            obj.put("global", 0);
                        }
                        obj.put("active", 1);
                        //后续可考虑从数据集条件转换
                        obj.put("domain_force", iPSDEUserRole.getCustomCond());
                        if (iPSDEUserRole.getPSDEUserRoleOPPrivs() != null) {
                            iPSDEUserRole.getPSDEUserRoleOPPrivs().forEach ({ iPSDEUserRoleOPPriv ->
                                if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("read")) {
                                    obj.put("perm_read", 1);
                                }
                                if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("update")) {
                                    obj.put("perm_write", 1);
                                }
                                if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("create")) {
                                    obj.put("perm_create", 1);
                                }
                                if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("delete")) {
                                    obj.put("perm_unlink", 1);
                                }
                            })
                        }
                        mapList.add(obj);
                    }
                });
            }
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
                String unionTag = String.format("%s|%s", item.get("model_id"),item.get("name"));
                lastEntityDTOMap.put(unionTag, item);
            }
        }


        //执行批保存
        List<IEntityDTO> updateentityList = new ArrayList<IEntityDTO>();
        List<IEntityDTO> createentityList = new ArrayList<IEntityDTO>();
        for(Map<String, Object> item : mapList) {
            IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity(item);
            String unionTag = String.format("%s|%s", item.get("model_id"),item.get("name"));
            if(lastEntityDTOMap != null && lastEntityDTOMap.containsKey(unionTag)) {
                IEntityDTO lastEntity = lastEntityDTOMap.get(unionTag);
                iEntityDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),lastEntity.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),null));
                String originPerm = String.format("%s%s%s%s",item.get("perm_read",0),item.get("perm_write",0),item.get("perm_create",0),item.get("perm_unlink",0))
                String lastPerm = String.format("%s%s%s%s",lastEntity.get("perm_read",0),lastEntity.get("perm_write",0),lastEntity.get("perm_create",0),lastEntity.get("perm_unlink",0))
                if(lastEntity.get("domain_force").equals(item.get("domain_force")) && originPerm.equals(lastPerm)){
                    continue;
                }
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
    //                iDataEntityRuntime.rawUpdate(updateentityList, true);
                    }
                }
            },null, ITransactionalUtil.PROPAGATION_REQUIRED);
        } catch (Throwable ex) {
            log.error(String.format("同步规则发生异常，%s", ex.getMessage()), ex);
        }
    }

}
