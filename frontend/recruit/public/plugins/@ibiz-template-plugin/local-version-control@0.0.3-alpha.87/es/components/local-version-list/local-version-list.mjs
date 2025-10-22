import { ref, onMounted, onUnmounted, resolveComponent, createVNode, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import './local-version-list.css';

"use strict";
var IBizLocalVersionList = /* @__PURE__ */ defineComponent({
  name: "IBizLocalVersionList",
  props: {
    controller: {
      type: Object,
      required: true
    }
  },
  setup(props) {
    const ns = useNamespace("local-version-list");
    const items = ref([]);
    const query = ref("");
    const evt = props.controller.evt;
    const fetchItems = async (value) => {
      const controller = props.controller;
      items.value = value ? await controller.fetchAll(value) : await controller.fetchAll();
    };
    onMounted(async () => {
      await fetchItems();
      evt.on("deleteAll", fetchItems);
    });
    onUnmounted(() => {
      evt.off("deleteAll", fetchItems);
    });
    const handleQueryChange = async (value) => {
      await fetchItems(value);
    };
    const handApply = async (data) => {
      const controller = props.controller;
      await controller.apply(data);
    };
    const handleRemove = async (data) => {
      const controller = props.controller;
      const result = await controller.remove(data);
      if (result) {
        items.value = await controller.fetchAll();
      }
    };
    const handleAction = (tag, data, event) => {
      switch (tag) {
        case "apply":
          handApply(data);
          break;
        case "remove":
          handleRemove(data);
          break;
        case "diff":
          props.controller.diff(data, items.value);
          break;
        default:
          console.error("".concat(tag, " is not support"));
          break;
      }
    };
    return {
      ns,
      query,
      items,
      handleAction,
      handleQueryChange
    };
  },
  render() {
    return createVNode("div", {
      "class": this.ns.b()
    }, [createVNode("div", {
      "class": this.ns.e("search")
    }, [createVNode(resolveComponent("el-input"), {
      "modelValue": this.query,
      "onUpdate:modelValue": ($event) => this.query = $event,
      "style": "width: 100%",
      "placeholder": "\u8BF7\u8F93\u5165\u5386\u53F2\u7248\u672C\u540D\u79F0\u8FDB\u884C\u8FC7\u6EE4",
      "suffix-icon": createVNode("ion-icon", {
        "class": this.ns.e("search-icon"),
        "style": "cursor: pointer;",
        "name": "search"
      }, null),
      "onChange": (value) => {
        this.handleQueryChange(value);
      },
      "clearable": true
    }, null)]), createVNode("div", {
      "class": this.ns.e("body")
    }, [this.items.length > 0 ? this.items.map((item) => {
      return createVNode(resolveComponent("iBizLocalVersionItem"), {
        "key": item.id,
        "item": item,
        "items": this.items,
        "controller": this.controller,
        "onAction": (tag, data, event) => {
          this.handleAction(tag, data, event);
        }
      }, null);
    }) : createVNode(resolveComponent("iBizNoData"), null, null)])]);
  }
});

export { IBizLocalVersionList as default };
