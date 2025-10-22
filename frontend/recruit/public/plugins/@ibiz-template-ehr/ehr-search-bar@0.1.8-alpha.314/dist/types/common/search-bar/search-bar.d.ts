import { PropType } from 'vue';
import { IModal } from '@ibiz-template/runtime';
import { EhrSearchBarController } from '../../ehr-search-bar.controller';
export declare const ExcludeOPs: readonly string[];
export declare const SearchBar: import("vue").DefineComponent<{
    controller: {
        type: PropType<EhrSearchBarController>;
        required: true;
    };
    modal: {
        type: PropType<IModal>;
    };
}, {
    c: EhrSearchBarController;
    ns: import("@ibiz-template/core").Namespace;
    renderTop: () => import("vue/jsx-runtime").JSX.Element | undefined;
    renderHeader: () => import("vue/jsx-runtime").JSX.Element;
    renderContent: () => import("vue/jsx-runtime").JSX.Element;
    renderFooter: () => import("vue/jsx-runtime").JSX.Element;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {}, string, import("vue").VNodeProps & import("vue").AllowedComponentProps & import("vue").ComponentCustomProps, Readonly<import("vue").ExtractPropTypes<{
    controller: {
        type: PropType<EhrSearchBarController>;
        required: true;
    };
    modal: {
        type: PropType<IModal>;
    };
}>>, {}, {}>;
