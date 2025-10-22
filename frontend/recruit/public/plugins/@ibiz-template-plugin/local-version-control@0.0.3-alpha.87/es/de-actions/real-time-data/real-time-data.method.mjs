import { RuntimeError, HttpResponse, RuntimeModelError, HttpError } from '@ibiz-template/core';
import { Method, findAppDEMethod, getDEMethodProvider, execFieldLogics, findDELogic, execDELogicAction, ScriptFactory } from '@ibiz-template/runtime';
import { isArray, isNil } from 'lodash-es';

"use strict";
class RealTimeDataMethod extends Method {
  /**
   * 处理请求发送参数
   *
   * @author tony001
   * @date 2025-03-06 14:03:41
   * @param {IContext} context
   * @param {(IData | IData[])} data
   * @return {*}  {(Promise<IData | IData[]>)}
   */
  async inputHandle(context, data) {
    if (isArray(data)) {
      return data;
    }
    return this.input.handle(context, data);
  }
  /**
   * 格式化输入参数
   *
   * @author tony001
   * @date 2025-03-06 14:03:51
   * @param {IContext} context
   * @param {(IData | IData[])} data
   * @return {*}  {(Promise<IData | IData[]>)}
   */
  async inputFormat(context, data) {
    const handleListMap = async (arg) => {
      return this.input.format(context, arg);
    };
    if (Array.isArray(data)) {
      const result = [];
      for (let i = 0; i < data.length; i++) {
        result.push(await handleListMap(data[i]));
      }
      return result;
    }
    return handleListMap(data);
  }
  /**
   * 获取方法
   *
   * @author tony001
   * @date 2025-03-06 15:03:10
   * @protected
   * @param {string} id
   * @param {boolean} [acMode=false]
   * @return {*}  {Promise<Method>}
   */
  async getMethod(id, acMode = false) {
    const cacheId = acMode ? "ac-".concat(id) : id;
    const model = findAppDEMethod(this.entity, id);
    if (!model) {
      throw new RuntimeError("\u672A\u627E\u5230\u670D\u52A1\u65B9\u6CD5: ".concat(id));
    }
    const provider = await getDEMethodProvider(model);
    if (!provider) {
      throw new RuntimeError("\u672A\u652F\u6301\u7684\u670D\u52A1\u65B9\u6CD5\u7C7B\u578B: ".concat(model.methodType));
    }
    const method = provider.create(this.service, this.entity, model, {
      acMode,
      localMode: this.service.isLocalMode
    });
    return method;
  }
  /**
   * 执行行为
   *
   * @author tony001
   * @date 2025-03-06 15:03:34
   * @param {IContext} context
   * @param {(IData | IData[])} [data]
   * @param {IParams} [params]
   * @param {IData} [header]
   * @return {*}  {Promise<HttpResponse<IData>>}
   */
  async exec(context, data, params, header) {
    let result;
    if (!context.srfappid) {
      return new HttpResponse({});
    }
    if (data && !["READ", "GETDRAFT"].includes(this.method.actionMode)) {
      await execFieldLogics(this.entity, "change", context, data, params);
    }
    if (this.method.actionType === "DELOGIC") {
      const deLogic = findDELogic(this.method.appDELogicId, this.entity);
      if (!deLogic) {
        throw new RuntimeModelError(
          this.method,
          ibiz.i18n.t("runtime.service.lackEntityLogic")
        );
      }
      result = await execDELogicAction(deLogic, context, data, params);
    } else {
      if (data) {
        if (!this.isLocalMode) {
          data = await this.inputHandle(context, data);
        } else {
          data = await this.inputFormat(context, data);
        }
      }
      const methodTag = this.method.actionTag ? this.method.actionTag.toUpperCase() : this.method.codeName.toUpperCase();
      if (this.method.beforeCode) {
        await ScriptFactory.asyncExecScriptFn(
          {
            context,
            data,
            viewParam: params,
            activeData: header
          },
          this.method.beforeCode
        );
      }
      result = new HttpResponse();
      switch (methodTag) {
        case "GETTEMPREALTIMEDATA":
          result = await this.getTempRealTimeData(context, data);
          break;
        case "UPDATETEMPREALTIMEDATA":
          result = await this.updateTempRealTimeData(context, data, params);
          break;
        default:
          throw new RuntimeError("".concat(methodTag, "\u6682\u672A\u652F\u6301"));
      }
    }
    if (this.method.afterCode) {
      await ScriptFactory.asyncExecScriptFn(
        {
          context,
          data: result.data,
          viewParam: params,
          activeData: header
        },
        this.method.afterCode
      );
    }
    if (result.data) {
      await execFieldLogics(
        this.entity,
        "compute",
        context,
        result.data,
        params
      );
    }
    return result;
  }
  /**
   * 获取临时实时数据
   *
   * @author tony001
   * @date 2025-03-06 15:03:52
   * @param {IContext} context
   * @param {IParams} [params]
   * @return {*}  {Promise<IHttpResponse<IDataEntity>>}
   */
  async getTempRealTimeData(context, params) {
    try {
      let key = null;
      if (params) {
        key = params[this.entity.keyAppDEFieldId.toLowerCase()];
      }
      if (!key && context) {
        key = context[this.entity.codeName.toLowerCase()];
      }
      let data = this.service.local.get(context, key);
      if (data) {
        for (const key2 in data) {
          if (Object.prototype.hasOwnProperty.call(data, key2)) {
            const val = data[key2];
            if (typeof val === "object" && !isNil(val)) {
              data[key2] = void 0;
            }
          }
        }
        const updateMethod = await this.getMethod("update");
        data = await updateMethod.input.handle(context, data);
      }
      if (data) {
        return new HttpResponse(data);
      }
      return new HttpResponse(data, 500);
    } catch (err) {
      throw new HttpError(err);
    }
  }
  /**
   * 更新临时实时数据
   *
   * @author tony001
   * @date 2025-03-06 15:03:50
   * @param {IContext} context
   * @param {(IData | IData[])} [data]
   * @param {IParams} [params]
   * @return {*}  {Promise<IHttpResponse<IDataEntity>>}
   */
  async updateTempRealTimeData(context, data, params) {
    const updateMethod = await this.getMethod("update");
    const result = await updateMethod.result.handle(context, data);
    this.service.local.add(context, result);
    const uiDomain = ibiz.uiDomainManager.get(context.srfsessionid);
    if (uiDomain && uiDomain.dataModification === false) {
      uiDomain.dataModification = true;
    }
    return new HttpResponse(result);
  }
}

export { RealTimeDataMethod };
