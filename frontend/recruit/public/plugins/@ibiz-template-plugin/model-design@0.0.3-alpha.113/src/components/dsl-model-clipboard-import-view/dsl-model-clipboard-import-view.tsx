/* eslint-disable @typescript-eslint/no-explicit-any */
/* eslint-disable no-await-in-loop */
import { IModal } from '@ibiz-template/runtime';
import { PropType, computed, defineComponent } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import draggable from 'vuedraggable';
import { ClipboardData } from '../../model';
import './dsl-model-clipboard-import-view.scss';

export default defineComponent({
  name: 'IBizDSLModelClipboardImportView',
  components: {
    draggable,
  },
  props: {
    context: { type: Object as PropType<IContext>, default: () => ({}) },
    params: { type: Object as PropType<IParams>, default: () => ({}) },
    modal: { type: Object as PropType<IModal> },
  },
  setup(props) {
    const ns = useNamespace('dsl-model-clipboard-import-view');
    // 模型粘贴板控制器
    const modelClipboardController = ibiz.modelClipboard;
    // 模型导入视图控制器
    const c = ibiz.dslModelClipboardImportView;

    // 重置模型
    const initModel = (val: string) => {
      c.state.modelStr = val;
      c.state.isModelChange = false;
    };

    // 清除当前已计算模型
    const clearModel = async () => {
      if (c.state.isModelChange) {
        const result = await ibiz.confirm.warning({
          title: '确认清除?',
          desc: '模型数据已变更，将同已拖入模型一同清空，确认清除吗？',
        });
        if (result) {
          c.clearAllData();
        }
      } else {
        c.clearAllData();
      }
    };

    // 关闭当前视图
    const closeView = async () => {
      if (c.state.isModelChange) {
        const result = await ibiz.confirm.warning({
          title: '确认关闭',
          desc: '模型数据已变更，确认关闭吗?',
        });
        if (result) {
          props.modal?.dismiss();
          c.clearAllData();
        }
      } else {
        props.modal?.dismiss();
      }
    };

    // 模型编辑变更
    const modelChange = (val: string) => {
      if (!Object.is(c.state.modelStr, val)) {
        c.state.modelStr = val;
        c.state.isModelChange = true;
      }
    };

    // 计算模型文本内容
    const calcModeStr = () => {
      ibiz.message.warning('编辑框内，模型内容已重新计算!');
      c.state.models = [];
      try {
        c.state.items.forEach(item => {
          const models = item.models.filter(m => !!m.dsl).map(m => m.dsl);
          c.state.models.push(...models);
        });
        // 多个模型使用换行符隔开
        initModel(c.state.models.join('\n'));
      } catch (error) {
        ibiz.log.error(error);
      }
    };

    // 删除拖拽项
    const deleteDropItem = (i: number) => {
      c.state.items.splice(i, 1);
      calcModeStr();
    };

    // 拖入模型变更
    const dropModelChange = async (e: IData) => {
      if (c.state.isModelChange) {
        const result = await ibiz.confirm.warning({
          title: '确认操作?',
          desc: '检测到输入框内容已手动修改，该操作后输入框内容将重新计算，确认操作吗？',
        });
        if (result) {
          calcModeStr();
        } else if (e && e.added && e.added.newIndex != null) {
          c.state.items.splice(e.added.newIndex, 1);
        }
      } else {
        calcModeStr();
      }
    };

    // 素材项
    const materialItem = computed(() => {
      return modelClipboardController.state.items.filter(item => {
        if (
          item.type !== 'dsl' ||
          !Object.is(c.state.params.codeName, item.codeName) ||
          c.state.items.findIndex(self => Object.is(self.uuid, item.uuid)) !==
            -1
        ) {
          return false;
        }
        return item;
      });
    });

    // 保存模型
    const saveModel = async () => {
      c.state.isLoading = true;
      let isError: boolean = false;
      const entity = await ibiz.hub.getAppDataEntity(
        c.state.params.codeName,
        props.context.srfappid,
      );
      const app = ibiz.hub.getApp(props.context.srfappid);
      const service = await app.deService.getService(props.context, entity.id!);
      try {
        const res = await service.exec(
          'CompileModelDSL',
          props.context,
          {
            build: true,
            dsl: c.state.modelStr,
            srfmodelv2scope: props.context.srfmodelv2scope,
          },
          props.params,
        );
        if (res.ok && res.data) {
          c.state.isModelChange = false;
        } else {
          ibiz.message.error(res.statusText);
          isError = true;
        }
      } catch (error: any) {
        ibiz.message.error(
          error?.message ||
            error?.data?.message ||
            error?.statusText ||
            ibiz.i18n.t('core.error.networkAbnormality'),
        );
        isError = true;
      }
      if (!isError) {
        const result = await ibiz.confirm.warning({
          title: '关闭导入界面?',
          desc: '已导入完毕，确认关闭导入界面!',
        });
        if (result) {
          props.modal?.dismiss();
        }
      }
      setTimeout(() => {
        c.state.isLoading = false;
      }, 300);
    };

    return {
      c,
      ns,
      modelClipboardController,
      materialItem,
      closeView,
      clearModel,
      modelChange,
      deleteDropItem,
      dropModelChange,
      saveModel,
    };
  },
  render() {
    const { isLoading, items, modelStr } = this.c.state;
    return (
      <el-card
        class={this.ns.b()}
        v-loading={
          isLoading && {
            text: '数据导入中',
          }
        }
      >
        {{
          header: () => {
            return (
              <div class={this.ns.b('header')}>
                <span>模型导入</span>
                <el-button
                  title='关闭模型导入窗口'
                  link
                  onClick={() => this.closeView()}
                >
                  关闭
                </el-button>
              </div>
            );
          },
          default: () => {
            return (
              <div class={this.ns.b('content')}>
                <div class={this.ns.b('import-warp')}>
                  <div class={this.ns.b('drop-area')}>
                    <draggable
                      class={this.ns.b('drop-area-draggable')}
                      group={{
                        name: 'StudioDesign',
                      }}
                      itemKey='uuid'
                      list={items}
                      onChange={(evt: IData) => this.dropModelChange(evt)}
                    >
                      {{
                        item: ({
                          element,
                          index,
                        }: {
                          element: ClipboardData;
                          index: number;
                        }) => {
                          const item = element;

                          return (
                            <div class={this.ns.b('model-drag-item')}>
                              <div class={this.ns.b('model-drag-item-actions')}>
                                <div
                                  class={this.ns.b(
                                    'model-drag-item-action-item',
                                  )}
                                  title='删除'
                                  onClick={() => this.deleteDropItem(index)}
                                >
                                  <ion-icon name='close-outline'></ion-icon>
                                </div>
                              </div>
                              <div class={this.ns.b('model-drag-item-title')}>
                                {item.title}
                              </div>
                              <div class={this.ns.b('model-drag-item-date')}>
                                {item.createdDate}
                              </div>
                            </div>
                          );
                        },
                      }}
                    </draggable>
                    <div
                      v-show={items.length === 0}
                      class={this.ns.b('drop-tooltip')}
                    >
                      请从右侧素材区拖入
                    </div>
                  </div>
                  <div class={this.ns.b('model-edit')}>
                    <iBizDesignCodeEditor
                      language='groovy'
                      modelValue={modelStr}
                      isChangeLanguage={false}
                      onUpdate:modelValue={(val: string) =>
                        this.modelChange(val)
                      }
                    >
                      {{
                        rightToolbar: () => {
                          return (
                            <div class={this.ns.b('edit-actions')}>
                              <el-button
                                title='清空当前已拖入模型'
                                size='small'
                                type='info'
                                onClick={() => this.clearModel()}
                              >
                                清空
                              </el-button>
                              <el-button
                                title='导入模型数据'
                                size='small'
                                type='primary'
                                onClick={() => this.saveModel()}
                              >
                                导入
                              </el-button>
                            </div>
                          );
                        },
                      }}
                    </iBizDesignCodeEditor>
                  </div>
                </div>
                <div class={this.ns.b('model-material-warp')}>
                  <div class={this.ns.b('model-material-title')}>模型素材</div>
                  <draggable
                    class={this.ns.b('model-material-content')}
                    sort={false}
                    group={{
                      name: 'StudioDesign',
                      pull: 'clone',
                      put: false,
                    }}
                    itemKey='uuid'
                    modelValue={this.materialItem}
                  >
                    {{
                      item: ({ element }: { element: ClipboardData }) => {
                        const item = element;

                        return (
                          <div class={this.ns.b('model-material-item')}>
                            <div class={this.ns.b('model-material-item-title')}>
                              {item.title}
                            </div>
                            <div class={this.ns.b('model-material-item-date')}>
                              {item.createdDate}
                            </div>
                          </div>
                        );
                      },
                    }}
                  </draggable>
                  <div
                    v-show={this.materialItem.length === 0}
                    class={this.ns.b('model-material-tooltip')}
                  >
                    暂无数据
                  </div>
                </div>
              </div>
            );
          },
        }}
      </el-card>
    );
  },
});
