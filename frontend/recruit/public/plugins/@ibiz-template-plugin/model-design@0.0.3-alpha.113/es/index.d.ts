import { App } from 'vue';
import { modelClipboardController, modelClipboardImportViewController, modelClipboardPasteViewController, dslModelClipboardImportViewController } from './controller';
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
declare const _default: {
    install(app: App): void;
};
export default _default;
