package cn.ibizlab.hr.hrcandidate

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrcandidate.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CANDIDATE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrCandidate extends GroovyDataEntityRuntime<HrCandidate,HrCandidateDTO,HrCandidateFilterDTO> {

    public static final String ACTION_ADD_TO_HR_TALENTPOOL = "add_to_hr_talentpool"
    public static final String ACTION_GET_ARCHIVED_TODAY_COUNT = "get_archived_today_count"
    public static final String ACTION_GET_MY_ATTENTION_COUNT = "get_my_attention_count"
    public static final String ACTION_GET_MY_INTERVIEW_COUNT = "get_my_interview_count"
    public static final String ACTION_GET_MY_SUMMARY_COUNT = "get_my_summary_count"
    public static final String ACTION_GET_MY_TODOLIST_COUNT = "get_my_todolist_count"
    public static final String ACTION_GET_TALENT_POOL_COUNT = "get_talent_pool_count"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_PUBLIC_TALENT_POOL = "PUBLIC_TALENT_POOL"
    private static HrCandidate _instance
    void setInstance(HrCandidate instance) {
        _instance = instance
    }
    static HrCandidate getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrCandidateDTO create(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrCandidateDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrCandidateDTO update(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrCandidateDTO.class)
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
    HrCandidateDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrCandidateDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrCandidateDTO getDraft(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrCandidateDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrCandidateDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrCandidateDTO save(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrCandidateDTO.class)
    }

    /**
     * 行为：放入人才库 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_TO_HR_TALENTPOOL)
    def addToHrTalentpool(HrCandidateDTO dto) throws Throwable {
        this.execute(ACTION_ADD_TO_HR_TALENTPOOL, dto, HrCandidateDTO.class)
    }

    /**
     * 行为：获取当日归档人数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_ARCHIVED_TODAY_COUNT)
    def getArchivedTodayCount(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_GET_ARCHIVED_TODAY_COUNT, dto, HrCandidateDTO.class)
    }

    /**
     * 行为：获取工作台我的关注数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_MY_ATTENTION_COUNT)
    def getMyAttentionCount(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_GET_MY_ATTENTION_COUNT, dto, HrCandidateDTO.class)
    }

    /**
     * 行为：获取用人经理工作台我的面试数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_MY_INTERVIEW_COUNT)
    def getMyInterviewCount(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_GET_MY_INTERVIEW_COUNT, dto, HrCandidateDTO.class)
    }

    /**
     * 行为：获取工作台我的事项数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_MY_SUMMARY_COUNT)
    def getMySummaryCount(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_GET_MY_SUMMARY_COUNT, dto, HrCandidateDTO.class)
    }

    /**
     * 行为：我的待办事项清单计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_MY_TODOLIST_COUNT)
    def getMyTodolistCount(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_GET_MY_TODOLIST_COUNT, dto, HrCandidateDTO.class)
    }

    /**
     * 行为：获取人才库候选人总数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_TALENT_POOL_COUNT)
    def getTalentPoolCount(HrCandidateDTO dto) throws Throwable {
        return this.execute(ACTION_GET_TALENT_POOL_COUNT, dto, HrCandidateDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrCandidateDTO> fetchDefault(HrCandidateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrCandidateDTO.class)
    }

    /**
     * 数据集：公共人才库查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PUBLIC_TALENT_POOL)
    Page<HrCandidateDTO> fetchPublicTalentPool(HrCandidateFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PUBLIC_TALENT_POOL, context, HrCandidateDTO.class)
    }

}