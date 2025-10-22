package cn.ibizlab.hr.hrjobplatformaccount

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrjobplatformaccount.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_JOB_PLATFORM_ACCOUNT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrJobPlatformAccount extends GroovyDataEntityRuntime<HrJobPlatformAccount,HrJobPlatformAccountDTO,HrJobPlatformAccountFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_PUBLISH_STATUS = "publish_status"
    private static HrJobPlatformAccount _instance
    void setInstance(HrJobPlatformAccount instance) {
        _instance = instance
    }
    static HrJobPlatformAccount getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrJobPlatformAccountDTO create(HrJobPlatformAccountDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrJobPlatformAccountDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrJobPlatformAccountDTO update(HrJobPlatformAccountDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrJobPlatformAccountDTO.class)
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
    HrJobPlatformAccountDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrJobPlatformAccountDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrJobPlatformAccountDTO getDraft(HrJobPlatformAccountDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrJobPlatformAccountDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrJobPlatformAccountDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrJobPlatformAccountDTO save(HrJobPlatformAccountDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrJobPlatformAccountDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrJobPlatformAccountDTO> fetchDefault(HrJobPlatformAccountFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrJobPlatformAccountDTO.class)
    }

    /**
     * 数据集：账号发布状态 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PUBLISH_STATUS)
    Page<HrJobPlatformAccountDTO> fetchPublishStatus(HrJobPlatformAccountFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PUBLISH_STATUS, context, HrJobPlatformAccountDTO.class)
    }

}