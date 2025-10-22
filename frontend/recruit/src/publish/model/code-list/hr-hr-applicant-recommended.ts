export default {
  codeListTag: 'hr__hr_applicant_recommended',
  codeListType: 'STATIC',
  codeName: 'hr__hr_applicant_recommended',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'item_1',
      sysCss: {
        cssName: 'green-span',
      },
      text: '已推荐',
      textCls: 'green-span',
      value: '1',
      id: 'item_1',
    },
    {
      codeName: 'item_0',
      sysCss: {
        cssName: 'blue-span',
      },
      text: '未推荐',
      textCls: 'blue-span',
      value: '0',
      id: 'item_0',
    },
  ],
  enableCache: true,
  name: '推荐状态',
  id: 'web.hr__hr_applicant_recommended',
};
