package cn.ibizlab.extension.msvalueproxy

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.msvalueproxy.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MSVALUEPROXY]运行时对象
 * 此代码用户功能扩展代码
 *
 * 该实体存在实体映射或者自定义动态扩展对象，开启RTCode模式会导致映射功能失效
 */
class MSValueProxy extends GroovyDataEntityRuntime<MSValueProxy,MSValueProxyDTO,MSValueProxyFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MSValueProxy _instance
    void setInstance(MSValueProxy instance) {
        _instance = instance
    }
    static MSValueProxy getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CREATE)
    MSValueProxyDTO create(MSValueProxyDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MSValueProxyDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_UPDATE)
    MSValueProxyDTO update(MSValueProxyDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MSValueProxyDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    //@DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    //@DEAction(ACTION_GET)
    MSValueProxyDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MSValueProxyDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_GETDRAFT)
    MSValueProxyDTO getDraft(MSValueProxyDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MSValueProxyDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_CHECKKEY)
    int checkKey(MSValueProxyDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEAction(ACTION_SAVE)
    MSValueProxyDTO save(MSValueProxyDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MSValueProxyDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    //@DEDataSet(DATASET_DEFAULT)
    Page<MSValueProxyDTO> fetchDefault(MSValueProxyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MSValueProxyDTO.class)
    }

}