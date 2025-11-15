package cn.ibizlab.cloudproxy.cloudproxyuser

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.cloudproxy.cloudproxyuser.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CLOUD_PROXY_USER]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射或者自定义动态扩展对象，开启RTCode模式会导致映射功能失效
 */
class CloudProxyUser extends GroovyDataEntityRuntime<CloudProxyUser,CloudProxyUserDTO,CloudProxyUserFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static CloudProxyUser _instance
    void setInstance(CloudProxyUser instance) {
        _instance = instance
    }
    static CloudProxyUser getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    CloudProxyUserDTO create(CloudProxyUserDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CloudProxyUserDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    CloudProxyUserDTO update(CloudProxyUserDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CloudProxyUserDTO.class)
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
    CloudProxyUserDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CloudProxyUserDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    CloudProxyUserDTO getDraft(CloudProxyUserDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CloudProxyUserDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(CloudProxyUserDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    CloudProxyUserDTO save(CloudProxyUserDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CloudProxyUserDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<CloudProxyUserDTO> fetchDefault(CloudProxyUserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CloudProxyUserDTO.class)
    }

}