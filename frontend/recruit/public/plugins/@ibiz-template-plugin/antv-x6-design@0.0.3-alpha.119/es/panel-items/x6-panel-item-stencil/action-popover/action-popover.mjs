import { resolveComponent, createVNode, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import './action-popover.css';

"use strict";
var ActionPopover = /* @__PURE__ */ defineComponent({
  name: "ActionPopover",
  props: {
    modal: {
      type: Object,
      required: true
    },
    actions: {
      type: Array,
      default: () => []
    }
  },
  setup(props) {
    const ns = useNamespace("action-popover");
    const onSelect = (item) => {
      props.modal.dismiss({
        ok: true,
        data: [item]
      });
    };
    return {
      ns,
      onSelect
    };
  },
  render() {
    return createVNode("div", {
      "class": this.ns.b()
    }, [this.actions.map((action) => {
      return createVNode("div", {
        "class": this.ns.e("action-item"),
        "onClick": () => this.onSelect(action)
      }, [createVNode("div", {
        "class": this.ns.em("action-item", "icon")
      }, [action.sysImage && createVNode(resolveComponent("iBizIcon"), {
        "icon": action.sysImage
      }, null)]), createVNode("div", {
        "class": this.ns.em("action-item", "text")
      }, [action.caption])]);
    })]);
  }
});

export { ActionPopover as default };
