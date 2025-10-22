package cn.ibizlab.extension.psdelogicnode.dto

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
class PSDELogicNodeDTO extends GroovyDTO<PSDELogicNodeDTO> {

    /**
     * 「工作项类型」
     */
    @JsonProperty("work_item_type_id")
    String workItemTypeId
    /**
     * 「工作项类型」
     */
    @JsonProperty("work_item_type_name")
    String workItemTypeName
    /**
     * 「标题」
     */
    @JsonProperty("title")
    String title
    /**
     * 「内容」
     */
    @JsonProperty("content")
    String content
    /**
     * 「排序属性」
     */
    @JsonProperty("ordervalue")
    Integer orderValue
    /**
     * 「代码名称」
     */
    @JsonProperty("codename")
    String codeName
    /**
     * 「逻辑节点类型」
     * 字典[实体逻辑处理节点类型(设计)3]
     */
    @JsonProperty("logicnodetype")
    String logicNodeType
    /**
     * 「实体处理逻辑」
     */
    @JsonProperty("psdelogicid")
    String pSDELogicId
    /**
     * 「实体处理逻辑」
     */
    @JsonProperty("psdelogicname")
    String pSDELogicName
    /**
     * 「实体处理逻辑节点标识」
     */
    @JsonProperty("psdelogicnodeid")
    String pSDELogicNodeId
    /**
     * 「逻辑处理名称」
     */
    @JsonProperty("psdelogicnodename")
    String pSDELogicNodeName
    /**
     * 「循环后续处理」
     * 字典[是否]
     */
    @JsonProperty("paralleloutput")
    Integer parallelOutput
    /**
     * 「参数1」
     */
    @JsonProperty("param1")
    String param1
    /**
     * 「参数10」
     * 字典[是否]
     */
    @JsonProperty("param10")
    Integer param10
    /**
     * 「参数11」
     */
    @JsonProperty("param11")
    String param11
    /**
     * 「参数12」
     */
    @JsonProperty("param12")
    String param12
    /**
     * 「参数13」
     */
    @JsonProperty("param13")
    String param13
    /**
     * 「参数7」
     */
    @JsonProperty("param7")
    Integer param7
    /**
     * 「参数8」
     */
    @JsonProperty("param8")
    Integer param8
    /**
     * 「参数9」
     * 字典[是否]
     */
    @JsonProperty("param9")
    Integer param9

    /**
     * 设置「工作项类型」值
     * @param val
     */
    PSDELogicNodeDTO setWorkItemTypeId(String workItemTypeId) {
        this.workItemTypeId = workItemTypeId
        return this
    }


    /**
     * 设置「工作项类型」值
     * @param val
     */
    PSDELogicNodeDTO setWorkItemTypeName(String workItemTypeName) {
        this.workItemTypeName = workItemTypeName
        return this
    }


    /**
     * 设置「标题」值
     * @param val
     */
    PSDELogicNodeDTO setTitle(String title) {
        this.title = title
        return this
    }


    /**
     * 设置「内容」值
     * @param val
     */
    PSDELogicNodeDTO setContent(String content) {
        this.content = content
        return this
    }


    /**
     * 设置「排序属性」值
     * @param val
     */
    PSDELogicNodeDTO setOrderValue(Integer orderValue) {
        this.orderValue = orderValue
        return this
    }


    /**
     * 设置「代码名称」值
     * @param val
     */
    PSDELogicNodeDTO setCodeName(String codeName) {
        this.codeName = codeName
        return this
    }


    /**
     * 设置「逻辑节点类型」值
     * 字典[实体逻辑处理节点类型(设计)3]
     * @param val
     */
    PSDELogicNodeDTO setLogicNodeType(String logicNodeType) {
        this.logicNodeType = logicNodeType
        return this
    }


    /**
     * 设置「实体处理逻辑」值
     * @param val
     */
    PSDELogicNodeDTO setPSDELogicId(String pSDELogicId) {
        this.pSDELogicId = pSDELogicId
        return this
    }


    /**
     * 设置「实体处理逻辑」值
     * @param val
     */
    PSDELogicNodeDTO setPSDELogicName(String pSDELogicName) {
        this.pSDELogicName = pSDELogicName
        return this
    }


    /**
     * 设置「实体处理逻辑节点标识」值
     * @param val
     */
    PSDELogicNodeDTO setPSDELogicNodeId(String pSDELogicNodeId) {
        this.pSDELogicNodeId = pSDELogicNodeId
        return this
    }


    /**
     * 设置「逻辑处理名称」值
     * @param val
     */
    PSDELogicNodeDTO setPSDELogicNodeName(String pSDELogicNodeName) {
        this.pSDELogicNodeName = pSDELogicNodeName
        return this
    }


    /**
     * 设置「循环后续处理」值
     * 字典[是否]
     * @param val
     */
    PSDELogicNodeDTO setParallelOutput(Integer parallelOutput) {
        this.parallelOutput = parallelOutput
        return this
    }


    /**
     * 设置「参数1」值
     * @param val
     */
    PSDELogicNodeDTO setParam1(String param1) {
        this.param1 = param1
        return this
    }


    /**
     * 设置「参数10」值
     * 字典[是否]
     * @param val
     */
    PSDELogicNodeDTO setParam10(Integer param10) {
        this.param10 = param10
        return this
    }


    /**
     * 设置「参数11」值
     * @param val
     */
    PSDELogicNodeDTO setParam11(String param11) {
        this.param11 = param11
        return this
    }


    /**
     * 设置「参数12」值
     * @param val
     */
    PSDELogicNodeDTO setParam12(String param12) {
        this.param12 = param12
        return this
    }


    /**
     * 设置「参数13」值
     * @param val
     */
    PSDELogicNodeDTO setParam13(String param13) {
        this.param13 = param13
        return this
    }


    /**
     * 设置「参数7」值
     * @param val
     */
    PSDELogicNodeDTO setParam7(Integer param7) {
        this.param7 = param7
        return this
    }


    /**
     * 设置「参数8」值
     * @param val
     */
    PSDELogicNodeDTO setParam8(Integer param8) {
        this.param8 = param8
        return this
    }


    /**
     * 设置「参数9」值
     * 字典[是否]
     * @param val
     */
    PSDELogicNodeDTO setParam9(Integer param9) {
        this.param9 = param9
        return this
    }

}
