import { PropType } from 'vue';
import { IModelTreeNodeData } from './interface';
import './model-tree.scss';
declare const _default: import("vue").DefineComponent<{
    context: {
        type: PropType<IContext>;
        default: () => {};
    };
    params: {
        type: PropType<IParams>;
        default: () => {};
    };
    modelStr: {
        type: StringConstructor;
        required: true;
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    UUID: import("vue").Ref<string>;
    expandedKeys: import("vue").Ref<string[]>;
    load: (item: IData, callback: (_nodes: IModelTreeNodeData[]) => void) => Promise<void>;
    renderEditor: (data: IModelTreeNodeData) => any;
    onExpandChange: (id: string, isExpand: boolean) => void;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {
    change: (_value: string) => true;
}, string, import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    context: {
        type: PropType<IContext>;
        default: () => {};
    };
    params: {
        type: PropType<IParams>;
        default: () => {};
    };
    modelStr: {
        type: StringConstructor;
        required: true;
    };
}>> & {
    onChange?: ((_value: string) => any) | undefined;
}, {
    context: IContext;
    params: IParams;
}, {}>;
export default _default;
