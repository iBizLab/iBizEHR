/* eslint-disable @typescript-eslint/no-explicit-any */
import { IDEEditForm } from '@ibiz/model-core';
import { IModal, EventBase, ControlVO } from '@ibiz-template/runtime';
import { PropType, onMounted, defineComponent, ref } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import { IModelData } from '../../interface';
import './model-clone.scss';

export default defineComponent({
  name: 'IBizModelClone',
  props: {
    item: { type: Object as PropType<IData>, required: true },
    modal: { type: Object as PropType<IModal>, required: true },
    params: { type: Object as PropType<IParams>, default: () => ({}) },
    modelData: { type: Object as PropType<IDEEditForm>, required: true },
    context: { type: Object as PropType<IContext>, default: () => ({}) },
  },
  setup(props) {
    const ns = useNamespace('model-clone');
    const data = ref<IModelData | undefined>();
    const isLoaded = ref(false);
    const app = ibiz.hub.getApp(props.context.srfappid);
    const deCodeName: string = props.item.srfdecodename;
    const context = props.context.clone();
    context[deCodeName.toLowerCase()] = props.item.srfkey;

    /**
     * 加载拷贝模型
     *
     */
    const load = async () => {
      try {
        isLoaded.value = false;
        const result = await app.deService.exec(
          deCodeName,
          'CopyModel',
          context,
          props.params,
        );
        if (result.ok && result.data) {
          data.value = result.data as IModelData;
        }
      } catch (error: any) {
        ibiz.message.error(error.message || '模型拷贝发生未知错误!');
      } finally {
        isLoaded.value = true;
      }
    };

    onMounted(() => {
      load();
    });

    /**
     * 表单值变更
     *
     * @param {EventBase} event
     */
    const onFormDataChange = (event: EventBase) => {
      if (data.value) {
        const item = event.data[0];
        data.value.model = item instanceof ControlVO ? item.$origin : item;
      }
    };

    /**
     * 确认
     *
     */
    const onConfirm = async () => {
      try {
        if (data.value) {
          const result = await app.deService.exec(
            deCodeName,
            'PasteModel',
            context,
            { ...data.value },
            props.params,
          );
          if (result.ok) {
            return props.modal.dismiss({ ok: true });
          }
        }
      } catch (error: any) {
        ibiz.message.error(error.message || '模型拷贝发生未知错误!');
      }
      return props.modal.dismiss();
    };

    /**
     * 取消
     *
     */
    const onCancel = () => {
      props.modal.dismiss();
    };

    return {
      ns,
      data,
      isLoaded,
      onCancel,
      onConfirm,
      onFormDataChange,
    };
  },
  render() {
    return (
      <div class={this.ns.b()} v-loading={!this.isLoaded}>
        <div class={this.ns.e('title')}>模型拷贝</div>
        <div class={this.ns.e('content')}>
          {this.isLoaded && (
            <iBizControlShell
              isSimple={true}
              data={this.data?.model}
              context={this.context}
              params={this.params}
              modelData={this.modelData}
              class={this.ns.em('content', 'control')}
              onFormDataChange={this.onFormDataChange}
            ></iBizControlShell>
          )}
        </div>
        <div class={this.ns.e('footer')}>
          <el-button title='确认' onClick={() => this.onConfirm()}>
            确认
          </el-button>
          <el-button title='取消' onClick={() => this.onCancel()}>
            取消
          </el-button>
        </div>
      </div>
    );
  },
});
