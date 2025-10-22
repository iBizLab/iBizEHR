package cn.ibizlab.hr.hrinterviewuser

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrinterviewuser.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_INTERVIEW_USER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrInterviewUser extends GroovyDataEntityRuntime<HrInterviewUser,HrInterviewUserDTO,HrInterviewUserFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CANDIDATE = "CANDIDATE"
    public static final String DATASET_INTERVIEWER = "INTERVIEWER"
    private static HrInterviewUser _instance
    void setInstance(HrInterviewUser instance) {
        _instance = instance
    }
    static HrInterviewUser getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrInterviewUserDTO create(HrInterviewUserDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrInterviewUserDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrInterviewUserDTO update(HrInterviewUserDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrInterviewUserDTO.class)
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
    HrInterviewUserDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrInterviewUserDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrInterviewUserDTO getDraft(HrInterviewUserDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrInterviewUserDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrInterviewUserDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrInterviewUserDTO save(HrInterviewUserDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrInterviewUserDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrInterviewUserDTO> fetchDefault(HrInterviewUserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrInterviewUserDTO.class)
    }

    /**
     * 数据集：候选人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CANDIDATE)
    Page<HrInterviewUserDTO> fetchCandidate(HrInterviewUserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CANDIDATE, context, HrInterviewUserDTO.class)
    }

    /**
     * 数据集：面试官 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_INTERVIEWER)
    Page<HrInterviewUserDTO> fetchInterviewer(HrInterviewUserFilterDTO context) throws Throwable {
        return this.fetch(DATASET_INTERVIEWER, context, HrInterviewUserDTO.class)
    }

}