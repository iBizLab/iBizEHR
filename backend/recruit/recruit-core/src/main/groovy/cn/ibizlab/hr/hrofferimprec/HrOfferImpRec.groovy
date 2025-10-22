package cn.ibizlab.hr.hrofferimprec

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrofferimprec.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_OFFER_IMP_REC]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrOfferImpRec extends GroovyDataEntityRuntime<HrOfferImpRec,HrOfferImpRecDTO,HrOfferImpRecFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrOfferImpRec _instance
    void setInstance(HrOfferImpRec instance) {
        _instance = instance
    }
    static HrOfferImpRec getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrOfferImpRecDTO create(HrOfferImpRecDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrOfferImpRecDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrOfferImpRecDTO update(HrOfferImpRecDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrOfferImpRecDTO.class)
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
    HrOfferImpRecDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrOfferImpRecDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrOfferImpRecDTO getDraft(HrOfferImpRecDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrOfferImpRecDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrOfferImpRecDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrOfferImpRecDTO save(HrOfferImpRecDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrOfferImpRecDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrOfferImpRecDTO> fetchDefault(HrOfferImpRecFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrOfferImpRecDTO.class)
    }

}