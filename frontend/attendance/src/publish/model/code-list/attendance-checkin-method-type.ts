export default {
  codeListTag: 'attendance__checkin_method_type',
  codeListType: 'STATIC',
  codeName: 'attendance__checkin_method_type',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'device',
      text: '设备打卡',
      value: 'device',
      id: 'device',
    },
    {
      codeName: 'gps',
      text: 'GPS打卡',
      value: 'gps',
      id: 'gps',
    },
    {
      codeName: 'wifi',
      text: 'WiFi打卡',
      value: 'wifi',
      id: 'wifi',
    },
  ],
  enableCache: true,
  name: '考勤方式类型',
  id: 'attendanceapp.attendance__checkin_method_type',
};
