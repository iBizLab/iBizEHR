package cn.ibizlab.central.plugin.groovy.dataentity

import cn.ibizlab.central.plugin.groovy.dataentity.action.GroovyActionPlugin
import cn.ibizlab.central.plugin.groovy.dataentity.ds.GroovyFetchPlugin
import cn.ibizlab.central.plugin.groovy.dataentity.dto.GroovyDTO
import cn.ibizlab.central.plugin.groovy.dataentity.dto.GroovyFilter
import net.ibizsys.central.ISystemRuntime
import net.ibizsys.central.plugin.extension.dataentity.ExtensionDataEntityRuntime
import net.ibizsys.central.util.IEntity
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.runtime.dataentity.action.IDEActionPluginRuntime
import net.ibizsys.runtime.dataentity.ds.IDEDataSetPluginRuntime
import net.ibizsys.runtime.util.IAction
import net.ibizsys.runtime.util.IEntityBase
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl

class GroovyExtDERuntime <T extends GroovyExtDERuntime,D extends GroovyDTO,F extends GroovyFilter> extends ExtensionDataEntityRuntime{

    public static final Log log = LogFactory.getLog(GroovyExtDERuntime.class)
    public static final String ACTION_CREATE = "Create"
    public static final String ACTION_UPDATE = "Update"
    public static final String ACTION_REMOVE = "Remove"
    public static final String ACTION_GET = "Get"
    public static final String ACTION_GETDRAFT = "GetDraft"
    public static final String ACTION_CHECKKEY = "CheckKey"
    public static final String ACTION_SAVE = "Save"

    void setInstance(T instance) {

    }

    ISystemRuntime sys

    @Override
    protected void onInit() throws Exception {
        super.onInit()
        this.setInstance(this)
        sys = this.getSystemRuntime()
    }

    D entity() {
        return (D) super.createEntity()
    }

    F filter() {
        return (F) super.createSearchContext()
    }

    List<D> list() {
        return (List<D>) super.createEntityList()
    }

    @Override
    int checkKeyState(Object objKey) {
        return super.checkKeyState(objKey)
    }

    @Override
    D get(Object objKey) throws Throwable {
        return super.get(objKey)
    }

    @Override
    D get(Object objKey, boolean bTryMode) {
        return super.get(objKey, bTryMode)
    }

    @Override
    void create(IEntityBase iEntityBase) throws Throwable {
        super.create(iEntityBase)
    }

    @Override
    void update(IEntityBase iEntityBase) throws Throwable {
        super.update(iEntityBase)
    }

    @Override
    void remove(Object objKey) throws Throwable {
        super.remove(objKey)
    }


    protected <E> Object execute(String strActionName, Object arg, Class<E> clazz) throws Throwable {
        log.debug("ACTION: [${this.getClass().getSimpleName()}]/[${strActionName.uncapitalize()}]")
        Object ret = doExecuteActionReal(strActionName, this.getPSDEAction(strActionName), [arg] as Object[], null)
        if (!clazz || Void.isAssignableFrom(clazz))
            return ret
        if (ret == null && clazz.isInstance(arg))
            return arg
        else if (ret && clazz.isInstance(ret))
            return ret
        else if (GroovyDTO.isAssignableFrom(clazz) && ret instanceof IEntity)
            return convertOne(ret, clazz)
        else
            return ret
    }

    protected <E> Collection<E> executeForList(String strActionName, Object arg, Class<E> clazz) throws Throwable {
        log.debug("ACTION: [${this.getClass().getSimpleName()}]/[${strActionName.uncapitalize()}]")
        Object ret = doExecuteActionReal(strActionName, this.getPSDEAction(strActionName), [arg] as Object[], null)
        if (!clazz || Void.isAssignableFrom(clazz))
            return ret
        if (ret instanceof Collection) {
            Collection list = (Collection) ret
            if (list?.every { clazz.isInstance(it) }) {
                return (Collection<E>) list
            }
            else if (GroovyDTO.isAssignableFrom(clazz)){
                return list.collect { convertOne(it, clazz) }
            }

        }
        return ret as Collection<E>
    }


    protected <E extends GroovyDTO> Page<E> fetch(String strDataSetName, Object arg, Class<E> clazz) throws Throwable {
        log.debug("FETCH: [${this.getClass().getSimpleName()}]/[${strDataSetName.uncapitalize()}]")
        Object ret = doFetchDataSetReal(strDataSetName, this.getPSDEDataSet(strDataSetName), [arg] as Object[], null)
        if (!clazz)
            return ret
        if (ret == null)
            return null
        if (ret instanceof Page) {
            Page page = (Page) ret
            if (page.content?.every { clazz.isInstance(it) }) {
                return (Page<E>) page
            } else {
                // Page 但元素类型不匹配，需要转换
                def newList = page.content.collect { convertOne(it, clazz) }
                return new PageImpl<>(newList, page.pageable, page.totalElements)
            }
        }

        if (ret instanceof Collection) {
            def list = ret.collect { convertOne(it, clazz) }
            return new PageImpl<>(list)
        }

        // 单对象情况
        return new PageImpl<>([convertOne(ret, clazz)])
    }

    public <E extends GroovyDTO> E convertOne(Object item, Class<E> clazz) {
        if(item == null)
            return null
        if (clazz.isInstance(item))
            return (E) item
        return clazz.newInstance().from(item)
    }


    /**
     * 注册实体行为插件运行时对象接口
     *
     * @param strAction
     * @param iAction
     * @return
     */
    IDEActionPluginRuntime registerDEActionPluginRuntime(String strAction, IAction iAction) {
        IDEActionPluginRuntime iDEActionPluginRuntime = new GroovyActionPlugin() {
            @Override
            protected Object onExecute(Object args) throws Throwable {
                return iAction.execute(args)
            }
        }

        this.registerDEActionPluginRuntime(strAction, iDEActionPluginRuntime)
        return iDEActionPluginRuntime
    }

    /**
     * 注册实体结果集插件运行时对象接口
     *
     * @param strDataSet
     * @param iDataSet
     * @return
     */
    protected IDEDataSetPluginRuntime registerDEDataSetPluginRuntime(String strDataSet, IAction iAction) {
        IDEDataSetPluginRuntime iDEDataSetPluginRuntime = new GroovyFetchPlugin() {
            @Override
            protected Object onFetch(ISearchContextDTO args) throws Throwable {
                return iAction.execute(args)
            }
        }

        this.registerDEDataSetPluginRuntime(strDataSet, iDEDataSetPluginRuntime)
        return iDEDataSetPluginRuntime
    }



}