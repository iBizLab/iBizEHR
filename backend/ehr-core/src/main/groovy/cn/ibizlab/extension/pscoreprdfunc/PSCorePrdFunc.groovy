package cn.ibizlab.extension.pscoreprdfunc

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.extension.pscoreprdfunc.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[PSCOREPRDFUNC]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class PSCorePrdFunc extends GroovyPSModelDERuntime<PSCorePrdFunc,PSCorePrdFuncDTO,PSCorePrdFuncFilterDTO> {

    public static final String ACTION_INSTALL = "INSTALL"
    public static final String ACTION_RELOAD = "RELOAD"
    public static final String ACTION_UNINSTALL = "UNINSTALL"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static PSCorePrdFunc _instance
    void setInstance(PSCorePrdFunc instance) {
        _instance = instance
    }
    static PSCorePrdFunc getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    PSCorePrdFuncDTO create(PSCorePrdFuncDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, PSCorePrdFuncDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    PSCorePrdFuncDTO update(PSCorePrdFuncDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, PSCorePrdFuncDTO.class)
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
    PSCorePrdFuncDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, PSCorePrdFuncDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    PSCorePrdFuncDTO getDraft(PSCorePrdFuncDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, PSCorePrdFuncDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(PSCorePrdFuncDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    PSCorePrdFuncDTO save(PSCorePrdFuncDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, PSCorePrdFuncDTO.class)
    }

    /**
     * 行为：安装 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_INSTALL)
    def install(PSCorePrdFuncDTO dto) throws Throwable {
        this.execute(ACTION_INSTALL, dto, PSCorePrdFuncDTO.class)
    }

    /**
     * 行为：重新加载 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_RELOAD)
    def reload(PSCorePrdFuncDTO dto) throws Throwable {
        this.execute(ACTION_RELOAD, dto, PSCorePrdFuncDTO.class)
    }

    /**
     * 行为：卸载 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UNINSTALL)
    def uninstall(PSCorePrdFuncDTO dto) throws Throwable {
        this.execute(ACTION_UNINSTALL, dto, PSCorePrdFuncDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<PSCorePrdFuncDTO> fetchDefault(PSCorePrdFuncFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, PSCorePrdFuncDTO.class)
    }

}