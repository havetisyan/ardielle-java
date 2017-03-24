//
// This file generated by rdl 1.4.11. Do not modify!
//

package com.yahoo.rdl;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// TypeDef - TypeDef is the basic type definition.
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class TypeDef {
    public String type;
    public String name;
    @RdlOptional
    public String comment;
    @RdlOptional
    public Map<String, String> annotations;

    public TypeDef type(String type) {
        this.type = type;
        return this;
    }
    public TypeDef name(String name) {
        this.name = name;
        return this;
    }
    public TypeDef comment(String comment) {
        this.comment = comment;
        return this;
    }
    public TypeDef annotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != TypeDef.class) {
                return false;
            }
            TypeDef a = (TypeDef) another;
            if (type == null ? a.type != null : !type.equals(a.type)) {
                return false;
            }
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (comment == null ? a.comment != null : !comment.equals(a.comment)) {
                return false;
            }
            if (annotations == null ? a.annotations != null : !annotations.equals(a.annotations)) {
                return false;
            }
        }
        return true;
    }
}
