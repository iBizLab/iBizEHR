import { AxiosResponse } from 'axios';
export declare class ModelService {
    loadModel(params: IParams): Promise<AxiosResponse<any, any>>;
    saveModel(model: IData, params: IParams): Promise<AxiosResponse<any, any>>;
}
export declare const modelService: ModelService;
