import { registerUIActionProvider } from '@ibiz-template/runtime';
import { ModelExportProvider } from './model-export-provider';
import { ModelImportProvider } from './model-import-provider';
import { ModelEditProvider } from './model-edit-provider';
import { ModelCopyProvider } from './model-copy-provider';
import { ModelPasteProvider } from './model-paste-provider';
import { ModelCloneProvider } from './model-clone-provider';
import { OpenModelRuntimeProvider } from './open-model-runtime';
import { DSLModelExportProvider } from './dsl-model-export-provider';
import { DSLModelImportProvider } from './dsl-model-import-provider';
import { DSLModelEditProvider } from './dsl-model-edit-provider';
import { OpenModelClipboardProvider } from './open-model-clipboard-provider';

export default {
  install(): void {
    const modelExportProvider = new ModelExportProvider();
    registerUIActionProvider(
      'DEUIACTION_EXPORT_TO_MODEL_CLIPBOARD',
      () => modelExportProvider,
    );
    const modelImportProvider = new ModelImportProvider();
    registerUIActionProvider(
      'DEUIACTION_IMPORT_FOR_MODEL_CLIPBOARD',
      () => modelImportProvider,
    );
    const modelEditProvider = new ModelEditProvider();
    registerUIActionProvider('DEUIACTION_MODEL_EDIT', () => modelEditProvider);
    const modelCopyProvider = new ModelCopyProvider();
    registerUIActionProvider('DEUIACTION_MODEL_COPY', () => modelCopyProvider);
    const modelPasteProvider = new ModelPasteProvider();
    registerUIActionProvider(
      'DEUIACTION_MODEL_PASTE',
      () => modelPasteProvider,
    );
    const modelCloneProvider = new ModelCloneProvider();
    registerUIActionProvider(
      'DEUIACTION_MODEL_CLONE',
      () => modelCloneProvider,
    );
    const openModelRuntimeProvider = new OpenModelRuntimeProvider();
    registerUIActionProvider(
      'DEUIACTION_OPEN_MODEL_RUNTIME',
      () => openModelRuntimeProvider,
    );
    const dslModelExportProvider = new DSLModelExportProvider();
    registerUIActionProvider(
      'DEUIACTION_DSL_EXPORT',
      () => dslModelExportProvider,
    );
    const dslModelImportProvider = new DSLModelImportProvider();
    registerUIActionProvider(
      'DEUIACTION_DSL_IMPORT',
      () => dslModelImportProvider,
    );
    const dslModelEditProvider = new DSLModelEditProvider();
    registerUIActionProvider('DEUIACTION_DSL_EDIT', () => dslModelEditProvider);
    const openModelClipboardProvider = new OpenModelClipboardProvider();
    registerUIActionProvider(
      'DEUIACTION_OPEN_MODEL_CLIPBOARD',
      () => openModelClipboardProvider,
    );
  },
};
