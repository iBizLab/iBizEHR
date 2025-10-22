package cn.ibizlab.mail.mailthread

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.mail.mailthread.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[MAIL_THREAD]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class MailThread extends GroovyDataEntityRuntime<MailThread,MailThreadDTO,MailThreadFilterDTO> {

    public static final String ACTION_MAIL_MESSAGE_POST = "mail_message_post"
    public static final String ACTION_MAIL_TRACK = "mail_track"
    public static final String ACTION_MESSAGE_NOTIFY = "message_notify"
    public static final String ACTION_MESSAGE_POST = "message_post"
    public static final String ACTION_MESSAGE_POST_WITH_SOURCE = "message_post_with_source"
    public static final String ACTION_MESSAGE_TRACK = "message_track"
    public static final String ACTION_PROCESS_ATTACHMENTS_FOR_POST = "process_attachments_for_post"
    public static final String ACTION_TRACK_DISCARD = "track_discard"
    public static final String ACTION_TRACK_FINALIZE = "track_finalize"
    public static final String ACTION_TRACK_PREPARE = "track_prepare"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static MailThread _instance
    void setInstance(MailThread instance) {
        _instance = instance
    }
    static MailThread getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    MailThreadDTO create(MailThreadDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, MailThreadDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    MailThreadDTO update(MailThreadDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, MailThreadDTO.class)
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
    MailThreadDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, MailThreadDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    MailThreadDTO getDraft(MailThreadDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, MailThreadDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(MailThreadDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    MailThreadDTO save(MailThreadDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, MailThreadDTO.class)
    }

    /**
     * 行为：消息发送代理 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIL_MESSAGE_POST)
    def mailMessagePost(MailThreadDTO dto) throws Throwable {
        /*
        def objRet = { sys,entity ->
            //Groovy
			// 从参数对象获取model属性值
			def modelName = entity.get("model")
			// 从参数对象获取资源属性值
			def resId = entity.get("res_id")
			// 通过系统运行时获取实体运行时对象
			def deRuntime = sys.dataentity(modelName)
			if(deRuntime == null){
			    throw new Exception(String.format("消息实体异常"));
			}
			//构造实体对象
			def de = deRuntime.createEntity()
			de.set(deRuntime.getKeyPSDEField().getCodeName(),resId)
			// 判断消息实体发送权限,暂定read,实际上由各实体中自行定义消息发送权限标识
			def _mail_post_access = "read"
			def messagePostMethod = "message_post"
			if(deRuntime.testDataAccessAction(de,_mail_post_access)){
			    Object[] args = [entity];
			    return deRuntime.executeAction(messagePostMethod,null,args)
			}else{
			    throw new net.ibizsys.runtime.dataentity.DataEntityRuntimeException(deRuntime, String.format("不具备操作能力"));
			}
        }.call(this.getSystemRuntime(), dto)
         */
        this.execute(ACTION_MAIL_MESSAGE_POST, dto, MailThreadDTO.class)
    }

    /**
     * 行为：构造跟踪数据 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MAIL_TRACK)
    def mailTrack(MailThreadDTO dto) throws Throwable {
        this.execute(ACTION_MAIL_TRACK, dto, MailThreadDTO.class)
    }

    /**
     * 行为：通知消息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MESSAGE_NOTIFY)
    def messageNotify(MailThreadDTO dto) throws Throwable {
        this.execute(ACTION_MESSAGE_NOTIFY, dto, MailThreadDTO.class)
    }

    /**
     * 行为：消息发送 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MESSAGE_POST)
    def messagePost(MailThreadDTO dto) throws Throwable {
        this.execute(ACTION_MESSAGE_POST, dto, MailThreadDTO.class)
    }

    /**
     * 行为：从模板资源构造消息并发送 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MESSAGE_POST_WITH_SOURCE)
    def messagePostWithSource(MailThreadDTO dto) throws Throwable {
        this.execute(ACTION_MESSAGE_POST_WITH_SOURCE, dto, MailThreadDTO.class)
    }

    /**
     * 行为：跟踪消息 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_MESSAGE_TRACK)
    def messageTrack(MailThreadDTO dto) throws Throwable {
        this.execute(ACTION_MESSAGE_TRACK, dto, MailThreadDTO.class)
    }

    /**
     * 行为：发送消息将附件归属转换至主对象中 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_PROCESS_ATTACHMENTS_FOR_POST)
    def processAttachmentsForPost(MailThreadDTO dto) throws Throwable {
        this.execute(ACTION_PROCESS_ATTACHMENTS_FOR_POST, dto, MailThreadDTO.class)
    }

    /**
     * 行为：新建时属性跟踪 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_TRACK_DISCARD)
    def trackDiscard(MailThreadDTO dto) throws Throwable {
        this.execute(ACTION_TRACK_DISCARD, dto, MailThreadDTO.class)
    }

    /**
     * 行为：跟踪数据建立 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_TRACK_FINALIZE)
    def trackFinalize(MailThreadDTO dto) throws Throwable {
        this.execute(ACTION_TRACK_FINALIZE, dto, MailThreadDTO.class)
    }

    /**
     * 行为：属性跟踪准备 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_TRACK_PREPARE)
    def trackPrepare(MailThreadDTO dto) throws Throwable {
        this.execute(ACTION_TRACK_PREPARE, dto, MailThreadDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<MailThreadDTO> fetchDefault(MailThreadFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, MailThreadDTO.class)
    }

}