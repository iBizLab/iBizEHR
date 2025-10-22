<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
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

// 计算周期天数（N班倒*7天）
int cycleDays = inversion_cycle * 7

// 预处理工作日数据：建立周期映射表（仅保留1~cycleDays的配置）
def validWorkdays = workdays.findAll { it.day_number <= cycleDays }
def cycleMap = [:]
validWorkdays.each { 
    cycleMap[it.day_number] = it 
}

// 计算当月第一天对应的周期基准日（最近的前序周一）
Calendar baseDateCal = Calendar.getInstance()
baseDateCal.setTime(startOfMonth)
// 计算需要回退的天数（1=周日,2=周一,...,7=周六）
int daysToSubtract = (baseDateCal.get(Calendar.DAY_OF_WEEK) - 2 + 7) % 7
if (daysToSubtract > 0) {
    baseDateCal.add(Calendar.DAY_OF_MONTH, -daysToSubtract)
}
Date baseDate = baseDateCal.getTime()

// 遍历当月每一天
while (!startCal.after(endCal)) {
    Date checkinDate = startCal.getTime()
    
    // 计算相对于基准日的天数偏移
    long offsetMillis = checkinDate.getTime() - baseDate.getTime()
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    
    // 计算周期位置（1-based）
    int dayInCycle = (offsetDays % cycleDays) + 1

    // 查找工作配置
    def workdayConfig = cycleMap[dayInCycle]
    
    // 判断是否为休息日
    boolean isRestDay = (workdayConfig == null) || 
                       (workdayConfig.title == "休息")
    
    // 如果是休息日且未记录，则添加到结果集
    if (isRestDay) {
        def day = lastRldata.find { it.date_to >= checkinDate && it.date_from <= checkinDate }
        if (day == null) {
            def restday = sys.entity('resource_calendar_leaves')
            restday.set("date",sdf.format(checkinDate))
            restday.set("iswork",0)
            lastRldata.add(restday)
        }
    }
    
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}
```
