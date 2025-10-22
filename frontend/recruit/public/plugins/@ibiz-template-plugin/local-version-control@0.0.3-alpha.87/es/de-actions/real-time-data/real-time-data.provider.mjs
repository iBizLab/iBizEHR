import { RealTimeDataMethod } from './real-time-data.method.mjs';

"use strict";
class RealTimeDataProvider {
  create(service, entity, method, opts) {
    return new RealTimeDataMethod(service, entity, method, opts.localMode);
  }
}

export { RealTimeDataProvider };
