import { App } from 'vue';
import IBizLocalVersionContainer from './local-version-container/local-version-container';
import IBizLocalVersionList from './local-version-list/local-version-list';
import IBizLocalVersionItem from './local-version-item/local-version-item';
import IBizLocalVersionDiff from './local-version-diff/local-version-diff';

export default {
  install(app: App) {
    app.component('IBizLocalVersionContainer', IBizLocalVersionContainer);
    app.component('IBizLocalVersionList', IBizLocalVersionList);
    app.component('IBizLocalVersionItem', IBizLocalVersionItem);
    app.component('IBizLocalVersionDiff', IBizLocalVersionDiff);
  },
};
