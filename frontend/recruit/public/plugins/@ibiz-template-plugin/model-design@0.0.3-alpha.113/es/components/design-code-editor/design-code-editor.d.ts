import { IAppDEACMode } from '@ibiz/model-core';
import { PropType } from 'vue';
import * as monaco from 'monaco-editor';
import './design-code-editor.scss';
declare const _default: import("vue").DefineComponent<{
    modelValue: StringConstructor;
    language: {
        type: StringConstructor;
        default: string;
    };
    readonly: {
        type: BooleanConstructor;
        default: boolean;
    };
    minimap: {
        type: BooleanConstructor;
        default: boolean;
    };
    isChangeLanguage: {
        type: BooleanConstructor;
        default: boolean;
    };
    showToolbar: {
        type: BooleanConstructor;
        default: boolean;
    };
    isEnableLoad: {
        type: BooleanConstructor;
        default: boolean;
    };
    deACMode: {
        type: PropType<IAppDEACMode>;
    };
    openAIChat: {
        type: PropType<() => Promise<void>>;
    };
    enableCompletion: {
        type: BooleanConstructor;
        default: boolean;
    };
    provideCompletionItems: {
        type: PropType<(model: IParams, position: IParams) => {
            suggestions: {
                label: string;
                kind: number;
                detail: number;
                insertText: string;
            };
        }>;
    };
    expandSuggestDetails: {
        type: BooleanConstructor;
        default: boolean;
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    editor: monaco.editor.IStandaloneCodeEditor | undefined;
    containerRef: import("vue").Ref<HTMLElement | undefined>;
    editorRef: import("vue").Ref<HTMLElement | undefined>;
    languages: import("vue").Ref<string[]>;
    currentLanguage: import("vue").Ref<string>;
    isFullScreen: import("vue").Ref<boolean>;
    isLoading: import("vue").Ref<boolean>;
    handleLanguageChange: () => void;
    onToolBarClick: (value: boolean) => Promise<void>;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {
    'update:modelValue': (_value: string) => true;
}, string, import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    modelValue: StringConstructor;
    language: {
        type: StringConstructor;
        default: string;
    };
    readonly: {
        type: BooleanConstructor;
        default: boolean;
    };
    minimap: {
        type: BooleanConstructor;
        default: boolean;
    };
    isChangeLanguage: {
        type: BooleanConstructor;
        default: boolean;
    };
    showToolbar: {
        type: BooleanConstructor;
        default: boolean;
    };
    isEnableLoad: {
        type: BooleanConstructor;
        default: boolean;
    };
    deACMode: {
        type: PropType<IAppDEACMode>;
    };
    openAIChat: {
        type: PropType<() => Promise<void>>;
    };
    enableCompletion: {
        type: BooleanConstructor;
        default: boolean;
    };
    provideCompletionItems: {
        type: PropType<(model: IParams, position: IParams) => {
            suggestions: {
                label: string;
                kind: number;
                detail: number;
                insertText: string;
            };
        }>;
    };
    expandSuggestDetails: {
        type: BooleanConstructor;
        default: boolean;
    };
}>> & {
    "onUpdate:modelValue"?: ((_value: string) => any) | undefined;
}, {
    language: string;
    readonly: boolean;
    minimap: boolean;
    isChangeLanguage: boolean;
    showToolbar: boolean;
    isEnableLoad: boolean;
    enableCompletion: boolean;
    expandSuggestDetails: boolean;
}, {}>;
export default _default;
