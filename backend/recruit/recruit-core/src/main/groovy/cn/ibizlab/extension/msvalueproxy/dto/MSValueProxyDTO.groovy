package cn.ibizlab.extension.msvalueproxy.dto

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
class MSValueProxyDTO extends GroovyDTO<MSValueProxyDTO> {

    /**
     * 「颜色」
     */
    @JsonProperty("color")
    String color
    /**
     * 「背景颜色」
     */
    @JsonProperty("bkcolor")
    String bKColor
    /**
     * 「建立时间」
     */
    @JsonProperty("createdate")
    Timestamp createDate
    /**
     * 「建立人」
     * 字典[云系统操作者]
     */
    @JsonProperty("createman")
    String createMan
    /**
     * 「主状态值代理标识」
     */
    @JsonProperty("msvalueproxyid")
    String mSValueProxyId
    /**
     * 「主状态值代理名称」
     */
    @JsonProperty("msvalueproxyname")
    String mSValueProxyName
    /**
     * 「更新时间」
     */
    @JsonProperty("updatedate")
    Timestamp updateDate
    /**
     * 「更新人」
     * 字典[云系统操作者]
     */
    @JsonProperty("updateman")
    String updateMan

    /**
     * 设置「颜色」值
     * @param val
     */
    MSValueProxyDTO setColor(String color) {
        this.color = color
        return this
    }


    /**
     * 设置「背景颜色」值
     * @param val
     */
    MSValueProxyDTO setBKColor(String bKColor) {
        this.bKColor = bKColor
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    MSValueProxyDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    MSValueProxyDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「主状态值代理标识」值
     * @param val
     */
    MSValueProxyDTO setMSValueProxyId(String mSValueProxyId) {
        this.mSValueProxyId = mSValueProxyId
        return this
    }


    /**
     * 设置「主状态值代理名称」值
     * @param val
     */
    MSValueProxyDTO setMSValueProxyName(String mSValueProxyName) {
        this.mSValueProxyName = mSValueProxyName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    MSValueProxyDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    MSValueProxyDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }

}
