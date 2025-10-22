import { ref, computed, resolveComponent, createTextVNode, createVNode, vShow, withDirectives, resolveDirective, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import draggable from 'vuedraggable';
import './model-clipboard-paste-view.css';

"use strict";
var IBizModelClipboardPasteView = /* @__PURE__ */ defineComponent({
  name: "IBizModelClipboardPasteView",
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
    const ns = useNamespace("model-clipboard-paste-view");
    const modelClipboardController = ibiz.modelClipboard;
    const c = ibiz.modelClipboardPasteView;
    const activeName = ref("ModeTree");
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
    const formatData = () => {
      try {
        c.state.modelStr = JSON.stringify(JSON.parse(c.state.modelStr), null, 2);
      } catch (error) {
        ibiz.message.error("\u683C\u5F0F\u6709\u8BEF\u65E0\u6CD5\u683C\u5F0F\u5316\uFF0C\u8BF7\u68C0\u67E5!", 2.5);
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
      c.state.items.forEach((item) => {
        c.state.models.push(...item.models);
      });
      try {
        initModel(JSON.stringify(c.state.models, null, 2));
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
        if (item.type !== "advanced" || !Object.is(c.state.params.codeName, item.codeName) || c.state.items.findIndex((self) => Object.is(self.uuid, item.uuid)) !== -1) {
          return false;
        }
        return item;
      });
    });
    const saveModel = async () => {
      var _a, _b;
      try {
        const models = JSON.parse(c.state.modelStr);
        if (Array.isArray(models)) {
          c.state.models = models;
        } else {
          ibiz.message.error("\u6A21\u578B\u6570\u636E\u683C\u5F0F\u5F02\u5E38\uFF0C\u8BF7\u68C0\u67E5!");
          return;
        }
      } catch (error) {
        ibiz.message.error("\u6A21\u578B\u6570\u636E\u683C\u5F0F\u5F02\u5E38\uFF0C\u8BF7\u68C0\u67E5!");
        return;
      }
      c.state.isLoading = true;
      c.state.importItems = [];
      let isError = false;
      const entity = await ibiz.hub.getAppDataEntity(c.state.params.codeName, props.context.srfappid);
      const app = ibiz.hub.getApp(props.context.srfappid);
      const service = await app.deService.getService(props.context, entity.id);
      for (let i = 0; i < c.state.models.length; i++) {
        const item = c.state.models[i];
        const params = {
          ...item,
          srfmodelv2scope: props.context.srfmodelv2scope
        };
        try {
          const res = await service.exec("PasteModel", props.context, params, props.params);
          if (res.ok && res.data) {
            c.state.isModelChange = false;
            c.state.importItems.push(item);
          } else {
            ibiz.message.error(res.statusText);
            isError = true;
            break;
          }
        } catch (err) {
          const error = err;
          ibiz.message.error((error == null ? void 0 : error.message) || ((_a = error == null ? void 0 : error.data) == null ? void 0 : _a.message) || (error == null ? void 0 : error.statusText) || ibiz.i18n.t("core.error.networkAbnormality"));
          isError = true;
          break;
        }
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
      activeName,
      materialItem,
      modelClipboardController,
      closeView,
      clearModel,
      formatData,
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
      importItems,
      models,
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
          "class": this.ns.b("paste-warp")
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
        }, [createVNode(resolveComponent("el-tabs"), {
          "class": this.ns.be("model-edit", "tabs"),
          "modelValue": this.activeName,
          "onUpdate:modelValue": ($event) => this.activeName = $event
        }, {
          default: () => [createVNode(resolveComponent("el-tab-pane"), {
            "label": "\u6811\u7ED3\u6784\u67E5\u770B",
            "name": "ModeTree"
          }, {
            default: () => [createVNode(resolveComponent("iBizModelTree"), {
              "modelStr": modelStr,
              "context": this.context,
              "onChange": this.modelChange
            }, null)]
          }), createVNode(resolveComponent("el-tab-pane"), {
            "label": "JSON",
            "name": "JSON"
          }, {
            default: () => [createVNode(resolveComponent("iBizDesignCodeEditor"), {
              "language": "json",
              "showToolbar": false,
              "modelValue": modelStr,
              "isChangeLanguage": false,
              "onUpdate:modelValue": (val) => this.modelChange(val)
            }, null)]
          })]
        }), createVNode("div", {
          "class": this.ns.b("edit-actions")
        }, [createVNode(resolveComponent("el-button"), {
          "title": "\u6E05\u7A7A\u5F53\u524D\u5DF2\u62D6\u5165\u6A21\u578B",
          "size": "small",
          "type": "info",
          "onClick": () => this.clearModel()
        }, {
          default: () => [createTextVNode("\u6E05\u7A7A")]
        }), createVNode(resolveComponent("el-button"), {
          "title": "\u683C\u5F0F\u5316\u7F16\u8F91\u6846\u5185JSON\u6570\u636E",
          "size": "small",
          "type": "info",
          "onClick": () => this.formatData()
        }, {
          default: () => [createTextVNode("\u683C\u5F0F\u5316")]
        }), createVNode(resolveComponent("el-button"), {
          "title": "\u5BFC\u5165\u6A21\u578B\u6570\u636E",
          "size": "small",
          "type": "primary",
          "onClick": () => this.saveModel()
        }, {
          default: () => [createTextVNode("\u5BFC\u5165")]
        })])])]), createVNode("div", {
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
      text: "\u6570\u636E\u5BFC\u5165\u4E2D\uFF1A".concat(importItems.length, " / ").concat(models.length)
    }]]);
  }
});

export { IBizModelClipboardPasteView as default };
