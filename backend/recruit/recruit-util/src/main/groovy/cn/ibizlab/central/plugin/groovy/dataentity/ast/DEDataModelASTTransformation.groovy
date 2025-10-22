package cn.ibizlab.central.plugin.groovy.dataentity.ast

import cn.ibizlab.central.plugin.groovy.annotation.DEDataModel
import com.fasterxml.jackson.annotation.JsonProperty
import groovy.transform.CompileStatic
import org.codehaus.groovy.ast.*
import org.codehaus.groovy.ast.expr.*
import org.codehaus.groovy.ast.stmt.BlockStatement
import org.codehaus.groovy.ast.stmt.ExpressionStatement
import org.codehaus.groovy.ast.stmt.ReturnStatement
import org.codehaus.groovy.control.CompilePhase
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.AbstractASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformation

import java.lang.reflect.Modifier

@CompileStatic
@GroovyASTTransformation(phase = CompilePhase.CANONICALIZATION)
public class DEDataModelASTTransformation extends AbstractASTTransformation {

    void visit(ASTNode[] nodes, SourceUnit source) {
        if (!nodes || nodes.length < 2 || !(nodes[1] instanceof ClassNode)) return

        ClassNode classNode = (ClassNode) nodes[1]

        AnnotationNode ann = classNode.getAnnotations().find {
            it.classNode.name == DEDataModel.name
        }
        if(!ann)
            return
        println "✅ ChianEntity AST triggered for class: ${classNode.name}"
        classNode.fields.findAll { !it.isStatic() && !it.isFinal() }.each { FieldNode field ->
            AnnotationNode fieldano = field.getAnnotations().find {
                it.classNode.name == JsonProperty.name
            }

            if (fieldano) {
                String jsonKey = extractJsonKey(fieldano, field)
                generateAccessors(classNode, field, jsonKey) // 传入declaringClass
            }
        }


    }


    private String extractJsonKey(AnnotationNode ann, FieldNode field) {
        ann.members.value?.text ?: field.name.toLowerCase()
    }



    // 在 generateAccessors 方法中添加覆盖逻辑
    private void generateAccessors(ClassNode classNode, FieldNode field, String jsonKey) {
        // 删除已存在的默认方法
        removeExistingMethod(classNode, "get${field.name.capitalize()}")
        // 生成新的访问方法
        generateGetter( field, jsonKey)

        String setterName = "set${field.name.capitalize()}"
        List<MethodNode> setters = classNode.getMethods(setterName)

        MethodNode fluentSetter = setters.find {
            it.parameters.size() == 1 &&
                    it.parameters[0].type == field.type &&
                    it.returnType == classNode
        }

        if (fluentSetter) {
            // 已存在链式版本，增强逻辑
            enhanceManualSetter(classNode, field, jsonKey)
        } else {
            MethodNode voidSetter = setters.find {
                it.parameters.size() == 1 &&
                        it.parameters[0].type == field.type &&
                        it.returnType.name == "void"
            }

            if (voidSetter) {
                // 存在非链式版本，先移除再添加
                classNode.methods.remove(voidSetter)
            }

            // 添加我们自己的链式版本
            generateFluentSetter(classNode, field, jsonKey)
        }


        AnnotationNode jsonPropertyAnno = field.annotations.find {
            it.classNode.name == JsonProperty.name
        }

        if (jsonPropertyAnno) {
            // 2. 检查是否已存在access参数
            if (!jsonPropertyAnno.getMember("access")) {
                // 3. 添加access参数
                ClassNode accessType = ClassHelper.make(JsonProperty.Access)
                jsonPropertyAnno.addMember("access", new PropertyExpression(
                        new ClassExpression(accessType),
                        "WRITE_ONLY"
                ))
            }
        }
    }

    private void removeExistingMethod(ClassNode classNode, String methodName) {
        classNode.methods.removeAll { MethodNode mn ->
            mn.name == methodName
        }
    }

    private void generateGetter(FieldNode field, String jsonKey) {
        field.declaringClass.addMethod(
                new MethodNode(
                        "get${field.name.capitalize()}",
                        Modifier.PUBLIC,
                        field.type,
                        [] as Parameter[],
                        [] as ClassNode[],
                        new ReturnStatement(
                                new MethodCallExpression(
                                        new VariableExpression("this"),
                                        "_get",
                                        new ArgumentListExpression(new ConstantExpression(jsonKey))
                                )
                        )
                )
        )
    }

    private void generateFluentSetter(ClassNode classNode, FieldNode field, String jsonKey) {
        Parameter param = new Parameter(field.type, "value")
        def returnType = ClassHelper.makeWithoutCaching(classNode.name)
        MethodNode method = new MethodNode(
                "set${field.name.capitalize()}",
                Modifier.PUBLIC,
                returnType,  // 关键修改：返回类型设为当前类
                [param] as Parameter[],
                [] as ClassNode[],
                new BlockStatement(
                        [
                                new ExpressionStatement(
                                        new MethodCallExpression(
                                                new VariableExpression("this"),
                                                "_set",
                                                new ArgumentListExpression(
                                                        new ConstantExpression(jsonKey),
                                                        new VariableExpression("value")
                                                )
                                        )
                                ),
                                new ReturnStatement(new VariableExpression("this"))
                        ],
                        new VariableScope()
                )
        )
        field.declaringClass.addMethod(method)
    }

    private void enhanceManualSetter(ClassNode classNode, FieldNode field, String jsonKey) {
        String methodName = "set${field.name.capitalize()}"

        MethodNode setter = classNode.methods.find {
            it.name == methodName && it.parameters.size() == 1 &&
                    it.parameters[0].type == field.type
        }

        if (setter) {
            BlockStatement block = setter.code as BlockStatement
            if (block) {
                // 构建 this.put("jsonKey", val)
                def putStatement = new ExpressionStatement(
                        new MethodCallExpression(
                                new VariableExpression("this"),
                                "_set",
                                new ArgumentListExpression(
                                        new ConstantExpression(jsonKey),
                                        new VariableExpression(setter.parameters[0].name)
                                )
                        )
                )

                // 💡 插入 this.put(...) 到方法体最前或最后
                block.statements.add(0, putStatement)
            }
        }
    }
}