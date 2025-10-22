package cn.ibizlab.fav.favfavorite.dto

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
class FavFavoriteDTO extends GroovyDTO<FavFavoriteDTO> {

    /**
     * 「收藏者」
     */
    @JsonProperty("partner_id")
    String partnerId
    /**
     * 「资源标识」
     */
    @JsonProperty("res_id")
    String resId
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
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
     * 「资源模型」
     */
    @JsonProperty("res_model")
    String resModel

    /**
     * 设置「收藏者」值
     * @param val
     */
    FavFavoriteDTO setPartnerId(String partnerId) {
        this.partnerId = partnerId
        return this
    }


    /**
     * 设置「资源标识」值
     * @param val
     */
    FavFavoriteDTO setResId(String resId) {
        this.resId = resId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    FavFavoriteDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    FavFavoriteDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    FavFavoriteDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    FavFavoriteDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「资源模型」值
     * @param val
     */
    FavFavoriteDTO setResModel(String resModel) {
        this.resModel = resModel
        return this
    }

}
