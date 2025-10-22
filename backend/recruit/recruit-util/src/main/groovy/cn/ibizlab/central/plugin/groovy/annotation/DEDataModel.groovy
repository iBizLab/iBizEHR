package cn.ibizlab.central.plugin.groovy.annotation

import cn.ibizlab.central.plugin.groovy.dataentity.ast.DEDataModelASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformationClass

import java.lang.annotation.*

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.TYPE])
@GroovyASTTransformationClass(classes = [DEDataModelASTTransformation])
@interface DEDataModel {

}