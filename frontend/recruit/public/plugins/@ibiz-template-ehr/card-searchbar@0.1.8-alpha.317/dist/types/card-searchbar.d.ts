import { PropType, Ref } from 'vue';
import { ISearchBar, ISearchBarGroup } from '@ibiz/model-core';
import { IControlProvider } from '@ibiz-template/runtime';
import { CardSearchbarController } from './card-searchbar.controller';
export declare const CardSearchbar: import("vue").DefineComponent<{
    /**
     * @description 搜索栏模型数据
     */
    modelData: {
        type: PropType<ISearchBar>;
        required: true;
    };
    /**
     * @description 应用上下文对象
     */
    context: {
        type: PropType<import("@ibiz-template/core").IApiContext>;
        required: true;
    };
    /**
     * @description 视图参数对象
     * @default {}
     */
    params: {
        type: PropType<import("@ibiz-template/core").IApiParams>;
        default: () => {};
    };
    /**
     * @description 部件适配器
     */
    provider: {
        type: PropType<IControlProvider>;
    };
}, {
    c: CardSearchbarController;
    ns: import("@ibiz-template/core").Namespace;
    cssVars: import("vue").ComputedRef<Record<string, string>>;
    filterButtonRef: Ref<any>;
    counterData: Ref<import("@ibiz-template/core").IApiData>;
    onClear: () => void;
    onSearch: () => void;
    onKeydown: (e: KeyboardEvent) => void;
    onGroupClick: (item: ISearchBarGroup) => void;
    triggerFilter: () => void;
    handleSave: () => void;
    renderAdvancedSearch: () => import("vue/jsx-runtime").JSX.Element | null;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {}, string, import("vue").VNodeProps & import("vue").AllowedComponentProps & import("vue").ComponentCustomProps, Readonly<import("vue").ExtractPropTypes<{
    /**
     * @description 搜索栏模型数据
     */
    modelData: {
        type: PropType<ISearchBar>;
        required: true;
    };
    /**
     * @description 应用上下文对象
     */
    context: {
        type: PropType<import("@ibiz-template/core").IApiContext>;
        required: true;
    };
    /**
     * @description 视图参数对象
     * @default {}
     */
    params: {
        type: PropType<import("@ibiz-template/core").IApiParams>;
        default: () => {};
    };
    /**
     * @description 部件适配器
     */
    provider: {
        type: PropType<IControlProvider>;
    };
}>>, {
    params: import("@ibiz-template/core").IApiParams;
}, {}>;
