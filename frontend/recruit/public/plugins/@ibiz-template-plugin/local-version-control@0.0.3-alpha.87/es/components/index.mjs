import IBizLocalVersionContainer from './local-version-container/local-version-container.mjs';
import IBizLocalVersionList from './local-version-list/local-version-list.mjs';
import IBizLocalVersionItem from './local-version-item/local-version-item.mjs';
import IBizLocalVersionDiff from './local-version-diff/local-version-diff.mjs';

"use strict";
var Components = {
  install(app) {
    app.component("IBizLocalVersionContainer", IBizLocalVersionContainer);
    app.component("IBizLocalVersionList", IBizLocalVersionList);
    app.component("IBizLocalVersionItem", IBizLocalVersionItem);
    app.component("IBizLocalVersionDiff", IBizLocalVersionDiff);
  }
};

export { Components as default };
