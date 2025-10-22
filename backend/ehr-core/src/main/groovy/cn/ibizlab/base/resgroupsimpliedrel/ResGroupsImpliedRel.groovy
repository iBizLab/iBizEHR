package cn.ibizlab.base.resgroupsimpliedrel

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.resgroupsimpliedrel.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_GROUPS_IMPLIED_REL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResGroupsImpliedRel extends GroovyDataEntityRuntime<ResGroupsImpliedRel,ResGroupsImpliedRelDTO,ResGroupsImpliedRelFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ResGroupsImpliedRel _instance
    void setInstance(ResGroupsImpliedRel instance) {
        _instance = instance
    }
    static ResGroupsImpliedRel getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResGroupsImpliedRelDTO create(ResGroupsImpliedRelDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResGroupsImpliedRelDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResGroupsImpliedRelDTO update(ResGroupsImpliedRelDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResGroupsImpliedRelDTO.class)
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
    ResGroupsImpliedRelDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResGroupsImpliedRelDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResGroupsImpliedRelDTO getDraft(ResGroupsImpliedRelDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResGroupsImpliedRelDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResGroupsImpliedRelDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResGroupsImpliedRelDTO save(ResGroupsImpliedRelDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResGroupsImpliedRelDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResGroupsImpliedRelDTO> fetchDefault(ResGroupsImpliedRelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResGroupsImpliedRelDTO.class)
    }

}