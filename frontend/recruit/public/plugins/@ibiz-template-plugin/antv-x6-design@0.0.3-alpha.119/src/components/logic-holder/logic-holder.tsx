import { useNamespace } from '@ibiz-template/vue3-util';
import { defineComponent } from 'vue';
import { resource } from '../../global';
import './logic-holder.scss';

export const LogicHolder = defineComponent({
  props: {
    value: {
      type: Number,
      required: true,
    },
  },
  setup() {
    const ns = useNamespace('x6-logic-holder');

    // 逻辑所有者映射
    const map = {
      1: {
        text: '后台',
        icon: resource.dir('./assets/svg/backend.svg'),
      },
      2: {
        text: '前台',
        icon: resource.dir('./assets/svg/front.svg'),
      },
      3: {
        text: '通用',
        icon: resource.dir('./assets/svg/common.svg'),
      },
    };

    return { ns, map };
  },
  render() {
    const item = this.map[this.value as keyof typeof this.map];
    if (!item) {
      return;
    }

    return (
      <div class={this.ns.b()} title={item.text}>
        <ion-icon class={this.ns.e('icon')} src={item.icon} />
        <div class={this.ns.e('text')}>{item.text}</div>
      </div>
    );
  },
});
