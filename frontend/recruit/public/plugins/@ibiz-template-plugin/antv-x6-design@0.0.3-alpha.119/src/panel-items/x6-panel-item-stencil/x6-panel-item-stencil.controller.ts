/* eslint-disable prefer-const */
import {
  IModal,
  IModalData,
  getControl,
  CodeListItem,
  UIActionUtil,
  ScriptFactory,
  getUIActionById,
  PanelItemController,
} from '@ibiz-template/runtime';
import {
  IPanelField,
  IDEEditForm,
  IAppCodeList,
  IDEFormDetail,
  IAppDEUIAction,
  ICodeListEditor,
} from '@ibiz/model-core';
import { Stencil } from '@antv/x6-plugin-stencil';
import { RuntimeModelError, awaitTimeout } from '@ibiz-template/core';
import { Graph } from '@antv/x6';
import { h } from 'vue';
import { X6PanelItemStencilState } from './x6-panel-item-stencil.state';
import { X6PanelItemController } from '../x6-panel-item/x6-panel-item.controller';
import { X6Controller } from '../../controller';
import { X6NodeServiceProvider } from '../../interface';
import { X6DesignViewController } from '../../views';
import ActionPopover from './action-popover/action-popover';

export class X6PanelItemStencilController extends PanelItemController<IPanelField> {
  protected get x6Controller(): X6PanelItemController {
    return this.panel.panelItems.x6_panel_item as X6PanelItemController;
  }

  /**
   * 挂载容器
   *
   * @author chitanda
   * @date 2023-11-11 15:11:06
   * @protected
   * @type {HTMLDivElement}
   */
  protected container?: HTMLDivElement;

  /**
   * 节点适配器
   *
   * @author chitanda
   * @date 2023-11-16 18:11:29
   * @type {X6NodeServiceProvider}
   */
  get provider(): X6NodeServiceProvider {
    return this.x6.node.provider;
  }

  s?: Stencil;

  get x6(): X6Controller {
    return this.x6Controller.x6;
  }

  /**
   * @description 行为参数
   * @type {IData}
   * @memberof X6PanelItemStencilController
   */
  actionParams: IData = {};

  /**
   * @description 行为模型集合
   * @type {IAppDEUIAction[]}
   * @memberof X6PanelItemStencilController
   */
  actionModels: IAppDEUIAction[] = [];

  /**
   * @description 是否显示分组头
   * @type {boolean}
   * @memberof X6PanelItemStencilController
   */
  showGroupHeader: boolean = false;

  /**
   * @description 节点数组
   * @type {IData[]}
   * @memberof X6PanelItemStencilController
   */
  nodes: IData[] = [];

  protected createState(): X6PanelItemStencilState {
    return new X6PanelItemStencilState(this.parent?.state);
  }

  /**
   * 视图控制器
   *
   * @author zhanghengfeng
   * @date 2025-03-17 19:03:43
   * @readonly
   * @type {X6DesignViewController}
   */
  get view(): X6DesignViewController {
    return this.panel.view as X6DesignViewController;
  }

  /**
   * 是否显示逻辑所有者
   *
   * @author zhanghengfeng
   * @date 2025-03-17 19:03:08
   * @type {boolean}
   */
  showLogicHolder: boolean = false;

  /**
   * 逻辑所有者
   *
   * @author zhanghengfeng
   * @date 2025-03-17 19:03:23
   * @type {number}
   */
  logicHolder: number = 3;

  /**
   * 前台代码表id
   *
   * @author zhanghengfeng
   * @date 2025-03-17 19:03:36
   * @type {string}
   */
  frontCodeListId?: string;

  /**
   * 初始化
   *
   * @author zhanghengfeng
   * @date 2025-03-17 19:03:09
   * @protected
   * @return {*}  {Promise<void>}
   */
  protected async onInit(): Promise<void> {
    await super.onInit();
    const editorParams = this.model.editor?.editorParams;
    this.showLogicHolder = editorParams?.showLogicHolder === 'true';
    if (this.showLogicHolder) {
      this.logicHolder = this.view.state.data?.logicholder || 3;
      this.initCodeList();
      this.view.evt.on('onLogicHolderChange', e => {
        if (!e) {
          return;
        }
        this.logicHolder = e.logicHolder || 3;
        this.s?.dispose();
        this.s = undefined;
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
  protected initCodeList(): void {
    const node = getControl(this.view.model, 'node') as IDEEditForm;
    if (!node) {
      throw new RuntimeModelError(this.view, '未找到 node 表单模型');
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
      item => item.codeName === 'front_type',
    ) as IDEFormDetail & { editor?: { appCodeListId?: string } };
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
  public async loadCodeList(appCodeListId: string) {
    let codeListItems: CodeListItem[] = [];
    const app = await ibiz.hub.getApp(this.model.appId);
    const codeItems = (await app.codeList.get(
      appCodeListId,
      this.panel.context,
      this.panel.params,
    )) as CodeListItem[];
    if (this.showGroupHeader) {
      codeListItems = codeItems;
    } else {
      codeListItems = codeItems.filter(
        item => Array.isArray(item.children) && item.children.length,
      );
    }
    codeListItems.forEach(item => {
      if (Array.isArray(item.children)) {
        item.children.forEach(child => {
          if (typeof child.data === 'string') {
            child.data = ScriptFactory.execSingleLine(child.data) as IData;
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
  fillAction(codeListItems: CodeListItem[]) {
    codeListItems.forEach(item => {
      const action = this.actionParams[item.id];
      if (action) {
        const data = item.data || {};
        Object.assign(item, { data: { action, ...data } });
      }
      if (Array.isArray(item.children)) {
        item.children.forEach(x => {
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
  public loadNodes(codeListItems: CodeListItem[]) {
    this.nodes = [];
    codeListItems.forEach(item => {
      let nodes: IData[] = [];
      if (item.children) {
        nodes = item.children.map(codeItem => {
          const param = codeItem;
          if (param.data && param.data.action && param.data.action.remove) {
            Object.assign(param.data, {
              actionID: param.data.action.remove,
            });
          }
          const node = this.x6.g.createNode(
            this.provider.createMaterialCell(param),
          );
          return node;
        });
      }
      const data = item.data || {};
      if (data.action && data.action.add) {
        const addNode = this.x6.g.createNode(
          this.provider.createMaterialAddCell({
            id: 'add',
            data: { actionID: data.action.add },
            text: '新增',
            value: 'add',
          } as CodeListItem),
        );
        nodes.push(addNode);
      }
      this.nodes.push(...nodes);
      this.s!.load(nodes, item.id!);
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
    const graphs = (this.s! as IData).graphs;
    Object.keys(this.actionParams).forEach(key => {
      const graph: Graph = graphs[key];
      if (graph) {
        graph.on('render:done', () => {
          const nodes = graph.container.querySelectorAll('.x6-node');
          nodes.forEach(node => {
            const dataId = node.getAttribute('data-cell-id');
            const cell = graph.getCellById(dataId!);
            if (this.actionParams[key].remove) {
              this.registerNodeEvent(
                node,
                cell,
                '.ibiz-material-node-delete-icon',
              );
            }
            if (this.actionParams[key].add) {
              this.registerNodeEvent(node, cell, '.ibiz-material-add-node');
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
  async registerNodeEvent(container: Element, cell: IData, className: string) {
    const element = container.querySelector(className) as IData;
    if (element) {
      if (element.classList.contains('is-active')) {
        return;
      }
      element.classList.add('is-active');
      element.addEventListener(
        'mousedown',
        async (event: MouseEvent) => {
          if (cell.data && cell.data.data && cell.data.data.actionID) {
            event.preventDefault();
            event.stopPropagation();
            const uiActionIds: string[] = cell.data.data.actionID.split(';');
            let uiActionId: string | undefined;
            if (uiActionIds.length > 1) {
              const actions = this.actionModels.filter(
                model => model.id && uiActionIds.includes(model.id),
              );
              const overlay = ibiz.overlay.createPopover(
                (modal: IModal) => h(ActionPopover, { modal, actions }),
                undefined,
                {
                  width: 120,
                  noArrow: false,
                  autoClose: true,
                  placement: 'right',
                  modalClass: 'ibiz-stencil-action-popover',
                },
              );
              await overlay.present(event.target as HTMLElement);
              const result = await overlay.onWillDismiss<IModalData>();
              if (result.ok && result.data) uiActionId = result.data[0].id;
            } else {
              uiActionId = uiActionIds[0];
            }
            if (!uiActionId) return;
            await UIActionUtil.execAndResolved(
              uiActionId,
              {
                context: this.panel.context,
                params: {
                  panelDataParent: this.dataParent.model.id!,
                  cellid: cell.data.id,
                  ...this.panel.params,
                },
                data: [this.data],
                view: this.panel.view,
                event,
                noWaitRoute: true,
              },
              this.model.appId,
            );
          }
        },
        { captrue: true, passive: false },
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
    const graphs = (this.s! as IData).graphs as Graph[];
    Object.values(graphs).forEach((graph: Graph) => {
      graph.clearCells({ refresh: true });
    });
    const { appCodeListId } = this.model.editor as ICodeListEditor;
    if (appCodeListId) {
      const codeListItems: CodeListItem[] =
        await this.loadCodeList(appCodeListId);
      this.fillAction(codeListItems);
      this.loadNodes(codeListItems);
      // 节点适配器也需重新加载
      await this.provider?.refresh(this.panel.context, this.panel.params);
      this.initEevnt();
    }
  }

  /**
   * @description 初始化编辑器参数
   * @param {IData} editorParams
   * @memberof X6PanelItemStencilController
   */
  async initEditorParams(editorParams: IData): Promise<void> {
    if (editorParams) {
      await Promise.all(
        Object.keys(editorParams).map(async (key: string) => {
          const keys = key.split('_');
          if (keys.length === 3 && keys[2].includes('ACTION')) {
            const action = this.actionParams[keys[0]] || {};
            const actionName = keys[1].toLowerCase();
            const actionId = editorParams[key];
            this.actionParams[keys[0]] = {
              ...action,
              [actionName]: action[actionName]
                ? `${action[actionName]};${actionId}`
                : actionId,
            };
            const actionModel = await getUIActionById(
              actionId,
              this.model.appId,
            );
            if (actionModel) {
              const find = this.actionModels.find(
                model => model.id === actionModel.id,
              );
              if (!find) this.actionModels.push(actionModel);
            }
          }
        }),
      );
      if (editorParams.SHOWHEADER) {
        this.showGroupHeader =
          editorParams.SHOWHEADER === 'true' ||
          editorParams.SHOWHEADER === 'TRUE';
      }
    }
  }

  async initStencil(
    container: HTMLDivElement,
    count: number = 0,
  ): Promise<void> {
    if (this.s) {
      return;
    }
    if (!this.x6Controller || !this.x6) {
      if (count > 10) {
        throw new Error(
          'X6PanelItemStencil: 初始化 stencil 实例失败，未能等找到 x6 控制器',
        );
      }
      await awaitTimeout(300);
      return this.initStencil(container);
    }
    this.container = container;
    if (this.container) {
      let codeList: IAppCodeList | null = null;
      let codeListItems: CodeListItem[] = [];
      const { editor } = this.model;
      if (editor) {
        let { appCodeListId, editorParams = {} } = editor as ICodeListEditor;
        await this.initEditorParams(editorParams);
        if (
          this.showLogicHolder &&
          this.frontCodeListId &&
          this.logicHolder === 2
        ) {
          appCodeListId = this.frontCodeListId;
        }
        if (appCodeListId) {
          // 加载代码表 并计算界面行为
          const app = await ibiz.hub.getApp(this.model.appId);
          codeList = app.codeList.getCodeList(appCodeListId)!;
          codeListItems = await this.loadCodeList(appCodeListId);
          this.fillAction(codeListItems);
        }
      }
      if (!codeList) {
        throw new RuntimeModelError(this.model, `未配置素材区代码表`);
      }
      const { x6 } = this;
      this.s = new Stencil({
        target: this.x6.g,
        search(cell, keyword) {
          if (!keyword) {
            return true;
          }
          const data = cell.getData();
          const text: string = (data && data.text) || '';
          const searchText: string = keyword.trim().toLowerCase();
          return text.toLowerCase().indexOf(searchText) !== -1;
        },
        title: '素材',
        placeholder: '节点名称/节点标识',
        notFoundText: codeList.emptyText,
        collapsable: false,
        stencilGraphHeight: 0,
        layoutOptions: {
          columns: 3,
          center: false,
        },
        getDragNode: (draggingNode, _options) => {
          const codeItem = draggingNode.data as CodeListItem;
          const node = x6.g.createNode(this.provider.createDragCell(codeItem));
          return node;
        },
        validateNode: (droppingNode, options) => {
          return this.provider.validateNode(droppingNode, options);
        },
        groups: codeListItems.map<Stencil.Group>(item => {
          return {
            name: item.id!,
            title: item.text,
            graphHeight: 0,
            collapsable: true,
            collapsed: item.userData === 'contract',
          };
        }),
      });
      this.container.appendChild(this.s.container);

      // 挂载 stencil 节点
      this.loadNodes(codeListItems);
      this.initEevnt();
    } else {
      throw new Error('X6PanelItemStencil: 初始化容器为空 not found');
    }
  }
}
