/* eslint-disable @typescript-eslint/no-unused-vars */
import {
  PropType,
  Ref,
  defineComponent,
  onMounted,
  onUnmounted,
  ref,
} from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import { IDBEntity, IVersionControlController } from '../../interface';
import './local-version-list.scss';

export default defineComponent({
  name: 'IBizLocalVersionList',
  props: {
    controller: {
      type: Object as PropType<IVersionControlController>,
      required: true,
    },
  },
  setup(props) {
    const ns = useNamespace('local-version-list');
    const items: Ref<IDBEntity[]> = ref([]);
    const query = ref('');
    const evt = props.controller.evt;

    const fetchItems = async (value?: string) => {
      const controller = props.controller;
      items.value = value
        ? await controller.fetchAll(value)
        : await controller.fetchAll();
    };

    onMounted(async () => {
      await fetchItems();
      evt.on('deleteAll', fetchItems);
    });

    onUnmounted(() => {
      evt.off('deleteAll', fetchItems);
    });

    const handleQueryChange = async (value: string) => {
      await fetchItems(value);
    };

    const handApply = async (data: IDBEntity) => {
      const controller = props.controller;
      await controller.apply(data);
    };

    const handleRemove = async (data: IDBEntity) => {
      const controller = props.controller;
      const result = await controller.remove(data);
      if (result) {
        items.value = await controller.fetchAll();
      }
    };

    const handleAction = (tag: string, data: IDBEntity, event: MouseEvent) => {
      switch (tag) {
        case 'apply':
          handApply(data);
          break;
        case 'remove':
          handleRemove(data);
          break;
        case 'diff':
          props.controller.diff(data, items.value);
          break;
        default:
          console.error(`${tag} is not support`);
          break;
      }
    };

    return {
      ns,
      query,
      items,
      handleAction,
      handleQueryChange,
    };
  },
  render() {
    return (
      <div class={this.ns.b()}>
        <div class={this.ns.e('search')}>
          <el-input
            v-model={this.query}
            style={'width: 100%'}
            placeholder={'请输入历史版本名称进行过滤'}
            suffix-icon={
              <ion-icon
                class={this.ns.e('search-icon')}
                style={'cursor: pointer;'}
                name='search'
              />
            }
            onChange={(value: string) => {
              this.handleQueryChange(value);
            }}
            clearable
          />
        </div>
        <div class={this.ns.e('body')}>
          {this.items.length > 0 ? (
            this.items.map(item => {
              return (
                <iBizLocalVersionItem
                  key={item.id}
                  item={item}
                  items={this.items}
                  controller={this.controller}
                  onAction={(tag, data, event) => {
                    this.handleAction(tag, data, event);
                  }}
                ></iBizLocalVersionItem>
              );
            })
          ) : (
            <iBizNoData></iBizNoData>
          )}
        </div>
      </div>
    );
  },
});
