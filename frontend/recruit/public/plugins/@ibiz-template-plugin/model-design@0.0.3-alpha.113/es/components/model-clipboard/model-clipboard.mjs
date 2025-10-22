import { isVNode, createVNode, resolveComponent, createTextVNode, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import './model-clipboard.css';

"use strict";
function _isSlot(s) {
  return typeof s === "function" || Object.prototype.toString.call(s) === "[object Object]" && !isVNode(s);
}
var IBizModelClipboard = /* @__PURE__ */ defineComponent({
  name: "IBizModelClipboard",
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
    },
    type: {
      type: String,
      default: "default"
    }
  },
  setup(props) {
    const ns = useNamespace("model-clipboard");
    const controller = ibiz.modelClipboard;
    const removeAll = async () => {
      if (controller.state.items.length > 0) {
        const result = await ibiz.confirm.warning({
          title: "\u786E\u8BA4\u5220\u9664\u6240\u6709?",
          desc: "\u786E\u8BA4\u5220\u9664\u5F53\u524D\u7C98\u8D34\u677F\u7684\u6570\u636E?"
        });
        if (result) {
          controller.clearAll(props.type);
        }
      }
    };
    const close = () => {
      var _a;
      (_a = props.modal) == null ? void 0 : _a.dismiss();
    };
    return {
      ns,
      controller,
      removeAll,
      close
    };
  },
  render() {
    let _slot;
    return createVNode("div", {
      "class": this.ns.b()
    }, [createVNode("div", {
      "class": this.ns.b("header")
    }, [createVNode("div", {
      "class": this.ns.b("header-title")
    }, ["".concat(this.type === "advanced" ? "\u9AD8\u7EA7" : "", "\u6A21\u578B\u7C98\u8D34\u677F")]), createVNode("div", {
      "class": this.ns.b("header-actions")
    }, [createVNode(resolveComponent("el-button"), {
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
      "class": this.ns.b("content")
    }, [createVNode(resolveComponent("el-timeline"), null, _isSlot(_slot = this.controller.state.items.filter((item) => item.type === this.type).map((item) => {
      return createVNode(resolveComponent("iBizModelClipboardItem"), {
        "key": item.uuid,
        "context": this.context,
        "params": this.params,
        "data": item,
        "onDelete": () => this.controller.removeById(item.uuid)
      }, null);
    })) ? _slot : {
      default: () => [_slot]
    })])]);
  }
});

export { IBizModelClipboard as default };
