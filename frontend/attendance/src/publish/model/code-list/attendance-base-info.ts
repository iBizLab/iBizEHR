export default {
  codeListTag: 'attendance__base_info',
  codeListType: 'STATIC',
  codeName: 'attendance__base_info',
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
      codeName: 'employee_num',
      text: '工号',
      value: 'employee_num',
      id: 'employee_num',
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
  ],
  enableCache: true,
  name: '基本信息(显隐)',
  id: 'attendanceapp.attendance__base_info',
};
