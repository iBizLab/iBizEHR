export default {
  codeListTag: 'hr__exam_type',
  codeListType: 'STATIC',
  codeName: 'hr__exam_type',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'exam',
      sysCss: {
        cssName: 'blue-span',
      },
      text: '考试',
      textCls: 'blue-span',
      value: 'exam',
      id: 'exam',
    },
    {
      codeName: 'evaluation',
      sysCss: {
        cssName: 'orange-span',
      },
      text: '评测',
      textCls: 'orange-span',
      value: 'evaluation',
      id: 'evaluation',
    },
  ],
  enableCache: true,
  name: '考试评测类型',
  id: 'web.hr__exam_type',
};
