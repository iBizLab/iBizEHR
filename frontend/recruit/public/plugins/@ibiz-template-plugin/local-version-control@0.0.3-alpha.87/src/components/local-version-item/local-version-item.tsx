/* eslint-disable @typescript-eslint/no-unused-vars */
import { PropType, computed, defineComponent, nextTick, ref } from 'vue';
import { ElInput } from 'element-plus';
import { useNamespace } from '@ibiz-template/vue3-util';
import { IDBEntity, IVersionControlController } from '../../interface';
import './local-version-item.scss';
import { formatTimestamp } from '../../util';

export default defineComponent({
  name: 'IBizLocalVersionItem',
  props: {
    item: {
      type: Object as PropType<IDBEntity>,
      required: true,
    },
    items: {
      type: Object as PropType<IDBEntity[]>,
      required: true,
    },
    controller: {
      type: Object as PropType<IVersionControlController>,
      required: true,
    },
  },
  emits: {
    action: (tag: string, item: IDBEntity, event: MouseEvent) => true,
  },
  setup(props, { emit }) {
    const ns = useNamespace('local-version-item');

    const editing = ref(false);

    const curCaption = ref(props.item.caption);

    const showCompare = computed(() => {
      return props.items.length > 1;
    });

    const isActive = computed(() => {
      return props.item.id === props.controller.activeItemId;
    });

    const timeStr = computed(() => {
      return formatTimestamp(props.item.timestamp, 'YYYY-MM-DD HH:mm:ss');
    });

    const actionClick = (tag: string, event: MouseEvent) => {
      emit('action', tag, props.item, event);
    };

    const onCaptionChange = async (value: string) => {
      editing.value = false;
      const result = await props.controller.updateCaption(props.item.id, value);
      if (!result) {
        ibiz.message.error(`版本名称变更失败`);
        curCaption.value = props.item.caption;
      }
    };

    const inputRef = ref<InstanceType<typeof ElInput>>();
    const renderInput = () => {
      if (editing.value) {
        nextTick(() => {
          // 确保 DOM 更新完成
          inputRef.value?.focus();
        });
        return (
          <el-input
            ref={inputRef}
            v-model={curCaption.value}
            placeholder={'请输入版本名称'}
            onChange={onCaptionChange}
            onBlur={() => {
              editing.value = false;
            }}
          />
        );
      }
      return curCaption.value;
    };

    return {
      ns,
      timeStr,
      editing,
      showCompare,
      isActive,
      actionClick,
      renderInput,
    };
  },
  render() {
    return (
      <div class={[this.ns.b(), this.ns.is('active', this.isActive)]}>
        <div class={this.ns.b('left')}>
          <div class={this.ns.b('left-top')}>
            {this.renderInput()}
            {!this.editing ? (
              <ion-icon
                name='create-outline'
                onClick={() => {
                  this.editing = !this.editing;
                }}
              ></ion-icon>
            ) : null}
          </div>
          <div class={this.ns.b('left-bottom')}>
            <div>{this.timeStr}</div>
            <div>{this.item.username}</div>
          </div>
        </div>
        <div class={this.ns.b('right')}>
          <el-button
            title='切换至此版本'
            class={this.ns.is('hidden', this.isActive)}
            onClick={event => {
              this.actionClick('apply', event);
            }}
          >
            <ion-icon name='repeat'></ion-icon>应用
          </el-button>
          <el-popover
            popper-class={this.ns.e('popover')}
            placement='bottom'
            width={80}
            trigger='click'
          >
            {{
              reference: () => {
                return (
                  <el-button
                    title='更多'
                    class={this.ns.is(
                      'hidden',
                      this.isActive && !this.showCompare,
                    )}
                  >
                    <ion-icon name='ellipsis-horizontal'></ion-icon>
                  </el-button>
                );
              },
              default: () => {
                return (
                  <div class={this.ns.b('actions')}>
                    {!this.isActive && (
                      <div
                        title='删除版本'
                        onClick={event => {
                          this.actionClick('remove', event);
                        }}
                      >
                        <ion-icon name='trash'></ion-icon>删除版本
                      </div>
                    )}
                    {this.showCompare && (
                      <div
                        title='版本比对'
                        onClick={event => {
                          this.actionClick('diff', event);
                        }}
                      >
                        <ion-icon name='git-compare'></ion-icon>
                        版本比对
                      </div>
                    )}
                  </div>
                );
              },
            }}
          </el-popover>
        </div>
      </div>
    );
  },
});
