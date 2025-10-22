## 修改班次信息 <!-- {docsify-ignore-all} -->

   

### 逻辑处理脚本

```
console.log('UpdateByType临时数据创建:');

const serviceUtil = ibiz.hub.getApp(context.srfappid).deService;
const service = await serviceUtil.getService(context, 'attendanceapp.attendance_shift');
if(data.default_flag === false || data.default_flag === "false") {
    data.default_flag = 0
}

if (data.default_flag === 1 && data.workday_id&& (data.schedule_type === 'fixed' || data.schedule_type === 'flexible' || data.schedule_type === 'alternate_week')) {
    console.log('创建工作日班次:', data);

    //获取默认shift
    const list = service.local.getList(context);
    const defaultShift = list.find(item =>item.default_flag == 1 );

    const curScopes = data.scopes;
    // 获取所有班次临时数据
    const beforeScopes =defaultShift.scopes;

    if (beforeScopes.length > 0 && curScopes.length > 0) {
        // 与默认班次信息对比
        const areScopesEqual = compareScopes(beforeScopes, curScopes);

        if (!areScopesEqual) {
            data.id =null;
            data.default_flag = 0;
            data.public_flag = 0;
            curScopes.forEach(item => {
                item.shift_id =null
            })

            //为工作日创建班次
            const res = await service.exec('CreateTemp', context, data);

            if (res && res.ok) {
                data = res.data;
                console.log('临时数据创建成功:', res);
            }
            const workdayService = await serviceUtil.getService(context, 'attendanceapp.attendance_workday');

            const workday = await workdayService.local.get(context, data.workday_id);
            console.log('workday临时数据获取成功:', workday);
            workday.shift_id = data.id;
            const workdayRes = await workdayService.updateTemp(context, workday)
            if (workdayRes && res.workdayRes) {
                console.log('workday临时数据更新成功:', workdayRes);
            }
        }else {
            const res = await service.updateTemp(context, data)
            if (res && res.ok) {
                console.log('临时数据更新成功:', res);
            }
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

} else {
    const res = await service.exec('UpdateTemp', context, data);
    if (res && res.ok) {
        console.log('临时数据shift更新成功:', res);
    }
}
```
