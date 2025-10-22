package cn.ibizlab.hr.hrcandidatefilter

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrcandidatefilter.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_CANDIDATE_FILTER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrCandidateFilter extends GroovyDataEntityRuntime<HrCandidateFilter,HrCandidateFilterDTO,HrCandidateFilterFilterDTO> {

    public static final String ACTION_GET_INFO = "get_info"
    public static final String ACTION_RECOMMEND_DEPARTMENT = "recommend_department"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrCandidateFilter _instance
    void setInstance(HrCandidateFilter instance) {
        _instance = instance
    }
    static HrCandidateFilter getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrCandidateFilterDTO create(HrCandidateFilterDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrCandidateFilterDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrCandidateFilterDTO update(HrCandidateFilterDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrCandidateFilterDTO.class)
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
    HrCandidateFilterDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrCandidateFilterDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrCandidateFilterDTO getDraft(HrCandidateFilterDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrCandidateFilterDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrCandidateFilterDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrCandidateFilterDTO save(HrCandidateFilterDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrCandidateFilterDTO.class)
    }

    /**
     * 行为：获取信息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GET_INFO)
    def getInfo(HrCandidateFilterDTO dto) throws Throwable {
        return this.execute(ACTION_GET_INFO, dto, HrCandidateFilterDTO.class)
    }

    /**
     * 行为：推荐给用人部门 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RECOMMEND_DEPARTMENT)
    def recommendDepartment(HrCandidateFilterDTO dto) throws Throwable {
        return this.execute(ACTION_RECOMMEND_DEPARTMENT, dto, HrCandidateFilterDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrCandidateFilterDTO> fetchDefault(HrCandidateFilterFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrCandidateFilterDTO.class)
    }

}