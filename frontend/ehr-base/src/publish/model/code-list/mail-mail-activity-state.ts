export default {
  codeListTag: 'mail__mail_activity_state',
  codeListType: 'STATIC',
  codeName: 'mail__mail_activity_state',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'overdue',
      text: '逾期',
      value: 'overdue',
      id: 'overdue',
    },
    {
      codeName: 'today',
      text: '今天',
      value: 'today',
      id: 'today',
    },
    {
      codeName: 'planned',
      text: '已安排',
      value: 'planned',
      id: 'planned',
    },
    {
      codeName: 'done',
      text: '已完成',
      value: 'done',
      id: 'done',
    },
  ],
  enableCache: true,
  name: '状态',
  id: 'ehrapp.mail__mail_activity_state',
};
