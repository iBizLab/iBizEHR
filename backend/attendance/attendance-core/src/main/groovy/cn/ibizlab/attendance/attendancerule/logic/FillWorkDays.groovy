package cn.ibizlab.attendance.attendancerule.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENDANCE_RULE]处理逻辑[填充工作日]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class FillWorkDays extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(FillWorkDays.class)

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
                //执行逻辑节点[固定排班/灵活打卡填充工作日]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_05":
                //执行逻辑节点[计算week、workday]
                executeRawsfcode05(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_01":
                //执行逻辑节点[准备参数]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[大小周填充工作日]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "DEBUGPARAM_01":
                //执行逻辑节点[调试逻辑参数]
                executeDebugparam01(iDELogicSession, iPSDELogicNode)
                break
            case "END_01":
                //执行逻辑节点[结束]
                executeEnd01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_03":
                //执行逻辑节点[上A休B填充工作日]
                executeRawsfcode03(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_04":
                //执行逻辑节点[N班倒填充工作日]
                executeRawsfcode04(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[固定排班/灵活打卡填充工作日]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal();
			def shifts = logic.param('shifts').getReal();
			def defaultShift = shifts.find { it.default_flag == 1 }
			if(defaultShift){
			    def workdays = _default.get("workdays") ? _default.get("workdays") : [];
			    def selection = _default.get("workday") ?_default.get("workday"):""
			
			  // 获取已存在的 workday
			    def existingDays = workdays.collect { it.name as Integer }
			
			    def fillWorkdays = []
			    (1..7).each { i ->  
			        if (!existingDays.contains(i)) {
			            def workday = [
			                name  : i.toString(),
			                day_number : i,
			                shift_id : selection.contains(i.toString())?defaultShift.id:null
			        ]
			            fillWorkdays << workday
			        }
			    }
			
			    // 合并后排序
			    def combinedWorkdays = (workdays + fillWorkdays).sort { 
			        it.day_number
			    }    
			    
			    // // 为每个工作日填充工作时间
			    // combinedWorkdays = combinedWorkdays.collect { workday ->
			    //     def worktimeParts = []
			 
			    //     if (workday.shift_id != null && defaultShift?.scopes) {
			    //         // 创建时间格式化工具 (HH:mm 格式)
			    //         def timeFormat = new java.text.SimpleDateFormat("HH:mm")
			    //         defaultShift.scopes.each { scope ->
			    //             // 安全处理时间戳
			    //             def start = scope.start_base_time ? timeFormat.format(scope.start_base_time) : ""
			    //             def end = scope.end_base_time ? timeFormat.format(scope.end_base_time) : ""
			    //             if (start && end) worktimeParts << "${start}-${end}"
			    //         }
			    //     }
			 
			    //     // 构建工作时间字符串
			    //     workday.work_time = worktimeParts.isEmpty() ? "休息日" : worktimeParts.join('/')
			    //     return workday
			    // }
			    
			    _default.set("workdays", combinedWorkdays)
			}
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
     * 执行逻辑节点[计算week、workday]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode05(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal()
			def workday = _default.get("workday")?: ""
			def schedule_type = _default.get("schedule_type")
			def workdays = _default.get("workdays")
			
			//固定排班、灵活打卡>workday
			if (workday == "" && 
			    workdays != null&&
			    ( schedule_type == "fixed" || schedule_type == "flexible")) 
			{
			        workday = workdays
			                .findAll { it.shift_id != null } 
			                .sort { a, b -> a.day_number <=> b.day_number }
			                .collect { it.day_number } 
			                .join(',')
			
			        _default.set("workday",workday)    
			}
			
			//计算工作日week1
			def week1 = _default.get("week1")?: ""
			if (week1 == ""&& workdays != null) {
			    if(schedule_type == "alternate_week" ){
			        week1 = workdays
			                .findAll { it.shift_id != null && it.day_number < 8} 
			                .sort { a, b -> a.day_number <=> b.day_number }
			                .collect { it.day_number } 
			                .join(',')
			    }
			    if(schedule_type == "class_inversion") {
			         week1 = workdays
			                .findAll { it.id != null && it.day_number < 8} 
			                .sort { a, b -> a.day_number <=> b.day_number }
			                .collect { it.day_number } 
			                .join(',')
			    }
			    _default.set("week1",week1)    
			}
			//计算工作日week2
			def week2 = _default.get("week2")?: ""
			if (week2 == ""&& workdays != null) {
			    if(schedule_type == "alternate_week" ){
			        week2 = workdays
			                .findAll { it.shift_id != null && 7<it.day_number && it.day_number < 15} 
			                .sort { a, b -> a.day_number <=> b.day_number }
			                .collect { it.day_number } 
			                .join(',')
			    }
			    if(schedule_type == "class_inversion") {
			         week2 = workdays
			                .findAll { it.id != null && 7<it.day_number && it.day_number < 15} 
			                .sort { a, b -> a.day_number <=> b.day_number }
			                .collect { it.day_number } 
			                .join(',')
			    }
			    _default.set("week2",week2)    
			
			}
			
			//计算工作日week3
			def week3 = _default.get("week3")?: ""
			if (week3 == "" && schedule_type == "class_inversion" && workdays != null) {
			    week3 = workdays
			        .findAll { it.id != null && 14<it.day_number && it.day_number < 22} 
			        .sort { a, b -> a.day_number <=> b.day_number }
			        .collect { it.day_number } 
			        .join(',')
			    _default.set("week3",week3) 
			}
			//计算工作日week4
			def week4 = _default.get("week4")?: ""
			if (week4 == "" && schedule_type == "class_inversion"&& workdays != null) {
			    week4 = workdays
			        .findAll { it.id != null && 21<it.day_number && it.day_number < 29} 
			        .sort { a, b -> a.day_number <=> b.day_number }
			        .collect { it.day_number } 
			        .join(',')
			    _default.set("week4",week4) 
			
			}
			
			
			
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
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[大小周填充工作日]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal();
			def shifts = logic.param('shifts').getReal();
			def defaultShift = shifts.find { it.default_flag == 1 }
			if(defaultShift){
			    def workdays = _default.get("workdays") ? _default.get("workdays") : [];
			    def big_week = _default.get("week1") ?_default.get("week1"):"";
			    def small_week = _default.get("week2") ?_default.get("week2"):"";
			    def selection = big_week+","+small_week
			
			  // 获取已存在的 workday
			    def existingDays = workdays.collect { it.day_number }
			
			    def fillWorkdays = []
			    (1..14).each { i ->  
			        if (!existingDays.contains(i)) {
			            def workday = [
			                name  : i.toString(),
			                day_number : i,
			                shift_id : selection.contains(i.toString())?defaultShift.id:null
			        ]
			            fillWorkdays << workday
			        }
			    }
			
			    // 合并后排序
			    def combinedWorkdays = (workdays + fillWorkdays).sort { 
			        it.day_number 
			    }    
			    _default.set("workdays", combinedWorkdays)
			}
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
     * 执行逻辑节点[调试逻辑参数]，逻辑类型[DEBUGPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDebugparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
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

    /**
     * 执行逻辑节点[上A休B填充工作日]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal();
			def shifts = logic.param('shifts').getReal();
			def defaultShift = shifts.find { it.default_flag == 1 }
			if(defaultShift){
			    def work = _default.get("work") ?_default.get("work"):5;
			    def rest = _default.get("rest") ?_default.get("rest"):2;
			    def num = work+rest;
			
			    def fillWorkdays = [];
			    (1..num).each { i ->  
			        def workday = [
			            name  : "第"+i+"天",
			            day_number : i,
			            title : "工作/休息"
			        ]
			        fillWorkdays << workday
			    }
			
			    _default.set("workdays", fillWorkdays)
			}
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
     * 执行逻辑节点[N班倒填充工作日]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _default = logic.param('Default').getReal();
			def shifts = logic.param('shifts').getReal();
			def same_restday = _default.same_restday;
			if(shifts){
			    def title = shifts.collect { it.name }.join('/')
			    def fillWorkdays = []
			    //休息日相同
			    if(same_restday ==1){
			        def workdays = _default.get("workdays") ?: []
			        def week1 = _default.get("week1") ?: ""
			        def week2 = _default.get("week2") ?: ""
			        def week3 = _default.get("week3") ?: ""
			        def week4 = _default.get("week4") ?: ""
			        def selection = [week1, week2, week3, week4].join(',').split(',')  
			
			        // 获取已存在的 workday
			        def existingDays = workdays.collect { it.day_number }
			
			        (1..28).each { i ->
			            if (!existingDays.contains(i)) {
			                def workday = [
			                    name: i.toString(),
			                    day_number: i,
			                    title: selection.contains(i.toString()) ? title : "休息"  
			                ]
			                fillWorkdays << workday
			            }else{
			                // 为已存在的workday填充title
			                def existingWorkday = workdays.find { it.day_number == i }
			                if (existingWorkday) {
			                    existingWorkday.title = title
			                }
			        }
			
			        // 合并后排序
			        def combinedWorkdays = (workdays + fillWorkdays).sort { 
			            it.day_number 
			        }    
			        _default.set("workdays", combinedWorkdays)
			    }
			    }
			    //休息日不同
			    if(same_restday ==0 ){
			        title = title+"/休息"  
			        if( _default.get("workdays") == null){
			            def inversion_days = _default.inversion_days
			            if(inversion_days){
			                (1..inversion_days).each { i ->
			                    def workday = [
			                        name  : "第"+i+"天",
			                        day_number: i,
			                        title: title,
			                        rule_id : _default.id
			                    ]
			                    fillWorkdays << workday
			                }
			                _default.set("workdays", fillWorkdays)
			        }
			        }else{
			            _default.get("workdays").each{ w ->
			                w.title =title
			            }           
			        }
			    }
			}
        }.call(iDELogicSession.getDELogicRuntime().getSystemRuntime(), iDELogicSession.getDELogicRuntime())
        //设置返回值
        iDELogicSession.setLastReturn(objRet);
        if(iPSDELogicNode.getRetPSDELogicParam() != null) {
            def retDELogicParamRuntime = this.getDELogicParamRuntime(iPSDELogicNode.getRetPSDELogicParam().getCodeName(), false);
            retDELogicParamRuntime.bind(iDELogicSession, objRet);
        }
        //super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }
}

