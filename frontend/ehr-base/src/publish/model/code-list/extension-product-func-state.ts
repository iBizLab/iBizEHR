export default {
  codeListTag: 'extension__product_func_state',
  codeListType: 'STATIC',
  codeName: 'extension__product_func_state',
  emptyText: '未定义',
  appDataEntityId: 'ehrapp.pscoreprdfunc',
  codeItems: [
    {
      codeName: 'not_install',
      text: '未安装',
      value: '0',
      id: 'not_install',
    },
    {
      codeName: 'Installed',
      text: '已安装',
      value: '1',
      id: 'installed',
    },
    {
      codeName: 'disabled',
      text: '已禁用',
      value: '2',
      id: 'disabled',
    },
    {
      codeName: 'installedneedreload',
      text: '已安装（需重新加载）',
      value: '3',
      id: 'installedneedreload',
    },
    {
      codeName: 'disabledneedreload',
      text: '已禁用（需重新加载）',
      value: '4',
      id: 'disabledneedreload',
    },
  ],
  codeItemValueNumber: true,
  enableCache: true,
  name: '核心产品功能状态',
  id: 'ehrapp.extension__product_func_state',
};
