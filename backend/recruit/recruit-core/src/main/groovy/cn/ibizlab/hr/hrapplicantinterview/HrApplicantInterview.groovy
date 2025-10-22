package cn.ibizlab.hr.hrapplicantinterview

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrapplicantinterview.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_APPLICANT_INTERVIEW]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrApplicantInterview extends GroovyDataEntityRuntime<HrApplicantInterview,HrApplicantInterviewDTO,HrApplicantInterviewFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_INTERVIEW_LIST = "INTERVIEW_LIST"
    public static final String DATASET_MY_INTERVIEW = "MY_INTERVIEW"
    private static HrApplicantInterview _instance
    void setInstance(HrApplicantInterview instance) {
        _instance = instance
    }
    static HrApplicantInterview getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrApplicantInterviewDTO create(HrApplicantInterviewDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrApplicantInterviewDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrApplicantInterviewDTO update(HrApplicantInterviewDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrApplicantInterviewDTO.class)
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
    HrApplicantInterviewDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrApplicantInterviewDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrApplicantInterviewDTO getDraft(HrApplicantInterviewDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrApplicantInterviewDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrApplicantInterviewDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrApplicantInterviewDTO save(HrApplicantInterviewDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrApplicantInterviewDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrApplicantInterviewDTO> fetchDefault(HrApplicantInterviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrApplicantInterviewDTO.class)
    }

    /**
     * 数据集：面试安排 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_INTERVIEW_LIST)
    Page<HrApplicantInterviewDTO> fetchInterviewList(HrApplicantInterviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_INTERVIEW_LIST, context, HrApplicantInterviewDTO.class)
    }

    /**
     * 数据集：我的面试 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_MY_INTERVIEW)
    Page<HrApplicantInterviewDTO> fetchMyInterview(HrApplicantInterviewFilterDTO context) throws Throwable {
        return this.fetch(DATASET_MY_INTERVIEW, context, HrApplicantInterviewDTO.class)
    }

}