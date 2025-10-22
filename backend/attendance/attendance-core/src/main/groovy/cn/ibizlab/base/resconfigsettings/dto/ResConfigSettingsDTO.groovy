package cn.ibizlab.base.resconfigsettings.dto

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
class ResConfigSettingsDTO extends GroovyDTO<ResConfigSettingsDTO> {

    /**
     * 「员工pin」
     * 字典[是否]
     */
    @JsonProperty("attendance_kiosk_use_pin")
    Integer attendanceKioskUsePin
    /**
     * 「自助考勤终端网址」
     */
    @JsonProperty("attendance_kiosk_url")
    String attendanceKioskUrl
    /**
     * 「考勤模式」
     * 字典[考勤模式]
     */
    @JsonProperty("attendance_kiosk_mode")
    String attendanceKioskMode
    /**
     * 「自助考勤终端延迟」
     */
    @JsonProperty("attendance_kiosk_delay")
    Integer attendanceKioskDelay
    /**
     * 「条码来源」
     * 字典[条码来源]
     */
    @JsonProperty("attendance_barcode_source")
    String attendanceBarcodeSource
    /**
     * 「来自 Systray 的出席情况」
     * 字典[是否]
     */
    @JsonProperty("attendance_from_systray")
    Integer attendanceFromSystray
    /**
     * 「额外工时验证」
     * 字典[加班时长校验]
     */
    @JsonProperty("attendance_overtime_validation")
    String attendanceOvertimeValidation
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id

    /**
     * 设置「员工pin」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setAttendanceKioskUsePin(Integer attendanceKioskUsePin) {
        this.attendanceKioskUsePin = attendanceKioskUsePin
        return this
    }


    /**
     * 设置「自助考勤终端网址」值
     * @param val
     */
    ResConfigSettingsDTO setAttendanceKioskUrl(String attendanceKioskUrl) {
        this.attendanceKioskUrl = attendanceKioskUrl
        return this
    }


    /**
     * 设置「考勤模式」值
     * 字典[考勤模式]
     * @param val
     */
    ResConfigSettingsDTO setAttendanceKioskMode(String attendanceKioskMode) {
        this.attendanceKioskMode = attendanceKioskMode
        return this
    }


    /**
     * 设置「自助考勤终端延迟」值
     * @param val
     */
    ResConfigSettingsDTO setAttendanceKioskDelay(Integer attendanceKioskDelay) {
        this.attendanceKioskDelay = attendanceKioskDelay
        return this
    }


    /**
     * 设置「条码来源」值
     * 字典[条码来源]
     * @param val
     */
    ResConfigSettingsDTO setAttendanceBarcodeSource(String attendanceBarcodeSource) {
        this.attendanceBarcodeSource = attendanceBarcodeSource
        return this
    }


    /**
     * 设置「来自 Systray 的出席情况」值
     * 字典[是否]
     * @param val
     */
    ResConfigSettingsDTO setAttendanceFromSystray(Integer attendanceFromSystray) {
        this.attendanceFromSystray = attendanceFromSystray
        return this
    }


    /**
     * 设置「额外工时验证」值
     * 字典[加班时长校验]
     * @param val
     */
    ResConfigSettingsDTO setAttendanceOvertimeValidation(String attendanceOvertimeValidation) {
        this.attendanceOvertimeValidation = attendanceOvertimeValidation
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    ResConfigSettingsDTO setId(String id) {
        this.id = id
        return this
    }

}
