package cn.ibizlab.base.resbank

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.resbank.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_BANK]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResBank extends GroovyDataEntityRuntime<ResBank,ResBankDTO,ResBankFilterDTO> {

    private static ResBank _instance
    void setInstance(ResBank instance) {
        _instance = instance
    }
    static ResBank getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResBankDTO create(ResBankDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResBankDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResBankDTO update(ResBankDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResBankDTO.class)
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
    ResBankDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResBankDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResBankDTO getDraft(ResBankDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResBankDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResBankDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResBankDTO save(ResBankDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResBankDTO.class)
    }

}