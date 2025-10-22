import { EventBase, IComponentEvent } from '@ibiz-template/runtime';

export interface X6ControllerEvent extends IComponentEvent {
  onBeforeLoad: {
    event: EventBase;
    emitArgs: undefined;
  };
  onLoadSuccess: {
    event: EventBase;
    emitArgs: undefined;
  };

  /**
   * 节点新建
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:22
   * @type {{
   *     event: EventBase;
   *     emitArgs: undefined;
   *   }}
   */
  onNodeCreated: {
    event: EventBase;
    emitArgs: undefined;
  };

  /**
   * 节点更新
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:34
   * @type {{
   *     event: EventBase;
   *     emitArgs: undefined;
   *   }}
   */
  onNodeUpdated: {
    event: EventBase;
    emitArgs: undefined;
  };

  /**
   * 节点删除
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:48
   * @type {{
   *     event: EventBase;
   *     emitArgs: undefined;
   *   }}
   */
  onNodeRemoved: {
    event: EventBase;
    emitArgs: undefined;
  };

  /**
   * 连线新建
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:00
   * @type {{
   *     event: EventBase;
   *     emitArgs: undefined;
   *   }}
   */
  onLinkCreated: {
    event: EventBase;
    emitArgs: undefined;
  };

  /**
   * 连线更新
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:15
   * @type {{
   *     event: EventBase;
   *     emitArgs: undefined;
   *   }}
   */
  onLinkUpdated: {
    event: EventBase;
    emitArgs: undefined;
  };

  /**
   * 连线删除
   *
   * @author zhanghengfeng
   * @date 2025-02-27 21:02:26
   * @type {{
   *     event: EventBase;
   *     emitArgs: undefined;
   *   }}
   */
  onLinkRemoved: {
    event: EventBase;
    emitArgs: undefined;
  };
}
