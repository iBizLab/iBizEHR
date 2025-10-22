<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param('Default').getReal()
def shifts  = _default.get("shifts")
def schedule_type = _default.get("schedule_type")
if (["alternate_week", "fixed", "flexible", "work_rest", "free"].contains(schedule_type) && shifts) {
    def shift = shifts.find { it.get("default_flag") == 1 }
    def scopes = shift.get("scopes")
    if (scopes) {
        def worktimeParts = []
        def timeFormat = new java.text.SimpleDateFormat("HH:mm")
        scopes.forEach { scope ->
            def next_tag = scope.get("next_tag")
            def start_base_time = scope.get("start_base_time")
            def end_base_time = scope.get("end_base_time")

            def formatTime = { time ->
                timeFormat.format(time instanceof Date ? time : new Date(time.time))
            }
            def start = formatTime(start_base_time)
            if (next_tag && next_tag in ["1,0", "1,1"]) {
                start = "次日" + start
            }

            def end = formatTime(end_base_time)
            if (next_tag && next_tag in ["0,1", "1,1"]) {
                end = "次日" + end
            }
            worktimeParts << "${start}-${end}"

        }

        _default.set("work_time", worktimeParts.join('/'))
    }
}

```
