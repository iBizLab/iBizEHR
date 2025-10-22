export default {
  codeListTag: 'hr__offer_approval_period',
  codeListType: 'STATIC',
  codeName: 'hr__offer_approval_period',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'past',
      text: '已审核',
      value: 'past',
      id: 'past',
    },
    {
      codeName: 'pending',
      text: '待审核',
      value: 'pending',
      id: 'pending',
    },
  ],
  enableCache: true,
  name: 'offer审核状态',
  id: 'web.hr__offer_approval_period',
};
