export default {
  codeListTag: 'base__idea_status',
  codeListType: 'STATIC',
  codeName: 'base__idea_status',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'draft',
      text: '草稿',
      value: 'draft',
      id: 'draft',
    },
    {
      codeName: 'unstart',
      text: '未进行',
      value: 'unstart',
      id: 'unstart',
    },
    {
      codeName: 'ongoing',
      text: '进行中',
      value: 'ongoing',
      id: 'ongoing',
    },
    {
      codeName: 'complete',
      text: '已完成',
      value: 'complete',
      id: 'complete',
    },
    {
      codeName: 'suspend',
      text: '已暂停',
      value: 'suspend',
      id: 'suspend',
    },
    {
      codeName: 'canceled',
      text: '已取消',
      value: 'canceled',
      id: 'canceled',
    },
    {
      codeName: 'timeout',
      text: '已超期',
      value: 'timeout',
      id: 'timeout',
    },
  ],
  enableCache: true,
  name: '需求状态',
  id: 'web.base__idea_status',
};
