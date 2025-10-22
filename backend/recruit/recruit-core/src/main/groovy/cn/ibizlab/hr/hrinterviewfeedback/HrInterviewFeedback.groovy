package cn.ibizlab.hr.hrinterviewfeedback

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrinterviewfeedback.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_INTERVIEW_FEEDBACK]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrInterviewFeedback extends GroovyDataEntityRuntime<HrInterviewFeedback,HrInterviewFeedbackDTO,HrInterviewFeedbackFilterDTO> {

    public static final String ACTION_MY_INTERVIEW_COUNT = "my_interview_count"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_AFTER_INTERVIEW = "after_interview"
    public static final String DATASET_BEFORE_INTERVIEW = "before_interview"
    public static final String DATASET_CURRENT_INTERVIEW = "current_interview"
    public static final String DATASET_INTERVIEW_MYSELF = "interview_myself"
    public static final String DATASET_PASS_INTERVIEW = "pass_interview"
    public static final String DATASET_UNEVALUATED = "unevaluated"
    private static HrInterviewFeedback _instance
    void setInstance(HrInterviewFeedback instance) {
        _instance = instance
    }
    static HrInterviewFeedback getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrInterviewFeedbackDTO create(HrInterviewFeedbackDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrInterviewFeedbackDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrInterviewFeedbackDTO update(HrInterviewFeedbackDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrInterviewFeedbackDTO.class)
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
    HrInterviewFeedbackDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrInterviewFeedbackDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrInterviewFeedbackDTO getDraft(HrInterviewFeedbackDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrInterviewFeedbackDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrInterviewFeedbackDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrInterviewFeedbackDTO save(HrInterviewFeedbackDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrInterviewFeedbackDTO.class)
    }

    /**
     * 行为：用人经理-我的面试-搜索栏计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MY_INTERVIEW_COUNT)
    def myInterviewCount(HrInterviewFeedbackDTO dto) throws Throwable {
        return this.execute(ACTION_MY_INTERVIEW_COUNT, dto, HrInterviewFeedbackDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrInterviewFeedbackDTO> fetchDefault(HrInterviewFeedbackFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrInterviewFeedbackDTO.class)
    }

    /**
     * 数据集：今后的面试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_AFTER_INTERVIEW)
    Page<HrInterviewFeedbackDTO> fetchAfterInterview(HrInterviewFeedbackFilterDTO context) throws Throwable {
        return this.fetch(DATASET_AFTER_INTERVIEW, context, HrInterviewFeedbackDTO.class)
    }

    /**
     * 数据集：之前的面试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BEFORE_INTERVIEW)
    Page<HrInterviewFeedbackDTO> fetchBeforeInterview(HrInterviewFeedbackFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BEFORE_INTERVIEW, context, HrInterviewFeedbackDTO.class)
    }

    /**
     * 数据集：今天的面试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CURRENT_INTERVIEW)
    Page<HrInterviewFeedbackDTO> fetchCurrentInterview(HrInterviewFeedbackFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CURRENT_INTERVIEW, context, HrInterviewFeedbackDTO.class)
    }

    /**
     * 数据集：用人经理_我的面试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_INTERVIEW_MYSELF)
    Page<HrInterviewFeedbackDTO> fetchInterviewMyself(HrInterviewFeedbackFilterDTO context) throws Throwable {
        return this.fetch(DATASET_INTERVIEW_MYSELF, context, HrInterviewFeedbackDTO.class)
    }

    /**
     * 数据集：通过的面试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PASS_INTERVIEW)
    Page<HrInterviewFeedbackDTO> fetchPassInterview(HrInterviewFeedbackFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PASS_INTERVIEW, context, HrInterviewFeedbackDTO.class)
    }

    /**
     * 数据集：待反馈面试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_UNEVALUATED)
    Page<HrInterviewFeedbackDTO> fetchUnevaluated(HrInterviewFeedbackFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UNEVALUATED, context, HrInterviewFeedbackDTO.class)
    }

}