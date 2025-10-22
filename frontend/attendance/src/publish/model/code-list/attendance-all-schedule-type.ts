export default {
  codeListTag: 'attendance__all_schedule_type',
  codeListType: 'STATIC',
  codeName: 'attendance__all_schedule_type',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'fixed',
      text: '固定排班',
      value: 'fixed',
      id: 'fixed',
    },
    {
      codeName: 'class_inversion',
      text: 'N班倒',
      value: 'class_inversion',
      id: 'class_inversion',
    },
    {
      codeName: 'work_rest',
      text: '上A休B',
      value: 'work_rest',
      id: 'work_rest',
    },
    {
      codeName: 'flexible',
      text: '灵活打卡',
      value: 'flexible',
      id: 'flexible',
    },
    {
      codeName: 'alternate_week',
      text: '大小周',
      value: 'alternate_week',
      id: 'alternate_week',
    },
    {
      codeName: 'manual',
      text: '手动排班',
      value: 'manual',
      id: 'manual',
    },
    {
      codeName: 'free',
      text: '自由班',
      value: 'free',
      id: 'free',
    },
    {
      codeName: 'no_required',
      text: '免考勤',
      value: 'no_required',
      id: 'no_required',
    },
  ],
  enableCache: true,
  name: '班次类型（免考勤）',
  id: 'attendanceapp.attendance__all_schedule_type',
};
