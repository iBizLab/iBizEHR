import { PropType, Ref } from 'vue';
import { IDBEntity, IVersionControlController } from '../../interface';
import './local-version-list.scss';
declare const _default: import("vue").DefineComponent<{
    controller: {
        type: PropType<IVersionControlController>;
        required: true;
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    query: Ref<string>;
    items: Ref<IDBEntity[]>;
    handleAction: (tag: string, data: IDBEntity, event: MouseEvent) => void;
    handleQueryChange: (value: string) => Promise<void>;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {}, string, import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    controller: {
        type: PropType<IVersionControlController>;
        required: true;
    };
}>>, {}, {}>;
export default _default;
