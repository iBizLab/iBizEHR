package cn.ibizlab.discuss.discussgiffavorite

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.discuss.discussgiffavorite.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[DISCUSS_GIF_FAVORITE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class DiscussGifFavorite extends GroovyDataEntityRuntime<DiscussGifFavorite,DiscussGifFavoriteDTO,DiscussGifFavoriteFilterDTO> {

    private static DiscussGifFavorite _instance
    void setInstance(DiscussGifFavorite instance) {
        _instance = instance
    }
    static DiscussGifFavorite getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    DiscussGifFavoriteDTO create(DiscussGifFavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, DiscussGifFavoriteDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    DiscussGifFavoriteDTO update(DiscussGifFavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, DiscussGifFavoriteDTO.class)
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
    DiscussGifFavoriteDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, DiscussGifFavoriteDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    DiscussGifFavoriteDTO getDraft(DiscussGifFavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, DiscussGifFavoriteDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(DiscussGifFavoriteDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    DiscussGifFavoriteDTO save(DiscussGifFavoriteDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, DiscussGifFavoriteDTO.class)
    }

}