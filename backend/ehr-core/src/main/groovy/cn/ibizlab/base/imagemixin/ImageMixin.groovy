package cn.ibizlab.base.imagemixin

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.base.imagemixin.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[IMAGE_MIXIN]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class ImageMixin extends GroovyDataEntityRuntime<ImageMixin,ImageMixinDTO,ImageMixinFilterDTO> {

    public static final String DATASET_DEFAULT = "DEFAULT"
    private static ImageMixin _instance
    void setInstance(ImageMixin instance) {
        _instance = instance
    }
    static ImageMixin getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    ImageMixinDTO create(ImageMixinDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, ImageMixinDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    ImageMixinDTO update(ImageMixinDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, ImageMixinDTO.class)
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
    ImageMixinDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, ImageMixinDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    ImageMixinDTO getDraft(ImageMixinDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, ImageMixinDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(ImageMixinDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    ImageMixinDTO save(ImageMixinDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, ImageMixinDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<ImageMixinDTO> fetchDefault(ImageMixinFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, ImageMixinDTO.class)
    }

}