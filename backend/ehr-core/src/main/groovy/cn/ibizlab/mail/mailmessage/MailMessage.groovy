package cn.ibizlab.mail.mailmessage

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailmessage.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_MESSAGE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailMessage extends GroovyDataEntityRuntime<MailMessage,MailMessageDTO,MailMessageFilterDTO> {

    public static final String ACTION_ADD_FAVORITE = "add_favorite"
    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_PIN = "pin"
    public static final String ACTION_REMOVE_ALL_FAVORITES = "remove_all_favorites"
    public static final String ACTION_REMOVE_FAVORITE = "remove_favorite"
    public static final String ACTION_UNPIN = "unpin"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_COMMON = "common"
    public static final String DATASET_COMMON_ALL = "common_all"
    public static final String DATASET_CUR_USER = "cur_user"
    public static final String DATASET_PINNED = "pinned"
    private static MailMessage _instance
    void setInstance(MailMessage instance) {
        _instance = instance
    }
    static MailMessage getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailMessageDTO create(MailMessageDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailMessageDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailMessageDTO update(MailMessageDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailMessageDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    MailMessageDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailMessageDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailMessageDTO getDraft(MailMessageDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailMessageDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailMessageDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailMessageDTO save(MailMessageDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailMessageDTO.class)
    }

    /**
     * 行为：添加收藏 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ADD_FAVORITE)
    def addFavorite(MailMessageDTO dto) throws Throwable {
        this.execute(ACTION_ADD_FAVORITE, dto, MailMessageDTO.class)
    }

    /**
     * 行为：删除评论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(MailMessageDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, MailMessageDTO.class)
    }

    /**
     * 行为：置顶 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PIN)
    def pin(MailMessageDTO dto) throws Throwable {
        this.execute(ACTION_PIN, dto, MailMessageDTO.class)
    }

    /**
     * 行为：移除所有收藏 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE_ALL_FAVORITES)
    def removeAllFavorites(MailMessageDTO dto) throws Throwable {
        this.execute(ACTION_REMOVE_ALL_FAVORITES, dto, MailMessageDTO.class)
    }

    /**
     * 行为：移除收藏 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE_FAVORITE)
    def removeFavorite(MailMessageDTO dto) throws Throwable {
        this.execute(ACTION_REMOVE_FAVORITE, dto, MailMessageDTO.class)
    }

    /**
     * 行为：取消置顶 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UNPIN)
    def unpin(MailMessageDTO dto) throws Throwable {
        this.execute(ACTION_UNPIN, dto, MailMessageDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailMessageDTO> fetchDefault(MailMessageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailMessageDTO.class)
    }

    /**
     * 数据集：常规 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMON)
    Page<MailMessageDTO> fetchCommon(MailMessageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMON, context, MailMessageDTO.class)
    }

    /**
     * 数据集：常规(全部) 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_COMMON_ALL)
    Page<MailMessageDTO> fetchCommonAll(MailMessageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_COMMON_ALL, context, MailMessageDTO.class)
    }

    /**
     * 数据集：当前用户消息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_CUR_USER)
    Page<MailMessageDTO> fetchCurUser(MailMessageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_CUR_USER, context, MailMessageDTO.class)
    }

    /**
     * 数据集：置顶消息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_PINNED)
    Page<MailMessageDTO> fetchPinned(MailMessageFilterDTO context) throws Throwable {
        return this.fetch(DATASET_PINNED, context, MailMessageDTO.class)
    }

}