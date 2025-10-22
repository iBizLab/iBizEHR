export default {
  codeListTag: 'hr__hr_applicant_offer',
  codeListType: 'STATIC',
  codeName: 'hr__hr_applicant_offer',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'item_1',
      sysCss: {
        cssName: 'green-span',
      },
      text: '已发送offer',
      textCls: 'green-span',
      value: '1',
      id: 'item_1',
    },
    {
      codeName: 'item_0',
      sysCss: {
        cssName: 'blue-span',
      },
      text: '未发送offer',
      textCls: 'blue-span',
      value: '0',
      id: 'item_0',
    },
  ],
  enableCache: true,
  name: 'Offer状态',
  id: 'web.hr__hr_applicant_offer',
};
