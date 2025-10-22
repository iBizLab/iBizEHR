import { CodeEditorController } from '../code-editor.controller';
import './monaco-editor.scss';
export declare const IBizAICode: import("vue").DefineComponent<{
    value: StringConstructor;
    language: {
        type: StringConstructor;
    };
    theme: {
        type: StringConstructor;
    };
    controller: import("@ibiz-template/vue3-util").RequiredProp<import("vue").PropType<CodeEditorController>, undefined, undefined>;
    data: import("@ibiz-template/vue3-util").RequiredProp<import("vue").PropType<IData>, undefined, undefined>;
    disabled: {
        type: BooleanConstructor;
    };
    readonly: {
        type: BooleanConstructor;
        default: boolean;
    };
    autoFocus: {
        type: BooleanConstructor;
        default: boolean;
    };
    overflowMode: {
        type: StringConstructor;
    };
    controlParams: {
        type: ObjectConstructor;
        required: boolean;
    };
}, {
    ns: import("@ibiz-template/core").Namespace;
    currentVal: import("vue").Ref<string>;
    codeEditBox: import("vue").Ref<any>;
    isFullScreen: import("vue").Ref<boolean>;
    hasEnableEdit: import("vue").Ref<boolean>;
    readonlyState: import("vue").Ref<boolean>;
    isLoading: import("vue").Ref<boolean>;
    isTSFileLoading: import("vue").Ref<boolean>;
    renderFooter: () => import("vue/jsx-runtime").JSX.Element | null;
    renderHeaderToolbar: () => import("vue/jsx-runtime").JSX.Element | null;
    renderCodeContent: () => import("vue/jsx-runtime").JSX.Element;
    changeFullScreenState: () => Promise<void>;
}, unknown, {}, {}, import("vue").ComponentOptionsMixin, import("vue").ComponentOptionsMixin, {
    change: (_value: unknown, _name?: string | undefined, _ignore?: boolean | undefined) => boolean;
    blur: (_event?: IData | undefined) => boolean;
    focus: (_event?: IData | undefined) => boolean;
    enter: (_event?: IData | undefined) => boolean;
    infoTextChange: (_text: string) => boolean;
}, string, import("vue").PublicProps, Readonly<import("vue").ExtractPropTypes<{
    value: StringConstructor;
    language: {
        type: StringConstructor;
    };
    theme: {
        type: StringConstructor;
    };
    controller: import("@ibiz-template/vue3-util").RequiredProp<import("vue").PropType<CodeEditorController>, undefined, undefined>;
    data: import("@ibiz-template/vue3-util").RequiredProp<import("vue").PropType<IData>, undefined, undefined>;
    disabled: {
        type: BooleanConstructor;
    };
    readonly: {
        type: BooleanConstructor;
        default: boolean;
    };
    autoFocus: {
        type: BooleanConstructor;
        default: boolean;
    };
    overflowMode: {
        type: StringConstructor;
    };
    controlParams: {
        type: ObjectConstructor;
        required: boolean;
    };
}>> & {
    onChange?: ((_value: unknown, _name?: string | undefined, _ignore?: boolean | undefined) => any) | undefined;
    onBlur?: ((_event?: IData | undefined) => any) | undefined;
    onFocus?: ((_event?: IData | undefined) => any) | undefined;
    onEnter?: ((_event?: IData | undefined) => any) | undefined;
    onInfoTextChange?: ((_text: string) => any) | undefined;
}, {
    readonly: boolean;
    disabled: boolean;
    autoFocus: boolean;
}, {}>;
