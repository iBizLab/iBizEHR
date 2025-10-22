"use strict";
const TypeScriptVariable = /* @__PURE__ */ new Map([
  [
    "ibiz",
    {
      declare: "\n      /**\n       * @description ibiz\u5168\u5C40\u5BF9\u8C61\n       * @type {IApiIBizsys & IApiRuntimeIbizsys}\n       */\n      const ibiz: IApiIBizsys & IApiRuntimeIbizsys;\n      ",
      interface: "IApiIBizsys & IApiRuntimeIbizsys"
    }
  ],
  [
    "view",
    {
      declare: "\n      /**\n       * @description \u5F53\u524D\u89C6\u56FE\u63A7\u5236\u5668\n       * @type {IApiViewController}\n       */\n      const view: IApiViewController;\n      ",
      interface: "IApiViewController"
    }
  ],
  [
    "ctrl",
    {
      declare: "\n      /**\n       * @description \u5F53\u524D\u90E8\u4EF6\u63A7\u5236\u5668\n       * @type {IApiControlController}\n       */\n      const ctrl: IApiControlController;\n      ",
      interface: "IApiControlController"
    }
  ],
  [
    "context",
    {
      declare: "\n      /**\n       * @description \u5F53\u524D\u4E0A\u4E0B\u6587\n       * @type {IApiContext}\n       */\n      const context: IApiContext;\n      ",
      interface: "IApiContext"
    }
  ],
  [
    "params",
    {
      declare: "\n      /**\n       * @description \u5F53\u524D\u89C6\u56FE\u53C2\u6570\n       * @type {IApiParams}\n       */\n      const params: IApiParams;\n      ",
      interface: "IApiParams"
    }
  ],
  [
    "env",
    {
      declare: "\n      /**\n       * @description ibiz\u73AF\u5883\u53D8\u91CF\n       * @type {IEnvironment}\n       */\n      const env: IEnvironment & IApiEnvGlobalConfig;\n      ",
      interface: "IEnvironment & IApiEnvGlobalConfig"
    }
  ],
  [
    "app",
    {
      declare: "\n      /**\n       * @description \u5E94\u7528\u63A7\u5236\u5668\n       * @type {IApiAppHubController}\n       */\n      const app: IApiAppHubController;\n      ",
      interface: "IApiAppHubController"
    }
  ],
  [
    "data",
    {
      declare: "\n      /**\n       * @description \u5F53\u524D\u884C\u4E3A\u6570\u636E\uFF0C\u5177\u4F53\u6570\u636E\u7C7B\u578B\u9700\u6839\u636E\u5F53\u524D\u903B\u8F91\u81EA\u884C\u5224\u65AD\n       * @type {(IApiData | IApiData[])}\n       */\n      const data: IApiData | IApiData[];\n      ",
      interface: "IApiData"
    }
  ],
  [
    "appSession",
    {
      declare: "\n      /**\n       * @description \u5168\u5C40\u5171\u4EAB\u6570\u636E\u5BF9\u8C61\n       * @type {IApiData}\n       */\n      const appSession: IApiData;\n      ",
      interface: "IApiData"
    }
  ],
  [
    "parent",
    {
      declare: "\n      /**\n       * @description \u7236\u7EA7\u89C6\u56FE\u63A7\u5236\u5668\n       * @type {IApiViewController}\n       */\n      const parent: IApiViewController;\n      ",
      interface: "IApiViewController"
    }
  ],
  [
    "topView",
    {
      declare: "\n      /**\n       * @description \u9876\u7EA7\u89C6\u56FE\u63A7\u5236\u5668\n       * @type {IApiViewController}\n       */\n      const topView: IApiViewController;\n      ",
      interface: "IApiViewController"
    }
  ],
  [
    "parentView",
    {
      declare: "\n      /**\n       * @description \u7236\u7EA7\u89C6\u56FE\u63A7\u5236\u5668\n       * @type {IApiViewController}\n       */\n      const parentView: IApiViewController;\n      ",
      interface: "IApiViewController"
    }
  ],
  [
    "topViewSession",
    {
      declare: "\n      /**\n       * @description \u9876\u7EA7\u89C6\u56FE\u5171\u4EAB\u6570\u636E\u5BF9\u8C61\n       * @type {IApiData}\n       */\n      const topViewSession: IApiData;\n      ",
      interface: "IApiData"
    }
  ],
  [
    "viewSession",
    {
      declare: "\n      /**\n       * @description \u5F53\u524D\u89C6\u56FE\u5171\u4EAB\u6570\u636E\u5BF9\u8C61\n       * @type {IApiData}\n       */\n      const viewSession: IApiData;\n      ",
      interface: "IApiData"
    }
  ],
  [
    "uiLogic",
    {
      declare: "\n      /**\n       * @description \u754C\u9762\u903B\u8F91\u53C2\u6570\u5BF9\u8C61\uFF0C\u5C5E\u6027\u4E3A\u5F53\u524D\u903B\u8F91\u6240\u6709\u53C2\u6570\n       * @type {IApiData}\n       */\n      const uiLogic: IApiData;\n      ",
      interface: "IApiData"
    }
  ],
  [
    "util",
    {
      declare: "\n      /**\n       * @description \u5E94\u7528\u5DE5\u5177\n       * @type {IApiUtil}\n       */\n      const util: IApiUtil;\n      ",
      interface: "IApiUtil"
    }
  ]
]);

export { TypeScriptVariable };
