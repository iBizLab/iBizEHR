package cn.ibizlab.resource.resourcecalendarattendance

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.resource.resourcecalendarattendance.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RESOURCE_CALENDAR_ATTENDANCE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResourceCalendarAttendance extends GroovyDataEntityRuntime<ResourceCalendarAttendance,ResourceCalendarAttendanceDTO,ResourceCalendarAttendanceFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ResourceCalendarAttendance _instance
    void setInstance(ResourceCalendarAttendance instance) {
        _instance = instance
    }
    static ResourceCalendarAttendance getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResourceCalendarAttendanceDTO create(ResourceCalendarAttendanceDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResourceCalendarAttendanceDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResourceCalendarAttendanceDTO update(ResourceCalendarAttendanceDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResourceCalendarAttendanceDTO.class)
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
    ResourceCalendarAttendanceDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResourceCalendarAttendanceDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResourceCalendarAttendanceDTO getDraft(ResourceCalendarAttendanceDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResourceCalendarAttendanceDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResourceCalendarAttendanceDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResourceCalendarAttendanceDTO save(ResourceCalendarAttendanceDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResourceCalendarAttendanceDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResourceCalendarAttendanceDTO> fetchDefault(ResourceCalendarAttendanceFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResourceCalendarAttendanceDTO.class)
    }

}