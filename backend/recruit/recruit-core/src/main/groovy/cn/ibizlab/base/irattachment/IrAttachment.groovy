package cn.ibizlab.base.irattachment

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.irattachment.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IR_ATTACHMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class IrAttachment extends GroovyDataEntityRuntime<IrAttachment,IrAttachmentDTO,IrAttachmentFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static IrAttachment _instance
    void setInstance(IrAttachment instance) {
        _instance = instance
    }
    static IrAttachment getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    IrAttachmentDTO create(IrAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, IrAttachmentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    IrAttachmentDTO update(IrAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, IrAttachmentDTO.class)
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
    IrAttachmentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, IrAttachmentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    IrAttachmentDTO getDraft(IrAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, IrAttachmentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(IrAttachmentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    IrAttachmentDTO save(IrAttachmentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, IrAttachmentDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<IrAttachmentDTO> fetchDefault(IrAttachmentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, IrAttachmentDTO.class)
    }

}