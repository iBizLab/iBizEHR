package cn.ibizlab.base.avatarmixin.dto

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
class AvatarMixinDTO extends GroovyDTO<AvatarMixinDTO> {

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
     * 「头像128」
     */
    @JsonProperty("avatar128")
    String avatar128
    /**
     * 「图片128」
     */
    @JsonProperty("image128")
    String image128
    /**
     * 「头像512」
     */
    @JsonProperty("avatar512")
    String avatar512
    /**
     * 「图片512」
     */
    @JsonProperty("image512")
    String image512
    /**
     * 「头像256」
     */
    @JsonProperty("avatar256")
    String avatar256
    /**
     * 「图片256」
     */
    @JsonProperty("image256")
    String image256
    /**
     * 「头像1024」
     */
    @JsonProperty("avatar1024")
    String avatar1024
    /**
     * 「图片1024」
     */
    @JsonProperty("image1024")
    String image1024
    /**
     * 「头像」
     */
    @JsonProperty("avatar")
    String avatar
    /**
     * 「头像」
     */
    @JsonProperty("image")
    String image

    /**
     * 设置「标识」值
     * @param val
     */
    AvatarMixinDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    AvatarMixinDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「头像128」值
     * @param val
     */
    AvatarMixinDTO setAvatar128(String avatar128) {
        this.avatar128 = avatar128
        return this
    }


    /**
     * 设置「图片128」值
     * @param val
     */
    AvatarMixinDTO setImage128(String image128) {
        this.image128 = image128
        return this
    }


    /**
     * 设置「头像512」值
     * @param val
     */
    AvatarMixinDTO setAvatar512(String avatar512) {
        this.avatar512 = avatar512
        return this
    }


    /**
     * 设置「图片512」值
     * @param val
     */
    AvatarMixinDTO setImage512(String image512) {
        this.image512 = image512
        return this
    }


    /**
     * 设置「头像256」值
     * @param val
     */
    AvatarMixinDTO setAvatar256(String avatar256) {
        this.avatar256 = avatar256
        return this
    }


    /**
     * 设置「图片256」值
     * @param val
     */
    AvatarMixinDTO setImage256(String image256) {
        this.image256 = image256
        return this
    }


    /**
     * 设置「头像1024」值
     * @param val
     */
    AvatarMixinDTO setAvatar1024(String avatar1024) {
        this.avatar1024 = avatar1024
        return this
    }


    /**
     * 设置「图片1024」值
     * @param val
     */
    AvatarMixinDTO setImage1024(String image1024) {
        this.image1024 = image1024
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    AvatarMixinDTO setAvatar(String avatar) {
        this.avatar = avatar
        return this
    }


    /**
     * 设置「头像」值
     * @param val
     */
    AvatarMixinDTO setImage(String image) {
        this.image = image
        return this
    }

}
