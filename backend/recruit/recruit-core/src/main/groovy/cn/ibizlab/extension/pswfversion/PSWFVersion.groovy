package cn.ibizlab.extension.pswfversion

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.pswfversion.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSWFVERSION]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSWFVersion extends GroovyPSModelDERuntime<PSWFVersion,PSWFVersionDTO,PSWFVersionFilterDTO> {

    public static final String ACTION_APPLY = "APPLY"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSWFVersion _instance
    void setInstance(PSWFVersion instance) {
        _instance = instance
    }
    static PSWFVersion getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSWFVersionDTO create(PSWFVersionDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSWFVersionDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSWFVersionDTO update(PSWFVersionDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSWFVersionDTO.class)
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
    PSWFVersionDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSWFVersionDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSWFVersionDTO getDraft(PSWFVersionDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSWFVersionDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSWFVersionDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSWFVersionDTO save(PSWFVersionDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSWFVersionDTO.class)
    }

    /**
     * 行为：应用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_APPLY)
    def apply(PSWFVersionDTO dto) throws Throwable {
        this.execute(ACTION_APPLY, dto, PSWFVersionDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSWFVersionDTO> fetchDefault(PSWFVersionFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSWFVersionDTO.class)
    }

}