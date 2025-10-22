package cn.ibizlab.resource.resourcecalendar

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.resource.resourcecalendar.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RESOURCE_CALENDAR]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResourceCalendar extends GroovyDataEntityRuntime<ResourceCalendar,ResourceCalendarDTO,ResourceCalendarFilterDTO> {

    public static final String ACTION_FILL_DATA = "fill_data"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ResourceCalendar _instance
    void setInstance(ResourceCalendar instance) {
        _instance = instance
    }
    static ResourceCalendar getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResourceCalendarDTO create(ResourceCalendarDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResourceCalendarDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResourceCalendarDTO update(ResourceCalendarDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResourceCalendarDTO.class)
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
    ResourceCalendarDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResourceCalendarDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResourceCalendarDTO getDraft(ResourceCalendarDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResourceCalendarDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResourceCalendarDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResourceCalendarDTO save(ResourceCalendarDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResourceCalendarDTO.class)
    }

    /**
     * 行为：填充资源工作时间数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_FILL_DATA)
    def fillData(ResourceCalendarDTO dto) throws Throwable {
        this.execute(ACTION_FILL_DATA, dto, ResourceCalendarDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResourceCalendarDTO> fetchDefault(ResourceCalendarFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResourceCalendarDTO.class)
    }

}