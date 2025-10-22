import { IModal } from '@ibiz-template/runtime';
import { IAppDataEntity } from '@ibiz/model-core';
import { PropType, computed, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import { getToken } from '@ibiz-template/core';
import { resource } from '../../global';
import './model-runtime.scss';

export default defineComponent({
  name: 'IBizModelRuntime',
  props: {
    title: { type: String },
    modal: { type: Object as PropType<IModal> },
    entity: { type: Object as PropType<IAppDataEntity>, required: true },
    context: { type: Object as PropType<IContext>, default: () => ({}) },
    params: { type: Object as PropType<IParams>, default: () => ({}) },
  },
  setup(props) {
    const ns = useNamespace('model-runtime');

    const headers = computed(() => {
      return {
        psdevslnsys: props.context.psdevslnsys,
        Authorization: `Bearer ${getToken()}`,
        'Content-Type': 'application/json',
      };
    });

    const parentKey = computed(() => {
      return `${props.entity.name}__${
        props.context[props.entity.name!.toLowerCase()]
      }`;
    });

    const url = computed(() => {
      return `${ibiz.env.baseUrl}/${ibiz.env.appId}/psdevslnsys/${props.context.psdevslnsys}/getruntimenodes`;
    });

    const configBaseUrl = resource.dir(`assets/json/runtime-model`);

    const onClose = () => {
      props.modal?.dismiss();
    };

    return {
      ns,
      url,
      headers,
      parentKey,
      configBaseUrl,
      onClose,
    };
  },
  render() {
    return (
      <div class={this.ns.b()}>
        <div class={this.ns.e('title')}>
          <div class={this.ns.em('title', 'caption')}>模型运行时</div>
          <ion-icon
            name='close-outline'
            title='退出'
            class={this.ns.em('title', 'icon')}
            onClick={this.onClose}
          ></ion-icon>
        </div>
        <div class={this.ns.e('content')}>
          <ibiz-model-runtime
            id='root'
            url={this.url}
            headers={this.headers}
            parentKey={this.parentKey}
            configBaseUrl={this.configBaseUrl}
          />
          <loading-mask id='rootLoadingMask' default-show='true'></loading-mask>
          <loading-panel id='rootLoadingPanel'></loading-panel>
        </div>
      </div>
    );
  },
});
