package mybatis.generator.plugins;

import org.mybatis.generator.api.*;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.TableConfiguration;

import java.util.List;

/**
 * <p>
 * ━━━━━━神兽出没━━━━━━
 * 　　┏┓　　　┏┓+ +
 * 　┏┛┻━━━┛┻┓ + +
 * 　┃　　　　　　　┃
 * 　┃　　　━　　　┃ ++ + + +
 * ████━████ ┃+
 * 　┃　　　　　　　┃ +
 * 　┃　　　┻　　　┃
 * 　┃　　　　　　　┃
 * 　┗━┓　　　┏━┛
 * 　　　┃　　　┃                  神兽保佑, 永无BUG!
 * 　　　┃　　　┃
 * 　　　┃　　　┃     Code is far away from bug with the animal protecting
 * 　　　┃　 　　┗━━━┓
 * 　　　┃ 　　　　　　　┣┓
 * 　　　┃ 　　　　　　　┏┛
 * 　　　┗┓┓┏━┳┓┏┛
 * 　　　　┃┫┫　┃┫┫
 * 　　　　┗┻┛　┗┻┛
 * ━━━━━━感觉萌萌哒━━━━━━
 * <p>
 * <p>
 * 思维方式*热情*能力
 */

public class GeneratorSwagger2Doc extends PluginAdapter {
    public boolean validate(List<String> list) {
        return true;
    }

    @Override
    public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        String classAnnotation = "@ApiModel";
        if(!topLevelClass.getAnnotations().contains(classAnnotation)) {
            topLevelClass.addAnnotation(classAnnotation);
        }

        String apiModelAnnotationPackage =  properties.getProperty("apiModelAnnotationPackage");
        String apiModelPropertyAnnotationPackage = properties.getProperty("apiModelPropertyAnnotationPackage");
        if(null == apiModelAnnotationPackage) apiModelAnnotationPackage = "io.swagger.annotations.ApiModel";
        if(null == apiModelPropertyAnnotationPackage) apiModelPropertyAnnotationPackage = "io.swagger.annotations.ApiModelProperty";
        String  JsonProperty = "com.fasterxml.jackson.annotation.JsonProperty";

        topLevelClass.addImportedType(apiModelAnnotationPackage);
        topLevelClass.addImportedType(apiModelPropertyAnnotationPackage);
        topLevelClass.addImportedType(JsonProperty);

        field.addAnnotation("@ApiModelProperty(value=\"" + introspectedColumn.getJavaProperty() + introspectedColumn.getRemarks() + "\")");
        field.addAnnotation("@JsonProperty(\""+introspectedColumn.getActualColumnName()+"\")");
        return super.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
    }
    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
     @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientCountByExampleMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientCountByExampleMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientDeleteByExampleMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientDeleteByExampleMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientUpdateByExampleSelectiveMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientUpdateByExampleSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientUpdateByExampleWithBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientUpdateByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(Method method, Interface interfaze, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean sqlMapCountByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean sqlMapDeleteByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean sqlMapExampleWhereClauseElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean sqlMapUpdateByExampleSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean sqlMapUpdateByExampleWithBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean sqlMapUpdateByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean providerCountByExampleMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean providerDeleteByExampleMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean providerSelectByExampleWithBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean providerSelectByExampleWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
    @Override
    public boolean providerUpdateByExampleSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }
}
