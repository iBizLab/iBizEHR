package cn.ibizlab.central.plugin.odoo.user.plugin.groovy.sysutil

import net.ibizsys.central.dataentity.IDataEntityRuntime
import net.ibizsys.central.plugin.extension.sysutil.addin.PSDEModelSyncToolBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.model.dataentity.IPSDataEntity
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import net.ibizsys.model.security.IPSSysUniRes
import net.ibizsys.runtime.security.SysUserRoleDefaultModes
import net.ibizsys.runtime.security.UserContext
import net.ibizsys.runtime.util.ActionSession
import net.ibizsys.runtime.util.ActionSessionManager
import net.ibizsys.runtime.util.IAction
import net.ibizsys.runtime.util.ITransactionalUtil
import net.ibizsys.runtime.util.KeyValueUtils
import org.apache.commons.logging.LogFactory
import org.springframework.util.ObjectUtils


public class PSSysOPPrivSyncTool extends PSDEModelSyncToolBase {

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(PSSysOPPrivSyncTool.class);

    protected IDataEntityRuntime getRuleDERuntime() {
        return this.getSystemRuntime().getDataEntityRuntime("IR_RULE");
    }

    protected IDataEntityRuntime getModelAccessDERuntime() {
        return  this.getSystemRuntime().getDataEntityRuntime("IR_MODEL_ACCESS");
    }

    protected IDataEntityRuntime getUniResDERuntime() {
        return  this.getSystemRuntime().getDataEntityRuntime("IR_UNIRES");
    }

    @Override
    protected void onSync(IPSDataEntity iPSDataEntity, Object param) throws Throwable {
        Map<String, Object> params = null;
        if(param instanceof Map) {
            params = (Map)param;
        }

        List<Map> mapList = new ArrayList<Map>();
        IDataEntityRuntime iDataEntityRuntime = this.getSystemRuntime().getDataEntityRuntime(iPSDataEntity.getId());
        if (iPSDataEntity.getAllPSDEOPPrivs() == null)
            return;

        //查询userrole(rule)历史数据
        Map<String, IEntityDTO> lastRuleMap = null;

        IPSDEDataSet iUserRolePSDEDataSet = this.getRuleDERuntime().getPSDEDataSetByTag(PSMODELSYNC_PREDEFINEDDATASET_PSMODELSYNC, true);
        if(iUserRolePSDEDataSet != null) {

            lastRuleMap = new HashMap<String, IEntityDTO>();
            ISearchContextDTO iUserRoleSearchContextDTO = this.getRuleDERuntime().createSearchContext();
            iUserRoleSearchContextDTO.all().count(false);
            List<IEntityDTO> list = this.getRuleDERuntime().selectDataSet(iUserRolePSDEDataSet, iUserRoleSearchContextDTO);
            for(IEntityDTO item : list) {
                String unionTag = String.format("%s|%s", item.get("model_id"),item.get("name"));
                lastRuleMap.put(unionTag, item);
            }
        }

        //查询unires历史数据
        Map<String, IEntityDTO> lastUniResMap = null;

        IPSDEDataSet iUniResPSDEDataSet = this.getUniResDERuntime().getPSDEDataSetByTag(PSMODELSYNC_PREDEFINEDDATASET_PSMODELSYNC, true);
        if(iUniResPSDEDataSet != null) {
            lastUniResMap = new HashMap<String, IEntityDTO>();
            ISearchContextDTO iUniReseSearchContextDTO = this.getUniResDERuntime().createSearchContext();
            iUniReseSearchContextDTO.all().count(false);
            List<IEntityDTO> list = this.getUniResDERuntime().selectDataSet(iUniResPSDEDataSet, iUniReseSearchContextDTO);
            for(IEntityDTO item : list) {
                String unionTag = String.format("%s", item.get("res_code"));
                lastUniResMap.put(unionTag, item);
            }
        }

        this.getSystemRuntime().getPSSystem().getAllPSSysUserRoles().forEach({ iPSSysUserRole ->
            if(SysUserRoleDefaultModes.NONE.equals(iPSSysUserRole.getDefaultUser())||iPSSysUserRole.getDefaultUser() == null){
                Map<String, Object> obj = new LinkedHashMap<String, Object>();
                obj.put("display_name", iPSSysUserRole.getName());
                obj.put("name", iPSSysUserRole.getName());
                obj.put("id", iPSSysUserRole.getRoleTag());
                ArrayList ruleGroupRels = new ArrayList();
                obj.put("rule_group_rels", ruleGroupRels);
                ArrayList modelAccess = new ArrayList();
                obj.put("model_access", modelAccess);
                ArrayList uniResGroupRels = new ArrayList();
                obj.put("unires_group_rels", uniResGroupRels);
                if (iPSSysUserRole.getPSSysUserRoleDatas() != null) {
                    iPSSysUserRole.getPSSysUserRoleDatas().forEach ({ iPSSysUserRoleData ->
                        if(iPSSysUserRoleData.getPSDEUserRole()!=null){
                            String unionTag = String.format("%s|%s", iPSSysUserRoleData.getPSDataEntityMust().getName(),iPSSysUserRoleData.getPSDEUserRole().getRoleTag());
                            if(lastRuleMap!=null && lastRuleMap.containsKey(unionTag)) {
                                Map<String, Object> ruleGroupRel = new LinkedHashMap<String, Object>();
                                IEntityDTO rule = lastRuleMap.get(unionTag);
                                ruleGroupRel.put("rule_id", rule.get("id"));
                                ruleGroupRels.add(ruleGroupRel);
                            }else if(iPSSysUserRoleData.getPSDEUserRole().isAllData()){
                                //全部数据角色作为默认角色
                                Map<String, Object> _modelAccess = new LinkedHashMap<String, Object>();
                                _modelAccess.put("id",KeyValueUtils.genUniqueId());
                                _modelAccess.put("model_id", iPSSysUserRoleData.getPSDataEntityMust().getName());
                                _modelAccess.put("name", iPSSysUserRoleData.getPSDEUserRole().getName());
                                if (iPSSysUserRoleData.getPSDEUserRole().getPSDEUserRoleOPPrivs() != null) {
                                    iPSSysUserRoleData.getPSDEUserRole().getPSDEUserRoleOPPrivs().forEach ({ iPSDEUserRoleOPPriv ->
                                        if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("read")) {
                                            _modelAccess.put("perm_read", 1);
                                        }
                                        if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("update")) {
                                            _modelAccess.put("perm_write", 1);
                                        }
                                        if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("create")) {
                                            _modelAccess.put("perm_create", 1);
                                        }
                                        if (iPSDEUserRoleOPPriv.getPSDEOPPriv().getName().equalsIgnoreCase("delete")) {
                                            _modelAccess.put("perm_unlink", 1);
                                        }
                                    })
                                }
                                modelAccess.add(_modelAccess);
                            }
                        }
                    })
                }
                if (iPSSysUserRole.getPSSysUserRoleReses() != null){
                    iPSSysUserRole.getPSSysUserRoleReses().forEach ({ iPSSysUserRoleRes ->
                        IPSSysUniRes iPSSysUniRes = iPSSysUserRoleRes.getPSSysUniRes();
                        if(iPSSysUniRes!=null){
                            String unionTag = String.format("%s", iPSSysUniRes.getResCode());
                            if(lastUniResMap!=null && lastUniResMap.containsKey(unionTag)) {
                                Map<String, Object> uniResGroupRel = new LinkedHashMap<String, Object>();
                                IEntityDTO uniRes = lastUniResMap.get(unionTag);
                                uniResGroupRel.put("unires_id", uniRes.get("id"));
                                uniResGroupRel.put("res_code", uniRes.get("res_code"));
                                uniResGroupRels.add(uniResGroupRel);
                            }
                        }
                    })
                }
                mapList.add(obj);
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
                String unionTag = String.format("%s",item.get("id"));
                lastEntityDTOMap.put(unionTag, item);
            }
        }


        //执行批保存
        List<IEntityDTO> updateentityList = new ArrayList<IEntityDTO>();
        List<IEntityDTO> createentityList = new ArrayList<IEntityDTO>();
        for(Map<String, Object> item : mapList) {
            IEntityDTO iEntityDTO = iDataEntityRuntime.createEntity(item);
            String unionTag = String.format("%s",item.get("id"));
            if(lastEntityDTOMap != null && lastEntityDTOMap.containsKey(unionTag)) {
                boolean bIgnoreUpdate = false;
                IEntityDTO lastEntity = lastEntityDTOMap.get(unionTag);
                iEntityDTO.set(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),lastEntity.get(iDataEntityRuntime.getKeyPSDEField().getLowerCaseName(),null));
                if(!ObjectUtils.isEmpty(iEntityDTO.get("rule_group_rels"))&&!ObjectUtils.isEmpty(lastEntity.get("rule_group_rels"))){
                    ArrayList curRuleGroupRels = iEntityDTO.get("rule_group_rels");
                    ArrayList lastRuleGroupRels = lastEntity.get("rule_group_rels");
                    Set<String> curRuleIds = curRuleGroupRels*.get("rule_id") as Set
                    Set<String> lastRuleIds = lastRuleGroupRels*.get("rule_id") as Set
                    // 比较两个集合是否相同
                    if(lastRuleIds.containsAll(curRuleIds)) {
                        bIgnoreUpdate = true;
                    }else {
                        bIgnoreUpdate = false;
                        ArrayList mergedRuleGroupRel = lastRuleGroupRels as List<Map>;
                        curRuleGroupRels.forEach( { rel ->
                            String ruleId = rel.get("rule_id");
                            if (!lastRuleIds.contains(ruleId)) {
                                mergedRuleGroupRel.add(rel)
                            }
                        })
                        iEntityDTO.set("rule_group_rels", mergedRuleGroupRel);
                    }
                }
                if(!ObjectUtils.isEmpty(iEntityDTO.get("model_access"))&&!ObjectUtils.isEmpty(lastEntity.get("model_access"))) {
                    ArrayList curModelAccess = iEntityDTO.get("model_access");
                    ArrayList lastModelAccess = lastEntity.get("model_access");
                    Set<String> curAccessNames = curModelAccess*.get("model_id") as Set
                    Set<String> lastAccessNames = lastModelAccess*.get("model_id") as Set
                    if (lastAccessNames.containsAll(curAccessNames)) {
                        bIgnoreUpdate = true;
                    }else {
                        bIgnoreUpdate = false;
                        ArrayList mergedModelAccess = lastModelAccess as List<Map>;
                        curModelAccess.forEach({ access ->
                            String accessName = access.get("model_id");
                            if (!lastAccessNames.contains(accessName)) {
                                mergedModelAccess.add(access)
                            }
                        })
                        iEntityDTO.set("model_access", mergedModelAccess);
                    }
                }
                if(!ObjectUtils.isEmpty(iEntityDTO.get("unires_group_rels"))&&!ObjectUtils.isEmpty(lastEntity.get("unires_group_rels"))) {
                    ArrayList curUniRes = iEntityDTO.get("unires_group_rels");
                    ArrayList lastUniRes = lastEntity.get("unires_group_rels");
                    Set<String> curResNames = curUniRes*.get("res_code") as Set
                    Set<String> lastResNames = lastUniRes*.get("res_code") as Set
                    if (lastResNames.containsAll(curResNames)) {
                        bIgnoreUpdate = true;
                    }else {
                        bIgnoreUpdate = false;
                        ArrayList mergedUniReses = lastResNames as List<Map>;
                        curUniRes.forEach({ uniRes ->
                            String resCode = uniRes.get("res_code");
                            if (!lastResNames.contains(resCode)) {
                                mergedUniReses.add(uniRes)
                            }
                        })
                        iEntityDTO.set("unires_group_rels", mergedUniReses);
                    }
                }
                if(!bIgnoreUpdate){
                    updateentityList.add(iEntityDTO);
                }
            }else {
                createentityList.add(iEntityDTO);
            }
        }


//        for(IEntityDTO iEntityDTO : createentityList) {
//            iDataEntityRuntime.fillEntityKeyValue(iEntityDTO);
//        }

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
//                        iDataEntityRuntime.rawUpdate(updateentityList, true);
                    }
                }
            },null, ITransactionalUtil.PROPAGATION_REQUIRED);
        }
        catch (Throwable ex) {
            log.error(String.format("同步权限组发生异常，%s", ex.getMessage()), ex);
        }
    }

}
