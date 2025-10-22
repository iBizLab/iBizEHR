import { IModal } from '@ibiz-template/runtime';
import { PropType, computed, defineComponent, ref } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import IBizDSLModelClipboardItem from './dsl-model-clipboard-item/dsl-model-clipboard-item';
import { IModelData } from '../../interface';
import './dsl-model-clipboard.scss';

export default defineComponent({
  name: 'IBizDSLModelClipboard',
  props: {
    context: { type: Object as PropType<IContext>, default: () => ({}) },
    params: { type: Object as PropType<IParams>, default: () => ({}) },
    modal: { type: Object as PropType<IModal> },
  },
  setup(props) {
    const ns = useNamespace('dsl-model-clipboard');
    // 模型粘贴板控制器
    const controller = ibiz.modelClipboard;
    const enableMerge = ref(false);

    const items = computed(() => {
      return controller.state.items.filter(item => item.type === 'dsl');
    });

    /**
     * 清空选中
     *
     */
    const onClearSelected = (): void => {
      items.value.forEach(item => {
        item.isSelected = false;
      });
    };

    // 已选中模型
    const selected = computed(() => {
      return items.value.filter(item => item.isSelected);
    });

    // 模态关闭之前
    props.modal?.hooks.beforeDismiss.tapPromise(async () => {
      onClearSelected();
    });

    /**
     * 开关状态改变
     *
     * @param {boolean} val
     */
    const handleChange = (_val: boolean): void => {
      onClearSelected();
    };

    /**
     * 处理合并
     *
     */
    const handleMerge = async (): Promise<void> => {
      // DSL模型集合
      const models: IModelData[] = [];
      selected.value.forEach(select => {
        models.push(...select.models);
      });
      onClearSelected();
      ibiz.modelClipboard.createItem({
        models,
        type: 'dsl',
        isMerge: true,
        title: '合并模型',
        codeName: 'pssystem',
      });
    };

    /**
     * 清空粘贴板数据
     *
     */
    const removeAll = async () => {
      if (controller.state.items.length > 0) {
        const result = await ibiz.confirm.warning({
          title: '确认删除所有?',
          desc: '确认删除当前粘贴板的数据?',
        });
        if (result) controller.clearAll('dsl');
      }
    };

    /**
     * 关闭粘贴板
     *
     */
    const close = () => {
      props.modal?.dismiss();
    };

    return {
      ns,
      items,
      selected,
      controller,
      enableMerge,
      close,
      removeAll,
      handleMerge,
      handleChange,
    };
  },
  render() {
    return (
      <div class={this.ns.b()}>
        <div class={this.ns.e('header')}>
          <div class={this.ns.em('header', 'title')}>DSL模型粘贴板</div>
          <div class={this.ns.e('actions')}>
            <div class={this.ns.em('actions', 'merge')}>
              {this.enableMerge && <div>已选中{this.selected.length}项</div>}
              <el-switch
                size='small'
                active-text='合并模型'
                v-model={this.enableMerge}
                onChange={this.handleChange}
              />
            </div>
            <el-button
              size='small'
              type='info'
              onClick={() => this.removeAll()}
            >
              清空
            </el-button>
            <ion-icon
              name='close-outline'
              title='关闭'
              onClick={() => this.close()}
            ></ion-icon>
          </div>
        </div>
        <div class={this.ns.e('content')}>
          <el-timeline>
            {this.items.map(item => {
              return (
                <IBizDSLModelClipboardItem
                  data={item}
                  key={item.uuid}
                  params={this.params}
                  context={this.context}
                  enableSelect={this.enableMerge}
                  onDelete={() => this.controller.removeById(item.uuid)}
                ></IBizDSLModelClipboardItem>
              );
            })}
          </el-timeline>
        </div>
        {this.enableMerge && (
          <div class={this.ns.e('footer')}>
            <el-button
              title='确定合并'
              class={this.ns.em('footer', 'button')}
              onClick={() => this.handleMerge()}
            >
              <span>确定合并</span>
            </el-button>
          </div>
        )}
      </div>
    );
  },
});
