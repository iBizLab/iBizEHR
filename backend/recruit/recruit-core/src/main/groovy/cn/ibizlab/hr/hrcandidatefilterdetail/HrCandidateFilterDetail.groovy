package cn.ibizlab.hr.hrcandidatefilterdetail

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrcandidatefilterdetail.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CANDIDATE_FILTER_DETAIL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrCandidateFilterDetail extends GroovyDataEntityRuntime<HrCandidateFilterDetail,HrCandidateFilterDetailDTO,HrCandidateFilterDetailFilterDTO> {

    public static final String ACTION_FILTER_COUNT = "filter_count"
    public static final String ACTION_MY_FILTER_COUNT = "my_filter_count"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_EVALUATED = "evaluated"
    public static final String DATASET_FILTER_MYSELF = "filter_myself"
    public static final String DATASET_UNEVALUATED = "unevaluated"
    private static HrCandidateFilterDetail _instance
    void setInstance(HrCandidateFilterDetail instance) {
        _instance = instance
    }
    static HrCandidateFilterDetail getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrCandidateFilterDetailDTO create(HrCandidateFilterDetailDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrCandidateFilterDetailDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrCandidateFilterDetailDTO update(HrCandidateFilterDetailDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrCandidateFilterDetailDTO.class)
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
    HrCandidateFilterDetailDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrCandidateFilterDetailDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrCandidateFilterDetailDTO getDraft(HrCandidateFilterDetailDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrCandidateFilterDetailDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrCandidateFilterDetailDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrCandidateFilterDetailDTO save(HrCandidateFilterDetailDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrCandidateFilterDetailDTO.class)
    }

    /**
     * 行为：筛选人数 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILTER_COUNT)
    def filterCount(HrCandidateFilterDetailDTO dto) throws Throwable {
        this.execute(ACTION_FILTER_COUNT, dto, HrCandidateFilterDetailDTO.class)
    }

    /**
     * 行为：用人经理-简历筛选-搜索栏计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MY_FILTER_COUNT)
    def myFilterCount(HrCandidateFilterDetailDTO dto) throws Throwable {
        return this.execute(ACTION_MY_FILTER_COUNT, dto, HrCandidateFilterDetailDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrCandidateFilterDetailDTO> fetchDefault(HrCandidateFilterDetailFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrCandidateFilterDetailDTO.class)
    }

    /**
     * 数据集：已评价 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EVALUATED)
    Page<HrCandidateFilterDetailDTO> fetchEvaluated(HrCandidateFilterDetailFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EVALUATED, context, HrCandidateFilterDetailDTO.class)
    }

    /**
     * 数据集：筛选_个人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_FILTER_MYSELF)
    Page<HrCandidateFilterDetailDTO> fetchFilterMyself(HrCandidateFilterDetailFilterDTO context) throws Throwable {
        return this.fetch(DATASET_FILTER_MYSELF, context, HrCandidateFilterDetailDTO.class)
    }

    /**
     * 数据集：未评价 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_UNEVALUATED)
    Page<HrCandidateFilterDetailDTO> fetchUnevaluated(HrCandidateFilterDetailFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UNEVALUATED, context, HrCandidateFilterDetailDTO.class)
    }

}