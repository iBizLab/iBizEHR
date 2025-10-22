import { ref, computed, onUnmounted, resolveComponent, createVNode, createTextVNode, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import './model-clipboard-item.css';

"use strict";
const actionMap = {
  advanced: "CopyModel",
  default: "ExportModelV2"
};
var IBizModelClipboardItem = /* @__PURE__ */ defineComponent({
  name: "IBizModelClipboardItem",
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
    }
  },
  emits: ["delete"],
  setup(props, {
    emit
  }) {
    const ns = useNamespace("model-clipboard-item");
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
      if (props.data && !props.data.isExport) {
        isLoading.value = true;
        for (let i = 0; i < props.data.items.length; i++) {
          const item = props.data.items[i];
          try {
            const entity = await ibiz.hub.getAppDataEntity(props.data.codeName, props.context.srfappid);
            const app = ibiz.hub.getApp(props.context.srfappid);
            const service = await app.deService.getService(props.context, entity.id);
            const res = await service.exec(actionMap[props.data.type], {
              ...props.context,
              [entity.deapicodeName]: item.srfkey
            }, props.params);
            if (res.ok && res.data) {
              props.data.models.push(res.data);
            }
          } catch (err) {
            props.data.isError = true;
            props.data.errorInfo = err.message || "\u6A21\u578B\u5BFC\u51FA\u53D1\u751F\u672A\u77E5\u9519\u8BEF!";
            ibiz.message.error(props.data.errorInfo);
            break;
          }
          if (isDestroyed.value) {
            break;
          }
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
      el.value = JSON.stringify(props.data.models.map((item) => item.model), null, 2);
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
      remove,
      copy
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
          "class": this.ns.b("content")
        }, [createVNode("div", {
          "class": this.ns.b("title")
        }, [createVNode(resolveComponent("el-input"), {
          "modelValue": this.data.title,
          "onUpdate:modelValue": ($event) => this.data.title = $event,
          "onChange": () => {
            this.modelClipboardController.saveToStore();
          }
        }, null)]), createVNode("div", {
          "class": this.ns.b("info")
        }, [createTextVNode("\u5171"), this.data.items.length, createTextVNode("\u6761\u6A21\u578B\u6570\u636E")]), createVNode("div", {
          "class": this.ns.b("actions")
        }, [createVNode("div", {
          "class": this.ns.b("action"),
          "onClick": () => this.copy()
        }, [createVNode("ion-icon", {
          "name": "copy",
          "title": "\u62F7\u8D1D"
        }, null)]), createVNode("div", {
          "class": this.ns.b("action"),
          "onClick": () => this.remove()
        }, [createVNode("ion-icon", {
          "name": "trash",
          "title": "\u5220\u9664"
        }, null)])])]), this.isLoading ? createVNode("div", {
          "class": this.ns.b("loading-warp")
        }, [createVNode("div", {
          "class": this.ns.b("loading-inner"),
          "style": {
            width: "".concat(this.data.models.length / this.data.items.length * 100, "%")
          }
        }, [createVNode("div", {
          "class": this.ns.b("loading-label")
        }, [this.data.models.length, createTextVNode("/"), this.data.items.length])])]) : null]
      })]
    });
  }
});

export { IBizModelClipboardItem as default };
