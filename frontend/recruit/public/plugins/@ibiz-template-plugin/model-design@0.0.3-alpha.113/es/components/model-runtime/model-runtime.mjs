import { computed, createTextVNode, createVNode, resolveComponent, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import { getToken } from '@ibiz-template/core';
import { resource } from '../../global.mjs';
import './model-runtime.css';

"use strict";
var IBizModelRuntime = /* @__PURE__ */ defineComponent({
  name: "IBizModelRuntime",
  props: {
    title: {
      type: String
    },
    modal: {
      type: Object
    },
    entity: {
      type: Object,
      required: true
    },
    context: {
      type: Object,
      default: () => ({})
    },
    params: {
      type: Object,
      default: () => ({})
    }
  },
  setup(props) {
    const ns = useNamespace("model-runtime");
    const headers = computed(() => {
      return {
        psdevslnsys: props.context.psdevslnsys,
        Authorization: "Bearer ".concat(getToken()),
        "Content-Type": "application/json"
      };
    });
    const parentKey = computed(() => {
      return "".concat(props.entity.name, "__").concat(props.context[props.entity.name.toLowerCase()]);
    });
    const url = computed(() => {
      return "".concat(ibiz.env.baseUrl, "/").concat(ibiz.env.appId, "/psdevslnsys/").concat(props.context.psdevslnsys, "/getruntimenodes");
    });
    const configBaseUrl = resource.dir("assets/json/runtime-model");
    const onClose = () => {
      var _a;
      (_a = props.modal) == null ? void 0 : _a.dismiss();
    };
    return {
      ns,
      url,
      headers,
      parentKey,
      configBaseUrl,
      onClose
    };
  },
  render() {
    return createVNode("div", {
      "class": this.ns.b()
    }, [createVNode("div", {
      "class": this.ns.e("title")
    }, [createVNode("div", {
      "class": this.ns.em("title", "caption")
    }, [createTextVNode("\u6A21\u578B\u8FD0\u884C\u65F6")]), createVNode("ion-icon", {
      "name": "close-outline",
      "title": "\u9000\u51FA",
      "class": this.ns.em("title", "icon"),
      "onClick": this.onClose
    }, null)]), createVNode("div", {
      "class": this.ns.e("content")
    }, [createVNode(resolveComponent("ibiz-model-runtime"), {
      "id": "root",
      "url": this.url,
      "headers": this.headers,
      "parentKey": this.parentKey,
      "configBaseUrl": this.configBaseUrl
    }, null), createVNode(resolveComponent("loading-mask"), {
      "id": "rootLoadingMask",
      "default-show": "true"
    }, null), createVNode(resolveComponent("loading-panel"), {
      "id": "rootLoadingPanel"
    }, null)])]);
  }
});

export { IBizModelRuntime as default };
