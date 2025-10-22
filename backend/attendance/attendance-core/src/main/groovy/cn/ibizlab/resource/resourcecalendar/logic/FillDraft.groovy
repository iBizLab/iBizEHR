package cn.ibizlab.resource.resourcecalendar.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[RESOURCE_CALENDAR]处理逻辑[补充草稿]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class FillDraft extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(FillDraft.class)

    @Override
	protected void onInit() throws Exception {
		super.onInit()
	}

    @Override
    protected void onExecutePSDELogicNode(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        switch (iPSDELogicNode.getCodeName()) {
            case "Begin":
                //执行逻辑节点[开始]
                executeBegin(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[执行脚本代码]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
                break
            default:
                super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode)
        }
    }

    /**
     * 执行逻辑节点[开始]，逻辑类型[BEGIN]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBegin(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[执行脚本代码]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			
			// 基础字段默认值
			_default.set("name", "Default Working Hours")
			_default.set("active", 1)
			// _default.set("company_id", logic.param('Current Company').getReal().id)
			_default.set("tz", java.util.TimeZone.getDefault().ID)
			_default.set("flexible_hours", 1)
			_default.set("full_time_required_hours", 8.0)
			
			// 处理工作时间段
			def company = _default.get("company")
			if (company && company.resource_calendar_id &&
			    !company.resource_calendar_id.two_weeks_calendar) {
			
			    _default.set("attendance_ids", company.resource_calendar_id.attendance_ids.collect { att ->
			        Map entry = new LinkedHashMap<String, Object>();
			        entry.put("name", att.name)
			        entry.put("dayofweek", att.dayofweek)
			        entry.put("hour_from", att.hour_from)
			        entry.put("hour_to", att.hour_to)
			        entry.put("day_period", att.day_period)
			        entry.put("date_from", att.date_from)
			        entry.put("date_to", att.date_to)
			        return entry
			    })
			} else {
			    // 生成默认工作时间（周一到周五 8-17点）
			    _default.set("attendance_ids", (0..4).collect { day ->
			        [
			            ["Mon","Tue","Wed","Thu","Fri"][day] + " Morning",
			            ["Mon","Tue","Wed","Thu","Fri"][day] + " Lunch",
			            ["Mon","Tue","Wed","Thu","Fri"][day] + " Afternoon"
			        ].collect { name ->
			            Map entry = new LinkedHashMap<String, Object>();
			            entry.put("name", name)
			            entry.put("dayofweek", day.toString())
			            entry.put("hour_from", name.contains("Morning") ? 8 : name.contains("Lunch") ? 12 : 13)
			            entry.put("hour_to", name.contains("Morning") ? 12 : name.contains("Lunch") ? 13 : 17)
			            entry.put("day_period", name.contains("Morning") ? "morning" : name.contains("Lunch") ? "lunch" : "afternoon")
			            return entry
			    }
			    }.flatten())
			}
			// 处理假期字段
			_default.set("leave_ids", [])
			_default.set("global_leave_ids", [])
			
			// 时区偏移计算
			def tz = java.time.ZoneId.of(_default.get("tz"))
			_default.set("tz_offset", tz.rules.getOffset(java.time.Instant.now()).toString())
        }.call(iDELogicSession.getDELogicRuntime().getSystemRuntime(), iDELogicSession.getDELogicRuntime())
        //设置返回值
        iDELogicSession.setLastReturn(objRet);
        if(iPSDELogicNode.getRetPSDELogicParam() != null) {
            def retDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNode.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
        //super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[结束]，逻辑类型[END]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeEnd01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

