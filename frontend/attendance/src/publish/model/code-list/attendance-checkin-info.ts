export default {
  codeListTag: 'attendance__checkin_info',
  codeListType: 'STATIC',
  codeName: 'attendance__checkin_info',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'checkin_time',
      text: '打卡时间',
      value: 'checkin_time',
      disableSelect: true,
      id: 'checkin_time',
    },
    {
      codeName: 'checkin_result',
      text: '考勤结果',
      value: 'checkin_result',
      id: 'checkin_result',
    },
  ],
  enableCache: true,
  name: '每日统计-打卡信息',
  id: 'attendanceapp.attendance__checkin_info',
};
