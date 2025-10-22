package cn.ibizlab.hr.hridea

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hridea.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_IDEA]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrIdea extends GroovyDataEntityRuntime<HrIdea,HrIdeaDTO,HrIdeaFilterDTO> {

    public static final String ACTION_IDEA_STATUS_COUNT = "idea_status_count"
    public static final String DATASET_CANCELED = "Canceled"
    public static final String DATASET_COMPLETED = "Completed"
    public static final String DATASET_NOTSTARTED = "notstarted"
    public static final String DATASET_STARTED = "started"
    public static final String DATASET_DRAFT = "Draft"
    public static final String DATASET_PAUSED = "Paused"
    public static final String DATASET_OVERDUE = "Overdue"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrIdea _instance
    void setInstance(HrIdea instance) {
        _instance = instance
    }
    static HrIdea getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrIdeaDTO create(HrIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrIdeaDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrIdeaDTO update(HrIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrIdeaDTO.class)
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
    HrIdeaDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrIdeaDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrIdeaDTO getDraft(HrIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrIdeaDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrIdeaDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrIdeaDTO save(HrIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrIdeaDTO.class)
    }

    /**
     * 行为：需求计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_IDEA_STATUS_COUNT)
    def ideaStatusCount(HrIdeaDTO dto) throws Throwable {
        return this.execute(ACTION_IDEA_STATUS_COUNT, dto, HrIdeaDTO.class)
    }

    /**
     * 数据集：招聘_已取消 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CANCELED)
    Page<HrIdeaDTO> fetchCanceled(HrIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CANCELED, context, HrIdeaDTO.class)
    }

    /**
     * 数据集：招聘_已完成 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMPLETED)
    Page<HrIdeaDTO> fetchCompleted(HrIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMPLETED, context, HrIdeaDTO.class)
    }

    /**
     * 数据集：招聘_未进行 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_NOTSTARTED)
    Page<HrIdeaDTO> fetchDataSet2(HrIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_NOTSTARTED, context, HrIdeaDTO.class)
    }

    /**
     * 数据集：招聘_进行中 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_STARTED)
    Page<HrIdeaDTO> fetchDataSet3(HrIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_STARTED, context, HrIdeaDTO.class)
    }

    /**
     * 数据集：招聘_草稿 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DRAFT)
    Page<HrIdeaDTO> fetchDataSet4(HrIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DRAFT, context, HrIdeaDTO.class)
    }

    /**
     * 数据集：招聘_暂停 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PAUSED)
    Page<HrIdeaDTO> fetchDataSet5(HrIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PAUSED, context, HrIdeaDTO.class)
    }

    /**
     * 数据集：招聘_已超期 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_OVERDUE)
    Page<HrIdeaDTO> fetchDataSet6(HrIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_OVERDUE, context, HrIdeaDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrIdeaDTO> fetchDefault(HrIdeaFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrIdeaDTO.class)
    }

}