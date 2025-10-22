export default {
  codeListTag: 'hr__stage_status',
  codeListType: 'STATIC',
  codeName: 'hr__stage_status',
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
  name: '招聘阶段状态',
  id: 'web.hr__stage_status',
};
