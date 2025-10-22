import './style.css';
var v = Object.defineProperty;
var h = (t, o, e) => o in t ? v(t, o, { enumerable: !0, configurable: !0, writable: !0, value: e }) : t[o] = e;
var c = (t, o, e) => (h(t, typeof o != "symbol" ? o + "" : o, e), e);
import { CodeListEditorController as C, registerEditorProvider as L } from "@ibiz-template/runtime";
import { defineComponent as f, ref as S, watch as I, createVNode as d, resolveComponent as E } from "vue";
import { getSpanProps as g, useNamespace as P, useCodeListListen as w } from "@ibiz-template/vue3-util";
const y = /* @__PURE__ */ f({
  name: "StepCodeList",
  props: g(),
  setup(t, {
    emit: o
  }) {
    const e = P("step-codelist"), s = t.controller, l = s.codeList, {
      valueFormat: p,
      unitName: m
    } = s.parent, r = S([]);
    l && I(() => t.data, (i) => {
      s.loadCodeList(i).then((a) => {
        r.value = a;
      });
    }, {
      immediate: !0,
      deep: !0
    });
    const u = (i) => {
      i && (r.value = i);
    };
    return w(s.model.appCodeListId, s.context.srfappid, u), {
      ns: e,
      c: s,
      items: r,
      valueFormat: p,
      unitName: m,
      renderStep: () => {
        const i = r.value.findIndex((a) => a.value === t.value);
        return r.value.map((a, n) => d("div", {
          class: [e.e("code-step"), e.is("finished", i > n), e.is("actived", i === n), e.is("unactived", i < n)],
          title: a.text
        }, [d("div", {
          class: e.e("code-item")
        }, [i > n ? d(E("ion-icon"), {
          class: e.em("code-item", "finished"),
          name: "checkmark-outline"
        }, null) : d("div", {
          class: i === n ? e.em("code-item", "actived") : e.em("code-item", "unactived")
        }, [n]), n < r.value.length - 1 && d("div", {
          class: [e.em("code-item", "line"), e.is("actived", i > n)]
        }, null)]), i === n && d("div", {
          class: e.em("code-step", "text")
        }, [a.text])]));
      }
    };
  },
  render() {
    let t = null;
    return this.c.codeList ? t = d("div", {
      class: this.ns.e("content")
    }, [d("div", {
      class: this.ns.em("content", "step")
    }, [this.renderStep()])]) : t = this.value, d("span", {
      class: [this.ns.b()]
    }, [t]);
  }
});
class T extends C {
  constructor() {
    super(...arguments);
    /**
     *值项
     */
    c(this, "valueItem", "");
    /**
     * 无值隐藏单位
     *
     * @type {boolean}
     * @memberof SpanEditorController
     */
    c(this, "emptyHiddenUnit", !0);
    /**
     * 代码表模型
     * @return {*}
     * @author: zhujiamin
     * @Date: 2023-05-24 10:55:50
     */
    c(this, "codeList");
  }
  async onInit() {
    var e, s;
    if (super.onInit(), (s = (e = this.model) == null ? void 0 : e.editorItems) != null && s[0] && (this.valueItem = this.model.editorItems[0].id), this.model.appCodeListId) {
      const l = await ibiz.hub.getApp(this.context.srfappid);
      this.codeList = l.codeList.getCodeList(this.model.appCodeListId);
    }
    this.extraParams && (this.emptyHiddenUnit = this.extraParams.emptyHiddenUnit);
  }
}
class x {
  constructor() {
    c(this, "formEditor", "StepCodeList");
    c(this, "gridEditor", "StepCodeList");
  }
  async createController(o, e) {
    const s = new T(o, e);
    return await s.init(), s;
  }
}
const _ = {
  install(t) {
    t.component("StepCodeList", y), L(
      "EDITOR_CUSTOMSTYLE_STEP_CODELIST",
      () => new x()
    );
  }
};
export {
  _ as default
};
