//
// This file generated by rdl 1.4.11. Do not modify!
//

package com.yahoo.rdl;
import java.io.IOException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// Number - A numeric is any of the primitive numeric types
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonDeserialize(using = Number.NumberJsonDeserializer.class)
public final class Number {
    public enum NumberVariant {
        Int8,
        Int16,
        Int32,
        Int64,
        Float32,
        Float64
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public NumberVariant variant;

    @RdlOptional public Byte Int8;
    @RdlOptional public Short Int16;
    @RdlOptional public Integer Int32;
    @RdlOptional public Long Int64;
    @RdlOptional public Float Float32;
    @RdlOptional public Double Float64;
    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Number.class) {
                return false;
            }
            Number a = (Number) another;
            if (variant == a.variant) {
                switch (variant) {
                case Int8:
                    return Int8.equals(a.Int8);
                case Int16:
                    return Int16.equals(a.Int16);
                case Int32:
                    return Int32.equals(a.Int32);
                case Int64:
                    return Int64.equals(a.Int64);
                case Float32:
                    return Float32.equals(a.Float32);
                case Float64:
                    return Float64.equals(a.Float64);
                }
            }
        }
        return false;
    }


    public static class NumberJsonDeserializer extends JsonDeserializer<Number> {
        @Override
        public Number deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonToken tok = jp.nextToken();
            if (tok != JsonToken.FIELD_NAME) {
                throw new IOException("Cannot deserialize Number - no valid variant present");
            }
            String svariant = jp.getCurrentName();
            tok = jp.nextToken();
            Number t = null;
            if (tok == JsonToken.VALUE_NUMBER_INT || tok == JsonToken.VALUE_NUMBER_FLOAT) {
                switch (svariant) {
                case "Int8":
                    t = new Number(jp.getByteValue());
                    break;
                case "Int16":
                    t = new Number(jp.getShortValue());
                    break;
                case "Int32":
                    t = new Number(jp.getIntValue());
                    break;
                case "Int64":
                    t = new Number(jp.getLongValue());
                    break;
                case "Float32":
                    t = new Number(jp.getFloatValue());
                    break;
                case "Float64":
                    t = new Number(jp.getDoubleValue());
                    break;
               default:
                    throw new IOException("Cannot deserialize Number - bad type variant: " + svariant);
                }
                tok = jp.nextToken();
                return t;
            }
            throw new IOException("Cannot deserialize Number - no variant present");
        }
    }

    public Number() {
    }

    public Number(Byte int8) {
        this.variant = NumberVariant.Int8;
        this.Int8 = int8;
    }

    public Number(Short int16) {
        this.variant = NumberVariant.Int16;
        this.Int16 = int16;
    }

    public Number(Integer int32) {
        this.variant = NumberVariant.Int32;
        this.Int32 = int32;
    }

    public Number(Long int64) {
        this.variant = NumberVariant.Int64;
        this.Int64 = int64;
    }

    public Number(Float float32) {
        this.variant = NumberVariant.Float32;
        this.Float32 = float32;
    }

    public Number(Double float64) {
        this.variant = NumberVariant.Float64;
        this.Float64 = float64;
    }
}
