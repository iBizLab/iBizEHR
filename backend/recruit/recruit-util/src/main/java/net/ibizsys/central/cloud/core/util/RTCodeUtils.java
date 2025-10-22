package net.ibizsys.central.cloud.core.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.CaseFormat;

import net.ibizsys.central.ISystemRuntime;
import net.ibizsys.central.ISystemRuntimeContext;
import net.ibizsys.model.IPSModelObjectRuntime;
import net.ibizsys.model.IPSSystem;
import net.ibizsys.model.IPSSystemService;
import net.ibizsys.model.PSModelEnums.SFPluginType;
import net.ibizsys.model.dataentity.IPSDataEntity;
import net.ibizsys.model.dataentity.IPSDataEntityObject;
import net.ibizsys.model.dataentity.ac.IPSDEACMode;
import net.ibizsys.model.dataentity.logic.IPSDELogic;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;
import net.ibizsys.model.res.IPSSysSFPlugin;
import net.ibizsys.model.res.PSSysSFPluginImpl;
import net.ibizsys.model.system.IPSSysModelGroup;
import net.ibizsys.model.system.IPSSystemModule;
import net.ibizsys.runtime.util.JsonUtils;

/**
 * Cloud调试器Utils
 * @author lionlau
 *
 */
public class RTCodeUtils implements IRTCodeUtils{
	
	private static Map<String, CaseFormat> CaseFormatMap = new HashMap<>();
	static {
		CaseFormatMap.put("LOWER_CAMEL", CaseFormat.LOWER_CAMEL);
		CaseFormatMap.put("LOWER_HYPHEN", CaseFormat.LOWER_HYPHEN);
		CaseFormatMap.put("LOWER_UNDERSCORE", CaseFormat.LOWER_UNDERSCORE);
		CaseFormatMap.put("UPPER_CAMEL", CaseFormat.UPPER_CAMEL);
		CaseFormatMap.put("UPPER_UNDERSCORE", CaseFormat.UPPER_UNDERSCORE);
	}


	private ISystemRuntimeContext iSystemRuntimeContext = null;
	private CaseFormat codeNameCaseFormat = null;

	public RTCodeUtils(ISystemRuntimeContext iSystemRuntimeContext) {
		Assert.notNull(iSystemRuntimeContext, "传入系统上下文对象无效");
		this.iSystemRuntimeContext = iSystemRuntimeContext;

		this.codeNameCaseFormat = CaseFormat.UPPER_CAMEL;// ( caseFormat == null ? CaseFormat.UPPER_CAMEL:caseFormat);
	}

	protected ISystemRuntimeContext getSystemRuntimeContext() {
		return this.iSystemRuntimeContext;
	}

	public CaseFormat getCodeNameCaseFormat() {
		return codeNameCaseFormat;
	}

	public static List<IPSSysSFPlugin> buildPSSysSFPlugins(IPSSystemService iPSSystemService, File folder) throws Exception{
		List<IPSSysSFPlugin> list = new ArrayList<IPSSysSFPlugin>();

		Map<String, File> fileMap = new HashMap<String, File>();
		fillGroovySourceFileMap("", folder, fileMap);

		for(java.util.Map.Entry<String, File> entry : fileMap.entrySet()) {

			ObjectNode objectNode = JsonUtils.createObjectNode();
			objectNode.put(PSSysSFPluginImpl.ATTR_GETID, entry.getKey());
			objectNode.put(PSSysSFPluginImpl.ATTR_GETNAME, entry.getValue().getName());
			objectNode.put(PSSysSFPluginImpl.ATTR_GETPLUGINTYPE, SFPluginType.USER.value);
			objectNode.put(PSSysSFPluginImpl.ATTR_ISRUNTIMEOBJECT, true);
			objectNode.put(PSSysSFPluginImpl.ATTR_GETRTOBJECTNAME, entry.getKey());
			objectNode.put(PSSysSFPluginImpl.ATTR_GETRTOBJECTSOURCE, 1);
			objectNode.put(PSSysSFPluginImpl.ATTR_ISTRYMODE, true);
			objectNode.put(PSSysSFPluginImpl.ATTR_GETTEMPLCODE, FileUtils.readFileToString(entry.getValue(), "UTF-8"));

			IPSSysSFPlugin iPSSysSFPlugin = iPSSystemService.createAndInitPSModelObject((IPSModelObjectRuntime)iPSSystemService.getPSSystem(), IPSSysSFPlugin.class, objectNode);
			list.add(iPSSysSFPlugin);
		}
		return list;
	}

	private static void fillGroovySourceFileMap(String strPackage, File folder, Map<String, File> fileMap) throws Exception{

		if(StringUtils.hasLength(strPackage)) {
			strPackage += ".";
		}

		File[] files = folder.listFiles();
		if(files == null) {
			return;
		}
		for(File file:files) {
			if(file.isDirectory()) {
				fillGroovySourceFileMap(strPackage + file.getName(), file, fileMap);
			}
			else {
				String[] items = file.getName().split("[.]");
				if(items.length == 2) {
					if("groovy".equals(items[1])) {
						fileMap.put(strPackage + items[0], file);
					}
				}
			}
		}
	}

	public ISystemRuntime getSystemRuntime() {
		return this.getSystemRuntimeContext().getSystemRuntime();
	}

	@Override
	public String getRTObjectName(IPSDataEntity iPSDataEntity) throws Exception{
		if(!StringUtils.hasLength(iPSDataEntity.getCodeName())) {
			throw new Exception("实体代码标识无效");
		}
		if(!StringUtils.hasLength(iPSDataEntity.getPSSystemModuleMust().getCodeName())) {
			throw new Exception("系统模块代码标识无效");
		}

		String strPKGCodeName = getPKGCodeName(iPSDataEntity.getPSSystemModuleMust());
		return String.format("%1$s.%2$s.%3$s.%4$s", strPKGCodeName, this.getUpperCamelCodeName(iPSDataEntity.getPSSystemModuleMust().getCodeName()).toLowerCase(), this.getUpperCamelCodeName(iPSDataEntity.getCodeName()).toLowerCase(), this.getUpperCamelCodeName(iPSDataEntity.getCodeName()));
	}

	@Override
	public String getDEServiceObjectName(IPSDataEntity iPSDataEntity) throws Exception {
		if(!StringUtils.hasLength(iPSDataEntity.getCodeName())) {
			throw new Exception("实体代码标识无效");
		}
		if(!StringUtils.hasLength(iPSDataEntity.getPSSystemModuleMust().getCodeName())) {
			throw new Exception("系统模块代码标识无效");
		}

		String strPKGCodeName = getPKGCodeName(iPSDataEntity.getPSSystemModuleMust());
		return String.format("%1$s.%2$s.service.I%3$sService", strPKGCodeName, this.getUpperCamelCodeName(iPSDataEntity.getPSSystemModuleMust().getCodeName()).toLowerCase(), this.getUpperCamelCodeName(iPSDataEntity.getCodeName()));
	}

	@Override
	public String getDEAccessManagerObjectName(IPSDataEntity iPSDataEntity) throws Exception {
		return "cn.ibizlab.central.plugin.groovy.dataentity.security.GroovyAccessManager";
	}


	@Override
	public String getRTObjectName(IPSDELogic iPSDELogic) throws Exception{
		if(!StringUtils.hasLength(iPSDELogic.getCodeName())) {
			throw new Exception("实体逻辑模型标识无效");
		}

		IPSDataEntity iPSDataEntity = iPSDELogic.getParentPSModelObject(IPSDataEntity.class);
		String strPKGCodeName = getPKGCodeName(iPSDataEntity.getPSSystemModuleMust());
		return String.format("%1$s.%2$s.%3$s.logic.%4$s", strPKGCodeName, this.getUpperCamelCodeName(iPSDataEntity.getPSSystemModuleMust().getCodeName()).toLowerCase(), this.getUpperCamelCodeName(iPSDataEntity.getCodeName()).toLowerCase(), this.getUpperCamelCodeName(iPSDELogic.getCodeName()));
	}


	@Override
	public String getRTObjectName(IPSDEMethodDTO iPSDEMethodDTO) throws Exception {
		String strDTOName = iPSDEMethodDTO.getCodeName();
		if(!StringUtils.hasLength(strDTOName)) {
			strDTOName = iPSDEMethodDTO.getName();
		}
		if(!StringUtils.hasLength(strDTOName)) {
			throw new Exception("实体方法DTO模型标识无效");
		}

		IPSDataEntity iPSDataEntity = iPSDEMethodDTO.getParentPSModelObject(IPSDataEntity.class);
		String strPKGCodeName = getPKGCodeName(iPSDataEntity.getPSSystemModuleMust());
		return String.format("%1$s.%2$s.%3$s.dto.%4$s", strPKGCodeName, this.getUpperCamelCodeName(iPSDataEntity.getPSSystemModuleMust().getCodeName()).toLowerCase(), this.getUpperCamelCodeName(iPSDataEntity.getCodeName()).toLowerCase(), this.getUpperCamelCodeName(strDTOName));
	}

	@Override
	public String getRTObjectName(IPSDEACMode iPSDEACMode) throws Exception{
		if(!StringUtils.hasLength(iPSDEACMode.getCodeName())) {
			throw new Exception("实体自填模型标识无效");
		}

		String strPKGCodeName = getPKGCodeName(iPSDEACMode, "ac");
		return String.format("%1$s.%2$sDELogicRuntime", strPKGCodeName, this.getUpperCamelCodeName(iPSDEACMode.getCodeName()));
	}


	@Override
	public String getPKGCodeName(IPSDataEntityObject iPSDataEntityObject, String strPackageName) throws Exception{
		IPSDataEntity iPSDataEntity = iPSDataEntityObject.getParentPSModelObject(IPSDataEntity.class);
		if(!StringUtils.hasLength(iPSDataEntity.getCodeName())) {
			throw new Exception("实体代码标识无效");
		}
		if(!StringUtils.hasLength(iPSDataEntity.getPSSystemModuleMust().getCodeName())) {
			throw new Exception("系统模块代码标识无效");
		}

		String strPKGCodeName = getPKGCodeName(iPSDataEntity.getPSSystemModuleMust());
		return String.format("%1$s.%2$s.%3$s.%4$s", strPKGCodeName, this.getUpperCamelCodeName(iPSDataEntity.getPSSystemModuleMust().getCodeName()), strPackageName, this.getUpperCamelCodeName(iPSDataEntity.getCodeName())).toLowerCase();
	}


	public String getPKGCodeName(IPSSystem iPSSystem) throws Exception{
		if(iPSSystem.getDefaultPSSysSFPub()==null) {
			throw new Exception("系统未定义默认发布对象");
		}

		if(!StringUtils.hasLength(iPSSystem.getDefaultPSSysSFPub().getPKGCodeName())) {
			if(!StringUtils.hasLength(iPSSystem.getDefaultPSSysSFPub().getCodeName())) {
				throw new Exception("默认发布对象未定义代码标识");
			}

			return this.getUpperCamelCodeName(iPSSystem.getDefaultPSSysSFPub().getCodeName()).toLowerCase();
		}
		else {
			return String.format("%1$s", iPSSystem.getDefaultPSSysSFPub().getPKGCodeName()).toLowerCase();
		}
	}

	public String getPKGCodeName(IPSSystemModule iPSSystemModule) throws Exception{
		if(StringUtils.hasLength(iPSSystemModule.getPKGCodeName())) {
			return iPSSystemModule.getPKGCodeName();
		}

		IPSSysModelGroup iPSSysModelGroup = iPSSystemModule.getPSSysModelGroup();
		if(iPSSysModelGroup != null) {
			if(StringUtils.hasLength(iPSSysModelGroup.getPKGCodeName())) {
				return String.format("%1$s.%2$s", iPSSysModelGroup.getPKGCodeName(), this.getUpperCamelCodeName(iPSSysModelGroup.getCodeName()).toLowerCase());
			}
		}

		return getPKGCodeName(iPSSystemModule.getParentPSModelObject(IPSSystem.class));
	}


	@Override
	public String getUpperCamelCodeName(String strCodeName) throws Exception {
		if(StringUtils.hasLength(strCodeName)) {
			//判断是否有下划线
			if (strCodeName.indexOf("_") != -1) {
				strCodeName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, strCodeName.toLowerCase());
			} else {
				strCodeName = StringUtils.capitalize(strCodeName);
			}
			if (StringUtils.hasLength(strCodeName)) {
				if (strCodeName.endsWith("filterDto")) {
					strCodeName = strCodeName.substring(0, strCodeName.length() - 9) + "FilterDTO";
				}
				if (strCodeName.endsWith("filterdto")) {
					strCodeName = strCodeName.substring(0, strCodeName.length() - 9) + "FilterDTO";
				}
				if (strCodeName.endsWith("Dto")) {
					strCodeName = strCodeName.substring(0, strCodeName.length() - 3) + "DTO";
				}
				if (strCodeName.endsWith("dto")) {
					strCodeName = strCodeName.substring(0, strCodeName.length() - 3) + "DTO";
				}
			}
		}
		return strCodeName;
	}

	
}
