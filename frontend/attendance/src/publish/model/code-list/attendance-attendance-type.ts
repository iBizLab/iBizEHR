export default {
  codeListTag: 'attendance__attendance_type',
  codeListType: 'STATIC',
  codeName: 'attendance__attendance_type',
  emptyText: '未定义',
  appDataEntityId: 'attendanceapp.attendance_checkin_application',
  codeItems: [
    {
      codeName: 'reissue',
      text: '补卡',
      value: 'REISSUE',
      id: 'reissue',
    },
    {
      codeName: 'overtime',
      text: '加班',
      value: 'OVERTIME',
      id: 'overtime',
    },
    {
      codeName: 'leave',
      text: '请假',
      value: 'LEAVE',
      id: 'leave',
    },
    {
      codeName: 'go_out',
      text: '外出',
      value: 'GO_OUT',
      id: 'go_out',
    },
    {
      codeName: 'business_trip',
      text: '出差',
      value: 'BUSINESS_TRIP',
      id: 'business_trip',
    },
  ],
  enableCache: true,
  name: '考勤申请类型',
  id: 'attendanceapp.attendance__attendance_type',
};
