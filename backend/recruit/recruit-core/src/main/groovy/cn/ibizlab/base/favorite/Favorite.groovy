package cn.ibizlab.base.favorite

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.favorite.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[FAVORITE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Favorite extends GroovyDataEntityRuntime<Favorite,FavoriteDTO,FavoriteFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Favorite _instance
    void setInstance(Favorite instance) {
        _instance = instance
    }
    static Favorite getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    FavoriteDTO create(FavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, FavoriteDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    FavoriteDTO update(FavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, FavoriteDTO.class)
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
    FavoriteDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, FavoriteDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    FavoriteDTO getDraft(FavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, FavoriteDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(FavoriteDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    FavoriteDTO save(FavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, FavoriteDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<FavoriteDTO> fetchDefault(FavoriteFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, FavoriteDTO.class)
    }

}