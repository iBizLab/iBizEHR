/* eslint-disable no-return-assign */
/* eslint-disable @typescript-eslint/no-explicit-any */
import { PropType, computed, defineComponent } from 'vue';
import { IPanelField } from '@ibiz/model-core';
import { IModalData } from '@ibiz-template/runtime';
import { useNamespace } from '@ibiz-template/vue3-util';
import { LocalVersionTagController } from './local-version-tag.controller';
import './local-version-tag.scss';
import { formatTimestamp } from '../../util';

export default defineComponent({
  name: 'IBizLocalVersionTag',
  props: {
    modelData: {
      type: Object as PropType<IPanelField>,
      required: true,
    },
    controller: {
      type: LocalVersionTagController,
      required: true,
    },
  },
  setup(props) {
    const ns = useNamespace('local-version-tag');
    const c = props.controller;
    const { state } = c;

    const timeStr = computed(() => {
      return formatTimestamp(state.timestamp, 'YYYY-MM-DD HH:mm:ss');
    });

    // 打开本地历史版本列表
    const openVersionList = async () => {
      const overlay = ibiz.overlay.createDrawer(
        'IBizLocalVersionContainer',
        { controller: c.versionControl, dismiss: () => overlay.dismiss() },
        { width: 600, placement: 'right' } as any,
      );
      await overlay.present();
      const result: IModalData = await overlay.onWillDismiss();
      return result || { ok: false };
    };

    return {
      ns,
      state,
      timeStr,
      openVersionList,
    };
  },
  render() {
    return (
      <div class={this.ns.b()}>
        <div
          class={[this.ns.b('state'), this.ns.is('dirty', this.state.isDirty)]}
        ></div>
        <div
          class={this.ns.b('caption')}
          onClick={() => this.openVersionList()}
        >
          <div class={this.ns.be('caption', 'version')}>本地历史版本</div>
          <div class={this.ns.be('caption', 'timestamp')}>
            <span>{this.timeStr}</span>
            <span>&nbsp;&nbsp;</span>
            <span>{this.state.isDirty ? '工作区变更' : '保存完成'}</span>
          </div>
        </div>
      </div>
    );
  },
});
