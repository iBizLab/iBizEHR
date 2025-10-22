export default {
  codeListTag: 'hr__kiosk_mode',
  codeListType: 'STATIC',
  codeName: 'hr__kiosk_mode',
  emptyText: '未定义',
  codeItems: [
    {
      codeName: 'barcode',
      text: '条形码/RFID',
      value: 'barcode',
      id: 'barcode',
    },
    {
      codeName: 'barcode_manual',
      text: '条形码和手动选择',
      value: 'barcode_manual',
      id: 'barcode_manual',
    },
    {
      codeName: 'manual',
      text: '手动选择',
      value: 'manual',
      id: 'manual',
    },
  ],
  enableCache: true,
  name: '考勤模式',
  id: 'attendanceapp.hr__kiosk_mode',
};
