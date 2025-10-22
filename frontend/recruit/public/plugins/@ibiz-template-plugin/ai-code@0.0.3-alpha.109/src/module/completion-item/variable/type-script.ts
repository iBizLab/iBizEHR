/**
 * TypeScript 变量映射
 */
export const TypeScriptVariable: Map<
  string,
  { declare: string; interface: string }
> = new Map([
  [
    'ibiz',
    {
      declare: `
      /**
       * @description ibiz全局对象
       * @type {IApiIBizsys & IApiRuntimeIbizsys}
       */
      const ibiz: IApiIBizsys & IApiRuntimeIbizsys;
      `,
      interface: 'IApiIBizsys & IApiRuntimeIbizsys',
    },
  ],
  [
    'view',
    {
      declare: `
      /**
       * @description 当前视图控制器
       * @type {IApiViewController}
       */
      const view: IApiViewController;
      `,
      interface: 'IApiViewController',
    },
  ],
  [
    'ctrl',
    {
      declare: `
      /**
       * @description 当前部件控制器
       * @type {IApiControlController}
       */
      const ctrl: IApiControlController;
      `,
      interface: 'IApiControlController',
    },
  ],
  [
    'context',
    {
      declare: `
      /**
       * @description 当前上下文
       * @type {IApiContext}
       */
      const context: IApiContext;
      `,
      interface: 'IApiContext',
    },
  ],
  [
    'params',
    {
      declare: `
      /**
       * @description 当前视图参数
       * @type {IApiParams}
       */
      const params: IApiParams;
      `,
      interface: 'IApiParams',
    },
  ],
  [
    'env',
    {
      declare: `
      /**
       * @description ibiz环境变量
       * @type {IEnvironment}
       */
      const env: IEnvironment & IApiEnvGlobalConfig;
      `,
      interface: 'IEnvironment & IApiEnvGlobalConfig',
    },
  ],
  [
    'app',
    {
      declare: `
      /**
       * @description 应用控制器
       * @type {IApiAppHubController}
       */
      const app: IApiAppHubController;
      `,
      interface: 'IApiAppHubController',
    },
  ],
  [
    'data',
    {
      declare: `
      /**
       * @description 当前行为数据，具体数据类型需根据当前逻辑自行判断
       * @type {(IApiData | IApiData[])}
       */
      const data: IApiData | IApiData[];
      `,
      interface: 'IApiData',
    },
  ],
  [
    'appSession',
    {
      declare: `
      /**
       * @description 全局共享数据对象
       * @type {IApiData}
       */
      const appSession: IApiData;
      `,
      interface: 'IApiData',
    },
  ],
  [
    'parent',
    {
      declare: `
      /**
       * @description 父级视图控制器
       * @type {IApiViewController}
       */
      const parent: IApiViewController;
      `,
      interface: 'IApiViewController',
    },
  ],
  [
    'topView',
    {
      declare: `
      /**
       * @description 顶级视图控制器
       * @type {IApiViewController}
       */
      const topView: IApiViewController;
      `,
      interface: 'IApiViewController',
    },
  ],
  [
    'parentView',
    {
      declare: `
      /**
       * @description 父级视图控制器
       * @type {IApiViewController}
       */
      const parentView: IApiViewController;
      `,
      interface: 'IApiViewController',
    },
  ],
  [
    'topViewSession',
    {
      declare: `
      /**
       * @description 顶级视图共享数据对象
       * @type {IApiData}
       */
      const topViewSession: IApiData;
      `,
      interface: 'IApiData',
    },
  ],
  [
    'viewSession',
    {
      declare: `
      /**
       * @description 当前视图共享数据对象
       * @type {IApiData}
       */
      const viewSession: IApiData;
      `,
      interface: 'IApiData',
    },
  ],
  [
    'uiLogic',
    {
      declare: `
      /**
       * @description 界面逻辑参数对象，属性为当前逻辑所有参数
       * @type {IApiData}
       */
      const uiLogic: IApiData;
      `,
      interface: 'IApiData',
    },
  ],
  [
    'util',
    {
      declare: `
      /**
       * @description 应用工具
       * @type {IApiUtil}
       */
      const util: IApiUtil;
      `,
      interface: 'IApiUtil',
    },
  ],
]);
