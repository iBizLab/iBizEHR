import { App } from 'vue';
import Components from './components';
import DEActions from './de-actions';
import PanelItems from './panel-items';

export default {
  install(_app: App) {
    _app.use(Components);
    _app.use(DEActions);
    _app.use(PanelItems);
  },
};
