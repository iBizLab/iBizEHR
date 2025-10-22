/* eslint-disable no-continue */
/* eslint-disable no-await-in-loop */
/* eslint-disable @typescript-eslint/no-explicit-any */
/* eslint-disable vue/no-mutating-props */
import { PropType, computed, defineComponent, onUnmounted, ref } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import { IModelData } from '../../../interface';
import { ClipboardData } from '../../../model';
import './dsl-model-clipboard-item.scss';

export default defineComponent({
  name: 'IBizDSLModelClipboardItem',
  props: {
    context: { type: Object as PropType<IContext>, default: () => ({}) },
    params: { type: Object as PropType<IParams>, default: () => ({}) },
    data: {
      type: Object as PropType<ClipboardData>,
      required: true,
    },
    enableSelect: {
      type: Boolean,
      default: false,
    },
  },
  emits: ['delete'],
  setup(props, { emit }) {
    const ns = useNamespace('dsl-model-clipboard-item');

    // 模型粘贴板控制器
    const modelClipboardController = ibiz.modelClipboard;

    // 是否正在加载模型
    const isLoading = ref(false);

    const isDestroyed = ref(false);

    const stateType = computed(() => {
      let type: string = 'info';
      if (props.data.isError) {
        type = 'danger';
      } else if (props.data.isExport) {
        type = 'success';
      } else if (isLoading.value) {
        type = 'warning';
      }
      return type;
    });

    // 初始化
    const init = async () => {
      if (!props.data.isExport) {
        try {
          const srfkeys: string[] = props.data.items.map(item => item.srfkey);
          const dsl: IData = {};
          props.data.models
            .filter(model => !!model.dsl)
            .forEach((model, index) => {
              Object.assign(dsl, { [index]: model.dsl });
            });
          if (props.data.isMerge) props.data.models = [];
          isLoading.value = true;
          const entity = await ibiz.hub.getAppDataEntity(
            props.data.codeName,
            props.context.srfappid,
          );
          const app = ibiz.hub.getApp(props.context.srfappid);
          const service = await app.deService.getService(
            props.context,
            entity.id!,
          );
          // 判断是合并模型还是导出模型
          const res = await service.exec(
            props.data.isMerge ? 'mergemodeldsl' : 'ExportModelDSL',
            props.data.isMerge
              ? props.context
              : {
                  ...props.context,
                  [entity.deapicodeName!]: '___srfkeys___',
                },
            props.data.isMerge
              ? { ...props.params, dsl }
              : {
                  ...props.params,
                  srfkeys: srfkeys.join(';'),
                },
          );
          if (res.ok && res.data) {
            const data = res.data as IModelData;
            props.data.models.push(data);
          }
        } catch (err: any) {
          props.data.isError = true;
          props.data.errorInfo =
            err.message ||
            `模型${props.data.isMerge ? '合并' : '导出'}发生未知错误!`;
          ibiz.message.error(props.data.errorInfo!);
        }
        props.data.isExport = true;
        modelClipboardController.saveToStore();
        setTimeout(() => {
          isLoading.value = false;
        }, 300);
      }
    };

    init();

    // 拷贝当前项
    const copy = () => {
      const el = document.createElement('textarea');
      el.style.position = 'absolute';
      el.style.left = '-9999px';
      const dslModels = props.data.models.filter(m => !!m.dsl).map(m => m.dsl);
      el.value = dslModels.join('\n');
      document.body.appendChild(el);
      el.select();
      const result = document.execCommand('copy');
      document.body.removeChild(el);
      if (result) {
        ibiz.message.success('已复制模型数据至剪贴板');
      } else {
        ibiz.message.error('复制模型数据失败');
      }
    };

    // 删除当前数据
    const remove = () => {
      emit('delete');
    };

    onUnmounted(() => {
      isDestroyed.value = true;
    });

    return {
      ns,
      stateType,
      isLoading,
      modelClipboardController,
      copy,
      remove,
    };
  },
  render() {
    return (
      <el-timeline-item
        class={this.ns.b()}
        timestamp={this.data.createdDate}
        type={this.stateType}
        placement='top'
      >
        <el-card shadow='hover'>
          <div class={this.ns.e('content')}>
            <div class={this.ns.em('content', 'title')}>
              <el-input
                v-model={this.data.title}
                onChange={() => {
                  this.modelClipboardController.saveToStore();
                }}
              />
            </div>
            <div class={this.ns.em('content', 'info')}>
              共{this.data.items.length || this.data.models.length}条模型数据
            </div>
            <div class={this.ns.e('actions')}>
              {this.enableSelect && (
                <div class={this.ns.em('actions', 'item')}>
                  <el-checkbox v-model={this.data.isSelected} />
                </div>
              )}
              <div
                class={this.ns.em('actions', 'item')}
                onClick={() => this.copy()}
              >
                <ion-icon name='copy' title='拷贝'></ion-icon>
              </div>
              <div
                class={this.ns.em('actions', 'item')}
                onClick={() => this.remove()}
              >
                <ion-icon name='trash' title='删除'></ion-icon>
              </div>
            </div>
          </div>
          {this.isLoading ? (
            <div class={this.ns.e('loading')}>
              <div
                class={this.ns.em('loading', 'inner')}
                style={{
                  width: `${(this.data.models.length / 1) * 100}%`,
                }}
              >
                <div class={this.ns.em('loading', 'label')}>
                  {this.data.models.length}/1
                </div>
              </div>
            </div>
          ) : null}
        </el-card>
      </el-timeline-item>
    );
  },
});
