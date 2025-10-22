import { PropType, defineComponent, onMounted, onUnmounted, ref } from 'vue';
import { useNamespace } from '@ibiz-template/vue3-util';
import { IVersionControlController } from '../../interface';
import './local-version-container.scss';

export default defineComponent({
  name: 'IBizLocalVersionContainer',
  props: {
    controller: {
      type: Object as PropType<IVersionControlController>,
      required: true,
    },
    dismiss: {
      type: Function as PropType<() => void>,
      required: true,
    },
  },
  setup(props) {
    const ns = useNamespace('local-version-container');

    const evt = props.controller.evt;

    const { overUpNumber, overUpIsClean } = props.controller.getOverUpState();
    const closeDrawer = () => {
      props.dismiss();
    };

    onMounted(() => {
      evt.on('close', closeDrawer);
    });

    onUnmounted(() => {
      evt.off('close', closeDrawer);
    });

    const cleanState = ref(overUpIsClean);
    const setCleanState = (val: boolean) => {
      cleanState.value = val;
      props.controller.setOverUpState(val);
    };

    const clearHistoryVersion = () => {
      props.controller.deleteAll();
    };

    return {
      ns,
      closeDrawer,
      cleanState,
      overUpNumber,
      setCleanState,
      clearHistoryVersion,
    };
  },
  render() {
    return (
      <div class={this.ns.b()}>
        <div class={this.ns.e('header')}>
          <div class={this.ns.e('header-left')}>历史版本</div>
          <div class={this.ns.e('header-right')}>
            <el-button
              title='关闭'
              class={this.ns.e('header-button')}
              onClick={() => this.closeDrawer()}
            >
              <i class='fa fa-sign-out'></i>
              <span>关闭</span>
            </el-button>
          </div>
        </div>
        <div class={this.ns.e('body')}>
          <iBizLocalVersionList
            controller={this.controller}
          ></iBizLocalVersionList>
        </div>
        <div class={this.ns.e('footer')}>
          <el-checkbox
            model-value={this.cleanState}
            onChange={this.setCleanState}
            label={`自动清理旧版本（保留最多${this.overUpNumber}个）`}
          />
          <el-button
            title='清空历史版本'
            class={this.ns.e('footer-button')}
            onClick={() => this.clearHistoryVersion()}
          >
            <i class='fa fa-trash'></i>
            <span>清空历史版本</span>
          </el-button>
        </div>
      </div>
    );
  },
});
