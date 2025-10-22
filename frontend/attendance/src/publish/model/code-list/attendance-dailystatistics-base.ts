export default {
  codeListTag: 'attendance__DailystatisticsBase',
  codeListType: 'STATIC',
  codeName: 'attendance__DailystatisticsBase',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'member_name',
      text: '姓名',
      value: 'member_name',
      disableSelect: true,
      id: 'member_name',
    },
    {
      codeName: 'member_num',
      text: '工号',
      value: 'member_num',
      id: 'member_num',
    },
    {
      codeName: 'dept_name',
      text: '部门',
      value: 'dept_name',
      id: 'dept_name',
    },
    {
      codeName: 'title',
      text: '职位',
      value: 'title',
      id: 'title',
    },
    {
      codeName: 'checkin_date',
      text: '日期',
      value: 'checkin_date',
      id: 'checkin_date',
    },
    {
      codeName: 'rule_name',
      text: '考勤规则',
      value: 'rule_name',
      id: 'rule_name',
    },
    {
      codeName: 'shift_message',
      text: '班次',
      value: 'shift_message',
      id: 'shift_message',
    },
  ],
  enableCache: true,
  name: '每日统计-基本信息',
  id: 'attendanceapp.attendance__dailystatisticsbase',
};
