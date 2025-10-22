package cn.ibizlab.extension.pssysbireportitem.dto

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
class PSSysBIReportItemDTO extends GroovyDTO<PSSysBIReportItemDTO> {

    /**
     * 「聚合类型」
     * 字典[云实体关系属性影射类型]
     */
    @JsonProperty("aggtype")
    String aggType
    /**
     * 「项参数」
     */
    @JsonProperty("birepitemparams")
    String bIRepItemParams
    /**
     * 「报表列标记」
     */
    @JsonProperty("birepitemtag")
    String bIRepItemTag
    /**
     * 「报表列标记2」
     */
    @JsonProperty("birepitemtag2")
    String bIRepItemTag2
    /**
     * 「报表项类型」
     * 字典[智能报表报表项类型]
     */
    @JsonProperty("birepitemtype")
    String bIRepItemType
    /**
     * 「项数据」
     */
    @JsonProperty("data")
    String data
    /**
     * 「智能报表立方体维度」
     */
    @JsonProperty("pssysbicubedimensionid")
    String pSSysBICubeDimensionId
    /**
     * 「立方体维度」
     */
    @JsonProperty("pssysbicubedimensionname")
    String pSSysBICubeDimensionName
    /**
     * 「智能报表立方体」
     */
    @JsonProperty("pssysbicubeid")
    String pSSysBICubeId
    /**
     * 「智能报表指标」
     */
    @JsonProperty("pssysbicubemeasureid")
    String pSSysBICubeMeasureId
    /**
     * 「立方体指标」
     */
    @JsonProperty("pssysbicubemeasurename")
    String pSSysBICubeMeasureName
    /**
     * 「智能报表立方体」
     */
    @JsonProperty("pssysbicubename")
    String pSSysBICubeName
    /**
     * 「智能报表报表」
     */
    @JsonProperty("pssysbireportid")
    String pSSysBIReportId
    /**
     * 「智能报表项标识」
     */
    @JsonProperty("pssysbireportitemid")
    String pSSysBIReportItemId
    /**
     * 「智能报表项名称」
     */
    @JsonProperty("pssysbireportitemname")
    String pSSysBIReportItemName
    /**
     * 「智能报表报表」
     */
    @JsonProperty("pssysbireportname")
    String pSSysBIReportName
    /**
     * 「PSSYSBISCHEMEID」
     */
    @JsonProperty("pssysbischemeid")
    String pSSysBISchemeId
    /**
     * 「放置类型」
     * 字典[智能报表报表项放置类型]
     */
    @JsonProperty("placetype")
    String placeType
    /**
     * 「放置位置」
     * 字典[智能报表报表项放置位置]
     */
    @JsonProperty("placement")
    String placement
    /**
     * 「指标引用类型」
     * 字典[智能报表报表指标引用类型]
     */
    @JsonProperty("reftype")
    String refType
    /**
     * 「标准数据类型」
     */
    @JsonProperty("stddatatype")
    Integer stdDataType
    /**
     * 「启用」
     * 字典[是否]
     */
    @JsonProperty("validflag")
    Integer validFlag
    /**
     * 「值格式化」
     */
    @JsonProperty("valueformat")
    String valueFormat

    /**
     * 设置「聚合类型」值
     * 字典[云实体关系属性影射类型]
     * @param val
     */
    PSSysBIReportItemDTO setAggType(String aggType) {
        this.aggType = aggType
        return this
    }


    /**
     * 设置「项参数」值
     * @param val
     */
    PSSysBIReportItemDTO setBIRepItemParams(String bIRepItemParams) {
        this.bIRepItemParams = bIRepItemParams
        return this
    }


    /**
     * 设置「报表列标记」值
     * @param val
     */
    PSSysBIReportItemDTO setBIRepItemTag(String bIRepItemTag) {
        this.bIRepItemTag = bIRepItemTag
        return this
    }


    /**
     * 设置「报表列标记2」值
     * @param val
     */
    PSSysBIReportItemDTO setBIRepItemTag2(String bIRepItemTag2) {
        this.bIRepItemTag2 = bIRepItemTag2
        return this
    }


    /**
     * 设置「报表项类型」值
     * 字典[智能报表报表项类型]
     * @param val
     */
    PSSysBIReportItemDTO setBIRepItemType(String bIRepItemType) {
        this.bIRepItemType = bIRepItemType
        return this
    }


    /**
     * 设置「项数据」值
     * @param val
     */
    PSSysBIReportItemDTO setData(String data) {
        this.data = data
        return this
    }


    /**
     * 设置「智能报表立方体维度」值
     * @param val
     */
    PSSysBIReportItemDTO setPSSysBICubeDimensionId(String pSSysBICubeDimensionId) {
        this.pSSysBICubeDimensionId = pSSysBICubeDimensionId
        return this
    }


    /**
     * 设置「立方体维度」值
     * @param val
     */
    PSSysBIReportItemDTO setPSSysBICubeDimensionName(String pSSysBICubeDimensionName) {
        this.pSSysBICubeDimensionName = pSSysBICubeDimensionName
        return this
    }


    /**
     * 设置「智能报表立方体」值
     * @param val
     */
    PSSysBIReportItemDTO setPSSysBICubeId(String pSSysBICubeId) {
        this.pSSysBICubeId = pSSysBICubeId
        return this
    }


    /**
     * 设置「智能报表指标」值
     * @param val
     */
    PSSysBIReportItemDTO setPSSysBICubeMeasureId(String pSSysBICubeMeasureId) {
        this.pSSysBICubeMeasureId = pSSysBICubeMeasureId
        return this
    }


    /**
     * 设置「立方体指标」值
     * @param val
     */
    PSSysBIReportItemDTO setPSSysBICubeMeasureName(String pSSysBICubeMeasureName) {
        this.pSSysBICubeMeasureName = pSSysBICubeMeasureName
        return this
    }


    /**
     * 设置「智能报表立方体」值
     * @param val
     */
    PSSysBIReportItemDTO setPSSysBICubeName(String pSSysBICubeName) {
        this.pSSysBICubeName = pSSysBICubeName
        return this
    }


    /**
     * 设置「智能报表报表」值
     * @param val
     */
    PSSysBIReportItemDTO setPSSysBIReportId(String pSSysBIReportId) {
        this.pSSysBIReportId = pSSysBIReportId
        return this
    }


    /**
     * 设置「智能报表项标识」值
     * @param val
     */
    PSSysBIReportItemDTO setPSSysBIReportItemId(String pSSysBIReportItemId) {
        this.pSSysBIReportItemId = pSSysBIReportItemId
        return this
    }


    /**
     * 设置「智能报表项名称」值
     * @param val
     */
    PSSysBIReportItemDTO setPSSysBIReportItemName(String pSSysBIReportItemName) {
        this.pSSysBIReportItemName = pSSysBIReportItemName
        return this
    }


    /**
     * 设置「智能报表报表」值
     * @param val
     */
    PSSysBIReportItemDTO setPSSysBIReportName(String pSSysBIReportName) {
        this.pSSysBIReportName = pSSysBIReportName
        return this
    }


    /**
     * 设置「PSSYSBISCHEMEID」值
     * @param val
     */
    PSSysBIReportItemDTO setPSSysBISchemeId(String pSSysBISchemeId) {
        this.pSSysBISchemeId = pSSysBISchemeId
        return this
    }


    /**
     * 设置「放置类型」值
     * 字典[智能报表报表项放置类型]
     * @param val
     */
    PSSysBIReportItemDTO setPlaceType(String placeType) {
        this.placeType = placeType
        return this
    }


    /**
     * 设置「放置位置」值
     * 字典[智能报表报表项放置位置]
     * @param val
     */
    PSSysBIReportItemDTO setPlacement(String placement) {
        this.placement = placement
        return this
    }


    /**
     * 设置「指标引用类型」值
     * 字典[智能报表报表指标引用类型]
     * @param val
     */
    PSSysBIReportItemDTO setRefType(String refType) {
        this.refType = refType
        return this
    }


    /**
     * 设置「标准数据类型」值
     * @param val
     */
    PSSysBIReportItemDTO setStdDataType(Integer stdDataType) {
        this.stdDataType = stdDataType
        return this
    }


    /**
     * 设置「启用」值
     * 字典[是否]
     * @param val
     */
    PSSysBIReportItemDTO setValidFlag(Integer validFlag) {
        this.validFlag = validFlag
        return this
    }


    /**
     * 设置「值格式化」值
     * @param val
     */
    PSSysBIReportItemDTO setValueFormat(String valueFormat) {
        this.valueFormat = valueFormat
        return this
    }

}
