package cn.ibizlab.base.rescountry

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.rescountry.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_COUNTRY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResCountry extends GroovyDataEntityRuntime<ResCountry,ResCountryDTO,ResCountryFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ResCountry _instance
    void setInstance(ResCountry instance) {
        _instance = instance
    }
    static ResCountry getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResCountryDTO create(ResCountryDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResCountryDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResCountryDTO update(ResCountryDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResCountryDTO.class)
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
    ResCountryDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResCountryDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResCountryDTO getDraft(ResCountryDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResCountryDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResCountryDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResCountryDTO save(ResCountryDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResCountryDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResCountryDTO> fetchDefault(ResCountryFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResCountryDTO.class)
    }

}