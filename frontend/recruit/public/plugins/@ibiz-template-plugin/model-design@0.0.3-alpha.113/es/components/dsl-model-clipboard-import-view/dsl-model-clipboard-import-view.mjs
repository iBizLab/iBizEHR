import { computed, resolveComponent, createTextVNode, createVNode, vShow, withDirectives, resolveDirective, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import draggable from 'vuedraggable';
import './dsl-model-clipboard-import-view.css';

"use strict";
var IBizDSLModelClipboardImportView = /* @__PURE__ */ defineComponent({
  name: "IBizDSLModelClipboardImportView",
  components: {
    draggable
  },
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
    const ns = useNamespace("dsl-model-clipboard-import-view");
    const modelClipboardController = ibiz.modelClipboard;
    const c = ibiz.dslModelClipboardImportView;
    const initModel = (val) => {
      c.state.modelStr = val;
      c.state.isModelChange = false;
    };
    const clearModel = async () => {
      if (c.state.isModelChange) {
        const result = await ibiz.confirm.warning({
          title: "\u786E\u8BA4\u6E05\u9664?",
          desc: "\u6A21\u578B\u6570\u636E\u5DF2\u53D8\u66F4\uFF0C\u5C06\u540C\u5DF2\u62D6\u5165\u6A21\u578B\u4E00\u540C\u6E05\u7A7A\uFF0C\u786E\u8BA4\u6E05\u9664\u5417\uFF1F"
        });
        if (result) {
          c.clearAllData();
        }
      } else {
        c.clearAllData();
      }
    };
    const closeView = async () => {
      var _a, _b;
      if (c.state.isModelChange) {
        const result = await ibiz.confirm.warning({
          title: "\u786E\u8BA4\u5173\u95ED",
          desc: "\u6A21\u578B\u6570\u636E\u5DF2\u53D8\u66F4\uFF0C\u786E\u8BA4\u5173\u95ED\u5417?"
        });
        if (result) {
          (_a = props.modal) == null ? void 0 : _a.dismiss();
          c.clearAllData();
        }
      } else {
        (_b = props.modal) == null ? void 0 : _b.dismiss();
      }
    };
    const modelChange = (val) => {
      if (!Object.is(c.state.modelStr, val)) {
        c.state.modelStr = val;
        c.state.isModelChange = true;
      }
    };
    const calcModeStr = () => {
      ibiz.message.warning("\u7F16\u8F91\u6846\u5185\uFF0C\u6A21\u578B\u5185\u5BB9\u5DF2\u91CD\u65B0\u8BA1\u7B97!");
      c.state.models = [];
      try {
        c.state.items.forEach((item) => {
          const models = item.models.filter((m) => !!m.dsl).map((m) => m.dsl);
          c.state.models.push(...models);
        });
        initModel(c.state.models.join("\n"));
      } catch (error) {
        ibiz.log.error(error);
      }
    };
    const deleteDropItem = (i) => {
      c.state.items.splice(i, 1);
      calcModeStr();
    };
    const dropModelChange = async (e) => {
      if (c.state.isModelChange) {
        const result = await ibiz.confirm.warning({
          title: "\u786E\u8BA4\u64CD\u4F5C?",
          desc: "\u68C0\u6D4B\u5230\u8F93\u5165\u6846\u5185\u5BB9\u5DF2\u624B\u52A8\u4FEE\u6539\uFF0C\u8BE5\u64CD\u4F5C\u540E\u8F93\u5165\u6846\u5185\u5BB9\u5C06\u91CD\u65B0\u8BA1\u7B97\uFF0C\u786E\u8BA4\u64CD\u4F5C\u5417\uFF1F"
        });
        if (result) {
          calcModeStr();
        } else if (e && e.added && e.added.newIndex != null) {
          c.state.items.splice(e.added.newIndex, 1);
        }
      } else {
        calcModeStr();
      }
    };
    const materialItem = computed(() => {
      return modelClipboardController.state.items.filter((item) => {
        if (item.type !== "dsl" || !Object.is(c.state.params.codeName, item.codeName) || c.state.items.findIndex((self) => Object.is(self.uuid, item.uuid)) !== -1) {
          return false;
        }
        return item;
      });
    });
    const saveModel = async () => {
      var _a, _b;
      c.state.isLoading = true;
      let isError = false;
      const entity = await ibiz.hub.getAppDataEntity(c.state.params.codeName, props.context.srfappid);
      const app = ibiz.hub.getApp(props.context.srfappid);
      const service = await app.deService.getService(props.context, entity.id);
      try {
        const res = await service.exec("CompileModelDSL", props.context, {
          build: true,
          dsl: c.state.modelStr,
          srfmodelv2scope: props.context.srfmodelv2scope
        }, props.params);
        if (res.ok && res.data) {
          c.state.isModelChange = false;
        } else {
          ibiz.message.error(res.statusText);
          isError = true;
        }
      } catch (error) {
        ibiz.message.error((error == null ? void 0 : error.message) || ((_a = error == null ? void 0 : error.data) == null ? void 0 : _a.message) || (error == null ? void 0 : error.statusText) || ibiz.i18n.t("core.error.networkAbnormality"));
        isError = true;
      }
      if (!isError) {
        const result = await ibiz.confirm.warning({
          title: "\u5173\u95ED\u5BFC\u5165\u754C\u9762?",
          desc: "\u5DF2\u5BFC\u5165\u5B8C\u6BD5\uFF0C\u786E\u8BA4\u5173\u95ED\u5BFC\u5165\u754C\u9762!"
        });
        if (result) {
          (_b = props.modal) == null ? void 0 : _b.dismiss();
        }
      }
      setTimeout(() => {
        c.state.isLoading = false;
      }, 300);
    };
    return {
      c,
      ns,
      modelClipboardController,
      materialItem,
      closeView,
      clearModel,
      modelChange,
      deleteDropItem,
      dropModelChange,
      saveModel
    };
  },
  render() {
    const {
      isLoading,
      items,
      modelStr
    } = this.c.state;
    return withDirectives(createVNode(resolveComponent("el-card"), {
      "class": this.ns.b()
    }, {
      header: () => {
        return createVNode("div", {
          "class": this.ns.b("header")
        }, [createVNode("span", null, [createTextVNode("\u6A21\u578B\u5BFC\u5165")]), createVNode(resolveComponent("el-button"), {
          "title": "\u5173\u95ED\u6A21\u578B\u5BFC\u5165\u7A97\u53E3",
          "link": true,
          "onClick": () => this.closeView()
        }, {
          default: () => [createTextVNode("\u5173\u95ED")]
        })]);
      },
      default: () => {
        return createVNode("div", {
          "class": this.ns.b("content")
        }, [createVNode("div", {
          "class": this.ns.b("import-warp")
        }, [createVNode("div", {
          "class": this.ns.b("drop-area")
        }, [createVNode(draggable, {
          "class": this.ns.b("drop-area-draggable"),
          "group": {
            name: "StudioDesign"
          },
          "itemKey": "uuid",
          "list": items,
          "onChange": (evt) => this.dropModelChange(evt)
        }, {
          item: ({
            element,
            index
          }) => {
            const item = element;
            return createVNode("div", {
              "class": this.ns.b("model-drag-item")
            }, [createVNode("div", {
              "class": this.ns.b("model-drag-item-actions")
            }, [createVNode("div", {
              "class": this.ns.b("model-drag-item-action-item"),
              "title": "\u5220\u9664",
              "onClick": () => this.deleteDropItem(index)
            }, [createVNode("ion-icon", {
              "name": "close-outline"
            }, null)])]), createVNode("div", {
              "class": this.ns.b("model-drag-item-title")
            }, [item.title]), createVNode("div", {
              "class": this.ns.b("model-drag-item-date")
            }, [item.createdDate])]);
          }
        }), withDirectives(createVNode("div", {
          "class": this.ns.b("drop-tooltip")
        }, [createTextVNode("\u8BF7\u4ECE\u53F3\u4FA7\u7D20\u6750\u533A\u62D6\u5165")]), [[vShow, items.length === 0]])]), createVNode("div", {
          "class": this.ns.b("model-edit")
        }, [createVNode(resolveComponent("iBizDesignCodeEditor"), {
          "language": "groovy",
          "modelValue": modelStr,
          "isChangeLanguage": false,
          "onUpdate:modelValue": (val) => this.modelChange(val)
        }, {
          rightToolbar: () => {
            return createVNode("div", {
              "class": this.ns.b("edit-actions")
            }, [createVNode(resolveComponent("el-button"), {
              "title": "\u6E05\u7A7A\u5F53\u524D\u5DF2\u62D6\u5165\u6A21\u578B",
              "size": "small",
              "type": "info",
              "onClick": () => this.clearModel()
            }, {
              default: () => [createTextVNode("\u6E05\u7A7A")]
            }), createVNode(resolveComponent("el-button"), {
              "title": "\u5BFC\u5165\u6A21\u578B\u6570\u636E",
              "size": "small",
              "type": "primary",
              "onClick": () => this.saveModel()
            }, {
              default: () => [createTextVNode("\u5BFC\u5165")]
            })]);
          }
        })])]), createVNode("div", {
          "class": this.ns.b("model-material-warp")
        }, [createVNode("div", {
          "class": this.ns.b("model-material-title")
        }, [createTextVNode("\u6A21\u578B\u7D20\u6750")]), createVNode(draggable, {
          "class": this.ns.b("model-material-content"),
          "sort": false,
          "group": {
            name: "StudioDesign",
            pull: "clone",
            put: false
          },
          "itemKey": "uuid",
          "modelValue": this.materialItem
        }, {
          item: ({
            element
          }) => {
            const item = element;
            return createVNode("div", {
              "class": this.ns.b("model-material-item")
            }, [createVNode("div", {
              "class": this.ns.b("model-material-item-title")
            }, [item.title]), createVNode("div", {
              "class": this.ns.b("model-material-item-date")
            }, [item.createdDate])]);
          }
        }), withDirectives(createVNode("div", {
          "class": this.ns.b("model-material-tooltip")
        }, [createTextVNode("\u6682\u65E0\u6570\u636E")]), [[vShow, this.materialItem.length === 0]])])]);
      }
    }), [[resolveDirective("loading"), isLoading && {
      text: "\u6570\u636E\u5BFC\u5165\u4E2D"
    }]]);
  }
});

export { IBizDSLModelClipboardImportView as default };
