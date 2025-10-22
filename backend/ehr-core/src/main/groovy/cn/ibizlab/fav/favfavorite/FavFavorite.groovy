package cn.ibizlab.fav.favfavorite

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.fav.favfavorite.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[FAV_FAVORITE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class FavFavorite extends GroovyDataEntityRuntime<FavFavorite,FavFavoriteDTO,FavFavoriteFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static FavFavorite _instance
    void setInstance(FavFavorite instance) {
        _instance = instance
    }
    static FavFavorite getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    FavFavoriteDTO create(FavFavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, FavFavoriteDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    FavFavoriteDTO update(FavFavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, FavFavoriteDTO.class)
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
    FavFavoriteDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, FavFavoriteDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    FavFavoriteDTO getDraft(FavFavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, FavFavoriteDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(FavFavoriteDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    FavFavoriteDTO save(FavFavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, FavFavoriteDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<FavFavoriteDTO> fetchDefault(FavFavoriteFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, FavFavoriteDTO.class)
    }

}