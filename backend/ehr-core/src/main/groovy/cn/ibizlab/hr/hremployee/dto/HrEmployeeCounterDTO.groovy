package cn.ibizlab.hr.hremployee.dto

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
class HrEmployeeCounterDTO extends GroovyDTO<HrEmployeeCounterDTO> {

    /**
     * 「分配的总天数。」
     */
    @JsonProperty("allocation_count")
    Double allocationCount
    /**
     * 「分配总数量」
     */
    @JsonProperty("allocations_count")
    Integer allocationsCount
    /**
     * 「间接下属统计」
     */
    @JsonProperty("child_all_count")
    Integer childAllCount
    /**
     * 「直接下属人数」
     */
    @JsonProperty("child_count")
    Integer childCount
    /**
     * 「车辆」
     */
    @JsonProperty("employee_cars_count")
    Integer employeeCarsCount
    /**
     * 「设备数量」
     */
    @JsonProperty("equipment_count")
    Integer equipmentCount
    /**
     * 「休假次数」
     */
    @JsonProperty("leaves_count")
    Double leavesCount
    /**
     * 「附件数量」
     */
    @JsonProperty("message_attachment_count")
    Integer messageAttachmentCount
    /**
     * 「错误数量」
     */
    @JsonProperty("message_has_error_counter")
    Integer messageHasErrorCounter
    /**
     * 「操作数量」
     */
    @JsonProperty("message_needaction_counter")
    Integer messageNeedactionCounter
    /**
     * 「相关合作伙伴数量」
     */
    @JsonProperty("related_partners_count")
    Integer relatedPartnersCount

    /**
     * 设置「分配的总天数。」值
     * @param val
     */
    HrEmployeeCounterDTO setAllocationCount(Double allocationCount) {
        this.allocationCount = allocationCount
        return this
    }


    /**
     * 设置「分配总数量」值
     * @param val
     */
    HrEmployeeCounterDTO setAllocationsCount(Integer allocationsCount) {
        this.allocationsCount = allocationsCount
        return this
    }


    /**
     * 设置「间接下属统计」值
     * @param val
     */
    HrEmployeeCounterDTO setChildAllCount(Integer childAllCount) {
        this.childAllCount = childAllCount
        return this
    }


    /**
     * 设置「直接下属人数」值
     * @param val
     */
    HrEmployeeCounterDTO setChildCount(Integer childCount) {
        this.childCount = childCount
        return this
    }


    /**
     * 设置「车辆」值
     * @param val
     */
    HrEmployeeCounterDTO setEmployeeCarsCount(Integer employeeCarsCount) {
        this.employeeCarsCount = employeeCarsCount
        return this
    }


    /**
     * 设置「设备数量」值
     * @param val
     */
    HrEmployeeCounterDTO setEquipmentCount(Integer equipmentCount) {
        this.equipmentCount = equipmentCount
        return this
    }


    /**
     * 设置「休假次数」值
     * @param val
     */
    HrEmployeeCounterDTO setLeavesCount(Double leavesCount) {
        this.leavesCount = leavesCount
        return this
    }


    /**
     * 设置「附件数量」值
     * @param val
     */
    HrEmployeeCounterDTO setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount
        return this
    }


    /**
     * 设置「错误数量」值
     * @param val
     */
    HrEmployeeCounterDTO setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter
        return this
    }


    /**
     * 设置「操作数量」值
     * @param val
     */
    HrEmployeeCounterDTO setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter
        return this
    }


    /**
     * 设置「相关合作伙伴数量」值
     * @param val
     */
    HrEmployeeCounterDTO setRelatedPartnersCount(Integer relatedPartnersCount) {
        this.relatedPartnersCount = relatedPartnersCount
        return this
    }

}
