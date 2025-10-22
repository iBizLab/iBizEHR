package cn.ibizlab.base.resgroups

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.resgroups.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_GROUPS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResGroups extends GroovyDataEntityRuntime<ResGroups,ResGroupsDTO,ResGroupsFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_CUR_USER_REF = "cur_user_ref"
    public static final String DATASET_PSMODEL_SYNC = "psmodel_sync"
    public static final String DATASET_USER_REF = "user_ref"
    public static final String DATASET_WITH_NESTED = "with_nested"
    private static ResGroups _instance
    void setInstance(ResGroups instance) {
        _instance = instance
    }
    static ResGroups getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResGroupsDTO create(ResGroupsDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResGroupsDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResGroupsDTO update(ResGroupsDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResGroupsDTO.class)
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
    ResGroupsDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResGroupsDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResGroupsDTO getDraft(ResGroupsDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResGroupsDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResGroupsDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResGroupsDTO save(ResGroupsDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResGroupsDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResGroupsDTO> fetchDefault(ResGroupsFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResGroupsDTO.class)
    }

    /**
     * 数据集：当前用户权限组 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_USER_REF)
    Page<ResGroupsDTO> fetchCurUserRef(ResGroupsFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER_REF, context, ResGroupsDTO.class)
    }

    /**
     * 数据集：模型同步数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PSMODEL_SYNC)
    Page<ResGroupsDTO> fetchPsmodelSync(ResGroupsFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PSMODEL_SYNC, context, ResGroupsDTO.class)
    }

    /**
     * 数据集：用户归属组 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_USER_REF)
    Page<ResGroupsDTO> fetchUserRef(ResGroupsFilterDTO context) throws Throwable {
        return this.fetch(DATASET_USER_REF, context, ResGroupsDTO.class)
    }

    /**
     * 数据集：包含嵌套数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WITH_NESTED)
    Page<ResGroupsDTO> fetchWithNested(ResGroupsFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WITH_NESTED, context, ResGroupsDTO.class)
    }

}