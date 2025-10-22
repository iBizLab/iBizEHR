import { createVNode, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import { resource } from '../../global.mjs';
import './logic-holder.css';

"use strict";
const LogicHolder = /* @__PURE__ */ defineComponent({
  props: {
    value: {
      type: Number,
      required: true
    }
  },
  setup() {
    const ns = useNamespace("x6-logic-holder");
    const map = {
      1: {
        text: "\u540E\u53F0",
        icon: resource.dir("./assets/svg/backend.svg")
      },
      2: {
        text: "\u524D\u53F0",
        icon: resource.dir("./assets/svg/front.svg")
      },
      3: {
        text: "\u901A\u7528",
        icon: resource.dir("./assets/svg/common.svg")
      }
    };
    return {
      ns,
      map
    };
  },
  render() {
    const item = this.map[this.value];
    if (!item) {
      return;
    }
    return createVNode("div", {
      "class": this.ns.b(),
      "title": item.text
    }, [createVNode("ion-icon", {
      "class": this.ns.e("icon"),
      "src": item.icon
    }, null), createVNode("div", {
      "class": this.ns.e("text")
    }, [item.text])]);
  }
});

export { LogicHolder };
