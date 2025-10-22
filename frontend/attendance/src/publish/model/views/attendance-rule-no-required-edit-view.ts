export default {
  enableDirtyChecking: true,
  showDataInfoBar: true,
  xdataControlName: 'form',
  loadDefault: true,
  deviewCodeName: 'NoRequiredEditView',
  deviewId: 'b54cbf6e98bc0ea2a2ec4a3c57737919',
  accUserMode: 2,
  caption: '免考勤规则',
  codeName: 'attendance_rule_no_required_edit_view',
  appDataEntityId: 'attendanceapp.attendance_rule',
  appViewEngines: [
    {
      engineCat: 'VIEW',
      engineType: 'EditView',
      id: 'engine',
    },
  ],
  controls: [
    {
      detoolbarItems: [
        {
          actionLevel: 100,
          noPrivDisplayMode: 2,
          uiactionId: 'save@attendance_rule',
          uiactionTarget: 'SINGLEDATA',
          valid: true,
          caption: '保存',
          itemType: 'DEUIACTION',
          tooltip: '保存',
          showCaption: true,
          showIcon: true,
          id: 'deuiaction2',
        },
        {
          actionLevel: 100,
          noPrivDisplayMode: 2,
          uiactionId: 'editview_exitaction',
          valid: true,
          capLanguageRes: {
            lanResTag: 'TBB.TEXT.EDITVIEW.CLOSE',
          },
          caption: '关闭',
          itemType: 'DEUIACTION',
          sysImage: {
            cssClass: 'fa fa-sign-out',
            glyph: 'xf08b@FontAwesome',
          },
          tooltip: '关闭',
          tooltipLanguageRes: {
            lanResTag: 'TBB.TOOLTIP.EDITVIEW.CLOSE',
          },
          showCaption: true,
          showIcon: true,
          id: 'tbitem2',
        },
      ],
      xdataControlName: 'form',
      codeName: 'no_required_edit_view_toolbar',
      controlType: 'TOOLBAR',
      logicName: '考勤规则_工具栏',
      appDataEntityId: 'attendanceapp.attendance_rule',
      controlParam: {
        id: 'toolbar',
      },
      modelId: '08e4ed4044d4d9b8e57b9c939d8c5736',
      modelType: 'PSDETOOLBAR',
      name: 'toolbar',
      id: 'no_required_edit_view_toolbar',
    },
    {
      createControlAction: {
        appDEMethodId: 'create',
        appDataEntityId: 'attendanceapp.attendance_rule',
        id: 'create',
      },
      getDraftFromControlAction: {
        appDataEntityId: 'attendanceapp.attendance_rule',
        id: 'loaddraftfrom',
      },
      getDraftControlAction: {
        appDEMethodId: 'get_draft',
        appDataEntityId: 'attendanceapp.attendance_rule',
        id: 'loaddraft',
      },
      getControlAction: {
        appDEMethodId: 'get',
        appDataEntityId: 'attendanceapp.attendance_rule',
        id: 'load',
      },
      removeControlAction: {
        appDEMethodId: 'remove',
        appDataEntityId: 'attendanceapp.attendance_rule',
        id: 'remove',
      },
      updateControlAction: {
        appDEMethodId: 'update',
        appDataEntityId: 'attendanceapp.attendance_rule',
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
                  layout: {
                    columnCount: 24,
                    layout: 'TABLE_24COL',
                  },
                  deformDetails: [
                    {
                      dataType: 25,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'name',
                      editor: {
                        maxLength: 255,
                        editorType: 'TEXTBOX',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'name',
                      },
                      capLanguageRes: {
                        lanResTag: 'DEF.LNAME.ATTENDANCE_RULE.NAME',
                      },
                      caption: '考勤规则名称',
                      codeName: 'name',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        colLG: 10,
                        colMD: 10,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'name',
                    },
                    {
                      dataType: 25,
                      enableCond: 3,
                      ignoreInput: 3,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'schedule_type',
                      editor: {
                        halign: 'LEFT',
                        valign: 'MIDDLE',
                        wrapMode: 'NOWRAP',
                        appCodeListId:
                          'attendanceapp.attendance__all_schedule_type',
                        editorType: 'SPAN',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'schedule_type',
                      },
                      allowEmpty: true,
                      convertToCodeItemText: true,
                      capLanguageRes: {
                        lanResTag: 'DEF.LNAME.ATTENDANCE_RULE.SCHEDULE_TYPE',
                      },
                      caption: '班次类型',
                      codeName: 'schedule_type',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        colLG: 15,
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'schedule_type',
                    },
                    {
                      layout: {
                        columnCount: 24,
                        layout: 'TABLE_24COL',
                      },
                      deformDetails: [
                        {
                          contentControl: {
                            createControlAction: {
                              appDEMethodId: 'create',
                              appDataEntityId:
                                'attendanceapp.attendance_group_shift',
                              id: 'create',
                            },
                            getDraftFromControlAction: {
                              appDataEntityId:
                                'attendanceapp.attendance_group_shift',
                              id: 'loaddraftfrom',
                            },
                            getDraftControlAction: {
                              appDEMethodId: 'get_draft',
                              appDataEntityId:
                                'attendanceapp.attendance_group_shift',
                              id: 'loaddraft',
                            },
                            getControlAction: {
                              appDEMethodId: 'get',
                              appDataEntityId:
                                'attendanceapp.attendance_group_shift',
                              id: 'load',
                            },
                            removeControlAction: {
                              appDEMethodId: 'remove',
                              appDataEntityId:
                                'attendanceapp.attendance_group_shift',
                              id: 'remove',
                            },
                            updateControlAction: {
                              appDEMethodId: 'update',
                              appDataEntityId:
                                'attendanceapp.attendance_group_shift',
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
                                        layout: {
                                          columnCount: 24,
                                          layout: 'TABLE_24COL',
                                        },
                                        deformDetails: [
                                          {
                                            appViewId:
                                              'attendanceapp.attendance_group_shift_member_grid_view',
                                            navigateContexts: [
                                              {
                                                key: 'RULE_ID',
                                                value: 'rule',
                                                name: 'RULE_ID',
                                                id: 'rule_id',
                                              },
                                              {
                                                key: 'ATTENDANCE_GROUP',
                                                value: 'id',
                                                name: 'ATTENDANCE_GROUP',
                                                id: 'attendance_group',
                                              },
                                            ],
                                            navigateParams: [
                                              {
                                                key: 'n_group_id_eq',
                                                value: 'id',
                                                id: 'n_group_id_eq',
                                              },
                                              {
                                                key: 'attendance_group',
                                                value: 'id',
                                                id: 'attendance_group',
                                              },
                                              {
                                                key: 'srfaddconditions',
                                                value: 'true',
                                                rawValue: true,
                                                id: 'srfaddconditions',
                                              },
                                            ],
                                            parentDataJO: {
                                              SRFPARENTTYPE: 'DER1N',
                                              srfparentdename:
                                                'ATTENDANCE_GROUP_SHIFT',
                                              srfparentmode:
                                                'DER1N_ATTENDANCE_GROUP_SHIFT_MEMBER_ATTENDANCE_GROUP_SHIFT_GROUP_ID',
                                              srfparentdefname: 'GROUP_ID',
                                              SRFDER1NID:
                                                'DER1N_ATTENDANCE_GROUP_SHIFT_MEMBER_ATTENDANCE_GROUP_SHIFT_GROUP_ID',
                                            },
                                            caption: '考勤人员',
                                            codeName: 'druipart1',
                                            detailStyle: 'DEFAULT',
                                            detailType: 'DRUIPART',
                                            layoutPos: {
                                              colLG: 15,
                                              colMD: 24,
                                              layout: 'TABLE_24COL',
                                            },
                                            showCaption: true,
                                            id: 'druipart1',
                                          },
                                        ],
                                        codeName: 'grouppanel1',
                                        detailStyle: 'DEFAULT',
                                        detailType: 'GROUPPANEL',
                                        layoutPos: {
                                          colMD: 24,
                                          layout: 'TABLE_24COL',
                                        },
                                        id: 'grouppanel1',
                                      },
                                    ],
                                    capLanguageRes: {
                                      lanResTag:
                                        'CONTROL.DEFORM.ATTENDANCE_GROUP_SHIFT.MAIN.GROUPPANEL.GROUP1',
                                    },
                                    caption: '组排班基本信息',
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
                                      lanResTag:
                                        'DEF.LNAME.ATTENDANCE_GROUP_SHIFT.ID',
                                    },
                                    caption: '主键',
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
                                    'CONTROL.DEFORM.ATTENDANCE_GROUP_SHIFT.MAIN.FORMPAGE.FORMPAGE1',
                                },
                                caption: '基本信息',
                                codeName: 'formpage1',
                                detailStyle: 'DEFAULT',
                                detailType: 'FORMPAGE',
                                id: 'formpage1',
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
                            codeName: 'no_required',
                            controlType: 'FORM',
                            logicName: '免考勤编辑表单',
                            appDataEntityId:
                              'attendanceapp.attendance_group_shift',
                            controlParam: {},
                            modelId: '6af8ec6d6e48d652be62a97d4f764c68',
                            modelType: 'PSDEFORM_EDITFORM',
                            name: 'attendance_group_shifts1_form',
                            id: 'attendanceapp.attendance_group_shift.no_required',
                          },
                          contentType: 'FORM',
                          layout: {
                            columnCount: 24,
                            layout: 'TABLE_24COL',
                          },
                          codeName: 'attendance_group_shifts1',
                          detailStyle: 'DEFAULT',
                          detailType: 'MDCTRL',
                          layoutPos: {
                            colLG: 20,
                            colMD: 20,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'attendance_group_shifts1',
                        },
                      ],
                      codeName: 'grouppanel2',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel2',
                    },
                  ],
                  codeName: 'grouppanel1',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  layoutPos: {
                    colLG: 18,
                    colLGOffset: 3,
                    colMD: 18,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel1',
                },
              ],
              caption: '考勤规则基本信息',
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
                lanResTag: 'DEF.LNAME.ATTENDANCE_RULE.ID',
              },
              caption: '主键',
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
          caption: '基本信息',
          codeName: 'formpage1',
          detailStyle: 'DEFAULT',
          detailType: 'FORMPAGE',
          id: 'formpage1',
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
      codeName: 'main3',
      controlType: 'FORM',
      logicName: '免考勤规则编辑视图_表单',
      appDataEntityId: 'attendanceapp.attendance_rule',
      controlParam: {
        id: 'form',
      },
      modelId: '69db0d7c42abed620bb25886a25120d1',
      modelType: 'PSDEFORM_EDITFORM',
      name: 'form',
      id: 'attendanceapp.attendance_rule.main3',
    },
    {
      codeName: 'no_required_edit_view_datainfobar',
      controlType: 'DATAINFOBAR',
      appDataEntityId: 'attendanceapp.attendance_rule',
      controlParam: {
        id: 'datainfobar',
      },
      name: 'datainfobar',
      id: 'no_required_edit_view_datainfobar',
    },
    {
      caption: '免考勤规则',
      codeName: 'no_required_edit_view_captionbar',
      controlType: 'CAPTIONBAR',
      appDataEntityId: 'attendanceapp.attendance_rule',
      controlParam: {},
      name: 'captionbar',
      id: 'no_required_edit_view_captionbar',
    },
  ],
  sysCss: {
    cssName: 'no_rule_form_style',
  },
  viewLayoutPanel: {
    layoutBodyOnly: true,
    useDefaultLayout: true,
    layoutPanel: true,
    codeName: 'layoutpanel',
    controlStyle: 'APPDEEDITVIEW',
    controlType: 'VIEWLAYOUTPANEL',
    appDataEntityId: 'attendanceapp.attendance_rule',
    controlParam: {},
    id: 'layoutpanel',
  },
  title: '免考勤规则',
  viewStyle: 'DEFAULT',
  viewType: 'DEEDITVIEW',
  enableDP: true,
  showCaptionBar: true,
  modelId: '74ec752c9fca7f9f113071edae6e20cf',
  modelType: 'PSAPPDEVIEW',
  name: 'attendance_ruleNoRequiredEditView',
  id: 'attendanceapp.attendance_rule_no_required_edit_view',
};
