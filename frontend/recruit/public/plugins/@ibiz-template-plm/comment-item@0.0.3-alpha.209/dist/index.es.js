import './style.css';
var U = Object.defineProperty;
var F = (n, r, e) => r in n ? U(n, r, { enumerable: !0, configurable: !0, writable: !0, value: e }) : n[r] = e;
var u = (n, r, e) => (F(n, typeof r != "symbol" ? r + "" : r, e), e);
import { EditorController as J, ScriptFactory as K, PanelItemEventName as q, OpenAppViewCommand as B, registerEditorProvider as S } from "@ibiz-template/runtime";
import { getRawProps as V, getEditorEmits as W, useNamespace as G, withInstall as X } from "@ibiz-template/vue3-util";
import { defineComponent as Y, ref as f, computed as N, watch as O, createVNode as I, resolveComponent as x, nextTick as w } from "vue";
import { clone as Q } from "ramda";
const v = /* @__PURE__ */ Y({
  name: "CommentItemRawItem",
  props: V(),
  emits: {
    ...W(),
    /** 点击事件 */
    click: (n, r) => !0
  },
  setup(n) {
    var P, _, b, R, T, k;
    const r = G("raw"), e = n.controller, t = e.model, s = f(""), l = f(""), c = f(), d = f(), o = f([]), y = f(!0);
    let C = "TEXT", h = "";
    t.contentType && (C = t.contentType), (P = t.editorParams) != null && P.contenttype && (C = (_ = t.editorParams) == null ? void 0 : _.contenttype), (b = t.editorParams) != null && b.escaped && (y.value = ((R = t.editorParams) == null ? void 0 : R.escaped) === "true"), (T = t.editorParams) != null && T.template && (h = t.editorParams.template.replaceAll("//n", "\n")), (k = t.editorParams) != null && k.TEMPLATE && (h = t.editorParams.TEMPLATE.replaceAll("//n", "\n"));
    const M = N(() => !!(n.controlParams && n.controlParams.editmode === "hover")), j = (i) => i.replaceAll(/{"emoji":"(.+?)"}/g, (m, a) => {
      const p = decodeURIComponent(atob(a));
      return '<span class="emoji-tag">'.concat(p, "</span>");
    }).replaceAll(/<span data-w-e-type="emoji" class='emoji'>(.+?)<\/span>/g, (m, a) => {
      const p = decodeURIComponent(atob(a));
      return "<span data-w-e-type=\"emoji\" class='emoji'>".concat(p, "</span>");
    });
    O(() => n.value, async (i, m) => {
      if (i !== m) {
        if ((typeof i == "string" || typeof i == "number") && (s.value = i), h && i) {
          let a = null;
          if (typeof i == "string")
            try {
              a = JSON.parse(i);
            } catch (p) {
              ibiz.log.error("JSON字符串转换错误");
            }
          s.value = await ibiz.util.hbs.render(h, a || i);
        }
        s.value = j(s.value ? "".concat(s.value) : "");
      }
    }, {
      immediate: !0
    });
    const g = N(() => e.scriptCode ? n.controller.getPanelItemCustomHtml(e.scriptCode, {
      content: s.value
    }) : ""), D = async (i) => {
      if (l.value = i, o.value = [i], await w(), c.value) {
        const {
          container: m
        } = c.value.$refs;
        m && m.children[0].click();
      }
    }, $ = async () => {
      await w(), d.value && d.value.querySelectorAll("img").forEach((m) => {
        m.onclick = (a) => {
          const p = a.target;
          p && D(p.src);
        };
      });
    }, E = (i) => {
      if (c.value) {
        const {
          container: m
        } = c.value.$refs;
        if (m) {
          const a = m.querySelector(".el-image-viewer__wrapper");
          a == null || a[i]("keydown", L);
        }
      }
    }, L = async (i) => {
      (i.key === "Escape" || i.keyCode === 27) && (i.stopPropagation(), i.preventDefault(), await w(), E("removeEventListener"), o.value = []);
    }, z = async () => {
      await w(), E("addEventListener");
    }, H = (i) => {
      i.stopPropagation(), i.preventDefault(), e.handleClick(i);
    };
    return O(() => g, () => {
      $();
    }, {
      immediate: !0
    }), {
      ns: r,
      c: e,
      rawRef: d,
      previewRef: c,
      content: s,
      previewUrl: l,
      type: C,
      template: h,
      htmlCode: g,
      showFormDefaultContent: M,
      previewSrcList: o,
      onShow: z,
      handleKeyPress: L,
      handleClick: H,
      escaped: y
    };
  },
  render() {
    let n = this.htmlCode || "";
    return this.htmlCode && this.escaped && (n = n.replace(/&/g, "&amp;")), I("div", {
      class: [this.ns.b(), this.ns.is("comment-item", !0), this.disabled ? this.ns.m("disabled") : "", this.readonly ? this.ns.m("readonly") : "", this.ns.is("show-default", this.showFormDefaultContent)]
    }, [this.htmlCode ? I("div", {
      ref: "rawRef",
      onClick: this.handleClick,
      class: this.ns.e("script"),
      innerHTML: n
    }, null) : this.content && I(x("iBizRawItem"), {
      class: this.ns.b("content"),
      content: this.content,
      type: this.type
    }, null), I(x("el-image"), {
      class: this.ns.e("preview"),
      ref: "previewRef",
      "zoom-rate": 1.1,
      src: this.previewUrl,
      "preview-src-list": this.previewSrcList,
      "hide-on-click-modal": !0,
      onShow: this.onShow,
      fit: "cover"
    }, null)]);
  }
});
class Z extends J {
  constructor() {
    super(...arguments);
    /**
     * 绘制器脚本代码
     *
     * @type {string}
     * @memberof CommentItemRawItemEditorController
     */
    u(this, "scriptCode", "");
    /**
     * @description 链接视图id
     * @type {string}
     * @memberof CommentItemRawItemEditorController
     */
    u(this, "linkViewId", "plmweb.recent_redirect_view");
    /**
     * @description 图标代码表标识
     * @type {string}
     * @memberof CommentItemRawItemEditorController
     */
    u(this, "iconCodeListId", "plmweb.base__recent_visite");
    /**
     * @description 代码表数据
     * @type {readonly}
     * @memberof CommentItemRawItemEditorController
     */
    u(this, "codeListItems", []);
  }
  async onInit() {
    await super.onInit();
    const { SCRIPTCODE: e, LINKVIEWID: t, ICONCODELISTID: s } = this.editorParams;
    e && (this.scriptCode = e), t && (this.linkViewId = t), s && (this.iconCodeListId = s), this.codeListItems = await this.loadCodeList(this.iconCodeListId);
  }
  /**
   * 加载代码表
   *
   * @param {string} appCodeListId
   * @return {*}  {(Promise<readonly CodeListItem[]>)}
   * @memberof CommentItemRawItemEditorController
   */
  async loadCodeList(e) {
    return await ibiz.hub.getApp(this.context.srfappid).codeList.get(
      e,
      this.context,
      this.params
    );
  }
  /**
   * 获取面板绘制器自定义html
   *
   * @param {string} controlRenders
   * @param {(IData | undefined)} data
   * @return {*}  {(string | undefined)}
   * @memberof CommentItemRawItemEditorController
   */
  getPanelItemCustomHtml(e, t) {
    if (e)
      return K.execScriptFn(
        { data: t || {}, controller: this },
        e,
        {
          singleRowReturn: !0,
          isAsync: !1
        }
      );
  }
  findCodeListItem(e, t) {
    if (e) {
      const s = e.find((l) => l.value == t);
      if (s)
        return s;
      for (let l = 0; l < e.length; l++) {
        const c = this.findCodeListItem(
          e[l].children,
          t
        );
        if (c)
          return c;
      }
    }
  }
  /**
   * @description 解析评论节点
   * @param {IData} data
   * @return {*}
   * @memberof CommentItemRawItemEditorController
   */
  parseCommentTag(e) {
    let { icon: t } = e;
    if (!e.icon && e.owner_subtype && this.codeListItems.length) {
      const s = this.findCodeListItem(
        this.codeListItems,
        e.owner_subtype
      );
      s && s.sysImage && (t = s.sysImage.rawContent || "");
    }
    return "<span class='comment-tag' data-value='".concat(JSON.stringify(
      e
    ), "'>").concat(t, " ").concat(e.identifier, " ").concat(e.name, "</span>");
  }
  /**
   * @description 点击事件
   * @param {MouseEvent} event
   * @memberof CommentItemRawItemEditorController
   */
  onClick(e) {
    const { panel: t } = this.parent;
    t && t.evt.emit("onPanelItemEvent", {
      panelItemName: this.model.id,
      panelItemEventName: q.CLICK,
      event: e
    });
  }
  /**
   * @description 处理点击事件
   * @param {MouseEvent} event
   * @return {*}  {void}
   * @memberof CommentItemRawItemEditorController
   */
  handleClick(e) {
    const { classList: t, dataset: s } = e.target;
    if (t && t.contains("comment-tag")) {
      const l = s.value || "", c = this.context.clone(), d = Q(this.params), o = JSON.parse(l);
      if (!o.owner_type)
        return;
      c.srfkey = o.id, o.owner_subtype === "page" ? d.article_page = o.owner_id : d[o.owner_subtype] = o.owner_id, d[o.owner_type] = o.recent_parent, delete o.script, delete o.icon, delete o.id, Object.assign(d, o), o && this.linkViewId && ibiz.commands.execute(
        B.TAG,
        this.linkViewId,
        c,
        d
      );
    }
  }
}
class A {
  constructor() {
    u(this, "formEditor", "CommentItemRawItem");
    u(this, "gridEditor", "CommentItemRawItem");
  }
  async createController(r, e) {
    const t = new Z(
      r,
      e
    );
    return await t.init(), t;
  }
}
const ee = X(
  v,
  function(n) {
    n.component(v.name, v), S(
      "RAW_COMMENT_ITEM",
      () => new A()
    ), S(
      "EDITOR_CUSTOMSTYLE_COMMENT_ITEM",
      () => new A()
    );
  }
), re = {
  // eslint-disable-next-line @typescript-eslint/explicit-module-boundary-types, @typescript-eslint/explicit-function-return-type
  install(n) {
    n.use(ee);
  }
};
export {
  ee as IBizCommentItemRawItem,
  re as default
};
