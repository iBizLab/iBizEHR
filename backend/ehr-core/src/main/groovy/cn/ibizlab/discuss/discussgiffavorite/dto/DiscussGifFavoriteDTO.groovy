package cn.ibizlab.discuss.discussgiffavorite.dto

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
class DiscussGifFavoriteDTO extends GroovyDTO<DiscussGifFavoriteDTO> {

    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「建立人」
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「显示名称」
     */
    @JsonProperty("display_name")
    String displayName
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「来自 Tenor 的 GIF ID」
     */
    @JsonProperty("tenor_gif_id")
    String tenorGifId
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「更新人」
     */
    @JsonProperty("write_uid")
    String writeUid

    /**
     * 设置「建立时间」值
     * @param val
     */
    DiscussGifFavoriteDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    DiscussGifFavoriteDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「显示名称」值
     * @param val
     */
    DiscussGifFavoriteDTO setDisplayName(String displayName) {
        this.displayName = displayName
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    DiscussGifFavoriteDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「来自 Tenor 的 GIF ID」值
     * @param val
     */
    DiscussGifFavoriteDTO setTenorGifId(String tenorGifId) {
        this.tenorGifId = tenorGifId
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    DiscussGifFavoriteDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    DiscussGifFavoriteDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
