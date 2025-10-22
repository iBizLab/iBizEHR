package cn.ibizlab.ebsx.sysorganization

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.ebsx.sysorganization.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYS_ORG]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SysOrganization extends GroovyDataEntityRuntime<SysOrganization,SysOrganizationDTO,SysOrganizationFilterDTO> {

    private static SysOrganization _instance
    void setInstance(SysOrganization instance) {
        _instance = instance
    }
    static SysOrganization getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SysOrganizationDTO create(SysOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SysOrganizationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SysOrganizationDTO update(SysOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SysOrganizationDTO.class)
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
    SysOrganizationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SysOrganizationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SysOrganizationDTO getDraft(SysOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SysOrganizationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SysOrganizationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SysOrganizationDTO save(SysOrganizationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SysOrganizationDTO.class)
    }

}