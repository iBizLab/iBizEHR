export default {
  codeListTag: 'Duration',
  codeListType: 'STATIC',
  codeName: 'Duration',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'late_minutes',
      text: '迟到时长',
      value: 'late_minutes',
      id: 'late_minutes',
    },
    {
      codeName: 'leave_early_minutes',
      text: '早退时长',
      value: 'leave_early_minutes',
      id: 'leave_early_minutes',
    },
  ],
  enableCache: true,
  name: '时长统计',
  id: 'attendanceapp.duration',
};
