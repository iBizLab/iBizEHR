package cn.ibizlab.base.avatarmixin

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.avatarmixin.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[AVATAR_MIXIN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class AvatarMixin extends GroovyDataEntityRuntime<AvatarMixin,AvatarMixinDTO,AvatarMixinFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static AvatarMixin _instance
    void setInstance(AvatarMixin instance) {
        _instance = instance
    }
    static AvatarMixin getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    AvatarMixinDTO create(AvatarMixinDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, AvatarMixinDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    AvatarMixinDTO update(AvatarMixinDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, AvatarMixinDTO.class)
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
    AvatarMixinDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, AvatarMixinDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    AvatarMixinDTO getDraft(AvatarMixinDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, AvatarMixinDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(AvatarMixinDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    AvatarMixinDTO save(AvatarMixinDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, AvatarMixinDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<AvatarMixinDTO> fetchDefault(AvatarMixinFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, AvatarMixinDTO.class)
    }

}