package cn.ibizlab.hr.hrideajob

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hrideajob.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_IDEA_JOB]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrIdeaJob extends GroovyDataEntityRuntime<HrIdeaJob,HrIdeaJobDTO,HrIdeaJobFilterDTO> {

    public static final String ACTION_GET_JOIN_IDEA_JOB = "get_join_idea_job"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static HrIdeaJob _instance
    void setInstance(HrIdeaJob instance) {
        _instance = instance
    }
    static HrIdeaJob getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrIdeaJobDTO create(HrIdeaJobDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrIdeaJobDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrIdeaJobDTO update(HrIdeaJobDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrIdeaJobDTO.class)
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
    HrIdeaJobDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrIdeaJobDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrIdeaJobDTO getDraft(HrIdeaJobDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrIdeaJobDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrIdeaJobDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrIdeaJobDTO save(HrIdeaJobDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrIdeaJobDTO.class)
    }

    /**
     * 行为：获取关联职位 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET_JOIN_IDEA_JOB)
    def getJoinIdeaJob(String key) throws Throwable {
        return this.execute(ACTION_GET_JOIN_IDEA_JOB, key, HrIdeaJobDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrIdeaJobDTO> fetchDefault(HrIdeaJobFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrIdeaJobDTO.class)
    }

}