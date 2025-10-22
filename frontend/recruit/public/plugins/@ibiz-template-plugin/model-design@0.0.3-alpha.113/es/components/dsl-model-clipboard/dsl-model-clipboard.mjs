import { isVNode, ref, computed, createTextVNode, createVNode, resolveComponent, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import IBizDSLModelClipboardItem from './dsl-model-clipboard-item/dsl-model-clipboard-item.mjs';
import './dsl-model-clipboard.css';

"use strict";
function _isSlot(s) {
  return typeof s === "function" || Object.prototype.toString.call(s) === "[object Object]" && !isVNode(s);
}
var IBizDSLModelClipboard = /* @__PURE__ */ defineComponent({
  name: "IBizDSLModelClipboard",
  props: {
    context: {
      type: Object,
      default: () => ({})
    },
    params: {
      type: Object,
      default: () => ({})
    },
    modal: {
      type: Object
    }
  },
  setup(props) {
    var _a;
    const ns = useNamespace("dsl-model-clipboard");
    const controller = ibiz.modelClipboard;
    const enableMerge = ref(false);
    const items = computed(() => {
      return controller.state.items.filter((item) => item.type === "dsl");
    });
    const onClearSelected = () => {
      items.value.forEach((item) => {
        item.isSelected = false;
      });
    };
    const selected = computed(() => {
      return items.value.filter((item) => item.isSelected);
    });
    (_a = props.modal) == null ? void 0 : _a.hooks.beforeDismiss.tapPromise(async () => {
      onClearSelected();
    });
    const handleChange = (_val) => {
      onClearSelected();
    };
    const handleMerge = async () => {
      const models = [];
      selected.value.forEach((select) => {
        models.push(...select.models);
      });
      onClearSelected();
      ibiz.modelClipboard.createItem({
        models,
        type: "dsl",
        isMerge: true,
        title: "\u5408\u5E76\u6A21\u578B",
        codeName: "pssystem"
      });
    };
    const removeAll = async () => {
      if (controller.state.items.length > 0) {
        const result = await ibiz.confirm.warning({
          title: "\u786E\u8BA4\u5220\u9664\u6240\u6709?",
          desc: "\u786E\u8BA4\u5220\u9664\u5F53\u524D\u7C98\u8D34\u677F\u7684\u6570\u636E?"
        });
        if (result)
          controller.clearAll("dsl");
      }
    };
    const close = () => {
      var _a2;
      (_a2 = props.modal) == null ? void 0 : _a2.dismiss();
    };
    return {
      ns,
      items,
      selected,
      controller,
      enableMerge,
      close,
      removeAll,
      handleMerge,
      handleChange
    };
  },
  render() {
    let _slot;
    return createVNode("div", {
      "class": this.ns.b()
    }, [createVNode("div", {
      "class": this.ns.e("header")
    }, [createVNode("div", {
      "class": this.ns.em("header", "title")
    }, [createTextVNode("DSL\u6A21\u578B\u7C98\u8D34\u677F")]), createVNode("div", {
      "class": this.ns.e("actions")
    }, [createVNode("div", {
      "class": this.ns.em("actions", "merge")
    }, [this.enableMerge && createVNode("div", null, [createTextVNode("\u5DF2\u9009\u4E2D"), this.selected.length, createTextVNode("\u9879")]), createVNode(resolveComponent("el-switch"), {
      "size": "small",
      "active-text": "\u5408\u5E76\u6A21\u578B",
      "modelValue": this.enableMerge,
      "onUpdate:modelValue": ($event) => this.enableMerge = $event,
      "onChange": this.handleChange
    }, null)]), createVNode(resolveComponent("el-button"), {
      "size": "small",
      "type": "info",
      "onClick": () => this.removeAll()
    }, {
      default: () => [createTextVNode("\u6E05\u7A7A")]
    }), createVNode("ion-icon", {
      "name": "close-outline",
      "title": "\u5173\u95ED",
      "onClick": () => this.close()
    }, null)])]), createVNode("div", {
      "class": this.ns.e("content")
    }, [createVNode(resolveComponent("el-timeline"), null, _isSlot(_slot = this.items.map((item) => {
      return createVNode(IBizDSLModelClipboardItem, {
        "data": item,
        "key": item.uuid,
        "params": this.params,
        "context": this.context,
        "enableSelect": this.enableMerge,
        "onDelete": () => this.controller.removeById(item.uuid)
      }, null);
    })) ? _slot : {
      default: () => [_slot]
    })]), this.enableMerge && createVNode("div", {
      "class": this.ns.e("footer")
    }, [createVNode(resolveComponent("el-button"), {
      "title": "\u786E\u5B9A\u5408\u5E76",
      "class": this.ns.em("footer", "button"),
      "onClick": () => this.handleMerge()
    }, {
      default: () => [createVNode("span", null, [createTextVNode("\u786E\u5B9A\u5408\u5E76")])]
    })])]);
  }
});

export { IBizDSLModelClipboard as default };
