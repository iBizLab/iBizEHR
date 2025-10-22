import { isVNode, ref, watch, onMounted, onUnmounted, createTextVNode, createVNode, resolveComponent, resolveDirective, withDirectives, defineComponent } from 'vue';
import { useNamespace, useUIStore } from '@ibiz-template/vue3-util';
import '../../node_modules/.pnpm/@monaco-editor_loader@1.4.0_monaco-editor@0.51.0/node_modules/@monaco-editor/loader/lib/es/index.mjs';
import './local-version-diff.css';
import loader from '../../node_modules/.pnpm/@monaco-editor_loader@1.4.0_monaco-editor@0.51.0/node_modules/@monaco-editor/loader/lib/es/loader/index.mjs';

"use strict";
function _isSlot(s) {
  return typeof s === "function" || Object.prototype.toString.call(s) === "[object Object]" && !isVNode(s);
}
var IBizLocalVersionDiff = /* @__PURE__ */ defineComponent({
  props: {
    current: {
      type: Object,
      required: true
    },
    items: {
      type: Object,
      required: true
    }
  },
  setup(props) {
    const ns = useNamespace("local-version-diff");
    const isLoading = ref(false);
    const selectedItem = ref(props.items.find((item) => item.id !== props.current.id) || props.current);
    const diffEditorRef = ref();
    let monacoEditor;
    let diffEditor;
    let originalModel;
    let modifiedModel;
    let resizeObserver;
    const {
      UIStore
    } = useUIStore();
    const getMonacoTheme = (name) => {
      return name === "dark" ? "vs-".concat(UIStore.theme) : "vs";
    };
    watch(() => UIStore.theme, (newVal) => {
      monacoEditor == null ? void 0 : monacoEditor.setTheme(getMonacoTheme(newVal));
      diffEditor == null ? void 0 : diffEditor.layout();
    });
    const initEditor = async () => {
      if (!diffEditorRef.value) {
        return;
      }
      try {
        isLoading.value = true;
        loader.config({
          paths: {
            vs: "".concat(ibiz.env.pluginBaseUrl, "/monaco-editor@0.45.0/min/vs")
          }
        });
        const loaderMonaco = await loader.init();
        monacoEditor = loaderMonaco.editor;
        diffEditor = monacoEditor.createDiffEditor(diffEditorRef.value, {
          theme: getMonacoTheme(UIStore.theme),
          readOnly: true,
          readOnlyMessage: {
            value: ibiz.i18n.t("editor.code.readOnlyPrompt")
          }
        });
        originalModel = monacoEditor.createModel(props.current.data ? JSON.stringify(props.current.data, null, 2) : "", "json");
        modifiedModel = monacoEditor.createModel(selectedItem.value.data ? JSON.stringify(selectedItem.value.data, null, 2) : "", "json");
        diffEditor.setModel({
          original: originalModel,
          modified: modifiedModel
        });
      } finally {
        isLoading.value = false;
      }
    };
    const handleSelectChange = (value) => {
      selectedItem.value = props.items.find((item) => item.id === value) || props.current;
      if (!diffEditor || !monacoEditor || !originalModel || !modifiedModel) {
        return;
      }
      modifiedModel.setValue(selectedItem.value.data ? JSON.stringify(selectedItem.value.data, null, 2) : "");
      diffEditor.setModel({
        original: originalModel,
        modified: modifiedModel
      });
    };
    onMounted(() => {
      initEditor();
      if (diffEditorRef.value) {
        resizeObserver = new ResizeObserver(() => {
          diffEditor == null ? void 0 : diffEditor.layout();
        });
        resizeObserver.observe(diffEditorRef.value);
      }
    });
    onUnmounted(() => {
      resizeObserver == null ? void 0 : resizeObserver.disconnect();
    });
    return {
      ns,
      isLoading,
      selectedItem,
      diffEditorRef,
      handleSelectChange
    };
  },
  render() {
    let _slot;
    return withDirectives(createVNode("div", {
      "class": this.ns.b()
    }, [createVNode("div", {
      "class": this.ns.b("header")
    }, [createTextVNode("\u7248\u672C\u6BD4\u5BF9")]), createVNode("div", {
      "class": this.ns.b("content")
    }, [createVNode("div", {
      "class": this.ns.b("toolbar")
    }, [createVNode(resolveComponent("el-select"), {
      "model-value": this.current.id,
      "disabled": true
    }, {
      default: () => [createVNode(resolveComponent("el-option"), {
        "value": this.current.id,
        "label": this.current.caption
      }, null)]
    }), createVNode(resolveComponent("el-select"), {
      "model-value": this.selectedItem.id,
      "onChange": this.handleSelectChange
    }, _isSlot(_slot = this.items.map((item) => {
      return createVNode(resolveComponent("el-option"), {
        "key": item.id,
        "value": item.id,
        "label": item.caption
      }, null);
    })) ? _slot : {
      default: () => [_slot]
    })]), createVNode("div", {
      "class": this.ns.b("editor"),
      "ref": "diffEditorRef"
    }, null)])]), [[resolveDirective("loading"), this.isLoading]]);
  }
});

export { IBizLocalVersionDiff as default };
