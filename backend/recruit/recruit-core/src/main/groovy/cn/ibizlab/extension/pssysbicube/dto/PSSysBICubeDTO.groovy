package cn.ibizlab.extension.pssysbicube.dto

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
class PSSysBICubeDTO extends GroovyDTO<PSSysBICubeDTO> {

    /**
     * 「立方体标记」
     */
    @JsonProperty("bicubetag")
    String bICubeTag
    /**
     * 「立方体标记2」
     */
    @JsonProperty("bicubetag2")
    String bICubeTag2
    /**
     * 「代码名称」
     */
    @JsonProperty("codename")
    String codeName
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「立方体实体」
     */
    @JsonProperty("psdeid")
    String pSDEId
    /**
     * 「立方体实体」
     */
    @JsonProperty("psdename")
    String pSDEName
    /**
     * 「智能报表立方体标识」
     */
    @JsonProperty("pssysbicubeid")
    String pSSysBICubeId
    /**
     * 「立方体名称」
     */
    @JsonProperty("pssysbicubename")
    String pSSysBICubeName
    /**
     * 「智能报表体系」
     */
    @JsonProperty("pssysbischemeid")
    String pSSysBISchemeId
    /**
     * 「智能报表体系」
     */
    @JsonProperty("pssysbischemename")
    String pSSysBISchemeName
    /**
     * 「启用」
     * 字典[是否]
     */
    @JsonProperty("validflag")
    Integer validFlag

    /**
     * 设置「立方体标记」值
     * @param val
     */
    PSSysBICubeDTO setBICubeTag(String bICubeTag) {
        this.bICubeTag = bICubeTag
        return this
    }


    /**
     * 设置「立方体标记2」值
     * @param val
     */
    PSSysBICubeDTO setBICubeTag2(String bICubeTag2) {
        this.bICubeTag2 = bICubeTag2
        return this
    }


    /**
     * 设置「代码名称」值
     * @param val
     */
    PSSysBICubeDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    PSSysBICubeDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「立方体实体」值
     * @param val
     */
    PSSysBICubeDTO setPSDEId(String pSDEId) {
        this.pSDEId = pSDEId
        return this
    }


    /**
     * 设置「立方体实体」值
     * @param val
     */
    PSSysBICubeDTO setPSDEName(String pSDEName) {
        this.pSDEName = pSDEName
        return this
    }


    /**
     * 设置「智能报表立方体标识」值
     * @param val
     */
    PSSysBICubeDTO setPSSysBICubeId(String pSSysBICubeId) {
        this.pSSysBICubeId = pSSysBICubeId
        return this
    }


    /**
     * 设置「立方体名称」值
     * @param val
     */
    PSSysBICubeDTO setPSSysBICubeName(String pSSysBICubeName) {
        this.pSSysBICubeName = pSSysBICubeName
        return this
    }


    /**
     * 设置「智能报表体系」值
     * @param val
     */
    PSSysBICubeDTO setPSSysBISchemeId(String pSSysBISchemeId) {
        this.pSSysBISchemeId = pSSysBISchemeId
        return this
    }


    /**
     * 设置「智能报表体系」值
     * @param val
     */
    PSSysBICubeDTO setPSSysBISchemeName(String pSSysBISchemeName) {
        this.pSSysBISchemeName = pSSysBISchemeName
        return this
    }


    /**
     * 设置「启用」值
     * 字典[是否]
     * @param val
     */
    PSSysBICubeDTO setValidFlag(Integer validFlag) {
        this.validFlag = validFlag
        return this
    }

}
