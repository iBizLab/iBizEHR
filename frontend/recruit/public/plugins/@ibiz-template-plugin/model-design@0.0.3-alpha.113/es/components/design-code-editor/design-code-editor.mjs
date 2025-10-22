import { isVNode, ref, watch, nextTick, onMounted, onUnmounted, resolveComponent, createVNode, resolveDirective, withDirectives, defineComponent } from 'vue';
import { useNamespace, useUIStore } from '@ibiz-template/vue3-util';
import '../../node_modules/.pnpm/@monaco-editor_loader@1.4.0_monaco-editor@0.45.0/node_modules/@monaco-editor/loader/lib/es/index.mjs';
import { createUUID } from 'qx-util';
import './design-code-editor.css';
import loader from '../../node_modules/.pnpm/@monaco-editor_loader@1.4.0_monaco-editor@0.45.0/node_modules/@monaco-editor/loader/lib/es/loader/index.mjs';

"use strict";
function _isSlot(s) {
  return typeof s === "function" || Object.prototype.toString.call(s) === "[object Object]" && !isVNode(s);
}
var IBizDesignCodeEditor = /* @__PURE__ */ defineComponent({
  name: "IBizDesignCodeEditor",
  props: {
    modelValue: String,
    language: {
      type: String,
      default: "json"
    },
    readonly: {
      type: Boolean,
      default: false
    },
    minimap: {
      type: Boolean,
      default: true
    },
    isChangeLanguage: {
      type: Boolean,
      default: true
    },
    showToolbar: {
      type: Boolean,
      default: true
    },
    isEnableLoad: {
      type: Boolean,
      default: true
    },
    deACMode: {
      type: Object
    },
    openAIChat: {
      type: Function
    },
    enableCompletion: {
      type: Boolean,
      default: false
    },
    provideCompletionItems: {
      type: Function
    },
    expandSuggestDetails: {
      type: Boolean,
      default: false
    }
  },
  emits: {
    "update:modelValue": (_value) => true
  },
  setup(props, {
    emit
  }) {
    const ns = useNamespace("design-code-editor");
    const containerRef = ref();
    const editorRef = ref();
    const UUID = createUUID();
    let editor;
    let codeLensProviderDisposable;
    let monacoEditor;
    let codeCompletion;
    const languages = ref(["json", "javascript", "typescript", "css", "less", "sass", "java", "sql", "vue", "python"]);
    const currentLanguage = ref(props.language);
    const isLoading = ref(false);
    const {
      UIStore
    } = useUIStore();
    const getMonacoTheme = (name) => {
      return name === "dark" ? "vs-".concat(UIStore.theme) : "vs";
    };
    watch(() => UIStore.theme, (newVal) => {
      monacoEditor.setTheme(getMonacoTheme(newVal));
    });
    watch(() => props.modelValue, () => {
      if (editor && props.modelValue !== editor.getValue()) {
        editor.setValue(props.modelValue || "");
      }
    }, {
      immediate: true
    });
    const validate = (model) => {
      const currentEditor = monacoEditor.getEditors().find((e) => e.getModel() === model);
      if (!currentEditor || currentEditor.__instanceId !== UUID)
        return false;
      return true;
    };
    const editorInit = () => {
      if (!editorRef.value) {
        return;
      }
      nextTick(() => {
        isLoading.value = true;
        loader.config({
          paths: {
            vs: "".concat(ibiz.env.pluginBaseUrl, "/monaco-editor@0.45.0/min/vs")
          }
        });
        loader.init().then((loaderMonaco) => {
          var _a, _b, _c;
          isLoading.value = false;
          if (editor) {
            return;
          }
          if (!editorRef.value || !loaderMonaco) {
            return;
          }
          monacoEditor = loaderMonaco.editor;
          loaderMonaco.languages.register({
            id: "groovy"
          });
          loaderMonaco.languages.setMonarchTokensProvider("groovy", {
            tokenizer: {
              root: [
                [/\/\/.*$/, "comment"],
                // 单行注释
                [/\/\*/, "comment", "@comment"],
                // 多行注释
                [/(println|def|return|if|else|for|while|psdelogic|psdelogicparam|psdelogicnode|psdelogiclink)\b/, "keyword"],
                // 关键字
                [/"[^"]*"/, "string"],
                // 双引号字符串
                [/'[^']*'/, "string"],
                // 单引号字符串
                [/\d+/, "number"],
                // 数字
                [/[\+\-\*\/=<>!]+/, "operator"]
                // 操作符
              ],
              comment: [[/.*?\*\//, "comment", "@pop"], [/.*/, "comment"]]
            }
          });
          editor = monacoEditor.create(editorRef.value, {
            language: currentLanguage.value,
            theme: getMonacoTheme(UIStore.theme),
            minimap: {
              enabled: props.minimap
            },
            readOnly: props.readonly,
            readOnlyMessage: {
              value: ibiz.i18n.t("editor.code.readOnlyPrompt")
            },
            value: props.modelValue,
            wordWrap: "on"
          });
          if (props.expandSuggestDetails) {
            (_c = (_b = (_a = editor.getContribution("editor.contrib.suggestController")) == null ? void 0 : _a.widget) == null ? void 0 : _b.value) == null ? void 0 : _c._setDetailsVisible(true);
          }
          editor.__instanceId = UUID;
          if (props.deACMode && props.openAIChat && ibiz.env.enableAI) {
            codeLensProviderDisposable = loaderMonaco.languages.registerCodeLensProvider(currentLanguage.value, {
              provideCodeLenses(model, _token) {
                if (!validate(model))
                  return {
                    lenses: [],
                    dispose: () => {
                    }
                  };
                return {
                  lenses: [{
                    id: "AI",
                    range: new loaderMonaco.Range(1, 1, 1, 1),
                    command: {
                      title: "".concat(props.deACMode.logicName),
                      id: editor.addCommand(0, () => {
                        props.openAIChat();
                      })
                    }
                  }],
                  dispose: () => {
                  }
                };
              },
              resolveCodeLens: (_model, codeLens, _token) => codeLens
            });
          }
          if (props.enableCompletion) {
            codeCompletion = loaderMonaco.languages.registerCompletionItemProvider(currentLanguage.value, {
              triggerCharacters: ["-", "--"],
              // 输入.或者空格触发
              provideCompletionItems: (model, position) => {
                if (!validate(model) || !props.provideCompletionItems)
                  return {
                    suggestions: []
                  };
                if (props.provideCompletionItems)
                  return props.provideCompletionItems(model, position);
              }
            });
          }
          editor.onDidChangeModelContent(() => {
            if (editor) {
              emit("update:modelValue", editor.getValue());
            }
          });
        }).catch(() => {
          isLoading.value = false;
        });
      });
    };
    const handleLanguageChange = () => {
      editor == null ? void 0 : editor.dispose();
      editor = void 0;
      editorInit();
      if (editor) {
        editor.layout();
      }
    };
    const isFullScreen = ref(false);
    const onToolBarClick = async (value) => {
      isFullScreen.value = value;
      if (!editorRef.value) {
        return;
      }
      const container = containerRef.value;
      if (!container) {
        return;
      }
      if (isFullScreen.value) {
        container.requestFullscreen();
      } else {
        await document.exitFullscreen();
        editor == null ? void 0 : editor.dispose();
        editor = void 0;
        editorInit();
        if (editor) {
          editor.layout();
        }
      }
    };
    const handleResize = () => {
      editor == null ? void 0 : editor.layout();
    };
    const handleFullScreenChange = () => {
      isFullScreen.value = !!document.fullscreenElement;
    };
    let resizeObserver;
    onMounted(() => {
      editorInit();
      window.addEventListener("resize", handleResize);
      if (containerRef.value) {
        containerRef.value.addEventListener("fullscreenchange", handleFullScreenChange);
        resizeObserver = new ResizeObserver(() => {
          handleResize();
        });
        resizeObserver.observe(containerRef.value);
      }
    });
    onUnmounted(() => {
      var _a;
      window.removeEventListener("resize", handleResize);
      (_a = containerRef.value) == null ? void 0 : _a.removeEventListener("fullscreenchange", handleFullScreenChange);
      resizeObserver == null ? void 0 : resizeObserver.disconnect();
      codeLensProviderDisposable == null ? void 0 : codeLensProviderDisposable.dispose();
      codeCompletion == null ? void 0 : codeCompletion.dispose();
    });
    return {
      ns,
      editor,
      containerRef,
      editorRef,
      languages,
      currentLanguage,
      isFullScreen,
      isLoading,
      handleLanguageChange,
      onToolBarClick
    };
  },
  render() {
    var _a, _b;
    let _slot;
    return withDirectives(createVNode("div", {
      "class": [this.ns.b(), this.ns.is("full-screen", this.isFullScreen)],
      "ref": "containerRef"
    }, [this.showToolbar && createVNode("div", {
      "class": this.ns.b("toolbar")
    }, [createVNode("div", {
      "class": this.ns.b("left-toolbar")
    }, [createVNode(resolveComponent("el-select"), {
      "modelValue": this.currentLanguage,
      "onUpdate:modelValue": ($event) => this.currentLanguage = $event,
      "disabled": !this.isChangeLanguage,
      "onChange": this.handleLanguageChange,
      "teleported": false
    }, _isSlot(_slot = this.languages.map((item) => {
      return createVNode(resolveComponent("el-option"), {
        "key": item,
        "label": item,
        "value": item
      }, null);
    })) ? _slot : {
      default: () => [_slot]
    })]), createVNode("div", {
      "class": this.ns.b("right-toolbar")
    }, [(_b = (_a = this.$slots).rightToolbar) == null ? void 0 : _b.call(_a), this.isFullScreen ? createVNode("ion-icon", {
      "title": "\u9000\u51FA\u5168\u5C4F",
      "name": "contract-outline",
      "onClick": () => this.onToolBarClick(false)
    }, null) : createVNode("ion-icon", {
      "title": "\u5168\u5C4F",
      "name": "resize-outline",
      "onClick": () => this.onToolBarClick(true)
    }, null)])]), createVNode("div", {
      "class": this.ns.b("content"),
      "ref": "editorRef"
    }, null)]), [[resolveDirective("loading"), this.isEnableLoad && this.isLoading]]);
  }
});

export { IBizDesignCodeEditor as default };
