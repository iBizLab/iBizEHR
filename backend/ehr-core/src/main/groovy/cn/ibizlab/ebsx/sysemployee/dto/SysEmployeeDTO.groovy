package cn.ibizlab.ebsx.sysemployee.dto

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
class SysEmployeeDTO extends GroovyDTO<SysEmployeeDTO> {

    /**
     * 「用户标识」
     */
    @JsonProperty("userid")
    String userId
    /**
     * 「用户全局名」
     */
    @JsonProperty("username")
    String userName
    /**
     * 「姓名」
     */
    @JsonProperty("personname")
    String personName
    /**
     * 「用户工号」
     */
    @JsonProperty("usercode")
    String userCode
    /**
     * 「登录名」
     */
    @JsonProperty("loginname")
    String loginName
    /**
     * 「密码」
     */
    @JsonProperty("password")
    String password
    /**
     * 「区属」
     */
    @JsonProperty("domains")
    String domains
    /**
     * 「主部门」
     */
    @JsonProperty("mdeptid")
    String mDeptId
    /**
     * 「主部门名称」
     */
    @JsonProperty("mdeptname")
    String mDeptName
    /**
     * 「业务编码」
     */
    @JsonProperty("bcode")
    String bCode
    /**
     * 「岗位标识」
     */
    @JsonProperty("postid")
    String postId
    /**
     * 「岗位名称」
     */
    @JsonProperty("postname")
    String postName
    /**
     * 「单位」
     */
    @JsonProperty("orgid")
    String orgId
    /**
     * 「单位名称」
     */
    @JsonProperty("orgname")
    String orgName
    /**
     * 「昵称别名」
     */
    @JsonProperty("nickname")
    String nickName
    /**
     * 「证件号码」
     */
    @JsonProperty("certcode")
    String certCode
    /**
     * 「性别」
     */
    @JsonProperty("sex")
    String sex
    /**
     * 「出生日期」
     */
    @JsonProperty("birthday")
    Timestamp birthday
    /**
     * 「手机号」
     */
    @JsonProperty("phone")
    String phone
    /**
     * 「邮件」
     */
    @JsonProperty("email")
    String email
    /**
     * 「社交账号」
     */
    @JsonProperty("avatar")
    String avatar
    /**
     * 「地址」
     */
    @JsonProperty("addr")
    String addr
    /**
     * 「照片」
     */
    @JsonProperty("usericon")
    String userIcon
    /**
     * 「ip地址」
     */
    @JsonProperty("ipaddr")
    String iPAddr
    /**
     * 「样式」
     */
    @JsonProperty("theme")
    String theme
    /**
     * 「语言」
     */
    @JsonProperty("lang")
    String lang
    /**
     * 「字号」
     */
    @JsonProperty("fontsize")
    String fontSize
    /**
     * 「备注」
     */
    @JsonProperty("memo")
    String memo
    /**
     * 「保留」
     */
    @JsonProperty("reserver")
    String reserver
    /**
     * 「保留10」
     */
    @JsonProperty("reserver10")
    String reserver10
    /**
     * 「保留11」
     */
    @JsonProperty("reserver11")
    Integer reserver11
    /**
     * 「保留12」
     */
    @JsonProperty("reserver12")
    Integer reserver12
    /**
     * 「保留13」
     */
    @JsonProperty("reserver13")
    Integer reserver13
    /**
     * 「保留14」
     */
    @JsonProperty("reserver14")
    Integer reserver14
    /**
     * 「保留15」
     */
    @JsonProperty("reserver15")
    BigDecimal reserver15
    /**
     * 「保留16」
     */
    @JsonProperty("reserver16")
    BigDecimal reserver16
    /**
     * 「保留17」
     */
    @JsonProperty("reserver17")
    BigDecimal reserver17
    /**
     * 「保留18」
     */
    @JsonProperty("reserver18")
    BigDecimal reserver18
    /**
     * 「保留19」
     */
    @JsonProperty("reserver19")
    Timestamp reserver19
    /**
     * 「保留2」
     */
    @JsonProperty("reserver2")
    String reserver2
    /**
     * 「保留20」
     */
    @JsonProperty("reserver20")
    Timestamp reserver20
    /**
     * 「保留3」
     */
    @JsonProperty("reserver3")
    String reserver3
    /**
     * 「保留4」
     */
    @JsonProperty("reserver4")
    String reserver4
    /**
     * 「保留5」
     */
    @JsonProperty("reserver5")
    String reserver5
    /**
     * 「保留6」
     */
    @JsonProperty("reserver6")
    String reserver6
    /**
     * 「保留7」
     */
    @JsonProperty("reserver7")
    String reserver7
    /**
     * 「保留8」
     */
    @JsonProperty("reserver8")
    String reserver8
    /**
     * 「保留9」
     */
    @JsonProperty("reserver9")
    String reserver9
    /**
     * 「排序」
     */
    @JsonProperty("showorder")
    Integer showOrder
    /**
     * 「管理员」
     * 字典[是否]
     */
    @JsonProperty("superuser")
    Integer superUser
    /**
     * 「创建时间」
     */
    @JsonProperty("createdate")
    Timestamp createDate
    /**
     * 「最后修改时间」
     */
    @JsonProperty("updatedate")
    Timestamp updateDate
    /**
     * 「钉钉用户标识」
     */
    @JsonProperty("ddunionid")
    String dDUnionId
    /**
     * 「钉钉用户标识」
     */
    @JsonProperty("dduserid")
    String dDUserId
    /**
     * 「消息类型」
     */
    @JsonProperty("msgtype")
    Integer msgType
    /**
     * 「人员状态」
     */
    @JsonProperty("state")
    String state
    /**
     * 「UAA用户标识」
     */
    @JsonProperty("uaauserid")
    String uAAUserId
    /**
     * 「微信用户标识」
     */
    @JsonProperty("wxworkunionid")
    String wXWorkUnionId
    /**
     * 「企业微信用户标识」
     */
    @JsonProperty("wxworkuserid")
    String wXWorkUserId

    /**
     * 设置「用户标识」值
     * @param val
     */
    SysEmployeeDTO setUserId(String userId) {
        this.userId = userId
        return this
    }


    /**
     * 设置「用户全局名」值
     * @param val
     */
    SysEmployeeDTO setUserName(String userName) {
        this.userName = userName
        return this
    }


    /**
     * 设置「姓名」值
     * @param val
     */
    SysEmployeeDTO setPersonName(String personName) {
        this.personName = personName
        return this
    }


    /**
     * 设置「用户工号」值
     * @param val
     */
    SysEmployeeDTO setUserCode(String userCode) {
        this.userCode = userCode
        return this
    }


    /**
     * 设置「登录名」值
     * @param val
     */
    SysEmployeeDTO setLoginName(String loginName) {
        this.loginName = loginName
        return this
    }


    /**
     * 设置「密码」值
     * @param val
     */
    SysEmployeeDTO setPassword(String password) {
        this.password = password
        return this
    }


    /**
     * 设置「区属」值
     * @param val
     */
    SysEmployeeDTO setDomains(String domains) {
        this.domains = domains
        return this
    }


    /**
     * 设置「主部门」值
     * @param val
     */
    SysEmployeeDTO setMDeptId(String mDeptId) {
        this.mDeptId = mDeptId
        return this
    }


    /**
     * 设置「主部门名称」值
     * @param val
     */
    SysEmployeeDTO setMDeptName(String mDeptName) {
        this.mDeptName = mDeptName
        return this
    }


    /**
     * 设置「业务编码」值
     * @param val
     */
    SysEmployeeDTO setBCode(String bCode) {
        this.bCode = bCode
        return this
    }


    /**
     * 设置「岗位标识」值
     * @param val
     */
    SysEmployeeDTO setPostId(String postId) {
        this.postId = postId
        return this
    }


    /**
     * 设置「岗位名称」值
     * @param val
     */
    SysEmployeeDTO setPostName(String postName) {
        this.postName = postName
        return this
    }


    /**
     * 设置「单位」值
     * @param val
     */
    SysEmployeeDTO setOrgId(String orgId) {
        this.orgId = orgId
        return this
    }


    /**
     * 设置「单位名称」值
     * @param val
     */
    SysEmployeeDTO setOrgName(String orgName) {
        this.orgName = orgName
        return this
    }


    /**
     * 设置「昵称别名」值
     * @param val
     */
    SysEmployeeDTO setNickName(String nickName) {
        this.nickName = nickName
        return this
    }


    /**
     * 设置「证件号码」值
     * @param val
     */
    SysEmployeeDTO setCertCode(String certCode) {
        this.certCode = certCode
        return this
    }


    /**
     * 设置「性别」值
     * @param val
     */
    SysEmployeeDTO setSex(String sex) {
        this.sex = sex
        return this
    }


    /**
     * 设置「出生日期」值
     * @param val
     */
    SysEmployeeDTO setBirthday(Timestamp birthday) {
        this.birthday = birthday
        return this
    }


    /**
     * 设置「手机号」值
     * @param val
     */
    SysEmployeeDTO setPhone(String phone) {
        this.phone = phone
        return this
    }


    /**
     * 设置「邮件」值
     * @param val
     */
    SysEmployeeDTO setEmail(String email) {
        this.email = email
        return this
    }


    /**
     * 设置「社交账号」值
     * @param val
     */
    SysEmployeeDTO setAvatar(String avatar) {
        this.avatar = avatar
        return this
    }


    /**
     * 设置「地址」值
     * @param val
     */
    SysEmployeeDTO setAddr(String addr) {
        this.addr = addr
        return this
    }


    /**
     * 设置「照片」值
     * @param val
     */
    SysEmployeeDTO setUserIcon(String userIcon) {
        this.userIcon = userIcon
        return this
    }


    /**
     * 设置「ip地址」值
     * @param val
     */
    SysEmployeeDTO setIPAddr(String iPAddr) {
        this.iPAddr = iPAddr
        return this
    }


    /**
     * 设置「样式」值
     * @param val
     */
    SysEmployeeDTO setTheme(String theme) {
        this.theme = theme
        return this
    }


    /**
     * 设置「语言」值
     * @param val
     */
    SysEmployeeDTO setLang(String lang) {
        this.lang = lang
        return this
    }


    /**
     * 设置「字号」值
     * @param val
     */
    SysEmployeeDTO setFontSize(String fontSize) {
        this.fontSize = fontSize
        return this
    }


    /**
     * 设置「备注」值
     * @param val
     */
    SysEmployeeDTO setMemo(String memo) {
        this.memo = memo
        return this
    }


    /**
     * 设置「保留」值
     * @param val
     */
    SysEmployeeDTO setReserver(String reserver) {
        this.reserver = reserver
        return this
    }


    /**
     * 设置「保留10」值
     * @param val
     */
    SysEmployeeDTO setReserver10(String reserver10) {
        this.reserver10 = reserver10
        return this
    }


    /**
     * 设置「保留11」值
     * @param val
     */
    SysEmployeeDTO setReserver11(Integer reserver11) {
        this.reserver11 = reserver11
        return this
    }


    /**
     * 设置「保留12」值
     * @param val
     */
    SysEmployeeDTO setReserver12(Integer reserver12) {
        this.reserver12 = reserver12
        return this
    }


    /**
     * 设置「保留13」值
     * @param val
     */
    SysEmployeeDTO setReserver13(Integer reserver13) {
        this.reserver13 = reserver13
        return this
    }


    /**
     * 设置「保留14」值
     * @param val
     */
    SysEmployeeDTO setReserver14(Integer reserver14) {
        this.reserver14 = reserver14
        return this
    }


    /**
     * 设置「保留15」值
     * @param val
     */
    SysEmployeeDTO setReserver15(BigDecimal reserver15) {
        this.reserver15 = reserver15
        return this
    }


    /**
     * 设置「保留16」值
     * @param val
     */
    SysEmployeeDTO setReserver16(BigDecimal reserver16) {
        this.reserver16 = reserver16
        return this
    }


    /**
     * 设置「保留17」值
     * @param val
     */
    SysEmployeeDTO setReserver17(BigDecimal reserver17) {
        this.reserver17 = reserver17
        return this
    }


    /**
     * 设置「保留18」值
     * @param val
     */
    SysEmployeeDTO setReserver18(BigDecimal reserver18) {
        this.reserver18 = reserver18
        return this
    }


    /**
     * 设置「保留19」值
     * @param val
     */
    SysEmployeeDTO setReserver19(Timestamp reserver19) {
        this.reserver19 = reserver19
        return this
    }


    /**
     * 设置「保留2」值
     * @param val
     */
    SysEmployeeDTO setReserver2(String reserver2) {
        this.reserver2 = reserver2
        return this
    }


    /**
     * 设置「保留20」值
     * @param val
     */
    SysEmployeeDTO setReserver20(Timestamp reserver20) {
        this.reserver20 = reserver20
        return this
    }


    /**
     * 设置「保留3」值
     * @param val
     */
    SysEmployeeDTO setReserver3(String reserver3) {
        this.reserver3 = reserver3
        return this
    }


    /**
     * 设置「保留4」值
     * @param val
     */
    SysEmployeeDTO setReserver4(String reserver4) {
        this.reserver4 = reserver4
        return this
    }


    /**
     * 设置「保留5」值
     * @param val
     */
    SysEmployeeDTO setReserver5(String reserver5) {
        this.reserver5 = reserver5
        return this
    }


    /**
     * 设置「保留6」值
     * @param val
     */
    SysEmployeeDTO setReserver6(String reserver6) {
        this.reserver6 = reserver6
        return this
    }


    /**
     * 设置「保留7」值
     * @param val
     */
    SysEmployeeDTO setReserver7(String reserver7) {
        this.reserver7 = reserver7
        return this
    }


    /**
     * 设置「保留8」值
     * @param val
     */
    SysEmployeeDTO setReserver8(String reserver8) {
        this.reserver8 = reserver8
        return this
    }


    /**
     * 设置「保留9」值
     * @param val
     */
    SysEmployeeDTO setReserver9(String reserver9) {
        this.reserver9 = reserver9
        return this
    }


    /**
     * 设置「排序」值
     * @param val
     */
    SysEmployeeDTO setShowOrder(Integer showOrder) {
        this.showOrder = showOrder
        return this
    }


    /**
     * 设置「管理员」值
     * 字典[是否]
     * @param val
     */
    SysEmployeeDTO setSuperUser(Integer superUser) {
        this.superUser = superUser
        return this
    }


    /**
     * 设置「创建时间」值
     * @param val
     */
    SysEmployeeDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「最后修改时间」值
     * @param val
     */
    SysEmployeeDTO setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate
        return this
    }


    /**
     * 设置「钉钉用户标识」值
     * @param val
     */
    SysEmployeeDTO setDDUnionId(String dDUnionId) {
        this.dDUnionId = dDUnionId
        return this
    }


    /**
     * 设置「钉钉用户标识」值
     * @param val
     */
    SysEmployeeDTO setDDUserId(String dDUserId) {
        this.dDUserId = dDUserId
        return this
    }


    /**
     * 设置「消息类型」值
     * @param val
     */
    SysEmployeeDTO setMsgType(Integer msgType) {
        this.msgType = msgType
        return this
    }


    /**
     * 设置「人员状态」值
     * @param val
     */
    SysEmployeeDTO setState(String state) {
        this.state = state
        return this
    }


    /**
     * 设置「UAA用户标识」值
     * @param val
     */
    SysEmployeeDTO setUAAUserId(String uAAUserId) {
        this.uAAUserId = uAAUserId
        return this
    }


    /**
     * 设置「微信用户标识」值
     * @param val
     */
    SysEmployeeDTO setWXWorkUnionId(String wXWorkUnionId) {
        this.wXWorkUnionId = wXWorkUnionId
        return this
    }


    /**
     * 设置「企业微信用户标识」值
     * @param val
     */
    SysEmployeeDTO setWXWorkUserId(String wXWorkUserId) {
        this.wXWorkUserId = wXWorkUserId
        return this
    }

}
