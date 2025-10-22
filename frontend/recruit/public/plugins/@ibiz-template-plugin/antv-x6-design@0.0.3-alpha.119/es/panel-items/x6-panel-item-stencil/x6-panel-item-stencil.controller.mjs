import { PanelItemController, getControl, ScriptFactory, UIActionUtil, getUIActionById } from '@ibiz-template/runtime';
import { Stencil } from '../../node_modules/.pnpm/@antv_x6-plugin-stencil@2.1.5_@antv_x6@2.18.1/node_modules/@antv/x6-plugin-stencil/es/index.mjs';
import { RuntimeModelError, awaitTimeout } from '@ibiz-template/core';
import { h } from 'vue';
import { X6PanelItemStencilState } from './x6-panel-item-stencil.state.mjs';
import ActionPopover from './action-popover/action-popover.mjs';

"use strict";
var __defProp = Object.defineProperty;
var __defNormalProp = (obj, key, value) => key in obj ? __defProp(obj, key, { enumerable: true, configurable: true, writable: true, value }) : obj[key] = value;
var __publicField = (obj, key, value) => {
  __defNormalProp(obj, typeof key !== "symbol" ? key + "" : key, value);
  return value;
};
class X6PanelItemStencilController extends PanelItemController {
  constructor() {
    super(...arguments);
    /**
     * 挂载容器
     *
     * @author chitanda
     * @date 2023-11-11 15:11:06
     * @protected
     * @type {HTMLDivElement}
     */
    __publicField(this, "container");
    __publicField(this, "s");
    /**
     * @description 行为参数
     * @type {IData}
     * @memberof X6PanelItemStencilController
     */
    __publicField(this, "actionParams", {});
    /**
     * @description 行为模型集合
     * @type {IAppDEUIAction[]}
     * @memberof X6PanelItemStencilController
     */
    __publicField(this, "actionModels", []);
    /**
     * @description 是否显示分组头
     * @type {boolean}
     * @memberof X6PanelItemStencilController
     */
    __publicField(this, "showGroupHeader", false);
    /**
     * @description 节点数组
     * @type {IData[]}
     * @memberof X6PanelItemStencilController
     */
    __publicField(this, "nodes", []);
    /**
     * 是否显示逻辑所有者
     *
     * @author zhanghengfeng
     * @date 2025-03-17 19:03:08
     * @type {boolean}
     */
    __publicField(this, "showLogicHolder", false);
    /**
     * 逻辑所有者
     *
     * @author zhanghengfeng
     * @date 2025-03-17 19:03:23
     * @type {number}
     */
    __publicField(this, "logicHolder", 3);
    /**
     * 前台代码表id
     *
     * @author zhanghengfeng
     * @date 2025-03-17 19:03:36
     * @type {string}
     */
    __publicField(this, "frontCodeListId");
  }
  get x6Controller() {
    return this.panel.panelItems.x6_panel_item;
  }
  /**
   * 节点适配器
   *
   * @author chitanda
   * @date 2023-11-16 18:11:29
   * @type {X6NodeServiceProvider}
   */
  get provider() {
    return this.x6.node.provider;
  }
  get x6() {
    return this.x6Controller.x6;
  }
  createState() {
    var _a;
    return new X6PanelItemStencilState((_a = this.parent) == null ? void 0 : _a.state);
  }
  /**
   * 视图控制器
   *
   * @author zhanghengfeng
   * @date 2025-03-17 19:03:43
   * @readonly
   * @type {X6DesignViewController}
   */
  get view() {
    return this.panel.view;
  }
  /**
   * 初始化
   *
   * @author zhanghengfeng
   * @date 2025-03-17 19:03:09
   * @protected
   * @return {*}  {Promise<void>}
   */
  async onInit() {
    var _a, _b;
    await super.onInit();
    const editorParams = (_a = this.model.editor) == null ? void 0 : _a.editorParams;
    this.showLogicHolder = (editorParams == null ? void 0 : editorParams.showLogicHolder) === "true";
    if (this.showLogicHolder) {
      this.logicHolder = ((_b = this.view.state.data) == null ? void 0 : _b.logicholder) || 3;
      this.initCodeList();
      this.view.evt.on("onLogicHolderChange", (e) => {
        var _a2;
        if (!e) {
          return;
        }
        this.logicHolder = e.logicHolder || 3;
        (_a2 = this.s) == null ? void 0 : _a2.dispose();
        this.s = void 0;
        if (this.container) {
          this.initStencil(this.container);
        }
      });
    }
  }
  /**
   * 初始化代码表
   *
   * @author zhanghengfeng
   * @date 2025-03-17 19:03:16
   * @protected
   * @return {*}  {void}
   */
  initCodeList() {
    const node = getControl(this.view.model, "node");
    if (!node) {
      throw new RuntimeModelError(this.view, "\u672A\u627E\u5230 node \u8868\u5355\u6A21\u578B");
    }
    const pages = node.deformPages;
    if (!Array.isArray(pages) || !pages.length) {
      return;
    }
    const page = pages[0];
    const formDetails = page.deformDetails;
    if (!Array.isArray(formDetails)) {
      return;
    }
    const formDetail = formDetails.find(
      (item) => item.codeName === "front_type"
    );
    if (!formDetail) {
      return;
    }
    const editor = formDetail.editor;
    if (editor) {
      this.frontCodeListId = editor.appCodeListId;
    }
  }
  /**
   *  加载代码表
   *
   * @author fangZhiHao
   * @date 2024-07-24 09:07:24
   * @param {string} appCodeListId
   * @return {*}
   */
  async loadCodeList(appCodeListId) {
    let codeListItems = [];
    const app = await ibiz.hub.getApp(this.model.appId);
    const codeItems = await app.codeList.get(
      appCodeListId,
      this.panel.context,
      this.panel.params
    );
    if (this.showGroupHeader) {
      codeListItems = codeItems;
    } else {
      codeListItems = codeItems.filter(
        (item) => Array.isArray(item.children) && item.children.length
      );
    }
    codeListItems.forEach((item) => {
      if (Array.isArray(item.children)) {
        item.children.forEach((child) => {
          if (typeof child.data === "string") {
            child.data = ScriptFactory.execSingleLine(child.data);
          }
        });
      }
    });
    return codeListItems;
  }
  /**
   * 填充界面行为
   *
   * @author fangZhiHao
   * @date 2024-07-24 19:07:45
   * @param {CodeListItem[]} codeListItems
   */
  fillAction(codeListItems) {
    codeListItems.forEach((item) => {
      const action = this.actionParams[item.id];
      if (action) {
        const data = item.data || {};
        Object.assign(item, { data: { action, ...data } });
      }
      if (Array.isArray(item.children)) {
        item.children.forEach((x) => {
          if (action) {
            const data = x.data || {};
            Object.assign(x, { data: { action, ...data } });
          }
        });
      }
    });
  }
  /**
   * 挂载 stencil 节点
   *
   * @author fangZhiHao
   * @date 2024-07-24 09:07:35
   * @param {CodeListItem[]} codeListItems
   */
  loadNodes(codeListItems) {
    this.nodes = [];
    codeListItems.forEach((item) => {
      let nodes = [];
      if (item.children) {
        nodes = item.children.map((codeItem) => {
          const param = codeItem;
          if (param.data && param.data.action && param.data.action.remove) {
            Object.assign(param.data, {
              actionID: param.data.action.remove
            });
          }
          const node = this.x6.g.createNode(
            this.provider.createMaterialCell(param)
          );
          return node;
        });
      }
      const data = item.data || {};
      if (data.action && data.action.add) {
        const addNode = this.x6.g.createNode(
          this.provider.createMaterialAddCell({
            id: "add",
            data: { actionID: data.action.add },
            text: "\u65B0\u589E",
            value: "add"
          })
        );
        nodes.push(addNode);
      }
      this.nodes.push(...nodes);
      this.s.load(nodes, item.id);
    });
  }
  /**
   *  设置事件
   *
   * @author fangZhiHao
   * @date 2024-07-24 18:07:17
   * @param {IData} action
   * @param {CodeListItem[]} codeListItems
   */
  initEevnt() {
    const graphs = this.s.graphs;
    Object.keys(this.actionParams).forEach((key) => {
      const graph = graphs[key];
      if (graph) {
        graph.on("render:done", () => {
          const nodes = graph.container.querySelectorAll(".x6-node");
          nodes.forEach((node) => {
            const dataId = node.getAttribute("data-cell-id");
            const cell = graph.getCellById(dataId);
            if (this.actionParams[key].remove) {
              this.registerNodeEvent(
                node,
                cell,
                ".ibiz-material-node-delete-icon"
              );
            }
            if (this.actionParams[key].add) {
              this.registerNodeEvent(node, cell, ".ibiz-material-add-node");
            }
          });
        });
      }
    });
  }
  /**
   *  注册节点事件
   *
   * @author fangZhiHao
   * @date 2024-07-24 19:07:15
   * @param {string} className
   * @param {IData} action
   * @param {string} key
   */
  async registerNodeEvent(container, cell, className) {
    const element = container.querySelector(className);
    if (element) {
      if (element.classList.contains("is-active")) {
        return;
      }
      element.classList.add("is-active");
      element.addEventListener(
        "mousedown",
        async (event) => {
          if (cell.data && cell.data.data && cell.data.data.actionID) {
            event.preventDefault();
            event.stopPropagation();
            const uiActionIds = cell.data.data.actionID.split(";");
            let uiActionId;
            if (uiActionIds.length > 1) {
              const actions = this.actionModels.filter(
                (model) => model.id && uiActionIds.includes(model.id)
              );
              const overlay = ibiz.overlay.createPopover(
                (modal) => h(ActionPopover, { modal, actions }),
                void 0,
                {
                  width: 120,
                  noArrow: false,
                  autoClose: true,
                  placement: "right",
                  modalClass: "ibiz-stencil-action-popover"
                }
              );
              await overlay.present(event.target);
              const result = await overlay.onWillDismiss();
              if (result.ok && result.data)
                uiActionId = result.data[0].id;
            } else {
              uiActionId = uiActionIds[0];
            }
            if (!uiActionId)
              return;
            await UIActionUtil.execAndResolved(
              uiActionId,
              {
                context: this.panel.context,
                params: {
                  panelDataParent: this.dataParent.model.id,
                  cellid: cell.data.id,
                  ...this.panel.params
                },
                data: [this.data],
                view: this.panel.view,
                event,
                noWaitRoute: true
              },
              this.model.appId
            );
          }
        },
        { captrue: true, passive: false }
      );
    }
  }
  /**
   * 重新加载代码表
   *
   * @author fangZhiHao
   * @date 2024-07-24 20:07:19
   * @param {IData} action
   */
  async refresh() {
    var _a;
    const graphs = this.s.graphs;
    Object.values(graphs).forEach((graph) => {
      graph.clearCells({ refresh: true });
    });
    const { appCodeListId } = this.model.editor;
    if (appCodeListId) {
      const codeListItems = await this.loadCodeList(appCodeListId);
      this.fillAction(codeListItems);
      this.loadNodes(codeListItems);
      await ((_a = this.provider) == null ? void 0 : _a.refresh(this.panel.context, this.panel.params));
      this.initEevnt();
    }
  }
  /**
   * @description 初始化编辑器参数
   * @param {IData} editorParams
   * @memberof X6PanelItemStencilController
   */
  async initEditorParams(editorParams) {
    if (editorParams) {
      await Promise.all(
        Object.keys(editorParams).map(async (key) => {
          const keys = key.split("_");
          if (keys.length === 3 && keys[2].includes("ACTION")) {
            const action = this.actionParams[keys[0]] || {};
            const actionName = keys[1].toLowerCase();
            const actionId = editorParams[key];
            this.actionParams[keys[0]] = {
              ...action,
              [actionName]: action[actionName] ? "".concat(action[actionName], ";").concat(actionId) : actionId
            };
            const actionModel = await getUIActionById(
              actionId,
              this.model.appId
            );
            if (actionModel) {
              const find = this.actionModels.find(
                (model) => model.id === actionModel.id
              );
              if (!find)
                this.actionModels.push(actionModel);
            }
          }
        })
      );
      if (editorParams.SHOWHEADER) {
        this.showGroupHeader = editorParams.SHOWHEADER === "true" || editorParams.SHOWHEADER === "TRUE";
      }
    }
  }
  async initStencil(container, count = 0) {
    if (this.s) {
      return;
    }
    if (!this.x6Controller || !this.x6) {
      if (count > 10) {
        throw new Error(
          "X6PanelItemStencil: \u521D\u59CB\u5316 stencil \u5B9E\u4F8B\u5931\u8D25\uFF0C\u672A\u80FD\u7B49\u627E\u5230 x6 \u63A7\u5236\u5668"
        );
      }
      await awaitTimeout(300);
      return this.initStencil(container);
    }
    this.container = container;
    if (this.container) {
      let codeList = null;
      let codeListItems = [];
      const { editor } = this.model;
      if (editor) {
        let { appCodeListId, editorParams = {} } = editor;
        await this.initEditorParams(editorParams);
        if (this.showLogicHolder && this.frontCodeListId && this.logicHolder === 2) {
          appCodeListId = this.frontCodeListId;
        }
        if (appCodeListId) {
          const app = await ibiz.hub.getApp(this.model.appId);
          codeList = app.codeList.getCodeList(appCodeListId);
          codeListItems = await this.loadCodeList(appCodeListId);
          this.fillAction(codeListItems);
        }
      }
      if (!codeList) {
        throw new RuntimeModelError(this.model, "\u672A\u914D\u7F6E\u7D20\u6750\u533A\u4EE3\u7801\u8868");
      }
      const { x6 } = this;
      this.s = new Stencil({
        target: this.x6.g,
        search(cell, keyword) {
          if (!keyword) {
            return true;
          }
          const data = cell.getData();
          const text = data && data.text || "";
          const searchText = keyword.trim().toLowerCase();
          return text.toLowerCase().indexOf(searchText) !== -1;
        },
        title: "\u7D20\u6750",
        placeholder: "\u8282\u70B9\u540D\u79F0/\u8282\u70B9\u6807\u8BC6",
        notFoundText: codeList.emptyText,
        collapsable: false,
        stencilGraphHeight: 0,
        layoutOptions: {
          columns: 3,
          center: false
        },
        getDragNode: (draggingNode, _options) => {
          const codeItem = draggingNode.data;
          const node = x6.g.createNode(this.provider.createDragCell(codeItem));
          return node;
        },
        validateNode: (droppingNode, options) => {
          return this.provider.validateNode(droppingNode, options);
        },
        groups: codeListItems.map((item) => {
          return {
            name: item.id,
            title: item.text,
            graphHeight: 0,
            collapsable: true,
            collapsed: item.userData === "contract"
          };
        })
      });
      this.container.appendChild(this.s.container);
      this.loadNodes(codeListItems);
      this.initEevnt();
    } else {
      throw new Error("X6PanelItemStencil: \u521D\u59CB\u5316\u5BB9\u5668\u4E3A\u7A7A not found");
    }
  }
}

export { X6PanelItemStencilController };
