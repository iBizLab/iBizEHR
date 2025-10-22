export default {
  codeListTag: 'attendance__attendance_policy',
  codeListType: 'STATIC',
  codeName: 'attendance__attendance_policy',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'only_checkin',
      text: '只打上班卡',
      value: 'only_checkin',
      id: 'only_checkin',
    },
    {
      codeName: 'only_checkout',
      text: '只打下班卡',
      value: 'only_checkout',
      id: 'only_checkout',
    },
    {
      codeName: 'only_once',
      text: '上下班时间内打卡一次',
      value: 'only_once',
      id: 'only_once',
    },
  ],
  enableCache: true,
  name: '打卡要求',
  id: 'attendanceapp.attendance__attendance_policy',
};
