export default {
  codeListTag: 'attendance__application_status',
  codeListType: 'STATIC',
  codeName: 'attendance__application_status',
  emptyText: '未定义',
  appDataEntityId: 'attendanceapp.attendance_checkin_application',
  codeItems: [
    {
      codeName: 'approved',
      text: '审核通过',
      value: 'APPROVED',
      id: 'approved',
    },
    {
      codeName: 'pending',
      text: '待审核',
      value: 'PENDING',
      id: 'pending',
    },
    {
      codeName: 'cancellation',
      text: '作废',
      value: 'CANCELLATION',
      id: 'cancellation',
    },
  ],
  enableCache: true,
  name: '申请状态',
  id: 'attendanceapp.attendance__application_status',
};
