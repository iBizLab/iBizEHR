import { EventBase, IViewEvent } from '@ibiz-template/runtime';
export interface X6DesignViewEvent extends IViewEvent {
    /**
     * 加载成功
     *
     * @type {{
     *     event: EventBase;
     *     emitArgs: undefined;
     *   }}
     * @memberof X6DesignViewEvent
     */
    onLoadSuccess: {
        event: EventBase;
        emitArgs: undefined;
    };
    /**
     * 保存成功事件
     *
     * @author zhanghengfeng
     * @date 2024-01-12 09:01:36
     * @type {{
     *     event: EventBase;
     *     emitArgs: undefined;
     *   }}
     */
    onSaveSuccess: {
        event: EventBase;
        emitArgs: undefined;
    };
    /**
     * 刷新视图
     *
     * @author zhanghengfeng
     * @date 2025-01-09 19:01:31
     * @type {{
     *     event: EventBase;
     *     emitArgs: undefined;
     *   }}
     */
    onRefreshView: {
        event: EventBase;
        emitArgs: undefined;
    };
    /**
     * 逻辑所有者改变
     *
     * @author zhanghengfeng
     * @date 2025-03-17 20:03:37
     * @type {({
     *     event: EventBase & {
     *       logicHolder: number;
     *     };
     *     emitArgs: {
     *       logicHolder: number;
     *     };
     *   })}
     */
    onLogicHolderChange: {
        event: EventBase & {
            logicHolder: number;
        };
        emitArgs: {
            logicHolder: number;
        };
    };
}
