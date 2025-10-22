import { ref, watch, resolveComponent, h, createVNode, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import { createUUID } from 'qx-util';
import './service/index.mjs';
import { ModelTreeNodeController } from './model-tree-node.controller.mjs';
import { nodeIcon } from './svg/svg.mjs';
import './model-tree.css';
import { ModelTreeService } from './service/model-tree.service.mjs';

"use strict";
var IBizModelTree = /* @__PURE__ */ defineComponent({
  name: "IBizModelTree",
  props: {
    context: {
      type: Object,
      default: () => ({})
    },
    params: {
      type: Object,
      default: () => ({})
    },
    modelStr: {
      type: String,
      required: true
    }
  },
  emits: {
    change: (_value) => true
  },
  setup(props, {
    emit
  }) {
    const ns = useNamespace("model-tree");
    const nodes = ref({});
    const rootNodes = ref([]);
    const UUID = ref(createUUID());
    const models = ref([]);
    let modelStr = "";
    const expandedKeys = ref([]);
    const service = new ModelTreeService(props.context, models);
    const afterLoadNodes = async (_nodes) => {
      await Promise.all(_nodes.map(async (node) => {
        const nodeC = new ModelTreeNodeController(node, props.context, props.params);
        await nodeC.init();
        nodes.value[node._id] = nodeC;
      }));
    };
    const loadNodes = async (parent) => {
      const children = await service.fetchChildNodes(parent);
      if (parent) {
        parent._children = children;
      } else {
        rootNodes.value = children;
      }
      await afterLoadNodes(children);
      return children;
    };
    const load = async (item, callback) => {
      var _a;
      let children = [];
      const nodeData = item.data ? (_a = nodes.value[item.data._id]) == null ? void 0 : _a.data : void 0;
      if (nodeData == null ? void 0 : nodeData._children) {
        children = nodeData._children;
      } else {
        children = await loadNodes(nodeData);
      }
      callback(children);
    };
    watch(() => props.modelStr, () => {
      if (props.modelStr !== modelStr) {
        try {
          modelStr = props.modelStr;
          models.value = JSON.parse(props.modelStr);
          if (props.modelStr === "[]") {
            expandedKeys.value = [];
            nodes.value = {};
          }
        } catch (error) {
          modelStr = "";
          nodes.value = {};
          models.value = [];
          expandedKeys.value = [];
        } finally {
          UUID.value = createUUID();
        }
      }
    }, {
      immediate: true
    });
    const onChange = (data, value, name) => {
      if (name) {
        data._data[name] = value;
      } else {
        data._value = value;
      }
      modelStr = JSON.stringify(models.value, null, 2);
      emit("change", modelStr);
    };
    const onExpandChange = (id, isExpand) => {
      const hasKey = expandedKeys.value.includes(id);
      if (isExpand && !hasKey) {
        expandedKeys.value.push(id);
      } else if (!isExpand && hasKey) {
        const index = expandedKeys.value.indexOf(id);
        if (index !== -1) {
          expandedKeys.value.splice(index, 1);
        }
      }
    };
    const renderEditor = (data) => {
      const nc = nodes.value[data._id];
      if (nc) {
        if (nc.editorProvider) {
          return h(resolveComponent(nc.editorProvider.formEditor), {
            value: data._value,
            data: data._data,
            controller: nc.editor,
            disabled: nc.disabled,
            readonly: nc.readonly,
            class: ns.em("node", "editor"),
            onChange: (val, name) => {
              onChange(data, val, name);
            }
          });
        }
        return createVNode(resolveComponent("el-input"), {
          "class": ns.em("node", "editor"),
          "model-value": data._value,
          "disabled": nc.disabled,
          "readonly": nc.readonly,
          "onInput": (val) => onChange(data, val)
        }, null);
      }
    };
    return {
      ns,
      UUID,
      expandedKeys,
      load,
      renderEditor,
      onExpandChange
    };
  },
  render() {
    return createVNode("div", {
      "class": this.ns.b()
    }, [createVNode(resolveComponent("el-tree"), {
      "lazy": true,
      "key": this.UUID,
      "node-key": "_id",
      "props": {
        label: "_text",
        children: "_children",
        isLeaf: "_leaf"
      },
      "load": this.load,
      "onNodeExpand": (data) => {
        this.onExpandChange(data._id, true);
      },
      "onNodeCollapse": (data) => {
        this.onExpandChange(data._id, false);
      },
      "default-expanded-keys": this.expandedKeys
    }, {
      default: ({
        data
      }) => {
        var _a;
        return createVNode("div", {
          "class": this.ns.e("node")
        }, [nodeIcon(data._icon), createVNode("div", {
          "class": this.ns.em("node", "caption")
        }, [createVNode("div", {
          "class": this.ns.em("node", "text")
        }, [data._text]), createVNode("div", {
          "class": this.ns.em("node", "label")
        }, [data._label ? "#".concat(data._label) : ""])]), data._icon !== "OBJECT" ? createVNode("div", {
          "class": this.ns.em("node", "content")
        }, [createVNode("span", {
          "class": this.ns.em("node", "separator")
        }, ["==>"]), data._icon === "ARRAY" ? createVNode("span", null, ["[".concat((_a = data._value) == null ? void 0 : _a.length, "]")]) : this.renderEditor(data)]) : null]);
      }
    })]);
  }
});

export { IBizModelTree as default };
