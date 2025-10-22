export default {
  codeListTag: 'attendance__DurationStatistics',
  codeListType: 'STATIC',
  codeName: 'attendance__DurationStatistics',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'should_attendance_hours',
      text: '应出勤时长',
      value: 'should_attendance_hours',
      id: 'should_attendance_hours',
    },
    {
      codeName: 'billable_hours',
      text: '计薪时长',
      value: 'billable_hours',
      id: 'billable_hours',
    },
    {
      codeName: 'working_hours',
      text: '实际出勤时长',
      value: 'working_hours',
      id: 'working_hours',
    },
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
    {
      codeName: 'overtime_hours',
      text: '加班时长',
      value: 'overtime_hours',
      id: 'overtime_hours',
    },
  ],
  enableCache: true,
  name: '每日统计-时长统计',
  id: 'attendanceapp.attendance__durationstatistics',
};
