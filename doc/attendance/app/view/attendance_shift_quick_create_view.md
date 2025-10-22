# 上下班时间(attendance_shift_quick_create_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)

##### 部件逻辑
* `onChange`
```
console.log("重复器表单完全加载绘制完成");

// 计算时间
const calctime = (index) => {
    const mdctrl = ctrl.formMDCtrls.find(item => item.name === 'scopes')
    const mdData = mdctrl.repeaterMap.get(index.toString());
    const form = mdData.data;
    if (form) {
        const {start_base_time, end_base_time} = form
        const [start_hour, start_minute] = start_base_time.split(':');
        const [end_hour, end_minute] = end_base_time.split(':');
        // 开始小时
        const tempStartHour = Number(start_hour);
        // 开始分钟
        const tempStartMinute = Number(start_minute);
        // 结束小时
        const tempEndHour = Number(end_hour);
        // 结束分钟
        const tempEndMinute = Number(end_minute);
        return {
            "start_hour": tempStartHour,
            "start_minute": tempStartMinute,
            "end_hour": tempEndHour,
            "end_minute": tempEndMinute,
            "start_base_time": start_base_time,
            "end_base_time": end_base_time,
        }
    }
    return {
        "start_hour": 0,
        "start_minute": 0,
        "end_hour": 0,
        "end_minute": 0,
    }
}

// 计算禁用时间
const calcDisabledTime = (index, tag) => {
    const times = [];
    // tag为true时，表示小于index的时间禁用,否则，大于index的时间禁用
    if (tag) {
        for (let i = 0; i < index; i++) {
            times.push(i)
        }
    } else {
        for (let i = index; i < 59; i++) {
            times.push(i)
        }
    }
    return times;
}

// 重复器表单的第一个表单数据
const defaultTime = {
    "start_hour": 0,
    "start_minute": 0,
    "end_hour": 0,
    "end_minute": 0
}

const time1 = calctime(0); // 第一次班次的开始结束时间
const {
    start_hour: start_hour1,
    start_minute: start_minute1,
    end_hour: end_hour1,
    end_minute: end_minute1,
    start_base_time: start_base_time1,
    end_base_time: end_base_time1
} = time1;

const time2 = ctrl.data.working_number > 1 ? calctime(1) : defaultTime; // 第二次班次的开始结束时间
const {
    start_hour: start_hour2,
    start_minute: start_minute2,
    end_hour: end_hour2,
    end_minute: end_minute2,
    start_base_time: start_base_time2,
    end_base_time: end_base_time2
} = time2;

const time3 = ctrl.data.working_number === 3 ? calctime(2) : defaultTime; // 第三次班次的开始结束时间
const {
    start_hour: start_hour3,
    start_minute: start_minute3,
    end_hour: end_hour3,
    end_minute: end_minute3,
    start_base_time: start_base_time3,
    end_base_time: end_base_time3
} = time3;
// 重复器表单的第一个表单数据
const mdctrl = ctrl.formMDCtrls.find(item => item.name === 'scopes')
const form1 = mdctrl.repeaterMap.get("0").details;

// 重复器表单的第二个表单数据
const form2 = ctrl.data.working_number > 1 ? mdctrl.repeaterMap.get("1").details : null ;

// 重复器表单的第三个表单数据
const form3 =  ctrl.data.working_number > 2 ? mdctrl.repeaterMap.get("2").details : null ;

if (ctrl.data.working_number > 1) {
    if (form1) {
        // 下班时间控制器
        const endc = form1.end_base_time
        const endEditor = endc.editor;
        // 上班时间控制器
        const startc = form1.start_base_time
        const startEditor = startc.editor;
        if (endEditor && startEditor) {
            //对于上班时间1：当上班时间1>下班时间1时，[大于下班时间1]区间内禁选
            if (start_base_time1 >= end_base_time1) {
                const disabledHourTime = calcDisabledTime(end_minute1 == 0 ? end_hour1 : end_hour1 + 1, false);
                const disabledMinuteTime = calcDisabledTime(end_minute1, false); // 结束时间需要禁用的分钟
                startEditor.setDisabledHours(disabledHourTime);
                startEditor.setDisabledMinutes(disabledMinuteTime);
            }
            //对于下班时间1：当上班时间2<下班时间1,[上班时间2~上班时间1]区间内禁选
            if (start_base_time2 <= start_base_time1) {
                const disabledRange =
                    {
                        "starthour": end_hour2,
                        "startminute": end_minute2,
                        "endhour": start_hour1,
                        "endminute": start_minute1
                    }
                endEditor.setDisabledRange([disabledRange]);
            }
        }
    }
}

if (ctrl.data.working_number >= 2) {
    if (form2) {
        // 下班时间控制器
        const endc = form2.end_base_time
        const endEditor2 = endc.editor;
        // 上班时间控制器
        const startc = form2.start_base_time
        const startEditor2 = startc.editor;
        if (endEditor2 && startEditor2) {
            // 对于上班时间2，上下班次数为2~3时
            // 若下班时间2<下班时间1
            if (end_base_time2 < end_base_time1) {
                //[end_base_time2~end_base_time1]区间内禁选，获取禁选时间
                const disabledRange =
                    {
                        "starthour": end_hour2,
                        "startminute": end_minute2,
                        "endhour": end_hour1,
                        "endminute": end_minute1
                    }
                startEditor2.setDisabledRange([disabledRange]);
            } else {
                //若上班时间1>=下班时间1
                if (start_base_time1 >= end_base_time1) {
                    //[小于下班时间1 && 大于下班时间2]的时间禁选
                    const disabledRange1 =
                        {
                            "starthour": 0,
                            "startminute": 0,
                            "endhour": end_hour1,
                            "endminute": end_minute1
                        }
                    const disabledRange2 =
                        {
                            "starthour": end_hour2,
                            "startminute": end_minute2,
                            "endhour": 24,
                            "endminute": 60
                        }
                    startEditor2.setDisabledRange([disabledRange1, disabledRange2])
                }
            }

            //对于下班时间2，当上下班次数为2时
            if (ctrl.data.working_number === 2) {
                // 当上班时间2<下班时间1或上班时间1>下班时间1，[小于上班时间2]区间内禁选
                if ((end_base_time1 > start_base_time1 && start_base_time2 <= end_base_time1) || start_base_time1 >= end_base_time1) {
                    const disabledHourTime = calcDisabledTime(start_hour2, true); // 结束时间需要禁用的小时
                    const disabledMinuteTime = calcDisabledTime(start_minute2, true); // 结束时间需要禁用的分钟
                    endEditor2.setDisabledHours(disabledHourTime);
                    endEditor2.setDisabledMinutes(disabledMinuteTime);
                }
            }

            if (ctrl.data.working_number === 3) {
                // 下班时间控制器
                const endc3 = form3.end_base_time
                const endEditor3 = endc3.editor;
                // 上班时间控制器
                const startc3 = form3.start_base_time
                const startEditor3 = startc3.editor;
                //对于下班时间2，当上下班次数为3时
                if ((end_base_time1 > start_base_time1 && start_base_time2 <= end_base_time1) || start_base_time1 >= end_base_time1) {

                    const disabledRange1 =
                        {
                            "starthour": 0,
                            "startminute": 0,
                            "endhour": start_hour2,
                            "endminute": start_minute2
                        }
                    const disabledRange2 =
                        {
                            "starthour": start_hour3,
                            "startminute": start_hour3,
                            "endhour": 24,
                            "endminute": 60
                        }
                    endEditor2.setDisabledRange([disabledRange1, disabledRange2])
                }

                // 对于上班时间3：当上班时间1>下班时间1 或 下班时间2<上班时间2时，[小于下班时间2&&大于下班时间3]区间内禁选
                if (start_base_time1 >= end_base_time1 || end_base_time2 <= start_base_time2) {
                    const disabledRange1 =
                        {
                            "starthour": 0,
                            "startminute": 0,
                            "endhour": end_hour2,
                            "endminute": end_minute2
                        }
                    const disabledRange2 =
                        {
                            "starthour": end_hour3,
                            "startminute": end_minute3,
                            "endhour": 24,
                            "endminute": 60
                        }
                    startEditor3.setDisabledRange([disabledRange1, disabledRange2])

                }
                // 对于下班时间3：当上班时间3属于跨天时，小于上班时间3的区间禁选
                if (start_base_time1 >= end_base_time1 || end_base_time2 <= start_base_time2 || start_base_time3 <= end_base_time2) {
                    const disabledHourTime = calcDisabledTime(start_hour3, true);
                    const disabledMinuteTime = calcDisabledTime(start_minute3, true); // 结束时间需要禁用的分钟
                    endEditor3.setDisabledHours(disabledHourTime);
                    endEditor3.setDisabledMinutes(disabledMinuteTime);
                }

            }

        }

    }

}

```
* `onClick`
```
console.log("重复器表单完全加载绘制完成");

// 计算时间
const calctime = (index) => {
    const mdData = mdctrl.contentCtrlData[index];
    const {srfkey} = mdData;
    const formNeuron = mdctrl.formNeurons.get(srfkey);
    if (formNeuron) {
        const form = formNeuron.call.getThisController();
        const {start_base_time, end_base_time} = form.data
        const [start_hour, start_minute] = start_base_time.split(':');
        const [end_hour, end_minute] = end_base_time.split(':');
        // 开始小时
        const tempStartHour = Number(start_hour);
        // 开始分钟
        const tempStartMinute = Number(start_minute);
        // 结束小时
        const tempEndHour = Number(end_hour);
        // 结束分钟
        const tempEndMinute = Number(end_minute);
        return {
            "start_hour": tempStartHour,
            "start_minute": tempStartMinute,
            "end_hour": tempEndHour,
            "end_minute": tempEndMinute,
            "start_base_time": start_base_time,
            "end_base_time": end_base_time,
        }
    }
    return {
        "start_hour": 0,
        "start_minute": 0,
        "end_hour": 0,
        "end_minute": 0,
    }
}

// 计算禁用时间
const calcDisabledTime = (index, tag) => {
    const times = [];
    // tag为true时，表示小于index的时间禁用,否则，大于index的时间禁用
    if (tag) {
        for (let i = 0; i < index; i++) {
            times.push(i)
        }
    } else {
        for (let i = index; i < 59; i++) {
            times.push(i)
        }
    }
    return times;
}

// 重复器表单的第一个表单数据
const defaultTime = {
    "start_hour": 0,
    "start_minute": 0,
    "end_hour": 0,
    "end_minute": 0
}

const time1 = calctime(0); // 第一次班次的开始结束时间
const {
    start_hour: start_hour1,
    start_minute: start_minute1,
    end_hour: end_hour1,
    end_minute: end_minute1,
    start_base_time: start_base_time1,
    end_base_time: end_base_time1
} = time1;

const time2 = ctrl.data.working_number > 1 ? calctime(1) : defaultTime; // 第二次班次的开始结束时间
const {
    start_hour: start_hour2,
    start_minute: start_minute2,
    end_hour: end_hour2,
    end_minute: end_minute2,
    start_base_time: start_base_time2,
    end_base_time: end_base_time2
} = time2;

const time3 = ctrl.data.working_number === 3 ? calctime(2) : defaultTime; // 第三次班次的开始结束时间
const {
    start_hour: start_hour3,
    start_minute: start_minute3,
    end_hour: end_hour3,
    end_minute: end_minute3,
    start_base_time: start_base_time3,
    end_base_time: end_base_time3
} = time3;
// 重复器表单的第一个表单数据
const mdData1 = mdctrl.contentCtrlData[0];
const srfkey1 = mdData1?.srfkey;
const formNeuron1 = srfkey1 ? mdctrl.formNeurons.get(srfkey1) : null;

// 重复器表单的第二个表单数据
const mdData2 = ctrl.data.working_number > 1 ? mdctrl.contentCtrlData[1] : null;
const srfkey2 = mdData2?.srfkey;
const formNeuron2 = srfkey2 ? mdctrl.formNeurons.get(srfkey2) : null;

// 重复器表单的第二个表单数据
const mdData3 = ctrl.data.working_number === 3 ? mdctrl.contentCtrlData[2] : null;
const srfkey3 = mdData3?.srfkey;
const formNeuron3 = srfkey3 ? mdctrl.formNeurons.get(srfkey3) : null;

if (ctrl.data.working_number > 1) {
    if (formNeuron1) {
        const form = formNeuron1.call.getThisController();
        // 下班时间控制器
        const endc = form.details.end_base_time
        const endEditor = endc.editor;
        // 上班时间控制器
        const startc = form.details.start_base_time
        const startEditor = startc.editor;
        if (endEditor && startEditor) {
            //对于上班时间1：当上班时间1>下班时间1时，[大于下班时间1]区间内禁选
            if (start_base_time1 >= end_base_time1) {
                const disabledHourTime = calcDisabledTime(end_minute1 == 0 ? end_hour1 : end_hour1 + 1, false);
                const disabledMinuteTime = calcDisabledTime(end_minute1, false); // 结束时间需要禁用的分钟
                startEditor.setDisabledHours(disabledHourTime);
                startEditor.setDisabledMinutes(disabledMinuteTime);
            }
            //对于下班时间1：当上班时间2<下班时间1,[上班时间2~上班时间1]区间内禁选
            if (start_base_time2 <= start_base_time1) {
                const disabledRange =
                    {
                        "starthour": end_hour2,
                        "startminute": end_minute2,
                        "endhour": start_hour1,
                        "endminute": start_minute1
                    }
                endEditor.setDisabledRange([disabledRange]);
            }
        }
    }
}

if (ctrl.data.working_number >= 2) {
    if (formNeuron2) {
        const form = formNeuron2.call.getThisController();
        // 下班时间控制器
        const endc = form.details.end_base_time
        const endEditor2 = endc.editor;
        // 上班时间控制器
        const startc = form.details.start_base_time
        const startEditor2 = startc.editor;
        if (endEditor2 && startEditor2) {
            // 对于上班时间2，上下班次数为2~3时
            // 若下班时间2<下班时间1
            if (end_base_time2 < end_base_time1) {
                //[end_base_time2~end_base_time1]区间内禁选，获取禁选时间
                const disabledRange =
                    {
                        "starthour": end_hour2,
                        "startminute": end_minute2,
                        "endhour": end_hour1,
                        "endminute": end_minute1
                    }
                startEditor2.setDisabledRange([disabledRange]);
            } else {
                //若上班时间1>=下班时间1
                if (start_base_time1 >= end_base_time1) {
                    //[小于下班时间1 && 大于下班时间2]的时间禁选
                    const disabledRange1 =
                        {
                            "starthour": 0,
                            "startminute": 0,
                            "endhour": end_hour1,
                            "endminute": end_minute1
                        }
                    const disabledRange2 =
                        {
                            "starthour": end_hour2,
                            "startminute": end_minute2,
                            "endhour": 24,
                            "endminute": 60
                        }
                    startEditor2.setDisabledRange([disabledRange1, disabledRange2])
                }
            }

            //对于下班时间2，当上下班次数为2时
            if (ctrl.data.working_number === 2) {
                // 当上班时间2<下班时间1或上班时间1>下班时间1，[小于上班时间2]区间内禁选
                if ((end_base_time1 > start_base_time1 && start_base_time2 <= end_base_time1) || start_base_time1 >= end_base_time1) {
                    const disabledHourTime = calcDisabledTime(start_hour2, true); // 结束时间需要禁用的小时
                    const disabledMinuteTime = calcDisabledTime(start_minute2, true); // 结束时间需要禁用的分钟
                    endEditor2.setDisabledHours(disabledHourTime);
                    endEditor2.setDisabledMinutes(disabledMinuteTime);
                }
            }

            if (ctrl.data.working_number === 3) {
                const form3 = formNeuron3.call.getThisController();
                // 下班时间控制器
                const endc3 = form3.details.end_base_time
                const endEditor3 = endc3.editor;
                // 上班时间控制器
                const startc3 = form3.details.start_base_time
                const startEditor3 = startc3.editor;
                //对于下班时间2，当上下班次数为3时
                if ((end_base_time1 > start_base_time1 && start_base_time2 <= end_base_time1) || start_base_time1 >= end_base_time1) {

                    const disabledRange1 =
                        {
                            "starthour": 0,
                            "startminute": 0,
                            "endhour": start_hour2,
                            "endminute": start_minute2
                        }
                    const disabledRange2 =
                        {
                            "starthour": start_hour3,
                            "startminute": start_hour3,
                            "endhour": 24,
                            "endminute": 60
                        }
                    endEditor2.setDisabledRange([disabledRange1, disabledRange2])
                }

                // 对于上班时间3：当上班时间1>下班时间1 或 下班时间2<上班时间2时，[小于下班时间2&&大于下班时间3]区间内禁选
                if (start_base_time1 >= end_base_time1 || end_base_time2 <= start_base_time2) {
                    const disabledRange1 =
                        {
                            "starthour": 0,
                            "startminute": 0,
                            "endhour": end_hour2,
                            "endminute": end_minute2
                        }
                    const disabledRange2 =
                        {
                            "starthour": end_hour3,
                            "startminute": end_minute3,
                            "endhour": 24,
                            "endminute": 60
                        }
                    startEditor3.setDisabledRange([disabledRange1, disabledRange2])

                }
                // 对于下班时间3：当上班时间3属于跨天时，小于上班时间3的区间禁选
                if (start_base_time1 >= end_base_time1 || end_base_time2 <= start_base_time2 || start_base_time3 <= end_base_time2) {
                    const disabledHourTime = calcDisabledTime(start_hour3, true);
                    const disabledMinuteTime = calcDisabledTime(start_minute3, true); // 结束时间需要禁用的分钟
                    endEditor3.setDisabledHours(disabledHourTime);
                    endEditor3.setDisabledMinutes(disabledMinuteTime);
                }

            }

        }

    }

}

```

##### 属性注入
* `上班时间` 注入属性 `clearable`

```javascript
false
```

* `下班时间` 注入属性 `clearable`

```javascript
false
```

## 视图界面逻辑
* `null`
```javascript
console.log('校验时间');
const { scopes } = data;
// 计算时间结果，返回分钟
const calcMinutes = (time, minutes = 0) => {
    const times = time.split(':');
    const hoursTime = Number(times[0]) * 60 + Number(times[1]);
    return hoursTime + Number(minutes);
}
// 校验第一个的最早打卡时间要晚于最后一个的最晚打卡时间
const verifitime = () => {
    const firsttime = scopes[0];
    const lasttime = scopes[data.working_number - 1];

    // 第一次上班时间
    const prevstart = firsttime.start_base_time;
    // 第一次下班提前打卡时间
    const prevAdvance = firsttime.earliest_checkin;
    // 最后一次下班时间
    const nextend = lasttime.end_base_time;
    //最后一次下班延迟打开时间
    const nextExtension = lasttime.latest_checkout;

    // 最早上班 
    const startwork = calcMinutes(prevstart, -Number(prevAdvance));
    // 最晚下班
    const endwork = calcMinutes(nextend, Number(nextExtension));

    if (endwork >= 1440) {
        // 最迟下班时间已经到了第二天，
        // 那么今天最早上班时间必须在当天且大于昨天下班时间
        const tomorrowTime = endwork - 1440;
        if (startwork >= 0) {
            if (tomorrowTime < startwork) {
                return true
            }
            return false;
        }
        return false
    } else if (startwork > 0 && endwork <= startwork) {
        // 表示开始和结束时间顺序不对
        return false;
    } else if (startwork < 0 && endwork < 1440) {
        // 最早打卡时间是上一天，
        // 那么换算成前一天的打卡时间就必须要大于前一天最晚下班打卡时间
        const yestoday = 1440 + startwork
        if (yestoday > endwork) {
            return true;
        }
        return false
    }
    return true;
}

// 显示错误提示
const showErrorMsg = (index, errmsg) => {
    // 校验失败，需要提示当前错误项
    const form = view.nerve.form.call.getThisController();
    const mctrldata = form.details.scopes.contentCtrlData;
    const key = mctrldata[index].srfkey;
    // 获取下一班次的重复器表单控制器
    const mdformNeuron = form.details.scopes.formNeurons.get(key);
    const childForm = mdformNeuron.call.getThisController();
    // 提示
    ibiz.message.error(errmsg);
    childForm.details.earliest_checkin.error = errmsg;

}

if (!data.working_number || data.working_number < 2) {
    // 仅一个的情况仅处理边界打卡时间
    const tag = verifitime()
    if (tag) {
        return {
            refresult: true
        };
    }
    showErrorMsg(0, "当天最晚下班打卡时间不能与最早上班打卡时间重合");
    return {
        refresult: false
    }
}

// 循环比较每一班次和下一班次
for (let i = 0; i < data.working_number - 1; i++) {
    const prevscopes = scopes[i];
    const nextscopes = scopes[i + 1];

    // 上一次下班时间
    const prevEnd = prevscopes.end_base_time;
    // 上一次下班延迟打卡时间
    const prevExtension = prevscopes.latest_checkout;
    // 下次次上班时间
    const nextStart = nextscopes.start_base_time;
    //下次上班时间延迟打卡时间
    const nextExtension = nextscopes.earliest_checkin;

    // 第一次最后下班时间   以分钟计算
    const prevClockout = calcMinutes(prevEnd, Number(prevExtension));
    // 下次上班时间
    const nextClockin = calcMinutes(nextStart, -Number(nextExtension))

    if (prevClockout >= nextClockin) {
        showErrorMsg(i + 1, "最早上班时间不得早于上个班次最晚下班时间");
        // // 校验失败，需要提示当前错误项
        // const form = view.nerve.form.call.getThisController();
        // const mctrldata = form.details.scopes.contentCtrlData;
        // const key = mctrldata[i + 1].srfkey;
        // // 获取下一班次的重复器表单控制器
        // const mdformNeuron = form.details.scopes.formNeurons.get(key);
        // const childForm = mdformNeuron.call.getThisController();
        // // 提示
        // ibiz.message.error('最早上班时间不得早于上个班次最晚下班时间');
        // childForm.details.earliest_checkin.error = '最早上班时间不得早于上个班次最晚下班时间'
        return {
            refresult: false
        };
    }
}
const tag = verifitime();
if (!tag) {
    showErrorMsg(data.working_number - 1, "当天最晚下班打卡时间不能与最早上班打卡时间重合");
    return {
        refresult: false
    };
}

return {
    refresult: true
};



```


<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>