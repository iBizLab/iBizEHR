export default {
  codeListTag: 'attendance__attendance_statistics',
  codeListType: 'STATIC',
  codeName: 'attendance__attendance_statistics',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'should_attendance_days',
      text: '应出勤天数',
      value: 'should_attendance_days',
      id: 'should_attendance_days',
    },
    {
      codeName: 'actual_attendance_days',
      text: '实际出勤天数',
      value: 'actual_attendance_days',
      id: 'actual_attendance_days',
    },
    {
      codeName: 'should_attendance_time',
      text: '应出勤时长',
      value: 'should_attendance_time',
      id: 'should_attendance_time',
    },
    {
      codeName: 'working_hours',
      text: '实际出勤时长',
      value: 'working_hours',
      id: 'working_hours',
    },
    {
      codeName: 'billable_time',
      text: '计薪工作时长',
      value: 'billable_time',
      id: 'billable_time',
    },
    {
      codeName: 'pay_overtime_time',
      text: '加班时长(计加班费)',
      value: 'pay_overtime_time',
      id: 'pay_overtime_time',
    },
    {
      codeName: 'rest_overtime_time',
      text: '加班时长(计调休假)',
      value: 'rest_overtime_time',
      id: 'rest_overtime_time',
    },
  ],
  enableCache: true,
  name: '出勤统计',
  id: 'attendanceapp.attendance__attendance_statistics',
};
