import { TreeController, ITreeState, ITreeNodeData, ITreeEvent } from '@ibiz-template/runtime';
import { IDETree } from '@ibiz/model-core';
export declare class ListTreeController<T extends IDETree = IDETree, S extends ITreeState = ITreeState, E extends ITreeEvent = ITreeEvent> extends TreeController<T, S, E> {
    /**
     * 树节点点击事件
     *
     * @param {ITreeNodeData} nodeData
     * @returns {*}  {Promise<void>}
     * @memberof ListTreeController
     */
    onTreeNodeClick(_nodeData: ITreeNodeData, event: MouseEvent): Promise<void>;
}
