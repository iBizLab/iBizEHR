import { ref, onMounted, createTextVNode, createVNode, resolveComponent, resolveDirective, withDirectives, defineComponent } from 'vue';
import { ControlVO } from '@ibiz-template/runtime';
import { useNamespace } from '@ibiz-template/vue3-util';
import './model-clone.css';

"use strict";
var IBizModelClone = /* @__PURE__ */ defineComponent({
  name: "IBizModelClone",
  props: {
    item: {
      type: Object,
      required: true
    },
    modal: {
      type: Object,
      required: true
    },
    params: {
      type: Object,
      default: () => ({})
    },
    modelData: {
      type: Object,
      required: true
    },
    context: {
      type: Object,
      default: () => ({})
    }
  },
  setup(props) {
    const ns = useNamespace("model-clone");
    const data = ref();
    const isLoaded = ref(false);
    const app = ibiz.hub.getApp(props.context.srfappid);
    const deCodeName = props.item.srfdecodename;
    const context = props.context.clone();
    context[deCodeName.toLowerCase()] = props.item.srfkey;
    const load = async () => {
      try {
        isLoaded.value = false;
        const result = await app.deService.exec(deCodeName, "CopyModel", context, props.params);
        if (result.ok && result.data) {
          data.value = result.data;
        }
      } catch (error) {
        ibiz.message.error(error.message || "\u6A21\u578B\u62F7\u8D1D\u53D1\u751F\u672A\u77E5\u9519\u8BEF!");
      } finally {
        isLoaded.value = true;
      }
    };
    onMounted(() => {
      load();
    });
    const onFormDataChange = (event) => {
      if (data.value) {
        const item = event.data[0];
        data.value.model = item instanceof ControlVO ? item.$origin : item;
      }
    };
    const onConfirm = async () => {
      try {
        if (data.value) {
          const result = await app.deService.exec(deCodeName, "PasteModel", context, {
            ...data.value
          }, props.params);
          if (result.ok) {
            return props.modal.dismiss({
              ok: true
            });
          }
        }
      } catch (error) {
        ibiz.message.error(error.message || "\u6A21\u578B\u62F7\u8D1D\u53D1\u751F\u672A\u77E5\u9519\u8BEF!");
      }
      return props.modal.dismiss();
    };
    const onCancel = () => {
      props.modal.dismiss();
    };
    return {
      ns,
      data,
      isLoaded,
      onCancel,
      onConfirm,
      onFormDataChange
    };
  },
  render() {
    var _a;
    return withDirectives(createVNode("div", {
      "class": this.ns.b()
    }, [createVNode("div", {
      "class": this.ns.e("title")
    }, [createTextVNode("\u6A21\u578B\u62F7\u8D1D")]), createVNode("div", {
      "class": this.ns.e("content")
    }, [this.isLoaded && createVNode(resolveComponent("iBizControlShell"), {
      "isSimple": true,
      "data": (_a = this.data) == null ? void 0 : _a.model,
      "context": this.context,
      "params": this.params,
      "modelData": this.modelData,
      "class": this.ns.em("content", "control"),
      "onFormDataChange": this.onFormDataChange
    }, null)]), createVNode("div", {
      "class": this.ns.e("footer")
    }, [createVNode(resolveComponent("el-button"), {
      "title": "\u786E\u8BA4",
      "onClick": () => this.onConfirm()
    }, {
      default: () => [createTextVNode("\u786E\u8BA4")]
    }), createVNode(resolveComponent("el-button"), {
      "title": "\u53D6\u6D88",
      "onClick": () => this.onCancel()
    }, {
      default: () => [createTextVNode("\u53D6\u6D88")]
    })])]), [[resolveDirective("loading"), !this.isLoaded]]);
  }
});

export { IBizModelClone as default };
