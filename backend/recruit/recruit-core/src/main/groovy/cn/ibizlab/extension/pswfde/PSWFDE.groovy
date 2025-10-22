package cn.ibizlab.extension.pswfde

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.pswfde.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSWFDE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSWFDE extends GroovyPSModelDERuntime<PSWFDE,PSWFDEDTO,PSWFDEFilterDTO> {

    public static final String ACTION_APPLY = "APPLY"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSWFDE _instance
    void setInstance(PSWFDE instance) {
        _instance = instance
    }
    static PSWFDE getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSWFDEDTO create(PSWFDEDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSWFDEDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSWFDEDTO update(PSWFDEDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSWFDEDTO.class)
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
    PSWFDEDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSWFDEDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSWFDEDTO getDraft(PSWFDEDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSWFDEDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSWFDEDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSWFDEDTO save(PSWFDEDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSWFDEDTO.class)
    }

    /**
     * 行为：应用 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_APPLY)
    def apply(PSWFDEDTO dto) throws Throwable {
        this.execute(ACTION_APPLY, dto, PSWFDEDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSWFDEDTO> fetchDefault(PSWFDEFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSWFDEDTO.class)
    }

}