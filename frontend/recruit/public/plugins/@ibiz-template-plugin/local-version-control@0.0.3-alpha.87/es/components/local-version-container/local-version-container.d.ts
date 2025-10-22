import { PropType } from 'vue';
import { IVersionControlController } from '../../interface';
import './local-version-container.scss';
declare const _default: import("vue").DefineComponent<{
    controller: {
        type: PropType<IVersionControlController>;
        required: true;
    };
    dismiss: {
        type: PropType<() => void>;
        required: true;
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    closeDrawer: () => void;
    cleanState: import("vue").Ref<any>;
    overUpNumber: any;
    setCleanState: (val: boolean) => void;
    clearHistoryVersion: () => void;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {}, string, import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    controller: {
        type: PropType<IVersionControlController>;
        required: true;
    };
    dismiss: {
        type: PropType<() => void>;
        required: true;
    };
}>>, {}, {}>;
export default _default;
