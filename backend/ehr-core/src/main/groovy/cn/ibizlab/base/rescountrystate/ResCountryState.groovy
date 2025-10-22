package cn.ibizlab.base.rescountrystate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.rescountrystate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_COUNTRY_STATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResCountryState extends GroovyDataEntityRuntime<ResCountryState,ResCountryStateDTO,ResCountryStateFilterDTO> {

    private static ResCountryState _instance
    void setInstance(ResCountryState instance) {
        _instance = instance
    }
    static ResCountryState getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResCountryStateDTO create(ResCountryStateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResCountryStateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResCountryStateDTO update(ResCountryStateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResCountryStateDTO.class)
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
    ResCountryStateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResCountryStateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResCountryStateDTO getDraft(ResCountryStateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResCountryStateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResCountryStateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResCountryStateDTO save(ResCountryStateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResCountryStateDTO.class)
    }

}