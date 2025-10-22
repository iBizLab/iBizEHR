export default {
  deviewCodeName: 'CustomView_ExtenCarrier',
  deviewId: 'b9d2348e1abefed788b1a675af04ca4f',
  accUserMode: 2,
  capLanguageRes: {
    lanResTag: 'PAGE.CAPTION.RES_CONFIG_SETTINGS.CUSTOMVIEW_EXTENCARRIER',
  },
  caption: '扩展携带视图',
  codeName: 'res_config_settings_custom_view_exten_carrier',
  appDataEntityId: 'attendanceapp.res_config_settings',
  controls: [
    {
      createControlAction: {
        appDEMethodId: 'create',
        appDataEntityId: 'attendanceapp.res_config_settings',
        id: 'create',
      },
      getDraftFromControlAction: {
        appDataEntityId: 'attendanceapp.res_config_settings',
        id: 'loaddraftfrom',
      },
      getDraftControlAction: {
        appDEMethodId: 'get_draft',
        appDataEntityId: 'attendanceapp.res_config_settings',
        id: 'loaddraft',
      },
      getControlAction: {
        appDEMethodId: 'get',
        appDataEntityId: 'attendanceapp.res_config_settings',
        id: 'load',
      },
      removeControlAction: {
        appDEMethodId: 'remove',
        appDataEntityId: 'attendanceapp.res_config_settings',
        id: 'remove',
      },
      updateControlAction: {
        appDEMethodId: 'update',
        appDataEntityId: 'attendanceapp.res_config_settings',
        id: 'update',
      },
      deformPages: [
        {
          layout: {
            columnCount: 24,
            layout: 'TABLE_24COL',
          },
          deformDetails: [
            {
              layout: {
                columnCount: 24,
                layout: 'TABLE_24COL',
              },
              deformDetails: [
                {
                  appViewId:
                    'attendanceapp.res_config_settings_attandence_setting_view',
                  parentDataJO: {
                    srfparentdename: 'RES_CONFIG_SETTINGS',
                    SRFPARENTTYPE: 'CUSTOM',
                  },
                  needSave: true,
                  codeName: 'attandence_settings',
                  detailStyle: 'DEFAULT',
                  detailType: 'DRUIPART',
                  layoutPos: {
                    colMD: 24,
                    layout: 'TABLE_24COL',
                  },
                  showCaption: true,
                  id: 'attandence_settings',
                },
              ],
              capLanguageRes: {
                lanResTag:
                  'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.GROUPPANEL.GROUP1',
              },
              caption: '配置设定基本信息',
              codeName: 'group1',
              detailStyle: 'DEFAULT',
              detailType: 'GROUPPANEL',
              layoutPos: {
                colMD: 24,
                layout: 'TABLE_24COL',
              },
              id: 'group1',
            },
            {
              dataType: 25,
              enableCond: 3,
              labelPos: 'LEFT',
              labelWidth: 130,
              noPrivDisplayMode: 1,
              appDEFieldId: 'id',
              editor: {
                editorType: 'HIDDEN',
                valueType: 'SIMPLE',
                editable: true,
                id: 'id',
              },
              allowEmpty: true,
              hidden: true,
              capLanguageRes: {
                lanResTag: 'DEF.LNAME.RES_CONFIG_SETTINGS.ID',
              },
              caption: '标识',
              codeName: 'id',
              detailStyle: 'DEFAULT',
              detailType: 'FORMITEM',
              layoutPos: {
                colMD: 24,
                layout: 'TABLE_24COL',
              },
              id: 'id',
            },
          ],
          capLanguageRes: {
            lanResTag:
              'CONTROL.DEFORM.RES_CONFIG_SETTINGS.GENERAL_SETTING.FORMPAGE.FORMPAGE1',
          },
          caption: '出勤',
          codeName: 'attandence',
          detailStyle: 'DEFAULT',
          detailType: 'FORMPAGE',
          userTag: 'dynamic_overlay:after:general',
          id: 'attandence',
        },
      ],
      layout: {
        columnCount: 24,
        layout: 'TABLE_24COL',
      },
      tabHeaderPos: 'TOP',
      noTabHeader: true,
      autoLoad: true,
      showBusyIndicator: true,
      codeName: 'general_setting',
      controlType: 'FORM',
      logicName: '全局设置',
      appDataEntityId: 'attendanceapp.res_config_settings',
      controlParam: {
        id: 'form',
      },
      modelId: 'd8314f0342b9cc9ea88b89b2c97ab3dc',
      modelType: 'PSDEFORM_EDITFORM',
      name: 'form',
      id: 'attendanceapp.res_config_settings.general_setting',
    },
    {
      capLanguageRes: {
        lanResTag: 'PAGE.CAPTION.RES_CONFIG_SETTINGS.CUSTOMVIEW_EXTENCARRIER',
      },
      caption: '扩展携带视图',
      codeName: 'custom_view_exten_carrier_captionbar',
      controlType: 'CAPTIONBAR',
      appDataEntityId: 'attendanceapp.res_config_settings',
      controlParam: {},
      name: 'captionbar',
      id: 'custom_view_exten_carrier_captionbar',
    },
  ],
  viewLayoutPanel: {
    layoutBodyOnly: true,
    useDefaultLayout: true,
    layoutPanel: true,
    codeName: 'layoutpanel',
    controlStyle: 'APPDECUSTOMVIEW',
    controlType: 'VIEWLAYOUTPANEL',
    appDataEntityId: 'attendanceapp.res_config_settings',
    controlParam: {},
    id: 'layoutpanel',
  },
  priority: 100,
  title: '扩展携带视图',
  titleLanguageRes: {
    lanResTag: 'PAGE.TITLE.RES_CONFIG_SETTINGS.CUSTOMVIEW_EXTENCARRIER',
  },
  viewStyle: 'DEFAULT',
  viewType: 'DECUSTOMVIEW',
  enableDP: true,
  showCaptionBar: true,
  modelId: '62a8821f592a0cf8da20ad3f029ad62d',
  modelType: 'PSAPPDEVIEW',
  name: 'res_config_settingsCustomView_ExtenCarrier',
  id: 'attendanceapp.res_config_settings_custom_view_exten_carrier',
};
