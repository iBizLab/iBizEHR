package cn.ibizlab.hr.hremployee

import java.util.List
import org.springframework.data.domain.Page

import cn.ibizlab.hr.hremployee.dto.*

import net.ibizsys.central.util.annotation.DEDataSet
import net.ibizsys.central.util.annotation.DEAction
import cn.ibizlab.central.plugin.groovy.dataentity.*

/**
 * 实体[HR_EMPLOYEE]运行时对象
 * 此代码用户功能扩展代码
 *
 */
class HrEmployee extends GroovyDataEntityRuntime<HrEmployee,HrEmployeeDTO,HrEmployeeFilterDTO> {

    public static final String ACTION_COMPANY_STAFF_COUNTER = "company_staff_counter"
    public static final String ACTION_EMP_COUNTER = "emp_counter"
    public static final String ACTION_GENERATE_RANDOM_BARCODE = "generate_random_barcode"
    public static final String ACTION_ONCHANGE_USER = "onchange_user"
    public static final String DATASET_DEFAULT = "DEFAULT"
    public static final String DATASET_EMP_ORG_CHART = "emp_org_chart"
    public static final String DATASET_EMP_ORG_CHART2 = "emp_org_chart2"
    public static final String DATASET_ORG_CHART = "org_chart"
    public static final String DATASET_SIMPLE = "simple"
    public static final String DATASET_WITH_ACTIVITIES = "with_activities"
    private static HrEmployee _instance
    void setInstance(HrEmployee instance) {
        _instance = instance
    }
    static HrEmployee getInstance() {
        return _instance
    }

    /**
     * 行为：Create 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CREATE)
    HrEmployeeDTO create(HrEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_CREATE, dto, HrEmployeeDTO.class)
    }

    /**
     * 行为：Update 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_UPDATE)
    HrEmployeeDTO update(HrEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_UPDATE, dto, HrEmployeeDTO.class)
    }

    /**
     * 行为：Remove 实际功能
     * @param keys
     * @throws Throwable
     */
    @DEAction(ACTION_REMOVE)
    void remove(String key) throws Throwable {
        this.execute(ACTION_REMOVE, key, Void.class)
    }

    /**
     * 行为：Get 实际功能
     * @param key
     * @throws Throwable
     */
    @DEAction(ACTION_GET)
    HrEmployeeDTO get(String key) throws Throwable {
        return this.execute(ACTION_GET, key, HrEmployeeDTO.class)
    }

    /**
     * 行为：GetDraft 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GETDRAFT)
    HrEmployeeDTO getDraft(HrEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_GETDRAFT, dto, HrEmployeeDTO.class)
    }

    /**
     * 行为：CheckKey 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_CHECKKEY)
    int checkKey(HrEmployeeDTO dto) throws Throwable {
        return super.checkKeyState(dto)
    }

    /**
     * 行为：Save 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_SAVE)
    HrEmployeeDTO save(HrEmployeeDTO dto) throws Throwable {
        return this.execute(ACTION_SAVE, dto, HrEmployeeDTO.class)
    }

    /**
     * 行为：公司员工计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_COMPANY_STAFF_COUNTER)
    def companyStaffCounter(HrEmployeeDTO dto) throws Throwable {
        this.execute(ACTION_COMPANY_STAFF_COUNTER, dto, HrEmployeeDTO.class)
    }

    /**
     * 行为：员工计数器 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_EMP_COUNTER)
    def empCounter(HrEmployeeDTO dto) throws Throwable {
        /*
        def objRet = { sys,entity ->
            //Groovy
			def last = entity.callEntity()
			if(entity.getId() != null || entity.getId() != "undefined"){
				last.rawSelect(true);
			}
			// 1. 从当前实体对象获取work_contact_id值
			def workContactId = last.get("work_contact_id")
			
			if(workContactId){
				last.set("related_partners_count",1)
			}
			
			
			return last;
        }.call(this.getSystemRuntime(), dto)
        return objRet
         */
        return this.execute(ACTION_EMP_COUNTER, dto, HrEmployeeCounterDTO.class)
    }

    /**
     * 行为：生成徽标 ID 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_GENERATE_RANDOM_BARCODE)
    def generateRandomBarcode(HrEmployeeDTO dto) throws Throwable {
        this.execute(ACTION_GENERATE_RANDOM_BARCODE, dto, HrEmployeeDTO.class)
    }

    /**
     * 行为：用户变更 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEAction(ACTION_ONCHANGE_USER)
    def onchangeUser(HrEmployeeDTO dto) throws Throwable {
        this.execute(ACTION_ONCHANGE_USER, dto, HrEmployeeDTO.class)
    }

    /**
     * 数据集：DEFAULT 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_DEFAULT)
    Page<HrEmployeeDTO> fetchDefault(HrEmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_DEFAULT, context, HrEmployeeDTO.class)
    }

    /**
     * 数据集：员工组织图表 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EMP_ORG_CHART)
    Page<HrEmployeeDTO> fetchEmpOrgChart(HrEmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EMP_ORG_CHART, context, HrEmployeeDTO.class)
    }

    /**
     * 数据集：员工组织图表2 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_EMP_ORG_CHART2)
    Page<HrEmployeeDTO> fetchEmpOrgChart2(HrEmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_EMP_ORG_CHART2, context, HrEmployeeDTO.class)
    }

    /**
     * 数据集：组织图表 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_ORG_CHART)
    Page<HrEmployeeSimpleDTO> fetchOrgChart(HrEmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_ORG_CHART, context, HrEmployeeSimpleDTO.class)
    }

    /**
     * 数据集：简单查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_SIMPLE)
    Page<HrEmployeeSimpleDTO> fetchSimple(HrEmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_SIMPLE, context, HrEmployeeSimpleDTO.class)
    }

    /**
     * 数据集：带活动查询 实际功能
     * @param dto
     * @throws Throwable
     */
    @DEDataSet(DATASET_WITH_ACTIVITIES)
    Page<HrEmployeeDTO> fetchWithActivities(HrEmployeeFilterDTO context) throws Throwable {
        return this.fetch(DATASET_WITH_ACTIVITIES, context, HrEmployeeDTO.class)
    }

}