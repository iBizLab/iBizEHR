package cn.ibizlab.hr.hrjobplatform

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrjobplatform.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_JOB_PLATFORM]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrJobPlatform extends GroovyDataEntityRuntime<HrJobPlatform,HrJobPlatformDTO,HrJobPlatformFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_JOB_PLATFORM = "job_platform"
    public static final String DATASET_PLATFORM = "platform"
    public static final String DATASET_SOCIAL = "social"
    private static HrJobPlatform _instance
    void setInstance(HrJobPlatform instance) {
        _instance = instance
    }
    static HrJobPlatform getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrJobPlatformDTO create(HrJobPlatformDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrJobPlatformDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrJobPlatformDTO update(HrJobPlatformDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrJobPlatformDTO.class)
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
    HrJobPlatformDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrJobPlatformDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrJobPlatformDTO getDraft(HrJobPlatformDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrJobPlatformDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrJobPlatformDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrJobPlatformDTO save(HrJobPlatformDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrJobPlatformDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrJobPlatformDTO> fetchDefault(HrJobPlatformFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrJobPlatformDTO.class)
    }

    /**
     * 数据集：职位发布情况 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_JOB_PLATFORM)
    Page<HrJobPlatformDTO> fetchJobPlatform(HrJobPlatformFilterDTO context) throws Throwable {
        return this.fetch(DATASET_JOB_PLATFORM, context, HrJobPlatformDTO.class)
    }

    /**
     * 数据集：外部招聘平台 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PLATFORM)
    Page<HrJobPlatformDTO> fetchPlatform(HrJobPlatformFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PLATFORM, context, HrJobPlatformDTO.class)
    }

    /**
     * 数据集：社招官网 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SOCIAL)
    Page<HrJobPlatformDTO> fetchSocial(HrJobPlatformFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SOCIAL, context, HrJobPlatformDTO.class)
    }

}