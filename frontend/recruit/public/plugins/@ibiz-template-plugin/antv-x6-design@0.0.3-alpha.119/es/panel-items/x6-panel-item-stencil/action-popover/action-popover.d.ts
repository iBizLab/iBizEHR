import { IModal } from '@ibiz-template/runtime';
import { PropType } from 'vue';
import { IAppDEUIAction } from '@ibiz/model-core';
import './action-popover.scss';
declare const _default: import("vue").DefineComponent<{
    modal: {
        type: PropType<IModal>;
        required: true;
    };
    actions: {
        type: PropType<IAppDEUIAction[]>;
        default: () => never[];
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    onSelect: (item: IAppDEUIAction) => void;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {}, string, import("vue").VNodeProps & import("vue").AllowedComponentProps & import("vue").ComponentCustomProps, Readonly<import("vue").ExtractPropTypes<{
    modal: {
        type: PropType<IModal>;
        required: true;
    };
    actions: {
        type: PropType<IAppDEUIAction[]>;
        default: () => never[];
    };
}>>, {
    actions: IAppDEUIAction[];
}, {}>;
export default _default;
