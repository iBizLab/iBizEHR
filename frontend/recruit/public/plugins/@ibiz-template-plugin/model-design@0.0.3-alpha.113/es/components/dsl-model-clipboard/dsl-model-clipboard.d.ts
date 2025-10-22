import { IModal } from '@ibiz-template/runtime';
import { PropType } from 'vue';
import './dsl-model-clipboard.scss';
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
    ns: import("@ibiz-template/core").Namespace;
    items: import("vue").ComputedRef<import("../../model").ClipboardData[]>;
    selected: import("vue").ComputedRef<import("../../model").ClipboardData[]>;
    controller: import("../../controller/model-clipboard-controller/model-clipboard-controller").ModelClipboardController;
    enableMerge: import("vue").Ref<boolean>;
    close: () => void;
    removeAll: () => Promise<void>;
    handleMerge: () => Promise<void>;
    handleChange: (_val: boolean) => void;
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
