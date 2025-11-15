package cn.ibizlab.hr.hrapplicant

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrapplicant.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_APPLICANT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrApplicant extends GroovyDataEntityRuntime<HrApplicant,HrApplicantDTO,HrApplicantFilterDTO> {

    public static final String ACTION_APPLICANT_READ = "applicant_read"
    public static final String ACTION_FAVORITE = "favorite"
    public static final String ACTION_GET_APPLICANT_STATE = "get_applicant_state"
    public static final String ACTION_GET_BASEINFO_PAGE_COUNT = "get_baseinfo_page_count"
    public static final String ACTION_GET_WORKSPACE_COUNT = "get_workspace_count"
    public static final String ACTION_NOTHING = "nothing"
    public static final String ACTION_OUT = "out"
    public static final String ACTION_RECOMMEND_DEPARTMENT = "recommend_department"
    public static final String ACTION_REMOVE_FAVORITE = "remove_favorite"
    public static final String ACTION_SAVE_APPLICANT = "save_applicant"
    public static final String ACTION_UPDATE_STAGE = "update_stage"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_ACTIVE_APPLICANT = "active_applicant"
    public static final String DATASET_BI_SEARCH = "bi_search"
    public static final String DATASET_FAVORITE = "favorite"
    private static HrApplicant _instance
    void setInstance(HrApplicant instance) {
        _instance = instance
    }
    static HrApplicant getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrApplicantDTO create(HrApplicantDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrApplicantDTO update(HrApplicantDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrApplicantDTO.class)
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
    HrApplicantDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrApplicantDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrApplicantDTO getDraft(HrApplicantDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrApplicantDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrApplicantDTO save(HrApplicantDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：候选人申请_已读 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_APPLICANT_READ)
    def applicantRead(HrApplicantDTO dto) throws Throwable {
        this.execute(ACTION_APPLICANT_READ, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：添加关注 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FAVORITE)
    def favorite(HrApplicantDTO dto) throws Throwable {
        this.execute(ACTION_FAVORITE, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：候选人状态筛选 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_APPLICANT_STATE)
    def getApplicantState(HrApplicantDTO dto) throws Throwable {
        return this.execute(ACTION_GET_APPLICANT_STATE, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：候选人基本信息导航栏计数 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_BASEINFO_PAGE_COUNT)
    def getBaseinfoPageCount(String key) throws Throwable {
        return this.execute(ACTION_GET_BASEINFO_PAGE_COUNT, key, HrApplicantDTO.class)
    }

    /**
     * 行为：获取工作台数据 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_WORKSPACE_COUNT)
    def getWorkspaceCount(String key) throws Throwable {
        return this.execute(ACTION_GET_WORKSPACE_COUNT, key, HrApplicantDTO.class)
    }

    /**
     * 行为：nothing 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_NOTHING)
    def nothing(HrApplicantDTO dto) throws Throwable {
        this.execute(ACTION_NOTHING, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：淘汰 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_OUT)
    def out(HrApplicantDTO dto) throws Throwable {
        this.execute(ACTION_OUT, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：推荐给用人部门 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOMMEND_DEPARTMENT)
    def recommendDepartment(HrApplicantDTO dto) throws Throwable {
        this.execute(ACTION_RECOMMEND_DEPARTMENT, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：保存候选人申请信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE_APPLICANT)
    def saveApplicant(HrApplicantDTO dto) throws Throwable {
        this.execute(ACTION_SAVE_APPLICANT, dto, HrApplicantDTO.class)
    }

    /**
     * 行为：修改申请阶段 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE_STAGE)
    def updateStage(HrApplicantDTO dto) throws Throwable {
        this.execute(ACTION_UPDATE_STAGE, dto, HrApplicantDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrApplicantDTO> fetchDefault(HrApplicantFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrApplicantDTO.class)
    }

    /**
     * 数据集：流程中的申请 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ACTIVE_APPLICANT)
    Page<HrApplicantDTO> fetchActiveApplicant(HrApplicantFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ACTIVE_APPLICANT, context, HrApplicantDTO.class)
    }

    /**
     * 数据集：bi_search 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<HrApplicantDTO> fetchBiSearch(HrApplicantFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, HrApplicantDTO.class)
    }

    /**
     * 数据集：查询星标 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FAVORITE)
    Page<HrApplicantDTO> fetchFavorite(HrApplicantFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FAVORITE, context, HrApplicantDTO.class)
    }

}