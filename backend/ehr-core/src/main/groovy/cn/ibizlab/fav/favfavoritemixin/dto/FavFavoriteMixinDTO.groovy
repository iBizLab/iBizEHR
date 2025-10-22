package cn.ibizlab.fav.favfavoritemixin.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class FavFavoriteMixinDTO extends GroovyDTO<FavFavoriteMixinDTO> {

    /**
     * 「收藏计数」
     */
    @JsonProperty("favorite_count")
    Integer favoriteCount
    /**
     * 「收藏」
     * 字典[是否]
     */
    @JsonProperty("is_favorite")
    Integer isFavorite
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name

    /**
     * 设置「收藏计数」值
     * @param val
     */
    FavFavoriteMixinDTO setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount
        return this
    }


    /**
     * 设置「收藏」值
     * 字典[是否]
     * @param val
     */
    FavFavoriteMixinDTO setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    FavFavoriteMixinDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    FavFavoriteMixinDTO setName(String name) {
        this.name = name
        return this
    }

}
