<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def temp = logic.param('temp').getReal()
def checkinDate = temp.get("checkin_date")
def activeShifts = logic.param('activeShifts').getReal()

def rule_data = temp.get("rule_data")
print "rule_data配置, ${rule_data}"
print "activeShifts配置, ${activeShifts}"
print "checkinDate配置, ${checkinDate}"

if (rule_data != null && checkinDate != null && activeShifts != null) {
    Map<String, Object> ruleData = rule_data as Map<String, Object>;
    def workdays = ruleData.get("workdays")
    print "工作日配置, ${workdays}"


    // 计算当天排班班次
    def calcShiftData = { Date checkinDateParam, List workdaysParam, List activeShiftsParam ->
        // 1. 确定当前日期是周几（1-7对应周一到周日）
        def calendarInner = Calendar.getInstance()
        calendarInner.setTime(checkinDateParam)
        int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
        int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1

        // 2. 查找匹配的工作日配置
        def workdayConfig = workdaysParam.find { it.day_number == dayNumber }

        // 3. 未找到工作日配置时返回空班次
        if (!workdayConfig || !workdayConfig.shift_id) {
            print "未找到工作日配置时返回空班次, ${workdayConfig}!"
            return null
        }

        // 4. 查找对应的班次信息
        def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }

        // 5. 未找到班次时返回空班次
        if (!shift || !shift.shift_data) {
            print "未找到班次时返回空班次, ${shift}!"
            return null
        }

        // 6. 返回班次数据
        print "返回班次数据, ${shift}!"
        return shift.shift_data
    }

    def shift_data = calcShiftData(checkinDate, workdays, activeShifts)
    def workTime = shift_data?.work_times ?: null
    temp.set("shift_data",shift_data)
    temp.set("work_time",workTime)
    temp.set("workday",shift_data != null ? 1 : 0)

}

```
