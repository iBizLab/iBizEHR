package cn.ibizlab.checkin.runtime.plugin

import net.ibizsys.central.cloud.core.dataentity.IDataEntityRuntime
import net.ibizsys.central.database.ISysDBSchemeRuntime
import net.ibizsys.central.dataentity.action.DEActionRuntimeBase
import net.ibizsys.central.util.IEntityDTO
import net.ibizsys.central.util.ISearchContextDTO
import net.ibizsys.model.dataentity.ds.IPSDEDataSet
import net.ibizsys.runtime.util.JsonUtils
import org.springframework.util.ObjectUtils

class JudgingDEActionRuntime extends DEActionRuntimeBase {


    @Override
    protected Object onExecute(IEntityDTO iEntityDTO) throws Throwable {
        IEntityDTO ret = this.getDataEntityRuntime().createEntity();
        // 初始化运行时对象
        ISysDBSchemeRuntime dbSchema = this.getDataEntityRuntime().getSysDBSchemeRuntimeMust()
        IDataEntityRuntime shiftMemberRuntime = systemRuntime.getDataEntityRuntime("attendance_group_shift_member")

        def cur_members = JsonUtils.asList(iEntityDTO.get("cur_members"))
        def other_members = JsonUtils.asList(iEntityDTO.get("other_members"))
        def summaryResult = new ArrayList()
        def groupByResult = new ArrayList()
        if (!ObjectUtils.isEmpty(cur_members)) {
            //校验所选人/部门是否在其他生效规则中
            for (cur_member in cur_members) {

                def _param = []
                _param.add(iEntityDTO.get("attendance_rule") ?: "")
                _param.add(cur_member.get("id"))

                def sql = "select g.name, g.rule_id, r.name as rule_name from attendance_group_shift_member g left join attendance_rule r on rule_id = r.ID where rule_id != ? and user_id = ? and exists ( select 1 from attendance_activate_rule rule where rule.id = g.rule_id)";
                List<Map<String, Object>> memberResult = dbSchema.executeSelectSQL(sql, _param) as List<Map<String, Object>>;
                if (!ObjectUtils.isEmpty(memberResult)) {
                    summaryResult.addAll(memberResult)
                }
            }
            if (!ObjectUtils.isEmpty(summaryResult)) {
                def grouped = summaryResult.groupBy { it.RULE_ID }
                grouped.each { ruleId, items ->
                    IEntityDTO temp = shiftMemberRuntime.createEntity();
                    def names = items.collect { it.get("NAME") }.findAll { it != null }
                    temp.set("name", names.join('、'))
                    temp.set("rule_id", ruleId)
                    temp.set("rule_name", items[0].get("RULE_NAME"))
                    groupByResult.add(temp)
                }
                def namesWithRules = groupByResult.collect { item ->
                    "${item.name}已在考勤规则${item.get("rule_name")}内"
                }
                // 拼接最终消息
                def msg = "${namesWithRules.join('、')},是否将其移入当前考勤规则？"
                ret.set("msg", msg.toString())
                ret.set("isAdd", true)
                return ret;
            }

            if (!ObjectUtils.isEmpty(other_members)) {
                //新增组间冲突校验逻辑
                def groups = JsonUtils.asList(iEntityDTO.get("groups"))
                def deptRuntime = getSystemRuntime().getDataEntityRuntime("department")
                ISearchContextDTO searchContextDTO = deptRuntime.createSearchContext();
                searchContextDTO.count(false).limit(10000)
                //获取所有部门
                IPSDEDataSet iPSDEDataSet = deptRuntime.getPSDEDataSet("dept");
                List<IEntityDTO> deptList = deptRuntime.selectDataSet(iPSDEDataSet, searchContextDTO);
                // 创建快速查找集合
                def otherIds = other_members.collect { it.get("user_id") } as Set
                def conflictGroups = new HashSet()
                cur_members.each { cur_member ->
                    def parentId = cur_member.get("parent_id")
                    // 1、确保所选的人/部门不在其他组部门下
                    if (parentId) {
                        def currentId = parentId
                        boolean conflictFound = false
                        // 逐级向上查找，找到第一个冲突即停止
                        while (currentId && !conflictFound) {
                            // 获取部门信息
                            def dept = deptList.find { it.id == currentId }
                            if (dept && otherIds.contains(dept.id)) {
                                // 记录冲突组
                                def member = other_members.find { it.user_id == dept.id }
                                def group = groups.find { it.id == member.get("group_id") }
                                conflictGroups.add(group?.get("order_num"))
                                conflictFound = true
                            } else {
                                // 继续向上查找
                                currentId = dept?.get("parent_id")
                            }

                        }
                    }
                    // 2、确保所选的部门下没有其他组人员/部门
                    if (cur_member.get("type") == "dept") {
                        def rootDeptId = cur_member.get("id")

                        // 递归获取所有子部门ID（含自身）
                        List<String> allSubDeptIds = [rootDeptId]
                        def subDeptIds = getSubDeptIds(rootDeptId, deptList)
                        allSubDeptIds.addAll(subDeptIds)

                        // 检查其他组成员是否在这些部门中
                        other_members.each { member ->
                            def userId = member.get("parent_id")
                            if (allSubDeptIds.contains(userId)) {
                                def group = groups.find { it.id == member.get("group_id") }
                                conflictGroups.add(group?.get("order_num"))
                            }
                        }
                    }

                }

                // 生成提示信息
                if (!conflictGroups.isEmpty()) {
                    def msg = "与第${conflictGroups.join('、')}组考勤人员有重合，请修改考勤人员？"
                    ret.set("msg", msg)
                    ret.set("isAdd", false)
                    return ret;
                }

            }
        }
        return ret;

    }

    // 辅助方法：递归获取子部门ID
    private List<String> getSubDeptIds(String deptId, List<IEntityDTO> deptList) {
        List<String> subDepts = []
        deptList.each { dept ->
            if (dept.get("parent_id") == deptId) {
                subDepts.add(dept.id)
                subDepts.addAll(getSubDeptIds(dept.id, deptList))
            }
        }
        return subDepts
    }


}