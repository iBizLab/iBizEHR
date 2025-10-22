import { App } from 'vue';
import { registerDEMethodProvider } from '@ibiz-template/runtime';
import { RealTimeDataProvider } from './real-time-data/real-time-data.provider';

export default {
  install(_app: App) {
    registerDEMethodProvider(
      'DEMETHOD_REAL_TIME_DATA',
      () => new RealTimeDataProvider(),
    );
  },
};
