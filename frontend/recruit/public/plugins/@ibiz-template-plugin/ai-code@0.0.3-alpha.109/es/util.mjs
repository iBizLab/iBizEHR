import { PluginStaticResource } from '@ibiz-template/runtime';

"use strict";
const resource = new PluginStaticResource(import.meta.url);
function calcAiToolbarItemsByAc(deACMode) {
  var _a, _b;
  const contentToolbarItems = [];
  const footerToolbarItems = [];
  const questionToolbarItems = [];
  const otherToolbarItems = [];
  (_b = (_a = deACMode.deuiactionGroup) == null ? void 0 : _a.uiactionGroupDetails) == null ? void 0 : _b.forEach(
    (item) => {
      var _a2, _b2, _c, _d, _e;
      const toolbarItem = {
        appId: item.appId,
        id: item.uiactionId,
        label: item.showCaption ? item.caption : "",
        title: item.tooltip,
        icon: {
          showIcon: item.showIcon,
          cssClass: (_a2 = item.sysImage) == null ? void 0 : _a2.cssClass,
          imagePath: (_b2 = item.sysImage) == null ? void 0 : _b2.imagePath
        }
      };
      if (item.sysImage && item.sysImage.imagePath && !item.sysImage.imagePath.startsWith("http")) {
        toolbarItem.icon.imagePath = "".concat(ibiz.env.assetsUrl, "/images/").concat(item.sysImage.imagePath);
      }
      if ((_c = item.uiactionId) == null ? void 0 : _c.startsWith("msg_content_")) {
        contentToolbarItems.push(toolbarItem);
      } else if ((_d = item.uiactionId) == null ? void 0 : _d.startsWith("msg_footer_")) {
        footerToolbarItems.push(toolbarItem);
      } else if ((_e = item.uiactionId) == null ? void 0 : _e.startsWith("question_")) {
        questionToolbarItems.push(toolbarItem);
      } else {
        otherToolbarItems.push(toolbarItem);
      }
    }
  );
  return {
    contentToolbarItems,
    footerToolbarItems,
    questionToolbarItems,
    otherToolbarItems
  };
}

export { calcAiToolbarItemsByAc, resource };
