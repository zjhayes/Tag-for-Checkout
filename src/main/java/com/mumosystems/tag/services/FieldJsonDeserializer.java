package com.mumosystems.tag.services;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.mumosystems.tag.model.Field;

import java.io.IOException;
import java.util.List;

public class FieldJsonDeserializer extends JsonDeserializer<List<Field>>
{
    @Override
    public List<Field> deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
    {
        FieldList fieldList = jp.readValueAs(FieldList.class);
        System.out.println(fieldList.elements);
        return fieldList.elements;
    }

    private static class FieldList {
        public List<Field> elements;
    }
}
