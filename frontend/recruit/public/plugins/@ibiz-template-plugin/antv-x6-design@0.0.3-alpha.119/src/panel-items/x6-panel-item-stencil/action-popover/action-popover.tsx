import { IModal } from '@ibiz-template/runtime';
import { PropType, defineComponent } from 'vue';
import { IAppDEUIAction } from '@ibiz/model-core';
import { useNamespace } from '@ibiz-template/vue3-util';
import './action-popover.scss';

export default defineComponent({
  name: 'ActionPopover',
  props: {
    modal: { type: Object as PropType<IModal>, required: true },
    actions: { type: Array as PropType<IAppDEUIAction[]>, default: () => [] },
  },
  setup(props) {
    const ns = useNamespace('action-popover');

    const onSelect = (item: IAppDEUIAction): void => {
      props.modal.dismiss({ ok: true, data: [item] });
    };

    return {
      ns,
      onSelect,
    };
  },
  render() {
    return (
      <div class={this.ns.b()}>
        {this.actions.map(action => {
          return (
            <div
              class={this.ns.e('action-item')}
              onClick={() => this.onSelect(action)}
            >
              <div class={this.ns.em('action-item', 'icon')}>
                {action.sysImage && (
                  <iBizIcon icon={action.sysImage}></iBizIcon>
                )}
              </div>
              <div class={this.ns.em('action-item', 'text')}>
                {action.caption}
              </div>
            </div>
          );
        })}
      </div>
    );
  },
});
