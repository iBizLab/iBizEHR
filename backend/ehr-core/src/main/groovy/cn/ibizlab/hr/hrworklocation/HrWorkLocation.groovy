package cn.ibizlab.hr.hrworklocation

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrworklocation.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_WORK_LOCATION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrWorkLocation extends GroovyDataEntityRuntime<HrWorkLocation,HrWorkLocationDTO,HrWorkLocationFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrWorkLocation _instance
    void setInstance(HrWorkLocation instance) {
        _instance = instance
    }
    static HrWorkLocation getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrWorkLocationDTO create(HrWorkLocationDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrWorkLocationDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrWorkLocationDTO update(HrWorkLocationDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrWorkLocationDTO.class)
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
    HrWorkLocationDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrWorkLocationDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrWorkLocationDTO getDraft(HrWorkLocationDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrWorkLocationDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrWorkLocationDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrWorkLocationDTO save(HrWorkLocationDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrWorkLocationDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrWorkLocationDTO> fetchDefault(HrWorkLocationFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrWorkLocationDTO.class)
    }

}