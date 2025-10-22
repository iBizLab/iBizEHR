package cn.ibizlab.extension.psdelogiclink.dto

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
class PSDELogicLinkDTO extends GroovyDTO<PSDELogicLinkDTO> {

    /**
     * 「目标节点」
     */
    @JsonProperty("dstpsdelogicnodeid")
    String dstPSDELogicNodeId
    /**
     * 「目标节点」
     */
    @JsonProperty("dstpsdelogicnodename")
    String dstPSDELogicNodeName
    /**
     * 「实体处理逻辑」
     */
    @JsonProperty("psdelogicid")
    String pSDELogicId
    /**
     * 「实体处理逻辑链接标识」
     */
    @JsonProperty("psdelogiclinkid")
    String pSDELogicLinkId
    /**
     * 「连接名称」
     */
    @JsonProperty("psdelogiclinkname")
    String pSDELogicLinkName
    /**
     * 「实体处理逻辑」
     */
    @JsonProperty("psdelogicname")
    String pSDELogicName
    /**
     * 「源节点」
     */
    @JsonProperty("srcpsdelogicnodeid")
    String srcPSDELogicNodeId
    /**
     * 「源节点」
     */
    @JsonProperty("srcpsdelogicnodename")
    String srcPSDELogicNodeName

    /**
     * 设置「目标节点」值
     * @param val
     */
    PSDELogicLinkDTO setDstPSDELogicNodeId(String dstPSDELogicNodeId) {
        this.dstPSDELogicNodeId = dstPSDELogicNodeId
        return this
    }


    /**
     * 设置「目标节点」值
     * @param val
     */
    PSDELogicLinkDTO setDstPSDELogicNodeName(String dstPSDELogicNodeName) {
        this.dstPSDELogicNodeName = dstPSDELogicNodeName
        return this
    }


    /**
     * 设置「实体处理逻辑」值
     * @param val
     */
    PSDELogicLinkDTO setPSDELogicId(String pSDELogicId) {
        this.pSDELogicId = pSDELogicId
        return this
    }


    /**
     * 设置「实体处理逻辑链接标识」值
     * @param val
     */
    PSDELogicLinkDTO setPSDELogicLinkId(String pSDELogicLinkId) {
        this.pSDELogicLinkId = pSDELogicLinkId
        return this
    }


    /**
     * 设置「连接名称」值
     * @param val
     */
    PSDELogicLinkDTO setPSDELogicLinkName(String pSDELogicLinkName) {
        this.pSDELogicLinkName = pSDELogicLinkName
        return this
    }


    /**
     * 设置「实体处理逻辑」值
     * @param val
     */
    PSDELogicLinkDTO setPSDELogicName(String pSDELogicName) {
        this.pSDELogicName = pSDELogicName
        return this
    }


    /**
     * 设置「源节点」值
     * @param val
     */
    PSDELogicLinkDTO setSrcPSDELogicNodeId(String srcPSDELogicNodeId) {
        this.srcPSDELogicNodeId = srcPSDELogicNodeId
        return this
    }


    /**
     * 设置「源节点」值
     * @param val
     */
    PSDELogicLinkDTO setSrcPSDELogicNodeName(String srcPSDELogicNodeName) {
        this.srcPSDELogicNodeName = srcPSDELogicNodeName
        return this
    }

}
