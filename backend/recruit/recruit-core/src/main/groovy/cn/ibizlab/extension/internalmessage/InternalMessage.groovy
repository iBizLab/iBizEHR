package cn.ibizlab.extension.internalmessage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.internalmessage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[INTERNAL_MESSAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class InternalMessage extends GroovyDataEntityRuntime<InternalMessage,InternalMessageDTO,InternalMessageFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_RECEIVER = "cur_receiver"
    public static final String DATASET_CUR_SYSTEM_ALL = "cur_system_all"
    private static InternalMessage _instance
    void setInstance(InternalMessage instance) {
        _instance = instance
    }
    static InternalMessage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    InternalMessageDTO create(InternalMessageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, InternalMessageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    InternalMessageDTO update(InternalMessageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, InternalMessageDTO.class)
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
    InternalMessageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, InternalMessageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    InternalMessageDTO getDraft(InternalMessageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, InternalMessageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(InternalMessageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    InternalMessageDTO save(InternalMessageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, InternalMessageDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<InternalMessageDTO> fetchDefault(InternalMessageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, InternalMessageDTO.class)
    }

    /**
     * 数据集：cur_receiver 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_RECEIVER)
    Page<InternalMessageDTO> fetchCurReceiver(InternalMessageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_RECEIVER, context, InternalMessageDTO.class)
    }

    /**
     * 数据集：当前系统消息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_SYSTEM_ALL)
    Page<InternalMessageDTO> fetchCurSystemAll(InternalMessageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_SYSTEM_ALL, context, InternalMessageDTO.class)
    }

}