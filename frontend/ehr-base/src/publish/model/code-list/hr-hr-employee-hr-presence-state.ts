export default {
  codeListTag: 'hr__hr_employee_hr_presence_state',
  codeListType: 'STATIC',
  codeName: 'hr__hr_employee_hr_presence_state',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'present',
      text: '出勤',
      value: 'present',
      id: 'present',
    },
    {
      codeName: 'absent',
      text: '缺勤',
      value: 'absent',
      id: 'absent',
    },
    {
      codeName: 'archive',
      text: '已归档',
      value: 'archive',
      id: 'archive',
    },
    {
      codeName: 'out_of_working_hour',
      text: '非工作时间',
      value: 'out_of_working_hour',
      id: 'out_of_working_hour',
    },
  ],
  enableCache: true,
  name: '人力资源出席状态',
  id: 'ehrapp.hr__hr_employee_hr_presence_state',
};
