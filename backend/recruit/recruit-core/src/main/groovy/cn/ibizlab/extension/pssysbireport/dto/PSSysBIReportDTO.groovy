package cn.ibizlab.extension.pssysbireport.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.extension.pssysbireportitem.dto.PSSysBIReportItemDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class PSSysBIReportDTO extends GroovyDTO<PSSysBIReportDTO> {

    /**
     * 「智能报表项」
     */
    @JsonProperty("pssysbireportitems")
    List<PSSysBIReportItemDTO> pSSysBIReportItems
    /**
     * 「报表模型」
     */
    @JsonProperty("bireportmodel")
    String bIReportModel
    /**
     * 「报表标记」
     */
    @JsonProperty("bireporttag")
    String bIReportTag
    /**
     * 「报表标记2」
     */
    @JsonProperty("bireporttag2")
    String bIReportTag2
    /**
     * 「报表界面模型」
     */
    @JsonProperty("bireportuimodel")
    String bIReportUIModel
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
     * 「智能报表标识」
     */
    @JsonProperty("pssysbireportid")
    String pSSysBIReportId
    /**
     * 「智能报表名称」
     */
    @JsonProperty("pssysbireportname")
    String pSSysBIReportName
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
     * 设置「智能报表项」值
     * @param val
     */
    PSSysBIReportDTO setPSSysBIReportItems(List<PSSysBIReportItemDTO> pSSysBIReportItems) {
        this.pSSysBIReportItems = pSSysBIReportItems
        return this
    }


    /**
     * 设置「报表模型」值
     * @param val
     */
    PSSysBIReportDTO setBIReportModel(String bIReportModel) {
        this.bIReportModel = bIReportModel
        return this
    }


    /**
     * 设置「报表标记」值
     * @param val
     */
    PSSysBIReportDTO setBIReportTag(String bIReportTag) {
        this.bIReportTag = bIReportTag
        return this
    }


    /**
     * 设置「报表标记2」值
     * @param val
     */
    PSSysBIReportDTO setBIReportTag2(String bIReportTag2) {
        this.bIReportTag2 = bIReportTag2
        return this
    }


    /**
     * 设置「报表界面模型」值
     * @param val
     */
    PSSysBIReportDTO setBIReportUIModel(String bIReportUIModel) {
        this.bIReportUIModel = bIReportUIModel
        return this
    }


    /**
     * 设置「代码名称」值
     * @param val
     */
    PSSysBIReportDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    PSSysBIReportDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「智能报表立方体」值
     * @param val
     */
    PSSysBIReportDTO setPSSysBICubeId(String pSSysBICubeId) {
        this.pSSysBICubeId = pSSysBICubeId
        return this
    }


    /**
     * 设置「智能报表立方体」值
     * @param val
     */
    PSSysBIReportDTO setPSSysBICubeName(String pSSysBICubeName) {
        this.pSSysBICubeName = pSSysBICubeName
        return this
    }


    /**
     * 设置「智能报表标识」值
     * @param val
     */
    PSSysBIReportDTO setPSSysBIReportId(String pSSysBIReportId) {
        this.pSSysBIReportId = pSSysBIReportId
        return this
    }


    /**
     * 设置「智能报表名称」值
     * @param val
     */
    PSSysBIReportDTO setPSSysBIReportName(String pSSysBIReportName) {
        this.pSSysBIReportName = pSSysBIReportName
        return this
    }


    /**
     * 设置「智能报表体系」值
     * @param val
     */
    PSSysBIReportDTO setPSSysBISchemeId(String pSSysBISchemeId) {
        this.pSSysBISchemeId = pSSysBISchemeId
        return this
    }


    /**
     * 设置「智能报表体系」值
     * @param val
     */
    PSSysBIReportDTO setPSSysBISchemeName(String pSSysBISchemeName) {
        this.pSSysBISchemeName = pSSysBISchemeName
        return this
    }


    /**
     * 设置「启用」值
     * 字典[是否]
     * @param val
     */
    PSSysBIReportDTO setValidFlag(Integer validFlag) {
        this.validFlag = validFlag
        return this
    }

}
