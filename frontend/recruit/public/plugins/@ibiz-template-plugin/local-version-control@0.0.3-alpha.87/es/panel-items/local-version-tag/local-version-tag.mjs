import { computed, createVNode, createTextVNode, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import { LocalVersionTagController } from './local-version-tag.controller.mjs';
import './local-version-tag.css';
import '../../util/index.mjs';
import { formatTimestamp } from '../../util/util.mjs';

"use strict";
var IBizLocalVersionTag = /* @__PURE__ */ defineComponent({
  name: "IBizLocalVersionTag",
  props: {
    modelData: {
      type: Object,
      required: true
    },
    controller: {
      type: LocalVersionTagController,
      required: true
    }
  },
  setup(props) {
    const ns = useNamespace("local-version-tag");
    const c = props.controller;
    const {
      state
    } = c;
    const timeStr = computed(() => {
      return formatTimestamp(state.timestamp, "YYYY-MM-DD HH:mm:ss");
    });
    const openVersionList = async () => {
      const overlay = ibiz.overlay.createDrawer("IBizLocalVersionContainer", {
        controller: c.versionControl,
        dismiss: () => overlay.dismiss()
      }, {
        width: 600,
        placement: "right"
      });
      await overlay.present();
      const result = await overlay.onWillDismiss();
      return result || {
        ok: false
      };
    };
    return {
      ns,
      state,
      timeStr,
      openVersionList
    };
  },
  render() {
    return createVNode("div", {
      "class": this.ns.b()
    }, [createVNode("div", {
      "class": [this.ns.b("state"), this.ns.is("dirty", this.state.isDirty)]
    }, null), createVNode("div", {
      "class": this.ns.b("caption"),
      "onClick": () => this.openVersionList()
    }, [createVNode("div", {
      "class": this.ns.be("caption", "version")
    }, [createTextVNode("\u672C\u5730\u5386\u53F2\u7248\u672C")]), createVNode("div", {
      "class": this.ns.be("caption", "timestamp")
    }, [createVNode("span", null, [this.timeStr]), createVNode("span", null, [createTextVNode("\xA0\xA0")]), createVNode("span", null, [this.state.isDirty ? "\u5DE5\u4F5C\u533A\u53D8\u66F4" : "\u4FDD\u5B58\u5B8C\u6210"])])])]);
  }
});

export { IBizLocalVersionTag as default };
