/* eslint-disable @typescript-eslint/no-explicit-any */
import axios, { AxiosResponse } from 'axios';
import pluralize from 'pluralize';

export class ModelService {
  loadModel(params: IParams): Promise<AxiosResponse<any, any>> {
    const deNamePlural = pluralize(params.srfdename || '').toLowerCase();
    return axios.post(`/${deNamePlural}/${params.srfkey}/exportModel`, {});
  }

  saveModel(model: IData, params: IParams): Promise<AxiosResponse<any, any>> {
    const deNamePlural = pluralize(params.srfdename || '').toLowerCase();
    return axios.post(`/${deNamePlural}/importModel`, model);
  }
}

export const modelService = new ModelService();
