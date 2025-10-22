package cn.ibizlab.hr.hrdepartment.dto

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
class HrDepartmentCounterDTO extends GroovyDTO<HrDepartmentCounterDTO> {

    /**
     * 「计划数量」
     */
    @JsonProperty("plans_count")
    Integer plansCount
    /**
     * 「Total Employee」
     */
    @JsonProperty("total_employee")
    Integer totalEmployee

    /**
     * 设置「计划数量」值
     * @param val
     */
    HrDepartmentCounterDTO setPlansCount(Integer plansCount) {
        this.plansCount = plansCount
        return this
    }


    /**
     * 设置「Total Employee」值
     * @param val
     */
    HrDepartmentCounterDTO setTotalEmployee(Integer totalEmployee) {
        this.totalEmployee = totalEmployee
        return this
    }

}
