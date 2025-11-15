export default {
  enableDirtyChecking: true,
  showDataInfoBar: true,
  xdataControlName: 'form',
  loadDefault: true,
  funcViewMode: 'EDITVIEW',
  openMode: 'POPUPMODAL',
  deviewCodeName: 'EditView',
  deviewId: 'e8495010e0806bf9b4689f8660f1ef17',
  accUserMode: 2,
  capLanguageRes: {
    lanResTag: 'DE.LNAME.HR_INTERVIEW',
  },
  caption: '面试',
  codeName: 'hr_interview_edit_view',
  appDataEntityId: 'web.hr_interview',
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
        appDataEntityId: 'web.hr_interview',
        id: 'create',
      },
      getDraftFromControlAction: {
        appDataEntityId: 'web.hr_interview',
        id: 'loaddraftfrom',
      },
      getDraftControlAction: {
        appDEMethodId: 'get_draft',
        appDataEntityId: 'web.hr_interview',
        id: 'loaddraft',
      },
      getControlAction: {
        appDEMethodId: 'get',
        appDataEntityId: 'web.hr_interview',
        id: 'load',
      },
      removeControlAction: {
        appDEMethodId: 'remove',
        appDataEntityId: 'web.hr_interview',
        id: 'remove',
      },
      updateControlAction: {
        appDEMethodId: 'update',
        appDataEntityId: 'web.hr_interview',
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
                      layout: {
                        dir: 'row',
                        layout: 'FLEX',
                      },
                      deformDetails: [
                        {
                          dataType: 25,
                          enableCond: 3,
                          labelPos: 'NONE',
                          noPrivDisplayMode: 1,
                          editor: {
                            editorParams: {
                              readonly: 'true',
                            },
                            editorType: 'TEXTBOX',
                            valueType: 'SIMPLE',
                            editable: true,
                            readOnly: true,
                            id: 'candidate_display_name',
                          },
                          allowEmpty: true,
                          codeName: 'candidate_display_name',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          sysCss: {
                            cssName: 'applicant_name',
                          },
                          id: 'candidate_display_name',
                        },
                        {
                          dataType: 25,
                          enableCond: 3,
                          labelPos: 'NONE',
                          noPrivDisplayMode: 1,
                          editor: {
                            editorParams: {
                              readonly: 'true',
                            },
                            editorType: 'TEXTBOX',
                            valueType: 'SIMPLE',
                            editable: true,
                            readOnly: true,
                            id: 'job_name',
                          },
                          allowEmpty: true,
                          codeName: 'job_name',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          id: 'job_name',
                        },
                        {
                          dataType: 25,
                          enableCond: 3,
                          labelPos: 'NONE',
                          noPrivDisplayMode: 1,
                          editor: {
                            editorParams: {
                              readonly: 'true',
                            },
                            editorType: 'TEXTBOX',
                            valueType: 'SIMPLE',
                            editable: true,
                            readOnly: true,
                            id: 'job_platform_name',
                          },
                          allowEmpty: true,
                          codeName: 'job_platform_name',
                          detailStyle: 'DEFAULT',
                          detailType: 'FORMITEM',
                          layoutPos: {
                            shrink: 1,
                            layout: 'FLEX',
                          },
                          id: 'job_platform_name',
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
                    colMD: 24,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel1',
                },
                {
                  layout: {
                    dir: 'row',
                    layout: 'FLEX',
                  },
                  deformDetails: [
                    {
                      rawItem: {
                        sysImage: {
                          rawContent:
                            '<?xml version="1.0" standalone="no"?><!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"><svg t="1760167815259"  fill="currentColor" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="8068" xmlns:xlink="http://www.w3.org/1999/xlink" width="20" height="20"><path d="M694.518084 373.131786c13.629972 17.928851 28.242546 36.251464 43.805207 54.888365 12.986947 16.51275 27.415283 34.806463 43.313907 54.917265 15.895012 20.103577 32.288549 40.54673 49.169774 61.354745 21.400466 27.263557 39.076441 51.666013 53.049601 73.210979 13.962323 21.523291 24.984068 41.258393 33.086912 59.183631 8.131743 17.957751 13.62636 34.474113 16.54165 49.512961 2.947802 15.071361 4.392803 30.142722 4.392803 45.214083l0 69.988626c0 21.516066-3.251252 40.886305-9.72847 58.139618-6.477217 17.224413-15.410936 32.107924-26.768645 44.66137-11.357708 12.557059-24.33743 22.256629-38.950004 29.069809-14.583673 6.816792-29.994609 10.223382-46.232809 10.223382L215.601383 983.49662c-17.527863 0-34.260975-3.225965-50.159599-9.703182-15.895012-6.448317-29.832047-15.591561-41.836393-27.44057-12.004346-11.849009-21.577478-26.031694-28.730234-42.519156-7.120243-16.516362-10.714683-35.174938-10.714683-55.990179l0-82.878036c0-17.2208 1.473901-33.737162 4.385578-49.509349 2.926127-15.775799 8.287081-32.292161 16.057574-49.512961 7.799393-17.224413 18.510464-35.698751 32.140436-55.441078 13.629972-19.735102 30.81826-41.467918 51.600988-65.133423 16.855937-20.103577 34.221238-40.362492 52.063388-60.809257 17.860213-20.472052 33.917787-38.950004 48.190785-55.433853 16.881225-19.399139 33.094137-38.061328 48.685698-55.993791L694.518084 373.131786 694.518084 373.131786 694.518084 373.131786zM511.5087 781.113385c16.884837 0 32.783462-3.590828 47.70671-10.76887 14.916023-7.185268 27.899358-16.855937 38.921104-29.073421 11.050646-12.184971 19.796514-26.707232 26.302632-43.584844 6.477217-16.855937 9.732082-34.625838 9.732082-53.288027s-3.254865-36.218952-9.732082-52.738926c-6.506117-16.516362-15.255599-30.84716-26.302632-43.068257-11.025358-12.184971-24.008693-21.888154-38.921104-29.066196-14.923248-7.152755-30.81826-10.743583-47.70671-10.743583-16.881225 0-32.938799 3.590828-48.190785 10.743583-15.226699 7.178043-28.390658 16.881225-39.412404 29.066196-11.025358 12.221096-19.796514 26.551894-26.277344 43.068257-6.50973 16.516362-9.732082 34.076737-9.732082 52.738926s3.222352 36.432089 9.732082 53.288027c6.477217 16.881225 15.251986 31.399873 26.277344 43.584844 11.018133 12.217484 24.182093 21.888154 39.412404 29.073421C478.573513 777.518944 494.627475 781.113385 511.5087 781.113385L511.5087 781.113385 511.5087 781.113385zM999.207394 242.890228l0 67.806675c0 18.665801-6.011204 34.4416-18.015551 47.35991-12.000734 12.925534-26.425457 19.370239-43.310294 19.370239l-121.683539 0c-16.881225 0-31.154223-6.448317-42.822606-19.370239-11.690059-12.918309-17.52425-28.697721-17.52425-47.35991l0-67.806675L268.152459 242.890228l0 67.806675c0 18.665801-5.830579 34.4416-17.527863 47.35991-11.661159 12.925534-25.934156 19.370239-42.822606 19.370239L86.125676 377.427051c-16.884837 0-31.30956-6.448317-43.313907-19.370239-12.036859-12.918309-18.022776-28.697721-18.022776-47.35991L24.788993 240.744401c0-8.630269 1.939914-15.996162 5.837804-22.072391 3.89789-6.108742 8.781994-11.661159 14.608961-16.7006 5.830579-4.999704 12.340309-9.515332 19.460552-13.442122 7.152755-3.95569 14.272998-8.442419 21.425753-13.474635 7.120243-4.291653 23.203104-13.81421 48.190785-28.517096 24.987681-14.702886 56.445354-29.958484 94.423594-45.737896 37.938503-15.804699 81.097072-29.806759 129.443195-41.991731 48.346123-12.184971 99.795386-18.293713 154.311663-18.293713 62.279546 0 117.933761 6.108742 166.95181 18.293713 48.996373 12.184971 91.504692 26.187032 127.514118 41.991731 36.009426 15.779412 64.891385 31.03501 86.624201 45.737896s36.500727 24.22183 44.296507 28.517096c7.799393 5.032216 15.259211 9.518944 22.408354 13.474635 7.123855 3.92679 13.59746 8.442419 19.464164 13.442122 5.830579 5.039441 10.526833 10.591858 14.11766 16.7006 3.558315 6.076229 5.339279 13.445735 5.339279 22.072391L999.207394 242.890228 999.207394 242.890228 999.207394 242.890228z" p-id="8069"></path></svg>',
                        },
                        contentType: 'IMAGE',
                        sysCss: {
                          cssName: 'applicant_icon',
                        },
                        id: 'rawitem1',
                      },
                      codeName: 'rawitem1',
                      detailStyle: 'DEFAULT',
                      detailType: 'RAWITEM',
                      layoutPos: {
                        shrink: 1,
                        layout: 'FLEX',
                      },
                      sysCss: {
                        cssName: 'applicant_icon',
                      },
                      sysImage: {
                        rawContent:
                          '<?xml version="1.0" standalone="no"?><!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"><svg t="1760167815259"  fill="currentColor" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="8068" xmlns:xlink="http://www.w3.org/1999/xlink" width="20" height="20"><path d="M694.518084 373.131786c13.629972 17.928851 28.242546 36.251464 43.805207 54.888365 12.986947 16.51275 27.415283 34.806463 43.313907 54.917265 15.895012 20.103577 32.288549 40.54673 49.169774 61.354745 21.400466 27.263557 39.076441 51.666013 53.049601 73.210979 13.962323 21.523291 24.984068 41.258393 33.086912 59.183631 8.131743 17.957751 13.62636 34.474113 16.54165 49.512961 2.947802 15.071361 4.392803 30.142722 4.392803 45.214083l0 69.988626c0 21.516066-3.251252 40.886305-9.72847 58.139618-6.477217 17.224413-15.410936 32.107924-26.768645 44.66137-11.357708 12.557059-24.33743 22.256629-38.950004 29.069809-14.583673 6.816792-29.994609 10.223382-46.232809 10.223382L215.601383 983.49662c-17.527863 0-34.260975-3.225965-50.159599-9.703182-15.895012-6.448317-29.832047-15.591561-41.836393-27.44057-12.004346-11.849009-21.577478-26.031694-28.730234-42.519156-7.120243-16.516362-10.714683-35.174938-10.714683-55.990179l0-82.878036c0-17.2208 1.473901-33.737162 4.385578-49.509349 2.926127-15.775799 8.287081-32.292161 16.057574-49.512961 7.799393-17.224413 18.510464-35.698751 32.140436-55.441078 13.629972-19.735102 30.81826-41.467918 51.600988-65.133423 16.855937-20.103577 34.221238-40.362492 52.063388-60.809257 17.860213-20.472052 33.917787-38.950004 48.190785-55.433853 16.881225-19.399139 33.094137-38.061328 48.685698-55.993791L694.518084 373.131786 694.518084 373.131786 694.518084 373.131786zM511.5087 781.113385c16.884837 0 32.783462-3.590828 47.70671-10.76887 14.916023-7.185268 27.899358-16.855937 38.921104-29.073421 11.050646-12.184971 19.796514-26.707232 26.302632-43.584844 6.477217-16.855937 9.732082-34.625838 9.732082-53.288027s-3.254865-36.218952-9.732082-52.738926c-6.506117-16.516362-15.255599-30.84716-26.302632-43.068257-11.025358-12.184971-24.008693-21.888154-38.921104-29.066196-14.923248-7.152755-30.81826-10.743583-47.70671-10.743583-16.881225 0-32.938799 3.590828-48.190785 10.743583-15.226699 7.178043-28.390658 16.881225-39.412404 29.066196-11.025358 12.221096-19.796514 26.551894-26.277344 43.068257-6.50973 16.516362-9.732082 34.076737-9.732082 52.738926s3.222352 36.432089 9.732082 53.288027c6.477217 16.881225 15.251986 31.399873 26.277344 43.584844 11.018133 12.217484 24.182093 21.888154 39.412404 29.073421C478.573513 777.518944 494.627475 781.113385 511.5087 781.113385L511.5087 781.113385 511.5087 781.113385zM999.207394 242.890228l0 67.806675c0 18.665801-6.011204 34.4416-18.015551 47.35991-12.000734 12.925534-26.425457 19.370239-43.310294 19.370239l-121.683539 0c-16.881225 0-31.154223-6.448317-42.822606-19.370239-11.690059-12.918309-17.52425-28.697721-17.52425-47.35991l0-67.806675L268.152459 242.890228l0 67.806675c0 18.665801-5.830579 34.4416-17.527863 47.35991-11.661159 12.925534-25.934156 19.370239-42.822606 19.370239L86.125676 377.427051c-16.884837 0-31.30956-6.448317-43.313907-19.370239-12.036859-12.918309-18.022776-28.697721-18.022776-47.35991L24.788993 240.744401c0-8.630269 1.939914-15.996162 5.837804-22.072391 3.89789-6.108742 8.781994-11.661159 14.608961-16.7006 5.830579-4.999704 12.340309-9.515332 19.460552-13.442122 7.152755-3.95569 14.272998-8.442419 21.425753-13.474635 7.120243-4.291653 23.203104-13.81421 48.190785-28.517096 24.987681-14.702886 56.445354-29.958484 94.423594-45.737896 37.938503-15.804699 81.097072-29.806759 129.443195-41.991731 48.346123-12.184971 99.795386-18.293713 154.311663-18.293713 62.279546 0 117.933761 6.108742 166.95181 18.293713 48.996373 12.184971 91.504692 26.187032 127.514118 41.991731 36.009426 15.779412 64.891385 31.03501 86.624201 45.737896s36.500727 24.22183 44.296507 28.517096c7.799393 5.032216 15.259211 9.518944 22.408354 13.474635 7.123855 3.92679 13.59746 8.442419 19.464164 13.442122 5.830579 5.039441 10.526833 10.591858 14.11766 16.7006 3.558315 6.076229 5.339279 13.445735 5.339279 22.072391L999.207394 242.890228 999.207394 242.890228 999.207394 242.890228z" p-id="8069"></path></svg>',
                      },
                      showCaption: true,
                      id: 'rawitem1',
                    },
                    {
                      dataType: 25,
                      enableCond: 3,
                      labelPos: 'NONE',
                      noPrivDisplayMode: 1,
                      editor: {
                        editorParams: {
                          readonly: 'true',
                        },
                        editorType: 'TEXTBOX',
                        valueType: 'SIMPLE',
                        editable: true,
                        readOnly: true,
                        id: 'mobile_phone',
                      },
                      allowEmpty: true,
                      codeName: 'mobile_phone',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        shrink: 1,
                        layout: 'FLEX',
                      },
                      sysCss: {
                        cssName: 'myinterview',
                      },
                      id: 'mobile_phone',
                    },
                    {
                      rawItem: {
                        sysImage: {
                          rawContent:
                            '<?xml version="1.0" standalone="no"?><!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"><svg t="1760167906469" fill="currentColor" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="9051" xmlns:xlink="http://www.w3.org/1999/xlink" width="20" height="20"><path d="M369.1 464.5L76.4 225.3c-5.2-4.3-13.1-0.6-13.1 6.2v538.7c0 1.1 0 2.1 0.1 3.2 0.4 7 8.9 10.2 13.7 5.1l292.6-302.2c3.3-3.4 3-8.8-0.6-11.8zM109.1 178l397.7 318.7c2.9 2.3 7.1 2.3 10 0L914.5 178c5.9-4.7 2.6-14.2-5-14.2H114.1c-7.5 0-10.9 9.5-5 14.2z m498.7 331.7c-2.9-3.1-7.8-3.3-11-0.5L517 577.5c-3 2.5-7.3 2.6-10.3 0.1l-82.1-68.1c-3.2-2.7-7.9-2.4-10.8 0.6L107.9 823.2c-4.9 5.1-1.4 13.6 5.7 13.6h788.5c7 0 10.6-8.4 5.8-13.5L607.8 509.7z m352.6-276.9c0-6.7-7.8-10.5-13-6.2l-291.7 237c-3.6 3-4 8.4-0.7 11.8l291.6 303.2c4.9 5 13.4 1.9 13.8-5.1 0.1-1 0.1-2.1 0.1-3.1l-0.1-537.6z"  p-id="9052"></path></svg>',
                        },
                        contentType: 'IMAGE',
                        sysCss: {
                          cssName: 'applicant_icon',
                        },
                        id: 'rawitem2',
                      },
                      codeName: 'rawitem2',
                      detailStyle: 'DEFAULT',
                      detailType: 'RAWITEM',
                      layoutPos: {
                        shrink: 1,
                        layout: 'FLEX',
                      },
                      sysCss: {
                        cssName: 'applicant_icon',
                      },
                      sysImage: {
                        rawContent:
                          '<?xml version="1.0" standalone="no"?><!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"><svg t="1760167906469" fill="currentColor" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="9051" xmlns:xlink="http://www.w3.org/1999/xlink" width="20" height="20"><path d="M369.1 464.5L76.4 225.3c-5.2-4.3-13.1-0.6-13.1 6.2v538.7c0 1.1 0 2.1 0.1 3.2 0.4 7 8.9 10.2 13.7 5.1l292.6-302.2c3.3-3.4 3-8.8-0.6-11.8zM109.1 178l397.7 318.7c2.9 2.3 7.1 2.3 10 0L914.5 178c5.9-4.7 2.6-14.2-5-14.2H114.1c-7.5 0-10.9 9.5-5 14.2z m498.7 331.7c-2.9-3.1-7.8-3.3-11-0.5L517 577.5c-3 2.5-7.3 2.6-10.3 0.1l-82.1-68.1c-3.2-2.7-7.9-2.4-10.8 0.6L107.9 823.2c-4.9 5.1-1.4 13.6 5.7 13.6h788.5c7 0 10.6-8.4 5.8-13.5L607.8 509.7z m352.6-276.9c0-6.7-7.8-10.5-13-6.2l-291.7 237c-3.6 3-4 8.4-0.7 11.8l291.6 303.2c4.9 5 13.4 1.9 13.8-5.1 0.1-1 0.1-2.1 0.1-3.1l-0.1-537.6z"  p-id="9052"></path></svg>',
                      },
                      showCaption: true,
                      id: 'rawitem2',
                    },
                    {
                      dataType: 25,
                      enableCond: 3,
                      labelPos: 'NONE',
                      noPrivDisplayMode: 1,
                      editor: {
                        editorParams: {
                          readonly: 'true',
                        },
                        editorType: 'TEXTBOX',
                        valueType: 'SIMPLE',
                        editable: true,
                        readOnly: true,
                        id: 'email_from',
                      },
                      allowEmpty: true,
                      codeName: 'email_from',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        shrink: 1,
                        layout: 'FLEX',
                      },
                      sysCss: {
                        cssName: 'myinterview',
                      },
                      id: 'email_from',
                    },
                    {
                      rawItem: {
                        sysImage: {
                          rawContent:
                            '<?xml version="1.0" standalone="no"?><!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"><svg t="1760167979684" fill="currentColor" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="10153" xmlns:xlink="http://www.w3.org/1999/xlink" width="20" height="20"><path d="M736 169v-25c0-53-43-96-96-96H384c-53 0-96 43-96 96v25c0 4.4-3.6 8-8 8H128C57.3 177 0 234.3 0 305v608c0 35.3 28.7 64 64 64h896c35.3 0 64-28.7 64-64V305c0-70.7-57.3-128-128-128H744c-4.4 0-8-3.6-8-8z m-352-57h256c17.7 0 32 14.3 32 32v24c0 4.4-3.6 8-8 8H360c-4.4 0-8-3.6-8-8v-24c0-17.7 14.3-32 32-32z m544 801H96c-17.7 0-32-14.3-32-32V500c0-2.2 1.8-4 4-4h324c4.4 0 8 3.6 8 8v40c0 35.3 28.7 64 64 64h96c35.3 0 64-28.7 64-64v-40c0-4.4 3.6-8 8-8h324c2.2 0 4 1.8 4 4v381c0 17.7-14.3 32-32 32zM472 496h80c4.4 0 8 3.6 8 8v32c0 4.4-3.6 8-8 8h-80c-4.4 0-8-3.6-8-8v-32c0-4.4 3.6-8 8-8z m484-64H68c-2.2 0-4-1.8-4-4V305c0-35.3 28.7-64 64-64h768c35.3 0 64 28.7 64 64v123c0 2.2-1.8 4-4 4z" p-id="10154"></path></svg>',
                        },
                        contentType: 'IMAGE',
                        sysCss: {
                          cssName: 'applicant_icon',
                        },
                        id: 'rawitem3',
                      },
                      codeName: 'rawitem3',
                      detailStyle: 'DEFAULT',
                      detailType: 'RAWITEM',
                      layoutPos: {
                        shrink: 1,
                        layout: 'FLEX',
                      },
                      sysCss: {
                        cssName: 'applicant_icon',
                      },
                      sysImage: {
                        rawContent:
                          '<?xml version="1.0" standalone="no"?><!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"><svg t="1760167979684" fill="currentColor" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="10153" xmlns:xlink="http://www.w3.org/1999/xlink" width="20" height="20"><path d="M736 169v-25c0-53-43-96-96-96H384c-53 0-96 43-96 96v25c0 4.4-3.6 8-8 8H128C57.3 177 0 234.3 0 305v608c0 35.3 28.7 64 64 64h896c35.3 0 64-28.7 64-64V305c0-70.7-57.3-128-128-128H744c-4.4 0-8-3.6-8-8z m-352-57h256c17.7 0 32 14.3 32 32v24c0 4.4-3.6 8-8 8H360c-4.4 0-8-3.6-8-8v-24c0-17.7 14.3-32 32-32z m544 801H96c-17.7 0-32-14.3-32-32V500c0-2.2 1.8-4 4-4h324c4.4 0 8 3.6 8 8v40c0 35.3 28.7 64 64 64h96c35.3 0 64-28.7 64-64v-40c0-4.4 3.6-8 8-8h324c2.2 0 4 1.8 4 4v381c0 17.7-14.3 32-32 32zM472 496h80c4.4 0 8 3.6 8 8v32c0 4.4-3.6 8-8 8h-80c-4.4 0-8-3.6-8-8v-32c0-4.4 3.6-8 8-8z m484-64H68c-2.2 0-4-1.8-4-4V305c0-35.3 28.7-64 64-64h768c35.3 0 64 28.7 64 64v123c0 2.2-1.8 4-4 4z" p-id="10154"></path></svg>',
                      },
                      showCaption: true,
                      id: 'rawitem3',
                    },
                    {
                      dataType: 25,
                      enableCond: 3,
                      labelPos: 'NONE',
                      noPrivDisplayMode: 1,
                      editor: {
                        editorParams: {
                          readonly: 'true',
                        },
                        editorType: 'TEXTBOX',
                        valueType: 'SIMPLE',
                        editable: true,
                        readOnly: true,
                        id: 'experience',
                      },
                      allowEmpty: true,
                      codeName: 'experience',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        shrink: 1,
                        layout: 'FLEX',
                      },
                      sysCss: {
                        cssName: 'myinterview',
                      },
                      id: 'experience',
                    },
                    {
                      rawItem: {
                        sysImage: {
                          rawContent:
                            '<?xml version="1.0" standalone="no"?><!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"><svg t="1760168005113" fill="currentColor" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="11200" xmlns:xlink="http://www.w3.org/1999/xlink" width="20px" height="20px"><path d="M965.44256 383.18592L530.9952 155.71456a40.96 40.96 0 0 0-38.00064 0L58.55744 383.18592a40.94976 40.94976 0 0 0-21.78048 32.75264c-0.33792 2.10944-0.5632 4.25472-0.5632 6.46144v307.2a40.96 40.96 0 0 0 81.92 0V480.2304l101.40672 41.3184A40.7552 40.7552 0 0 0 215.04 540.16v204.8c0 11.86304 5.0432 22.5536 13.11232 30.03392C269.0304 842.51648 396.7232 872.96 512 872.96s242.96448-30.44352 283.84256-97.96608a40.8576 40.8576 0 0 0 13.11232-30.03392v-204.8a40.69376 40.69376 0 0 0-4.5056-18.6112l157.45024-64.14848a40.96 40.96 0 0 0 3.54304-74.2144z m-263.71584 181.20192l-174.45376 70.0928a40.9088 40.9088 0 0 1-30.59712-0.02048l-173.70112-70.0928a40.87296 40.87296 0 0 1-6.66112-3.48672 39.8336 39.8336 0 0 1-2.304-1.58208c-0.31232-0.22528-0.60928-0.46592-0.91136-0.70144a40.76032 40.76032 0 0 1-2.048-1.6896c-0.3328-0.29696-0.64-0.60928-0.96256-0.9216-0.62976-0.59904-1.26464-1.19808-1.84832-1.83808a42.86464 42.86464 0 0 1-2.26816-2.67264c-0.26112-0.3328-0.4864-0.6912-0.73216-1.02912a42.56768 42.56768 0 0 1-1.59744-2.3296c-0.19456-0.31744-0.37376-0.63488-0.55808-0.95232a39.936 39.936 0 0 1-1.47456-2.72384l-0.35328-0.73728a40.70912 40.70912 0 0 1-0.93696-32.65536 40.96512 40.96512 0 0 1 53.31456-22.656L481.88416 540.16l30.14656 12.16512 30.27968-12.16512 128.87552-51.77856a40.95488 40.95488 0 0 1 53.27872 22.7328 40.7552 40.7552 0 0 1 0.49152 29.12256 39.23968 39.23968 0 0 1-1.60256 3.82976v0.00512a41.17504 41.17504 0 0 1-4.29056 7.04512c-0.17408 0.2304-0.36352 0.45056-0.54272 0.67584a37.9392 37.9392 0 0 1-4.64896 4.96128c-0.41984 0.37888-0.83968 0.76288-1.28 1.13152-0.56832 0.47616-1.17248 0.91648-1.77152 1.36192-0.45056 0.3328-0.88064 0.68608-1.34656 0.9984l0.06656-0.0256a41.1136 41.1136 0 0 1-7.81312 4.16768z" p-id="11201"></path></svg>',
                        },
                        contentType: 'IMAGE',
                        sysCss: {
                          cssName: 'applicant_icon',
                        },
                        id: 'rawitem4',
                      },
                      codeName: 'rawitem4',
                      detailStyle: 'DEFAULT',
                      detailType: 'RAWITEM',
                      layoutPos: {
                        shrink: 1,
                        layout: 'FLEX',
                      },
                      sysCss: {
                        cssName: 'applicant_icon',
                      },
                      sysImage: {
                        rawContent:
                          '<?xml version="1.0" standalone="no"?><!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"><svg t="1760168005113" fill="currentColor" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="11200" xmlns:xlink="http://www.w3.org/1999/xlink" width="20px" height="20px"><path d="M965.44256 383.18592L530.9952 155.71456a40.96 40.96 0 0 0-38.00064 0L58.55744 383.18592a40.94976 40.94976 0 0 0-21.78048 32.75264c-0.33792 2.10944-0.5632 4.25472-0.5632 6.46144v307.2a40.96 40.96 0 0 0 81.92 0V480.2304l101.40672 41.3184A40.7552 40.7552 0 0 0 215.04 540.16v204.8c0 11.86304 5.0432 22.5536 13.11232 30.03392C269.0304 842.51648 396.7232 872.96 512 872.96s242.96448-30.44352 283.84256-97.96608a40.8576 40.8576 0 0 0 13.11232-30.03392v-204.8a40.69376 40.69376 0 0 0-4.5056-18.6112l157.45024-64.14848a40.96 40.96 0 0 0 3.54304-74.2144z m-263.71584 181.20192l-174.45376 70.0928a40.9088 40.9088 0 0 1-30.59712-0.02048l-173.70112-70.0928a40.87296 40.87296 0 0 1-6.66112-3.48672 39.8336 39.8336 0 0 1-2.304-1.58208c-0.31232-0.22528-0.60928-0.46592-0.91136-0.70144a40.76032 40.76032 0 0 1-2.048-1.6896c-0.3328-0.29696-0.64-0.60928-0.96256-0.9216-0.62976-0.59904-1.26464-1.19808-1.84832-1.83808a42.86464 42.86464 0 0 1-2.26816-2.67264c-0.26112-0.3328-0.4864-0.6912-0.73216-1.02912a42.56768 42.56768 0 0 1-1.59744-2.3296c-0.19456-0.31744-0.37376-0.63488-0.55808-0.95232a39.936 39.936 0 0 1-1.47456-2.72384l-0.35328-0.73728a40.70912 40.70912 0 0 1-0.93696-32.65536 40.96512 40.96512 0 0 1 53.31456-22.656L481.88416 540.16l30.14656 12.16512 30.27968-12.16512 128.87552-51.77856a40.95488 40.95488 0 0 1 53.27872 22.7328 40.7552 40.7552 0 0 1 0.49152 29.12256 39.23968 39.23968 0 0 1-1.60256 3.82976v0.00512a41.17504 41.17504 0 0 1-4.29056 7.04512c-0.17408 0.2304-0.36352 0.45056-0.54272 0.67584a37.9392 37.9392 0 0 1-4.64896 4.96128c-0.41984 0.37888-0.83968 0.76288-1.28 1.13152-0.56832 0.47616-1.17248 0.91648-1.77152 1.36192-0.45056 0.3328-0.88064 0.68608-1.34656 0.9984l0.06656-0.0256a41.1136 41.1136 0 0 1-7.81312 4.16768z" p-id="11201"></path></svg>',
                      },
                      showCaption: true,
                      id: 'rawitem4',
                    },
                    {
                      dataType: 25,
                      enableCond: 3,
                      labelPos: 'NONE',
                      noPrivDisplayMode: 1,
                      editor: {
                        editorParams: {
                          readonly: 'true',
                        },
                        editorType: 'TEXTBOX',
                        valueType: 'SIMPLE',
                        editable: true,
                        readOnly: true,
                        id: 'education',
                      },
                      allowEmpty: true,
                      codeName: 'education',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        shrink: 1,
                        layout: 'FLEX',
                      },
                      sysCss: {
                        cssName: 'myinterview',
                      },
                      id: 'education',
                    },
                    {
                      rawItem: {
                        sysImage: {
                          rawContent:
                            '<?xml version="1.0" standalone="no"?><!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"><svg t="1760168025709" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="12230" xmlns:xlink="http://www.w3.org/1999/xlink" width="20" height="20"><path d="M512 938.666667c-53.333333 0-384-257.258667-384-469.333334S299.925333 85.333333 512 85.333333s384 171.925333 384 384-330.666667 469.333333-384 469.333334z m0-352c64.8 0 117.333333-52.533333 117.333333-117.333334s-52.533333-117.333333-117.333333-117.333333-117.333333 52.533333-117.333333 117.333333 52.533333 117.333333 117.333333 117.333334z" fill="currentColor" p-id="12231"></path></svg>',
                        },
                        contentType: 'IMAGE',
                        sysCss: {
                          cssName: 'applicant_icon',
                        },
                        id: 'rawitem5',
                      },
                      codeName: 'rawitem5',
                      detailStyle: 'DEFAULT',
                      detailType: 'RAWITEM',
                      layoutPos: {
                        shrink: 1,
                        layout: 'FLEX',
                      },
                      sysCss: {
                        cssName: 'applicant_icon',
                      },
                      sysImage: {
                        rawContent:
                          '<?xml version="1.0" standalone="no"?><!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd"><svg t="1760168025709" class="icon" viewBox="0 0 1024 1024" version="1.1" xmlns="http://www.w3.org/2000/svg" p-id="12230" xmlns:xlink="http://www.w3.org/1999/xlink" width="20" height="20"><path d="M512 938.666667c-53.333333 0-384-257.258667-384-469.333334S299.925333 85.333333 512 85.333333s384 171.925333 384 384-330.666667 469.333333-384 469.333334z m0-352c64.8 0 117.333333-52.533333 117.333333-117.333334s-52.533333-117.333333-117.333333-117.333333-117.333333 52.533333-117.333333 117.333333 52.533333 117.333333 117.333333 117.333334z" fill="currentColor" p-id="12231"></path></svg>',
                      },
                      showCaption: true,
                      id: 'rawitem5',
                    },
                    {
                      dataType: 25,
                      enableCond: 3,
                      labelPos: 'NONE',
                      noPrivDisplayMode: 1,
                      editor: {
                        editorParams: {
                          readonly: 'true',
                        },
                        editorType: 'TEXTBOX',
                        valueType: 'SIMPLE',
                        editable: true,
                        readOnly: true,
                        id: 'address',
                      },
                      allowEmpty: true,
                      codeName: 'address',
                      detailStyle: 'DEFAULT',
                      detailType: 'FORMITEM',
                      layoutPos: {
                        shrink: 1,
                        layout: 'FLEX',
                      },
                      sysCss: {
                        cssName: 'myinterview',
                      },
                      id: 'address',
                    },
                  ],
                  codeName: 'grouppanel3',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  layoutPos: {
                    colMD: 24,
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
                      deformTabPages: [
                        {
                          layout: {
                            columnCount: 24,
                            layout: 'TABLE_24COL',
                          },
                          deformDetails: [
                            {
                              appViewId: 'web.hr_applicant_baseinfo_view',
                              parentDataJO: {
                                srfparentdename: 'HR_INTERVIEW',
                                SRFPARENTTYPE: 'CUSTOM',
                              },
                              codeName: 'druipart3',
                              detailStyle: 'DEFAULT',
                              detailType: 'DRUIPART',
                              layoutPos: {
                                colMD: 24,
                                layout: 'TABLE_24COL',
                              },
                              showCaption: true,
                              id: 'druipart3',
                            },
                          ],
                          caption: '原始简历',
                          codeName: 'tabpage1',
                          detailStyle: 'DEFAULT',
                          detailType: 'TABPAGE',
                          showCaption: true,
                          id: 'tabpage1',
                        },
                        {
                          layout: {
                            columnCount: 24,
                            layout: 'TABLE_24COL',
                          },
                          caption: '附加信息',
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
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'tabpanel1',
                    },
                  ],
                  codeName: 'grouppanel4',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  layoutPos: {
                    colMD: 24,
                    layout: 'TABLE_24COL',
                  },
                  id: 'grouppanel4',
                },
              ],
              capLanguageRes: {
                lanResTag: 'CONTROL.DEFORM.HR_INTERVIEW.MAIN.GROUPPANEL.GROUP1',
              },
              caption: '面试安排基本信息',
              codeName: 'group1',
              detailStyle: 'DEFAULT',
              detailType: 'GROUPPANEL',
              layoutPos: {
                colLG: 16,
                colMD: 16,
                layout: 'TABLE_24COL',
              },
              id: 'group1',
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
                          rawItem: {
                            content:
                              '<p>&middot;&middot;&middot;&middot;&middot;面试&middot;&middot;&middot;&middot;&middot;</p>',
                            contentType: 'HTML',
                            id: 'rawitem6',
                          },
                          codeName: 'rawitem6',
                          detailStyle: 'DEFAULT',
                          detailType: 'RAWITEM',
                          layoutPos: {
                            colMD: 24,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'rawitem6',
                        },
                      ],
                      codeName: 'grouppanel7',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      layoutPos: {
                        colLG: 8,
                        colLGOffset: 8,
                        colMD: 8,
                        colMDOffset: 8,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel7',
                    },
                    {
                      layout: {
                        columnCount: 24,
                        layout: 'TABLE_24COL',
                      },
                      deformDetails: [
                        {
                          actionType: 'UIACTION',
                          buttonStyle: 'DEFAULT',
                          uiactionId: 'start_interview@hr_interview',
                          tooltip: '进入面试',
                          uiactionTarget: 'SINGLEDATA',
                          caption: '进入面试',
                          codeName: 'button1',
                          detailStyle: 'DEFAULT',
                          detailType: 'BUTTON',
                          layoutPos: {
                            colLG: 8,
                            colMD: 8,
                            layout: 'TABLE_24COL',
                          },
                          sysImage: {
                            cssClass: 'fa fa-video-camera',
                            glyph: 'xf03d@FontAwesome',
                          },
                          showCaption: true,
                          id: 'button1',
                        },
                        {
                          actionType: 'UIACTION',
                          buttonStyle: 'DEFAULT',
                          uiactionId: 'add_feedback@hr_interview',
                          tooltip: '填写反馈',
                          uiactionTarget: 'NONE',
                          caption: '填写反馈',
                          codeName: 'button2',
                          detailStyle: 'DEFAULT',
                          detailType: 'BUTTON',
                          layoutPos: {
                            colLG: 8,
                            colMD: 8,
                            layout: 'TABLE_24COL',
                          },
                          showCaption: true,
                          id: 'button2',
                        },
                        {
                          actionType: 'UIACTION',
                          buttonStyle: 'DEFAULT',
                          uiactionId: 'data_savechanges',
                          tooltip: '面试未进行',
                          caption: '面试未进行',
                          codeName: 'button5',
                          detailStyle: 'DEFAULT',
                          detailType: 'BUTTON',
                          layoutPos: {
                            colLG: 8,
                            colMD: 8,
                            layout: 'TABLE_24COL',
                          },
                          sysImage: {
                            cssClass: 'fa fa-angle-right',
                            glyph: 'xf105@FontAwesome',
                          },
                          showCaption: true,
                          id: 'button5',
                        },
                        {
                          actionType: 'UIACTION',
                          buttonStyle: 'DEFAULT',
                          uiactionId: 'data_savechanges',
                          tooltip: '调整面试官',
                          caption: '调整面试官',
                          codeName: 'button3',
                          detailStyle: 'DEFAULT',
                          detailType: 'BUTTON',
                          layoutPos: {
                            colLG: 8,
                            colMD: 8,
                            layout: 'TABLE_24COL',
                          },
                          sysImage: {
                            cssClass: 'fa fa-angle-right',
                            glyph: 'xf105@FontAwesome',
                          },
                          showCaption: true,
                          id: 'button3',
                        },
                        {
                          actionType: 'UIACTION',
                          buttonStyle: 'DEFAULT',
                          uiactionId: 'data_savechanges',
                          tooltip: '安排面试',
                          caption: '安排面试',
                          codeName: 'button4',
                          detailStyle: 'DEFAULT',
                          detailType: 'BUTTON',
                          layoutPos: {
                            colLG: 8,
                            colMD: 8,
                            layout: 'TABLE_24COL',
                          },
                          sysImage: {
                            cssClass: 'fa fa-angle-right',
                            glyph: 'xf105@FontAwesome',
                          },
                          showCaption: true,
                          id: 'button4',
                        },
                        {
                          actionGroupExtractMode: 'ITEMS',
                          buttonListType: 'UIACTIONGROUP',
                          uiactionGroup: {
                            uiactionGroupDetails: [
                              {
                                actionLevel: 100,
                                afterItemType: 'NONE',
                                beforeItemType: 'NONE',
                                buttonStyle: 'DEFAULT',
                                caption: '预约面试',
                                detailType: 'DEUIACTION',
                                uiactionId:
                                  'appointment_interview@hr_interview',
                                showCaption: true,
                                showIcon: true,
                                id: 'u5b5436a',
                              },
                              {
                                actionLevel: 100,
                                afterItemType: 'NONE',
                                beforeItemType: 'NONE',
                                buttonStyle: 'DEFAULT',
                                caption: '填写反馈',
                                detailType: 'DEUIACTION',
                                uiactionId: 'add_feedback@hr_interview',
                                showCaption: true,
                                showIcon: true,
                                id: 'ua62e774',
                              },
                            ],
                            appDataEntityId: 'web.hr_interview',
                            uniqueTag: 'hr_interview__Usr0820370358',
                            name: '更多',
                            id: 'usr0820370358',
                          },
                          caption: '更多',
                          codeName: 'buttonlist1',
                          detailStyle: 'DEFAULT',
                          detailType: 'BUTTONLIST',
                          layoutPos: {
                            colLG: 8,
                            colMD: 8,
                            layout: 'TABLE_24COL',
                          },
                          id: 'buttonlist1',
                        },
                      ],
                      codeName: 'grouppanel8',
                      detailStyle: 'DEFAULT',
                      detailType: 'GROUPPANEL',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      id: 'grouppanel8',
                    },
                  ],
                  caption: '面试操作',
                  codeName: 'grouppanel6',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  layoutPos: {
                    colLG: 22,
                    colLGOffset: 1,
                    colMD: 22,
                    colMDOffset: 1,
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
                      appViewId:
                        'web.hr_interview_myinterview_detail_calendar_view',
                      parentDataJO: {
                        srfparentdename: 'HR_INTERVIEW',
                        SRFPARENTTYPE: 'CUSTOM',
                      },
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
                  ],
                  caption: '面试',
                  codeName: 'grouppanel11',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  layoutPos: {
                    colLG: 22,
                    colLGOffset: 1,
                    colMD: 22,
                    colMDOffset: 1,
                    layout: 'TABLE_24COL',
                  },
                  showCaption: true,
                  id: 'grouppanel11',
                },
                {
                  layout: {
                    columnCount: 24,
                    layout: 'TABLE_24COL',
                  },
                  deformDetails: [
                    {
                      appViewId:
                        'web.hr_candidate_filter_detail_filter_list_view',
                      navigateParams: [
                        {
                          key: 'n_applicant_id_eq',
                          value: 'applicant_id',
                          id: 'n_applicant_id_eq',
                        },
                      ],
                      parentDataJO: {
                        srfparentdename: 'HR_INTERVIEW',
                        SRFPARENTTYPE: 'CUSTOM',
                      },
                      codeName: 'druipart2',
                      detailStyle: 'DEFAULT',
                      detailType: 'DRUIPART',
                      layoutPos: {
                        colMD: 24,
                        layout: 'TABLE_24COL',
                      },
                      showCaption: true,
                      id: 'druipart2',
                    },
                  ],
                  caption: '简历筛选',
                  codeName: 'grouppanel9',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  layoutPos: {
                    colLG: 22,
                    colLGOffset: 1,
                    colMD: 22,
                    colMDOffset: 1,
                    layout: 'TABLE_24COL',
                  },
                  showCaption: true,
                  id: 'grouppanel9',
                },
                {
                  layout: {
                    columnCount: 24,
                    layout: 'TABLE_24COL',
                  },
                  caption: '备注',
                  codeName: 'grouppanel10',
                  detailStyle: 'DEFAULT',
                  detailType: 'GROUPPANEL',
                  layoutPos: {
                    colLG: 22,
                    colLGOffset: 1,
                    colMD: 22,
                    colMDOffset: 1,
                    layout: 'TABLE_24COL',
                  },
                  showCaption: true,
                  id: 'grouppanel10',
                },
              ],
              codeName: 'grouppanel5',
              detailStyle: 'DEFAULT',
              detailType: 'GROUPPANEL',
              layoutPos: {
                colLG: 8,
                colMD: 8,
                layout: 'TABLE_24COL',
              },
              id: 'grouppanel5',
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
            lanResTag: 'CONTROL.DEFORM.HR_INTERVIEW.MAIN.FORMPAGE.FORMPAGE1',
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
      codeName: 'myinterview_form',
      controlType: 'FORM',
      logicName: '我的面试',
      appDataEntityId: 'web.hr_interview',
      controlParam: {
        id: 'form',
      },
      modelId: 'bc97b7c9dfda265b703644790fcbfc61',
      modelType: 'PSDEFORM_EDITFORM',
      name: 'form',
      id: 'web.hr_interview.myinterview_form',
    },
    {
      codeName: 'edit_view_datainfobar',
      controlType: 'DATAINFOBAR',
      appDataEntityId: 'web.hr_interview',
      controlParam: {
        id: 'datainfobar',
      },
      name: 'datainfobar',
      id: 'edit_view_datainfobar',
    },
    {
      capLanguageRes: {
        lanResTag: 'DE.LNAME.HR_INTERVIEW',
      },
      caption: '面试',
      codeName: 'edit_view_captionbar',
      controlType: 'CAPTIONBAR',
      appDataEntityId: 'web.hr_interview',
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
    appDataEntityId: 'web.hr_interview',
    controlParam: {},
    id: 'layoutpanel',
  },
  title: '面试安排编辑视图',
  titleLanguageRes: {
    lanResTag: 'PAGE.TITLE.HR_INTERVIEW.EDITVIEW',
  },
  viewStyle: 'DEFAULT',
  viewType: 'DEEDITVIEW',
  enableDP: true,
  showCaptionBar: true,
  modelId: 'fc22f0e3c41c42fbcb6e1de964a900cc',
  modelType: 'PSAPPDEVIEW',
  name: 'hr_interviewEditView',
  id: 'web.hr_interview_edit_view',
};
