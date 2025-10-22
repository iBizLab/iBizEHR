package cn.ibizlab.extension.psdelogic.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.extension.psdelogicnode.dto.PSDELogicNodeDTO
import cn.ibizlab.extension.psdelogiclink.dto.PSDELogicLinkDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class PSDELogicDTO extends GroovyDTO<PSDELogicDTO> {

    /**
     * 「扩展状态」
     * 字典[扩展状态]
     */
    @JsonProperty("applyflag")
    Integer applyflag
    /**
     * 「附加到指定行为」
     */
    @JsonProperty("attachtopsdeactionid")
    String attachToPSDEActionId
    /**
     * 「附加到指定行为」
     */
    @JsonProperty("attachtopsdeactionname")
    String attachToPSDEActionName
    /**
     * 「扩展模型」
     * 字典[是否]
     */
    @JsonProperty("dynamodelflag")
    Integer dynaModelFlag
    /**
     * 「附加到指定数据集」
     */
    @JsonProperty("attachtopsdedatasetid")
    String attachToPSDEDataSetId
    /**
     * 「附加到指定数据集」
     */
    @JsonProperty("attachtopsdedatasetname")
    String attachToPSDEDataSetName
    /**
     * 「定时触发策略」
     */
    @JsonProperty("timerpolicy")
    String timerPolicy
    /**
     * 「最后运行状态」
     * 字典[日志状态]
     */
    @JsonProperty("last_state")
    String lastState
    /**
     * 「事件模型」
     */
    @JsonProperty("eventmodel")
    String eventModel
    /**
     * 「监控事件」
     * 字典[可供选择的触发器]
     */
    @JsonProperty("events")
    String events
    /**
     * 「忽略异常」
     * 字典[是否]
     */
    @JsonProperty("ignoreexception")
    Integer ignoreException
    /**
     * 「线程模式」
     */
    @JsonProperty("threadmode")
    String threadMode
    /**
     * 「最后运行时间」
     */
    @JsonProperty("last_start_at")
    Timestamp lastStartAt
    /**
     * 「逻辑参数」
     */
    @JsonProperty("psdelogicparams")
    List<IEntity> pSDELOGICPARAMS
    /**
     * 「逻辑节点」
     */
    @JsonProperty("psdelogicnodes")
    List<PSDELogicNodeDTO> pSDELogicNodes
    /**
     * 「逻辑连接」
     */
    @JsonProperty("psdelogiclinks")
    List<PSDELogicLinkDTO> pSDELogicLinks
    /**
     * 「WebHook地址」
     */
    @JsonProperty("webhookurl")
    String webHookUrl
    /**
     * 「成功率」
     */
    @JsonProperty("success_per")
    BigDecimal successPer
    /**
     * 「成功率」
     */
    @JsonProperty("success_rate")
    BigDecimal successRate
    /**
     * 「失败率」
     */
    @JsonProperty("failure_per")
    BigDecimal failurePer
    /**
     * 「失败率」
     */
    @JsonProperty("failure_rate")
    BigDecimal failureRate
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
     * 「逻辑子类」
     * 字典[逻辑子类]
     */
    @JsonProperty("logicsubtype")
    String logicSubType
    /**
     * 「逻辑标记」
     */
    @JsonProperty("logictag")
    String logicTag
    /**
     * 「逻辑标记2」
     */
    @JsonProperty("logictag2")
    String logicTag2
    /**
     * 「逻辑标记3」
     */
    @JsonProperty("logictag3")
    String logicTag3
    /**
     * 「逻辑标记4」
     */
    @JsonProperty("logictag4")
    String logicTag4
    /**
     * 「逻辑类型」
     */
    @JsonProperty("logictype")
    String logicType
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「附加次序」
     */
    @JsonProperty("ordervalue")
    Integer orderValue
    /**
     * 「实体」
     */
    @JsonProperty("psdeid")
    String pSDEId
    /**
     * 「实体处理逻辑标识」
     */
    @JsonProperty("psdelogicid")
    String pSDELogicId
    /**
     * 「规则名称」
     */
    @JsonProperty("psdelogicname")
    String pSDELogicName
    /**
     * 「实体」
     */
    @JsonProperty("psdename")
    String pSDEName
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
     * 「用户标记」
     */
    @JsonProperty("usertag")
    String userTag
    /**
     * 「用户标记2」
     */
    @JsonProperty("usertag2")
    String userTag2
    /**
     * 「用户标记3」
     */
    @JsonProperty("usertag3")
    String userTag3
    /**
     * 「用户标记4」
     */
    @JsonProperty("usertag4")
    String userTag4
    /**
     * 「启用」
     * 字典[是否]
     */
    @JsonProperty("validflag")
    Integer validFlag
    /**
     * 「扩展标记」
     */
    @JsonProperty("extension_tag")
    String extensionTag
    /**
     * 「扩展标记2」
     */
    @JsonProperty("extension_tag2")
    String extensionTag2
    /**
     * 「扩展标记3」
     */
    @JsonProperty("extension_tag3")
    String extensionTag3
    /**
     * 「扩展标记4」
     */
    @JsonProperty("extension_tag4")
    String extensionTag4

    /**
     * 设置「扩展状态」值
     * 字典[扩展状态]
     * @param val
     */
    PSDELogicDTO setApplyflag(Integer applyflag) {
        this.applyflag = applyflag
        return this
    }


    /**
     * 设置「附加到指定行为」值
     * @param val
     */
    PSDELogicDTO setAttachToPSDEActionId(String attachToPSDEActionId) {
        this.attachToPSDEActionId = attachToPSDEActionId
        return this
    }


    /**
     * 设置「附加到指定行为」值
     * @param val
     */
    PSDELogicDTO setAttachToPSDEActionName(String attachToPSDEActionName) {
        this.attachToPSDEActionName = attachToPSDEActionName
        return this
    }


    /**
     * 设置「扩展模型」值
     * 字典[是否]
     * @param val
     */
    PSDELogicDTO setDynaModelFlag(Integer dynaModelFlag) {
        this.dynaModelFlag = dynaModelFlag
        return this
    }


    /**
     * 设置「附加到指定数据集」值
     * @param val
     */
    PSDELogicDTO setAttachToPSDEDataSetId(String attachToPSDEDataSetId) {
        this.attachToPSDEDataSetId = attachToPSDEDataSetId
        return this
    }


    /**
     * 设置「附加到指定数据集」值
     * @param val
     */
    PSDELogicDTO setAttachToPSDEDataSetName(String attachToPSDEDataSetName) {
        this.attachToPSDEDataSetName = attachToPSDEDataSetName
        return this
    }


    /**
     * 设置「定时触发策略」值
     * @param val
     */
    PSDELogicDTO setTimerPolicy(String timerPolicy) {
        this.timerPolicy = timerPolicy
        return this
    }


    /**
     * 设置「最后运行状态」值
     * 字典[日志状态]
     * @param val
     */
    PSDELogicDTO setLastState(String lastState) {
        this.lastState = lastState
        return this
    }


    /**
     * 设置「事件模型」值
     * @param val
     */
    PSDELogicDTO setEventModel(String eventModel) {
        this.eventModel = eventModel
        return this
    }


    /**
     * 设置「监控事件」值
     * 字典[可供选择的触发器]
     * @param val
     */
    PSDELogicDTO setEvents(String events) {
        this.events = events
        return this
    }


    /**
     * 设置「忽略异常」值
     * 字典[是否]
     * @param val
     */
    PSDELogicDTO setIgnoreException(Integer ignoreException) {
        this.ignoreException = ignoreException
        return this
    }


    /**
     * 设置「线程模式」值
     * @param val
     */
    PSDELogicDTO setThreadMode(String threadMode) {
        this.threadMode = threadMode
        return this
    }


    /**
     * 设置「最后运行时间」值
     * @param val
     */
    PSDELogicDTO setLastStartAt(Timestamp lastStartAt) {
        this.lastStartAt = lastStartAt
        return this
    }


    /**
     * 设置「逻辑参数」值
     * @param val
     */
    PSDELogicDTO setPSDELOGICPARAMS(List<IEntity> pSDELOGICPARAMS) {
        this.pSDELOGICPARAMS = pSDELOGICPARAMS
        return this
    }


    /**
     * 设置「逻辑节点」值
     * @param val
     */
    PSDELogicDTO setPSDELogicNodes(List<PSDELogicNodeDTO> pSDELogicNodes) {
        this.pSDELogicNodes = pSDELogicNodes
        return this
    }


    /**
     * 设置「逻辑连接」值
     * @param val
     */
    PSDELogicDTO setPSDELogicLinks(List<PSDELogicLinkDTO> pSDELogicLinks) {
        this.pSDELogicLinks = pSDELogicLinks
        return this
    }


    /**
     * 设置「WebHook地址」值
     * @param val
     */
    PSDELogicDTO setWebHookUrl(String webHookUrl) {
        this.webHookUrl = webHookUrl
        return this
    }


    /**
     * 设置「成功率」值
     * @param val
     */
    PSDELogicDTO setSuccessPer(BigDecimal successPer) {
        this.successPer = successPer
        return this
    }


    /**
     * 设置「成功率」值
     * @param val
     */
    PSDELogicDTO setSuccessRate(BigDecimal successRate) {
        this.successRate = successRate
        return this
    }


    /**
     * 设置「失败率」值
     * @param val
     */
    PSDELogicDTO setFailurePer(BigDecimal failurePer) {
        this.failurePer = failurePer
        return this
    }


    /**
     * 设置「失败率」值
     * @param val
     */
    PSDELogicDTO setFailureRate(BigDecimal failureRate) {
        this.failureRate = failureRate
        return this
    }


    /**
     * 设置「代码标识」值
     * @param val
     */
    PSDELogicDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    PSDELogicDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSDELogicDTO setCreateMan(String createMan) {
        this.createMan = createMan
        return this
    }


    /**
     * 设置「逻辑子类」值
     * 字典[逻辑子类]
     * @param val
     */
    PSDELogicDTO setLogicSubType(String logicSubType) {
        this.logicSubType = logicSubType
        return this
    }


    /**
     * 设置「逻辑标记」值
     * @param val
     */
    PSDELogicDTO setLogicTag(String logicTag) {
        this.logicTag = logicTag
        return this
    }


    /**
     * 设置「逻辑标记2」值
     * @param val
     */
    PSDELogicDTO setLogicTag2(String logicTag2) {
        this.logicTag2 = logicTag2
        return this
    }


    /**
     * 设置「逻辑标记3」值
     * @param val
     */
    PSDELogicDTO setLogicTag3(String logicTag3) {
        this.logicTag3 = logicTag3
        return this
    }


    /**
     * 设置「逻辑标记4」值
     * @param val
     */
    PSDELogicDTO setLogicTag4(String logicTag4) {
        this.logicTag4 = logicTag4
        return this
    }


    /**
     * 设置「逻辑类型」值
     * @param val
     */
    PSDELogicDTO setLogicType(String logicType) {
        this.logicType = logicType
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    PSDELogicDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「附加次序」值
     * @param val
     */
    PSDELogicDTO setOrderValue(Integer orderValue) {
        this.orderValue = orderValue
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSDELogicDTO setPSDEId(String pSDEId) {
        this.pSDEId = pSDEId
        return this
    }


    /**
     * 设置「实体处理逻辑标识」值
     * @param val
     */
    PSDELogicDTO setPSDELogicId(String pSDELogicId) {
        this.pSDELogicId = pSDELogicId
        return this
    }


    /**
     * 设置「规则名称」值
     * @param val
     */
    PSDELogicDTO setPSDELogicName(String pSDELogicName) {
        this.pSDELogicName = pSDELogicName
        return this
    }


    /**
     * 设置「实体」值
     * @param val
     */
    PSDELogicDTO setPSDEName(String pSDEName) {
        this.pSDEName = pSDEName
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    PSDELogicDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「更新人」值
     * 字典[云系统操作者]
     * @param val
     */
    PSDELogicDTO setUpdateMan(String updateMan) {
        this.updateMan = updateMan
        return this
    }


    /**
     * 设置「用户标记」值
     * @param val
     */
    PSDELogicDTO setUserTag(String userTag) {
        this.userTag = userTag
        return this
    }


    /**
     * 设置「用户标记2」值
     * @param val
     */
    PSDELogicDTO setUserTag2(String userTag2) {
        this.userTag2 = userTag2
        return this
    }


    /**
     * 设置「用户标记3」值
     * @param val
     */
    PSDELogicDTO setUserTag3(String userTag3) {
        this.userTag3 = userTag3
        return this
    }


    /**
     * 设置「用户标记4」值
     * @param val
     */
    PSDELogicDTO setUserTag4(String userTag4) {
        this.userTag4 = userTag4
        return this
    }


    /**
     * 设置「启用」值
     * 字典[是否]
     * @param val
     */
    PSDELogicDTO setValidFlag(Integer validFlag) {
        this.validFlag = validFlag
        return this
    }


    /**
     * 设置「扩展标记」值
     * @param val
     */
    PSDELogicDTO setExtensionTag(String extensionTag) {
        this.extensionTag = extensionTag
        return this
    }


    /**
     * 设置「扩展标记2」值
     * @param val
     */
    PSDELogicDTO setExtensionTag2(String extensionTag2) {
        this.extensionTag2 = extensionTag2
        return this
    }


    /**
     * 设置「扩展标记3」值
     * @param val
     */
    PSDELogicDTO setExtensionTag3(String extensionTag3) {
        this.extensionTag3 = extensionTag3
        return this
    }


    /**
     * 设置「扩展标记4」值
     * @param val
     */
    PSDELogicDTO setExtensionTag4(String extensionTag4) {
        this.extensionTag4 = extensionTag4
        return this
    }

}
