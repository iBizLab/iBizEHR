package cn.ibizlab.baseextend.uniresgrouprel

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.baseextend.uniresgrouprel.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[UNIRES_GROUP_REL]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class UniresGroupRel extends GroovyDataEntityRuntime<UniresGroupRel,UniresGroupRelDTO,UniresGroupRelFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static UniresGroupRel _instance
    void setInstance(UniresGroupRel instance) {
        _instance = instance
    }
    static UniresGroupRel getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    UniresGroupRelDTO create(UniresGroupRelDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, UniresGroupRelDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    UniresGroupRelDTO update(UniresGroupRelDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, UniresGroupRelDTO.class)
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
    UniresGroupRelDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, UniresGroupRelDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    UniresGroupRelDTO getDraft(UniresGroupRelDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, UniresGroupRelDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(UniresGroupRelDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    UniresGroupRelDTO save(UniresGroupRelDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, UniresGroupRelDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<UniresGroupRelDTO> fetchDefault(UniresGroupRelFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, UniresGroupRelDTO.class)
    }

}