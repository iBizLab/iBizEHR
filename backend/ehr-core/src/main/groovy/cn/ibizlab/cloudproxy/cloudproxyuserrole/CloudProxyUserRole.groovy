package cn.ibizlab.cloudproxy.cloudproxyuserrole

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.cloudproxy.cloudproxyuserrole.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CLOUD_PROXY_USER_ROLE]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射或者自定义动态扩展对象，开启RTCode模式会导致映射功能失效
 */
class CloudProxyUserRole extends GroovyDataEntityRuntime<CloudProxyUserRole,CloudProxyUserRoleDTO,CloudProxyUserRoleFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static CloudProxyUserRole _instance
    void setInstance(CloudProxyUserRole instance) {
        _instance = instance
    }
    static CloudProxyUserRole getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    CloudProxyUserRoleDTO create(CloudProxyUserRoleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CloudProxyUserRoleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    CloudProxyUserRoleDTO update(CloudProxyUserRoleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CloudProxyUserRoleDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    CloudProxyUserRoleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CloudProxyUserRoleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    CloudProxyUserRoleDTO getDraft(CloudProxyUserRoleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CloudProxyUserRoleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(CloudProxyUserRoleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    CloudProxyUserRoleDTO save(CloudProxyUserRoleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CloudProxyUserRoleDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<CloudProxyUserRoleDTO> fetchDefault(CloudProxyUserRoleFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CloudProxyUserRoleDTO.class)
    }

}