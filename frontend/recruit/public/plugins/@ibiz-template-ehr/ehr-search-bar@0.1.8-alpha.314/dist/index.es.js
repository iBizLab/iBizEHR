import './style.css';
var w = Object.defineProperty;
var x = (d, t, e) => t in d ? w(d, t, { enumerable: !0, configurable: !0, writable: !0, value: e }) : d[t] = e;
var N = (d, t, e) => (x(d, typeof t != "symbol" ? t + "" : t, e), e);
import { ConfigService as L, ValueOP as u, ControlController as R, calcSearchConds as M, ScriptFactory as U, ItemsValueOPs as A, isSimpleItems as V, SearchBarFilterSimpleItemsController as G, SearchBarFilterController as j, SearchBarFilterItemsController as $, registerControlProvider as X } from "@ibiz-template/runtime";
import { defineComponent as _, ref as C, computed as I, createVNode as r, resolveComponent as n, createTextVNode as P, isVNode as z, h as D } from "vue";
import { useNamespace as k, useControlController as H } from "@ibiz-template/vue3-util";
import { isNil as q, isString as Q } from "lodash-es";
import { createUUID as K } from "qx-util";
import { clone as J } from "@ibiz-template/core";
class W {
  /**
   * Creates an instance of EhrSearchBarService.
   * @param {ISearchBar} model
   * @param {IContext} context
   * @memberof EhrSearchBarService
   */
  constructor(t, e) {
    /**
     * 应用配置服务
     *
     * @type {ConfigService}
     */
    N(this, "config");
    var a, l;
    this.model = t, this.context = e, this.config = new L(
      t.appId,
      "ehrsearchbar",
      "".concat(e.srfuserid, "_").concat(((a = this.model.appDataEntityId) == null ? void 0 : a.toLowerCase()) || "app", "_").concat((l = this.model.codeName) == null ? void 0 : l.toLowerCase())
    );
  }
  /**
   * @description 保存
   * @param {{ filters: IFilter[] }} data
   * @returns {*}  {Promise<void>}
   * @memberof EhrSearchBarService
   */
  async save(t) {
    await this.config.save(t);
  }
  /**
   * @description 加载
   * @returns {*}  {Promise<IData>}
   * @memberof EhrSearchBarService
   */
  async load() {
    return this.config.load();
  }
}
const Y = /\$\{[^}]*\}/, Z = [
  u.IS_NULL,
  u.IS_NOT_NULL,
  u.EXISTS,
  u.NOT_EXISTS
];
class ee extends R {
  constructor() {
    super(...arguments);
    /**
     * @description 搜索栏服务
     * @type {EhrSearchBarService}
     * @memberof EhrSearchBarController
     */
    N(this, "service");
    /**
     * @description 应用实体
     * @type {IAppDataEntity}
     * @memberof EhrSearchBarController
     */
    N(this, "appDataEntity");
    /**
     * @description 过滤项控制器集合
     * @type {SearchBarFilterController[]}
     * @memberof EhrSearchBarController
     */
    N(this, "filterControllers", []);
  }
  /**
   * @description 初始化state的属性
   * @protected
   * @memberof EhrSearchBarController
   */
  initState() {
    super.initState(), this.state.filters = [], this.state.filterNodes = [], this.state.filterGroups = [], this.state.activeFilter = "";
  }
  /**
   * @description 生命周期-创建完成
   * @protected
   * @returns {*}  {Promise<void>}
   * @memberof EhrSearchBarController
   */
  async onCreated() {
    await super.onCreated(), this.appDataEntity = await ibiz.hub.getAppDataEntity(
      this.model.appDataEntityId,
      this.context.srfappid
    ), this.service = new W(this.model, this.context), await this.initSearchBarFilters();
    const { filters: e } = await this.service.load();
    this.state.filters = e || [], this.initFilterNodes(), this.initFilterGroup();
  }
  /**
   * @description 获取过滤参数
   * @returns {*}  {IParams}
   * @memberof EhrSearchBarController
   */
  getFilterParams() {
    const e = {}, a = J(this.state.filterNodes);
    a[0].children = a[0].children.filter((s) => s.nodeType === "FIELD" ? !(!s.field || !s.valueOP || !Z.includes(s.valueOP) && q(s.value)) : !0);
    const l = M(a, {
      after: (s, c) => {
        s.nodeType === "FIELD" && Q(s.value) && Y.test(s.value) && (c.value = U.execSingleLine(
          "`".concat(s.value, "`"),
          {
            ...this.getEventArgs()
          }
        ));
      }
    });
    return l && Object.assign(e, { searchconds: l }), e;
  }
  /**
   * @description 根据节点数据查找过滤项控制器
   * @param {(IFilterNodeField | IFilterNodeItems)} node
   * @returns {*}  {(SearchBarFilterController | undefined)}
   * @memberof EhrSearchBarController
   */
  findFilterControllerByNode(e) {
    return this.filterControllers.find((a) => a.type === "SIMPLE_ITEMS" ? !1 : a.fieldName === e.field ? a.valueOP ? a.valueOP === e.valueOP : !0 : !1);
  }
  /**
   * @description 初始化过滤项控制器
   * @protected
   * @returns {*}  {Promise<void>}
   * @memberof EhrSearchBarController
   */
  async initSearchBarFilters() {
    const { searchBarFilters: e } = this.model;
    if (!e || !e.length)
      return;
    const a = /* @__PURE__ */ new Map();
    e.forEach((l) => {
      var c;
      if ((c = l.defsearchMode) != null && c.valueOP && A.includes(l.defsearchMode.valueOP)) {
        if (V(l)) {
          this.filterControllers.push(
            new G(
              l,
              this.appDataEntity,
              this.context,
              this.params
            )
          );
          return;
        }
        const m = "".concat(l.appDEFieldId, "_").concat(l.defsearchMode.valueOP);
        a.has(m) || a.set(m, []), a.get(m).push(l);
        return;
      }
      const s = new j(
        l,
        this.appDataEntity,
        this.context,
        this.params
      );
      this.filterControllers.push(s);
    }), a.size > 0 && a.forEach((l) => {
      const s = new $(
        l,
        this.appDataEntity,
        this.context,
        this.params
      );
      this.filterControllers.push(s);
    }), await Promise.all(
      this.filterControllers.map((l) => l.init())
    );
  }
  /**
   * @description 初始化过滤节点分组数据
   * @protected
   * @memberof EhrSearchBarController
   */
  initFilterNodes() {
    const { groupMode: e } = this.model, a = this.filterControllers.filter((l) => {
      var s;
      return ((s = l.model.userParam) == null ? void 0 : s.defaultShow) === "true";
    }).map((l) => ({
      nodeType: "FIELD",
      field: l.key,
      valueOP: l.valueOP,
      value: null
    })) || [];
    this.state.filterNodes = [
      {
        children: a,
        nodeType: "GROUP",
        logicType: e === "OR" ? "OR" : "AND"
      }
    ];
  }
  /**
   * @description 初始化过滤分组数据
   * @protected
   * @memberof EhrSearchBarController
   */
  initFilterGroup() {
    const e = this.filterControllers.map((h) => {
      var v;
      return {
        key: h.key,
        caption: h.label,
        selected: ((v = h.model.userParam) == null ? void 0 : v.defaultShow) === "true"
      };
    }), { searchBarGroups: a } = this.model, l = (a == null ? void 0 : a.map((h) => {
      var O, y;
      let v = [];
      if (h.data)
        try {
          const S = JSON.parse(h.data);
          S.theme_model.searchconds && (v = ((y = (O = S.theme_model.searchconds[0]) == null ? void 0 : O.searchconds) == null ? void 0 : y.map(
            (F) => F.fieldname
          )) || []);
        } catch (S) {
          ibiz.log.error(
            ibiz.i18n.t("runtime.controller.control.searchBar.JSONFormat", {
              data: h.data
            }),
            S
          );
        }
      return {
        keys: v,
        groupName: h.caption
      };
    })) || [], c = [...e.reduce((h, v) => {
      var S;
      const O = ((S = l.find((F) => F.keys.includes(v.key))) == null ? void 0 : S.groupName) || "未分类", y = h.get(O) || [];
      return h.set(O, [...y, v]);
    }, /* @__PURE__ */ new Map()).entries()].map(([h, v]) => ({
      caption: h,
      children: v
    })), m = c.findIndex((h) => h.caption === "未分类");
    if (m !== -1) {
      const h = c.splice(m, 1)[0];
      c.push(h);
    }
    this.state.filterGroups = c;
  }
  /**
   * @description 处理过滤改变
   * @param {string} key
   * @memberof EhrSearchBarController
   */
  handleFilterChange(e) {
    this.state.activeFilter = e;
    const a = this.state.filters.find((l) => l.key === e);
    if (a) {
      const { groupMode: l } = this.model, s = a.filterNodeFields.filter(
        (c) => !!this.findFilterControllerByNode(c)
      );
      this.state.filterNodes = [
        {
          children: s,
          nodeType: "GROUP",
          logicType: l === "OR" ? "OR" : "AND"
        }
      ];
    } else
      this.initFilterNodes();
    this.onSearch();
  }
  /**
   * @description 处理过滤项改变
   * @param {string} key 过滤项标识
   * @param {boolean} state
   * @memberof EhrSearchBarController
   */
  handleFilterItemChange(e, a) {
    const l = this.filterControllers.find((c) => c.key === e);
    if (!l)
      return;
    for (const c of this.state.filterGroups) {
      const m = c.children.find((h) => h.key === e);
      if (m) {
        m.selected = a;
        break;
      }
    }
    const s = this.state.filterNodes[0].children;
    a ? s.push({
      nodeType: "FIELD",
      field: l.key,
      valueOP: l.valueOP,
      value: null
    }) : (this.state.filterNodes[0].children = s.filter(
      (c) => c.field !== e
    ), this.onSearch());
  }
  /**
   * @description 搜索
   * @memberof EhrSearchBarController
   */
  onSearch() {
    this.evt.emit("onSearch", void 0);
  }
  /**
   * @description 重置
   * @memberof EhrSearchBarController
   */
  onReset() {
    this.handleFilterChange(this.state.activeFilter), this.onSearch();
  }
  /**
   * @description 保存过滤条件
   * @param {string} caption
   * @returns {*}  {Promise<void>}
   * @memberof EhrSearchBarController
   */
  async onSaveFilter(e) {
    const a = K(), l = {
      key: a,
      caption: e,
      filterNodeFields: this.state.filterNodes[0].children
    };
    this.state.filters.push(l), await this.service.save({ filters: this.state.filters }), this.state.activeFilter = a;
  }
  /**
   * @description 删除过滤条件
   * @param {string} key
   * @returns {*}  {Promise<void>}
   * @memberof EhrSearchBarController
   */
  async onRemoveFilter(e) {
    const a = this.state.filters.findIndex((l) => l.key === e);
    a !== -1 && (this.state.filters.splice(a, 1), await this.service.save({ filters: this.state.filters }), this.state.activeFilter === e && (this.state.activeFilter = "", this.initFilterNodes()));
  }
}
function g(d) {
  return typeof d == "function" || Object.prototype.toString.call(d) === "[object Object]" && !z(d);
}
const te = [{
  valueOP: u.EQ,
  label: "等于(=)"
}, {
  valueOP: u.NOT_EQ,
  label: "不等于(<>)"
}, {
  valueOP: u.GT,
  label: "大于(>)"
}, {
  valueOP: u.GT_AND_EQ,
  label: "大于等于(>=)"
}, {
  valueOP: u.LT,
  label: "小于(<)"
}, {
  valueOP: u.LT_AND_EQ,
  label: "小于等于(<=)"
}, {
  valueOP: u.IS_NULL,
  label: "值为空(Nil)"
}, {
  valueOP: u.IS_NOT_NULL,
  label: "值不为空(NotNil)"
}, {
  valueOP: u.IN,
  label: "值在范围中(In)"
}, {
  valueOP: u.NOT_IN,
  label: "值不在范围中(NotIn)"
}, {
  valueOP: u.LIKE,
  label: "文本包含(%)"
}, {
  valueOP: u.LIFT_LIKE,
  label: "文本左包含(%#)"
}, {
  valueOP: u.RIGHT_LIKE,
  label: "文本右包含(#%)"
}, {
  valueOP: u.EXISTS,
  label: "存在(EXISTS)"
}, {
  valueOP: u.NOT_EXISTS,
  label: "不存在(NOTEXISTS)"
}], le = [u.IS_NULL, u.IS_NOT_NULL, u.EXISTS, u.NOT_EXISTS], T = /* @__PURE__ */ _({
  name: "SearchBar",
  props: {
    controller: {
      type: Object,
      required: !0
    },
    modal: {
      type: Object
    }
  },
  setup(d) {
    const t = k("search-bar"), e = d.controller, a = C(""), l = C([]), s = C(""), c = C(!1), m = I(() => {
      var o;
      return ((o = e.state.filterNodes[0]) == null ? void 0 : o.children) || [];
    }), h = I(() => {
      var o;
      return (((o = e.state.filterNodes[0]) == null ? void 0 : o.children) || []).length;
    }), v = (o, i) => {
      o.valueOP = i, o.value = null;
    }, O = () => {
      a.value = "", l.value = [...Array(e.state.filterGroups.length).keys()];
    }, y = async (o = !1) => {
      o && await e.onSaveFilter(s.value), c.value = !1, s.value = "";
    }, S = (o, i) => {
      if (!i.editor || !i.editorProvider || o.valueOP && le.includes(o.valueOP))
        return null;
      const {
        data: f,
        value: b
      } = i.calcEditorProps(o);
      return r("div", {
        class: t.em("filter-node", "editor")
      }, [D(n(i.editorProvider.formEditor), {
        data: f,
        value: b,
        disabled: o.disabled,
        controller: i.editor,
        key: i.editor.model.id,
        onChange: (p, E) => {
          i.onEditorChange(o, p, E), e.onSearch();
        }
      })]);
    };
    return {
      c: e,
      ns: t,
      renderTop: () => {
        if (d.modal)
          return r("div", {
            class: t.e("top")
          }, [r("div", {
            class: t.em("top", "title")
          }, [r(n("ion-icon"), {
            name: "filter-circle"
          }, null), e.model.logicName, r("sup", {
            class: t.em("top", "counter")
          }, [h.value])]), r(n("ion-icon"), {
            title: "关闭",
            name: "close-outline",
            class: t.em("top", "close"),
            onClick: (o) => d.modal.dismiss()
          }, null)]);
      },
      renderHeader: () => {
        let o;
        return r("div", {
          class: t.e("header")
        }, [r("div", {
          class: t.em("header", "title")
        }, [P("筛选条件")]), r(n("el-select"), {
          clearable: !0,
          placeholder: e.state.filters.length === 0 ? "暂无已保存的筛选条件" : "选择已保存的筛选条件",
          class: t.em("header", "select"),
          popperClass: t.e("filter-select"),
          "model-value": e.state.activeFilter,
          disabled: e.state.filters.length === 0,
          onChange: (i) => e.handleFilterChange(i)
        }, g(o = e.state.filters.map((i) => r(n("el-option"), {
          key: i.key,
          value: i.key,
          label: i.caption,
          class: t.em("filter-select", "item")
        }, {
          default: () => [r("div", null, [i.caption]), r(n("ion-icon"), {
            title: "删除",
            name: "close-outline",
            class: t.em("filter-select", "remove"),
            onClick: (f) => {
              f.stopPropagation(), e.onRemoveFilter(i.key);
            }
          }, null)]
        }))) ? o : {
          default: () => [o]
        }), r("div", {
          class: t.em("header", "actions")
        }, [r(n("el-popover"), {
          trigger: "click",
          placement: "bottom",
          class: t.e("popover"),
          visible: c.value,
          "onUpdate:visible": (i) => c.value = i
        }, {
          reference: () => r(n("el-button"), {
            type: "text"
          }, {
            default: () => [P("保存")]
          }),
          default: () => r("div", {
            class: t.em("popover", "content")
          }, [r(n("el-input"), {
            placeholder: "筛选条件名称",
            modelValue: s.value,
            "onUpdate:modelValue": (i) => s.value = i,
            class: t.em("popover", "filter-name")
          }, null), r("div", {
            class: t.em("popover", "actions")
          }, [r(n("el-button"), {
            type: "text",
            disabled: !s.value,
            onClick: () => y(!0)
          }, {
            default: () => [P("确认")]
          }), r(n("el-button"), {
            type: "text",
            onClick: () => y()
          }, {
            default: () => [P("取消")]
          })])])
        }), r(n("el-button"), {
          type: "text",
          onClick: () => e.onReset()
        }, {
          default: () => [P("还原")]
        })])]);
      },
      renderContent: () => r("div", {
        class: t.e("content")
      }, [m.value.map((o) => {
        let i;
        if (o.nodeType !== "FIELD")
          return;
        const f = e.findFilterControllerByNode(o);
        if (!f)
          return;
        const b = te.filter((p) => f.valueOP ? p.valueOP === f.valueOP : !0);
        return r("div", {
          class: t.e("filter-node")
        }, [r("div", {
          class: t.em("filter-node", "header")
        }, [r("div", {
          class: t.em("filter-node", "label")
        }, [f.label]), r(n("ion-icon"), {
          title: "删除",
          name: "close-outline",
          class: t.em("filter-node", "remove"),
          onClick: () => e.handleFilterItemChange(f.key, !1)
        }, null)]), r(n("el-select"), {
          disabled: o.disabled || f.valueOP,
          "model-value": o.valueOP,
          class: t.em("filter-node", "op-select"),
          onChange: (p) => v(o, p)
        }, g(i = b.map((p) => r(n("el-option"), {
          label: p.label,
          key: p.valueOP,
          value: p.valueOP
        }, null))) ? i : {
          default: () => [i]
        }), S(o, f)]);
      })]),
      renderFooter: () => r("div", {
        class: t.e("footer")
      }, [r(n("el-popover"), {
        width: 200,
        placement: "top",
        trigger: "click",
        class: t.e("popover"),
        popperStyle: {
          height: "360px"
        },
        onShow: () => O()
      }, {
        reference: () => r(n("el-button"), {
          type: "text"
        }, {
          default: () => [r(n("ion-icon"), {
            name: "add-outline"
          }, null), P("添加筛选项")]
        }),
        default: () => {
          let o;
          return r("div", {
            class: t.em("popover", "content")
          }, [r(n("el-input"), {
            placeholder: "搜索",
            modelValue: a.value,
            "onUpdate:modelValue": (i) => a.value = i,
            class: t.em("popover", "search")
          }, {
            suffix: () => r(n("ion-icon"), {
              name: "search-outline"
            }, null)
          }), r(n("el-collapse"), {
            modelValue: l.value,
            "onUpdate:modelValue": (i) => l.value = i,
            class: t.em("popover", "collapse")
          }, g(o = e.state.filterGroups.map((i, f) => {
            let b;
            return r(n("el-collapse-item"), {
              name: f,
              title: i.caption
            }, g(b = i.children.map((p) => {
              if (!(a.value && !p.caption.includes(a.value)))
                return r(n("el-checkbox"), {
                  class: t.em("popover", "filter"),
                  label: p.caption,
                  "model-value": p.selected,
                  onChange: (E) => e.handleFilterItemChange(p.key, E)
                }, null);
            })) ? b : {
              default: () => [b]
            });
          })) ? o : {
            default: () => [o]
          })]);
        }
      })])
    };
  },
  render() {
    return r("div", {
      class: this.ns.b()
    }, [this.renderTop(), this.renderHeader(), this.renderContent(), this.renderFooter()]);
  }
});
const B = /* @__PURE__ */ _({
  name: "IBizEhrSearchBarControl",
  props: {
    modelData: {
      type: Object,
      required: !0
    },
    context: {
      type: Object,
      required: !0
    },
    params: {
      type: Object,
      default: () => ({})
    },
    provider: {
      type: Object
    }
  },
  setup() {
    const d = H((...l) => new ee(...l)), t = k("ehr-search-bar"), e = C();
    return {
      c: d,
      ns: t,
      buttonRef: e,
      openSearchModal: async (l) => {
        const s = ibiz.overlay.createPopover((c) => D(T, {
          controller: d,
          modal: c
        }), {}, {
          height: "80%",
          noArrow: !0,
          autoClose: !0,
          placement: "top",
          width: "".concat(e.value.ref.offsetWidth, "px")
        });
        s.present(l.target), await s.onWillDismiss();
      }
    };
  },
  render() {
    return r("div", {
      class: this.ns.b()
    }, [this.c.model.searchBarStyle === "SEARCHBAR2" ? r(n("el-button"), {
      type: "text",
      ref: "buttonRef",
      class: this.ns.e("button"),
      onClick: this.openSearchModal
    }, {
      default: () => [r("div", {
        class: this.ns.em("button", "left")
      }, [r(n("ion-icon"), {
        name: "filter-circle"
      }, null), this.c.model.logicName]), r(n("ion-icon"), {
        name: "caret-up",
        class: this.ns.em("button", "right")
      }, null)]
    }) : r(T, {
      controller: this.c
    }, null)]);
  }
});
class re {
  constructor() {
    N(this, "component", "IBizEhrSearchBarControl");
  }
}
const fe = {
  // eslint-disable-next-line @typescript-eslint/explicit-module-boundary-types, @typescript-eslint/explicit-function-return-type
  install(d) {
    d.component(B.name, B), X(
      "CUSTOM_FILTER_SEARCHBAR",
      () => new re()
    );
  }
};
export {
  fe as default
};
