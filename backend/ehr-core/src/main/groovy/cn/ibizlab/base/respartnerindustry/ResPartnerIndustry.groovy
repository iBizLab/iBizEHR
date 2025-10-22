package cn.ibizlab.base.respartnerindustry

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.respartnerindustry.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_PARTNER_INDUSTRY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResPartnerIndustry extends GroovyDataEntityRuntime<ResPartnerIndustry,ResPartnerIndustryDTO,ResPartnerIndustryFilterDTO> {

    private static ResPartnerIndustry _instance
    void setInstance(ResPartnerIndustry instance) {
        _instance = instance
    }
    static ResPartnerIndustry getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResPartnerIndustryDTO create(ResPartnerIndustryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResPartnerIndustryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResPartnerIndustryDTO update(ResPartnerIndustryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResPartnerIndustryDTO.class)
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
    ResPartnerIndustryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResPartnerIndustryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResPartnerIndustryDTO getDraft(ResPartnerIndustryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResPartnerIndustryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResPartnerIndustryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResPartnerIndustryDTO save(ResPartnerIndustryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResPartnerIndustryDTO.class)
    }

}