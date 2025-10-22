import { defineComponent, PropType, ref } from 'vue';
import { IModal } from '@ibiz-template/runtime';
import { useNamespace } from '@ibiz-template/vue3-util';
import './model-edit-view.scss';

export default defineComponent({
  name: 'IBizModelEditView',
  props: {
    context: { type: Object as PropType<IContext>, default: () => ({}) },
    params: { type: Object as PropType<IParams>, default: () => ({}) },
    modal: { type: Object as PropType<IModal> },
    caption: { type: String, default: '' },
    codeName: { type: String, required: true },
    readonly: { type: Boolean },
  },
  setup(props) {
    const ns = useNamespace('model-edit-view');

    // 是否保存过
    const isSave = ref(false);

    // 模型编辑值
    const value = ref('');

    // 关闭
    const closeView = () => {
      props.modal?.dismiss({ ok: true, params: { isSave: isSave.value } });
    };

    // 是否正在加载
    const loading = ref(false);

    // 加载文本
    const loadingText = ref('');

    // 保存
    const save = async (isClose: boolean = false) => {
      try {
        JSON.parse(value.value);
      } catch (error) {
        ibiz.message.error('模型数据格式异常，请检查!');
        return;
      }
      isSave.value = true;
      try {
        loading.value = true;
        loadingText.value = '保存中...';
        const entity = await ibiz.hub.getAppDataEntity(
          props.codeName,
          props.context.srfappid,
        );
        const app = ibiz.hub.getApp(props.context.srfappid);
        const service = await app.deService.getService(
          props.context,
          entity.id!,
        );
        const deName = entity.codeName?.toLowerCase() || '';
        const params: IParams = {
          [entity.keyAppDEFieldId!]: props.context[deName],
          srfmodelv2scope: props.context.srfmodelv2scope,
          model: JSON.parse(value.value),
        };
        const res = await service.exec(
          'ImportModelV2',
          props.context,
          params,
          props.params,
        );
        if (res.status !== 200) {
          ibiz.message.error(
            res.data?.message ||
              res.statusText ||
              ibiz.i18n.t('core.error.networkAbnormality'),
          );
        } else if (isClose) {
          closeView();
        }
      } catch (err) {
        const error = err as IData;
        ibiz.message.error(
          error?.message ||
            error?.data?.message ||
            error?.statusText ||
            ibiz.i18n.t('core.error.networkAbnormality'),
        );
      } finally {
        loading.value = false;
      }
    };

    // 加载数据
    const load = async () => {
      try {
        loading.value = true;
        loadingText.value = '加载中...';
        const entity = await ibiz.hub.getAppDataEntity(
          props.codeName,
          props.context.srfappid,
        );
        const app = ibiz.hub.getApp(props.context.srfappid);
        const service = await app.deService.getService(
          props.context,
          entity.id!,
        );
        const res = await service.exec(
          'ExportModelV2',
          props.context,
          {},
          props.params,
        );
        if (res.status === 200 && res.data && res.data.model) {
          value.value = JSON.stringify(res.data.model, null, 4);
        }
      } catch (err) {
        const error = err as IData;
        ibiz.message.error(
          error.message || ibiz.i18n.t('core.error.networkAbnormality'),
        );
      } finally {
        loading.value = false;
      }
    };

    load();

    return {
      ns,
      value,
      loading,
      loadingText,
      closeView,
      save,
    };
  },
  render() {
    return (
      <div
        class={this.ns.b()}
        v-loading={this.loading}
        element-loading-text={this.loadingText}
      >
        <div class={this.ns.b('header')}>
          <div
            class={this.ns.b('header-back-btn')}
            onClick={() => this.closeView()}
          >
            <ion-icon name='chevron-back-outline'></ion-icon>
            <span>返回</span>
          </div>
          <div class={this.ns.b('header-caption')}>{this.caption}</div>
          <div class={this.ns.b('header-toolbar')}>
            {this.readonly
              ? null
              : [
                  <el-button size='small' onClick={() => this.save(true)}>
                    保存并关闭
                  </el-button>,
                  <el-button size='small' onClick={() => this.save()}>
                    保存
                  </el-button>,
                ]}
            <el-button size='small' onClick={() => this.closeView()}>
              关闭
            </el-button>
          </div>
          <div
            class={this.ns.b('header-close-btn')}
            title='关闭'
            onClick={() => this.closeView()}
          >
            <ion-icon name='close-outline'></ion-icon>
          </div>
        </div>
        <div class={this.ns.b('content')}>
          <iBizDesignCodeEditor
            language='json'
            isChangeLanguage={false}
            v-model={this.value}
            isEnableLoad={!this.loading}
          ></iBizDesignCodeEditor>
        </div>
      </div>
    );
  },
});
