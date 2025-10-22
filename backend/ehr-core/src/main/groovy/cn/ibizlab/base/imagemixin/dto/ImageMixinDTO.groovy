package cn.ibizlab.base.imagemixin.dto

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
class ImageMixinDTO extends GroovyDTO<ImageMixinDTO> {

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
     * 「图片128」
     */
    @JsonProperty("image128")
    String image128
    /**
     * 「图片512」
     */
    @JsonProperty("image512")
    String image512
    /**
     * 「图片256」
     */
    @JsonProperty("image256")
    String image256
    /**
     * 「图片1024」
     */
    @JsonProperty("image1024")
    String image1024
    /**
     * 「图片」
     */
    @JsonProperty("image")
    String image

    /**
     * 设置「标识」值
     * @param val
     */
    ImageMixinDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    ImageMixinDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「图片128」值
     * @param val
     */
    ImageMixinDTO setImage128(String image128) {
        this.image128 = image128
        return this
    }


    /**
     * 设置「图片512」值
     * @param val
     */
    ImageMixinDTO setImage512(String image512) {
        this.image512 = image512
        return this
    }


    /**
     * 设置「图片256」值
     * @param val
     */
    ImageMixinDTO setImage256(String image256) {
        this.image256 = image256
        return this
    }


    /**
     * 设置「图片1024」值
     * @param val
     */
    ImageMixinDTO setImage1024(String image1024) {
        this.image1024 = image1024
        return this
    }


    /**
     * 设置「图片」值
     * @param val
     */
    ImageMixinDTO setImage(String image) {
        this.image = image
        return this
    }

}
