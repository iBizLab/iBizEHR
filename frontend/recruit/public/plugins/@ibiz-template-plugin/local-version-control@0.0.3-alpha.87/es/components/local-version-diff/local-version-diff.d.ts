import { PropType } from 'vue';
import { IDBEntity } from '../../interface';
import './local-version-diff.scss';
declare const _default: import("vue").DefineComponent<{
    current: {
        type: PropType<IDBEntity>;
        required: true;
    };
    items: {
        type: PropType<IDBEntity[]>;
        required: true;
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    isLoading: import("vue").Ref<boolean>;
    selectedItem: import("vue").Ref<{
        id: string;
        caption: string;
        username: string;
        timestamp: number;
        data: IData;
        index: number;
    }>;
    diffEditorRef: import("vue").Ref<HTMLElement | undefined>;
    handleSelectChange: (value: string) => void;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {}, string, import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    current: {
        type: PropType<IDBEntity>;
        required: true;
    };
    items: {
        type: PropType<IDBEntity[]>;
        required: true;
    };
}>>, {}, {}>;
export default _default;
