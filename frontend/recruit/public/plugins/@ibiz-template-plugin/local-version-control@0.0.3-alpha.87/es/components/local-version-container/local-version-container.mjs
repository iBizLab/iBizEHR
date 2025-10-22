import { onMounted, onUnmounted, ref, createTextVNode, createVNode, resolveComponent, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import './local-version-container.css';

"use strict";
var IBizLocalVersionContainer = /* @__PURE__ */ defineComponent({
  name: "IBizLocalVersionContainer",
  props: {
    controller: {
      type: Object,
      required: true
    },
    dismiss: {
      type: Function,
      required: true
    }
  },
  setup(props) {
    const ns = useNamespace("local-version-container");
    const evt = props.controller.evt;
    const {
      overUpNumber,
      overUpIsClean
    } = props.controller.getOverUpState();
    const closeDrawer = () => {
      props.dismiss();
    };
    onMounted(() => {
      evt.on("close", closeDrawer);
    });
    onUnmounted(() => {
      evt.off("close", closeDrawer);
    });
    const cleanState = ref(overUpIsClean);
    const setCleanState = (val) => {
      cleanState.value = val;
      props.controller.setOverUpState(val);
    };
    const clearHistoryVersion = () => {
      props.controller.deleteAll();
    };
    return {
      ns,
      closeDrawer,
      cleanState,
      overUpNumber,
      setCleanState,
      clearHistoryVersion
    };
  },
  render() {
    return createVNode("div", {
      "class": this.ns.b()
    }, [createVNode("div", {
      "class": this.ns.e("header")
    }, [createVNode("div", {
      "class": this.ns.e("header-left")
    }, [createTextVNode("\u5386\u53F2\u7248\u672C")]), createVNode("div", {
      "class": this.ns.e("header-right")
    }, [createVNode(resolveComponent("el-button"), {
      "title": "\u5173\u95ED",
      "class": this.ns.e("header-button"),
      "onClick": () => this.closeDrawer()
    }, {
      default: () => [createVNode("i", {
        "class": "fa fa-sign-out"
      }, null), createVNode("span", null, [createTextVNode("\u5173\u95ED")])]
    })])]), createVNode("div", {
      "class": this.ns.e("body")
    }, [createVNode(resolveComponent("iBizLocalVersionList"), {
      "controller": this.controller
    }, null)]), createVNode("div", {
      "class": this.ns.e("footer")
    }, [createVNode(resolveComponent("el-checkbox"), {
      "model-value": this.cleanState,
      "onChange": this.setCleanState,
      "label": "\u81EA\u52A8\u6E05\u7406\u65E7\u7248\u672C\uFF08\u4FDD\u7559\u6700\u591A".concat(this.overUpNumber, "\u4E2A\uFF09")
    }, null), createVNode(resolveComponent("el-button"), {
      "title": "\u6E05\u7A7A\u5386\u53F2\u7248\u672C",
      "class": this.ns.e("footer-button"),
      "onClick": () => this.clearHistoryVersion()
    }, {
      default: () => [createVNode("i", {
        "class": "fa fa-trash"
      }, null), createVNode("span", null, [createTextVNode("\u6E05\u7A7A\u5386\u53F2\u7248\u672C")])]
    })])]);
  }
});

export { IBizLocalVersionContainer as default };
