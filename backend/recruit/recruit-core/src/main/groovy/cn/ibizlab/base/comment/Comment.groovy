package cn.ibizlab.base.comment

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.comment.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[COMMENT]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class Comment extends GroovyDataEntityRuntime<Comment,CommentDTO,CommentFilterDTO> {

    public static final String ACTION_DELETE = "delete"
    public static final String ACTION_NO_TOP = "no_top"
    public static final String ACTION_TOP = "top"
    public static final String DATASET_DEFAULT = "DEFAULT"
    private static Comment _instance
    void setInstance(Comment instance) {
        _instance = instance
    }
    static Comment getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    CommentDTO create(CommentDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, CommentDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    CommentDTO update(CommentDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, CommentDTO.class)
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
    CommentDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, CommentDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    CommentDTO getDraft(CommentDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, CommentDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(CommentDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    CommentDTO save(CommentDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, CommentDTO.class)
    }

    /**
     * 行为：删除评论 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_DELETE)
    def delete(CommentDTO dto) throws Throwable {
        this.execute(ACTION_DELETE, dto, CommentDTO.class)
    }

    /**
     * 行为：取消置顶 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_NO_TOP)
    def noTop(CommentDTO dto) throws Throwable {
        this.execute(ACTION_NO_TOP, dto, CommentDTO.class)
    }

    /**
     * 行为：评论置顶 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_TOP)
    def top(CommentDTO dto) throws Throwable {
        this.execute(ACTION_TOP, dto, CommentDTO.class)
    }

    /**
     * 数据集：数据集 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<CommentDTO> fetchDefault(CommentFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, CommentDTO.class)
    }

}