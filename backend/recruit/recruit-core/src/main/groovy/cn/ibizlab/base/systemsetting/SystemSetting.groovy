package cn.ibizlab.base.systemsetting

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.systemsetting.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[SYSTEM_SETTING]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class SystemSetting extends GroovyDataEntityRuntime<SystemSetting,SystemSettingDTO,SystemSettingFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static SystemSetting _instance
    void setInstance(SystemSetting instance) {
        _instance = instance
    }
    static SystemSetting getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    SystemSettingDTO create(SystemSettingDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, SystemSettingDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    SystemSettingDTO update(SystemSettingDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, SystemSettingDTO.class)
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
    SystemSettingDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, SystemSettingDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    SystemSettingDTO getDraft(SystemSettingDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, SystemSettingDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(SystemSettingDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    SystemSettingDTO save(SystemSettingDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, SystemSettingDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<SystemSettingDTO> fetchDefault(SystemSettingFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, SystemSettingDTO.class)
    }

}