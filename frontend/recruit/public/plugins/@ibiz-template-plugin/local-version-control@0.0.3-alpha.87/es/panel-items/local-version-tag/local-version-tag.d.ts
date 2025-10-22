import { PropType } from 'vue';
import { IPanelField } from '@ibiz/model-core';
import { IModalData } from '@ibiz-template/runtime';
import { LocalVersionTagController } from './local-version-tag.controller';
import './local-version-tag.scss';
declare const _default: import("vue").DefineComponent<{
    modelData: {
        type: PropType<IPanelField>;
        required: true;
    };
    controller: {
        type: typeof LocalVersionTagController;
        required: true;
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    state: import("./local-version-tag.state").LocalVersionTagState;
    timeStr: import("vue").ComputedRef<string>;
    openVersionList: () => Promise<IModalData>;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {}, string, import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    modelData: {
        type: PropType<IPanelField>;
        required: true;
    };
    controller: {
        type: typeof LocalVersionTagController;
        required: true;
    };
}>>, {}, {}>;
export default _default;
