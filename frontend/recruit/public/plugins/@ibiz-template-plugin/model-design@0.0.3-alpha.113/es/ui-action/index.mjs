import { registerUIActionProvider } from '@ibiz-template/runtime';
import { ModelExportProvider } from './model-export-provider.mjs';
import { ModelImportProvider } from './model-import-provider.mjs';
import { ModelEditProvider } from './model-edit-provider.mjs';
import { ModelCopyProvider } from './model-copy-provider.mjs';
import { ModelPasteProvider } from './model-paste-provider.mjs';
import { ModelCloneProvider } from './model-clone-provider.mjs';
import { OpenModelRuntimeProvider } from './open-model-runtime.mjs';
import { DSLModelExportProvider } from './dsl-model-export-provider.mjs';
import { DSLModelImportProvider } from './dsl-model-import-provider.mjs';
import { DSLModelEditProvider } from './dsl-model-edit-provider.mjs';
import { OpenModelClipboardProvider } from './open-model-clipboard-provider.mjs';

"use strict";
var UIAction = {
  install() {
    const modelExportProvider = new ModelExportProvider();
    registerUIActionProvider(
      "DEUIACTION_EXPORT_TO_MODEL_CLIPBOARD",
      () => modelExportProvider
    );
    const modelImportProvider = new ModelImportProvider();
    registerUIActionProvider(
      "DEUIACTION_IMPORT_FOR_MODEL_CLIPBOARD",
      () => modelImportProvider
    );
    const modelEditProvider = new ModelEditProvider();
    registerUIActionProvider("DEUIACTION_MODEL_EDIT", () => modelEditProvider);
    const modelCopyProvider = new ModelCopyProvider();
    registerUIActionProvider("DEUIACTION_MODEL_COPY", () => modelCopyProvider);
    const modelPasteProvider = new ModelPasteProvider();
    registerUIActionProvider(
      "DEUIACTION_MODEL_PASTE",
      () => modelPasteProvider
    );
    const modelCloneProvider = new ModelCloneProvider();
    registerUIActionProvider(
      "DEUIACTION_MODEL_CLONE",
      () => modelCloneProvider
    );
    const openModelRuntimeProvider = new OpenModelRuntimeProvider();
    registerUIActionProvider(
      "DEUIACTION_OPEN_MODEL_RUNTIME",
      () => openModelRuntimeProvider
    );
    const dslModelExportProvider = new DSLModelExportProvider();
    registerUIActionProvider(
      "DEUIACTION_DSL_EXPORT",
      () => dslModelExportProvider
    );
    const dslModelImportProvider = new DSLModelImportProvider();
    registerUIActionProvider(
      "DEUIACTION_DSL_IMPORT",
      () => dslModelImportProvider
    );
    const dslModelEditProvider = new DSLModelEditProvider();
    registerUIActionProvider("DEUIACTION_DSL_EDIT", () => dslModelEditProvider);
    const openModelClipboardProvider = new OpenModelClipboardProvider();
    registerUIActionProvider(
      "DEUIACTION_OPEN_MODEL_CLIPBOARD",
      () => openModelClipboardProvider
    );
  }
};

export { UIAction as default };
