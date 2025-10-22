# 考勤规则(attendance_rule_edit_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)

##### 部件逻辑
* `onChange`
```
var realData = ctrl.getReal();
var _data = realData[0]

if(_data.schedule_type=="class_inversion"){
    console.log("N班倒-循环天数变更")
    //获取所有工作日进行删除
    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
    const workdays = workDayService.local.getList(context);
    workdays.forEach(day => {
        workDayService.removeTemp(context, day);
    })
    //重新填充工作日
    _data.workdays = null
    const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
    const tempres2 = await attendanceService.exec('FillWorkDays', context, _data, viewParam);
    Object.assign(_data, tempres2.data);
    //创建临时数据
    var workdays2 = _data.workdays;
    if (workdays2){
        const res = await workDayService.createTemp(context, workdays2)
        if(res){
            workdays2 = res.data;
            console.log('临时工作日数据创建成功:', workdays2);
        }
    }

    //更新组排班
    const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
    const tempGroups = groupService.local.getList(context);
    if (tempGroups){
        await Promise.all(
            tempGroups.map(async group => {
                groupService.local.delete(context, group.id)
            })
        );
    }

    //删除当前组排班人员临时数据
    const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
    const localGroup_members = group_membersService.local.getList(context);
    if (localGroup_members != null) {
        await Promise.all(
            localGroup_members.map(async member => {
                group_membersService.local.delete(context, member.id)
            })
        );
    }
    const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);
    Object.assign(_data, tempres3.data);
    var attendance_group_shifts = _data.attendance_group_shifts;
    if (attendance_group_shifts){
        const res = await groupService.createTemp(context, attendance_group_shifts)
        if(res){
            attendance_group_shifts = res.data;
            console.log('临时组排班数据创建成功:', attendance_group_shifts);
            _data.attendance_group_shifts = attendance_group_shifts;
            const formMDCtrls = ctrl.formMDCtrls;
            if(formMDCtrls){
                const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
                if (formMDCtrl) {
                    formMDCtrl.refresh()
                }
                const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");
                if (formMDCtrl1) {
                    formMDCtrl1.refresh()
                }
            }
        }
    }

    var druipart14 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart14")
    // 刷新druipart14关系界面
    if (druipart14) {
        druipart14?.embedView?.callUIAction('Refresh');
    }
}
```
* `onChange`
```
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type=="work_rest"){
    console.log("更新上A休B工作日")
    // 获取所有临时数据进行删除
    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
    const workdays = workDayService.local.getList(context);
    workdays.forEach(day => {
        workDayService.removeTemp(context, day);
    })

    var work = parseInt(_data.work) || 0;
    var rest = parseInt(_data.rest) || 0;
    var num = work + rest;
    var _workdays = [];
    for (var i = 1; i < num + 1; i++) {
        var workday = {
            name: "第" + i + "天",
            day_number: i,
            title: "工作/休息"
        }
        _workdays.push(workday)
    }
    const result = await workDayService.createTemp(context, _workdays);
    if (result) {
        _workdays = result.data;
        console.log('临时数据创建成功:', _workdays);
        _data.workdays=_workdays;

        //更新组排班
        const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
        const tempGroups = groupService.local.getList(context);
        if (tempGroups){
            await Promise.all(
                tempGroups.map(async group => {
                    groupService.local.delete(context, group.id)
                })
            );
        }

        //删除当前组排班人员临时数据
        const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
        const localGroup_members = group_membersService.local.getList(context);
        if (localGroup_members != null) {
            await Promise.all(
                localGroup_members.map(async member => {
                    group_membersService.local.delete(context, member.id)
                })
            );
        }
        const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
        const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);
        Object.assign(_data, tempres3.data);
        var attendance_group_shifts = _data.attendance_group_shifts;
        if (attendance_group_shifts){
            const res = await groupService.createTemp(context, attendance_group_shifts)
            if(res){
                attendance_group_shifts = res.data;
                console.log('临时数据创建成功:', attendance_group_shifts);
                _data.attendance_group_shifts = attendance_group_shifts;
                const formMDCtrls = ctrl.formMDCtrls;
                if(formMDCtrls){
                    const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
                    if (formMDCtrl) {
                        console.log("刷新重复器",formMDCtrl)
                        formMDCtrl.refresh()
                    }
                    const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");
                    if (formMDCtrl1) {
                        console.log("刷新重复器",formMDCtrl1)
                        formMDCtrl1.refresh()
                    }
                }
            }
        }
    }
    var druipart8 = ctrl.formDruipart.find(item => item.model.codeName === "druipart8")
    // 刷新druiPart8关系界面
    if (druipart8) {
        druipart8?.embedView?.callUIAction('Refresh');
    }
}
```
* `onChange`
```
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type=="alternate_week"){
    console.log("大小周工作日-大周变更")
    // 获取所有工作日（大周）临时数据进行删除
    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
    const workdays = workDayService.local.getList(context);
    workdays.forEach(day => {
        if(day.day_number < 8){
            workDayService.removeTemp(context, day);
        }
    })

    //重新构建
    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
    const list = service.local.getList(context);
    const defaultShift = list.find(item =>item.default_flag == 1 );
    var selection = _data.week1;

    if( defaultShift != null){
        var _workdays = [];
        for (var i = 1; i < 8; i++) {
            var workday = {
                shift_id : selection.includes(i.toString())?defaultShift.id:null,
                name : i,
                day_number : i ,
                rule_id : _data.id ,
                work_time : selection.includes(i.toString())?_data.work_time:"休息日"
            }
            _workdays.push(workday)
        }
        _data.workdays = _workdays;
        const res = await workDayService.createTemp(context,_workdays)
        if(res && res.ok){
            _workdays = res.data;
            console.log('工作日（大周）临时数据创建成功:', _workdays);
        }
    }
    var druipart6 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart6")
    // 刷新druipart6关系界面
    if (druipart6) {
        druipart6?.embedView?.callUIAction('Refresh');
    }
}

```
* `onChange`
```
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type=="alternate_week"){
    console.log("大小周工作日-小周变更")
    // 获取所有工作日（小周）临时数据进行删除
    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
    const workdays = workDayService.local.getList(context);
    workdays.forEach(day => {
        if(7<day.day_number && day.day_number < 15){
            workDayService.removeTemp(context, day);
        }
    })

    //重新构建
    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
    const list = service.local.getList(context);
    const defaultShift = list.find(item =>item.default_flag == 1 );
    var selection = _data.week2;

    if( defaultShift != null){
        var _workdays = [];
        for (var i = 8; i < 15; i++) {
            var workday = {
                shift_id : selection.includes(i.toString())?defaultShift.id:null,
                name : i,
                rule_id : _data.id,
                day_number : i ,
                work_time : selection.includes(i.toString())?_data.work_time:"休息日"
            }
            _workdays.push(workday)
        }
        _data.workdays = _workdays;
        const res = await workDayService.createTemp(context,_workdays)
        if(res && res.ok){
            _workdays = res.data;
            console.log('工作日（小周）临时数据创建成功:', _workdays);
        }
    }
    var druipart7 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart7")
    // 刷新druipart7关系界面
    if (druipart7) {
        druipart7?.embedView?.callUIAction('Refresh');
    }
}

```
* `onChange`
```
console.log("固定排班、灵活打卡-workday变更"+data)
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type=="fixed" || _data.schedule_type=="flexible"){
    console.log("固定排班、灵活打卡-workday变更")
    // 获取所有临时数据进行删除
    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
    const workdays = workDayService.local.getList(context);
    workdays.forEach(day => {
        workDayService.removeTemp(context, day);
    })

    //重新构建
    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
    const list = service.local.getList(context);
    const defaultShift = list.find(item =>item.default_flag == 1 );
    list.forEach(s => {
        if(s.default_flag != 1){
            service.removeTemp(context, s);
        }
    })

    var selection = _data.workday;
    if( defaultShift != null){
        var _workdays = [];
        for (var i = 1; i < 8; i++) {
            var workday = {
                shift_id : selection.includes(i.toString())?defaultShift.id:null,
                rule_id : _data.id,
                name : i,
                day_number: i,
                work_time : selection.includes(i.toString())?_data.work_time:"休息日"
            }
            _workdays.push(workday)
        }
        _data.workdays = _workdays;
        const res = await workDayService.createTemp(context,_workdays)
        if(res && res.ok){
            _workdays = res.data;
            console.log('临时数据创建成功:', _workdays);
        }
    }
    var druiPart5 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart5")
    // 刷新druipart5关系界面
    if (druiPart5) {
        druiPart5?.embedView?.callUIAction('Refresh');
    }
}


```
* `onChange`
```
// tag1  清空临时数据
console.log("清空临时数据")
const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
var realData = ctrl.getReal();
var _default = realData[0];
_default.workday = "1,2,3,4,5";
_default.shift_num = 1;

if (_default.schedule_type === 'alternate_week') {
    _default.week1 = "1,2,3,4,5";
    _default.week2 = "8,9,10,11,12,13";
    _default.week3 = null;
    _default.week4 = null;
    ctrl.data.alternate_week1 = "1,2,3,4,5";
    ctrl.data.alternate_week2 = "8,9,10,11,12,13";
}

if (_default.schedule_type === 'class_inversion') {
    _default.week1 = "1,2,3,4,5,6";
    _default.week2 = "8,9,10,11,12,13";
    _default.week3 = "15,16,17,18,19,20";
    _default.week4 = "22,23,24,25,26,27";
    ctrl.data.inversion_week1 = "1,2,3,4,5,6";
    ctrl.data.inversion_week2 = "8,9,10,11,12,13";
    ctrl.data.inversion_week3 = "15,16,17,18,19,20";
    ctrl.data.inversion_week4 = "22,23,24,25,26,27";
}

const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
const list = service.local.getList(context);
if (list != null) {
    // 遍历shift临时数据删除
    await Promise.all(
        list.map(async shift => {
            await service.local.delete(context, shift.id)
        })
    );
    const scopeService = await serviceUtil.getService(context, 'attendanceapp.attendance_scope');
    const scopes = scopeService.local.getList(context);
    // 遍历scope临时数据删除
    if (scopes !== null) {
        await Promise.all(
            scopes.map(async s => {
                await scopeService.local.delete(context, s.id)
            })
        );
    }
}

//遍历workday临时数据删除
const workdayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
const workdays = workdayService.local.getList(context);
if (workdays != null) {
    await Promise.all(
        workdays.map(async workday => {
            await workdayService.local.delete(context, workday.id)
        })
    );
}

// tag2 执行实体行为 FillDefaultShift
if (['fixed', 'free', 'work_rest', 'alternate_week', 'flexible', 'class_inversion', 'manual'].includes(_default.schedule_type)) {
    const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
    _default.shifts = null;
    const tempres = await attendanceService.exec('FillDefaultShift', context, _default, viewParam);
    Object.assign(_default, tempres.data);
    ctrl.data.default_shift = _default.default_shift
    // tag3 添加临时数据shifts
    var shifts = _default.shifts;

    await Promise.all(
        shifts.map(async shift => {
            await service.exec('CreateTemp', context, shift);
        })
    );

    // tag4 执行指定实体行为 fillWorkDays
    if (_default.schedule_type !== 'free' && _default.schedule_type !== 'manual') {
        _default.workdays = null;
        const tempres2 = await attendanceService.exec('FillWorkDays', context, _default, viewParam);
        Object.assign(_default, tempres2.data);
        // tag6 创建临时数据
        var workdays2 = _default.workdays;
        if (workdays2) {
            await Promise.all(
                workdays2.map(async workday => {
                    await workdayService.createTemp(context, workday);
                })
            );
        }

        // tag7 大小周
        if (_default.schedule_type === 'alternate_week') {
            // tag8
            // 大周
            var druiPart6 = ctrl.formDruipart.find(item => item.model.codeName === "druipart6")
            // 小周
            var druiPart7 = ctrl.formDruipart.find(item => item.model.codeName === "druipart7")
            // 刷新druipart6关系界面
            if (druiPart6) {
                druiPart6.context.schedule_type = _default.schedule_type
                druiPart6?.embedView?.callUIAction('Refresh');
            }
            if (druiPart7) {
                druiPart7.context.schedule_type = _default.schedule_type
                druiPart7?.embedView?.callUIAction('Refresh');
            }
        } else if (['fixed', 'flexible'].includes(_default.schedule_type)) {
            // tag9 固定排班、灵活打卡
            var druiPart5 = ctrl.formDruipart.find(item => item.model.codeName === "druipart5")
            // 刷新druipart5关系界面
            if (druiPart5) {
                druiPart5.context.schedule_type = _default.schedule_type
                druiPart5?.embedView?.callUIAction('Refresh');
            }
        } else if (_default.schedule_type === 'work_rest') {
            // 上A休B
            var druipart8 = ctrl.formDruipart.find(item => item.model.codeName === "druipart8")

            // 刷新druipart8关系界面
            if (druipart8) {
                druipart8.context.schedule_type = _default.schedule_type
                druipart8?.embedView?.callUIAction('Refresh');
            }
        } else if (_default.schedule_type === 'class_inversion') {
            var druipart13 = ctrl.formDruipart.find(item => item.model.codeName === "druipart13")
            // 刷新班次关系界面
            if (druipart13) {
                druipart13.context.schedule_type = _default.schedule_type
                druipart13?.embedView?.callUIAction('Refresh');
            }
            // N班倒-休息日相同
            if (_default.same_restday === 1) {
                var druipart9 = ctrl.formDruipart.find(item => item.model.codeName === "druipart9")

                // 刷新druipart9关系界面
                if (druipart9) {
                    druipart9.context.schedule_type = _default.schedule_type
                    druipart9?.embedView?.callUIAction('Refresh');
                }
                var druipart10 = ctrl.formDruipart.find(item => item.model.codeName === "druipart10")

                // 刷新druipart10关系界面
                if (druipart10) {
                    druipart10.context.schedule_type = _default.schedule_type
                    druipart10?.embedView?.callUIAction('Refresh');
                }
            }
            // N班倒-休息日不同
            if (_default.same_restday === 0) {
                var druipart14 = ctrl.formDruipart.find(item => item.model.codeName === "druipart14")
                // 刷新druipart14关系界面
                if (druipart14) {
                    druipart14.context.schedule_type = _default.schedule_type
                    druipart14?.embedView?.callUIAction('Refresh');
                }
            }
        }

    } else if (_default.schedule_type === 'manual') {
        // 手动排班
        var druipart1 = ctrl.formDruipart.find(item => item.model.codeName === "druipart1")
        // 刷新druipart1关系界面
        if (druipart1) {
            druipart1.context.schedule_type = 'manual'
            setTimeout(() => {
                druipart1?.embedView?.callUIAction('Refresh');
            }, 200)
        }

    } else if (_default.schedule_type === 'free') {
        // tag5 自由班
        console.log("填充自由班次")
        var shifts1 = _default.shifts;
        var scopes = shifts1[0].scopes;
        // var _default = uiLogic.default;
        _default.free_start = scopes[0].start_base_time;
        _default.free_end = scopes[0].end_base_time;

        ctrl.data.free_start = scopes[0].start_base_time;
        ctrl.data.free_end = scopes[0].end_base_time;

    }

    //更新组排班
    console.log("更新组排班",)
    //删除当前组排班临时数据
    const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
    const localGroup = groupService.local.getList(context);
    if (localGroup != null) {
        await Promise.all(
            localGroup.map(async group => {
                await groupService.local.delete(context, group.id);
            })
        );
    }
    //删除当前组排班人员临时数据
    const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
    const localGroup_members = group_membersService.local.getList(context);
    if (localGroup_members != null) {
        await Promise.all(
            localGroup_members.map(async member => {
                await group_membersService.local.delete(context, member.id);
            })
        );
    }
    //填充新组排班
    _default.group_shifts = null
    const tempres3 = await attendanceService.exec('FillGroupShift', context, _default, viewParam);
    Object.assign(_default, tempres3.data);
    var group_shifts = _default.group_shifts;
    if (group_shifts != null) {
        const res = await groupService.createTemp(context, group_shifts);
        if (res && res.ok) {
            console.log('组排班临时数据创建成功');
            const formMDCtrls = ctrl.formMDCtrls;
            if (formMDCtrls) {
                const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
                if (formMDCtrl) {
                    formMDCtrl.refresh()
                }
                const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_group_shifts");
                if (formMDCtrl1) {
                    formMDCtrl1.refresh()
                }
            }
        }
    }

}
//刷新表单工时
ctrl.data.work_time = null;
if ( _default.shifts != null) {
    const defaultShift =  _default.shifts.find(item => item.default_flag === 1);
    if (defaultShift != null && defaultShift.scopes != null) {
        //1、刷新主表单工时
        var scopes = defaultShift.scopes
        var worktimeParts = [];
        scopes.forEach(scope => {
            var start = scope.start_base_time.substring(0, 5);
            if(scope.next_tag === "1,0"||scope.next_tag === "1,1"){
                start = "次日" + start;
            }
            var end = scope.end_base_time.substring(0, 5);
            if(scope.next_tag === "0,1"||scope.next_tag === "1,1"){
                end = "次日" + end;
            }
            worktimeParts.push(start + '-' + end);
        })
        if (_default.schedule_type == "work_rest") {
            ctrl.data.work_time1 = worktimeParts.join('/')

        }
        if (_default.schedule_type == "alternate_week" || _default.schedule_type == "fixed" || _default.schedule_type == "flexible") {
            ctrl.data.work_time = worktimeParts.join('/')

        }
    }

}

```
* `onChange`
```
const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type=="class_inversion"){
    console.log("N班倒-week3变更")
    // 获取所有工作日（week3）临时数据进行删除
    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
    const workdays = workDayService.local.getList(context);
    workdays.forEach(day => {
        if(14<day.day_number&& day.day_number <22){
            workDayService.removeTemp(context, day);
        }
    })

    //重新构建
    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
    const list = service.local.getList(context);
    var selection = _data.week3;

    if( list != null){
        var title = list.map(item => item.name).join('/');
        var _workdays = [];
        for (var i = 15; i < 22; i++) {
            var workday = {
                name : i,
                day_number : i ,
                rule_id : _data.id,
                title: selection.includes(i.toString()) ? title : "休息"
            }
            _workdays.push(workday)
        }
        _data.workdays = _workdays;
        const tempwork = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
        const result = await tempwork.createTemp(context,_workdays)
        if(result){
            _workdays = result.data;
            console.log('工作日（week3）临时数据创建成功:', _workdays);
            const newWorkdays = workDayService.local.getList(context);
            _data.workdays = newWorkdays;

            //更新组排班
            const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
            const tempGroups = groupService.local.getList(context);
            if (tempGroups){
                await Promise.all(
                    tempGroups.map(async group => {
                        groupService.local.delete(context, group.id)
                    })
                );
            }

            //删除当前组排班人员临时数据
            const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
            const localGroup_members = group_membersService.local.getList(context);
            if (localGroup_members != null) {
                await Promise.all(
                    localGroup_members.map(async member => {
                        group_membersService.local.delete(context, member.id)
                    })
                );
            }
            const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
            const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);
            Object.assign(_data, tempres3.data);
            var attendance_group_shifts = _data.attendance_group_shifts;
            if (attendance_group_shifts){
                const res = await groupService.createTemp(context, attendance_group_shifts)
                if(res){
                    attendance_group_shifts = res.data;
                    console.log('临时组排班数据创建成功:', attendance_group_shifts);
                    _data.attendance_group_shifts = attendance_group_shifts;
                    const formMDCtrls = ctrl.formMDCtrls;
                    if(formMDCtrls){
                        const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
                        if (formMDCtrl) {
                            formMDCtrl.refresh()
                        }
                        const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");
                        if (formMDCtrl1) {
                            formMDCtrl1.refresh()
                        }
                    }
                }
            }
        }
    }
    var druipart11 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart11")
    // 刷新druipart11关系界面
    if (druipart11) {
        druipart11?.embedView?.callUIAction('Refresh');
    }
}

```
* `onChange`
```
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type=="class_inversion"){
    console.log("N班倒-week4变更")
    // 获取所有工作日（week4）临时数据进行删除
    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
    const workdays = workDayService.local.getList(context);
    workdays.forEach(day => {
        if(21<day.day_number&& day.day_number < 29){
            workDayService.removeTemp(context, day);
        }
    })

    //重新构建 
    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
    const list = service.local.getList(context);
    var selection = _data.week4;

    if( list != null){
        var title = list.map(item => item.name).join('/');    var _workdays = [];
        for (var i = 22; i < 29; i++) {
            var workday = {
                name : i,
                day_number : i ,
                rule_id : _data.id,
                title: selection.includes(i.toString()) ? title : "休息"
            }
            _workdays.push(workday)
        }
        _data.workdays = _workdays;
        const tempwork = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
        const result = await tempwork.createTemp(context,_workdays)
        if(result){
            _workdays = result.data;
            console.log('工作日（week4）临时数据创建成功:', _workdays);
            const newWorkdays = workDayService.local.getList(context);
            _data.workdays = newWorkdays;

            //更新组排班
            const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
            const tempGroups = groupService.local.getList(context);
            if (tempGroups){
                await Promise.all(
                    tempGroups.map(async group => {
                        groupService.local.delete(context, group.id)
                    })
                );
            }

            //删除当前组排班人员临时数据
            const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
            const localGroup_members = group_membersService.local.getList(context);
            if (localGroup_members != null) {
                await Promise.all(
                    localGroup_members.map(async member => {
                        group_membersService.local.delete(context, member.id)
                    })
                );
            }
            const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
            const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);
            Object.assign(_data, tempres3.data);
            var attendance_group_shifts = _data.attendance_group_shifts;
            if (attendance_group_shifts){
                const res = await groupService.createTemp(context, attendance_group_shifts)
                if(res){
                    attendance_group_shifts = res.data;
                    console.log('临时组排班数据创建成功:', attendance_group_shifts);
                    _data.attendance_group_shifts = attendance_group_shifts;
                    const formMDCtrls = ctrl.formMDCtrls;
                    if(formMDCtrls){
                        const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
                        if (formMDCtrl) {
                            formMDCtrl.refresh()
                        }
                        const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");
                        if (formMDCtrl1) {
                            formMDCtrl1.refresh()
                        }
                    }
                }
            }
        }
    }
    var druipart12 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart12")
    // 刷新druipart12关系界面
    if (druipart12) {
        druipart12?.embedView?.callUIAction('Refresh');
    }
}

```
* `onChange`
```
console.log("N班倒-week1变更")
const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type=="class_inversion"){
    // 获取所有工作日（week1）临时数据进行删除
    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
    const workdays = workDayService.local.getList(context);
    workdays.forEach(day => {
        if(day.day_number < 8){
            workDayService.removeTemp(context, day);
        }
    })

    //重新构建
    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
    const list = service.local.getList(context);
    console.log('工作日（week1）临时数据创建:', _data);

    var selection = _data.week1;

    if( list != null){
        var title = list.map(item => item.name).join('/');
        var _workdays = [];
        for (var i = 1; i < 8; i++) {
            var workday = {
                name : i,
                day_number : i ,
                rule_id : _data.id,
                title: selection.includes(i.toString()) ? title : "休息"
            }
            _workdays.push(workday)
        }
        _data.workdays = _workdays;
        const tempwork = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
        const result = await tempwork.createTemp(context,_workdays)
        if(result){
            _workdays = result.data;
            console.log('工作日（week1）临时数据创建成功:', _workdays);
            const newWorkdays = workDayService.local.getList(context);
            _data.workdays = newWorkdays;
            //更新组排班
            const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
            const tempGroups = groupService.local.getList(context);
            if (tempGroups){
                await Promise.all(
                    tempGroups.map(async group => {
                        groupService.local.delete(context, group.id)
                    })
                );
            }

            //删除当前组排班人员临时数据
            const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
            const localGroup_members = group_membersService.local.getList(context);
            if (localGroup_members != null) {
                await Promise.all(
                    localGroup_members.map(async member => {
                        group_membersService.local.delete(context, member.id)
                    })
                );
            }
            const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
            const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);
            Object.assign(_data, tempres3.data);
            var attendance_group_shifts = _data.attendance_group_shifts;
            if (attendance_group_shifts){
                const res = await groupService.createTemp(context, attendance_group_shifts)
                if(res){
                    attendance_group_shifts = res.data;
                    console.log('临时组排班数据创建成功:', attendance_group_shifts);
                    _data.attendance_group_shifts = attendance_group_shifts;
                    const formMDCtrls = ctrl.formMDCtrls;
                    if(formMDCtrls){
                        const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
                        if (formMDCtrl) {
                            formMDCtrl.refresh()
                        }
                        const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");
                        if (formMDCtrl1) {
                            formMDCtrl1.refresh()
                        }
                    }
                }
            }
        }
    }
    var druipart9 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart9")
    // 刷新druipart9关系界面
    if (druipart9) {
        druipart9?.embedView?.callUIAction('Refresh');
    }
}

```
* `onChange`
```
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type=="class_inversion"){
    console.log("N班倒-week2变更")
    // 获取所有工作日（week2）临时数据进行删除
    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
    const workdays = workDayService.local.getList(context);
    workdays.forEach(day => {
        if(7<day.day_number&& day.day_number <15){
            workDayService.removeTemp(context, day);
        }
    })

    //重新构建 
    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
    const list = service.local.getList(context);
    var selection = _data.week2;

    if( list != null){
        var title = list.map(item => item.name).join('/');
        var _workdays = [];
        for (var i = 8; i < 15; i++) {
            var workday = {
                name : i,
                day_number : i ,
                rule_id : _data.id,
                title: selection.includes(i.toString()) ? title : "休息"
            }
            _workdays.push(workday)
        }
        _data.workdays = _workdays;
        const tempwork = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
        const result = await tempwork.createTemp(context,_workdays)
        if(result){
            _workdays = result.data;
            console.log('工作日（week2）临时数据创建成功:', _workdays);
            const newWorkdays = workDayService.local.getList(context);
            _data.workdays = newWorkdays;
            //更新组排班
            const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
            const tempGroups = groupService.local.getList(context);
            if (tempGroups){
                await Promise.all(
                    tempGroups.map(async group => {
                        groupService.local.delete(context, group.id)
                    })
                );
            }

            //删除当前组排班人员临时数据
            const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
            const localGroup_members = group_membersService.local.getList(context);
            if (localGroup_members != null) {
                await Promise.all(
                    localGroup_members.map(async member => {
                        group_membersService.local.delete(context, member.id)
                    })
                );
            }
            const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
            const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);
            Object.assign(_data, tempres3.data);
            var attendance_group_shifts = _data.attendance_group_shifts;
            if (attendance_group_shifts){
                const res = await groupService.createTemp(context, attendance_group_shifts)
                if(res){
                    attendance_group_shifts = res.data;
                    console.log('临时组排班数据创建成功:', attendance_group_shifts);
                    _data.attendance_group_shifts = attendance_group_shifts;
                    const formMDCtrls = ctrl.formMDCtrls;
                    if(formMDCtrls){
                        const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
                        if (formMDCtrl) {
                            formMDCtrl.refresh()
                        }
                        const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");
                        if (formMDCtrl1) {
                            formMDCtrl1.refresh()
                        }
                    }
                }
            }
        }
    }
    var druipart10 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart10")
    // 刷新druipart10关系界面
    if (druipart10) {
        druipart10?.embedView?.callUIAction('Refresh');
    }
}

```
* `onChange`
```
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type=="class_inversion"){
    console.log("N班倒-inversion_count变更")
    // 获取所有临时数据进行删除
    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
    const shifts = service.local.getList(context);
    shifts.forEach(shift => {
        service.removeTemp(context, shift);
    })

    function timeToMinutes(timeStr) {
        const parts = timeStr.split(':');
        const hours = parseInt(parts[0], 10);
        const minutes = parseInt(parts[1], 10);
        return hours * 60 + minutes;
    }

    //重新构建
    var inversion_count = _data.inversion_count;
    var new_shifts = [];
    // 生成白班和晚班配置
    const createShift = (name, startTime, endTime) => {
        return {
            attendance_ratio: 1.0,
            working_number: 1,
            scopes: [{
                early_for_absenteeism: 60,
                early_for_early: 0,
                latest_checkout: 480,
                earliest_checkin: 60,
                end_base_time: endTime,
                late_for_absenteeism: 60,
                late_for_late: 0,
                shift_name: name,
                start_base_time: startTime,
                order_value: 1,
                next_tag: timeToMinutes(startTime)>=timeToMinutes(endTime)?"0,1":"0,0"
            }],
            default_flag: 0,
            public_flag: 0,
            name: name,
        };
    };


    var title = "";
    // 创建班次对象
    if(inversion_count == 2){
        const dayShift = createShift("白班", "09:00:00", "20:00:00");
        const nightShift = createShift("晚班", "20:00:00", "08:00:00");
        new_shifts.push(dayShift, nightShift);
        title = "白班/晚班"
    }
    if(inversion_count == 3){
        const dayShift = createShift("白班", "08:00:00", "16:00:00");
        const middleShift = createShift("中班", "16:00:00", "00:00:00");
        const nightShift = createShift("晚班", "00:00:00", "08:00:00");
        new_shifts.push(dayShift, middleShift, nightShift);
        title = "白班/中班/晚班"

    }
    if(inversion_count == 4){
        const morningShift = createShift("早班", "08:00:00", "12:00:00");
        const afternoonShift = createShift("下午班", "14:00:00", "20:00:00");
        const eveShift = createShift("前夜班", "20:00:00", "02:00:00");
        const afterShift = createShift("后夜班", "02:00:00", "08:00:00");
        new_shifts.push(morningShift);
        new_shifts.push(afternoonShift, eveShift,afterShift);
        title = "早班/下午班/前夜班/后夜班"
    }

    const tempService = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
    const shiftRes = await tempService.exec('CreateTemp', context, new_shifts);

    if (shiftRes && shiftRes.ok) {
        console.log('shift临时数据创建成功');
        _data.shifts = shiftRes.data
        //更新工作日title
        const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
        const workdays = workDayService.local.getList(context);
        workdays.forEach(day => {
            if(day.title != "休息"){
                day.title = _data.same_restday == 0 ? title + "/休息" : title;
                workDayService.updateTemp(context, day);
            }
        })
        _data.workdays = workdays

        //更新组排班
        const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
        const tempGroups = groupService.local.getList(context);
        if (tempGroups){
            await Promise.all(
                tempGroups.map(async group => {
                    groupService.local.delete(context, group.id)
                })
            );
        }

        //删除当前组排班人员临时数据
        const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
        const localGroup_members = group_membersService.local.getList(context);
        if (localGroup_members != null) {
            await Promise.all(
                localGroup_members.map(async member => {
                    group_membersService.local.delete(context, member.id)
                })
            );
        }
        const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
        const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);
        Object.assign(_data, tempres3.data);
        var attendance_group_shifts = _data.attendance_group_shifts;
        if (attendance_group_shifts){
            const res = await groupService.createTemp(context, attendance_group_shifts)
            if(res){
                attendance_group_shifts = res.data;
                console.log('临时数据创建成功:', attendance_group_shifts);
                _data.attendance_group_shifts = attendance_group_shifts;
                const formMDCtrls = ctrl.formMDCtrls;
                if(formMDCtrls){
                    const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
                    if (formMDCtrl) {
                        console.log("刷新重复器",formMDCtrl)
                        formMDCtrl.refresh()
                    }
                    const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");
                    if (formMDCtrl1) {
                        console.log("刷新重复器",formMDCtrl1)
                        formMDCtrl1.refresh()
                    }
                }
            }
        }

        //刷新关系页
        var druipart13 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart13")
        // 刷新druipart13关系界面
        if (druipart13) {
            druipart13?.embedView?.callUIAction('Refresh');
        }
        if(_data.same_restday == 0){
            //休息日不同
            var druipart14 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart14")
            // 刷新druipart14关系界面
            if (druipart14) {
                druipart14?.embedView?.callUIAction('Refresh');
            }
        }else {
            //刷新关系页 休息日相同
            var druipart9 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart9")
            // 刷新druipart9关系界面
            if (druipart9) {
                druipart9?.embedView?.callUIAction('Refresh');
            }

            var inversion_cycle = _data.inversion_cycle;

            if(inversion_cycle >1){
                //刷新关系页
                var druipart10 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart10")
                // 刷新druipart10关系界面
                if (druipart10) {
                    druipart10?.embedView?.callUIAction('Refresh');
                }
            }

            if(inversion_cycle >2){
                //刷新关系页
                var druipart11 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart11")
                // 刷新druipart11关系界面
                if (druipart11) {
                    druipart11?.embedView?.callUIAction('Refresh');
                }
            }

            if(inversion_cycle >3){
                //刷新关系页
                var druipart12 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart12")
                // 刷新druipart12关系界面
                if (druipart12) {
                    druipart12?.embedView?.callUIAction('Refresh');
                }
            }
        }
    }

}

```
* `onChange`
```
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type=="class_inversion"){
    console.log("N班倒-休息日是否相同")
    //获取所有工作日进行删除
    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
    const workdays = workDayService.local.getList(context);
    workdays.forEach(day => {
        workDayService.removeTemp(context, day);
    })
    //重新填充工作日
    _data.workdays = null
    const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
    const tempres2 = await attendanceService.exec('FillWorkDays', context, _data, viewParam);
    Object.assign(_data, tempres2.data);
    //创建临时数据
    var workdays2 = _data.workdays;
    for (var i = 0; i < workdays2.length; i++) {
        workDayService.createTemp(context, workdays2[i]);
    }
    //更新组排班
    const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
    const tempGroups = groupService.local.getList(context);
    if (tempGroups){
        await Promise.all(
            tempGroups.map(async group => {
                groupService.local.delete(context, group.id)
            })
        );
    }

    //删除当前组排班人员临时数据
    const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
    const localGroup_members = group_membersService.local.getList(context);
    if (localGroup_members != null) {
        await Promise.all(
            localGroup_members.map(async member => {
                group_membersService.local.delete(context, member.id)
            })
        );
    }
    const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);
    Object.assign(_data, tempres3.data);
    var group_shifts = _data.group_shifts;
    if (group_shifts){
        const res = await groupService.createTemp(context, group_shifts)
        if(res){
            group_shifts = res.data;
            console.log('group_shifts:', group_shifts);
            _data.group_shifts = group_shifts;
            const formMDCtrls = ctrl.formMDCtrls;
            if(formMDCtrls){
                const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
                if (formMDCtrl) {
                    formMDCtrl.refresh()
                }
                const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_group_shifts");
                if (formMDCtrl1) {
                    formMDCtrl1.refresh()
                }
            }
        }
    }
    if(_data.same_restday == 0){
        var druipart14 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart14")
        // 刷新druipart14关系界面
        if (druipart14) {
            druipart14?.embedView?.callUIAction('Refresh');
        }
    }else{
        //刷新关系页
        var druipart9 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart9")
        // 刷新druipart9关系界面
        if (druipart9) {
            druipart9?.embedView?.callUIAction('Refresh');
        }
        //刷新关系页
        var druipart10 = ctrl.formDruipart.find(item => item.model.codeName ==="druipart10")
        // 刷新druipart10关系界面
        if (druipart10) {
            druipart10?.embedView?.callUIAction('Refresh');
        }
    }

}
```
* `onChange`
```
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type == "manual"){
    console.log("手动排班-班次数量变更")
    // 获取所有临时数据进行删除
    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
    const shifts = service.local.getList(context);
    shifts.forEach(shift => {
        service.removeTemp(context, shift);
    });

    // 重新构建
    var shift_num = _data.shift_num;
    var new_shifts = [];

    const createShift = (name, startTime, endTime, i) => {
        return {
            attendance_ratio: 1.0,
            working_number: 1,
            scopes: [{
                early_for_absenteeism: 60,
                early_for_early: 0,
                latest_checkout: 480,
                earliest_checkin: 60,
                end_base_time: endTime,
                late_for_absenteeism: 60,
                late_for_late: 0,
                shift_name: name,
                start_base_time: startTime,
                order_value: 1
            }],
            default_flag: 0,
            public_flag: 0,
            name: name,
            order_value: i
        };
    };

    // 根据 shift_num 动态生成班次
    for (let i = 1; i <= shift_num; i++) {
        const shiftName = `班次${i}`;
        const startTime = "08:00:00";
        const endTime = "17:00:00";
        new_shifts.push(createShift(shiftName, startTime, endTime,i));
    }

    // 批量创建临时数据
    const res = await service.exec('CreateTemp', context, new_shifts);
    if(res){
        console.log('班次临时数据创建成功:', new_shifts);
        // 刷新关系页
        const druipart1 = ctrl.formDruipart.find(item => item.model.codeName === "druipart1");
        if (druipart1) {
            setTimeout(() => {
                druipart1?.embedView?.callUIAction('Refresh');
            }, 200);
        }
    }

}

```
* `onChange`
```
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.schedule_type=="work_rest"){
    console.log("更新上A休B工作日")
    // 获取所有临时数据进行删除
    const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
    const workDayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');
    const workdays = workDayService.local.getList(context);
    workdays.forEach(day => {
        workDayService.removeTemp(context, day);
    })

    var work = parseInt(_data.work) || 0;
    var rest = parseInt(_data.rest) || 0;
    var num = work + rest;
    var _workdays = [];
    for (var i = 1; i < num + 1; i++) {
        var workday = {
            name: "第" + i + "天",
            day_number: i,
            title: "工作/休息"
        }
        _workdays.push(workday)
    }
    const result = await workDayService.createTemp(context, _workdays);
    if (result) {
        _workdays = result.data;
        console.log('临时数据创建成功:', _workdays);
        _data.workdays=_workdays;

        //更新组排班
        const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
        const tempGroups = groupService.local.getList(context);
        if (tempGroups){
            await Promise.all(
                tempGroups.map(async group => {
                    groupService.local.delete(context, group.id)
                })
            );
        }

        //删除当前组排班人员临时数据
        const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
        const localGroup_members = group_membersService.local.getList(context);
        if (localGroup_members != null) {
            await Promise.all(
                localGroup_members.map(async member => {
                    group_membersService.local.delete(context, member.id)
                })
            );
        }
        const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
        const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);
        Object.assign(_data, tempres3.data);
        var attendance_group_shifts = _data.attendance_group_shifts;
        if (attendance_group_shifts){
            const res = await groupService.createTemp(context, attendance_group_shifts)
            if(res){
                attendance_group_shifts = res.data;
                console.log('临时数据创建成功:', attendance_group_shifts);
                _data.attendance_group_shifts = attendance_group_shifts;
                const formMDCtrls = ctrl.formMDCtrls;
                if(formMDCtrls){
                    const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
                    if (formMDCtrl) {
                        console.log("刷新重复器",formMDCtrl)
                        formMDCtrl.refresh()
                    }
                    const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");
                    if (formMDCtrl1) {
                        console.log("刷新重复器",formMDCtrl1)
                        formMDCtrl1.refresh()
                    }
                }
            }
        }
    }
    var druipart8 = ctrl.formDruipart.find(item => item.model.codeName === "druipart8")
    // 刷新druiPart8关系界面
    if (druipart8) {
        druipart8?.embedView?.callUIAction('Refresh');
    }
}
```
* `onChange`
```
console.log("group_num值变更")
var realData = ctrl.getReal();
var _default = realData[0];
// 删除当前组排班临时数据
const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
const localGroup = groupService.local.getList(context) || [];
const deleteGroupIds = new Set();

// 组数减少时标记要删除的组
if (localGroup.length > 0 && localGroup.length > _default.group_num) {
    localGroup
        .filter(g => g.order_num > _default.group_num)
        .forEach(g => deleteGroupIds.add(g.id));

    // 批量删除组（并发执行）
    await Promise.all(
        [...deleteGroupIds].map(groupId =>
            groupService.local.delete(context, groupId)
        )
    );
    console.log(`已删除${deleteGroupIds.size}个无效排班组`);

    // 删除当前组排班人员临时数据
    const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
    const localGroup_members = group_membersService.local.getList(context) || [];

    if (localGroup_members.length > 0) {
        // 获取所有有效组ID（未被删除的组）
        const validGroupIds = new Set(
            localGroup.filter(g => !deleteGroupIds.has(g.id))
                .map(g => g.id)
        );

        // 批量删除无效成员
        const deletePromises = localGroup_members
            .filter(member => !validGroupIds.has(member.group_id))
            .map(member =>
                group_membersService.local.delete(context, member.id)
            );

        await Promise.all(deletePromises);
        console.log(`已删除${deletePromises.filter(p => p).length}条无效排班成员记录`);
    }

}


if (localGroup.length > 0 && localGroup.length < _default.group_num) {
    // 组数增加时填充新组排班
    const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
    const tempres3 = await attendanceService.exec('FillGroupShift', context, _default, viewParam);
    Object.assign(_default, tempres3.data);
    const group_shifts = _default.group_shifts || [];
    const localLength = localGroup.length

    // 批量创建新组
    if (group_shifts.length > 0) {
        const createPromises = group_shifts
            .filter(shift => shift.order_num > localLength)
            .map(shift =>
                groupService.createTemp(context, shift)
                    .then(res => {
                        if (res && res.ok) {
                            console.log(`组排班临时数据创建成功: ${shift.order_num}`);
                            return true;
                        }
                        console.error(`组排班创建失败: ${shift.order_num}`);
                        return false;
                    })
            );

        const createResults = await Promise.all(createPromises);
        const successCount = createResults.filter(r => r).length;
        console.log(`已创建${successCount}个新排班组（总尝试${createPromises.length}次）`);
    }

}

// 刷新界面
const formMDCtrls = ctrl.formMDCtrls;
if (formMDCtrls) {
    const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
    if (formMDCtrl) {
        console.log("刷新重复器", formMDCtrl);
        formMDCtrl.refresh();
    } else {
        console.warn("未找到n_inversion控件");
    }
}
```
* `onChange`
```
var realData = ctrl.getReal();
var _data = realData[0];
//更新组排班
const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
const groupService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift');
const tempGroups = groupService.local.getList(context);
if (tempGroups){
    await Promise.all(
        tempGroups.map(async group => {
            groupService.local.delete(context, group.id)
        })
    );
}

//删除当前组排班人员临时数据
const group_membersService = await serviceUtil.getService(context, 'attendanceapp.attendance_group_shift_member');
const localGroup_members = group_membersService.local.getList(context);
if (localGroup_members != null) {
    await Promise.all(
        localGroup_members.map(async member => {
            group_membersService.local.delete(context, member.id)
        })
    );
}
const attendanceService = await serviceUtil.getService(context, 'attendanceapp.attendance_rule');
const tempres3 = await attendanceService.exec('FillGroupShift', context, _data, viewParam);
Object.assign(_data, tempres3.data);
var attendance_group_shifts = _data.attendance_group_shifts;
if (attendance_group_shifts){
    const res = await groupService.createTemp(context, attendance_group_shifts)
    if(res){
        attendance_group_shifts = res.data;
        console.log('临时组排班数据创建成功:', attendance_group_shifts);
        _data.attendance_group_shifts = attendance_group_shifts;
        const formMDCtrls = ctrl.formMDCtrls;
        if(formMDCtrls){
            const formMDCtrl = formMDCtrls.find(item => item.name === "n_inversion");
            if (formMDCtrl) {
                formMDCtrl.refresh()
            }
            const formMDCtrl1 = formMDCtrls.find(item => item.name === "test_attendance_group_shifts");
            if (formMDCtrl1) {
                formMDCtrl1.refresh()
            }
        }
    }
}
```
* `onChange`
```
console.log("手动班次判断结果")
const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
var realData = ctrl.getReal();
var _data = realData[0];
if(_data.auto_match === 1){
    const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
    const shifts = service.local.getList(context);

    // 存储重复班次组合（二维数组）
    const duplicateGroups = [];
    // 记录已处理的班次索引
    const processed = new Set();

    // 遍历所有班次
    for(let i = 0; i < shifts.length; i++){
        if(processed.has(i)) continue;

        const currentGroup = [shifts[i].name];
        // 与后续班次逐一比对
        for(let j = i+1; j < shifts.length; j++){
            if(!processed.has(j) && compareScopes(shifts[i].scopes, shifts[j].scopes)){
                currentGroup.push(shifts[j].name);
                processed.add(j);
            }
        }

        // 记录有重复的组合
        if(currentGroup.length > 1){
            duplicateGroups.push(currentGroup);
        }
    }

    // 生成判断结果
    if(duplicateGroups.length > 0){
        const judge_result = duplicateGroups.map(group =>
            `${group.join('、')}上班时间重复，无法智能匹配，建议修改重复班次的上班时间`
        ).join('；');
        ctrl.setDataValue('judge_result', judge_result);
    }else{
        ctrl.setDataValue('judge_result', null);
    }

    // 班次信息对比
    function compareScopes(beforeScopes, curScopes) {
        if (beforeScopes.length !== curScopes.length) return false;

        for (let i = 0; i < beforeScopes.length; i++ ) {
            const defaultItem = beforeScopes[i];
            const curItem = curScopes[i];

            if (typeof defaultItem !== 'object' || typeof curItem !== 'object' ) {
                return false;
            }

            if (
                defaultItem.early_for_absenteeism !== curItem.early_for_absenteeism ||
                defaultItem.early_for_early !== curItem.early_for_early ||
                defaultItem.latest_checkout !== curItem.latest_checkout ||
                defaultItem.earliest_checkin !== curItem.earliest_checkin ||
                defaultItem.end_base_time !== curItem.end_base_time ||
                defaultItem.late_for_absenteeism !== curItem.late_for_absenteeism ||
                defaultItem.late_for_late !== curItem.late_for_late ||
                defaultItem.start_base_time !== curItem.start_base_time
            ) {
                return false;
            }
        }
        return true;
    }
}
```
#### 工具栏(toolbar)


### 关联界面行为
  * [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule) : [保存规则](module/attendance/attendance_rule#界面行为)
  * [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule) : [编辑界面_退出操作](module/attendance/attendance_rule#界面行为)

### 关联界面逻辑
  * [考勤规则(ATTENDANCE_RULE)](module/attendance/attendance_rule) : [清空临时数据](module/attendance/attendance_rule/uilogic/cleanTemp)

### 关联视图
  * [设备打卡(attendance_checkin_device_grid_view)](app/view/attendance_checkin_device_grid_view)
  * [GPS打卡(attendance_gps_location_grid_view)](app/view/attendance_gps_location_grid_view)
  * [保存考勤规则(attendance_rule_active_option_view)](app/view/attendance_rule_active_option_view)
  * [班次设置(attendance_shift_grid_view)](app/view/attendance_shift_grid_view)
  * [班次设置(attendance_shift_inversion_grid_view)](app/view/attendance_shift_inversion_grid_view)
  * [WIFI打卡(attendance_wifi_location_grid_view)](app/view/attendance_wifi_location_grid_view)
  * [工作日(attendance_workday_big_week_grid_view)](app/view/attendance_workday_big_week_grid_view)
  * [工作日(attendance_workday_different_grid_view)](app/view/attendance_workday_different_grid_view)
  * [工作日(attendance_workday_grid_view)](app/view/attendance_workday_grid_view)
  * [工作日(attendance_workday_inversion_grid_view)](app/view/attendance_workday_inversion_grid_view)
  * [工作日(attendance_workday_inversion_week2_grid_view)](app/view/attendance_workday_inversion_week2_grid_view)
  * [工作日(attendance_workday_inversion_week3_grid_view)](app/view/attendance_workday_inversion_week3_grid_view)
  * [工作日(attendance_workday_inversion_week4_grid_view)](app/view/attendance_workday_inversion_week4_grid_view)
  * [工作日(attendance_workday_small_week_grid_view)](app/view/attendance_workday_small_week_grid_view)
  * [工作日(attendance_workday_work_rest_grid_view)](app/view/attendance_workday_work_rest_grid_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>