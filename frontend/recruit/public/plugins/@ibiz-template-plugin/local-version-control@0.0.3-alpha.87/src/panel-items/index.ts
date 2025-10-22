import { App } from 'vue';
import LocalVersionTag from './local-version-tag';

export default {
  install(_app: App) {
    // 注册组件
    _app.use(LocalVersionTag);
  },
};
