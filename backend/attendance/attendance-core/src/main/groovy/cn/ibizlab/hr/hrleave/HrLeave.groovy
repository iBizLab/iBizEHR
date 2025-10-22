package cn.ibizlab.hr.hrleave

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrleave.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_LEAVE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrLeave extends GroovyDataEntityRuntime<HrLeave,HrLeaveDTO,HrLeaveFilterDTO> {

    private static HrLeave _instance
    void setInstance(HrLeave instance) {
        _instance = instance
    }
    static HrLeave getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrLeaveDTO create(HrLeaveDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrLeaveDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrLeaveDTO update(HrLeaveDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrLeaveDTO.class)
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
    HrLeaveDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrLeaveDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrLeaveDTO getDraft(HrLeaveDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrLeaveDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrLeaveDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrLeaveDTO save(HrLeaveDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrLeaveDTO.class)
    }

}