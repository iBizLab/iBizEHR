/* eslint-disable @typescript-eslint/no-explicit-any */
/* eslint-disable no-useless-escape */
/* eslint-disable import/no-extraneous-dependencies */
import { useNamespace, useUIStore } from '@ibiz-template/vue3-util';
import { IAppDEACMode } from '@ibiz/model-core';
import {
  defineComponent,
  nextTick,
  onMounted,
  onUnmounted,
  PropType,
  ref,
  watch,
} from 'vue';
import loader from '@monaco-editor/loader';
import * as monaco from 'monaco-editor';
import { createUUID } from 'qx-util';
import './design-code-editor.scss';

export default defineComponent({
  name: 'IBizDesignCodeEditor',
  props: {
    modelValue: String,
    language: {
      type: String,
      default: 'json',
    },
    readonly: {
      type: Boolean,
      default: false,
    },
    minimap: {
      type: Boolean,
      default: true,
    },
    isChangeLanguage: {
      type: Boolean,
      default: true,
    },
    showToolbar: {
      type: Boolean,
      default: true,
    },
    isEnableLoad: {
      type: Boolean,
      default: true,
    },
    deACMode: {
      type: Object as PropType<IAppDEACMode>,
    },
    openAIChat: {
      type: Function as PropType<() => Promise<void>>,
    },
    enableCompletion: {
      type: Boolean,
      default: false,
    },
    provideCompletionItems: {
      type: Function as PropType<
        (
          model: IParams,
          position: IParams,
        ) => {
          suggestions: {
            label: string;
            kind: number;
            detail: number;
            insertText: string;
          };
        }
      >,
    },
    expandSuggestDetails: {
      type: Boolean,
      default: false,
    },
  },
  emits: {
    'update:modelValue': (_value: string) => true,
  },
  setup(props, { emit }) {
    const ns = useNamespace('design-code-editor');

    // 容器
    const containerRef = ref<HTMLElement>();

    // 编辑器容器
    const editorRef = ref<HTMLElement>();

    const UUID = createUUID();

    // 编辑器
    let editor: monaco.editor.IStandaloneCodeEditor | undefined;
    let codeLensProviderDisposable: monaco.IDisposable | null;
    let monacoEditor: typeof monaco.editor;
    let codeCompletion: monaco.IDisposable | null;

    // 语言
    const languages = ref([
      'json',
      'javascript',
      'typescript',
      'css',
      'less',
      'sass',
      'java',
      'sql',
      'vue',
      'python',
    ]);

    // 当前语言
    const currentLanguage = ref(props.language);

    // 是否加载中
    const isLoading = ref(false);

    const { UIStore } = useUIStore();

    // 编辑器主题
    const getMonacoTheme = (name: string): string => {
      return name === 'dark' ? `vs-${UIStore.theme}` : 'vs'; // 官方自带三种主题vs, hc-black, or vs-dark
    };

    watch(
      () => UIStore.theme,
      newVal => {
        monacoEditor.setTheme(getMonacoTheme(newVal));
      },
    );

    watch(
      () => props.modelValue,
      () => {
        if (editor && props.modelValue !== editor.getValue()) {
          editor.setValue(props.modelValue || '');
        }
      },
      { immediate: true },
    );

    /**
     * 检查模型是否属于当前编辑器实例
     *
     * @param {monaco.editor.ITextModel} model
     * @return {*}  {boolean}
     */
    const validate = (model: monaco.editor.ITextModel): boolean => {
      const currentEditor = monacoEditor
        .getEditors()
        .find(e => e.getModel() === model);

      if (!currentEditor || (currentEditor as any).__instanceId !== UUID)
        return false;
      return true;
    };

    // 编辑器初始化
    const editorInit = (): void => {
      if (!editorRef.value) {
        return;
      }

      nextTick(() => {
        isLoading.value = true;
        loader.config({
          paths: {
            vs: `${ibiz.env.pluginBaseUrl}/monaco-editor@0.45.0/min/vs`,
          },
        });
        loader
          .init()
          .then(loaderMonaco => {
            isLoading.value = false;
            if (editor) {
              return;
            }
            if (!editorRef.value || !loaderMonaco) {
              return;
            }
            monacoEditor = loaderMonaco.editor;
            // 手动注册 Groovy 语言
            loaderMonaco.languages.register({ id: 'groovy' });
            loaderMonaco.languages.setMonarchTokensProvider('groovy', {
              tokenizer: {
                root: [
                  [/\/\/.*$/, 'comment'], // 单行注释
                  [/\/\*/, 'comment', '@comment'], // 多行注释
                  [
                    /(println|def|return|if|else|for|while|psdelogic|psdelogicparam|psdelogicnode|psdelogiclink)\b/,
                    'keyword',
                  ], // 关键字
                  [/"[^"]*"/, 'string'], // 双引号字符串
                  [/'[^']*'/, 'string'], // 单引号字符串
                  [/\d+/, 'number'], // 数字
                  [/[\+\-\*\/=<>!]+/, 'operator'], // 操作符
                ],
                comment: [
                  [/.*?\*\//, 'comment', '@pop'],
                  [/.*/, 'comment'],
                ],
              },
            });
            editor = monacoEditor.create(editorRef.value, {
              language: currentLanguage.value,
              theme: getMonacoTheme(UIStore.theme),
              minimap: {
                enabled: props.minimap,
              },
              readOnly: props.readonly,
              readOnlyMessage: {
                value: ibiz.i18n.t('editor.code.readOnlyPrompt'),
              },
              value: props.modelValue,
              wordWrap: 'on',
            });

            // 设置默认展开建议详情面板
            if (props.expandSuggestDetails) {
              (
                editor.getContribution(
                  'editor.contrib.suggestController',
                ) as any
              )?.widget?.value?._setDetailsVisible(true);
            }

            // 为当前编辑器实例添加自定义属性
            (editor as any).__instanceId = UUID;
            if (props.deACMode && props.openAIChat && ibiz.env.enableAI) {
              codeLensProviderDisposable =
                loaderMonaco.languages.registerCodeLensProvider(
                  currentLanguage.value,
                  {
                    provideCodeLenses(model, _token) {
                      if (!validate(model))
                        return { lenses: [], dispose: () => {} };
                      return {
                        lenses: [
                          {
                            id: 'AI',
                            range: new loaderMonaco.Range(1, 1, 1, 1),
                            command: {
                              title: `${props.deACMode!.logicName}`,
                              id: editor!.addCommand(0, () => {
                                (props as IData).openAIChat();
                              })!,
                            },
                          },
                        ],
                        dispose: () => {},
                      };
                    },
                    resolveCodeLens: (_model, codeLens, _token) => codeLens,
                  },
                );
            }

            if (props.enableCompletion) {
              codeCompletion =
                loaderMonaco.languages.registerCompletionItemProvider(
                  currentLanguage.value,
                  {
                    triggerCharacters: ['-', '--'], // 输入.或者空格触发
                    provideCompletionItems: (model, position): any => {
                      if (!validate(model) || !props.provideCompletionItems)
                        return { suggestions: [] };

                      if (props.provideCompletionItems)
                        return props.provideCompletionItems(model, position);
                    },
                  },
                );
            }
            // 监听值的变化
            editor.onDidChangeModelContent(() => {
              if (editor) {
                emit('update:modelValue', editor.getValue());
              }
            });
          })
          .catch(() => {
            isLoading.value = false;
          });
      });
    };

    // 处理语言变化
    const handleLanguageChange = () => {
      editor?.dispose();
      editor = undefined;
      editorInit();
      if (editor) {
        (editor as monaco.editor.IStandaloneCodeEditor).layout();
      }
    };

    // 是否全屏
    const isFullScreen = ref(false);

    // 监听工具栏点击
    const onToolBarClick = async (value: boolean) => {
      isFullScreen.value = value;
      if (!editorRef.value) {
        return;
      }
      const container = containerRef.value;
      if (!container) {
        return;
      }

      if (isFullScreen.value) {
        container.requestFullscreen();
      } else {
        await document.exitFullscreen();
        editor?.dispose();
        editor = undefined;
        editorInit();
        if (editor) {
          (editor as monaco.editor.IStandaloneCodeEditor).layout();
        }
      }
    };

    // 处理窗口变化
    const handleResize = () => {
      editor?.layout();
    };

    // 处理全屏变化
    const handleFullScreenChange = () => {
      isFullScreen.value = !!document.fullscreenElement;
    };

    // 容器大小变化监听器
    let resizeObserver: ResizeObserver | undefined;

    onMounted(() => {
      editorInit();
      window.addEventListener('resize', handleResize);
      if (containerRef.value) {
        containerRef.value.addEventListener(
          'fullscreenchange',
          handleFullScreenChange,
        );
        resizeObserver = new ResizeObserver(() => {
          handleResize();
        });
        resizeObserver.observe(containerRef.value);
      }
    });

    onUnmounted(() => {
      window.removeEventListener('resize', handleResize);
      containerRef.value?.removeEventListener(
        'fullscreenchange',
        handleFullScreenChange,
      );
      resizeObserver?.disconnect();
      codeLensProviderDisposable?.dispose();
      codeCompletion?.dispose();
    });

    return {
      ns,
      editor,
      containerRef,
      editorRef,
      languages,
      currentLanguage,
      isFullScreen,
      isLoading,
      handleLanguageChange,
      onToolBarClick,
    };
  },
  render() {
    return (
      <div
        class={[this.ns.b(), this.ns.is('full-screen', this.isFullScreen)]}
        ref='containerRef'
        v-loading={this.isEnableLoad && this.isLoading}
      >
        {this.showToolbar && (
          <div class={this.ns.b('toolbar')}>
            <div class={this.ns.b('left-toolbar')}>
              <el-select
                v-model={this.currentLanguage}
                disabled={!this.isChangeLanguage}
                onChange={this.handleLanguageChange}
                teleported={false}
              >
                {this.languages.map(item => {
                  return <el-option key={item} label={item} value={item} />;
                })}
              </el-select>
            </div>
            <div class={this.ns.b('right-toolbar')}>
              {this.$slots.rightToolbar?.()}
              {this.isFullScreen ? (
                <ion-icon
                  title='退出全屏'
                  name='contract-outline'
                  onClick={() => this.onToolBarClick(false)}
                ></ion-icon>
              ) : (
                <ion-icon
                  title='全屏'
                  name='resize-outline'
                  onClick={() => this.onToolBarClick(true)}
                ></ion-icon>
              )}
            </div>
          </div>
        )}
        <div class={this.ns.b('content')} ref='editorRef'></div>
      </div>
    );
  },
});
