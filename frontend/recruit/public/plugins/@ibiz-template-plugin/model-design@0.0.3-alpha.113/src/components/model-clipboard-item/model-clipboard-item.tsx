/* eslint-disable no-continue */
/* eslint-disable no-await-in-loop */
/* eslint-disable @typescript-eslint/no-explicit-any */
/* eslint-disable vue/no-mutating-props */
import { PropType, computed, defineComponent, onUnmounted, ref } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import { ClipboardData } from '../../model';
import { IModelData } from '../../interface';
import './model-clipboard-item.scss';

/**
 * 导出数据类型映射行为接口
 */
const actionMap = {
  advanced: 'CopyModel',
  default: 'ExportModelV2',
};

export default defineComponent({
  name: 'IBizModelClipboardItem',
  props: {
    context: { type: Object as PropType<IContext>, default: () => ({}) },
    params: { type: Object as PropType<IParams>, default: () => ({}) },
    data: {
      type: Object as PropType<ClipboardData>,
      required: true,
    },
  },
  emits: ['delete'],
  setup(props, { emit }) {
    const ns = useNamespace('model-clipboard-item');

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
      if (props.data && !props.data.isExport) {
        isLoading.value = true;
        for (let i: number = 0; i < props.data.items.length; i++) {
          const item = props.data.items[i];
          try {
            const entity = await ibiz.hub.getAppDataEntity(
              props.data.codeName,
              props.context.srfappid,
            );
            const app = ibiz.hub.getApp(props.context.srfappid);
            const service = await app.deService.getService(
              props.context,
              entity.id!,
            );
            const res = await service.exec(
              actionMap[props.data.type],
              {
                ...props.context,
                [entity.deapicodeName!]: item.srfkey,
              },
              props.params,
            );
            if (res.ok && res.data) {
              props.data.models.push(res.data as IModelData);
            }
          } catch (err: any) {
            props.data.isError = true;
            props.data.errorInfo = err.message || '模型导出发生未知错误!';
            ibiz.message.error(props.data.errorInfo!);
            break;
          }
          if (isDestroyed.value) {
            break;
          }
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
      el.value = JSON.stringify(
        props.data.models.map(item => item.model),
        null,
        2,
      );
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
      remove,
      copy,
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
          <div class={this.ns.b('content')}>
            <div class={this.ns.b('title')}>
              <el-input
                v-model={this.data.title}
                onChange={() => {
                  this.modelClipboardController.saveToStore();
                }}
              />
            </div>
            <div class={this.ns.b('info')}>
              共{this.data.items.length}条模型数据
            </div>
            <div class={this.ns.b('actions')}>
              <div class={this.ns.b('action')} onClick={() => this.copy()}>
                <ion-icon name='copy' title='拷贝'></ion-icon>
              </div>
              <div class={this.ns.b('action')} onClick={() => this.remove()}>
                <ion-icon name='trash' title='删除'></ion-icon>
              </div>
            </div>
          </div>
          {this.isLoading ? (
            <div class={this.ns.b('loading-warp')}>
              <div
                class={this.ns.b('loading-inner')}
                style={{
                  width: `${
                    (this.data.models.length / this.data.items.length) * 100
                  }%`,
                }}
              >
                <div class={this.ns.b('loading-label')}>
                  {this.data.models.length}/{this.data.items.length}
                </div>
              </div>
            </div>
          ) : null}
        </el-card>
      </el-timeline-item>
    );
  },
});
