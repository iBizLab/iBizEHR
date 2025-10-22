package cn.ibizlab.attendance.attendancerule.logic

import net.ibizsys.central.cloud.core.dataentity.logic.DELogicRuntime
import net.ibizsys.central.dataentity.logic.IDELogicSession
import net.ibizsys.model.dataentity.logic.IPSDELogicNode

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * 实体[ATTENDANCE_RULE]处理逻辑[填充默认班次]运行时对象
 * 此代码用户功能扩展代码
 *
 * null
 */
class FillShift extends DELogicRuntime {

    private static final Log log = LogFactory.getLog(FillShift.class)

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
            case "PREPAREPARAM_03":
                //执行逻辑节点[准备参数]
                executePrepareparam03(iDELogicSession, iPSDELogicNode)
                break
            case "DEDATASET_01":
                //执行逻辑节点[实体数据集]
                executeDedataset01(iDELogicSession, iPSDELogicNode)
                break
            case "BINDPARAM_01":
                //执行逻辑节点[绑定参数]
                executeBindparam01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_04":
                //执行逻辑节点[准备参数]
                executePrepareparam04(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_01":
                //执行逻辑节点[执行脚本代码]
                executeRawsfcode01(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_02":
                //执行逻辑节点[执行脚本代码]
                executeRawsfcode02(iDELogicSession, iPSDELogicNode)
                break
            case "RAWSFCODE_03":
                //执行逻辑节点[执行脚本代码]
                executeRawsfcode03(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM_01":
                //执行逻辑节点[准备参数]
                executePrepareparam01(iDELogicSession, iPSDELogicNode)
                break
            case "PREPAREPARAM4":
                //执行逻辑节点[准备参数]
                executePREPAREPARAM4(iDELogicSession, iPSDELogicNode)
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
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[实体数据集]，逻辑类型[DEDATASET]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeDedataset01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[绑定参数]，逻辑类型[BINDPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeBindparam01(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        super.onExecutePSDELogicNode(iDELogicSession, iPSDELogicNode, true)
    }

    /**
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePrepareparam04(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
            def _shifts = logic.param('shifts').getReal()
			
			// 生成白班和晚班配置
			def createShift = { name, startTime, endTime,order_value ->
			    return [
			        attendance_ratio: 1.0,
			        order_value: order_value,
			        working_number: 1,
			        schedule_type: "class_inversion",
			        scopes: [
			            [
			                early_for_absenteeism: 60,
			                early_for_early: 0,
			                latest_checkout: 480,
			                earliest_checkin: 60,
			                end_base_time: endTime,
			                late_for_absenteeism: 60,
			                late_for_late: 0,
			                shift_name: name,
			                start_base_time: startTime,
			                order_value:1,
			                next_tag: name=="晚班"?"0,1":null
			            ]
			        ],
			        default_flag: 0,
			        public_flag: 0,
			        name: name,
			        id:  java.util.UUID.randomUUID()
			    ]
			}
			
			def dayShift = createShift("白班", "09:00:00", "20:00:00",1)
			def nightShift = createShift("晚班", "20:00:00", "08:00:00",2) 
			
			_shifts << dayShift
			_shifts << nightShift
			
			def _default = logic.param('Default').getReal();
			_default.set("shifts",_shifts);
			
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
     * 执行逻辑节点[执行脚本代码]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode02(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _shift = logic.param('shift').getReal()
			
			logic.param('shift').getDataEntityRuntime().fillEntityKeyValue(_shift)
			
			def _scope = logic.param('scope').getReal()
			
			logic.param('scope').getDataEntityRuntime().fillEntityKeyValue(_scope)
			_scope.shift_id = _shift.id
			
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
     * 执行逻辑节点[执行脚本代码]，逻辑类型[RAWSFCODE]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executeRawsfcode03(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
        // 执行Groovy脚本代码
        def objRet = { sys,logic ->
            def _shifts = logic.param('shifts').getReal()
			
			def createShift = { name, startTime, endTime ->
			    return [
			        attendance_ratio: 1.0,
			        working_number: 1,
			        schedule_type: "manual",
			        order_value:1,
			        scopes: [
			            [
			                early_for_absenteeism: 60,
			                early_for_early: 0,
			                latest_checkout: 480,
			                earliest_checkin: 60,
			                end_base_time: endTime,
			                late_for_absenteeism: 60,
			                late_for_late: 0,
			                shift_name: name,
			                start_base_time: startTime,
			                order_value:1
			            ]
			        ],
			        default_flag: 0,
			        public_flag: 0,
			        name: name,
			        id:  java.util.UUID.randomUUID()
			    ]
			}
			
			def shift1 = createShift("班次1", "08:00:00", "17:00:00")
			
			_shifts << shift1
			
			def _default = logic.param('Default').getReal();
			_default.set("shifts",_shifts);
			_default.set("shift_num",1);
			
			
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
     * 执行逻辑节点[准备参数]，逻辑类型[PREPAREPARAM]
     * @param iDELogicSession
     * @param iPSDELogicNode
     * @throws Throwable
     */
    private void executePREPAREPARAM4(IDELogicSession iDELogicSession, IPSDELogicNode iPSDELogicNode) throws Throwable {
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
}

