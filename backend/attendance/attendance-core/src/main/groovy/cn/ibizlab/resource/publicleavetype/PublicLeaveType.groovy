package cn.ibizlab.resource.publicleavetype

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.resource.publicleavetype.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PUBLIC_LEAVE_TYPE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PublicLeaveType extends GroovyDataEntityRuntime<PublicLeaveType,PublicLeaveTypeDTO,PublicLeaveTypeFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PublicLeaveType _instance
    void setInstance(PublicLeaveType instance) {
        _instance = instance
    }
    static PublicLeaveType getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PublicLeaveTypeDTO create(PublicLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PublicLeaveTypeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PublicLeaveTypeDTO update(PublicLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PublicLeaveTypeDTO.class)
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
    PublicLeaveTypeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PublicLeaveTypeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PublicLeaveTypeDTO getDraft(PublicLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PublicLeaveTypeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PublicLeaveTypeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PublicLeaveTypeDTO save(PublicLeaveTypeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PublicLeaveTypeDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PublicLeaveTypeDTO> fetchDefault(PublicLeaveTypeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PublicLeaveTypeDTO.class)
    }

}