import { ref, createVNode, createTextVNode, resolveComponent, resolveDirective, withDirectives, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import './dsl-model-edit-view.css';

"use strict";
var IBizDSLModelEditView = /* @__PURE__ */ defineComponent({
  name: "IBizDSLModelEditView",
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
    caption: {
      type: String,
      default: ""
    },
    codeName: {
      type: String,
      required: true
    },
    readonly: {
      type: Boolean
    }
  },
  setup(props) {
    const ns = useNamespace("dsl-model-edit-view");
    const isSave = ref(false);
    const value = ref("");
    const closeView = () => {
      var _a;
      (_a = props.modal) == null ? void 0 : _a.dismiss({
        ok: true,
        params: {
          isSave: isSave.value
        }
      });
    };
    const loading = ref(false);
    const loadingText = ref("");
    const save = async (isClose = false) => {
      var _a, _b, _c;
      isSave.value = true;
      try {
        loading.value = true;
        loadingText.value = "\u4FDD\u5B58\u4E2D...";
        const entity = await ibiz.hub.getAppDataEntity(props.codeName, props.context.srfappid);
        const app = ibiz.hub.getApp(props.context.srfappid);
        const service = await app.deService.getService(props.context, entity.id);
        const deName = ((_a = entity.codeName) == null ? void 0 : _a.toLowerCase()) || "";
        const res = await service.exec("CompileModelDSL", props.context, {
          build: true,
          dsl: value.value.replace(new RegExp("(".concat(deName, "\\([^)]*\\))(\\{[^}]*\\}|(?=\\s|$))"), "g"), (match, p1, p2) => {
            if (p2 && p2.startsWith("{"))
              return "".concat(p1, '{\noption(update:"true")').concat(p2.slice(1));
            return "".concat(p1, '{\noption(update:"true")}');
          }),
          srfkey: props.context[deName]
        }, props.params);
        if (res.status !== 200) {
          ibiz.message.error(((_b = res.data) == null ? void 0 : _b.message) || res.statusText || ibiz.i18n.t("core.error.networkAbnormality"));
        } else if (isClose) {
          closeView();
        }
      } catch (err) {
        const error = err;
        ibiz.message.error((error == null ? void 0 : error.message) || ((_c = error == null ? void 0 : error.data) == null ? void 0 : _c.message) || (error == null ? void 0 : error.statusText) || ibiz.i18n.t("core.error.networkAbnormality"));
      } finally {
        loading.value = false;
      }
    };
    const load = async () => {
      try {
        loading.value = true;
        loadingText.value = "\u52A0\u8F7D\u4E2D...";
        const entity = await ibiz.hub.getAppDataEntity(props.codeName, props.context.srfappid);
        const app = ibiz.hub.getApp(props.context.srfappid);
        const service = await app.deService.getService(props.context, entity.id);
        const res = await service.exec("ExportModelDSL", props.context, {}, props.params);
        if (res.status === 200 && res.data && res.data.dsl) {
          value.value = res.data.dsl;
        }
      } catch (err) {
        const error = err;
        ibiz.message.error(error.message || ibiz.i18n.t("core.error.networkAbnormality"));
      } finally {
        loading.value = false;
      }
    };
    load();
    return {
      ns,
      value,
      loading,
      loadingText,
      closeView,
      save
    };
  },
  render() {
    return withDirectives(createVNode("div", {
      "class": this.ns.b(),
      "element-loading-text": this.loadingText
    }, [createVNode("div", {
      "class": this.ns.b("header")
    }, [createVNode("div", {
      "class": this.ns.b("header-back-btn"),
      "onClick": () => this.closeView()
    }, [createVNode("ion-icon", {
      "name": "chevron-back-outline"
    }, null), createVNode("span", null, [createTextVNode("\u8FD4\u56DE")])]), createVNode("div", {
      "class": this.ns.b("header-caption")
    }, [this.caption]), createVNode("div", {
      "class": this.ns.b("header-toolbar")
    }, [this.readonly ? null : [createVNode(resolveComponent("el-button"), {
      "size": "small",
      "onClick": () => this.save(true)
    }, {
      default: () => [createTextVNode("\u4FDD\u5B58\u5E76\u5173\u95ED")]
    }), createVNode(resolveComponent("el-button"), {
      "size": "small",
      "onClick": () => this.save()
    }, {
      default: () => [createTextVNode("\u4FDD\u5B58")]
    })], createVNode(resolveComponent("el-button"), {
      "size": "small",
      "onClick": () => this.closeView()
    }, {
      default: () => [createTextVNode("\u5173\u95ED")]
    })]), createVNode("div", {
      "class": this.ns.b("header-close-btn"),
      "title": "\u5173\u95ED",
      "onClick": () => this.closeView()
    }, [createVNode("ion-icon", {
      "name": "close-outline"
    }, null)])]), createVNode("div", {
      "class": this.ns.b("content")
    }, [createVNode(resolveComponent("iBizDesignCodeEditor"), {
      "language": "groovy",
      "isChangeLanguage": false,
      "modelValue": this.value,
      "onUpdate:modelValue": ($event) => this.value = $event,
      "isEnableLoad": !this.loading
    }, null)])]), [[resolveDirective("loading"), this.loading]]);
  }
});

export { IBizDSLModelEditView as default };
