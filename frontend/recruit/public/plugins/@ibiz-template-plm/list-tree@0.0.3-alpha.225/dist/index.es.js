import './style.css';
var se = Object.defineProperty;
var ie = (t, c, d) => c in t ? se(t, c, { enumerable: !0, configurable: !0, writable: !0, value: d }) : t[c] = d;
var z = (t, c, d) => (ie(t, typeof c != "symbol" ? c + "" : c, d), d);
import { TreeController as le, getControlPanel as re, registerControlProvider as ae } from "@ibiz-template/runtime";
import { useControlController as ce, useNamespace as de, withInstall as ue } from "@ibiz-template/vue3-util";
import { defineComponent as fe, ref as _, reactive as pe, watch as U, computed as he, nextTick as ge, resolveComponent as I, onMounted as me, onUnmounted as Ie, withDirectives as xe, createVNode as p, resolveDirective as be, isVNode as Ne, createTextVNode as ye } from "vue";
import { createUUID as O } from "qx-util";
import { debounce as P } from "lodash-es";
import { RuntimeError as S } from "@ibiz-template/core";
import { clone as _e, isNil as ve } from "ramda";
class Ce extends le {
  /**
   * 树节点点击事件
   *
   * @param {ITreeNodeData} nodeData
   * @returns {*}  {Promise<void>}
   * @memberof ListTreeController
   */
  async onTreeNodeClick(c, d) {
    var x;
    const s = this.getNodeData(c._id);
    if (!s)
      return;
    this.setNavData(s);
    const u = (x = this.contextMenuInfos[s._nodeId]) == null ? void 0 : x.clickTBUIActionItem;
    if (u)
      return this.doUIAction(
        u.uiactionId,
        s,
        d,
        u.appId
      );
    if (this.state.navigational) {
      const r = this.getNodeModel(s._nodeId);
      if (!(r != null && r.navAppViewId))
        return;
    }
    if (this.state.singleSelect && !s._disableSelect) {
      const { selectedData: r } = this.state, g = r.filter((a) => a._id !== s._id);
      g.length === r.length ? this.setSelection(
        this.state.singleSelect ? [s] : r.concat([s])
      ) : this.setSelection(g);
    }
    this.state.mdctrlActiveMode === 1 && await this.setActive(s);
  }
}
function b(t, c) {
  const d = c.state.items.find((s) => s._id === t);
  return d || c.state.items.find((s) => s._uuid === t);
}
function Te(t, c) {
  const d = () => {
    const r = t.value;
    if (!r)
      throw new S("找不到el-tree实例对象");
    return r;
  }, s = () => {
    var g;
    const r = t.value;
    if (!r) {
      setTimeout(() => {
        s();
      }, 200);
      return;
    }
    Object.values(r.store.nodesMap).forEach((a) => {
      const f = c.state.expandedKeys.includes(a.data._id);
      f !== a.expanded && (f ? a.expand() : a.collapse());
    }), c.state.singleSelect ? t.value.setCurrentKey(((g = c.state.selectedData[0]) == null ? void 0 : g._id) || void 0) : r.setCheckedKeys(c.state.selectedData.map((a) => a._id));
  }, u = P(s, 500);
  return { getTreeInstance: d, updateUI: u, triggerNodeExpand: (r) => {
    const a = d().store.nodesMap[r];
    if (a)
      return a.expanded ? (a.collapse(), !1) : (a.expand(), !0);
  } };
}
function we(t) {
  switch (t) {
    case "inner":
      return "inner";
    case "before":
      return "prev";
    case "after":
      return "next";
    default:
      throw new S("暂不支持dropType:".concat(t));
  }
}
function ke(t) {
  return typeof t == "function" || Object.prototype.toString.call(t) === "[object Object]" && !Ne(t);
}
const D = /* @__PURE__ */ fe({
  name: "IBizListTreeControl",
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
    },
    /**
     * 部件行数据默认激活模式
     * - 0 不激活
     * - 1 单击激活
     * - 2 双击激活(默认值)
     *
     * @type {(number | 0 | 1 | 2)}
     */
    mdctrlActiveMode: {
      type: Number,
      default: void 0
    },
    /**
     * 是否为单选
     * - true 单选
     * - false 多选
     *
     * @type {(Boolean)}
     */
    singleSelect: {
      type: Boolean,
      default: void 0
    },
    navigational: {
      type: Boolean,
      default: void 0
    },
    defaultExpandedKeys: {
      type: Array
    },
    loadDefault: {
      type: Boolean,
      default: !0
    }
  },
  setup() {
    const t = ce((...e) => new Ce(...e)), c = _(!1), d = pe({});
    t.evt.on("onCreated", () => {
      t.counter && t.counter.onChange((e) => {
        Object.assign(d, e);
      }, !0), t.controlParams.cascadeselect && (c.value = !0);
    });
    const s = de("control-".concat(t.model.controlType.toLowerCase())), u = _(null), x = _(null), r = _(""), g = _(null), a = _(null), f = _(null);
    U(() => g.value, (e) => {
      e && e.$el.getElementsByTagName("input")[0].focus();
    });
    const T = (e) => {
      var i;
      if (e._disableSelect)
        return !1;
      const n = t.getNodeModel(e._nodeId), o = (i = t.contextMenuInfos[e._nodeId]) == null ? void 0 : i.clickTBUIActionItem;
      return !!(n != null && n.navAppViewId || o || e != null && e._children);
    }, B = () => {
      var i;
      const e = (i = u.value) == null ? void 0 : i.getCurrentKey();
      if (!e || e === a.value)
        return;
      const n = b(e, t), o = t.getNodeModel(n._nodeId);
      o != null && o.allowEditText && (a.value = e);
    }, j = async () => {
      if (a.value)
        if (f.value) {
          const e = b(a.value, t);
          await t.modifyNodeText(e, f.value), a.value = null, f.value = null;
        } else
          a.value = null;
    }, {
      updateUI: A,
      triggerNodeExpand: V
    } = Te(u, t), M = (e) => e.map((n) => ({
      _id: n._id,
      _uuid: n._uuid,
      _leaf: n._leaf,
      _text: n._text,
      _disableSelect: n._disableSelect
    }));
    t.evt.on("onAfterRefreshParent", (e) => {
      if (u.value) {
        const {
          parentNode: n,
          children: o
        } = e, i = M(o);
        u.value.updateKeyChildren(n._id, i), A();
      }
    }), t.evt.on("onAfterNodeDrop", (e) => {
      e.isChangedParent && (r.value = O());
    });
    const w = he(() => t.state.isLoaded ? t.model.rootVisible ? t.state.rootNodes : t.state.rootNodes.reduce((e, n) => n._children ? e.concat(n._children) : e, []) : []);
    U(w, (e, n) => {
      e !== n && (r.value = O());
    });
    const q = async (e, n) => {
      let o;
      if (e.level === 0)
        o = w.value, ibiz.log.debug("初始加载");
      else {
        const i = b(e.data._uuid, t);
        i._children ? (ibiz.log.debug("节点展开加载-本地", i), o = i._children) : (ibiz.log.debug("节点展开加载-远程", i), o = await t.loadNodes(i));
      }
      ibiz.log.debug("给树返回值", o), n(M(o)), A();
    };
    let k = !1;
    t.evt.on("onLoadSuccess", () => {
      k = !0, setTimeout(() => {
        k = !1;
      }, 200);
    }), t.evt.on("onSelectionChange", async () => {
      var e;
      k && await ge(), t.state.singleSelect ? u.value.setCurrentKey(((e = t.state.selectedData[0]) == null ? void 0 : e._id) || void 0) : u.value.setCheckedKeys(t.state.selectedData.map((n) => n._id));
    });
    const $ = (e, n) => {
      const {
        checkedNodes: o
      } = n;
      t.setSelection(o);
    };
    let E = !1;
    const H = (e, n) => {
      var o, i;
      if (n.stopPropagation(), !(E || !T(e))) {
        if (((o = u.value) == null ? void 0 : o.getCurrentKey()) === e._id && B(), t.state.singleSelect || (i = u.value) == null || i.setCurrentKey(e._id), t.state.navigational) {
          const h = t.getNodeModel(e._nodeId);
          if (!(h != null && h.navAppViewId)) {
            const l = V(e._id);
            t.onExpandChange(e, l);
          }
        }
        t.onTreeNodeClick(e, n), E = !0, setTimeout(() => {
          E = !1;
        }, 200);
      }
    }, W = (e, n) => {
      n.stopPropagation(), T(e) && t.onDbTreeNodeClick(e);
    };
    let v;
    t.evt.on("onMounted", () => {
      Object.values(t.contextMenus).length > 0 && (() => import("@imengyu/vue3-context-menu"))().then((n) => {
        v = n.default, v.default && !v.showContextMenu && (v = v.default);
      });
    });
    const L = (e, n) => {
      const o = [];
      return e == null || e.forEach((i) => {
        (n === "nodeItem" && i.actionLevel === 250 || n === "popper" && i.actionLevel < 200) && o.push(i);
      }), o;
    }, F = I("IBizRawItem"), Q = I("IBizIcon"), K = (e, n, o, i) => {
      const h = [];
      return e.forEach((l) => {
        var C;
        if (l.itemType === "SEPERATOR") {
          h.push({
            divided: "self"
          });
          return;
        }
        const N = i[l.id];
        if (N && !N.visible)
          return;
        const m = {};
        if (l.showCaption && l.caption && (m.label = l.caption), l.sysImage && l.showIcon && (m.icon = p(Q, {
          icon: l.sysImage
        }, null)), l.itemType === "DEUIACTION") {
          m.disabled = N.disabled, m.clickClose = !0;
          const {
            uiactionId: y
          } = l;
          y && (m.onClick = () => {
            t.doUIAction(y, n, o, l.appId);
          });
        } else if (l.itemType === "RAWITEM") {
          const {
            rawItem: y
          } = l;
          y && (m.label = p(F, {
            rawItem: l
          }, null));
        } else
          l.itemType === "ITEMS" && (C = l.detoolbarItems) != null && C.length && (m.children = K(l.detoolbarItems, n, o, i));
        h.push(m);
      }), h;
    }, G = async (e, n) => {
      n.preventDefault(), n.stopPropagation();
      const o = t.getNodeModel(e._nodeId);
      if (!(o != null && o.decontextMenu))
        return;
      const i = t.contextMenus[o.decontextMenu.id];
      if (!i.model.detoolbarItems)
        return;
      await i.calcButtonState(e._deData || (e.srfkey ? e : void 0), o.appDataEntityId);
      const h = i.state.buttonsState, l = L(i.model.detoolbarItems, "popper"), N = K(l, e, n, h);
      N.length && v.showContextMenu({
        x: n.x,
        y: n.y,
        customClass: s.b("context-menu"),
        items: N
      });
    }, J = (e, n) => {
      var N, m, C;
      if (!((m = (N = e == null ? void 0 : e.decontextMenu) == null ? void 0 : N.detoolbarItems) != null && m.length))
        return;
      const o = t.contextMenuInfos[e.id];
      if (o.clickTBUIActionItem && o.onlyOneActionItem)
        return null;
      const h = {
        detoolbarItems: L((C = e == null ? void 0 : e.decontextMenu) == null ? void 0 : C.detoolbarItems, "nodeItem")
      }, l = _e(e);
      return Object.assign(l.decontextMenu, h), p(I("iBizContextMenuControl"), {
        modelData: h,
        groupLevelKeys: [50, 100],
        nodeModel: l,
        nodeData: n,
        context: t.context,
        onActionClick: (y, oe) => t.doUIAction(y.uiactionId, n, oe, y.appId)
      }, null);
    }, X = (e, n) => {
      const o = b(e._uuid, t);
      if (!o)
        throw new S("没有找到_uuid为".concat(e._uuid, "的节点"));
      t.onExpandChange(o, n);
    }, Y = P(() => {
      t.load();
    }, 500), Z = (e) => {
      t.state.query = e, Y();
    }, ee = (e, n, o) => {
      const i = b(e.data._uuid, t), h = b(n.data._uuid, t);
      return t.calcAllowDrop(i, h, o);
    }, te = (e) => {
      const n = b(e.data._uuid, t);
      return t.calcAllowDrag(n);
    }, ne = (e, n, o) => {
      const i = we(o), h = b(e.data._uuid, t), l = b(n.data._uuid, t);
      t.onNodeDrop(h, l, i);
    }, R = (e) => {
      (e.code === "F2" || e.code === "Enter") && B();
    };
    return me(() => {
      var e;
      (e = x.value) == null || e.$el.addEventListener("keydown", R);
    }), Ie(() => {
      var e;
      (e = x.value) == null || e.$el.removeEventListener("keydown", R);
    }), {
      c: t,
      ns: s,
      treeRef: u,
      treeviewRef: x,
      treeNodeTextInputRef: g,
      treeData: w,
      treeRefreshKey: r,
      editingNodeKey: a,
      editingNodeText: f,
      cascadeSelect: c,
      findNodeData: b,
      onCheck: $,
      onNodeClick: H,
      onNodeDbClick: W,
      onNodeContextmenu: G,
      loadData: q,
      renderContextMenu: J,
      renderCounter: (e) => {
        if (e.counterId) {
          const n = d[e.counterId];
          return ve(n) || e.counterMode === 1 && n === 0 ? null : p("div", {
            class: s.b("counter")
          }, [p("span", {
            class: s.be("counter", "dot")
          }, [ye("·")]), p(I("iBizBadge"), {
            value: n
          }, null)]);
        }
      },
      updateNodeExpand: X,
      onInput: Z,
      allowDrop: ee,
      allowDrag: te,
      handleDrop: ne,
      onNodeTextEditBlur: j,
      calcNodeAbility: T
    };
  },
  render() {
    const t = {
      searchbar: () => this.c.enableQuickSearch ? p(I("el-input"), {
        "model-value": this.c.state.query,
        class: [this.ns.b("quick-search"), this.ns.b("quick-search")],
        placeholder: this.c.state.placeHolder,
        onInput: this.onInput
      }, {
        prefix: () => p(I("ion-icon"), {
          class: this.ns.e("search-icon"),
          name: "search"
        }, null)
      }) : null
    }, c = this.c.controlPanel ? "tree" : "default";
    return t[c] = () => {
      if (this.c.state.isLoaded && this.treeRefreshKey)
        return p(I("el-tree"), {
          ref: "treeRef",
          class: [this.ns.b("tree"), this.ns.is("list", !0)],
          key: this.treeRefreshKey,
          "node-key": "_id",
          "highlight-current": !0,
          "expand-on-click-node": !1,
          "auto-expand-parent": !1,
          "show-checkbox": !this.c.state.singleSelect,
          "check-strictly": !this.cascadeSelect,
          "default-expanded-keys": this.c.state.expandedKeys,
          props: {
            label: "_text",
            children: "_children",
            isLeaf: "_leaf",
            disabled: "_disableSelect"
          },
          lazy: !0,
          load: this.loadData,
          onCheck: this.onCheck,
          onNodeExpand: (d) => {
            this.updateNodeExpand(d, !0);
          },
          onNodeCollapse: (d) => {
            this.updateNodeExpand(d, !1);
          },
          draggable: !0,
          "allow-drop": this.allowDrop,
          "allow-drag": this.allowDrag,
          onNodeDrop: this.handleDrop
        }, {
          default: ({
            data: d
          }) => {
            var g, a;
            const s = this.findNodeData(d._uuid, this.c);
            if (!s)
              return null;
            const u = this.c.getNodeModel(s._nodeId);
            if (this.editingNodeKey === s._id)
              return p("div", {
                class: [this.ns.b("node"), (g = u.sysCss) == null ? void 0 : g.cssName]
              }, [p(I("el-input"), {
                modelValue: this.editingNodeText,
                "onUpdate:modelValue": (f) => this.editingNodeText = f,
                ref: "treeNodeTextInputRef",
                class: this.ns.b("editing-node"),
                onBlur: () => {
                  this.onNodeTextEditBlur();
                },
                onKeydown: (f) => {
                  f.stopPropagation(), f.code === "Enter" && this.onNodeTextEditBlur();
                }
              }, null)]);
            const x = re(u);
            let r;
            return x ? r = p(I("iBizControlShell"), {
              data: s,
              modelData: x,
              context: this.c.context,
              params: this.c.params
            }, null) : r = [s._icon ? p(I("iBizIcon"), {
              class: this.ns.be("node", "icon"),
              icon: s._icon
            }, null) : null, s._textHtml ? p("span", {
              class: this.ns.be("node", "label"),
              innerHTML: s._textHtml
            }, null) : p("span", {
              class: this.ns.be("node", "label")
            }, [s._text])], p("div", {
              onDblclick: (f) => this.onNodeDbClick(s, f),
              onClick: (f) => this.onNodeClick(s, f),
              onContextmenu: (f) => this.onNodeContextmenu(s, f),
              class: [this.ns.b("node"), this.calcNodeAbility(s) ? "" : this.ns.bm("node", "disabled"), s._leaf ? this.ns.be("node", "item") : this.ns.be("node", "group"), (a = u.sysCss) == null ? void 0 : a.cssName]
            }, [r, this.renderCounter(u), this.renderContextMenu(u, s)]);
          }
        });
    }, xe(p(I("iBizControlBase"), {
      ref: "treeviewRef",
      controller: this.c
    }, ke(t) ? t : {
      default: () => [t]
    }), [[be("loading"), this.c.state.isLoading]]);
  }
});
class Ee {
  constructor() {
    z(this, "component", "IBizListTreeControl");
  }
}
const De = ue(
  D,
  function(t) {
    t.component(D.name, D), ae(
      "TREE_RENDER_LIST_TREE",
      () => new Ee()
    );
  }
), Oe = {
  // eslint-disable-next-line @typescript-eslint/explicit-module-boundary-types, @typescript-eslint/explicit-function-return-type
  install(t) {
    t.use(De);
  }
};
export {
  De as IBizListTreeControl,
  Oe as default
};
