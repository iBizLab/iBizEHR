export default {
  codeListTag: 'hr__barcode_source',
  codeListType: 'STATIC',
  codeName: 'hr__barcode_source',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'scanner',
      text: '扫描',
      value: 'scanner',
      id: 'scanner',
    },
    {
      codeName: 'front',
      text: '前置摄像头',
      value: 'front',
      id: 'front',
    },
    {
      codeName: 'back',
      text: '后置摄像头',
      value: 'back',
      id: 'back',
    },
  ],
  enableCache: true,
  name: '条码来源',
  id: 'attendanceapp.hr__barcode_source',
};
