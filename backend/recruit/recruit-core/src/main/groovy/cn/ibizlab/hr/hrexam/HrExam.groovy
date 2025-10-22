package cn.ibizlab.hr.hrexam

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrexam.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EXAM]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrExam extends GroovyDataEntityRuntime<HrExam,HrExamDTO,HrExamFilterDTO> {

    public static final String ACTION_MY_INTERVIEW_COUNT = "my_interview_count"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_AWAIT_FEEDBACK = "await_feedback"
    public static final String DATASET_HM_MYSELF = "hm_myself"
    private static HrExam _instance
    void setInstance(HrExam instance) {
        _instance = instance
    }
    static HrExam getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrExamDTO create(HrExamDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrExamDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrExamDTO update(HrExamDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrExamDTO.class)
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
    HrExamDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrExamDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrExamDTO getDraft(HrExamDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrExamDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrExamDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrExamDTO save(HrExamDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrExamDTO.class)
    }

    /**
     * 行为：用人经理-我的考试/测评-搜索栏计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MY_INTERVIEW_COUNT)
    def myInterviewCount(HrExamDTO dto) throws Throwable {
        return this.execute(ACTION_MY_INTERVIEW_COUNT, dto, HrExamDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrExamDTO> fetchDefault(HrExamFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrExamDTO.class)
    }

    /**
     * 数据集：待反馈 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_AWAIT_FEEDBACK)
    Page<HrExamDTO> fetchAwaitFeedback(HrExamFilterDTO context) throws Throwable {
        return this.fetch(DATASET_AWAIT_FEEDBACK, context, HrExamDTO.class)
    }

    /**
     * 数据集：用人经理数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_HM_MYSELF)
    Page<HrExamDTO> fetchHmMyself(HrExamFilterDTO context) throws Throwable {
        return this.fetch(DATASET_HM_MYSELF, context, HrExamDTO.class)
    }

}