package cn.ibizlab.base.respartner

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.respartner.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_PARTNER]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResPartner extends GroovyDataEntityRuntime<ResPartner,ResPartnerDTO,ResPartnerFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CHANNEL_INVITE = "channel_invite"
    public static final String DATASET_IS_COMPANY = "is_company"
    private static ResPartner _instance
    void setInstance(ResPartner instance) {
        _instance = instance
    }
    static ResPartner getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResPartnerDTO create(ResPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResPartnerDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResPartnerDTO update(ResPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResPartnerDTO.class)
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
    ResPartnerDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResPartnerDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResPartnerDTO getDraft(ResPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResPartnerDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResPartnerDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResPartnerDTO save(ResPartnerDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResPartnerDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResPartnerDTO> fetchDefault(ResPartnerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResPartnerDTO.class)
    }

    /**
     * 数据集：频道可邀请的联系人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CHANNEL_INVITE)
    Page<ResPartnerDTO> fetchChannelInvite(ResPartnerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CHANNEL_INVITE, context, ResPartnerDTO.class)
    }

    /**
     * 数据集：公司联系人 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_IS_COMPANY)
    Page<ResPartnerDTO> fetchIsCompany(ResPartnerFilterDTO context) throws Throwable {
        return this.fetch(DATASET_IS_COMPANY, context, ResPartnerDTO.class)
    }

}