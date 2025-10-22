package cn.ibizlab.extension.pssysbicubedimension.dto

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
class PSSysBICubeDimensionDTO extends GroovyDTO<PSSysBICubeDimensionDTO> {

    /**
     * 「扩展模型」
     * 字典[是否]
     */
    @JsonProperty("dynamodelflag")
    Integer dynaModelFlag
    /**
     * 「维度类型」
     * 字典[多维分析维度类别]
     */
    @JsonProperty("bidimensiontype")
    String bIDimensionType
    /**
     * 「代码名称」
     */
    @JsonProperty("codename")
    String codeName
    /**
     * 「维度公式」
     */
    @JsonProperty("dimensionformula")
    String dimensionFormula
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「代码表」
     */
    @JsonProperty("pscodelistid")
    String pSCodeListId
    /**
     * 「代码表」
     */
    @JsonProperty("pscodelistname")
    String pSCodeListName
    /**
     * 「立方体维度标识」
     */
    @JsonProperty("pssysbicubedimensionid")
    String pSSysBICubeDimensionId
    /**
     * 「立方体维度名称」
     */
    @JsonProperty("pssysbicubedimensionname")
    String pSSysBICubeDimensionName
    /**
     * 「智能报表立方体」
     */
    @JsonProperty("pssysbicubeid")
    String pSSysBICubeId
    /**
     * 「智能报表立方体」
     */
    @JsonProperty("pssysbicubename")
    String pSSysBICubeName
    /**
     * 「PSSYSBISCHEMEID」
     */
    @JsonProperty("pssysbischemeid")
    String pSSysBISchemeId
    /**
     * 「启用」
     * 字典[是否]
     */
    @JsonProperty("validflag")
    Integer validFlag

    /**
     * 设置「扩展模型」值
     * 字典[是否]
     * @param val
     */
    PSSysBICubeDimensionDTO setDynaModelFlag(Integer dynaModelFlag) {
        this.dynaModelFlag = dynaModelFlag
        return this
    }


    /**
     * 设置「维度类型」值
     * 字典[多维分析维度类别]
     * @param val
     */
    PSSysBICubeDimensionDTO setBIDimensionType(String bIDimensionType) {
        this.bIDimensionType = bIDimensionType
        return this
    }


    /**
     * 设置「代码名称」值
     * @param val
     */
    PSSysBICubeDimensionDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「维度公式」值
     * @param val
     */
    PSSysBICubeDimensionDTO setDimensionFormula(String dimensionFormula) {
        this.dimensionFormula = dimensionFormula
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    PSSysBICubeDimensionDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「代码表」值
     * @param val
     */
    PSSysBICubeDimensionDTO setPSCodeListId(String pSCodeListId) {
        this.pSCodeListId = pSCodeListId
        return this
    }


    /**
     * 设置「代码表」值
     * @param val
     */
    PSSysBICubeDimensionDTO setPSCodeListName(String pSCodeListName) {
        this.pSCodeListName = pSCodeListName
        return this
    }


    /**
     * 设置「立方体维度标识」值
     * @param val
     */
    PSSysBICubeDimensionDTO setPSSysBICubeDimensionId(String pSSysBICubeDimensionId) {
        this.pSSysBICubeDimensionId = pSSysBICubeDimensionId
        return this
    }


    /**
     * 设置「立方体维度名称」值
     * @param val
     */
    PSSysBICubeDimensionDTO setPSSysBICubeDimensionName(String pSSysBICubeDimensionName) {
        this.pSSysBICubeDimensionName = pSSysBICubeDimensionName
        return this
    }


    /**
     * 设置「智能报表立方体」值
     * @param val
     */
    PSSysBICubeDimensionDTO setPSSysBICubeId(String pSSysBICubeId) {
        this.pSSysBICubeId = pSSysBICubeId
        return this
    }


    /**
     * 设置「智能报表立方体」值
     * @param val
     */
    PSSysBICubeDimensionDTO setPSSysBICubeName(String pSSysBICubeName) {
        this.pSSysBICubeName = pSSysBICubeName
        return this
    }


    /**
     * 设置「PSSYSBISCHEMEID」值
     * @param val
     */
    PSSysBICubeDimensionDTO setPSSysBISchemeId(String pSSysBISchemeId) {
        this.pSSysBISchemeId = pSSysBISchemeId
        return this
    }


    /**
     * 设置「启用」值
     * 字典[是否]
     * @param val
     */
    PSSysBICubeDimensionDTO setValidFlag(Integer validFlag) {
        this.validFlag = validFlag
        return this
    }

}
