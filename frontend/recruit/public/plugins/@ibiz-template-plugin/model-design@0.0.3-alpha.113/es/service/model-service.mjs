import axios from 'axios';
import pluralize from '../node_modules/.pnpm/pluralize@8.0.0/node_modules/pluralize/pluralize.mjs';

"use strict";
class ModelService {
  loadModel(params) {
    const deNamePlural = pluralize(params.srfdename || "").toLowerCase();
    return axios.post("/".concat(deNamePlural, "/").concat(params.srfkey, "/exportModel"), {});
  }
  saveModel(model, params) {
    const deNamePlural = pluralize(params.srfdename || "").toLowerCase();
    return axios.post("/".concat(deNamePlural, "/importModel"), model);
  }
}
const modelService = new ModelService();

export { ModelService, modelService };
