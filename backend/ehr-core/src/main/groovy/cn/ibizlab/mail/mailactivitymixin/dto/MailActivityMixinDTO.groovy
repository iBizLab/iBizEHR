package cn.ibizlab.mail.mailactivitymixin.dto

import java.util.*
import java.math.*
import java.sql.Timestamp
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonInclude
import net.ibizsys.central.util.*
import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import cn.ibizlab.central.plugin.groovy.dataentity.dto.*
import cn.ibizlab.mail.mailactivity.dto.MailActivityDTO

@DEDataModel
@JsonInclude(JsonInclude.Include.NON_NULL)
class MailActivityMixinDTO extends GroovyDTO<MailActivityMixinDTO> {

    /**
     * 「活动集合」
     */
    @JsonProperty("activities")
    List<MailActivityDTO> activities
    /**
     * 「下一活动截止日期」
     */
    @JsonProperty("activity_date_deadline")
    Timestamp activityDateDeadline
    /**
     * 「活动异常标示」
     * 字典[活动异常标示]
     */
    @JsonProperty("activity_exception_decoration")
    String activityExceptionDecoration
    /**
     * 「图标」
     */
    @JsonProperty("activity_exception_icon")
    String activityExceptionIcon
    /**
     * 「活动状态」
     * 字典[活动状态]
     */
    @JsonProperty("activity_state")
    String activityState
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「我的活动截止时间」
     */
    @JsonProperty("my_activity_date_deadline")
    Timestamp myActivityDateDeadline
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name

    /**
     * 设置「活动集合」值
     * @param val
     */
    MailActivityMixinDTO setActivities(List<MailActivityDTO> activities) {
        this.activities = activities
        return this
    }


    /**
     * 设置「下一活动截止日期」值
     * @param val
     */
    MailActivityMixinDTO setActivityDateDeadline(Timestamp activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline
        return this
    }


    /**
     * 设置「活动异常标示」值
     * 字典[活动异常标示]
     * @param val
     */
    MailActivityMixinDTO setActivityExceptionDecoration(String activityExceptionDecoration) {
        this.activityExceptionDecoration = activityExceptionDecoration
        return this
    }


    /**
     * 设置「图标」值
     * @param val
     */
    MailActivityMixinDTO setActivityExceptionIcon(String activityExceptionIcon) {
        this.activityExceptionIcon = activityExceptionIcon
        return this
    }


    /**
     * 设置「活动状态」值
     * 字典[活动状态]
     * @param val
     */
    MailActivityMixinDTO setActivityState(String activityState) {
        this.activityState = activityState
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    MailActivityMixinDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「我的活动截止时间」值
     * @param val
     */
    MailActivityMixinDTO setMyActivityDateDeadline(Timestamp myActivityDateDeadline) {
        this.myActivityDateDeadline = myActivityDateDeadline
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    MailActivityMixinDTO setName(String name) {
        this.name = name
        return this
    }

}
