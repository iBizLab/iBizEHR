import { registerDEMethodProvider } from '@ibiz-template/runtime';
import { RealTimeDataProvider } from './real-time-data/real-time-data.provider.mjs';

"use strict";
var DEActions = {
  install(_app) {
    registerDEMethodProvider(
      "DEMETHOD_REAL_TIME_DATA",
      () => new RealTimeDataProvider()
    );
  }
};

export { DEActions as default };
