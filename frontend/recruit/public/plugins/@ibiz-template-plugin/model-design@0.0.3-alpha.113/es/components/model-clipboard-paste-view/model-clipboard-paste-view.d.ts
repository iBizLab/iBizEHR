import { IModal } from '@ibiz-template/runtime';
import { PropType } from 'vue';
import { ClipboardData } from '../../model';
import './model-clipboard-paste-view.scss';
declare const _default: import("vue").DefineComponent<{
    context: {
        type: PropType<IContext>;
        default: () => {};
    };
    params: {
        type: PropType<IParams>;
        default: () => {};
    };
    modal: {
        type: PropType<IModal>;
    };
}, {
    c: import("../../controller/model-clipboard-paste-view-controller/model-clipboard-paste-view-controller").ModelClipboardPasteViewController;
    ns: import("@ibiz-template/core").Namespace;
    activeName: import("vue").Ref<"ModeTree" | "JSON">;
    materialItem: import("vue").ComputedRef<ClipboardData[]>;
    modelClipboardController: import("../../controller/model-clipboard-controller/model-clipboard-controller").ModelClipboardController;
    closeView: () => Promise<void>;
    clearModel: () => Promise<void>;
    formatData: () => void;
    modelChange: (val: string) => void;
    deleteDropItem: (i: number) => void;
    dropModelChange: (e: IData) => Promise<void>;
    saveModel: () => Promise<void>;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {}, string, import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    context: {
        type: PropType<IContext>;
        default: () => {};
    };
    params: {
        type: PropType<IParams>;
        default: () => {};
    };
    modal: {
        type: PropType<IModal>;
    };
}>>, {
    context: IContext;
    params: IParams;
}, {}>;
export default _default;
