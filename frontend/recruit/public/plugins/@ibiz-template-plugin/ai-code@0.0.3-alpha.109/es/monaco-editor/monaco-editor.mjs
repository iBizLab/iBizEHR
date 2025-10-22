import { ref, watch, nextTick, createVNode, onMounted, onUnmounted, resolveDirective, withDirectives, resolveComponent, defineComponent } from 'vue';
import { getCodeProps, getEditorEmits, useNamespace, useUIStore } from '@ibiz-template/vue3-util';
import { createUUID } from 'qx-util';
import { ElMessageBox } from 'element-plus';
import '../node_modules/.pnpm/@monaco-editor_loader@1.4.0_monaco-editor@0.45.0/node_modules/@monaco-editor/loader/lib/es/index.mjs';
import { UIActionUtil, SysUIActionTag } from '@ibiz-template/runtime';
import { StringUtil, CoreConst, getAppCookie, IBizContext } from '@ibiz-template/core';
import { calcAiToolbarItemsByAc } from '../util.mjs';
import { CodeModuleCenter } from '../module/index.mjs';
import './monaco-editor.css';
import loader from '../node_modules/.pnpm/@monaco-editor_loader@1.4.0_monaco-editor@0.45.0/node_modules/@monaco-editor/loader/lib/es/loader/index.mjs';

"use strict";
const IBizAICode = /* @__PURE__ */ defineComponent({
  name: "IBizAICode",
  props: getCodeProps(),
  emits: getEditorEmits(),
  setup(props, {
    emit
  }) {
    const codeEditBox = ref();
    const ns = useNamespace("code");
    const c = props.controller;
    const UUID = createUUID();
    const currentVal = ref("");
    const enableEdit = ref(true);
    const hasEnableEdit = ref(false);
    const readonlyState = ref(false);
    const enableFullScreen = ref(false);
    const isFullScreen = ref(false);
    const isLoading = ref(false);
    const isTSFileLoading = ref(false);
    const libName = "ibiz-global.d.ts";
    let globalVariable = "";
    const editorModel = c.model;
    if (editorModel.editorParams) {
      if (editorModel.editorParams.enableEdit) {
        hasEnableEdit.value = true;
        readonlyState.value = true;
        enableEdit.value = c.toBoolean(editorModel.editorParams.enableEdit) && !props.readonly && !props.disabled;
      }
      if (editorModel.editorParams.enableFullScreen) {
        enableFullScreen.value = c.toBoolean(editorModel.editorParams.enableFullScreen);
      }
      if (editorModel.editorParams.GLOBALVARIABLE) {
        globalVariable = editorModel.editorParams.GLOBALVARIABLE;
      }
    }
    let codeModuleCenter;
    let editor;
    let monacoEditor;
    let codeLensProviderDisposable;
    let inlineCompletionsProviderDisposable;
    let decorationsCollection;
    let chatInstance;
    const {
      UIStore,
      zIndex
    } = useUIStore();
    const getMonacoTheme = (name) => {
      var _a;
      const customTheme = (_a = c == null ? void 0 : c.editorParams) == null ? void 0 : _a.customTheme;
      if (customTheme) {
        return customTheme === "dark" ? "vs-dark" : "vs";
      }
      return name === "dark" ? "vs-".concat(UIStore.theme) : "vs";
    };
    watch(() => UIStore.theme, (newVal) => {
      monacoEditor.setTheme(getMonacoTheme(newVal));
    });
    watch(() => props.value, (newVal) => {
      if (newVal !== currentVal.value) {
        currentVal.value = newVal || "";
        editor == null ? void 0 : editor.setValue(currentVal.value);
      }
    }, {
      immediate: true
    });
    const updateEditorOptions = () => {
      if (!editor) {
        return;
      }
      if (props.readonly || props.disabled) {
        hasEnableEdit.value = false;
        readonlyState.value = true;
      }
      editor.updateOptions({
        readOnly: hasEnableEdit.value ? readonlyState.value : props.readonly || props.disabled
      });
    };
    watch(() => props.readonly, updateEditorOptions, {
      immediate: true
    });
    watch(() => props.disabled, updateEditorOptions, {
      immediate: true
    });
    const unload = () => {
      editor == null ? void 0 : editor.dispose();
      editor = null;
      decorationsCollection == null ? void 0 : decorationsCollection.clear();
      decorationsCollection = null;
      codeLensProviderDisposable == null ? void 0 : codeLensProviderDisposable.dispose();
      codeLensProviderDisposable = null;
      inlineCompletionsProviderDisposable == null ? void 0 : inlineCompletionsProviderDisposable.dispose();
      inlineCompletionsProviderDisposable = null;
      chatInstance == null ? void 0 : chatInstance.close();
    };
    const loadAIData = async () => {
      let data = props.data;
      if (c.model.appDataEntityId) {
        try {
          const result = await ibiz.hub.getApp(c.model.appId).deService.exec(c.model.appDataEntityId, "GetTempRealTimeData", c.context, c.params);
          if (result.ok && result.data)
            data = result.data;
        } catch (error) {
          ibiz.log.warn(error);
        }
      }
      return data;
    };
    const openAIChat = async () => {
      if (!c.deACMode || !c.model.appDataEntityId)
        return;
      const {
        contentToolbarItems,
        footerToolbarItems,
        questionToolbarItems,
        otherToolbarItems
      } = calcAiToolbarItemsByAc(c.deACMode);
      let curData;
      if (c.editorParams.srfaiappendcurdata === "true")
        curData = await loadAIData();
      const module = await import('@ibiz-template-plugin/ai-chat');
      chatInstance = module.chat || module.default.chat;
      let id = "";
      let abortController;
      chatInstance.create({
        containerOptions: {
          zIndex: zIndex.increment()
        },
        chatOptions: {
          caption: c.deACMode.logicName,
          context: {
            ...c.context
          },
          params: {
            ...c.params,
            srfactag: c.deACMode.codeName
          },
          // 编辑器参数srfaiappendcurdata，是否传入对象参数，用于历史查询传参
          appendCurData: curData,
          // 编辑器参数srfaiappendcurcontent，传入编辑内容作为用户消息,获取历史数据后附加
          appendCurContent: c.editorParams.srfaiappendcurcontent ? StringUtil.fill(c.editorParams.srfaiappendcurcontent, c.context, c.params, props.data) : void 0,
          appDataEntityId: c.model.appDataEntityId,
          contentToolbarItems,
          footerToolbarItems,
          questionToolbarItems,
          otherToolbarItems,
          question: async (aiChat, ctx, param, other, arr) => {
            id = createUUID();
            abortController = new AbortController();
            const deService = await ibiz.hub.getApp(ctx.srfappid).deService.getService(ctx, other.appDataEntityId);
            try {
              await deService.aiChatSse((msg) => {
                if (msg.actionstate === 20 && msg.actionresult) {
                  aiChat.addMessage({
                    messageid: id,
                    state: msg.actionstate,
                    type: "DEFAULT",
                    role: "ASSISTANT",
                    content: msg.actionresult
                  });
                } else if (msg.actionstate === 30 && msg.actionresult) {
                  const result = JSON.parse(msg.actionresult);
                  const choices = result.choices;
                  if (choices && choices.length > 0) {
                    aiChat.replaceMessage({
                      messageid: id,
                      state: msg.actionstate,
                      type: "DEFAULT",
                      role: "ASSISTANT",
                      content: choices[0].content || ""
                    });
                  }
                } else if (msg.actionstate === 40) {
                  aiChat.replaceMessage({
                    messageid: id,
                    state: msg.actionstate,
                    type: "ERROR",
                    role: "ASSISTANT",
                    content: msg.actionresult
                  });
                }
              }, abortController, ctx, param, {
                messages: arr
              });
            } catch (error) {
              aiChat.replaceMessage({
                messageid: id,
                state: 40,
                type: "ERROR",
                role: "ASSISTANT",
                content: error.message || ibiz.i18n.t("app.aiError")
              });
              abortController == null ? void 0 : abortController.abort();
            } finally {
              aiChat.completeMessage(id, true);
              return true;
            }
          },
          abortQuestion: async (aiChat) => {
            abortController == null ? void 0 : abortController.abort();
            await aiChat.stopMessage({
              messageid: id,
              state: 30,
              type: "DEFAULT",
              role: "ASSISTANT",
              content: ""
            });
            await aiChat.completeMessage(id, true);
          },
          action: (action, message) => {
            if (action === "backfill")
              emit("change", message.realcontent);
          },
          history: async (ctx, param, other) => {
            const deService = await ibiz.hub.getApp(ctx.srfappid).deService.getService(ctx, other.appDataEntityId);
            const historyData = other.appendCurData ? other.appendCurData : {};
            const result = await deService.aiChatHistory(ctx, param, historyData);
            if (result.data && Array.isArray(result.data)) {
              let preMsg;
              result.data.forEach((item) => {
                if (item.role === "TOOL") {
                  if (preMsg && item.content) {
                    chatInstance.aiChat.updateRecommendPrompt(preMsg, item.content);
                  }
                } else {
                  const msg = {
                    messageid: createUUID(),
                    state: 30,
                    type: "DEFAULT",
                    role: item.role,
                    content: item.content,
                    completed: true
                  };
                  preMsg = msg;
                  chatInstance.aiChat.addMessage(msg);
                }
              });
            }
            return true;
          },
          recommendPrompt: async (ctx, param, other) => {
            const deService = await ibiz.hub.getApp(ctx.srfappid).deService.getService(ctx, other.appDataEntityId);
            const result = await deService.aiChatRecommendPrompt(ctx, param, other.message);
            if (result.ok && result.data) {
              const choices = result.data.choices;
              if (choices && choices.length > 0) {
                return choices[0];
              }
              return null;
            }
            return null;
          },
          uploader: {
            onUpload: async (file, reportProgress, options) => {
              const fileMeata = ibiz.util.file.calcFileUpDownUrl((options == null ? void 0 : options.context) || c.context, (options == null ? void 0 : options.params) || c.params, {});
              const uploadHeaders = {};
              const token = getAppCookie(CoreConst.TOKEN);
              if (token) {
                Object.assign(uploadHeaders, {
                  ["".concat(ibiz.env.tokenHeader, "Authorization")]: "".concat(ibiz.env.tokenPrefix, "Bearer ").concat(token)
                });
              }
              const formData = new FormData();
              formData.append("file", file);
              const res = await ibiz.net.axios({
                url: fileMeata.uploadUrl,
                method: "post",
                headers: uploadHeaders,
                data: formData,
                onUploadProgress: (progressEvent) => {
                  const percent = progressEvent.loaded / progressEvent.total * 100;
                  reportProgress(percent);
                }
              });
              return res.data;
            }
          },
          extendToolbarClick: async (event, source, context, params, data) => {
            var _a, _b;
            const result = await UIActionUtil.exec(source.id, {
              view: c.view,
              ctrl: c.ctrl,
              context: IBizContext.create(context),
              params,
              data: [data],
              event
            }, source.appId);
            if (result.closeView) {
              c.view.closeView({
                ok: true
              });
            } else if (result.refresh) {
              switch (result.refreshMode) {
                case 1:
                  c.view.callUIAction(SysUIActionTag.REFRESH);
                  break;
                case 2:
                  (_a = c.view.parentView) == null ? void 0 : _a.callUIAction(SysUIActionTag.REFRESH);
                  break;
                case 3:
                  (_b = c.view.getTopView()) == null ? void 0 : _b.callUIAction(SysUIActionTag.REFRESH);
                  break;
                default:
              }
            }
            return result;
          }
        }
      });
    };
    const validate = (model) => {
      const currentEditor = monacoEditor.getEditors().find((e) => e.getModel() === model);
      if (!currentEditor || currentEditor.__instanceId !== UUID)
        return false;
      return true;
    };
    const waitForTSFileReady = async (_monaco, _fileName) => {
      const libs = _monaco.languages.typescript.typescriptDefaults.getExtraLibs();
      if (libs[_fileName])
        return;
      isTSFileLoading.value = true;
      const getWorker = await _monaco.languages.typescript.getTypeScriptWorker();
      const worker = await getWorker(_monaco.Uri.parse(_fileName));
      let timer;
      const checkLoaded = async () => {
        const files = await worker.getScriptFileNames();
        if (files.includes(_fileName) && timer) {
          clearInterval(timer);
          timer = null;
          isTSFileLoading.value = false;
        }
      };
      timer = setInterval(() => {
        checkLoaded();
      }, 600);
    };
    const editorInit = () => {
      nextTick(() => {
        isLoading.value = true;
        loader.config({
          paths: {
            vs: "".concat(ibiz.env.pluginBaseUrl, "/monaco-editor@0.45.0/min/vs")
          }
        });
        loader.init().then((loaderMonaco) => {
          var _a, _b, _c;
          isLoading.value = false;
          if (!editor) {
            codeModuleCenter = new CodeModuleCenter(loaderMonaco, {
              id: c.model.id,
              data: props.data,
              context: c.context,
              params: c.params,
              language: props.language || props.controller.language,
              libName,
              globalVariable
            });
            monacoEditor = loaderMonaco.editor;
            editor = monacoEditor.create(codeEditBox.value, {
              language: props.language || props.controller.language,
              // 语言支持自行查阅demo
              theme: codeModuleCenter.theme.themeName,
              foldingStrategy: "indentation",
              renderLineHighlight: "all",
              // 行亮
              selectOnLineNumbers: true,
              // 显示行号
              minimap: {
                enabled: true
              },
              suggest: {
                preview: true,
                matchOnWordStartOnly: false
              },
              quickSuggestions: true,
              readOnly: hasEnableEdit.value ? readonlyState.value : props.readonly || props.disabled,
              // 只读
              readOnlyMessage: {
                value: ibiz.i18n.t("editor.code.readOnlyPrompt")
              },
              fontSize: 16,
              // 字体大小
              fixedOverflowWidgets: true,
              // 确保悬浮提示不会被裁剪
              scrollBeyondLastLine: false,
              // 取消代码后面一大段空白
              overviewRulerBorder: false
              // 不要滚动条的边框
            });
            editor.__instanceId = UUID;
            (_c = (_b = (_a = editor.getContribution("editor.contrib.suggestController")) == null ? void 0 : _a.widget) == null ? void 0 : _b.value) == null ? void 0 : _c._setDetailsVisible(true);
            waitForTSFileReady(loaderMonaco, libName);
            codeModuleCenter.initModules(editor);
            if (c.deACMode) {
              codeLensProviderDisposable = loaderMonaco.languages.registerCodeLensProvider(props.language || props.controller.language, {
                provideCodeLenses: function(model, _token) {
                  if (!validate(model))
                    return {
                      lenses: [],
                      dispose: () => {
                      }
                    };
                  return {
                    lenses: [{
                      id: "AI",
                      range: new loaderMonaco.Range(1, 1, 1, 1),
                      command: {
                        title: "".concat(c.deACMode.logicName),
                        id: editor.addCommand(0, () => openAIChat())
                      }
                    }],
                    dispose: () => {
                    }
                  };
                },
                resolveCodeLens: (_model, codeLens, _token) => codeLens
              });
            }
          }
          setTimeout(() => {
            editor.layout();
            editor.setValue(currentVal.value);
          });
          const createDecorationsCollection = () => {
            if (decorationsCollection)
              decorationsCollection.clear();
            if (c.placeHolder && !(editor == null ? void 0 : editor.getValue())) {
              decorationsCollection = editor.createDecorationsCollection([{
                range: new loaderMonaco.Range(1, 1, 1, 1),
                // 影响第1行的开始位置
                options: {
                  isWholeLine: true,
                  // 是否作用于整行
                  beforeContentClassName: "".concat(ns.e("first-prompt"), " ghost-text-decoration")
                  // 在内容前加修饰 mtk8为注释样式类名
                }
              }]);
            }
          };
          const originalSetValue = editor.setValue.bind(editor);
          editor.setValue = (newValue) => {
            originalSetValue(newValue);
            createDecorationsCollection();
          };
          editor.onDidFocusEditorText(() => {
            decorationsCollection == null ? void 0 : decorationsCollection.clear();
          });
          editor.onDidBlurEditorText(() => {
            createDecorationsCollection();
          });
          editor.onDidChangeModelContent(() => {
            if (!hasEnableEdit.value) {
              currentVal.value = editor.getValue();
              emit("change", currentVal.value);
            }
          });
          window.addEventListener("resize", () => {
            editor.layout();
          });
        }).catch(() => {
          isLoading.value = false;
        });
      });
    };
    const changeEditState = () => {
      readonlyState.value = !readonlyState.value;
      if (!editor)
        return;
      if (!readonlyState.value) {
        editor.updateOptions({
          readOnly: false
        });
      } else {
        editor.updateOptions({
          readOnly: true
        });
      }
    };
    const changeFullScreenState = async () => {
      currentVal.value = String(editor == null ? void 0 : editor.getValue());
      unload();
      isFullScreen.value = !isFullScreen.value;
      editorInit();
    };
    const isAllowRenderFullScreen = () => {
      if (enableFullScreen.value)
        return createVNode("span", {
          "class": ns.be("toolbar", "fullscreen"),
          "title": ibiz.i18n.t("editor.common.".concat(isFullScreen.value ? "minimize" : "fullscreen")),
          "onClick": () => changeFullScreenState()
        }, [isFullScreen.value ? createVNode("i", {
          "class": "ch-icon ch-icon-minscreen"
        }, null) : createVNode("i", {
          "class": "ch-icon ch-icon-fullscreen"
        }, null)]);
      return null;
    };
    const renderCancelMessage = () => {
      return createVNode("div", {
        "class": ns.be("message", "message-content")
      }, [createVNode("p", null, [ibiz.i18n.t("editor.common.confirmCancelPrompt")]), createVNode("p", {
        "class": ns.bem("message", "message-content", "message-tip")
      }, [ibiz.i18n.t("editor.common.cancelEditPrompt")])]);
    };
    const cancelEdit = () => {
      if (props.value !== (editor == null ? void 0 : editor.getValue())) {
        ElMessageBox({
          title: ibiz.i18n.t("editor.common.confirmCancel"),
          type: "warning",
          customClass: ns.b("message"),
          message: renderCancelMessage(),
          showCancelButton: true,
          cancelButtonClass: ns.be("message", "message-cancel"),
          confirmButtonClass: ns.be("message", "message-comfire")
        }).then(() => {
          editor == null ? void 0 : editor.setValue(String(props.value || ""));
          changeEditState();
        }).catch(() => {
          editor == null ? void 0 : editor.focus();
        });
      } else {
        changeEditState();
      }
    };
    const save = () => {
      changeEditState();
      if (editor) {
        currentVal.value = editor.getValue();
        emit("change", currentVal.value);
      }
      if (isFullScreen.value) {
        changeFullScreenState();
      }
    };
    const renderFooter = () => {
      if (hasEnableEdit.value) {
        return createVNode("div", {
          "class": [ns.b("footer"), {
            [ns.b("footer-dialog")]: isFullScreen.value
          }]
        }, [createVNode("div", {
          "class": ns.be("footer", "cancel"),
          "onClick": () => cancelEdit()
        }, [ibiz.i18n.t("app.cancel")]), createVNode("div", {
          "class": ns.be("footer", "save"),
          "onClick": () => save()
        }, [ibiz.i18n.t("app.save")])]);
      }
      return null;
    };
    const renderHeaderToolbar = () => {
      if (hasEnableEdit.value || enableFullScreen.value) {
        return createVNode("div", {
          "class": ns.b("toolbar")
        }, [hasEnableEdit.value && enableEdit.value && readonlyState.value ? createVNode("i", {
          "class": "fa fa-edit",
          "aria-hidden": "true",
          "onClick": () => changeEditState()
        }, null) : null, isAllowRenderFullScreen()]);
      }
      return null;
    };
    const renderCodeContent = () => {
      return createVNode("div", {
        "ref": codeEditBox,
        "class": ns.e("box"),
        "style": {
          [ns.cssVarBlockName("placeholder")]: '"'.concat(c.placeHolder, '"')
        }
      }, null);
    };
    onMounted(() => {
      editorInit();
    });
    onUnmounted(() => {
      unload();
    });
    return {
      ns,
      currentVal,
      codeEditBox,
      isFullScreen,
      hasEnableEdit,
      readonlyState,
      isLoading,
      isTSFileLoading,
      renderFooter,
      renderHeaderToolbar,
      renderCodeContent,
      changeFullScreenState
    };
  },
  render() {
    var _a, _b;
    const isLoading = !((_b = (_a = this.controller.view) == null ? void 0 : _a.state) == null ? void 0 : _b.isLoading) && this.isLoading;
    return !this.isFullScreen ? withDirectives(createVNode("div", {
      "class": [this.ns.b(), {
        [this.ns.b("editor-readonly")]: this.readonlyState
      }, {
        [this.ns.b("editor-enable")]: !this.readonlyState
      }]
    }, [this.renderHeaderToolbar(), this.renderCodeContent(), this.hasEnableEdit && !this.readonlyState ? this.renderFooter() : null]), [[resolveDirective("loading"), isLoading]]) : createVNode(resolveComponent("el-dialog"), {
      "modelValue": this.isFullScreen,
      "onUpdate:modelValue": ($event) => this.isFullScreen = $event,
      "class": this.ns.b("dialog-full-screen"),
      "onClose": () => this.changeFullScreenState()
    }, {
      default: () => [withDirectives(createVNode("div", {
        "class": [this.ns.b(), {
          [this.ns.b("editor-readonly")]: this.readonlyState
        }, {
          [this.ns.b("editor-enable")]: !this.readonlyState
        }]
      }, [this.renderHeaderToolbar(), this.renderCodeContent(), this.hasEnableEdit && !this.readonlyState ? this.renderFooter() : null]), [[resolveDirective("loading"), isLoading]])]
    });
  }
});

export { IBizAICode };
