package cn.ibizlab.fav.favfavoritemixin

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.fav.favfavoritemixin.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[FAV_FAVORITE_MIXIN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class FavFavoriteMixin extends GroovyDataEntityRuntime<FavFavoriteMixin,FavFavoriteMixinDTO,FavFavoriteMixinFilterDTO> {

    public static final String ACTION_ADD_FAVORITE = "add_favorite"
    public static final String ACTION_REMOVE_ALL_FAVORITES = "remove_all_favorites"
    public static final String ACTION_REMOVE_FAVORITE = "remove_favorite"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static FavFavoriteMixin _instance
    void setInstance(FavFavoriteMixin instance) {
        _instance = instance
    }
    static FavFavoriteMixin getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    FavFavoriteMixinDTO create(FavFavoriteMixinDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, FavFavoriteMixinDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    FavFavoriteMixinDTO update(FavFavoriteMixinDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, FavFavoriteMixinDTO.class)
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
    FavFavoriteMixinDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, FavFavoriteMixinDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    FavFavoriteMixinDTO getDraft(FavFavoriteMixinDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, FavFavoriteMixinDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(FavFavoriteMixinDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    FavFavoriteMixinDTO save(FavFavoriteMixinDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, FavFavoriteMixinDTO.class)
    }

    /**
     * 行为：添加收藏 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_FAVORITE)
    def addFavorite(FavFavoriteMixinDTO dto) throws Throwable {
        this.execute(ACTION_ADD_FAVORITE, dto, FavFavoriteMixinDTO.class)
    }

    /**
     * 行为：移除所有收藏 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE_ALL_FAVORITES)
    def removeAllFavorites(FavFavoriteMixinDTO dto) throws Throwable {
        this.execute(ACTION_REMOVE_ALL_FAVORITES, dto, FavFavoriteMixinDTO.class)
    }

    /**
     * 行为：移除收藏 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE_FAVORITE)
    def removeFavorite(FavFavoriteMixinDTO dto) throws Throwable {
        this.execute(ACTION_REMOVE_FAVORITE, dto, FavFavoriteMixinDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<FavFavoriteMixinDTO> fetchDefault(FavFavoriteMixinFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, FavFavoriteMixinDTO.class)
    }

}