package cn.ibizlab.base.irsequence

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.irsequence.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_SEQUENCE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrSequence extends GroovyDataEntityRuntime<IrSequence,IrSequenceDTO,IrSequenceFilterDTO> {

    private static IrSequence _instance
    void setInstance(IrSequence instance) {
        _instance = instance
    }
    static IrSequence getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrSequenceDTO create(IrSequenceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrSequenceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrSequenceDTO update(IrSequenceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrSequenceDTO.class)
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
    IrSequenceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrSequenceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrSequenceDTO getDraft(IrSequenceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrSequenceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrSequenceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrSequenceDTO save(IrSequenceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrSequenceDTO.class)
    }

}