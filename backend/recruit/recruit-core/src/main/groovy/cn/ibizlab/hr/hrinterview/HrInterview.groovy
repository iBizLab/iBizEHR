package cn.ibizlab.hr.hrinterview

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrinterview.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_INTERVIEW]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrInterview extends GroovyDataEntityRuntime<HrInterview,HrInterviewDTO,HrInterviewFilterDTO> {

    public static final String ACTION_NOTHING = "nothing"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_AFTER_INTERVIEW = "AFTER_INTERVIEW"
    public static final String DATASET_BEFORE_INTERVIEW = "BEFORE_INTERVIEW"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_CURRENT_INTERVIEW = "CURRENT_INTERVIEW"
    public static final String DATASET_MY_INTERVIEW = "MY_INTERVIEW"
    private static HrInterview _instance
    void setInstance(HrInterview instance) {
        _instance = instance
    }
    static HrInterview getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrInterviewDTO create(HrInterviewDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrInterviewDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrInterviewDTO update(HrInterviewDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrInterviewDTO.class)
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
    HrInterviewDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrInterviewDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrInterviewDTO getDraft(HrInterviewDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrInterviewDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrInterviewDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrInterviewDTO save(HrInterviewDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrInterviewDTO.class)
    }

    /**
     * 行为：行为 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_NOTHING)
    def nothing(HrInterviewDTO dto) throws Throwable {
        this.execute(ACTION_NOTHING, dto, HrInterviewDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrInterviewDTO> fetchDefault(HrInterviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrInterviewDTO.class)
    }

    /**
     * 数据集：今后之后的面试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_AFTER_INTERVIEW)
    Page<HrInterviewDTO> fetchAfterInterview(HrInterviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_AFTER_INTERVIEW, context, HrInterviewDTO.class)
    }

    /**
     * 数据集：今天之前的面试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BEFORE_INTERVIEW)
    Page<HrInterviewDTO> fetchBeforeInterview(HrInterviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BEFORE_INTERVIEW, context, HrInterviewDTO.class)
    }

    /**
     * 数据集：bi_search 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<HrInterviewDTO> fetchBiSearch(HrInterviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, HrInterviewDTO.class)
    }

    /**
     * 数据集：今天的面试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CURRENT_INTERVIEW)
    Page<HrInterviewDTO> fetchCurrentInterview(HrInterviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CURRENT_INTERVIEW, context, HrInterviewDTO.class)
    }

    /**
     * 数据集：我的面试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_INTERVIEW)
    Page<HrInterviewDTO> fetchMyInterview(HrInterviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_INTERVIEW, context, HrInterviewDTO.class)
    }

}