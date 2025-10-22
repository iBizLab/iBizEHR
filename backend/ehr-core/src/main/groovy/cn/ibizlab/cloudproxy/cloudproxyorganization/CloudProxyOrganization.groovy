package cn.ibizlab.cloudproxy.cloudproxyorganization

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.cloudproxy.cloudproxyorganization.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CLOUD_PROXY_ORGANIZATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CloudProxyOrganization extends GroovyDataEntityRuntime<CloudProxyOrganization,CloudProxyOrganizationDTO,CloudProxyOrganizationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static CloudProxyOrganization _instance
    void setInstance(CloudProxyOrganization instance) {
        _instance = instance
    }
    static CloudProxyOrganization getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CloudProxyOrganizationDTO create(CloudProxyOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CloudProxyOrganizationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CloudProxyOrganizationDTO update(CloudProxyOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CloudProxyOrganizationDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    CloudProxyOrganizationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CloudProxyOrganizationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CloudProxyOrganizationDTO getDraft(CloudProxyOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CloudProxyOrganizationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CloudProxyOrganizationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CloudProxyOrganizationDTO save(CloudProxyOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CloudProxyOrganizationDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<CloudProxyOrganizationDTO> fetchDefault(CloudProxyOrganizationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CloudProxyOrganizationDTO.class)
    }

}