import { PropType } from 'vue';
import { IDBEntity, IVersionControlController } from '../../interface';
import './local-version-item.scss';
declare const _default: import("vue").DefineComponent<{
    item: {
        type: PropType<IDBEntity>;
        required: true;
    };
    items: {
        type: PropType<IDBEntity[]>;
        required: true;
    };
    controller: {
        type: PropType<IVersionControlController>;
        required: true;
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    timeStr: import("vue").ComputedRef<string>;
    editing: import("vue").Ref<boolean>;
    showCompare: import("vue").ComputedRef<boolean>;
    isActive: import("vue").ComputedRef<boolean>;
    actionClick: (tag: string, event: MouseEvent) => void;
    renderInput: () => string | import("vue/jsx-runtime").JSX.Element;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {
    action: (tag: string, item: IDBEntity, event: MouseEvent) => true;
}, string, import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    item: {
        type: PropType<IDBEntity>;
        required: true;
    };
    items: {
        type: PropType<IDBEntity[]>;
        required: true;
    };
    controller: {
        type: PropType<IVersionControlController>;
        required: true;
    };
}>> & {
    onAction?: ((tag: string, item: IDBEntity, event: MouseEvent) => any) | undefined;
}, {}, {}>;
export default _default;
