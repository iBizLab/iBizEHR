package cn.ibizlab.base.executor

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.executor.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[EXECUTOR]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Executor extends GroovyDataEntityRuntime<Executor,ExecutorDTO,ExecutorFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Executor _instance
    void setInstance(Executor instance) {
        _instance = instance
    }
    static Executor getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ExecutorDTO create(ExecutorDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ExecutorDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ExecutorDTO update(ExecutorDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ExecutorDTO.class)
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
    ExecutorDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ExecutorDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ExecutorDTO getDraft(ExecutorDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ExecutorDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ExecutorDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ExecutorDTO save(ExecutorDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ExecutorDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ExecutorDTO> fetchDefault(ExecutorFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ExecutorDTO.class)
    }

}