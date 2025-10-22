package cn.ibizlab.ebsx.role

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ebsx.role.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYS_ROLE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Role extends GroovyDataEntityRuntime<Role,RoleDTO,RoleFilterDTO> {

    private static Role _instance
    void setInstance(Role instance) {
        _instance = instance
    }
    static Role getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    RoleDTO create(RoleDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, RoleDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    RoleDTO update(RoleDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, RoleDTO.class)
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
    RoleDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, RoleDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    RoleDTO getDraft(RoleDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, RoleDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(RoleDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    RoleDTO save(RoleDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, RoleDTO.class)
    }

}