package cn.ibizlab.base.resusers

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.resusers.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[RES_USERS]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ResUsers extends GroovyDataEntityRuntime<ResUsers,ResUsersDTO,ResUsersFilterDTO> {

    public static final String ACTION_CHANGE_PASSWORD = "change_password"
    public static final String ACTION_CURRENT_USER = "current_user"
    public static final String ACTION_USER_COUNTER = "user_counter"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_SIMPLE = "simple"
    public static final String DATASET_UNUSE = "unuse"
    private static ResUsers _instance
    void setInstance(ResUsers instance) {
        _instance = instance
    }
    static ResUsers getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ResUsersDTO create(ResUsersDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ResUsersDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ResUsersDTO update(ResUsersDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ResUsersDTO.class)
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
    ResUsersDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ResUsersDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ResUsersDTO getDraft(ResUsersDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ResUsersDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ResUsersDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ResUsersDTO save(ResUsersDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ResUsersDTO.class)
    }

    /**
     * 行为：修改密码 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHANGE_PASSWORD)
    def changePassword(ResUsersDTO dto) throws Throwable {
        this.execute(ACTION_CHANGE_PASSWORD, dto, ResUsersDTO.class)
    }

    /**
     * 行为：当前登录人的user 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CURRENT_USER)
    def currentUser(ResUsersDTO dto) throws Throwable {
        this.execute(ACTION_CURRENT_USER, dto, ResUsersDTO.class)
    }

    /**
     * 行为：用户计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_USER_COUNTER)
    def userCounter(ResUsersDTO dto) throws Throwable {
        /*
        def objRet = { sys,entity ->
            //Groovy
			def last = entity.callEntity()
			if(entity.getId() != null || entity.getId() != "undefined"){
				last.rawSelect(true);
			}
			return last;
        }.call(this.getSystemRuntime(), dto)
        return objRet
         */
        return this.execute(ACTION_USER_COUNTER, dto, ResUsersCounterDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ResUsersDTO> fetchDefault(ResUsersFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ResUsersDTO.class)
    }

    /**
     * 数据集：简单查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SIMPLE)
    Page<ResUsersDTO> fetchSimple(ResUsersFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SIMPLE, context, ResUsersDTO.class)
    }

    /**
     * 数据集：未被使用的用户 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_UNUSE)
    Page<ResUsersDTO> fetchUnuse(ResUsersFilterDTO context) throws Throwable {
        return this.fetch(DATASET_UNUSE, context, ResUsersDTO.class)
    }

}