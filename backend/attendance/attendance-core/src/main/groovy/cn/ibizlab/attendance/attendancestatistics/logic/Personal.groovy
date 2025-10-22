package cn.ibizlab.attendance.attendancestatistics.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENDANCE_STATISTICS]处理逻辑[个人统计]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class Personal extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(Personal.class)

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
            case "PREPAREPARAM1":
                //执行逻辑节点[准备参数]
                executePREPAREPARAM1(iDELogicSession, iPSDELogicNode)
                break
            case "DEACTION1":
                //执行逻辑节点[获取员工]
                executeDEACTION1(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE1":
                //执行逻辑节点[获取考勤记录]
                executeRAWSFCODE1(iDELogicSession, iPSDELogicNode)
                break
            case "END1":
                //执行逻辑节点[结束]
                executeEND1(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取员工]，逻辑类型[DEACTION]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDEACTION1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[获取考勤记录]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRAWSFCODE1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def emp = logic.param('emp').getReal()
			
			def n_checkin_date_gtandeq = _default.get('n_checkin_date_gtandeq')
			def n_checkin_date_ltandeq = _default.get('n_checkin_date_ltandeq')
			
			//获取`考勤记录`实体运行对象
			def record_runtime = sys.dataentity('attendance_record')
			def record_filter = record_runtime.filter()
			record_filter.all()
			if (n_checkin_date_gtandeq != null && n_checkin_date_ltandeq != null) {
			    record_filter.gte('checkin_date', n_checkin_date_gtandeq)
			    record_filter.lte('checkin_date', n_checkin_date_ltandeq)
			}
			record_filter.eq('member_id', emp.get("id"))
			// def record_list = record_filter.select('')
			
			
			record_filter.setPageable(0,1000,0)
			def page = record_filter.fetch()
			
			
			// 早退分钟数 
			def leave_early_minutes = 0
			// 迟到时间
			def late_time = 0
			// 加班时间 
			def overtime_time = 0
			// 计薪时长
			def billable_time = 0
			// 实际出勤时长（分钟）
			def working_time = 0
			// 迟到分钟数
			def late_minutes = 0
			// 应出勤时长（分钟）
			def should_attendance_time = 0
			// 加班小时数
			def overtime_hours = 0
			// 早退时间
			def leave_early_time = 0
			// 实际出勤时长（小时）
			def working_hours = 0
			// 应出勤时长（小时）
			def should_attendance_hours = 0
			// 实际出勤天数
			def actual_attendance_days = 0
			// 应出勤天数 
			def should_attendance_days = 0
			// 上班缺卡 
			def on_missing = 0
			// 下班缺卡 
			def off_missing = 0
			// 迟到次数 
			def late_times = 0
			// 早退次数 
			def leave_early_times = 0
			// 旷工天数 
			def absent_days = 0
			def map = new HashMap()
			
			if(page != null){
			    //循环汇总
			    page.each { item ->
			        def checkin_date = item.get('checkin_date').toString().substring(0, 10)
			        map.put(checkin_date, item)
			        leave_early_minutes += item.get("leave_early_minutes")?:0
			        late_time += item.get("late_time")?:0
			        overtime_time += item.get("overtime_time")?:0
			        working_time += item.get("working_time")?:0
			        late_minutes += item.get("late_minutes")?:0
			        should_attendance_time += item.get("should_attendance_time")?:0
			        overtime_hours += item.get("overtime_hours")?:0
			        leave_early_time += item.get("leave_early_time")?:0
			        working_hours += item.get("working_hours")?:0
			        should_attendance_hours += item.get("should_attendance_hours")?:0
			        actual_attendance_days += item.get("actual_attendance_days")?:0
			        should_attendance_days += item.get("should_attendance_days")?:0
			        def details = item.get("details")
			        if (details != null) {
			            details.each { it ->
			                if (it.get("checkin_result") == "ON_MISSING") {
			                    on_missing++
			                }
			                if (it.get("checkin_result") == "OFF_MISSING") {
			                    off_missing++
			                }
			                if (it.get("checkin_result") == "LATE") {
			                    late_times++
			                }
			                if (it.get("checkin_result") == "LEAVE_EARLY") {
			                    leave_early_times++
			                }
			            }
			        }
			        if (item.get("checkin_result") == "ABSENT") {
			            absent_days++
			            billable_time += item.get("should_attendance_hours")?:0
			        }
			    }
			    billable_time = should_attendance_time - billable_time
			}
			
			emp.set('attendance_data', map)
			emp.set('leave_early_minutes', leave_early_minutes)
			emp.set('late_time', late_time)
			emp.set('overtime_time', overtime_time)
			emp.set('billable_time', billable_time)
			emp.set('working_time', working_time)
			emp.set('late_minutes', late_minutes)
			emp.set('should_attendance_time', should_attendance_time)
			emp.set('overtime_hours', overtime_hours)
			emp.set('leave_early_time', leave_early_time)
			emp.set('working_hours', working_hours)
			emp.set('should_attendance_hours', should_attendance_hours)
			emp.set('actual_attendance_days', actual_attendance_days)
			emp.set('should_attendance_days', should_attendance_days)
			emp.set('on_missing', on_missing)
			emp.set('off_missing', off_missing)
			emp.set('late_times', late_times)
			emp.set('leave_early_times', leave_early_times)
			emp.set('absent_days', absent_days)
			
			
			//获取`申请`实体运行对象
			def applicant_id = emp.get("id");
			def attendance_checkin_application_runtime = sys.dataentity('attendance_checkin_application');
			def attendance_checkin_application_filter = attendance_checkin_application_runtime.filter();
			attendance_checkin_application_filter.all();
			if (n_checkin_date_gtandeq != null && n_checkin_date_ltandeq != null) {
			    attendance_checkin_application_filter.gte('start_time', n_checkin_date_gtandeq);
			    attendance_checkin_application_filter.lte('start_time', n_checkin_date_ltandeq);
			}
			attendance_checkin_application_filter.eq('applicant_id', applicant_id);
			attendance_checkin_application_filter.eq('status', "APPROVED");
			def attendance_checkin_application_list = attendance_checkin_application_filter.select('');
			
			// 请假时长
			def leave_duration = 0;
			// 补卡次数
			def reissue = 0;
			// 出差天数
			def business_trip = 0;
			// 外出时长
			def go_out_times = 0;
			// 年假
			def annual_leave = 0;
			// 事假
			def compassionate_leave = 0;
			// 调休假
			def vacation_leave = 0;
			// 病假
			def sick_leave = 0;
			// 育儿假
			def parental_leave = 0;
			// 陪产假
			def paternity_leave = 0;
			// 婚假
			def marriage_holiday = 0;
			// 丧假
			def funeral_leave = 0;
			// 产假
			def maternity_leave = 0;
			// 申请加班时长(计加班费)
			def pay_overtimes = 0
			// 申请加班时长(计调休假)
			def rest_overtimes = 0
			
			if(attendance_checkin_application_list != null){
			    //循环汇总
			    attendance_checkin_application_list.each { item ->
			        if (item.get("apply_type") == "REISSUE") {
			            reissue ++;
			        } else if (item.get("apply_type") == "GO_OUT") {
			            go_out_times += item.get("hours") ?: 0;
			        } else if (item.get("apply_type") == "BUSINESS_TRIP") {
			            business_trip += item.get("days") ?: 0;
			        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "annual_leave") {
			            annual_leave += item.get("hours") ?: 0;
			            leave_duration += item.get("hours") ?: 0;
			        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "compassionate_leave") {
			            compassionate_leave += item.get("hours") ?: 0;
			            leave_duration += item.get("hours") ?: 0;
			        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "vacation_leave") {
			            vacation_leave += item.get("hours") ?: 0;
			            leave_duration += item.get("hours") ?: 0;
			        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "sick_leave") {
			            sick_leave += item.get("hours") ?: 0;
			            leave_duration += item.get("hours") ?: 0;
			        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "parental_leave") {
			            parental_leave += item.get("hours") ?: 0;
			            leave_duration += item.get("hours") ?: 0;
			        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "paternity_leave") {
			            paternity_leave += item.get("hours") ?: 0;
			            leave_duration += item.get("hours") ?: 0;
			        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "marriage_holiday") {
			            marriage_holiday += item.get("hours") ?: 0;
			            leave_duration += item.get("hours") ?: 0;
			        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "funeral_leave") {
			            funeral_leave += item.get("hours") ?: 0;
			            leave_duration += item.get("hours") ?: 0;
			        } else if (item.get("apply_type") == "LEAVE" && item.get("leave_type") == "maternity_leave") {
			            maternity_leave += item.get("hours") ?: 0;
			            leave_duration += item.get("hours") ?: 0;
			        } else if (item.get("apply_type") == "OVERTIME" && item.get("overtime_type") == "0") {
			            pay_overtimes += item.get("hours") ?: 0;
			        } else if (item.get("apply_type") == "OVERTIME" && item.get("overtime_type") == "1") {
			            rest_overtimes += item.get("hours") ?: 0;
			        }
			    }
			}
			
			emp.set('leave_duration', leave_duration)
			emp.set('out_time', go_out_times)
			emp.set('make_card_times', reissue)
			emp.set('on_business_days', business_trip)
			emp.set('annual_leave', annual_leave)
			emp.set('compassionate_leave', compassionate_leave)
			emp.set('vacation_leave', vacation_leave)
			emp.set('sick_leave', sick_leave)
			emp.set('parental_leave', parental_leave)
			emp.set('paternity_leave', paternity_leave)
			emp.set('marriage_holiday', marriage_holiday)
			emp.set('funeral_leave', funeral_leave)
			emp.set('maternity_leave', maternity_leave)
			
			// 加班时长(计调休假)(小时)
			def rest_overtime_time = 0;
			// 加班时长(计加班费)(小时)
			def pay_overtime_time = 0;
			
			pay_overtime_time = pay_overtimes + overtime_hours
			rest_overtime_time = rest_overtimes + overtime_hours
			
			emp.set('rest_overtime_time', rest_overtime_time)
			emp.set('pay_overtime_time', pay_overtime_time)
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
    private void executeEND1(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

