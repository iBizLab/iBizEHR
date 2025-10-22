/* eslint-disable no-restricted-syntax */
/* eslint-disable no-shadow */
/* eslint-disable no-await-in-loop */
/* eslint-disable @typescript-eslint/no-explicit-any */
/* eslint-disable @typescript-eslint/no-this-alias */
/* eslint-disable @typescript-eslint/no-unused-vars */
import {
  HttpError,
  HttpResponse,
  IHttpResponse,
  RuntimeError,
  RuntimeModelError,
} from '@ibiz-template/core';
import {
  execDELogicAction,
  execFieldLogics,
  findAppDEMethod,
  findDELogic,
  getDEMethodProvider,
  IDataEntity,
  Method,
  ScriptFactory,
} from '@ibiz-template/runtime';
import { IAppDEAction, IAppDEMethod } from '@ibiz/model-core';
import { isArray, isNil } from 'lodash-es';

/**
 * 前端实时数据方法实现（本地版本管理使用）
 *
 * @author tony001
 * @date 2025-03-06 14:03:54
 * @export
 * @class RealTimeDataMethod
 * @extends {Method}
 */
export class RealTimeDataMethod extends Method {
  declare method: IAppDEAction;

  /**
   * 处理请求发送参数
   *
   * @author tony001
   * @date 2025-03-06 14:03:41
   * @param {IContext} context
   * @param {(IData | IData[])} data
   * @return {*}  {(Promise<IData | IData[]>)}
   */
  async inputHandle(
    context: IContext,
    data: IData | IData[],
  ): Promise<IData | IData[]> {
    if (isArray(data)) {
      // 多项数据不做dto转换
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
  async inputFormat(
    context: IContext,
    data: IData | IData[],
  ): Promise<IData | IData[]> {
    const handleListMap = async (arg: IData): Promise<IData> => {
      return this.input.format(context, arg);
    };
    if (Array.isArray(data)) {
      const result: IData[] = [];
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
  protected async getMethod(
    id: string,
    acMode: boolean = false,
  ): Promise<Method> {
    const cacheId = acMode ? `ac-${id}` : id;
    const model = findAppDEMethod(this.entity, id) as IAppDEMethod;

    if (!model) {
      throw new RuntimeError(`未找到服务方法: ${id}`);
    }

    // 获取适配器
    const provider = await getDEMethodProvider(model);
    if (!provider) {
      throw new RuntimeError(`未支持的服务方法类型: ${model.methodType}`);
    }
    const method: Method = provider.create(this.service, this.entity, model, {
      acMode,
      localMode: this.service.isLocalMode,
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
  async exec(
    context: IContext,
    data?: IData | IData[],
    params?: IParams,
    header?: IData,
  ): Promise<HttpResponse<IData>> {
    let result: IHttpResponse<IData>;

    // 若无srfappid，表示上下文已经销毁，则不执行后续逻辑直接返回
    if (!context.srfappid) {
      return new HttpResponse({});
    }

    // 执行变更属性逻辑
    if (data && !['READ', 'GETDRAFT'].includes(this.method.actionMode!)) {
      await execFieldLogics(this.entity, 'change', context, data, params);
    }

    // 实体逻辑处理
    if (this.method.actionType === 'DELOGIC') {
      const deLogic = findDELogic(this.method.appDELogicId!, this.entity);
      if (!deLogic) {
        throw new RuntimeModelError(
          this.method,
          ibiz.i18n.t('runtime.service.lackEntityLogic'),
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
      const methodTag = this.method.actionTag
        ? this.method.actionTag!.toUpperCase()
        : this.method.codeName!.toUpperCase();
      if (this.method.beforeCode) {
        await ScriptFactory.asyncExecScriptFn(
          {
            context,
            data,
            viewParam: params,
            activeData: header,
          },
          this.method.beforeCode,
        );
      }
      result = new HttpResponse<IData>();
      switch (methodTag) {
        case 'GETTEMPREALTIMEDATA':
          result = await this.getTempRealTimeData(context, data);
          break;
        case 'UPDATETEMPREALTIMEDATA':
          result = await this.updateTempRealTimeData(context, data!, params);
          break;
        default:
          throw new RuntimeError(`${methodTag}暂未支持`);
      }
    }

    if (this.method.afterCode) {
      await ScriptFactory.asyncExecScriptFn(
        {
          context,
          data: result.data,
          viewParam: params,
          activeData: header,
        },
        this.method.afterCode,
      );
    }
    // 计算属性逻辑
    if (result.data) {
      await execFieldLogics(
        this.entity,
        'compute',
        context,
        result.data,
        params,
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
  async getTempRealTimeData(
    context: IContext,
    params?: IParams,
  ): Promise<IHttpResponse<IDataEntity>> {
    try {
      // 查询当前主数据缓存数据
      let key = null;
      if (params) {
        key = params[this.entity.keyAppDEFieldId!.toLowerCase()];
      }
      if (!key && context) {
        key = context[this.entity.codeName!.toLowerCase()];
      }
      let data = this.service.local.get(context, key!);
      if (data) {
        for (const key in data) {
          if (Object.prototype.hasOwnProperty.call(data, key)) {
            const val = data[key];
            if (typeof val === 'object' && !isNil(val)) {
              data[key] = undefined;
            }
          }
        }
        // 填充子数据
        const updateMethod = await this.getMethod('update');
        data = (await updateMethod.input.handle(context, data)) as IDataEntity;
      }
      if (data) {
        return new HttpResponse(data);
      }
      return new HttpResponse(data, 500);
    } catch (err) {
      throw new HttpError(err as Error);
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
  async updateTempRealTimeData(
    context: IContext,
    data?: IData | IData[],
    params?: IParams,
  ): Promise<IHttpResponse<IDataEntity>> {
    const updateMethod = await this.getMethod('update');
    const result = await updateMethod.result.handle(context, data as IData);
    this.service.local.add(context, result);
    const uiDomain = ibiz.uiDomainManager.get(context.srfsessionid);
    if (uiDomain && uiDomain.dataModification === false) {
      uiDomain.dataModification = true;
    }
    return new HttpResponse(result);
  }
}
