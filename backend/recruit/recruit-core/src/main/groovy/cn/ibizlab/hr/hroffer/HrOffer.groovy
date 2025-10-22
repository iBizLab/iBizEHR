package cn.ibizlab.hr.hroffer

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hroffer.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_OFFER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrOffer extends GroovyDataEntityRuntime<HrOffer,HrOfferDTO,HrOfferFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_BI_SEARCH = "bi_search"
    private static HrOffer _instance
    void setInstance(HrOffer instance) {
        _instance = instance
    }
    static HrOffer getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrOfferDTO create(HrOfferDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrOfferDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrOfferDTO update(HrOfferDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrOfferDTO.class)
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
    HrOfferDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrOfferDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrOfferDTO getDraft(HrOfferDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrOfferDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrOfferDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrOfferDTO save(HrOfferDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrOfferDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrOfferDTO> fetchDefault(HrOfferFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrOfferDTO.class)
    }

    /**
     * 数据集：bi_search 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_BI_SEARCH)
    Page<HrOfferDTO> fetchBiSearch(HrOfferFilterDTO context) throws Throwable {
        return this.fetch(DATASET_BI_SEARCH, context, HrOfferDTO.class)
    }

}