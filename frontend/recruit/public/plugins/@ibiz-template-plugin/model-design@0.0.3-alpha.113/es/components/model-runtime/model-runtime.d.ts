import { IModal } from '@ibiz-template/runtime';
import { IAppDataEntity } from '@ibiz/model-core';
import { PropType } from 'vue';
import './model-runtime.scss';
declare const _default: import("vue").DefineComponent<{
    title: {
        type: StringConstructor;
    };
    modal: {
        type: PropType<IModal>;
    };
    entity: {
        type: PropType<IAppDataEntity>;
        required: true;
    };
    context: {
        type: PropType<IContext>;
        default: () => {};
    };
    params: {
        type: PropType<IParams>;
        default: () => {};
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    url: import("vue").ComputedRef<string>;
    headers: import("vue").ComputedRef<{
        psdevslnsys: any;
        Authorization: string;
        'Content-Type': string;
    }>;
    parentKey: import("vue").ComputedRef<string>;
    configBaseUrl: string;
    onClose: () => void;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {}, string, import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    title: {
        type: StringConstructor;
    };
    modal: {
        type: PropType<IModal>;
    };
    entity: {
        type: PropType<IAppDataEntity>;
        required: true;
    };
    context: {
        type: PropType<IContext>;
        default: () => {};
    };
    params: {
        type: PropType<IParams>;
        default: () => {};
    };
}>>, {
    context: IContext;
    params: IParams;
}, {}>;
export default _default;
