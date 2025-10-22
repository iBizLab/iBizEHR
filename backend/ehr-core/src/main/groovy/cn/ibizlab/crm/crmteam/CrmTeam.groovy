package cn.ibizlab.crm.crmteam

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.crm.crmteam.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[CRM_TEAM]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class CrmTeam extends GroovyDataEntityRuntime<CrmTeam,CrmTeamDTO,CrmTeamFilterDTO> {

    private static CrmTeam _instance
    void setInstance(CrmTeam instance) {
        _instance = instance
    }
    static CrmTeam getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CrmTeamDTO create(CrmTeamDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CrmTeamDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CrmTeamDTO update(CrmTeamDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CrmTeamDTO.class)
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
    CrmTeamDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CrmTeamDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CrmTeamDTO getDraft(CrmTeamDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CrmTeamDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CrmTeamDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CrmTeamDTO save(CrmTeamDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CrmTeamDTO.class)
    }

}