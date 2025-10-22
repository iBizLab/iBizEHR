package cn.ibizlab.hr.hrapplicantrefusereason

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrapplicantrefusereason.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_APPLICANT_REFUSE_REASON]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrApplicantRefuseReason extends GroovyDataEntityRuntime<HrApplicantRefuseReason,HrApplicantRefuseReasonDTO,HrApplicantRefuseReasonFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrApplicantRefuseReason _instance
    void setInstance(HrApplicantRefuseReason instance) {
        _instance = instance
    }
    static HrApplicantRefuseReason getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrApplicantRefuseReasonDTO create(HrApplicantRefuseReasonDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrApplicantRefuseReasonDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrApplicantRefuseReasonDTO update(HrApplicantRefuseReasonDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrApplicantRefuseReasonDTO.class)
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
    HrApplicantRefuseReasonDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrApplicantRefuseReasonDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrApplicantRefuseReasonDTO getDraft(HrApplicantRefuseReasonDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrApplicantRefuseReasonDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrApplicantRefuseReasonDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrApplicantRefuseReasonDTO save(HrApplicantRefuseReasonDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrApplicantRefuseReasonDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrApplicantRefuseReasonDTO> fetchDefault(HrApplicantRefuseReasonFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrApplicantRefuseReasonDTO.class)
    }

}