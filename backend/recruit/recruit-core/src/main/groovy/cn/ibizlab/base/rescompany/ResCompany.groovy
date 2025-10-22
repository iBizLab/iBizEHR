package cn.ibizlab.base.rescompany

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.rescompany.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_COMPANY]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResCompany extends GroovyDataEntityRuntime<ResCompany,ResCompanyDTO,ResCompanyFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ResCompany _instance
    void setInstance(ResCompany instance) {
        _instance = instance
    }
    static ResCompany getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResCompanyDTO create(ResCompanyDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResCompanyDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResCompanyDTO update(ResCompanyDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResCompanyDTO.class)
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
    ResCompanyDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResCompanyDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResCompanyDTO getDraft(ResCompanyDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResCompanyDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResCompanyDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResCompanyDTO save(ResCompanyDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResCompanyDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResCompanyDTO> fetchDefault(ResCompanyFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResCompanyDTO.class)
    }

}