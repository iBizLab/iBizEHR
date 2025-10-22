package cn.ibizlab.hr.hrjobplatformrecord

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrjobplatformrecord.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_JOB_PLATFORM_RECORD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrJobPlatformRecord extends GroovyDataEntityRuntime<HrJobPlatformRecord,HrJobPlatformRecordDTO,HrJobPlatformRecordFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrJobPlatformRecord _instance
    void setInstance(HrJobPlatformRecord instance) {
        _instance = instance
    }
    static HrJobPlatformRecord getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrJobPlatformRecordDTO create(HrJobPlatformRecordDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrJobPlatformRecordDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrJobPlatformRecordDTO update(HrJobPlatformRecordDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrJobPlatformRecordDTO.class)
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
    HrJobPlatformRecordDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrJobPlatformRecordDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrJobPlatformRecordDTO getDraft(HrJobPlatformRecordDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrJobPlatformRecordDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrJobPlatformRecordDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrJobPlatformRecordDTO save(HrJobPlatformRecordDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrJobPlatformRecordDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrJobPlatformRecordDTO> fetchDefault(HrJobPlatformRecordFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrJobPlatformRecordDTO.class)
    }

}