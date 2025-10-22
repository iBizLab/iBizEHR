export default {
  enableDirtyChecking: true,
  showDataInfoBar: true,
  xdataControlName: 'form',
  loadDefault: true,
  funcViewMode: 'EDITVIEW',
  openMode: 'INDEXVIEWTAB',
  deviewCodeName: 'EditView',
  deviewId: 'c1d32779107c6ace1d58c9b88538db84',
  accUserMode: 2,
  caption: '考勤规则',
  codeName: 'attendance_rule_edit_view',
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
      deformItemUpdates: [
        {
          codeName: 'UpdateWorkRest',
          scriptCode:
            'console.log("更新上A休B工作日")\r\n// 获取所有临时数据进行删除    \r\nconst serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\nconst workDayService = await serviceUtil.getService(context, \'attendanceapp.attendance_workday\');\r\nconst workdays = workDayService.local.getList(context);\r\nworkdays.forEach(day => {\r\n    workDayService.removeTemp(context, day);\r\n})\r\nvar realData = ctrl.getReal();\r\nvar _data = realData[0]\r\nvar work = parseInt(_data.work) || 0;\r\nvar rest = parseInt(_data.rest) || 0;\r\nvar num = work + rest;\r\nvar _workdays = [];\r\nfor (var i = 1; i < num + 1; i++) {\r\n    var workday = {\r\n        name: "第" + i + "天",\r\n        day_number: i,\r\n        title: "工作/休息"\r\n    }\r\n    _workdays.push(workday)\r\n}\r\nconst result = await workDayService.createTemp(context, _workdays);\r\nif (result) {\r\n    _workdays = result.data;\r\n    console.log(\'临时数据创建成功:\', _workdays);\r\n}\r\nvar druipart8 = ctrl.formDruipart.find(item => item.model.codeName === "druipart8")\r\n// 刷新druiPart8关系界面\r\nif (druipart8) {\r\n    druipart8?.embedView?.callUIAction(\'Refresh\');\r\n}',
          customCode: true,
          showBusyIndicator: true,
          name: '更新上A休B工作日',
          id: 'updateworkrest',
        },
        {
          codeName: 'refreshCalendar',
          defiupdateDetails: [
            {
              id: 'formitem',
            },
          ],
          scriptCode:
            'console.log("数据变更刷新日历"+ctrl)\r\n// ctrl.details.formitem.refresh()\r\nconst calendar = ctrl.formItems.find(item => item.name ==="formitem")\r\nif(calendar){\r\n    calendar.editor.refresh()\r\n}\r\n',
          customCode: true,
          showBusyIndicator: true,
          name: '日历刷新',
          id: 'refreshcalendar',
        },
        {
          codeName: 'UpdateDefaultShifts',
          scriptCode:
            'console.log("自由班更新默认班次1")\r\n\r\nconst serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\nconst service = await serviceUtil.getService(context, \'attendanceapp.attendance_shift\');\r\nconst list = service.local.getList(context);\r\nconst defaultShift = list.find(item =>item.default_flag == 1 );\r\n\r\nif( defaultShift != null){\r\n    var realData = ctrl.getReal();\r\nvar _data = realData[0]\r\n    const scope = defaultShift.scopes[0];\r\n    scope.start_base_time = _data.free_start;\r\n    scope.end_base_time = _data.free_end;\r\n    service.updateTemp(context, defaultShift);\r\n}',
          customCode: true,
          showBusyIndicator: true,
          name: '自由班更新默认班次',
          id: 'updatedefaultshifts',
        },
      ],
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
                    {
                      dataType: 5,
                      enableCond: 3,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'effect_time',
                      editor: {
                        editorType: 'HIDDEN',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'effect_time',
                      },
                      valueFormat: 'YYYY-MM-DD HH:mm:ss',
                      allowEmpty: true,
                      hidden: true,
                      caption: '生效时间',
                      codeName: 'effect_time',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'effect_time',
                    },
                    {
                      dataType: 25,
                      enableCond: 3,
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
                      caption: '规则名称',
                      codeName: 'name',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        colLG: 10,
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'name',
                    },
                    {
                      dataType: 25,
                      enableCond: 3,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'default_shift',
                      editor: {
                        editorType: 'HIDDEN',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'default_shift',
                      },
                      allowEmpty: true,
                      hidden: true,
                      caption: '默认班次标识',
                      codeName: 'default_shift',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'default_shift',
                    },
                    {
                      dataType: 25,
                      enableCond: 3,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'schedule_type',
                      editor: {
                        appCodeListId:
                          'attendanceapp.attendance__schedule_type',
                        editorType: 'RADIOBUTTONLIST',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'schedule_type',
                      },
                      needCodeListConfig: true,
                      capLanguageRes: {
                        lanResTag: 'DEF.LNAME.ATTENDANCE_RULE.SCHEDULE_TYPE',
                      },
                      caption: '班次类型',
                      codeName: 'schedule_type',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      defdgroupLogics: [
                        {
                          logicCat: 'ITEMENABLE',
                          relatedDetailNames: ['id'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'ISNULL',
                              defdname: 'id',
                              logicType: 'SINGLE',
                              name: 'id值为空(Nil)',
                              id: 'id值为空(nil)',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
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
                          rawItem: {
                            caption:
                              'Tip：考勤规则内所有员工考勤时间与休息时间相同',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'form-type-tooltip',
                            },
                            id: 'rawitem13',
                          },
                          codeName: 'rawitem13',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'fixed',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) fixed',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          sysCss: {
                            cssName: 'form-type-tooltip',
                          },
                          showCaption: true,
                          id: 'rawitem13',
                        },
                        {
                          rawItem: {
                            caption:
                              'Tip：每天有多组人轮班，按周期循环；适用于制造业、医院等行业',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'form-type-tooltip',
                            },
                            id: 'rawitem14',
                          },
                          codeName: 'rawitem14',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'class_inversion',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) class_inversion',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          sysCss: {
                            cssName: 'form-type-tooltip',
                          },
                          showCaption: true,
                          id: 'rawitem14',
                        },
                        {
                          rawItem: {
                            caption:
                              'Tip：工作A天，休息B天，每天上班时间相同，按周期进行循环，适用于服务业等',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'form-type-tooltip',
                            },
                            id: 'rawitem15',
                          },
                          codeName: 'rawitem15',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'work_rest',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) work_rest',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          sysCss: {
                            cssName: 'form-type-tooltip',
                          },
                          showCaption: true,
                          id: 'rawitem15',
                        },
                        {
                          rawItem: {
                            caption:
                              'Tip：可根据企业需求设置员工每天只打上班卡，下班卡，或上下班时间内任意打卡一次',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'form-type-tooltip',
                            },
                            id: 'rawitem16',
                          },
                          codeName: 'rawitem16',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'flexible',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) flexible',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          sysCss: {
                            cssName: 'form-type-tooltip',
                          },
                          showCaption: true,
                          id: 'rawitem16',
                        },
                        {
                          rawItem: {
                            caption:
                              'Tip：可根据企业需求设置大小周，大周小周休息时间自定义',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'form-type-tooltip',
                            },
                            id: 'rawitem17',
                          },
                          codeName: 'rawitem17',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'alternate_week',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) alternate_week',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          sysCss: {
                            cssName: 'form-type-tooltip',
                          },
                          showCaption: true,
                          id: 'rawitem17',
                        },
                        {
                          rawItem: {
                            caption:
                              'Tip：自定义设置每个员工的班次，可随时进行排班调整',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'form-type-tooltip',
                            },
                            id: 'rawitem18',
                          },
                          codeName: 'rawitem18',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'manual',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) manual',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          sysCss: {
                            cssName: 'form-type-tooltip',
                          },
                          showCaption: true,
                          id: 'rawitem18',
                        },
                        {
                          rawItem: {
                            caption:
                              'Tip：上下班时间不固定，可随时打卡，按小时计算工资',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'form-type-tooltip',
                            },
                            id: 'rawitem19',
                          },
                          codeName: 'rawitem19',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'free',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) free',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          sysCss: {
                            cssName: 'form-type-tooltip',
                          },
                          showCaption: true,
                          id: 'rawitem19',
                        },
                      ],
                      codeName: 'grouppanel31',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel31',
                    },
                    {
                      layout: {
                        columnCount: 24,
                        layout: 'TABLE_24COL',
                      },
                      deformDetails: [
                        {
                          layout: {
                            align: 'flex-start',
                            dir: 'row',
                            layout: 'FLEX',
                          },
                          deformDetails: [
                            {
                              createDV: '2',
                              dataType: 9,
                              enableCond: 3,
                              ignoreInput: 4,
                              labelPos: 'LEFT',
                              labelWidth: 130,
                              noPrivDisplayMode: 1,
                              appDEFieldId: 'inversion_count',
                              editor: {
                                appCodeListId:
                                  'attendanceapp.attendance__inversion_count',
                                editorType: 'RADIOBUTTONLIST',
                                valueType: 'SIMPLE',
                                editable: true,
                                id: 'inversion_count',
                              },
                              allowEmpty: true,
                              needCodeListConfig: true,
                              caption: '单个工作日',
                              codeName: 'inversion_count',
                              detailStyle: 'DEFAULT',
                              detailType: 'FORMITEM',
                              defdgroupLogics: [
                                {
                                  logicCat: 'ITEMENABLE',
                                  relatedDetailNames: ['schedule_type'],
                                  groupOP: 'AND',
                                  defdlogics: [
                                    {
                                      condOP: 'EQ',
                                      defdname: 'schedule_type',
                                      value: 'class_inversion',
                                      logicType: 'SINGLE',
                                      id: 'schedule_type等于(=) class_inversion',
                                    },
                                  ],
                                  logicType: 'GROUP',
                                },
                              ],
                              layoutPos: {
                                shrink: 1,
                                layout: 'FLEX',
                              },
                              showCaption: true,
                              id: 'inversion_count',
                            },
                            {
                              rawItem: {
                                caption:
                                  'Tip：修改班次信息后原来的人员排班信息将会清空，需要重新设置考勤人员',
                                halign: 'LEFT',
                                valign: 'MIDDLE',
                                wrapMode: 'NOWRAP',
                                contentType: 'RAW',
                                sysCss: {
                                  cssName: 'form-tooltip',
                                },
                                id: 'rawitem11',
                              },
                              codeName: 'rawitem11',
                              detailStyle: 'DEFAULT',
                              detailType: 'RAWITEM',
                              layoutPos: {
                                shrink: 1,
                                layout: 'FLEX',
                              },
                              sysCss: {
                                cssName: 'form-tooltip',
                              },
                              showCaption: true,
                              id: 'rawitem11',
                            },
                          ],
                          codeName: 'grouppanel29',
                          detailStyle: 'DEFAULT',
                          detailType: 'GROUPPANEL',
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          id: 'grouppanel29',
                        },
                        {
                          maskMode: 0,
                          appViewId:
                            'attendanceapp.attendance_shift_inversion_grid_view',
                          navigateContexts: [
                            {
                              key: 'SCHEDULE_TYPE',
                              value: 'schedule_type',
                              name: 'SCHEDULE_TYPE',
                              id: 'schedule_type',
                            },
                          ],
                          parentDataJO: {
                            SRFPARENTTYPE: 'DER1N',
                            srfparentdename: 'ATTENDANCE_RULE',
                            srfparentmode:
                              'DER1N_ATTENDANCE_SHIFT_ATTENDANCE_RULE_RULE_ID',
                            srfparentdefname: 'RULE_ID',
                            SRFDER1NID:
                              'DER1N_ATTENDANCE_SHIFT_ATTENDANCE_RULE_RULE_ID',
                          },
                          codeName: 'druipart13',
                          detailStyle: 'DEFAULT',
                          detailType: 'DRUIPART',
                          layoutPos: {
                            colLG: 12,
                            colLGOffset: 1,
                            colMD: 12,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'druipart13',
                        },
                        {
                          createDV: '1',
                          dataType: 9,
                          enableCond: 3,
                          ignoreInput: 4,
                          labelPos: 'LEFT',
                          labelWidth: 130,
                          noPrivDisplayMode: 1,
                          appDEFieldId: 'same_restday',
                          editor: {
                            appCodeListId:
                              'attendanceapp.attendance__same_restday',
                            editorType: 'RADIOBUTTONLIST',
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'same_restday',
                          },
                          allowEmpty: true,
                          needCodeListConfig: true,
                          caption: '休息日',
                          codeName: 'same_restday',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'ITEMENABLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'class_inversion',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) class_inversion',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'same_restday',
                        },
                        {
                          rawItem: {
                            caption:
                              'Tip：休息日相同：员工均为同一天休息；休息日不同：员工休息日不同',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'form-item-tooltip',
                            },
                            id: 'rawitem5',
                          },
                          codeName: 'rawitem5',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          sysCss: {
                            cssName: 'form-item-tooltip',
                          },
                          showCaption: true,
                          id: 'rawitem5',
                        },
                        {
                          layout: {
                            columnCount: 24,
                            layout: 'TABLE_24COL',
                          },
                          deformDetails: [
                            {
                              createDV: '2',
                              dataType: 9,
                              enableCond: 3,
                              ignoreInput: 4,
                              labelPos: 'LEFT',
                              labelWidth: 130,
                              noPrivDisplayMode: 1,
                              appDEFieldId: 'inversion_cycle',
                              editor: {
                                singleSelect: true,
                                appCodeListId:
                                  'attendanceapp.attendance__cycleweeks',
                                editorParams: {
                                  customprops: '{"clearable":false}',
                                },
                                editorType: 'DROPDOWNLIST',
                                valueType: 'SIMPLE',
                                editable: true,
                                id: 'inversion_cycle',
                              },
                              allowEmpty: true,
                              needCodeListConfig: true,
                              caption: '循环周期',
                              codeName: 'inversion_cycle',
                              detailStyle: 'DEFAULT',
                              detailType: 'FORMITEM',
                              defdgroupLogics: [
                                {
                                  logicCat: 'ITEMENABLE',
                                  relatedDetailNames: ['schedule_type'],
                                  groupOP: 'AND',
                                  defdlogics: [
                                    {
                                      condOP: 'EQ',
                                      defdname: 'schedule_type',
                                      value: 'class_inversion',
                                      logicType: 'SINGLE',
                                      id: 'schedule_type等于(=) class_inversion',
                                    },
                                  ],
                                  logicType: 'GROUP',
                                },
                              ],
                              layoutPos: {
                                colLG: 8,
                                colMD: 8,
                                layout: 'TABLE_24COL',
                              },
                              showCaption: true,
                              id: 'inversion_cycle',
                            },
                            {
                              deformTabPages: [
                                {
                                  layout: {
                                    columnCount: 24,
                                    layout: 'TABLE_24COL',
                                  },
                                  deformDetails: [
                                    {
                                      dataType: 25,
                                      enableCond: 3,
                                      ignoreInput: 4,
                                      labelPos: 'LEFT',
                                      labelWidth: 130,
                                      noPrivDisplayMode: 1,
                                      appDEFieldId: 'week1',
                                      editor: {
                                        appCodeListId:
                                          'attendanceapp.attendance__week1',
                                        editorType: 'CHECKBOXLIST',
                                        valueType: 'SIMPLE',
                                        editable: true,
                                        id: 'inversion_week1',
                                      },
                                      allowEmpty: true,
                                      needCodeListConfig: true,
                                      caption: '工作日',
                                      codeName: 'inversion_week1',
                                      detailStyle: 'DEFAULT',
                                      detailType: 'FORMITEM',
                                      defdgroupLogics: [
                                        {
                                          logicCat: 'ITEMENABLE',
                                          relatedDetailNames: ['schedule_type'],
                                          groupOP: 'AND',
                                          defdlogics: [
                                            {
                                              condOP: 'EQ',
                                              defdname: 'schedule_type',
                                              value: 'class_inversion',
                                              logicType: 'SINGLE',
                                              id: 'schedule_type等于(=) class_inversion',
                                            },
                                          ],
                                          logicType: 'GROUP',
                                        },
                                      ],
                                      layoutPos: {
                                        colMD: 24,
                                        layout: 'TABLE_24COL',
                                      },
                                      showCaption: true,
                                      id: 'inversion_week1',
                                    },
                                    {
                                      maskMode: 0,
                                      appViewId:
                                        'attendanceapp.attendance_workday_inversion_grid_view',
                                      parentDataJO: {
                                        SRFPARENTTYPE: 'DER1N',
                                        srfparentdename: 'ATTENDANCE_RULE',
                                        srfparentmode:
                                          'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                        srfparentdefname: 'RULE_ID',
                                        SRFDER1NID:
                                          'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                      },
                                      refreshItems:
                                        'inversion_cycle;inversion_count;same_restday',
                                      codeName: 'druipart9',
                                      detailStyle: 'DEFAULT',
                                      detailType: 'DRUIPART',
                                      layoutPos: {
                                        colLG: 14,
                                        colMD: 14,
                                        layout: 'TABLE_24COL',
                                      },
                                      showCaption: true,
                                      id: 'druipart9',
                                    },
                                  ],
                                  caption: '第1周',
                                  codeName: 'tabpage3',
                                  detailStyle: 'DEFAULT',
                                  detailType: 'TABPAGE',
                                  showCaption: true,
                                  id: 'tabpage3',
                                },
                                {
                                  layout: {
                                    columnCount: 24,
                                    layout: 'TABLE_24COL',
                                  },
                                  deformDetails: [
                                    {
                                      dataType: 25,
                                      enableCond: 3,
                                      ignoreInput: 4,
                                      labelPos: 'LEFT',
                                      labelWidth: 130,
                                      noPrivDisplayMode: 1,
                                      appDEFieldId: 'week2',
                                      editor: {
                                        appCodeListId:
                                          'attendanceapp.attendance__week2',
                                        editorType: 'CHECKBOXLIST',
                                        valueType: 'SIMPLE',
                                        editable: true,
                                        id: 'inversion_week2',
                                      },
                                      allowEmpty: true,
                                      needCodeListConfig: true,
                                      caption: '工作日',
                                      codeName: 'inversion_week2',
                                      detailStyle: 'DEFAULT',
                                      detailType: 'FORMITEM',
                                      defdgroupLogics: [
                                        {
                                          logicCat: 'ITEMENABLE',
                                          relatedDetailNames: [
                                            'schedule_type',
                                            'inversion_cycle',
                                          ],
                                          groupOP: 'AND',
                                          defdlogics: [
                                            {
                                              condOP: 'EQ',
                                              defdname: 'schedule_type',
                                              value: 'class_inversion',
                                              logicType: 'SINGLE',
                                              id: 'schedule_type等于(=) class_inversion',
                                            },
                                            {
                                              condOP: 'GTANDEQ',
                                              defdname: 'inversion_cycle',
                                              value: '2',
                                              logicType: 'SINGLE',
                                              id: 'inversion_cycle大于等于(>=) 2',
                                            },
                                          ],
                                          logicType: 'GROUP',
                                        },
                                      ],
                                      layoutPos: {
                                        colMD: 24,
                                        layout: 'TABLE_24COL',
                                      },
                                      showCaption: true,
                                      id: 'inversion_week2',
                                    },
                                    {
                                      maskMode: 0,
                                      appViewId:
                                        'attendanceapp.attendance_workday_inversion_week2_grid_view',
                                      parentDataJO: {
                                        SRFPARENTTYPE: 'DER1N',
                                        srfparentdename: 'ATTENDANCE_RULE',
                                        srfparentmode:
                                          'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                        srfparentdefname: 'RULE_ID',
                                        SRFDER1NID:
                                          'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                      },
                                      refreshItems:
                                        'inversion_cycle;inversion_count;same_restday',
                                      codeName: 'druipart10',
                                      detailStyle: 'DEFAULT',
                                      detailType: 'DRUIPART',
                                      layoutPos: {
                                        colLG: 12,
                                        colMD: 12,
                                        layout: 'TABLE_24COL',
                                      },
                                      showCaption: true,
                                      id: 'druipart10',
                                    },
                                  ],
                                  caption: '第2周',
                                  codeName: 'tabpage4',
                                  detailStyle: 'DEFAULT',
                                  detailType: 'TABPAGE',
                                  defdgroupLogics: [
                                    {
                                      logicCat: 'PANELVISIBLE',
                                      relatedDetailNames: ['inversion_cycle'],
                                      groupOP: 'AND',
                                      defdlogics: [
                                        {
                                          condOP: 'ISNOTNULL',
                                          defdname: 'inversion_cycle',
                                          logicType: 'SINGLE',
                                          name: 'inversion_cycle值不为空(NotNil)',
                                          id: 'inversion_cycle值不为空(notnil)',
                                        },
                                        {
                                          condOP: 'GTANDEQ',
                                          defdname: 'inversion_cycle',
                                          value: '2',
                                          logicType: 'SINGLE',
                                          id: 'inversion_cycle大于等于(>=) 2',
                                        },
                                      ],
                                      logicType: 'GROUP',
                                    },
                                  ],
                                  showCaption: true,
                                  id: 'tabpage4',
                                },
                                {
                                  layout: {
                                    columnCount: 24,
                                    layout: 'TABLE_24COL',
                                  },
                                  deformDetails: [
                                    {
                                      dataType: 25,
                                      enableCond: 3,
                                      ignoreInput: 4,
                                      labelPos: 'LEFT',
                                      labelWidth: 130,
                                      noPrivDisplayMode: 1,
                                      appDEFieldId: 'week3',
                                      editor: {
                                        appCodeListId:
                                          'attendanceapp.attendance__week3',
                                        editorType: 'CHECKBOXLIST',
                                        valueType: 'SIMPLE',
                                        editable: true,
                                        id: 'inversion_week3',
                                      },
                                      allowEmpty: true,
                                      needCodeListConfig: true,
                                      caption: '工作日',
                                      codeName: 'inversion_week3',
                                      detailStyle: 'DEFAULT',
                                      detailType: 'FORMITEM',
                                      defdgroupLogics: [
                                        {
                                          logicCat: 'ITEMENABLE',
                                          relatedDetailNames: [
                                            'schedule_type',
                                            'inversion_cycle',
                                          ],
                                          groupOP: 'AND',
                                          defdlogics: [
                                            {
                                              condOP: 'EQ',
                                              defdname: 'schedule_type',
                                              value: 'class_inversion',
                                              logicType: 'SINGLE',
                                              id: 'schedule_type等于(=) class_inversion',
                                            },
                                            {
                                              condOP: 'GTANDEQ',
                                              defdname: 'inversion_cycle',
                                              value: '3',
                                              logicType: 'SINGLE',
                                              id: 'inversion_cycle大于等于(>=) 3',
                                            },
                                          ],
                                          logicType: 'GROUP',
                                        },
                                      ],
                                      layoutPos: {
                                        colMD: 24,
                                        layout: 'TABLE_24COL',
                                      },
                                      showCaption: true,
                                      id: 'inversion_week3',
                                    },
                                    {
                                      maskMode: 0,
                                      appViewId:
                                        'attendanceapp.attendance_workday_inversion_week3_grid_view',
                                      parentDataJO: {
                                        SRFPARENTTYPE: 'DER1N',
                                        srfparentdename: 'ATTENDANCE_RULE',
                                        srfparentmode:
                                          'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                        srfparentdefname: 'RULE_ID',
                                        SRFDER1NID:
                                          'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                      },
                                      refreshItems:
                                        'inversion_cycle;inversion_count;same_restday',
                                      codeName: 'druipart11',
                                      detailStyle: 'DEFAULT',
                                      detailType: 'DRUIPART',
                                      layoutPos: {
                                        colLG: 12,
                                        colMD: 12,
                                        layout: 'TABLE_24COL',
                                      },
                                      showCaption: true,
                                      id: 'druipart11',
                                    },
                                  ],
                                  caption: '第3周',
                                  codeName: 'tabpage5',
                                  detailStyle: 'DEFAULT',
                                  detailType: 'TABPAGE',
                                  defdgroupLogics: [
                                    {
                                      logicCat: 'PANELVISIBLE',
                                      relatedDetailNames: ['inversion_cycle'],
                                      groupOP: 'AND',
                                      defdlogics: [
                                        {
                                          condOP: 'ISNOTNULL',
                                          defdname: 'inversion_cycle',
                                          logicType: 'SINGLE',
                                          name: 'inversion_cycle值不为空(NotNil)',
                                          id: 'inversion_cycle值不为空(notnil)',
                                        },
                                        {
                                          condOP: 'GTANDEQ',
                                          defdname: 'inversion_cycle',
                                          value: '3',
                                          logicType: 'SINGLE',
                                          id: 'inversion_cycle大于等于(>=) 3',
                                        },
                                      ],
                                      logicType: 'GROUP',
                                    },
                                  ],
                                  showCaption: true,
                                  id: 'tabpage5',
                                },
                                {
                                  layout: {
                                    columnCount: 24,
                                    layout: 'TABLE_24COL',
                                  },
                                  deformDetails: [
                                    {
                                      dataType: 25,
                                      enableCond: 3,
                                      ignoreInput: 4,
                                      labelPos: 'LEFT',
                                      labelWidth: 130,
                                      noPrivDisplayMode: 1,
                                      appDEFieldId: 'week4',
                                      editor: {
                                        appCodeListId:
                                          'attendanceapp.attendance__week4',
                                        editorType: 'CHECKBOXLIST',
                                        valueType: 'SIMPLE',
                                        editable: true,
                                        id: 'inversion_week4',
                                      },
                                      allowEmpty: true,
                                      needCodeListConfig: true,
                                      caption: '工作日',
                                      codeName: 'inversion_week4',
                                      detailStyle: 'DEFAULT',
                                      detailType: 'FORMITEM',
                                      defdgroupLogics: [
                                        {
                                          logicCat: 'ITEMENABLE',
                                          relatedDetailNames: [
                                            'schedule_type',
                                            'inversion_cycle',
                                          ],
                                          groupOP: 'AND',
                                          defdlogics: [
                                            {
                                              condOP: 'EQ',
                                              defdname: 'schedule_type',
                                              value: 'class_inversion',
                                              logicType: 'SINGLE',
                                              id: 'schedule_type等于(=) class_inversion',
                                            },
                                            {
                                              condOP: 'EQ',
                                              defdname: 'inversion_cycle',
                                              value: '4',
                                              logicType: 'SINGLE',
                                              id: 'inversion_cycle等于(=) 4',
                                            },
                                          ],
                                          logicType: 'GROUP',
                                        },
                                      ],
                                      layoutPos: {
                                        colMD: 24,
                                        layout: 'TABLE_24COL',
                                      },
                                      showCaption: true,
                                      id: 'inversion_week4',
                                    },
                                    {
                                      maskMode: 0,
                                      appViewId:
                                        'attendanceapp.attendance_workday_inversion_week4_grid_view',
                                      parentDataJO: {
                                        SRFPARENTTYPE: 'DER1N',
                                        srfparentdename: 'ATTENDANCE_RULE',
                                        srfparentmode:
                                          'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                        srfparentdefname: 'RULE_ID',
                                        SRFDER1NID:
                                          'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                      },
                                      refreshItems:
                                        'inversion_cycle;inversion_count;same_restday',
                                      codeName: 'druipart12',
                                      detailStyle: 'DEFAULT',
                                      detailType: 'DRUIPART',
                                      layoutPos: {
                                        colLG: 12,
                                        colMD: 12,
                                        layout: 'TABLE_24COL',
                                      },
                                      showCaption: true,
                                      id: 'druipart12',
                                    },
                                  ],
                                  caption: '第4周',
                                  codeName: 'tabpage6',
                                  detailStyle: 'DEFAULT',
                                  detailType: 'TABPAGE',
                                  defdgroupLogics: [
                                    {
                                      logicCat: 'PANELVISIBLE',
                                      relatedDetailNames: ['inversion_cycle'],
                                      groupOP: 'AND',
                                      defdlogics: [
                                        {
                                          condOP: 'ISNOTNULL',
                                          defdname: 'inversion_cycle',
                                          logicType: 'SINGLE',
                                          name: 'inversion_cycle值不为空(NotNil)',
                                          id: 'inversion_cycle值不为空(notnil)',
                                        },
                                        {
                                          condOP: 'GTANDEQ',
                                          defdname: 'inversion_cycle',
                                          value: '4',
                                          logicType: 'SINGLE',
                                          id: 'inversion_cycle大于等于(>=) 4',
                                        },
                                      ],
                                      logicType: 'GROUP',
                                    },
                                  ],
                                  showCaption: true,
                                  id: 'tabpage6',
                                },
                              ],
                              codeName: 'tabpanel2',
                              detailStyle: 'DEFAULT',
                              detailType: 'TABPANEL',
                              defdgroupLogics: [
                                {
                                  logicCat: 'PANELVISIBLE',
                                  relatedDetailNames: ['schedule_type'],
                                  groupOP: 'AND',
                                  defdlogics: [
                                    {
                                      condOP: 'EQ',
                                      defdname: 'schedule_type',
                                      value: 'class_inversion',
                                      logicType: 'SINGLE',
                                      id: 'schedule_type等于(=) class_inversion',
                                    },
                                  ],
                                  logicType: 'GROUP',
                                },
                              ],
                              layoutPos: {
                                colLG: 20,
                                colLGOffset: 1,
                                colMD: 20,
                                layout: 'TABLE_24COL',
                              },
                              id: 'tabpanel2',
                            },
                          ],
                          codeName: 'grouppanel13',
                          detailStyle: 'DEFAULT',
                          detailType: 'GROUPPANEL',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['same_restday'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'same_restday',
                                  value: '1',
                                  logicType: 'SINGLE',
                                  id: 'same_restday等于(=) 1',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          id: 'grouppanel13',
                        },
                        {
                          layout: {
                            columnCount: 24,
                            layout: 'TABLE_24COL',
                          },
                          deformDetails: [
                            {
                              createDV: '7',
                              dataType: 9,
                              enableCond: 3,
                              ignoreInput: 4,
                              labelPos: 'LEFT',
                              labelWidth: 130,
                              noPrivDisplayMode: 1,
                              appDEFieldId: 'inversion_days',
                              editor: {
                                singleSelect: true,
                                appCodeListId: 'attendanceapp.cycledays',
                                editorParams: {
                                  customprops:
                                    '{"clearable":false,"activeChange":false}',
                                },
                                editorType: 'DROPDOWNLIST',
                                valueType: 'SIMPLE',
                                editable: true,
                                id: 'inversion_days',
                              },
                              updateDV: '7',
                              allowEmpty: true,
                              needCodeListConfig: true,
                              caption: '循环天数',
                              codeName: 'inversion_days',
                              detailStyle: 'DEFAULT',
                              detailType: 'FORMITEM',
                              layoutPos: {
                                colLG: 8,
                                colMD: 8,
                                layout: 'TABLE_24COL',
                              },
                              showCaption: true,
                              id: 'inversion_days',
                            },
                            {
                              layout: {
                                columnCount: 24,
                                layout: 'TABLE_24COL',
                              },
                              deformDetails: [
                                {
                                  maskMode: 0,
                                  appViewId:
                                    'attendanceapp.attendance_workday_different_grid_view',
                                  parentDataJO: {
                                    SRFPARENTTYPE: 'DER1N',
                                    srfparentdename: 'ATTENDANCE_RULE',
                                    srfparentmode:
                                      'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                    srfparentdefname: 'RULE_ID',
                                    SRFDER1NID:
                                      'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                  },
                                  codeName: 'druipart14',
                                  detailStyle: 'DEFAULT',
                                  detailType: 'DRUIPART',
                                  defdgroupLogics: [
                                    {
                                      logicCat: 'PANELVISIBLE',
                                      relatedDetailNames: ['same_restday'],
                                      groupOP: 'AND',
                                      defdlogics: [
                                        {
                                          condOP: 'EQ',
                                          defdname: 'same_restday',
                                          value: '0',
                                          logicType: 'SINGLE',
                                          id: 'same_restday等于(=) 0',
                                        },
                                      ],
                                      logicType: 'GROUP',
                                    },
                                  ],
                                  layoutPos: {
                                    colLG: 12,
                                    colLGOffset: 1,
                                    colMD: 12,
                                    layout: 'TABLE_24COL',
                                  },
                                  showCaption: true,
                                  id: 'druipart14',
                                },
                              ],
                              codeName: 'grouppanel18',
                              detailStyle: 'DEFAULT',
                              detailType: 'GROUPPANEL',
                              layoutPos: {
                                colMD: 24,
                                layout: 'TABLE_24COL',
                              },
                              id: 'grouppanel18',
                            },
                          ],
                          codeName: 'grouppanel17',
                          detailStyle: 'DEFAULT',
                          detailType: 'GROUPPANEL',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['same_restday'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'same_restday',
                                  value: '0',
                                  logicType: 'SINGLE',
                                  id: 'same_restday等于(=) 0',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          id: 'grouppanel17',
                        },
                      ],
                      caption: 'N班倒',
                      codeName: 'grouppanel12',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'EQ',
                              defdname: 'schedule_type',
                              value: 'class_inversion',
                              logicType: 'SINGLE',
                              id: 'schedule_type等于(=) class_inversion',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel12',
                    },
                  ],
                  capLanguageRes: {
                    lanResTag:
                      'CONTROL.DEFORM.ATTENDANCE_RULE.MAIN.GROUPPANEL.GROUPPANEL2',
                  },
                  caption: '基础信息',
                  codeName: 'grouppanel2',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  layoutPos: {
                    colLG: 18,
                    colLGOffset: 3,
                    colMD: 24,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel2',
                },
                {
                  layout: {
                    columnCount: 24,
                    layout: 'TABLE_24COL',
                  },
                  deformDetails: [
                    {
                      layout: {
                        align: 'flex-start',
                        dir: 'row',
                        layout: 'FLEX',
                      },
                      deformDetails: [
                        {
                          createDV: '5',
                          dataType: 9,
                          enableCond: 3,
                          ignoreInput: 4,
                          labelPos: 'LEFT',
                          labelWidth: 200,
                          noPrivDisplayMode: 1,
                          appDEFieldId: 'work',
                          editor: {
                            editorParams: {
                              customprops:
                                '{"min":1,"max":31,"clearable":false,"activeChange":false}',
                            },
                            editorType: 'NUMBER',
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'work',
                          },
                          allowEmpty: true,
                          caption: '工作日与休息日：工作',
                          codeName: 'work',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'ITEMENABLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'work_rest',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) work_rest',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                            width: 255,
                            widthMode: 'PX',
                          },
                          showCaption: true,
                          id: 'work',
                        },
                        {
                          createDV: '2',
                          dataType: 9,
                          enableCond: 3,
                          ignoreInput: 4,
                          labelPos: 'LEFT',
                          labelWidth: 70,
                          noPrivDisplayMode: 1,
                          appDEFieldId: 'rest',
                          editor: {
                            editorParams: {
                              customprops:
                                '{"min":1,"max":31,"clearable":false,"activeChange":false}',
                            },
                            editorType: 'NUMBER',
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'rest',
                          },
                          allowEmpty: true,
                          caption: '天，休息',
                          codeName: 'rest',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'ITEMENABLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'work_rest',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) work_rest',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                            width: 130,
                            widthMode: 'PX',
                          },
                          showCaption: true,
                          id: 'rest',
                        },
                        {
                          rawItem: {
                            caption: '天',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'rule_raw_item',
                            },
                            id: 'rawitem6',
                          },
                          codeName: 'rawitem6',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          sysCss: {
                            cssName: 'rule_raw_item',
                          },
                          showCaption: true,
                          id: 'rawitem6',
                        },
                        {
                          rawItem: {
                            caption:
                              'Tip：修改班次信息后原来的人员排班信息将会清空，需要重新设置考勤人员',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'form-tooltip',
                            },
                            id: 'rawitem10',
                          },
                          codeName: 'rawitem10',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          sysCss: {
                            cssName: 'form-tooltip',
                          },
                          showCaption: true,
                          id: 'rawitem10',
                        },
                      ],
                      codeName: 'grouppanel10',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel10',
                    },
                    {
                      layout: {
                        align: 'flex-start',
                        dir: 'row',
                        layout: 'FLEX',
                      },
                      deformDetails: [
                        {
                          dataType: 25,
                          enableCond: 3,
                          labelPos: 'LEFT',
                          labelWidth: 130,
                          noPrivDisplayMode: 1,
                          appDEFieldId: 'work_time',
                          editor: {
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            editorType: 'SPAN',
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'work_time1',
                          },
                          allowEmpty: true,
                          caption: '上下班时间',
                          codeName: 'work_time1',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          showCaption: true,
                          id: 'work_time1',
                        },
                        {
                          actionType: 'UIACTION',
                          buttonStyle: 'DEFAULT',
                          uiactionId: 'opendefaultshit@attendance_rule',
                          tooltip: '修改班次时间',
                          uiactionTarget: 'NONE',
                          caption: '修改班次时间',
                          codeName: 'button2',
                          detailStyle: 'DEFAULT',
                          detailType: 'BUTTON',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'work_rest',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) work_rest',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          sysCss: {
                            cssName: 'edit_default_shift',
                          },
                          showCaption: true,
                          id: 'button2',
                        },
                      ],
                      codeName: 'grouppanel28',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel28',
                    },
                    {
                      layout: {
                        columnCount: 24,
                        layout: 'TABLE_24COL',
                      },
                      deformDetails: [
                        {
                          maskMode: 0,
                          appViewId:
                            'attendanceapp.attendance_workday_work_rest_grid_view',
                          parentDataJO: {
                            SRFPARENTTYPE: 'DER1N',
                            srfparentdename: 'ATTENDANCE_RULE',
                            srfparentmode:
                              'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                            srfparentdefname: 'RULE_ID',
                            SRFDER1NID:
                              'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                          },
                          codeName: 'druipart8',
                          detailStyle: 'DEFAULT',
                          detailType: 'DRUIPART',
                          layoutPos: {
                            colLG: 12,
                            colLGOffset: 2,
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'druipart8',
                        },
                      ],
                      codeName: 'grouppanel11',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel11',
                    },
                  ],
                  caption: '上A休B',
                  codeName: 'grouppanel9',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  defdgroupLogics: [
                    {
                      logicCat: 'PANELVISIBLE',
                      relatedDetailNames: ['schedule_type'],
                      groupOP: 'AND',
                      defdlogics: [
                        {
                          condOP: 'EQ',
                          defdname: 'schedule_type',
                          value: 'work_rest',
                          logicType: 'SINGLE',
                          id: 'schedule_type等于(=) work_rest',
                        },
                      ],
                      logicType: 'GROUP',
                    },
                  ],
                  layoutPos: {
                    colLG: 18,
                    colLGOffset: 3,
                    colMD: 18,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel9',
                },
                {
                  layout: {
                    columnCount: 24,
                    layout: 'TABLE_24COL',
                  },
                  deformDetails: [
                    {
                      createDV: '1',
                      dataType: 9,
                      enableCond: 3,
                      itemWidth: 230,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'shift_num',
                      editor: {
                        singleSelect: true,
                        appCodeListId: 'attendanceapp.attendance__shiftnum',
                        editorParams: {
                          customprops:
                            '{"clearable":false,"activeChange":false}',
                        },
                        editorType: 'DROPDOWNLIST',
                        editorWidth: 100,
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'shift_num',
                      },
                      needCodeListConfig: true,
                      caption: '班次数量',
                      codeName: 'shift_num',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        colLG: 8,
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'shift_num',
                    },
                    {
                      layout: {
                        columnCount: 24,
                        layout: 'TABLE_24COL',
                      },
                      deformDetails: [
                        {
                          maskMode: 0,
                          appViewId: 'attendanceapp.attendance_shift_grid_view',
                          parentDataJO: {
                            SRFPARENTTYPE: 'DER1N',
                            srfparentdename: 'ATTENDANCE_RULE',
                            srfparentmode:
                              'DER1N_ATTENDANCE_SHIFT_ATTENDANCE_RULE_RULE_ID',
                            srfparentdefname: 'RULE_ID',
                            SRFDER1NID:
                              'DER1N_ATTENDANCE_SHIFT_ATTENDANCE_RULE_RULE_ID',
                          },
                          capLanguageRes: {
                            lanResTag:
                              'CONTROL.DEFORM.ATTENDANCE_RULE.MAIN.DRUIPART.DRUIPART1',
                          },
                          caption: '班次',
                          codeName: 'druipart1',
                          detailStyle: 'DEFAULT',
                          detailType: 'DRUIPART',
                          layoutPos: {
                            colLG: 12,
                            colMD: 12,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'druipart1',
                        },
                      ],
                      codeName: 'grouppanel25',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel25',
                    },
                    {
                      dataType: 9,
                      enableCond: 3,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'auto_match',
                      editor: {
                        editorType: 'SWITCH',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'auto_match',
                      },
                      allowEmpty: true,
                      capLanguageRes: {
                        lanResTag:
                          'CONTROL.DEFORM.ATTENDANCE_RULE.MAIN.FORMITEM.AUTO_MATCH',
                      },
                      caption: '智能判断打卡班次',
                      codeName: 'auto_match',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      defdgroupLogics: [
                        {
                          logicCat: 'ITEMENABLE',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'EQ',
                              defdname: 'schedule_type',
                              value: 'manual',
                              logicType: 'SINGLE',
                              id: 'schedule_type等于(=) manual',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'auto_match',
                    },
                    {
                      dataType: 25,
                      enableCond: 3,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'judge_result',
                      editor: {
                        halign: 'LEFT',
                        valign: 'MIDDLE',
                        wrapMode: 'NOWRAP',
                        editorType: 'SPAN',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'judge_result',
                      },
                      allowEmpty: true,
                      emptyCaption: true,
                      codeName: 'judge_result',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      labelSysCss: {
                        cssName: 'judge_result',
                      },
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['judge_result', 'auto_match'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'ISNOTNULL',
                              defdname: 'judge_result',
                              logicType: 'SINGLE',
                              name: 'judge_result值不为空(NotNil)',
                              id: 'judge_result值不为空(notnil)',
                            },
                            {
                              condOP: 'EQ',
                              defdname: 'auto_match',
                              value: '1',
                              logicType: 'SINGLE',
                              id: 'auto_match等于(=) 1',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      sysCss: {
                        cssName: 'judge_result',
                      },
                      showCaption: true,
                      id: 'judge_result',
                    },
                    {
                      rawItem: {
                        caption:
                          'Tip：开启后将根据员工首次打卡时间智能匹配当日班次；多班次时，员工可在手机端修改当日班次',
                        halign: 'LEFT',
                        valign: 'MIDDLE',
                        wrapMode: 'NOWRAP',
                        contentType: 'RAW',
                        sysCss: {
                          cssName: 'form-item-tooltip1',
                        },
                        id: 'rawitem4',
                      },
                      codeName: 'rawitem4',
                      detailStyle: 'DEFAULT',
                      detailType: 'RAWITEM',
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['judge_result'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'ISNULL',
                              defdname: 'judge_result',
                              logicType: 'SINGLE',
                              name: 'judge_result值为空(Nil)',
                              id: 'judge_result值为空(nil)',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      sysCss: {
                        cssName: 'form-item-tooltip1',
                      },
                      showCaption: true,
                      id: 'rawitem4',
                    },
                  ],
                  capLanguageRes: {
                    lanResTag:
                      'CONTROL.DEFORM.ATTENDANCE_RULE.MAIN.GROUPPANEL.GROUPPANEL1',
                  },
                  caption: '手动排班',
                  codeName: 'grouppanel1',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  defdgroupLogics: [
                    {
                      logicCat: 'PANELVISIBLE',
                      relatedDetailNames: ['schedule_type'],
                      groupOP: 'AND',
                      defdlogics: [
                        {
                          condOP: 'EQ',
                          defdname: 'schedule_type',
                          value: 'manual',
                          logicType: 'SINGLE',
                          id: 'schedule_type等于(=) manual',
                        },
                      ],
                      logicType: 'GROUP',
                    },
                  ],
                  layoutPos: {
                    colLG: 18,
                    colLGOffset: 3,
                    colMD: 18,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel1',
                },
                {
                  layout: {
                    columnCount: 24,
                    layout: 'TABLE_24COL',
                  },
                  deformDetails: [
                    {
                      layout: {
                        dir: 'row',
                        layout: 'FLEX',
                      },
                      deformDetails: [
                        {
                          dataType: 25,
                          enableCond: 3,
                          itemWidth: 200,
                          labelPos: 'LEFT',
                          labelWidth: 130,
                          noPrivDisplayMode: 1,
                          deformItemUpdateId: 'updatedefaultshifts',
                          editor: {
                            dateTimeFormat: 'HH:mm',
                            editorParams: {
                              TIMEFMT: 'HH:mm',
                              customprops:
                                '{"clearable":false,"activeChange":false}',
                            },
                            editorType: 'DATEPICKEREX_NODAY_NOSECOND',
                            editorWidth: 70,
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'free_start',
                          },
                          capLanguageRes: {
                            lanResTag:
                              'CONTROL.DEFORM.SHIFT.MAIN2.FORMITEM.BASE_TIME',
                          },
                          caption: '上班时间',
                          codeName: 'free_start',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          showCaption: true,
                          id: 'free_start',
                        },
                        {
                          dataType: 25,
                          enableCond: 3,
                          itemWidth: 200,
                          labelPos: 'LEFT',
                          labelWidth: 130,
                          noPrivDisplayMode: 1,
                          deformItemUpdateId: 'updatedefaultshifts',
                          editor: {
                            dateTimeFormat: 'HH:mm',
                            editorParams: {
                              TIMEFMT: 'HH:mm',
                              customprops:
                                '{"clearable":false,"activeChange":false}',
                            },
                            editorType: 'DATEPICKEREX_NODAY_NOSECOND',
                            editorWidth: 70,
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'free_end',
                          },
                          allowEmpty: true,
                          caption: '下班时间',
                          codeName: 'free_end',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          showCaption: true,
                          id: 'free_end',
                        },
                      ],
                      codeName: 'grouppanel30',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      layoutPos: {
                        colLG: 12,
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel30',
                    },
                    {
                      rawItem: {
                        caption:
                          '打卡范围时间段内的打卡记录会自动结合成一次上下班时间',
                        halign: 'LEFT',
                        valign: 'MIDDLE',
                        wrapMode: 'NOWRAP',
                        contentType: 'RAW',
                        sysCss: {
                          cssName: 'free-tooltip',
                        },
                        id: 'rawitem1',
                      },
                      codeName: 'rawitem1',
                      detailStyle: 'DEFAULT',
                      detailType: 'RAWITEM',
                      layoutPos: {
                        colLG: 15,
                        colMD: 15,
                        layout: 'TABLE_24COL',
                      },
                      sysCss: {
                        cssName: 'free-tooltip',
                      },
                      showCaption: true,
                      id: 'rawitem1',
                    },
                    {
                      layout: {
                        columnCount: 24,
                        layout: 'TABLE_24COL',
                      },
                      deformDetails: [
                        {
                          createDV: '1',
                          dataType: 9,
                          enableCond: 3,
                          labelPos: 'LEFT',
                          labelWidth: 130,
                          noPrivDisplayMode: 1,
                          appDEFieldId: 'free_ratio',
                          editor: {
                            singleSelect: true,
                            appCodeListId:
                              'attendanceapp.attendance__checkin_frequency',
                            editorType: 'DROPDOWNLIST',
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'free_ratio',
                          },
                          updateDV: '1',
                          allowEmpty: true,
                          needCodeListConfig: true,
                          caption: '当天打卡',
                          codeName: 'free_ratio',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          layoutPos: {
                            colLG: 4,
                            colMD: 4,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'free_ratio',
                        },
                        {
                          rawItem: {
                            caption: '记为实际出勤',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'rule_raw_item',
                            },
                            id: 'rawitem8',
                          },
                          codeName: 'rawitem8',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          layoutPos: {
                            colLG: 5,
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          sysCss: {
                            cssName: 'rule_raw_item',
                          },
                          showCaption: true,
                          id: 'rawitem8',
                        },
                        {
                          layout: {
                            align: 'flex-start',
                            dir: 'row',
                            layout: 'FLEX',
                          },
                          deformDetails: [
                            {
                              dataType: 9,
                              enableCond: 3,
                              itemWidth: 270,
                              labelPos: 'LEFT',
                              labelWidth: 190,
                              noPrivDisplayMode: 1,
                              appDEFieldId: 'free_min_minutes',
                              editor: {
                                editorType: 'NUMBER',
                                editorWidth: 80,
                                valueType: 'SIMPLE',
                                editable: true,
                                id: 'free_min_minutes',
                              },
                              caption: '实际出勤时长需大于',
                              codeName: 'free_min_minutes',
                              detailStyle: 'DEFAULT',
                              detailType: 'FORMITEM',
                              defdgroupLogics: [
                                {
                                  logicCat: 'PANELVISIBLE',
                                  relatedDetailNames: ['free_ratio'],
                                  groupOP: 'AND',
                                  defdlogics: [
                                    {
                                      condOP: 'EQ',
                                      defdname: 'free_ratio',
                                      value: '2',
                                      logicType: 'SINGLE',
                                      id: 'free_ratio等于(=) 2',
                                    },
                                  ],
                                  logicType: 'GROUP',
                                },
                                {
                                  logicCat: 'ITEMBLANK',
                                  relatedDetailNames: ['free_ratio'],
                                  groupOP: 'AND',
                                  defdlogics: [
                                    {
                                      condOP: 'NOTEQ',
                                      defdname: 'free_ratio',
                                      value: '2',
                                      logicType: 'SINGLE',
                                      id: 'free_ratio不等于(<>) 2',
                                    },
                                  ],
                                  logicType: 'GROUP',
                                },
                                {
                                  logicCat: 'ITEMENABLE',
                                  relatedDetailNames: ['free_ratio'],
                                  groupOP: 'AND',
                                  defdlogics: [
                                    {
                                      condOP: 'EQ',
                                      defdname: 'free_ratio',
                                      value: '2',
                                      logicType: 'SINGLE',
                                      id: 'free_ratio等于(=) 2',
                                    },
                                  ],
                                  logicType: 'GROUP',
                                },
                              ],
                              layoutPos: {
                                shrink: 1,
                                layout: 'FLEX',
                                width: 280,
                                widthMode: 'PX',
                              },
                              showCaption: true,
                              id: 'free_min_minutes',
                            },
                            {
                              rawItem: {
                                caption: '分钟',
                                halign: 'LEFT',
                                valign: 'MIDDLE',
                                wrapMode: 'NOWRAP',
                                contentType: 'RAW',
                                sysCss: {
                                  cssName: 'rule_raw_item',
                                },
                                id: 'rawitem9',
                              },
                              codeName: 'rawitem9',
                              detailStyle: 'DEFAULT',
                              detailType: 'RAWITEM',
                              defdgroupLogics: [
                                {
                                  logicCat: 'PANELVISIBLE',
                                  relatedDetailNames: ['free_ratio'],
                                  groupOP: 'AND',
                                  defdlogics: [
                                    {
                                      condOP: 'EQ',
                                      defdname: 'free_ratio',
                                      value: '2',
                                      logicType: 'SINGLE',
                                      id: 'free_ratio等于(=) 2',
                                    },
                                  ],
                                  logicType: 'GROUP',
                                },
                              ],
                              layoutPos: {
                                shrink: 1,
                                layout: 'FLEX',
                              },
                              sysCss: {
                                cssName: 'rule_raw_item',
                              },
                              showCaption: true,
                              id: 'rawitem9',
                            },
                          ],
                          codeName: 'grouppanel26',
                          detailStyle: 'DEFAULT',
                          detailType: 'GROUPPANEL',
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          id: 'grouppanel26',
                        },
                      ],
                      codeName: 'grouppanel21',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel21',
                    },
                  ],
                  caption: '自由班',
                  codeName: 'grouppanel6',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  defdgroupLogics: [
                    {
                      logicCat: 'PANELVISIBLE',
                      relatedDetailNames: ['schedule_type'],
                      groupOP: 'AND',
                      defdlogics: [
                        {
                          condOP: 'EQ',
                          defdname: 'schedule_type',
                          value: 'free',
                          logicType: 'SINGLE',
                          id: 'schedule_type等于(=) free',
                        },
                      ],
                      logicType: 'GROUP',
                    },
                  ],
                  layoutPos: {
                    colLG: 18,
                    colLGOffset: 3,
                    colMD: 18,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel6',
                },
                {
                  layout: {
                    columnCount: 24,
                    layout: 'TABLE_24COL',
                  },
                  deformDetails: [
                    {
                      layout: {
                        align: 'flex-start',
                        dir: 'row',
                        layout: 'FLEX',
                      },
                      deformDetails: [
                        {
                          dataType: 25,
                          enableCond: 3,
                          labelPos: 'LEFT',
                          labelWidth: 130,
                          noPrivDisplayMode: 1,
                          appDEFieldId: 'work_time',
                          editor: {
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            editorType: 'SPAN',
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'work_time',
                          },
                          allowEmpty: true,
                          caption: '上下班时间',
                          codeName: 'work_time',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          showCaption: true,
                          id: 'work_time',
                        },
                        {
                          actionType: 'UIACTION',
                          buttonStyle: 'DEFAULT',
                          uiactionId: 'opendefaultshit@attendance_rule',
                          tooltip: '修改班次时间',
                          uiactionTarget: 'NONE',
                          caption: '修改班次时间',
                          codeName: 'button1',
                          detailStyle: 'DEFAULT',
                          detailType: 'BUTTON',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  groupOP: 'OR',
                                  defdlogics: [
                                    {
                                      condOP: 'EQ',
                                      defdname: 'schedule_type',
                                      value: 'fixed',
                                      logicType: 'SINGLE',
                                      id: 'schedule_type等于(=) fixed',
                                    },
                                    {
                                      condOP: 'EQ',
                                      defdname: 'schedule_type',
                                      value: 'flexible',
                                      logicType: 'SINGLE',
                                      id: 'schedule_type等于(=) flexible',
                                    },
                                    {
                                      condOP: 'EQ',
                                      defdname: 'schedule_type',
                                      value: 'alternate_week',
                                      logicType: 'SINGLE',
                                      id: 'schedule_type等于(=) alternate_week',
                                    },
                                  ],
                                  logicType: 'GROUP',
                                  name: 'OR',
                                  id: 'or',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          sysCss: {
                            cssName: 'edit_default_shift',
                          },
                          showCaption: true,
                          id: 'button1',
                        },
                      ],
                      codeName: 'grouppanel27',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel27',
                    },
                    {
                      layout: {
                        columnCount: 24,
                        layout: 'TABLE_24COL',
                      },
                      deformDetails: [
                        {
                          createDV: '1,2,3,4,5',
                          dataType: 25,
                          enableCond: 3,
                          labelPos: 'LEFT',
                          labelWidth: 130,
                          noPrivDisplayMode: 1,
                          appDEFieldId: 'workday',
                          editor: {
                            appCodeListId: 'attendanceapp.attendance__week1',
                            editorType: 'CHECKBOXLIST',
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'workday',
                          },
                          allowEmpty: true,
                          needCodeListConfig: true,
                          caption: '工作日',
                          codeName: 'workday',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'workday',
                        },
                        {
                          maskMode: 0,
                          appViewId:
                            'attendanceapp.attendance_workday_grid_view',
                          navigateContexts: [
                            {
                              key: 'SCHEDULE_TYPE',
                              value: 'schedule_type',
                              name: 'SCHEDULE_TYPE',
                              id: 'schedule_type',
                            },
                          ],
                          parentDataJO: {
                            SRFPARENTTYPE: 'DER1N',
                            srfparentdename: 'ATTENDANCE_RULE',
                            srfparentmode:
                              'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                            srfparentdefname: 'RULE_ID',
                            SRFDER1NID:
                              'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                          },
                          codeName: 'druipart5',
                          detailStyle: 'DEFAULT',
                          detailType: 'DRUIPART',
                          layoutPos: {
                            colLG: 12,
                            colLGOffset: 1,
                            colMD: 12,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'druipart5',
                        },
                      ],
                      caption: '固定排班/灵活打卡',
                      codeName: 'grouppanel4',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              groupOP: 'OR',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'flexible',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) flexible',
                                },
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'fixed',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) fixed',
                                },
                              ],
                              logicType: 'GROUP',
                              name: 'OR',
                              id: 'or',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                        {
                          logicCat: 'ITEMBLANK',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'fixed',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) fixed',
                                },
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'flexible',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) flexible',
                                },
                              ],
                              notMode: true,
                              logicType: 'GROUP',
                              name: 'AND [取反]',
                              id: 'and [取反]',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                        {
                          logicCat: 'ITEMENABLE',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'EQ',
                              defdname: 'schedule_type',
                              value: 'fixed',
                              logicType: 'SINGLE',
                              id: 'schedule_type等于(=) fixed',
                            },
                            {
                              condOP: 'EQ',
                              defdname: 'schedule_type',
                              value: 'flexible',
                              logicType: 'SINGLE',
                              id: 'schedule_type等于(=) flexible',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel4',
                    },
                    {
                      createDV: 'only_checkin',
                      dataType: 25,
                      enableCond: 3,
                      ignoreInput: 4,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'requirement',
                      editor: {
                        appCodeListId:
                          'attendanceapp.attendance__attendance_policy',
                        editorType: 'RADIOBUTTONLIST',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'requirement',
                      },
                      needCodeListConfig: true,
                      caption: '每日打卡要求',
                      codeName: 'requirement',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'EQ',
                              defdname: 'schedule_type',
                              value: 'flexible',
                              logicType: 'SINGLE',
                              id: 'schedule_type等于(=) flexible',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                        {
                          logicCat: 'ITEMBLANK',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'NOTEQ',
                              defdname: 'schedule_type',
                              value: 'flexible',
                              logicType: 'SINGLE',
                              id: 'schedule_type不等于(<>) flexible',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                        {
                          logicCat: 'ITEMENABLE',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'EQ',
                              defdname: 'schedule_type',
                              value: 'flexible',
                              logicType: 'SINGLE',
                              id: 'schedule_type等于(=) flexible',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'requirement',
                    },
                    {
                      layout: {
                        columnCount: 24,
                        layout: 'TABLE_24COL',
                      },
                      deformDetails: [
                        {
                          dataType: 25,
                          enableCond: 3,
                          ignoreInput: 4,
                          labelPos: 'LEFT',
                          labelWidth: 130,
                          noPrivDisplayMode: 1,
                          appDEFieldId: 'week1',
                          editor: {
                            appCodeListId: 'attendanceapp.attendance__week1',
                            editorType: 'CHECKBOXLIST',
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'alternate_week1',
                          },
                          allowEmpty: true,
                          needCodeListConfig: true,
                          caption: '工作日（大周）',
                          codeName: 'alternate_week1',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'ITEMENABLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'alternate_week',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) alternate_week',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'alternate_week1',
                        },
                        {
                          dataType: 25,
                          enableCond: 3,
                          ignoreInput: 4,
                          labelPos: 'LEFT',
                          labelWidth: 130,
                          noPrivDisplayMode: 1,
                          appDEFieldId: 'week2',
                          editor: {
                            appCodeListId: 'attendanceapp.attendance__week2',
                            editorType: 'CHECKBOXLIST',
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'alternate_week2',
                          },
                          allowEmpty: true,
                          needCodeListConfig: true,
                          caption: '工作日（小周）',
                          codeName: 'alternate_week2',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'ITEMENABLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'alternate_week',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) alternate_week',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'alternate_week2',
                        },
                        {
                          deformTabPages: [
                            {
                              layout: {
                                columnCount: 24,
                                layout: 'TABLE_24COL',
                              },
                              deformDetails: [
                                {
                                  maskMode: 0,
                                  appViewId:
                                    'attendanceapp.attendance_workday_big_week_grid_view',
                                  navigateContexts: [
                                    {
                                      key: 'SCHEDULE_TYPE',
                                      value: 'schedule_type',
                                      name: 'SCHEDULE_TYPE',
                                      id: 'schedule_type',
                                    },
                                  ],
                                  parentDataJO: {
                                    SRFPARENTTYPE: 'DER1N',
                                    srfparentdename: 'ATTENDANCE_RULE',
                                    srfparentmode:
                                      'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                    srfparentdefname: 'RULE_ID',
                                    SRFDER1NID:
                                      'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                  },
                                  codeName: 'druipart6',
                                  detailStyle: 'DEFAULT',
                                  detailType: 'DRUIPART',
                                  layoutPos: {
                                    colLG: 12,
                                    colMD: 12,
                                    layout: 'TABLE_24COL',
                                  },
                                  showCaption: true,
                                  id: 'druipart6',
                                },
                              ],
                              caption: '大周',
                              codeName: 'tabpage1',
                              detailStyle: 'STYLE2',
                              detailType: 'TABPAGE',
                              showCaption: true,
                              id: 'tabpage1',
                            },
                            {
                              layout: {
                                columnCount: 24,
                                layout: 'TABLE_24COL',
                              },
                              deformDetails: [
                                {
                                  maskMode: 0,
                                  appViewId:
                                    'attendanceapp.attendance_workday_small_week_grid_view',
                                  navigateContexts: [
                                    {
                                      key: 'SCHEDULE_TYPE',
                                      value: 'schedule_type',
                                      name: 'SCHEDULE_TYPE',
                                      id: 'schedule_type',
                                    },
                                  ],
                                  parentDataJO: {
                                    SRFPARENTTYPE: 'DER1N',
                                    srfparentdename: 'ATTENDANCE_RULE',
                                    srfparentmode:
                                      'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                    srfparentdefname: 'RULE_ID',
                                    SRFDER1NID:
                                      'DER1N_ATTENDANCE_WORKDAY_ATTENDANCE_RULE_RULE_ID',
                                  },
                                  codeName: 'druipart7',
                                  detailStyle: 'DEFAULT',
                                  detailType: 'DRUIPART',
                                  layoutPos: {
                                    colLG: 12,
                                    colMD: 12,
                                    layout: 'TABLE_24COL',
                                  },
                                  showCaption: true,
                                  id: 'druipart7',
                                },
                              ],
                              caption: '小周',
                              codeName: 'tabpage2',
                              detailStyle: 'DEFAULT',
                              detailType: 'TABPAGE',
                              showCaption: true,
                              id: 'tabpage2',
                            },
                          ],
                          codeName: 'tabpanel1',
                          detailStyle: 'DEFAULT',
                          detailType: 'TABPANEL',
                          layoutPos: {
                            colLG: 22,
                            colMD: 22,
                            layout: 'TABLE_24COL',
                          },
                          id: 'tabpanel1',
                        },
                        {
                          createDV: 'big_small',
                          dataType: 25,
                          enableCond: 3,
                          ignoreInput: 4,
                          labelPos: 'LEFT',
                          labelWidth: 180,
                          noPrivDisplayMode: 1,
                          appDEFieldId: 'biweekly_cycle',
                          editor: {
                            appCodeListId: 'attendanceapp.attendance__cycle',
                            editorType: 'RADIOBUTTONLIST',
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'cycle',
                          },
                          needCodeListConfig: true,
                          caption: '循环周期设置（大小周）',
                          codeName: 'cycle',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'PANELVISIBLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'alternate_week',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) alternate_week',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                            {
                              logicCat: 'ITEMBLANK',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'NOTEQ',
                                  defdname: 'schedule_type',
                                  value: 'alternate_week',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type不等于(<>) alternate_week',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                            {
                              logicCat: 'ITEMENABLE',
                              relatedDetailNames: ['schedule_type'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'alternate_week',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) alternate_week',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'cycle',
                        },
                        {
                          rawItem: {
                            caption:
                              'Tip：以考勤规则生效时间为准，生效日期所在周为第一周',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            sysCss: {
                              cssName: 'form-item-tooltip-week',
                            },
                            id: 'rawitem12',
                          },
                          codeName: 'rawitem12',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          sysCss: {
                            cssName: 'form-item-tooltip-week',
                          },
                          showCaption: true,
                          id: 'rawitem12',
                        },
                      ],
                      caption: '大小周设置',
                      codeName: 'grouppanel5',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'EQ',
                              defdname: 'schedule_type',
                              value: 'alternate_week',
                              logicType: 'SINGLE',
                              id: 'schedule_type等于(=) alternate_week',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                        {
                          logicCat: 'ITEMBLANK',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'NOTEQ',
                              defdname: 'schedule_type',
                              value: 'alternate_week',
                              logicType: 'SINGLE',
                              id: 'schedule_type不等于(<>) alternate_week',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                        {
                          logicCat: 'ITEMENABLE',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'EQ',
                              defdname: 'schedule_type',
                              value: 'alternate_week',
                              logicType: 'SINGLE',
                              id: 'schedule_type等于(=) alternate_week',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colLGOffset: 1,
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'grouppanel5',
                    },
                  ],
                  caption: '固定排班/灵活打卡/大小周',
                  codeName: 'grouppanel3',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  defdgroupLogics: [
                    {
                      logicCat: 'PANELVISIBLE',
                      relatedDetailNames: ['schedule_type'],
                      groupOP: 'AND',
                      defdlogics: [
                        {
                          groupOP: 'OR',
                          defdlogics: [
                            {
                              condOP: 'EQ',
                              defdname: 'schedule_type',
                              value: 'fixed',
                              logicType: 'SINGLE',
                              id: 'schedule_type等于(=) fixed',
                            },
                            {
                              condOP: 'EQ',
                              defdname: 'schedule_type',
                              value: 'flexible',
                              logicType: 'SINGLE',
                              id: 'schedule_type等于(=) flexible',
                            },
                            {
                              condOP: 'EQ',
                              defdname: 'schedule_type',
                              value: 'alternate_week',
                              logicType: 'SINGLE',
                              id: 'schedule_type等于(=) alternate_week',
                            },
                          ],
                          logicType: 'GROUP',
                          name: 'OR',
                          id: 'or',
                        },
                      ],
                      logicType: 'GROUP',
                    },
                  ],
                  layoutPos: {
                    colLG: 18,
                    colLGOffset: 3,
                    colMD: 18,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel3',
                },
                {
                  layout: {
                    columnCount: 24,
                    layout: 'TABLE_24COL',
                  },
                  deformDetails: [
                    {
                      dataType: 9,
                      enableCond: 3,
                      ignoreInput: 4,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'elastic_valid',
                      editor: {
                        editorType: 'SWITCH',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'elastic_valid',
                      },
                      allowEmpty: true,
                      caption: '人性化考勤',
                      codeName: 'elastic_valid',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      defdgroupLogics: [
                        {
                          logicCat: 'ITEMENABLE',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'NOTEQ',
                              defdname: 'schedule_type',
                              value: 'free',
                              logicType: 'SINGLE',
                              id: 'schedule_type不等于(<>) free',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'elastic_valid',
                    },
                    {
                      layout: {
                        align: 'flex-start',
                        dir: 'row',
                        layout: 'FLEX',
                        valign: 'center',
                      },
                      deformDetails: [
                        {
                          rawItem: {
                            caption: '弹性打卡：上班可晚到',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            rawItemWidth: 155,
                            id: 'rawitem2',
                          },
                          codeName: 'rawitem2',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                            width: 155,
                            widthMode: 'PX',
                          },
                          showCaption: true,
                          id: 'rawitem2',
                        },
                        {
                          createDV: '60',
                          dataType: 9,
                          enableCond: 3,
                          ignoreInput: 4,
                          itemWidth: 80,
                          labelPos: 'NONE',
                          noPrivDisplayMode: 1,
                          appDEFieldId: 'elastic_minutes',
                          editor: {
                            singleSelect: true,
                            appCodeListId:
                              'attendanceapp.attendance__elastic_minutes',
                            editorParams: {
                              customprops: '{"clearable":false}',
                            },
                            editorType: 'DROPDOWNLIST',
                            editorWidth: 80,
                            valueType: 'SIMPLE',
                            editable: true,
                            id: 'elastic_minutes',
                          },
                          allowEmpty: true,
                          needCodeListConfig: true,
                          caption: '弹性分钟数',
                          codeName: 'elastic_minutes',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          defdgroupLogics: [
                            {
                              logicCat: 'ITEMENABLE',
                              relatedDetailNames: ['elastic_valid'],
                              groupOP: 'AND',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'elastic_valid',
                                  value: '1',
                                  logicType: 'SINGLE',
                                  id: 'elastic_valid等于(=) 1',
                                },
                              ],
                              logicType: 'GROUP',
                            },
                          ],
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          id: 'elastic_minutes',
                        },
                        {
                          rawItem: {
                            caption: '分钟，但需要满足当天上班时长',
                            halign: 'LEFT',
                            valign: 'MIDDLE',
                            wrapMode: 'NOWRAP',
                            contentType: 'RAW',
                            rawItemWidth: 230,
                            id: 'rawitem3',
                          },
                          codeName: 'rawitem3',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                            width: 230,
                            widthMode: 'PX',
                          },
                          showCaption: true,
                          id: 'rawitem3',
                        },
                      ],
                      codeName: 'grouppanel8',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['elastic_valid'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'EQ',
                              defdname: 'elastic_valid',
                              value: '1',
                              logicType: 'SINGLE',
                              id: 'elastic_valid等于(=) 1',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colLG: 24,
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      sysCss: {
                        cssName: 'raw-group',
                      },
                      id: 'grouppanel8',
                    },
                  ],
                  caption: '弹性打卡配置',
                  codeName: 'grouppanel7',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  defdgroupLogics: [
                    {
                      logicCat: 'PANELVISIBLE',
                      relatedDetailNames: ['schedule_type'],
                      groupOP: 'AND',
                      defdlogics: [
                        {
                          condOP: 'NOTEQ',
                          defdname: 'schedule_type',
                          value: 'free',
                          logicType: 'SINGLE',
                          id: 'schedule_type不等于(<>) free',
                        },
                      ],
                      logicType: 'GROUP',
                    },
                  ],
                  layoutPos: {
                    colLG: 18,
                    colLGOffset: 3,
                    colMD: 18,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel7',
                },
              ],
              capLanguageRes: {
                lanResTag:
                  'CONTROL.DEFORM.ATTENDANCE_RULE.MAIN.GROUPPANEL.GROUP1',
              },
              caption: '考勤规则基本信息',
              codeName: 'group1',
              detailStyle: 'DEFAULT',
              detailType: 'GROUPPANEL',
              layoutPos: {
                colLG: 24,
                colMD: 24,
                layout: 'TABLE_24COL',
              },
              id: 'group1',
            },
          ],
          capLanguageRes: {
            lanResTag: 'CONTROL.DEFORM.ATTENDANCE_RULE.MAIN.FORMPAGE.FORMPAGE1',
          },
          caption: '设置上班时间',
          codeName: 'formpage1',
          detailStyle: 'DEFAULT',
          detailType: 'FORMPAGE',
          id: 'formpage1',
        },
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
                                        dataType: 25,
                                        enableCond: 3,
                                        labelPos: 'LEFT',
                                        labelWidth: 130,
                                        noPrivDisplayMode: 1,
                                        appDEFieldId: 'schedule_type',
                                        editor: {
                                          editorType: 'HIDDEN',
                                          valueType: 'SIMPLE',
                                          editable: true,
                                          id: 'schedule_type',
                                        },
                                        allowEmpty: true,
                                        hidden: true,
                                        caption: '规则类型',
                                        codeName: 'schedule_type',
                                        detailStyle: 'DEFAULT',
                                        detailType: 'FORMITEM',
                                        layoutPos: {
                                          colMD: 24,
                                          layout: 'TABLE_24COL',
                                        },
                                        id: 'schedule_type',
                                      },
                                      {
                                        createDV: 'false',
                                        dataType: 25,
                                        enableCond: 3,
                                        labelPos: 'LEFT',
                                        labelWidth: 130,
                                        noPrivDisplayMode: 1,
                                        appDEFieldId: 'all_company',
                                        editor: {
                                          appCodeListId:
                                            'attendanceapp.employee_management__employeetype',
                                          editorType: 'RADIOBUTTONLIST',
                                          valueType: 'SIMPLE',
                                          editable: true,
                                          id: 'all_company',
                                        },
                                        allowEmpty: true,
                                        needCodeListConfig: true,
                                        capLanguageRes: {
                                          lanResTag:
                                            'CONTROL.DEFORM.ATTENDANCE_GROUP_SHIFT.MAIN.FORMITEM.ALL_COMPANY',
                                        },
                                        caption: '考勤人员',
                                        codeName: 'all_company',
                                        detailStyle: 'DEFAULT',
                                        detailType: 'FORMITEM',
                                        layoutPos: {
                                          colMD: 24,
                                          layout: 'TABLE_24COL',
                                        },
                                        showCaption: true,
                                        id: 'all_company',
                                      },
                                      {
                                        rawItem: {
                                          caption:
                                            'Tip：选择考勤人员为【全公司】，其他考勤规则人员将会使用当前考勤规则',
                                          halign: 'LEFT',
                                          valign: 'MIDDLE',
                                          wrapMode: 'NOWRAP',
                                          contentType: 'RAW',
                                          sysCss: {
                                            cssName: 'form-allcompanytip',
                                          },
                                          id: 'rawitem1',
                                        },
                                        codeName: 'rawitem1',
                                        detailStyle: 'DEFAULT',
                                        detailType: 'RAWITEM',
                                        defdgroupLogics: [
                                          {
                                            logicCat: 'PANELVISIBLE',
                                            relatedDetailNames: ['all_company'],
                                            groupOP: 'AND',
                                            defdlogics: [
                                              {
                                                condOP: 'EQ',
                                                defdname: 'all_company',
                                                value: 'true',
                                                logicType: 'SINGLE',
                                                id: 'all_company等于(=) true',
                                              },
                                            ],
                                            logicType: 'GROUP',
                                          },
                                        ],
                                        layoutPos: {
                                          colMD: 24,
                                          layout: 'TABLE_24COL',
                                        },
                                        sysCss: {
                                          cssName: 'form-allcompanytip',
                                        },
                                        showCaption: true,
                                        id: 'rawitem1',
                                      },
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
                                        codeName: 'druipart1',
                                        detailStyle: 'DEFAULT',
                                        detailType: 'DRUIPART',
                                        defdgroupLogics: [
                                          {
                                            logicCat: 'PANELVISIBLE',
                                            relatedDetailNames: ['all_company'],
                                            groupOP: 'AND',
                                            defdlogics: [
                                              {
                                                condOP: 'EQ',
                                                defdname: 'all_company',
                                                value: 'false',
                                                logicType: 'SINGLE',
                                                id: 'all_company等于(=) false',
                                              },
                                            ],
                                            logicType: 'GROUP',
                                          },
                                        ],
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
                        codeName: 'main',
                        controlType: 'FORM',
                        logicName: '主编辑表单',
                        appDataEntityId: 'attendanceapp.attendance_group_shift',
                        controlParam: {},
                        modelId: 'c11fe4ed6273bdf8e7773a6a2841ff16',
                        modelType: 'PSDEFORM_EDITFORM',
                        name: 'test_group_shifts_form',
                        id: 'attendanceapp.attendance_group_shift.main',
                      },
                      contentType: 'FORM',
                      layout: {
                        columnCount: 24,
                        layout: 'TABLE_24COL',
                      },
                      codeName: 'test_group_shifts',
                      detailStyle: 'DEFAULT',
                      detailType: 'MDCTRL',
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'NOTEQ',
                              defdname: 'schedule_type',
                              value: 'class_inversion',
                              logicType: 'SINGLE',
                              id: 'schedule_type不等于(<>) class_inversion',
                            },
                            {
                              condOP: 'NOTEQ',
                              defdname: 'schedule_type',
                              value: 'work_rest',
                              logicType: 'SINGLE',
                              id: 'schedule_type不等于(<>) work_rest',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colLG: 18,
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'test_group_shifts',
                    },
                    {
                      layout: {
                        columnCount: 24,
                        layout: 'TABLE_24COL',
                      },
                      deformDetails: [
                        {
                          layout: {
                            align: 'flex-start',
                            dir: 'row',
                            layout: 'FLEX',
                          },
                          deformDetails: [
                            {
                              dataType: 9,
                              enableCond: 3,
                              labelPos: 'LEFT',
                              labelWidth: 120,
                              noPrivDisplayMode: 1,
                              appDEFieldId: 'group_num',
                              editor: {
                                editorParams: {
                                  customprops:
                                    '{"min":1,"max":10,"clearable":false,"activeChange":false}',
                                },
                                editorType: 'NUMBER',
                                valueType: 'SIMPLE',
                                editable: true,
                                id: 'group_num',
                              },
                              allowEmpty: true,
                              caption: '将考勤人员分为',
                              codeName: 'group_num',
                              detailStyle: 'DEFAULT',
                              detailType: 'FORMITEM',
                              layoutPos: {
                                shrink: 1,
                                layout: 'FLEX',
                                width: 200,
                                widthMode: 'PX',
                              },
                              showCaption: true,
                              id: 'group_num',
                            },
                            {
                              rawItem: {
                                caption: '组进行排班',
                                halign: 'LEFT',
                                valign: 'MIDDLE',
                                wrapMode: 'NOWRAP',
                                contentType: 'RAW',
                                sysCss: {
                                  cssName: 'group_num_item',
                                },
                                id: 'rawitem7',
                              },
                              codeName: 'rawitem7',
                              detailStyle: 'DEFAULT',
                              detailType: 'RAWITEM',
                              layoutPos: {
                                shrink: 1,
                                layout: 'FLEX',
                              },
                              sysCss: {
                                cssName: 'group_num_item',
                              },
                              showCaption: true,
                              id: 'rawitem7',
                            },
                          ],
                          codeName: 'grouppanel24',
                          detailStyle: 'DEFAULT',
                          detailType: 'GROUPPANEL',
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          id: 'grouppanel24',
                        },
                        {
                          contentControl: {
                            autoSaveMode: 1,
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
                            enableAutoSave: true,
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
                                              colMD: 24,
                                              layout: 'TABLE_24COL',
                                            },
                                            showCaption: true,
                                            id: 'druipart1',
                                          },
                                          {
                                            dataType: 21,
                                            enableCond: 3,
                                            labelPos: 'LEFT',
                                            labelWidth: 130,
                                            noPrivDisplayMode: 1,
                                            appDEFieldId: 'workdays',
                                            editor: {
                                              maxLength: 1048576,
                                              editorParams: {
                                                srfextrafield: 'true',
                                              },
                                              editorStyle:
                                                'ATTENDANCE_GROUP_SHIFTS',
                                              editorType: 'TEXTBOX',
                                              sysPFPluginId:
                                                'attendance_group_shifts',
                                              valueType: 'OBJECTS',
                                              editable: true,
                                              id: 'workdays',
                                            },
                                            allowEmpty: true,
                                            caption: '工作日',
                                            codeName: 'workdays',
                                            detailStyle: 'DEFAULT',
                                            detailType: 'FORMITEM',
                                            layoutPos: {
                                              colLG: 24,
                                              colMD: 24,
                                              layout: 'TABLE_24COL',
                                            },
                                            showCaption: true,
                                            id: 'workdays',
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
                            codeName: 'class_inversion',
                            controlType: 'FORM',
                            logicName: 'N班倒表单',
                            appDataEntityId:
                              'attendanceapp.attendance_group_shift',
                            controlParam: {},
                            modelId: 'a5b8cc1292e48463c93a0e455691ba48',
                            modelType: 'PSDEFORM_EDITFORM',
                            name: 'n_inversion_form',
                            id: 'attendanceapp.attendance_group_shift.class_inversion',
                          },
                          contentType: 'FORM',
                          layout: {
                            columnCount: 24,
                            layout: 'TABLE_24COL',
                          },
                          codeName: 'n_inversion',
                          detailStyle: 'DEFAULT',
                          detailType: 'MDCTRL',
                          layoutPos: {
                            colLG: 18,
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          sysPFPluginId: 'attendance_group_shifts_mdctrl',
                          showCaption: true,
                          id: 'n_inversion',
                        },
                      ],
                      codeName: 'grouppanel20',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['schedule_type'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              groupOP: 'OR',
                              defdlogics: [
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'class_inversion',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) class_inversion',
                                },
                                {
                                  condOP: 'EQ',
                                  defdname: 'schedule_type',
                                  value: 'work_rest',
                                  logicType: 'SINGLE',
                                  id: 'schedule_type等于(=) work_rest',
                                },
                              ],
                              logicType: 'GROUP',
                              name: 'OR',
                              id: 'or',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel20',
                    },
                  ],
                  codeName: 'grouppanel14',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  layoutPos: {
                    colLG: 18,
                    colLGOffset: 3,
                    colMD: 18,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel14',
                },
              ],
              codeName: 'grouppanel22',
              detailStyle: 'DEFAULT',
              detailType: 'GROUPPANEL',
              layoutPos: {
                colMD: 24,
                layout: 'TABLE_24COL',
              },
              id: 'grouppanel22',
            },
          ],
          capLanguageRes: {
            lanResTag: 'CONTROL.DEFORM.ATTENDANCE_RULE.MAIN.FORMPAGE.FORMPAGE4',
          },
          caption: '设置考勤人员',
          codeName: 'formpage4',
          detailStyle: 'DEFAULT',
          detailType: 'FORMPAGE',
          id: 'formpage4',
        },
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
                      enableCond: 3,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      editor: {
                        enablePickupView: true,
                        singleSelect: true,
                        appDEACModeId: 'default',
                        appDEDataSetId: 'fetch_calendar',
                        appDataEntityId: 'attendanceapp.attendance_rule',
                        enableAC: true,
                        forceSelection: true,
                        showTrigger: true,
                        editorParams: {
                          AC: 'TRUE',
                          PICKUPVIEW: 'TRUE',
                        },
                        editorStyle: 'HOLIDAY_CALENDAR',
                        editorType: 'PICKER',
                        sysPFPluginId: 'holiday_calendar',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'formitem',
                      },
                      resetItemNames: ['schedule_type,inversion_days'],
                      allowEmpty: true,
                      caption: '日期',
                      codeName: 'formitem',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'formitem',
                    },
                    {
                      dataType: 25,
                      enableCond: 3,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'holiday',
                      deformItemUpdateId: 'refreshcalendar',
                      editor: {
                        appCodeListId: 'attendanceapp.resource__holiday_dyna',
                        editorType: 'CHECKBOXLIST',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'holiday',
                      },
                      allowEmpty: true,
                      needCodeListConfig: true,
                      caption: '节假日',
                      codeName: 'holiday',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'holiday',
                    },
                  ],
                  codeName: 'grouppanel19',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  layoutPos: {
                    colLG: 18,
                    colLGOffset: 3,
                    colMD: 18,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel19',
                },
              ],
              codeName: 'grouppanel23',
              detailStyle: 'DEFAULT',
              detailType: 'GROUPPANEL',
              layoutPos: {
                colMD: 24,
                layout: 'TABLE_24COL',
              },
              id: 'grouppanel23',
            },
          ],
          capLanguageRes: {
            lanResTag: 'CONTROL.DEFORM.ATTENDANCE_RULE.MAIN.FORMPAGE.FORMPAGE3',
          },
          caption: '设置节假日',
          codeName: 'formpage3',
          detailStyle: 'DEFAULT',
          detailType: 'FORMPAGE',
          defdgroupLogics: [
            {
              logicCat: 'PANELVISIBLE',
              relatedDetailNames: ['schedule_type'],
              groupOP: 'AND',
              defdlogics: [
                {
                  condOP: 'NOTEQ',
                  defdname: 'schedule_type',
                  value: 'manual',
                  logicType: 'SINGLE',
                  id: 'schedule_type不等于(<>) manual',
                },
                {
                  condOP: 'NOTEQ',
                  defdname: 'schedule_type',
                  value: 'free',
                  logicType: 'SINGLE',
                  id: 'schedule_type不等于(<>) free',
                },
              ],
              logicType: 'GROUP',
            },
          ],
          id: 'formpage3',
        },
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
                      enableCond: 3,
                      labelPos: 'LEFT',
                      labelWidth: 130,
                      noPrivDisplayMode: 1,
                      appDEFieldId: 'checkin_method',
                      editor: {
                        appCodeListId:
                          'attendanceapp.attendance__checkin_method_type',
                        editorType: 'CHECKBOXLIST',
                        valueType: 'SIMPLE',
                        editable: true,
                        id: 'checkin_method',
                      },
                      needCodeListConfig: true,
                      capLanguageRes: {
                        lanResTag: 'DEF.LNAME.CHECKIN_TYPE.CHECKIN_METHOD',
                      },
                      caption: '考勤方式',
                      codeName: 'checkin_method',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'checkin_method',
                    },
                    {
                      maskMode: 0,
                      appViewId:
                        'attendanceapp.attendance_checkin_device_grid_view',
                      parentDataJO: {
                        SRFPARENTTYPE: 'DER1N',
                        srfparentdename: 'ATTENDANCE_RULE',
                        srfparentmode:
                          'DER1N_ATTENDANCE_CHECKIN_DEVICE_ATTENDANCE_RULE_RULE_ID',
                        srfparentdefname: 'RULE_ID',
                        SRFDER1NID:
                          'DER1N_ATTENDANCE_CHECKIN_DEVICE_ATTENDANCE_RULE_RULE_ID',
                      },
                      caption: '设备打卡',
                      codeName: 'druipart2',
                      detailStyle: 'DEFAULT',
                      detailType: 'DRUIPART',
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['checkin_method'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'LIKE',
                              defdname: 'checkin_method',
                              value: 'device',
                              logicType: 'SINGLE',
                              id: 'checkin_method文本包含(%) device',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'druipart2',
                    },
                    {
                      maskMode: 0,
                      appViewId:
                        'attendanceapp.attendance_gps_location_grid_view',
                      parentDataJO: {
                        SRFPARENTTYPE: 'DER1N',
                        srfparentdename: 'ATTENDANCE_RULE',
                        srfparentmode:
                          'DER1N_ATTENDANCE_GPS_LOCATION_ATTENDANCE_RULE_RULE_ID',
                        srfparentdefname: 'RULE_ID',
                        SRFDER1NID:
                          'DER1N_ATTENDANCE_GPS_LOCATION_ATTENDANCE_RULE_RULE_ID',
                      },
                      caption: 'GPS打卡',
                      codeName: 'druipart3',
                      detailStyle: 'DEFAULT',
                      detailType: 'DRUIPART',
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['checkin_method'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'LIKE',
                              defdname: 'checkin_method',
                              value: 'gps',
                              logicType: 'SINGLE',
                              id: 'checkin_method文本包含(%) gps',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'druipart3',
                    },
                    {
                      maskMode: 0,
                      appViewId:
                        'attendanceapp.attendance_wifi_location_grid_view',
                      parentDataJO: {
                        SRFPARENTTYPE: 'DER1N',
                        srfparentdename: 'ATTENDANCE_RULE',
                        srfparentmode:
                          'DER1N_ATTENDANCE_WIFI_LOCATION_ATTENDANCE_RULE_RULE_ID',
                        srfparentdefname: 'RULE_ID',
                        SRFDER1NID:
                          'DER1N_ATTENDANCE_WIFI_LOCATION_ATTENDANCE_RULE_RULE_ID',
                      },
                      caption: 'WIFI打卡',
                      codeName: 'druipart4',
                      detailStyle: 'DEFAULT',
                      detailType: 'DRUIPART',
                      defdgroupLogics: [
                        {
                          logicCat: 'PANELVISIBLE',
                          relatedDetailNames: ['checkin_method'],
                          groupOP: 'AND',
                          defdlogics: [
                            {
                              condOP: 'LIKE',
                              defdname: 'checkin_method',
                              value: 'wifi',
                              logicType: 'SINGLE',
                              id: 'checkin_method文本包含(%) wifi',
                            },
                          ],
                          logicType: 'GROUP',
                        },
                      ],
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'druipart4',
                    },
                  ],
                  codeName: 'grouppanel15',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  layoutPos: {
                    colLG: 18,
                    colLGOffset: 3,
                    colMD: 24,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel15',
                },
              ],
              codeName: 'grouppanel16',
              detailStyle: 'DEFAULT',
              detailType: 'GROUPPANEL',
              layoutPos: {
                colMD: 24,
                layout: 'TABLE_24COL',
              },
              id: 'grouppanel16',
            },
          ],
          caption: '设置打卡方式',
          codeName: 'formpage2',
          detailStyle: 'DEFAULT',
          detailType: 'FORMPAGE',
          defdgroupLogics: [
            {
              logicCat: 'PANELVISIBLE',
              relatedDetailNames: ['schedule_type'],
              groupOP: 'AND',
              defdlogics: [
                {
                  condOP: 'EQ',
                  defdname: 'schedule_type',
                  value: '1',
                  logicType: 'SINGLE',
                  id: 'schedule_type等于(=) 1',
                },
              ],
              logicType: 'GROUP',
            },
          ],
          id: 'formpage2',
        },
      ],
      layout: {
        columnCount: 24,
        layout: 'TABLE_24COL',
      },
      tabHeaderPos: 'TOP',
      autoLoad: true,
      showBusyIndicator: true,
      codeName: 'main',
      controlType: 'FORM',
      logicName: '主编辑表单',
      appDataEntityId: 'attendanceapp.attendance_rule',
      controlLogics: [
        {
          eventNames: 'onChange',
          itemName: 'inversion_days',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            "var realData = ctrl.getReal();\r\nvar _data = realData[0]\r\n\r\nif(_data.schedule_type==\"class_inversion\"){\r\n    console.log(\"N班倒-循环天数变更\")\r\n    //获取所有工作日进行删除\r\n    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\n    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');\r\n    const workdays = workDayService.local.getList(context);\r\n    workdays.forEach(day => {\r\n        workDayService.removeTemp(context, day);\r\n    })\r\n    //重新填充工作日\r\n    _data.workdays = null\r\n    const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');\r\n    const tempres2 = await attendanceService.exec('FillWorkDays', context, _data, viewParam);\r\n    Object.assign(_data, tempres2.data);\r\n    //创建临时数据\r\n    var workdays2 = _data.workdays;\r\n    if (workdays2){\r\n        const res = await workDayService.createTemp(context, workdays2)\r\n        if(res){\r\n            workdays2 = res.data;\r\n            console.log('临时工作日数据创建成功:', workdays2);\r\n        }\r\n    }\r\n\r\n    //更新组排班\r\n    const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');\r\n    const tempGroups = groupService.local.getList(context);\r\n    if (tempGroups){\r\n        await Promise.all(\r\n            tempGroups.map(async group => {\r\n                groupService.local.delete(context, group.id)\r\n            })\r\n        );\r\n    }\r\n\r\n    //删除当前组排班人员临时数据\r\n    const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');\r\n    const localGroup_members = group_membersService.local.getList(context);\r\n    if (localGroup_members != null) {\r\n        await Promise.all(\r\n            localGroup_members.map(async member => {\r\n                group_membersService.local.delete(context, member.id)\r\n            })\r\n        );\r\n    }\r\n    const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);\r\n    Object.assign(_data, tempres3.data);\r\n    var attendance_group_shifts = _data.attendance_group_shifts;\r\n    if (attendance_group_shifts){\r\n        const res = await groupService.createTemp(context, attendance_group_shifts)\r\n        if(res){\r\n            attendance_group_shifts = res.data;\r\n            console.log('临时组排班数据创建成功:', attendance_group_shifts);\r\n            _data.attendance_group_shifts = attendance_group_shifts;\r\n            const formMDCtrls = ctrl.formMDCtrls;\r\n            if(formMDCtrls){\r\n                const formMDCtrl = formMDCtrls.find(item => item.name === \"n_inversion\");\r\n                if (formMDCtrl) {\r\n                    formMDCtrl.refresh()\r\n                }\r\n                const formMDCtrl1 = formMDCtrls.find(item => item.name === \"test_attendance_group_shifts\");\r\n                if (formMDCtrl1) {\r\n                    formMDCtrl1.refresh()\r\n                }\r\n            }\r\n        }\r\n    }\r\n\r\n    var druipart14 = ctrl.formDruipart.find(item => item.model.codeName ===\"druipart14\")\r\n    // 刷新druipart14关系界面\r\n    if (druipart14) {\r\n        druipart14?.embedView?.callUIAction('Refresh');\r\n    }\r\n}",
          triggerType: 'CTRLEVENT',
          id: 'inversion_days',
        },
        {
          eventNames: 'onChange',
          itemName: 'rest',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            'var realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type=="work_rest"){\r\n    console.log("更新上A休B工作日")\r\n    // 获取所有临时数据进行删除\r\n    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\n    const workDayService = await serviceUtil.getService(context, \'attendanceapp.attendance_workday\');\r\n    const workdays = workDayService.local.getList(context);\r\n    workdays.forEach(day => {\r\n        workDayService.removeTemp(context, day);\r\n    })\r\n\r\n    var work = parseInt(_data.work) || 0;\r\n    var rest = parseInt(_data.rest) || 0;\r\n    var num = work + rest;\r\n    var _workdays = [];\r\n    for (var i = 1; i < num + 1; i++) {\r\n        var workday = {\r\n            name: "第" + i + "天",\r\n            day_number: i,\r\n            title: "工作/休息"\r\n        }\r\n        _workdays.push(workday)\r\n    }\r\n    const result = await workDayService.createTemp(context, _workdays);\r\n    if (result) {\r\n        _workdays = result.data;\r\n        console.log(\'临时数据创建成功:\', _workdays);\r\n        _data.workdays=_workdays;\r\n\r\n        //更新组排班\r\n        const groupService = await serviceUtil.getService(context, \'attendanceapp.attendance_group_shift\');\r\n        const tempGroups = groupService.local.getList(context);\r\n        if (tempGroups){\r\n            await Promise.all(\r\n                tempGroups.map(async group => {\r\n                    groupService.local.delete(context, group.id)\r\n                })\r\n            );\r\n        }\r\n\r\n        //删除当前组排班人员临时数据\r\n        const group_membersService = await serviceUtil.getService(context, \'attendanceapp.attendance_group_shift_member\');\r\n        const localGroup_members = group_membersService.local.getList(context);\r\n        if (localGroup_members != null) {\r\n            await Promise.all(\r\n                localGroup_members.map(async member => {\r\n                    group_membersService.local.delete(context, member.id)\r\n                })\r\n            );\r\n        }\r\n        const attendanceService = await serviceUtil.getService(context, \'attendanceapp.attendance_rule\');\r\n        const tempres3 = await attendanceService.exec(\'FillGroupShift\', context, _data, viewParam);\r\n        Object.assign(_data, tempres3.data);\r\n        var attendance_group_shifts = _data.attendance_group_shifts;\r\n        if (attendance_group_shifts){\r\n            const res = await groupService.createTemp(context, attendance_group_shifts)\r\n            if(res){\r\n                attendance_group_shifts = res.data;\r\n                console.log(\'临时数据创建成功:\', attendance_group_shifts);\r\n                _data.attendance_group_shifts = attendance_group_shifts;\r\n                const formMDCtrls = ctrl.formMDCtrls;\r\n                if(formMDCtrls){\r\n                    const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");\r\n                    if (formMDCtrl) {\r\n                        console.log("刷新重复器",formMDCtrl)\r\n                        formMDCtrl.refresh()\r\n                    }\r\n                    const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");\r\n                    if (formMDCtrl1) {\r\n                        console.log("刷新重复器",formMDCtrl1)\r\n                        formMDCtrl1.refresh()\r\n                    }\r\n                }\r\n            }\r\n        }\r\n    }\r\n    var druipart8 = ctrl.formDruipart.find(item => item.model.codeName === "druipart8")\r\n    // 刷新druiPart8关系界面\r\n    if (druipart8) {\r\n        druipart8?.embedView?.callUIAction(\'Refresh\');\r\n    }\r\n}',
          triggerType: 'CTRLEVENT',
          name: 'restChange',
          id: 'restchange',
        },
        {
          eventNames: 'onChange',
          itemName: 'alternate_week1',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            'var realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type=="alternate_week"){\r\n    console.log("大小周工作日-大周变更")\r\n    // 获取所有工作日（大周）临时数据进行删除\r\n    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\n    const workDayService = await serviceUtil.getService(context, \'attendanceapp.attendance_workday\');\r\n    const workdays = workDayService.local.getList(context);\r\n    workdays.forEach(day => {\r\n        if(day.day_number < 8){\r\n            workDayService.removeTemp(context, day);\r\n        }\r\n    })\r\n\r\n    //重新构建\r\n    const service = await serviceUtil.getService(context, \'attendanceapp.attendance_shift\');\r\n    const list = service.local.getList(context);\r\n    const defaultShift = list.find(item =>item.default_flag == 1 );\r\n    var selection = _data.week1;\r\n\r\n    if( defaultShift != null){\r\n        var _workdays = [];\r\n        for (var i = 1; i < 8; i++) {\r\n            var workday = {\r\n                shift_id : selection.includes(i.toString())?defaultShift.id:null,\r\n                name : i,\r\n                day_number : i ,\r\n                rule_id : _data.id ,\r\n                work_time : selection.includes(i.toString())?_data.work_time:"休息日"\r\n            }\r\n            _workdays.push(workday)\r\n        }\r\n        _data.workdays = _workdays;\r\n        const res = await workDayService.createTemp(context,_workdays)\r\n        if(res && res.ok){\r\n            _workdays = res.data;\r\n            console.log(\'工作日（大周）临时数据创建成功:\', _workdays);\r\n        }\r\n    }\r\n    var druipart6 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart6")\r\n    // 刷新druipart6关系界面\r\n    if (druipart6) {\r\n        druipart6?.embedView?.callUIAction(\'Refresh\');\r\n    }\r\n}\r\n',
          triggerType: 'CTRLEVENT',
          id: 'update_big_week',
        },
        {
          eventNames: 'onChange',
          itemName: 'alternate_week2',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            'var realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type=="alternate_week"){\r\n    console.log("大小周工作日-小周变更")\r\n    // 获取所有工作日（小周）临时数据进行删除\r\n    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\n    const workDayService = await serviceUtil.getService(context, \'attendanceapp.attendance_workday\');\r\n    const workdays = workDayService.local.getList(context);\r\n    workdays.forEach(day => {\r\n        if(7<day.day_number && day.day_number < 15){\r\n            workDayService.removeTemp(context, day);\r\n        }\r\n    })\r\n\r\n    //重新构建\r\n    const service = await serviceUtil.getService(context, \'attendanceapp.attendance_shift\');\r\n    const list = service.local.getList(context);\r\n    const defaultShift = list.find(item =>item.default_flag == 1 );\r\n    var selection = _data.week2;\r\n\r\n    if( defaultShift != null){\r\n        var _workdays = [];\r\n        for (var i = 8; i < 15; i++) {\r\n            var workday = {\r\n                shift_id : selection.includes(i.toString())?defaultShift.id:null,\r\n                name : i,\r\n                rule_id : _data.id,\r\n                day_number : i ,\r\n                work_time : selection.includes(i.toString())?_data.work_time:"休息日"\r\n            }\r\n            _workdays.push(workday)\r\n        }\r\n        _data.workdays = _workdays;\r\n        const res = await workDayService.createTemp(context,_workdays)\r\n        if(res && res.ok){\r\n            _workdays = res.data;\r\n            console.log(\'工作日（小周）临时数据创建成功:\', _workdays);\r\n        }\r\n    }\r\n    var druipart7 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart7")\r\n    // 刷新druipart7关系界面\r\n    if (druipart7) {\r\n        druipart7?.embedView?.callUIAction(\'Refresh\');\r\n    }\r\n}\r\n',
          triggerType: 'CTRLEVENT',
          id: 'update_small_week',
        },
        {
          eventNames: 'onChange',
          itemName: 'workday',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            'console.log("固定排班、灵活打卡-workday变更"+data)\r\nvar realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type=="fixed" || _data.schedule_type=="flexible"){\r\n    console.log("固定排班、灵活打卡-workday变更")\r\n    // 获取所有临时数据进行删除\r\n    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\n    const workDayService = await serviceUtil.getService(context, \'attendanceapp.attendance_workday\');\r\n    const workdays = workDayService.local.getList(context);\r\n    workdays.forEach(day => {\r\n        workDayService.removeTemp(context, day);\r\n    })\r\n\r\n    //重新构建\r\n    const service = await serviceUtil.getService(context, \'attendanceapp.attendance_shift\');\r\n    const list = service.local.getList(context);\r\n    const defaultShift = list.find(item =>item.default_flag == 1 );\r\n    list.forEach(s => {\r\n        if(s.default_flag != 1){\r\n            service.removeTemp(context, s);\r\n        }\r\n    })\r\n\r\n    var selection = _data.workday;\r\n    if( defaultShift != null){\r\n        var _workdays = [];\r\n        for (var i = 1; i < 8; i++) {\r\n            var workday = {\r\n                shift_id : selection.includes(i.toString())?defaultShift.id:null,\r\n                rule_id : _data.id,\r\n                name : i,\r\n                day_number: i,\r\n                work_time : selection.includes(i.toString())?_data.work_time:"休息日"\r\n            }\r\n            _workdays.push(workday)\r\n        }\r\n        _data.workdays = _workdays;\r\n        const res = await workDayService.createTemp(context,_workdays)\r\n        if(res && res.ok){\r\n            _workdays = res.data;\r\n            console.log(\'临时数据创建成功:\', _workdays);\r\n        }\r\n    }\r\n    var druiPart5 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart5")\r\n    // 刷新druipart5关系界面\r\n    if (druiPart5) {\r\n        druiPart5?.embedView?.callUIAction(\'Refresh\');\r\n    }\r\n}\r\n\r\n',
          triggerType: 'CTRLEVENT',
          id: 'update_workdays',
        },
        {
          eventNames: 'onChange',
          itemName: 'schedule_type',
          logicTag: 'form',
          logicType: 'SCRIPT',
          appDEUILogicId: 'cleantemp',
          appDataEntityId: 'attendanceapp.attendance_rule',
          scriptCode:
            "// tag1  清空临时数据\r\nconsole.log(\"清空临时数据\")\r\nconst serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\nvar realData = ctrl.getReal();\r\nvar _default = realData[0];\r\n_default.workday = \"1,2,3,4,5\";\r\n_default.shift_num = 1;\r\n\r\nif (_default.schedule_type === 'alternate_week') {\r\n    _default.week1 = \"1,2,3,4,5\";\r\n    _default.week2 = \"8,9,10,11,12,13\";\r\n    _default.week3 = null;\r\n    _default.week4 = null;\r\n    ctrl.data.alternate_week1 = \"1,2,3,4,5\";\r\n    ctrl.data.alternate_week2 = \"8,9,10,11,12,13\";\r\n}\r\n\r\nif (_default.schedule_type === 'class_inversion') {\r\n    _default.week1 = \"1,2,3,4,5,6\";\r\n    _default.week2 = \"8,9,10,11,12,13\";\r\n    _default.week3 = \"15,16,17,18,19,20\";\r\n    _default.week4 = \"22,23,24,25,26,27\";\r\n    ctrl.data.inversion_week1 = \"1,2,3,4,5,6\";\r\n    ctrl.data.inversion_week2 = \"8,9,10,11,12,13\";\r\n    ctrl.data.inversion_week3 = \"15,16,17,18,19,20\";\r\n    ctrl.data.inversion_week4 = \"22,23,24,25,26,27\";\r\n}\r\n\r\nconst service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');\r\nconst list = service.local.getList(context);\r\nif (list != null) {\r\n    // 遍历shift临时数据删除\r\n    await Promise.all(\r\n        list.map(async shift => {\r\n            await service.local.delete(context, shift.id)\r\n        })\r\n    );\r\n    const scopeService = await serviceUtil.getService(context, 'attendanceapp.attendance_scope');\r\n    const scopes = scopeService.local.getList(context);\r\n    // 遍历scope临时数据删除\r\n    if (scopes !== null) {\r\n        await Promise.all(\r\n            scopes.map(async s => {\r\n                await scopeService.local.delete(context, s.id)\r\n            })\r\n        );\r\n    }\r\n}\r\n\r\n//遍历workday临时数据删除\r\nconst workdayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');\r\nconst workdays = workdayService.local.getList(context);\r\nif (workdays != null) {\r\n    await Promise.all(\r\n        workdays.map(async workday => {\r\n            await workdayService.local.delete(context, workday.id)\r\n        })\r\n    );\r\n}\r\n\r\n// tag2 执行实体行为 FillDefaultShift\r\nif (['fixed', 'free', 'work_rest', 'alternate_week', 'flexible', 'class_inversion', 'manual'].includes(_default.schedule_type)) {\r\n    const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');\r\n    _default.shifts = null;\r\n    const tempres = await attendanceService.exec('FillDefaultShift', context, _default, viewParam);\r\n    Object.assign(_default, tempres.data);\r\n    ctrl.data.default_shift = _default.default_shift\r\n    // tag3 添加临时数据shifts\r\n    var shifts = _default.shifts;\r\n\r\n    await Promise.all(\r\n        shifts.map(async shift => {\r\n            await service.exec('CreateTemp', context, shift);\r\n        })\r\n    );\r\n\r\n    // tag4 执行指定实体行为 fillWorkDays\r\n    if (_default.schedule_type !== 'free' && _default.schedule_type !== 'manual') {\r\n        _default.workdays = null;\r\n        const tempres2 = await attendanceService.exec('FillWorkDays', context, _default, viewParam);\r\n        Object.assign(_default, tempres2.data);\r\n        // tag6 创建临时数据\r\n        var workdays2 = _default.workdays;\r\n        if (workdays2) {\r\n            await Promise.all(\r\n                workdays2.map(async workday => {\r\n                    await workdayService.createTemp(context, workday);\r\n                })\r\n            );\r\n        }\r\n\r\n        // tag7 大小周\r\n        if (_default.schedule_type === 'alternate_week') {\r\n            // tag8\r\n            // 大周\r\n            var druiPart6 = ctrl.formDruipart.find(item => item.model.codeName === \"druipart6\")\r\n            // 小周\r\n            var druiPart7 = ctrl.formDruipart.find(item => item.model.codeName === \"druipart7\")\r\n            // 刷新druipart6关系界面\r\n            if (druiPart6) {\r\n                druiPart6.context.schedule_type = _default.schedule_type\r\n                druiPart6?.embedView?.callUIAction('Refresh');\r\n            }\r\n            if (druiPart7) {\r\n                druiPart7.context.schedule_type = _default.schedule_type\r\n                druiPart7?.embedView?.callUIAction('Refresh');\r\n            }\r\n        } else if (['fixed', 'flexible'].includes(_default.schedule_type)) {\r\n            // tag9 固定排班、灵活打卡\r\n            var druiPart5 = ctrl.formDruipart.find(item => item.model.codeName === \"druipart5\")\r\n            // 刷新druipart5关系界面\r\n            if (druiPart5) {\r\n                druiPart5.context.schedule_type = _default.schedule_type\r\n                druiPart5?.embedView?.callUIAction('Refresh');\r\n            }\r\n        } else if (_default.schedule_type === 'work_rest') {\r\n            // 上A休B\r\n            var druipart8 = ctrl.formDruipart.find(item => item.model.codeName === \"druipart8\")\r\n\r\n            // 刷新druipart8关系界面\r\n            if (druipart8) {\r\n                druipart8.context.schedule_type = _default.schedule_type\r\n                druipart8?.embedView?.callUIAction('Refresh');\r\n            }\r\n        } else if (_default.schedule_type === 'class_inversion') {\r\n            var druipart13 = ctrl.formDruipart.find(item => item.model.codeName === \"druipart13\")\r\n            // 刷新班次关系界面\r\n            if (druipart13) {\r\n                druipart13.context.schedule_type = _default.schedule_type\r\n                druipart13?.embedView?.callUIAction('Refresh');\r\n            }\r\n            // N班倒-休息日相同\r\n            if (_default.same_restday === 1) {\r\n                var druipart9 = ctrl.formDruipart.find(item => item.model.codeName === \"druipart9\")\r\n\r\n                // 刷新druipart9关系界面\r\n                if (druipart9) {\r\n                    druipart9.context.schedule_type = _default.schedule_type\r\n                    druipart9?.embedView?.callUIAction('Refresh');\r\n                }\r\n                var druipart10 = ctrl.formDruipart.find(item => item.model.codeName === \"druipart10\")\r\n\r\n                // 刷新druipart10关系界面\r\n                if (druipart10) {\r\n                    druipart10.context.schedule_type = _default.schedule_type\r\n                    druipart10?.embedView?.callUIAction('Refresh');\r\n                }\r\n            }\r\n            // N班倒-休息日不同\r\n            if (_default.same_restday === 0) {\r\n                var druipart14 = ctrl.formDruipart.find(item => item.model.codeName === \"druipart14\")\r\n                // 刷新druipart14关系界面\r\n                if (druipart14) {\r\n                    druipart14.context.schedule_type = _default.schedule_type\r\n                    druipart14?.embedView?.callUIAction('Refresh');\r\n                }\r\n            }\r\n        }\r\n\r\n    } else if (_default.schedule_type === 'manual') {\r\n        // 手动排班\r\n        var druipart1 = ctrl.formDruipart.find(item => item.model.codeName === \"druipart1\")\r\n        // 刷新druipart1关系界面\r\n        if (druipart1) {\r\n            druipart1.context.schedule_type = 'manual'\r\n            setTimeout(() => {\r\n                druipart1?.embedView?.callUIAction('Refresh');\r\n            }, 200)\r\n        }\r\n\r\n    } else if (_default.schedule_type === 'free') {\r\n        // tag5 自由班\r\n        console.log(\"填充自由班次\")\r\n        var shifts1 = _default.shifts;\r\n        var scopes = shifts1[0].scopes;\r\n        // var _default = uiLogic.default;\r\n        _default.free_start = scopes[0].start_base_time;\r\n        _default.free_end = scopes[0].end_base_time;\r\n\r\n        ctrl.data.free_start = scopes[0].start_base_time;\r\n        ctrl.data.free_end = scopes[0].end_base_time;\r\n\r\n    }\r\n\r\n    //更新组排班\r\n    console.log(\"更新组排班\",)\r\n    //删除当前组排班临时数据\r\n    const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');\r\n    const localGroup = groupService.local.getList(context);\r\n    if (localGroup != null) {\r\n        await Promise.all(\r\n            localGroup.map(async group => {\r\n                await groupService.local.delete(context, group.id);\r\n            })\r\n        );\r\n    }\r\n    //删除当前组排班人员临时数据\r\n    const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');\r\n    const localGroup_members = group_membersService.local.getList(context);\r\n    if (localGroup_members != null) {\r\n        await Promise.all(\r\n            localGroup_members.map(async member => {\r\n                await group_membersService.local.delete(context, member.id);\r\n            })\r\n        );\r\n    }\r\n    //填充新组排班\r\n    _default.group_shifts = null\r\n    const tempres3 = await attendanceService.exec('FillGroupShift', context, _default, viewParam);\r\n    Object.assign(_default, tempres3.data);\r\n    var group_shifts = _default.group_shifts;\r\n    if (group_shifts != null) {\r\n        const res = await groupService.createTemp(context, group_shifts);\r\n        if (res && res.ok) {\r\n            console.log('组排班临时数据创建成功');\r\n            const formMDCtrls = ctrl.formMDCtrls;\r\n            if (formMDCtrls) {\r\n                const formMDCtrl = formMDCtrls.find(item => item.name === \"n_inversion\");\r\n                if (formMDCtrl) {\r\n                    formMDCtrl.refresh()\r\n                }\r\n                const formMDCtrl1 = formMDCtrls.find(item => item.name === \"test_group_shifts\");\r\n                if (formMDCtrl1) {\r\n                    formMDCtrl1.refresh()\r\n                }\r\n            }\r\n        }\r\n    }\r\n\r\n}\r\n//刷新表单工时\r\nctrl.data.work_time = null;\r\nif ( _default.shifts != null) {\r\n    const defaultShift =  _default.shifts.find(item => item.default_flag === 1);\r\n    if (defaultShift != null && defaultShift.scopes != null) {\r\n        //1、刷新主表单工时\r\n        var scopes = defaultShift.scopes\r\n        var worktimeParts = [];\r\n        scopes.forEach(scope => {\r\n            var start = scope.start_base_time.substring(0, 5);\r\n            if(scope.next_tag === \"1,0\"||scope.next_tag === \"1,1\"){\r\n                start = \"次日\" + start;\r\n            }\r\n            var end = scope.end_base_time.substring(0, 5);\r\n            if(scope.next_tag === \"0,1\"||scope.next_tag === \"1,1\"){\r\n                end = \"次日\" + end;\r\n            }\r\n            worktimeParts.push(start + '-' + end);\r\n        })\r\n        if (_default.schedule_type == \"work_rest\") {\r\n            ctrl.data.work_time1 = worktimeParts.join('/')\r\n\r\n        }\r\n        if (_default.schedule_type == \"alternate_week\" || _default.schedule_type == \"fixed\" || _default.schedule_type == \"flexible\") {\r\n            ctrl.data.work_time = worktimeParts.join('/')\r\n\r\n        }\r\n    }\r\n\r\n}\r\n",
          triggerType: 'CTRLEVENT',
          name: 'cleanTemp',
          id: 'cleantemp',
        },
        {
          eventNames: 'onChange',
          itemName: 'inversion_week3',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            "const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\nvar realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type==\"class_inversion\"){\r\n    console.log(\"N班倒-week3变更\")\r\n    // 获取所有工作日（week3）临时数据进行删除\r\n    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');\r\n    const workdays = workDayService.local.getList(context);\r\n    workdays.forEach(day => {\r\n        if(14<day.day_number&& day.day_number <22){\r\n            workDayService.removeTemp(context, day);\r\n        }\r\n    })\r\n\r\n    //重新构建\r\n    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');\r\n    const list = service.local.getList(context);\r\n    var selection = _data.week3;\r\n\r\n    if( list != null){\r\n        var title = list.map(item => item.name).join('/');\r\n        var _workdays = [];\r\n        for (var i = 15; i < 22; i++) {\r\n            var workday = {\r\n                name : i,\r\n                day_number : i ,\r\n                rule_id : _data.id,\r\n                title: selection.includes(i.toString()) ? title : \"休息\"\r\n            }\r\n            _workdays.push(workday)\r\n        }\r\n        _data.workdays = _workdays;\r\n        const tempwork = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');\r\n        const result = await tempwork.createTemp(context,_workdays)\r\n        if(result){\r\n            _workdays = result.data;\r\n            console.log('工作日（week3）临时数据创建成功:', _workdays);\r\n            const newWorkdays = workDayService.local.getList(context);\r\n            _data.workdays = newWorkdays;\r\n\r\n            //更新组排班\r\n            const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');\r\n            const tempGroups = groupService.local.getList(context);\r\n            if (tempGroups){\r\n                await Promise.all(\r\n                    tempGroups.map(async group => {\r\n                        groupService.local.delete(context, group.id)\r\n                    })\r\n                );\r\n            }\r\n\r\n            //删除当前组排班人员临时数据\r\n            const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');\r\n            const localGroup_members = group_membersService.local.getList(context);\r\n            if (localGroup_members != null) {\r\n                await Promise.all(\r\n                    localGroup_members.map(async member => {\r\n                        group_membersService.local.delete(context, member.id)\r\n                    })\r\n                );\r\n            }\r\n            const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');\r\n            const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);\r\n            Object.assign(_data, tempres3.data);\r\n            var attendance_group_shifts = _data.attendance_group_shifts;\r\n            if (attendance_group_shifts){\r\n                const res = await groupService.createTemp(context, attendance_group_shifts)\r\n                if(res){\r\n                    attendance_group_shifts = res.data;\r\n                    console.log('临时组排班数据创建成功:', attendance_group_shifts);\r\n                    _data.attendance_group_shifts = attendance_group_shifts;\r\n                    const formMDCtrls = ctrl.formMDCtrls;\r\n                    if(formMDCtrls){\r\n                        const formMDCtrl = formMDCtrls.find(item => item.name === \"n_inversion\");\r\n                        if (formMDCtrl) {\r\n                            formMDCtrl.refresh()\r\n                        }\r\n                        const formMDCtrl1 = formMDCtrls.find(item => item.name === \"test_attendance_group_shifts\");\r\n                        if (formMDCtrl1) {\r\n                            formMDCtrl1.refresh()\r\n                        }\r\n                    }\r\n                }\r\n            }\r\n        }\r\n    }\r\n    var druipart11 = ctrl.formDruipart.find(item => item.model.codeName ===\"druipart11\")\r\n    // 刷新druipart11关系界面\r\n    if (druipart11) {\r\n        druipart11?.embedView?.callUIAction('Refresh');\r\n    }\r\n}\r\n",
          triggerType: 'CTRLEVENT',
          id: 'inversion_week3',
        },
        {
          eventNames: 'onChange',
          itemName: 'inversion_week4',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            "var realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type==\"class_inversion\"){\r\n    console.log(\"N班倒-week4变更\")\r\n    // 获取所有工作日（week4）临时数据进行删除\r\n    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\n    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');\r\n    const workdays = workDayService.local.getList(context);\r\n    workdays.forEach(day => {\r\n        if(21<day.day_number&& day.day_number < 29){\r\n            workDayService.removeTemp(context, day);\r\n        }\r\n    })\r\n\r\n    //重新构建 \r\n    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');\r\n    const list = service.local.getList(context);\r\n    var selection = _data.week4;\r\n\r\n    if( list != null){\r\n        var title = list.map(item => item.name).join('/');    var _workdays = [];\r\n        for (var i = 22; i < 29; i++) {\r\n            var workday = {\r\n                name : i,\r\n                day_number : i ,\r\n                rule_id : _data.id,\r\n                title: selection.includes(i.toString()) ? title : \"休息\"\r\n            }\r\n            _workdays.push(workday)\r\n        }\r\n        _data.workdays = _workdays;\r\n        const tempwork = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');\r\n        const result = await tempwork.createTemp(context,_workdays)\r\n        if(result){\r\n            _workdays = result.data;\r\n            console.log('工作日（week4）临时数据创建成功:', _workdays);\r\n            const newWorkdays = workDayService.local.getList(context);\r\n            _data.workdays = newWorkdays;\r\n\r\n            //更新组排班\r\n            const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');\r\n            const tempGroups = groupService.local.getList(context);\r\n            if (tempGroups){\r\n                await Promise.all(\r\n                    tempGroups.map(async group => {\r\n                        groupService.local.delete(context, group.id)\r\n                    })\r\n                );\r\n            }\r\n\r\n            //删除当前组排班人员临时数据\r\n            const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');\r\n            const localGroup_members = group_membersService.local.getList(context);\r\n            if (localGroup_members != null) {\r\n                await Promise.all(\r\n                    localGroup_members.map(async member => {\r\n                        group_membersService.local.delete(context, member.id)\r\n                    })\r\n                );\r\n            }\r\n            const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');\r\n            const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);\r\n            Object.assign(_data, tempres3.data);\r\n            var attendance_group_shifts = _data.attendance_group_shifts;\r\n            if (attendance_group_shifts){\r\n                const res = await groupService.createTemp(context, attendance_group_shifts)\r\n                if(res){\r\n                    attendance_group_shifts = res.data;\r\n                    console.log('临时组排班数据创建成功:', attendance_group_shifts);\r\n                    _data.attendance_group_shifts = attendance_group_shifts;\r\n                    const formMDCtrls = ctrl.formMDCtrls;\r\n                    if(formMDCtrls){\r\n                        const formMDCtrl = formMDCtrls.find(item => item.name === \"n_inversion\");\r\n                        if (formMDCtrl) {\r\n                            formMDCtrl.refresh()\r\n                        }\r\n                        const formMDCtrl1 = formMDCtrls.find(item => item.name === \"test_attendance_group_shifts\");\r\n                        if (formMDCtrl1) {\r\n                            formMDCtrl1.refresh()\r\n                        }\r\n                    }\r\n                }\r\n            }\r\n        }\r\n    }\r\n    var druipart12 = ctrl.formDruipart.find(item => item.model.codeName ===\"druipart12\")\r\n    // 刷新druipart12关系界面\r\n    if (druipart12) {\r\n        druipart12?.embedView?.callUIAction('Refresh');\r\n    }\r\n}\r\n",
          triggerType: 'CTRLEVENT',
          id: 'inversion_week4',
        },
        {
          eventNames: 'onChange',
          itemName: 'inversion_week1',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            "console.log(\"N班倒-week1变更\")\r\nconst serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\nvar realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type==\"class_inversion\"){\r\n    // 获取所有工作日（week1）临时数据进行删除\r\n    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');\r\n    const workdays = workDayService.local.getList(context);\r\n    workdays.forEach(day => {\r\n        if(day.day_number < 8){\r\n            workDayService.removeTemp(context, day);\r\n        }\r\n    })\r\n\r\n    //重新构建\r\n    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');\r\n    const list = service.local.getList(context);\r\n    console.log('工作日（week1）临时数据创建:', _data);\r\n\r\n    var selection = _data.week1;\r\n\r\n    if( list != null){\r\n        var title = list.map(item => item.name).join('/');\r\n        var _workdays = [];\r\n        for (var i = 1; i < 8; i++) {\r\n            var workday = {\r\n                name : i,\r\n                day_number : i ,\r\n                rule_id : _data.id,\r\n                title: selection.includes(i.toString()) ? title : \"休息\"\r\n            }\r\n            _workdays.push(workday)\r\n        }\r\n        _data.workdays = _workdays;\r\n        const tempwork = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');\r\n        const result = await tempwork.createTemp(context,_workdays)\r\n        if(result){\r\n            _workdays = result.data;\r\n            console.log('工作日（week1）临时数据创建成功:', _workdays);\r\n            const newWorkdays = workDayService.local.getList(context);\r\n            _data.workdays = newWorkdays;\r\n            //更新组排班\r\n            const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');\r\n            const tempGroups = groupService.local.getList(context);\r\n            if (tempGroups){\r\n                await Promise.all(\r\n                    tempGroups.map(async group => {\r\n                        groupService.local.delete(context, group.id)\r\n                    })\r\n                );\r\n            }\r\n\r\n            //删除当前组排班人员临时数据\r\n            const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');\r\n            const localGroup_members = group_membersService.local.getList(context);\r\n            if (localGroup_members != null) {\r\n                await Promise.all(\r\n                    localGroup_members.map(async member => {\r\n                        group_membersService.local.delete(context, member.id)\r\n                    })\r\n                );\r\n            }\r\n            const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');\r\n            const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);\r\n            Object.assign(_data, tempres3.data);\r\n            var attendance_group_shifts = _data.attendance_group_shifts;\r\n            if (attendance_group_shifts){\r\n                const res = await groupService.createTemp(context, attendance_group_shifts)\r\n                if(res){\r\n                    attendance_group_shifts = res.data;\r\n                    console.log('临时组排班数据创建成功:', attendance_group_shifts);\r\n                    _data.attendance_group_shifts = attendance_group_shifts;\r\n                    const formMDCtrls = ctrl.formMDCtrls;\r\n                    if(formMDCtrls){\r\n                        const formMDCtrl = formMDCtrls.find(item => item.name === \"n_inversion\");\r\n                        if (formMDCtrl) {\r\n                            formMDCtrl.refresh()\r\n                        }\r\n                        const formMDCtrl1 = formMDCtrls.find(item => item.name === \"test_attendance_group_shifts\");\r\n                        if (formMDCtrl1) {\r\n                            formMDCtrl1.refresh()\r\n                        }\r\n                    }\r\n                }\r\n            }\r\n        }\r\n    }\r\n    var druipart9 = ctrl.formDruipart.find(item => item.model.codeName ===\"druipart9\")\r\n    // 刷新druipart9关系界面\r\n    if (druipart9) {\r\n        druipart9?.embedView?.callUIAction('Refresh');\r\n    }\r\n}\r\n",
          triggerType: 'CTRLEVENT',
          id: 'inversion_week1',
        },
        {
          eventNames: 'onChange',
          itemName: 'inversion_week2',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            "var realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type==\"class_inversion\"){\r\n    console.log(\"N班倒-week2变更\")\r\n    // 获取所有工作日（week2）临时数据进行删除\r\n    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\n    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');\r\n    const workdays = workDayService.local.getList(context);\r\n    workdays.forEach(day => {\r\n        if(7<day.day_number&& day.day_number <15){\r\n            workDayService.removeTemp(context, day);\r\n        }\r\n    })\r\n\r\n    //重新构建 \r\n    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');\r\n    const list = service.local.getList(context);\r\n    var selection = _data.week2;\r\n\r\n    if( list != null){\r\n        var title = list.map(item => item.name).join('/');\r\n        var _workdays = [];\r\n        for (var i = 8; i < 15; i++) {\r\n            var workday = {\r\n                name : i,\r\n                day_number : i ,\r\n                rule_id : _data.id,\r\n                title: selection.includes(i.toString()) ? title : \"休息\"\r\n            }\r\n            _workdays.push(workday)\r\n        }\r\n        _data.workdays = _workdays;\r\n        const tempwork = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');\r\n        const result = await tempwork.createTemp(context,_workdays)\r\n        if(result){\r\n            _workdays = result.data;\r\n            console.log('工作日（week2）临时数据创建成功:', _workdays);\r\n            const newWorkdays = workDayService.local.getList(context);\r\n            _data.workdays = newWorkdays;\r\n            //更新组排班\r\n            const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');\r\n            const tempGroups = groupService.local.getList(context);\r\n            if (tempGroups){\r\n                await Promise.all(\r\n                    tempGroups.map(async group => {\r\n                        groupService.local.delete(context, group.id)\r\n                    })\r\n                );\r\n            }\r\n\r\n            //删除当前组排班人员临时数据\r\n            const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');\r\n            const localGroup_members = group_membersService.local.getList(context);\r\n            if (localGroup_members != null) {\r\n                await Promise.all(\r\n                    localGroup_members.map(async member => {\r\n                        group_membersService.local.delete(context, member.id)\r\n                    })\r\n                );\r\n            }\r\n            const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');\r\n            const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);\r\n            Object.assign(_data, tempres3.data);\r\n            var attendance_group_shifts = _data.attendance_group_shifts;\r\n            if (attendance_group_shifts){\r\n                const res = await groupService.createTemp(context, attendance_group_shifts)\r\n                if(res){\r\n                    attendance_group_shifts = res.data;\r\n                    console.log('临时组排班数据创建成功:', attendance_group_shifts);\r\n                    _data.attendance_group_shifts = attendance_group_shifts;\r\n                    const formMDCtrls = ctrl.formMDCtrls;\r\n                    if(formMDCtrls){\r\n                        const formMDCtrl = formMDCtrls.find(item => item.name === \"n_inversion\");\r\n                        if (formMDCtrl) {\r\n                            formMDCtrl.refresh()\r\n                        }\r\n                        const formMDCtrl1 = formMDCtrls.find(item => item.name === \"test_attendance_group_shifts\");\r\n                        if (formMDCtrl1) {\r\n                            formMDCtrl1.refresh()\r\n                        }\r\n                    }\r\n                }\r\n            }\r\n        }\r\n    }\r\n    var druipart10 = ctrl.formDruipart.find(item => item.model.codeName ===\"druipart10\")\r\n    // 刷新druipart10关系界面\r\n    if (druipart10) {\r\n        druipart10?.embedView?.callUIAction('Refresh');\r\n    }\r\n}\r\n",
          triggerType: 'CTRLEVENT',
          id: 'inversion_week2',
        },
        {
          eventNames: 'onChange',
          itemName: 'inversion_count',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            'var realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type=="class_inversion"){\r\n    console.log("N班倒-inversion_count变更")\r\n    // 获取所有临时数据进行删除\r\n    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\n    const service = await serviceUtil.getService(context, \'attendanceapp.attendance_shift\');\r\n    const shifts = service.local.getList(context);\r\n    shifts.forEach(shift => {\r\n        service.removeTemp(context, shift);\r\n    })\r\n\r\n    function timeToMinutes(timeStr) {\r\n        const parts = timeStr.split(\':\');\r\n        const hours = parseInt(parts[0], 10);\r\n        const minutes = parseInt(parts[1], 10);\r\n        return hours * 60 + minutes;\r\n    }\r\n\r\n    //重新构建\r\n    var inversion_count = _data.inversion_count;\r\n    var new_shifts = [];\r\n    // 生成白班和晚班配置\r\n    const createShift = (name, startTime, endTime) => {\r\n        return {\r\n            attendance_ratio: 1.0,\r\n            working_number: 1,\r\n            scopes: [{\r\n                early_for_absenteeism: 60,\r\n                early_for_early: 0,\r\n                latest_checkout: 480,\r\n                earliest_checkin: 60,\r\n                end_base_time: endTime,\r\n                late_for_absenteeism: 60,\r\n                late_for_late: 0,\r\n                shift_name: name,\r\n                start_base_time: startTime,\r\n                order_value: 1,\r\n                next_tag: timeToMinutes(startTime)>=timeToMinutes(endTime)?"0,1":"0,0"\r\n            }],\r\n            default_flag: 0,\r\n            public_flag: 0,\r\n            name: name,\r\n        };\r\n    };\r\n\r\n\r\n    var title = "";\r\n    // 创建班次对象\r\n    if(inversion_count == 2){\r\n        const dayShift = createShift("白班", "09:00:00", "20:00:00");\r\n        const nightShift = createShift("晚班", "20:00:00", "08:00:00");\r\n        new_shifts.push(dayShift, nightShift);\r\n        title = "白班/晚班"\r\n    }\r\n    if(inversion_count == 3){\r\n        const dayShift = createShift("白班", "08:00:00", "16:00:00");\r\n        const middleShift = createShift("中班", "16:00:00", "00:00:00");\r\n        const nightShift = createShift("晚班", "00:00:00", "08:00:00");\r\n        new_shifts.push(dayShift, middleShift, nightShift);\r\n        title = "白班/中班/晚班"\r\n\r\n    }\r\n    if(inversion_count == 4){\r\n        const morningShift = createShift("早班", "08:00:00", "12:00:00");\r\n        const afternoonShift = createShift("下午班", "14:00:00", "20:00:00");\r\n        const eveShift = createShift("前夜班", "20:00:00", "02:00:00");\r\n        const afterShift = createShift("后夜班", "02:00:00", "08:00:00");\r\n        new_shifts.push(morningShift);\r\n        new_shifts.push(afternoonShift, eveShift,afterShift);\r\n        title = "早班/下午班/前夜班/后夜班"\r\n    }\r\n\r\n    const tempService = await serviceUtil.getService(context, \'attendanceapp.attendance_shift\');\r\n    const shiftRes = await tempService.exec(\'CreateTemp\', context, new_shifts);\r\n\r\n    if (shiftRes && shiftRes.ok) {\r\n        console.log(\'shift临时数据创建成功\');\r\n        _data.shifts = shiftRes.data\r\n        //更新工作日title\r\n        const workDayService = await serviceUtil.getService(context, \'attendanceapp.attendance_workday\');\r\n        const workdays = workDayService.local.getList(context);\r\n        workdays.forEach(day => {\r\n            if(day.title != "休息"){\r\n                day.title = _data.same_restday == 0 ? title + "/休息" : title;\r\n                workDayService.updateTemp(context, day);\r\n            }\r\n        })\r\n        _data.workdays = workdays\r\n\r\n        //更新组排班\r\n        const groupService = await serviceUtil.getService(context, \'attendanceapp.attendance_group_shift\');\r\n        const tempGroups = groupService.local.getList(context);\r\n        if (tempGroups){\r\n            await Promise.all(\r\n                tempGroups.map(async group => {\r\n                    groupService.local.delete(context, group.id)\r\n                })\r\n            );\r\n        }\r\n\r\n        //删除当前组排班人员临时数据\r\n        const group_membersService = await serviceUtil.getService(context, \'attendanceapp.attendance_group_shift_member\');\r\n        const localGroup_members = group_membersService.local.getList(context);\r\n        if (localGroup_members != null) {\r\n            await Promise.all(\r\n                localGroup_members.map(async member => {\r\n                    group_membersService.local.delete(context, member.id)\r\n                })\r\n            );\r\n        }\r\n        const attendanceService = await serviceUtil.getService(context, \'attendanceapp.attendance_rule\');\r\n        const tempres3 = await attendanceService.exec(\'FillGroupShift\', context, _data, viewParam);\r\n        Object.assign(_data, tempres3.data);\r\n        var attendance_group_shifts = _data.attendance_group_shifts;\r\n        if (attendance_group_shifts){\r\n            const res = await groupService.createTemp(context, attendance_group_shifts)\r\n            if(res){\r\n                attendance_group_shifts = res.data;\r\n                console.log(\'临时数据创建成功:\', attendance_group_shifts);\r\n                _data.attendance_group_shifts = attendance_group_shifts;\r\n                const formMDCtrls = ctrl.formMDCtrls;\r\n                if(formMDCtrls){\r\n                    const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");\r\n                    if (formMDCtrl) {\r\n                        console.log("刷新重复器",formMDCtrl)\r\n                        formMDCtrl.refresh()\r\n                    }\r\n                    const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");\r\n                    if (formMDCtrl1) {\r\n                        console.log("刷新重复器",formMDCtrl1)\r\n                        formMDCtrl1.refresh()\r\n                    }\r\n                }\r\n            }\r\n        }\r\n\r\n        //刷新关系页\r\n        var druipart13 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart13")\r\n        // 刷新druipart13关系界面\r\n        if (druipart13) {\r\n            druipart13?.embedView?.callUIAction(\'Refresh\');\r\n        }\r\n        if(_data.same_restday == 0){\r\n            //休息日不同\r\n            var druipart14 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart14")\r\n            // 刷新druipart14关系界面\r\n            if (druipart14) {\r\n                druipart14?.embedView?.callUIAction(\'Refresh\');\r\n            }\r\n        }else {\r\n            //刷新关系页 休息日相同\r\n            var druipart9 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart9")\r\n            // 刷新druipart9关系界面\r\n            if (druipart9) {\r\n                druipart9?.embedView?.callUIAction(\'Refresh\');\r\n            }\r\n\r\n            var inversion_cycle = _data.inversion_cycle;\r\n\r\n            if(inversion_cycle >1){\r\n                //刷新关系页\r\n                var druipart10 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart10")\r\n                // 刷新druipart10关系界面\r\n                if (druipart10) {\r\n                    druipart10?.embedView?.callUIAction(\'Refresh\');\r\n                }\r\n            }\r\n\r\n            if(inversion_cycle >2){\r\n                //刷新关系页\r\n                var druipart11 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart11")\r\n                // 刷新druipart11关系界面\r\n                if (druipart11) {\r\n                    druipart11?.embedView?.callUIAction(\'Refresh\');\r\n                }\r\n            }\r\n\r\n            if(inversion_cycle >3){\r\n                //刷新关系页\r\n                var druipart12 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart12")\r\n                // 刷新druipart12关系界面\r\n                if (druipart12) {\r\n                    druipart12?.embedView?.callUIAction(\'Refresh\');\r\n                }\r\n            }\r\n        }\r\n    }\r\n\r\n}\r\n',
          triggerType: 'CTRLEVENT',
          id: 'inversion_count',
        },
        {
          eventNames: 'onChange',
          itemName: 'same_restday',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            "var realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type==\"class_inversion\"){\r\n    console.log(\"N班倒-休息日是否相同\")\r\n    //获取所有工作日进行删除\r\n    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\n    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');\r\n    const workdays = workDayService.local.getList(context);\r\n    workdays.forEach(day => {\r\n        workDayService.removeTemp(context, day);\r\n    })\r\n    //重新填充工作日\r\n    _data.workdays = null\r\n    const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');\r\n    const tempres2 = await attendanceService.exec('FillWorkDays', context, _data, viewParam);\r\n    Object.assign(_data, tempres2.data);\r\n    //创建临时数据\r\n    var workdays2 = _data.workdays;\r\n    for (var i = 0; i < workdays2.length; i++) {\r\n        workDayService.createTemp(context, workdays2[i]);\r\n    }\r\n    //更新组排班\r\n    const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');\r\n    const tempGroups = groupService.local.getList(context);\r\n    if (tempGroups){\r\n        await Promise.all(\r\n            tempGroups.map(async group => {\r\n                groupService.local.delete(context, group.id)\r\n            })\r\n        );\r\n    }\r\n\r\n    //删除当前组排班人员临时数据\r\n    const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');\r\n    const localGroup_members = group_membersService.local.getList(context);\r\n    if (localGroup_members != null) {\r\n        await Promise.all(\r\n            localGroup_members.map(async member => {\r\n                group_membersService.local.delete(context, member.id)\r\n            })\r\n        );\r\n    }\r\n    const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);\r\n    Object.assign(_data, tempres3.data);\r\n    var group_shifts = _data.group_shifts;\r\n    if (group_shifts){\r\n        const res = await groupService.createTemp(context, group_shifts)\r\n        if(res){\r\n            group_shifts = res.data;\r\n            console.log('group_shifts:', group_shifts);\r\n            _data.group_shifts = group_shifts;\r\n            const formMDCtrls = ctrl.formMDCtrls;\r\n            if(formMDCtrls){\r\n                const formMDCtrl = formMDCtrls.find(item => item.name === \"n_inversion\");\r\n                if (formMDCtrl) {\r\n                    formMDCtrl.refresh()\r\n                }\r\n                const formMDCtrl1 = formMDCtrls.find(item => item.name === \"test_group_shifts\");\r\n                if (formMDCtrl1) {\r\n                    formMDCtrl1.refresh()\r\n                }\r\n            }\r\n        }\r\n    }\r\n    if(_data.same_restday == 0){\r\n        var druipart14 = ctrl.formDruipart.find(item => item.model.codeName ===\"druipart14\")\r\n        // 刷新druipart14关系界面\r\n        if (druipart14) {\r\n            druipart14?.embedView?.callUIAction('Refresh');\r\n        }\r\n    }else{\r\n        //刷新关系页\r\n        var druipart9 = ctrl.formDruipart.find(item => item.model.codeName ===\"druipart9\")\r\n        // 刷新druipart9关系界面\r\n        if (druipart9) {\r\n            druipart9?.embedView?.callUIAction('Refresh');\r\n        }\r\n        //刷新关系页\r\n        var druipart10 = ctrl.formDruipart.find(item => item.model.codeName ===\"druipart10\")\r\n        // 刷新druipart10关系界面\r\n        if (druipart10) {\r\n            druipart10?.embedView?.callUIAction('Refresh');\r\n        }\r\n    }\r\n\r\n}",
          triggerType: 'CTRLEVENT',
          id: 'same_restday',
        },
        {
          eventNames: 'onChange',
          itemName: 'shift_num',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            'var realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type == "manual"){\r\n    console.log("手动排班-班次数量变更")\r\n    // 获取所有临时数据进行删除\r\n    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\n    const service = await serviceUtil.getService(context, \'attendanceapp.attendance_shift\');\r\n    const shifts = service.local.getList(context);\r\n    shifts.forEach(shift => {\r\n        service.removeTemp(context, shift);\r\n    });\r\n\r\n    // 重新构建\r\n    var shift_num = _data.shift_num;\r\n    var new_shifts = [];\r\n\r\n    const createShift = (name, startTime, endTime, i) => {\r\n        return {\r\n            attendance_ratio: 1.0,\r\n            working_number: 1,\r\n            scopes: [{\r\n                early_for_absenteeism: 60,\r\n                early_for_early: 0,\r\n                latest_checkout: 480,\r\n                earliest_checkin: 60,\r\n                end_base_time: endTime,\r\n                late_for_absenteeism: 60,\r\n                late_for_late: 0,\r\n                shift_name: name,\r\n                start_base_time: startTime,\r\n                order_value: 1\r\n            }],\r\n            default_flag: 0,\r\n            public_flag: 0,\r\n            name: name,\r\n            order_value: i\r\n        };\r\n    };\r\n\r\n    // 根据 shift_num 动态生成班次\r\n    for (let i = 1; i <= shift_num; i++) {\r\n        const shiftName = `班次${i}`;\r\n        const startTime = "08:00:00";\r\n        const endTime = "17:00:00";\r\n        new_shifts.push(createShift(shiftName, startTime, endTime,i));\r\n    }\r\n\r\n    // 批量创建临时数据\r\n    const res = await service.exec(\'CreateTemp\', context, new_shifts);\r\n    if(res){\r\n        console.log(\'班次临时数据创建成功:\', new_shifts);\r\n        // 刷新关系页\r\n        const druipart1 = ctrl.formDruipart.find(item => item.model.codeName === "druipart1");\r\n        if (druipart1) {\r\n            setTimeout(() => {\r\n                druipart1?.embedView?.callUIAction(\'Refresh\');\r\n            }, 200);\r\n        }\r\n    }\r\n\r\n}\r\n',
          triggerType: 'CTRLEVENT',
          id: 'shift_num',
        },
        {
          eventNames: 'onChange',
          itemName: 'work',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            'var realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.schedule_type=="work_rest"){\r\n    console.log("更新上A休B工作日")\r\n    // 获取所有临时数据进行删除\r\n    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\n    const workDayService = await serviceUtil.getService(context, \'attendanceapp.attendance_workday\');\r\n    const workdays = workDayService.local.getList(context);\r\n    workdays.forEach(day => {\r\n        workDayService.removeTemp(context, day);\r\n    })\r\n\r\n    var work = parseInt(_data.work) || 0;\r\n    var rest = parseInt(_data.rest) || 0;\r\n    var num = work + rest;\r\n    var _workdays = [];\r\n    for (var i = 1; i < num + 1; i++) {\r\n        var workday = {\r\n            name: "第" + i + "天",\r\n            day_number: i,\r\n            title: "工作/休息"\r\n        }\r\n        _workdays.push(workday)\r\n    }\r\n    const result = await workDayService.createTemp(context, _workdays);\r\n    if (result) {\r\n        _workdays = result.data;\r\n        console.log(\'临时数据创建成功:\', _workdays);\r\n        _data.workdays=_workdays;\r\n\r\n        //更新组排班\r\n        const groupService = await serviceUtil.getService(context, \'attendanceapp.attendance_group_shift\');\r\n        const tempGroups = groupService.local.getList(context);\r\n        if (tempGroups){\r\n            await Promise.all(\r\n                tempGroups.map(async group => {\r\n                    groupService.local.delete(context, group.id)\r\n                })\r\n            );\r\n        }\r\n\r\n        //删除当前组排班人员临时数据\r\n        const group_membersService = await serviceUtil.getService(context, \'attendanceapp.attendance_group_shift_member\');\r\n        const localGroup_members = group_membersService.local.getList(context);\r\n        if (localGroup_members != null) {\r\n            await Promise.all(\r\n                localGroup_members.map(async member => {\r\n                    group_membersService.local.delete(context, member.id)\r\n                })\r\n            );\r\n        }\r\n        const attendanceService = await serviceUtil.getService(context, \'attendanceapp.attendance_rule\');\r\n        const tempres3 = await attendanceService.exec(\'FillGroupShift\', context, _data, viewParam);\r\n        Object.assign(_data, tempres3.data);\r\n        var attendance_group_shifts = _data.attendance_group_shifts;\r\n        if (attendance_group_shifts){\r\n            const res = await groupService.createTemp(context, attendance_group_shifts)\r\n            if(res){\r\n                attendance_group_shifts = res.data;\r\n                console.log(\'临时数据创建成功:\', attendance_group_shifts);\r\n                _data.attendance_group_shifts = attendance_group_shifts;\r\n                const formMDCtrls = ctrl.formMDCtrls;\r\n                if(formMDCtrls){\r\n                    const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");\r\n                    if (formMDCtrl) {\r\n                        console.log("刷新重复器",formMDCtrl)\r\n                        formMDCtrl.refresh()\r\n                    }\r\n                    const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");\r\n                    if (formMDCtrl1) {\r\n                        console.log("刷新重复器",formMDCtrl1)\r\n                        formMDCtrl1.refresh()\r\n                    }\r\n                }\r\n            }\r\n        }\r\n    }\r\n    var druipart8 = ctrl.formDruipart.find(item => item.model.codeName === "druipart8")\r\n    // 刷新druiPart8关系界面\r\n    if (druipart8) {\r\n        druipart8?.embedView?.callUIAction(\'Refresh\');\r\n    }\r\n}',
          triggerType: 'CTRLEVENT',
          name: 'workChange',
          id: 'workchange',
        },
        {
          eventNames: 'onChange',
          itemName: 'group_num',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            'console.log("group_num值变更")\r\nvar realData = ctrl.getReal();\r\nvar _default = realData[0];\r\n// 删除当前组排班临时数据\r\nconst serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\nconst groupService = await serviceUtil.getService(context, \'attendanceapp.attendance_group_shift\');\r\nconst localGroup = groupService.local.getList(context) || [];\r\nconst deleteGroupIds = new Set();\r\n\r\n// 组数减少时标记要删除的组\r\nif (localGroup.length > 0 && localGroup.length > _default.group_num) {\r\n    localGroup\r\n        .filter(g => g.order_num > _default.group_num)\r\n        .forEach(g => deleteGroupIds.add(g.id));\r\n\r\n    // 批量删除组（并发执行）\r\n    await Promise.all(\r\n        [...deleteGroupIds].map(groupId =>\r\n            groupService.local.delete(context, groupId)\r\n        )\r\n    );\r\n    console.log(`已删除${deleteGroupIds.size}个无效排班组`);\r\n\r\n    // 删除当前组排班人员临时数据\r\n    const group_membersService = await serviceUtil.getService(context, \'attendanceapp.attendance_group_shift_member\');\r\n    const localGroup_members = group_membersService.local.getList(context) || [];\r\n\r\n    if (localGroup_members.length > 0) {\r\n        // 获取所有有效组ID（未被删除的组）\r\n        const validGroupIds = new Set(\r\n            localGroup.filter(g => !deleteGroupIds.has(g.id))\r\n                .map(g => g.id)\r\n        );\r\n\r\n        // 批量删除无效成员\r\n        const deletePromises = localGroup_members\r\n            .filter(member => !validGroupIds.has(member.group_id))\r\n            .map(member =>\r\n                group_membersService.local.delete(context, member.id)\r\n            );\r\n\r\n        await Promise.all(deletePromises);\r\n        console.log(`已删除${deletePromises.filter(p => p).length}条无效排班成员记录`);\r\n    }\r\n\r\n}\r\n\r\n\r\nif (localGroup.length > 0 && localGroup.length < _default.group_num) {\r\n    // 组数增加时填充新组排班\r\n    const attendanceService = await serviceUtil.getService(context, \'attendanceapp.attendance_rule\');\r\n    const tempres3 = await attendanceService.exec(\'FillGroupShift\', context, _default, viewParam);\r\n    Object.assign(_default, tempres3.data);\r\n    const group_shifts = _default.group_shifts || [];\r\n    const localLength = localGroup.length\r\n\r\n    // 批量创建新组\r\n    if (group_shifts.length > 0) {\r\n        const createPromises = group_shifts\r\n            .filter(shift => shift.order_num > localLength)\r\n            .map(shift =>\r\n                groupService.createTemp(context, shift)\r\n                    .then(res => {\r\n                        if (res && res.ok) {\r\n                            console.log(`组排班临时数据创建成功: ${shift.order_num}`);\r\n                            return true;\r\n                        }\r\n                        console.error(`组排班创建失败: ${shift.order_num}`);\r\n                        return false;\r\n                    })\r\n            );\r\n\r\n        const createResults = await Promise.all(createPromises);\r\n        const successCount = createResults.filter(r => r).length;\r\n        console.log(`已创建${successCount}个新排班组（总尝试${createPromises.length}次）`);\r\n    }\r\n\r\n}\r\n\r\n// 刷新界面\r\nconst formMDCtrls = ctrl.formMDCtrls;\r\nif (formMDCtrls) {\r\n    const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");\r\n    if (formMDCtrl) {\r\n        console.log("刷新重复器", formMDCtrl);\r\n        formMDCtrl.refresh();\r\n    } else {\r\n        console.warn("未找到n_inversion控件");\r\n    }\r\n}',
          triggerType: 'CTRLEVENT',
          id: 'group_num',
        },
        {
          eventNames: 'onChange',
          itemName: 'inversion_cycle',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            "var realData = ctrl.getReal();\r\nvar _data = realData[0];\r\n//更新组排班\r\nconst serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\nconst groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');\r\nconst tempGroups = groupService.local.getList(context);\r\nif (tempGroups){\r\n    await Promise.all(\r\n        tempGroups.map(async group => {\r\n            groupService.local.delete(context, group.id)\r\n        })\r\n    );\r\n}\r\n\r\n//删除当前组排班人员临时数据\r\nconst group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');\r\nconst localGroup_members = group_membersService.local.getList(context);\r\nif (localGroup_members != null) {\r\n    await Promise.all(\r\n        localGroup_members.map(async member => {\r\n            group_membersService.local.delete(context, member.id)\r\n        })\r\n    );\r\n}\r\nconst attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');\r\nconst tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);\r\nObject.assign(_data, tempres3.data);\r\nvar attendance_group_shifts = _data.attendance_group_shifts;\r\nif (attendance_group_shifts){\r\n    const res = await groupService.createTemp(context, attendance_group_shifts)\r\n    if(res){\r\n        attendance_group_shifts = res.data;\r\n        console.log('临时组排班数据创建成功:', attendance_group_shifts);\r\n        _data.attendance_group_shifts = attendance_group_shifts;\r\n        const formMDCtrls = ctrl.formMDCtrls;\r\n        if(formMDCtrls){\r\n            const formMDCtrl = formMDCtrls.find(item => item.name === \"n_inversion\");\r\n            if (formMDCtrl) {\r\n                formMDCtrl.refresh()\r\n            }\r\n            const formMDCtrl1 = formMDCtrls.find(item => item.name === \"test_attendance_group_shifts\");\r\n            if (formMDCtrl1) {\r\n                formMDCtrl1.refresh()\r\n            }\r\n        }\r\n    }\r\n}",
          triggerType: 'CTRLEVENT',
          id: 'inversion_cycle',
        },
        {
          eventNames: 'onChange',
          itemName: 'auto_match',
          logicTag: 'form',
          logicType: 'SCRIPT',
          scriptCode:
            "console.log(\"手动班次判断结果\")\r\nconst serviceUtil = ibiz.hub.getApp(context.srfappid).deService;\r\nvar realData = ctrl.getReal();\r\nvar _data = realData[0];\r\nif(_data.auto_match === 1){\r\n    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');\r\n    const shifts = service.local.getList(context);\r\n\r\n    // 存储重复班次组合（二维数组）\r\n    const duplicateGroups = [];\r\n    // 记录已处理的班次索引\r\n    const processed = new Set();\r\n\r\n    // 遍历所有班次\r\n    for(let i = 0; i < shifts.length; i++){\r\n        if(processed.has(i)) continue;\r\n\r\n        const currentGroup = [shifts[i].name];\r\n        // 与后续班次逐一比对\r\n        for(let j = i+1; j < shifts.length; j++){\r\n            if(!processed.has(j) && compareScopes(shifts[i].scopes, shifts[j].scopes)){\r\n                currentGroup.push(shifts[j].name);\r\n                processed.add(j);\r\n            }\r\n        }\r\n\r\n        // 记录有重复的组合\r\n        if(currentGroup.length > 1){\r\n            duplicateGroups.push(currentGroup);\r\n        }\r\n    }\r\n\r\n    // 生成判断结果\r\n    if(duplicateGroups.length > 0){\r\n        const judge_result = duplicateGroups.map(group =>\r\n            `${group.join('、')}上班时间重复，无法智能匹配，建议修改重复班次的上班时间`\r\n        ).join('；');\r\n        ctrl.setDataValue('judge_result', judge_result);\r\n    }else{\r\n        ctrl.setDataValue('judge_result', null);\r\n    }\r\n\r\n    // 班次信息对比\r\n    function compareScopes(beforeScopes, curScopes) {\r\n        if (beforeScopes.length !== curScopes.length) return false;\r\n\r\n        for (let i = 0; i < beforeScopes.length; i++ ) {\r\n            const defaultItem = beforeScopes[i];\r\n            const curItem = curScopes[i];\r\n\r\n            if (typeof defaultItem !== 'object' || typeof curItem !== 'object' ) {\r\n                return false;\r\n            }\r\n\r\n            if (\r\n                defaultItem.early_for_absenteeism !== curItem.early_for_absenteeism ||\r\n                defaultItem.early_for_early !== curItem.early_for_early ||\r\n                defaultItem.latest_checkout !== curItem.latest_checkout ||\r\n                defaultItem.earliest_checkin !== curItem.earliest_checkin ||\r\n                defaultItem.end_base_time !== curItem.end_base_time ||\r\n                defaultItem.late_for_absenteeism !== curItem.late_for_absenteeism ||\r\n                defaultItem.late_for_late !== curItem.late_for_late ||\r\n                defaultItem.start_base_time !== curItem.start_base_time\r\n            ) {\r\n                return false;\r\n            }\r\n        }\r\n        return true;\r\n    }\r\n}",
          triggerType: 'CTRLEVENT',
          id: 'auto_match',
        },
      ],
      controlParam: {
        id: 'form',
      },
      modelId: '6cd7965118802af306eb9683d03469a9',
      modelType: 'PSDEFORM_EDITFORM',
      name: 'form',
      id: 'attendanceapp.attendance_rule.main',
    },
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
      codeName: 'edit_view_toolbar',
      controlType: 'TOOLBAR',
      logicName: '考勤规则_工具栏',
      appDataEntityId: 'attendanceapp.attendance_rule',
      controlParam: {
        id: 'toolbar',
      },
      modelId: '08e4ed4044d4d9b8e57b9c939d8c5736',
      modelType: 'PSDETOOLBAR',
      name: 'toolbar',
      id: 'edit_view_toolbar',
    },
    {
      codeName: 'edit_view_datainfobar',
      controlType: 'DATAINFOBAR',
      appDataEntityId: 'attendanceapp.attendance_rule',
      controlParam: {
        id: 'datainfobar',
      },
      name: 'datainfobar',
      id: 'edit_view_datainfobar',
    },
    {
      caption: '考勤规则',
      codeName: 'edit_view_captionbar',
      controlType: 'CAPTIONBAR',
      appDataEntityId: 'attendanceapp.attendance_rule',
      controlParam: {},
      name: 'captionbar',
      id: 'edit_view_captionbar',
    },
  ],
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
  title: '考勤规则编辑视图',
  titleLanguageRes: {
    lanResTag: 'PAGE.TITLE.ATTENDANCE_RULE.EDITVIEW',
  },
  viewStyle: 'DEFAULT',
  viewType: 'DEEDITVIEW',
  enableDP: true,
  showCaptionBar: true,
  modelId: '78ad1e1b291c6272f41993fd104aebec',
  modelType: 'PSAPPDEVIEW',
  name: 'attendance_ruleEditView',
  id: 'attendanceapp.attendance_rule_edit_view',
};
