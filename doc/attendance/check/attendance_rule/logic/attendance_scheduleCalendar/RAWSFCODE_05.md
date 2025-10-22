<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def curRldata = logic.param('leaves').getReal()
def lastRldata = logic.param('lastRldata').getReal()
def _default = logic.param('Default').getReal()
def holiday = _default.get("holiday")
def startOfMonth = _default.get("startOfMonth")

if(curRldata && holiday && startOfMonth){
    def sdf = new java.text.SimpleDateFormat("yyyy-MM-dd")
    
    curRldata.each{ i ->
        def holiday_type = i.get("holiday_type")?: ""
        
        if(holiday.contains(holiday_type)){
            def startDate = i.get("date_from")
            def endDate = i.get("date_to")

            if (startDate && endDate) {
                // 日期范围调整逻辑
                if(startOfMonth.after(startDate)){
                    startDate = startOfMonth
                }
                
                // 确保结束日期不小于开始日期
                if(endDate.before(startDate)) return

                // 使用Calendar进行日期遍历
                Calendar cal = Calendar.getInstance()
                cal.setTime(startDate)
                
                while (!cal.getTime().after(endDate)) {  
                    def restday = sys.entity('resource_calendar_leaves')
                    restday.set("date", sdf.format(cal.getTime()))
                    restday.set("iswork", 0)
                    restday.set("name", i.get("name"))
                    lastRldata.add(restday)
                    
                    cal.add(Calendar.DATE, 1) 
                }
            }
        }
    }
}
```
