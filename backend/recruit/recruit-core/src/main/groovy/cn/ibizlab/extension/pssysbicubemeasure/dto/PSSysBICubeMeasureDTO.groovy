package cn.ibizlab.extension.pssysbicubemeasure.dto

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
class PSSysBICubeMeasureDTO extends GroovyDTO<PSSysBICubeMeasureDTO> {

    /**
     * 「扩展模型」
     * 字典[是否]
     */
    @JsonProperty("dynamodelflag")
    Integer dynaModelFlag
    /**
     * 「指标类型」
     * 字典[多维分析指标类别]
     */
    @JsonProperty("bimeasuretype")
    String bIMeasureType
    /**
     * 「代码名称」
     */
    @JsonProperty("codename")
    String codeName
    /**
     * 「指标公式」
     */
    @JsonProperty("measureformula")
    String measureFormula
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「排序值」
     */
    @JsonProperty("ordervalue")
    Integer orderValue
    /**
     * 「智能报表立方体」
     */
    @JsonProperty("pssysbicubeid")
    String pSSysBICubeId
    /**
     * 「智能报表指标标识」
     */
    @JsonProperty("pssysbicubemeasureid")
    String pSSysBICubeMeasureId
    /**
     * 「立方体指标名称」
     */
    @JsonProperty("pssysbicubemeasurename")
    String pSSysBICubeMeasureName
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
    PSSysBICubeMeasureDTO setDynaModelFlag(Integer dynaModelFlag) {
        this.dynaModelFlag = dynaModelFlag
        return this
    }


    /**
     * 设置「指标类型」值
     * 字典[多维分析指标类别]
     * @param val
     */
    PSSysBICubeMeasureDTO setBIMeasureType(String bIMeasureType) {
        this.bIMeasureType = bIMeasureType
        return this
    }


    /**
     * 设置「代码名称」值
     * @param val
     */
    PSSysBICubeMeasureDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「指标公式」值
     * @param val
     */
    PSSysBICubeMeasureDTO setMeasureFormula(String measureFormula) {
        this.measureFormula = measureFormula
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    PSSysBICubeMeasureDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「排序值」值
     * @param val
     */
    PSSysBICubeMeasureDTO setOrderValue(Integer orderValue) {
        this.orderValue = orderValue
        return this
    }


    /**
     * 设置「智能报表立方体」值
     * @param val
     */
    PSSysBICubeMeasureDTO setPSSysBICubeId(String pSSysBICubeId) {
        this.pSSysBICubeId = pSSysBICubeId
        return this
    }


    /**
     * 设置「智能报表指标标识」值
     * @param val
     */
    PSSysBICubeMeasureDTO setPSSysBICubeMeasureId(String pSSysBICubeMeasureId) {
        this.pSSysBICubeMeasureId = pSSysBICubeMeasureId
        return this
    }


    /**
     * 设置「立方体指标名称」值
     * @param val
     */
    PSSysBICubeMeasureDTO setPSSysBICubeMeasureName(String pSSysBICubeMeasureName) {
        this.pSSysBICubeMeasureName = pSSysBICubeMeasureName
        return this
    }


    /**
     * 设置「智能报表立方体」值
     * @param val
     */
    PSSysBICubeMeasureDTO setPSSysBICubeName(String pSSysBICubeName) {
        this.pSSysBICubeName = pSSysBICubeName
        return this
    }


    /**
     * 设置「PSSYSBISCHEMEID」值
     * @param val
     */
    PSSysBICubeMeasureDTO setPSSysBISchemeId(String pSSysBISchemeId) {
        this.pSSysBISchemeId = pSSysBISchemeId
        return this
    }


    /**
     * 设置「启用」值
     * 字典[是否]
     * @param val
     */
    PSSysBICubeMeasureDTO setValidFlag(Integer validFlag) {
        this.validFlag = validFlag
        return this
    }

}
