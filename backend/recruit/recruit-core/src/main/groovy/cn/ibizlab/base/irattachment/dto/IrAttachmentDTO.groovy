package cn.ibizlab.base.irattachment.dto

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
class IrAttachmentDTO extends GroovyDTO<IrAttachmentDTO> {

    /**
     * 「oss文件标识」
     */
    @JsonProperty("file_id")
    String fileId
    /**
     * 「资源标识」
     */
    @JsonProperty("res_id")
    String resId
    /**
     * 「访问令牌」
     */
    @JsonProperty("access_token")
    String accessToken
    /**
     * 「校验码/SHA1」
     */
    @JsonProperty("checksum")
    String checksum
    /**
     * 「公司」
     */
    @JsonProperty("company_id")
    String companyId
    /**
     * 「建立时间」
     */
    @JsonProperty("create_date")
    Timestamp createDate
    /**
     * 「建立人」
     */
    @JsonProperty("create_uid")
    String createUid
    /**
     * 「描述」
     */
    @JsonProperty("description")
    String description
    /**
     * 「文件大小」
     */
    @JsonProperty("file_size")
    Integer fileSize
    /**
     * 「标识」
     */
    @JsonProperty("id")
    String id
    /**
     * 「索引内容」
     */
    @JsonProperty("index_content")
    String indexContent
    /**
     * 「Mime类型」
     */
    @JsonProperty("mimetype")
    String mimetype
    /**
     * 「名称」
     */
    @JsonProperty("name")
    String name
    /**
     * 「原始（未优化，未调整大小）附件」
     */
    @JsonProperty("original_id")
    String originalId
    /**
     * 「是公开文件」
     * 字典[是否]
     */
    @JsonProperty("published")
    Integer published
    /**
     * 「资源字段」
     */
    @JsonProperty("res_field")
    String resField
    /**
     * 「资源模型」
     */
    @JsonProperty("res_model")
    String resModel
    /**
     * 「存储的文件名」
     */
    @JsonProperty("store_fname")
    String storeFname
    /**
     * 「类型」
     */
    @JsonProperty("type")
    String type
    /**
     * 「网址」
     */
    @JsonProperty("url")
    String url
    /**
     * 「更新时间」
     */
    @JsonProperty("write_date")
    Timestamp writeDate
    /**
     * 「更新人」
     */
    @JsonProperty("write_uid")
    String writeUid

    /**
     * 设置「oss文件标识」值
     * @param val
     */
    IrAttachmentDTO setFileId(String fileId) {
        this.fileId = fileId
        return this
    }


    /**
     * 设置「资源标识」值
     * @param val
     */
    IrAttachmentDTO setResId(String resId) {
        this.resId = resId
        return this
    }


    /**
     * 设置「访问令牌」值
     * @param val
     */
    IrAttachmentDTO setAccessToken(String accessToken) {
        this.accessToken = accessToken
        return this
    }


    /**
     * 设置「校验码/SHA1」值
     * @param val
     */
    IrAttachmentDTO setChecksum(String checksum) {
        this.checksum = checksum
        return this
    }


    /**
     * 设置「公司」值
     * @param val
     */
    IrAttachmentDTO setCompanyId(String companyId) {
        this.companyId = companyId
        return this
    }


    /**
     * 设置「建立时间」值
     * @param val
     */
    IrAttachmentDTO setCreateDate(Timestamp createDate) {
        this.createDate = createDate
        return this
    }


    /**
     * 设置「建立人」值
     * @param val
     */
    IrAttachmentDTO setCreateUid(String createUid) {
        this.createUid = createUid
        return this
    }


    /**
     * 设置「描述」值
     * @param val
     */
    IrAttachmentDTO setDescription(String description) {
        this.description = description
        return this
    }


    /**
     * 设置「文件大小」值
     * @param val
     */
    IrAttachmentDTO setFileSize(Integer fileSize) {
        this.fileSize = fileSize
        return this
    }


    /**
     * 设置「标识」值
     * @param val
     */
    IrAttachmentDTO setId(String id) {
        this.id = id
        return this
    }


    /**
     * 设置「索引内容」值
     * @param val
     */
    IrAttachmentDTO setIndexContent(String indexContent) {
        this.indexContent = indexContent
        return this
    }


    /**
     * 设置「Mime类型」值
     * @param val
     */
    IrAttachmentDTO setMimetype(String mimetype) {
        this.mimetype = mimetype
        return this
    }


    /**
     * 设置「名称」值
     * @param val
     */
    IrAttachmentDTO setName(String name) {
        this.name = name
        return this
    }


    /**
     * 设置「原始（未优化，未调整大小）附件」值
     * @param val
     */
    IrAttachmentDTO setOriginalId(String originalId) {
        this.originalId = originalId
        return this
    }


    /**
     * 设置「是公开文件」值
     * 字典[是否]
     * @param val
     */
    IrAttachmentDTO setPublished(Integer published) {
        this.published = published
        return this
    }


    /**
     * 设置「资源字段」值
     * @param val
     */
    IrAttachmentDTO setResField(String resField) {
        this.resField = resField
        return this
    }


    /**
     * 设置「资源模型」值
     * @param val
     */
    IrAttachmentDTO setResModel(String resModel) {
        this.resModel = resModel
        return this
    }


    /**
     * 设置「存储的文件名」值
     * @param val
     */
    IrAttachmentDTO setStoreFname(String storeFname) {
        this.storeFname = storeFname
        return this
    }


    /**
     * 设置「类型」值
     * @param val
     */
    IrAttachmentDTO setType(String type) {
        this.type = type
        return this
    }


    /**
     * 设置「网址」值
     * @param val
     */
    IrAttachmentDTO setUrl(String url) {
        this.url = url
        return this
    }


    /**
     * 设置「更新时间」值
     * @param val
     */
    IrAttachmentDTO setWriteDate(Timestamp writeDate) {
        this.writeDate = writeDate
        return this
    }


    /**
     * 设置「更新人」值
     * @param val
     */
    IrAttachmentDTO setWriteUid(String writeUid) {
        this.writeUid = writeUid
        return this
    }

}
