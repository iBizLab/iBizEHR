<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//计算排班
def _default = logic.param('Default').getReal()
def schedule_type = _default.get("schedule_type")
def workdays = _default.get("workdays")
def shifts = _default.get("shifts")
def inversion_cycle = _default.get("inversion_cycle")
def inversion_count = _default.get("inversion_count")
def same_restday = _default.get("same_restday")
def inversion_days = _default.get("inversion_days")
def rest = _default.get("rest")
def work = _default.get("reworkst")
def biweekly_cycle = _default.get("biweekly_cycle")
def rq = _default.get("rq")

def lastRldata = logic.param('lastRldata').getReal()

// 解析传入月份并计算起止时间
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
def rqDateFormat = new java.text.SimpleDateFormat("yyyy-MM")
def rqDate = rqDateFormat.parse(rq)

Calendar cal = Calendar.getInstance()
cal.setTime(rqDate)

// 设置当月第一天
cal.set(Calendar.DAY_OF_MONTH, 1)
Date startOfMonth = cal.getTime()

// 设置下个月第一天并回退一天得到当月最后一天
cal.add(Calendar.MONTH, 1)
cal.set(Calendar.DAY_OF_MONTH, 1)
cal.add(Calendar.DAY_OF_MONTH, -1)
Date endOfMonth = cal.getTime()

def startCal = Calendar.getInstance()
startCal.setTime(startOfMonth)

def endCal = Calendar.getInstance()
endCal.setTime(endOfMonth)


// 判断是否工作日
def judgeWork = { Date checkinDate, List workdaysParam, List activeShiftsParam ->
        // 1. 确定当前日期是周几（1-7对应周一到周日）
        def calendarInner = Calendar.getInstance()
    calendarInner.setTime(checkinDate)
    int dayOfWeek = calendarInner.get(Calendar.DAY_OF_WEEK)
    int dayNumber = (dayOfWeek == Calendar.SUNDAY) ? 7 : dayOfWeek - 1
    // print "班次数据, ${activeShiftsParam}!"
    // print "工作日数据, ${workdaysParam}!"
    // print "日期数据, ${checkinDate}!"

    // 2. 查找匹配的工作日配置
    def workdayConfig = workdaysParam.find { it.day_number == dayNumber }

// 3. 未找到工作日配置时返回空班次
if (!workdayConfig || !workdayConfig.shift_id) {
    return 0
}

// 4. 查找对应的班次信息
def shift = activeShiftsParam.find { it.id == workdayConfig.shift_id }

// 5. 未找到班次时返回空班次
if (!shift) {
    return 0

}

return 1;
}

// 遍历日期区间
while (!startCal.after(endCal)) {
    def checkinDate = startCal.getTime()
    def day = lastRldata.find { it.date_to >= checkinDate && it.date_from <= checkinDate }

    if(day == null){
        def res = judgeWork(checkinDate, workdays, shifts)
        if(res==0){
            def restday = sys.entity('resource_calendar_leaves')
            restday.set("date",sdf.format(checkinDate))
            restday.set("iswork",0)
            lastRldata.add(restday)
        }
    }

    startCal.add(Calendar.DAY_OF_MONTH, 1)
}

```
