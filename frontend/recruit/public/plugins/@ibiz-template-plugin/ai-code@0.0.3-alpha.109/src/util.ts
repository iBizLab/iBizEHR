import { IAppDEACMode, IAppDEUIActionGroupDetail } from '@ibiz/model-core';
import { PluginStaticResource } from '@ibiz-template/runtime';

const resource = new PluginStaticResource(import.meta.url);

export { resource };

export type IAIToolbarItem = {
  appId: string;
  id: string | undefined;
  label: string | undefined;
  title: string | undefined;
  icon: IData;
};

/**
 * 通过Ac计算Ai工具栏
 *
 * @export
 * @param {IAppDEACMode} deACMode
 * @param {IAiUIActionParams} args
 * @return {*}  {{
 *   contentToolbarItems: IData[];
 *   footerToolbarItems: IData[];
 * }}
 */
export function calcAiToolbarItemsByAc(deACMode: IAppDEACMode): {
  contentToolbarItems: IAIToolbarItem[];
  footerToolbarItems: IAIToolbarItem[];
  questionToolbarItems: IAIToolbarItem[];
  otherToolbarItems: IAIToolbarItem[];
} {
  const contentToolbarItems: IAIToolbarItem[] = [];
  const footerToolbarItems: IAIToolbarItem[] = [];
  const questionToolbarItems: IAIToolbarItem[] = [];
  const otherToolbarItems: IAIToolbarItem[] = [];
  deACMode.deuiactionGroup?.uiactionGroupDetails?.forEach(
    (item: IAppDEUIActionGroupDetail) => {
      const toolbarItem: IAIToolbarItem = {
        appId: item.appId,
        id: item.uiactionId,
        label: item.showCaption ? item.caption : '',
        title: item.tooltip,
        icon: {
          showIcon: item.showIcon,
          cssClass: item.sysImage?.cssClass,
          imagePath: item.sysImage?.imagePath,
        },
      };
      // 修正图片路径
      if (
        item.sysImage &&
        item.sysImage.imagePath &&
        !item.sysImage.imagePath.startsWith('http')
      ) {
        toolbarItem.icon.imagePath = `${ibiz.env.assetsUrl}/images/${item.sysImage.imagePath}`;
      }
      if (item.uiactionId?.startsWith('msg_content_')) {
        contentToolbarItems.push(toolbarItem);
      } else if (item.uiactionId?.startsWith('msg_footer_')) {
        footerToolbarItems.push(toolbarItem);
      } else if (item.uiactionId?.startsWith('question_')) {
        questionToolbarItems.push(toolbarItem);
      } else {
        otherToolbarItems.push(toolbarItem);
      }
    },
  );
  return {
    contentToolbarItems,
    footerToolbarItems,
    questionToolbarItems,
    otherToolbarItems,
  };
}
