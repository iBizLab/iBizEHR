/* eslint-disable @typescript-eslint/no-explicit-any */
/* eslint-disable array-callback-return */
/* eslint-disable import/no-extraneous-dependencies */
import { useNamespace } from '@ibiz-template/vue3-util';
import {
  h,
  ref,
  watch,
  PropType,
  defineComponent,
  resolveComponent,
} from 'vue';
import { createUUID } from 'qx-util';
import { ModelTreeService } from './service';
import { IModelTreeNodeController, IModelTreeNodeData } from './interface';
import { ModelTreeNodeController } from './model-tree-node.controller';
import { IModelData } from '../../interface';
import { nodeIcon } from './svg/svg';
import './model-tree.scss';

export default defineComponent({
  name: 'IBizModelTree',
  props: {
    context: { type: Object as PropType<IContext>, default: () => ({}) },
    params: { type: Object as PropType<IParams>, default: () => ({}) },
    modelStr: { type: String, required: true },
  },
  emits: {
    change: (_value: string) => true,
  },
  setup(props, { emit }) {
    const ns = useNamespace('model-tree');
    // 所有节点
    const nodes = ref<{ [p: string]: IModelTreeNodeController }>({});
    // 根节点
    const rootNodes = ref<IModelTreeNodeData[]>([]);
    // 树绑定的key
    const UUID = ref(createUUID());
    // 模型数据
    const models = ref<IModelData[]>([]);
    // 模型JSON
    let modelStr = '';
    // 展开节点集合
    const expandedKeys = ref<string[]>([]);
    // 数据服务
    const service = new ModelTreeService(props.context, models);

    /**
     * 加载节点之后
     *
     * @param {IModelTreeNodeData[]} _nodes
     * @return {*}  {Promise<void>}
     */
    const afterLoadNodes = async (
      _nodes: IModelTreeNodeData[],
    ): Promise<void> => {
      await Promise.all(
        _nodes.map(async node => {
          const nodeC = new ModelTreeNodeController(
            node,
            props.context,
            props.params,
          );
          await nodeC.init();
          nodes.value[node._id] = nodeC;
        }),
      );
    };

    /**
     * 加载节点
     *
     * @param {IModelTreeNodeData} [parent]
     * @return {*}  {Promise<IModelTreeNodeData[]>}
     */
    const loadNodes = async (
      parent?: IModelTreeNodeData,
    ): Promise<IModelTreeNodeData[]> => {
      const children = await service.fetchChildNodes(parent);
      if (parent) {
        parent._children = children;
      } else {
        rootNodes.value = children;
      }
      await afterLoadNodes(children);
      return children;
    };

    /**
     * 树加载
     *
     * @param {IData} item
     * @param {(_nodes: IModelTreeNodeData[]) => void} callback
     */
    const load = async (
      item: IData,
      callback: (_nodes: IModelTreeNodeData[]) => void,
    ) => {
      let children: IModelTreeNodeData[] = [];
      const nodeData = item.data ? nodes.value[item.data._id]?.data : undefined;
      if (nodeData?._children) {
        children = nodeData._children;
      } else {
        children = await loadNodes(nodeData);
      }
      callback(children);
    };

    watch(
      () => props.modelStr,
      () => {
        // 监听外部变更刷新树
        if (props.modelStr !== modelStr) {
          try {
            modelStr = props.modelStr;
            models.value = JSON.parse(props.modelStr);
            if (props.modelStr === '[]') {
              expandedKeys.value = [];
              nodes.value = {};
            }
          } catch (error) {
            modelStr = '';
            nodes.value = {};
            models.value = [];
            expandedKeys.value = [];
          } finally {
            UUID.value = createUUID();
          }
        }
      },
      {
        immediate: true,
      },
    );

    /**
     * 值变化
     *
     * @param {IModelTreeNodeData} data
     * @param {unknown} value
     * @param {string} [name]
     */
    const onChange = (
      data: IModelTreeNodeData,
      value: unknown,
      name?: string,
    ) => {
      // name为值项名称，因此改源数据上对应的值
      if (name) {
        data._data[name] = value;
      } else {
        // 没有name 改自身的值
        data._value = value as any;
      }
      modelStr = JSON.stringify(models.value, null, 2);
      emit('change', modelStr);
    };

    /**
     * 展开状态变更
     *
     * @param {string} id
     * @param {boolean} isExpand
     */
    const onExpandChange = (id: string, isExpand: boolean) => {
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

    /**
     * 绘制编辑器
     *
     * @param {IModelTreeNodeData} data
     * @return {*}
     */
    const renderEditor = (data: IModelTreeNodeData) => {
      const nc = nodes.value[data._id];
      if (nc) {
        if (nc.editorProvider) {
          return h(resolveComponent(nc.editorProvider.formEditor), {
            value: data._value,
            data: data._data,
            controller: nc.editor,
            disabled: nc.disabled,
            readonly: nc.readonly,
            class: ns.em('node', 'editor'),
            onChange: (val: unknown, name?: string) => {
              onChange(data, val, name);
            },
          });
        }
        return (
          <el-input
            class={ns.em('node', 'editor')}
            model-value={data._value}
            disabled={nc.disabled}
            readonly={nc.readonly}
            onInput={(val: string) => onChange(data, val)}
          ></el-input>
        );
      }
    };

    return {
      ns,
      UUID,
      expandedKeys,
      load,
      renderEditor,
      onExpandChange,
    };
  },
  render() {
    return (
      <div class={this.ns.b()}>
        <el-tree
          lazy
          key={this.UUID}
          node-key='_id'
          props={{
            label: '_text',
            children: '_children',
            isLeaf: '_leaf',
          }}
          load={this.load}
          onNodeExpand={(data: IModelTreeNodeData) => {
            this.onExpandChange(data._id, true);
          }}
          onNodeCollapse={(data: IModelTreeNodeData) => {
            this.onExpandChange(data._id, false);
          }}
          default-expanded-keys={this.expandedKeys}
        >
          {{
            default: ({ data }: { node: IData; data: IModelTreeNodeData }) => {
              return (
                <div class={this.ns.e('node')}>
                  {nodeIcon(data._icon)}
                  <div class={this.ns.em('node', 'caption')}>
                    <div class={this.ns.em('node', 'text')}>{data._text}</div>
                    <div class={this.ns.em('node', 'label')}>
                      {data._label ? `#${data._label}` : ''}
                    </div>
                  </div>
                  {data._icon !== 'OBJECT' ? (
                    <div class={this.ns.em('node', 'content')}>
                      <span class={this.ns.em('node', 'separator')}>
                        {`==>`}
                      </span>
                      {data._icon === 'ARRAY' ? (
                        <span>{`[${data._value?.length}]`}</span>
                      ) : (
                        this.renderEditor(data)
                      )}
                    </div>
                  ) : null}
                </div>
              );
            },
          }}
        </el-tree>
      </div>
    );
  },
});
