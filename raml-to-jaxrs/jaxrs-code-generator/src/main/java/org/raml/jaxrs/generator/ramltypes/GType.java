package org.raml.jaxrs.generator.ramltypes;

import com.squareup.javapoet.TypeName;
import org.raml.jaxrs.generator.CurrentBuild;
import org.raml.jaxrs.generator.GAbstraction;
import org.raml.jaxrs.generator.GObjectType;

import java.util.List;

/**
 * Created by Jean-Philippe Belanger on 12/10/16.
 * Just potential zeroes and ones
 */
public interface GType extends GAbstraction {

    String type();
    String name();
    TypeName defaultJavaTypeName(String pack);

    boolean isJson();
    boolean isXml();
    boolean isObject();
    boolean isArray();
    boolean isEnum();
    boolean isUnion();
    List<String> enumValues();
    String schema();
    GType arrayContents();

    void construct(CurrentBuild currentBuild, GObjectType objectType);

    void setJavaType(TypeName generatedJavaType);
}