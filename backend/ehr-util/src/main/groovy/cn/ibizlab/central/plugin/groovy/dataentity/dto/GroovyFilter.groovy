package cn.ibizlab.central.plugin.groovy.dataentity.dto

import net.ibizsys.central.util.SearchContextDTO

class GroovyFilter<T extends GroovyFilter> extends SearchContextDTO{


    GroovyFilter() {
    }

    /**
     * 设置「页码」值
     * @param page default 0
     */
    T setPage(Integer page) {
        this.set(PARAM_PAGE, page)
        return this
    }

    /**
     * 设置「行数」值
     * @param size default 1000
     */
    T setSize(Integer size) {
        this.set(PARAM_SIZE, size)
        return this
    }

    /**
     * 设置「偏移」值
     * @param offset default 0L
     */
    T setOffset(long offset) {
        this.set(PARAM_OFFSET, offset)
        return this
    }

}