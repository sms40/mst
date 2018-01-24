package com.clarusft.api;

import java.io.IOException;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;

public class BigDecimalSerializer extends  com.fasterxml.jackson.databind.JsonSerializer<BigDecimal> {

    @Override
    public void serialize(BigDecimal obj, JsonGenerator gen,
            SerializerProvider sp) throws IOException,
            JsonProcessingException
    {
        if (obj != null) {
            //In order to stop the bigdecimal getting serialized as a json number (which causes a loss in
            //precision when it is deserialized back to a double) write it out as a string. The PropertyDescriptor
            //should be able to handle converting the string representation correctly.
            gen.writeString(obj.toString());    
        } else {
            gen.writeNull();
        }
    }
    @Override
    public Class<BigDecimal> handledType() {
        return BigDecimal.class;
    }
}