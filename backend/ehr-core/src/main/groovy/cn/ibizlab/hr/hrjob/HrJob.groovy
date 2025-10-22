package cn.ibizlab.hr.hrjob

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrjob.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_JOB]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrJob extends GroovyDataEntityRuntime<HrJob,HrJobDTO,HrJobFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrJob _instance
    void setInstance(HrJob instance) {
        _instance = instance
    }
    static HrJob getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrJobDTO create(HrJobDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrJobDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrJobDTO update(HrJobDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrJobDTO.class)
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
    HrJobDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrJobDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrJobDTO getDraft(HrJobDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrJobDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrJobDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrJobDTO save(HrJobDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrJobDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrJobDTO> fetchDefault(HrJobFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrJobDTO.class)
    }

}