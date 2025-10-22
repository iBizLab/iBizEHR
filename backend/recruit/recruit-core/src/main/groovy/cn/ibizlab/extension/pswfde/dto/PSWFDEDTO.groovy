package cn.ibizlab.extension.pswfde.dto

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
class PSWFDEDTO extends GroovyDTO<PSWFDEDTO> {

    /**
     * 「工作流」
     */
    @JsonProperty("pswfid")
    String pSWFId
    /**
     * 「实体」
     */
    @JsonProperty("psdeid")
    String pSDEId
    /**
     * 「流程代码标识」
     */
    @JsonProperty("wfcodename")
    String wFCodeName
    /**
     * 「流程编辑视图」
     */
    @JsonProperty("editviewuri")
    String editviewuri
    /**
     * 「代码标识」
     */
    @JsonProperty("codename")
    String codeName
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
     * 「逻辑有效标志」
     */
    @JsonProperty("enable")
    Integer enable
    /**
     * 「实体」
     */
    @JsonProperty("psdename")
    String pSDEName
    /**
     * 「工作流实体标识」
     */
    @JsonProperty("pswfdeid")
    String pSWFDEId
    /**
     * 「工作流实体名称」
     */
    @JsonProperty("pswfdename")
    String pSWFDEName
    /**
     * 「工作流」
     */
    @JsonProperty("pswfname")
    String pSWFName
    /**
     * 「业务状态属性」
     */
    @JsonProperty("statepsdefid")
    String statePSDEFId
    /**
     * 「业务状态属性」
     */
    @JsonProperty("statepsdefname")
    String statePSDEFName
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
     * 「启用」
     * 字典[是否]
     */
    @JsonProperty("validflag")
    Integer validFlag

    /**
     * 设置「工作流」值
     * @param val
     */
    PSWFDEDTO setPSWFId(String pSWFId) {
        this.pSWFId = pSWFId
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSWFDEDTO setPSDEId(String pSDEId) {
        this.pSDEId = pSDEId
        return this
    }


    /**
     * 设置「流程代码标识」值
     * @param val
     */
    PSWFDEDTO setWFCodeName(String wFCodeName) {
        this.wFCodeName = wFCodeName
        return this
    }


    /**
     * 设置「流程编辑视图」值
     * @param val
     */
    PSWFDEDTO setEditviewuri(String editviewuri) {
        this.editviewuri = editviewuri
        return this
    }


    /**
     * 设置「代码标识」值
     * @param val
     */
    PSWFDEDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PSWFDEDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSWFDEDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「逻辑有效标志」值
     * @param val
     */
    PSWFDEDTO setEnable(Integer enable) {
        this.enable = enable
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSWFDEDTO setPSDEName(String pSDEName) {
        this.pSDEName = pSDEName
        return this
    }


    /**
     * 设置「工作流实体标识」值
     * @param val
     */
    PSWFDEDTO setPSWFDEId(String pSWFDEId) {
        this.pSWFDEId = pSWFDEId
        return this
    }


    /**
     * 设置「工作流实体名称」值
     * @param val
     */
    PSWFDEDTO setPSWFDEName(String pSWFDEName) {
        this.pSWFDEName = pSWFDEName
        return this
    }


    /**
     * 设置「工作流」值
     * @param val
     */
    PSWFDEDTO setPSWFName(String pSWFName) {
        this.pSWFName = pSWFName
        return this
    }


    /**
     * 设置「业务状态属性」值
     * @param val
     */
    PSWFDEDTO setStatePSDEFId(String statePSDEFId) {
        this.statePSDEFId = statePSDEFId
        return this
    }


    /**
     * 设置「业务状态属性」值
     * @param val
     */
    PSWFDEDTO setStatePSDEFName(String statePSDEFName) {
        this.statePSDEFName = statePSDEFName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PSWFDEDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSWFDEDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「启用」值
     * 字典[是否]
     * @param val
     */
    PSWFDEDTO setValidFlag(Integer validFlag) {
        this.validFlag = validFlag
        return this
    }

}
