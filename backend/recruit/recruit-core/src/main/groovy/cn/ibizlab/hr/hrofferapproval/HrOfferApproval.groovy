package cn.ibizlab.hr.hrofferapproval

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrofferapproval.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_OFFER_APPROVAL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrOfferApproval extends GroovyDataEntityRuntime<HrOfferApproval,HrOfferApprovalDTO,HrOfferApprovalFilterDTO> {

    public static final String ACTION_APPROVAL = "approval"
    public static final String ACTION_MY_OFFER_COUNT = "my_offer_count"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_HM_MYSELF = "hm_myself"
    private static HrOfferApproval _instance
    void setInstance(HrOfferApproval instance) {
        _instance = instance
    }
    static HrOfferApproval getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrOfferApprovalDTO create(HrOfferApprovalDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrOfferApprovalDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrOfferApprovalDTO update(HrOfferApprovalDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrOfferApprovalDTO.class)
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
    HrOfferApprovalDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrOfferApprovalDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrOfferApprovalDTO getDraft(HrOfferApprovalDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrOfferApprovalDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrOfferApprovalDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrOfferApprovalDTO save(HrOfferApprovalDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrOfferApprovalDTO.class)
    }

    /**
     * 行为：审批 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_APPROVAL)
    def approval(HrOfferApprovalDTO dto) throws Throwable {
        this.execute(ACTION_APPROVAL, dto, HrOfferApprovalDTO.class)
    }

    /**
     * 行为：用人经理-我的offer-搜索栏计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MY_OFFER_COUNT)
    def myOfferCount(HrOfferApprovalDTO dto) throws Throwable {
        return this.execute(ACTION_MY_OFFER_COUNT, dto, HrOfferApprovalDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrOfferApprovalDTO> fetchDefault(HrOfferApprovalFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrOfferApprovalDTO.class)
    }

    /**
     * 数据集：用人经理数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_HM_MYSELF)
    Page<HrOfferApprovalDTO> fetchHmMyself(HrOfferApprovalFilterDTO context) throws Throwable {
        return this.fetch(DATASET_HM_MYSELF, context, HrOfferApprovalDTO.class)
    }

}