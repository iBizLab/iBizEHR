package cn.ibizlab.base.resgroupsusersrel

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.resgroupsusersrel.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_GROUPS_USERS_REL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResGroupsUsersRel extends GroovyDataEntityRuntime<ResGroupsUsersRel,ResGroupsUsersRelDTO,ResGroupsUsersRelFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ResGroupsUsersRel _instance
    void setInstance(ResGroupsUsersRel instance) {
        _instance = instance
    }
    static ResGroupsUsersRel getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResGroupsUsersRelDTO create(ResGroupsUsersRelDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResGroupsUsersRelDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResGroupsUsersRelDTO update(ResGroupsUsersRelDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResGroupsUsersRelDTO.class)
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
    ResGroupsUsersRelDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResGroupsUsersRelDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResGroupsUsersRelDTO getDraft(ResGroupsUsersRelDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResGroupsUsersRelDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResGroupsUsersRelDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResGroupsUsersRelDTO save(ResGroupsUsersRelDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResGroupsUsersRelDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResGroupsUsersRelDTO> fetchDefault(ResGroupsUsersRelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResGroupsUsersRelDTO.class)
    }

}