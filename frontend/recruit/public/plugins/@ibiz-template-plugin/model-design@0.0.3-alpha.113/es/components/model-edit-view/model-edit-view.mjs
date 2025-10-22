import { ref, createVNode, createTextVNode, resolveComponent, resolveDirective, withDirectives, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import './model-edit-view.css';

"use strict";
var IBizModelEditView = /* @__PURE__ */ defineComponent({
  name: "IBizModelEditView",
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
    const ns = useNamespace("model-edit-view");
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
      try {
        JSON.parse(value.value);
      } catch (error) {
        ibiz.message.error("\u6A21\u578B\u6570\u636E\u683C\u5F0F\u5F02\u5E38\uFF0C\u8BF7\u68C0\u67E5!");
        return;
      }
      isSave.value = true;
      try {
        loading.value = true;
        loadingText.value = "\u4FDD\u5B58\u4E2D...";
        const entity = await ibiz.hub.getAppDataEntity(props.codeName, props.context.srfappid);
        const app = ibiz.hub.getApp(props.context.srfappid);
        const service = await app.deService.getService(props.context, entity.id);
        const deName = ((_a = entity.codeName) == null ? void 0 : _a.toLowerCase()) || "";
        const params = {
          [entity.keyAppDEFieldId]: props.context[deName],
          srfmodelv2scope: props.context.srfmodelv2scope,
          model: JSON.parse(value.value)
        };
        const res = await service.exec("ImportModelV2", props.context, params, props.params);
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
        const res = await service.exec("ExportModelV2", props.context, {}, props.params);
        if (res.status === 200 && res.data && res.data.model) {
          value.value = JSON.stringify(res.data.model, null, 4);
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
      "language": "json",
      "isChangeLanguage": false,
      "modelValue": this.value,
      "onUpdate:modelValue": ($event) => this.value = $event,
      "isEnableLoad": !this.loading
    }, null)])]), [[resolveDirective("loading"), this.loading]]);
  }
});

export { IBizModelEditView as default };
