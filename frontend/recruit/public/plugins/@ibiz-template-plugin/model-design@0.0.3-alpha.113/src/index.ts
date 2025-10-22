/* eslint-disable import/no-extraneous-dependencies */
import { App, reactive } from 'vue';
import {
  applyPolyfills,
  defineCustomElements,
} from '@ibiz-template-plugin/runtime-model/loader';
import Components from './components';
import UIAction from './ui-action';
import {
  modelClipboardController,
  modelClipboardImportViewController,
  modelClipboardPasteViewController,
  dslModelClipboardImportViewController,
} from './controller';

declare module '@ibiz-template/core' {
  interface IBizSys {
    /**
     * 模型粘贴板控制器
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:57
     * @type {typeof modelClipboardController}
     */
    modelClipboard: typeof modelClipboardController;

    /**
     * 模型导入视图控制器
     *
     * @author zhanghengfeng
     * @date 2024-10-25 20:10:52
     * @type {typeof modelClipboardImportViewController}
     */
    modelClipboardImportView: typeof modelClipboardImportViewController;

    /**
     * 模型粘贴视图控制器
     *
     * @type {typeof modelClipboardPasteViewController}
     * @memberof IBizSys
     */
    modelClipboardPasteView: typeof modelClipboardPasteViewController;

    /**
     * dsl模型导入视图控制器
     *
     * @type {typeof dslModelClipboardImportViewController}
     * @memberof IBizSys
     */
    dslModelClipboardImportView: typeof dslModelClipboardImportViewController;
  }
}

export default {
  install(app: App) {
    applyPolyfills().then(() => {
      defineCustomElements();
    });
    app.use(Components);
    app.use(UIAction);
    if (!ibiz.modelClipboard) {
      modelClipboardController.state = reactive(modelClipboardController.state);
      ibiz.modelClipboard = modelClipboardController;
    }
    if (!ibiz.modelClipboardImportView) {
      modelClipboardImportViewController.state = reactive(
        modelClipboardImportViewController.state,
      );
      ibiz.modelClipboardImportView = modelClipboardImportViewController;
    }
    if (!ibiz.modelClipboardPasteView) {
      modelClipboardPasteViewController.state = reactive(
        modelClipboardPasteViewController.state,
      );
      ibiz.modelClipboardPasteView = modelClipboardPasteViewController;
    }
    if (!ibiz.dslModelClipboardImportView) {
      dslModelClipboardImportViewController.state = reactive(
        dslModelClipboardImportViewController.state,
      );
      ibiz.dslModelClipboardImportView = dslModelClipboardImportViewController;
    }
  },
};
