<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
//1、排班日期区间为五个月，即[ 前三个月 - 当前月 - 下个月]
//2、生成新排班时需要生成生效日期起到排班日期区间止的所有排班
def activeShifts  = logic.param('activeShifts').getReal()
def activeRule = logic.param('activeRule').getReal()
def newSchedules = logic.param('newSchedules').getReal()
def _default = logic.param('Default').getReal()
def effect_time = _default.get("effect_time")
def inversion_cycle = _default.get("inversion_cycle")

//获取workdays
def group_shift = logic.param('group_shift').getReal()
def workdays = group_shift.get("workdays")

// 获取当前日期
def now = new Date()
def calendar = Calendar.getInstance()
def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
calendar.setTime(now)
 
  //限制生成区间
def limitTime = _default.get("limitTime")
def limitCal = Calendar.getInstance()
if(limitTime ){
    if (limitTime instanceof String) {
        limitCal.setTime(sdf.parse(limitTime))
    } else {
        limitCal.setTime(limitTime)
    }
}

// 跳转到下个月
calendar.add(Calendar.MONTH, 1)
// 设置为下个月最后一天
calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH))
    
// 排班结束日期
def endDate = sdf.format(calendar.getTime())


// 排班生成
def startCal = Calendar.getInstance()
startCal.setTime(effect_time)
    
// 解析结束日期
def endCal = Calendar.getInstance()
endCal.setTime(sdf.parse(endDate))

// 计算周期天数（N班倒*7天）
int cycleDays = inversion_cycle * 7

// 预处理工作日数据：建立周期映射表（仅保留1~cycleDays的配置）
def validWorkdays = workdays.findAll { it.day_number <= cycleDays }
def cycleMap = [:]
validWorkdays.each { 
    cycleMap[it.day_number] = it 
}

// 计算生效日期对应的周期基准日（最近的前序周一）
Calendar baseDateCal = Calendar.getInstance()
baseDateCal.setTime(effect_time)
// 计算需要回退的天数（1=周日,2=周一,...,7=周六）
int daysToSubtract = (baseDateCal.get(Calendar.DAY_OF_WEEK) - 2 + 7) % 7

if (daysToSubtract > 0) {
    baseDateCal.add(Calendar.DAY_OF_MONTH, -daysToSubtract)
}
Date baseDate = baseDateCal.getTime()

// 遍历当月每一天
while (!startCal.after(endCal)) {
    
    if(limitTime && startCal.before(limitCal)){
        startCal.add(Calendar.DAY_OF_MONTH, 1)
        continue 
    }

    Date checkinDate = startCal.getTime()
    
    // 计算相对于基准日的天数偏移
    long offsetMillis = checkinDate.getTime() - baseDate.getTime()
    int offsetDays = (offsetMillis / (24 * 60 * 60 * 1000)) as int
    
    // 计算周期位置（1-based）
    int dayInCycle = (offsetDays % cycleDays) + 1
    
    // 查找工作配置
    def workdayConfig = cycleMap[dayInCycle]

    if(workdayConfig!=null){
          //查找对应的班次信息
        def shift = activeShifts.find { it.id == workdayConfig.shift_id }
        def shift_data =  shift?.shift_data?:null
        def workTime = shift_data?.get("work_times") ?: null

        def schedule = sys.entity('attendance_schedule')
        schedule.rule_data = activeRule.get("rule_data")
        schedule.rule_name = activeRule.get("name")
        schedule.rule_id = activeRule.get("id")
        schedule.checkin_date =  sdf.format(checkinDate)
        schedule.shift_data = shift_data
        schedule.work_time = workTime
        schedule.workday = shift_data != null ? 1 : 0 
        newSchedules.add(schedule)

    }
    startCal.add(Calendar.DAY_OF_MONTH, 1)
}



```
