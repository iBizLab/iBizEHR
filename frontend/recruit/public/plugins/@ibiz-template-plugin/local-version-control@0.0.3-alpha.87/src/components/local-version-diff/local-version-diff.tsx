import {
  PropType,
  defineComponent,
  onMounted,
  onUnmounted,
  ref,
  watch,
} from 'vue';
import { useNamespace, useUIStore } from '@ibiz-template/vue3-util';
import * as monaco from 'monaco-editor';
import loader from '@monaco-editor/loader';
import { IDBEntity } from '../../interface';
import './local-version-diff.scss';

export default defineComponent({
  props: {
    current: {
      type: Object as PropType<IDBEntity>,
      required: true,
    },
    items: {
      type: Object as PropType<IDBEntity[]>,
      required: true,
    },
  },
  setup(props) {
    const ns = useNamespace('local-version-diff');

    // 是否正在加载
    const isLoading = ref<boolean>(false);

    // 选中项
    const selectedItem = ref<IDBEntity>(
      props.items.find(item => item.id !== props.current.id) || props.current,
    );

    // diff编辑器元素
    const diffEditorRef = ref<HTMLElement>();

    // monaco编辑器
    let monacoEditor: typeof monaco.editor | undefined;

    // diff编辑器
    let diffEditor: monaco.editor.IStandaloneDiffEditor | undefined;

    // 原始模型
    let originalModel: monaco.editor.ITextModel | undefined;

    // 比对模型
    let modifiedModel: monaco.editor.ITextModel | undefined;

    // 元素尺寸变化监听器
    let resizeObserver: ResizeObserver | undefined;

    // UI主题
    const { UIStore } = useUIStore();

    // 获取monaco主题
    const getMonacoTheme = (name: string): string => {
      return name === 'dark' ? `vs-${UIStore.theme}` : 'vs';
    };

    watch(
      () => UIStore.theme,
      newVal => {
        monacoEditor?.setTheme(getMonacoTheme(newVal));
        diffEditor?.layout();
      },
    );

    // 初始化编辑器
    const initEditor = async () => {
      if (!diffEditorRef.value) {
        return;
      }
      try {
        isLoading.value = true;
        loader.config({
          paths: {
            vs: `${ibiz.env.pluginBaseUrl}/monaco-editor@0.45.0/min/vs`,
          },
        });
        const loaderMonaco = await loader.init();
        monacoEditor = loaderMonaco.editor;
        diffEditor = monacoEditor.createDiffEditor(diffEditorRef.value, {
          theme: getMonacoTheme(UIStore.theme),
          readOnly: true,
          readOnlyMessage: {
            value: ibiz.i18n.t('editor.code.readOnlyPrompt'),
          },
        });
        originalModel = monacoEditor.createModel(
          props.current.data ? JSON.stringify(props.current.data, null, 2) : '',
          'json',
        );
        modifiedModel = monacoEditor.createModel(
          selectedItem.value.data
            ? JSON.stringify(selectedItem.value.data, null, 2)
            : '',
          'json',
        );
        diffEditor.setModel({
          original: originalModel,
          modified: modifiedModel,
        });
      } finally {
        isLoading.value = false;
      }
    };

    // 处理选中项变化
    const handleSelectChange = (value: string) => {
      selectedItem.value =
        props.items.find(item => item.id === value) || props.current;
      if (!diffEditor || !monacoEditor || !originalModel || !modifiedModel) {
        return;
      }
      modifiedModel.setValue(
        selectedItem.value.data
          ? JSON.stringify(selectedItem.value.data, null, 2)
          : '',
      );
      diffEditor.setModel({
        original: originalModel,
        modified: modifiedModel,
      });
    };

    onMounted(() => {
      initEditor();
      if (diffEditorRef.value) {
        resizeObserver = new ResizeObserver(() => {
          diffEditor?.layout();
        });
        resizeObserver.observe(diffEditorRef.value);
      }
    });

    onUnmounted(() => {
      resizeObserver?.disconnect();
    });

    return {
      ns,
      isLoading,
      selectedItem,
      diffEditorRef,
      handleSelectChange,
    };
  },
  render() {
    return (
      <div class={this.ns.b()} v-loading={this.isLoading}>
        <div class={this.ns.b('header')}>版本比对</div>
        <div class={this.ns.b('content')}>
          <div class={this.ns.b('toolbar')}>
            <el-select model-value={this.current.id} disabled>
              <el-option
                value={this.current.id}
                label={this.current.caption}
              ></el-option>
            </el-select>
            <el-select
              model-value={this.selectedItem.id}
              onChange={this.handleSelectChange}
            >
              {this.items.map(item => {
                return (
                  <el-option
                    key={item.id}
                    value={item.id}
                    label={item.caption}
                  ></el-option>
                );
              })}
            </el-select>
          </div>
          <div class={this.ns.b('editor')} ref='diffEditorRef'></div>
        </div>
      </div>
    );
  },
});
