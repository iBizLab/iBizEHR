package cn.ibizlab.resource.resourcemixin

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.resource.resourcemixin.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RESOURCE_MIXIN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResourceMixin extends GroovyDataEntityRuntime<ResourceMixin,ResourceMixinDTO,ResourceMixinFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ResourceMixin _instance
    void setInstance(ResourceMixin instance) {
        _instance = instance
    }
    static ResourceMixin getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResourceMixinDTO create(ResourceMixinDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResourceMixinDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResourceMixinDTO update(ResourceMixinDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResourceMixinDTO.class)
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
    ResourceMixinDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResourceMixinDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResourceMixinDTO getDraft(ResourceMixinDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResourceMixinDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResourceMixinDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResourceMixinDTO save(ResourceMixinDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResourceMixinDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResourceMixinDTO> fetchDefault(ResourceMixinFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResourceMixinDTO.class)
    }

}