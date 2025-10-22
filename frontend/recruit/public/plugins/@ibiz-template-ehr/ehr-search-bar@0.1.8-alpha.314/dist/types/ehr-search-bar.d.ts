import { ISearchBar } from '@ibiz/model-core';
import { PropType } from 'vue';
import { IControlProvider } from '@ibiz-template/runtime';
import { EhrSearchBarController } from './ehr-search-bar.controller';
export declare const EhrSearchBarControl: import("vue").DefineComponent<{
    modelData: {
        type: PropType<ISearchBar>;
        required: true;
    };
    context: {
        type: PropType<import("@ibiz-template/core").IApiContext>;
        required: true;
    };
    params: {
        type: PropType<import("@ibiz-template/core").IApiParams>;
        default: () => {};
    };
    provider: {
        type: PropType<IControlProvider>;
    };
}, {
    c: EhrSearchBarController;
    ns: import("@ibiz-template/core").Namespace;
    buttonRef: import("vue").Ref<any>;
    openSearchModal: (event: MouseEvent) => Promise<void>;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {}, string, import("vue").VNodeProps & import("vue").AllowedComponentProps & import("vue").ComponentCustomProps, Readonly<import("vue").ExtractPropTypes<{
    modelData: {
        type: PropType<ISearchBar>;
        required: true;
    };
    context: {
        type: PropType<import("@ibiz-template/core").IApiContext>;
        required: true;
    };
    params: {
        type: PropType<import("@ibiz-template/core").IApiParams>;
        default: () => {};
    };
    provider: {
        type: PropType<IControlProvider>;
    };
}>>, {
    params: import("@ibiz-template/core").IApiParams;
}, {}>;
