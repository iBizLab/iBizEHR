import './style.css';
var w = Object.defineProperty;
var q = (e, t, o) => t in e ? w(e, t, { enumerable: !0, configurable: !0, writable: !0, value: o }) : e[t] = o;
var p = (e, t, o) => (q(e, typeof t != "symbol" ? t + "" : t, o), o);
import { SearchBarController as g, registerControlProvider as z } from "@ibiz-template/runtime";
import { defineComponent as D, ref as m, onUnmounted as E, computed as R, createVNode as s, resolveComponent as a } from "vue";
import { useControlController as x, useNamespace as A, useLocalCacheKey as F } from "@ibiz-template/vue3-util";
import { showTitle as f } from "@ibiz-template/core";
class b extends g {
}
const C = /* @__PURE__ */ D({
  name: "IBizCardSearchbar",
  props: {
    /**
     * @description 搜索栏模型数据
     */
    modelData: {
      type: Object,
      required: !0
    },
    /**
     * @description 应用上下文对象
     */
    context: {
      type: Object,
      required: !0
    },
    /**
     * @description 视图参数对象
     * @default {}
     */
    params: {
      type: Object,
      default: () => ({})
    },
    /**
     * @description 部件适配器
     */
    provider: {
      type: Object
    }
  },
  setup() {
    var h;
    const e = x((...r) => new b(...r)), t = A("control-".concat(e.model.controlType.toLowerCase())), o = m({}), i = (r) => {
      o.value = r;
    };
    e.evt.on("onCreated", () => {
      e.counter && e.counter.onChange(i, !0);
    }), E(() => {
      var r;
      (r = e.counter) == null || r.offChange(i);
    }), e.setStorageKeyFn(F(e.context, "SEARCH_BAR_SELECTED_GROUP", e.view.modal.routeDepth, "@", "".concat(e.view.model.codeName, "@").concat(e.model.codeName)));
    let n = !1;
    const d = () => {
      n = !0, e.onSearch();
    }, S = () => {
      n === !0 && (n = !1, e.onSearch());
    }, v = (r) => {
      r.code === "Enter" && d();
    }, B = R(() => e.model.quickSearchWidth ? t.cssVarBlock({
      "quick-search-width": "".concat(e.model.quickSearchWidth, "px")
    }) : {}), k = (r) => {
      e.state.selectedGroupItem = r, e.evt.emit("onTabChange", {
        data: [r]
      }), d();
    };
    if (e.model.enableGroup && e.model.searchBarGroups && ((h = e.model.searchBarGroups) == null ? void 0 : h.length) > 0) {
      let r = e.model.searchBarGroups[0];
      if (e.params.srfsearchbargroupid) {
        const l = e.model.searchBarGroups.find((G) => G.id === e.params.srfsearchbargroupid);
        l && (r = l);
      }
      e.state.selectedGroupItem = r;
    }
    const u = m();
    let c;
    const y = async () => {
      c = ibiz.overlay.createPopover(() => s(a("iBizFilterTreeControl"), {
        filterControllers: e.filterControllers,
        filterNodes: e.state.filterNodes,
        parent: "search-bar",
        filterMode: e.state.filterMode,
        customCond: e.state.customCond,
        context: e.context,
        params: e.params,
        schemaEntityMap: e.schemaEntityMap,
        onCustomCondChange: (r) => {
          e.state.customCond = r;
        },
        onConfirm: (r, l) => {
          e.state.filterMode = r, e.state.customCond = l, e.onSearch(), c && c.dismiss();
        },
        onCancel: () => {
          e.resetFilter(), e.state.customCond = "";
        }
      }, null), void 0, {
        placement: "bottom-end",
        autoClose: !0
      }), c.present(u.value.$el), await c.onWillDismiss(), c = void 0;
    };
    return {
      c: e,
      ns: t,
      cssVars: B,
      filterButtonRef: u,
      counterData: o,
      onClear: S,
      onSearch: d,
      onKeydown: v,
      onGroupClick: k,
      triggerFilter: () => {
        c ? c.dismiss() : y();
      },
      handleSave: () => {
        e.handleSave();
      },
      renderAdvancedSearch: () => e.state.advancedQuickSearch ? s(a("iBizQuickSearchSelect"), {
        controller: e
      }, null) : null
    };
  },
  render() {
    return s(a("iBizControlBase"), {
      controller: this.c,
      class: [this.ns.b()],
      style: this.cssVars
    }, {
      default: () => [this.c.model.enableGroup && (this.c.isBackendSearchGroup ? s(a("iBizSearchGroups"), {
        controller: this.c,
        counterData: this.counterData
      }, null) : s(a("el-tabs"), {
        class: [this.ns.b("quick-group"), this.ns.is("card", !0)]
      }, {
        default: () => {
          var e;
          return [(e = this.c.model.searchBarGroups) == null ? void 0 : e.map((t) => this.c.calcCountVisible(t) ? s(a("el-tab-pane"), {
            class: this.ns.e("tab-item"),
            name: t.id
          }, {
            label: () => {
              var i;
              return s(a("el-card"), {
                onClick: () => this.onGroupClick(t),
                class: [this.ns.is("selected", ((i = this.c.state.selectedGroupItem) == null ? void 0 : i.id) === t.id)]
              }, {
                default: () => {
                  var n;
                  return [t.counterId && s(a("iBizBadge"), {
                    class: this.ns.e("counter"),
                    value: this.counterData[t.counterId],
                    counterMode: t.counterMode
                  }, null), s("span", {
                    class: [this.ns.b("quick-group-item"), this.ns.is("selected", ((n = this.c.state.selectedGroupItem) == null ? void 0 : n.id) === t.id)]
                  }, [t.caption])];
                }
              });
            }
          }) : null)];
        }
      })), this.c.model.enableGroup && this.c.isBackendSearchGroup && s(a("el-button"), {
        class: this.ns.b("save"),
        title: f(ibiz.i18n.t("control.searchBar.saveGroup")),
        onClick: this.handleSave
      }, {
        default: () => [s(a("ion-icon"), {
          name: "save-outline"
        }, null)]
      }), this.c.model.enableQuickSearch && s(a("el-input"), {
        modelValue: this.c.state.query,
        "onUpdate:modelValue": (e) => this.c.state.query = e,
        class: [this.ns.b("quick-search"), this.ns.is("advanced-quick-search", this.c.state.advancedQuickSearch)],
        placeholder: this.c.state.quickSearchPlaceHolder,
        clearable: !0,
        onKeydown: this.onKeydown,
        onClear: this.onClear,
        "suffix-icon": s(a("ion-icon"), {
          onClick: this.onSearch,
          class: this.ns.e("search-icon"),
          name: "search"
        }, null)
      }, {
        prepend: () => this.renderAdvancedSearch()
      }), this.c.enableFilter && s(a("el-button"), {
        ref: "filterButtonRef",
        type: "primary",
        title: f(ibiz.i18n.t("control.searchBar.filter")),
        class: this.ns.b("filter"),
        onClick: () => this.triggerFilter()
      }, {
        default: () => [s(a("iBizIcon"), {
          icon: {
            cssClass: "funnel-outline"
          }
        }, null)]
      })]
    });
  }
});
class M {
  constructor() {
    p(this, "component", "IBizCardSearchbar");
  }
  createController(t, o, i, n) {
    return new b(t, o, i, n);
  }
}
const j = {
  install(e) {
    e.component(C.name, C), z(
      "SEARCHBAR_RENDER_CARD",
      () => new M()
    );
  }
};
export {
  j as default
};
