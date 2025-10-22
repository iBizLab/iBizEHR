package cn.ibizlab.base.resconfigsettings

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.resconfigsettings.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_CONFIG_SETTINGS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResConfigSettings extends GroovyDataEntityRuntime<ResConfigSettings,ResConfigSettingsDTO,ResConfigSettingsFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ResConfigSettings _instance
    void setInstance(ResConfigSettings instance) {
        _instance = instance
    }
    static ResConfigSettings getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResConfigSettingsDTO create(ResConfigSettingsDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResConfigSettingsDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResConfigSettingsDTO update(ResConfigSettingsDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResConfigSettingsDTO.class)
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
    ResConfigSettingsDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResConfigSettingsDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResConfigSettingsDTO getDraft(ResConfigSettingsDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResConfigSettingsDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResConfigSettingsDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResConfigSettingsDTO save(ResConfigSettingsDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResConfigSettingsDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResConfigSettingsDTO> fetchDefault(ResConfigSettingsFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResConfigSettingsDTO.class)
    }

}