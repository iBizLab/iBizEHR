import { ref, computed, onUnmounted, resolveComponent, createVNode, createTextVNode, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import './dsl-model-clipboard-item.css';

"use strict";
var IBizDSLModelClipboardItem = /* @__PURE__ */ defineComponent({
  name: "IBizDSLModelClipboardItem",
  props: {
    context: {
      type: Object,
      default: () => ({})
    },
    params: {
      type: Object,
      default: () => ({})
    },
    data: {
      type: Object,
      required: true
    },
    enableSelect: {
      type: Boolean,
      default: false
    }
  },
  emits: ["delete"],
  setup(props, {
    emit
  }) {
    const ns = useNamespace("dsl-model-clipboard-item");
    const modelClipboardController = ibiz.modelClipboard;
    const isLoading = ref(false);
    const isDestroyed = ref(false);
    const stateType = computed(() => {
      let type = "info";
      if (props.data.isError) {
        type = "danger";
      } else if (props.data.isExport) {
        type = "success";
      } else if (isLoading.value) {
        type = "warning";
      }
      return type;
    });
    const init = async () => {
      if (!props.data.isExport) {
        try {
          const srfkeys = props.data.items.map((item) => item.srfkey);
          const dsl = {};
          props.data.models.filter((model) => !!model.dsl).forEach((model, index) => {
            Object.assign(dsl, {
              [index]: model.dsl
            });
          });
          if (props.data.isMerge)
            props.data.models = [];
          isLoading.value = true;
          const entity = await ibiz.hub.getAppDataEntity(props.data.codeName, props.context.srfappid);
          const app = ibiz.hub.getApp(props.context.srfappid);
          const service = await app.deService.getService(props.context, entity.id);
          const res = await service.exec(props.data.isMerge ? "mergemodeldsl" : "ExportModelDSL", props.data.isMerge ? props.context : {
            ...props.context,
            [entity.deapicodeName]: "___srfkeys___"
          }, props.data.isMerge ? {
            ...props.params,
            dsl
          } : {
            ...props.params,
            srfkeys: srfkeys.join(";")
          });
          if (res.ok && res.data) {
            const data = res.data;
            props.data.models.push(data);
          }
        } catch (err) {
          props.data.isError = true;
          props.data.errorInfo = err.message || "\u6A21\u578B".concat(props.data.isMerge ? "\u5408\u5E76" : "\u5BFC\u51FA", "\u53D1\u751F\u672A\u77E5\u9519\u8BEF!");
          ibiz.message.error(props.data.errorInfo);
        }
        props.data.isExport = true;
        modelClipboardController.saveToStore();
        setTimeout(() => {
          isLoading.value = false;
        }, 300);
      }
    };
    init();
    const copy = () => {
      const el = document.createElement("textarea");
      el.style.position = "absolute";
      el.style.left = "-9999px";
      const dslModels = props.data.models.filter((m) => !!m.dsl).map((m) => m.dsl);
      el.value = dslModels.join("\n");
      document.body.appendChild(el);
      el.select();
      const result = document.execCommand("copy");
      document.body.removeChild(el);
      if (result) {
        ibiz.message.success("\u5DF2\u590D\u5236\u6A21\u578B\u6570\u636E\u81F3\u526A\u8D34\u677F");
      } else {
        ibiz.message.error("\u590D\u5236\u6A21\u578B\u6570\u636E\u5931\u8D25");
      }
    };
    const remove = () => {
      emit("delete");
    };
    onUnmounted(() => {
      isDestroyed.value = true;
    });
    return {
      ns,
      stateType,
      isLoading,
      modelClipboardController,
      copy,
      remove
    };
  },
  render() {
    return createVNode(resolveComponent("el-timeline-item"), {
      "class": this.ns.b(),
      "timestamp": this.data.createdDate,
      "type": this.stateType,
      "placement": "top"
    }, {
      default: () => [createVNode(resolveComponent("el-card"), {
        "shadow": "hover"
      }, {
        default: () => [createVNode("div", {
          "class": this.ns.e("content")
        }, [createVNode("div", {
          "class": this.ns.em("content", "title")
        }, [createVNode(resolveComponent("el-input"), {
          "modelValue": this.data.title,
          "onUpdate:modelValue": ($event) => this.data.title = $event,
          "onChange": () => {
            this.modelClipboardController.saveToStore();
          }
        }, null)]), createVNode("div", {
          "class": this.ns.em("content", "info")
        }, [createTextVNode("\u5171"), this.data.items.length || this.data.models.length, createTextVNode("\u6761\u6A21\u578B\u6570\u636E")]), createVNode("div", {
          "class": this.ns.e("actions")
        }, [this.enableSelect && createVNode("div", {
          "class": this.ns.em("actions", "item")
        }, [createVNode(resolveComponent("el-checkbox"), {
          "modelValue": this.data.isSelected,
          "onUpdate:modelValue": ($event) => this.data.isSelected = $event
        }, null)]), createVNode("div", {
          "class": this.ns.em("actions", "item"),
          "onClick": () => this.copy()
        }, [createVNode("ion-icon", {
          "name": "copy",
          "title": "\u62F7\u8D1D"
        }, null)]), createVNode("div", {
          "class": this.ns.em("actions", "item"),
          "onClick": () => this.remove()
        }, [createVNode("ion-icon", {
          "name": "trash",
          "title": "\u5220\u9664"
        }, null)])])]), this.isLoading ? createVNode("div", {
          "class": this.ns.e("loading")
        }, [createVNode("div", {
          "class": this.ns.em("loading", "inner"),
          "style": {
            width: "".concat(this.data.models.length / 1 * 100, "%")
          }
        }, [createVNode("div", {
          "class": this.ns.em("loading", "label")
        }, [this.data.models.length, createTextVNode("/1")])])]) : null]
      })]
    });
  }
});

export { IBizDSLModelClipboardItem as default };
