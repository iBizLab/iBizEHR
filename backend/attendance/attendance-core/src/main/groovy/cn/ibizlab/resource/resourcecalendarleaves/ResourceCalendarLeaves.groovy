package cn.ibizlab.resource.resourcecalendarleaves

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.resource.resourcecalendarleaves.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RESOURCE_CALENDAR_LEAVES]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResourceCalendarLeaves extends GroovyDataEntityRuntime<ResourceCalendarLeaves,ResourceCalendarLeavesDTO,ResourceCalendarLeavesFilterDTO> {

    public static final String ACTION_ASYNCHOLIDAYS = "aSyncHolidays"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_PUBLIC = "PUBLIC"
    private static ResourceCalendarLeaves _instance
    void setInstance(ResourceCalendarLeaves instance) {
        _instance = instance
    }
    static ResourceCalendarLeaves getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResourceCalendarLeavesDTO create(ResourceCalendarLeavesDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResourceCalendarLeavesDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResourceCalendarLeavesDTO update(ResourceCalendarLeavesDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResourceCalendarLeavesDTO.class)
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
    ResourceCalendarLeavesDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResourceCalendarLeavesDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResourceCalendarLeavesDTO getDraft(ResourceCalendarLeavesDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResourceCalendarLeavesDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResourceCalendarLeavesDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResourceCalendarLeavesDTO save(ResourceCalendarLeavesDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResourceCalendarLeavesDTO.class)
    }

    /**
     * 行为：获取节假日 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ASYNCHOLIDAYS)
    def aSyncHolidays(ResourceCalendarLeavesDTO dto) throws Throwable {
        return this.execute(ACTION_ASYNCHOLIDAYS, dto, ResourceCalendarLeavesDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResourceCalendarLeavesDTO> fetchDefault(ResourceCalendarLeavesFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResourceCalendarLeavesDTO.class)
    }

    /**
     * 数据集：公共节假日 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PUBLIC)
    Page<ResourceCalendarLeavesDTO> fetchPublic(ResourceCalendarLeavesFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PUBLIC, context, ResourceCalendarLeavesDTO.class)
    }

}