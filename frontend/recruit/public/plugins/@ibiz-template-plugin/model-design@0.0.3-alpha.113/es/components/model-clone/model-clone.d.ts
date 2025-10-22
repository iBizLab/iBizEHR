import { IDEEditForm } from '@ibiz/model-core';
import { IModal, EventBase } from '@ibiz-template/runtime';
import { PropType } from 'vue';
import { IModelData } from '../../interface';
import './model-clone.scss';
declare const _default: import("vue").DefineComponent<{
    item: {
        type: PropType<IData>;
        required: true;
    };
    modal: {
        type: PropType<IModal>;
        required: true;
    };
    params: {
        type: PropType<IParams>;
        default: () => {};
    };
    modelData: {
        type: PropType<IDEEditForm>;
        required: true;
    };
    context: {
        type: PropType<IContext>;
        default: () => {};
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    data: import("vue").Ref<IModelData | undefined>;
    isLoaded: import("vue").Ref<boolean>;
    onCancel: () => void;
    onConfirm: () => Promise<boolean>;
    onFormDataChange: (event: EventBase) => void;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {}, string, import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    item: {
        type: PropType<IData>;
        required: true;
    };
    modal: {
        type: PropType<IModal>;
        required: true;
    };
    params: {
        type: PropType<IParams>;
        default: () => {};
    };
    modelData: {
        type: PropType<IDEEditForm>;
        required: true;
    };
    context: {
        type: PropType<IContext>;
        default: () => {};
    };
}>>, {
    context: IContext;
    params: IParams;
}, {}>;
export default _default;
