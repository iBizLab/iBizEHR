export default {
  codeListTag: 'base__job_status',
  codeListType: 'STATIC',
  codeName: 'base__job_status',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'open',
      text: '开启招聘',
      value: 'open',
      default: true,
      id: 'open',
    },
    {
      codeName: 'closed',
      text: '关闭招聘',
      value: 'closed',
      id: 'closed',
    },
  ],
  enableCache: true,
  name: '岗位状态',
  id: 'web.base__job_status',
};
