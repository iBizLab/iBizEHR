export default {
  codeListTag: 'hr__hr_attendance_overtime_status',
  codeListType: 'STATIC',
  codeName: 'hr__hr_attendance_overtime_status',
  dynaSysMode: 1,
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'to_approve',
      sysCss: {
        cssName: 'orange-span',
      },
      text: '待批准',
      textCls: 'orange-span',
      value: 'to_approve',
      id: 'to_approve',
    },
    {
      codeName: 'approved',
      sysCss: {
        cssName: 'green-span',
      },
      text: '批准',
      textCls: 'green-span',
      value: 'approved',
      id: 'approved',
    },
    {
      codeName: 'refused',
      sysCss: {
        cssName: 'red-span',
      },
      text: '已拒绝',
      textCls: 'red-span',
      value: 'refused',
      id: 'refused',
    },
  ],
  enableCache: true,
  name: '加班状态',
  id: 'attendanceapp.hr__hr_attendance_overtime_status',
};
