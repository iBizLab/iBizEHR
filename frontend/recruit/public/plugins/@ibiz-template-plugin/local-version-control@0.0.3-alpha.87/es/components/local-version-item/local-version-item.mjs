import { ref, computed, nextTick, resolveComponent, createVNode, createTextVNode, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import './local-version-item.css';
import '../../util/index.mjs';
import { formatTimestamp } from '../../util/util.mjs';

"use strict";
var IBizLocalVersionItem = /* @__PURE__ */ defineComponent({
  name: "IBizLocalVersionItem",
  props: {
    item: {
      type: Object,
      required: true
    },
    items: {
      type: Object,
      required: true
    },
    controller: {
      type: Object,
      required: true
    }
  },
  emits: {
    action: (tag, item, event) => true
  },
  setup(props, {
    emit
  }) {
    const ns = useNamespace("local-version-item");
    const editing = ref(false);
    const curCaption = ref(props.item.caption);
    const showCompare = computed(() => {
      return props.items.length > 1;
    });
    const isActive = computed(() => {
      return props.item.id === props.controller.activeItemId;
    });
    const timeStr = computed(() => {
      return formatTimestamp(props.item.timestamp, "YYYY-MM-DD HH:mm:ss");
    });
    const actionClick = (tag, event) => {
      emit("action", tag, props.item, event);
    };
    const onCaptionChange = async (value) => {
      editing.value = false;
      const result = await props.controller.updateCaption(props.item.id, value);
      if (!result) {
        ibiz.message.error("\u7248\u672C\u540D\u79F0\u53D8\u66F4\u5931\u8D25");
        curCaption.value = props.item.caption;
      }
    };
    const inputRef = ref();
    const renderInput = () => {
      if (editing.value) {
        nextTick(() => {
          var _a;
          (_a = inputRef.value) == null ? void 0 : _a.focus();
        });
        return createVNode(resolveComponent("el-input"), {
          "ref": inputRef,
          "modelValue": curCaption.value,
          "onUpdate:modelValue": ($event) => curCaption.value = $event,
          "placeholder": "\u8BF7\u8F93\u5165\u7248\u672C\u540D\u79F0",
          "onChange": onCaptionChange,
          "onBlur": () => {
            editing.value = false;
          }
        }, null);
      }
      return curCaption.value;
    };
    return {
      ns,
      timeStr,
      editing,
      showCompare,
      isActive,
      actionClick,
      renderInput
    };
  },
  render() {
    return createVNode("div", {
      "class": [this.ns.b(), this.ns.is("active", this.isActive)]
    }, [createVNode("div", {
      "class": this.ns.b("left")
    }, [createVNode("div", {
      "class": this.ns.b("left-top")
    }, [this.renderInput(), !this.editing ? createVNode("ion-icon", {
      "name": "create-outline",
      "onClick": () => {
        this.editing = !this.editing;
      }
    }, null) : null]), createVNode("div", {
      "class": this.ns.b("left-bottom")
    }, [createVNode("div", null, [this.timeStr]), createVNode("div", null, [this.item.username])])]), createVNode("div", {
      "class": this.ns.b("right")
    }, [createVNode(resolveComponent("el-button"), {
      "title": "\u5207\u6362\u81F3\u6B64\u7248\u672C",
      "class": this.ns.is("hidden", this.isActive),
      "onClick": (event) => {
        this.actionClick("apply", event);
      }
    }, {
      default: () => [createVNode("ion-icon", {
        "name": "repeat"
      }, null), createTextVNode("\u5E94\u7528")]
    }), createVNode(resolveComponent("el-popover"), {
      "popper-class": this.ns.e("popover"),
      "placement": "bottom",
      "width": 80,
      "trigger": "click"
    }, {
      reference: () => {
        return createVNode(resolveComponent("el-button"), {
          "title": "\u66F4\u591A",
          "class": this.ns.is("hidden", this.isActive && !this.showCompare)
        }, {
          default: () => [createVNode("ion-icon", {
            "name": "ellipsis-horizontal"
          }, null)]
        });
      },
      default: () => {
        return createVNode("div", {
          "class": this.ns.b("actions")
        }, [!this.isActive && createVNode("div", {
          "title": "\u5220\u9664\u7248\u672C",
          "onClick": (event) => {
            this.actionClick("remove", event);
          }
        }, [createVNode("ion-icon", {
          "name": "trash"
        }, null), createTextVNode("\u5220\u9664\u7248\u672C")]), this.showCompare && createVNode("div", {
          "title": "\u7248\u672C\u6BD4\u5BF9",
          "onClick": (event) => {
            this.actionClick("diff", event);
          }
        }, [createVNode("ion-icon", {
          "name": "git-compare"
        }, null), createTextVNode("\u7248\u672C\u6BD4\u5BF9")])]);
      }
    })])]);
  }
});

export { IBizLocalVersionItem as default };
