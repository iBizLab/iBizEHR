import { PropType } from 'vue';
import { ClipboardData } from '../../model';
import './model-clipboard-item.scss';
declare const _default: import("vue").DefineComponent<{
    context: {
        type: PropType<IContext>;
        default: () => {};
    };
    params: {
        type: PropType<IParams>;
        default: () => {};
    };
    data: {
        type: PropType<ClipboardData>;
        required: true;
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    stateType: import("vue").ComputedRef<string>;
    isLoading: import("vue").Ref<boolean>;
    modelClipboardController: import("../../controller/model-clipboard-controller/model-clipboard-controller").ModelClipboardController;
    remove: () => void;
    copy: () => void;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, "delete"[], "delete", import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    context: {
        type: PropType<IContext>;
        default: () => {};
    };
    params: {
        type: PropType<IParams>;
        default: () => {};
    };
    data: {
        type: PropType<ClipboardData>;
        required: true;
    };
}>> & {
    onDelete?: ((...args: any[]) => any) | undefined;
}, {
    context: IContext;
    params: IParams;
}, {}>;
export default _default;
