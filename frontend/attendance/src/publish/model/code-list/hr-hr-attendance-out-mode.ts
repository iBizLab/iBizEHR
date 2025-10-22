export default {
  codeListTag: 'hr__hr_attendance_out_mode',
  codeListType: 'STATIC',
  codeName: 'hr__hr_attendance_out_mode',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'kiosk',
      text: '自助考勤终端',
      value: 'kiosk',
      id: 'kiosk',
    },
    {
      codeName: 'systray',
      text: '系统托盘',
      value: 'systray',
      id: 'systray',
    },
    {
      codeName: 'manual',
      text: '手动',
      value: 'manual',
      id: 'manual',
    },
    {
      codeName: 'technical',
      text: '技术',
      value: 'technical',
      id: 'technical',
    },
    {
      codeName: 'auto_check_out',
      text: '自动签退',
      value: 'auto_check_out',
      id: 'auto_check_out',
    },
  ],
  enableCache: true,
  name: '输出模式',
  id: 'attendanceapp.hr__hr_attendance_out_mode',
};
