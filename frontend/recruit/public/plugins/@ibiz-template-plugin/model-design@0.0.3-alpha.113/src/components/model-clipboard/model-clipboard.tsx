import { IModal } from '@ibiz-template/runtime';
import { PropType, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import './model-clipboard.scss';

export default defineComponent({
  name: 'IBizModelClipboard',
  props: {
    context: { type: Object as PropType<IContext>, default: () => ({}) },
    params: { type: Object as PropType<IParams>, default: () => ({}) },
    modal: { type: Object as PropType<IModal> },
    type: {
      type: String as PropType<'default' | 'advanced'>,
      default: 'default',
    },
  },
  setup(props) {
    const ns = useNamespace('model-clipboard');
    // 模型粘贴板控制器
    const controller = ibiz.modelClipboard;

    // 清空所有数据
    const removeAll = async () => {
      if (controller.state.items.length > 0) {
        const result = await ibiz.confirm.warning({
          title: '确认删除所有?',
          desc: '确认删除当前粘贴板的数据?',
        });
        if (result) {
          controller.clearAll(props.type);
        }
      }
    };

    const close = () => {
      props.modal?.dismiss();
    };

    return {
      ns,
      controller,
      removeAll,
      close,
    };
  },
  render() {
    return (
      <div class={this.ns.b()}>
        <div class={this.ns.b('header')}>
          <div class={this.ns.b('header-title')}>
            {`${this.type === 'advanced' ? '高级' : ''}模型粘贴板`}
          </div>
          <div class={this.ns.b('header-actions')}>
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
        <div class={this.ns.b('content')}>
          <el-timeline>
            {this.controller.state.items
              .filter(item => item.type === this.type)
              .map(item => {
                return (
                  <iBizModelClipboardItem
                    key={item.uuid}
                    context={this.context}
                    params={this.params}
                    data={item}
                    onDelete={() => this.controller.removeById(item.uuid)}
                  ></iBizModelClipboardItem>
                );
              })}
          </el-timeline>
        </div>
      </div>
    );
  },
});
