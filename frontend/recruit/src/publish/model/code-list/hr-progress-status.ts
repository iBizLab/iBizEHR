export default {
  codeListTag: 'hr__progress_status',
  codeListType: 'STATIC',
  codeName: 'hr__progress_status',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'item_1',
      sysCss: {
        cssName: 'green-span',
      },
      text: '启用',
      textCls: 'green-span',
      value: '1',
      id: 'item_1',
    },
    {
      codeName: 'item_0',
      sysCss: {
        cssName: 'red-span',
      },
      text: '停用',
      textCls: 'red-span',
      value: '0',
      id: 'item_0',
    },
  ],
  enableCache: true,
  name: '招聘流程状态',
  id: 'web.hr__progress_status',
};
