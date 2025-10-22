export default {
  codeListTag: 'attendance__attendance_result',
  codeListType: 'STATIC',
  codeName: 'attendance__attendance_result',
  emptyText: '未定义',
  appDataEntityId: 'attendanceapp.attendance_record',
  codeItems: [
    {
      codeName: 'normal',
      text: '正常',
      value: 'NORMAL',
      id: 'normal',
    },
    {
      codeName: 'abnormal',
      text: '异常',
      value: 'ABNORMAL',
      id: 'abnormal',
    },
    {
      codeName: 'late',
      text: '迟到',
      value: 'LATE',
      id: 'late',
    },
    {
      codeName: 'leave_early',
      text: '早退',
      value: 'LEAVE_EARLY',
      id: 'leave_early',
    },
    {
      codeName: 'absent',
      text: '缺勤',
      value: 'ABSENT',
      id: 'absent',
    },
    {
      codeName: 'missing',
      text: '缺卡',
      value: 'MISSING',
      id: 'missing',
    },
    {
      codeName: 'late_and_leave_early',
      text: '迟到/早退',
      value: 'LATE_AND_LEAVE_EARLY',
      id: 'late_and_leave_early',
    },
  ],
  enableCache: true,
  name: '考勤结果',
  id: 'attendanceapp.attendance__attendance_result',
};
